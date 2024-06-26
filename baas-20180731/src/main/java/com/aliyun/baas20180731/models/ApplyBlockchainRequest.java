// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ApplyBlockchainRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("AccountPubKey")
    public String accountPubKey;

    @NameInMap("AccountRecoverPubKey")
    public String accountRecoverPubKey;

    @NameInMap("Blockchain")
    public String blockchain;

    @NameInMap("UploadReq")
    public String uploadReq;

    public static ApplyBlockchainRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyBlockchainRequest self = new ApplyBlockchainRequest();
        return TeaModel.build(map, self);
    }

    public ApplyBlockchainRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public ApplyBlockchainRequest setAccountPubKey(String accountPubKey) {
        this.accountPubKey = accountPubKey;
        return this;
    }
    public String getAccountPubKey() {
        return this.accountPubKey;
    }

    public ApplyBlockchainRequest setAccountRecoverPubKey(String accountRecoverPubKey) {
        this.accountRecoverPubKey = accountRecoverPubKey;
        return this;
    }
    public String getAccountRecoverPubKey() {
        return this.accountRecoverPubKey;
    }

    public ApplyBlockchainRequest setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public ApplyBlockchainRequest setUploadReq(String uploadReq) {
        this.uploadReq = uploadReq;
        return this;
    }
    public String getUploadReq() {
        return this.uploadReq;
    }

}
