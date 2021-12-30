// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelineJobHistorysResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("jobs")
    public java.util.List<ListPipelineJobHistorysResponseBodyJobs> jobs;

    @NameInMap("nextToken")
    public String nextToken;

    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // true 接口调用成功，false 接口调用失败
    @NameInMap("success")
    public Boolean success;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListPipelineJobHistorysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineJobHistorysResponseBody self = new ListPipelineJobHistorysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelineJobHistorysResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListPipelineJobHistorysResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListPipelineJobHistorysResponseBody setJobs(java.util.List<ListPipelineJobHistorysResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListPipelineJobHistorysResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public ListPipelineJobHistorysResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPipelineJobHistorysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelineJobHistorysResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPipelineJobHistorysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPipelineJobHistorysResponseBodyJobs extends TeaModel {
        @NameInMap("executeNumber")
        public Integer executeNumber;

        @NameInMap("identifier")
        public String identifier;

        @NameInMap("jobId")
        public Long jobId;

        @NameInMap("jobName")
        public String jobName;

        @NameInMap("operatorAccountId")
        public String operatorAccountId;

        @NameInMap("pipelineId")
        public Long pipelineId;

        @NameInMap("pipelineRunId")
        public Long pipelineRunId;

        @NameInMap("sources")
        public String sources;

        @NameInMap("status")
        public String status;

        public static ListPipelineJobHistorysResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineJobHistorysResponseBodyJobs self = new ListPipelineJobHistorysResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListPipelineJobHistorysResponseBodyJobs setExecuteNumber(Integer executeNumber) {
            this.executeNumber = executeNumber;
            return this;
        }
        public Integer getExecuteNumber() {
            return this.executeNumber;
        }

        public ListPipelineJobHistorysResponseBodyJobs setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListPipelineJobHistorysResponseBodyJobs setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public ListPipelineJobHistorysResponseBodyJobs setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListPipelineJobHistorysResponseBodyJobs setOperatorAccountId(String operatorAccountId) {
            this.operatorAccountId = operatorAccountId;
            return this;
        }
        public String getOperatorAccountId() {
            return this.operatorAccountId;
        }

        public ListPipelineJobHistorysResponseBodyJobs setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

        public ListPipelineJobHistorysResponseBodyJobs setPipelineRunId(Long pipelineRunId) {
            this.pipelineRunId = pipelineRunId;
            return this;
        }
        public Long getPipelineRunId() {
            return this.pipelineRunId;
        }

        public ListPipelineJobHistorysResponseBodyJobs setSources(String sources) {
            this.sources = sources;
            return this;
        }
        public String getSources() {
            return this.sources;
        }

        public ListPipelineJobHistorysResponseBodyJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
