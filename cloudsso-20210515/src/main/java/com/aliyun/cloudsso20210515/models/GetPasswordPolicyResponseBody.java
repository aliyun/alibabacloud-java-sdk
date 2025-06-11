// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetPasswordPolicyResponseBody extends TeaModel {
    /**
     * <p>The password policy.</p>
     */
    @NameInMap("PasswordPolicy")
    public GetPasswordPolicyResponseBodyPasswordPolicy passwordPolicy;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B7C6E839-FB65-59BE-B753-003AA8AF7DF7</p>
     */
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
        /**
         * <p>Indicates whether to disable logon after a password expires. Valid values:</p>
         * <ul>
         * <li>true: disables logon after a password expires.</li>
         * <li>false: does not disable logon after a password expires.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HardExpire")
        public Boolean hardExpire;

        /**
         * <p>The number of password retries.</p>
         * <p>If wrong passwords are entered for the specified consecutive times, the account is locked for 1 hour.</p>
         * <p>Valid values: 0 to 32. The value 0 indicates that the number of password retries is not limited.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxLoginAttempts")
        public Integer maxLoginAttempts;

        /**
         * <p>The validity period of a password.</p>
         * <p>Valid values: 1 to 120. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("MaxPasswordAge")
        public Integer maxPasswordAge;

        /**
         * <p>The maximum password length.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("MaxPasswordLength")
        public Integer maxPasswordLength;

        /**
         * <p>The minimum number of different characters in a password.</p>
         * <p>The minimum value is 0, which indicates that the minimum number of different characters in a password is not limited. The maximum value is the value of the <code>MinPasswordLength</code> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("MinPasswordDifferentChars")
        public Integer minPasswordDifferentChars;

        /**
         * <p>The minimum password length.</p>
         * <p>Valid values: 8 to 32 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("MinPasswordLength")
        public Integer minPasswordLength;

        /**
         * <p>Indicates whether to exclude the username from the password. Valid values:</p>
         * <ul>
         * <li>true: A password cannot contain the username.</li>
         * <li>false: A password can contain the username.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PasswordNotContainUsername")
        public Boolean passwordNotContainUsername;

        /**
         * <p>The policy for password history check.</p>
         * <p>The previous N passwords cannot be reused. Valid values of N: 0 to 24. The value 0 indicates that all historical passwords can be reused.</p>
         * <blockquote>
         * <p> Passwords that are generated before January 5, 2024 are not counted as historical passwords.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PasswordReusePrevention")
        public Integer passwordReusePrevention;

        /**
         * <p>Indicates whether lowercase letters are required in a password. Valid values:</p>
         * <ul>
         * <li>true: Lowercase letters are required in a password.</li>
         * <li>false: Lowercase letters are not required in a password.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RequireLowerCaseChars")
        public Boolean requireLowerCaseChars;

        /**
         * <p>Indicates whether digits are required in a password. Valid values:</p>
         * <ul>
         * <li>true: Digits are required in a password.</li>
         * <li>false: Digits are not required in a password.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RequireNumbers")
        public Boolean requireNumbers;

        /**
         * <p>Indicates whether special characters are required in a password. Valid values:</p>
         * <ul>
         * <li>true: Special characters are required in a password.</li>
         * <li>false: Special characters are not required in a password.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RequireSymbols")
        public Boolean requireSymbols;

        /**
         * <p>Indicates whether uppercase letters are required in a password. Valid values:</p>
         * <ul>
         * <li>true: Uppercase letters are required in a password.</li>
         * <li>false: Uppercase letters are not required in a password.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
