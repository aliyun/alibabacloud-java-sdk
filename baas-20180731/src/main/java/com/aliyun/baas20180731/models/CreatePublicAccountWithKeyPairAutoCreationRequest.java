// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreatePublicAccountWithKeyPairAutoCreationRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("Password")
    public String password;

    @NameInMap("RecoverPassword")
    public String recoverPassword;

    public static CreatePublicAccountWithKeyPairAutoCreationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePublicAccountWithKeyPairAutoCreationRequest self = new CreatePublicAccountWithKeyPairAutoCreationRequest();
        return TeaModel.build(map, self);
    }

    public CreatePublicAccountWithKeyPairAutoCreationRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public CreatePublicAccountWithKeyPairAutoCreationRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public CreatePublicAccountWithKeyPairAutoCreationRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreatePublicAccountWithKeyPairAutoCreationRequest setRecoverPassword(String recoverPassword) {
        this.recoverPassword = recoverPassword;
        return this;
    }
    public String getRecoverPassword() {
        return this.recoverPassword;
    }

}
