// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetIdentityProviderResponseBody extends TeaModel {
    /**
     * <p>The identity provider information.</p>
     */
    @NameInMap("IdentityProviderDetail")
    public GetIdentityProviderResponseBodyIdentityProviderDetail identityProviderDetail;

    /**
     * <p>The request ID.</p>
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
         * <p>The AppKey of the DingTalk first-party application.</p>
         * 
         * <strong>example:</strong>
         * <p>41reopmwoy9s</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <p>The AppSecret of the DingTalk first-party application.</p>
         * 
         * <strong>example:</strong>
         * <p>REOQ6Cl55kriOd8NOBeqWYLKpHR4p6fdZxxxx</p>
         */
        @NameInMap("AppSecret")
        public String appSecret;

        /**
         * <p>The CorpId of the DingTalk first-party application.</p>
         * 
         * <strong>example:</strong>
         * <p>3756043633237690761</p>
         */
        @NameInMap("CorpId")
        public String corpId;

        /**
         * <p>The DingTalk QR code logon version.</p>
         * 
         * <strong>example:</strong>
         * <p>old_version</p>
         */
        @NameInMap("DingtalkLoginVersion")
        public String dingtalkLoginVersion;

        /**
         * <p>The DingTalk version. Valid values:</p>
         * <ul>
         * <li><p>public_dingtalk: Standard DingTalk.</p>
         * </li>
         * <li><p>private_dingtalk: Dedicated DingTalk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public_dingtalk</p>
         */
        @NameInMap("DingtalkVersion")
        public String dingtalkVersion;

        /**
         * <p>The EncryptKey of the DingTalk application.</p>
         * 
         * <strong>example:</strong>
         * <p>29003eb11d0a28b4802a6f02fb8aa25dff730e2ac26ffd200d</p>
         */
        @NameInMap("EncryptKey")
        public String encryptKey;

        /**
         * <p>The VerificationToken of the DingTalk application.</p>
         * 
         * <strong>example:</strong>
         * <p>5ba9c127a7abe029003eb11d0a28b4802a6f02fb8aa25dff730e2ac26ffd200d</p>
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

        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkAppConfig setDingtalkLoginVersion(String dingtalkLoginVersion) {
            this.dingtalkLoginVersion = dingtalkLoginVersion;
            return this;
        }
        public String getDingtalkLoginVersion() {
            return this.dingtalkLoginVersion;
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
         * <p>The DingTalk department ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123xxx444</p>
         */
        @NameInMap("DeptId")
        public String deptId;

        /**
         * <p>The DingTalk department name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_department</p>
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
         * <p>The DingTalk username.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The DingTalk user ID.</p>
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
         * <p>The authorized DingTalk departments.</p>
         */
        @NameInMap("AuthedDepartmentIds")
        public java.util.List<GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedDepartmentIds> authedDepartmentIds;

        /**
         * <p>The list of authorized DingTalk accounts.</p>
         */
        @NameInMap("AuthedUsers")
        public java.util.List<GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfigAuthedUsers> authedUsers;

        /**
         * <p>The DingTalk enterprise CorpId.</p>
         * 
         * <strong>example:</strong>
         * <p>ding_xxxxx</p>
         */
        @NameInMap("CorpId")
        public String corpId;

        /**
         * <p>The DingTalk enterprise name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_enterprise</p>
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

    public static class GetIdentityProviderResponseBodyIdentityProviderDetailEndpointMetadata extends TeaModel {
        /**
         * <p>The SAML Assertion Consumer Service (ACS) endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://9test.aliyunidaas.com/login/saml2/idp_nhlraxfiwsx7w7zp26qzyoxxxx/acs">https://9test.aliyunidaas.com/login/saml2/idp_nhlraxfiwsx7w7zp26qzyoxxxx/acs</a></p>
         */
        @NameInMap("SamlAcsEndpoint")
        public String samlAcsEndpoint;

        /**
         * <p>The SAML EntityId.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://9test.aliyunidaas.com/login/saml2/idp_nhlraxfiwsx7w7zp26qzyoxxxx/meta">https://9test.aliyunidaas.com/login/saml2/idp_nhlraxfiwsx7w7zp26qzyoxxxx/meta</a></p>
         */
        @NameInMap("SamlEntityId")
        public String samlEntityId;

        /**
         * <p>The SAML metadata endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://9test.aliyunidaas.com/login/saml2/idp_nhlraxfiwsx7w7zp26qzyoxxxx/meta">https://9test.aliyunidaas.com/login/saml2/idp_nhlraxfiwsx7w7zp26qzyoxxxx/meta</a></p>
         */
        @NameInMap("SamlMetaEndpoint")
        public String samlMetaEndpoint;

        public static GetIdentityProviderResponseBodyIdentityProviderDetailEndpointMetadata build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyIdentityProviderDetailEndpointMetadata self = new GetIdentityProviderResponseBodyIdentityProviderDetailEndpointMetadata();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailEndpointMetadata setSamlAcsEndpoint(String samlAcsEndpoint) {
            this.samlAcsEndpoint = samlAcsEndpoint;
            return this;
        }
        public String getSamlAcsEndpoint() {
            return this.samlAcsEndpoint;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailEndpointMetadata setSamlEntityId(String samlEntityId) {
            this.samlEntityId = samlEntityId;
            return this;
        }
        public String getSamlEntityId() {
            return this.samlEntityId;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailEndpointMetadata setSamlMetaEndpoint(String samlMetaEndpoint) {
            this.samlMetaEndpoint = samlMetaEndpoint;
            return this;
        }
        public String getSamlMetaEndpoint() {
            return this.samlMetaEndpoint;
        }

    }

    public static class GetIdentityProviderResponseBodyIdentityProviderDetailLarkConfig extends TeaModel {
        /**
         * <p>The AppId of the Lark self-built application.</p>
         * 
         * <strong>example:</strong>
         * <p>cli_a7a99f53a317100c</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The AppSecret of the Lark self-built application.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("AppSecret")
        public String appSecret;

        /**
         * <p>The EncryptKey of the Lark self-built application.</p>
         * 
         * <strong>example:</strong>
         * <p>VkdWw91mdkrjVFr3ObNwefap21dfbZbK</p>
         */
        @NameInMap("EncryptKey")
        public String encryptKey;

        /**
         * <p>The Lark enterprise number.</p>
         * 
         * <strong>example:</strong>
         * <p>FX1231xxxx</p>
         */
        @NameInMap("EnterpriseNumber")
        public String enterpriseNumber;

        /**
         * <p>The VerificationToken of the Lark self-built application.</p>
         * 
         * <strong>example:</strong>
         * <p>VkdWw91mdkrjVFr3ObNwefap21dfbZbK</p>
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
         * <p>The AD/LDAP administrator password.</p>
         * 
         * <strong>example:</strong>
         * <p>XXXX</p>
         */
        @NameInMap("AdministratorPassword")
        public String administratorPassword;

        /**
         * <p>The AD/LDAP administrator account.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("AdministratorUsername")
        public String administratorUsername;

        /**
         * <p>Specifies whether to verify the certificate fingerprint. Valid values:</p>
         * <ul>
         * <li><p>disabled: Disabled.</p>
         * </li>
         * <li><p>enabled: Enabled.</p>
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
         * <p>The communication protocol of AD/LDAP.</p>
         * 
         * <strong>example:</strong>
         * <p>ldap</p>
         */
        @NameInMap("LdapProtocol")
        public String ldapProtocol;

        /**
         * <p>The AD/LDAP server address.</p>
         * 
         * <strong>example:</strong>
         * <p>127.xx.xx.100</p>
         */
        @NameInMap("LdapServerHost")
        public String ldapServerHost;

        /**
         * <p>The AD/LDAP server address.</p>
         * 
         * <strong>example:</strong>
         * <p>389</p>
         */
        @NameInMap("LdapServerPort")
        public Integer ldapServerPort;

        /**
         * <p>Specifies whether StartTLS is enabled. Valid values:</p>
         * <ul>
         * <li><p>disabled: Disabled.</p>
         * </li>
         * <li><p>enabled: Enabled.</p>
         * </li>
         * </ul>
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
         * <p>The OIDC authentication method.</p>
         * 
         * <strong>example:</strong>
         * <p>client_secret_post</p>
         */
        @NameInMap("AuthnMethod")
        public String authnMethod;

        /**
         * <p>The OIDC client ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The OIDC client secret.</p>
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
         * <p>The OIDC authorization endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/oauth/authorize">https://example.com/oauth/authorize</a></p>
         */
        @NameInMap("AuthorizationEndpoint")
        public String authorizationEndpoint;

        /**
         * <p>The OIDC issuer information.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/oauth">https://example.com/oauth</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The OIDC JWKS URI.</p>
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
         * <p>The OIDC user information endpoint.</p>
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
         * <p>The OIDC client authentication configuration.</p>
         */
        @NameInMap("AuthnParam")
        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigAuthnParam authnParam;

        /**
         * <p>The OIDC endpoint configuration.</p>
         */
        @NameInMap("EndpointConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfigEndpointConfig endpointConfig;

        /**
         * <p>The list of OIDC grant scopes.</p>
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
         * <p>The PKCE algorithm. Valid values:</p>
         * <ul>
         * <li><p>S256: SHA-256.</p>
         * </li>
         * <li><p>plain: Plaintext.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S256</p>
         */
        @NameInMap("PkceChallengeMethod")
        public String pkceChallengeMethod;

        /**
         * <p>Specifies whether to use PKCE in the AuthorizationCode grant mode.</p>
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

    public static class GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfigCertificatesCertificateMetadata extends TeaModel {
        /**
         * <p>The latest validity date of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>1704067200000</p>
         */
        @NameInMap("NotAfter")
        public Long notAfter;

        /**
         * <p>The earliest validity date of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>1672531200000</p>
         */
        @NameInMap("NotBefore")
        public Long notBefore;

        public static GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfigCertificatesCertificateMetadata build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfigCertificatesCertificateMetadata self = new GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfigCertificatesCertificateMetadata();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfigCertificatesCertificateMetadata setNotAfter(Long notAfter) {
            this.notAfter = notAfter;
            return this;
        }
        public Long getNotAfter() {
            return this.notAfter;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfigCertificatesCertificateMetadata setNotBefore(Long notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public Long getNotBefore() {
            return this.notBefore;
        }

    }

    public static class GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfigCertificates extends TeaModel {
        /**
         * <p>The certificate metadata.</p>
         */
        @NameInMap("CertificateMetadata")
        public GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfigCertificatesCertificateMetadata certificateMetadata;

        /**
         * <p>The certificate content.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE----- MIIC0jCCAbqgAwIBAgIQXXXXX -----END CERTIFICATE-----</p>
         */
        @NameInMap("Content")
        public String content;

        public static GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfigCertificates build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfigCertificates self = new GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfigCertificates();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfigCertificates setCertificateMetadata(GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfigCertificatesCertificateMetadata certificateMetadata) {
            this.certificateMetadata = certificateMetadata;
            return this;
        }
        public GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfigCertificatesCertificateMetadata getCertificateMetadata() {
            return this.certificateMetadata;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfigCertificates setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfig extends TeaModel {
        /**
         * <p>The binding type.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP-REDIRECT</p>
         */
        @NameInMap("BindingMethod")
        public String bindingMethod;

        /**
         * <p>The list of IdP signing certificates.</p>
         */
        @NameInMap("Certificates")
        public java.util.List<GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfigCertificates> certificates;

        /**
         * <p>The EntityId of the IdP.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://dc.test.com/adfs/services/trust">http://dc.test.com/adfs/services/trust</a></p>
         */
        @NameInMap("IdPEntityId")
        public String idPEntityId;

        /**
         * <p>The logon URL of the IdP.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dc.test.com/adfs/ls/">https://dc.test.com/adfs/ls/</a></p>
         */
        @NameInMap("IdPSsoUrl")
        public String idPSsoUrl;

        /**
         * <p>The maximum clock skew.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("MaxClockSkew")
        public Long maxClockSkew;

        /**
         * <p>Specifies whether the request must be signed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RequireRequestSigned")
        public Boolean requireRequestSigned;

        @NameInMap("WantAssertionsSigned")
        public Boolean wantAssertionsSigned;

        @NameInMap("WantResponseSigned")
        public Boolean wantResponseSigned;

        public static GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfig self = new GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfig();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfig setBindingMethod(String bindingMethod) {
            this.bindingMethod = bindingMethod;
            return this;
        }
        public String getBindingMethod() {
            return this.bindingMethod;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfig setCertificates(java.util.List<GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfigCertificates> certificates) {
            this.certificates = certificates;
            return this;
        }
        public java.util.List<GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfigCertificates> getCertificates() {
            return this.certificates;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfig setIdPEntityId(String idPEntityId) {
            this.idPEntityId = idPEntityId;
            return this;
        }
        public String getIdPEntityId() {
            return this.idPEntityId;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfig setIdPSsoUrl(String idPSsoUrl) {
            this.idPSsoUrl = idPSsoUrl;
            return this;
        }
        public String getIdPSsoUrl() {
            return this.idPSsoUrl;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfig setMaxClockSkew(Long maxClockSkew) {
            this.maxClockSkew = maxClockSkew;
            return this;
        }
        public Long getMaxClockSkew() {
            return this.maxClockSkew;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfig setRequireRequestSigned(Boolean requireRequestSigned) {
            this.requireRequestSigned = requireRequestSigned;
            return this;
        }
        public Boolean getRequireRequestSigned() {
            return this.requireRequestSigned;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfig setWantAssertionsSigned(Boolean wantAssertionsSigned) {
            this.wantAssertionsSigned = wantAssertionsSigned;
            return this;
        }
        public Boolean getWantAssertionsSigned() {
            return this.wantAssertionsSigned;
        }

        public GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfig setWantResponseSigned(Boolean wantResponseSigned) {
            this.wantResponseSigned = wantResponseSigned;
            return this;
        }
        public Boolean getWantResponseSigned() {
            return this.wantResponseSigned;
        }

    }

    public static class GetIdentityProviderResponseBodyIdentityProviderDetailUdPullConfigUdSyncScopeConfig extends TeaModel {
        /**
         * <p>The list of synchronization source nodes.</p>
         */
        @NameInMap("SourceScopes")
        public java.util.List<String> sourceScopes;

        /**
         * <p>The synchronization target node.</p>
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
         * <p>Specifies whether group synchronization is enabled. Valid values:</p>
         * <ul>
         * <li><p>disabled: Disabled.</p>
         * </li>
         * <li><p>enabled: Enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("GroupSyncStatus")
        public String groupSyncStatus;

        /**
         * <p>The incremental callback status. Specifies whether to process incremental callback data from the IdP. Valid values:</p>
         * <ul>
         * <li><p>disabled: Disabled.</p>
         * </li>
         * <li><p>enabled: Enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("IncrementalCallbackStatus")
        public String incrementalCallbackStatus;

        /**
         * <p>The synchronization scope configuration.</p>
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
         * <p>The list of synchronization source nodes.</p>
         */
        @NameInMap("SourceScopes")
        public java.util.List<String> sourceScopes;

        /**
         * <p>The synchronization target node.</p>
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
         * <p>This field is not in use. Ignore it.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("IncrementalCallbackStatus")
        public String incrementalCallbackStatus;

        /**
         * <p>The list of synchronization scope configurations.</p>
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
         * <p>The ID of the WeCom self-built application.</p>
         * 
         * <strong>example:</strong>
         * <p>1242350</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>The authorization callback domain.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/xxxx">https://example.com/xxxx</a></p>
         */
        @NameInMap("AuthorizeCallbackDomain")
        public String authorizeCallbackDomain;

        /**
         * <p>The CorpId of the WeCom self-built application.</p>
         * 
         * <strong>example:</strong>
         * <p>3562012953454577801</p>
         */
        @NameInMap("CorpId")
        public String corpId;

        /**
         * <p>The CorpSecret of the WeCom self-built application.</p>
         * 
         * <strong>example:</strong>
         * <p>weaseiszjskejskaj12sjeszojxxxx</p>
         */
        @NameInMap("CorpSecret")
        public String corpSecret;

        /**
         * <p>The trusted domain name.</p>
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
         * <p>The advanced configuration status. Valid values:</p>
         * <ul>
         * <li><p>disabled: Disabled.</p>
         * </li>
         * <li><p>enabled: Enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("AdvancedStatus")
        public String advancedStatus;

        /**
         * <p>The authentication source product, such as Okta, Google, or Azure AD. Valid values:</p>
         * <ul>
         * <li><p>urn:alibaba:idaas:idp:alibaba:dingtalk: DingTalk.</p>
         * </li>
         * <li><p>urn:alibaba:idaas:idp:unknown:ldap: LDAP.</p>
         * </li>
         * <li><p>urn:alibaba:idaas:idp:alibaba:idaas: Alibaba Cloud IDaaS.</p>
         * </li>
         * <li><p>urn:alibaba:idaas:idp:tencent:wecom: WeCom.</p>
         * </li>
         * <li><p>urn:alibaba:idaas:idp:bytedance:lark: Lark.</p>
         * </li>
         * <li><p>urn:alibaba:idaas:idp:microsoft:ad: Active Directory.</p>
         * </li>
         * <li><p>urn:alibaba:idaas:idp:microsoft:aad: Azure Active Directory.</p>
         * </li>
         * <li><p>urn:alibaba:idaas:idp:alibaba:sase: Alibaba Cloud SASE.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:idp:bytedance:lark</p>
         */
        @NameInMap("AuthnSourceSupplier")
        public String authnSourceSupplier;

        /**
         * <p>The authentication method type, such as OIDC or SAML. Valid values:</p>
         * <ul>
         * <li><p>urn:alibaba:idaas:authntype:oidc: OIDC.</p>
         * </li>
         * <li><p>urn:alibaba:idaas:authntype:saml2: SAML.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:authntype:oidc</p>
         */
        @NameInMap("AuthnSourceType")
        public String authnSourceType;

        /**
         * <p>Specifies whether the corresponding IdP supports authentication. Valid values:</p>
         * <ul>
         * <li><p>disabled: Disabled.</p>
         * </li>
         * <li><p>enabled: Enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("AuthnStatus")
        public String authnStatus;

        /**
         * <p>The creation time, in UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1726021079000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>for poc test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The DingTalk basic configuration.</p>
         */
        @NameInMap("DingtalkAppConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkAppConfig dingtalkAppConfig;

        /**
         * <p>The DingTalk synchronization configuration. This value is returned only for DingTalk identity providers.</p>
         */
        @NameInMap("DingtalkProvisioningConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailDingtalkProvisioningConfig dingtalkProvisioningConfig;

        /**
         * <p>The endpoint metadata.</p>
         */
        @NameInMap("EndpointMetadata")
        public GetIdentityProviderResponseBodyIdentityProviderDetailEndpointMetadata endpointMetadata;

        /**
         * <p>The external ID of the identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>idp_xxxx</p>
         */
        @NameInMap("IdentityProviderExternalId")
        public String identityProviderExternalId;

        /**
         * <p>The identity provider ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idp_mwpcwnhrimlr2horx7xgg7pp7y</p>
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
         * <p>The synchronization type of the identity provider. Valid values:</p>
         * <ul>
         * <li><p>urn:alibaba:idaas:idp:alibaba:dingtalk:pull: Inbound DingTalk.</p>
         * </li>
         * <li><p>urn:alibaba:idaas:idp:alibaba:dingtalk:push: Outbound DingTalk.</p>
         * </li>
         * <li><p>urn:alibaba:idaas:idp:tencent:wecom:pull: Inbound WeCom.</p>
         * </li>
         * <li><p>urn:alibaba:idaas:idp:bytedance:lark:pull: Inbound Lark.</p>
         * </li>
         * <li><p>urn:alibaba:idaas:idp:microsoft:ad:pull: Inbound AD.</p>
         * </li>
         * <li><p>urn:alibaba:idaas:idp:unknown:ldap:pull: Inbound LDAP.</p>
         * </li>
         * <li><p>urn:alibaba:idaas:idp:standard:oidc: Standard OIDC.</p>
         * </li>
         * <li><p>urn:alibaba:idaas:idp:alibaba:sase: SASE custom OIDC.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:idp:alibaba:dingtalk:push</p>
         */
        @NameInMap("IdentityProviderType")
        public String identityProviderType;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_x2df3bak3uwnapqm6xxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The Lark configuration.</p>
         */
        @NameInMap("LarkConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailLarkConfig larkConfig;

        /**
         * <p>The result of the last status check.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("LastStatusCheckJobResult")
        public String lastStatusCheckJobResult;

        /**
         * <p>The AD/LDAP identity provider configuration.</p>
         */
        @NameInMap("LdapConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailLdapConfig ldapConfig;

        /**
         * <p>The lock reason.</p>
         * 
         * <strong>example:</strong>
         * <p>financial</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The custom logo URL of the identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/imgextra/i4/O1CN01lvYwpv1aGowQXDML9_!!6000000003303-0-tps-580-580.jpg">https://img.alicdn.com/imgextra/i4/O1CN01lvYwpv1aGowQXDML9_!!6000000003303-0-tps-580-580.jpg</a></p>
         */
        @NameInMap("LogoUrl")
        public String logoUrl;

        /**
         * <p>The network endpoint ID.</p>
         * 
         * <strong>example:</strong>
         * <p>nae_mx4vsadfe6govkqkwckxxxx</p>
         */
        @NameInMap("NetworkAccessEndpointId")
        public String networkAccessEndpointId;

        /**
         * <p>The OIDC IdP configuration.</p>
         */
        @NameInMap("OidcConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailOidcConfig oidcConfig;

        /**
         * <p>The SAML IdP configuration.</p>
         */
        @NameInMap("SamlConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfig samlConfig;

        /**
         * <p>The inbound synchronization configuration.</p>
         */
        @NameInMap("UdPullConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailUdPullConfig udPullConfig;

        /**
         * <p>Specifies whether the inbound synchronization feature is supported. Valid values:</p>
         * <ul>
         * <li><p>disabled: Disabled.</p>
         * </li>
         * <li><p>enabled: Enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("UdPullStatus")
        public String udPullStatus;

        /**
         * <p>The outbound synchronization configuration.</p>
         */
        @NameInMap("UdPushConfig")
        public GetIdentityProviderResponseBodyIdentityProviderDetailUdPushConfig udPushConfig;

        /**
         * <p>Specifies whether the outbound synchronization feature is enabled. Valid values:</p>
         * <ul>
         * <li><p>disabled: Disabled.</p>
         * </li>
         * <li><p>enabled: Enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("UdPushStatus")
        public String udPushStatus;

        /**
         * <p>The update time, in UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1726021079000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The WeCom configuration.</p>
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

        public GetIdentityProviderResponseBodyIdentityProviderDetail setEndpointMetadata(GetIdentityProviderResponseBodyIdentityProviderDetailEndpointMetadata endpointMetadata) {
            this.endpointMetadata = endpointMetadata;
            return this;
        }
        public GetIdentityProviderResponseBodyIdentityProviderDetailEndpointMetadata getEndpointMetadata() {
            return this.endpointMetadata;
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

        public GetIdentityProviderResponseBodyIdentityProviderDetail setSamlConfig(GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfig samlConfig) {
            this.samlConfig = samlConfig;
            return this;
        }
        public GetIdentityProviderResponseBodyIdentityProviderDetailSamlConfig getSamlConfig() {
            return this.samlConfig;
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
