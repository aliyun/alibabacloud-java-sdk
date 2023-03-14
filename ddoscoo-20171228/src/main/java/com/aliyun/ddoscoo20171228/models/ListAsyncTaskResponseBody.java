// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ListAsyncTaskResponseBody extends TeaModel {
    @NameInMap("AsyncTasks")
    public java.util.List<ListAsyncTaskResponseBodyAsyncTasks> asyncTasks;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    public static ListAsyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAsyncTaskResponseBody self = new ListAsyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAsyncTaskResponseBody setAsyncTasks(java.util.List<ListAsyncTaskResponseBodyAsyncTasks> asyncTasks) {
        this.asyncTasks = asyncTasks;
        return this;
    }
    public java.util.List<ListAsyncTaskResponseBodyAsyncTasks> getAsyncTasks() {
        return this.asyncTasks;
    }

    public ListAsyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAsyncTaskResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListAsyncTaskResponseBodyAsyncTasks extends TeaModel {
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

        public static ListAsyncTaskResponseBodyAsyncTasks build(java.util.Map<String, ?> map) throws Exception {
            ListAsyncTaskResponseBodyAsyncTasks self = new ListAsyncTaskResponseBodyAsyncTasks();
            return TeaModel.build(map, self);
        }

        public ListAsyncTaskResponseBodyAsyncTasks setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListAsyncTaskResponseBodyAsyncTasks setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListAsyncTaskResponseBodyAsyncTasks setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public ListAsyncTaskResponseBodyAsyncTasks setTaskParams(String taskParams) {
            this.taskParams = taskParams;
            return this;
        }
        public String getTaskParams() {
            return this.taskParams;
        }

        public ListAsyncTaskResponseBodyAsyncTasks setTaskResult(String taskResult) {
            this.taskResult = taskResult;
            return this;
        }
        public String getTaskResult() {
            return this.taskResult;
        }

        public ListAsyncTaskResponseBodyAsyncTasks setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public ListAsyncTaskResponseBodyAsyncTasks setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

    }

}
