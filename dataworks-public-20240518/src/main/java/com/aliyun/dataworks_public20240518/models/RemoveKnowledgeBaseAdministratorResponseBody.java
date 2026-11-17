// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RemoveKnowledgeBaseAdministratorResponseBody extends TeaModel {
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
    public RemoveKnowledgeBaseAdministratorResponseBodyData data;

    /**
     * <p>The error message returned when the request fails.</p>
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

    public static RemoveKnowledgeBaseAdministratorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveKnowledgeBaseAdministratorResponseBody self = new RemoveKnowledgeBaseAdministratorResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveKnowledgeBaseAdministratorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemoveKnowledgeBaseAdministratorResponseBody setData(RemoveKnowledgeBaseAdministratorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RemoveKnowledgeBaseAdministratorResponseBodyData getData() {
        return this.data;
    }

    public RemoveKnowledgeBaseAdministratorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveKnowledgeBaseAdministratorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveKnowledgeBaseAdministratorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RemoveKnowledgeBaseAdministratorResponseBodyData extends TeaModel {
        /**
         * <p>The stable ID of the associated knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The DataWorks user ID of the administrator.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000000000</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static RemoveKnowledgeBaseAdministratorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RemoveKnowledgeBaseAdministratorResponseBodyData self = new RemoveKnowledgeBaseAdministratorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RemoveKnowledgeBaseAdministratorResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public RemoveKnowledgeBaseAdministratorResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
