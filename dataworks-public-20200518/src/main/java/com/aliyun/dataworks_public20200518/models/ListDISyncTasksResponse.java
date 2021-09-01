// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDISyncTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TaskList")
    @Validation(required = true)
    public ListDISyncTasksResponseTaskList taskList;

    public static ListDISyncTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDISyncTasksResponse self = new ListDISyncTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListDISyncTasksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDISyncTasksResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDISyncTasksResponse setTaskList(ListDISyncTasksResponseTaskList taskList) {
        this.taskList = taskList;
        return this;
    }
    public ListDISyncTasksResponseTaskList getTaskList() {
        return this.taskList;
    }

    public static class ListDISyncTasksResponseTaskListRealTimeSolutionList extends TeaModel {
        @NameInMap("ProcessId")
        @Validation(required = true)
        public Long processId;

        @NameInMap("ProcessName")
        @Validation(required = true)
        public String processName;

        @NameInMap("TaskStatus")
        @Validation(required = true)
        public String taskStatus;

        @NameInMap("TaskType")
        @Validation(required = true)
        public String taskType;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        public static ListDISyncTasksResponseTaskListRealTimeSolutionList build(java.util.Map<String, ?> map) throws Exception {
            ListDISyncTasksResponseTaskListRealTimeSolutionList self = new ListDISyncTasksResponseTaskListRealTimeSolutionList();
            return TeaModel.build(map, self);
        }

        public ListDISyncTasksResponseTaskListRealTimeSolutionList setProcessId(Long processId) {
            this.processId = processId;
            return this;
        }
        public Long getProcessId() {
            return this.processId;
        }

        public ListDISyncTasksResponseTaskListRealTimeSolutionList setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public ListDISyncTasksResponseTaskListRealTimeSolutionList setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public ListDISyncTasksResponseTaskListRealTimeSolutionList setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListDISyncTasksResponseTaskListRealTimeSolutionList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

    }

    public static class ListDISyncTasksResponseTaskList extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("RealTimeSolutionList")
        @Validation(required = true)
        public java.util.List<ListDISyncTasksResponseTaskListRealTimeSolutionList> realTimeSolutionList;

        public static ListDISyncTasksResponseTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListDISyncTasksResponseTaskList self = new ListDISyncTasksResponseTaskList();
            return TeaModel.build(map, self);
        }

        public ListDISyncTasksResponseTaskList setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDISyncTasksResponseTaskList setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDISyncTasksResponseTaskList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListDISyncTasksResponseTaskList setRealTimeSolutionList(java.util.List<ListDISyncTasksResponseTaskListRealTimeSolutionList> realTimeSolutionList) {
            this.realTimeSolutionList = realTimeSolutionList;
            return this;
        }
        public java.util.List<ListDISyncTasksResponseTaskListRealTimeSolutionList> getRealTimeSolutionList() {
            return this.realTimeSolutionList;
        }

    }

}
