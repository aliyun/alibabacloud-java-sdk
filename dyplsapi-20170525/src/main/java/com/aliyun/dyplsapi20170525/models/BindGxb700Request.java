// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindGxb700Request extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7ee372834d2f4cc7ac0d0ab2d0ae1aac</p>
     */
    @NameInMap("AsrModelId")
    public String asrModelId;

    /**
     * <strong>example:</strong>
     * <p>{
     * &quot;GCallX_Gpre&quot;:&quot;185&quot;
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
     * <p>10</p>
     */
    @NameInMap("CallTimeout")
    public Long callTimeout;

    /**
     * <strong>example:</strong>
     * <p>138****0000</p>
     */
    @NameInMap("DefaultA")
    public String defaultA;

    /**
     * <strong>example:</strong>
     * <p>{     &quot;endCallIvrPhoneNo&quot;:&quot;A&quot;,     &quot;waitingDtmfTime&quot;:10,     &quot;maxLoop&quot;:3,     &quot;step1File&quot;:&quot;62ab72f8-4750-4234-859e-e8d678c0cad3-flow_tts_test_1.wav&quot;,     &quot;step2File&quot;:&quot;62ab72f8-4750-4234-859e-e8d678c0cad3-flow_tts_test_2.wav&quot;,     &quot;validKey&quot;:&quot;1,2&quot;,     &quot;waitingEndCall&quot;:2 }</p>
     */
    @NameInMap("DtmfConfig")
    public String dtmfConfig;

    /**
     * <p>This parameter is required.</p>
     * 
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
     * <p>true</p>
     */
    @NameInMap("NeedAsr")
    public Boolean needAsr;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedRecord")
    public Boolean needRecord;

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

    /**
     * <strong>example:</strong>
     * <p>abcdefgh</p>
     */
    @NameInMap("OutOrderId")
    public String outOrderId;

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

    /**
     * <strong>example:</strong>
     * <p>mp3</p>
     */
    @NameInMap("RecType")
    public String recType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>136****0000</p>
     */
    @NameInMap("TelB")
    public String telB;

    /**
     * <strong>example:</strong>
     * <p>700********0000</p>
     */
    @NameInMap("TelX")
    public String telX;

    public static BindGxb700Request build(java.util.Map<String, ?> map) throws Exception {
        BindGxb700Request self = new BindGxb700Request();
        return TeaModel.build(map, self);
    }

    public BindGxb700Request setAsrModelId(String asrModelId) {
        this.asrModelId = asrModelId;
        return this;
    }
    public String getAsrModelId() {
        return this.asrModelId;
    }

    public BindGxb700Request setAudio(String audio) {
        this.audio = audio;
        return this;
    }
    public String getAudio() {
        return this.audio;
    }

    public BindGxb700Request setCallRestrict(String callRestrict) {
        this.callRestrict = callRestrict;
        return this;
    }
    public String getCallRestrict() {
        return this.callRestrict;
    }

    public BindGxb700Request setCallTimeout(Long callTimeout) {
        this.callTimeout = callTimeout;
        return this;
    }
    public Long getCallTimeout() {
        return this.callTimeout;
    }

    public BindGxb700Request setDefaultA(String defaultA) {
        this.defaultA = defaultA;
        return this;
    }
    public String getDefaultA() {
        return this.defaultA;
    }

    public BindGxb700Request setDtmfConfig(String dtmfConfig) {
        this.dtmfConfig = dtmfConfig;
        return this;
    }
    public String getDtmfConfig() {
        return this.dtmfConfig;
    }

    public BindGxb700Request setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public BindGxb700Request setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public BindGxb700Request setIndustrialId(String industrialId) {
        this.industrialId = industrialId;
        return this;
    }
    public String getIndustrialId() {
        return this.industrialId;
    }

    public BindGxb700Request setNeedAsr(Boolean needAsr) {
        this.needAsr = needAsr;
        return this;
    }
    public Boolean getNeedAsr() {
        return this.needAsr;
    }

    public BindGxb700Request setNeedRecord(Boolean needRecord) {
        this.needRecord = needRecord;
        return this;
    }
    public Boolean getNeedRecord() {
        return this.needRecord;
    }

    public BindGxb700Request setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public BindGxb700Request setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public BindGxb700Request setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public BindGxb700Request setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindGxb700Request setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public BindGxb700Request setRecType(String recType) {
        this.recType = recType;
        return this;
    }
    public String getRecType() {
        return this.recType;
    }

    public BindGxb700Request setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindGxb700Request setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BindGxb700Request setTelB(String telB) {
        this.telB = telB;
        return this;
    }
    public String getTelB() {
        return this.telB;
    }

    public BindGxb700Request setTelX(String telX) {
        this.telX = telX;
        return this;
    }
    public String getTelX() {
        return this.telX;
    }

}
