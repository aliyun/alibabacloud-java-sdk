// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListSemanticJobRunsResponseBody extends TeaModel {
    /**
     * <p>The paginated run record results. Use the JobRunId to download the results of a specific run, and use the ExecutorJobId to query details, logs, or stop a run.</p>
     */
    @NameInMap("Data")
    public ListSemanticJobRunsResponseBodyData data;

    /**
     * <p>The request ID. Used for locating logs and troubleshooting issues.</p>
     * 
     * <strong>example:</strong>
     * <p>676271D6-53B4-57BE-89FA-72F7AE1418DF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListSemanticJobRunsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSemanticJobRunsResponseBody self = new ListSemanticJobRunsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSemanticJobRunsResponseBody setData(ListSemanticJobRunsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSemanticJobRunsResponseBodyData getData() {
        return this.data;
    }

    public ListSemanticJobRunsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSemanticJobRunsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSemanticJobRunsResponseBodyDataJobRuns extends TeaModel {
        /**
         * <p>The executor job ID. Pass this value to the ExecutorJobId parameter of GetSemanticJobDetail, GetSemanticJobLog, or KillSemanticJob.</p>
         * 
         * <strong>example:</strong>
         * <p>exec-job-demo</p>
         */
        @NameInMap("ExecutorJobId")
        public String executorJobId;

        /**
         * <p>The time when the run record was created. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1700000000000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The name of the job to which this run belongs. This value can be used to re-run the job, query run records, or download results.</p>
         * 
         * <strong>example:</strong>
         * <p>semantic-job-demo</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The semantic job run ID. Pass this value to the JobRunId parameter of DownloadSemanticResults to download the results of this run.</p>
         * 
         * <strong>example:</strong>
         * <p>01H00000000000000000000000</p>
         */
        @NameInMap("JobRunId")
        public String jobRunId;

        /**
         * <p>The ID of the user who submitted this run.</p>
         * 
         * <strong>example:</strong>
         * <p>user-demo</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListSemanticJobRunsResponseBodyDataJobRuns build(java.util.Map<String, ?> map) throws Exception {
            ListSemanticJobRunsResponseBodyDataJobRuns self = new ListSemanticJobRunsResponseBodyDataJobRuns();
            return TeaModel.build(map, self);
        }

        public ListSemanticJobRunsResponseBodyDataJobRuns setExecutorJobId(String executorJobId) {
            this.executorJobId = executorJobId;
            return this;
        }
        public String getExecutorJobId() {
            return this.executorJobId;
        }

        public ListSemanticJobRunsResponseBodyDataJobRuns setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListSemanticJobRunsResponseBodyDataJobRuns setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListSemanticJobRunsResponseBodyDataJobRuns setJobRunId(String jobRunId) {
            this.jobRunId = jobRunId;
            return this;
        }
        public String getJobRunId() {
            return this.jobRunId;
        }

        public ListSemanticJobRunsResponseBodyDataJobRuns setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListSemanticJobRunsResponseBodyData extends TeaModel {
        /**
         * <p>The list of run records.</p>
         */
        @NameInMap("JobRuns")
        public java.util.List<ListSemanticJobRunsResponseBodyDataJobRuns> jobRuns;

        /**
         * <p>The page number returned, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of records per page returned.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of run records that match the current job criteria.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListSemanticJobRunsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSemanticJobRunsResponseBodyData self = new ListSemanticJobRunsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSemanticJobRunsResponseBodyData setJobRuns(java.util.List<ListSemanticJobRunsResponseBodyDataJobRuns> jobRuns) {
            this.jobRuns = jobRuns;
            return this;
        }
        public java.util.List<ListSemanticJobRunsResponseBodyDataJobRuns> getJobRuns() {
            return this.jobRuns;
        }

        public ListSemanticJobRunsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSemanticJobRunsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSemanticJobRunsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
