// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateIdentityProviderSCIMCredentialResponseBody extends TeaModel {
    /**
     * <p>The business result code. If the call fails, handle the error based on the HTTP status code and the message.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The operation result. For the result structure, see the response parameters of this operation. The response of an asynchronous write operation indicates that the request is accepted, but does not guarantee that the background task is complete.</p>
     */
    @NameInMap("data")
    public CreateIdentityProviderSCIMCredentialResponseBodyData data;

    /**
     * <p>The processing status of the current request. This status does not indicate the final result of the background task.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request acceptance or error message. For asynchronous node results, you must verify them by calling the corresponding query operation.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID. You can use this ID to associate the current call with troubleshooting. Keep the ID if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>request-example</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the current request is successful. A value of true indicates that the request is processed successfully. For asynchronous write operations, you must continue to query the task result.</p>
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
         * <p>The URL configured for the external provisioning system. The presence of a URL does not indicate that the external configuration is complete or that AgentCore synchronization is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/scim/v2">https://example.com/scim/v2</a></p>
         */
        @NameInMap("baseUrl")
        public String baseUrl;

        /**
         * <p>The receiving status of AgentIdentity. A value of Enabled indicates that SCIM receiving is enabled. A value of Disabled indicates that SCIM receiving is disabled. This value is not equivalent to the expected value of syncEnabled in AgentCore.</p>
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
         * <p>The credential ID. This parameter is required when you delete a credential. Use the ID returned in the credential list, not the plaintext token.</p>
         * 
         * <strong>example:</strong>
         * <p>credential-example</p>
         */
        @NameInMap("credentialId")
        public String credentialId;

        /**
         * <p>The expiration time returned by AgentIdentity. Only credentials that are enabled and not expired are considered available.</p>
         * 
         * <strong>example:</strong>
         * <p>2027-10-26T00:00:00Z</p>
         */
        @NameInMap("expireTime")
        public String expireTime;

        /**
         * <p>The credential status of AgentIdentity. Only credentials that are enabled and not expired are considered available. This field is not the operationStatus of a SCIM task.</p>
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
         * <p>The actual SAML configuration is read on demand only by calling GetIdentityProvider. SCIM query and preparation operations return the actual receiving status and URL.</p>
         */
        @NameInMap("configuration")
        public CreateIdentityProviderSCIMCredentialResponseBodyDataConfiguration configuration;

        /**
         * <p>The current credential summary, including credentialId, status, createTime, and expireTime. The plaintext token is not included and cannot be repeatedly obtained.</p>
         */
        @NameInMap("credential")
        public CreateIdentityProviderSCIMCredentialResponseBodyDataCredential credential;

        /**
         * <p>The plaintext token is returned only when a new credential is created. If the prepare operation reuses a valid credential, this value is null. The token cannot be retrieved from the list. If the response is lost, query the list first. The token is not automatically reissued and is not written to logs or persistent frontend caches.</p>
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
