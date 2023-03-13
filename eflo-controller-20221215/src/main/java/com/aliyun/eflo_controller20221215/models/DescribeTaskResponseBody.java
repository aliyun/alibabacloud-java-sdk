// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeTaskResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Steps")
    public java.util.List<DescribeTaskResponseBodySteps> steps;

    @NameInMap("TaskState")
    public String taskState;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("UpdateTime")
    public String updateTime;

    public static DescribeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskResponseBody self = new DescribeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTaskResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeTaskResponseBody setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeTaskResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTaskResponseBody setSteps(java.util.List<DescribeTaskResponseBodySteps> steps) {
        this.steps = steps;
        return this;
    }
    public java.util.List<DescribeTaskResponseBodySteps> getSteps() {
        return this.steps;
    }

    public DescribeTaskResponseBody setTaskState(String taskState) {
        this.taskState = taskState;
        return this;
    }
    public String getTaskState() {
        return this.taskState;
    }

    public DescribeTaskResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public DescribeTaskResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class DescribeTaskResponseBodyStepsSubTasks extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Message")
        public String message;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskState")
        public String taskState;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeTaskResponseBodyStepsSubTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskResponseBodyStepsSubTasks self = new DescribeTaskResponseBodyStepsSubTasks();
            return TeaModel.build(map, self);
        }

        public DescribeTaskResponseBodyStepsSubTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeTaskResponseBodyStepsSubTasks setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeTaskResponseBodyStepsSubTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeTaskResponseBodyStepsSubTasks setTaskState(String taskState) {
            this.taskState = taskState;
            return this;
        }
        public String getTaskState() {
            return this.taskState;
        }

        public DescribeTaskResponseBodyStepsSubTasks setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeTaskResponseBodyStepsSubTasks setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeTaskResponseBodySteps extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("StageTag")
        public String stageTag;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StepName")
        public String stepName;

        @NameInMap("StepState")
        public String stepState;

        @NameInMap("StepType")
        public String stepType;

        @NameInMap("SubTasks")
        public java.util.List<DescribeTaskResponseBodyStepsSubTasks> subTasks;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeTaskResponseBodySteps build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskResponseBodySteps self = new DescribeTaskResponseBodySteps();
            return TeaModel.build(map, self);
        }

        public DescribeTaskResponseBodySteps setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeTaskResponseBodySteps setStageTag(String stageTag) {
            this.stageTag = stageTag;
            return this;
        }
        public String getStageTag() {
            return this.stageTag;
        }

        public DescribeTaskResponseBodySteps setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeTaskResponseBodySteps setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public DescribeTaskResponseBodySteps setStepState(String stepState) {
            this.stepState = stepState;
            return this;
        }
        public String getStepState() {
            return this.stepState;
        }

        public DescribeTaskResponseBodySteps setStepType(String stepType) {
            this.stepType = stepType;
            return this;
        }
        public String getStepType() {
            return this.stepType;
        }

        public DescribeTaskResponseBodySteps setSubTasks(java.util.List<DescribeTaskResponseBodyStepsSubTasks> subTasks) {
            this.subTasks = subTasks;
            return this;
        }
        public java.util.List<DescribeTaskResponseBodyStepsSubTasks> getSubTasks() {
            return this.subTasks;
        }

        public DescribeTaskResponseBodySteps setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
