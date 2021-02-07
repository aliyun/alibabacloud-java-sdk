// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateLoginProfileRequest extends TeaModel {
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    @NameInMap("Password")
    public String password;

    @NameInMap("PasswordResetRequired")
    public Boolean passwordResetRequired;

    @NameInMap("MFABindRequired")
    public Boolean MFABindRequired;

    @NameInMap("GenerateRandomPassword")
    public Boolean generateRandomPassword;

    @NameInMap("Status")
    public String status;

    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    public static CreateLoginProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoginProfileRequest self = new CreateLoginProfileRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoginProfileRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public CreateLoginProfileRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateLoginProfileRequest setPasswordResetRequired(Boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
        return this;
    }
    public Boolean getPasswordResetRequired() {
        return this.passwordResetRequired;
    }

    public CreateLoginProfileRequest setMFABindRequired(Boolean MFABindRequired) {
        this.MFABindRequired = MFABindRequired;
        return this;
    }
    public Boolean getMFABindRequired() {
        return this.MFABindRequired;
    }

    public CreateLoginProfileRequest setGenerateRandomPassword(Boolean generateRandomPassword) {
        this.generateRandomPassword = generateRandomPassword;
        return this;
    }
    public Boolean getGenerateRandomPassword() {
        return this.generateRandomPassword;
    }

    public CreateLoginProfileRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateLoginProfileRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

}
