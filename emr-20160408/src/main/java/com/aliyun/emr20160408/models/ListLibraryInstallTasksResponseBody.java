// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListLibraryInstallTasksResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Items")
    public ListLibraryInstallTasksResponseBodyItems items;

    public static ListLibraryInstallTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLibraryInstallTasksResponseBody self = new ListLibraryInstallTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLibraryInstallTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListLibraryInstallTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListLibraryInstallTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLibraryInstallTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLibraryInstallTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLibraryInstallTasksResponseBody setItems(ListLibraryInstallTasksResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public ListLibraryInstallTasksResponseBodyItems getItems() {
        return this.items;
    }

    public static class ListLibraryInstallTasksResponseBodyItemsItem extends TeaModel {
        @NameInMap("LibraryBizId")
        public String libraryBizId;

        @NameInMap("Hostname")
        public String hostname;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("TaskGroupId")
        public String taskGroupId;

        @NameInMap("TaskProcess")
        public Integer taskProcess;

        @NameInMap("ClusterBizId")
        public String clusterBizId;

        @NameInMap("ExecuteTime")
        public Long executeTime;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Detail")
        public String detail;

        public static ListLibraryInstallTasksResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            ListLibraryInstallTasksResponseBodyItemsItem self = new ListLibraryInstallTasksResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public ListLibraryInstallTasksResponseBodyItemsItem setLibraryBizId(String libraryBizId) {
            this.libraryBizId = libraryBizId;
            return this;
        }
        public String getLibraryBizId() {
            return this.libraryBizId;
        }

        public ListLibraryInstallTasksResponseBodyItemsItem setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListLibraryInstallTasksResponseBodyItemsItem setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListLibraryInstallTasksResponseBodyItemsItem setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListLibraryInstallTasksResponseBodyItemsItem setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListLibraryInstallTasksResponseBodyItemsItem setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public ListLibraryInstallTasksResponseBodyItemsItem setTaskGroupId(String taskGroupId) {
            this.taskGroupId = taskGroupId;
            return this;
        }
        public String getTaskGroupId() {
            return this.taskGroupId;
        }

        public ListLibraryInstallTasksResponseBodyItemsItem setTaskProcess(Integer taskProcess) {
            this.taskProcess = taskProcess;
            return this;
        }
        public Integer getTaskProcess() {
            return this.taskProcess;
        }

        public ListLibraryInstallTasksResponseBodyItemsItem setClusterBizId(String clusterBizId) {
            this.clusterBizId = clusterBizId;
            return this;
        }
        public String getClusterBizId() {
            return this.clusterBizId;
        }

        public ListLibraryInstallTasksResponseBodyItemsItem setExecuteTime(Long executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Long getExecuteTime() {
            return this.executeTime;
        }

        public ListLibraryInstallTasksResponseBodyItemsItem setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListLibraryInstallTasksResponseBodyItemsItem setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

    }

    public static class ListLibraryInstallTasksResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<ListLibraryInstallTasksResponseBodyItemsItem> item;

        public static ListLibraryInstallTasksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListLibraryInstallTasksResponseBodyItems self = new ListLibraryInstallTasksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListLibraryInstallTasksResponseBodyItems setItem(java.util.List<ListLibraryInstallTasksResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<ListLibraryInstallTasksResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
