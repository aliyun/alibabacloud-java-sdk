// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class AddKnowledgeBaseAdministratorResponseBody extends TeaModel {
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
    public AddKnowledgeBaseAdministratorResponseBodyData data;

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

    public static AddKnowledgeBaseAdministratorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddKnowledgeBaseAdministratorResponseBody self = new AddKnowledgeBaseAdministratorResponseBody();
        return TeaModel.build(map, self);
    }

    public AddKnowledgeBaseAdministratorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddKnowledgeBaseAdministratorResponseBody setData(AddKnowledgeBaseAdministratorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddKnowledgeBaseAdministratorResponseBodyData getData() {
        return this.data;
    }

    public AddKnowledgeBaseAdministratorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddKnowledgeBaseAdministratorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddKnowledgeBaseAdministratorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddKnowledgeBaseAdministratorResponseBodyData extends TeaModel {
        /**
         * <p>The creation time of the record, represented as a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200400000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The display name of the user. This parameter is optional and is not used as an identity basis.</p>
         * 
         * <strong>example:</strong>
         * <p>User A</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

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

        public static AddKnowledgeBaseAdministratorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddKnowledgeBaseAdministratorResponseBodyData self = new AddKnowledgeBaseAdministratorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddKnowledgeBaseAdministratorResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public AddKnowledgeBaseAdministratorResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public AddKnowledgeBaseAdministratorResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public AddKnowledgeBaseAdministratorResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
