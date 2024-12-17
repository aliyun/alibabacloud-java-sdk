// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateIdentityProviderRequest extends TeaModel {
    /**
     * <p>认证配置</p>
     */
    @NameInMap("AuthnConfig")
    public CreateIdentityProviderRequestAuthnConfig authnConfig;

    /**
     * <p>自动创建账户账户规则配置。</p>
     */
    @NameInMap("AutoCreateUserConfig")
    public CreateIdentityProviderRequestAutoCreateUserConfig autoCreateUserConfig;

    /**
     * <p>自动更新账户规则配置。</p>
     */
    @NameInMap("AutoUpdateUserConfig")
    public CreateIdentityProviderRequestAutoUpdateUserConfig autoUpdateUserConfig;

    /**
     * <p>账户绑定规则配置。</p>
     */
    @NameInMap("BindingConfig")
    public CreateIdentityProviderRequestBindingConfig bindingConfig;

    /**
     * <p>钉钉配置</p>
     */
    @NameInMap("DingtalkAppConfig")
    public CreateIdentityProviderRequestDingtalkAppConfig dingtalkAppConfig;

    /**
     * <p>身份提供方名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("IdentityProviderName")
    public String identityProviderName;

    /**
     * <p>身份提供发类型</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>urn:alibaba:idaas:idp:alibaba:dingtalk:push</p>
     */
    @NameInMap("IdentityProviderType")
    public String identityProviderType;

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
    public CreateIdentityProviderRequestLarkConfig larkConfig;

    /**
     * <p>AD/LDAP配置</p>
     */
    @NameInMap("LdapConfig")
    public CreateIdentityProviderRequestLdapConfig ldapConfig;

    @NameInMap("LogoUrl")
    public String logoUrl;

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
    public CreateIdentityProviderRequestOidcConfig oidcConfig;

    /**
     * <p>同步入配置</p>
     */
    @NameInMap("UdPullConfig")
    public CreateIdentityProviderRequestUdPullConfig udPullConfig;

    /**
     * <p>同步出配置</p>
     */
    @NameInMap("UdPushConfig")
    public CreateIdentityProviderRequestUdPushConfig udPushConfig;

    /**
     * <p>WeCom配置</p>
     */
    @NameInMap("WeComConfig")
    public CreateIdentityProviderRequestWeComConfig weComConfig;

    public static CreateIdentityProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIdentityProviderRequest self = new CreateIdentityProviderRequest();
        return TeaModel.build(map, self);
    }

    public CreateIdentityProviderRequest setAuthnConfig(CreateIdentityProviderRequestAuthnConfig authnConfig) {
        this.authnConfig = authnConfig;
        return this;
    }
    public CreateIdentityProviderRequestAuthnConfig getAuthnConfig() {
        return this.authnConfig;
    }

    public CreateIdentityProviderRequest setAutoCreateUserConfig(CreateIdentityProviderRequestAutoCreateUserConfig autoCreateUserConfig) {
        this.autoCreateUserConfig = autoCreateUserConfig;
        return this;
    }
    public CreateIdentityProviderRequestAutoCreateUserConfig getAutoCreateUserConfig() {
        return this.autoCreateUserConfig;
    }

    public CreateIdentityProviderRequest setAutoUpdateUserConfig(CreateIdentityProviderRequestAutoUpdateUserConfig autoUpdateUserConfig) {
        this.autoUpdateUserConfig = autoUpdateUserConfig;
        return this;
    }
    public CreateIdentityProviderRequestAutoUpdateUserConfig getAutoUpdateUserConfig() {
        return this.autoUpdateUserConfig;
    }

    public CreateIdentityProviderRequest setBindingConfig(CreateIdentityProviderRequestBindingConfig bindingConfig) {
        this.bindingConfig = bindingConfig;
        return this;
    }
    public CreateIdentityProviderRequestBindingConfig getBindingConfig() {
        return this.bindingConfig;
    }

    public CreateIdentityProviderRequest setDingtalkAppConfig(CreateIdentityProviderRequestDingtalkAppConfig dingtalkAppConfig) {
        this.dingtalkAppConfig = dingtalkAppConfig;
        return this;
    }
    public CreateIdentityProviderRequestDingtalkAppConfig getDingtalkAppConfig() {
        return this.dingtalkAppConfig;
    }

    public CreateIdentityProviderRequest setIdentityProviderName(String identityProviderName) {
        this.identityProviderName = identityProviderName;
        return this;
    }
    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

    public CreateIdentityProviderRequest setIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
        return this;
    }
    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    public CreateIdentityProviderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateIdentityProviderRequest setLarkConfig(CreateIdentityProviderRequestLarkConfig larkConfig) {
        this.larkConfig = larkConfig;
        return this;
    }
    public CreateIdentityProviderRequestLarkConfig getLarkConfig() {
        return this.larkConfig;
    }

    public CreateIdentityProviderRequest setLdapConfig(CreateIdentityProviderRequestLdapConfig ldapConfig) {
        this.ldapConfig = ldapConfig;
        return this;
    }
    public CreateIdentityProviderRequestLdapConfig getLdapConfig() {
        return this.ldapConfig;
    }

    public CreateIdentityProviderRequest setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }
    public String getLogoUrl() {
        return this.logoUrl;
    }

    public CreateIdentityProviderRequest setNetworkAccessEndpointId(String networkAccessEndpointId) {
        this.networkAccessEndpointId = networkAccessEndpointId;
        return this;
    }
    public String getNetworkAccessEndpointId() {
        return this.networkAccessEndpointId;
    }

    public CreateIdentityProviderRequest setOidcConfig(CreateIdentityProviderRequestOidcConfig oidcConfig) {
        this.oidcConfig = oidcConfig;
        return this;
    }
    public CreateIdentityProviderRequestOidcConfig getOidcConfig() {
        return this.oidcConfig;
    }

    public CreateIdentityProviderRequest setUdPullConfig(CreateIdentityProviderRequestUdPullConfig udPullConfig) {
        this.udPullConfig = udPullConfig;
        return this;
    }
    public CreateIdentityProviderRequestUdPullConfig getUdPullConfig() {
        return this.udPullConfig;
    }

    public CreateIdentityProviderRequest setUdPushConfig(CreateIdentityProviderRequestUdPushConfig udPushConfig) {
        this.udPushConfig = udPushConfig;
        return this;
    }
    public CreateIdentityProviderRequestUdPushConfig getUdPushConfig() {
        return this.udPushConfig;
    }

    public CreateIdentityProviderRequest setWeComConfig(CreateIdentityProviderRequestWeComConfig weComConfig) {
        this.weComConfig = weComConfig;
        return this;
    }
    public CreateIdentityProviderRequestWeComConfig getWeComConfig() {
        return this.weComConfig;
    }

    public static class CreateIdentityProviderRequestAuthnConfig extends TeaModel {
        /**
         * <p>对应IdP是否支持认证</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("AuthnStatus")
        public String authnStatus;

        /**
         * <p>是否支持自动更新密码</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("AutoUpdatePasswordStatus")
        public String autoUpdatePasswordStatus;

        public static CreateIdentityProviderRequestAuthnConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestAuthnConfig self = new CreateIdentityProviderRequestAuthnConfig();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestAuthnConfig setAuthnStatus(String authnStatus) {
            this.authnStatus = authnStatus;
            return this;
        }
        public String getAuthnStatus() {
            return this.authnStatus;
        }

        public CreateIdentityProviderRequestAuthnConfig setAutoUpdatePasswordStatus(String autoUpdatePasswordStatus) {
            this.autoUpdatePasswordStatus = autoUpdatePasswordStatus;
            return this;
        }
        public String getAutoUpdatePasswordStatus() {
            return this.autoUpdatePasswordStatus;
        }

    }

    public static class CreateIdentityProviderRequestAutoCreateUserConfig extends TeaModel {
        /**
         * <p>自动创建账户是否开启</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("AutoCreateUserStatus")
        public String autoCreateUserStatus;

        @NameInMap("TargetOrganizationalUnitIds")
        public java.util.List<String> targetOrganizationalUnitIds;

        public static CreateIdentityProviderRequestAutoCreateUserConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestAutoCreateUserConfig self = new CreateIdentityProviderRequestAutoCreateUserConfig();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestAutoCreateUserConfig setAutoCreateUserStatus(String autoCreateUserStatus) {
            this.autoCreateUserStatus = autoCreateUserStatus;
            return this;
        }
        public String getAutoCreateUserStatus() {
            return this.autoCreateUserStatus;
        }

        public CreateIdentityProviderRequestAutoCreateUserConfig setTargetOrganizationalUnitIds(java.util.List<String> targetOrganizationalUnitIds) {
            this.targetOrganizationalUnitIds = targetOrganizationalUnitIds;
            return this;
        }
        public java.util.List<String> getTargetOrganizationalUnitIds() {
            return this.targetOrganizationalUnitIds;
        }

    }

    public static class CreateIdentityProviderRequestAutoUpdateUserConfig extends TeaModel {
        /**
         * <p>自动更新账户是否开启</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("AutoUpdateUserStatus")
        public String autoUpdateUserStatus;

        public static CreateIdentityProviderRequestAutoUpdateUserConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestAutoUpdateUserConfig self = new CreateIdentityProviderRequestAutoUpdateUserConfig();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestAutoUpdateUserConfig setAutoUpdateUserStatus(String autoUpdateUserStatus) {
            this.autoUpdateUserStatus = autoUpdateUserStatus;
            return this;
        }
        public String getAutoUpdateUserStatus() {
            return this.autoUpdateUserStatus;
        }

    }

    public static class CreateIdentityProviderRequestBindingConfigAutoMatchUserProfileExpressions extends TeaModel {
        /**
         * <p>表达式的类型</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>filed</p>
         */
        @NameInMap("ExpressionMappingType")
        public String expressionMappingType;

        /**
         * <p>映射属性取值表达式</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idpUser.phoneNumber</p>
         */
        @NameInMap("SourceValueExpression")
        public String sourceValueExpression;

        /**
         * <p>映射目标属性名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user.username</p>
         */
        @NameInMap("TargetField")
        public String targetField;

        /**
         * <p>映射目标属性名称</p>
         */
        @NameInMap("TargetFieldDescription")
        public String targetFieldDescription;

        public static CreateIdentityProviderRequestBindingConfigAutoMatchUserProfileExpressions build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestBindingConfigAutoMatchUserProfileExpressions self = new CreateIdentityProviderRequestBindingConfigAutoMatchUserProfileExpressions();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestBindingConfigAutoMatchUserProfileExpressions setExpressionMappingType(String expressionMappingType) {
            this.expressionMappingType = expressionMappingType;
            return this;
        }
        public String getExpressionMappingType() {
            return this.expressionMappingType;
        }

        public CreateIdentityProviderRequestBindingConfigAutoMatchUserProfileExpressions setSourceValueExpression(String sourceValueExpression) {
            this.sourceValueExpression = sourceValueExpression;
            return this;
        }
        public String getSourceValueExpression() {
            return this.sourceValueExpression;
        }

        public CreateIdentityProviderRequestBindingConfigAutoMatchUserProfileExpressions setTargetField(String targetField) {
            this.targetField = targetField;
            return this;
        }
        public String getTargetField() {
            return this.targetField;
        }

        public CreateIdentityProviderRequestBindingConfigAutoMatchUserProfileExpressions setTargetFieldDescription(String targetFieldDescription) {
            this.targetFieldDescription = targetFieldDescription;
            return this;
        }
        public String getTargetFieldDescription() {
            return this.targetFieldDescription;
        }

    }

    public static class CreateIdentityProviderRequestBindingConfig extends TeaModel {
        /**
         * <p>自动匹配账户的规则</p>
         */
        @NameInMap("AutoMatchUserProfileExpressions")
        public java.util.List<CreateIdentityProviderRequestBindingConfigAutoMatchUserProfileExpressions> autoMatchUserProfileExpressions;

        /**
         * <p>自动匹配账户是否开启</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("AutoMatchUserStatus")
        public String autoMatchUserStatus;

        /**
         * <p>用户手动绑定账户功能是否开启</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("MappingBindingStatus")
        public String mappingBindingStatus;

        public static CreateIdentityProviderRequestBindingConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestBindingConfig self = new CreateIdentityProviderRequestBindingConfig();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestBindingConfig setAutoMatchUserProfileExpressions(java.util.List<CreateIdentityProviderRequestBindingConfigAutoMatchUserProfileExpressions> autoMatchUserProfileExpressions) {
            this.autoMatchUserProfileExpressions = autoMatchUserProfileExpressions;
            return this;
        }
        public java.util.List<CreateIdentityProviderRequestBindingConfigAutoMatchUserProfileExpressions> getAutoMatchUserProfileExpressions() {
            return this.autoMatchUserProfileExpressions;
        }

        public CreateIdentityProviderRequestBindingConfig setAutoMatchUserStatus(String autoMatchUserStatus) {
            this.autoMatchUserStatus = autoMatchUserStatus;
            return this;
        }
        public String getAutoMatchUserStatus() {
            return this.autoMatchUserStatus;
        }

        public CreateIdentityProviderRequestBindingConfig setMappingBindingStatus(String mappingBindingStatus) {
            this.mappingBindingStatus = mappingBindingStatus;
            return this;
        }
        public String getMappingBindingStatus() {
            return this.mappingBindingStatus;
        }

    }

    public static class CreateIdentityProviderRequestDingtalkAppConfig extends TeaModel {
        /**
         * <p>钉钉一方应用的AppKey</p>
         * 
         * <strong>example:</strong>
         * <p>Xczngvfemo4e</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <p>钉钉一方应用的AppSecret</p>
         * 
         * <strong>example:</strong>
         * <p>5d405a12a6f84ad4ab05ee09axxxx</p>
         */
        @NameInMap("AppSecret")
        public String appSecret;

        /**
         * <p>钉钉一方应用的corpId</p>
         * 
         * <strong>example:</strong>
         * <p>3075680424786133505</p>
         */
        @NameInMap("CorpId")
        public String corpId;

        /**
         * <p>钉钉版本</p>
         * 
         * <strong>example:</strong>
         * <p>public_dingtalk</p>
         */
        @NameInMap("DingtalkVersion")
        public String dingtalkVersion;

        public static CreateIdentityProviderRequestDingtalkAppConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestDingtalkAppConfig self = new CreateIdentityProviderRequestDingtalkAppConfig();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestDingtalkAppConfig setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public CreateIdentityProviderRequestDingtalkAppConfig setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public CreateIdentityProviderRequestDingtalkAppConfig setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public CreateIdentityProviderRequestDingtalkAppConfig setDingtalkVersion(String dingtalkVersion) {
            this.dingtalkVersion = dingtalkVersion;
            return this;
        }
        public String getDingtalkVersion() {
            return this.dingtalkVersion;
        }

    }

    public static class CreateIdentityProviderRequestLarkConfig extends TeaModel {
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

        /**
         * <strong>example:</strong>
         * <p>FSX123111xxx</p>
         */
        @NameInMap("EnterpriseNumber")
        public String enterpriseNumber;

        public static CreateIdentityProviderRequestLarkConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestLarkConfig self = new CreateIdentityProviderRequestLarkConfig();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestLarkConfig setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateIdentityProviderRequestLarkConfig setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public CreateIdentityProviderRequestLarkConfig setEnterpriseNumber(String enterpriseNumber) {
            this.enterpriseNumber = enterpriseNumber;
            return this;
        }
        public String getEnterpriseNumber() {
            return this.enterpriseNumber;
        }

    }

    public static class CreateIdentityProviderRequestLdapConfig extends TeaModel {
        /**
         * <p>管理员密码</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
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
         * <p>组成员标识</p>
         * 
         * <strong>example:</strong>
         * <p>member</p>
         */
        @NameInMap("GroupMemberAttributeName")
        public String groupMemberAttributeName;

        /**
         * <p>组objectClass</p>
         * 
         * <strong>example:</strong>
         * <p>group</p>
         */
        @NameInMap("GroupObjectClass")
        public String groupObjectClass;

        /**
         * <p>组自定义Filter</p>
         * 
         * <strong>example:</strong>
         * <p>(|(cn=test)(group=<a href="mailto:test@test.com">test@test.com</a>))</p>
         */
        @NameInMap("GroupObjectClassCustomFilter")
        public String groupObjectClassCustomFilter;

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
         * <p>组织objectClass</p>
         * 
         * <strong>example:</strong>
         * <p>organizationUnit,top</p>
         */
        @NameInMap("OrganizationUnitObjectClass")
        public String organizationUnitObjectClass;

        /**
         * <p>startTls是否开启</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("StartTlsStatus")
        public String startTlsStatus;

        /**
         * <p>用户登录标识</p>
         * 
         * <strong>example:</strong>
         * <p>userPrincipalName, mail</p>
         */
        @NameInMap("UserLoginIdentifier")
        public String userLoginIdentifier;

        /**
         * <p>用户objectClass</p>
         * 
         * <strong>example:</strong>
         * <p>person,user</p>
         */
        @NameInMap("UserObjectClass")
        public String userObjectClass;

        /**
         * <p>用户自定义Filter</p>
         * 
         * <strong>example:</strong>
         * <p>(|(cn=test)(mail=<a href="mailto:test@test.com">test@test.com</a>))</p>
         */
        @NameInMap("UserObjectClassCustomFilter")
        public String userObjectClassCustomFilter;

        public static CreateIdentityProviderRequestLdapConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestLdapConfig self = new CreateIdentityProviderRequestLdapConfig();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestLdapConfig setAdministratorPassword(String administratorPassword) {
            this.administratorPassword = administratorPassword;
            return this;
        }
        public String getAdministratorPassword() {
            return this.administratorPassword;
        }

        public CreateIdentityProviderRequestLdapConfig setAdministratorUsername(String administratorUsername) {
            this.administratorUsername = administratorUsername;
            return this;
        }
        public String getAdministratorUsername() {
            return this.administratorUsername;
        }

        public CreateIdentityProviderRequestLdapConfig setCertificateFingerprintStatus(String certificateFingerprintStatus) {
            this.certificateFingerprintStatus = certificateFingerprintStatus;
            return this;
        }
        public String getCertificateFingerprintStatus() {
            return this.certificateFingerprintStatus;
        }

        public CreateIdentityProviderRequestLdapConfig setCertificateFingerprints(java.util.List<String> certificateFingerprints) {
            this.certificateFingerprints = certificateFingerprints;
            return this;
        }
        public java.util.List<String> getCertificateFingerprints() {
            return this.certificateFingerprints;
        }

        public CreateIdentityProviderRequestLdapConfig setGroupMemberAttributeName(String groupMemberAttributeName) {
            this.groupMemberAttributeName = groupMemberAttributeName;
            return this;
        }
        public String getGroupMemberAttributeName() {
            return this.groupMemberAttributeName;
        }

        public CreateIdentityProviderRequestLdapConfig setGroupObjectClass(String groupObjectClass) {
            this.groupObjectClass = groupObjectClass;
            return this;
        }
        public String getGroupObjectClass() {
            return this.groupObjectClass;
        }

        public CreateIdentityProviderRequestLdapConfig setGroupObjectClassCustomFilter(String groupObjectClassCustomFilter) {
            this.groupObjectClassCustomFilter = groupObjectClassCustomFilter;
            return this;
        }
        public String getGroupObjectClassCustomFilter() {
            return this.groupObjectClassCustomFilter;
        }

        public CreateIdentityProviderRequestLdapConfig setLdapProtocol(String ldapProtocol) {
            this.ldapProtocol = ldapProtocol;
            return this;
        }
        public String getLdapProtocol() {
            return this.ldapProtocol;
        }

        public CreateIdentityProviderRequestLdapConfig setLdapServerHost(String ldapServerHost) {
            this.ldapServerHost = ldapServerHost;
            return this;
        }
        public String getLdapServerHost() {
            return this.ldapServerHost;
        }

        public CreateIdentityProviderRequestLdapConfig setLdapServerPort(Integer ldapServerPort) {
            this.ldapServerPort = ldapServerPort;
            return this;
        }
        public Integer getLdapServerPort() {
            return this.ldapServerPort;
        }

        public CreateIdentityProviderRequestLdapConfig setOrganizationUnitObjectClass(String organizationUnitObjectClass) {
            this.organizationUnitObjectClass = organizationUnitObjectClass;
            return this;
        }
        public String getOrganizationUnitObjectClass() {
            return this.organizationUnitObjectClass;
        }

        public CreateIdentityProviderRequestLdapConfig setStartTlsStatus(String startTlsStatus) {
            this.startTlsStatus = startTlsStatus;
            return this;
        }
        public String getStartTlsStatus() {
            return this.startTlsStatus;
        }

        public CreateIdentityProviderRequestLdapConfig setUserLoginIdentifier(String userLoginIdentifier) {
            this.userLoginIdentifier = userLoginIdentifier;
            return this;
        }
        public String getUserLoginIdentifier() {
            return this.userLoginIdentifier;
        }

        public CreateIdentityProviderRequestLdapConfig setUserObjectClass(String userObjectClass) {
            this.userObjectClass = userObjectClass;
            return this;
        }
        public String getUserObjectClass() {
            return this.userObjectClass;
        }

        public CreateIdentityProviderRequestLdapConfig setUserObjectClassCustomFilter(String userObjectClassCustomFilter) {
            this.userObjectClassCustomFilter = userObjectClassCustomFilter;
            return this;
        }
        public String getUserObjectClassCustomFilter() {
            return this.userObjectClassCustomFilter;
        }

    }

    public static class CreateIdentityProviderRequestOidcConfigAuthnParam extends TeaModel {
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

        public static CreateIdentityProviderRequestOidcConfigAuthnParam build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestOidcConfigAuthnParam self = new CreateIdentityProviderRequestOidcConfigAuthnParam();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestOidcConfigAuthnParam setAuthnMethod(String authnMethod) {
            this.authnMethod = authnMethod;
            return this;
        }
        public String getAuthnMethod() {
            return this.authnMethod;
        }

        public CreateIdentityProviderRequestOidcConfigAuthnParam setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public CreateIdentityProviderRequestOidcConfigAuthnParam setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

    }

    public static class CreateIdentityProviderRequestOidcConfigEndpointConfig extends TeaModel {
        /**
         * <p>oAuth2 授权端点。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/auth/authorize">https://example.com/auth/authorize</a></p>
         */
        @NameInMap("AuthorizationEndpoint")
        public String authorizationEndpoint;

        /**
         * <p>OIDC issuer信息。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/auth">https://example.com/auth</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>OIDC jwks地址。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/auth/jwks">https://example.com/auth/jwks</a></p>
         */
        @NameInMap("JwksUri")
        public String jwksUri;

        /**
         * <p>oAuth2 Token端点。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/auth/token">https://example.com/auth/token</a></p>
         */
        @NameInMap("TokenEndpoint")
        public String tokenEndpoint;

        /**
         * <p>OIDC 用户信息端点。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/auth/userinfo">https://example.com/auth/userinfo</a></p>
         */
        @NameInMap("UserinfoEndpoint")
        public String userinfoEndpoint;

        public static CreateIdentityProviderRequestOidcConfigEndpointConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestOidcConfigEndpointConfig self = new CreateIdentityProviderRequestOidcConfigEndpointConfig();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestOidcConfigEndpointConfig setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        public CreateIdentityProviderRequestOidcConfigEndpointConfig setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public CreateIdentityProviderRequestOidcConfigEndpointConfig setJwksUri(String jwksUri) {
            this.jwksUri = jwksUri;
            return this;
        }
        public String getJwksUri() {
            return this.jwksUri;
        }

        public CreateIdentityProviderRequestOidcConfigEndpointConfig setTokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

        public CreateIdentityProviderRequestOidcConfigEndpointConfig setUserinfoEndpoint(String userinfoEndpoint) {
            this.userinfoEndpoint = userinfoEndpoint;
            return this;
        }
        public String getUserinfoEndpoint() {
            return this.userinfoEndpoint;
        }

    }

    public static class CreateIdentityProviderRequestOidcConfig extends TeaModel {
        /**
         * <p>OIDC客户端认证配置。</p>
         */
        @NameInMap("AuthnParam")
        public CreateIdentityProviderRequestOidcConfigAuthnParam authnParam;

        /**
         * <p>OIDC 端点配置。</p>
         */
        @NameInMap("EndpointConfig")
        public CreateIdentityProviderRequestOidcConfigEndpointConfig endpointConfig;

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

        public static CreateIdentityProviderRequestOidcConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestOidcConfig self = new CreateIdentityProviderRequestOidcConfig();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestOidcConfig setAuthnParam(CreateIdentityProviderRequestOidcConfigAuthnParam authnParam) {
            this.authnParam = authnParam;
            return this;
        }
        public CreateIdentityProviderRequestOidcConfigAuthnParam getAuthnParam() {
            return this.authnParam;
        }

        public CreateIdentityProviderRequestOidcConfig setEndpointConfig(CreateIdentityProviderRequestOidcConfigEndpointConfig endpointConfig) {
            this.endpointConfig = endpointConfig;
            return this;
        }
        public CreateIdentityProviderRequestOidcConfigEndpointConfig getEndpointConfig() {
            return this.endpointConfig;
        }

        public CreateIdentityProviderRequestOidcConfig setGrantScopes(java.util.List<String> grantScopes) {
            this.grantScopes = grantScopes;
            return this;
        }
        public java.util.List<String> getGrantScopes() {
            return this.grantScopes;
        }

        public CreateIdentityProviderRequestOidcConfig setGrantType(String grantType) {
            this.grantType = grantType;
            return this;
        }
        public String getGrantType() {
            return this.grantType;
        }

        public CreateIdentityProviderRequestOidcConfig setPkceChallengeMethod(String pkceChallengeMethod) {
            this.pkceChallengeMethod = pkceChallengeMethod;
            return this;
        }
        public String getPkceChallengeMethod() {
            return this.pkceChallengeMethod;
        }

        public CreateIdentityProviderRequestOidcConfig setPkceRequired(Boolean pkceRequired) {
            this.pkceRequired = pkceRequired;
            return this;
        }
        public Boolean getPkceRequired() {
            return this.pkceRequired;
        }

    }

    public static class CreateIdentityProviderRequestUdPullConfigUdSyncScopeConfig extends TeaModel {
        /**
         * <p>同步来源节点</p>
         */
        @NameInMap("SourceScopes")
        public java.util.List<String> sourceScopes;

        /**
         * <p>同步目标节点</p>
         * 
         * <strong>example:</strong>
         * <p>ou_lyhyy6p7yf7mdrdiq5xxxx</p>
         */
        @NameInMap("TargetScope")
        public String targetScope;

        public static CreateIdentityProviderRequestUdPullConfigUdSyncScopeConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestUdPullConfigUdSyncScopeConfig self = new CreateIdentityProviderRequestUdPullConfigUdSyncScopeConfig();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestUdPullConfigUdSyncScopeConfig setSourceScopes(java.util.List<String> sourceScopes) {
            this.sourceScopes = sourceScopes;
            return this;
        }
        public java.util.List<String> getSourceScopes() {
            return this.sourceScopes;
        }

        public CreateIdentityProviderRequestUdPullConfigUdSyncScopeConfig setTargetScope(String targetScope) {
            this.targetScope = targetScope;
            return this;
        }
        public String getTargetScope() {
            return this.targetScope;
        }

    }

    public static class CreateIdentityProviderRequestUdPullConfig extends TeaModel {
        /**
         * <p>是否支持组同步，默认为disabled</p>
         * 
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
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("PeriodicSyncStatus")
        public String periodicSyncStatus;

        /**
         * <p>同步入配置信息</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("UdSyncScopeConfig")
        public CreateIdentityProviderRequestUdPullConfigUdSyncScopeConfig udSyncScopeConfig;

        public static CreateIdentityProviderRequestUdPullConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestUdPullConfig self = new CreateIdentityProviderRequestUdPullConfig();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestUdPullConfig setGroupSyncStatus(String groupSyncStatus) {
            this.groupSyncStatus = groupSyncStatus;
            return this;
        }
        public String getGroupSyncStatus() {
            return this.groupSyncStatus;
        }

        public CreateIdentityProviderRequestUdPullConfig setIncrementalCallbackStatus(String incrementalCallbackStatus) {
            this.incrementalCallbackStatus = incrementalCallbackStatus;
            return this;
        }
        public String getIncrementalCallbackStatus() {
            return this.incrementalCallbackStatus;
        }

        public CreateIdentityProviderRequestUdPullConfig setPeriodicSyncStatus(String periodicSyncStatus) {
            this.periodicSyncStatus = periodicSyncStatus;
            return this;
        }
        public String getPeriodicSyncStatus() {
            return this.periodicSyncStatus;
        }

        public CreateIdentityProviderRequestUdPullConfig setUdSyncScopeConfig(CreateIdentityProviderRequestUdPullConfigUdSyncScopeConfig udSyncScopeConfig) {
            this.udSyncScopeConfig = udSyncScopeConfig;
            return this;
        }
        public CreateIdentityProviderRequestUdPullConfigUdSyncScopeConfig getUdSyncScopeConfig() {
            return this.udSyncScopeConfig;
        }

    }

    public static class CreateIdentityProviderRequestUdPushConfigUdSyncScopeConfigs extends TeaModel {
        /**
         * <p>同步来源节点</p>
         */
        @NameInMap("SourceScopes")
        public java.util.List<String> sourceScopes;

        /**
         * <p>同步目标节点</p>
         * 
         * <strong>example:</strong>
         * <p>ou_lyhyy6p7yf7mdrdiq5xxxx</p>
         */
        @NameInMap("TargetScope")
        public String targetScope;

        public static CreateIdentityProviderRequestUdPushConfigUdSyncScopeConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestUdPushConfigUdSyncScopeConfigs self = new CreateIdentityProviderRequestUdPushConfigUdSyncScopeConfigs();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestUdPushConfigUdSyncScopeConfigs setSourceScopes(java.util.List<String> sourceScopes) {
            this.sourceScopes = sourceScopes;
            return this;
        }
        public java.util.List<String> getSourceScopes() {
            return this.sourceScopes;
        }

        public CreateIdentityProviderRequestUdPushConfigUdSyncScopeConfigs setTargetScope(String targetScope) {
            this.targetScope = targetScope;
            return this;
        }
        public String getTargetScope() {
            return this.targetScope;
        }

    }

    public static class CreateIdentityProviderRequestUdPushConfig extends TeaModel {
        /**
         * <p>增量回调状态，是否处理来自IdP的增量回调数据</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("IncrementalCallbackStatus")
        public String incrementalCallbackStatus;

        /**
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("PeriodicSyncStatus")
        public String periodicSyncStatus;

        /**
         * <p>同步出配置信息</p>
         */
        @NameInMap("UdSyncScopeConfigs")
        public java.util.List<CreateIdentityProviderRequestUdPushConfigUdSyncScopeConfigs> udSyncScopeConfigs;

        public static CreateIdentityProviderRequestUdPushConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestUdPushConfig self = new CreateIdentityProviderRequestUdPushConfig();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestUdPushConfig setIncrementalCallbackStatus(String incrementalCallbackStatus) {
            this.incrementalCallbackStatus = incrementalCallbackStatus;
            return this;
        }
        public String getIncrementalCallbackStatus() {
            return this.incrementalCallbackStatus;
        }

        public CreateIdentityProviderRequestUdPushConfig setPeriodicSyncStatus(String periodicSyncStatus) {
            this.periodicSyncStatus = periodicSyncStatus;
            return this;
        }
        public String getPeriodicSyncStatus() {
            return this.periodicSyncStatus;
        }

        public CreateIdentityProviderRequestUdPushConfig setUdSyncScopeConfigs(java.util.List<CreateIdentityProviderRequestUdPushConfigUdSyncScopeConfigs> udSyncScopeConfigs) {
            this.udSyncScopeConfigs = udSyncScopeConfigs;
            return this;
        }
        public java.util.List<CreateIdentityProviderRequestUdPushConfigUdSyncScopeConfigs> getUdSyncScopeConfigs() {
            return this.udSyncScopeConfigs;
        }

    }

    public static class CreateIdentityProviderRequestWeComConfig extends TeaModel {
        /**
         * <p>企业微信自建应用的Id</p>
         * 
         * <strong>example:</strong>
         * <p>278231941749863339</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>授权回调域</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.aliyunidaas.com/xxxx">https://xxx.aliyunidaas.com/xxxx</a></p>
         */
        @NameInMap("AuthorizeCallbackDomain")
        public String authorizeCallbackDomain;

        /**
         * <p>企业微信自建应用的corpId</p>
         * 
         * <strong>example:</strong>
         * <p>3756043633237690761</p>
         */
        @NameInMap("CorpId")
        public String corpId;

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
         * <p><a href="https://xxx.aliyunidaas.com/">https://xxx.aliyunidaas.com/</a></p>
         */
        @NameInMap("TrustableDomain")
        public String trustableDomain;

        public static CreateIdentityProviderRequestWeComConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestWeComConfig self = new CreateIdentityProviderRequestWeComConfig();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestWeComConfig setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public CreateIdentityProviderRequestWeComConfig setAuthorizeCallbackDomain(String authorizeCallbackDomain) {
            this.authorizeCallbackDomain = authorizeCallbackDomain;
            return this;
        }
        public String getAuthorizeCallbackDomain() {
            return this.authorizeCallbackDomain;
        }

        public CreateIdentityProviderRequestWeComConfig setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public CreateIdentityProviderRequestWeComConfig setCorpSecret(String corpSecret) {
            this.corpSecret = corpSecret;
            return this;
        }
        public String getCorpSecret() {
            return this.corpSecret;
        }

        public CreateIdentityProviderRequestWeComConfig setTrustableDomain(String trustableDomain) {
            this.trustableDomain = trustableDomain;
            return this;
        }
        public String getTrustableDomain() {
            return this.trustableDomain;
        }

    }

}
