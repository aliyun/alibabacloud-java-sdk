// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListClusterOperationTaskResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ClusterOperationTaskList")
    public ListClusterOperationTaskResponseBodyClusterOperationTaskList clusterOperationTaskList;

    public static ListClusterOperationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOperationTaskResponseBody self = new ListClusterOperationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterOperationTaskResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListClusterOperationTaskResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClusterOperationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterOperationTaskResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClusterOperationTaskResponseBody setClusterOperationTaskList(ListClusterOperationTaskResponseBodyClusterOperationTaskList clusterOperationTaskList) {
        this.clusterOperationTaskList = clusterOperationTaskList;
        return this;
    }
    public ListClusterOperationTaskResponseBodyClusterOperationTaskList getClusterOperationTaskList() {
        return this.clusterOperationTaskList;
    }

    public static class ListClusterOperationTaskResponseBodyClusterOperationTaskListClusterOperationTask extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("Percentage")
        public String percentage;

        @NameInMap("TaskId")
        public String taskId;

        public static ListClusterOperationTaskResponseBodyClusterOperationTaskListClusterOperationTask build(java.util.Map<String, ?> map) throws Exception {
            ListClusterOperationTaskResponseBodyClusterOperationTaskListClusterOperationTask self = new ListClusterOperationTaskResponseBodyClusterOperationTaskListClusterOperationTask();
            return TeaModel.build(map, self);
        }

        public ListClusterOperationTaskResponseBodyClusterOperationTaskListClusterOperationTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClusterOperationTaskResponseBodyClusterOperationTaskListClusterOperationTask setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListClusterOperationTaskResponseBodyClusterOperationTaskListClusterOperationTask setPercentage(String percentage) {
            this.percentage = percentage;
            return this;
        }
        public String getPercentage() {
            return this.percentage;
        }

        public ListClusterOperationTaskResponseBodyClusterOperationTaskListClusterOperationTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class ListClusterOperationTaskResponseBodyClusterOperationTaskList extends TeaModel {
        @NameInMap("ClusterOperationTask")
        public java.util.List<ListClusterOperationTaskResponseBodyClusterOperationTaskListClusterOperationTask> clusterOperationTask;

        public static ListClusterOperationTaskResponseBodyClusterOperationTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterOperationTaskResponseBodyClusterOperationTaskList self = new ListClusterOperationTaskResponseBodyClusterOperationTaskList();
            return TeaModel.build(map, self);
        }

        public ListClusterOperationTaskResponseBodyClusterOperationTaskList setClusterOperationTask(java.util.List<ListClusterOperationTaskResponseBodyClusterOperationTaskListClusterOperationTask> clusterOperationTask) {
            this.clusterOperationTask = clusterOperationTask;
            return this;
        }
        public java.util.List<ListClusterOperationTaskResponseBodyClusterOperationTaskListClusterOperationTask> getClusterOperationTask() {
            return this.clusterOperationTask;
        }

    }

}
