// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetPasswordComplexityConfigurationRequest extends TeaModel {
    /**
     * <p>Specifies whether to disable logon with a weak password.</p>
     */
    @NameInMap("DisabledWeakPasswordLogin")
    public Boolean disabledWeakPasswordLogin;

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
     * <p>The list of password complexity rules.</p>
     */
    @NameInMap("PasswordComplexityRules")
    public java.util.List<SetPasswordComplexityConfigurationRequestPasswordComplexityRules> passwordComplexityRules;

    /**
     * <p>The minimum password length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PasswordMinLength")
    public Integer passwordMinLength;

    public static SetPasswordComplexityConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordComplexityConfigurationRequest self = new SetPasswordComplexityConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public SetPasswordComplexityConfigurationRequest setDisabledWeakPasswordLogin(Boolean disabledWeakPasswordLogin) {
        this.disabledWeakPasswordLogin = disabledWeakPasswordLogin;
        return this;
    }
    public Boolean getDisabledWeakPasswordLogin() {
        return this.disabledWeakPasswordLogin;
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
         * <p>The password check type. Valid values:</p>
         * <ul>
         * <li><p>inclusion_upper_case: The password must contain uppercase letters.</p>
         * </li>
         * <li><p>inclusion_lower_case: The password must contain lowercase letters.</p>
         * </li>
         * <li><p>inclusion_special_case: The password must contain special characters. The special characters are \<code>( @ % + \\ / \\&quot; ! # $ ^ ? : , ( ) { } [ ] \\~ - _ . )\\</code>.</p>
         * </li>
         * <li><p>inclusion_number: The password must contain digits.</p>
         * </li>
         * <li><p>exclusion_username: The password cannot contain the username.</p>
         * </li>
         * <li><p>exclusion_email: The password cannot contain the mailbox.</p>
         * </li>
         * <li><p>exclusion_phone_number: The password cannot contain the phone number.</p>
         * </li>
         * <li><p>exclusion_display_name: The password cannot contain the display name.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>inclusion_upper_case</p>
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
