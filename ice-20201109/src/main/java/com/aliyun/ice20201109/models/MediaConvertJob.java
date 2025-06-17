// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertJob extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Code")
    public String code;

    @NameInMap("Config")
    public MediaConvertJobConfig config;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("FinishTime")
    public String finishTime;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Message")
    public String message;

    @NameInMap("OutputDetails")
    public java.util.List<MediaConvertOutputDetail> outputDetails;

    @NameInMap("OutputGroupDetails")
    public java.util.List<MediaConvertOutputGroupDetail> outputGroupDetails;

    @NameInMap("Percent")
    public Integer percent;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("State")
    public String state;

    @NameInMap("UserData")
    public String userData;

    public static MediaConvertJob build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertJob self = new MediaConvertJob();
        return TeaModel.build(map, self);
    }

    public MediaConvertJob setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public MediaConvertJob setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MediaConvertJob setConfig(MediaConvertJobConfig config) {
        this.config = config;
        return this;
    }
    public MediaConvertJobConfig getConfig() {
        return this.config;
    }

    public MediaConvertJob setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public MediaConvertJob setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public MediaConvertJob setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public MediaConvertJob setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MediaConvertJob setOutputDetails(java.util.List<MediaConvertOutputDetail> outputDetails) {
        this.outputDetails = outputDetails;
        return this;
    }
    public java.util.List<MediaConvertOutputDetail> getOutputDetails() {
        return this.outputDetails;
    }

    public MediaConvertJob setOutputGroupDetails(java.util.List<MediaConvertOutputGroupDetail> outputGroupDetails) {
        this.outputGroupDetails = outputGroupDetails;
        return this;
    }
    public java.util.List<MediaConvertOutputGroupDetail> getOutputGroupDetails() {
        return this.outputGroupDetails;
    }

    public MediaConvertJob setPercent(Integer percent) {
        this.percent = percent;
        return this;
    }
    public Integer getPercent() {
        return this.percent;
    }

    public MediaConvertJob setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public MediaConvertJob setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MediaConvertJob setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public MediaConvertJob setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class MediaConvertJobConfig extends TeaModel {
        @NameInMap("Inputs")
        public java.util.List<MediaConvertInput> inputs;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("OutputGroups")
        public java.util.List<MediaConvertOutputGroup> outputGroups;

        @NameInMap("Outputs")
        public java.util.List<MediaConvertOutput> outputs;

        public static MediaConvertJobConfig build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobConfig self = new MediaConvertJobConfig();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobConfig setInputs(java.util.List<MediaConvertInput> inputs) {
            this.inputs = inputs;
            return this;
        }
        public java.util.List<MediaConvertInput> getInputs() {
            return this.inputs;
        }

        public MediaConvertJobConfig setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public MediaConvertJobConfig setOutputGroups(java.util.List<MediaConvertOutputGroup> outputGroups) {
            this.outputGroups = outputGroups;
            return this;
        }
        public java.util.List<MediaConvertOutputGroup> getOutputGroups() {
            return this.outputGroups;
        }

        public MediaConvertJobConfig setOutputs(java.util.List<MediaConvertOutput> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<MediaConvertOutput> getOutputs() {
            return this.outputs;
        }

    }

}
