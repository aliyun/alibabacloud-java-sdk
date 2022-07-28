// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelineGroupPipelinesResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("pipelines")
    public java.util.List<ListPipelineGroupPipelinesResponseBodyPipelines> pipelines;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListPipelineGroupPipelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineGroupPipelinesResponseBody self = new ListPipelineGroupPipelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelineGroupPipelinesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListPipelineGroupPipelinesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListPipelineGroupPipelinesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPipelineGroupPipelinesResponseBody setPipelines(java.util.List<ListPipelineGroupPipelinesResponseBodyPipelines> pipelines) {
        this.pipelines = pipelines;
        return this;
    }
    public java.util.List<ListPipelineGroupPipelinesResponseBodyPipelines> getPipelines() {
        return this.pipelines;
    }

    public ListPipelineGroupPipelinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelineGroupPipelinesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPipelineGroupPipelinesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPipelineGroupPipelinesResponseBodyPipelines extends TeaModel {
        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("pipelineId")
        public Long pipelineId;

        @NameInMap("pipelineName")
        public String pipelineName;

        public static ListPipelineGroupPipelinesResponseBodyPipelines build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineGroupPipelinesResponseBodyPipelines self = new ListPipelineGroupPipelinesResponseBodyPipelines();
            return TeaModel.build(map, self);
        }

        public ListPipelineGroupPipelinesResponseBodyPipelines setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListPipelineGroupPipelinesResponseBodyPipelines setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

        public ListPipelineGroupPipelinesResponseBodyPipelines setPipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }
        public String getPipelineName() {
            return this.pipelineName;
        }

    }

}
