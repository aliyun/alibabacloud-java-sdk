// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    /**
     * <p>The custom extended fields.</p>
     */
    @NameInMap("CustomFields")
    public java.util.List<UpdateUserRequestCustomFields> customFields;

    /**
     * <p>The display name of the account. The display name can be up to 64 characters in length.</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The email address. The prefix of the email address can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>Specifies whether the email address is verified. This parameter must be specified if you specify Email. You can set this parameter to true if you have no special business requirements.</p>
     */
    @NameInMap("EmailVerified")
    public Boolean emailVerified;

    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The mobile number. The mobile number must be 6 to 15 digits in length.</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>Specifies whether the mobile number is verified. This parameter must be specified if you specify PhoneNumber. You can set this parameter to true if you have no special business requirements.</p>
     */
    @NameInMap("PhoneNumberVerified")
    public Boolean phoneNumberVerified;

    /**
     * <p>The area code of the mobile number. For example, the area code of a mobile number in the Chinese mainland is 86 without 00 or the plus sign (+). This parameter must be specified if you specify PhoneNumber.</p>
     */
    @NameInMap("PhoneRegion")
    public String phoneRegion;

    /**
     * <p>The account ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The name of the account. The name can be up to 64 characters in length. It can contain letters, digits, and the following special characters: _ . @ -</p>
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
         * <p>The name of the extended field. You must create an extended field before you specify this parameter. To create an extended field, go to the Extended Fields page of the specified EIAM instance in the IDaaS console.</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>The value of the extended field. The value follows the limits on the properties of the extended field.</p>
         */
        @NameInMap("FieldValue")
        public String fieldValue;

        /**
         * <p>The operation type of the extended field. Valid values:</p>
         * <br>
         * <p>*   add: adds a value to the extended field of the account.</p>
         * <p>*   replace: replaces the existing value of the extended field of the account. If the existing value to be replaced does not exist, this operation changes to the add operation.</p>
         * <p>*   remove: removes a value from the extended field of the account.</p>
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
