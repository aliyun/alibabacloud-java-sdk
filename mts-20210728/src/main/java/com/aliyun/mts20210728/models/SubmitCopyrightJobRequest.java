// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitCopyrightJobRequest extends TeaModel {
    @NameInMap("CallBack")
    public String callBack;

    @NameInMap("Description")
    public String description;

    @NameInMap("Input")
    public String input;

    @NameInMap("Level")
    public Long level;

    @NameInMap("Message")
    public String message;

    @NameInMap("Output")
    public String output;

    @NameInMap("Params")
    public String params;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TotalTime")
    public Long totalTime;

    @NameInMap("Url")
    public String url;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("VisibleMessage")
    public String visibleMessage;

    public static SubmitCopyrightJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCopyrightJobRequest self = new SubmitCopyrightJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCopyrightJobRequest setCallBack(String callBack) {
        this.callBack = callBack;
        return this;
    }
    public String getCallBack() {
        return this.callBack;
    }

    public SubmitCopyrightJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitCopyrightJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitCopyrightJobRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public SubmitCopyrightJobRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitCopyrightJobRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public SubmitCopyrightJobRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SubmitCopyrightJobRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SubmitCopyrightJobRequest setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
        return this;
    }
    public Long getTotalTime() {
        return this.totalTime;
    }

    public SubmitCopyrightJobRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public SubmitCopyrightJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitCopyrightJobRequest setVisibleMessage(String visibleMessage) {
        this.visibleMessage = visibleMessage;
        return this;
    }
    public String getVisibleMessage() {
        return this.visibleMessage;
    }

}
