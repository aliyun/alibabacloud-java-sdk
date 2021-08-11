// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitCopyrightJobRequest extends TeaModel {
    // 任务结果回调url
    @NameInMap("CallBack")
    public String callBack;

    // 水印信息描述
    @NameInMap("Description")
    public String description;

    // 输入的视频，oss三元组
    @NameInMap("Input")
    public String input;

    // 水印强度，取值1，2，3
    @NameInMap("Level")
    public Long level;

    // 水印信息
    @NameInMap("Message")
    public String message;

    // 水印起始时间(单位是秒)，不填写默认为0
    @NameInMap("StartTime")
    public Long startTime;

    // 水印结束时间(单位是秒)，不填默认为60000
    @NameInMap("TotalTime")
    public Long totalTime;

    // 输出的视频，oss三元组
    @NameInMap("Output")
    public String output;

    // 用户自定义数据
    @NameInMap("UserData")
    public String userData;

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

    public SubmitCopyrightJobRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public SubmitCopyrightJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
