// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaConvertJobResponseBody extends TeaModel {
    /**
     * <p>The transcoding task.</p>
     */
    @NameInMap("Job")
    public SubmitMediaConvertJobResponseBodyJob job;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitMediaConvertJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaConvertJobResponseBody self = new SubmitMediaConvertJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitMediaConvertJobResponseBody setJob(SubmitMediaConvertJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public SubmitMediaConvertJobResponseBodyJob getJob() {
        return this.job;
    }

    public SubmitMediaConvertJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitMediaConvertJobResponseBodyJobConfig extends TeaModel {
        /**
         * <p>The inputs of the transcoding task.</p>
         */
        @NameInMap("Inputs")
        public java.util.List<MediaConvertInput> inputs;

        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The output group configurations.</p>
         */
        @NameInMap("OutputGroups")
        public java.util.List<MediaConvertOutputGroup> outputGroups;

        /**
         * <p>The output configurations.</p>
         */
        @NameInMap("Outputs")
        public java.util.List<MediaConvertOutput> outputs;

        public static SubmitMediaConvertJobResponseBodyJobConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaConvertJobResponseBodyJobConfig self = new SubmitMediaConvertJobResponseBodyJobConfig();
            return TeaModel.build(map, self);
        }

        public SubmitMediaConvertJobResponseBodyJobConfig setInputs(java.util.List<MediaConvertInput> inputs) {
            this.inputs = inputs;
            return this;
        }
        public java.util.List<MediaConvertInput> getInputs() {
            return this.inputs;
        }

        public SubmitMediaConvertJobResponseBodyJobConfig setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public SubmitMediaConvertJobResponseBodyJobConfig setOutputGroups(java.util.List<MediaConvertOutputGroup> outputGroups) {
            this.outputGroups = outputGroups;
            return this;
        }
        public java.util.List<MediaConvertOutputGroup> getOutputGroups() {
            return this.outputGroups;
        }

        public SubmitMediaConvertJobResponseBodyJobConfig setOutputs(java.util.List<MediaConvertOutput> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<MediaConvertOutput> getOutputs() {
            return this.outputs;
        }

    }

    public static class SubmitMediaConvertJobResponseBodyJob extends TeaModel {
        /**
         * <p>The idempotency key of the request for creating the transcoding task.</p>
         * 
         * <strong>example:</strong>
         * <p>FB7F25E9-AD9B-1603-8AF6-F1E42DF2E706</p>
         */
        @NameInMap("ClientToken")
        public String clientToken;

        /**
         * <p>The error code returned when the transcoding task failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The configurations of the transcoding task.</p>
         */
        @NameInMap("Config")
        public SubmitMediaConvertJobResponseBodyJobConfig config;

        /**
         * <p>The ID of the transcoding task.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The error message returned when the transcoding task failed.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The details of the transcoded outputs.</p>
         */
        @NameInMap("OutputDetails")
        public java.util.List<MediaConvertOutputDetail> outputDetails;

        /**
         * <p>The details of the output groups.</p>
         */
        @NameInMap("OutputGroupDetails")
        public java.util.List<MediaConvertOutputGroupDetail> outputGroupDetails;

        /**
         * <p>The ID of the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>3780049</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A2129C9F-CE95-58B5-B8C1-07758FF6C86F</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The status of the transcoding task. Valid values:</p>
         * <ul>
         * <li>Inited: The task is initialized.</li>
         * <li>Running</li>
         * <li>Success</li>
         * <li>Failed</li>
         * <li>Cancelled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The user data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;videoId&quot;:&quot;abcd&quot;}</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static SubmitMediaConvertJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaConvertJobResponseBodyJob self = new SubmitMediaConvertJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public SubmitMediaConvertJobResponseBodyJob setClientToken(String clientToken) {
            this.clientToken = clientToken;
            return this;
        }
        public String getClientToken() {
            return this.clientToken;
        }

        public SubmitMediaConvertJobResponseBodyJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitMediaConvertJobResponseBodyJob setConfig(SubmitMediaConvertJobResponseBodyJobConfig config) {
            this.config = config;
            return this;
        }
        public SubmitMediaConvertJobResponseBodyJobConfig getConfig() {
            return this.config;
        }

        public SubmitMediaConvertJobResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitMediaConvertJobResponseBodyJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitMediaConvertJobResponseBodyJob setOutputDetails(java.util.List<MediaConvertOutputDetail> outputDetails) {
            this.outputDetails = outputDetails;
            return this;
        }
        public java.util.List<MediaConvertOutputDetail> getOutputDetails() {
            return this.outputDetails;
        }

        public SubmitMediaConvertJobResponseBodyJob setOutputGroupDetails(java.util.List<MediaConvertOutputGroupDetail> outputGroupDetails) {
            this.outputGroupDetails = outputGroupDetails;
            return this;
        }
        public java.util.List<MediaConvertOutputGroupDetail> getOutputGroupDetails() {
            return this.outputGroupDetails;
        }

        public SubmitMediaConvertJobResponseBodyJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitMediaConvertJobResponseBodyJob setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public SubmitMediaConvertJobResponseBodyJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SubmitMediaConvertJobResponseBodyJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
