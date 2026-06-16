// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetIdentityProviderAuthnConfigurationRequest extends TeaModel {
    /**
     * <p>Automatic Account Creation Rule Configuration.</p>
     */
    @NameInMap("AutoCreateUserConfig")
    public SetIdentityProviderAuthnConfigurationRequestAutoCreateUserConfig autoCreateUserConfig;

    /**
     * <p>Automatic Account Update Configuration</p>
     */
    @NameInMap("AutoUpdateUserConfig")
    public SetIdentityProviderAuthnConfigurationRequestAutoUpdateUserConfig autoUpdateUserConfig;

    /**
     * <p>Account Binding Rule Configuration</p>
     */
    @NameInMap("BindingConfig")
    public SetIdentityProviderAuthnConfigurationRequestBindingConfig bindingConfig;

    /**
     * <p>Identity Provider ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idp_11111</p>
     */
    @NameInMap("IdentityProviderId")
    public String identityProviderId;

    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>AD/LDAP Authentication Configuration</p>
     */
    @NameInMap("LdapAuthnConfig")
    public SetIdentityProviderAuthnConfigurationRequestLdapAuthnConfig ldapAuthnConfig;

    public static SetIdentityProviderAuthnConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        SetIdentityProviderAuthnConfigurationRequest self = new SetIdentityProviderAuthnConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public SetIdentityProviderAuthnConfigurationRequest setAutoCreateUserConfig(SetIdentityProviderAuthnConfigurationRequestAutoCreateUserConfig autoCreateUserConfig) {
        this.autoCreateUserConfig = autoCreateUserConfig;
        return this;
    }
    public SetIdentityProviderAuthnConfigurationRequestAutoCreateUserConfig getAutoCreateUserConfig() {
        return this.autoCreateUserConfig;
    }

    public SetIdentityProviderAuthnConfigurationRequest setAutoUpdateUserConfig(SetIdentityProviderAuthnConfigurationRequestAutoUpdateUserConfig autoUpdateUserConfig) {
        this.autoUpdateUserConfig = autoUpdateUserConfig;
        return this;
    }
    public SetIdentityProviderAuthnConfigurationRequestAutoUpdateUserConfig getAutoUpdateUserConfig() {
        return this.autoUpdateUserConfig;
    }

    public SetIdentityProviderAuthnConfigurationRequest setBindingConfig(SetIdentityProviderAuthnConfigurationRequestBindingConfig bindingConfig) {
        this.bindingConfig = bindingConfig;
        return this;
    }
    public SetIdentityProviderAuthnConfigurationRequestBindingConfig getBindingConfig() {
        return this.bindingConfig;
    }

    public SetIdentityProviderAuthnConfigurationRequest setIdentityProviderId(String identityProviderId) {
        this.identityProviderId = identityProviderId;
        return this;
    }
    public String getIdentityProviderId() {
        return this.identityProviderId;
    }

    public SetIdentityProviderAuthnConfigurationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetIdentityProviderAuthnConfigurationRequest setLdapAuthnConfig(SetIdentityProviderAuthnConfigurationRequestLdapAuthnConfig ldapAuthnConfig) {
        this.ldapAuthnConfig = ldapAuthnConfig;
        return this;
    }
    public SetIdentityProviderAuthnConfigurationRequestLdapAuthnConfig getLdapAuthnConfig() {
        return this.ldapAuthnConfig;
    }

    public static class SetIdentityProviderAuthnConfigurationRequestAutoCreateUserConfig extends TeaModel {
        /**
         * <p>Automatic account creation status.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("AutoCreateUserStatus")
        public String autoCreateUserStatus;

        /**
         * <p>Organization ID</p>
         */
        @NameInMap("TargetOrganizationalUnitIds")
        public java.util.List<String> targetOrganizationalUnitIds;

        public static SetIdentityProviderAuthnConfigurationRequestAutoCreateUserConfig build(java.util.Map<String, ?> map) throws Exception {
            SetIdentityProviderAuthnConfigurationRequestAutoCreateUserConfig self = new SetIdentityProviderAuthnConfigurationRequestAutoCreateUserConfig();
            return TeaModel.build(map, self);
        }

        public SetIdentityProviderAuthnConfigurationRequestAutoCreateUserConfig setAutoCreateUserStatus(String autoCreateUserStatus) {
            this.autoCreateUserStatus = autoCreateUserStatus;
            return this;
        }
        public String getAutoCreateUserStatus() {
            return this.autoCreateUserStatus;
        }

        public SetIdentityProviderAuthnConfigurationRequestAutoCreateUserConfig setTargetOrganizationalUnitIds(java.util.List<String> targetOrganizationalUnitIds) {
            this.targetOrganizationalUnitIds = targetOrganizationalUnitIds;
            return this;
        }
        public java.util.List<String> getTargetOrganizationalUnitIds() {
            return this.targetOrganizationalUnitIds;
        }

    }

    public static class SetIdentityProviderAuthnConfigurationRequestAutoUpdateUserConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable automatic account updates.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("AutoUpdateUserStatus")
        public String autoUpdateUserStatus;

        public static SetIdentityProviderAuthnConfigurationRequestAutoUpdateUserConfig build(java.util.Map<String, ?> map) throws Exception {
            SetIdentityProviderAuthnConfigurationRequestAutoUpdateUserConfig self = new SetIdentityProviderAuthnConfigurationRequestAutoUpdateUserConfig();
            return TeaModel.build(map, self);
        }

        public SetIdentityProviderAuthnConfigurationRequestAutoUpdateUserConfig setAutoUpdateUserStatus(String autoUpdateUserStatus) {
            this.autoUpdateUserStatus = autoUpdateUserStatus;
            return this;
        }
        public String getAutoUpdateUserStatus() {
            return this.autoUpdateUserStatus;
        }

    }

    public static class SetIdentityProviderAuthnConfigurationRequestBindingConfigAutoMatchUserProfileExpressions extends TeaModel {
        /**
         * <p>Type of expression.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>field</p>
         */
        @NameInMap("ExpressionMappingType")
        public String expressionMappingType;

        /**
         * <p>Expression for mapping attribute value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idpUser.userId</p>
         */
        @NameInMap("SourceValueExpression")
        public String sourceValueExpression;

        /**
         * <p>Target attribute name for mapping.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user.username</p>
         */
        @NameInMap("TargetField")
        public String targetField;

        /**
         * <p>Target attribute name for mapping.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
        @NameInMap("TargetFieldDescription")
        public String targetFieldDescription;

        public static SetIdentityProviderAuthnConfigurationRequestBindingConfigAutoMatchUserProfileExpressions build(java.util.Map<String, ?> map) throws Exception {
            SetIdentityProviderAuthnConfigurationRequestBindingConfigAutoMatchUserProfileExpressions self = new SetIdentityProviderAuthnConfigurationRequestBindingConfigAutoMatchUserProfileExpressions();
            return TeaModel.build(map, self);
        }

        public SetIdentityProviderAuthnConfigurationRequestBindingConfigAutoMatchUserProfileExpressions setExpressionMappingType(String expressionMappingType) {
            this.expressionMappingType = expressionMappingType;
            return this;
        }
        public String getExpressionMappingType() {
            return this.expressionMappingType;
        }

        public SetIdentityProviderAuthnConfigurationRequestBindingConfigAutoMatchUserProfileExpressions setSourceValueExpression(String sourceValueExpression) {
            this.sourceValueExpression = sourceValueExpression;
            return this;
        }
        public String getSourceValueExpression() {
            return this.sourceValueExpression;
        }

        public SetIdentityProviderAuthnConfigurationRequestBindingConfigAutoMatchUserProfileExpressions setTargetField(String targetField) {
            this.targetField = targetField;
            return this;
        }
        public String getTargetField() {
            return this.targetField;
        }

        public SetIdentityProviderAuthnConfigurationRequestBindingConfigAutoMatchUserProfileExpressions setTargetFieldDescription(String targetFieldDescription) {
            this.targetFieldDescription = targetFieldDescription;
            return this;
        }
        public String getTargetFieldDescription() {
            return this.targetFieldDescription;
        }

    }

    public static class SetIdentityProviderAuthnConfigurationRequestBindingConfig extends TeaModel {
        /**
         * <p>Rules for automatic account matching.</p>
         */
        @NameInMap("AutoMatchUserProfileExpressions")
        public java.util.List<SetIdentityProviderAuthnConfigurationRequestBindingConfigAutoMatchUserProfileExpressions> autoMatchUserProfileExpressions;

        /**
         * <p>Automatic account matching status.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("AutoMatchUserStatus")
        public String autoMatchUserStatus;

        /**
         * <p>Specifies whether the manual account binding feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("MappingBindingStatus")
        public String mappingBindingStatus;

        public static SetIdentityProviderAuthnConfigurationRequestBindingConfig build(java.util.Map<String, ?> map) throws Exception {
            SetIdentityProviderAuthnConfigurationRequestBindingConfig self = new SetIdentityProviderAuthnConfigurationRequestBindingConfig();
            return TeaModel.build(map, self);
        }

        public SetIdentityProviderAuthnConfigurationRequestBindingConfig setAutoMatchUserProfileExpressions(java.util.List<SetIdentityProviderAuthnConfigurationRequestBindingConfigAutoMatchUserProfileExpressions> autoMatchUserProfileExpressions) {
            this.autoMatchUserProfileExpressions = autoMatchUserProfileExpressions;
            return this;
        }
        public java.util.List<SetIdentityProviderAuthnConfigurationRequestBindingConfigAutoMatchUserProfileExpressions> getAutoMatchUserProfileExpressions() {
            return this.autoMatchUserProfileExpressions;
        }

        public SetIdentityProviderAuthnConfigurationRequestBindingConfig setAutoMatchUserStatus(String autoMatchUserStatus) {
            this.autoMatchUserStatus = autoMatchUserStatus;
            return this;
        }
        public String getAutoMatchUserStatus() {
            return this.autoMatchUserStatus;
        }

        public SetIdentityProviderAuthnConfigurationRequestBindingConfig setMappingBindingStatus(String mappingBindingStatus) {
            this.mappingBindingStatus = mappingBindingStatus;
            return this;
        }
        public String getMappingBindingStatus() {
            return this.mappingBindingStatus;
        }

    }

    public static class SetIdentityProviderAuthnConfigurationRequestLdapAuthnConfig extends TeaModel {
        /**
         * <p>Specifies whether to automatically update passwords.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("AutoUpdatePasswordStatus")
        public String autoUpdatePasswordStatus;

        /**
         * <p>User Login Identifier</p>
         * 
         * <strong>example:</strong>
         * <p>email</p>
         */
        @NameInMap("UserLoginIdentifier")
        public String userLoginIdentifier;

        /**
         * <p>User ObjectClass</p>
         * 
         * <strong>example:</strong>
         * <p>posixAccount</p>
         */
        @NameInMap("UserObjectClass")
        public String userObjectClass;

        public static SetIdentityProviderAuthnConfigurationRequestLdapAuthnConfig build(java.util.Map<String, ?> map) throws Exception {
            SetIdentityProviderAuthnConfigurationRequestLdapAuthnConfig self = new SetIdentityProviderAuthnConfigurationRequestLdapAuthnConfig();
            return TeaModel.build(map, self);
        }

        public SetIdentityProviderAuthnConfigurationRequestLdapAuthnConfig setAutoUpdatePasswordStatus(String autoUpdatePasswordStatus) {
            this.autoUpdatePasswordStatus = autoUpdatePasswordStatus;
            return this;
        }
        public String getAutoUpdatePasswordStatus() {
            return this.autoUpdatePasswordStatus;
        }

        public SetIdentityProviderAuthnConfigurationRequestLdapAuthnConfig setUserLoginIdentifier(String userLoginIdentifier) {
            this.userLoginIdentifier = userLoginIdentifier;
            return this;
        }
        public String getUserLoginIdentifier() {
            return this.userLoginIdentifier;
        }

        public SetIdentityProviderAuthnConfigurationRequestLdapAuthnConfig setUserObjectClass(String userObjectClass) {
            this.userObjectClass = userObjectClass;
            return this;
        }
        public String getUserObjectClass() {
            return this.userObjectClass;
        }

    }

}
