// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetPasswordComplexityConfigurationRequest extends TeaModel {
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
     * <p>The password complexity rules.</p>
     */
    @NameInMap("PasswordComplexityRules")
    public java.util.List<SetPasswordComplexityConfigurationRequestPasswordComplexityRules> passwordComplexityRules;

    /**
     * <p>The minimum number of characters in a password.</p>
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
         * <ul>
         * <li>inclusion_upper_case: The password must contain uppercase letters.</li>
         * <li>inclusion_lower_case: The password must contain lowercase letters.</li>
         * <li>inclusion_special_case: The password must contain one or more of the following special characters: @ % + \ / \&quot; ! # $ ^ ? : , ( ) { } [ ] ~ - _ .</li>
         * <li>inclusion_number: The password must contain digits.</li>
         * <li>exclusion_username: The password cannot contain a username.</li>
         * <li>exclusion_email: The password cannot contain an email prefix.</li>
         * <li>exclusion_phone_number: The password cannot contain a mobile number.</li>
         * <li>exclusion_display_name: The password cannot contain a display name.</li>
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
