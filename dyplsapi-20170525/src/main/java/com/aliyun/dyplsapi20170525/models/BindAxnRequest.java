// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxnRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("PhoneNoA")
    public String phoneNoA;

    @NameInMap("PhoneNoB")
    public String phoneNoB;

    @NameInMap("PhoneNoX")
    public String phoneNoX;

    @NameInMap("Expiration")
    public String expiration;

    @NameInMap("ExpectCity")
    public String expectCity;

    @NameInMap("IsRecordingEnabled")
    public Boolean isRecordingEnabled;

    @NameInMap("NoType")
    public String noType;

    @NameInMap("OutId")
    public String outId;

    @NameInMap("OutOrderId")
    public String outOrderId;

    @NameInMap("CallDisplayType")
    public Integer callDisplayType;

    @NameInMap("RingConfig")
    public String ringConfig;

    @NameInMap("ASRStatus")
    public Boolean ASRStatus;

    @NameInMap("ASRModelId")
    public String ASRModelId;

    @NameInMap("CallTimeout")
    public Integer callTimeout;

    @NameInMap("CallRestrict")
    public String callRestrict;

    public static BindAxnRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAxnRequest self = new BindAxnRequest();
        return TeaModel.build(map, self);
    }

    public BindAxnRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindAxnRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindAxnRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BindAxnRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public BindAxnRequest setPhoneNoA(String phoneNoA) {
        this.phoneNoA = phoneNoA;
        return this;
    }
    public String getPhoneNoA() {
        return this.phoneNoA;
    }

    public BindAxnRequest setPhoneNoB(String phoneNoB) {
        this.phoneNoB = phoneNoB;
        return this;
    }
    public String getPhoneNoB() {
        return this.phoneNoB;
    }

    public BindAxnRequest setPhoneNoX(String phoneNoX) {
        this.phoneNoX = phoneNoX;
        return this;
    }
    public String getPhoneNoX() {
        return this.phoneNoX;
    }

    public BindAxnRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public BindAxnRequest setExpectCity(String expectCity) {
        this.expectCity = expectCity;
        return this;
    }
    public String getExpectCity() {
        return this.expectCity;
    }

    public BindAxnRequest setIsRecordingEnabled(Boolean isRecordingEnabled) {
        this.isRecordingEnabled = isRecordingEnabled;
        return this;
    }
    public Boolean getIsRecordingEnabled() {
        return this.isRecordingEnabled;
    }

    public BindAxnRequest setNoType(String noType) {
        this.noType = noType;
        return this;
    }
    public String getNoType() {
        return this.noType;
    }

    public BindAxnRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public BindAxnRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public BindAxnRequest setCallDisplayType(Integer callDisplayType) {
        this.callDisplayType = callDisplayType;
        return this;
    }
    public Integer getCallDisplayType() {
        return this.callDisplayType;
    }

    public BindAxnRequest setRingConfig(String ringConfig) {
        this.ringConfig = ringConfig;
        return this;
    }
    public String getRingConfig() {
        return this.ringConfig;
    }

    public BindAxnRequest setASRStatus(Boolean ASRStatus) {
        this.ASRStatus = ASRStatus;
        return this;
    }
    public Boolean getASRStatus() {
        return this.ASRStatus;
    }

    public BindAxnRequest setASRModelId(String ASRModelId) {
        this.ASRModelId = ASRModelId;
        return this;
    }
    public String getASRModelId() {
        return this.ASRModelId;
    }

    public BindAxnRequest setCallTimeout(Integer callTimeout) {
        this.callTimeout = callTimeout;
        return this;
    }
    public Integer getCallTimeout() {
        return this.callTimeout;
    }

    public BindAxnRequest setCallRestrict(String callRestrict) {
        this.callRestrict = callRestrict;
        return this;
    }
    public String getCallRestrict() {
        return this.callRestrict;
    }

}
