// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelineRelationsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("pipelineRelations")
    public java.util.List<ListPipelineRelationsResponseBodyPipelineRelations> pipelineRelations;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListPipelineRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRelationsResponseBody self = new ListPipelineRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelineRelationsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListPipelineRelationsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListPipelineRelationsResponseBody setPipelineRelations(java.util.List<ListPipelineRelationsResponseBodyPipelineRelations> pipelineRelations) {
        this.pipelineRelations = pipelineRelations;
        return this;
    }
    public java.util.List<ListPipelineRelationsResponseBodyPipelineRelations> getPipelineRelations() {
        return this.pipelineRelations;
    }

    public ListPipelineRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelineRelationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPipelineRelationsResponseBodyPipelineRelations extends TeaModel {
        @NameInMap("refObjectId")
        public Long refObjectId;

        public static ListPipelineRelationsResponseBodyPipelineRelations build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineRelationsResponseBodyPipelineRelations self = new ListPipelineRelationsResponseBodyPipelineRelations();
            return TeaModel.build(map, self);
        }

        public ListPipelineRelationsResponseBodyPipelineRelations setRefObjectId(Long refObjectId) {
            this.refObjectId = refObjectId;
            return this;
        }
        public Long getRefObjectId() {
            return this.refObjectId;
        }

    }

}
