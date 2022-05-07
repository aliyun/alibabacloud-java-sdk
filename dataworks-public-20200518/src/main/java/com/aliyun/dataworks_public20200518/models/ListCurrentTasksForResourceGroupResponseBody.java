// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListCurrentTasksForResourceGroupResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListCurrentTasksForResourceGroupResponseBodyData data;

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

    public static ListCurrentTasksForResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCurrentTasksForResourceGroupResponseBody self = new ListCurrentTasksForResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCurrentTasksForResourceGroupResponseBody setData(ListCurrentTasksForResourceGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCurrentTasksForResourceGroupResponseBodyData getData() {
        return this.data;
    }

    public ListCurrentTasksForResourceGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListCurrentTasksForResourceGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListCurrentTasksForResourceGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCurrentTasksForResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCurrentTasksForResourceGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCurrentTasksForResourceGroupResponseBodyDataTasks extends TeaModel {
        @NameInMap("Concurrency")
        public String concurrency;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskSource")
        public String taskSource;

        @NameInMap("TaskType")
        public Integer taskType;

        public static ListCurrentTasksForResourceGroupResponseBodyDataTasks build(java.util.Map<String, ?> map) throws Exception {
            ListCurrentTasksForResourceGroupResponseBodyDataTasks self = new ListCurrentTasksForResourceGroupResponseBodyDataTasks();
            return TeaModel.build(map, self);
        }

        public ListCurrentTasksForResourceGroupResponseBodyDataTasks setConcurrency(String concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public String getConcurrency() {
            return this.concurrency;
        }

        public ListCurrentTasksForResourceGroupResponseBodyDataTasks setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListCurrentTasksForResourceGroupResponseBodyDataTasks setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListCurrentTasksForResourceGroupResponseBodyDataTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListCurrentTasksForResourceGroupResponseBodyDataTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListCurrentTasksForResourceGroupResponseBodyDataTasks setTaskSource(String taskSource) {
            this.taskSource = taskSource;
            return this;
        }
        public String getTaskSource() {
            return this.taskSource;
        }

        public ListCurrentTasksForResourceGroupResponseBodyDataTasks setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

    }

    public static class ListCurrentTasksForResourceGroupResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Tasks")
        public java.util.List<ListCurrentTasksForResourceGroupResponseBodyDataTasks> tasks;

        @NameInMap("TotalNum")
        public Integer totalNum;

        public static ListCurrentTasksForResourceGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCurrentTasksForResourceGroupResponseBodyData self = new ListCurrentTasksForResourceGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCurrentTasksForResourceGroupResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListCurrentTasksForResourceGroupResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCurrentTasksForResourceGroupResponseBodyData setTasks(java.util.List<ListCurrentTasksForResourceGroupResponseBodyDataTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<ListCurrentTasksForResourceGroupResponseBodyDataTasks> getTasks() {
            return this.tasks;
        }

        public ListCurrentTasksForResourceGroupResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
