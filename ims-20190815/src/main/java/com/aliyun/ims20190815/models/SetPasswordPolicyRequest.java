// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetPasswordPolicyRequest extends TeaModel {
    @NameInMap("MinimumPasswordLength")
    public Integer minimumPasswordLength;

    @NameInMap("RequireLowercaseCharacters")
    public Boolean requireLowercaseCharacters;

    @NameInMap("RequireUppercaseCharacters")
    public Boolean requireUppercaseCharacters;

    @NameInMap("RequireNumbers")
    public Boolean requireNumbers;

    @NameInMap("RequireSymbols")
    public Boolean requireSymbols;

    @NameInMap("HardExpire")
    public Boolean hardExpire;

    @NameInMap("MaxLoginAttemps")
    public Integer maxLoginAttemps;

    @NameInMap("PasswordReusePrevention")
    public Integer passwordReusePrevention;

    @NameInMap("MaxPasswordAge")
    public Integer maxPasswordAge;

    @NameInMap("MinimumPasswordDifferentCharacter")
    public Integer minimumPasswordDifferentCharacter;

    @NameInMap("PasswordNotContainUserName")
    public Boolean passwordNotContainUserName;

    public static SetPasswordPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordPolicyRequest self = new SetPasswordPolicyRequest();
        return TeaModel.build(map, self);
    }

    public SetPasswordPolicyRequest setMinimumPasswordLength(Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
        return this;
    }
    public Integer getMinimumPasswordLength() {
        return this.minimumPasswordLength;
    }

    public SetPasswordPolicyRequest setRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
        this.requireLowercaseCharacters = requireLowercaseCharacters;
        return this;
    }
    public Boolean getRequireLowercaseCharacters() {
        return this.requireLowercaseCharacters;
    }

    public SetPasswordPolicyRequest setRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
        this.requireUppercaseCharacters = requireUppercaseCharacters;
        return this;
    }
    public Boolean getRequireUppercaseCharacters() {
        return this.requireUppercaseCharacters;
    }

    public SetPasswordPolicyRequest setRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
        return this;
    }
    public Boolean getRequireNumbers() {
        return this.requireNumbers;
    }

    public SetPasswordPolicyRequest setRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
        return this;
    }
    public Boolean getRequireSymbols() {
        return this.requireSymbols;
    }

    public SetPasswordPolicyRequest setHardExpire(Boolean hardExpire) {
        this.hardExpire = hardExpire;
        return this;
    }
    public Boolean getHardExpire() {
        return this.hardExpire;
    }

    public SetPasswordPolicyRequest setMaxLoginAttemps(Integer maxLoginAttemps) {
        this.maxLoginAttemps = maxLoginAttemps;
        return this;
    }
    public Integer getMaxLoginAttemps() {
        return this.maxLoginAttemps;
    }

    public SetPasswordPolicyRequest setPasswordReusePrevention(Integer passwordReusePrevention) {
        this.passwordReusePrevention = passwordReusePrevention;
        return this;
    }
    public Integer getPasswordReusePrevention() {
        return this.passwordReusePrevention;
    }

    public SetPasswordPolicyRequest setMaxPasswordAge(Integer maxPasswordAge) {
        this.maxPasswordAge = maxPasswordAge;
        return this;
    }
    public Integer getMaxPasswordAge() {
        return this.maxPasswordAge;
    }

    public SetPasswordPolicyRequest setMinimumPasswordDifferentCharacter(Integer minimumPasswordDifferentCharacter) {
        this.minimumPasswordDifferentCharacter = minimumPasswordDifferentCharacter;
        return this;
    }
    public Integer getMinimumPasswordDifferentCharacter() {
        return this.minimumPasswordDifferentCharacter;
    }

    public SetPasswordPolicyRequest setPasswordNotContainUserName(Boolean passwordNotContainUserName) {
        this.passwordNotContainUserName = passwordNotContainUserName;
        return this;
    }
    public Boolean getPasswordNotContainUserName() {
        return this.passwordNotContainUserName;
    }

}
