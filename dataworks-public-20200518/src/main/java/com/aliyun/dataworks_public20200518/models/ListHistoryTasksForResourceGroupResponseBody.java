// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListHistoryTasksForResourceGroupResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListHistoryTasksForResourceGroupResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListHistoryTasksForResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHistoryTasksForResourceGroupResponseBody self = new ListHistoryTasksForResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHistoryTasksForResourceGroupResponseBody setData(ListHistoryTasksForResourceGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListHistoryTasksForResourceGroupResponseBodyData getData() {
        return this.data;
    }

    public ListHistoryTasksForResourceGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListHistoryTasksForResourceGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListHistoryTasksForResourceGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListHistoryTasksForResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHistoryTasksForResourceGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListHistoryTasksForResourceGroupResponseBodyDataTasks extends TeaModel {
        @NameInMap("Concurrency")
        public Integer concurrency;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskType")
        public Integer taskType;

        public static ListHistoryTasksForResourceGroupResponseBodyDataTasks build(java.util.Map<String, ?> map) throws Exception {
            ListHistoryTasksForResourceGroupResponseBodyDataTasks self = new ListHistoryTasksForResourceGroupResponseBodyDataTasks();
            return TeaModel.build(map, self);
        }

        public ListHistoryTasksForResourceGroupResponseBodyDataTasks setConcurrency(Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Integer getConcurrency() {
            return this.concurrency;
        }

        public ListHistoryTasksForResourceGroupResponseBodyDataTasks setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListHistoryTasksForResourceGroupResponseBodyDataTasks setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListHistoryTasksForResourceGroupResponseBodyDataTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListHistoryTasksForResourceGroupResponseBodyDataTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListHistoryTasksForResourceGroupResponseBodyDataTasks setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

    }

    public static class ListHistoryTasksForResourceGroupResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Tasks")
        public java.util.List<ListHistoryTasksForResourceGroupResponseBodyDataTasks> tasks;

        @NameInMap("TotalNum")
        public Integer totalNum;

        public static ListHistoryTasksForResourceGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHistoryTasksForResourceGroupResponseBodyData self = new ListHistoryTasksForResourceGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHistoryTasksForResourceGroupResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListHistoryTasksForResourceGroupResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHistoryTasksForResourceGroupResponseBodyData setTasks(java.util.List<ListHistoryTasksForResourceGroupResponseBodyDataTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<ListHistoryTasksForResourceGroupResponseBodyDataTasks> getTasks() {
            return this.tasks;
        }

        public ListHistoryTasksForResourceGroupResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
