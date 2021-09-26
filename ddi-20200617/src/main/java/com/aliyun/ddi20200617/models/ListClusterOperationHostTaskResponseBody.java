// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListClusterOperationHostTaskResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("ClusterOperationHostTaskList")
    public ListClusterOperationHostTaskResponseBodyClusterOperationHostTaskList clusterOperationHostTaskList;

    public static ListClusterOperationHostTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOperationHostTaskResponseBody self = new ListClusterOperationHostTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterOperationHostTaskResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClusterOperationHostTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterOperationHostTaskResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClusterOperationHostTaskResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListClusterOperationHostTaskResponseBody setClusterOperationHostTaskList(ListClusterOperationHostTaskResponseBodyClusterOperationHostTaskList clusterOperationHostTaskList) {
        this.clusterOperationHostTaskList = clusterOperationHostTaskList;
        return this;
    }
    public ListClusterOperationHostTaskResponseBodyClusterOperationHostTaskList getClusterOperationHostTaskList() {
        return this.clusterOperationHostTaskList;
    }

    public static class ListClusterOperationHostTaskResponseBodyClusterOperationHostTaskListClusterOperationHostTask extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Percentage")
        public String percentage;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        public static ListClusterOperationHostTaskResponseBodyClusterOperationHostTaskListClusterOperationHostTask build(java.util.Map<String, ?> map) throws Exception {
            ListClusterOperationHostTaskResponseBodyClusterOperationHostTaskListClusterOperationHostTask self = new ListClusterOperationHostTaskResponseBodyClusterOperationHostTaskListClusterOperationHostTask();
            return TeaModel.build(map, self);
        }

        public ListClusterOperationHostTaskResponseBodyClusterOperationHostTaskListClusterOperationHostTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClusterOperationHostTaskResponseBodyClusterOperationHostTaskListClusterOperationHostTask setPercentage(String percentage) {
            this.percentage = percentage;
            return this;
        }
        public String getPercentage() {
            return this.percentage;
        }

        public ListClusterOperationHostTaskResponseBodyClusterOperationHostTaskListClusterOperationHostTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListClusterOperationHostTaskResponseBodyClusterOperationHostTaskListClusterOperationHostTask setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class ListClusterOperationHostTaskResponseBodyClusterOperationHostTaskList extends TeaModel {
        @NameInMap("ClusterOperationHostTask")
        public java.util.List<ListClusterOperationHostTaskResponseBodyClusterOperationHostTaskListClusterOperationHostTask> clusterOperationHostTask;

        public static ListClusterOperationHostTaskResponseBodyClusterOperationHostTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterOperationHostTaskResponseBodyClusterOperationHostTaskList self = new ListClusterOperationHostTaskResponseBodyClusterOperationHostTaskList();
            return TeaModel.build(map, self);
        }

        public ListClusterOperationHostTaskResponseBodyClusterOperationHostTaskList setClusterOperationHostTask(java.util.List<ListClusterOperationHostTaskResponseBodyClusterOperationHostTaskListClusterOperationHostTask> clusterOperationHostTask) {
            this.clusterOperationHostTask = clusterOperationHostTask;
            return this;
        }
        public java.util.List<ListClusterOperationHostTaskResponseBodyClusterOperationHostTaskListClusterOperationHostTask> getClusterOperationHostTask() {
            return this.clusterOperationHostTask;
        }

    }

}
