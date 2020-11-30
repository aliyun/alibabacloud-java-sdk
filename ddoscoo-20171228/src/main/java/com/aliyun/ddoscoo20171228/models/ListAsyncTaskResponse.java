// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ListAsyncTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("AsyncTasks")
    @Validation(required = true)
    public java.util.List<ListAsyncTaskResponseAsyncTasks> asyncTasks;

    public static ListAsyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAsyncTaskResponse self = new ListAsyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListAsyncTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAsyncTaskResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListAsyncTaskResponse setAsyncTasks(java.util.List<ListAsyncTaskResponseAsyncTasks> asyncTasks) {
        this.asyncTasks = asyncTasks;
        return this;
    }
    public java.util.List<ListAsyncTaskResponseAsyncTasks> getAsyncTasks() {
        return this.asyncTasks;
    }

    public static class ListAsyncTaskResponseAsyncTasks extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public Long taskId;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        @NameInMap("TaskStatus")
        @Validation(required = true)
        public Integer taskStatus;

        @NameInMap("TaskResult")
        @Validation(required = true)
        public String taskResult;

        @NameInMap("TaskParams")
        @Validation(required = true)
        public String taskParams;

        @NameInMap("TaskType")
        @Validation(required = true)
        public Integer taskType;

        public static ListAsyncTaskResponseAsyncTasks build(java.util.Map<String, ?> map) throws Exception {
            ListAsyncTaskResponseAsyncTasks self = new ListAsyncTaskResponseAsyncTasks();
            return TeaModel.build(map, self);
        }

        public ListAsyncTaskResponseAsyncTasks setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public ListAsyncTaskResponseAsyncTasks setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListAsyncTaskResponseAsyncTasks setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListAsyncTaskResponseAsyncTasks setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public ListAsyncTaskResponseAsyncTasks setTaskResult(String taskResult) {
            this.taskResult = taskResult;
            return this;
        }
        public String getTaskResult() {
            return this.taskResult;
        }

        public ListAsyncTaskResponseAsyncTasks setTaskParams(String taskParams) {
            this.taskParams = taskParams;
            return this;
        }
        public String getTaskParams() {
            return this.taskParams;
        }

        public ListAsyncTaskResponseAsyncTasks setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

    }

}
