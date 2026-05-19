// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class PauseAgentTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>Success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E38B41A8-8E00-5AE4-A957-6636ACB8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tasks")
    public java.util.List<PauseAgentTaskResponseBodyTasks> tasks;

    public static PauseAgentTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PauseAgentTaskResponseBody self = new PauseAgentTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public PauseAgentTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PauseAgentTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PauseAgentTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PauseAgentTaskResponseBody setTasks(java.util.List<PauseAgentTaskResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<PauseAgentTaskResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public static class PauseAgentTaskResponseBodyTasks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PAUSING</p>
         */
        @NameInMap("CurrentStatus")
        public String currentStatus;

        /**
         * <strong>example:</strong>
         * <p>Task status [COMPLETED] does not support pause, only RUNNING tasks can be paused.</p>
         */
        @NameInMap("FailedReason")
        public String failedReason;

        /**
         * <strong>example:</strong>
         * <p>acp-anzzuho371azi44xr</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>2026-04-13T17:42:19Z</p>
         */
        @NameInMap("PausingAt")
        public String pausingAt;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("PreviousStatus")
        public String previousStatus;

        /**
         * <strong>example:</strong>
         * <p>t-imr0fufqd7cle****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static PauseAgentTaskResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            PauseAgentTaskResponseBodyTasks self = new PauseAgentTaskResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public PauseAgentTaskResponseBodyTasks setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        public PauseAgentTaskResponseBodyTasks setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public PauseAgentTaskResponseBodyTasks setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public PauseAgentTaskResponseBodyTasks setPausingAt(String pausingAt) {
            this.pausingAt = pausingAt;
            return this;
        }
        public String getPausingAt() {
            return this.pausingAt;
        }

        public PauseAgentTaskResponseBodyTasks setPreviousStatus(String previousStatus) {
            this.previousStatus = previousStatus;
            return this;
        }
        public String getPreviousStatus() {
            return this.previousStatus;
        }

        public PauseAgentTaskResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
