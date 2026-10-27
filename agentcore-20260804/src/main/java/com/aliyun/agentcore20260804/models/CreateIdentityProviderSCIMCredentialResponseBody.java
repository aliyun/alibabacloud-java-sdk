// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateIdentityProviderSCIMCredentialResponseBody extends TeaModel {
    /**
     * <p>The business result code. Combine it with the HTTP status and message for handling upon failure.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The operation result. For the result structure, see the response fields of this operation. The response of an asynchronous write operation indicates that the request is accepted, but does not guarantee that the background task is completed.</p>
     */
    @NameInMap("data")
    public CreateIdentityProviderSCIMCredentialResponseBodyData data;

    /**
     * <p>The HTTP status code of the current request. It is not equivalent to the final result of the background task.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Task result message, indicating request acceptance or an error. For asynchronous tasks, check task results by using the corresponding query operation.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID. It is used to associate the current call with troubleshooting. Keep it when a failure occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>request-example</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the current request is successful. A value of true indicates that the request is processed successfully. For asynchronous writes, you still need to continue querying the task results.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateIdentityProviderSCIMCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIdentityProviderSCIMCredentialResponseBody self = new CreateIdentityProviderSCIMCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIdentityProviderSCIMCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateIdentityProviderSCIMCredentialResponseBody setData(CreateIdentityProviderSCIMCredentialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateIdentityProviderSCIMCredentialResponseBodyData getData() {
        return this.data;
    }

    public CreateIdentityProviderSCIMCredentialResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateIdentityProviderSCIMCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateIdentityProviderSCIMCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIdentityProviderSCIMCredentialResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateIdentityProviderSCIMCredentialResponseBodyDataConfiguration extends TeaModel {
        /**
         * <p>The URL configured for the external provisioning system. The presence of an address does not mean that the external configuration is completed or AC synchronization is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/scim/v2">https://example.com/scim/v2</a></p>
         */
        @NameInMap("baseUrl")
        public String baseUrl;

        /**
         * <p>The AgentIdentity reception status. Enabled indicates that SCIM reception is enabled, and Disabled indicates that it is disabled. This is not equivalent to the expected value of syncEnabled in AC.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("status")
        public String status;

        public static CreateIdentityProviderSCIMCredentialResponseBodyDataConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderSCIMCredentialResponseBodyDataConfiguration self = new CreateIdentityProviderSCIMCredentialResponseBodyDataConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderSCIMCredentialResponseBodyDataConfiguration setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public String getBaseUrl() {
            return this.baseUrl;
        }

        public CreateIdentityProviderSCIMCredentialResponseBodyDataConfiguration setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CreateIdentityProviderSCIMCredentialResponseBodyDataCredential extends TeaModel {
        /**
         * <p>The creation time returned by AgentIdentity.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-26T00:00:00Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The credential ID. It must be non-empty when deleting a credential. Use the ID returned in the credential list, not the plaintext token.</p>
         * 
         * <strong>example:</strong>
         * <p>credential-example</p>
         */
        @NameInMap("credentialId")
        public String credentialId;

        /**
         * <p>The expiration time returned by AgentIdentity. Only credentials that are Enabled and have not expired are considered available.</p>
         * 
         * <strong>example:</strong>
         * <p>2027-10-26T00:00:00Z</p>
         */
        @NameInMap("expireTime")
        public String expireTime;

        /**
         * <p>The AgentIdentity credential status. Only credentials that are Enabled and have not expired are considered available. This field is not the operationStatus of a SCIM task.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("status")
        public String status;

        public static CreateIdentityProviderSCIMCredentialResponseBodyDataCredential build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderSCIMCredentialResponseBodyDataCredential self = new CreateIdentityProviderSCIMCredentialResponseBodyDataCredential();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderSCIMCredentialResponseBodyDataCredential setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateIdentityProviderSCIMCredentialResponseBodyDataCredential setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public CreateIdentityProviderSCIMCredentialResponseBodyDataCredential setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public CreateIdentityProviderSCIMCredentialResponseBodyDataCredential setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CreateIdentityProviderSCIMCredentialResponseBodyData extends TeaModel {
        /**
         * <p>The AgentIdentity reception configuration. The actual SAML configuration is read back on demand only in GetIdentityProvider. SCIM queries and preparations return the actual reception status and URL.</p>
         */
        @NameInMap("configuration")
        public CreateIdentityProviderSCIMCredentialResponseBodyDataConfiguration configuration;

        /**
         * <p>The current credential summary, including credentialId, status, createTime, and expireTime. It does not include the token, which cannot be retrieved repeatedly.</p>
         */
        @NameInMap("credential")
        public CreateIdentityProviderSCIMCredentialResponseBodyDataCredential credential;

        /**
         * <p>The token. The plaintext is returned only when a new credential is created. It is null when prepare reuses a valid credential. It cannot be retrieved again from the list. If the response is lost, query the list first instead of automatically re-issuing it. Do not write it to logs or frontend persistent cache.</p>
         * 
         * <strong>example:</strong>
         * <p>example-scim-token</p>
         */
        @NameInMap("token")
        public String token;

        public static CreateIdentityProviderSCIMCredentialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderSCIMCredentialResponseBodyData self = new CreateIdentityProviderSCIMCredentialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderSCIMCredentialResponseBodyData setConfiguration(CreateIdentityProviderSCIMCredentialResponseBodyDataConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public CreateIdentityProviderSCIMCredentialResponseBodyDataConfiguration getConfiguration() {
            return this.configuration;
        }

        public CreateIdentityProviderSCIMCredentialResponseBodyData setCredential(CreateIdentityProviderSCIMCredentialResponseBodyDataCredential credential) {
            this.credential = credential;
            return this;
        }
        public CreateIdentityProviderSCIMCredentialResponseBodyDataCredential getCredential() {
            return this.credential;
        }

        public CreateIdentityProviderSCIMCredentialResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
