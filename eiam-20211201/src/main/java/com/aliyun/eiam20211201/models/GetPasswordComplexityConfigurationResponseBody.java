// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetPasswordComplexityConfigurationResponseBody extends TeaModel {
    /**
     * <p>The password complexity policy configuration.</p>
     */
    @NameInMap("PasswordComplexityConfiguration")
    public GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfiguration passwordComplexityConfiguration;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPasswordComplexityConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPasswordComplexityConfigurationResponseBody self = new GetPasswordComplexityConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPasswordComplexityConfigurationResponseBody setPasswordComplexityConfiguration(GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfiguration passwordComplexityConfiguration) {
        this.passwordComplexityConfiguration = passwordComplexityConfiguration;
        return this;
    }
    public GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfiguration getPasswordComplexityConfiguration() {
        return this.passwordComplexityConfiguration;
    }

    public GetPasswordComplexityConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfigurationPasswordComplexityRules extends TeaModel {
        /**
         * <p>The password check type. Valid values:</p>
         * <ul>
         * <li><p>inclusion_upper_case: The password must contain uppercase letters.</p>
         * </li>
         * <li><p>inclusion_lower_case: The password must contain lowercase letters.</p>
         * </li>
         * <li><p>inclusion_special_case: The password must contain at least one of the following special characters: \<code> @ % + \\ / \\&quot; ! # $ ^ ? : , ( ) { } [ ] \\~ - _ . \\</code>.</p>
         * </li>
         * <li><p>inclusion_number: The password must contain digits.</p>
         * </li>
         * <li><p>exclusion_username: The password cannot contain the username.</p>
         * </li>
         * <li><p>exclusion_email: The password cannot contain the email address.</p>
         * </li>
         * <li><p>exclusion_phone_number: The password cannot contain the mobile number.</p>
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

        public static GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfigurationPasswordComplexityRules build(java.util.Map<String, ?> map) throws Exception {
            GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfigurationPasswordComplexityRules self = new GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfigurationPasswordComplexityRules();
            return TeaModel.build(map, self);
        }

        public GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfigurationPasswordComplexityRules setPasswordCheckType(String passwordCheckType) {
            this.passwordCheckType = passwordCheckType;
            return this;
        }
        public String getPasswordCheckType() {
            return this.passwordCheckType;
        }

    }

    public static class GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfiguration extends TeaModel {
        /**
         * <p>Indicates whether logon with a weak password is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DisabledWeakPasswordLogin")
        public Boolean disabledWeakPasswordLogin;

        /**
         * <p>The time when the weak password logon restriction takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>1773383634936</p>
         */
        @NameInMap("DisabledWeakPasswordLoginStartedAt")
        public Long disabledWeakPasswordLoginStartedAt;

        /**
         * <p>The list of password complexity rules.</p>
         */
        @NameInMap("PasswordComplexityRules")
        public java.util.List<GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfigurationPasswordComplexityRules> passwordComplexityRules;

        /**
         * <p>The minimum password length.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("PasswordMinLength")
        public Integer passwordMinLength;

        public static GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfiguration self = new GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfiguration();
            return TeaModel.build(map, self);
        }

        public GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfiguration setDisabledWeakPasswordLogin(Boolean disabledWeakPasswordLogin) {
            this.disabledWeakPasswordLogin = disabledWeakPasswordLogin;
            return this;
        }
        public Boolean getDisabledWeakPasswordLogin() {
            return this.disabledWeakPasswordLogin;
        }

        public GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfiguration setDisabledWeakPasswordLoginStartedAt(Long disabledWeakPasswordLoginStartedAt) {
            this.disabledWeakPasswordLoginStartedAt = disabledWeakPasswordLoginStartedAt;
            return this;
        }
        public Long getDisabledWeakPasswordLoginStartedAt() {
            return this.disabledWeakPasswordLoginStartedAt;
        }

        public GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfiguration setPasswordComplexityRules(java.util.List<GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfigurationPasswordComplexityRules> passwordComplexityRules) {
            this.passwordComplexityRules = passwordComplexityRules;
            return this;
        }
        public java.util.List<GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfigurationPasswordComplexityRules> getPasswordComplexityRules() {
            return this.passwordComplexityRules;
        }

        public GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfiguration setPasswordMinLength(Integer passwordMinLength) {
            this.passwordMinLength = passwordMinLength;
            return this;
        }
        public Integer getPasswordMinLength() {
            return this.passwordMinLength;
        }

    }

}
