// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetPasswordPolicyRequest extends TeaModel {
    /**
     * <p>Specifies whether logon is blocked after a password expires.</p>
     * <ul>
     * <li><p>true: After a password expires, the RAM user cannot log on to the console. An Alibaba Cloud account owner or a RAM administrator must reset the password before the RAM user can log on.</p>
     * </li>
     * <li><p>false (default): After a password expires, the RAM user can change the password and then log on.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HardExpire")
    public Boolean hardExpire;

    /**
     * <p>Validity period for initial passwords. Initial passwords apply to newly created RAM users or users whose console logon settings are re-enabled.</p>
     * <p>Valid values: 0 to 90. Unit: days.</p>
     * <p>Default value: 14.</p>
     * <p>A value of 0 disables this constraint.</p>
     * 
     * <strong>example:</strong>
     * <p>14</p>
     */
    @NameInMap("InitialPasswordAge")
    public Integer initialPasswordAge;

    /**
     * <p>Specifies whether threat passwords are blocked when set using APIs.</p>
     * <p>Default value: false</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false (default)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InterceptRiskPasswordOnApi")
    public Boolean interceptRiskPasswordOnApi;

    /**
     * <p>Maximum number of failed password attempts. After the specified number of consecutive incorrect password attempts, the account is locked for one hour.</p>
     * <p>Valid values: 0 to 32.</p>
     * <p>Default value: 0, which disables this constraint.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxLoginAttemps")
    public Integer maxLoginAttemps;

    /**
     * <p>Password validity period.</p>
     * <p>Valid values: 0 to 1095. Unit: days.</p>
     * <p>Default value: 0, which means passwords never expire.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxPasswordAge")
    public Integer maxPasswordAge;

    /**
     * <p>Minimum number of unique characters in a password.</p>
     * <p>Valid values: 0 to 8.</p>
     * <p>Default value: 0, which imposes no restriction.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MinimumPasswordDifferentCharacter")
    public Integer minimumPasswordDifferentCharacter;

    /**
     * <p>Minimum password length.</p>
     * <p>Valid values: 8 to 32.</p>
     * <p>Default value: 8.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("MinimumPasswordLength")
    public Integer minimumPasswordLength;

    /**
     * <p>Specifies whether passwords must not contain the user name.</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false (default)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PasswordNotContainUserName")
    public Boolean passwordNotContainUserName;

    /**
     * <p>Prevents reuse of previous passwords.</p>
     * <p>Valid values: 0 to 24. This value specifies how many previous passwords are blocked from reuse.</p>
     * <p>Default value: 0, which disables this constraint.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PasswordReusePrevention")
    public Integer passwordReusePrevention;

    /**
     * <p>Specifies whether passwords must contain lowercase letters.</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false (default)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RequireLowercaseCharacters")
    public Boolean requireLowercaseCharacters;

    /**
     * <p>Specifies whether passwords must contain numbers.</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false (default)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RequireNumbers")
    public Boolean requireNumbers;

    /**
     * <p>Specifies whether passwords must contain special characters.</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false (default)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RequireSymbols")
    public Boolean requireSymbols;

    /**
     * <p>Specifies whether passwords must contain uppercase letters.</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false (default)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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

    public SetPasswordPolicyRequest setInitialPasswordAge(Integer initialPasswordAge) {
        this.initialPasswordAge = initialPasswordAge;
        return this;
    }
    public Integer getInitialPasswordAge() {
        return this.initialPasswordAge;
    }

    public SetPasswordPolicyRequest setInterceptRiskPasswordOnApi(Boolean interceptRiskPasswordOnApi) {
        this.interceptRiskPasswordOnApi = interceptRiskPasswordOnApi;
        return this;
    }
    public Boolean getInterceptRiskPasswordOnApi() {
        return this.interceptRiskPasswordOnApi;
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
