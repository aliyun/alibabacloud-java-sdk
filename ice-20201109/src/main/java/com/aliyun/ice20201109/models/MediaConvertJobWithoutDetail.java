// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertJobWithoutDetail extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Code")
    public String code;

    @NameInMap("Config")
    public MediaConvertJobWithoutDetailConfig config;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("FinishTime")
    public String finishTime;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("State")
    public String state;

    @NameInMap("UserData")
    public String userData;

    public static MediaConvertJobWithoutDetail build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertJobWithoutDetail self = new MediaConvertJobWithoutDetail();
        return TeaModel.build(map, self);
    }

    public MediaConvertJobWithoutDetail setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public MediaConvertJobWithoutDetail setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MediaConvertJobWithoutDetail setConfig(MediaConvertJobWithoutDetailConfig config) {
        this.config = config;
        return this;
    }
    public MediaConvertJobWithoutDetailConfig getConfig() {
        return this.config;
    }

    public MediaConvertJobWithoutDetail setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public MediaConvertJobWithoutDetail setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public MediaConvertJobWithoutDetail setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public MediaConvertJobWithoutDetail setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MediaConvertJobWithoutDetail setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public MediaConvertJobWithoutDetail setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MediaConvertJobWithoutDetail setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public MediaConvertJobWithoutDetail setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class MediaConvertJobWithoutDetailConfig extends TeaModel {
        @NameInMap("Inputs")
        public java.util.List<MediaConvertInput> inputs;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("OutputGroups")
        public java.util.List<MediaConvertOutputGroup> outputGroups;

        @NameInMap("Outputs")
        public java.util.List<MediaConvertOutput> outputs;

        public static MediaConvertJobWithoutDetailConfig build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobWithoutDetailConfig self = new MediaConvertJobWithoutDetailConfig();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobWithoutDetailConfig setInputs(java.util.List<MediaConvertInput> inputs) {
            this.inputs = inputs;
            return this;
        }
        public java.util.List<MediaConvertInput> getInputs() {
            return this.inputs;
        }

        public MediaConvertJobWithoutDetailConfig setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public MediaConvertJobWithoutDetailConfig setOutputGroups(java.util.List<MediaConvertOutputGroup> outputGroups) {
            this.outputGroups = outputGroups;
            return this;
        }
        public java.util.List<MediaConvertOutputGroup> getOutputGroups() {
            return this.outputGroups;
        }

        public MediaConvertJobWithoutDetailConfig setOutputs(java.util.List<MediaConvertOutput> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<MediaConvertOutput> getOutputs() {
            return this.outputs;
        }

    }

}
