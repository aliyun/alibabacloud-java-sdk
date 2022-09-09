// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetProjectJobSummaryResponseBody extends TeaModel {
    @NameInMap("jobSummary")
    public GetProjectJobSummaryResponseBodyJobSummary jobSummary;

    @NameInMap("requestId")
    public String requestId;

    public static GetProjectJobSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectJobSummaryResponseBody self = new GetProjectJobSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectJobSummaryResponseBody setJobSummary(GetProjectJobSummaryResponseBodyJobSummary jobSummary) {
        this.jobSummary = jobSummary;
        return this;
    }
    public GetProjectJobSummaryResponseBodyJobSummary getJobSummary() {
        return this.jobSummary;
    }

    public GetProjectJobSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProjectJobSummaryResponseBodyJobSummaryDetail extends TeaModel {
        @NameInMap("failCnt")
        public Long failCnt;

        @NameInMap("runningCnt")
        public Long runningCnt;

        @NameInMap("successCnt")
        public Long successCnt;

        @NameInMap("taskId")
        public String taskId;

        @NameInMap("total")
        public Long total;

        public static GetProjectJobSummaryResponseBodyJobSummaryDetail build(java.util.Map<String, ?> map) throws Exception {
            GetProjectJobSummaryResponseBodyJobSummaryDetail self = new GetProjectJobSummaryResponseBodyJobSummaryDetail();
            return TeaModel.build(map, self);
        }

        public GetProjectJobSummaryResponseBodyJobSummaryDetail setFailCnt(Long failCnt) {
            this.failCnt = failCnt;
            return this;
        }
        public Long getFailCnt() {
            return this.failCnt;
        }

        public GetProjectJobSummaryResponseBodyJobSummaryDetail setRunningCnt(Long runningCnt) {
            this.runningCnt = runningCnt;
            return this;
        }
        public Long getRunningCnt() {
            return this.runningCnt;
        }

        public GetProjectJobSummaryResponseBodyJobSummaryDetail setSuccessCnt(Long successCnt) {
            this.successCnt = successCnt;
            return this;
        }
        public Long getSuccessCnt() {
            return this.successCnt;
        }

        public GetProjectJobSummaryResponseBodyJobSummaryDetail setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetProjectJobSummaryResponseBodyJobSummaryDetail setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetProjectJobSummaryResponseBodyJobSummary extends TeaModel {
        @NameInMap("detail")
        public java.util.List<GetProjectJobSummaryResponseBodyJobSummaryDetail> detail;

        @NameInMap("failCnt")
        public Long failCnt;

        @NameInMap("runningCnt")
        public Long runningCnt;

        @NameInMap("successCnt")
        public Long successCnt;

        @NameInMap("total")
        public Long total;

        public static GetProjectJobSummaryResponseBodyJobSummary build(java.util.Map<String, ?> map) throws Exception {
            GetProjectJobSummaryResponseBodyJobSummary self = new GetProjectJobSummaryResponseBodyJobSummary();
            return TeaModel.build(map, self);
        }

        public GetProjectJobSummaryResponseBodyJobSummary setDetail(java.util.List<GetProjectJobSummaryResponseBodyJobSummaryDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<GetProjectJobSummaryResponseBodyJobSummaryDetail> getDetail() {
            return this.detail;
        }

        public GetProjectJobSummaryResponseBodyJobSummary setFailCnt(Long failCnt) {
            this.failCnt = failCnt;
            return this;
        }
        public Long getFailCnt() {
            return this.failCnt;
        }

        public GetProjectJobSummaryResponseBodyJobSummary setRunningCnt(Long runningCnt) {
            this.runningCnt = runningCnt;
            return this;
        }
        public Long getRunningCnt() {
            return this.runningCnt;
        }

        public GetProjectJobSummaryResponseBodyJobSummary setSuccessCnt(Long successCnt) {
            this.successCnt = successCnt;
            return this;
        }
        public Long getSuccessCnt() {
            return this.successCnt;
        }

        public GetProjectJobSummaryResponseBodyJobSummary setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
