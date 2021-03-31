package com.androidapp.btnwinnerclass;

import android.view.View;

public class MyOnClickLstener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnClickLstener(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View view) {
        mainActivity.mTextView1.setText("You clicked button1");
    }
}
