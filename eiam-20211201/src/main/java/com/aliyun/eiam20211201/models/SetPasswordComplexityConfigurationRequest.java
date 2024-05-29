// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetPasswordComplexityConfigurationRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The password complexity rules.</p>
     */
    @NameInMap("PasswordComplexityRules")
    public java.util.List<SetPasswordComplexityConfigurationRequestPasswordComplexityRules> passwordComplexityRules;

    /**
     * <p>The minimum number of characters in a password.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PasswordMinLength")
    public Integer passwordMinLength;

    public static SetPasswordComplexityConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordComplexityConfigurationRequest self = new SetPasswordComplexityConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public SetPasswordComplexityConfigurationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetPasswordComplexityConfigurationRequest setPasswordComplexityRules(java.util.List<SetPasswordComplexityConfigurationRequestPasswordComplexityRules> passwordComplexityRules) {
        this.passwordComplexityRules = passwordComplexityRules;
        return this;
    }
    public java.util.List<SetPasswordComplexityConfigurationRequestPasswordComplexityRules> getPasswordComplexityRules() {
        return this.passwordComplexityRules;
    }

    public SetPasswordComplexityConfigurationRequest setPasswordMinLength(Integer passwordMinLength) {
        this.passwordMinLength = passwordMinLength;
        return this;
    }
    public Integer getPasswordMinLength() {
        return this.passwordMinLength;
    }

    public static class SetPasswordComplexityConfigurationRequestPasswordComplexityRules extends TeaModel {
        /**
         * <p>The type of the password check. Valid values:</p>
         * <br>
         * <p>*   inclusion_upper_case: The password must contain uppercase letters.</p>
         * <p>*   inclusion_lower_case: The password must contain lowercase letters.</p>
         * <p>*   inclusion_special_case: The password must contain one or more of the following special characters: @ % + \\ / \\" ! # $ ^ ? : , ( ) { } [ ] ~ - _ .</p>
         * <p>*   inclusion_number: The password must contain digits.</p>
         * <p>*   exclusion_username: The password cannot contain a username.</p>
         * <p>*   exclusion_email: The password cannot contain an email prefix.</p>
         * <p>*   exclusion_phone_number: The password cannot contain a mobile number.</p>
         * <p>*   exclusion_display_name: The password cannot contain a display name.</p>
         */
        @NameInMap("PasswordCheckType")
        public String passwordCheckType;

        public static SetPasswordComplexityConfigurationRequestPasswordComplexityRules build(java.util.Map<String, ?> map) throws Exception {
            SetPasswordComplexityConfigurationRequestPasswordComplexityRules self = new SetPasswordComplexityConfigurationRequestPasswordComplexityRules();
            return TeaModel.build(map, self);
        }

        public SetPasswordComplexityConfigurationRequestPasswordComplexityRules setPasswordCheckType(String passwordCheckType) {
            this.passwordCheckType = passwordCheckType;
            return this;
        }
        public String getPasswordCheckType() {
            return this.passwordCheckType;
        }

    }

}
