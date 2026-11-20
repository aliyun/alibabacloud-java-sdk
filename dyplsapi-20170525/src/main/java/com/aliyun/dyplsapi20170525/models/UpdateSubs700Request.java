// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateSubs700Request extends TeaModel {
    /**
     * <p>The ASR model ID. Valid values:</p>
     * <ul>
     * <li>General-telephone-Mandarin Chinese model ID: 7ee372834d2f4cc7ac0d0ab2d0ae1aac.</li>
     * <li>General-telephone-Cantonese model ID: 9b4afe3d224e4fa3bf963697113e2f77.</li>
     * <li>General-telephone-regional accent model ID: 3655a6cb94764145a1f9a38a3c3b3b4b.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>7ee372834d2f4cc7ac0d0ab2d0ae1aac</p>
     */
    @NameInMap("AsrModelId")
    public String asrModelId;

    /**
     * <p>Optional. The audio playback code.</p>
     * <ul>
     * <li>AXB mode:
     * ACallX_Apre: The audio playback code for the voice prompt played to Number A before the call is connected when Number A calls Number X.
     * ACallX_Ain: The audio playback code for the voice prompt played to Number A after the call is connected when Number A calls Number X.
     * ACallX_Bin: The audio playback code for the voice prompt played to Number B after the call is connected when Number A calls Number X.
     * BCallX_Bpre: The audio playback code for the voice prompt played to Number B before the call is connected when Number B calls Number X.
     * BCallX_Ain: The audio playback code for the voice prompt played to Number A after the call is connected when Number B calls Number X.
     * BCallX_Bin: The audio playback code for the voice prompt played to Number B after the call is connected when Number B calls Number X.</li>
     * <li>GXB mode:
     * GCallX_Gpre: The audio playback code for the voice prompt played to the caller before the call is connected when a number in Group G calls Number X.
     * GCallX_Gin: The audio playback code for the voice prompt played to the caller after the call is connected when a number in Group G calls Number X.
     * GCallX_Bin: The audio playback code for the voice prompt played to Number B after the call is connected when a number in Group G calls Number X.
     * BCallX_Bpre: The audio playback code for the voice prompt played to Number B before the call is connected when Number B calls Number X.
     * BCallX_Gin: The audio playback code for the voice prompt played to the callee after the call is connected when Number B calls Number X.
     * BCallX_Bin: The audio playback code for the voice prompt played to Number B after the call is connected when Number B calls Number X.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     * &quot;ACallX_Apre&quot;:&quot;185&quot;
     * }</p>
     */
    @NameInMap("Audio")
    public String audio;

    /**
     * <p>The new single-call restriction logic.</p>
     * 
     * <strong>example:</strong>
     * <p>CONTROL_AX_DISABLE</p>
     */
    @NameInMap("CallRestrict")
    public String callRestrict;

    /**
     * <p>The default Number A for the GXB private number. Note: The callback mode can be set at the number pool level. When the callback mode is set to the default mode, this field takes effect. When Number B calls Number X, the call is forwarded to this Number A by default. If Number A is not set, the call cannot be connected. To update Number A, call the number binding modification API.</p>
     * 
     * <strong>example:</strong>
     * <p>138****0000</p>
     */
    @NameInMap("DefaultA")
    public String defaultA;

    /**
     * <p>The new expiration time of the binding relationship.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-05 12:00:00</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    /**
     * <p>The new group ID in the binding relationship.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample value</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Optional. The Industrial Internet identification code, which has a one-to-one mapping with the OrderId. The code supports characters such as periods (.) and forward slashes (/) to separate code domains. The code must not contain non-printable characters, such as spaces and line breaks. This field is required when the business user generates the Industrial Internet identification code.</p>
     * 
     * <strong>example:</strong>
     * <p>700.100.1/12345678</p>
     */
    @NameInMap("IndustrialId")
    public String industrialId;

    /**
     * <p>Specifies whether to enable the ASR feature. Valid values:</p>
     * <ul>
     * <li>false: Disables the feature. This is the default value.</li>
     * <li>true: Enables the feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedAsr")
    public Boolean needAsr;

    /**
     * <p>The new media selection in the binding relationship.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedRecord")
    public Boolean needRecord;

    /**
     * <p>The operation type. Valid values:</p>
     * <ul>
     * <li>updateNoA: Updates Number A.</li>
     * <li>updateNoB: Updates Number B.</li>
     * <li>updateExpire: Updates the validity period of the binding relationship.</li>
     * <li>updateGroup: Updates the Number G group.</li>
     * <li>updateNoDefaultA: Updates the default callback Number A in GXB mode.</li>
     * <li>updateCallRestrict: Sets the single-call restriction.</li>
     * <li>updateOutId: Updates the OutId field.</li>
     * <li>updateIsRecordingEnabled: Updates the recording status in the binding.</li>
     * <li>updateAsr: Updates the ASR status in the binding.</li>
     * <li>updateAudio: Updates the ringtone configuration in the binding.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>updateNoA</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>The order ID. This parameter is required in practice. Encrypt the order ID for reporting to the regulatory platform.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The external business extension field. This parameter is returned in the call record receipt message.</p>
     * 
     * <strong>example:</strong>
     * <p>abcdef</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key of the number pool.</p>
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
     * <p>The ID of the binding relationship, which uniquely identifies the number binding relationship.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000*****</p>
     */
    @NameInMap("SubsId")
    public Long subsId;

    /**
     * <p>The new Number A in the binding relationship.</p>
     * 
     * <strong>example:</strong>
     * <p>138****0000</p>
     */
    @NameInMap("TelA")
    public String telA;

    /**
     * <p>The new Number B in the binding relationship.</p>
     * 
     * <strong>example:</strong>
     * <p>136****0000</p>
     */
    @NameInMap("TelB")
    public String telB;

    /**
     * <p>The intermediate Number X. If the business user does not specify Number X, the application platform assigns a number from the number pool as Number X.</p>
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
