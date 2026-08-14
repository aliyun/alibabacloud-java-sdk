// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAsyncTasksResponseBody extends TeaModel {
    @NameInMap("AsyncTasks")
    public java.util.List<DescribeAsyncTasksResponseBodyAsyncTasks> asyncTasks;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAsyncTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAsyncTasksResponseBody self = new DescribeAsyncTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAsyncTasksResponseBody setAsyncTasks(java.util.List<DescribeAsyncTasksResponseBodyAsyncTasks> asyncTasks) {
        this.asyncTasks = asyncTasks;
        return this;
    }
    public java.util.List<DescribeAsyncTasksResponseBodyAsyncTasks> getAsyncTasks() {
        return this.asyncTasks;
    }

    public DescribeAsyncTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAsyncTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAsyncTasksResponseBodyAsyncTasks extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("TaskParams")
        public String taskParams;

        @NameInMap("TaskResult")
        public String taskResult;

        @NameInMap("TaskStatus")
        public Integer taskStatus;

        @NameInMap("TaskType")
        public Integer taskType;

        public static DescribeAsyncTasksResponseBodyAsyncTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeAsyncTasksResponseBodyAsyncTasks self = new DescribeAsyncTasksResponseBodyAsyncTasks();
            return TeaModel.build(map, self);
        }

        public DescribeAsyncTasksResponseBodyAsyncTasks setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeAsyncTasksResponseBodyAsyncTasks setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeAsyncTasksResponseBodyAsyncTasks setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public DescribeAsyncTasksResponseBodyAsyncTasks setTaskParams(String taskParams) {
            this.taskParams = taskParams;
            return this;
        }
        public String getTaskParams() {
            return this.taskParams;
        }

        public DescribeAsyncTasksResponseBodyAsyncTasks setTaskResult(String taskResult) {
            this.taskResult = taskResult;
            return this;
        }
        public String getTaskResult() {
            return this.taskResult;
        }

        public DescribeAsyncTasksResponseBodyAsyncTasks setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeAsyncTasksResponseBodyAsyncTasks setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

    }

}
