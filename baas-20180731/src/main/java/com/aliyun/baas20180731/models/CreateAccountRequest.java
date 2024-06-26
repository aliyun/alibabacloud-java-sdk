// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateAccountRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("AccountPubKey")
    public String accountPubKey;

    @NameInMap("AccountRecoverPubKey")
    public String accountRecoverPubKey;

    @NameInMap("Bizid")
    public String bizid;

    public static CreateAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountRequest self = new CreateAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccountRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public CreateAccountRequest setAccountPubKey(String accountPubKey) {
        this.accountPubKey = accountPubKey;
        return this;
    }
    public String getAccountPubKey() {
        return this.accountPubKey;
    }

    public CreateAccountRequest setAccountRecoverPubKey(String accountRecoverPubKey) {
        this.accountRecoverPubKey = accountRecoverPubKey;
        return this;
    }
    public String getAccountRecoverPubKey() {
        return this.accountRecoverPubKey;
    }

    public CreateAccountRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
