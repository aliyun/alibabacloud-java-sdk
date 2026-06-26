// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetLoginPreferenceResponseBody extends TeaModel {
    @NameInMap("LoginPreference")
    public GetLoginPreferenceResponseBodyLoginPreference loginPreference;

    @NameInMap("PasswordPolicy")
    public GetLoginPreferenceResponseBodyPasswordPolicy passwordPolicy;

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
        @NameInMap("HardExpire")
        public Boolean hardExpire;

        @NameInMap("MaxLoginAttempts")
        public Long maxLoginAttempts;

        @NameInMap("MaxPasswordAge")
        public Long maxPasswordAge;

        @NameInMap("MaxPasswordLength")
        public Integer maxPasswordLength;

        @NameInMap("MinPasswordLength")
        public Integer minPasswordLength;

        @NameInMap("PasswordNotContainUserName")
        public Boolean passwordNotContainUserName;

        @NameInMap("RequireLowerCaseChars")
        public Boolean requireLowerCaseChars;

        @NameInMap("RequireNumbers")
        public Boolean requireNumbers;

        @NameInMap("RequireSymbols")
        public Boolean requireSymbols;

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
