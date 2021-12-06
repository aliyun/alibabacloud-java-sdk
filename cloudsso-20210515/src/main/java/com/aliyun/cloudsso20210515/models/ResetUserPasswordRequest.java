// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ResetUserPasswordRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("GenerateRandomPassword")
    public Boolean generateRandomPassword;

    @NameInMap("Password")
    public String password;

    @NameInMap("RequirePasswordResetForNextLogin")
    public Boolean requirePasswordResetForNextLogin;

    @NameInMap("UserId")
    public String userId;

    public static ResetUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetUserPasswordRequest self = new ResetUserPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetUserPasswordRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ResetUserPasswordRequest setGenerateRandomPassword(Boolean generateRandomPassword) {
        this.generateRandomPassword = generateRandomPassword;
        return this;
    }
    public Boolean getGenerateRandomPassword() {
        return this.generateRandomPassword;
    }

    public ResetUserPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ResetUserPasswordRequest setRequirePasswordResetForNextLogin(Boolean requirePasswordResetForNextLogin) {
        this.requirePasswordResetForNextLogin = requirePasswordResetForNextLogin;
        return this;
    }
    public Boolean getRequirePasswordResetForNextLogin() {
        return this.requirePasswordResetForNextLogin;
    }

    public ResetUserPasswordRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
