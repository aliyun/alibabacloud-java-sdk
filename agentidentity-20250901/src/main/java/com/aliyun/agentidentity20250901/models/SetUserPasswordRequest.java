// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class SetUserPasswordRequest extends TeaModel {
    @NameInMap("GenerateRandomPassword")
    public Boolean generateRandomPassword;

    @NameInMap("Password")
    public String password;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("UserPoolName")
    public String userPoolName;

    public static SetUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        SetUserPasswordRequest self = new SetUserPasswordRequest();
        return TeaModel.build(map, self);
    }

    public SetUserPasswordRequest setGenerateRandomPassword(Boolean generateRandomPassword) {
        this.generateRandomPassword = generateRandomPassword;
        return this;
    }
    public Boolean getGenerateRandomPassword() {
        return this.generateRandomPassword;
    }

    public SetUserPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public SetUserPasswordRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public SetUserPasswordRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
