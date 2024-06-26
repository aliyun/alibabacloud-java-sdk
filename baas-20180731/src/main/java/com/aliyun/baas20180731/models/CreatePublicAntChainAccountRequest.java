// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreatePublicAntChainAccountRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("AccountPubKey")
    public String accountPubKey;

    @NameInMap("AccountRecoverPubKey")
    public String accountRecoverPubKey;

    @NameInMap("Bizid")
    public String bizid;

    public static CreatePublicAntChainAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePublicAntChainAccountRequest self = new CreatePublicAntChainAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreatePublicAntChainAccountRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public CreatePublicAntChainAccountRequest setAccountPubKey(String accountPubKey) {
        this.accountPubKey = accountPubKey;
        return this;
    }
    public String getAccountPubKey() {
        return this.accountPubKey;
    }

    public CreatePublicAntChainAccountRequest setAccountRecoverPubKey(String accountRecoverPubKey) {
        this.accountRecoverPubKey = accountRecoverPubKey;
        return this;
    }
    public String getAccountRecoverPubKey() {
        return this.accountRecoverPubKey;
    }

    public CreatePublicAntChainAccountRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
