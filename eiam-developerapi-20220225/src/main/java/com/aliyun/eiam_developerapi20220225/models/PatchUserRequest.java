// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class PatchUserRequest extends TeaModel {
    @NameInMap("customFields")
    public java.util.List<PatchUserRequestCustomFields> customFields;

    /**
     * <p>The display name of the account.</p>
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
     * <p>The username of the account.</p>
     * 
     * <strong>example:</strong>
     * <p>name001</p>
     */
    @NameInMap("username")
    public String username;

    public static PatchUserRequest build(java.util.Map<String, ?> map) throws Exception {
        PatchUserRequest self = new PatchUserRequest();
        return TeaModel.build(map, self);
    }

    public PatchUserRequest setCustomFields(java.util.List<PatchUserRequestCustomFields> customFields) {
        this.customFields = customFields;
        return this;
    }
    public java.util.List<PatchUserRequestCustomFields> getCustomFields() {
        return this.customFields;
    }

    public PatchUserRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public PatchUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public PatchUserRequest setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
        return this;
    }
    public Boolean getEmailVerified() {
        return this.emailVerified;
    }

    public PatchUserRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public PatchUserRequest setPhoneNumberVerified(Boolean phoneNumberVerified) {
        this.phoneNumberVerified = phoneNumberVerified;
        return this;
    }
    public Boolean getPhoneNumberVerified() {
        return this.phoneNumberVerified;
    }

    public PatchUserRequest setPhoneRegion(String phoneRegion) {
        this.phoneRegion = phoneRegion;
        return this;
    }
    public String getPhoneRegion() {
        return this.phoneRegion;
    }

    public PatchUserRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public static class PatchUserRequestCustomFields extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("fieldName")
        public String fieldName;

        /**
         * <strong>example:</strong>
         * <p>test_value</p>
         */
        @NameInMap("fieldValue")
        public String fieldValue;

        /**
         * <p>字段操作类型，取值可选范围：</p>
         * <ul>
         * <li>add：添加。</li>
         * <li>replace：替换。若对应扩展字段无设置值，会转换为add操作。</li>
         * <li>remove：移除。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>replace</p>
         */
        @NameInMap("operation")
        public String operation;

        /**
         * <strong>example:</strong>
         * <p>replace</p>
         */
        @NameInMap("operator")
        @Deprecated
        public String operator;

        public static PatchUserRequestCustomFields build(java.util.Map<String, ?> map) throws Exception {
            PatchUserRequestCustomFields self = new PatchUserRequestCustomFields();
            return TeaModel.build(map, self);
        }

        public PatchUserRequestCustomFields setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public PatchUserRequestCustomFields setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

        public PatchUserRequestCustomFields setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        @Deprecated
        public PatchUserRequestCustomFields setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

}
