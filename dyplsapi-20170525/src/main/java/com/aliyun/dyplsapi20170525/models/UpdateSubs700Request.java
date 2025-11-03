// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateSubs700Request extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7ee372834d2f4cc7ac0d0ab2d0ae1aac</p>
     */
    @NameInMap("AsrModelId")
    public String asrModelId;

    /**
     * <strong>example:</strong>
     * <p>{
     * &quot;ACallX_Apre&quot;:&quot;185&quot;
     * }</p>
     */
    @NameInMap("Audio")
    public String audio;

    /**
     * <strong>example:</strong>
     * <p>CONTROL_AX_DISABLE</p>
     */
    @NameInMap("CallRestrict")
    public String callRestrict;

    /**
     * <strong>example:</strong>
     * <p>138****0000</p>
     */
    @NameInMap("DefaultA")
    public String defaultA;

    /**
     * <strong>example:</strong>
     * <p>2021-09-05 12:00:00</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    /**
     * <strong>example:</strong>
     * <p>10000*****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <strong>example:</strong>
     * <p>700.100.1/12345678</p>
     */
    @NameInMap("IndustrialId")
    public String industrialId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedAsr")
    public Boolean needAsr;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedRecord")
    public Boolean needRecord;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>updateNoA</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>abcdef</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC10000016848****</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000*****</p>
     */
    @NameInMap("SubsId")
    public Long subsId;

    /**
     * <strong>example:</strong>
     * <p>138****0000</p>
     */
    @NameInMap("TelA")
    public String telA;

    /**
     * <strong>example:</strong>
     * <p>136****0000</p>
     */
    @NameInMap("TelB")
    public String telB;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>700********0000</p>
     */
    @NameInMap("TelX")
    public String telX;

    public static UpdateSubs700Request build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubs700Request self = new UpdateSubs700Request();
        return TeaModel.build(map, self);
    }

    public UpdateSubs700Request setAsrModelId(String asrModelId) {
        this.asrModelId = asrModelId;
        return this;
    }
    public String getAsrModelId() {
        return this.asrModelId;
    }

    public UpdateSubs700Request setAudio(String audio) {
        this.audio = audio;
        return this;
    }
    public String getAudio() {
        return this.audio;
    }

    public UpdateSubs700Request setCallRestrict(String callRestrict) {
        this.callRestrict = callRestrict;
        return this;
    }
    public String getCallRestrict() {
        return this.callRestrict;
    }

    public UpdateSubs700Request setDefaultA(String defaultA) {
        this.defaultA = defaultA;
        return this;
    }
    public String getDefaultA() {
        return this.defaultA;
    }

    public UpdateSubs700Request setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public UpdateSubs700Request setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateSubs700Request setIndustrialId(String industrialId) {
        this.industrialId = industrialId;
        return this;
    }
    public String getIndustrialId() {
        return this.industrialId;
    }

    public UpdateSubs700Request setNeedAsr(Boolean needAsr) {
        this.needAsr = needAsr;
        return this;
    }
    public Boolean getNeedAsr() {
        return this.needAsr;
    }

    public UpdateSubs700Request setNeedRecord(Boolean needRecord) {
        this.needRecord = needRecord;
        return this;
    }
    public Boolean getNeedRecord() {
        return this.needRecord;
    }

    public UpdateSubs700Request setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public UpdateSubs700Request setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateSubs700Request setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public UpdateSubs700Request setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateSubs700Request setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public UpdateSubs700Request setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateSubs700Request setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateSubs700Request setSubsId(Long subsId) {
        this.subsId = subsId;
        return this;
    }
    public Long getSubsId() {
        return this.subsId;
    }

    public UpdateSubs700Request setTelA(String telA) {
        this.telA = telA;
        return this;
    }
    public String getTelA() {
        return this.telA;
    }

    public UpdateSubs700Request setTelB(String telB) {
        this.telB = telB;
        return this;
    }
    public String getTelB() {
        return this.telB;
    }

    public UpdateSubs700Request setTelX(String telX) {
        this.telX = telX;
        return this;
    }
    public String getTelX() {
        return this.telX;
    }

}
