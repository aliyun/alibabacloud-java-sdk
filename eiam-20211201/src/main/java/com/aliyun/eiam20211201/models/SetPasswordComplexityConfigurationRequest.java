// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetPasswordComplexityConfigurationRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM实例的ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>密码复杂度规则</p>
     */
    @NameInMap("PasswordComplexityRules")
    public java.util.List<SetPasswordComplexityConfigurationRequestPasswordComplexityRules> passwordComplexityRules;

    /**
     * <p>密码最小长度</p>
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
         * <p>密码检查类型。枚举取值:inclusion\_upper\_case(包含大写字母)、inclusion\_lower\_case(包含小写字母)、inclusion\_special\_case(包含特殊字符)、inclusion\_number(包含数字)、exclusion\_username(不能包含用户名)、exclusion\_email(不能包含邮箱)、exclusion\_phone\_number(不能包含手机号)、exclusion\_display\_name(不能包含显示名)</p>
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
