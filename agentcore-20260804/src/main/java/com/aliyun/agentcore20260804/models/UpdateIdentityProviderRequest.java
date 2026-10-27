// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderRequest extends TeaModel {
    /**
     * <p>The configuration fields to be modified. For DingTalk and Lark, you must submit at least one of loginEnabled, syncEnabled, metadata, and syncScope. For CustomSSO, use protocol, saml, and loginEnabled. You cannot submit vendor metadata, syncEnabled, or syncScope.</p>
     */
    @NameInMap("body")
    public UpdateIdentityProviderRequestBody body;

    public static UpdateIdentityProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIdentityProviderRequest self = new UpdateIdentityProviderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIdentityProviderRequest setBody(UpdateIdentityProviderRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateIdentityProviderRequestBody getBody() {
        return this.body;
    }

    public static class UpdateIdentityProviderRequestBodyMetadata extends TeaModel {
        /**
         * <p>The App ID of the Lark application. If this parameter is omitted during an update, the existing value is retained. If explicitly submitted, it must be a non-empty value. The merged configuration for Lark must include this field.</p>
         * 
         * <strong>example:</strong>
         * <p>cli_exampleappid01</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>The AppKey of the DingTalk application. If this parameter is omitted during an update, the existing value is retained. If explicitly submitted, it must be a non-empty value. The merged configuration for DingTalk must include this field.</p>
         * 
         * <strong>example:</strong>
         * <p>dingexampleappkey01</p>
         */
        @NameInMap("appKey")
        public String appKey;

        /**
         * <p>The AppSecret of the DingTalk or Lark application. If this parameter is omitted during an update, the existing secret is retained and does not need to be retransmitted each time. If explicitly submitted, it must be a non-empty value, and the merged configuration must include this field. This is sensitive input and is not echoed in queries. The example is a fictitious value.</p>
         * 
         * <strong>example:</strong>
         * <p>example-app-secret</p>
         */
        @NameInMap("appSecret")
        public String appSecret;

        /**
         * <p>The CorpId of the organization to which the DingTalk application belongs. If this parameter is omitted during an update, the existing value is retained. If explicitly submitted, it must be a non-empty value and must match the organization to which the application belongs. The merged configuration for DingTalk must include this field.</p>
         * 
         * <strong>example:</strong>
         * <p>dingexamplecorpid01</p>
         */
        @NameInMap("corpId")
        public String corpId;

        /**
         * <p>The encryption key for vendor event callbacks, which must be consistent with the vendor application configuration. If this parameter is omitted during an update, the existing value is retained. When incremental synchronization is enabled, the merged configuration must include this field. This is sensitive input and is not echoed in queries.</p>
         * 
         * <strong>example:</strong>
         * <p>example-encrypt-key</p>
         */
        @NameInMap("encryptKey")
        public String encryptKey;

        /**
         * <p>The verification token for vendor event callbacks, which must be consistent with the vendor application configuration. If this parameter is omitted during an update, the existing value is retained. When incremental synchronization is enabled, the merged configuration must include this field. This is sensitive input and is not echoed in queries.</p>
         * 
         * <strong>example:</strong>
         * <p>example-verification-token</p>
         */
        @NameInMap("verificationToken")
        public String verificationToken;

        public static UpdateIdentityProviderRequestBodyMetadata build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderRequestBodyMetadata self = new UpdateIdentityProviderRequestBodyMetadata();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderRequestBodyMetadata setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateIdentityProviderRequestBodyMetadata setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public UpdateIdentityProviderRequestBodyMetadata setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public UpdateIdentityProviderRequestBodyMetadata setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public UpdateIdentityProviderRequestBodyMetadata setEncryptKey(String encryptKey) {
            this.encryptKey = encryptKey;
            return this;
        }
        public String getEncryptKey() {
            return this.encryptKey;
        }

        public UpdateIdentityProviderRequestBodyMetadata setVerificationToken(String verificationToken) {
            this.verificationToken = verificationToken;
            return this;
        }
        public String getVerificationToken() {
            return this.verificationToken;
        }

    }

    public static class UpdateIdentityProviderRequestBodySaml extends TeaModel {
        /**
         * <p>The binding type for manual SAML configuration. HTTP-Redirect and HTTP-POST are supported. This parameter must be submitted together with entityId, loginUrl, and x509Certificates, and cannot be mixed with metadataXml.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("bindingType")
        public String bindingType;

        /**
         * <p>The entity ID of the enterprise IdP. This parameter is required for manual configuration. It must be non-empty and up to 2,048 characters, and cannot be changed after saving. It must be submitted together with loginUrl, bindingType, and x509Certificates, and cannot be mixed with metadataXml.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>The SSO logon URL of the enterprise IdP. This parameter is required for manual configuration. It must be an absolute HTTPS URL without user credentials and fragments. It must be submitted together with entityId, bindingType, and x509Certificates, and cannot be mixed with metadataXml.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
         */
        @NameInMap("loginUrl")
        public String loginUrl;

        /**
         * <p>The original SAML metadata XML text of the enterprise IdP, not a URL or file path. The maximum size is 1 MiB. It must contain a single EntityDescriptor. DTDs and external entities are prohibited. It cannot be mixed with the four manual configuration fields. After saving, queries return the standardized configuration and do not echo the original XML text.</p>
         * 
         * <strong>example:</strong>
         * <p><EntityDescriptor xmlns="urn:oasis:names:tc:SAML:2.0:metadata" entityID="https://idp.example.com/entity"><IDPSSODescriptor protocolSupportEnumeration="urn:oasis:names:tc:SAML:2.0:protocol"><KeyDescriptor use="signing"><KeyInfo xmlns="http://www.w3.org/2000/09/xmldsig#"><X509Data><X509Certificate>MIICwDCCAaigAwIBAgIULlsHLfcADyBax5ZtFlj+YGzZVo0wDQYJKoZIhvcNAQELBQAwGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMB4XDTI2MDEwMTAwMDAwMFoXDTM2MDEwMTAwMDAwMFowGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAto0DN0W1CrPRzK9QZ9A1aApb4Lg8oGlp2c0PbN3LokXe/HzwxCMXx65IDnrenttxzTwp9BgUnUN/3LRzWaOL2UQ/vNYNW9LFLkI1T64UPyI7eyi28YlALhb41xkYhEp7rz+MjqifBzVZeTDUxBYtbK2hAhbYEL1+udwsXEx0KB7xuQ/rbI2OKeqAEAD1tfYg7T/SM2wrXNYhx+o1HtchM4/0I8Okkk27JQ4y3ofzC5sTySmFF1Y7XcpSd+5WSyazedhkAieo8AB01DkJV6nnKfH8sH0EBsnH3FP8FhqCLrIeEkjX9B9OcIRLGjiZqx4u/ryW1QhMldnv+pFfNjWy/wIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQC1hSQG8AwtGOoX2gKBK4Hi5XBrBreij8WlLTUWld0FINQ0Rg84f/27CjDthywj6wgxCesCuOVFhpxQa1UacsP/Gcai1aKABtLWImcaWECRYK5gDkwhTMFKM9mXA26hH1l4v/UR2iTpEK9H78egC4W7bs2LDTpPryuaNKTqP2O0tMbNkAHB8yecz5LxHXnxadL9Egow25g2RClvpifWqDnuS9TSbKkIWLcPLjocJj2K9ILpBwhXiXi/BiSgyYTLiYvVvih9vX4s+hKGZNJc0j92YLiOHDF0XH1oxgdVjfTmRiedeb2VZJZElptD92z0AqFR7z2d5B+OqpPA2gjuMLV5</X509Certificate></X509Data></KeyInfo></KeyDescriptor><SingleSignOnService Binding="urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect" Location="https://idp.example.com/sso"/></IDPSSODescriptor></EntityDescriptor></p>
         */
        @NameInMap("metadataXml")
        public String metadataXml;

        /**
         * <p>The list of X.509 signing certificates for the enterprise IdP. For manual configuration, a non-empty list must be provided, with a maximum of 10 certificates. The certificates must be valid. This parameter must be submitted together with entityId, loginUrl, and bindingType, and cannot be mixed with metadataXml.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;-----BEGIN CERTIFICATE-----\\nMIICwDCCAaigAwIBAgIULlsHLfcADyBax5ZtFlj+YGzZVo0wDQYJKoZIhvcNAQEL\\nBQAwGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMB4XDTI2MDEwMTAwMDAwMFoX\\nDTM2MDEwMTAwMDAwMFowGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMIIBIjAN\\nBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAto0DN0W1CrPRzK9QZ9A1aApb4Lg8\\noGlp2c0PbN3LokXe/HzwxCMXx65IDnrenttxzTwp9BgUnUN/3LRzWaOL2UQ/vNYN\\nW9LFLkI1T64UPyI7eyi28YlALhb41xkYhEp7rz+MjqifBzVZeTDUxBYtbK2hAhbY\\nEL1+udwsXEx0KB7xuQ/rbI2OKeqAEAD1tfYg7T/SM2wrXNYhx+o1HtchM4/0I8Ok\\nkk27JQ4y3ofzC5sTySmFF1Y7XcpSd+5WSyazedhkAieo8AB01DkJV6nnKfH8sH0E\\nBsnH3FP8FhqCLrIeEkjX9B9OcIRLGjiZqx4u/ryW1QhMldnv+pFfNjWy/wIDAQAB\\nMA0GCSqGSIb3DQEBCwUAA4IBAQC1hSQG8AwtGOoX2gKBK4Hi5XBrBreij8WlLTUW\\nld0FINQ0Rg84f/27CjDthywj6wgxCesCuOVFhpxQa1UacsP/Gcai1aKABtLWImca\\nWECRYK5gDkwhTMFKM9mXA26hH1l4v/UR2iTpEK9H78egC4W7bs2LDTpPryuaNKTq\\nP2O0tMbNkAHB8yecz5LxHXnxadL9Egow25g2RClvpifWqDnuS9TSbKkIWLcPLjoc\\nJj2K9ILpBwhXiXi/BiSgyYTLiYvVvih9vX4s+hKGZNJc0j92YLiOHDF0XH1oxgdV\\njfTmRiedeb2VZJZElptD92z0AqFR7z2d5B+OqpPA2gjuMLV5\\n-----END CERTIFICATE-----&quot;]</p>
         */
        @NameInMap("x509Certificates")
        public java.util.List<String> x509Certificates;

        public static UpdateIdentityProviderRequestBodySaml build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderRequestBodySaml self = new UpdateIdentityProviderRequestBodySaml();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderRequestBodySaml setBindingType(String bindingType) {
            this.bindingType = bindingType;
            return this;
        }
        public String getBindingType() {
            return this.bindingType;
        }

        public UpdateIdentityProviderRequestBodySaml setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public UpdateIdentityProviderRequestBodySaml setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public UpdateIdentityProviderRequestBodySaml setMetadataXml(String metadataXml) {
            this.metadataXml = metadataXml;
            return this;
        }
        public String getMetadataXml() {
            return this.metadataXml;
        }

        public UpdateIdentityProviderRequestBodySaml setX509Certificates(java.util.List<String> x509Certificates) {
            this.x509Certificates = x509Certificates;
            return this;
        }
        public java.util.List<String> getX509Certificates() {
            return this.x509Certificates;
        }

    }

    public static class UpdateIdentityProviderRequestBodySyncScope extends TeaModel {
        /**
         * <p>The list of department IDs in the synchronization scope, obtained from ListIdentityProviderDepartments. In SelectedDepartments mode, at least one non-empty department ID must be provided. In AllAuthorized mode, this parameter should be omitted or an empty array should be passed.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;10001&quot;]</p>
         */
        @NameInMap("departmentIds")
        public java.util.List<String> departmentIds;

        /**
         * <p>The synchronization scope mode. AllAuthorized: all members within the authorization scope of the application address book. SelectedDepartments: the selected departments and all their sub-departments. A valid mode must be provided when syncScope is explicitly submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>SelectedDepartments</p>
         */
        @NameInMap("mode")
        public String mode;

        public static UpdateIdentityProviderRequestBodySyncScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderRequestBodySyncScope self = new UpdateIdentityProviderRequestBodySyncScope();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderRequestBodySyncScope setDepartmentIds(java.util.List<String> departmentIds) {
            this.departmentIds = departmentIds;
            return this;
        }
        public java.util.List<String> getDepartmentIds() {
            return this.departmentIds;
        }

        public UpdateIdentityProviderRequestBodySyncScope setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class UpdateIdentityProviderRequestBody extends TeaModel {
        /**
         * <p>Specifies whether to allow logon by using this identity provider. If this parameter is omitted or set to null during an update, the original value is retained. For CustomSSO, a valid SAML configuration must exist before logon is enabled. Disabling logon does not delete the saved SAML or SCIM configurations.</p>
         */
        @NameInMap("loginEnabled")
        public Boolean loginEnabled;

        /**
         * <p>Applies only to DingTalk and Lark. The application configuration is merged by field. Omitted fields and existing keys retain their original values. Explicitly submitted fields must not be null, empty strings, or blank strings. The merged configuration must meet the complete configuration requirements of the vendor. CustomSSO does not accept this field.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;appSecret&quot;:&quot;example-app-secret&quot;}</p>
         */
        @NameInMap("metadata")
        public UpdateIdentityProviderRequestBodyMetadata metadata;

        /**
         * <p>The logon protocol, which applies only to CustomSSO. Currently, only SAML is supported. DingTalk and Lark do not accept this field. If submitted with a non-empty saml configuration, this field can be omitted and the server processes it as SAML.</p>
         * 
         * <strong>example:</strong>
         * <p>SAML</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>Applies only to CustomSSO. You can either provide metadataXml or provide the four complete manual configuration fields. The two methods cannot be mixed. If a valid configuration already exists, you can also modify only the JIT switches. Saving the configuration does not automatically enable logon.</p>
         */
        @NameInMap("saml")
        public UpdateIdentityProviderRequestBodySaml saml;

        /**
         * <p>Applies only to DingTalk and Lark. Controls the incremental synchronization of subsequent address book change events. If this parameter is omitted or set to null during an update, the original value is retained. It does not control the initial synchronization or manual synchronization. When enabled, the merged metadata must include encryptKey and verificationToken. For CustomSSO, use UpdateIdentityProviderSCIM to manage the synchronization switch.</p>
         */
        @NameInMap("syncEnabled")
        public Boolean syncEnabled;

        /**
         * <p>The address book synchronization scope, which applies only to DingTalk and Lark. If this parameter is omitted or set to null, the current scope is retained. Saving the scope does not automatically trigger a full synchronization. CustomSSO does not accept this field.</p>
         */
        @NameInMap("syncScope")
        public UpdateIdentityProviderRequestBodySyncScope syncScope;

        public static UpdateIdentityProviderRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderRequestBody self = new UpdateIdentityProviderRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderRequestBody setLoginEnabled(Boolean loginEnabled) {
            this.loginEnabled = loginEnabled;
            return this;
        }
        public Boolean getLoginEnabled() {
            return this.loginEnabled;
        }

        public UpdateIdentityProviderRequestBody setMetadata(UpdateIdentityProviderRequestBodyMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public UpdateIdentityProviderRequestBodyMetadata getMetadata() {
            return this.metadata;
        }

        public UpdateIdentityProviderRequestBody setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateIdentityProviderRequestBody setSaml(UpdateIdentityProviderRequestBodySaml saml) {
            this.saml = saml;
            return this;
        }
        public UpdateIdentityProviderRequestBodySaml getSaml() {
            return this.saml;
        }

        public UpdateIdentityProviderRequestBody setSyncEnabled(Boolean syncEnabled) {
            this.syncEnabled = syncEnabled;
            return this;
        }
        public Boolean getSyncEnabled() {
            return this.syncEnabled;
        }

        public UpdateIdentityProviderRequestBody setSyncScope(UpdateIdentityProviderRequestBodySyncScope syncScope) {
            this.syncScope = syncScope;
            return this;
        }
        public UpdateIdentityProviderRequestBodySyncScope getSyncScope() {
            return this.syncScope;
        }

    }

}
