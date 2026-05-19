// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ResumeAgentTaskResponseBody extends TeaModel {
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
     * <p>1A923337-44D9-5CAD-9A53-95084BD4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("CurrentStatus")
        public String currentStatus;

        /**
         * <strong>example:</strong>
         * <p>Task status [COMPLETED] does not support resume, only PAUSED tasks can be resumed.</p>
         */
        @NameInMap("FailedReason")
        public String failedReason;

        /**
         * <strong>example:</strong>
         * <p>acp-ek65k51zoxia3x8xz</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>2026-04-13T17:42:19Z</p>
         */
        @NameInMap("ResumingAt")
        public String resumingAt;

        /**
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
