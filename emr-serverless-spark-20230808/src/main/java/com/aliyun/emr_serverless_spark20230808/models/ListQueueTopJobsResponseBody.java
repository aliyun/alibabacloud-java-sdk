// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListQueueTopJobsResponseBody extends TeaModel {
    /**
     * <p>The job details.</p>
     */
    @NameInMap("queueTopJobs")
    public ListQueueTopJobsResponseBodyQueueTopJobs queueTopJobs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListQueueTopJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueueTopJobsResponseBody self = new ListQueueTopJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueueTopJobsResponseBody setQueueTopJobs(ListQueueTopJobsResponseBodyQueueTopJobs queueTopJobs) {
        this.queueTopJobs = queueTopJobs;
        return this;
    }
    public ListQueueTopJobsResponseBodyQueueTopJobs getQueueTopJobs() {
        return this.queueTopJobs;
    }

    public ListQueueTopJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListQueueTopJobsResponseBodyQueueTopJobsJobs extends TeaModel {
        /**
         * <p>The number of CPU cores requested by the job.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("cpuCores")
        public String cpuCores;

        /**
         * <p>The number of CUs consumed by the job.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("cu")
        public String cu;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>jr-1234abcd</p>
         */
        @NameInMap("jobId")
        public String jobId;

        /**
         * <p>The job type.</p>
         * 
         * <strong>example:</strong>
         * <p>spark-batch</p>
         */
        @NameInMap("jobType")
        public String jobType;

        /**
         * <p>The amount of memory requested by the job.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("memoryGiB")
        public String memoryGiB;

        public static ListQueueTopJobsResponseBodyQueueTopJobsJobs build(java.util.Map<String, ?> map) throws Exception {
            ListQueueTopJobsResponseBodyQueueTopJobsJobs self = new ListQueueTopJobsResponseBodyQueueTopJobsJobs();
            return TeaModel.build(map, self);
        }

        public ListQueueTopJobsResponseBodyQueueTopJobsJobs setCpuCores(String cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public String getCpuCores() {
            return this.cpuCores;
        }

        public ListQueueTopJobsResponseBodyQueueTopJobsJobs setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public ListQueueTopJobsResponseBodyQueueTopJobsJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListQueueTopJobsResponseBodyQueueTopJobsJobs setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListQueueTopJobsResponseBodyQueueTopJobsJobs setMemoryGiB(String memoryGiB) {
            this.memoryGiB = memoryGiB;
            return this;
        }
        public String getMemoryGiB() {
            return this.memoryGiB;
        }

    }

    public static class ListQueueTopJobsResponseBodyQueueTopJobs extends TeaModel {
        /**
         * <p>The list of jobs.</p>
         */
        @NameInMap("jobs")
        public java.util.List<ListQueueTopJobsResponseBodyQueueTopJobsJobs> jobs;

        /**
         * <p>The maximum number of records returned in a single request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxResults")
        public String maxResults;

        /**
         * <p>The name of the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>dev_queue</p>
         */
        @NameInMap("queueName")
        public String queueName;

        /**
         * <p>The total number of CUs consumed by the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("totalCu")
        public String totalCu;

        /**
         * <p>The total number of jobs in the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("totalJobCount")
        public Integer totalJobCount;

        public static ListQueueTopJobsResponseBodyQueueTopJobs build(java.util.Map<String, ?> map) throws Exception {
            ListQueueTopJobsResponseBodyQueueTopJobs self = new ListQueueTopJobsResponseBodyQueueTopJobs();
            return TeaModel.build(map, self);
        }

        public ListQueueTopJobsResponseBodyQueueTopJobs setJobs(java.util.List<ListQueueTopJobsResponseBodyQueueTopJobsJobs> jobs) {
            this.jobs = jobs;
            return this;
        }
        public java.util.List<ListQueueTopJobsResponseBodyQueueTopJobsJobs> getJobs() {
            return this.jobs;
        }

        public ListQueueTopJobsResponseBodyQueueTopJobs setMaxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public String getMaxResults() {
            return this.maxResults;
        }

        public ListQueueTopJobsResponseBodyQueueTopJobs setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListQueueTopJobsResponseBodyQueueTopJobs setTotalCu(String totalCu) {
            this.totalCu = totalCu;
            return this;
        }
        public String getTotalCu() {
            return this.totalCu;
        }

        public ListQueueTopJobsResponseBodyQueueTopJobs setTotalJobCount(Integer totalJobCount) {
            this.totalJobCount = totalJobCount;
            return this;
        }
        public Integer getTotalJobCount() {
            return this.totalJobCount;
        }

    }

}
