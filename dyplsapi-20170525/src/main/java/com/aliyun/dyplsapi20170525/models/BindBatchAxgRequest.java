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

    /**
     * <strong>example:</strong>
     * <p>FC2235****</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>7ee372834d2f4cc7ac0d0ab2d0ae1aac</p>
         */
        @NameInMap("ASRModelId")
        public String ASRModelId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ASRStatus")
        public Boolean ASRStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallDisplayType")
        public Integer callDisplayType;

        /**
         * <strong>example:</strong>
         * <p>CONTROL_AX_DISABLE</p>
         */
        @NameInMap("CallRestrict")
        public String callRestrict;

        @NameInMap("ExpectCity")
        public String expectCity;

        /**
         * <strong>example:</strong>
         * <p>2022-07-11 01:05:15</p>
         */
        @NameInMap("Expiration")
        public String expiration;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("IsRecordingEnabled")
        public Boolean isRecordingEnabled;

        /**
         * <strong>example:</strong>
         * <p>18223ad447910fd</p>
         */
        @NameInMap("OutId")
        public String outId;

        /**
         * <strong>example:</strong>
         * <p>20220824021816883677</p>
         */
        @NameInMap("OutOrderId")
        public String outOrderId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>13333333333</p>
         */
        @NameInMap("PhoneNoA")
        public String phoneNoA;

        /**
         * <strong>example:</strong>
         * <p>13333333333</p>
         */
        @NameInMap("PhoneNoB")
        public String phoneNoB;

        /**
         * <strong>example:</strong>
         * <p>13333333333</p>
         */
        @NameInMap("PhoneNoX")
        public String phoneNoX;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;AXBRing_B\&quot;:\&quot;100000002\&quot;,\&quot;AXBRing_A\&quot;:\&quot;100000001\&quot;}</p>
         */
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
