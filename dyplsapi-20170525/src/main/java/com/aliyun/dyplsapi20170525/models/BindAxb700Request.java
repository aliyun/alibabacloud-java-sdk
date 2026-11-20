// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxb700Request extends TeaModel {
    /**
     * <p>Optional. The ASR model ID. Valid values:</p>
     * <ul>
     * <li>General-Phone-Mandarin model ID: 7ee372834d2f4cc7ac0d0ab2d0ae1aac</li>
     * <li>General-Phone-Cantonese model ID: 9b4afe3d224e4fa3bf963697113e2f77</li>
     * <li>General-Phone-Regional Accent model ID: 3655a6cb94764145a1f9a38a3c3b3b4b.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>7ee372834d2f4cc7ac0d0ab2d0ae1aac</p>
     */
    @NameInMap("AsrModelId")
    public String asrModelId;

    /**
     * <p>The audio prompt encoding.</p>
     * <ul>
     * <li>ACallX_Apre: The audio prompt encoding played to A before the call is connected when A calls X.</li>
     * <li>ACallX_Ain: The audio prompt encoding played to A after the call is connected when A calls X.</li>
     * <li>ACallX_Bin: The audio prompt encoding played to B after the call is connected when A calls X.</li>
     * <li>BCallX_Bpre: The audio prompt encoding played to B before the call is connected when B calls X.</li>
     * <li>BCallX_Ain: The audio prompt encoding played to A after the call is connected when B calls X.</li>
     * <li>BCallX_Bin: The audio prompt encoding played to B after the call is connected when B calls X.</li>
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
     * <p>The one-way call restriction logic. Valid values:</p>
     * <ul>
     * <li><p>CONTROL_AX_DISABLE: Number A cannot call number X.</p>
     * </li>
     * <li><p>CONTROL_BX_DISABLE: Number B cannot call number X.</p>
     * </li>
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
     * <p>Optional. The DTMF key configuration for 700AXB number binding. The following items can be configured:</p>
     * <ul>
     * <li>endCallIvrPhoneNo: The audio playback target, A or B.</li>
     * <li>waitingDtmfTime: The maximum wait time after the first audio file is played. Maximum value: 30 seconds.</li>
     * <li>maxLoop dtmf: The maximum number of times the first audio file is replayed when a key press does not match. Maximum value: 5.</li>
     * <li>step1File: The name of the first audio file.</li>
     * <li>step2File: The name of the second audio file.</li>
     * <li>validKey: The valid key values, such as 1,2. Only two valid key values can be configured, separated by commas (,).</li>
     * <li>waitingEndCall: The carrier hang-up wait time. Maximum value: 10 seconds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;endCallIvrPhoneNo&quot;:&quot;A&quot;,
     *     &quot;waitingDtmfTime&quot;:10,
     *     &quot;maxLoop&quot;:3,
     *     &quot;step1File&quot;:&quot;62ab72f8-4750-4234-859e-e8d678c0cad3-flow_tts_test_1.wav&quot;,
     *     &quot;step2File&quot;:&quot;62ab72f8-4750-4234-859e-e8d678c0cad3-flow_tts_test_2.wav&quot;,
     *     &quot;validKey&quot;:&quot;1,2&quot;,
     *     &quot;waitingEndCall&quot;:2
     * }</p>
     */
    @NameInMap("DtmfConfig")
    public String dtmfConfig;

    /**
     * <p>The expiration time of the number binding.</p>
     * <blockquote>
     * <ul>
     * <li>The expiration time must be at least 1 minute later than the current binding time, accurate to the second.</li>
     * <li>You can manually unbind the number at any time before the binding expires.</li>
     * <li>If you unbind a number that is in an active call, the current call is not affected.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-05 12:00:00</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    /**
     * <p>The industrial Internet identifier code, which has a one-to-one mapping with OrderId.</p>
     * <p>The code supports characters such as &quot;.&quot; and &quot;/&quot; as domain separators. The code must not contain non-printable characters such as spaces or line breaks.</p>
     * <p>This field is required when the caller generates the industrial Internet identifier code independently.</p>
     * <blockquote>
     * <ul>
     * <li>Either OrderId or IndustrialId is required depending on the business scenario.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>700.100.1/12345678</p>
     */
    @NameInMap("IndustrialId")
    public String industrialId;

    /**
     * <p>Specifies whether to enable the ASR service. Valid values:</p>
     * <ul>
     * <li><p>false: Disable (default).</p>
     * </li>
     * <li><p>true: Enable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedAsr")
    public Boolean needAsr;

    /**
     * <p>Specifies whether call recording files are required for all calls made through this number binding. Valid values:</p>
     * <ul>
     * <li><p>true: Enable recording.</p>
     * </li>
     * <li><p>false: Disable recording (default).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
     * <li><p>This field is required when the caller submits a business order code and the platform generates an industrial Internet identifier code.</p>
     * <blockquote>
     * <ul>
     * <li>Either OrderId or IndustrialId is required depending on the business scenario.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
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
     * <p>FC2258****</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    /**
     * <p>The recording file format. Valid values: mp3 and wav.</p>
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
     * <p>The phone number of user A.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>139****0000</p>
     */
    @NameInMap("TelA")
    public String telA;

    /**
     * <p>The phone number of user B.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>136****0000</p>
     */
    @NameInMap("TelB")
    public String telB;

    /**
     * <p>Optional. The intermediate number X.</p>
     * <blockquote>
     * <ul>
     * <li>If the caller does not specify an X number,</li>
     * <li>the platform assigns a number from the number pool as the X number.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>700********0000</p>
     */
    @NameInMap("TelX")
    public String telX;

    public static BindAxb700Request build(java.util.Map<String, ?> map) throws Exception {
        BindAxb700Request self = new BindAxb700Request();
        return TeaModel.build(map, self);
    }

    public BindAxb700Request setAsrModelId(String asrModelId) {
        this.asrModelId = asrModelId;
        return this;
    }
    public String getAsrModelId() {
        return this.asrModelId;
    }

    public BindAxb700Request setAudio(String audio) {
        this.audio = audio;
        return this;
    }
    public String getAudio() {
        return this.audio;
    }

    public BindAxb700Request setCallRestrict(String callRestrict) {
        this.callRestrict = callRestrict;
        return this;
    }
    public String getCallRestrict() {
        return this.callRestrict;
    }

    public BindAxb700Request setCallTimeout(Long callTimeout) {
        this.callTimeout = callTimeout;
        return this;
    }
    public Long getCallTimeout() {
        return this.callTimeout;
    }

    public BindAxb700Request setDtmfConfig(String dtmfConfig) {
        this.dtmfConfig = dtmfConfig;
        return this;
    }
    public String getDtmfConfig() {
        return this.dtmfConfig;
    }

    public BindAxb700Request setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public BindAxb700Request setIndustrialId(String industrialId) {
        this.industrialId = industrialId;
        return this;
    }
    public String getIndustrialId() {
        return this.industrialId;
    }

    public BindAxb700Request setNeedAsr(Boolean needAsr) {
        this.needAsr = needAsr;
        return this;
    }
    public Boolean getNeedAsr() {
        return this.needAsr;
    }

    public BindAxb700Request setNeedRecord(Boolean needRecord) {
        this.needRecord = needRecord;
        return this;
    }
    public Boolean getNeedRecord() {
        return this.needRecord;
    }

    public BindAxb700Request setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public BindAxb700Request setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public BindAxb700Request setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public BindAxb700Request setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindAxb700Request setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public BindAxb700Request setRecType(String recType) {
        this.recType = recType;
        return this;
    }
    public String getRecType() {
        return this.recType;
    }

    public BindAxb700Request setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindAxb700Request setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BindAxb700Request setTelA(String telA) {
        this.telA = telA;
        return this;
    }
    public String getTelA() {
        return this.telA;
    }

    public BindAxb700Request setTelB(String telB) {
        this.telB = telB;
        return this;
    }
    public String getTelB() {
        return this.telB;
    }

    public BindAxb700Request setTelX(String telX) {
        this.telX = telX;
        return this;
    }
    public String getTelX() {
        return this.telX;
    }

}
