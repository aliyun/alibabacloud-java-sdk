// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitTraceExtractRequest extends TeaModel {
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

    public static SubmitTraceExtractRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTraceExtractRequest self = new SubmitTraceExtractRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTraceExtractRequest setCallBack(String callBack) {
        this.callBack = callBack;
        return this;
    }
    public String getCallBack() {
        return this.callBack;
    }

    public SubmitTraceExtractRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitTraceExtractRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SubmitTraceExtractRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public SubmitTraceExtractRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
