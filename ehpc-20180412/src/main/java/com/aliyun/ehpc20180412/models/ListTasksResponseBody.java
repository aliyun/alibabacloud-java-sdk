// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListTasksResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Tasks")
    public java.util.List<ListTasksResponseBodyTasks> tasks;

    public static ListTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTasksResponseBody self = new ListTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTasksResponseBody setTasks(java.util.List<ListTasksResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListTasksResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public static class ListTasksResponseBodyTasks extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("TotalSteps")
        public Integer totalSteps;

        @NameInMap("CurrentStep")
        public Integer currentStep;

        @NameInMap("Result")
        public String result;

        @NameInMap("Errors")
        public String errors;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Request")
        public String request;

        @NameInMap("ClusterId")
        public String clusterId;

        public static ListTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyTasks self = new ListTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTasksResponseBodyTasks setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListTasksResponseBodyTasks setTotalSteps(Integer totalSteps) {
            this.totalSteps = totalSteps;
            return this;
        }
        public Integer getTotalSteps() {
            return this.totalSteps;
        }

        public ListTasksResponseBodyTasks setCurrentStep(Integer currentStep) {
            this.currentStep = currentStep;
            return this;
        }
        public Integer getCurrentStep() {
            return this.currentStep;
        }

        public ListTasksResponseBodyTasks setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListTasksResponseBodyTasks setErrors(String errors) {
            this.errors = errors;
            return this;
        }
        public String getErrors() {
            return this.errors;
        }

        public ListTasksResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListTasksResponseBodyTasks setRequest(String request) {
            this.request = request;
            return this;
        }
        public String getRequest() {
            return this.request;
        }

        public ListTasksResponseBodyTasks setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

}
