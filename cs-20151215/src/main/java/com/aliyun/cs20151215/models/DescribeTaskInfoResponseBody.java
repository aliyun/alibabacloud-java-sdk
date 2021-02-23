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
    public java.util.List<DescribeTaskInfoResponseBodyTaskResult> taskResult;

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

    public DescribeTaskInfoResponseBody setTaskResult(java.util.List<DescribeTaskInfoResponseBodyTaskResult> taskResult) {
        this.taskResult = taskResult;
        return this;
    }
    public java.util.List<DescribeTaskInfoResponseBodyTaskResult> getTaskResult() {
        return this.taskResult;
    }

    public static class DescribeTaskInfoResponseBodyTaskResult extends TeaModel {
        // 操作的资源，例如：实例ID。
        @NameInMap("data")
        public String data;

        // 资源的状态。
        @NameInMap("status")
        public String status;

        public static DescribeTaskInfoResponseBodyTaskResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskInfoResponseBodyTaskResult self = new DescribeTaskInfoResponseBodyTaskResult();
            return TeaModel.build(map, self);
        }

        public DescribeTaskInfoResponseBodyTaskResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DescribeTaskInfoResponseBodyTaskResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
