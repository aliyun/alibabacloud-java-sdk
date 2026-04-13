// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeAgentTaskResponseBody extends TeaModel {
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
     * <p>310A783E-CC46-5452-A8A3-71AE5DB5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tasks")
    public java.util.List<DescribeAgentTaskResponseBodyTasks> tasks;

    public static DescribeAgentTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgentTaskResponseBody self = new DescribeAgentTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAgentTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAgentTaskResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeAgentTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAgentTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAgentTaskResponseBody setTasks(java.util.List<DescribeAgentTaskResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<DescribeAgentTaskResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public static class DescribeAgentTaskResponseBodyTasks extends TeaModel {
        @NameInMap("CurrentStatus")
        public String currentStatus;

        /**
         * <strong>example:</strong>
         * <p>acp-anzzuho371azi44xr</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RunningAt")
        public String runningAt;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Steps")
        public String steps;

        @NameInMap("TaskDuration")
        public String taskDuration;

        /**
         * <strong>example:</strong>
         * <p>t-imr0fufqd7cle****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskResult")
        public String taskResult;

        @NameInMap("UserPrompt")
        public String userPrompt;

        public static DescribeAgentTaskResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeAgentTaskResponseBodyTasks self = new DescribeAgentTaskResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeAgentTaskResponseBodyTasks setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        public DescribeAgentTaskResponseBodyTasks setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAgentTaskResponseBodyTasks setRunningAt(String runningAt) {
            this.runningAt = runningAt;
            return this;
        }
        public String getRunningAt() {
            return this.runningAt;
        }

        public DescribeAgentTaskResponseBodyTasks setSteps(String steps) {
            this.steps = steps;
            return this;
        }
        public String getSteps() {
            return this.steps;
        }

        public DescribeAgentTaskResponseBodyTasks setTaskDuration(String taskDuration) {
            this.taskDuration = taskDuration;
            return this;
        }
        public String getTaskDuration() {
            return this.taskDuration;
        }

        public DescribeAgentTaskResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeAgentTaskResponseBodyTasks setTaskResult(String taskResult) {
            this.taskResult = taskResult;
            return this;
        }
        public String getTaskResult() {
            return this.taskResult;
        }

        public DescribeAgentTaskResponseBodyTasks setUserPrompt(String userPrompt) {
            this.userPrompt = userPrompt;
            return this;
        }
        public String getUserPrompt() {
            return this.userPrompt;
        }

    }

}
