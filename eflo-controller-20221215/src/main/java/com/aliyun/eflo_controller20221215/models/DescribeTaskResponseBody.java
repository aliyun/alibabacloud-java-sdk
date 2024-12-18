// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>i119982311660892626523</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>Standard_Cluster</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <strong>example:</strong>
     * <p>2022-11-30T02:00:00.852Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>Releasing [prod_main_mid_26e234cf] in region [cn-beijing] with weight [0]</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("NodeIds")
    public java.util.List<String> nodeIds;

    /**
     * <strong>example:</strong>
     * <p>A7FD7411-9395-52E8-AF42-EB3A4A55446D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Steps")
    public java.util.List<DescribeTaskResponseBodySteps> steps;

    /**
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("TaskState")
    public String taskState;

    /**
     * <strong>example:</strong>
     * <p>cut_cluster</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <strong>example:</strong>
     * <p>2022-11-30T03:40:14.852Z</p>
     */
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

    public DescribeTaskResponseBody setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
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
        /**
         * <strong>example:</strong>
         * <p>2022-11-30T2:00:00.852Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>Releasing [prod_main_mid_26e234cf] in region [cn-beijing] with weight [0]</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>i158805051661047928377</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("TaskState")
        public String taskState;

        /**
         * <strong>example:</strong>
         * <p>cut_node_sub_task</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <strong>example:</strong>
         * <p>2022-11-30T02:20:14.852Z</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>get taskinfo failed</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("StageTag")
        public String stageTag;

        /**
         * <strong>example:</strong>
         * <p>2022-11-30T2:00:00.852Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>create_vpd</p>
         */
        @NameInMap("StepName")
        public String stepName;

        /**
         * <strong>example:</strong>
         * <p>execution_success</p>
         */
        @NameInMap("StepState")
        public String stepState;

        /**
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("StepType")
        public String stepType;

        @NameInMap("SubTasks")
        public java.util.List<DescribeTaskResponseBodyStepsSubTasks> subTasks;

        /**
         * <strong>example:</strong>
         * <p>2022-11-30T02:20:14.852Z</p>
         */
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
