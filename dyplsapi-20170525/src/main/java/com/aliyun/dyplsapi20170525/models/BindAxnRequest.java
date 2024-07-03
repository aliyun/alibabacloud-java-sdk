// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxnRequest extends TeaModel {
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
     * <p>true</p>
     */
    @NameInMap("ASRStatus")
    public Boolean ASRStatus;

    /**
     * <p>Re-sets the phone number display logic in the AXN binding. Fixed value: <strong>1</strong>, indicating that phone number X is displayed on both the calling phone and the called phone.</p>
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
     * <p>The status of one-way call restrictions. Valid values:</p>
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
     * <p>The maximum ringing duration for each number in sequential ringing. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CallTimeout")
    public Integer callTimeout;

    /**
     * <p>Specifies the city to which phone number X to be selected belongs.</p>
     * <ul>
     * <li>If no phone number for the specified city is available in the current phone number pool or this parameter is not specified, a phone number that belongs to another city is randomly selected from the current phone number pool and assigned as phone number X.</li>
     * <li>If <strong>Number X Assignment Mode</strong> is set to <strong>Strict Matching Mode</strong> and no phone number meets the requirement, the system displays an allocation error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hangzhou</p>
     */
    @NameInMap("ExpectCity")
    public String expectCity;

    /**
     * <p>The expiration time of the AXN binding. Unit: seconds.</p>
     * <blockquote>
     * <p> The expiration time must be more than 60 seconds later than the time when you call this API operation.</p>
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
     * <p>The type of the phone number.</p>
     * <blockquote>
     * <p> This parameter is applicable to the key accounts of Alibaba Cloud. This parameter can be ignored for Alibaba Cloud users.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AXB_170</p>
     */
    @NameInMap("NoType")
    public String noType;

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
     * <p>Phone number A in the AXN binding. Phone number A can be set to a mobile phone number or a landline phone number. The landline phone number must be added with an area code, and no hyphen is required between the area code and the landline phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>139****0000</p>
     */
    @NameInMap("PhoneNoA")
    public String phoneNoA;

    /**
     * <p>Phone number B in the AXN binding. If phone number A is used to call phone number X, the call is forwarded to phone number B. Phone number B can be set to a mobile phone number or a landline phone number. The landline phone number must be added with an area code, and no hyphen is required between the area code and the landline phone number.</p>
     * <blockquote>
     * <p> If phone number B is not specified in the AXN binding, the system automatically generates a nonexistent number. If phone number A is used to call phone number X, the nonexistent number is returned. If you need to update phone number B, call the <a href="https://help.aliyun.com/document_detail/110253.html">UpdateSubscription</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>138****0000</p>
     */
    @NameInMap("PhoneNoB")
    public String phoneNoB;

    /**
     * <p>Phone number X in the AXN binding. Phone number X is the phone number that you purchased in the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> or by using the <a href="https://help.aliyun.com/document_detail/110266.html">BuySecretNo</a> operation before you bind a phone number. Phone number X is used to forward calls.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, a random phone number is selected from the phone number pool based on the value of the ExpectCity parameter and is used as phone number X.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>139****0000</p>
     */
    @NameInMap("PhoneNoX")
    public String phoneNoX;

    /**
     * <p>The key of the phone number pool. Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console </a>and view the key of the phone number pool on the <strong>Number Pool Management</strong> page.</p>
     * 
     * <strong>example:</strong>
     * <p>FC2256****</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Sets the ringtone code for enterprise Color Ring Back Tone (CRBT) in the AXN extension binding.</p>
     * <ul>
     * <li>Ringtone setting (with a callback number) when phone number A is used to call phone number X in the AXN extension binding: AXNRing_AB</li>
     * <li>Ringtone setting (without a callback number) when phone number A is used to call phone number X in the AXN extension binding: AXNRing_A</li>
     * <li>Ringtone setting when an N-side number is used to call phone number X in the AXN extension binding: AXNRing_N</li>
     * </ul>
     * <p>Enterprise CRBT codes: Enterprise CRBT codes can be queried in the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a>. You can choose <strong>Number Pool Management &gt; Enterprise CRBT Management</strong> to view enterprise CRBT codes. You can also upload, delete, or perform other operations on enterprise CRBT codes.</p>
     * <blockquote>
     * <p> The bound enterprise CRBTs are preferentially used. If no enterprise CRBT is set or the setting does not take effect, the enterprise CRBTs at the phone number pool level are used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AXNRing_N&quot;:&quot;100000001&quot;,&quot;AXNRing_A&quot;:&quot;100000001&quot;}</p>
     */
    @NameInMap("RingConfig")
    public String ringConfig;

    public static BindAxnRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAxnRequest self = new BindAxnRequest();
        return TeaModel.build(map, self);
    }

    public BindAxnRequest setASRModelId(String ASRModelId) {
        this.ASRModelId = ASRModelId;
        return this;
    }
    public String getASRModelId() {
        return this.ASRModelId;
    }

    public BindAxnRequest setASRStatus(Boolean ASRStatus) {
        this.ASRStatus = ASRStatus;
        return this;
    }
    public Boolean getASRStatus() {
        return this.ASRStatus;
    }

    public BindAxnRequest setCallDisplayType(Integer callDisplayType) {
        this.callDisplayType = callDisplayType;
        return this;
    }
    public Integer getCallDisplayType() {
        return this.callDisplayType;
    }

    public BindAxnRequest setCallRestrict(String callRestrict) {
        this.callRestrict = callRestrict;
        return this;
    }
    public String getCallRestrict() {
        return this.callRestrict;
    }

    public BindAxnRequest setCallTimeout(Integer callTimeout) {
        this.callTimeout = callTimeout;
        return this;
    }
    public Integer getCallTimeout() {
        return this.callTimeout;
    }

    public BindAxnRequest setExpectCity(String expectCity) {
        this.expectCity = expectCity;
        return this;
    }
    public String getExpectCity() {
        return this.expectCity;
    }

    public BindAxnRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public BindAxnRequest setIsRecordingEnabled(Boolean isRecordingEnabled) {
        this.isRecordingEnabled = isRecordingEnabled;
        return this;
    }
    public Boolean getIsRecordingEnabled() {
        return this.isRecordingEnabled;
    }

    public BindAxnRequest setNoType(String noType) {
        this.noType = noType;
        return this;
    }
    public String getNoType() {
        return this.noType;
    }

    public BindAxnRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public BindAxnRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public BindAxnRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindAxnRequest setPhoneNoA(String phoneNoA) {
        this.phoneNoA = phoneNoA;
        return this;
    }
    public String getPhoneNoA() {
        return this.phoneNoA;
    }

    public BindAxnRequest setPhoneNoB(String phoneNoB) {
        this.phoneNoB = phoneNoB;
        return this;
    }
    public String getPhoneNoB() {
        return this.phoneNoB;
    }

    public BindAxnRequest setPhoneNoX(String phoneNoX) {
        this.phoneNoX = phoneNoX;
        return this;
    }
    public String getPhoneNoX() {
        return this.phoneNoX;
    }

    public BindAxnRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public BindAxnRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindAxnRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BindAxnRequest setRingConfig(String ringConfig) {
        this.ringConfig = ringConfig;
        return this;
    }
    public String getRingConfig() {
        return this.ringConfig;
    }

}
