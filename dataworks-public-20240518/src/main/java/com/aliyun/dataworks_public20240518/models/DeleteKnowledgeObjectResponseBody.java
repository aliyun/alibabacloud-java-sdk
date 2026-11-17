// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteKnowledgeObjectResponseBody extends TeaModel {
    /**
     * <p>The business error code, which is used to determine the error type when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data returned when the request is successful.</p>
     */
    @NameInMap("Data")
    public DeleteKnowledgeObjectResponseBodyData data;

    /**
     * <p>The security error message returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The request parameters are invalid</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request, which can be used to troubleshoot issues.</p>
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

    public static DeleteKnowledgeObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteKnowledgeObjectResponseBody self = new DeleteKnowledgeObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteKnowledgeObjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteKnowledgeObjectResponseBody setData(DeleteKnowledgeObjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteKnowledgeObjectResponseBodyData getData() {
        return this.data;
    }

    public DeleteKnowledgeObjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteKnowledgeObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteKnowledgeObjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteKnowledgeObjectResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the knowledge base to which the object belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The ID of the knowledge object. For semantic models, use the model ID from the semantic layer. For documents, use the stable ID from the local document table. Callers must treat the ID as opaque and must not use a retrieval ID in its place.</p>
         * 
         * <strong>example:</strong>
         * <p>obj-document-001</p>
         */
        @NameInMap("KnowledgeObjectId")
        public String knowledgeObjectId;

        public static DeleteKnowledgeObjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteKnowledgeObjectResponseBodyData self = new DeleteKnowledgeObjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteKnowledgeObjectResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public DeleteKnowledgeObjectResponseBodyData setKnowledgeObjectId(String knowledgeObjectId) {
            this.knowledgeObjectId = knowledgeObjectId;
            return this;
        }
        public String getKnowledgeObjectId() {
            return this.knowledgeObjectId;
        }

    }

}
