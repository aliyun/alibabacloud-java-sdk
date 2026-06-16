// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    /**
     * <p>A list of custom field objects.</p>
     */
    @NameInMap("CustomFields")
    public java.util.List<UpdateUserRequestCustomFields> customFields;

    /**
     * <p>The display name. It can be a maximum of 256 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The email address. The local-part can contain uppercase letters, lowercase letters, digits, dots (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:example@example.com">example@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>Indicates whether the email address is verified. This parameter is required when specifying an email address. In most cases, set this to <code>true</code>.</p>
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
     * <p>The mobile phone number. It must be between 6 and 15 digits long.</p>
     * 
     * <strong>example:</strong>
     * <p>156xxxxxxxxx</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>Indicates whether the mobile phone number is verified. This parameter is required when specifying a mobile phone number. In most cases, set this to <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PhoneNumberVerified")
    public Boolean phoneNumberVerified;

    /**
     * <p>The country code for the mobile phone number. Example: 86 for Chinese mainland. Do not include <code>00</code> or <code>+</code>. This parameter is required if you specify a mobile phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("PhoneRegion")
    public String phoneRegion;

    /**
     * <p>The account ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The username. It must be no more than 256 characters and can contain letters, digits, and the special characters: _, ., @, and -.</p>
     * 
     * <strong>example:</strong>
     * <p>username_test</p>
     */
    @NameInMap("Username")
    public String username;

    public static UpdateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserRequest self = new UpdateUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserRequest setCustomFields(java.util.List<UpdateUserRequestCustomFields> customFields) {
        this.customFields = customFields;
        return this;
    }
    public java.util.List<UpdateUserRequestCustomFields> getCustomFields() {
        return this.customFields;
    }

    public UpdateUserRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateUserRequest setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
        return this;
    }
    public Boolean getEmailVerified() {
        return this.emailVerified;
    }

    public UpdateUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateUserRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public UpdateUserRequest setPhoneNumberVerified(Boolean phoneNumberVerified) {
        this.phoneNumberVerified = phoneNumberVerified;
        return this;
    }
    public Boolean getPhoneNumberVerified() {
        return this.phoneNumberVerified;
    }

    public UpdateUserRequest setPhoneRegion(String phoneRegion) {
        this.phoneRegion = phoneRegion;
        return this;
    }
    public String getPhoneRegion() {
        return this.phoneRegion;
    }

    public UpdateUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateUserRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public static class UpdateUserRequestCustomFields extends TeaModel {
        /**
         * <p>The custom field name. You must create the custom field in the console before using it. For more information, see the custom fields module in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>nick_name</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>The custom field value. The value must comply with the constraints of the custom field.</p>
         * 
         * <strong>example:</strong>
         * <p>test_value</p>
         */
        @NameInMap("FieldValue")
        public String fieldValue;

        /**
         * <p>The operation type for the custom field. Valid values:</p>
         * <ul>
         * <li><p><code>add</code>: Adds a value to the custom field.</p>
         * </li>
         * <li><p><code>replace</code>: Replaces the existing value of the custom field. If the field has no existing value, this operation adds the value instead.</p>
         * </li>
         * <li><p><code>remove</code>: Removes a value from the custom field.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Operation")
        public String operation;

        public static UpdateUserRequestCustomFields build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserRequestCustomFields self = new UpdateUserRequestCustomFields();
            return TeaModel.build(map, self);
        }

        public UpdateUserRequestCustomFields setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public UpdateUserRequestCustomFields setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

        public UpdateUserRequestCustomFields setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

    }

}
