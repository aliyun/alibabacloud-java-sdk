// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RunAgentTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <strong>example:</strong>
     * <p>Success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6C8439B9-7DBF-57F4-92AE-55A9B9D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CurrentStatus")
        public String currentStatus;

        /**
         * <strong>example:</strong>
         * <p>acp-ek65k51zoxia3x8xz</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RunningAt")
        public String runningAt;

        /**
         * <strong>example:</strong>
         * <p>t-imr0fufqd7cle****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

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
