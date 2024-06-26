// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateAntChainAccountRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("AccountPubKey")
    public String accountPubKey;

    @NameInMap("AccountRecoverPubKey")
    public String accountRecoverPubKey;

    @NameInMap("AntChainId")
    public String antChainId;

    public static CreateAntChainAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntChainAccountRequest self = new CreateAntChainAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntChainAccountRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public CreateAntChainAccountRequest setAccountPubKey(String accountPubKey) {
        this.accountPubKey = accountPubKey;
        return this;
    }
    public String getAccountPubKey() {
        return this.accountPubKey;
    }

    public CreateAntChainAccountRequest setAccountRecoverPubKey(String accountRecoverPubKey) {
        this.accountRecoverPubKey = accountRecoverPubKey;
        return this;
    }
    public String getAccountRecoverPubKey() {
        return this.accountRecoverPubKey;
    }

    public CreateAntChainAccountRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

}
