// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetPasswordPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PasswordPolicy")
    @Validation(required = true)
    public SetPasswordPolicyResponsePasswordPolicy passwordPolicy;

    public static SetPasswordPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordPolicyResponse self = new SetPasswordPolicyResponse();
        return TeaModel.build(map, self);
    }

    public SetPasswordPolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetPasswordPolicyResponse setPasswordPolicy(SetPasswordPolicyResponsePasswordPolicy passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
        return this;
    }
    public SetPasswordPolicyResponsePasswordPolicy getPasswordPolicy() {
        return this.passwordPolicy;
    }

    public static class SetPasswordPolicyResponsePasswordPolicy extends TeaModel {
        @NameInMap("MinimumPasswordLength")
        @Validation(required = true)
        public Integer minimumPasswordLength;

        @NameInMap("HardExpire")
        @Validation(required = true)
        public Boolean hardExpire;

        @NameInMap("RequireLowercaseCharacters")
        @Validation(required = true)
        public Boolean requireLowercaseCharacters;

        @NameInMap("RequireNumbers")
        @Validation(required = true)
        public Boolean requireNumbers;

        @NameInMap("MaxLoginAttemps")
        @Validation(required = true)
        public Integer maxLoginAttemps;

        @NameInMap("MaxPasswordAge")
        @Validation(required = true)
        public Integer maxPasswordAge;

        @NameInMap("PasswordNotContainUserName")
        @Validation(required = true)
        public Boolean passwordNotContainUserName;

        @NameInMap("PasswordReusePrevention")
        @Validation(required = true)
        public Integer passwordReusePrevention;

        @NameInMap("RequireUppercaseCharacters")
        @Validation(required = true)
        public Boolean requireUppercaseCharacters;

        @NameInMap("MinimumPasswordDifferentCharacter")
        @Validation(required = true)
        public Integer minimumPasswordDifferentCharacter;

        @NameInMap("RequireSymbols")
        @Validation(required = true)
        public Boolean requireSymbols;

        public static SetPasswordPolicyResponsePasswordPolicy build(java.util.Map<String, ?> map) throws Exception {
            SetPasswordPolicyResponsePasswordPolicy self = new SetPasswordPolicyResponsePasswordPolicy();
            return TeaModel.build(map, self);
        }

        public SetPasswordPolicyResponsePasswordPolicy setMinimumPasswordLength(Integer minimumPasswordLength) {
            this.minimumPasswordLength = minimumPasswordLength;
            return this;
        }
        public Integer getMinimumPasswordLength() {
            return this.minimumPasswordLength;
        }

        public SetPasswordPolicyResponsePasswordPolicy setHardExpire(Boolean hardExpire) {
            this.hardExpire = hardExpire;
            return this;
        }
        public Boolean getHardExpire() {
            return this.hardExpire;
        }

        public SetPasswordPolicyResponsePasswordPolicy setRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
            this.requireLowercaseCharacters = requireLowercaseCharacters;
            return this;
        }
        public Boolean getRequireLowercaseCharacters() {
            return this.requireLowercaseCharacters;
        }

        public SetPasswordPolicyResponsePasswordPolicy setRequireNumbers(Boolean requireNumbers) {
            this.requireNumbers = requireNumbers;
            return this;
        }
        public Boolean getRequireNumbers() {
            return this.requireNumbers;
        }

        public SetPasswordPolicyResponsePasswordPolicy setMaxLoginAttemps(Integer maxLoginAttemps) {
            this.maxLoginAttemps = maxLoginAttemps;
            return this;
        }
        public Integer getMaxLoginAttemps() {
            return this.maxLoginAttemps;
        }

        public SetPasswordPolicyResponsePasswordPolicy setMaxPasswordAge(Integer maxPasswordAge) {
            this.maxPasswordAge = maxPasswordAge;
            return this;
        }
        public Integer getMaxPasswordAge() {
            return this.maxPasswordAge;
        }

        public SetPasswordPolicyResponsePasswordPolicy setPasswordNotContainUserName(Boolean passwordNotContainUserName) {
            this.passwordNotContainUserName = passwordNotContainUserName;
            return this;
        }
        public Boolean getPasswordNotContainUserName() {
            return this.passwordNotContainUserName;
        }

        public SetPasswordPolicyResponsePasswordPolicy setPasswordReusePrevention(Integer passwordReusePrevention) {
            this.passwordReusePrevention = passwordReusePrevention;
            return this;
        }
        public Integer getPasswordReusePrevention() {
            return this.passwordReusePrevention;
        }

        public SetPasswordPolicyResponsePasswordPolicy setRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
            this.requireUppercaseCharacters = requireUppercaseCharacters;
            return this;
        }
        public Boolean getRequireUppercaseCharacters() {
            return this.requireUppercaseCharacters;
        }

        public SetPasswordPolicyResponsePasswordPolicy setMinimumPasswordDifferentCharacter(Integer minimumPasswordDifferentCharacter) {
            this.minimumPasswordDifferentCharacter = minimumPasswordDifferentCharacter;
            return this;
        }
        public Integer getMinimumPasswordDifferentCharacter() {
            return this.minimumPasswordDifferentCharacter;
        }

        public SetPasswordPolicyResponsePasswordPolicy setRequireSymbols(Boolean requireSymbols) {
            this.requireSymbols = requireSymbols;
            return this;
        }
        public Boolean getRequireSymbols() {
            return this.requireSymbols;
        }

    }

}
