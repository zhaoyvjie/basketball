package com.example.dell.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class rate extends AppCompatActivity {
EditText rmb;
TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        rmb=findViewById(R.id.rmb);
        show=findViewById(R.id.showOut);
    }
    public void  onClick(View btn){
        String str=rmb.getText().toString();
        float r=0;
        if(str.length()!=0){
            r=Float.parseFloat(str);
        }else{
            Toast.makeText(this,"请输入金额",Toast.LENGTH_SHORT).show();
        }
        if(btn.getId()==R.id.button5){
            float val=r/6.7f;
            val=Math.round(val*100)*0.01f;
            show.setText(""+val);
        }else if(btn.getId()==R.id.button6){
            float val=r/11f;
            val=Math.round(val*100)*0.01f;
            show.setText(""+val);
        }else if(btn.getId()==R.id.button7){
            float val=r*500f;
            val=Math.round(val*100)*0.01f;
            show.setText(""+val);
        }

    }
}
