// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderRequest extends TeaModel {
    /**
     * <p>钉钉出基本信息</p>
     */
    @NameInMap("DingtalkAppConfig")
    public UpdateIdentityProviderRequestDingtalkAppConfig dingtalkAppConfig;

    /**
     * <p>IDaaS的身份提供方主键id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idp_my664lwkhpicbyzirog3xxxxx</p>
     */
    @NameInMap("IdentityProviderId")
    public String identityProviderId;

    /**
     * <p>身份提供方名称</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("IdentityProviderName")
    public String identityProviderName;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>飞书配置</p>
     */
    @NameInMap("LarkConfig")
    public UpdateIdentityProviderRequestLarkConfig larkConfig;

    /**
     * <p>AD/LDAP基本信息</p>
     */
    @NameInMap("LdapConfig")
    public UpdateIdentityProviderRequestLdapConfig ldapConfig;

    /**
     * <p>网络端点ID</p>
     * 
     * <strong>example:</strong>
     * <p>nae_examplexxxx</p>
     */
    @NameInMap("NetworkAccessEndpointId")
    public String networkAccessEndpointId;

    /**
     * <p>OIDC IdP配置。</p>
     */
    @NameInMap("OidcConfig")
    public UpdateIdentityProviderRequestOidcConfig oidcConfig;

    /**
     * <p>企业微信基本信息</p>
     */
    @NameInMap("WeComConfig")
    public UpdateIdentityProviderRequestWeComConfig weComConfig;

    public static UpdateIdentityProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIdentityProviderRequest self = new UpdateIdentityProviderRequest();
        return TeaModel.build(map, self);
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

    public UpdateIdentityProviderRequest setWeComConfig(UpdateIdentityProviderRequestWeComConfig weComConfig) {
        this.weComConfig = weComConfig;
        return this;
    }
    public UpdateIdentityProviderRequestWeComConfig getWeComConfig() {
        return this.weComConfig;
    }

    public static class UpdateIdentityProviderRequestDingtalkAppConfig extends TeaModel {
        /**
         * <p>钉钉一方应用的AppKey</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>49nyeaqumk7f</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <p>钉钉一方应用的AppSecret</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>86nozWFL2CxgwnhKiXaG8dN4keLPkUNc5xxxx</p>
         */
        @NameInMap("AppSecret")
        public String appSecret;

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

    }

    public static class UpdateIdentityProviderRequestLarkConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cli_xxxx</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>KiiLzh5Dueh4wbLxxxx</p>
         */
        @NameInMap("AppSecret")
        public String appSecret;

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

    }

    public static class UpdateIdentityProviderRequestLdapConfig extends TeaModel {
        /**
         * <p>管理员密码</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("AdministratorPassword")
        public String administratorPassword;

        /**
         * <p>管理员账号</p>
         * 
         * <strong>example:</strong>
         * <p>DC=example,DC=com</p>
         */
        @NameInMap("AdministratorUsername")
        public String administratorUsername;

        /**
         * <p>是否验证指纹证书</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("CertificateFingerprintStatus")
        public String certificateFingerprintStatus;

        /**
         * <p>证书指纹列表</p>
         */
        @NameInMap("CertificateFingerprints")
        public java.util.List<String> certificateFingerprints;

        /**
         * <p>通信协议</p>
         * 
         * <strong>example:</strong>
         * <p>ldap</p>
         */
        @NameInMap("LdapProtocol")
        public String ldapProtocol;

        /**
         * <p>ad/ldap 服务器地址</p>
         * 
         * <strong>example:</strong>
         * <p>123.xx.xx.89</p>
         */
        @NameInMap("LdapServerHost")
        public String ldapServerHost;

        /**
         * <p>端口号</p>
         * 
         * <strong>example:</strong>
         * <p>636</p>
         */
        @NameInMap("LdapServerPort")
        public Integer ldapServerPort;

        /**
         * <p>startTls是否开启</p>
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
         * <p>OIDC/oAuth2 认证方法。</p>
         * 
         * <strong>example:</strong>
         * <p>client_secret_post</p>
         */
        @NameInMap("AuthnMethod")
        public String authnMethod;

        /**
         * <p>OIDC/oAuth2 客户端密钥。</p>
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
         * <p>oAuth2 授权端点。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/oauth/authorize">https://example.com/oauth/authorize</a></p>
         */
        @NameInMap("AuthorizationEndpoint")
        public String authorizationEndpoint;

        /**
         * <p>OIDC issuer信息。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/oauth">https://example.com/oauth</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>OIDC jwks地址。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/oauth/jwks">https://example.com/oauth/jwks</a></p>
         */
        @NameInMap("JwksUri")
        public String jwksUri;

        /**
         * <p>oAuth2 Token端点。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/oauth/token">https://example.com/oauth/token</a></p>
         */
        @NameInMap("TokenEndpoint")
        public String tokenEndpoint;

        /**
         * <p>OIDC 用户信息端点。</p>
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
         * <p>OIDC客户端认证配置。</p>
         */
        @NameInMap("AuthnParam")
        public UpdateIdentityProviderRequestOidcConfigAuthnParam authnParam;

        /**
         * <p>OIDC 端点配置。</p>
         */
        @NameInMap("EndpointConfig")
        public UpdateIdentityProviderRequestOidcConfigEndpointConfig endpointConfig;

        /**
         * <p>OIDC标准参数，如profile、email等</p>
         * 
         * <strong>example:</strong>
         * <p>openid</p>
         */
        @NameInMap("GrantScopes")
        public java.util.List<String> grantScopes;

        /**
         * <p>OIDC授权类型。</p>
         * 
         * <strong>example:</strong>
         * <p>authorization_code</p>
         */
        @NameInMap("GrantType")
        public String grantType;

        /**
         * <p>支持的PKCE算法类型。</p>
         * 
         * <strong>example:</strong>
         * <p>S256</p>
         */
        @NameInMap("PkceChallengeMethod")
        public String pkceChallengeMethod;

        /**
         * <p>AuthorizationCode授权模式下是否使用PKCE。</p>
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

    public static class UpdateIdentityProviderRequestWeComConfig extends TeaModel {
        /**
         * <p>企业微信自建应用的Id</p>
         * 
         * <strong>example:</strong>
         * <p>1237403</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>授权回调域</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.aliyunidaas.com/xxxxx">https://xxx.aliyunidaas.com/xxxxx</a></p>
         */
        @NameInMap("AuthorizeCallbackDomain")
        public String authorizeCallbackDomain;

        /**
         * <p>企业微信自建应用的corpSecret</p>
         * 
         * <strong>example:</strong>
         * <p>CSEHDddddddxxxxuxkJEHPveWRXBGqVqRsxxxx</p>
         */
        @NameInMap("CorpSecret")
        public String corpSecret;

        /**
         * <p>可信域名</p>
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
