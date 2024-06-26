// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateAccountWithKeyPairAutoCreationRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("Password")
    public String password;

    public static CreateAccountWithKeyPairAutoCreationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountWithKeyPairAutoCreationRequest self = new CreateAccountWithKeyPairAutoCreationRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccountWithKeyPairAutoCreationRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public CreateAccountWithKeyPairAutoCreationRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public CreateAccountWithKeyPairAutoCreationRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
