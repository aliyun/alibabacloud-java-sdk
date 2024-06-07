// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindBatchAxgRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AxgBindList")
    public java.util.List<BindBatchAxgRequestAxgBindList> axgBindList;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static BindBatchAxgRequest build(java.util.Map<String, ?> map) throws Exception {
        BindBatchAxgRequest self = new BindBatchAxgRequest();
        return TeaModel.build(map, self);
    }

    public BindBatchAxgRequest setAxgBindList(java.util.List<BindBatchAxgRequestAxgBindList> axgBindList) {
        this.axgBindList = axgBindList;
        return this;
    }
    public java.util.List<BindBatchAxgRequestAxgBindList> getAxgBindList() {
        return this.axgBindList;
    }

    public BindBatchAxgRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindBatchAxgRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public BindBatchAxgRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindBatchAxgRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class BindBatchAxgRequestAxgBindList extends TeaModel {
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

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("IsRecordingEnabled")
        public Boolean isRecordingEnabled;

        @NameInMap("OutId")
        public String outId;

        @NameInMap("OutOrderId")
        public String outOrderId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("PhoneNoA")
        public String phoneNoA;

        @NameInMap("PhoneNoB")
        public String phoneNoB;

        @NameInMap("PhoneNoX")
        public String phoneNoX;

        @NameInMap("RingConfig")
        public String ringConfig;

        public static BindBatchAxgRequestAxgBindList build(java.util.Map<String, ?> map) throws Exception {
            BindBatchAxgRequestAxgBindList self = new BindBatchAxgRequestAxgBindList();
            return TeaModel.build(map, self);
        }

        public BindBatchAxgRequestAxgBindList setASRModelId(String ASRModelId) {
            this.ASRModelId = ASRModelId;
            return this;
        }
        public String getASRModelId() {
            return this.ASRModelId;
        }

        public BindBatchAxgRequestAxgBindList setASRStatus(Boolean ASRStatus) {
            this.ASRStatus = ASRStatus;
            return this;
        }
        public Boolean getASRStatus() {
            return this.ASRStatus;
        }

        public BindBatchAxgRequestAxgBindList setCallDisplayType(Integer callDisplayType) {
            this.callDisplayType = callDisplayType;
            return this;
        }
        public Integer getCallDisplayType() {
            return this.callDisplayType;
        }

        public BindBatchAxgRequestAxgBindList setCallRestrict(String callRestrict) {
            this.callRestrict = callRestrict;
            return this;
        }
        public String getCallRestrict() {
            return this.callRestrict;
        }

        public BindBatchAxgRequestAxgBindList setExpectCity(String expectCity) {
            this.expectCity = expectCity;
            return this;
        }
        public String getExpectCity() {
            return this.expectCity;
        }

        public BindBatchAxgRequestAxgBindList setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public BindBatchAxgRequestAxgBindList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public BindBatchAxgRequestAxgBindList setIsRecordingEnabled(Boolean isRecordingEnabled) {
            this.isRecordingEnabled = isRecordingEnabled;
            return this;
        }
        public Boolean getIsRecordingEnabled() {
            return this.isRecordingEnabled;
        }

        public BindBatchAxgRequestAxgBindList setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public BindBatchAxgRequestAxgBindList setOutOrderId(String outOrderId) {
            this.outOrderId = outOrderId;
            return this;
        }
        public String getOutOrderId() {
            return this.outOrderId;
        }

        public BindBatchAxgRequestAxgBindList setPhoneNoA(String phoneNoA) {
            this.phoneNoA = phoneNoA;
            return this;
        }
        public String getPhoneNoA() {
            return this.phoneNoA;
        }

        public BindBatchAxgRequestAxgBindList setPhoneNoB(String phoneNoB) {
            this.phoneNoB = phoneNoB;
            return this;
        }
        public String getPhoneNoB() {
            return this.phoneNoB;
        }

        public BindBatchAxgRequestAxgBindList setPhoneNoX(String phoneNoX) {
            this.phoneNoX = phoneNoX;
            return this;
        }
        public String getPhoneNoX() {
            return this.phoneNoX;
        }

        public BindBatchAxgRequestAxgBindList setRingConfig(String ringConfig) {
            this.ringConfig = ringConfig;
            return this;
        }
        public String getRingConfig() {
            return this.ringConfig;
        }

    }

}
