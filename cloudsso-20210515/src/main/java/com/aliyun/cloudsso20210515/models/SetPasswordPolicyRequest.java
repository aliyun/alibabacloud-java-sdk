// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetPasswordPolicyRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("MaxLoginAttempts")
    public Integer maxLoginAttempts;

    @NameInMap("MaxPasswordAge")
    public Integer maxPasswordAge;

    @NameInMap("MinPasswordDifferentChars")
    public Integer minPasswordDifferentChars;

    @NameInMap("MinPasswordLength")
    public Integer minPasswordLength;

    @NameInMap("PasswordNotContainUsername")
    public Boolean passwordNotContainUsername;

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
