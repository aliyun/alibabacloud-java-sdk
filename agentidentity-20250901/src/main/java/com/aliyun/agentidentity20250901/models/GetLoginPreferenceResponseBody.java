// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetLoginPreferenceResponseBody extends TeaModel {
    /**
     * <p>The logon preference configuration.</p>
     */
    @NameInMap("LoginPreference")
    public GetLoginPreferenceResponseBodyLoginPreference loginPreference;

    /**
     * <p>The password policy configuration.</p>
     */
    @NameInMap("PasswordPolicy")
    public GetLoginPreferenceResponseBodyPasswordPolicy passwordPolicy;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetLoginPreferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLoginPreferenceResponseBody self = new GetLoginPreferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLoginPreferenceResponseBody setLoginPreference(GetLoginPreferenceResponseBodyLoginPreference loginPreference) {
        this.loginPreference = loginPreference;
        return this;
    }
    public GetLoginPreferenceResponseBodyLoginPreference getLoginPreference() {
        return this.loginPreference;
    }

    public GetLoginPreferenceResponseBody setPasswordPolicy(GetLoginPreferenceResponseBodyPasswordPolicy passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
        return this;
    }
    public GetLoginPreferenceResponseBodyPasswordPolicy getPasswordPolicy() {
        return this.passwordPolicy;
    }

    public GetLoginPreferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLoginPreferenceResponseBodyLoginPreference extends TeaModel {
        /**
         * <p>Indicates whether password logon is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnablePasswordLogin")
        public Boolean enablePasswordLogin;

        public static GetLoginPreferenceResponseBodyLoginPreference build(java.util.Map<String, ?> map) throws Exception {
            GetLoginPreferenceResponseBodyLoginPreference self = new GetLoginPreferenceResponseBodyLoginPreference();
            return TeaModel.build(map, self);
        }

        public GetLoginPreferenceResponseBodyLoginPreference setEnablePasswordLogin(Boolean enablePasswordLogin) {
            this.enablePasswordLogin = enablePasswordLogin;
            return this;
        }
        public Boolean getEnablePasswordLogin() {
            return this.enablePasswordLogin;
        }

    }

    public static class GetLoginPreferenceResponseBodyPasswordPolicy extends TeaModel {
        /**
         * <p>Indicates whether logon is prohibited after a password expires. A value of true indicates that the password must be reset by an administrator before the user can log on.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HardExpire")
        public Boolean hardExpire;

        /**
         * <p>The maximum number of consecutive logon failures. Default value: 5. This value cannot be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxLoginAttempts")
        public Long maxLoginAttempts;

        /**
         * <p>The maximum validity period of a password in days. Default value: 7. This value cannot be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("MaxPasswordAge")
        public Long maxPasswordAge;

        /**
         * <p>The maximum length of the password. Fixed value: 32.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("MaxPasswordLength")
        public Integer maxPasswordLength;

        /**
         * <p>The minimum length of the password. Fixed value: 8.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("MinPasswordLength")
        public Integer minPasswordLength;

        /**
         * <p>Indicates whether the password must not contain the username.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PasswordNotContainUserName")
        public Boolean passwordNotContainUserName;

        /**
         * <p>Indicates whether lowercase letters are required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RequireLowerCaseChars")
        public Boolean requireLowerCaseChars;

        /**
         * <p>Indicates whether numbers are required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RequireNumbers")
        public Boolean requireNumbers;

        /**
         * <p>Indicates whether special characters are required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RequireSymbols")
        public Boolean requireSymbols;

        /**
         * <p>Indicates whether uppercase letters are required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RequireUpperCaseChars")
        public Boolean requireUpperCaseChars;

        public static GetLoginPreferenceResponseBodyPasswordPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetLoginPreferenceResponseBodyPasswordPolicy self = new GetLoginPreferenceResponseBodyPasswordPolicy();
            return TeaModel.build(map, self);
        }

        public GetLoginPreferenceResponseBodyPasswordPolicy setHardExpire(Boolean hardExpire) {
            this.hardExpire = hardExpire;
            return this;
        }
        public Boolean getHardExpire() {
            return this.hardExpire;
        }

        public GetLoginPreferenceResponseBodyPasswordPolicy setMaxLoginAttempts(Long maxLoginAttempts) {
            this.maxLoginAttempts = maxLoginAttempts;
            return this;
        }
        public Long getMaxLoginAttempts() {
            return this.maxLoginAttempts;
        }

        public GetLoginPreferenceResponseBodyPasswordPolicy setMaxPasswordAge(Long maxPasswordAge) {
            this.maxPasswordAge = maxPasswordAge;
            return this;
        }
        public Long getMaxPasswordAge() {
            return this.maxPasswordAge;
        }

        public GetLoginPreferenceResponseBodyPasswordPolicy setMaxPasswordLength(Integer maxPasswordLength) {
            this.maxPasswordLength = maxPasswordLength;
            return this;
        }
        public Integer getMaxPasswordLength() {
            return this.maxPasswordLength;
        }

        public GetLoginPreferenceResponseBodyPasswordPolicy setMinPasswordLength(Integer minPasswordLength) {
            this.minPasswordLength = minPasswordLength;
            return this;
        }
        public Integer getMinPasswordLength() {
            return this.minPasswordLength;
        }

        public GetLoginPreferenceResponseBodyPasswordPolicy setPasswordNotContainUserName(Boolean passwordNotContainUserName) {
            this.passwordNotContainUserName = passwordNotContainUserName;
            return this;
        }
        public Boolean getPasswordNotContainUserName() {
            return this.passwordNotContainUserName;
        }

        public GetLoginPreferenceResponseBodyPasswordPolicy setRequireLowerCaseChars(Boolean requireLowerCaseChars) {
            this.requireLowerCaseChars = requireLowerCaseChars;
            return this;
        }
        public Boolean getRequireLowerCaseChars() {
            return this.requireLowerCaseChars;
        }

        public GetLoginPreferenceResponseBodyPasswordPolicy setRequireNumbers(Boolean requireNumbers) {
            this.requireNumbers = requireNumbers;
            return this;
        }
        public Boolean getRequireNumbers() {
            return this.requireNumbers;
        }

        public GetLoginPreferenceResponseBodyPasswordPolicy setRequireSymbols(Boolean requireSymbols) {
            this.requireSymbols = requireSymbols;
            return this;
        }
        public Boolean getRequireSymbols() {
            return this.requireSymbols;
        }

        public GetLoginPreferenceResponseBodyPasswordPolicy setRequireUpperCaseChars(Boolean requireUpperCaseChars) {
            this.requireUpperCaseChars = requireUpperCaseChars;
            return this;
        }
        public Boolean getRequireUpperCaseChars() {
            return this.requireUpperCaseChars;
        }

    }

}
