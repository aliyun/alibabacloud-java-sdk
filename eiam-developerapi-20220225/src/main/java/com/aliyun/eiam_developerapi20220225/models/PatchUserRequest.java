// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class PatchUserRequest extends TeaModel {
    @NameInMap("customFields")
    public java.util.List<PatchUserRequestCustomFields> customFields;

    @NameInMap("displayName")
    public String displayName;

    @NameInMap("email")
    public String email;

    @NameInMap("emailVerified")
    public Boolean emailVerified;

    @NameInMap("phoneNumber")
    public String phoneNumber;

    @NameInMap("phoneNumberVerified")
    public Boolean phoneNumberVerified;

    @NameInMap("phoneRegion")
    public String phoneRegion;

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
        @NameInMap("fieldName")
        public String fieldName;

        @NameInMap("fieldValue")
        public String fieldValue;

        /**
         * <p>字段操作类型，取值可选范围：</p>
         * <p>- add：添加。</p>
         * <p>- replace：替换。若对应扩展字段无设置值，会转换为add操作。</p>
         * <p>- remove：移除。</p>
         */
        @NameInMap("operation")
        public String operation;

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

        public PatchUserRequestCustomFields setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

}
