// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateIdentityProviderRequest extends TeaModel {
    /**
     * <p>Authentication configuration.</p>
     */
    @NameInMap("AuthnConfig")
    public CreateIdentityProviderRequestAuthnConfig authnConfig;

    /**
     * <p>Automatic account creation rule configuration.</p>
     */
    @NameInMap("AutoCreateUserConfig")
    public CreateIdentityProviderRequestAutoCreateUserConfig autoCreateUserConfig;

    /**
     * <p>Automatic account update rule configuration.</p>
     */
    @NameInMap("AutoUpdateUserConfig")
    public CreateIdentityProviderRequestAutoUpdateUserConfig autoUpdateUserConfig;

    /**
     * <p>OIDC identity provider account binding rule configuration.</p>
     */
    @NameInMap("BindingConfig")
    public CreateIdentityProviderRequestBindingConfig bindingConfig;

    /**
     * <p>Client token used to ensure the idempotency of the request. Generate a parameter value from your client to ensure the value is unique across different requests. ClientToken only supports ASCII characters. If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may be different for each API request.</p>
     * 
     * <strong>example:</strong>
     * <p>clientToken_20250704_Axxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>DingTalk configuration.</p>
     */
    @NameInMap("DingtalkAppConfig")
    public CreateIdentityProviderRequestDingtalkAppConfig dingtalkAppConfig;

    /**
     * <p>Identity provider name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("IdentityProviderName")
    public String identityProviderName;

    /**
     * <p>Identity provider synchronization type.</p>
     * <ul>
     * <li><p>Inbound DingTalk: urn:alibaba:idaas:idp:alibaba:dingtalk:pull</p>
     * </li>
     * <li><p>Outbound DingTalk: urn:alibaba:idaas:idp:alibaba:dingtalk:push</p>
     * </li>
     * <li><p>Inbound WeCom: urn:alibaba:idaas:idp:tencent:wecom:pull</p>
     * </li>
     * <li><p>Inbound Lark: urn:alibaba:idaas:idp:bytedance:lark:pull</p>
     * </li>
     * <li><p>Inbound AD: urn:alibaba:idaas:idp:microsoft:ad:pull</p>
     * </li>
     * <li><p>Inbound LDAP: urn:alibaba:idaas:idp:unknown:ldap:pull</p>
     * </li>
     * <li><p>Standard OIDC: urn:alibaba:idaas:idp:standard:oidc</p>
     * </li>
     * <li><p>SASE Custom OIDC: urn:alibaba:idaas:idp:alibaba:sase</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>urn:alibaba:idaas:idp:alibaba:dingtalk:push</p>
     */
    @NameInMap("IdentityProviderType")
    public String identityProviderType;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Lark configuration.</p>
     */
    @NameInMap("LarkConfig")
    public CreateIdentityProviderRequestLarkConfig larkConfig;

    /**
     * <p>AD/LDAP configuration.</p>
     */
    @NameInMap("LdapConfig")
    public CreateIdentityProviderRequestLdapConfig ldapConfig;

    /**
     * <p>Application logo URL.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-image://xxxx_23aqr2ye554csg33dqpch5eu3q/tmp/d17d9adc-a943-45e7-ba0c-2838dddea678</p>
     */
    @NameInMap("LogoUrl")
    public String logoUrl;

    /**
     * <p>Network access endpoint ID.</p>
     * 
     * <strong>example:</strong>
     * <p>nae_examplexxxx</p>
     */
    @NameInMap("NetworkAccessEndpointId")
    public String networkAccessEndpointId;

    /**
     * <p>OIDC IdP configuration.</p>
     */
    @NameInMap("OidcConfig")
    public CreateIdentityProviderRequestOidcConfig oidcConfig;

    @NameInMap("SamlConfig")
    public CreateIdentityProviderRequestSamlConfig samlConfig;

    /**
     * <p>Inbound synchronization configuration.</p>
     */
    @NameInMap("UdPullConfig")
    public CreateIdentityProviderRequestUdPullConfig udPullConfig;

    /**
     * <p>Outbound synchronization configuration.</p>
     */
    @NameInMap("UdPushConfig")
    public CreateIdentityProviderRequestUdPushConfig udPushConfig;

    /**
     * <p>WeCom configuration.</p>
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

    public CreateIdentityProviderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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

    public CreateIdentityProviderRequest setSamlConfig(CreateIdentityProviderRequestSamlConfig samlConfig) {
        this.samlConfig = samlConfig;
        return this;
    }
    public CreateIdentityProviderRequestSamlConfig getSamlConfig() {
        return this.samlConfig;
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
         * <p>Whether the corresponding IdP supports authentication. Valid values:</p>
         * <ul>
         * <li><p>Disabled: disabled</p>
         * </li>
         * <li><p>Enabled: enabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("AuthnStatus")
        public String authnStatus;

        /**
         * <p>Whether automatic password update is supported. Valid values:</p>
         * <ul>
         * <li><p>Disabled: disabled</p>
         * </li>
         * <li><p>Enabled: enabled</p>
         * </li>
         * </ul>
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
         * <p>Whether automatic account creation is enabled. Valid values:</p>
         * <ul>
         * <li><p>Disabled: disabled</p>
         * </li>
         * <li><p>Enabled: enabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("AutoCreateUserStatus")
        public String autoCreateUserStatus;

        /**
         * <p>Set of target organizational unit IDs.</p>
         */
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
         * <p>Whether automatic account update is enabled. Valid values:</p>
         * <ul>
         * <li><p>Disabled: disabled</p>
         * </li>
         * <li><p>Enabled: enabled</p>
         * </li>
         * </ul>
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
         * <p>Expression type. Valid values:</p>
         * <ul>
         * <li><p>Field: field</p>
         * </li>
         * <li><p>Expression: expression</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>field</p>
         */
        @NameInMap("ExpressionMappingType")
        public String expressionMappingType;

        /**
         * <p>Mapping attribute value expression.</p>
         * 
         * <strong>example:</strong>
         * <p>idpUser.phoneNumber</p>
         */
        @NameInMap("SourceValueExpression")
        public String sourceValueExpression;

        /**
         * <p>Mapping target attribute name.</p>
         * 
         * <strong>example:</strong>
         * <p>user.username</p>
         */
        @NameInMap("TargetField")
        public String targetField;

        /**
         * <p>Mapping target attribute description.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
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
         * <p>List of rules for automatic account matching.</p>
         */
        @NameInMap("AutoMatchUserProfileExpressions")
        public java.util.List<CreateIdentityProviderRequestBindingConfigAutoMatchUserProfileExpressions> autoMatchUserProfileExpressions;

        /**
         * <p>Whether automatic account matching is enabled. Valid values:</p>
         * <ul>
         * <li><p>Disabled: disabled</p>
         * </li>
         * <li><p>Enabled: enabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("AutoMatchUserStatus")
        public String autoMatchUserStatus;

        /**
         * <p>Whether the manual account binding feature is enabled. Valid values:</p>
         * <ul>
         * <li><p>Disabled: disabled</p>
         * </li>
         * <li><p>Enabled: enabled</p>
         * </li>
         * </ul>
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
         * <p>AppKey of the DingTalk first-party application.</p>
         * 
         * <strong>example:</strong>
         * <p>Xczngvfemo4e</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <p>AppSecret of the DingTalk first-party application.</p>
         * 
         * <strong>example:</strong>
         * <p>5d405a12a6f84ad4ab05ee09axxxx</p>
         */
        @NameInMap("AppSecret")
        public String appSecret;

        /**
         * <p>CorpId of the DingTalk first-party application.</p>
         * 
         * <strong>example:</strong>
         * <p>307568042478613xxxx</p>
         */
        @NameInMap("CorpId")
        public String corpId;

        /**
         * <p>DingTalk version. Valid values:</p>
         * <ul>
         * <li><p>Standard DingTalk: public_dingtalk</p>
         * </li>
         * <li><p>Exclusive DingTalk: private_dingtalk</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public_dingtalk</p>
         */
        @NameInMap("DingtalkVersion")
        public String dingtalkVersion;

        /**
         * <p>DingTalk application EncryptKey.</p>
         * 
         * <strong>example:</strong>
         * <p>VkdWw91mdkrjVFr3ObNwefap21dfxxxx</p>
         */
        @NameInMap("EncryptKey")
        public String encryptKey;

        /**
         * <p>DingTalk application VerificationToken.</p>
         * 
         * <strong>example:</strong>
         * <p>myDingApp_VerifyTokenxxxxx</p>
         */
        @NameInMap("VerificationToken")
        public String verificationToken;

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

        public CreateIdentityProviderRequestDingtalkAppConfig setEncryptKey(String encryptKey) {
            this.encryptKey = encryptKey;
            return this;
        }
        public String getEncryptKey() {
            return this.encryptKey;
        }

        public CreateIdentityProviderRequestDingtalkAppConfig setVerificationToken(String verificationToken) {
            this.verificationToken = verificationToken;
            return this;
        }
        public String getVerificationToken() {
            return this.verificationToken;
        }

    }

    public static class CreateIdentityProviderRequestLarkConfig extends TeaModel {
        /**
         * <p>Lark application AppId.</p>
         * 
         * <strong>example:</strong>
         * <p>cli_xxxx</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>Lark application Secret.</p>
         * 
         * <strong>example:</strong>
         * <p>KiiLzh5Dueh4wbLxxxx</p>
         */
        @NameInMap("AppSecret")
        public String appSecret;

        /**
         * <p>EncryptKey of the Lark self-built application.</p>
         * 
         * <strong>example:</strong>
         * <p>VkdWw91mdkrjVFr3ObNwefap21dfxxxx</p>
         */
        @NameInMap("EncryptKey")
        public String encryptKey;

        /**
         * <p>Lark enterprise code.</p>
         * 
         * <strong>example:</strong>
         * <p>FSX123111xxx</p>
         */
        @NameInMap("EnterpriseNumber")
        public String enterpriseNumber;

        /**
         * <p>VerificationToken of the Lark self-built application.</p>
         * 
         * <strong>example:</strong>
         * <p>feishuVerifyTokenxxxxx</p>
         */
        @NameInMap("VerificationToken")
        public String verificationToken;

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

        public CreateIdentityProviderRequestLarkConfig setEncryptKey(String encryptKey) {
            this.encryptKey = encryptKey;
            return this;
        }
        public String getEncryptKey() {
            return this.encryptKey;
        }

        public CreateIdentityProviderRequestLarkConfig setEnterpriseNumber(String enterpriseNumber) {
            this.enterpriseNumber = enterpriseNumber;
            return this;
        }
        public String getEnterpriseNumber() {
            return this.enterpriseNumber;
        }

        public CreateIdentityProviderRequestLarkConfig setVerificationToken(String verificationToken) {
            this.verificationToken = verificationToken;
            return this;
        }
        public String getVerificationToken() {
            return this.verificationToken;
        }

    }

    public static class CreateIdentityProviderRequestLdapConfig extends TeaModel {
        /**
         * <p>Administrator password.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("AdministratorPassword")
        public String administratorPassword;

        /**
         * <p>Administrator account.</p>
         * 
         * <strong>example:</strong>
         * <p>DC=example,DC=com</p>
         */
        @NameInMap("AdministratorUsername")
        public String administratorUsername;

        /**
         * <p>Whether to verify certificate fingerprint. Valid values:</p>
         * <ul>
         * <li><p>Disabled: disabled</p>
         * </li>
         * <li><p>Enabled: enabled</p>
         * </li>
         * </ul>
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
         * <p>Group member attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>member</p>
         */
        @NameInMap("GroupMemberAttributeName")
        public String groupMemberAttributeName;

        /**
         * <p>Group ObjectClass.</p>
         * 
         * <strong>example:</strong>
         * <p>group</p>
         */
        @NameInMap("GroupObjectClass")
        public String groupObjectClass;

        /**
         * <p>Group custom filter.</p>
         * 
         * <strong>example:</strong>
         * <p>(|(cn=test)(group=<a href="mailto:test@test.com">test@test.com</a>))</p>
         */
        @NameInMap("GroupObjectClassCustomFilter")
        public String groupObjectClassCustomFilter;

        /**
         * <p>Communication protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>ldap</p>
         */
        @NameInMap("LdapProtocol")
        public String ldapProtocol;

        /**
         * <p>AD/LDAP server address.</p>
         * 
         * <strong>example:</strong>
         * <p>123.xx.xx.89</p>
         */
        @NameInMap("LdapServerHost")
        public String ldapServerHost;

        /**
         * <p>AD/LDAP port number.</p>
         * 
         * <strong>example:</strong>
         * <p>636</p>
         */
        @NameInMap("LdapServerPort")
        public Integer ldapServerPort;

        /**
         * <p>Organization ObjectClass.</p>
         * 
         * <strong>example:</strong>
         * <p>organizationUnit,top</p>
         */
        @NameInMap("OrganizationUnitObjectClass")
        public String organizationUnitObjectClass;

        /**
         * <p>Organization RDN.</p>
         * 
         * <strong>example:</strong>
         * <p>ou</p>
         */
        @NameInMap("OrganizationalUnitRdn")
        public String organizationalUnitRdn;

        /**
         * <p>Password synchronization switch.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("PasswordSyncStatus")
        public String passwordSyncStatus;

        /**
         * <p>Whether startTLS is enabled. Valid values:</p>
         * <ul>
         * <li><p>Disabled: disabled</p>
         * </li>
         * <li><p>Enabled: enabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("StartTlsStatus")
        public String startTlsStatus;

        /**
         * <p>User login identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>userPrincipalName, mail</p>
         */
        @NameInMap("UserLoginIdentifier")
        public String userLoginIdentifier;

        /**
         * <p>User ObjectClass.</p>
         * 
         * <strong>example:</strong>
         * <p>person,user</p>
         */
        @NameInMap("UserObjectClass")
        public String userObjectClass;

        /**
         * <p>User custom filter.</p>
         * 
         * <strong>example:</strong>
         * <p>(|(cn=test)(mail=<a href="mailto:test@test.com">test@test.com</a>))</p>
         */
        @NameInMap("UserObjectClassCustomFilter")
        public String userObjectClassCustomFilter;

        /**
         * <p>User RDN.</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("UserRdn")
        public String userRdn;

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

        public CreateIdentityProviderRequestLdapConfig setOrganizationalUnitRdn(String organizationalUnitRdn) {
            this.organizationalUnitRdn = organizationalUnitRdn;
            return this;
        }
        public String getOrganizationalUnitRdn() {
            return this.organizationalUnitRdn;
        }

        public CreateIdentityProviderRequestLdapConfig setPasswordSyncStatus(String passwordSyncStatus) {
            this.passwordSyncStatus = passwordSyncStatus;
            return this;
        }
        public String getPasswordSyncStatus() {
            return this.passwordSyncStatus;
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

        public CreateIdentityProviderRequestLdapConfig setUserRdn(String userRdn) {
            this.userRdn = userRdn;
            return this;
        }
        public String getUserRdn() {
            return this.userRdn;
        }

    }

    public static class CreateIdentityProviderRequestOidcConfigAuthnParam extends TeaModel {
        /**
         * <p>OIDC authentication method. Valid values:</p>
         * <ul>
         * <li><p>client_secret_basic</p>
         * </li>
         * <li><p>client_secret_post</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>client_secret_post</p>
         */
        @NameInMap("AuthnMethod")
        public String authnMethod;

        /**
         * <p>OIDC client ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>OIDC client secret.</p>
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
         * <p>OIDC authorization endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/auth/authorize">https://example.com/auth/authorize</a></p>
         */
        @NameInMap("AuthorizationEndpoint")
        public String authorizationEndpoint;

        /**
         * <p>OIDC issuer.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/auth">https://example.com/auth</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>OIDC JWKS URI.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/auth/jwks">https://example.com/auth/jwks</a></p>
         */
        @NameInMap("JwksUri")
        public String jwksUri;

        /**
         * <p>OIDC token endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/auth/token">https://example.com/auth/token</a></p>
         */
        @NameInMap("TokenEndpoint")
        public String tokenEndpoint;

        /**
         * <p>OIDC UserInfo endpoint.</p>
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
         * <p>OIDC client authentication configuration.</p>
         */
        @NameInMap("AuthnParam")
        public CreateIdentityProviderRequestOidcConfigAuthnParam authnParam;

        /**
         * <p>OIDC endpoint configuration.</p>
         */
        @NameInMap("EndpointConfig")
        public CreateIdentityProviderRequestOidcConfigEndpointConfig endpointConfig;

        /**
         * <p>OIDC grant scopes.</p>
         * 
         * <strong>example:</strong>
         * <p>openid</p>
         */
        @NameInMap("GrantScopes")
        public java.util.List<String> grantScopes;

        /**
         * <p>OIDC grant type.</p>
         * 
         * <strong>example:</strong>
         * <p>authorization_code</p>
         */
        @NameInMap("GrantType")
        public String grantType;

        /**
         * <p>PKCE algorithm. Valid values:</p>
         * <ul>
         * <li><p>SHA256: S256</p>
         * </li>
         * <li><p>Plain text: plain</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S256</p>
         */
        @NameInMap("PkceChallengeMethod")
        public String pkceChallengeMethod;

        /**
         * <p>Whether to use PKCE in Authorization Code grant mode.</p>
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

    public static class CreateIdentityProviderRequestSamlConfigCertificates extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE----- MIIC0jCCAbqgAwIBAgIQXXXXX-----END CERTIFICATE-----</p>
         */
        @NameInMap("Content")
        public String content;

        public static CreateIdentityProviderRequestSamlConfigCertificates build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestSamlConfigCertificates self = new CreateIdentityProviderRequestSamlConfigCertificates();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestSamlConfigCertificates setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CreateIdentityProviderRequestSamlConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HTTP-REDIRECT</p>
         */
        @NameInMap("BindingMethod")
        public String bindingMethod;

        @NameInMap("Certificates")
        public java.util.List<CreateIdentityProviderRequestSamlConfigCertificates> certificates;

        /**
         * <strong>example:</strong>
         * <p><a href="http://dc.test.com/adfs/services/trust">http://dc.test.com/adfs/services/trust</a></p>
         */
        @NameInMap("IdPEntityId")
        public String idPEntityId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://dc.test.com/adfs/ls/">https://dc.test.com/adfs/ls/</a></p>
         */
        @NameInMap("IdPSsoUrl")
        public String idPSsoUrl;

        /**
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("MaxClockSkew")
        public Long maxClockSkew;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RequireRequestSigned")
        public Boolean requireRequestSigned;

        @NameInMap("WantAssertionsSigned")
        public Boolean wantAssertionsSigned;

        @NameInMap("WantResponseSigned")
        public Boolean wantResponseSigned;

        public static CreateIdentityProviderRequestSamlConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestSamlConfig self = new CreateIdentityProviderRequestSamlConfig();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestSamlConfig setBindingMethod(String bindingMethod) {
            this.bindingMethod = bindingMethod;
            return this;
        }
        public String getBindingMethod() {
            return this.bindingMethod;
        }

        public CreateIdentityProviderRequestSamlConfig setCertificates(java.util.List<CreateIdentityProviderRequestSamlConfigCertificates> certificates) {
            this.certificates = certificates;
            return this;
        }
        public java.util.List<CreateIdentityProviderRequestSamlConfigCertificates> getCertificates() {
            return this.certificates;
        }

        public CreateIdentityProviderRequestSamlConfig setIdPEntityId(String idPEntityId) {
            this.idPEntityId = idPEntityId;
            return this;
        }
        public String getIdPEntityId() {
            return this.idPEntityId;
        }

        public CreateIdentityProviderRequestSamlConfig setIdPSsoUrl(String idPSsoUrl) {
            this.idPSsoUrl = idPSsoUrl;
            return this;
        }
        public String getIdPSsoUrl() {
            return this.idPSsoUrl;
        }

        public CreateIdentityProviderRequestSamlConfig setMaxClockSkew(Long maxClockSkew) {
            this.maxClockSkew = maxClockSkew;
            return this;
        }
        public Long getMaxClockSkew() {
            return this.maxClockSkew;
        }

        public CreateIdentityProviderRequestSamlConfig setRequireRequestSigned(Boolean requireRequestSigned) {
            this.requireRequestSigned = requireRequestSigned;
            return this;
        }
        public Boolean getRequireRequestSigned() {
            return this.requireRequestSigned;
        }

        public CreateIdentityProviderRequestSamlConfig setWantAssertionsSigned(Boolean wantAssertionsSigned) {
            this.wantAssertionsSigned = wantAssertionsSigned;
            return this;
        }
        public Boolean getWantAssertionsSigned() {
            return this.wantAssertionsSigned;
        }

        public CreateIdentityProviderRequestSamlConfig setWantResponseSigned(Boolean wantResponseSigned) {
            this.wantResponseSigned = wantResponseSigned;
            return this;
        }
        public Boolean getWantResponseSigned() {
            return this.wantResponseSigned;
        }

    }

    public static class CreateIdentityProviderRequestUdPullConfigPeriodicSyncConfig extends TeaModel {
        /**
         * <p>Cron expression.</p>
         * 
         * <strong>example:</strong>
         * <p>0 45 1 * * ?</p>
         */
        @NameInMap("PeriodicSyncCron")
        public String periodicSyncCron;

        /**
         * <p>Set of execution time points.</p>
         */
        @NameInMap("PeriodicSyncTimes")
        public java.util.List<Integer> periodicSyncTimes;

        /**
         * <p>Type.</p>
         * 
         * <strong>example:</strong>
         * <p>cron</p>
         */
        @NameInMap("PeriodicSyncType")
        public String periodicSyncType;

        public static CreateIdentityProviderRequestUdPullConfigPeriodicSyncConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestUdPullConfigPeriodicSyncConfig self = new CreateIdentityProviderRequestUdPullConfigPeriodicSyncConfig();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestUdPullConfigPeriodicSyncConfig setPeriodicSyncCron(String periodicSyncCron) {
            this.periodicSyncCron = periodicSyncCron;
            return this;
        }
        public String getPeriodicSyncCron() {
            return this.periodicSyncCron;
        }

        public CreateIdentityProviderRequestUdPullConfigPeriodicSyncConfig setPeriodicSyncTimes(java.util.List<Integer> periodicSyncTimes) {
            this.periodicSyncTimes = periodicSyncTimes;
            return this;
        }
        public java.util.List<Integer> getPeriodicSyncTimes() {
            return this.periodicSyncTimes;
        }

        public CreateIdentityProviderRequestUdPullConfigPeriodicSyncConfig setPeriodicSyncType(String periodicSyncType) {
            this.periodicSyncType = periodicSyncType;
            return this;
        }
        public String getPeriodicSyncType() {
            return this.periodicSyncType;
        }

    }

    public static class CreateIdentityProviderRequestUdPullConfigUdSyncScopeConfig extends TeaModel {
        /**
         * <p>Source synchronization node list.</p>
         */
        @NameInMap("SourceScopes")
        public java.util.List<String> sourceScopes;

        /**
         * <p>Target synchronization node. Enter the IDaaS organization ID.</p>
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
         * <p>Whether group synchronization is supported. Default: disabled. Valid values:</p>
         * <ul>
         * <li><p>Disabled: disabled</p>
         * </li>
         * <li><p>Enabled: enabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("GroupSyncStatus")
        public String groupSyncStatus;

        /**
         * <p>Incremental callback status. Specifies whether to process incremental callback data from the IdP. Valid values:</p>
         * <ul>
         * <li><p>Disabled: disabled</p>
         * </li>
         * <li><p>Enabled: enabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("IncrementalCallbackStatus")
        public String incrementalCallbackStatus;

        /**
         * <p>Periodic verification configuration.</p>
         */
        @NameInMap("PeriodicSyncConfig")
        public CreateIdentityProviderRequestUdPullConfigPeriodicSyncConfig periodicSyncConfig;

        /**
         * <p>Periodic verification status. Specifies whether to periodically verify data differences between EIAM and the identity provider. Valid values:</p>
         * <ul>
         * <li><p>Disabled: disabled</p>
         * </li>
         * <li><p>Enabled: enabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("PeriodicSyncStatus")
        public String periodicSyncStatus;

        /**
         * <p>Synchronization scope configuration.</p>
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

        public CreateIdentityProviderRequestUdPullConfig setPeriodicSyncConfig(CreateIdentityProviderRequestUdPullConfigPeriodicSyncConfig periodicSyncConfig) {
            this.periodicSyncConfig = periodicSyncConfig;
            return this;
        }
        public CreateIdentityProviderRequestUdPullConfigPeriodicSyncConfig getPeriodicSyncConfig() {
            return this.periodicSyncConfig;
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

    public static class CreateIdentityProviderRequestUdPushConfigPeriodicSyncConfig extends TeaModel {
        /**
         * <p>Cron expression.</p>
         * 
         * <strong>example:</strong>
         * <p>0 45 1 * * ?</p>
         */
        @NameInMap("PeriodicSyncCron")
        public String periodicSyncCron;

        /**
         * <p>Set of execution time points.</p>
         */
        @NameInMap("PeriodicSyncTimes")
        public java.util.List<Integer> periodicSyncTimes;

        /**
         * <p>Type.</p>
         * 
         * <strong>example:</strong>
         * <p>cron</p>
         */
        @NameInMap("PeriodicSyncType")
        public String periodicSyncType;

        public static CreateIdentityProviderRequestUdPushConfigPeriodicSyncConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateIdentityProviderRequestUdPushConfigPeriodicSyncConfig self = new CreateIdentityProviderRequestUdPushConfigPeriodicSyncConfig();
            return TeaModel.build(map, self);
        }

        public CreateIdentityProviderRequestUdPushConfigPeriodicSyncConfig setPeriodicSyncCron(String periodicSyncCron) {
            this.periodicSyncCron = periodicSyncCron;
            return this;
        }
        public String getPeriodicSyncCron() {
            return this.periodicSyncCron;
        }

        public CreateIdentityProviderRequestUdPushConfigPeriodicSyncConfig setPeriodicSyncTimes(java.util.List<Integer> periodicSyncTimes) {
            this.periodicSyncTimes = periodicSyncTimes;
            return this;
        }
        public java.util.List<Integer> getPeriodicSyncTimes() {
            return this.periodicSyncTimes;
        }

        public CreateIdentityProviderRequestUdPushConfigPeriodicSyncConfig setPeriodicSyncType(String periodicSyncType) {
            this.periodicSyncType = periodicSyncType;
            return this;
        }
        public String getPeriodicSyncType() {
            return this.periodicSyncType;
        }

    }

    public static class CreateIdentityProviderRequestUdPushConfigUdSyncScopeConfigs extends TeaModel {
        /**
         * <p>Source synchronization node list.</p>
         */
        @NameInMap("SourceScopes")
        public java.util.List<String> sourceScopes;

        /**
         * <p>Target synchronization node.</p>
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
         * <p>Incremental callback status. This field is not yet enabled. Please ignore it.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("IncrementalCallbackStatus")
        public String incrementalCallbackStatus;

        /**
         * <p>Periodic verification configuration.</p>
         */
        @NameInMap("PeriodicSyncConfig")
        public CreateIdentityProviderRequestUdPushConfigPeriodicSyncConfig periodicSyncConfig;

        /**
         * <p>Periodic verification status. This field is not yet enabled. Please ignore it.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("PeriodicSyncStatus")
        public String periodicSyncStatus;

        /**
         * <p>Outbound synchronization configuration.</p>
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

        public CreateIdentityProviderRequestUdPushConfig setPeriodicSyncConfig(CreateIdentityProviderRequestUdPushConfigPeriodicSyncConfig periodicSyncConfig) {
            this.periodicSyncConfig = periodicSyncConfig;
            return this;
        }
        public CreateIdentityProviderRequestUdPushConfigPeriodicSyncConfig getPeriodicSyncConfig() {
            return this.periodicSyncConfig;
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
         * <p>AgentId of the WeCom self-built application.</p>
         * 
         * <strong>example:</strong>
         * <p>278231941749863339</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>Authorization callback domain.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.aliyunidaas.com/xxxx">https://xxx.aliyunidaas.com/xxxx</a></p>
         */
        @NameInMap("AuthorizeCallbackDomain")
        public String authorizeCallbackDomain;

        /**
         * <p>CorpId of the WeCom self-built application.</p>
         * 
         * <strong>example:</strong>
         * <p>3756043633237690761</p>
         */
        @NameInMap("CorpId")
        public String corpId;

        /**
         * <p>CorpSecret of the WeCom self-built application.</p>
         * 
         * <strong>example:</strong>
         * <p>CSEHDddddddxxxxuxkJEHPveWRXBGqVqRsxxxx</p>
         */
        @NameInMap("CorpSecret")
        public String corpSecret;

        /**
         * <p>Trusted domain.</p>
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
