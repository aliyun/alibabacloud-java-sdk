// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelinesResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 分页Token
    @NameInMap("nextToken")
    public String nextToken;

    // 流水线
    @NameInMap("pipelines")
    public java.util.List<ListPipelinesResponseBodyPipelines> pipelines;

    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // true 接口调用成功，false 接口调用失败
    @NameInMap("success")
    public Boolean success;

    // 总数
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListPipelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelinesResponseBody self = new ListPipelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelinesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListPipelinesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListPipelinesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPipelinesResponseBody setPipelines(java.util.List<ListPipelinesResponseBodyPipelines> pipelines) {
        this.pipelines = pipelines;
        return this;
    }
    public java.util.List<ListPipelinesResponseBodyPipelines> getPipelines() {
        return this.pipelines;
    }

    public ListPipelinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelinesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPipelinesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPipelinesResponseBodyPipelines extends TeaModel {
        // 创建时间
        @NameInMap("createTime")
        public Long createTime;

        // 创建人阿里云账号id
        @NameInMap("creatorAccountId")
        public String creatorAccountId;

        // 流水线id
        @NameInMap("pipelineId")
        public Long pipelineId;

        // 流水线名称
        @NameInMap("pipelineName")
        public String pipelineName;

        public static ListPipelinesResponseBodyPipelines build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelines self = new ListPipelinesResponseBodyPipelines();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelines setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListPipelinesResponseBodyPipelines setCreatorAccountId(String creatorAccountId) {
            this.creatorAccountId = creatorAccountId;
            return this;
        }
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        public ListPipelinesResponseBodyPipelines setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

        public ListPipelinesResponseBodyPipelines setPipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }
        public String getPipelineName() {
            return this.pipelineName;
        }

    }

}
