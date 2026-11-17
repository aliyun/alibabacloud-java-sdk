// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RevokeKnowledgeBaseRetrievalResponseBody extends TeaModel {
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
    public RevokeKnowledgeBaseRetrievalResponseBodyData data;

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

    public static RevokeKnowledgeBaseRetrievalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeKnowledgeBaseRetrievalResponseBody self = new RevokeKnowledgeBaseRetrievalResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeKnowledgeBaseRetrievalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RevokeKnowledgeBaseRetrievalResponseBody setData(RevokeKnowledgeBaseRetrievalResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RevokeKnowledgeBaseRetrievalResponseBodyData getData() {
        return this.data;
    }

    public RevokeKnowledgeBaseRetrievalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RevokeKnowledgeBaseRetrievalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RevokeKnowledgeBaseRetrievalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RevokeKnowledgeBaseRetrievalResponseBodyData extends TeaModel {
        /**
         * <p>The stable ID of the associated knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The DataWorks user ID that receives the share. When a new user is added, the system verifies that the user is a member of the same tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000000000</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>The type of principal that receives the share. This field is optional in the request. The default and the only response value is USER.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        public static RevokeKnowledgeBaseRetrievalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RevokeKnowledgeBaseRetrievalResponseBodyData self = new RevokeKnowledgeBaseRetrievalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RevokeKnowledgeBaseRetrievalResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public RevokeKnowledgeBaseRetrievalResponseBodyData setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public RevokeKnowledgeBaseRetrievalResponseBodyData setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

}
