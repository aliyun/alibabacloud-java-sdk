// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetVideoLabelClassificationResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EventId")
    public String eventId;

    @NameInMap("Labels")
    public java.util.List<Label> labels;

    @NameInMap("Message")
    public String message;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("UserData")
    public String userData;

    public static GetVideoLabelClassificationResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoLabelClassificationResultResponseBody self = new GetVideoLabelClassificationResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoLabelClassificationResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVideoLabelClassificationResultResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetVideoLabelClassificationResultResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public GetVideoLabelClassificationResultResponseBody setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public GetVideoLabelClassificationResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVideoLabelClassificationResultResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetVideoLabelClassificationResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoLabelClassificationResultResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetVideoLabelClassificationResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetVideoLabelClassificationResultResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetVideoLabelClassificationResultResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public GetVideoLabelClassificationResultResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
