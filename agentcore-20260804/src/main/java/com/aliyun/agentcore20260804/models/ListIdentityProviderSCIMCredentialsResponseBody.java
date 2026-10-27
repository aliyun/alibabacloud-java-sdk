// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListIdentityProviderSCIMCredentialsResponseBody extends TeaModel {
    /**
     * <p>The business result code. If the request fails, handle the error based on the HTTP status code and the message.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The operation result. For the result structure, see the response fields of this operation. For asynchronous write operations, the response indicates that the request is accepted, but does not guarantee that the background task is completed.</p>
     */
    @NameInMap("data")
    public java.util.List<ListIdentityProviderSCIMCredentialsResponseBodyData> data;

    /**
     * <p>The HTTP status code of the current request. This code indicates the processing status of the request and is not equivalent to the final result of the background task.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Task result message, which indicates that the request is accepted or contains an error message. For task results of asynchronous tasks, check the corresponding query operation.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID, which is used to associate the current call with troubleshooting. Retain this ID if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>request-example</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the current request is successful. A value of true indicates that the request is processed successfully. For asynchronous write operations, you still need to query the task results.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListIdentityProviderSCIMCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIdentityProviderSCIMCredentialsResponseBody self = new ListIdentityProviderSCIMCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIdentityProviderSCIMCredentialsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIdentityProviderSCIMCredentialsResponseBody setData(java.util.List<ListIdentityProviderSCIMCredentialsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListIdentityProviderSCIMCredentialsResponseBodyData> getData() {
        return this.data;
    }

    public ListIdentityProviderSCIMCredentialsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListIdentityProviderSCIMCredentialsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIdentityProviderSCIMCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIdentityProviderSCIMCredentialsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListIdentityProviderSCIMCredentialsResponseBodyData extends TeaModel {
        /**
         * <p>The creation time returned by AgentIdentity.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-26T00:00:00Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The credential ID. This parameter is required and cannot be empty when you delete a credential. Use the ID returned in the credential list, not the plaintext token.</p>
         * 
         * <strong>example:</strong>
         * <p>credential-example</p>
         */
        @NameInMap("credentialId")
        public String credentialId;

        /**
         * <p>The expiration time returned by AgentIdentity. Only credentials with a status of Enabled that have not expired are considered available.</p>
         * 
         * <strong>example:</strong>
         * <p>2027-10-26T00:00:00Z</p>
         */
        @NameInMap("expireTime")
        public String expireTime;

        /**
         * <p>The credential status of AgentIdentity. Only credentials with a status of Enabled that have not expired are considered available. This field is not the operationStatus of a SCIM task.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        public static ListIdentityProviderSCIMCredentialsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIdentityProviderSCIMCredentialsResponseBodyData self = new ListIdentityProviderSCIMCredentialsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIdentityProviderSCIMCredentialsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIdentityProviderSCIMCredentialsResponseBodyData setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public ListIdentityProviderSCIMCredentialsResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListIdentityProviderSCIMCredentialsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
