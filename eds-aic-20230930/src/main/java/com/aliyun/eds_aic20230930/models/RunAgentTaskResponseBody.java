// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RunAgentTaskResponseBody extends TeaModel {
    /**
     * <p>The status code of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>For example, &quot;200&quot; indicates success.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

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
     * <p>6C8439B9-7DBF-57F4-92AE-55A9B9D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of tasks.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<RunAgentTaskResponseBodyTasks> tasks;

    public static RunAgentTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunAgentTaskResponseBody self = new RunAgentTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public RunAgentTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RunAgentTaskResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public RunAgentTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RunAgentTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunAgentTaskResponseBody setTasks(java.util.List<RunAgentTaskResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<RunAgentTaskResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public static class RunAgentTaskResponseBodyTasks extends TeaModel {
        /**
         * <p>The current status of the task. Valid values:</p>
         * <ul>
         * <li>PENDING: The task is being created.</li>
         * <li>RUNNING: The task is running.</li>
         * <li>COMPLETED: The task is completed.</li>
         * <li>FAILED: The task failed.</li>
         * <li>TIMEOUT: The task execution timed out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("CurrentStatus")
        public String currentStatus;

        /**
         * <p>The Mobile node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-ek65k51zoxia3x8xz</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time when the task was created, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-13T17:42:19Z</p>
         */
        @NameInMap("RunningAt")
        public String runningAt;

        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The task ID, which is globally unique.</p>
         * 
         * <strong>example:</strong>
         * <p>t-imr0fufqd7cle****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The user instruction in natural language. The Agent performs operations based on this instruction.</p>
         * 
         * <strong>example:</strong>
         * <p>Download DingTalk from App Store</p>
         */
        @NameInMap("UserPrompt")
        public String userPrompt;

        public static RunAgentTaskResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            RunAgentTaskResponseBodyTasks self = new RunAgentTaskResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public RunAgentTaskResponseBodyTasks setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        public RunAgentTaskResponseBodyTasks setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RunAgentTaskResponseBodyTasks setRunningAt(String runningAt) {
            this.runningAt = runningAt;
            return this;
        }
        public String getRunningAt() {
            return this.runningAt;
        }

        public RunAgentTaskResponseBodyTasks setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunAgentTaskResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunAgentTaskResponseBodyTasks setUserPrompt(String userPrompt) {
            this.userPrompt = userPrompt;
            return this;
        }
        public String getUserPrompt() {
            return this.userPrompt;
        }

    }

}
