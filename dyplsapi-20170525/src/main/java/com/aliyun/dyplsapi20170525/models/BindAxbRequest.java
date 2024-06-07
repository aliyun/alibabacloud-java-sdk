// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxbRequest extends TeaModel {
    /**
     * <p>The ID of the ASR model. On the [Automatic Speech Recognition (ASR) Model Management](https://dyplsnext.console.aliyun.com/?spm=5176.12818093.categories-n-products.ddypls.22e616d0a0tEFC#/asr) page, you can view the ID of the ASR model.</p>
     */
    @NameInMap("ASRModelId")
    public String ASRModelId;

    /**
     * <p>Specifies whether to enable automatic speech recognition (ASR). Valid values:</p>
     * <br>
     * <p>*   **false** (default): disables ASR.</p>
     * <p>*   **true**: enables ASR.</p>
     */
    @NameInMap("ASRStatus")
    public Boolean ASRStatus;

    /**
     * <p>Re-sets the phone number display logic in the AXB binding. Fixed value: **1**, indicating that phone number X is displayed on both the calling phone and the called phone.</p>
     * <br>
     * <p>>  Due to the regulatory restrictions imposed by carriers, the setting to display real phone numbers during calls does not take effect.</p>
     */
    @NameInMap("CallDisplayType")
    public Integer callDisplayType;

    /**
     * <p>The status of the one-way call restriction. Valid values:</p>
     * <br>
     * <p>*   **CONTROL_AX_DISABLE**: Phone number A cannot be used to call phone number X.</p>
     * <p>*   **CONTROL_BX_DISABLE**: Phone number B cannot be used to call phone number X.</p>
     */
    @NameInMap("CallRestrict")
    public String callRestrict;

    /**
     * <p>The maximum ringing duration for each number in sequential ringing. Unit: seconds. The value ranges from 5 to 20.</p>
     */
    @NameInMap("CallTimeout")
    public Integer callTimeout;

    /**
     * <p>Specifies the dual tone multiple frequency (DTMF) key configuration in the AXB binding. The following content can be configured:</p>
     * <br>
     * <p>*   endCallIvrPhoneNo: for whom the audio is played, user A or user B.</p>
     * <p>*   waitingDtmfTime: the maximum waiting time after the first audio is played. The maximum waiting time is 30 seconds.</p>
     * <p>*   maxLoop: the maximum number of loop playback times of the first audio if the DTMF key is not matched. The maximum number of loop playback times is 5.</p>
     * <p>*   step1File: the name of the first audio.</p>
     * <p>*   step2File: the name of the second audio.</p>
     * <p>*   validKey: the valid key values, such as 1,2. Only two valid key values can be set, and the key values are separated by a comma (,).</p>
     * <p>*   waitingEndCall: The waiting duration to hang up a call. The waiting duration is allowed by a carrier. The maximum waiting duration is 10 seconds.</p>
     */
    @NameInMap("DtmfConfig")
    public String dtmfConfig;

    /**
     * <p>Specifies the city to which phone number X to be selected belongs.</p>
     * <br>
     * <p>*   If no phone number for the specified city is available in the current phone number pool or this parameter is not specified, a phone number that belongs to another city is randomly selected from the current phone number pool and assigned as phone number X.</p>
     * <p>*   If**Number X Assignment Mode** is set to **Strict Matching Mode** and no phone number meets the requirement, the system displays an allocation error.</p>
     */
    @NameInMap("ExpectCity")
    public String expectCity;

    /**
     * <p>The expiration time of the AXB binding.</p>
     * <br>
     * <p>>  The expiration time must be more than 1 minute later than the time when you call this API operation.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    /**
     * <p>Specifies whether to record all calls made by the bound phone numbers. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("IsRecordingEnabled")
    public Boolean isRecordingEnabled;

    /**
     * <p>The extension field for the external business. This parameter is returned in a call record receipt.</p>
     */
    @NameInMap("OutId")
    public String outId;

    /**
     * <p>The ID of the external business.</p>
     */
    @NameInMap("OutOrderId")
    public String outOrderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Phone number A in the AXB binding.</p>
     * <br>
     * <p>Phone number A can be set to a mobile phone number or a landline phone number. The landline phone number must be added with an area code, and no hyphen is required between the area code and the landline phone number.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PhoneNoA")
    public String phoneNoA;

    /**
     * <p>Phone number B in the AXB binding. If phone number A is used to call phone number X, the call is forwarded to phone number B. Phone number B can be set to a mobile phone number or a landline phone number. The landline phone number must be added with an area code, and no hyphen is required between the area code and the landline phone number.</p>
     * <br>
     * <p>>  If you need to update phone number B, call the [UpdateSubscription](https://help.aliyun.com/document_detail/110253.html) operation.</p>
     */
    @NameInMap("PhoneNoB")
    public String phoneNoB;

    /**
     * <p>Phone number X in the AXB binding.</p>
     * <br>
     * <p>Phone number X is the phone number that you purchased in the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) or by using the [BuySecretNo](https://help.aliyun.com/document_detail/110266.html) operation before you bind a phone number. Phone number X is used to forward calls.</p>
     * <br>
     * <p>If you do not specify this parameter, a random phone number is selected from the phone number pool based on the value of the ExpectCity parameter and is used as phone number X.</p>
     */
    @NameInMap("PhoneNoX")
    public String phoneNoX;

    /**
     * <p>The key of the phone number pool.</p>
     * <br>
     * <p>Log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) and view the key of the phone number pool on the **Number Pool Management** page.</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Sets the ringtone code for enterprise Color Ring Back Tone (CRBT) in the AXB binding.</p>
     * <br>
     * <p>*   Ringtone setting when phone number A is used to call phone number X in the AXB binding: AXBRing_A</p>
     * <p>*   Ringtone setting when phone number B is used to call phone number X in the AXB binding: AXBRing_B</p>
     * <br>
     * <p>Enterprise CRBT codes: Enterprise CRBT codes can be queried in the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account). You can choose **Number Pool Management** > **Enterprise CRBT Management** to view enterprise CRBT codes. You can also upload, delete, or perform other operations on enterprise CRBT codes.</p>
     * <br>
     * <p>>  The bound enterprise CRBTs are preferentially used. If no enterprise CRBT is set or the setting does not take effect, the enterprise CRBTs at the phone number pool level are used.</p>
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
