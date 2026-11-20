// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindGxb700Request extends TeaModel {
    /**
     * <p>The ASR model ID. Valid values: </p>
     * <ul>
     * <li>General-Phone-Chinese Mandarin model ID: 7ee372834d2f4cc7ac0d0ab2d0ae1aac </li>
     * <li>General-Phone-Chinese Cantonese model ID: 9b4afe3d224e4fa3bf963697113e2f77 </li>
     * <li>General-Phone-Regional Accent model ID: 3655a6cb94764145a1f9a38a3c3b3b4b.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>7ee372834d2f4cc7ac0d0ab2d0ae1aac</p>
     */
    @NameInMap("AsrModelId")
    public String asrModelId;

    /**
     * <p>The audio prompt code.</p>
     * <ul>
     * <li>GCallX_Gpre: the audio prompt code played to the caller before the call is connected when a number in group G calls number X.</li>
     * <li>GCallX_Gin: the audio prompt code played to the caller after the call is connected when a number in group G calls number X.</li>
     * <li>GCallX_Bin: the audio prompt code played to user B after the call is connected when a number in group G calls number X.</li>
     * <li>BCallX_Bpre: the audio prompt code played to user B before the call is connected when user B calls number X.</li>
     * <li>BCallX_Gin: the audio prompt code played to the callee after the call is connected when number X is called.</li>
     * <li>BCallX_Bin: the audio prompt code played to user B after the call is connected when user B calls number X.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     * &quot;GCallX_Gpre&quot;:&quot;185&quot;
     * }</p>
     */
    @NameInMap("Audio")
    public String audio;

    /**
     * <p>The one-way call restriction logic. Valid values:</p>
     * <ul>
     * <li>CONTROL_BX_DISABLE: number B cannot call number X.</li>
     * <li>CONTROL_GX_DISABLE: numbers in number group G cannot call number X.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CONTROL_AX_DISABLE</p>
     */
    @NameInMap("CallRestrict")
    public String callRestrict;

    /**
     * <p>The sequential ringing duration. Unit: seconds. Valid values: 5 to 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CallTimeout")
    public Long callTimeout;

    /**
     * <p>Phone number A.
     * The DefaultA number for the GXB private number.</p>
     * <blockquote>
     * <p>Note
     * The callback mode can be configured at the number pool level. When the callback mode is set to default, this field takes effect. When user B calls number X, the call is forwarded to this A number by default. If number A is not configured, the call cannot be connected.
     * To update number A, call the number binding modification operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>138****0000</p>
     */
    @NameInMap("DefaultA")
    public String defaultA;

    /**
     * <p>The DTMF key configuration, used when setting up AXB intermediate number binding. The following items can be configured:</p>
     * <ul>
     * <li>endCallIvrPhoneNo: the party to play the audio prompt to, A or B. </li>
     * <li>waitingDtmfTime: the maximum wait time after the first audio prompt is played. Maximum value: 30 seconds. </li>
     * <li>maxLoop dtmf: the maximum number of times the first audio file is played in a loop when the key input does not match. Maximum value: 5. </li>
     * <li>step1File: the name of the first audio file. </li>
     * <li>step2File: the name of the second audio file.</li>
     * <li>validKey: the valid key values, such as 1,2. Only two valid key values can be configured, separated by &quot;,&quot;. </li>
     * <li>waitingEndCall: the carrier hang-up wait time. Maximum value: 10 seconds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;endCallIvrPhoneNo&quot;:&quot;A&quot;,     &quot;waitingDtmfTime&quot;:10,     &quot;maxLoop&quot;:3,     &quot;step1File&quot;:&quot;62ab72f8-4750-4234-859e-e8d678c0cad3-flow_tts_test_1.wav&quot;,     &quot;step2File&quot;:&quot;62ab72f8-4750-4234-859e-e8d678c0cad3-flow_tts_test_2.wav&quot;,     &quot;validKey&quot;:&quot;1,2&quot;,     &quot;waitingEndCall&quot;:2 }</p>
     */
    @NameInMap("DtmfConfig")
    public String dtmfConfig;

    /**
     * <p>The expiration time of the number binding.</p>
     * <blockquote>
     * <p>Note
     * The expiration time must be at least 1 minute later than the current binding time, accurate to the second.
     * You can manually unbind the number at any time before the binding expires.
     * If you unbind a number that is in an active call, the current call is not affected.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-05 12:00:00</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    /**
     * <p>The ID of number group G.</p>
     * <p>Number group G is created by using the &quot;Create G Number Group&quot; message.</p>
     * 
     * <strong>example:</strong>
     * <p>10000*****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <ul>
     * <li><p>The Industrial Internet identifier code, which has a one-to-one mapping with OrderID.</p>
     * </li>
     * <li><p>The code supports characters such as &quot;.&quot; and &quot;/&quot; as domain separators. The code must not contain non-printable characters such as spaces or line breaks.</p>
     * </li>
     * <li><p>This field is required when the business user generates the Industrial Internet identifier code independently.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>700.100.1/12345678</p>
     */
    @NameInMap("IndustrialId")
    public String industrialId;

    /**
     * <p>Specifies whether to enable the ASR service. Valid values: </p>
     * <ul>
     * <li><p>false: Disabled (default value).</p>
     * </li>
     * <li><p>true: Enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedAsr")
    public Boolean needAsr;

    /**
     * <p>Specifies whether the business user requires all call media files generated by this number binding relationship. Valid values:</p>
     * <ul>
     * <li>true: Enable recording.</li>
     * <li>false: Disable recording (default value).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedRecord")
    public Boolean needRecord;

    /**
     * <p>The business order code.</p>
     * <ul>
     * <li><p>This code has a one-to-one mapping with the actual business order and must be unique.</p>
     * </li>
     * <li><p>The code supports characters such as &quot;.&quot; and &quot;/&quot; as domain separators. The code must not contain non-printable characters such as spaces or line breaks.</p>
     * </li>
     * <li><p>This field is required when the business user submits a business order code and the platform generates an Industrial Internet identifier code.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>An external business extension field. This parameter is returned in the call record receipt message.</p>
     * 
     * <strong>example:</strong>
     * <p>abcdef</p>
     */
    @NameInMap("OutId")
    public String outId;

    /**
     * <p>The external business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>abcdefgh</p>
     */
    @NameInMap("OutOrderId")
    public String outOrderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key of the China 700 number pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC10000016848****</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    /**
     * <p>The recording type. Valid values: mp3 and wav.</p>
     * 
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
     * <p>Phone number of user B.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>136****0000</p>
     */
    @NameInMap("TelB")
    public String telB;

    /**
     * <p>The intermediate number X. If the business user does not specify an X number, the platform assigns a number from the number pool as the X number.</p>
     * 
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
