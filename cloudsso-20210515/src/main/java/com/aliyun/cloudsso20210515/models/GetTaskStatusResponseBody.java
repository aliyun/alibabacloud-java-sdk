// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetTaskStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>005F4623-AE53-504D-830F-44825F7DC211</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status information about the task.</p>
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
         * <p>The end time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-05T02:58:08Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The cause of the task failure.</p>
         * <blockquote>
         * <p> This parameter is returned only when the value of <code>Status</code> is <code>Failed</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>No Permission.</p>
         */
        @NameInMap("FailureReason")
        public String failureReason;

        /**
         * <p>The start time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-05T02:58:07Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>InProgress: The task is running.</li>
         * <li>Success: The task is successful.</li>
         * <li>Failed: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-shfqw1u1edszvxw5****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li>ProvisionAccessConfiguration: An access configuration is provisioned.</li>
         * <li>DeprovisionAccessConfiguration: An access configuration is de-provisioned.</li>
         * <li>CreateAccessAssignment: Access permissions on an account in the resource directory are assigned.</li>
         * <li>DeleteAccessAssignment: Access permissions on an account in the resource directory are removed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DeleteAccessAssignment</p>
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
