// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelineJobsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("jobs")
    public java.util.List<ListPipelineJobsResponseBodyJobs> jobs;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListPipelineJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineJobsResponseBody self = new ListPipelineJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelineJobsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListPipelineJobsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListPipelineJobsResponseBody setJobs(java.util.List<ListPipelineJobsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListPipelineJobsResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public ListPipelineJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelineJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPipelineJobsResponseBodyJobs extends TeaModel {
        @NameInMap("identifier")
        public String identifier;

        @NameInMap("jobName")
        public String jobName;

        @NameInMap("lastJobId")
        public Long lastJobId;

        @NameInMap("lastJobParams")
        public String lastJobParams;

        public static ListPipelineJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineJobsResponseBodyJobs self = new ListPipelineJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListPipelineJobsResponseBodyJobs setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListPipelineJobsResponseBodyJobs setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListPipelineJobsResponseBodyJobs setLastJobId(Long lastJobId) {
            this.lastJobId = lastJobId;
            return this;
        }
        public Long getLastJobId() {
            return this.lastJobId;
        }

        public ListPipelineJobsResponseBodyJobs setLastJobParams(String lastJobParams) {
            this.lastJobParams = lastJobParams;
            return this;
        }
        public String getLastJobParams() {
            return this.lastJobParams;
        }

    }

}
