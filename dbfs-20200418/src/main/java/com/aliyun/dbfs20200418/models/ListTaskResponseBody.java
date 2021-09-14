// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListTaskResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Tasks")
    public java.util.List<ListTaskResponseBodyTasks> tasks;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static ListTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskResponseBody self = new ListTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTaskResponseBody setTasks(java.util.List<ListTaskResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListTaskResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public ListTaskResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class ListTaskResponseBodyTasks extends TeaModel {
        @NameInMap("TaskErrorReason")
        public String taskErrorReason;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("NextExecutionTime")
        public String nextExecutionTime;

        @NameInMap("CompletionTime")
        public String completionTime;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("TaskStatusCode")
        public Integer taskStatusCode;

        @NameInMap("TaskExecutionCounts")
        public Integer taskExecutionCounts;

        @NameInMap("ClientToken")
        public String clientToken;

        @NameInMap("TaskAdder")
        public String taskAdder;

        @NameInMap("TaskProgressDescription")
        public String taskProgressDescription;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("TaskRunner")
        public String taskRunner;

        @NameInMap("TaskProgress")
        public Integer taskProgress;

        @NameInMap("TaskOwner")
        public String taskOwner;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("MaxRetry")
        public Integer maxRetry;

        public static ListTaskResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListTaskResponseBodyTasks self = new ListTaskResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListTaskResponseBodyTasks setTaskErrorReason(String taskErrorReason) {
            this.taskErrorReason = taskErrorReason;
            return this;
        }
        public String getTaskErrorReason() {
            return this.taskErrorReason;
        }

        public ListTaskResponseBodyTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListTaskResponseBodyTasks setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ListTaskResponseBodyTasks setNextExecutionTime(String nextExecutionTime) {
            this.nextExecutionTime = nextExecutionTime;
            return this;
        }
        public String getNextExecutionTime() {
            return this.nextExecutionTime;
        }

        public ListTaskResponseBodyTasks setCompletionTime(String completionTime) {
            this.completionTime = completionTime;
            return this;
        }
        public String getCompletionTime() {
            return this.completionTime;
        }

        public ListTaskResponseBodyTasks setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListTaskResponseBodyTasks setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public ListTaskResponseBodyTasks setTaskStatusCode(Integer taskStatusCode) {
            this.taskStatusCode = taskStatusCode;
            return this;
        }
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        public ListTaskResponseBodyTasks setTaskExecutionCounts(Integer taskExecutionCounts) {
            this.taskExecutionCounts = taskExecutionCounts;
            return this;
        }
        public Integer getTaskExecutionCounts() {
            return this.taskExecutionCounts;
        }

        public ListTaskResponseBodyTasks setClientToken(String clientToken) {
            this.clientToken = clientToken;
            return this;
        }
        public String getClientToken() {
            return this.clientToken;
        }

        public ListTaskResponseBodyTasks setTaskAdder(String taskAdder) {
            this.taskAdder = taskAdder;
            return this;
        }
        public String getTaskAdder() {
            return this.taskAdder;
        }

        public ListTaskResponseBodyTasks setTaskProgressDescription(String taskProgressDescription) {
            this.taskProgressDescription = taskProgressDescription;
            return this;
        }
        public String getTaskProgressDescription() {
            return this.taskProgressDescription;
        }

        public ListTaskResponseBodyTasks setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListTaskResponseBodyTasks setTaskRunner(String taskRunner) {
            this.taskRunner = taskRunner;
            return this;
        }
        public String getTaskRunner() {
            return this.taskRunner;
        }

        public ListTaskResponseBodyTasks setTaskProgress(Integer taskProgress) {
            this.taskProgress = taskProgress;
            return this;
        }
        public Integer getTaskProgress() {
            return this.taskProgress;
        }

        public ListTaskResponseBodyTasks setTaskOwner(String taskOwner) {
            this.taskOwner = taskOwner;
            return this;
        }
        public String getTaskOwner() {
            return this.taskOwner;
        }

        public ListTaskResponseBodyTasks setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListTaskResponseBodyTasks setMaxRetry(Integer maxRetry) {
            this.maxRetry = maxRetry;
            return this;
        }
        public Integer getMaxRetry() {
            return this.maxRetry;
        }

    }

}
