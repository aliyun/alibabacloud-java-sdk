// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertJobWithoutDetail extends TeaModel {
    /**
     * <p>The idempotency token provided during the task creation request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>12e8864746a0a398</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The error code for a failed task.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter.ResourceNotFound</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The task configuration.</p>
     */
    @NameInMap("Config")
    public MediaConvertJobWithoutDetailConfig config;

    /**
     * <p>The time the task was created, in UTC format (<em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z).</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-07T13:01:07Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The time the task finished processing, in UTC format (<em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z).</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-07T13:01:07Z</p>
     */
    @NameInMap("FinishTime")
    public String finishTime;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>d80e4e4044975745c14b</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The reason for a task failure.</p>
     * 
     * <strong>example:</strong>
     * <p>The resource operated &quot;%s&quot; cannot be found</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the queue on which this task was processed.</p>
     * 
     * <strong>example:</strong>
     * <p>688c2a8bfa4e44ddbba0c8730db91b0c</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>The ID of the API request that created this task.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the task.</p>
     * <ul>
     * <li>Inited: The task is initialized.</li>
     * <li>Running</li>
     * <li>Complete</li>
     * <li>Error</li>
     * <li>Cancelled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Inited</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The user-defined data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;info&quot;: &quot;xxx&quot;}</p>
     */
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
        /**
         * <p>The input files for the task.</p>
         */
        @NameInMap("Inputs")
        public java.util.List<MediaConvertInput> inputs;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>Name</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The output groups.</p>
         */
        @NameInMap("OutputGroups")
        public java.util.List<MediaConvertOutputGroup> outputGroups;

        /**
         * <p>The output configurations.</p>
         */
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
