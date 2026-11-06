// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate a parameter value, but you must ensure that the parameter value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see the References: How to ensure idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of extended fields.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("CustomFields")
    public java.util.List<CreateUserRequestCustomFields> customFields;

    /**
     * <p>The description. The maximum length is 256 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>description text</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The display name of the account. The maximum length is 128 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>name_001</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The email address. The email prefix can contain uppercase letters, lowercase letters, digits, periods (.), underscores (_), and hyphens (-). The maximum length is 128 characters.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:example@example.com">example@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>Specifies whether the email address is verified and trusted. If the email address is specified, this parameter is required. If no special business requirements exist, set this parameter to true.</p>
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
     * <p>The IDs of the organizational units to which the account belongs. An account can belong to multiple organizational units.</p>
     */
    @NameInMap("OrganizationalUnitIds")
    public java.util.List<String> organizationalUnitIds;

    /**
     * <p>The password. For specific format requirements, refer to the password policy.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The password initialization configuration.</p>
     */
    @NameInMap("PasswordInitializationConfig")
    public CreateUserRequestPasswordInitializationConfig passwordInitializationConfig;

    /**
     * <p>The mobile phone number. It must be 6 to 15 digits in length.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678901</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>Specifies whether the mobile phone number is verified and trusted. If the mobile phone number is specified, this parameter is required. If no special business requirements exist, set this parameter to true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PhoneNumberVerified")
    public Boolean phoneNumberVerified;

    /**
     * <p>The country code for the mobile phone number. It must be 1 to 6 digits in length and cannot contain a plus sign (+).</p>
     * 
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("PhoneRegion")
    public String phoneRegion;

    /**
     * <p>The ID of the primary organizational unit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
     */
    @NameInMap("PrimaryOrganizationalUnitId")
    public String primaryOrganizationalUnitId;

    /**
     * <p>The external ID of the account, which is used to associate the account with an external system. The maximum length is 128 characters. If this parameter is not specified, the account ID is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
     */
    @NameInMap("UserExternalId")
    public String userExternalId;

    /**
     * <p>The username. It can contain letters, digits, and the following special characters: underscores (_), periods (.), at signs (@), and hyphens (-). The maximum length is 256 characters.</p>
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
         * <p>The identifier of the extended field. You must create the extended field in advance. For more information, refer to the Extended Fields module in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>The value of the extended field. The value must comply with the attribute limits of the corresponding extended field.</p>
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
         * <p>Specifies whether to force the user to change the password. By default, this feature is disabled. Valid values:</p>
         * <ul>
         * <li>enabled: Enables the feature.</li>
         * <li>disabled: Disables the feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("PasswordForcedUpdateStatus")
        public String passwordForcedUpdateStatus;

        /**
         * <p>The password initialization policy priority. By default, this parameter does not take effect. Valid values:</p>
         * <ul>
         * <li>global: Global priority. The instance-level password initialization policy is used. The password initialization policy specified in the Settings is invalid. For more information, refer to the password initialization policy in the password-related policies.</li>
         * <li>custom: Custom priority. The password initialization policy defined in the Settings is used, including whether to force password changes, the password initialization method, and the notification channels.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("PasswordInitializationPolicyPriority")
        public String passwordInitializationPolicyPriority;

        /**
         * <p>The password initialization method. Valid values:</p>
         * <ul>
         * <li>random: Generates a random password.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>random</p>
         */
        @NameInMap("PasswordInitializationType")
        public String passwordInitializationType;

        /**
         * <p>The list of password notification channels.</p>
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
