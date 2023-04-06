// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    /**
     * <p>扩展字段列表</p>
     */
    @NameInMap("CustomFields")
    public java.util.List<UpdateUserRequestCustomFields> customFields;

    /**
     * <p>账户展示名</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>邮箱</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>邮箱是否验证，邮箱若设置此字段必须设置，无特殊业务可直接设置为true</p>
     */
    @NameInMap("EmailVerified")
    public Boolean emailVerified;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>手机号</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>手机号是否验证，手机号若设置此字段必须设置，无特殊业务可直接设置为true</p>
     */
    @NameInMap("PhoneNumberVerified")
    public Boolean phoneNumberVerified;

    /**
     * <p>手机地区编号,示例：中国大陆手区号为86，不带 00 或 +, 手机号若设置，此参数必填</p>
     */
    @NameInMap("PhoneRegion")
    public String phoneRegion;

    /**
     * <p>账户ID</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>账户名。</p>
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
         * <p>扩展字段标识</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>扩展字段值</p>
         */
        @NameInMap("FieldValue")
        public String fieldValue;

        /**
         * <p>扩展字段操作类型，枚举值，add（新增),replace（更新),remove(移除)</p>
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
