// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertJob extends TeaModel {
    /**
     * <p>The idempotency key of the request for creating the task.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>12e8864746a0a398</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>An error code returned if the task failed.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter.ResourceContentBad</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The task configuration.</p>
     */
    @NameInMap("Config")
    public MediaConvertJobConfig config;

    /**
     * <p>The time the task was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-07T07:16:11Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The time the task was completed. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-07T07:16:11Z</p>
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
     * <p>The reason for a failed task.</p>
     * 
     * <strong>example:</strong>
     * <p>The resource operated InputFile is bad</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>An array containing the results for each output.</p>
     */
    @NameInMap("OutputDetails")
    public java.util.List<MediaConvertOutputDetail> outputDetails;

    /**
     * <p>The details of the output groups.</p>
     */
    @NameInMap("OutputGroupDetails")
    public java.util.List<MediaConvertOutputGroupDetail> outputGroupDetails;

    /**
     * <p>The completion percentage of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Percent")
    public Integer percent;

    /**
     * <p>The ID of the queue that processed the task.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>d80e4e4044975745c14b</strong></strong></p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>The ID of the API request that created this task.</p>
     * 
     * <strong>example:</strong>
     * <p>7B117AF5-2A1******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task status.</p>
     * <ul>
     * <li>Inited: Initialized</li>
     * <li>Running</li>
     * <li>Complete</li>
     * <li>Error</li>
     * <li>Cancelled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Finished</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The user-defined data.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
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

}
