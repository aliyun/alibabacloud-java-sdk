// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetDecodeBlindWatermarkResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Content")
    public String content;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EventId")
    public String eventId;

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

    public static GetDecodeBlindWatermarkResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDecodeBlindWatermarkResultResponseBody self = new GetDecodeBlindWatermarkResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDecodeBlindWatermarkResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDecodeBlindWatermarkResultResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetDecodeBlindWatermarkResultResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetDecodeBlindWatermarkResultResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public GetDecodeBlindWatermarkResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDecodeBlindWatermarkResultResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetDecodeBlindWatermarkResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDecodeBlindWatermarkResultResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetDecodeBlindWatermarkResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetDecodeBlindWatermarkResultResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetDecodeBlindWatermarkResultResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public GetDecodeBlindWatermarkResultResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
