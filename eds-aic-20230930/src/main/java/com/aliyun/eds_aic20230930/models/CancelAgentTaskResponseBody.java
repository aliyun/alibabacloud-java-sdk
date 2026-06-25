// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CancelAgentTaskResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4B886792-2051-5DB4-8AE6-C8E45D3B4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of task objects.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<CancelAgentTaskResponseBodyTasks> tasks;

    public static CancelAgentTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelAgentTaskResponseBody self = new CancelAgentTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelAgentTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CancelAgentTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CancelAgentTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelAgentTaskResponseBody setTasks(java.util.List<CancelAgentTaskResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<CancelAgentTaskResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public static class CancelAgentTaskResponseBodyTasks extends TeaModel {
        /**
         * <p>The task\&quot;s cancellation time, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-13T17:42:19Z</p>
         */
        @NameInMap("CancelAt")
        public String cancelAt;

        /**
         * <p>The task status after the cancellation request. Possible values include:</p>
         * <p><code>CANCELLING</code> or <code>CANCELED</code>: The task is being or has been canceled.</p>
         * <p><code>COMPLETED</code>: The task was already complete and could not be canceled.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("CurrentStatus")
        public String currentStatus;

        /**
         * <p>The failure reason.</p>
         * 
         * <strong>example:</strong>
         * <p>Task status [COMPLETED] does not support cancellation, only PENDING/RUNNING/CANCELLING tasks can be canceled.</p>
         */
        @NameInMap("FailedReason")
        public String failedReason;

        /**
         * <p>The mobile node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-ek65k51zoxia3x8xz</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The task status before cancellation. Valid values include:</p>
         * <p>PENDING: The task is being created.</p>
         * <p>RUNNING: The task is running.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("PreviousStatus")
        public String previousStatus;

        /**
         * <p>The globally unique task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-imr0fufqd7cle****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static CancelAgentTaskResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            CancelAgentTaskResponseBodyTasks self = new CancelAgentTaskResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public CancelAgentTaskResponseBodyTasks setCancelAt(String cancelAt) {
            this.cancelAt = cancelAt;
            return this;
        }
        public String getCancelAt() {
            return this.cancelAt;
        }

        public CancelAgentTaskResponseBodyTasks setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        public CancelAgentTaskResponseBodyTasks setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public CancelAgentTaskResponseBodyTasks setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CancelAgentTaskResponseBodyTasks setPreviousStatus(String previousStatus) {
            this.previousStatus = previousStatus;
            return this;
        }
        public String getPreviousStatus() {
            return this.previousStatus;
        }

        public CancelAgentTaskResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
