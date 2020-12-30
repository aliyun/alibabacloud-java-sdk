// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class AcceptMemberRequest extends TeaModel {
    @NameInMap("LedgerId")
    public String ledgerId;

    @NameInMap("KeyType")
    public String keyType;

    @NameInMap("PublicKey")
    public String publicKey;

    public static AcceptMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AcceptMemberRequest self = new AcceptMemberRequest();
        return TeaModel.build(map, self);
    }

    public AcceptMemberRequest setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
        return this;
    }
    public String getLedgerId() {
        return this.ledgerId;
    }

    public AcceptMemberRequest setKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }
    public String getKeyType() {
        return this.keyType;
    }

    public AcceptMemberRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

}
