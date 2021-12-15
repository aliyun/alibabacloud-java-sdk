// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitCopyrightExtractRequest extends TeaModel {
    // 任务完成回调
    @NameInMap("CallBack")
    public String callBack;

    // 输入文件oss地址
    @NameInMap("Input")
    public String input;

    // 用户数据
    @NameInMap("UserData")
    public String userData;

    public static SubmitCopyrightExtractRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCopyrightExtractRequest self = new SubmitCopyrightExtractRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCopyrightExtractRequest setCallBack(String callBack) {
        this.callBack = callBack;
        return this;
    }
    public String getCallBack() {
        return this.callBack;
    }

    public SubmitCopyrightExtractRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitCopyrightExtractRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
