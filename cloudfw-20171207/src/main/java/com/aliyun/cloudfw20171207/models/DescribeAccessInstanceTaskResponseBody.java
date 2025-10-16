// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAccessInstanceTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsFound")
    public Boolean isFound;

    /**
     * <strong>example:</strong>
     * <p>15FCCC52-1E23-57AE-B5EF-3E00A3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>17151381075</p>
     */
    @NameInMap("TaskFinishTimestamp")
    public Long taskFinishTimestamp;

    /**
     * <strong>example:</strong>
     * <p>3c9d576f-fce0-4caa-9116-15033509bdb6</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskName")
    public String taskName;

    /**
     * <strong>example:</strong>
     * <p>17151361285</p>
     */
    @NameInMap("TaskStartTimestamp")
    public Long taskStartTimestamp;

    /**
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    @NameInMap("TaskSteps")
    public java.util.List<DescribeAccessInstanceTaskResponseBodyTaskSteps> taskSteps;

    public static DescribeAccessInstanceTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessInstanceTaskResponseBody self = new DescribeAccessInstanceTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessInstanceTaskResponseBody setIsFound(Boolean isFound) {
        this.isFound = isFound;
        return this;
    }
    public Boolean getIsFound() {
        return this.isFound;
    }

    public DescribeAccessInstanceTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessInstanceTaskResponseBody setTaskFinishTimestamp(Long taskFinishTimestamp) {
        this.taskFinishTimestamp = taskFinishTimestamp;
        return this;
    }
    public Long getTaskFinishTimestamp() {
        return this.taskFinishTimestamp;
    }

    public DescribeAccessInstanceTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeAccessInstanceTaskResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public DescribeAccessInstanceTaskResponseBody setTaskStartTimestamp(Long taskStartTimestamp) {
        this.taskStartTimestamp = taskStartTimestamp;
        return this;
    }
    public Long getTaskStartTimestamp() {
        return this.taskStartTimestamp;
    }

    public DescribeAccessInstanceTaskResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public DescribeAccessInstanceTaskResponseBody setTaskSteps(java.util.List<DescribeAccessInstanceTaskResponseBodyTaskSteps> taskSteps) {
        this.taskSteps = taskSteps;
        return this;
    }
    public java.util.List<DescribeAccessInstanceTaskResponseBodyTaskSteps> getTaskSteps() {
        return this.taskSteps;
    }

    public static class DescribeAccessInstanceTaskResponseBodyTaskSteps extends TeaModel {
        @NameInMap("StepName")
        public String stepName;

        /**
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("StepProgress")
        public String stepProgress;

        /**
         * <strong>example:</strong>
         * <p>finished</p>
         */
        @NameInMap("StepStatus")
        public String stepStatus;

        public static DescribeAccessInstanceTaskResponseBodyTaskSteps build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessInstanceTaskResponseBodyTaskSteps self = new DescribeAccessInstanceTaskResponseBodyTaskSteps();
            return TeaModel.build(map, self);
        }

        public DescribeAccessInstanceTaskResponseBodyTaskSteps setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public DescribeAccessInstanceTaskResponseBodyTaskSteps setStepProgress(String stepProgress) {
            this.stepProgress = stepProgress;
            return this;
        }
        public String getStepProgress() {
            return this.stepProgress;
        }

        public DescribeAccessInstanceTaskResponseBodyTaskSteps setStepStatus(String stepStatus) {
            this.stepStatus = stepStatus;
            return this;
        }
        public String getStepStatus() {
            return this.stepStatus;
        }

    }

}
