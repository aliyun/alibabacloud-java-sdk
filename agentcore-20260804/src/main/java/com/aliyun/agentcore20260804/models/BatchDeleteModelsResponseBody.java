// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class BatchDeleteModelsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public BatchDeleteModelsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>request-1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static BatchDeleteModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteModelsResponseBody self = new BatchDeleteModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteModelsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchDeleteModelsResponseBody setData(BatchDeleteModelsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchDeleteModelsResponseBodyData getData() {
        return this.data;
    }

    public BatchDeleteModelsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BatchDeleteModelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchDeleteModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchDeleteModelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchDeleteModelsResponseBodyData extends TeaModel {
        @NameInMap("modelIds")
        public java.util.List<String> modelIds;

        /**
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static BatchDeleteModelsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchDeleteModelsResponseBodyData self = new BatchDeleteModelsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchDeleteModelsResponseBodyData setModelIds(java.util.List<String> modelIds) {
            this.modelIds = modelIds;
            return this;
        }
        public java.util.List<String> getModelIds() {
            return this.modelIds;
        }

        public BatchDeleteModelsResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
