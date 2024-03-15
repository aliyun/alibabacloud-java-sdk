// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20230701.models;

import com.aliyun.tea.*;

public class ListExecutorsResponseBody extends TeaModel {
    @NameInMap("Executors")
    public java.util.List<ListExecutorsResponseBodyExecutors> executors;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TotalCount")
    public String totalCount;

    public static ListExecutorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExecutorsResponseBody self = new ListExecutorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExecutorsResponseBody setExecutors(java.util.List<ListExecutorsResponseBodyExecutors> executors) {
        this.executors = executors;
        return this;
    }
    public java.util.List<ListExecutorsResponseBodyExecutors> getExecutors() {
        return this.executors;
    }

    public ListExecutorsResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListExecutorsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListExecutorsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListExecutorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExecutorsResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ListExecutorsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListExecutorsResponseBodyExecutors extends TeaModel {
        @NameInMap("ArrayIndex")
        public Integer arrayIndex;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ExecutorId")
        public String executorId;

        @NameInMap("HostName")
        public java.util.List<String> hostName;

        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusReason")
        public String statusReason;

        @NameInMap("TaskName")
        public String taskName;

        public static ListExecutorsResponseBodyExecutors build(java.util.Map<String, ?> map) throws Exception {
            ListExecutorsResponseBodyExecutors self = new ListExecutorsResponseBodyExecutors();
            return TeaModel.build(map, self);
        }

        public ListExecutorsResponseBodyExecutors setArrayIndex(Integer arrayIndex) {
            this.arrayIndex = arrayIndex;
            return this;
        }
        public Integer getArrayIndex() {
            return this.arrayIndex;
        }

        public ListExecutorsResponseBodyExecutors setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListExecutorsResponseBodyExecutors setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListExecutorsResponseBodyExecutors setExecutorId(String executorId) {
            this.executorId = executorId;
            return this;
        }
        public String getExecutorId() {
            return this.executorId;
        }

        public ListExecutorsResponseBodyExecutors setHostName(java.util.List<String> hostName) {
            this.hostName = hostName;
            return this;
        }
        public java.util.List<String> getHostName() {
            return this.hostName;
        }

        public ListExecutorsResponseBodyExecutors setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

        public ListExecutorsResponseBodyExecutors setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListExecutorsResponseBodyExecutors setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListExecutorsResponseBodyExecutors setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListExecutorsResponseBodyExecutors setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListExecutorsResponseBodyExecutors setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
