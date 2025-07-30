// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetIdentityProviderResponseBody extends TeaModel {
    /**
     * <p>Identity provider Information.</p>
     */
    @NameInMap("IdentityProviderDetail")
    public GetIdentityProviderResponseBodyIdentityProviderDetail identityProviderDetail;

    /**
     * <p>The ID of the request.</p>
     * 
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
         * <p>The AppKey for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>41reopmwoy9s</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <p>The details of the application secret.</p>
         * 
         * <strong>example:</strong>
         * <p>REOQ6Cl55kriOd8NOBeqWYLKpHR4p6fdZxxxx</p>
         */
        @NameInMap("AppSecret")
        public String appSecret;

        /**
         * <p>DingTalk corpId.</p>
         * 
         * <strong>example:</strong>
         * <p>3756043633237690761</p>
         */
        @NameInMap("CorpId")
        public String corpId;

        /**
         * <p>DingTalk Version.</p>
         * 
         * <strong>example:</strong>
         * <p>public_dingtalk</p>
         */
        @NameInMap("DingtalkVersion")
        public String dingtalkVersion;

        /**
         * <p>DingTalk  encrypt key.</p>
         * 
         * <strong>example:</strong>
         * <p>29003eb11d0a28b4802a6f02fb8aa25dff730e2ac26ffdxxx</p>
         */
        @NameInMap("EncryptKey")
        public String encryptKey;

        /**
         * <p>DingTalk  verification token.</p>
         * 
         * <strong>example:</strong>
         * <p>5ba9c127a7abe029003eb11d0a28b4802a6f02fb8aa25dff730e2ac26ffxxxxx</p>
         */
        @NameInMap("VerificationToken")
        public String verificationToken;

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

        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkAppConfig setEncryptKey(String encryptKey) {
            this.encryptKey = encryptKey;
            return this;
        }
        public String getEncryptKey() {
            return this.encryptKey;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkAppConfig setVerificationToken(String verificationToken) {
            this.verificationToken = verificationToken;
            return this;
        }
        public String getVerificationToken() {
            return this.verificationToken;
        }

    }

    public static class GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedDepartmentIds extends TeaModel {
        /**
         * <p>Department ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123xxx444</p>
         */
        @NameInMap("DeptId")
        public String deptId;

        /**
         * <p>Department name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_xxx</p>
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
         * <p>DingTalk user name.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>DingTalk user id.</p>
         * 
         * <strong>example:</strong>
         * <p>13030833392920xxx</p>
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
         * <p>List of authorized DingTalk departments.</p>
         */
        @NameInMap("AuthedDepartmentIds")
        public java.util.List<GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedDepartmentIds> authedDepartmentIds;

        /**
         * <p>Authorized DingTalk account list.</p>
         */
        @NameInMap("AuthedUsers")
        public java.util.List<GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedUsers> authedUsers;

        /**
         * <p>DingTalk enterprise corpId.</p>
         * 
         * <strong>example:</strong>
         * <p>ding_xxxxx</p>
         */
        @NameInMap("CorpId")
        public String corpId;

        /**
         * <p>The name of the company.</p>
         * 
         * <strong>example:</strong>
         * <p>test_xxx</p>
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
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cli_a7a99f53a317xxxx</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("AppSecret")
        public String appSecret;

        /**
         * <p>Feishu encryptKey.</p>
         * 
         * <strong>example:</strong>
         * <p>c5db46da8d4b751a7878e5d670402fb60e4d2391de3fa01f7c9e6353f6d1xxxxx</p>
         */
        @NameInMap("EncryptKey")
        public String encryptKey;

        /**
         * <p>Feishu enterprise code.</p>
         * 
         * <strong>example:</strong>
         * <p>FX1231xxxx</p>
         */
        @NameInMap("EnterpriseNumber")
        public String enterpriseNumber;

        /**
         * <p>Feishu verificationToken.</p>
         * 
         * <strong>example:</strong>
         * <p>c5db46da8d4b751a7878e5d670402fb60e4d2391de3fa01f7c9e6353f6d1xxxxx</p>
         */
        @NameInMap("VerificationToken")
        public String verificationToken;

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

        public GetIdentityProviderResponseBodyIdentityProviderDetailLarkConfig setEncryptKey(String encryptKey) {
            this.encryptKey = encryptKey;
            return this;
        }
        public String getEncryptKey() {
            return this.encryptKey;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailLarkConfig setEnterpriseNumber(String enterpriseNumber) {
            this.enterpriseNumber = enterpriseNumber;
            return this;
        }
        public String getEnterpriseNumber() {
            return this.enterpriseNumber;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailLarkConfig setVerificationToken(String verificationToken) {
            this.verificationToken = verificationToken;
            return this;
        }
        public String getVerificationToken() {
            return this.verificationToken;
        }

    }

    public static class GetIdentityProviderResponseBodyIdentityProviderDetailLdapConfig extends TeaModel {
        /**
         * <p>Administrator password.</p>
         * 
         * <strong>example:</strong>
         * <p>XXXX</p>
         */
        @NameInMap("AdministratorPassword")
        public String administratorPassword;

        /**
         * <p>Administrator username.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("AdministratorUsername")
        public String administratorUsername;

        /**
         * <p>Whether to verify the fingerprint certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("CertificateFingerprintStatus")
        public String certificateFingerprintStatus;

        /**
         * <p>Certificate fingerprint list.</p>
         */
        @NameInMap("CertificateFingerprints")
        public java.util.List<String> certificateFingerprints;

        /**
         * <p>Ldap protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>ldap</p>
         */
        @NameInMap("LdapProtocol")
        public String ldapProtocol;

        /**
         * <p>ldap server host.</p>
         * 
         * <strong>example:</strong>
         * <p>127.xx.xx.100</p>
         */
        @NameInMap("LdapServerHost")
        public String ldapServerHost;

        /**
         * <p>ldap server port.</p>
         * 
         * <strong>example:</strong>
         * <p>389</p>
         */
        @NameInMap("LdapServerPort")
        public Integer ldapServerPort;

        /**
         * <p>StartTls status.</p>
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
         * <p>OIDC/OAuth2 authentication method.</p>
         * 
         * <strong>example:</strong>
         * <p>client_secret_post</p>
         */
        @NameInMap("AuthnMethod")
        public String authnMethod;

        /**
         * <p>The client ID of the device whose access credential you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The application secret registered with the OIDC authentication service.</p>
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
         * <p>OAuth2 authorization endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/oauth/authorize">https://example.com/oauth/authorize</a></p>
         */
        @NameInMap("AuthorizationEndpoint")
        public String authorizationEndpoint;

        /**
         * <p>The CA that issued the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/oauth">https://example.com/oauth</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>Jwks uri.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/oauth/jwks">https://example.com/oauth/jwks</a></p>
         */
        @NameInMap("JwksUri")
        public String jwksUri;

        /**
         * <p>Token endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/oauth/token">https://example.com/oauth/token</a></p>
         */
        @NameInMap("TokenEndpoint")
        public String tokenEndpoint;

        /**
         * <p>OIDC user info endpoint.</p>
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
         * <p>OIDC client authentication configuration.</p>
         */
        @NameInMap("AuthnParam")
        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigAuthnParam authnParam;

        /**
         * <p>OIDC endpoint configuration.</p>
         */
        @NameInMap("EndpointConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigEndpointConfig endpointConfig;

        /**
         * <p>OIDC authorization scope list.</p>
         * 
         * <strong>example:</strong>
         * <p>openid</p>
         */
        @NameInMap("GrantScopes")
        public java.util.List<String> grantScopes;

        /**
         * <p>OIDC authorization grant type.</p>
         * 
         * <strong>example:</strong>
         * <p>authorization_code</p>
         */
        @NameInMap("GrantType")
        public String grantType;

        /**
         * <p>Supported PKCE code challenge methods.</p>
         * 
         * <strong>example:</strong>
         * <p>S256</p>
         */
        @NameInMap("PkceChallengeMethod")
        public String pkceChallengeMethod;

        /**
         * <p>Whether to use PKCE in authorization code grant flow.</p>
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
         * <p>Synchronization source node.</p>
         */
        @NameInMap("SourceScopes")
        public java.util.List<String> sourceScopes;

        /**
         * <p>Synchronization target node.</p>
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
         * <p>Whether to enable group synchronization. Possible values:</p>
         * <p>Disabled: disabled</p>
         * <p>Enabled: enabled</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("GroupSyncStatus")
        public String groupSyncStatus;

        /**
         * <p>Incremental callback status: Whether to process incremental callback data from the IdP.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("IncrementalCallbackStatus")
        public String incrementalCallbackStatus;

        /**
         * <p>Inbound synchronization configuration Information.</p>
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
         * <p>Synchronization source node.</p>
         */
        @NameInMap("SourceScopes")
        public java.util.List<String> sourceScopes;

        /**
         * <p>Synchronization target node.</p>
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
         * <p>Incremental callback status: Whether to process incremental callback data from the IdP.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("IncrementalCallbackStatus")
        public String incrementalCallbackStatus;

        /**
         * <p>Outbound synchronization configuration Information.</p>
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
         * <p>The ID of the load generator. This parameter is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1242350</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>Authorization callback domain.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/xxxx">https://example.com/xxxx</a></p>
         */
        @NameInMap("AuthorizeCallbackDomain")
        public String authorizeCallbackDomain;

        /**
         * <p>CorpId.</p>
         * 
         * <strong>example:</strong>
         * <p>356201295345457xxxxx</p>
         */
        @NameInMap("CorpId")
        public String corpId;

        /**
         * <p>Corp secret.</p>
         * 
         * <strong>example:</strong>
         * <p>weaseiszjskejskaj12sjeszojxxxx</p>
         */
        @NameInMap("CorpSecret")
        public String corpSecret;

        /**
         * <p>Trusted domain.</p>
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
         * <p>Advanced configuration capability. 
         * Value range:<br>Disabled: disabled<br>Enable: enabled</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("AdvancedStatus")
        public String advancedStatus;

        /**
         * <p>The corresponding identity provider product, e.g., Okta, Google, or Azure AD. Possible values:</p>
         * <p>DingTalk: urn:alibaba:idaas:idp:alibaba:dingtalk</p>
         * <p>LDAP: urn:alibaba:idaas:idp:unknown:ldap</p>
         * <p>Alibaba Cloud IDaaS: urn:alibaba:idaas:idp:alibaba:idaas</p>
         * <p>WeCom (Enterprise WeChat): urn:alibaba:idaas:idp:tencent:wecom</p>
         * <p>Lark (Feishu): urn:alibaba:idaas:idp:bytedance:lark</p>
         * <p>Active Directory: urn:alibaba:idaas:idp:microsoft:ad</p>
         * <p>Azure Active Directory: urn:alibaba:idaas:idp:microsoft:aad</p>
         * <p>Alibaba Cloud SASE: urn:alibaba:idaas:idp:alibaba:sase</p>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:idp:bytedance:lark</p>
         */
        @NameInMap("AuthnSourceSupplier")
        public String authnSourceSupplier;

        /**
         * <p>Authentication type — OIDC or SAML. Possible values:</p>
         * <p>OIDC: urn:alibaba:idaas:authntype:oidc</p>
         * <p>SAML: urn:alibaba:idaas:authntype:saml2</p>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:authntype:oidc</p>
         */
        @NameInMap("AuthnSourceType")
        public String authnSourceType;

        /**
         * <p>Whether the corresponding IdP supports authentication. Value range: 
         * Disabled: disabled<br>Enabled: enabled</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("AuthnStatus")
        public String authnStatus;

        /**
         * <p>The time when the version was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1726021079000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Identity provider description.</p>
         * 
         * <strong>example:</strong>
         * <p>for poc test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>DingTalk Basic Configuration</p>
         */
        @NameInMap("DingtalkAppConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkAppConfig dingtalkAppConfig;

        /**
         * <p>DingTalk synchronous configuration.</p>
         */
        @NameInMap("DingtalkProvisioningConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfig dingtalkProvisioningConfig;

        /**
         * <p>Identity provider external ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idp_xxxx</p>
         */
        @NameInMap("IdentityProviderExternalId")
        public String identityProviderExternalId;

        /**
         * <p>Identity provider ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idp_mwpcwnhrimlr2horx7xgg7xxxx</p>
         */
        @NameInMap("IdentityProviderId")
        public String identityProviderId;

        /**
         * <p>Identity provider name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("IdentityProviderName")
        public String identityProviderName;

        /**
         * <p>Identity provider type.</p>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:idp:alibaba:dingtalk:push</p>
         */
        @NameInMap("IdentityProviderType")
        public String identityProviderType;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_x2df3bak3uwnapqm6xxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Lark configuration.</p>
         */
        @NameInMap("LarkConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailLarkConfig larkConfig;

        /**
         * <p>Last status check result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("LastStatusCheckJobResult")
        public String lastStatusCheckJobResult;

        /**
         * <p>AD/LDAP Identity provider information.</p>
         */
        @NameInMap("LdapConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailLdapConfig ldapConfig;

        /**
         * <p>The reason why write operations on the instance are locked.</p>
         * 
         * <strong>example:</strong>
         * <p>financial</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The URL of the application logo.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/imgextra/i4/O1CN01OB8fJj22fpoZm4sd0_!!6000000007148-2-tps-149-xxx.png">https://img.alicdn.com/imgextra/i4/O1CN01OB8fJj22fpoZm4sd0_!!6000000007148-2-tps-149-xxx.png</a></p>
         */
        @NameInMap("LogoUrl")
        public String logoUrl;

        /**
         * <p>The unique identifier of the network access endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>nae_mx4vsadfe6govkqkwckxxxx</p>
         */
        @NameInMap("NetworkAccessEndpointId")
        public String networkAccessEndpointId;

        /**
         * <p>OIDC IdP configuration.</p>
         */
        @NameInMap("OidcConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfig oidcConfig;

        /**
         * <p>Sync in configuration.</p>
         */
        @NameInMap("UdPullConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailUdPullConfig udPullConfig;

        /**
         * <p>Indicates whether the IDaaS EIAM system supports UD (User Directory) synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("UdPullStatus")
        public String udPullStatus;

        /**
         * <p>Outbound synchronization configuration.</p>
         */
        @NameInMap("UdPushConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailUdPushConfig udPushConfig;

        /**
         * <p>Outbound synchronization capability.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("UdPushStatus")
        public String udPushStatus;

        /**
         * <p>The time when the serviceInstance  was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1726021079000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>WeCom configuration.</p>
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
