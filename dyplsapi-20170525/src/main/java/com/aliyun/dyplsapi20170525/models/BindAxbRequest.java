// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxbRequest extends TeaModel {
    /**
     * <p>The ID of the ASR model. On the <a href="https://dyplsnext.console.aliyun.com/?spm=5176.12818093.categories-n-products.ddypls.22e616d0a0tEFC#/asr">Automatic Speech Recognition (ASR) Model Management</a> page, you can view the ID of the ASR model.</p>
     * 
     * <strong>example:</strong>
     * <p>7ee372834d2f4cc7ac0d0ab2d0ae1aac</p>
     */
    @NameInMap("ASRModelId")
    public String ASRModelId;

    /**
     * <p>Specifies whether to enable automatic speech recognition (ASR). Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): disables ASR.</li>
     * <li><strong>true</strong>: enables ASR.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ASRStatus")
    public Boolean ASRStatus;

    /**
     * <p>Re-sets the phone number display logic in the AXB binding. Fixed value: <strong>1</strong>, indicating that phone number X is displayed on both the calling phone and the called phone.</p>
     * <blockquote>
     * <p> Due to the regulatory restrictions imposed by carriers, the setting to display real phone numbers during calls does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CallDisplayType")
    public Integer callDisplayType;

    /**
     * <p>The status of the one-way call restriction. Valid values:</p>
     * <ul>
     * <li><strong>CONTROL_AX_DISABLE</strong>: Phone number A cannot be used to call phone number X.</li>
     * <li><strong>CONTROL_BX_DISABLE</strong>: Phone number B cannot be used to call phone number X.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CONTROL_AX_DISABLE</p>
     */
    @NameInMap("CallRestrict")
    public String callRestrict;

    /**
     * <p>The maximum ringing duration for each number in sequential ringing. Unit: seconds. The value ranges from 5 to 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CallTimeout")
    public Integer callTimeout;

    /**
     * <p>Specifies the dual tone multiple frequency (DTMF) key configuration in the AXB binding. The following content can be configured:</p>
     * <ul>
     * <li>endCallIvrPhoneNo: for whom the audio is played, user A or user B.</li>
     * <li>waitingDtmfTime: the maximum waiting time after the first audio is played. The maximum waiting time is 30 seconds.</li>
     * <li>maxLoop: the maximum number of loop playback times of the first audio if the DTMF key is not matched. The maximum number of loop playback times is 5.</li>
     * <li>step1File: the name of the first audio.</li>
     * <li>step2File: the name of the second audio.</li>
     * <li>validKey: the valid key values, such as 1,2. Only two valid key values can be set, and the key values are separated by a comma (,).</li>
     * <li>waitingEndCall: The waiting duration to hang up a call. The waiting duration is allowed by a carrier. The maximum waiting duration is 10 seconds.</li>
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
     * <p>Specifies the city to which phone number X to be selected belongs.</p>
     * <ul>
     * <li>If no phone number for the specified city is available in the current phone number pool or this parameter is not specified, a phone number that belongs to another city is randomly selected from the current phone number pool and assigned as phone number X.</li>
     * <li>If<strong>Number X Assignment Mode</strong> is set to <strong>Strict Matching Mode</strong> and no phone number meets the requirement, the system displays an allocation error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hangzhou</p>
     */
    @NameInMap("ExpectCity")
    public String expectCity;

    /**
     * <p>The expiration time of the AXB binding.</p>
     * <blockquote>
     * <p> The expiration time must be more than 1 minute later than the time when you call this API operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-05 12:00:00</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    /**
     * <p>Specifies whether to record all calls made by the bound phone numbers. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsRecordingEnabled")
    public Boolean isRecordingEnabled;

    /**
     * <p>The extension field for the external business. This parameter is returned in a call record receipt.</p>
     * 
     * <strong>example:</strong>
     * <p>abcdef</p>
     */
    @NameInMap("OutId")
    public String outId;

    /**
     * <p>The ID of the external business.</p>
     * 
     * <strong>example:</strong>
     * <p>34553330****</p>
     */
    @NameInMap("OutOrderId")
    public String outOrderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Phone number A in the AXB binding.</p>
     * <p>Phone number A can be set to a mobile phone number or a landline phone number. The landline phone number must be added with an area code, and no hyphen is required between the area code and the landline phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>139****0000</p>
     */
    @NameInMap("PhoneNoA")
    public String phoneNoA;

    /**
     * <p>Phone number B in the AXB binding. If phone number A is used to call phone number X, the call is forwarded to phone number B. Phone number B can be set to a mobile phone number or a landline phone number. The landline phone number must be added with an area code, and no hyphen is required between the area code and the landline phone number.</p>
     * <blockquote>
     * <p> If you need to update phone number B, call the <a href="https://help.aliyun.com/document_detail/110253.html">UpdateSubscription</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>139****0000</p>
     */
    @NameInMap("PhoneNoB")
    public String phoneNoB;

    /**
     * <p>Phone number X in the AXB binding.</p>
     * <p>Phone number X is the phone number that you purchased in the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> or by using the <a href="https://help.aliyun.com/document_detail/110266.html">BuySecretNo</a> operation before you bind a phone number. Phone number X is used to forward calls.</p>
     * <p>If you do not specify this parameter, a random phone number is selected from the phone number pool based on the value of the ExpectCity parameter and is used as phone number X.</p>
     * 
     * <strong>example:</strong>
     * <p>139****0000</p>
     */
    @NameInMap("PhoneNoX")
    public String phoneNoX;

    /**
     * <p>The key of the phone number pool.</p>
     * <p>Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view the key of the phone number pool on the <strong>Number Pool Management</strong> page.</p>
     * 
     * <strong>example:</strong>
     * <p>FC5526*****</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Sets the ringtone code for enterprise Color Ring Back Tone (CRBT) in the AXB binding.</p>
     * <ul>
     * <li>Ringtone setting when phone number A is used to call phone number X in the AXB binding: AXBRing_A</li>
     * <li>Ringtone setting when phone number B is used to call phone number X in the AXB binding: AXBRing_B</li>
     * </ul>
     * <p>Enterprise CRBT codes: Enterprise CRBT codes can be queried in the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a>. You can choose <strong>Number Pool Management</strong> &gt; <strong>Enterprise CRBT Management</strong> to view enterprise CRBT codes. You can also upload, delete, or perform other operations on enterprise CRBT codes.</p>
     * <blockquote>
     * <p> The bound enterprise CRBTs are preferentially used. If no enterprise CRBT is set or the setting does not take effect, the enterprise CRBTs at the phone number pool level are used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AXBRing_B&quot;:&quot;1000<strong><strong>1&quot;,&quot;AXBRing_A&quot;:&quot;1000</strong></strong>1&quot;}</p>
     */
    @NameInMap("RingConfig")
    public String ringConfig;

    public static BindAxbRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAxbRequest self = new BindAxbRequest();
        return TeaModel.build(map, self);
    }

    public BindAxbRequest setASRModelId(String ASRModelId) {
        this.ASRModelId = ASRModelId;
        return this;
    }
    public String getASRModelId() {
        return this.ASRModelId;
    }

    public BindAxbRequest setASRStatus(Boolean ASRStatus) {
        this.ASRStatus = ASRStatus;
        return this;
    }
    public Boolean getASRStatus() {
        return this.ASRStatus;
    }

    public BindAxbRequest setCallDisplayType(Integer callDisplayType) {
        this.callDisplayType = callDisplayType;
        return this;
    }
    public Integer getCallDisplayType() {
        return this.callDisplayType;
    }

    public BindAxbRequest setCallRestrict(String callRestrict) {
        this.callRestrict = callRestrict;
        return this;
    }
    public String getCallRestrict() {
        return this.callRestrict;
    }

    public BindAxbRequest setCallTimeout(Integer callTimeout) {
        this.callTimeout = callTimeout;
        return this;
    }
    public Integer getCallTimeout() {
        return this.callTimeout;
    }

    public BindAxbRequest setDtmfConfig(String dtmfConfig) {
        this.dtmfConfig = dtmfConfig;
        return this;
    }
    public String getDtmfConfig() {
        return this.dtmfConfig;
    }

    public BindAxbRequest setExpectCity(String expectCity) {
        this.expectCity = expectCity;
        return this;
    }
    public String getExpectCity() {
        return this.expectCity;
    }

    public BindAxbRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public BindAxbRequest setIsRecordingEnabled(Boolean isRecordingEnabled) {
        this.isRecordingEnabled = isRecordingEnabled;
        return this;
    }
    public Boolean getIsRecordingEnabled() {
        return this.isRecordingEnabled;
    }

    public BindAxbRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public BindAxbRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public BindAxbRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindAxbRequest setPhoneNoA(String phoneNoA) {
        this.phoneNoA = phoneNoA;
        return this;
    }
    public String getPhoneNoA() {
        return this.phoneNoA;
    }

    public BindAxbRequest setPhoneNoB(String phoneNoB) {
        this.phoneNoB = phoneNoB;
        return this;
    }
    public String getPhoneNoB() {
        return this.phoneNoB;
    }

    public BindAxbRequest setPhoneNoX(String phoneNoX) {
        this.phoneNoX = phoneNoX;
        return this;
    }
    public String getPhoneNoX() {
        return this.phoneNoX;
    }

    public BindAxbRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public BindAxbRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindAxbRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BindAxbRequest setRingConfig(String ringConfig) {
        this.ringConfig = ringConfig;
        return this;
    }
    public String getRingConfig() {
        return this.ringConfig;
    }

}
