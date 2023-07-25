// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListServerlessJobsResponseBody extends TeaModel {
    @NameInMap("Jobs")
    public java.util.List<ListServerlessJobsResponseBodyJobs> jobs;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListServerlessJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServerlessJobsResponseBody self = new ListServerlessJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServerlessJobsResponseBody setJobs(java.util.List<ListServerlessJobsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListServerlessJobsResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public ListServerlessJobsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListServerlessJobsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListServerlessJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServerlessJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListServerlessJobsResponseBodyJobs extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("IsArrayJob")
        public Boolean isArrayJob;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Queue")
        public String queue;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("State")
        public String state;

        @NameInMap("SubmitTime")
        public String submitTime;

        @NameInMap("User")
        public String user;

        public static ListServerlessJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListServerlessJobsResponseBodyJobs self = new ListServerlessJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListServerlessJobsResponseBodyJobs setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListServerlessJobsResponseBodyJobs setIsArrayJob(Boolean isArrayJob) {
            this.isArrayJob = isArrayJob;
            return this;
        }
        public Boolean getIsArrayJob() {
            return this.isArrayJob;
        }

        public ListServerlessJobsResponseBodyJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListServerlessJobsResponseBodyJobs setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListServerlessJobsResponseBodyJobs setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ListServerlessJobsResponseBodyJobs setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public ListServerlessJobsResponseBodyJobs setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListServerlessJobsResponseBodyJobs setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListServerlessJobsResponseBodyJobs setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public ListServerlessJobsResponseBodyJobs setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
