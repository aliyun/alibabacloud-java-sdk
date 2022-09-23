// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class CreateRingToneRequest extends TeaModel {
    @NameInMap("BillId")
    public String billId;

    @NameInMap("FileKey")
    public String fileKey;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PlayType")
    public String playType;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RingName")
    public String ringName;

    @NameInMap("Tts")
    public String tts;

    public static CreateRingToneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRingToneRequest self = new CreateRingToneRequest();
        return TeaModel.build(map, self);
    }

    public CreateRingToneRequest setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public CreateRingToneRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public CreateRingToneRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateRingToneRequest setPlayType(String playType) {
        this.playType = playType;
        return this;
    }
    public String getPlayType() {
        return this.playType;
    }

    public CreateRingToneRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateRingToneRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateRingToneRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateRingToneRequest setRingName(String ringName) {
        this.ringName = ringName;
        return this;
    }
    public String getRingName() {
        return this.ringName;
    }

    public CreateRingToneRequest setTts(String tts) {
        this.tts = tts;
        return this;
    }
    public String getTts() {
        return this.tts;
    }

}
