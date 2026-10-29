// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderResponseBody extends TeaModel {
    /**
     * <p>The business status code for this API request. A value of SUCCESS indicates that the request succeeded, but does not indicate that the asynchronous configuration or synchronization task is complete.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The currently saved identity provider binding information, including the expected configuration and resource status. The actual update may still be executing in the background.</p>
     */
    @NameInMap("data")
    public UpdateIdentityProviderResponseBodyData data;

    /**
     * <p>The HTTP status code for this API request. This does not indicate the execution result of the background task.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message for this API request. An error description is returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The unique identifier for this request. Provide this value when you troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether this API request succeeded. To check whether the background configuration has taken effect, you must query the identity provider status separately.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateIdentityProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIdentityProviderResponseBody self = new UpdateIdentityProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIdentityProviderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateIdentityProviderResponseBody setData(UpdateIdentityProviderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateIdentityProviderResponseBodyData getData() {
        return this.data;
    }

    public UpdateIdentityProviderResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateIdentityProviderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateIdentityProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateIdentityProviderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateIdentityProviderResponseBodyDataConfiguration extends TeaModel {
        /**
         * <p>The actual SAML binding type saved upstream, which is HTTP-Redirect or HTTP-POST.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("bindingType")
        public String bindingType;

        /**
         * <p>The actual enterprise IdP entity ID saved upstream.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>The actual enterprise IdP SSO logon URL saved upstream.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
         */
        @NameInMap("loginUrl")
        public String loginUrl;

        /**
         * <p>The actual SSO logon status upstream. Enabled indicates that it is turned on, and Disabled indicates that it is turned off. This should be evaluated separately from the expected value of loginEnabled.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("ssoStatus")
        public String ssoStatus;

        public static UpdateIdentityProviderResponseBodyDataConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderResponseBodyDataConfiguration self = new UpdateIdentityProviderResponseBodyDataConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderResponseBodyDataConfiguration setBindingType(String bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public String getBindingType() {
            return this.bindingType;
        }

        public UpdateIdentityProviderResponseBodyDataConfiguration setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public UpdateIdentityProviderResponseBodyDataConfiguration setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public UpdateIdentityProviderResponseBodyDataConfiguration setSsoStatus(String ssoStatus) {
            this.ssoStatus = ssoStatus;
            return this;
        }
        public String getSsoStatus() {
            return this.ssoStatus;
        }

    }

    public static class UpdateIdentityProviderResponseBodyDataSaml extends TeaModel {
        /**
         * <p>The saved SAML binding type, which is HTTP-Redirect or HTTP-POST.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("bindingType")
        public String bindingType;

        /**
         * <p>The saved enterprise IdP entity ID, which is different from the entity ID of the service provider (SP).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>The saved enterprise IdP SSO logon URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
         */
        @NameInMap("loginUrl")
        public String loginUrl;

        /**
         * <p>The list of saved enterprise IdP X.509 signing certificates.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;-----BEGIN CERTIFICATE-----\\nMIICwDCCAaigAwIBAgIULlsHLfcADyBax5ZtFlj+YGzZVo0wDQYJKoZIhvcNAQEL\\nBQAwGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMB4XDTI2MDEwMTAwMDAwMFoX\\nDTM2MDEwMTAwMDAwMFowGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMIIBIjAN\\nBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAto0DN0W1CrPRzK9QZ9A1aApb4Lg8\\noGlp2c0PbN3LokXe/HzwxCMXx65IDnrenttxzTwp9BgUnUN/3LRzWaOL2UQ/vNYN\\nW9LFLkI1T64UPyI7eyi28YlALhb41xkYhEp7rz+MjqifBzVZeTDUxBYtbK2hAhbY\\nEL1+udwsXEx0KB7xuQ/rbI2OKeqAEAD1tfYg7T/SM2wrXNYhx+o1HtchM4/0I8Ok\\nkk27JQ4y3ofzC5sTySmFF1Y7XcpSd+5WSyazedhkAieo8AB01DkJV6nnKfH8sH0E\\nBsnH3FP8FhqCLrIeEkjX9B9OcIRLGjiZqx4u/ryW1QhMldnv+pFfNjWy/wIDAQAB\\nMA0GCSqGSIb3DQEBCwUAA4IBAQC1hSQG8AwtGOoX2gKBK4Hi5XBrBreij8WlLTUW\\nld0FINQ0Rg84f/27CjDthywj6wgxCesCuOVFhpxQa1UacsP/Gcai1aKABtLWImca\\nWECRYK5gDkwhTMFKM9mXA26hH1l4v/UR2iTpEK9H78egC4W7bs2LDTpPryuaNKTq\\nP2O0tMbNkAHB8yecz5LxHXnxadL9Egow25g2RClvpifWqDnuS9TSbKkIWLcPLjoc\\nJj2K9ILpBwhXiXi/BiSgyYTLiYvVvih9vX4s+hKGZNJc0j92YLiOHDF0XH1oxgdV\\njfTmRiedeb2VZJZElptD92z0AqFR7z2d5B+OqpPA2gjuMLV5\\n-----END CERTIFICATE-----&quot;]</p>
         */
        @NameInMap("x509Certificates")
        public java.util.List<String> x509Certificates;

        public static UpdateIdentityProviderResponseBodyDataSaml build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderResponseBodyDataSaml self = new UpdateIdentityProviderResponseBodyDataSaml();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderResponseBodyDataSaml setBindingType(String bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public String getBindingType() {
            return this.bindingType;
        }

        public UpdateIdentityProviderResponseBodyDataSaml setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public UpdateIdentityProviderResponseBodyDataSaml setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public UpdateIdentityProviderResponseBodyDataSaml setX509Certificates(java.util.List<String> x509Certificates) {
            this.x509Certificates = x509Certificates;
            return this;
        }
        public java.util.List<String> getX509Certificates() {
            return this.x509Certificates;
        }

    }

    public static class UpdateIdentityProviderResponseBodyDataSyncScope extends TeaModel {
        /**
         * <p>The list of department IDs in the synchronization scope, which are obtained from ListIdentityProviderDepartments. In SelectedDepartments mode, you must provide at least one non-empty department ID. In AllAuthorized mode, this field should be omitted or an empty array should be passed.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;10001&quot;]</p>
         */
        @NameInMap("departmentIds")
        public java.util.List<String> departmentIds;

        /**
         * <p>The synchronization scope mode. Valid values: AllAuthorized and SelectedDepartments. AllAuthorized indicates all members within the authorization scope of the application address book. SelectedDepartments indicates the selected departments and all their sub-departments. When explicitly submitting syncScope, you must provide a valid mode.</p>
         * 
         * <strong>example:</strong>
         * <p>SelectedDepartments</p>
         */
        @NameInMap("mode")
        public String mode;

        public static UpdateIdentityProviderResponseBodyDataSyncScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderResponseBodyDataSyncScope self = new UpdateIdentityProviderResponseBodyDataSyncScope();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderResponseBodyDataSyncScope setDepartmentIds(java.util.List<String> departmentIds) {
            this.departmentIds = departmentIds;
            return this;
        }
        public java.util.List<String> getDepartmentIds() {
            return this.departmentIds;
        }

        public UpdateIdentityProviderResponseBodyDataSyncScope setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class UpdateIdentityProviderResponseBodyData extends TeaModel {
        /**
         * <p>The actual SAML configuration read back from the upstream. This update API does not perform this read-back and usually does not return this field. Use GetIdentityProvider to obtain it.</p>
         */
        @NameInMap("configuration")
        public UpdateIdentityProviderResponseBodyDataConfiguration configuration;

        /**
         * <p>The type of the identity provider. DingTalk indicates DingTalk. Feishu indicates Feishu. CustomSSO indicates a custom enterprise identity provider connected through SAML. The value must be the same as the type of the identity provider bound to the current workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        @NameInMap("identityProviderType")
        public String identityProviderType;

        /**
         * <p>The currently saved expected value for the logon switch. This alone does not prove that the upstream logon configuration has taken effect.</p>
         */
        @NameInMap("loginEnabled")
        public Boolean loginEnabled;

        /**
         * <p>The currently saved logon protocol for CustomSSO. The value is SAML when configured. This field is not returned for DingTalk or Lark.</p>
         * 
         * <strong>example:</strong>
         * <p>SAML</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The saved standardized SAML configuration for CustomSSO. The original metadata XML is not echoed. This field is not returned if no valid configuration is saved or if the identity provider is DingTalk or Lark. This value is the locally saved configuration and is not equivalent to the actual upstream configuration.</p>
         */
        @NameInMap("saml")
        public UpdateIdentityProviderResponseBodyDataSaml saml;

        /**
         * <p>The status of the identity provider resource and logon configuration. Valid values:</p>
         * <ul>
         * <li>CONFIGURED: The configuration is accepted.</li>
         * <li>UPDATING: The configuration is being updated.</li>
         * <li>SYNCING: Synchronization is in progress.</li>
         * <li>SYNCED: The synchronization phase is complete.</li>
         * <li>READY: The resource is ready.</li>
         * <li>SYNC_FAILED: Synchronization failed.</li>
         * <li>UPDATE_FAILED: The update failed.</li>
         * <li>DISCONNECTING: Unbinding is in progress.</li>
         * <li>DISCONNECT_FAILED: Unbinding failed.
         * A value of READY does not alone indicate that users are imported. Query the SCIM operation results for CustomSSO separately.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The currently saved expected value for the synchronization switch. For DingTalk and Lark, this is used for subsequent address book change events. For CustomSSO, the SCIM switch is managed by using UpdateIdentityProviderSCIM, and the operation results are queried by using GetIdentityProviderSCIM.</p>
         */
        @NameInMap("syncEnabled")
        public Boolean syncEnabled;

        /**
         * <p>The saved synchronization scope for DingTalk and Lark. The default value for valid historical configurations is AllAuthorized. This field may not be returned for corrupted historical configurations. This field is not returned for CustomSSO.</p>
         */
        @NameInMap("syncScope")
        public UpdateIdentityProviderResponseBodyDataSyncScope syncScope;

        /**
         * <p>The ID of the workspace to which the identity provider belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static UpdateIdentityProviderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderResponseBodyData self = new UpdateIdentityProviderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderResponseBodyData setConfiguration(UpdateIdentityProviderResponseBodyDataConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public UpdateIdentityProviderResponseBodyDataConfiguration getConfiguration() {
            return this.configuration;
        }

        public UpdateIdentityProviderResponseBodyData setIdentityProviderType(String identityProviderType) {
            this.identityProviderType = identityProviderType;
            return this;
        }
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        public UpdateIdentityProviderResponseBodyData setLoginEnabled(Boolean loginEnabled) {
            this.loginEnabled = loginEnabled;
            return this;
        }
        public Boolean getLoginEnabled() {
            return this.loginEnabled;
        }

        public UpdateIdentityProviderResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateIdentityProviderResponseBodyData setSaml(UpdateIdentityProviderResponseBodyDataSaml saml) {
            this.saml = saml;
            return this;
        }
        public UpdateIdentityProviderResponseBodyDataSaml getSaml() {
            return this.saml;
        }

        public UpdateIdentityProviderResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateIdentityProviderResponseBodyData setSyncEnabled(Boolean syncEnabled) {
            this.syncEnabled = syncEnabled;
            return this;
        }
        public Boolean getSyncEnabled() {
            return this.syncEnabled;
        }

        public UpdateIdentityProviderResponseBodyData setSyncScope(UpdateIdentityProviderResponseBodyDataSyncScope syncScope) {
            this.syncScope = syncScope;
            return this;
        }
        public UpdateIdentityProviderResponseBodyDataSyncScope getSyncScope() {
            return this.syncScope;
        }

        public UpdateIdentityProviderResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
