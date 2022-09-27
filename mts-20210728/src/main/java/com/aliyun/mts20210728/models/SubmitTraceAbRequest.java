// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitTraceAbRequest extends TeaModel {
    @NameInMap("CallBack")
    public String callBack;

    @NameInMap("CipherBase64ed")
    public String cipherBase64ed;

    @NameInMap("Input")
    public String input;

    @NameInMap("Level")
    public Long level;

    @NameInMap("Output")
    public String output;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TotalTime")
    public Long totalTime;

    @NameInMap("Url")
    public String url;

    @NameInMap("UserData")
    public String userData;

    public static SubmitTraceAbRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTraceAbRequest self = new SubmitTraceAbRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTraceAbRequest setCallBack(String callBack) {
        this.callBack = callBack;
        return this;
    }
    public String getCallBack() {
        return this.callBack;
    }

    public SubmitTraceAbRequest setCipherBase64ed(String cipherBase64ed) {
        this.cipherBase64ed = cipherBase64ed;
        return this;
    }
    public String getCipherBase64ed() {
        return this.cipherBase64ed;
    }

    public SubmitTraceAbRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitTraceAbRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public SubmitTraceAbRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public SubmitTraceAbRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SubmitTraceAbRequest setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
        return this;
    }
    public Long getTotalTime() {
        return this.totalTime;
    }

    public SubmitTraceAbRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public SubmitTraceAbRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
