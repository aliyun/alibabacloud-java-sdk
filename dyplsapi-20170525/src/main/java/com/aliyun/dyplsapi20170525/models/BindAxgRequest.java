// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxgRequest extends TeaModel {
    @NameInMap("ASRModelId")
    public String ASRModelId;

    @NameInMap("ASRStatus")
    public Boolean ASRStatus;

    @NameInMap("CallDisplayType")
    public Integer callDisplayType;

    @NameInMap("CallRestrict")
    public String callRestrict;

    @NameInMap("ExpectCity")
    public String expectCity;

    @NameInMap("Expiration")
    public String expiration;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("IsRecordingEnabled")
    public Boolean isRecordingEnabled;

    @NameInMap("OutId")
    public String outId;

    @NameInMap("OutOrderId")
    public String outOrderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PhoneNoA")
    public String phoneNoA;

    @NameInMap("PhoneNoB")
    public String phoneNoB;

    @NameInMap("PhoneNoX")
    public String phoneNoX;

    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RingConfig")
    public String ringConfig;

    public static BindAxgRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAxgRequest self = new BindAxgRequest();
        return TeaModel.build(map, self);
    }

    public BindAxgRequest setASRModelId(String ASRModelId) {
        this.ASRModelId = ASRModelId;
        return this;
    }
    public String getASRModelId() {
        return this.ASRModelId;
    }

    public BindAxgRequest setASRStatus(Boolean ASRStatus) {
        this.ASRStatus = ASRStatus;
        return this;
    }
    public Boolean getASRStatus() {
        return this.ASRStatus;
    }

    public BindAxgRequest setCallDisplayType(Integer callDisplayType) {
        this.callDisplayType = callDisplayType;
        return this;
    }
    public Integer getCallDisplayType() {
        return this.callDisplayType;
    }

    public BindAxgRequest setCallRestrict(String callRestrict) {
        this.callRestrict = callRestrict;
        return this;
    }
    public String getCallRestrict() {
        return this.callRestrict;
    }

    public BindAxgRequest setExpectCity(String expectCity) {
        this.expectCity = expectCity;
        return this;
    }
    public String getExpectCity() {
        return this.expectCity;
    }

    public BindAxgRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public BindAxgRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public BindAxgRequest setIsRecordingEnabled(Boolean isRecordingEnabled) {
        this.isRecordingEnabled = isRecordingEnabled;
        return this;
    }
    public Boolean getIsRecordingEnabled() {
        return this.isRecordingEnabled;
    }

    public BindAxgRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public BindAxgRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public BindAxgRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindAxgRequest setPhoneNoA(String phoneNoA) {
        this.phoneNoA = phoneNoA;
        return this;
    }
    public String getPhoneNoA() {
        return this.phoneNoA;
    }

    public BindAxgRequest setPhoneNoB(String phoneNoB) {
        this.phoneNoB = phoneNoB;
        return this;
    }
    public String getPhoneNoB() {
        return this.phoneNoB;
    }

    public BindAxgRequest setPhoneNoX(String phoneNoX) {
        this.phoneNoX = phoneNoX;
        return this;
    }
    public String getPhoneNoX() {
        return this.phoneNoX;
    }

    public BindAxgRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public BindAxgRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindAxgRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BindAxgRequest setRingConfig(String ringConfig) {
        this.ringConfig = ringConfig;
        return this;
    }
    public String getRingConfig() {
        return this.ringConfig;
    }

}
