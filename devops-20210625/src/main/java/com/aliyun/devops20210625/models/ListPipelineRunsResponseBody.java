// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelineRunsResponseBody extends TeaModel {
    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // true 接口调用成功，false 接口调用失败
    @NameInMap("success")
    public Boolean success;

    // 总数
    @NameInMap("totalCount")
    public Long totalCount;

    // 下一个分页token，为空时，表示没有下一页
    @NameInMap("nextToken")
    public String nextToken;

    // 流水线运行实例
    @NameInMap("pipelineRuns")
    public java.util.List<ListPipelineRunsResponseBodyPipelineRuns> pipelineRuns;

    public static ListPipelineRunsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRunsResponseBody self = new ListPipelineRunsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelineRunsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelineRunsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListPipelineRunsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
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

    public static class ListPipelineRunsResponseBodyPipelineRuns extends TeaModel {
        // 流水线id
        @NameInMap("pipelineId")
        public Long pipelineId;

        // 开始时间
        @NameInMap("startTime")
        public Long startTime;

        // 运行人阿里云账号id
        @NameInMap("creatorAccountId")
        public String creatorAccountId;

        // 结束时间
        @NameInMap("endTime")
        public Long endTime;

        // 流水线实例id
        @NameInMap("pipelineRunId")
        public Long pipelineRunId;

        // 触发模式
        @NameInMap("triggerMode")
        public Long triggerMode;

        // 运行状态
        @NameInMap("status")
        public String status;

        public static ListPipelineRunsResponseBodyPipelineRuns build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineRunsResponseBodyPipelineRuns self = new ListPipelineRunsResponseBodyPipelineRuns();
            return TeaModel.build(map, self);
        }

        public ListPipelineRunsResponseBodyPipelineRuns setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
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

        public ListPipelineRunsResponseBodyPipelineRuns setPipelineRunId(Long pipelineRunId) {
            this.pipelineRunId = pipelineRunId;
            return this;
        }
        public Long getPipelineRunId() {
            return this.pipelineRunId;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setTriggerMode(Long triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public Long getTriggerMode() {
            return this.triggerMode;
        }

        public ListPipelineRunsResponseBodyPipelineRuns setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
