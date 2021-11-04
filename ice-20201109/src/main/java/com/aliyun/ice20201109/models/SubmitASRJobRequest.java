// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitASRJobRequest extends TeaModel {
    // 任务描述
    @NameInMap("Description")
    public String description;

    // 持续时间
    @NameInMap("Duration")
    public String duration;

    // 输入配置，支持OSS地址和内容库素材ID
    @NameInMap("InputFile")
    public String inputFile;

    // 开始时间
    @NameInMap("StartTime")
    public String startTime;

    // 任务标题
    @NameInMap("Title")
    public String title;

    // 自定义设置，为JSON字符串
    @NameInMap("UserData")
    public String userData;

    public static SubmitASRJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitASRJobRequest self = new SubmitASRJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitASRJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitASRJobRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public SubmitASRJobRequest setInputFile(String inputFile) {
        this.inputFile = inputFile;
        return this;
    }
    public String getInputFile() {
        return this.inputFile;
    }

    public SubmitASRJobRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public SubmitASRJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitASRJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
