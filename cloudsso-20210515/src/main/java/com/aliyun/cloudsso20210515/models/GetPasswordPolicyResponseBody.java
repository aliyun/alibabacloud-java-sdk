// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetPasswordPolicyResponseBody extends TeaModel {
    @NameInMap("PasswordPolicy")
    public GetPasswordPolicyResponseBodyPasswordPolicy passwordPolicy;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPasswordPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPasswordPolicyResponseBody self = new GetPasswordPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPasswordPolicyResponseBody setPasswordPolicy(GetPasswordPolicyResponseBodyPasswordPolicy passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
        return this;
    }
    public GetPasswordPolicyResponseBodyPasswordPolicy getPasswordPolicy() {
        return this.passwordPolicy;
    }

    public GetPasswordPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPasswordPolicyResponseBodyPasswordPolicy extends TeaModel {
        @NameInMap("HardExpire")
        public Boolean hardExpire;

        @NameInMap("MaxLoginAttempts")
        public Integer maxLoginAttempts;

        @NameInMap("MaxPasswordAge")
        public Integer maxPasswordAge;

        @NameInMap("MaxPasswordLength")
        public Integer maxPasswordLength;

        @NameInMap("MinPasswordDifferentChars")
        public Integer minPasswordDifferentChars;

        @NameInMap("MinPasswordLength")
        public Integer minPasswordLength;

        @NameInMap("PasswordNotContainUsername")
        public Boolean passwordNotContainUsername;

        @NameInMap("PasswordReusePrevention")
        public Integer passwordReusePrevention;

        @NameInMap("RequireLowerCaseChars")
        public Boolean requireLowerCaseChars;

        @NameInMap("RequireNumbers")
        public Boolean requireNumbers;

        @NameInMap("RequireSymbols")
        public Boolean requireSymbols;

        @NameInMap("RequireUpperCaseChars")
        public Boolean requireUpperCaseChars;

        public static GetPasswordPolicyResponseBodyPasswordPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetPasswordPolicyResponseBodyPasswordPolicy self = new GetPasswordPolicyResponseBodyPasswordPolicy();
            return TeaModel.build(map, self);
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setHardExpire(Boolean hardExpire) {
            this.hardExpire = hardExpire;
            return this;
        }
        public Boolean getHardExpire() {
            return this.hardExpire;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setMaxLoginAttempts(Integer maxLoginAttempts) {
            this.maxLoginAttempts = maxLoginAttempts;
            return this;
        }
        public Integer getMaxLoginAttempts() {
            return this.maxLoginAttempts;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setMaxPasswordAge(Integer maxPasswordAge) {
            this.maxPasswordAge = maxPasswordAge;
            return this;
        }
        public Integer getMaxPasswordAge() {
            return this.maxPasswordAge;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setMaxPasswordLength(Integer maxPasswordLength) {
            this.maxPasswordLength = maxPasswordLength;
            return this;
        }
        public Integer getMaxPasswordLength() {
            return this.maxPasswordLength;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setMinPasswordDifferentChars(Integer minPasswordDifferentChars) {
            this.minPasswordDifferentChars = minPasswordDifferentChars;
            return this;
        }
        public Integer getMinPasswordDifferentChars() {
            return this.minPasswordDifferentChars;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setMinPasswordLength(Integer minPasswordLength) {
            this.minPasswordLength = minPasswordLength;
            return this;
        }
        public Integer getMinPasswordLength() {
            return this.minPasswordLength;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setPasswordNotContainUsername(Boolean passwordNotContainUsername) {
            this.passwordNotContainUsername = passwordNotContainUsername;
            return this;
        }
        public Boolean getPasswordNotContainUsername() {
            return this.passwordNotContainUsername;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setPasswordReusePrevention(Integer passwordReusePrevention) {
            this.passwordReusePrevention = passwordReusePrevention;
            return this;
        }
        public Integer getPasswordReusePrevention() {
            return this.passwordReusePrevention;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setRequireLowerCaseChars(Boolean requireLowerCaseChars) {
            this.requireLowerCaseChars = requireLowerCaseChars;
            return this;
        }
        public Boolean getRequireLowerCaseChars() {
            return this.requireLowerCaseChars;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setRequireNumbers(Boolean requireNumbers) {
            this.requireNumbers = requireNumbers;
            return this;
        }
        public Boolean getRequireNumbers() {
            return this.requireNumbers;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setRequireSymbols(Boolean requireSymbols) {
            this.requireSymbols = requireSymbols;
            return this;
        }
        public Boolean getRequireSymbols() {
            return this.requireSymbols;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setRequireUpperCaseChars(Boolean requireUpperCaseChars) {
            this.requireUpperCaseChars = requireUpperCaseChars;
            return this;
        }
        public Boolean getRequireUpperCaseChars() {
            return this.requireUpperCaseChars;
        }

    }

}
