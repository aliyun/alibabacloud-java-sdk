// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class PrepareIdentityProviderSCIMResponseBody extends TeaModel {
    /**
     * <p>The business result code. If the request fails, handle the error based on the HTTP status code and the message.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The operation result. For the result structure, see the response fields of this API. For asynchronous write APIs, the response indicates that the request is accepted, but does not guarantee that the background task is completed.</p>
     */
    @NameInMap("data")
    public PrepareIdentityProviderSCIMResponseBodyData data;

    /**
     * <p>The processing status of the current request. This status is not equivalent to the final result of the background task.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request acceptance or error message. For asynchronous tasks, you must check the task result by using the corresponding query API.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID. It is used to associate the current call with troubleshooting. Retain this ID if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>request-example</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the current request is processed successfully. A value of true indicates success. For asynchronous write operations, you must continue to query the task result.</p>
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
         * <p>The URL configured for the external provisioning system. The presence of a URL does not indicate that the external configuration is completed or that access control synchronization is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/scim/v2">https://example.com/scim/v2</a></p>
         */
        @NameInMap("baseUrl")
        public String baseUrl;

        /**
         * <p>The receiving status of AgentIdentity. Enabled indicates that SCIM receiving is enabled, and Disabled indicates that it is disabled. This status is not equivalent to the expected value of syncEnabled for access control.</p>
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
         * <p>The credential ID. This parameter is required and cannot be empty when you delete a credential. Use the ID returned in the credential list, not the plaintext token.</p>
         * 
         * <strong>example:</strong>
         * <p>credential-example</p>
         */
        @NameInMap("credentialId")
        public String credentialId;

        /**
         * <p>The expiration time returned by AgentIdentity. Only credentials that are in the Enabled state and have not expired are considered available.</p>
         * 
         * <strong>example:</strong>
         * <p>2027-10-26T00:00:00Z</p>
         */
        @NameInMap("expireTime")
        public String expireTime;

        /**
         * <p>The credential status of AgentIdentity. Only credentials that are in the Enabled state and have not expired are considered available. This field is not the operationStatus of a SCIM task.</p>
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
         * <p>The actual SAML configuration is read on demand only by using GetIdentityProvider. SCIM query and prepare operations return the actual receiving status and URL.</p>
         */
        @NameInMap("configuration")
        public PrepareIdentityProviderSCIMResponseBodyDataConfiguration configuration;

        /**
         * <p>The current credential summary, which includes the credentialId, status, createTime, and expireTime fields. This summary does not include the token.</p>
         */
        @NameInMap("credential")
        public PrepareIdentityProviderSCIMResponseBodyDataCredential credential;

        /**
         * <p>The plaintext token is returned only when a new credential is created. If the prepare operation reuses a valid credential, this field is null. The token cannot be retrieved again from the list. If the response is lost, query the list first instead of automatically reissuing the token. Do not write the token to logs or persist it in frontend caches.</p>
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
