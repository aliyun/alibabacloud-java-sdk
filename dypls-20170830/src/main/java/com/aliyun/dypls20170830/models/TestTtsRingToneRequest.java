// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class TestTtsRingToneRequest extends TeaModel {
    @NameInMap("BillId")
    public String billId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tts")
    public String tts;

    @NameInMap("VoiceSpeed")
    public String voiceSpeed;

    @NameInMap("VoiceStyle")
    public String voiceStyle;

    @NameInMap("VoiceType")
    public String voiceType;

    @NameInMap("VoiceVolume")
    public String voiceVolume;

    public static TestTtsRingToneRequest build(java.util.Map<String, ?> map) throws Exception {
        TestTtsRingToneRequest self = new TestTtsRingToneRequest();
        return TeaModel.build(map, self);
    }

    public TestTtsRingToneRequest setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public TestTtsRingToneRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TestTtsRingToneRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public TestTtsRingToneRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TestTtsRingToneRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public TestTtsRingToneRequest setTts(String tts) {
        this.tts = tts;
        return this;
    }
    public String getTts() {
        return this.tts;
    }

    public TestTtsRingToneRequest setVoiceSpeed(String voiceSpeed) {
        this.voiceSpeed = voiceSpeed;
        return this;
    }
    public String getVoiceSpeed() {
        return this.voiceSpeed;
    }

    public TestTtsRingToneRequest setVoiceStyle(String voiceStyle) {
        this.voiceStyle = voiceStyle;
        return this;
    }
    public String getVoiceStyle() {
        return this.voiceStyle;
    }

    public TestTtsRingToneRequest setVoiceType(String voiceType) {
        this.voiceType = voiceType;
        return this;
    }
    public String getVoiceType() {
        return this.voiceType;
    }

    public TestTtsRingToneRequest setVoiceVolume(String voiceVolume) {
        this.voiceVolume = voiceVolume;
        return this;
    }
    public String getVoiceVolume() {
        return this.voiceVolume;
    }

}
