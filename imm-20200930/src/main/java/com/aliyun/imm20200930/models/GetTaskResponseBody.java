// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetTaskResponseBody extends TeaModel {
    /**
     * <p>The error code of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>ResourceNotFound</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The end time of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-24T03:01:49.480109219Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2F6-1Bz99Xi93EnRpNEyLudILJm****</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The error message of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified resource project is not found.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The task progress. Valid values: 0 to 100. Unit: %.</p>
     * <blockquote>
     * <p> This parameter is valid only if the task is in the <code>Running</code> state.``</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Progress")
    public Integer progress;

    /**
     * <p>The project name.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2C5C1E0F-D8B8-4DA0-8127-EC32C771****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-24T03:01:41.662060377Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the task. Valid values:</p>
     * <ul>
     * <li>RUNNING: The task is running.</li>
     * <li>Succeeded: The task is successful.</li>
     * <li>Failed: The task failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags. This parameter is returned only if you specified Tags when you created the task.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;test&quot;: &quot;val1&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c2b277b9-0d30-4882-ad6d-ad661382****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The initial request parameters used to create the task.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;ProjectName&quot;:&quot;test-project&quot;,
     *     &quot;CompressedFormat&quot;:&quot;zip&quot;,
     *     &quot;TargetURI&quot;:&quot;oss://test-bucket/output/test.zip&quot;,
     *     &quot;Sources&quot;:[{&quot;URI&quot;:&quot;oss://test-bucket/input/test.jpg&quot;}]
     * }</p>
     */
    @NameInMap("TaskRequestDefinition")
    public String taskRequestDefinition;

    /**
     * <p>The type of the task. For more information, see <a href="https://help.aliyun.com/document_detail/2743993.html">Task types</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>VideoLabelClassification</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The user data of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ID&quot;: &quot;user1&quot;,&quot;Name&quot;: &quot;test-user1&quot;,&quot;Avatar&quot;: &quot;<a href="http://example.com?id=user1%22%7D">http://example.com?id=user1&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static GetTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResponseBody self = new GetTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTaskResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetTaskResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public GetTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskResponseBody setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public GetTaskResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetTaskResponseBody setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public GetTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetTaskResponseBody setTaskRequestDefinition(String taskRequestDefinition) {
        this.taskRequestDefinition = taskRequestDefinition;
        return this;
    }
    public String getTaskRequestDefinition() {
        return this.taskRequestDefinition;
    }

    public GetTaskResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public GetTaskResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
