// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class SetUserPasswordRequest extends TeaModel {
    /**
     * <p>Specifies whether to generate a random password. If this parameter is set to true, the system automatically generates a random password that complies with the password policy. This parameter is mutually exclusive with Password.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GenerateRandomPassword")
    public Boolean generateRandomPassword;

    /**
     * <p>The password of the user. The password must comply with the password policy of the user pool and is mutually exclusive with GenerateRandomPassword.</p>
     * 
     * <strong>example:</strong>
     * <p>P@ssw0rd!2026</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The name of the user pool.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-userpool</p>
     */
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
