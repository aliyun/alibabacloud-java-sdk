// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateIdentityProviderRequest extends TeaModel {
    /**
     * <p>Authentication configuration information.</p>
     */
    @NameInMap("AuthnConfig")
    public CreateIdentityProviderRequestAuthnConfig authnConfig;

    /**
     * <p>Auto-create account rule configuration.</p>
     */
    @NameInMap("AutoCreateUserConfig")
    public CreateIdentityProviderRequestAutoCreateUserConfig autoCreateUserConfig;

    /**
     * <p>Auto-update account rule configuration.</p>
     */
    @NameInMap("AutoUpdateUserConfig")
    public CreateIdentityProviderRequestAutoUpdateUserConfig autoUpdateUserConfig;

    /**
     * <p>OIDC identity provider account binding rule configuration.</p>
     */
    @NameInMap("BindingConfig")
    public CreateIdentityProviderRequestBindingConfig bindingConfig;

    /**
     * <p>Idp client token.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>DingTalk configuration information.</p>
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
     * <li><p>Inbound to DingTalk: urn:alibaba:idaas:idp:alibaba:dingtalk:pull</p>
     * </li>
     * <li><p>Outbound to DingTalk: urn:alibaba:idaas:idp:alibaba:dingtalk:push</p>
     * </li>
     * <li><p>Inbound to WeCom: urn:alibaba:idaas:idp:tencent:wecom:pull</p>
     * </li>
     * <li><p>Inbound to Lark: urn:alibaba:idaas:idp:bytedance:lark:pull</p>
     * </li>
     * <li><p>Inbound to AD: urn:alibaba:idaas:idp:microsoft:ad:pull</p>
     * </li>
     * <li><p>Inbound to LDAP: urn:alibaba:idaas:idp:unknown:ldap:pull</p>
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
     * <p>Lark (Feishu) configuration information.</p>
     */
    @NameInMap("LarkConfig")
    public CreateIdentityProviderRequestLarkConfig larkConfig;

    /**
     * <p>AD/LDAP configuration information.</p>
     */
    @NameInMap("LdapConfig")
    public CreateIdentityProviderRequestLdapConfig ldapConfig;

    /**
     * <p>IdP logo url.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-image://idaas_23aqr2ye554csg33dqpch5eu3q/tmp/d17d9adc-a943-45e7-ba0c-2838dddexxxxx</p>
     */
    @NameInMap("LogoUrl")
    public String logoUrl;

    /**
     * <p>The unique identifier of the network access endpoint.</p>
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

    /**
     * <p>Inbound synchronization configuration information.</p>
     */
    @NameInMap("UdPullConfig")
    public CreateIdentityProviderRequestUdPullConfig udPullConfig;

    /**
     * <p>Outbound synchronization configuration information.</p>
     */
    @NameInMap("UdPushConfig")
    public CreateIdentityProviderRequestUdPushConfig udPushConfig;

    /**
     * <p>WeCom configuration information.</p>
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
         * <p>Whether the corresponding IdP supports authentication. Value range:</p>
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
         * <p>Whether automatic password update is supported. Value range:</p>
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
         * <p>Whether auto-creation of accounts is enabled. Possible values:</p>
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
         * <p>Target organizational unit IDs collection.</p>
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
         * <p>Whether auto-updating of accounts is enabled. Possible values:</p>
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
         * <p>Type of the expression. Value range:</p>
         * <ul>
         * <li><p>Field: filed</p>
         * </li>
         * <li><p>Expression: expression</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>filed</p>
         */
        @NameInMap("ExpressionMappingType")
        public String expressionMappingType;

        /**
         * <p>Expression for the mapped attribute value.</p>
         * 
         * <strong>example:</strong>
         * <p>idpUser.phoneNumber</p>
         */
        @NameInMap("SourceValueExpression")
        public String sourceValueExpression;

        /**
         * <p>Name of the target attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>user.username</p>
         */
        @NameInMap("TargetField")
        public String targetField;

        /**
         * <p>Description of the target attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>user.username</p>
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
         * <p>List of rules for automatically matching accounts.</p>
         */
        @NameInMap("AutoMatchUserProfileExpressions")
        public java.util.List<CreateIdentityProviderRequestBindingConfigAutoMatchUserProfileExpressions> autoMatchUserProfileExpressions;

        /**
         * <p>Whether automatic account matching is enabled. Value range:</p>
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
         * <p>Whether the user manual account binding function is enabled. Value range:</p>
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
         * <p>AppKey of the DingTalk application.</p>
         * 
         * <strong>example:</strong>
         * <p>Xczngvfemo4e</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <p>AppSecret of the DingTalk application.</p>
         * 
         * <strong>example:</strong>
         * <p>5d405a12a6f84ad4ab05ee09axxxx</p>
         */
        @NameInMap("AppSecret")
        public String appSecret;

        /**
         * <p>CorpId of the DingTalk application.</p>
         * 
         * <strong>example:</strong>
         * <p>3075680424786133505</p>
         */
        @NameInMap("CorpId")
        public String corpId;

        /**
         * <p>DingTalk edition. Valid values:</p>
         * <p>public_dingtalk – Standard DingTalk.</p>
         * <p>private_dingtalk – Dedicated DingTalk.</p>
         * 
         * <strong>example:</strong>
         * <p>public_dingtalk</p>
         */
        @NameInMap("DingtalkVersion")
        public String dingtalkVersion;

        /**
         * <p>DingTalk encrypt key.</p>
         * 
         * <strong>example:</strong>
         * <p>29003eb11d0a28b4802a6f02fb8aa25dff730e2ac26ffd200dxxxx</p>
         */
        @NameInMap("EncryptKey")
        public String encryptKey;

        /**
         * <p>DingTalk verification token.</p>
         * 
         * <strong>example:</strong>
         * <p>5ba9c127a7abe029003eb11d0a28b4802a6f02fb8aa25dff730e2ac26ffd200dxxxx</p>
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
         * <p>Lark (Feishu) app appId.</p>
         * 
         * <strong>example:</strong>
         * <p>cli_xxxx</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>Lark (Feishu) app secret.</p>
         * 
         * <strong>example:</strong>
         * <p>KiiLzh5Dueh4wbLxxxx</p>
         */
        @NameInMap("AppSecret")
        public String appSecret;

        /**
         * <p>Lark (Feishu) encrypt key.</p>
         * 
         * <strong>example:</strong>
         * <p>29003eb11d0a28b4802a6f02fb8aa25dff730e2ac26ffd200dxxxx</p>
         */
        @NameInMap("EncryptKey")
        public String encryptKey;

        /**
         * <p>Lark (Feishu) enterprise number.</p>
         * 
         * <strong>example:</strong>
         * <p>FSX123111xxx</p>
         */
        @NameInMap("EnterpriseNumber")
        public String enterpriseNumber;

        /**
         * <p>Lark (Feishu)  verification token.</p>
         * 
         * <strong>example:</strong>
         * <p>5ba9c127a7abe029003eb11d0a28b4802a6f02fb8aa25dff730e2ac26ffd200dxxxx</p>
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
         * <p>Administrator username.</p>
         * 
         * <strong>example:</strong>
         * <p>DC=example,DC=com</p>
         */
        @NameInMap("AdministratorUsername")
        public String administratorUsername;

        /**
         * <p>Whether to verify the certificate fingerprint. Value range:</p>
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
         * <p>List of certificate fingerprints.</p>
         */
        @NameInMap("CertificateFingerprints")
        public java.util.List<String> certificateFingerprints;

        /**
         * <p>Group member attribute name.</p>
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
         * <p>Custom filter for Group ObjectClass.</p>
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
         * <p>Organization Unit ObjectClass.</p>
         * 
         * <strong>example:</strong>
         * <p>organizationUnit,top</p>
         */
        @NameInMap("OrganizationUnitObjectClass")
        public String organizationUnitObjectClass;

        /**
         * <p>Whether startTLS is enabled. Value range:</p>
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
         * <p>Custom filter for User ObjectClass.</p>
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
         * <p>OIDC authentication method. Value range:</p>
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
         * <p>The ID of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The  secret of the client.</p>
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
         * <p>OIDC issuer information.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/auth">https://example.com/auth</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>OIDC jwks uri.</p>
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
         * <p>OIDC user info endpoint.</p>
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
         * <p>OIDC grant scopes collection.</p>
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
         * <p>PKCE algorithm. Possible values:</p>
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
         * <p>Whether to use PKCE in the AuthorizationCode grant mode.</p>
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

    public static class CreateIdentityProviderRequestUdPullConfigPeriodicSyncConfig extends TeaModel {
        /**
         * <p>cron expression.</p>
         * 
         * <strong>example:</strong>
         * <p>0 45 1 * * ?</p>
         */
        @NameInMap("PeriodicSyncCron")
        public String periodicSyncCron;

        /**
         * <p>Collection of time points.</p>
         */
        @NameInMap("PeriodicSyncTimes")
        public java.util.List<Integer> periodicSyncTimes;

        /**
         * <p>type.</p>
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
         * <p>List of source nodes for synchronization.</p>
         */
        @NameInMap("SourceScopes")
        public java.util.List<String> sourceScopes;

        /**
         * <p>Synchronize target node, and fill in the IDaaS organization ID.</p>
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
         * <p>Whether group synchronization is supported. The default value is disabled. Possible values:</p>
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
         * <p>Incremental callback status, indicating whether to process incremental callback data from the IdP. Possible values:</p>
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
         * <p>Scheduled configuration verification.</p>
         */
        @NameInMap("PeriodicSyncConfig")
        public CreateIdentityProviderRequestUdPullConfigPeriodicSyncConfig periodicSyncConfig;

        /**
         * <p>Periodic check status, indicating whether to periodically check the data differences between EIAM and the identity provider. Possible values:</p>
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
         * <p>Synchronization scope configuration information.</p>
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

    public static class CreateIdentityProviderRequestUdPushConfigUdSyncScopeConfigs extends TeaModel {
        /**
         * <p>List of source nodes for synchronization.</p>
         */
        @NameInMap("SourceScopes")
        public java.util.List<String> sourceScopes;

        /**
         * <p>Target node for synchronization.</p>
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
         * <p>Incremental callback status. This field is reserved and currently not in use; please ignore it.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("IncrementalCallbackStatus")
        public String incrementalCallbackStatus;

        /**
         * <p>Periodic check status. This field is currently not in use, please ignore it.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("PeriodicSyncStatus")
        public String periodicSyncStatus;

        /**
         * <p>Outbound synchronization configuration information.</p>
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
         * <p>Agent ID of the self-built WeCom application.</p>
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
         * <p>Corp ID of the self-built WeCom application.</p>
         * 
         * <strong>example:</strong>
         * <p>3756043633237690761</p>
         */
        @NameInMap("CorpId")
        public String corpId;

        /**
         * <p>Corp Secret of the self-built WeCom application.</p>
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
