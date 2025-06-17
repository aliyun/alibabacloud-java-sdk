// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaConvertJobResponseBody extends TeaModel {
    /**
     * <p>The transcoding task.</p>
     */
    @NameInMap("Job")
    public GetMediaConvertJobResponseBodyJob job;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4BAEA8E8-1C16-5CD3-AC50-CCBA81A53402</p>
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

        public GetMediaConvertJobResponseBodyJobConfig setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
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
        /**
         * <p>The idempotency key of the request for creating the transcoding task.</p>
         * 
         * <strong>example:</strong>
         * <p>780018cb-55ba-466d-8acc-946c0c319a0e</p>
         */
        @NameInMap("ClientToken")
        public String clientToken;

        /**
         * <p>The error code returned when the transcoding task failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.ResourceContentBad</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The configurations of the transcoding task.</p>
         */
        @NameInMap("Config")
        public GetMediaConvertJobResponseBodyJobConfig config;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The ID of the transcoding task, which is a 32-bit string.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>4579b5e748b99a27f6d6</strong></strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The error message returned when the transcoding task failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The resource operated InputFile is bad</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The details of the transcoded outputs, each corresponding to an output configuration.</p>
         */
        @NameInMap("OutputDetails")
        public java.util.List<MediaConvertOutputDetail> outputDetails;

        /**
         * <p>The details of the output groups, each corresponding to an output group configuration.</p>
         */
        @NameInMap("OutputGroupDetails")
        public java.util.List<MediaConvertOutputGroupDetail> outputGroupDetails;

        @NameInMap("Percent")
        public Integer percent;

        /**
         * <p>The ID of the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>83500cb2a3b94fabb0956e38d64bd16d</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The ID of the request for creating the transcoding task.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
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
         * <p>Success</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The user data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;videoId&quot;:&quot;ddd333&quot;}</p>
         */
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

        public GetMediaConvertJobResponseBodyJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMediaConvertJobResponseBodyJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
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

        public GetMediaConvertJobResponseBodyJob setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
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
