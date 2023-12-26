// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListBenchmarkTaskResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the stress testing task was updated.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<ListBenchmarkTaskResponseBodyTasks> tasks;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListBenchmarkTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBenchmarkTaskResponseBody self = new ListBenchmarkTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBenchmarkTaskResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBenchmarkTaskResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBenchmarkTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBenchmarkTaskResponseBody setTasks(java.util.List<ListBenchmarkTaskResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListBenchmarkTaskResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public ListBenchmarkTaskResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListBenchmarkTaskResponseBodyTasks extends TeaModel {
        @NameInMap("AvailableAgent")
        public Long availableAgent;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Message")
        public String message;

        @NameInMap("Region")
        public String region;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListBenchmarkTaskResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListBenchmarkTaskResponseBodyTasks self = new ListBenchmarkTaskResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListBenchmarkTaskResponseBodyTasks setAvailableAgent(Long availableAgent) {
            this.availableAgent = availableAgent;
            return this;
        }
        public Long getAvailableAgent() {
            return this.availableAgent;
        }

        public ListBenchmarkTaskResponseBodyTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListBenchmarkTaskResponseBodyTasks setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListBenchmarkTaskResponseBodyTasks setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListBenchmarkTaskResponseBodyTasks setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListBenchmarkTaskResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListBenchmarkTaskResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListBenchmarkTaskResponseBodyTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListBenchmarkTaskResponseBodyTasks setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
