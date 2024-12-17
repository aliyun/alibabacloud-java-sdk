// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetIdentityProviderResponseBody extends TeaModel {
    @NameInMap("IdentityProviderDetail")
    public GetIdentityProviderResponseBodyIdentityProviderDetail identityProviderDetail;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetIdentityProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderResponseBody self = new GetIdentityProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderResponseBody setIdentityProviderDetail(GetIdentityProviderResponseBodyIdentityProviderDetail identityProviderDetail) {
        this.identityProviderDetail = identityProviderDetail;
        return this;
    }
    public GetIdentityProviderResponseBodyIdentityProviderDetail getIdentityProviderDetail() {
        return this.identityProviderDetail;
    }

    public GetIdentityProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkAppConfig extends TeaModel {
        /**
         * <p>IDaaS EIAM 钉钉一方应用的AppKey</p>
         * 
         * <strong>example:</strong>
         * <p>41reopmwoy9s</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <p>IDaaS EIAM 钉钉一方应用的AppSecret</p>
         * 
         * <strong>example:</strong>
         * <p>REOQ6Cl55kriOd8NOBeqWYLKpHR4p6fdZxxxx</p>
         */
        @NameInMap("AppSecret")
        public String appSecret;

        /**
         * <p>IDaaS EIAM 钉钉一方应用的corpId</p>
         * 
         * <strong>example:</strong>
         * <p>3756043633237690761</p>
         */
        @NameInMap("CorpId")
        public String corpId;

        /**
         * <p>IDaaS EIAM 钉钉版本</p>
         * 
         * <strong>example:</strong>
         * <p>public_dingtalk</p>
         */
        @NameInMap("DingtalkVersion")
        public String dingtalkVersion;

        public static GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkAppConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkAppConfig self = new GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkAppConfig();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkAppConfig setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkAppConfig setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkAppConfig setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkAppConfig setDingtalkVersion(String dingtalkVersion) {
            this.dingtalkVersion = dingtalkVersion;
            return this;
        }
        public String getDingtalkVersion() {
            return this.dingtalkVersion;
        }

    }

    public static class GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedDepartmentIds extends TeaModel {
        /**
         * <p>钉钉部门Id</p>
         * 
         * <strong>example:</strong>
         * <p>123xxx444</p>
         */
        @NameInMap("DeptId")
        public String deptId;

        /**
         * <p>钉钉部门名称</p>
         * 
         * <strong>example:</strong>
         * <p>测试部门</p>
         */
        @NameInMap("DeptName")
        public String deptName;

        public static GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedDepartmentIds build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedDepartmentIds self = new GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedDepartmentIds();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedDepartmentIds setDeptId(String deptId) {
            this.deptId = deptId;
            return this;
        }
        public String getDeptId() {
            return this.deptId;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedDepartmentIds setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

    }

    public static class GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedUsers extends TeaModel {
        /**
         * <p>钉钉用户名称</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>钉钉用户userId</p>
         * 
         * <strong>example:</strong>
         * <p>130308333929200479</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedUsers build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedUsers self = new GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedUsers();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedUsers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfig extends TeaModel {
        /**
         * <p>授权的钉钉部门</p>
         */
        @NameInMap("AuthedDepartmentIds")
        public java.util.List<GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedDepartmentIds> authedDepartmentIds;

        /**
         * <p>授权的钉钉账户列表</p>
         */
        @NameInMap("AuthedUsers")
        public java.util.List<GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedUsers> authedUsers;

        /**
         * <p>钉钉企业corpId</p>
         * 
         * <strong>example:</strong>
         * <p>ding_xxxxx</p>
         */
        @NameInMap("CorpId")
        public String corpId;

        /**
         * <p>钉钉企业名称</p>
         * 
         * <strong>example:</strong>
         * <p>测试企业</p>
         */
        @NameInMap("CorpName")
        public String corpName;

        public static GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfig self = new GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfig();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfig setAuthedDepartmentIds(java.util.List<GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedDepartmentIds> authedDepartmentIds) {
            this.authedDepartmentIds = authedDepartmentIds;
            return this;
        }
        public java.util.List<GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedDepartmentIds> getAuthedDepartmentIds() {
            return this.authedDepartmentIds;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfig setAuthedUsers(java.util.List<GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedUsers> authedUsers) {
            this.authedUsers = authedUsers;
            return this;
        }
        public java.util.List<GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedUsers> getAuthedUsers() {
            return this.authedUsers;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfig setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfig setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

    }

    public static class GetIdentityProviderResponseBodyIdentityProviderDetailLarkConfig extends TeaModel {
        /**
         * <p>IDaaS EIAM 飞书自建应用的corpId</p>
         * 
         * <strong>example:</strong>
         * <p>cli_a7a99f53a317100c</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>IDaaS EIAM 飞书自建应用的AppSecret</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("AppSecret")
        public String appSecret;

        /**
         * <p>IDaaS EIAM 飞书企业编码</p>
         * 
         * <strong>example:</strong>
         * <p>FX1231xxxx</p>
         */
        @NameInMap("EnterpriseNumber")
        public String enterpriseNumber;

        public static GetIdentityProviderResponseBodyIdentityProviderDetailLarkConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyIdentityProviderDetailLarkConfig self = new GetIdentityProviderResponseBodyIdentityProviderDetailLarkConfig();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailLarkConfig setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailLarkConfig setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailLarkConfig setEnterpriseNumber(String enterpriseNumber) {
            this.enterpriseNumber = enterpriseNumber;
            return this;
        }
        public String getEnterpriseNumber() {
            return this.enterpriseNumber;
        }

    }

    public static class GetIdentityProviderResponseBodyIdentityProviderDetailLdapConfig extends TeaModel {
        /**
         * <p>管理员密码</p>
         * 
         * <strong>example:</strong>
         * <p>XXXX</p>
         */
        @NameInMap("AdministratorPassword")
        public String administratorPassword;

        /**
         * <p>管理员账号</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
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
         * <p>127.xx.xx.100</p>
         */
        @NameInMap("LdapServerHost")
        public String ldapServerHost;

        /**
         * <p>ad/ldap 服务器地址</p>
         * 
         * <strong>example:</strong>
         * <p>389</p>
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

        public static GetIdentityProviderResponseBodyIdentityProviderDetailLdapConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyIdentityProviderDetailLdapConfig self = new GetIdentityProviderResponseBodyIdentityProviderDetailLdapConfig();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailLdapConfig setAdministratorPassword(String administratorPassword) {
            this.administratorPassword = administratorPassword;
            return this;
        }
        public String getAdministratorPassword() {
            return this.administratorPassword;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailLdapConfig setAdministratorUsername(String administratorUsername) {
            this.administratorUsername = administratorUsername;
            return this;
        }
        public String getAdministratorUsername() {
            return this.administratorUsername;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailLdapConfig setCertificateFingerprintStatus(String certificateFingerprintStatus) {
            this.certificateFingerprintStatus = certificateFingerprintStatus;
            return this;
        }
        public String getCertificateFingerprintStatus() {
            return this.certificateFingerprintStatus;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailLdapConfig setCertificateFingerprints(java.util.List<String> certificateFingerprints) {
            this.certificateFingerprints = certificateFingerprints;
            return this;
        }
        public java.util.List<String> getCertificateFingerprints() {
            return this.certificateFingerprints;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailLdapConfig setLdapProtocol(String ldapProtocol) {
            this.ldapProtocol = ldapProtocol;
            return this;
        }
        public String getLdapProtocol() {
            return this.ldapProtocol;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailLdapConfig setLdapServerHost(String ldapServerHost) {
            this.ldapServerHost = ldapServerHost;
            return this;
        }
        public String getLdapServerHost() {
            return this.ldapServerHost;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailLdapConfig setLdapServerPort(Integer ldapServerPort) {
            this.ldapServerPort = ldapServerPort;
            return this;
        }
        public Integer getLdapServerPort() {
            return this.ldapServerPort;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailLdapConfig setStartTlsStatus(String startTlsStatus) {
            this.startTlsStatus = startTlsStatus;
            return this;
        }
        public String getStartTlsStatus() {
            return this.startTlsStatus;
        }

    }

    public static class GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigAuthnParam extends TeaModel {
        /**
         * <p>OIDC/oAuth2 认证方法。</p>
         * 
         * <strong>example:</strong>
         * <p>client_secret_post</p>
         */
        @NameInMap("AuthnMethod")
        public String authnMethod;

        /**
         * <p>OIDC/oAuth2 客户端ID。</p>
         * 
         * <strong>example:</strong>
         * <p>mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>OIDC/oAuth2 客户端密钥。</p>
         * 
         * <strong>example:</strong>
         * <p>CSEHDddddddxxxxuxkJEHPveWRXBGqVqRsxxxx</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        public static GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigAuthnParam build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigAuthnParam self = new GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigAuthnParam();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigAuthnParam setAuthnMethod(String authnMethod) {
            this.authnMethod = authnMethod;
            return this;
        }
        public String getAuthnMethod() {
            return this.authnMethod;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigAuthnParam setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigAuthnParam setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

    }

    public static class GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigEndpointConfig extends TeaModel {
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

        public static GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigEndpointConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigEndpointConfig self = new GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigEndpointConfig();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigEndpointConfig setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigEndpointConfig setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigEndpointConfig setJwksUri(String jwksUri) {
            this.jwksUri = jwksUri;
            return this;
        }
        public String getJwksUri() {
            return this.jwksUri;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigEndpointConfig setTokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigEndpointConfig setUserinfoEndpoint(String userinfoEndpoint) {
            this.userinfoEndpoint = userinfoEndpoint;
            return this;
        }
        public String getUserinfoEndpoint() {
            return this.userinfoEndpoint;
        }

    }

    public static class GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfig extends TeaModel {
        /**
         * <p>OIDC客户端认证配置。</p>
         */
        @NameInMap("AuthnParam")
        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigAuthnParam authnParam;

        /**
         * <p>OIDC 端点配置。</p>
         */
        @NameInMap("EndpointConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigEndpointConfig endpointConfig;

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

        public static GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfig self = new GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfig();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfig setAuthnParam(GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigAuthnParam authnParam) {
            this.authnParam = authnParam;
            return this;
        }
        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigAuthnParam getAuthnParam() {
            return this.authnParam;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfig setEndpointConfig(GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigEndpointConfig endpointConfig) {
            this.endpointConfig = endpointConfig;
            return this;
        }
        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigEndpointConfig getEndpointConfig() {
            return this.endpointConfig;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfig setGrantScopes(java.util.List<String> grantScopes) {
            this.grantScopes = grantScopes;
            return this;
        }
        public java.util.List<String> getGrantScopes() {
            return this.grantScopes;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfig setGrantType(String grantType) {
            this.grantType = grantType;
            return this;
        }
        public String getGrantType() {
            return this.grantType;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfig setPkceChallengeMethod(String pkceChallengeMethod) {
            this.pkceChallengeMethod = pkceChallengeMethod;
            return this;
        }
        public String getPkceChallengeMethod() {
            return this.pkceChallengeMethod;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfig setPkceRequired(Boolean pkceRequired) {
            this.pkceRequired = pkceRequired;
            return this;
        }
        public Boolean getPkceRequired() {
            return this.pkceRequired;
        }

    }

    public static class GetIdentityProviderResponseBodyIdentityProviderDetailUdPullConfigUdSyncScopeConfig extends TeaModel {
        /**
         * <p>同步来源节点</p>
         */
        @NameInMap("SourceScopes")
        public java.util.List<String> sourceScopes;

        /**
         * <p>同步目标节点</p>
         * 
         * <strong>example:</strong>
         * <p>ou_123xxxx</p>
         */
        @NameInMap("TargetScope")
        public String targetScope;

        public static GetIdentityProviderResponseBodyIdentityProviderDetailUdPullConfigUdSyncScopeConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyIdentityProviderDetailUdPullConfigUdSyncScopeConfig self = new GetIdentityProviderResponseBodyIdentityProviderDetailUdPullConfigUdSyncScopeConfig();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailUdPullConfigUdSyncScopeConfig setSourceScopes(java.util.List<String> sourceScopes) {
            this.sourceScopes = sourceScopes;
            return this;
        }
        public java.util.List<String> getSourceScopes() {
            return this.sourceScopes;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailUdPullConfigUdSyncScopeConfig setTargetScope(String targetScope) {
            this.targetScope = targetScope;
            return this;
        }
        public String getTargetScope() {
            return this.targetScope;
        }

    }

    public static class GetIdentityProviderResponseBodyIdentityProviderDetailUdPullConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("GroupSyncStatus")
        public String groupSyncStatus;

        /**
         * <p>增量回调状态，是否处理来自IdP的增量回调数据</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("IncrementalCallbackStatus")
        public String incrementalCallbackStatus;

        /**
         * <p>同步入配置信息</p>
         */
        @NameInMap("UdSyncScopeConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailUdPullConfigUdSyncScopeConfig udSyncScopeConfig;

        public static GetIdentityProviderResponseBodyIdentityProviderDetailUdPullConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyIdentityProviderDetailUdPullConfig self = new GetIdentityProviderResponseBodyIdentityProviderDetailUdPullConfig();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailUdPullConfig setGroupSyncStatus(String groupSyncStatus) {
            this.groupSyncStatus = groupSyncStatus;
            return this;
        }
        public String getGroupSyncStatus() {
            return this.groupSyncStatus;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailUdPullConfig setIncrementalCallbackStatus(String incrementalCallbackStatus) {
            this.incrementalCallbackStatus = incrementalCallbackStatus;
            return this;
        }
        public String getIncrementalCallbackStatus() {
            return this.incrementalCallbackStatus;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailUdPullConfig setUdSyncScopeConfig(GetIdentityProviderResponseBodyIdentityProviderDetailUdPullConfigUdSyncScopeConfig udSyncScopeConfig) {
            this.udSyncScopeConfig = udSyncScopeConfig;
            return this;
        }
        public GetIdentityProviderResponseBodyIdentityProviderDetailUdPullConfigUdSyncScopeConfig getUdSyncScopeConfig() {
            return this.udSyncScopeConfig;
        }

    }

    public static class GetIdentityProviderResponseBodyIdentityProviderDetailUdPushConfigUdSyncScopeConfigs extends TeaModel {
        /**
         * <p>同步来源节点</p>
         */
        @NameInMap("SourceScopes")
        public java.util.List<String> sourceScopes;

        /**
         * <p>同步目标节点</p>
         * 
         * <strong>example:</strong>
         * <p>ou_123xxxx</p>
         */
        @NameInMap("TargetScope")
        public String targetScope;

        public static GetIdentityProviderResponseBodyIdentityProviderDetailUdPushConfigUdSyncScopeConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyIdentityProviderDetailUdPushConfigUdSyncScopeConfigs self = new GetIdentityProviderResponseBodyIdentityProviderDetailUdPushConfigUdSyncScopeConfigs();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailUdPushConfigUdSyncScopeConfigs setSourceScopes(java.util.List<String> sourceScopes) {
            this.sourceScopes = sourceScopes;
            return this;
        }
        public java.util.List<String> getSourceScopes() {
            return this.sourceScopes;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailUdPushConfigUdSyncScopeConfigs setTargetScope(String targetScope) {
            this.targetScope = targetScope;
            return this;
        }
        public String getTargetScope() {
            return this.targetScope;
        }

    }

    public static class GetIdentityProviderResponseBodyIdentityProviderDetailUdPushConfig extends TeaModel {
        /**
         * <p>增量回调状态，是否处理来自IdP的增量回调数据</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("IncrementalCallbackStatus")
        public String incrementalCallbackStatus;

        /**
         * <p>同步出配置信息</p>
         */
        @NameInMap("UdSyncScopeConfigs")
        public java.util.List<GetIdentityProviderResponseBodyIdentityProviderDetailUdPushConfigUdSyncScopeConfigs> udSyncScopeConfigs;

        public static GetIdentityProviderResponseBodyIdentityProviderDetailUdPushConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyIdentityProviderDetailUdPushConfig self = new GetIdentityProviderResponseBodyIdentityProviderDetailUdPushConfig();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailUdPushConfig setIncrementalCallbackStatus(String incrementalCallbackStatus) {
            this.incrementalCallbackStatus = incrementalCallbackStatus;
            return this;
        }
        public String getIncrementalCallbackStatus() {
            return this.incrementalCallbackStatus;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailUdPushConfig setUdSyncScopeConfigs(java.util.List<GetIdentityProviderResponseBodyIdentityProviderDetailUdPushConfigUdSyncScopeConfigs> udSyncScopeConfigs) {
            this.udSyncScopeConfigs = udSyncScopeConfigs;
            return this;
        }
        public java.util.List<GetIdentityProviderResponseBodyIdentityProviderDetailUdPushConfigUdSyncScopeConfigs> getUdSyncScopeConfigs() {
            return this.udSyncScopeConfigs;
        }

    }

    public static class GetIdentityProviderResponseBodyIdentityProviderDetailWeComConfig extends TeaModel {
        /**
         * <p>IDaaS EIAM 企业微信自建应用的Id</p>
         * 
         * <strong>example:</strong>
         * <p>1242350</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>授权回调域</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/xxxx">https://example.com/xxxx</a></p>
         */
        @NameInMap("AuthorizeCallbackDomain")
        public String authorizeCallbackDomain;

        /**
         * <p>IDaaS EIAM 企业微信自建应用的corpId</p>
         * 
         * <strong>example:</strong>
         * <p>3562012953454577801</p>
         */
        @NameInMap("CorpId")
        public String corpId;

        /**
         * <p>IDaaS EIAM 企业微信自建应用的corpSecret</p>
         * 
         * <strong>example:</strong>
         * <p>weaseiszjskejskaj12sjeszojxxxx</p>
         */
        @NameInMap("CorpSecret")
        public String corpSecret;

        /**
         * <p>可信域名</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com">https://example.com</a></p>
         */
        @NameInMap("TrustableDomain")
        public String trustableDomain;

        public static GetIdentityProviderResponseBodyIdentityProviderDetailWeComConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyIdentityProviderDetailWeComConfig self = new GetIdentityProviderResponseBodyIdentityProviderDetailWeComConfig();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailWeComConfig setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailWeComConfig setAuthorizeCallbackDomain(String authorizeCallbackDomain) {
            this.authorizeCallbackDomain = authorizeCallbackDomain;
            return this;
        }
        public String getAuthorizeCallbackDomain() {
            return this.authorizeCallbackDomain;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailWeComConfig setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailWeComConfig setCorpSecret(String corpSecret) {
            this.corpSecret = corpSecret;
            return this;
        }
        public String getCorpSecret() {
            return this.corpSecret;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailWeComConfig setTrustableDomain(String trustableDomain) {
            this.trustableDomain = trustableDomain;
            return this;
        }
        public String getTrustableDomain() {
            return this.trustableDomain;
        }

    }

    public static class GetIdentityProviderResponseBodyIdentityProviderDetail extends TeaModel {
        /**
         * <p>高阶配置能力</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("AdvancedStatus")
        public String advancedStatus;

        /**
         * <p>IDaaS EIAM 对应的认证来源产品，okta or google or azure ad</p>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:idp:bytedance:lark</p>
         */
        @NameInMap("AuthnSourceSupplier")
        public String authnSourceSupplier;

        /**
         * <p>IDaaS EIAM 认证方式类型 oidc or saml</p>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:authntype:oidc</p>
         */
        @NameInMap("AuthnSourceType")
        public String authnSourceType;

        /**
         * <p>IDaaS EIAM 对应IdP是否支持认证</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("AuthnStatus")
        public String authnStatus;

        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>1726021079000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>IDaaS EIAM 身份提供方描述</p>
         * 
         * <strong>example:</strong>
         * <p>for poc test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>钉钉基础配置</p>
         */
        @NameInMap("DingtalkAppConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkAppConfig dingtalkAppConfig;

        /**
         * <p>钉钉同步配置</p>
         */
        @NameInMap("DingtalkProvisioningConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfig dingtalkProvisioningConfig;

        /**
         * <p>IDaaS EIAM 身份提供方外部ID</p>
         * 
         * <strong>example:</strong>
         * <p>idp_xxxx</p>
         */
        @NameInMap("IdentityProviderExternalId")
        public String identityProviderExternalId;

        /**
         * <p>IDaaS EIAM 身份提供方ID</p>
         * 
         * <strong>example:</strong>
         * <p>idp_mwpcwnhrimlr2horx7xgg7pp7y</p>
         */
        @NameInMap("IdentityProviderId")
        public String identityProviderId;

        /**
         * <p>IDaaS EIAM 身份提供方名称</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("IdentityProviderName")
        public String identityProviderName;

        /**
         * <p>身份提供方同步类型</p>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:idp:alibaba:dingtalk:push</p>
         */
        @NameInMap("IdentityProviderType")
        public String identityProviderType;

        /**
         * <p>IDaaS EIAM 实例Id</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_x2df3bak3uwnapqm6xxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>飞书配置</p>
         */
        @NameInMap("LarkConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailLarkConfig larkConfig;

        /**
         * <p>最后一次状态检查结果</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("LastStatusCheckJobResult")
        public String lastStatusCheckJobResult;

        /**
         * <p>AD/LDAP身份提供方相关信息</p>
         */
        @NameInMap("LdapConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailLdapConfig ldapConfig;

        /**
         * <p>锁定原因</p>
         * 
         * <strong>example:</strong>
         * <p>financial</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("LogoUrl")
        public String logoUrl;

        /**
         * <p>网络端点ID</p>
         * 
         * <strong>example:</strong>
         * <p>nae_mx4vsadfe6govkqkwckxxxx</p>
         */
        @NameInMap("NetworkAccessEndpointId")
        public String networkAccessEndpointId;

        /**
         * <p>OIDC IdP配置。</p>
         */
        @NameInMap("OidcConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfig oidcConfig;

        /**
         * <p>同步入配置</p>
         */
        @NameInMap("UdPullConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailUdPullConfig udPullConfig;

        /**
         * <p>IDaaS EIAM 是否支持UD同步</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("UdPullStatus")
        public String udPullStatus;

        /**
         * <p>同步出配置</p>
         */
        @NameInMap("UdPushConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailUdPushConfig udPushConfig;

        /**
         * <p>同步出能力</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("UdPushStatus")
        public String udPushStatus;

        /**
         * <p>更新时间</p>
         * 
         * <strong>example:</strong>
         * <p>1726021079000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>企业微信</p>
         */
        @NameInMap("WeComConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailWeComConfig weComConfig;

        public static GetIdentityProviderResponseBodyIdentityProviderDetail build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyIdentityProviderDetail self = new GetIdentityProviderResponseBodyIdentityProviderDetail();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setAdvancedStatus(String advancedStatus) {
            this.advancedStatus = advancedStatus;
            return this;
        }
        public String getAdvancedStatus() {
            return this.advancedStatus;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setAuthnSourceSupplier(String authnSourceSupplier) {
            this.authnSourceSupplier = authnSourceSupplier;
            return this;
        }
        public String getAuthnSourceSupplier() {
            return this.authnSourceSupplier;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setAuthnSourceType(String authnSourceType) {
            this.authnSourceType = authnSourceType;
            return this;
        }
        public String getAuthnSourceType() {
            return this.authnSourceType;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setAuthnStatus(String authnStatus) {
            this.authnStatus = authnStatus;
            return this;
        }
        public String getAuthnStatus() {
            return this.authnStatus;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setDingtalkAppConfig(GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkAppConfig dingtalkAppConfig) {
            this.dingtalkAppConfig = dingtalkAppConfig;
            return this;
        }
        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkAppConfig getDingtalkAppConfig() {
            return this.dingtalkAppConfig;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setDingtalkProvisioningConfig(GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfig dingtalkProvisioningConfig) {
            this.dingtalkProvisioningConfig = dingtalkProvisioningConfig;
            return this;
        }
        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfig getDingtalkProvisioningConfig() {
            return this.dingtalkProvisioningConfig;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setIdentityProviderExternalId(String identityProviderExternalId) {
            this.identityProviderExternalId = identityProviderExternalId;
            return this;
        }
        public String getIdentityProviderExternalId() {
            return this.identityProviderExternalId;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setIdentityProviderId(String identityProviderId) {
            this.identityProviderId = identityProviderId;
            return this;
        }
        public String getIdentityProviderId() {
            return this.identityProviderId;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setIdentityProviderName(String identityProviderName) {
            this.identityProviderName = identityProviderName;
            return this;
        }
        public String getIdentityProviderName() {
            return this.identityProviderName;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setIdentityProviderType(String identityProviderType) {
            this.identityProviderType = identityProviderType;
            return this;
        }
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setLarkConfig(GetIdentityProviderResponseBodyIdentityProviderDetailLarkConfig larkConfig) {
            this.larkConfig = larkConfig;
            return this;
        }
        public GetIdentityProviderResponseBodyIdentityProviderDetailLarkConfig getLarkConfig() {
            return this.larkConfig;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setLastStatusCheckJobResult(String lastStatusCheckJobResult) {
            this.lastStatusCheckJobResult = lastStatusCheckJobResult;
            return this;
        }
        public String getLastStatusCheckJobResult() {
            return this.lastStatusCheckJobResult;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setLdapConfig(GetIdentityProviderResponseBodyIdentityProviderDetailLdapConfig ldapConfig) {
            this.ldapConfig = ldapConfig;
            return this;
        }
        public GetIdentityProviderResponseBodyIdentityProviderDetailLdapConfig getLdapConfig() {
            return this.ldapConfig;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }
        public String getLogoUrl() {
            return this.logoUrl;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setNetworkAccessEndpointId(String networkAccessEndpointId) {
            this.networkAccessEndpointId = networkAccessEndpointId;
            return this;
        }
        public String getNetworkAccessEndpointId() {
            return this.networkAccessEndpointId;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setOidcConfig(GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfig oidcConfig) {
            this.oidcConfig = oidcConfig;
            return this;
        }
        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfig getOidcConfig() {
            return this.oidcConfig;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setUdPullConfig(GetIdentityProviderResponseBodyIdentityProviderDetailUdPullConfig udPullConfig) {
            this.udPullConfig = udPullConfig;
            return this;
        }
        public GetIdentityProviderResponseBodyIdentityProviderDetailUdPullConfig getUdPullConfig() {
            return this.udPullConfig;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setUdPullStatus(String udPullStatus) {
            this.udPullStatus = udPullStatus;
            return this;
        }
        public String getUdPullStatus() {
            return this.udPullStatus;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setUdPushConfig(GetIdentityProviderResponseBodyIdentityProviderDetailUdPushConfig udPushConfig) {
            this.udPushConfig = udPushConfig;
            return this;
        }
        public GetIdentityProviderResponseBodyIdentityProviderDetailUdPushConfig getUdPushConfig() {
            return this.udPushConfig;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setUdPushStatus(String udPushStatus) {
            this.udPushStatus = udPushStatus;
            return this;
        }
        public String getUdPushStatus() {
            return this.udPushStatus;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetail setWeComConfig(GetIdentityProviderResponseBodyIdentityProviderDetailWeComConfig weComConfig) {
            this.weComConfig = weComConfig;
            return this;
        }
        public GetIdentityProviderResponseBodyIdentityProviderDetailWeComConfig getWeComConfig() {
            return this.weComConfig;
        }

    }

}
