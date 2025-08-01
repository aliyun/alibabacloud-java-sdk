// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    /**
     * <p>The password initialization method. Set the value to random,</p>
     * <ul>
     * <li>which indicates that the password is randomly generated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>client-token-demo</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The custom extended fields.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("CustomFields")
    public java.util.List<CreateUserRequestCustomFields> customFields;

    /**
     * <p>The description of the organization. The value can be up to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>description text</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The display name of the account. The display name can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>name_001</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The name of the account. The name can be up to 64 characters in length and can contain letters, digits, underscores (_), periods (.), at signs (@), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:example@example.com">example@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The description of the account. The description can be up to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EmailVerified")
    public Boolean emailVerified;

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
     * <p>Specifies whether the mobile phone number is a trusted mobile phone number. This parameter is required if the PhoneNumber parameter is specified. If you have no special business requirements, set this parameter to true.</p>
     */
    @NameInMap("OrganizationalUnitIds")
    public java.util.List<String> organizationalUnitIds;

    /**
     * <p>The password of the account. For more information,view the password policyof the instanceinthe IDaaS console.</p>
     * 
     * <strong>example:</strong>
     * <p>123456xxx</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The configurations for password initialization.</p>
     */
    @NameInMap("PasswordInitializationConfig")
    public CreateUserRequestPasswordInitializationConfig passwordInitializationConfig;

    /**
     * <p>The ID of the account.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678901xxx</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>The email address of the user who owns the account. The email address prefix can contain letters, digits, underscores (_), periods (.), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PhoneNumberVerified")
    public Boolean phoneNumberVerified;

    /**
     * <p>The IDs of organizational units to which the account belongs. An account can belong to multiple organizational units.</p>
     * 
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("PhoneRegion")
    public String phoneRegion;

    /**
     * <p>主组织ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
     */
    @NameInMap("PrimaryOrganizationalUnitId")
    public String primaryOrganizationalUnitId;

    /**
     * <p>The display name of the account. The display name can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
     */
    @NameInMap("UserExternalId")
    public String userExternalId;

    /**
     * <p>The name of the extended field. You must create the extended field in advance. To create an extended field, log on to the IDaaS console. In the left-side navigation pane, choose Accounts &gt; Extended Fields, and then click Create Field on the Extended Fields page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_001</p>
     */
    @NameInMap("Username")
    public String username;

    public static CreateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserRequest self = new CreateUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateUserRequest setCustomFields(java.util.List<CreateUserRequestCustomFields> customFields) {
        this.customFields = customFields;
        return this;
    }
    public java.util.List<CreateUserRequestCustomFields> getCustomFields() {
        return this.customFields;
    }

    public CreateUserRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUserRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateUserRequest setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
        return this;
    }
    public Boolean getEmailVerified() {
        return this.emailVerified;
    }

    public CreateUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateUserRequest setOrganizationalUnitIds(java.util.List<String> organizationalUnitIds) {
        this.organizationalUnitIds = organizationalUnitIds;
        return this;
    }
    public java.util.List<String> getOrganizationalUnitIds() {
        return this.organizationalUnitIds;
    }

    public CreateUserRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateUserRequest setPasswordInitializationConfig(CreateUserRequestPasswordInitializationConfig passwordInitializationConfig) {
        this.passwordInitializationConfig = passwordInitializationConfig;
        return this;
    }
    public CreateUserRequestPasswordInitializationConfig getPasswordInitializationConfig() {
        return this.passwordInitializationConfig;
    }

    public CreateUserRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public CreateUserRequest setPhoneNumberVerified(Boolean phoneNumberVerified) {
        this.phoneNumberVerified = phoneNumberVerified;
        return this;
    }
    public Boolean getPhoneNumberVerified() {
        return this.phoneNumberVerified;
    }

    public CreateUserRequest setPhoneRegion(String phoneRegion) {
        this.phoneRegion = phoneRegion;
        return this;
    }
    public String getPhoneRegion() {
        return this.phoneRegion;
    }

    public CreateUserRequest setPrimaryOrganizationalUnitId(String primaryOrganizationalUnitId) {
        this.primaryOrganizationalUnitId = primaryOrganizationalUnitId;
        return this;
    }
    public String getPrimaryOrganizationalUnitId() {
        return this.primaryOrganizationalUnitId;
    }

    public CreateUserRequest setUserExternalId(String userExternalId) {
        this.userExternalId = userExternalId;
        return this;
    }
    public String getUserExternalId() {
        return this.userExternalId;
    }

    public CreateUserRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public static class CreateUserRequestCustomFields extends TeaModel {
        /**
         * <p>The name of the extended field. You must create the extended field in advance. To create an extended field, log on to the IDaaS console. In the left-side navigation pane, choose Accounts &gt; Extended Fields, and then click Create Field on the Extended Fields page.</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>The value of the extended field. The value follows the limits on the properties of the extended field.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FieldValue")
        public String fieldValue;

        public static CreateUserRequestCustomFields build(java.util.Map<String, ?> map) throws Exception {
            CreateUserRequestCustomFields self = new CreateUserRequestCustomFields();
            return TeaModel.build(map, self);
        }

        public CreateUserRequestCustomFields setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public CreateUserRequestCustomFields setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

    }

    public static class CreateUserRequestPasswordInitializationConfig extends TeaModel {
        /**
         * <p>Specifies whether to forcibly change the password status. Default value: disabled. Valid values:</p>
         * <ul>
         * <li>enabled:forcibly changes the password status.</li>
         * <li>disabled: does not forcibly change the password status.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("PasswordForcedUpdateStatus")
        public String passwordForcedUpdateStatus;

        /**
         * <p>The priority of the password initialization policy. By default, this parameter does not take effect. Valid values:</p>
         * <ul>
         * <li>global:The password initialization policy globally takes effect.</li>
         * <li>custom: The password initialization policy takes effect based on custom settings.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("PasswordInitializationPolicyPriority")
        public String passwordInitializationPolicyPriority;

        /**
         * <p>The password initialization method. Set the value to random,</p>
         * <ul>
         * <li>whichindicates that the password is randomly generated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>random</p>
         */
        @NameInMap("PasswordInitializationType")
        public String passwordInitializationType;

        /**
         * <p>The value of the extended field. The value follows the limits on the properties of the extended field.</p>
         * 
         * <strong>example:</strong>
         * <p>sms</p>
         */
        @NameInMap("UserNotificationChannels")
        public java.util.List<String> userNotificationChannels;

        public static CreateUserRequestPasswordInitializationConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateUserRequestPasswordInitializationConfig self = new CreateUserRequestPasswordInitializationConfig();
            return TeaModel.build(map, self);
        }

        public CreateUserRequestPasswordInitializationConfig setPasswordForcedUpdateStatus(String passwordForcedUpdateStatus) {
            this.passwordForcedUpdateStatus = passwordForcedUpdateStatus;
            return this;
        }
        public String getPasswordForcedUpdateStatus() {
            return this.passwordForcedUpdateStatus;
        }

        public CreateUserRequestPasswordInitializationConfig setPasswordInitializationPolicyPriority(String passwordInitializationPolicyPriority) {
            this.passwordInitializationPolicyPriority = passwordInitializationPolicyPriority;
            return this;
        }
        public String getPasswordInitializationPolicyPriority() {
            return this.passwordInitializationPolicyPriority;
        }

        public CreateUserRequestPasswordInitializationConfig setPasswordInitializationType(String passwordInitializationType) {
            this.passwordInitializationType = passwordInitializationType;
            return this;
        }
        public String getPasswordInitializationType() {
            return this.passwordInitializationType;
        }

        public CreateUserRequestPasswordInitializationConfig setUserNotificationChannels(java.util.List<String> userNotificationChannels) {
            this.userNotificationChannels = userNotificationChannels;
            return this;
        }
        public java.util.List<String> getUserNotificationChannels() {
            return this.userNotificationChannels;
        }

    }

}
