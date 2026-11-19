// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class PrepareIdentityProviderSCIMResponseBody extends TeaModel {
    /**
     * <p>The business code. If the request fails, troubleshoot the issue based on the HTTP status code and the message.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The operation result. For the result structure, see the response parameters of this operation. For asynchronous write operations, the response indicates that the request is accepted and does not guarantee that the background task is completed.</p>
     */
    @NameInMap("data")
    public PrepareIdentityProviderSCIMResponseBodyData data;

    /**
     * <p>The HTTP status code of the request. This code indicates the processing status of the current request and does not represent the final result of the background task.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned when the request is accepted or a fault occurs. Verify the asynchronous node result by calling the corresponding query operation.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID. Retain this ID for troubleshooting if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>request-example</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. A value of true indicates that the request was successful. For asynchronous write operations, you must continue to query the task results.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static PrepareIdentityProviderSCIMResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PrepareIdentityProviderSCIMResponseBody self = new PrepareIdentityProviderSCIMResponseBody();
        return TeaModel.build(map, self);
    }

    public PrepareIdentityProviderSCIMResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PrepareIdentityProviderSCIMResponseBody setData(PrepareIdentityProviderSCIMResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PrepareIdentityProviderSCIMResponseBodyData getData() {
        return this.data;
    }

    public PrepareIdentityProviderSCIMResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PrepareIdentityProviderSCIMResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PrepareIdentityProviderSCIMResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PrepareIdentityProviderSCIMResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PrepareIdentityProviderSCIMResponseBodyDataConfiguration extends TeaModel {
        /**
         * <p>The URL configured for the external provisioning system. The presence of a URL does not indicate that the external configuration is completed or that AgentCore synchronization is enabled.</p>
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

        public static PrepareIdentityProviderSCIMResponseBodyDataConfiguration build(java.util.Map<String, ?> map) throws Exception {
            PrepareIdentityProviderSCIMResponseBodyDataConfiguration self = new PrepareIdentityProviderSCIMResponseBodyDataConfiguration();
            return TeaModel.build(map, self);
        }

        public PrepareIdentityProviderSCIMResponseBodyDataConfiguration setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public String getBaseUrl() {
            return this.baseUrl;
        }

        public PrepareIdentityProviderSCIMResponseBodyDataConfiguration setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class PrepareIdentityProviderSCIMResponseBodyDataCredential extends TeaModel {
        /**
         * <p>The creation time returned by AgentIdentity.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-26T00:00:00Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The credential ID. This parameter is required and cannot be empty when you delete a credential. Use the ID returned in the credential list, not the plaintext of the token.</p>
         * 
         * <strong>example:</strong>
         * <p>credential-example</p>
         */
        @NameInMap("credentialId")
        public String credentialId;

        /**
         * <p>The expiration time returned by AgentIdentity. Only credentials with the status of Enabled that have not expired are considered available.</p>
         * 
         * <strong>example:</strong>
         * <p>2027-10-26T00:00:00Z</p>
         */
        @NameInMap("expireTime")
        public String expireTime;

        /**
         * <p>The credential status of AgentIdentity. Only credentials with the status of Enabled that have not expired are considered available. This field is not the operationStatus of the SCIM task.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("status")
        public String status;

        public static PrepareIdentityProviderSCIMResponseBodyDataCredential build(java.util.Map<String, ?> map) throws Exception {
            PrepareIdentityProviderSCIMResponseBodyDataCredential self = new PrepareIdentityProviderSCIMResponseBodyDataCredential();
            return TeaModel.build(map, self);
        }

        public PrepareIdentityProviderSCIMResponseBodyDataCredential setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PrepareIdentityProviderSCIMResponseBodyDataCredential setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public PrepareIdentityProviderSCIMResponseBodyDataCredential setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public PrepareIdentityProviderSCIMResponseBodyDataCredential setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class PrepareIdentityProviderSCIMResponseBodyData extends TeaModel {
        /**
         * <p>The AgentIdentity receiving configuration. The actual SAML configuration is read on demand only by calling GetIdentityProvider. SCIM query and preparation operations return the actual receiving status and URL.</p>
         */
        @NameInMap("configuration")
        public PrepareIdentityProviderSCIMResponseBodyDataConfiguration configuration;

        /**
         * <p>The summary of the current credential, including credentialId, status, createTime, and expireTime. It does not include the token.</p>
         */
        @NameInMap("credential")
        public PrepareIdentityProviderSCIMResponseBodyDataCredential credential;

        /**
         * <p>The plaintext of the newly issued SCIM token, which is returned only in the current response. If an existing valid credential is reused, an empty string (&quot;&quot;) is returned. In this case, use the saved token.</p>
         * 
         * <strong>example:</strong>
         * <p>example-scim-token</p>
         */
        @NameInMap("token")
        public String token;

        public static PrepareIdentityProviderSCIMResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PrepareIdentityProviderSCIMResponseBodyData self = new PrepareIdentityProviderSCIMResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PrepareIdentityProviderSCIMResponseBodyData setConfiguration(PrepareIdentityProviderSCIMResponseBodyDataConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public PrepareIdentityProviderSCIMResponseBodyDataConfiguration getConfiguration() {
            return this.configuration;
        }

        public PrepareIdentityProviderSCIMResponseBodyData setCredential(PrepareIdentityProviderSCIMResponseBodyDataCredential credential) {
            this.credential = credential;
            return this;
        }
        public PrepareIdentityProviderSCIMResponseBodyDataCredential getCredential() {
            return this.credential;
        }

        public PrepareIdentityProviderSCIMResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
