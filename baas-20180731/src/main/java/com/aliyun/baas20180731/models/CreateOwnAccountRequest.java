// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateOwnAccountRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("Identity")
    public String identity;

    @NameInMap("PublicKey")
    public String publicKey;

    @NameInMap("RecoveryKey")
    public String recoveryKey;

    public static CreateOwnAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOwnAccountRequest self = new CreateOwnAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateOwnAccountRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public CreateOwnAccountRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public CreateOwnAccountRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public CreateOwnAccountRequest setRecoveryKey(String recoveryKey) {
        this.recoveryKey = recoveryKey;
        return this;
    }
    public String getRecoveryKey() {
        return this.recoveryKey;
    }

}
