// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetTaskStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status information of the task.</p>
     */
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
        /**
         * <p>The time when the task ended.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The cause of the task failure.</p>
         * <br>
         * <p>>  This parameter is returned only when the value of `Status` is `Failed`.</p>
         */
        @NameInMap("FailureReason")
        public String failureReason;

        /**
         * <p>The time when the task started.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the task. Valid values:</p>
         * <br>
         * <p>*   InProgress: The task is running.</p>
         * <p>*   Success: The task is successful.</p>
         * <p>*   Failed: The task failed.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The type of the task. Valid values:</p>
         * <br>
         * <p>*   ProvisionAccessConfiguration: An access configuration is provisioned.</p>
         * <p>*   DeprovisionAccessConfiguration: An access configuration is de-provisioned.</p>
         * <p>*   CreateAccessAssignment: Access permissions on an account in the resource directory are assigned.</p>
         * <p>*   DeleteAccessAssignment: Access permissions on an account in the resource directory are removed.</p>
         */
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
