// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    /**
     * <p>A list of custom fields for the account.</p>
     */
    @NameInMap("customFields")
    public java.util.List<CreateUserRequestCustomFields> customFields;

    /**
     * <p>The account description. The maximum length is 256 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>测试账户</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name. The maximum length is 128 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>display_name001</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The email address. The local-part of the address can contain uppercase and lowercase letters, digits, periods (<code>.</code>), underscores (<code>_</code>), and hyphens (<code>-</code>). The maximum length is 128 characters.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:example@example.com">example@example.com</a></p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <p>Specifies whether the email is verified. This parameter is required if <code>email</code> is set. Typically, set this to <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("emailVerified")
    public Boolean emailVerified;

    /**
     * <p>The account password. For password complexity rules, see the password policy in the IDaaS console.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("password")
    public String password;

    /**
     * <p>The password initialization configuration.</p>
     */
    @NameInMap("passwordInitializationConfig")
    public CreateUserRequestPasswordInitializationConfig passwordInitializationConfig;

    /**
     * <p>The account phone number. It must be 6 to 15 digits long.</p>
     * 
     * <strong>example:</strong>
     * <p>156xxxxxxx</p>
     */
    @NameInMap("phoneNumber")
    public String phoneNumber;

    /**
     * <p>Specifies whether the phone number is verified. This parameter is required if <code>phoneNumber</code> is set. Typically, set this to <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("phoneNumberVerified")
    public Boolean phoneNumberVerified;

    /**
     * <p>The phone region code. For example, the code for the Chinese mainland is <code>86</code>. Do not include a <code>00</code> prefix or a plus sign (<code>+</code>). This parameter is required if <code>phoneNumber</code> is set.</p>
     * 
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("phoneRegion")
    public String phoneRegion;

    /**
     * <p>The ID of the primary organizational unit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
     */
    @NameInMap("primaryOrganizationalUnitId")
    public String primaryOrganizationalUnitId;

    /**
     * <p>The external user ID, used to associate the account with an external system. The maximum length is 128 characters. If unspecified, it defaults to the account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
     */
    @NameInMap("userExternalId")
    public String userExternalId;

    /**
     * <p>The username. It can contain letters, digits, and the following special characters: underscore (<code>_</code>), period (<code>.</code>), at sign (<code>@</code>), and hyphen (<code>-</code>). The maximum length is 256 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name001</p>
     */
    @NameInMap("username")
    public String username;

    public static CreateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserRequest self = new CreateUserRequest();
        return TeaModel.build(map, self);
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
         * <p>The name of the custom field. You can view the field\&quot;s data type and value range in the IDaaS console.</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("fieldName")
        public String fieldName;

        /**
         * <p>The value of the custom field.</p>
         * 
         * <strong>example:</strong>
         * <p>fieldValue_001</p>
         */
        @NameInMap("fieldValue")
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
         * <p>The password forced update status. By default, this feature is disabled. Valid values:</p>
         * <ul>
         * <li><p><code>enabled</code>: Enables the feature.</p>
         * </li>
         * <li><p><code>disabled</code>: Disables the feature.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("passwordForcedUpdateStatus")
        public String passwordForcedUpdateStatus;

        /**
         * <p>The priority of the password initialization policy. Valid values:</p>
         * <ul>
         * <li><p><code>global</code>: Uses the instance-level password initialization policy and ignores the custom settings in this request. For more information, see the password initialization policy configuration in the IDaaS console.</p>
         * </li>
         * <li><p><code>custom</code>: Uses the custom password initialization policy defined in this request. This includes settings for forced password updates, the initialization type, and notification channels.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("passwordInitializationPolicyPriority")
        public String passwordInitializationPolicyPriority;

        /**
         * <p>The password initialization type. Valid values:</p>
         * <ul>
         * <li><code>random</code>: A randomly generated password.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>random</p>
         */
        @NameInMap("passwordInitializationType")
        public String passwordInitializationType;

        /**
         * <p>The user notification channels. Valid values:</p>
         * <ul>
         * <li><p><code>email</code>: Email</p>
         * </li>
         * <li><p><code>sms</code>: SMS</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sms</p>
         */
        @NameInMap("userNotificationChannels")
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
