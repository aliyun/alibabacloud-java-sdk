// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitCopyrightExtractRequest extends TeaModel {
    @NameInMap("CallBack")
    public String callBack;

    @NameInMap("Input")
    public String input;

    @NameInMap("Params")
    public String params;

    @NameInMap("Url")
    public String url;

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

    public SubmitCopyrightExtractRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SubmitCopyrightExtractRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public SubmitCopyrightExtractRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
