// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeFirewallTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsFound")
    public Boolean isFound;

    /**
     * <strong>example:</strong>
     * <p>7D5483BF-2262-586D-8706-BDDB8B42****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>17151381075</p>
     */
    @NameInMap("TaskFinishTimestamp")
    public String taskFinishTimestamp;

    /**
     * <strong>example:</strong>
     * <p>189997648</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <strong>example:</strong>
     * <p>egressgw</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <strong>example:</strong>
     * <p>17151361285</p>
     */
    @NameInMap("TaskStartTimestamp")
    public String taskStartTimestamp;

    /**
     * <strong>example:</strong>
     * <p>init</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    @NameInMap("TaskSteps")
    public java.util.List<DescribeFirewallTaskResponseBodyTaskSteps> taskSteps;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TaskWaitingTime")
    public String taskWaitingTime;

    public static DescribeFirewallTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallTaskResponseBody self = new DescribeFirewallTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallTaskResponseBody setIsFound(Boolean isFound) {
        this.isFound = isFound;
        return this;
    }
    public Boolean getIsFound() {
        return this.isFound;
    }

    public DescribeFirewallTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFirewallTaskResponseBody setTaskFinishTimestamp(String taskFinishTimestamp) {
        this.taskFinishTimestamp = taskFinishTimestamp;
        return this;
    }
    public String getTaskFinishTimestamp() {
        return this.taskFinishTimestamp;
    }

    public DescribeFirewallTaskResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public DescribeFirewallTaskResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public DescribeFirewallTaskResponseBody setTaskStartTimestamp(String taskStartTimestamp) {
        this.taskStartTimestamp = taskStartTimestamp;
        return this;
    }
    public String getTaskStartTimestamp() {
        return this.taskStartTimestamp;
    }

    public DescribeFirewallTaskResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public DescribeFirewallTaskResponseBody setTaskSteps(java.util.List<DescribeFirewallTaskResponseBodyTaskSteps> taskSteps) {
        this.taskSteps = taskSteps;
        return this;
    }
    public java.util.List<DescribeFirewallTaskResponseBodyTaskSteps> getTaskSteps() {
        return this.taskSteps;
    }

    public DescribeFirewallTaskResponseBody setTaskWaitingTime(String taskWaitingTime) {
        this.taskWaitingTime = taskWaitingTime;
        return this;
    }
    public String getTaskWaitingTime() {
        return this.taskWaitingTime;
    }

    public static class DescribeFirewallTaskResponseBodyTaskSteps extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>abcd</p>
         */
        @NameInMap("StepInfo")
        public String stepInfo;

        /**
         * <strong>example:</strong>
         * <p>Create Firewall</p>
         */
        @NameInMap("StepName")
        public String stepName;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("StepProgress")
        public String stepProgress;

        /**
         * <strong>example:</strong>
         * <p>init</p>
         */
        @NameInMap("StepStatus")
        public String stepStatus;

        public static DescribeFirewallTaskResponseBodyTaskSteps build(java.util.Map<String, ?> map) throws Exception {
            DescribeFirewallTaskResponseBodyTaskSteps self = new DescribeFirewallTaskResponseBodyTaskSteps();
            return TeaModel.build(map, self);
        }

        public DescribeFirewallTaskResponseBodyTaskSteps setStepInfo(String stepInfo) {
            this.stepInfo = stepInfo;
            return this;
        }
        public String getStepInfo() {
            return this.stepInfo;
        }

        public DescribeFirewallTaskResponseBodyTaskSteps setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public DescribeFirewallTaskResponseBodyTaskSteps setStepProgress(String stepProgress) {
            this.stepProgress = stepProgress;
            return this;
        }
        public String getStepProgress() {
            return this.stepProgress;
        }

        public DescribeFirewallTaskResponseBodyTaskSteps setStepStatus(String stepStatus) {
            this.stepStatus = stepStatus;
            return this;
        }
        public String getStepStatus() {
            return this.stepStatus;
        }

    }

}
