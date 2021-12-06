// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetTaskStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskStatus")
    public GetTaskStatusResponseBodyTaskStatus taskStatus;

    public static GetTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskStatusResponseBody self = new GetTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskStatusResponseBody setTaskStatus(GetTaskStatusResponseBodyTaskStatus taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public GetTaskStatusResponseBodyTaskStatus getTaskStatus() {
        return this.taskStatus;
    }

    public static class GetTaskStatusResponseBodyTaskStatus extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("FailureReason")
        public String failureReason;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskType")
        public String taskType;

        public static GetTaskStatusResponseBodyTaskStatus build(java.util.Map<String, ?> map) throws Exception {
            GetTaskStatusResponseBodyTaskStatus self = new GetTaskStatusResponseBodyTaskStatus();
            return TeaModel.build(map, self);
        }

        public GetTaskStatusResponseBodyTaskStatus setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetTaskStatusResponseBodyTaskStatus setFailureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }
        public String getFailureReason() {
            return this.failureReason;
        }

        public GetTaskStatusResponseBodyTaskStatus setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetTaskStatusResponseBodyTaskStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTaskStatusResponseBodyTaskStatus setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetTaskStatusResponseBodyTaskStatus setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
