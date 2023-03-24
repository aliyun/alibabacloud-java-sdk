// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetPasswordPolicyRequest extends TeaModel {
    /**
     * <p>Specifies whether to disable logon after the password expires. Valid values:</p>
     * <br>
     * <p>*   true: After the password expires, you cannot use the password to log on to the console. You can log on to the console only after you reset the password by using your Alibaba Cloud account or as a RAM user that has administrative rights.</p>
     * <p>*   false: After the password expires, you can change the password to log on to the console. This is the default value.</p>
     */
    @NameInMap("HardExpire")
    public Boolean hardExpire;

    /**
     * <p>The maximum number of password retries. If you enter the wrong passwords for the specified consecutive times, the account is locked for one hour.</p>
     * <br>
     * <p>Valid values: 0 to 32.</p>
     * <br>
     * <p>The default value is 0, which indicates that the password retries are not limited.</p>
     */
    @NameInMap("MaxLoginAttemps")
    public Integer maxLoginAttemps;

    /**
     * <p>The validity period of the password.</p>
     * <br>
     * <p>Valid values: 0 to 1095. Unit: days.</p>
     * <br>
     * <p>The default value is 0, which indicates that the password never expires.</p>
     */
    @NameInMap("MaxPasswordAge")
    public Integer maxPasswordAge;

    /**
     * <p>The minimum number of unique characters in the password.</p>
     * <br>
     * <p>Valid values: 0 to 8.</p>
     * <br>
     * <p>The default value is 0, which indicates that no limits are imposed on the number of unique characters in a password.</p>
     */
    @NameInMap("MinimumPasswordDifferentCharacter")
    public Integer minimumPasswordDifferentCharacter;

    /**
     * <p>The minimum number of characters in the password.</p>
     * <br>
     * <p>Valid values: 8 to 32. Default value: 8.</p>
     */
    @NameInMap("MinimumPasswordLength")
    public Integer minimumPasswordLength;

    /**
     * <p>Specifies whether to exclude the username from the password. Valid values:</p>
     * <br>
     * <p>*   true: A password cannot contain the username.</p>
     * <p>*   false: A password can contain the username. This is the default value.</p>
     */
    @NameInMap("PasswordNotContainUserName")
    public Boolean passwordNotContainUserName;

    /**
     * <p>The policy for password history check.</p>
     * <br>
     * <p>The previous N passwords cannot be reused. Valid values of N: 0 to 24.</p>
     * <br>
     * <p>The default value is 0, which indicates that RAM users can reuse previous passwords.</p>
     */
    @NameInMap("PasswordReusePrevention")
    public Integer passwordReusePrevention;

    /**
     * <p>Specifies whether the password must contain lowercase letters. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("RequireLowercaseCharacters")
    public Boolean requireLowercaseCharacters;

    /**
     * <p>Specifies whether the password must contain digits. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("RequireNumbers")
    public Boolean requireNumbers;

    /**
     * <p>Specifies whether the password must contain special characters. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("RequireSymbols")
    public Boolean requireSymbols;

    /**
     * <p>Specifies whether the password must contain uppercase letters. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("RequireUppercaseCharacters")
    public Boolean requireUppercaseCharacters;

    public static SetPasswordPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordPolicyRequest self = new SetPasswordPolicyRequest();
        return TeaModel.build(map, self);
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

    public SetPasswordPolicyRequest setMinimumPasswordLength(Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
        return this;
    }
    public Integer getMinimumPasswordLength() {
        return this.minimumPasswordLength;
    }

    public SetPasswordPolicyRequest setPasswordNotContainUserName(Boolean passwordNotContainUserName) {
        this.passwordNotContainUserName = passwordNotContainUserName;
        return this;
    }
    public Boolean getPasswordNotContainUserName() {
        return this.passwordNotContainUserName;
    }

    public SetPasswordPolicyRequest setPasswordReusePrevention(Integer passwordReusePrevention) {
        this.passwordReusePrevention = passwordReusePrevention;
        return this;
    }
    public Integer getPasswordReusePrevention() {
        return this.passwordReusePrevention;
    }

    public SetPasswordPolicyRequest setRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
        this.requireLowercaseCharacters = requireLowercaseCharacters;
        return this;
    }
    public Boolean getRequireLowercaseCharacters() {
        return this.requireLowercaseCharacters;
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

    public SetPasswordPolicyRequest setRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
        this.requireUppercaseCharacters = requireUppercaseCharacters;
        return this;
    }
    public Boolean getRequireUppercaseCharacters() {
        return this.requireUppercaseCharacters;
    }

}
