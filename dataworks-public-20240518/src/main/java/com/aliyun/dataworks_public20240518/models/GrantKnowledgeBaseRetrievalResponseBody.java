// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GrantKnowledgeBaseRetrievalResponseBody extends TeaModel {
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
    public GrantKnowledgeBaseRetrievalResponseBodyData data;

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

    public static GrantKnowledgeBaseRetrievalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantKnowledgeBaseRetrievalResponseBody self = new GrantKnowledgeBaseRetrievalResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantKnowledgeBaseRetrievalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GrantKnowledgeBaseRetrievalResponseBody setData(GrantKnowledgeBaseRetrievalResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GrantKnowledgeBaseRetrievalResponseBodyData getData() {
        return this.data;
    }

    public GrantKnowledgeBaseRetrievalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GrantKnowledgeBaseRetrievalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GrantKnowledgeBaseRetrievalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GrantKnowledgeBaseRetrievalResponseBodyData extends TeaModel {
        /**
         * <p>The stable ID of the associated knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The DataWorks user ID of the principal that receives the share. The system verifies that the user belongs to the same tenant when the principal is added.</p>
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

        public static GrantKnowledgeBaseRetrievalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GrantKnowledgeBaseRetrievalResponseBodyData self = new GrantKnowledgeBaseRetrievalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GrantKnowledgeBaseRetrievalResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public GrantKnowledgeBaseRetrievalResponseBodyData setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public GrantKnowledgeBaseRetrievalResponseBodyData setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

}
