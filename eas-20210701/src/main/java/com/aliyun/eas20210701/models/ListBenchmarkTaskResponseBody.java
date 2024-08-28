// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListBenchmarkTaskResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The stress testing tasks.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<ListBenchmarkTaskResponseBodyTasks> tasks;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
        /**
         * <p>The number of instances that are available for stress testing.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AvailableAgent")
        public Long availableAgent;

        /**
         * <p>The time when the stress testing task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-04T02:43:15Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Benchmark task [benchmark-larec-test-1076] is Running</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The region ID of the stress testing task.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The name of the service on which you want to perform a stress testing.</p>
         * 
         * <strong>example:</strong>
         * <p>test_quota</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The state of the stress testing task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Creating</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Starting</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>DeleteFailed</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Running</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Stopping</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Error</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Updating</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Deleting</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>CreateFailed</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the stress testing task.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-b-gv4y86uvgt****i</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the stress testing task.</p>
         * 
         * <strong>example:</strong>
         * <p>benchmark-larec-test-1076</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The time when the stress testing task was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-24T03:11:30Z</p>
         */
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
