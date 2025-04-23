// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListServerlessJobsResponseBody extends TeaModel {
    /**
     * <p>The list of serverless jobs.</p>
     */
    @NameInMap("Jobs")
    public java.util.List<ListServerlessJobsResponseBodyJobs> jobs;

    /**
     * <p>The page number returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The time at which the serverless job ended.</p>
         * 
         * <strong>example:</strong>
         * <p>1682128871</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Indicates whether the job is an array job. Valid values:</p>
         * <ul>
         * <li>True: yes</li>
         * <li>False: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("IsArrayJob")
        public Boolean isArrayJob;

        /**
         * <p>The ID of the serverless job or the subtask (array job).</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The name of the serverless job.</p>
         * 
         * <strong>example:</strong>
         * <p>testjob</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The scheduling priority of the serverless job. Valid values are 0 to 999. A greater value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The name of the queue in which the serverless job is run.</p>
         * 
         * <strong>example:</strong>
         * <p>comp</p>
         */
        @NameInMap("Queue")
        public String queue;

        /**
         * <p>The time at which the serverless job started.</p>
         * 
         * <strong>example:</strong>
         * <p>1647427667</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the serverless job. Valid values:</p>
         * <ul>
         * <li>Pending</li>
         * <li>Initing</li>
         * <li>Running</li>
         * <li>Succeeded</li>
         * <li>Canceled</li>
         * <li>Failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The time at which the serverless job is submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>1647423718</p>
         */
        @NameInMap("SubmitTime")
        public String submitTime;

        /**
         * <p>The username that is used to run the serverless job.</p>
         * 
         * <strong>example:</strong>
         * <p>testuser</p>
         */
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
