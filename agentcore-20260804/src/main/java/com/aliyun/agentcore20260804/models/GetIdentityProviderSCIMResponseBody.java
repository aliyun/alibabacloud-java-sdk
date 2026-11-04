// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetIdentityProviderSCIMResponseBody extends TeaModel {
    /**
     * <p>The business result code. Combine this code with the HTTP status code and message for handling failures.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The result structure. For details, see the response fields of this operation. The response of an asynchronous write operation indicates that the request is accepted, but does not guarantee that the background task is complete.</p>
     */
    @NameInMap("data")
    public GetIdentityProviderSCIMResponseBodyData data;

    /**
     * <p>The processing status of this request. This is not equivalent to the final result of the background task.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request acceptance or error message. For asynchronous tasks, check the task result by using the corresponding query operation.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID used to associate this call with troubleshooting. Retain this ID when a failure occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>request-example</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the current request is processed successfully. A value of true indicates success. For asynchronous writes, you must continue to query the task results.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetIdentityProviderSCIMResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderSCIMResponseBody self = new GetIdentityProviderSCIMResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderSCIMResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetIdentityProviderSCIMResponseBody setData(GetIdentityProviderSCIMResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIdentityProviderSCIMResponseBodyData getData() {
        return this.data;
    }

    public GetIdentityProviderSCIMResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetIdentityProviderSCIMResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIdentityProviderSCIMResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIdentityProviderSCIMResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetIdentityProviderSCIMResponseBodyDataConfiguration extends TeaModel {
        /**
         * <p>The URL configured for the external provisioning system. The presence of a URL does not indicate that external configuration is complete or that AC synchronization is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/scim/v2">https://example.com/scim/v2</a></p>
         */
        @NameInMap("baseUrl")
        public String baseUrl;

        /**
         * <p>The AgentIdentity receiving status. Valid values:</p>
         * <ul>
         * <li>Enabled: SCIM receiving is enabled.</li>
         * <li>Disabled: SCIM receiving is disabled.
         * This is not equivalent to the expected value of syncEnabled for AC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("status")
        public String status;

        public static GetIdentityProviderSCIMResponseBodyDataConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderSCIMResponseBodyDataConfiguration self = new GetIdentityProviderSCIMResponseBodyDataConfiguration();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderSCIMResponseBodyDataConfiguration setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public String getBaseUrl() {
            return this.baseUrl;
        }

        public GetIdentityProviderSCIMResponseBodyDataConfiguration setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetIdentityProviderSCIMResponseBodyData extends TeaModel {
        /**
         * <p>The actual SAML configuration is read back on demand only in GetIdentityProvider. SCIM queries and preparation return the actual receiving status and URL.</p>
         */
        @NameInMap("configuration")
        public GetIdentityProviderSCIMResponseBodyDataConfiguration configuration;

        /**
         * <p>The status of the most recent SCIM operation task. This status is independent of the SAML logon binding status. Valid values:</p>
         * <ul>
         * <li>PENDING: Waiting to be executed.</li>
         * <li>RUNNING: Being executed.</li>
         * <li>PAUSED: Paused.</li>
         * <li>SUCCESS: Succeeded.</li>
         * <li>FAILED: Failed.</li>
         * <li>CANCELED: Canceled.
         * Returns null or is omitted if no tasks exist. This status only represents the most recent SCIM switch and the initial full import task when enabled. It does not indicate credential issuance, external provisioning connection tests, or the health of continuous incremental synchronization. Clients poll this operation when the status is PENDING or RUNNING.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("operationStatus")
        public String operationStatus;

        /**
         * <p>The independent SCIM configuration status. Valid values:</p>
         * <ul>
         * <li>UNCONFIGURED: Preparation is not complete.</li>
         * <li>WAITING_CONFIGURATION: The receiving endpoint is enabled, a valid HTTPS URL and at least one valid token are available, and it is waiting for external configuration and enablement confirmation.</li>
         * <li>UPDATING: An enablement or disablement task is PENDING or RUNNING.</li>
         * <li>READY: Synchronization is enabled and the current enablement task succeeded. The receiving endpoint, URL, and token remain available.</li>
         * <li>DISABLED: The disablement task succeeded, and the configuration, credentials, and users are retained.</li>
         * <li>UPDATE_FAILED: The operation failed, was paused, was canceled, or the configuration and credentials are unavailable when enablement is expected.
         * This status is independent of the SAML or OIDC status. The READY state does not prove that Matrix execution or the continuous incremental link has been verified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Specifies whether the local expected synchronization switch is enabled. Do not pass true during CustomSSO initialization. You can only update this value later by using UpdateIdentityProviderSCIM. Determine the effective result by combining this value with operationStatus.</p>
         */
        @NameInMap("syncEnabled")
        public Boolean syncEnabled;

        public static GetIdentityProviderSCIMResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderSCIMResponseBodyData self = new GetIdentityProviderSCIMResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderSCIMResponseBodyData setConfiguration(GetIdentityProviderSCIMResponseBodyDataConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public GetIdentityProviderSCIMResponseBodyDataConfiguration getConfiguration() {
            return this.configuration;
        }

        public GetIdentityProviderSCIMResponseBodyData setOperationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
            return this;
        }
        public String getOperationStatus() {
            return this.operationStatus;
        }

        public GetIdentityProviderSCIMResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetIdentityProviderSCIMResponseBodyData setSyncEnabled(Boolean syncEnabled) {
            this.syncEnabled = syncEnabled;
            return this;
        }
        public Boolean getSyncEnabled() {
            return this.syncEnabled;
        }

    }

}
