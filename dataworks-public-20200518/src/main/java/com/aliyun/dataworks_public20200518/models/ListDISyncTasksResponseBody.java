// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDISyncTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskList")
    public ListDISyncTasksResponseBodyTaskList taskList;

    public static ListDISyncTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDISyncTasksResponseBody self = new ListDISyncTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDISyncTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDISyncTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDISyncTasksResponseBody setTaskList(ListDISyncTasksResponseBodyTaskList taskList) {
        this.taskList = taskList;
        return this;
    }
    public ListDISyncTasksResponseBodyTaskList getTaskList() {
        return this.taskList;
    }

    public static class ListDISyncTasksResponseBodyTaskListRealTimeSolutionList extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ProcessId")
        public Long processId;

        @NameInMap("ProcessName")
        public String processName;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("TaskType")
        public String taskType;

        public static ListDISyncTasksResponseBodyTaskListRealTimeSolutionList build(java.util.Map<String, ?> map) throws Exception {
            ListDISyncTasksResponseBodyTaskListRealTimeSolutionList self = new ListDISyncTasksResponseBodyTaskListRealTimeSolutionList();
            return TeaModel.build(map, self);
        }

        public ListDISyncTasksResponseBodyTaskListRealTimeSolutionList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDISyncTasksResponseBodyTaskListRealTimeSolutionList setProcessId(Long processId) {
            this.processId = processId;
            return this;
        }
        public Long getProcessId() {
            return this.processId;
        }

        public ListDISyncTasksResponseBodyTaskListRealTimeSolutionList setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public ListDISyncTasksResponseBodyTaskListRealTimeSolutionList setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public ListDISyncTasksResponseBodyTaskListRealTimeSolutionList setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

    public static class ListDISyncTasksResponseBodyTaskList extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("RealTimeSolutionList")
        public java.util.List<ListDISyncTasksResponseBodyTaskListRealTimeSolutionList> realTimeSolutionList;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDISyncTasksResponseBodyTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListDISyncTasksResponseBodyTaskList self = new ListDISyncTasksResponseBodyTaskList();
            return TeaModel.build(map, self);
        }

        public ListDISyncTasksResponseBodyTaskList setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDISyncTasksResponseBodyTaskList setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDISyncTasksResponseBodyTaskList setRealTimeSolutionList(java.util.List<ListDISyncTasksResponseBodyTaskListRealTimeSolutionList> realTimeSolutionList) {
            this.realTimeSolutionList = realTimeSolutionList;
            return this;
        }
        public java.util.List<ListDISyncTasksResponseBodyTaskListRealTimeSolutionList> getRealTimeSolutionList() {
            return this.realTimeSolutionList;
        }

        public ListDISyncTasksResponseBodyTaskList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
