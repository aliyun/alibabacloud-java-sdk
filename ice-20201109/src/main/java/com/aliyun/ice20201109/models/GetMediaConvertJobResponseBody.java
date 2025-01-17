// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaConvertJobResponseBody extends TeaModel {
    @NameInMap("Job")
    public GetMediaConvertJobResponseBodyJob job;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMediaConvertJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaConvertJobResponseBody self = new GetMediaConvertJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaConvertJobResponseBody setJob(GetMediaConvertJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public GetMediaConvertJobResponseBodyJob getJob() {
        return this.job;
    }

    public GetMediaConvertJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMediaConvertJobResponseBodyJobConfig extends TeaModel {
        @NameInMap("Inputs")
        public java.util.List<MediaConvertInput> inputs;

        @NameInMap("OutputGroups")
        public java.util.List<MediaConvertOutputGroup> outputGroups;

        @NameInMap("Outputs")
        public java.util.List<MediaConvertOutput> outputs;

        public static GetMediaConvertJobResponseBodyJobConfig build(java.util.Map<String, ?> map) throws Exception {
            GetMediaConvertJobResponseBodyJobConfig self = new GetMediaConvertJobResponseBodyJobConfig();
            return TeaModel.build(map, self);
        }

        public GetMediaConvertJobResponseBodyJobConfig setInputs(java.util.List<MediaConvertInput> inputs) {
            this.inputs = inputs;
            return this;
        }
        public java.util.List<MediaConvertInput> getInputs() {
            return this.inputs;
        }

        public GetMediaConvertJobResponseBodyJobConfig setOutputGroups(java.util.List<MediaConvertOutputGroup> outputGroups) {
            this.outputGroups = outputGroups;
            return this;
        }
        public java.util.List<MediaConvertOutputGroup> getOutputGroups() {
            return this.outputGroups;
        }

        public GetMediaConvertJobResponseBodyJobConfig setOutputs(java.util.List<MediaConvertOutput> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<MediaConvertOutput> getOutputs() {
            return this.outputs;
        }

    }

    public static class GetMediaConvertJobResponseBodyJob extends TeaModel {
        @NameInMap("ClientToken")
        public String clientToken;

        @NameInMap("Code")
        public String code;

        @NameInMap("Config")
        public GetMediaConvertJobResponseBodyJobConfig config;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Message")
        public String message;

        @NameInMap("OutputDetails")
        public java.util.List<MediaConvertOutputDetail> outputDetails;

        @NameInMap("OutputGroupDetails")
        public java.util.List<MediaConvertOutputGroupDetail> outputGroupDetails;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("State")
        public String state;

        @NameInMap("UserData")
        public String userData;

        public static GetMediaConvertJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            GetMediaConvertJobResponseBodyJob self = new GetMediaConvertJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public GetMediaConvertJobResponseBodyJob setClientToken(String clientToken) {
            this.clientToken = clientToken;
            return this;
        }
        public String getClientToken() {
            return this.clientToken;
        }

        public GetMediaConvertJobResponseBodyJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetMediaConvertJobResponseBodyJob setConfig(GetMediaConvertJobResponseBodyJobConfig config) {
            this.config = config;
            return this;
        }
        public GetMediaConvertJobResponseBodyJobConfig getConfig() {
            return this.config;
        }

        public GetMediaConvertJobResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetMediaConvertJobResponseBodyJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetMediaConvertJobResponseBodyJob setOutputDetails(java.util.List<MediaConvertOutputDetail> outputDetails) {
            this.outputDetails = outputDetails;
            return this;
        }
        public java.util.List<MediaConvertOutputDetail> getOutputDetails() {
            return this.outputDetails;
        }

        public GetMediaConvertJobResponseBodyJob setOutputGroupDetails(java.util.List<MediaConvertOutputGroupDetail> outputGroupDetails) {
            this.outputGroupDetails = outputGroupDetails;
            return this;
        }
        public java.util.List<MediaConvertOutputGroupDetail> getOutputGroupDetails() {
            return this.outputGroupDetails;
        }

        public GetMediaConvertJobResponseBodyJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public GetMediaConvertJobResponseBodyJob setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetMediaConvertJobResponseBodyJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetMediaConvertJobResponseBodyJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
