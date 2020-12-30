// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ModifyMemberKeyRequest extends TeaModel {
    @NameInMap("LedgerId")
    public String ledgerId;

    @NameInMap("MemberId")
    public String memberId;

    @NameInMap("KeyType")
    public String keyType;

    @NameInMap("PublicKey")
    public String publicKey;

    public static ModifyMemberKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMemberKeyRequest self = new ModifyMemberKeyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMemberKeyRequest setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
        return this;
    }
    public String getLedgerId() {
        return this.ledgerId;
    }

    public ModifyMemberKeyRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public ModifyMemberKeyRequest setKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }
    public String getKeyType() {
        return this.keyType;
    }

    public ModifyMemberKeyRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

}
