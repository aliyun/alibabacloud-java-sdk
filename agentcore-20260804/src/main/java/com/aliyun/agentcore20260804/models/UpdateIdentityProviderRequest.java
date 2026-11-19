// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderRequest extends TeaModel {
    /**
     * <p>Submit business parameters as described in this operation. The body parameters of public APIs are mapped to backend wrappers by the gateway. Do not mix them with backend direct connection body wrappers.</p>
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
         * <p>The Feishu App ID. It can be omitted during an update to retain the saved value. The merged Feishu configuration of the old and new values must contain this item.</p>
         * 
         * <strong>example:</strong>
         * <p>cli_exampleappid01</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>The DingTalk AppKey. It can be omitted during an update to retain the saved value. The merged DingTalk configuration of the old and new values must contain this item.</p>
         * 
         * <strong>example:</strong>
         * <p>dingexampleappkey01</p>
         */
        @NameInMap("appKey")
        public String appKey;

        /**
         * <p>The provider application secret. If omitted during an update, the saved value is retained. You can submit this field separately to update the secret. The explicit value must not be empty. This is sensitive input and is not echoed in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>example-app-secret</p>
         */
        @NameInMap("appSecret")
        public String appSecret;

        /**
         * <p>The DingTalk enterprise CorpId. It can be omitted during an update to retain the saved value. The merged DingTalk configuration of the old and new values must contain this item.</p>
         * 
         * <strong>example:</strong>
         * <p>dingexamplecorpid01</p>
         */
        @NameInMap("corpId")
        public String corpId;

        /**
         * <p>Required when synchronization is enabled for DingTalk and Feishu. This is sensitive input and is unrelated to the SCIM token.</p>
         * 
         * <strong>example:</strong>
         * <p>example-encrypt-key</p>
         */
        @NameInMap("encryptKey")
        public String encryptKey;

        /**
         * <p>Required when synchronization is enabled for DingTalk and Feishu. This is sensitive input and is unrelated to the SCIM token.</p>
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

    public static class UpdateIdentityProviderRequestBodyOidc extends TeaModel {
        /**
         * <p>The absolute HTTPS URL required in manual mode. Do not specify this parameter in discovery mode.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/authorize">https://idp.example.com/authorize</a></p>
         */
        @NameInMap("authorizationEndpoint")
        public String authorizationEndpoint;

        /**
         * <p>The default value is client_secret_post. If the value is none, PKCE must be enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>client_secret_post</p>
         */
        @NameInMap("clientAuthMethod")
        public String clientAuthMethod;

        /**
         * <p>The client identifier registered in the external IdP, which is different from the Matrix client. This value cannot be changed in place after it is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>example-client</p>
         */
        @NameInMap("clientId")
        public String clientId;

        /**
         * <p>The private key required for private_key_jwt authentication. If omitted during an update, the original value is retained. The value is not echoed in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN PRIVATE KEY-----\nEXAMPLE_ONLY_REPLACE_WITH_YOUR_PKCS8_PRIVATE_KEY\n-----END PRIVATE KEY-----</p>
         */
        @NameInMap("clientPrivateKey")
        public String clientPrivateKey;

        /**
         * <p>Required for post or basic authentication. If omitted during an update, the original value is retained. Blank or fully masked values with asterisks are not accepted. The value is not echoed in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>example-client-secret-not-for-production</p>
         */
        @NameInMap("clientSecret")
        public String clientSecret;

        /**
         * <p>The absolute HTTPS discovery endpoint URL. This parameter is mutually exclusive with manually specified endpoints.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/.well-known/openid-configuration">https://idp.example.com/.well-known/openid-configuration</a></p>
         */
        @NameInMap("discoveryEndpoint")
        public String discoveryEndpoint;

        /**
         * <p>The absolute HTTPS issuer URL of the external IdP. This value cannot be changed in place after it is configured.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com">https://idp.example.com</a></p>
         */
        @NameInMap("issuer")
        public String issuer;

        /**
         * <p>The absolute HTTPS URL required in manual mode. Do not specify this parameter in discovery mode.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/jwks">https://idp.example.com/jwks</a></p>
         */
        @NameInMap("jwksUri")
        public String jwksUri;

        /**
         * <p>Specifies whether PKCE is enabled. Default value: true. This parameter must be set to true when no client authentication is used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("pkceRequired")
        public Boolean pkceRequired;

        /**
         * <p>The array of scope strings. It must include openid. Default values: openid, profile, and email.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;openid&quot;,&quot;profile&quot;,&quot;email&quot;]</p>
         */
        @NameInMap("scopes")
        public java.util.List<String> scopes;

        /**
         * <p>The name of the claim in the ID token used to match the SCIM externalId. If omitted during the initial configuration, the default value is sub. If omitted during an update, the saved value is retained. For Azure, you can specify oid. The value must be non-empty and cannot contain whitespace characters. When queried, oidc returns the saved value, while oidcConfiguration returns the actual upstream value, which may be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>oid</p>
         */
        @NameInMap("ssoMappingClaim")
        public String ssoMappingClaim;

        /**
         * <p>The absolute HTTPS URL required in manual mode. Do not specify this parameter in discovery mode.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/token">https://idp.example.com/token</a></p>
         */
        @NameInMap("tokenEndpoint")
        public String tokenEndpoint;

        /**
         * <p>The optional absolute HTTPS URL in manual mode. Do not specify this parameter in discovery mode.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/userinfo">https://idp.example.com/userinfo</a></p>
         */
        @NameInMap("userinfoEndpoint")
        public String userinfoEndpoint;

        public static UpdateIdentityProviderRequestBodyOidc build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderRequestBodyOidc self = new UpdateIdentityProviderRequestBodyOidc();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderRequestBodyOidc setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        public UpdateIdentityProviderRequestBodyOidc setClientAuthMethod(String clientAuthMethod) {
            this.clientAuthMethod = clientAuthMethod;
            return this;
        }
        public String getClientAuthMethod() {
            return this.clientAuthMethod;
        }

        public UpdateIdentityProviderRequestBodyOidc setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public UpdateIdentityProviderRequestBodyOidc setClientPrivateKey(String clientPrivateKey) {
            this.clientPrivateKey = clientPrivateKey;
            return this;
        }
        public String getClientPrivateKey() {
            return this.clientPrivateKey;
        }

        public UpdateIdentityProviderRequestBodyOidc setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

        public UpdateIdentityProviderRequestBodyOidc setDiscoveryEndpoint(String discoveryEndpoint) {
            this.discoveryEndpoint = discoveryEndpoint;
            return this;
        }
        public String getDiscoveryEndpoint() {
            return this.discoveryEndpoint;
        }

        public UpdateIdentityProviderRequestBodyOidc setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public UpdateIdentityProviderRequestBodyOidc setJwksUri(String jwksUri) {
            this.jwksUri = jwksUri;
            return this;
        }
        public String getJwksUri() {
            return this.jwksUri;
        }

        public UpdateIdentityProviderRequestBodyOidc setPkceRequired(Boolean pkceRequired) {
            this.pkceRequired = pkceRequired;
            return this;
        }
        public Boolean getPkceRequired() {
            return this.pkceRequired;
        }

        public UpdateIdentityProviderRequestBodyOidc setScopes(java.util.List<String> scopes) {
            this.scopes = scopes;
            return this;
        }
        public java.util.List<String> getScopes() {
            return this.scopes;
        }

        public UpdateIdentityProviderRequestBodyOidc setSsoMappingClaim(String ssoMappingClaim) {
            this.ssoMappingClaim = ssoMappingClaim;
            return this;
        }
        public String getSsoMappingClaim() {
            return this.ssoMappingClaim;
        }

        public UpdateIdentityProviderRequestBodyOidc setTokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

        public UpdateIdentityProviderRequestBodyOidc setUserinfoEndpoint(String userinfoEndpoint) {
            this.userinfoEndpoint = userinfoEndpoint;
            return this;
        }
        public String getUserinfoEndpoint() {
            return this.userinfoEndpoint;
        }

    }

    public static class UpdateIdentityProviderRequestBodySaml extends TeaModel {
        /**
         * <p>HTTP-Redirect or HTTP-POST. Required for manual entry. The query returns the short name.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-Redirect</p>
         */
        @NameInMap("bindingType")
        public String bindingType;

        /**
         * <p>Required for manual entry. It must be non-empty and contain up to 2,048 characters. The existing configuration does not support replacement. It is different from the local entity ID returned by the SP query.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/entity">https://idp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>Required for manual entry. It must be an absolute HTTPS URL and must not contain user credentials or fragments.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idp.example.com/sso">https://idp.example.com/sso</a></p>
         */
        @NameInMap("loginUrl")
        public String loginUrl;

        /**
         * <p>The XML text of a single IdP EntityDescriptor, with a maximum size of 1 MiB. It must not be a URL or file path. It is mutually exclusive with the four manually entered fields. DTD and external entities are prohibited. If both SSO bindings are declared, HTTP-POST takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p><EntityDescriptor xmlns="urn:oasis:names:tc:SAML:2.0:metadata" entityID="https://idp.example.com/entity"><IDPSSODescriptor protocolSupportEnumeration="urn:oasis:names:tc:SAML:2.0:protocol"><KeyDescriptor use="signing"><KeyInfo xmlns="http://www.w3.org/2000/09/xmldsig#"><X509Data><X509Certificate>MIICwDCCAaigAwIBAgIULlsHLfcADyBax5ZtFlj+YGzZVo0wDQYJKoZIhvcNAQELBQAwGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMB4XDTI2MDEwMTAwMDAwMFoXDTM2MDEwMTAwMDAwMFowGjEYMBYGA1UEAwwPaWRwLmV4YW1wbGUuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAto0DN0W1CrPRzK9QZ9A1aApb4Lg8oGlp2c0PbN3LokXe/HzwxCMXx65IDnrenttxzTwp9BgUnUN/3LRzWaOL2UQ/vNYNW9LFLkI1T64UPyI7eyi28YlALhb41xkYhEp7rz+MjqifBzVZeTDUxBYtbK2hAhbYEL1+udwsXEx0KB7xuQ/rbI2OKeqAEAD1tfYg7T/SM2wrXNYhx+o1HtchM4/0I8Okkk27JQ4y3ofzC5sTySmFF1Y7XcpSd+5WSyazedhkAieo8AB01DkJV6nnKfH8sH0EBsnH3FP8FhqCLrIeEkjX9B9OcIRLGjiZqx4u/ryW1QhMldnv+pFfNjWy/wIDAQABMA0GCSqGSIb3DQEBCwUAA4IBAQC1hSQG8AwtGOoX2gKBK4Hi5XBrBreij8WlLTUWld0FINQ0Rg84f/27CjDthywj6wgxCesCuOVFhpxQa1UacsP/Gcai1aKABtLWImcaWECRYK5gDkwhTMFKM9mXA26hH1l4v/UR2iTpEK9H78egC4W7bs2LDTpPryuaNKTqP2O0tMbNkAHB8yecz5LxHXnxadL9Egow25g2RClvpifWqDnuS9TSbKkIWLcPLjocJj2K9ILpBwhXiXi/BiSgyYTLiYvVvih9vX4s+hKGZNJc0j92YLiOHDF0XH1oxgdVjfTmRiedeb2VZJZElptD92z0AqFR7z2d5B+OqpPA2gjuMLV5</X509Certificate></X509Data></KeyInfo></KeyDescriptor><SingleSignOnService Binding="urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect" Location="https://idp.example.com/sso"/></IDPSSODescriptor></EntityDescriptor></p>
         */
        @NameInMap("metadataXml")
        public String metadataXml;

        /**
         * <p>Required for manual entry. It must be a non-empty array using PEM X.509 certificate text. The current validity period is verified. Up to two certificates are allowed after deduplication.</p>
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
         * <p>When set to SelectedDepartments, it must contain at least one non-empty department ID, which should be obtained from ListIdentityProviderDepartments. When set to AllAuthorized, pass an empty array or omit this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;10001&quot;]</p>
         */
        @NameInMap("departmentIds")
        public java.util.List<String> departmentIds;

        /**
         * <p>AllAuthorized: the full authorization scope, subject to the application address book authorization limits. SelectedDepartments: the selected departments and all their sub-departments. When explicitly submitting syncScope, a valid mode must be provided and verified by the backend.</p>
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
         * <p>Do not pass true during CustomSSO initialization. A valid SAML configuration must be saved before enabling. Disabling does not delete the configuration. If an asynchronous failure occurs, this expected value does not indicate that it has taken effect upstream.</p>
         */
        @NameInMap("loginEnabled")
        public Boolean loginEnabled;

        /**
         * <p>The provider configurations for DingTalk and Feishu support partial updates. Omitted fields retain their saved values. Submitted values must not be null, empty strings, or blank strings. The complete configuration is verified after merging. CustomSSO updates use protocol and saml, and do not accept this field. The returned value does not contain provider keys.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;appSecret&quot;:&quot;example-app-secret&quot;}</p>
         */
        @NameInMap("metadata")
        public UpdateIdentityProviderRequestBodyMetadata metadata;

        /**
         * <p>Accepted only for CustomSSO and mutually exclusive with SAML. Submit the complete public configuration. Omitting credentials retains the existing values, while new values replace them. Blank and masked values are not accepted as credentials.</p>
         */
        @NameInMap("oidc")
        public UpdateIdentityProviderRequestBodyOidc oidc;

        /**
         * <p>The login protocol for CustomSSO. Currently, only SAML is supported. You can pass SAML when saving the SAML configuration. You can omit this parameter if you only modify loginEnabled. DingTalk and Feishu do not accept this field.</p>
         * 
         * <strong>example:</strong>
         * <p>SAML</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The SAML configuration for CustomSSO. Choose either metadataXml or the four manually entered fields: entityId, loginUrl, bindingType, and x509Certificates. If not submitted, the existing configuration is retained. DingTalk and Feishu do not accept this field.</p>
         */
        @NameInMap("saml")
        public UpdateIdentityProviderRequestBodySaml saml;

        /**
         * <p>Specifies whether to enable incremental synchronization for subsequent address book change events of DingTalk or Feishu. If not passed, the original value is retained. It does not control the initial synchronization or manual synchronization. CustomSSO does not accept this field. You must use UpdateIdentityProviderSCIM.</p>
         */
        @NameInMap("syncEnabled")
        public Boolean syncEnabled;

        /**
         * <p>Follows the definition of the department-based synchronization scope. If omitted during creation, the default value is AllAuthorized. The initial provider synchronization is determined by syncOnBind. If omitted or set to null during an update, the original value is retained. Saving the scope during an update does not automatically trigger a full synchronization.</p>
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

        public UpdateIdentityProviderRequestBody setOidc(UpdateIdentityProviderRequestBodyOidc oidc) {
            this.oidc = oidc;
            return this;
        }
        public UpdateIdentityProviderRequestBodyOidc getOidc() {
            return this.oidc;
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
