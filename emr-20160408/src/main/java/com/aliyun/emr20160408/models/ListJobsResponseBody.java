// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListJobsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Jobs")
    public ListJobsResponseBodyJobs jobs;

    public static ListJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobsResponseBody self = new ListJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListJobsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobsResponseBody setJobs(ListJobsResponseBodyJobs jobs) {
        this.jobs = jobs;
        return this;
    }
    public ListJobsResponseBodyJobs getJobs() {
        return this.jobs;
    }

    public static class ListJobsResponseBodyJobsJobInfo extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("FailAct")
        public String failAct;

        @NameInMap("RetryInterval")
        public Integer retryInterval;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("RunParameter")
        public String runParameter;

        @NameInMap("MaxRetry")
        public Integer maxRetry;

        public static ListJobsResponseBodyJobsJobInfo build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobsJobInfo self = new ListJobsResponseBodyJobsJobInfo();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobsJobInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListJobsResponseBodyJobsJobInfo setFailAct(String failAct) {
            this.failAct = failAct;
            return this;
        }
        public String getFailAct() {
            return this.failAct;
        }

        public ListJobsResponseBodyJobsJobInfo setRetryInterval(Integer retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }
        public Integer getRetryInterval() {
            return this.retryInterval;
        }

        public ListJobsResponseBodyJobsJobInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListJobsResponseBodyJobsJobInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListJobsResponseBodyJobsJobInfo setRunParameter(String runParameter) {
            this.runParameter = runParameter;
            return this;
        }
        public String getRunParameter() {
            return this.runParameter;
        }

        public ListJobsResponseBodyJobsJobInfo setMaxRetry(Integer maxRetry) {
            this.maxRetry = maxRetry;
            return this;
        }
        public Integer getMaxRetry() {
            return this.maxRetry;
        }

    }

    public static class ListJobsResponseBodyJobs extends TeaModel {
        @NameInMap("JobInfo")
        public java.util.List<ListJobsResponseBodyJobsJobInfo> jobInfo;

        public static ListJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListJobsResponseBodyJobs self = new ListJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListJobsResponseBodyJobs setJobInfo(java.util.List<ListJobsResponseBodyJobsJobInfo> jobInfo) {
            this.jobInfo = jobInfo;
            return this;
        }
        public java.util.List<ListJobsResponseBodyJobsJobInfo> getJobInfo() {
            return this.jobInfo;
        }

    }

}
