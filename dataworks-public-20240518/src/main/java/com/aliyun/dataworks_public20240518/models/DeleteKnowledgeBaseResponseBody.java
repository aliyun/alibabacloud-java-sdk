// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteKnowledgeBaseResponseBody extends TeaModel {
    /**
     * <p>The business error code, which is used to determine the error type when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data returned upon success.</p>
     */
    @NameInMap("Data")
    public DeleteKnowledgeBaseResponseBodyData data;

    /**
     * <p>The security error message returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The request parameters are invalid</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, which can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteKnowledgeBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteKnowledgeBaseResponseBody self = new DeleteKnowledgeBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteKnowledgeBaseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteKnowledgeBaseResponseBody setData(DeleteKnowledgeBaseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteKnowledgeBaseResponseBodyData getData() {
        return this.data;
    }

    public DeleteKnowledgeBaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteKnowledgeBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteKnowledgeBaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteKnowledgeBaseResponseBodyData extends TeaModel {
        /**
         * <p>The associated knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The status. The value is fixed to DELETED upon success.</p>
         * 
         * <strong>example:</strong>
         * <p>DELETED</p>
         */
        @NameInMap("Status")
        public String status;

        public static DeleteKnowledgeBaseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteKnowledgeBaseResponseBodyData self = new DeleteKnowledgeBaseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteKnowledgeBaseResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public DeleteKnowledgeBaseResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
