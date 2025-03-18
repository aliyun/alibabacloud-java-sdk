// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    /**
     * <p>Custom fields</p>
     */
    @NameInMap("customFields")
    public java.util.List<CreateUserRequestCustomFields> customFields;

    /**
     * <p>The description of the account. The description can be up to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>test user</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the account. The display name can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>display_name001</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The email address of the user who owns the account.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:example@example.com">example@example.com</a></p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <p>Indicates whether the email address is verified. This field is required if an email address is specified. If you have no special requirement, set this parameter to true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("emailVerified")
    public Boolean emailVerified;

    /**
     * <p>The password of the account. For information about the password rules, go to the Create User panel in the Identity as a Service (IDaaS) console.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("password")
    public String password;

    /**
     * <p>Configure the initial password</p>
     */
    @NameInMap("passwordInitializationConfig")
    public CreateUserRequestPasswordInitializationConfig passwordInitializationConfig;

    /**
     * <p>The mobile number of the user who owns the account.</p>
     * 
     * <strong>example:</strong>
     * <p>156xxxxxxx</p>
     */
    @NameInMap("phoneNumber")
    public String phoneNumber;

    /**
     * <p>Indicates whether the mobile number is verified. This field is required if a mobile number is specified. If you have no special requirement, set this parameter to true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("phoneNumberVerified")
    public Boolean phoneNumberVerified;

    /**
     * <p>The country code of the mobile number. For example, the country code of China is 86 without 00 or +. This parameter is required if a mobile number is specified.</p>
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
     * <p>The external ID of the account. The external ID can be used to map external data to the data of the account in EIAM of Identity as a Service (IDaaS). By default, the external ID is the account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
     */
    @NameInMap("userExternalId")
    public String userExternalId;

    /**
     * <p>The username of the account.</p>
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
         * <p>Field name</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("fieldName")
        public String fieldName;

        /**
         * <p>Filed value</p>
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
         * <p>Password  forced update</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("passwordForcedUpdateStatus")
        public String passwordForcedUpdateStatus;

        /**
         * <p>Password policy</p>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("passwordInitializationPolicyPriority")
        public String passwordInitializationPolicyPriority;

        /**
         * <p>Password Initialization Type</p>
         * 
         * <strong>example:</strong>
         * <p>random</p>
         */
        @NameInMap("passwordInitializationType")
        public String passwordInitializationType;

        /**
         * <p>User Notification Channels</p>
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
