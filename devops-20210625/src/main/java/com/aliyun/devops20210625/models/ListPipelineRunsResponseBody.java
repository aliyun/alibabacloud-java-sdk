// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelineRunsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("pipelineRuns")
    public java.util.List<ListPipelineRunsResponseBodyPipelineRuns> pipelineRuns;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("totalCount")
    public Long totalCount;

    public static ListPipelineRunsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRunsResponseBody self = new ListPipelineRunsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelineRunsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListPipelineRunsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListPipelineRunsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPipelineRunsResponseBody setPipelineRuns(java.util.List<ListPipelineRunsResponseBodyPipelineRuns> pipelineRuns) {
        this.pipelineRuns = pipelineRuns;
        return this;
    }
    public java.util.List<ListPipelineRunsResponseBodyPipelineRuns> getPipelineRuns() {
        return this.pipelineRuns;
    }

    public ListPipelineRunsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelineRunsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPipelineRunsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPipelineRunsResponseBodyPipelineRuns extends TeaModel {
        @NameInMap("creatorAccountId")
        public String creatorAccountId;

        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("pipelineId")
        public Long pipelineId;

        @NameInMap("pipelineRunId")
        public Long pipelineRunId;

        @NameInMap("startTime")
        public Long startTime;

        @NameInMap("status")
        public String status;

        @NameInMap("triggerMode")
        public Long triggerMode;

        public static ListPipelineRunsResponseBodyPipelineRuns build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineRunsResponseBodyPipelineRuns self = new ListPipelineRunsResponseBodyPipelineRuns();
            return TeaModel.build(map, self);
        }

        public ListPipelineRunsResponseBodyPipelineRuns setCreatorAccountId(String creatorAccountId) {
            this.creatorAccountId = creatorAccountId;
            return this;
        }
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setPipelineRunId(Long pipelineRunId) {
            this.pipelineRunId = pipelineRunId;
            return this;
        }
        public Long getPipelineRunId() {
            return this.pipelineRunId;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setTriggerMode(Long triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public Long getTriggerMode() {
            return this.triggerMode;
        }

    }

}
