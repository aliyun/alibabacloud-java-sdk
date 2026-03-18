// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetRunningJobsResponseBody extends TeaModel {
    @NameInMap("data")
    public GetRunningJobsResponseBodyData data;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("httpCode")
    public Integer httpCode;

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
        @NameInMap("cuSnapshot")
        public Double cuSnapshot;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("jobOwner")
        public String jobOwner;

        @NameInMap("memorySnapshot")
        public Double memorySnapshot;

        @NameInMap("progress")
        public Double progress;

        @NameInMap("project")
        public String project;

        @NameInMap("quotaNickname")
        public String quotaNickname;

        @NameInMap("runningAtTime")
        public Long runningAtTime;

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
        @NameInMap("pageNumber")
        public Long pageNumber;

        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("runningJobInfoList")
        public java.util.List<GetRunningJobsResponseBodyDataRunningJobInfoList> runningJobInfoList;

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
