// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderRequest extends TeaModel {
    /**
     * <p>A client-generated token to ensure request idempotence. This value must be unique across requests.</p>
     * 
     * <strong>example:</strong>
     * <p>client-examplexxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The configuration for the DingTalk identity provider.</p>
     */
    @NameInMap("DingtalkAppConfig")
    public UpdateIdentityProviderRequestDingtalkAppConfig dingtalkAppConfig;

    /**
     * <p>The ID of the identity provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idp_my664lwkhpicbyzirog3xxxxx</p>
     */
    @NameInMap("IdentityProviderId")
    public String identityProviderId;

    /**
     * <p>The name of the identity provider.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("IdentityProviderName")
    public String identityProviderName;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The configuration for the Lark identity provider.</p>
     */
    @NameInMap("LarkConfig")
    public UpdateIdentityProviderRequestLarkConfig larkConfig;

    /**
     * <p>The configuration for the Active Directory (AD) or Lightweight Directory Access Protocol (LDAP) identity provider.</p>
     */
    @NameInMap("LdapConfig")
    public UpdateIdentityProviderRequestLdapConfig ldapConfig;

    /**
     * <p>The URL of the application logo.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas-image://idaas_23aqr2ye554csg33dqpch5exxxx/tmp/d17d9adc-a943-45e7-ba0c-2838dddea678xxxx</p>
     */
    @NameInMap("LogoUrl")
    public String logoUrl;

    /**
     * <p>The ID of the network access endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>nae_examplexxxx</p>
     */
    @NameInMap("NetworkAccessEndpointId")
    public String networkAccessEndpointId;

    /**
     * <p>The OpenID Connect (OIDC) configuration.</p>
     */
    @NameInMap("OidcConfig")
    public UpdateIdentityProviderRequestOidcConfig oidcConfig;

    /**
     * <p>The configuration for the SAML identity provider.</p>
     */
    @NameInMap("SamlConfig")
    public UpdateIdentityProviderRequestSamlConfig samlConfig;

    /**
     * <p>The configuration for the WeCom identity provider.</p>
     */
    @NameInMap("WeComConfig")
    public UpdateIdentityProviderRequestWeComConfig weComConfig;

    public static UpdateIdentityProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIdentityProviderRequest self = new UpdateIdentityProviderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIdentityProviderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateIdentityProviderRequest setDingtalkAppConfig(UpdateIdentityProviderRequestDingtalkAppConfig dingtalkAppConfig) {
        this.dingtalkAppConfig = dingtalkAppConfig;
        return this;
    }
    public UpdateIdentityProviderRequestDingtalkAppConfig getDingtalkAppConfig() {
        return this.dingtalkAppConfig;
    }

    public UpdateIdentityProviderRequest setIdentityProviderId(String identityProviderId) {
        this.identityProviderId = identityProviderId;
        return this;
    }
    public String getIdentityProviderId() {
        return this.identityProviderId;
    }

    public UpdateIdentityProviderRequest setIdentityProviderName(String identityProviderName) {
        this.identityProviderName = identityProviderName;
        return this;
    }
    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

    public UpdateIdentityProviderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateIdentityProviderRequest setLarkConfig(UpdateIdentityProviderRequestLarkConfig larkConfig) {
        this.larkConfig = larkConfig;
        return this;
    }
    public UpdateIdentityProviderRequestLarkConfig getLarkConfig() {
        return this.larkConfig;
    }

    public UpdateIdentityProviderRequest setLdapConfig(UpdateIdentityProviderRequestLdapConfig ldapConfig) {
        this.ldapConfig = ldapConfig;
        return this;
    }
    public UpdateIdentityProviderRequestLdapConfig getLdapConfig() {
        return this.ldapConfig;
    }

    public UpdateIdentityProviderRequest setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }
    public String getLogoUrl() {
        return this.logoUrl;
    }

    public UpdateIdentityProviderRequest setNetworkAccessEndpointId(String networkAccessEndpointId) {
        this.networkAccessEndpointId = networkAccessEndpointId;
        return this;
    }
    public String getNetworkAccessEndpointId() {
        return this.networkAccessEndpointId;
    }

    public UpdateIdentityProviderRequest setOidcConfig(UpdateIdentityProviderRequestOidcConfig oidcConfig) {
        this.oidcConfig = oidcConfig;
        return this;
    }
    public UpdateIdentityProviderRequestOidcConfig getOidcConfig() {
        return this.oidcConfig;
    }

    public UpdateIdentityProviderRequest setSamlConfig(UpdateIdentityProviderRequestSamlConfig samlConfig) {
        this.samlConfig = samlConfig;
        return this;
    }
    public UpdateIdentityProviderRequestSamlConfig getSamlConfig() {
        return this.samlConfig;
    }

    public UpdateIdentityProviderRequest setWeComConfig(UpdateIdentityProviderRequestWeComConfig weComConfig) {
        this.weComConfig = weComConfig;
        return this;
    }
    public UpdateIdentityProviderRequestWeComConfig getWeComConfig() {
        return this.weComConfig;
    }

    public static class UpdateIdentityProviderRequestDingtalkAppConfig extends TeaModel {
        /**
         * <p>The AppKey of the DingTalk application.</p>
         * 
         * <strong>example:</strong>
         * <p>49nyeaqumk7f</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <p>The AppSecret of the DingTalk application.</p>
         * 
         * <strong>example:</strong>
         * <p>86nozWFL2CxgwnhKiXaG8dN4keLPkUNc5xxxx</p>
         */
        @NameInMap("AppSecret")
        public String appSecret;

        /**
         * <p>The version of the DingTalk QR code login.</p>
         * 
         * <strong>example:</strong>
         * <p>new_version</p>
         */
        @NameInMap("DingtalkLoginVersion")
        public String dingtalkLoginVersion;

        /**
         * <p>The EncryptKey of the DingTalk application.</p>
         * 
         * <strong>example:</strong>
         * <p>VkdWw91mdkrjVFr3ObNwefap21dfxxxx</p>
         */
        @NameInMap("EncryptKey")
        public String encryptKey;

        /**
         * <p>The verification token of the DingTalk application.</p>
         * 
         * <strong>example:</strong>
         * <p>myDingApp_VerifyTokenxxxxx</p>
         */
        @NameInMap("VerificationToken")
        public String verificationToken;

        public static UpdateIdentityProviderRequestDingtalkAppConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderRequestDingtalkAppConfig self = new UpdateIdentityProviderRequestDingtalkAppConfig();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderRequestDingtalkAppConfig setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public UpdateIdentityProviderRequestDingtalkAppConfig setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public UpdateIdentityProviderRequestDingtalkAppConfig setDingtalkLoginVersion(String dingtalkLoginVersion) {
            this.dingtalkLoginVersion = dingtalkLoginVersion;
            return this;
        }
        public String getDingtalkLoginVersion() {
            return this.dingtalkLoginVersion;
        }

        public UpdateIdentityProviderRequestDingtalkAppConfig setEncryptKey(String encryptKey) {
            this.encryptKey = encryptKey;
            return this;
        }
        public String getEncryptKey() {
            return this.encryptKey;
        }

        public UpdateIdentityProviderRequestDingtalkAppConfig setVerificationToken(String verificationToken) {
            this.verificationToken = verificationToken;
            return this;
        }
        public String getVerificationToken() {
            return this.verificationToken;
        }

    }

    public static class UpdateIdentityProviderRequestLarkConfig extends TeaModel {
        /**
         * <p>The application ID of the custom application in Lark.</p>
         * 
         * <strong>example:</strong>
         * <p>cli_xxxx</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application secret of the custom application in Lark.</p>
         * 
         * <strong>example:</strong>
         * <p>KiiLzh5Dueh4wbLxxxx</p>
         */
        @NameInMap("AppSecret")
        public String appSecret;

        /**
         * <p>The EncryptKey of the custom application in Lark.</p>
         * 
         * <strong>example:</strong>
         * <p>VkdWw91mdkrjVFr3ObNwefap21dfbZbKxxxx</p>
         */
        @NameInMap("EncryptKey")
        public String encryptKey;

        /**
         * <p>The verification token of the custom application in Lark.</p>
         * 
         * <strong>example:</strong>
         * <p>feishuVerifyTokenxxxxx</p>
         */
        @NameInMap("VerificationToken")
        public String verificationToken;

        public static UpdateIdentityProviderRequestLarkConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderRequestLarkConfig self = new UpdateIdentityProviderRequestLarkConfig();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderRequestLarkConfig setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateIdentityProviderRequestLarkConfig setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public UpdateIdentityProviderRequestLarkConfig setEncryptKey(String encryptKey) {
            this.encryptKey = encryptKey;
            return this;
        }
        public String getEncryptKey() {
            return this.encryptKey;
        }

        public UpdateIdentityProviderRequestLarkConfig setVerificationToken(String verificationToken) {
            this.verificationToken = verificationToken;
            return this;
        }
        public String getVerificationToken() {
            return this.verificationToken;
        }

    }

    public static class UpdateIdentityProviderRequestLdapConfig extends TeaModel {
        /**
         * <p>The password for the administrator account.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("AdministratorPassword")
        public String administratorPassword;

        /**
         * <p>The administrator account.</p>
         * 
         * <strong>example:</strong>
         * <p>DC=example,DC=com</p>
         */
        @NameInMap("AdministratorUsername")
        public String administratorUsername;

        /**
         * <p>Specifies whether to enable certificate fingerprint verification. Valid values:</p>
         * <ul>
         * <li><p><code>disabled</code>: Verification is disabled.</p>
         * </li>
         * <li><p><code>enabled</code>: Verification is enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("CertificateFingerprintStatus")
        public String certificateFingerprintStatus;

        /**
         * <p>The list of certificate fingerprints.</p>
         */
        @NameInMap("CertificateFingerprints")
        public java.util.List<String> certificateFingerprints;

        /**
         * <p>The communication protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>ldap</p>
         */
        @NameInMap("LdapProtocol")
        public String ldapProtocol;

        /**
         * <p>The server address.</p>
         * 
         * <strong>example:</strong>
         * <p>123.xx.xx.89</p>
         */
        @NameInMap("LdapServerHost")
        public String ldapServerHost;

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>636</p>
         */
        @NameInMap("LdapServerPort")
        public Integer ldapServerPort;

        /**
         * <p>Specifies whether to enable StartTLS. Valid values:</p>
         * <ul>
         * <li><p><code>disabled</code>: StartTLS is disabled.</p>
         * </li>
         * <li><p><code>enabled</code>: StartTLS is enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("StartTlsStatus")
        public String startTlsStatus;

        public static UpdateIdentityProviderRequestLdapConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderRequestLdapConfig self = new UpdateIdentityProviderRequestLdapConfig();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderRequestLdapConfig setAdministratorPassword(String administratorPassword) {
            this.administratorPassword = administratorPassword;
            return this;
        }
        public String getAdministratorPassword() {
            return this.administratorPassword;
        }

        public UpdateIdentityProviderRequestLdapConfig setAdministratorUsername(String administratorUsername) {
            this.administratorUsername = administratorUsername;
            return this;
        }
        public String getAdministratorUsername() {
            return this.administratorUsername;
        }

        public UpdateIdentityProviderRequestLdapConfig setCertificateFingerprintStatus(String certificateFingerprintStatus) {
            this.certificateFingerprintStatus = certificateFingerprintStatus;
            return this;
        }
        public String getCertificateFingerprintStatus() {
            return this.certificateFingerprintStatus;
        }

        public UpdateIdentityProviderRequestLdapConfig setCertificateFingerprints(java.util.List<String> certificateFingerprints) {
            this.certificateFingerprints = certificateFingerprints;
            return this;
        }
        public java.util.List<String> getCertificateFingerprints() {
            return this.certificateFingerprints;
        }

        public UpdateIdentityProviderRequestLdapConfig setLdapProtocol(String ldapProtocol) {
            this.ldapProtocol = ldapProtocol;
            return this;
        }
        public String getLdapProtocol() {
            return this.ldapProtocol;
        }

        public UpdateIdentityProviderRequestLdapConfig setLdapServerHost(String ldapServerHost) {
            this.ldapServerHost = ldapServerHost;
            return this;
        }
        public String getLdapServerHost() {
            return this.ldapServerHost;
        }

        public UpdateIdentityProviderRequestLdapConfig setLdapServerPort(Integer ldapServerPort) {
            this.ldapServerPort = ldapServerPort;
            return this;
        }
        public Integer getLdapServerPort() {
            return this.ldapServerPort;
        }

        public UpdateIdentityProviderRequestLdapConfig setStartTlsStatus(String startTlsStatus) {
            this.startTlsStatus = startTlsStatus;
            return this;
        }
        public String getStartTlsStatus() {
            return this.startTlsStatus;
        }

    }

    public static class UpdateIdentityProviderRequestOidcConfigAuthnParam extends TeaModel {
        /**
         * <p>The OIDC client authentication method. Valid values:</p>
         * <ul>
         * <li><p><code>client_secret_basic</code></p>
         * </li>
         * <li><p><code>client_secret_post</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>client_secret_post</p>
         */
        @NameInMap("AuthnMethod")
        public String authnMethod;

        /**
         * <p>The OIDC client secret.</p>
         * 
         * <strong>example:</strong>
         * <p>CSEHDddddddxxxxuxkJEHPveWRXBGqVqRsxxxx</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        public static UpdateIdentityProviderRequestOidcConfigAuthnParam build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderRequestOidcConfigAuthnParam self = new UpdateIdentityProviderRequestOidcConfigAuthnParam();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderRequestOidcConfigAuthnParam setAuthnMethod(String authnMethod) {
            this.authnMethod = authnMethod;
            return this;
        }
        public String getAuthnMethod() {
            return this.authnMethod;
        }

        public UpdateIdentityProviderRequestOidcConfigAuthnParam setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

    }

    public static class UpdateIdentityProviderRequestOidcConfigEndpointConfig extends TeaModel {
        /**
         * <p>The OIDC authorization endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/oauth/authorize">https://example.com/oauth/authorize</a></p>
         */
        @NameInMap("AuthorizationEndpoint")
        public String authorizationEndpoint;

        /**
         * <p>The OIDC issuer.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/oauth">https://example.com/oauth</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The JSON Web Key Set (JWKS) URI.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/oauth/jwks">https://example.com/oauth/jwks</a></p>
         */
        @NameInMap("JwksUri")
        public String jwksUri;

        /**
         * <p>The OIDC token endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/oauth/token">https://example.com/oauth/token</a></p>
         */
        @NameInMap("TokenEndpoint")
        public String tokenEndpoint;

        /**
         * <p>The OIDC userinfo endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/oauth/userinfo">https://example.com/oauth/userinfo</a></p>
         */
        @NameInMap("UserinfoEndpoint")
        public String userinfoEndpoint;

        public static UpdateIdentityProviderRequestOidcConfigEndpointConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderRequestOidcConfigEndpointConfig self = new UpdateIdentityProviderRequestOidcConfigEndpointConfig();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderRequestOidcConfigEndpointConfig setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        public UpdateIdentityProviderRequestOidcConfigEndpointConfig setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public UpdateIdentityProviderRequestOidcConfigEndpointConfig setJwksUri(String jwksUri) {
            this.jwksUri = jwksUri;
            return this;
        }
        public String getJwksUri() {
            return this.jwksUri;
        }

        public UpdateIdentityProviderRequestOidcConfigEndpointConfig setTokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

        public UpdateIdentityProviderRequestOidcConfigEndpointConfig setUserinfoEndpoint(String userinfoEndpoint) {
            this.userinfoEndpoint = userinfoEndpoint;
            return this;
        }
        public String getUserinfoEndpoint() {
            return this.userinfoEndpoint;
        }

    }

    public static class UpdateIdentityProviderRequestOidcConfig extends TeaModel {
        /**
         * <p>The OIDC client authentication configuration.</p>
         */
        @NameInMap("AuthnParam")
        public UpdateIdentityProviderRequestOidcConfigAuthnParam authnParam;

        /**
         * <p>The OIDC endpoint configuration.</p>
         */
        @NameInMap("EndpointConfig")
        public UpdateIdentityProviderRequestOidcConfigEndpointConfig endpointConfig;

        /**
         * <p>The OIDC authorization scopes.</p>
         * 
         * <strong>example:</strong>
         * <p>openid</p>
         */
        @NameInMap("GrantScopes")
        public java.util.List<String> grantScopes;

        /**
         * <p>The OIDC grant type.</p>
         * 
         * <strong>example:</strong>
         * <p>authorization_code</p>
         */
        @NameInMap("GrantType")
        public String grantType;

        /**
         * <p>The Proof Key for Code Exchange (PKCE) method. Valid values:</p>
         * <ul>
         * <li><p><code>S256</code>: The SHA-256 algorithm.</p>
         * </li>
         * <li><p><code>plain</code>: The plaintext format.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S256</p>
         */
        @NameInMap("PkceChallengeMethod")
        public String pkceChallengeMethod;

        /**
         * <p>Specifies whether PKCE is required for the authorization code grant type.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PkceRequired")
        public Boolean pkceRequired;

        public static UpdateIdentityProviderRequestOidcConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderRequestOidcConfig self = new UpdateIdentityProviderRequestOidcConfig();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderRequestOidcConfig setAuthnParam(UpdateIdentityProviderRequestOidcConfigAuthnParam authnParam) {
            this.authnParam = authnParam;
            return this;
        }
        public UpdateIdentityProviderRequestOidcConfigAuthnParam getAuthnParam() {
            return this.authnParam;
        }

        public UpdateIdentityProviderRequestOidcConfig setEndpointConfig(UpdateIdentityProviderRequestOidcConfigEndpointConfig endpointConfig) {
            this.endpointConfig = endpointConfig;
            return this;
        }
        public UpdateIdentityProviderRequestOidcConfigEndpointConfig getEndpointConfig() {
            return this.endpointConfig;
        }

        public UpdateIdentityProviderRequestOidcConfig setGrantScopes(java.util.List<String> grantScopes) {
            this.grantScopes = grantScopes;
            return this;
        }
        public java.util.List<String> getGrantScopes() {
            return this.grantScopes;
        }

        public UpdateIdentityProviderRequestOidcConfig setGrantType(String grantType) {
            this.grantType = grantType;
            return this;
        }
        public String getGrantType() {
            return this.grantType;
        }

        public UpdateIdentityProviderRequestOidcConfig setPkceChallengeMethod(String pkceChallengeMethod) {
            this.pkceChallengeMethod = pkceChallengeMethod;
            return this;
        }
        public String getPkceChallengeMethod() {
            return this.pkceChallengeMethod;
        }

        public UpdateIdentityProviderRequestOidcConfig setPkceRequired(Boolean pkceRequired) {
            this.pkceRequired = pkceRequired;
            return this;
        }
        public Boolean getPkceRequired() {
            return this.pkceRequired;
        }

    }

    public static class UpdateIdentityProviderRequestSamlConfigCertificates extends TeaModel {
        /**
         * <p>The content of the signing certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE----- MIIC0jCCAbqgAwIBAgIQXXXXX-----END CERTIFICATE-----</p>
         */
        @NameInMap("Content")
        public String content;

        public static UpdateIdentityProviderRequestSamlConfigCertificates build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderRequestSamlConfigCertificates self = new UpdateIdentityProviderRequestSamlConfigCertificates();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderRequestSamlConfigCertificates setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class UpdateIdentityProviderRequestSamlConfig extends TeaModel {
        /**
         * <p>The SAML binding method for the SSO request. Valid values are <code>HTTP-POST</code> and <code>HTTP-REDIRECT</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-REDIRECT</p>
         */
        @NameInMap("BindingMethod")
        public String bindingMethod;

        /**
         * <p>The signing certificates from the SAML identity provider.</p>
         */
        @NameInMap("Certificates")
        public java.util.List<UpdateIdentityProviderRequestSamlConfigCertificates> certificates;

        /**
         * <p>The entity ID of the SAML identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://dc.test.com/adfs/services/trust">http://dc.test.com/adfs/services/trust</a></p>
         */
        @NameInMap("IdPEntityId")
        public String idPEntityId;

        /**
         * <p>The single sign-on (SSO) URL of the SAML identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dc.test.com/adfs/ls/">https://dc.test.com/adfs/ls/</a></p>
         */
        @NameInMap("IdPSsoUrl")
        public String idPSsoUrl;

        /**
         * <p>The maximum allowed clock skew, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("MaxClockSkew")
        public Long maxClockSkew;

        /**
         * <p>Specifies whether the SAML authentication request must be signed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RequireRequestSigned")
        public Boolean requireRequestSigned;

        /**
         * <p>Specifies whether the assertions in the SAML response must be signed.</p>
         */
        @NameInMap("WantAssertionsSigned")
        public Boolean wantAssertionsSigned;

        /**
         * <p>Specifies whether the SAML response must be signed.</p>
         */
        @NameInMap("WantResponseSigned")
        public Boolean wantResponseSigned;

        public static UpdateIdentityProviderRequestSamlConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderRequestSamlConfig self = new UpdateIdentityProviderRequestSamlConfig();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderRequestSamlConfig setBindingMethod(String bindingMethod) {
            this.bindingMethod = bindingMethod;
            return this;
        }
        public String getBindingMethod() {
            return this.bindingMethod;
        }

        public UpdateIdentityProviderRequestSamlConfig setCertificates(java.util.List<UpdateIdentityProviderRequestSamlConfigCertificates> certificates) {
            this.certificates = certificates;
            return this;
        }
        public java.util.List<UpdateIdentityProviderRequestSamlConfigCertificates> getCertificates() {
            return this.certificates;
        }

        public UpdateIdentityProviderRequestSamlConfig setIdPEntityId(String idPEntityId) {
            this.idPEntityId = idPEntityId;
            return this;
        }
        public String getIdPEntityId() {
            return this.idPEntityId;
        }

        public UpdateIdentityProviderRequestSamlConfig setIdPSsoUrl(String idPSsoUrl) {
            this.idPSsoUrl = idPSsoUrl;
            return this;
        }
        public String getIdPSsoUrl() {
            return this.idPSsoUrl;
        }

        public UpdateIdentityProviderRequestSamlConfig setMaxClockSkew(Long maxClockSkew) {
            this.maxClockSkew = maxClockSkew;
            return this;
        }
        public Long getMaxClockSkew() {
            return this.maxClockSkew;
        }

        public UpdateIdentityProviderRequestSamlConfig setRequireRequestSigned(Boolean requireRequestSigned) {
            this.requireRequestSigned = requireRequestSigned;
            return this;
        }
        public Boolean getRequireRequestSigned() {
            return this.requireRequestSigned;
        }

        public UpdateIdentityProviderRequestSamlConfig setWantAssertionsSigned(Boolean wantAssertionsSigned) {
            this.wantAssertionsSigned = wantAssertionsSigned;
            return this;
        }
        public Boolean getWantAssertionsSigned() {
            return this.wantAssertionsSigned;
        }

        public UpdateIdentityProviderRequestSamlConfig setWantResponseSigned(Boolean wantResponseSigned) {
            this.wantResponseSigned = wantResponseSigned;
            return this;
        }
        public Boolean getWantResponseSigned() {
            return this.wantResponseSigned;
        }

    }

    public static class UpdateIdentityProviderRequestWeComConfig extends TeaModel {
        /**
         * <p>The agent ID of the custom application in WeCom.</p>
         * 
         * <strong>example:</strong>
         * <p>1237403</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>The authorized callback domain.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.aliyunidaas.com/xxxxx">https://xxx.aliyunidaas.com/xxxxx</a></p>
         */
        @NameInMap("AuthorizeCallbackDomain")
        public String authorizeCallbackDomain;

        /**
         * <p>The CorpSecret of the custom application in WeCom.</p>
         * 
         * <strong>example:</strong>
         * <p>CSEHDddddddxxxxuxkJEHPveWRXBGqVqRsxxxx</p>
         */
        @NameInMap("CorpSecret")
        public String corpSecret;

        /**
         * <p>The trusted domain.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.aliyunidaas.com">https://xxx.aliyunidaas.com</a></p>
         */
        @NameInMap("TrustableDomain")
        public String trustableDomain;

        public static UpdateIdentityProviderRequestWeComConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderRequestWeComConfig self = new UpdateIdentityProviderRequestWeComConfig();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderRequestWeComConfig setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public UpdateIdentityProviderRequestWeComConfig setAuthorizeCallbackDomain(String authorizeCallbackDomain) {
            this.authorizeCallbackDomain = authorizeCallbackDomain;
            return this;
        }
        public String getAuthorizeCallbackDomain() {
            return this.authorizeCallbackDomain;
        }

        public UpdateIdentityProviderRequestWeComConfig setCorpSecret(String corpSecret) {
            this.corpSecret = corpSecret;
            return this;
        }
        public String getCorpSecret() {
            return this.corpSecret;
        }

        public UpdateIdentityProviderRequestWeComConfig setTrustableDomain(String trustableDomain) {
            this.trustableDomain = trustableDomain;
            return this;
        }
        public String getTrustableDomain() {
            return this.trustableDomain;
        }

    }

}
