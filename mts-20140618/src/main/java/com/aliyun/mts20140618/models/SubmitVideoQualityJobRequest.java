// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitVideoQualityJobRequest extends TeaModel {
    @NameInMap("Input")
    public String input;

    @NameInMap("JobParams")
    public String jobParams;

    @NameInMap("ModelId")
    public String modelId;

    @NameInMap("NotifyUrl")
    public String notifyUrl;

    @NameInMap("Output")
    public String output;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("ScheduleParams")
    public String scheduleParams;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("UserId")
    public Long userId;

    public static SubmitVideoQualityJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoQualityJobRequest self = new SubmitVideoQualityJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitVideoQualityJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitVideoQualityJobRequest setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public SubmitVideoQualityJobRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public SubmitVideoQualityJobRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public SubmitVideoQualityJobRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public SubmitVideoQualityJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitVideoQualityJobRequest setScheduleParams(String scheduleParams) {
        this.scheduleParams = scheduleParams;
        return this;
    }
    public String getScheduleParams() {
        return this.scheduleParams;
    }

    public SubmitVideoQualityJobRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public SubmitVideoQualityJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitVideoQualityJobRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
