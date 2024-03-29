// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetPasswordPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The number of password retries.</p>
     * <br>
     * <p>If you enter wrong passwords for the specified consecutive times, the account is locked for 1 hour.</p>
     * <br>
     * <p>Valid values: 0 to 32. The value 0 specifies that the number of password retries is not limited.</p>
     */
    @NameInMap("MaxLoginAttempts")
    public Integer maxLoginAttempts;

    /**
     * <p>The validity period of a password.</p>
     * <br>
     * <p>Valid values: 1 to 120. Unit: days.</p>
     */
    @NameInMap("MaxPasswordAge")
    public Integer maxPasswordAge;

    /**
     * <p>The minimum number of unique characters in a password.</p>
     * <br>
     * <p>The minimum value is 0, which specifies that the minimum number of unique characters in a password is not limited. The maximum value is the value of the `MinPasswordLength` parameter.</p>
     */
    @NameInMap("MinPasswordDifferentChars")
    public Integer minPasswordDifferentChars;

    /**
     * <p>The minimum password length.</p>
     * <br>
     * <p>Valid values: 8 to 32 characters.</p>
     */
    @NameInMap("MinPasswordLength")
    public Integer minPasswordLength;

    /**
     * <p>Specifies whether a password can contain the username. Valid value:</p>
     * <br>
     * <p>*   true: A password cannot contain the username.</p>
     * <p>*   false: A password can contain the username.</p>
     */
    @NameInMap("PasswordNotContainUsername")
    public Boolean passwordNotContainUsername;

    /**
     * <p>The policy for password history check.</p>
     * <br>
     * <p>The previous N passwords cannot be reused. Valid values of N: 0 to 24. The value 0 specifies that all historical passwords can be reused.</p>
     * <br>
     * <p>>  Passwords that are generated before January 5, 2024 are not counted as historical passwords.</p>
     */
    @NameInMap("PasswordReusePrevention")
    public Integer passwordReusePrevention;

    public static SetPasswordPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordPolicyRequest self = new SetPasswordPolicyRequest();
        return TeaModel.build(map, self);
    }

    public SetPasswordPolicyRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public SetPasswordPolicyRequest setMaxLoginAttempts(Integer maxLoginAttempts) {
        this.maxLoginAttempts = maxLoginAttempts;
        return this;
    }
    public Integer getMaxLoginAttempts() {
        return this.maxLoginAttempts;
    }

    public SetPasswordPolicyRequest setMaxPasswordAge(Integer maxPasswordAge) {
        this.maxPasswordAge = maxPasswordAge;
        return this;
    }
    public Integer getMaxPasswordAge() {
        return this.maxPasswordAge;
    }

    public SetPasswordPolicyRequest setMinPasswordDifferentChars(Integer minPasswordDifferentChars) {
        this.minPasswordDifferentChars = minPasswordDifferentChars;
        return this;
    }
    public Integer getMinPasswordDifferentChars() {
        return this.minPasswordDifferentChars;
    }

    public SetPasswordPolicyRequest setMinPasswordLength(Integer minPasswordLength) {
        this.minPasswordLength = minPasswordLength;
        return this;
    }
    public Integer getMinPasswordLength() {
        return this.minPasswordLength;
    }

    public SetPasswordPolicyRequest setPasswordNotContainUsername(Boolean passwordNotContainUsername) {
        this.passwordNotContainUsername = passwordNotContainUsername;
        return this;
    }
    public Boolean getPasswordNotContainUsername() {
        return this.passwordNotContainUsername;
    }

    public SetPasswordPolicyRequest setPasswordReusePrevention(Integer passwordReusePrevention) {
        this.passwordReusePrevention = passwordReusePrevention;
        return this;
    }
    public Integer getPasswordReusePrevention() {
        return this.passwordReusePrevention;
    }

}
