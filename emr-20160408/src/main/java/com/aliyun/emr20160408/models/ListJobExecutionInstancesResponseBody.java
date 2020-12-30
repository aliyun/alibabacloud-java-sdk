// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListJobExecutionInstancesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("JobInstances")
    public ListJobExecutionInstancesResponseBodyJobInstances jobInstances;

    public static ListJobExecutionInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobExecutionInstancesResponseBody self = new ListJobExecutionInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobExecutionInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListJobExecutionInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobExecutionInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobExecutionInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobExecutionInstancesResponseBody setJobInstances(ListJobExecutionInstancesResponseBodyJobInstances jobInstances) {
        this.jobInstances = jobInstances;
        return this;
    }
    public ListJobExecutionInstancesResponseBodyJobInstances getJobInstances() {
        return this.jobInstances;
    }

    public static class ListJobExecutionInstancesResponseBodyJobInstancesJobInstance extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("RetryInfo")
        public String retryInfo;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("RunTime")
        public Integer runTime;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("Id")
        public String id;

        @NameInMap("ClusterId")
        public String clusterId;

        public static ListJobExecutionInstancesResponseBodyJobInstancesJobInstance build(java.util.Map<String, ?> map) throws Exception {
            ListJobExecutionInstancesResponseBodyJobInstancesJobInstance self = new ListJobExecutionInstancesResponseBodyJobInstancesJobInstance();
            return TeaModel.build(map, self);
        }

        public ListJobExecutionInstancesResponseBodyJobInstancesJobInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobExecutionInstancesResponseBodyJobInstancesJobInstance setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListJobExecutionInstancesResponseBodyJobInstancesJobInstance setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListJobExecutionInstancesResponseBodyJobInstancesJobInstance setRetryInfo(String retryInfo) {
            this.retryInfo = retryInfo;
            return this;
        }
        public String getRetryInfo() {
            return this.retryInfo;
        }

        public ListJobExecutionInstancesResponseBodyJobInstancesJobInstance setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobExecutionInstancesResponseBodyJobInstancesJobInstance setRunTime(Integer runTime) {
            this.runTime = runTime;
            return this;
        }
        public Integer getRunTime() {
            return this.runTime;
        }

        public ListJobExecutionInstancesResponseBodyJobInstancesJobInstance setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListJobExecutionInstancesResponseBodyJobInstancesJobInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListJobExecutionInstancesResponseBodyJobInstancesJobInstance setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class ListJobExecutionInstancesResponseBodyJobInstances extends TeaModel {
        @NameInMap("JobInstance")
        public java.util.List<ListJobExecutionInstancesResponseBodyJobInstancesJobInstance> jobInstance;

        public static ListJobExecutionInstancesResponseBodyJobInstances build(java.util.Map<String, ?> map) throws Exception {
            ListJobExecutionInstancesResponseBodyJobInstances self = new ListJobExecutionInstancesResponseBodyJobInstances();
            return TeaModel.build(map, self);
        }

        public ListJobExecutionInstancesResponseBodyJobInstances setJobInstance(java.util.List<ListJobExecutionInstancesResponseBodyJobInstancesJobInstance> jobInstance) {
            this.jobInstance = jobInstance;
            return this;
        }
        public java.util.List<ListJobExecutionInstancesResponseBodyJobInstancesJobInstance> getJobInstance() {
            return this.jobInstance;
        }

    }

}
