// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class TaskInfo extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Message")
    public String message;

    @NameInMap("Progress")
    public Integer progress;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskRequestDefinition")
    public String taskRequestDefinition;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("UserData")
    public String userData;

    public static TaskInfo build(java.util.Map<String, ?> map) throws Exception {
        TaskInfo self = new TaskInfo();
        return TeaModel.build(map, self);
    }

    public TaskInfo setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TaskInfo setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public TaskInfo setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TaskInfo setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public TaskInfo setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public TaskInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TaskInfo setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public TaskInfo setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public TaskInfo setTaskRequestDefinition(String taskRequestDefinition) {
        this.taskRequestDefinition = taskRequestDefinition;
        return this;
    }
    public String getTaskRequestDefinition() {
        return this.taskRequestDefinition;
    }

    public TaskInfo setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public TaskInfo setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
