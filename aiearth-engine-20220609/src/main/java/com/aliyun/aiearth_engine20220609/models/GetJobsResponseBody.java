// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class GetJobsResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<GetJobsResponseBodyList> list;

    @NameInMap("RequestId")
    public String requestId;

    public static GetJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobsResponseBody self = new GetJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobsResponseBody setList(java.util.List<GetJobsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<GetJobsResponseBodyList> getList() {
        return this.list;
    }

    public GetJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetJobsResponseBodyList extends TeaModel {
        @NameInMap("App")
        public String app;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("JobOutDataId")
        public String jobOutDataId;

        @NameInMap("JobType")
        public Integer jobType;

        @NameInMap("OutDataId")
        public Long outDataId;

        @NameInMap("OutDataType")
        public Integer outDataType;

        @NameInMap("OutDateType")
        public Integer outDateType;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SubmitDate")
        public Long submitDate;

        public static GetJobsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            GetJobsResponseBodyList self = new GetJobsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public GetJobsResponseBodyList setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public GetJobsResponseBodyList setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public GetJobsResponseBodyList setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetJobsResponseBodyList setJobOutDataId(String jobOutDataId) {
            this.jobOutDataId = jobOutDataId;
            return this;
        }
        public String getJobOutDataId() {
            return this.jobOutDataId;
        }

        public GetJobsResponseBodyList setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
        }

        public GetJobsResponseBodyList setOutDataId(Long outDataId) {
            this.outDataId = outDataId;
            return this;
        }
        public Long getOutDataId() {
            return this.outDataId;
        }

        public GetJobsResponseBodyList setOutDataType(Integer outDataType) {
            this.outDataType = outDataType;
            return this;
        }
        public Integer getOutDataType() {
            return this.outDataType;
        }

        public GetJobsResponseBodyList setOutDateType(Integer outDateType) {
            this.outDateType = outDateType;
            return this;
        }
        public Integer getOutDateType() {
            return this.outDateType;
        }

        public GetJobsResponseBodyList setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetJobsResponseBodyList setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetJobsResponseBodyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetJobsResponseBodyList setSubmitDate(Long submitDate) {
            this.submitDate = submitDate;
            return this;
        }
        public Long getSubmitDate() {
            return this.submitDate;
        }

    }

}
