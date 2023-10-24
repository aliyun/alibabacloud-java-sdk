// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetRunningJobsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetRunningJobsResponseBodyData data;

    /**
     * <p>*   If the value of success was false, an error code was returned.</p>
     * <p>*   If the value of success was true, a null value was returned.</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>Indicates whether the request was successful. If this parameter was not empty and the value of this parameter was not 200, the request failed.</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetRunningJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRunningJobsResponseBody self = new GetRunningJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRunningJobsResponseBody setData(GetRunningJobsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRunningJobsResponseBodyData getData() {
        return this.data;
    }

    public GetRunningJobsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetRunningJobsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetRunningJobsResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetRunningJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRunningJobsResponseBodyDataRunningJobInfoList extends TeaModel {
        /**
         * <p>The compute unit (CU) snapshot proportion of the job.</p>
         */
        @NameInMap("cuSnapshot")
        public Double cuSnapshot;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The account that submits the job.</p>
         */
        @NameInMap("jobOwner")
        public String jobOwner;

        /**
         * <p>The memory snapshot proportion of the job.</p>
         */
        @NameInMap("memorySnapshot")
        public Double memorySnapshot;

        /**
         * <p>The progress of the job.</p>
         */
        @NameInMap("progress")
        public Double progress;

        /**
         * <p>The name of the MaxCompute project.</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The nickname of the quota that is used by the job.</p>
         */
        @NameInMap("quotaNickname")
        public String quotaNickname;

        /**
         * <p>The time when the job starts to run.</p>
         */
        @NameInMap("runningAtTime")
        public Long runningAtTime;

        /**
         * <p>The time when the job is submitted.</p>
         */
        @NameInMap("submittedAtTime")
        public Long submittedAtTime;

        public static GetRunningJobsResponseBodyDataRunningJobInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetRunningJobsResponseBodyDataRunningJobInfoList self = new GetRunningJobsResponseBodyDataRunningJobInfoList();
            return TeaModel.build(map, self);
        }

        public GetRunningJobsResponseBodyDataRunningJobInfoList setCuSnapshot(Double cuSnapshot) {
            this.cuSnapshot = cuSnapshot;
            return this;
        }
        public Double getCuSnapshot() {
            return this.cuSnapshot;
        }

        public GetRunningJobsResponseBodyDataRunningJobInfoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetRunningJobsResponseBodyDataRunningJobInfoList setJobOwner(String jobOwner) {
            this.jobOwner = jobOwner;
            return this;
        }
        public String getJobOwner() {
            return this.jobOwner;
        }

        public GetRunningJobsResponseBodyDataRunningJobInfoList setMemorySnapshot(Double memorySnapshot) {
            this.memorySnapshot = memorySnapshot;
            return this;
        }
        public Double getMemorySnapshot() {
            return this.memorySnapshot;
        }

        public GetRunningJobsResponseBodyDataRunningJobInfoList setProgress(Double progress) {
            this.progress = progress;
            return this;
        }
        public Double getProgress() {
            return this.progress;
        }

        public GetRunningJobsResponseBodyDataRunningJobInfoList setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public GetRunningJobsResponseBodyDataRunningJobInfoList setQuotaNickname(String quotaNickname) {
            this.quotaNickname = quotaNickname;
            return this;
        }
        public String getQuotaNickname() {
            return this.quotaNickname;
        }

        public GetRunningJobsResponseBodyDataRunningJobInfoList setRunningAtTime(Long runningAtTime) {
            this.runningAtTime = runningAtTime;
            return this;
        }
        public Long getRunningAtTime() {
            return this.runningAtTime;
        }

        public GetRunningJobsResponseBodyDataRunningJobInfoList setSubmittedAtTime(Long submittedAtTime) {
            this.submittedAtTime = submittedAtTime;
            return this;
        }
        public Long getSubmittedAtTime() {
            return this.submittedAtTime;
        }

    }

    public static class GetRunningJobsResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>The list of jobs in the running state.</p>
         */
        @NameInMap("runningJobInfoList")
        public java.util.List<GetRunningJobsResponseBodyDataRunningJobInfoList> runningJobInfoList;

        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static GetRunningJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRunningJobsResponseBodyData self = new GetRunningJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRunningJobsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public GetRunningJobsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetRunningJobsResponseBodyData setRunningJobInfoList(java.util.List<GetRunningJobsResponseBodyDataRunningJobInfoList> runningJobInfoList) {
            this.runningJobInfoList = runningJobInfoList;
            return this;
        }
        public java.util.List<GetRunningJobsResponseBodyDataRunningJobInfoList> getRunningJobInfoList() {
            return this.runningJobInfoList;
        }

        public GetRunningJobsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
