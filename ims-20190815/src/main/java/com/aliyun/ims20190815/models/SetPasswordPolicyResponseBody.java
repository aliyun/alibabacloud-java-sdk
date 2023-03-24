// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetPasswordPolicyResponseBody extends TeaModel {
    /**
     * <p>The details of the password policy.</p>
     */
    @NameInMap("PasswordPolicy")
    public SetPasswordPolicyResponseBodyPasswordPolicy passwordPolicy;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetPasswordPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordPolicyResponseBody self = new SetPasswordPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public SetPasswordPolicyResponseBody setPasswordPolicy(SetPasswordPolicyResponseBodyPasswordPolicy passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
        return this;
    }
    public SetPasswordPolicyResponseBodyPasswordPolicy getPasswordPolicy() {
        return this.passwordPolicy;
    }

    public SetPasswordPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SetPasswordPolicyResponseBodyPasswordPolicy extends TeaModel {
        /**
         * <p>Indicates whether to disable logon after the password expires.</p>
         */
        @NameInMap("HardExpire")
        public Boolean hardExpire;

        /**
         * <p>The maximum number of password retries.</p>
         */
        @NameInMap("MaxLoginAttemps")
        public Integer maxLoginAttemps;

        /**
         * <p>The validity period of the password.</p>
         */
        @NameInMap("MaxPasswordAge")
        public Integer maxPasswordAge;

        /**
         * <p>The minimum number of unique characters in the password.</p>
         */
        @NameInMap("MinimumPasswordDifferentCharacter")
        public Integer minimumPasswordDifferentCharacter;

        /**
         * <p>The minimum number of characters in the password.</p>
         */
        @NameInMap("MinimumPasswordLength")
        public Integer minimumPasswordLength;

        /**
         * <p>Indicates whether to exclude the username from the password.</p>
         */
        @NameInMap("PasswordNotContainUserName")
        public Boolean passwordNotContainUserName;

        /**
         * <p>The policy for password history check.</p>
         */
        @NameInMap("PasswordReusePrevention")
        public Integer passwordReusePrevention;

        /**
         * <p>Indicates whether the password must contain lowercase letters.</p>
         */
        @NameInMap("RequireLowercaseCharacters")
        public Boolean requireLowercaseCharacters;

        /**
         * <p>Indicates whether the password must contain digits.</p>
         */
        @NameInMap("RequireNumbers")
        public Boolean requireNumbers;

        /**
         * <p>Indicates whether the password must contain special characters.</p>
         */
        @NameInMap("RequireSymbols")
        public Boolean requireSymbols;

        /**
         * <p>Indicates whether the password must contain uppercase letters.</p>
         */
        @NameInMap("RequireUppercaseCharacters")
        public Boolean requireUppercaseCharacters;

        public static SetPasswordPolicyResponseBodyPasswordPolicy build(java.util.Map<String, ?> map) throws Exception {
            SetPasswordPolicyResponseBodyPasswordPolicy self = new SetPasswordPolicyResponseBodyPasswordPolicy();
            return TeaModel.build(map, self);
        }

        public SetPasswordPolicyResponseBodyPasswordPolicy setHardExpire(Boolean hardExpire) {
            this.hardExpire = hardExpire;
            return this;
        }
        public Boolean getHardExpire() {
            return this.hardExpire;
        }

        public SetPasswordPolicyResponseBodyPasswordPolicy setMaxLoginAttemps(Integer maxLoginAttemps) {
            this.maxLoginAttemps = maxLoginAttemps;
            return this;
        }
        public Integer getMaxLoginAttemps() {
            return this.maxLoginAttemps;
        }

        public SetPasswordPolicyResponseBodyPasswordPolicy setMaxPasswordAge(Integer maxPasswordAge) {
            this.maxPasswordAge = maxPasswordAge;
            return this;
        }
        public Integer getMaxPasswordAge() {
            return this.maxPasswordAge;
        }

        public SetPasswordPolicyResponseBodyPasswordPolicy setMinimumPasswordDifferentCharacter(Integer minimumPasswordDifferentCharacter) {
            this.minimumPasswordDifferentCharacter = minimumPasswordDifferentCharacter;
            return this;
        }
        public Integer getMinimumPasswordDifferentCharacter() {
            return this.minimumPasswordDifferentCharacter;
        }

        public SetPasswordPolicyResponseBodyPasswordPolicy setMinimumPasswordLength(Integer minimumPasswordLength) {
            this.minimumPasswordLength = minimumPasswordLength;
            return this;
        }
        public Integer getMinimumPasswordLength() {
            return this.minimumPasswordLength;
        }

        public SetPasswordPolicyResponseBodyPasswordPolicy setPasswordNotContainUserName(Boolean passwordNotContainUserName) {
            this.passwordNotContainUserName = passwordNotContainUserName;
            return this;
        }
        public Boolean getPasswordNotContainUserName() {
            return this.passwordNotContainUserName;
        }

        public SetPasswordPolicyResponseBodyPasswordPolicy setPasswordReusePrevention(Integer passwordReusePrevention) {
            this.passwordReusePrevention = passwordReusePrevention;
            return this;
        }
        public Integer getPasswordReusePrevention() {
            return this.passwordReusePrevention;
        }

        public SetPasswordPolicyResponseBodyPasswordPolicy setRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
            this.requireLowercaseCharacters = requireLowercaseCharacters;
            return this;
        }
        public Boolean getRequireLowercaseCharacters() {
            return this.requireLowercaseCharacters;
        }

        public SetPasswordPolicyResponseBodyPasswordPolicy setRequireNumbers(Boolean requireNumbers) {
            this.requireNumbers = requireNumbers;
            return this;
        }
        public Boolean getRequireNumbers() {
            return this.requireNumbers;
        }

        public SetPasswordPolicyResponseBodyPasswordPolicy setRequireSymbols(Boolean requireSymbols) {
            this.requireSymbols = requireSymbols;
            return this;
        }
        public Boolean getRequireSymbols() {
            return this.requireSymbols;
        }

        public SetPasswordPolicyResponseBodyPasswordPolicy setRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
            this.requireUppercaseCharacters = requireUppercaseCharacters;
            return this;
        }
        public Boolean getRequireUppercaseCharacters() {
            return this.requireUppercaseCharacters;
        }

    }

}
