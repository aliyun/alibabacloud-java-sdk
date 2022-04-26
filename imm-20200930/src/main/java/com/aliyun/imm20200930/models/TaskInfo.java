// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class TaskInfo extends TeaModel {
    // 错误码
    @NameInMap("Code")
    public String code;

    // 任务结束时间
    @NameInMap("EndTime")
    public String endTime;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 任务开始时间
    @NameInMap("StartTime")
    public String startTime;

    // 任务状态
    @NameInMap("Status")
    public String status;

    // 标签
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    // 任务唯一ID
    @NameInMap("TaskId")
    public String taskId;

    // 任务类型
    @NameInMap("TaskType")
    public String taskType;

    // 用户自定义信息
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
