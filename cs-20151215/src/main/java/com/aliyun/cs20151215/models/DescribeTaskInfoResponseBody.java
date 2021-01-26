// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeTaskInfoResponseBody extends TeaModel {
    // 集群ID。
    @NameInMap("cluster_id")
    public String clusterId;

    // 任务ID。
    @NameInMap("task_id")
    public String taskId;

    // 任务创建时间。
    @NameInMap("created")
    public String created;

    // 任务更新时间。
    @NameInMap("updated")
    public String updated;

    // 任务当前状态。
    @NameInMap("state")
    public String state;

    // 当前任务类型。
    @NameInMap("task_type")
    public String taskType;

    // 任务执行详情。
    @NameInMap("task_result")
    public DescribeTaskInfoResponseBodyTaskResult taskResult;

    public static DescribeTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskInfoResponseBody self = new DescribeTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTaskInfoResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeTaskInfoResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeTaskInfoResponseBody setCreated(String created) {
        this.created = created;
        return this;
    }
    public String getCreated() {
        return this.created;
    }

    public DescribeTaskInfoResponseBody setUpdated(String updated) {
        this.updated = updated;
        return this;
    }
    public String getUpdated() {
        return this.updated;
    }

    public DescribeTaskInfoResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeTaskInfoResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public DescribeTaskInfoResponseBody setTaskResult(DescribeTaskInfoResponseBodyTaskResult taskResult) {
        this.taskResult = taskResult;
        return this;
    }
    public DescribeTaskInfoResponseBodyTaskResult getTaskResult() {
        return this.taskResult;
    }

    public static class DescribeTaskInfoResponseBodyTaskResultTask extends TeaModel {
        // 操作的资源，例如：实例ID。
        @NameInMap("data")
        public String data;

        // 资源的状态。
        @NameInMap("status")
        public String status;

        public static DescribeTaskInfoResponseBodyTaskResultTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskInfoResponseBodyTaskResultTask self = new DescribeTaskInfoResponseBodyTaskResultTask();
            return TeaModel.build(map, self);
        }

        public DescribeTaskInfoResponseBodyTaskResultTask setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DescribeTaskInfoResponseBodyTaskResultTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeTaskInfoResponseBodyTaskResult extends TeaModel {
        @NameInMap("task")
        public java.util.List<DescribeTaskInfoResponseBodyTaskResultTask> task;

        public static DescribeTaskInfoResponseBodyTaskResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskInfoResponseBodyTaskResult self = new DescribeTaskInfoResponseBodyTaskResult();
            return TeaModel.build(map, self);
        }

        public DescribeTaskInfoResponseBodyTaskResult setTask(java.util.List<DescribeTaskInfoResponseBodyTaskResultTask> task) {
            this.task = task;
            return this;
        }
        public java.util.List<DescribeTaskInfoResponseBodyTaskResultTask> getTask() {
            return this.task;
        }

    }

}
