// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetPasswordPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PasswordPolicy")
    @Validation(required = true)
    public GetPasswordPolicyResponsePasswordPolicy passwordPolicy;

    public static GetPasswordPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPasswordPolicyResponse self = new GetPasswordPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetPasswordPolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPasswordPolicyResponse setPasswordPolicy(GetPasswordPolicyResponsePasswordPolicy passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
        return this;
    }
    public GetPasswordPolicyResponsePasswordPolicy getPasswordPolicy() {
        return this.passwordPolicy;
    }

    public static class GetPasswordPolicyResponsePasswordPolicy extends TeaModel {
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

        public static GetPasswordPolicyResponsePasswordPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetPasswordPolicyResponsePasswordPolicy self = new GetPasswordPolicyResponsePasswordPolicy();
            return TeaModel.build(map, self);
        }

        public GetPasswordPolicyResponsePasswordPolicy setMinimumPasswordLength(Integer minimumPasswordLength) {
            this.minimumPasswordLength = minimumPasswordLength;
            return this;
        }
        public Integer getMinimumPasswordLength() {
            return this.minimumPasswordLength;
        }

        public GetPasswordPolicyResponsePasswordPolicy setHardExpire(Boolean hardExpire) {
            this.hardExpire = hardExpire;
            return this;
        }
        public Boolean getHardExpire() {
            return this.hardExpire;
        }

        public GetPasswordPolicyResponsePasswordPolicy setRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
            this.requireLowercaseCharacters = requireLowercaseCharacters;
            return this;
        }
        public Boolean getRequireLowercaseCharacters() {
            return this.requireLowercaseCharacters;
        }

        public GetPasswordPolicyResponsePasswordPolicy setRequireNumbers(Boolean requireNumbers) {
            this.requireNumbers = requireNumbers;
            return this;
        }
        public Boolean getRequireNumbers() {
            return this.requireNumbers;
        }

        public GetPasswordPolicyResponsePasswordPolicy setMaxLoginAttemps(Integer maxLoginAttemps) {
            this.maxLoginAttemps = maxLoginAttemps;
            return this;
        }
        public Integer getMaxLoginAttemps() {
            return this.maxLoginAttemps;
        }

        public GetPasswordPolicyResponsePasswordPolicy setMaxPasswordAge(Integer maxPasswordAge) {
            this.maxPasswordAge = maxPasswordAge;
            return this;
        }
        public Integer getMaxPasswordAge() {
            return this.maxPasswordAge;
        }

        public GetPasswordPolicyResponsePasswordPolicy setPasswordNotContainUserName(Boolean passwordNotContainUserName) {
            this.passwordNotContainUserName = passwordNotContainUserName;
            return this;
        }
        public Boolean getPasswordNotContainUserName() {
            return this.passwordNotContainUserName;
        }

        public GetPasswordPolicyResponsePasswordPolicy setPasswordReusePrevention(Integer passwordReusePrevention) {
            this.passwordReusePrevention = passwordReusePrevention;
            return this;
        }
        public Integer getPasswordReusePrevention() {
            return this.passwordReusePrevention;
        }

        public GetPasswordPolicyResponsePasswordPolicy setRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
            this.requireUppercaseCharacters = requireUppercaseCharacters;
            return this;
        }
        public Boolean getRequireUppercaseCharacters() {
            return this.requireUppercaseCharacters;
        }

        public GetPasswordPolicyResponsePasswordPolicy setMinimumPasswordDifferentCharacter(Integer minimumPasswordDifferentCharacter) {
            this.minimumPasswordDifferentCharacter = minimumPasswordDifferentCharacter;
            return this;
        }
        public Integer getMinimumPasswordDifferentCharacter() {
            return this.minimumPasswordDifferentCharacter;
        }

        public GetPasswordPolicyResponsePasswordPolicy setRequireSymbols(Boolean requireSymbols) {
            this.requireSymbols = requireSymbols;
            return this;
        }
        public Boolean getRequireSymbols() {
            return this.requireSymbols;
        }

    }

}
