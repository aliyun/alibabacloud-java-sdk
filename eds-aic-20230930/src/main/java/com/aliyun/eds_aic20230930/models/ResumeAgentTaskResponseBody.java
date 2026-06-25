// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ResumeAgentTaskResponseBody extends TeaModel {
    /**
     * <p>The API status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message.</p>
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
     * <p>1A923337-44D9-5CAD-9A53-95084BD4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of tasks.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<ResumeAgentTaskResponseBodyTasks> tasks;

    public static ResumeAgentTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResumeAgentTaskResponseBody self = new ResumeAgentTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ResumeAgentTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResumeAgentTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResumeAgentTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResumeAgentTaskResponseBody setTasks(java.util.List<ResumeAgentTaskResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ResumeAgentTaskResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public static class ResumeAgentTaskResponseBodyTasks extends TeaModel {
        /**
         * <p>The current status of the task. Valid values:</p>
         * <p><code>PENDING</code>: The task is being created.</p>
         * <p><code>RUNNING</code>: The task is running.</p>
         * <p><code>COMPLETED</code>: The task has completed.</p>
         * <p><code>FAILED</code>: The task has failed.</p>
         * <p><code>TIMEOUT</code>: The task has timed out.</p>
         * <p><code>PAUSING</code>: The task is pausing.</p>
         * <p><code>PAUSED</code>: The task is paused.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("CurrentStatus")
        public String currentStatus;

        /**
         * <p>The reason why the task failed to resume.</p>
         * 
         * <strong>example:</strong>
         * <p>Task status [COMPLETED] does not support resume, only PAUSED tasks can be resumed.</p>
         */
        @NameInMap("FailedReason")
        public String failedReason;

        /**
         * <p>The ID of the mobile instance.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-ek65k51zoxia3x8xz</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time when the task was resumed, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-13T17:42:19Z</p>
         */
        @NameInMap("ResumingAt")
        public String resumingAt;

        /**
         * <p>The globally unique ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>t-imr0fufqd7cle****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ResumeAgentTaskResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ResumeAgentTaskResponseBodyTasks self = new ResumeAgentTaskResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ResumeAgentTaskResponseBodyTasks setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        public ResumeAgentTaskResponseBodyTasks setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public ResumeAgentTaskResponseBodyTasks setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ResumeAgentTaskResponseBodyTasks setResumingAt(String resumingAt) {
            this.resumingAt = resumingAt;
            return this;
        }
        public String getResumingAt() {
            return this.resumingAt;
        }

        public ResumeAgentTaskResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
