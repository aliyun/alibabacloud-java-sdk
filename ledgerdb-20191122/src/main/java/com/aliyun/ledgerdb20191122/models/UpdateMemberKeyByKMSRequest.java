// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class UpdateMemberKeyByKMSRequest extends TeaModel {
    @NameInMap("LedgerId")
    public String ledgerId;

    @NameInMap("MemberId")
    public String memberId;

    @NameInMap("KeyType")
    public String keyType;

    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    @NameInMap("KMSKeyVersion")
    public String KMSKeyVersion;

    public static UpdateMemberKeyByKMSRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemberKeyByKMSRequest self = new UpdateMemberKeyByKMSRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMemberKeyByKMSRequest setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
        return this;
    }
    public String getLedgerId() {
        return this.ledgerId;
    }

    public UpdateMemberKeyByKMSRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public UpdateMemberKeyByKMSRequest setKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }
    public String getKeyType() {
        return this.keyType;
    }

    public UpdateMemberKeyByKMSRequest setKMSKeyId(String KMSKeyId) {
        this.KMSKeyId = KMSKeyId;
        return this;
    }
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    public UpdateMemberKeyByKMSRequest setKMSKeyVersion(String KMSKeyVersion) {
        this.KMSKeyVersion = KMSKeyVersion;
        return this;
    }
    public String getKMSKeyVersion() {
        return this.KMSKeyVersion;
    }

}
