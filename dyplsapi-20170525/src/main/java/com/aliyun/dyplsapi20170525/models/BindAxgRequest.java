// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxgRequest extends TeaModel {
    /**
     * <p>The ID of the ASR model.</p>
     * 
     * <strong>example:</strong>
     * <p>980abddb908f48e8b987cb2cd303****</p>
     */
    @NameInMap("ASRModelId")
    public String ASRModelId;

    /**
     * <p>Specifies whether to enable automatic speech recognition (ASR). Valid values:</p>
     * <ul>
     * <li><strong>False</strong> (default): disables ASR.</li>
     * <li><strong>True</strong>: enables ASR.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("ASRStatus")
    public Boolean ASRStatus;

    /**
     * <p>Re-sets the phone number display logic in the AXG binding. Fixed value: <strong>1</strong>, indicating that phone number X is displayed on both the calling phone and the called phone.</p>
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
     * <p>The status of call restrictions. Valid values:</p>
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
     * <p>Specifies the city to which phone number X to be selected belongs.</p>
     * <ul>
     * <li>If no phone number for the specified city is available in the current phone number pool or this parameter is not specified, a phone number that belongs to another city is randomly selected from the current phone number pool and assigned as phone number X.</li>
     * <li>If Number X Assignment Mode is set to Strict Matching Mode and no phone number meets the requirement, the system displays an allocation error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hangzhou</p>
     */
    @NameInMap("ExpectCity")
    public String expectCity;

    /**
     * <p>The expiration time of the AXG binding. The value is accurate to seconds.</p>
     * <blockquote>
     * <p> The expiration time must be more than 1 minute later than the time when you call this API operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-05 12:00:00</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    /**
     * <p>The group ID in the AXG binding. You can view the group ID by using either of the following methods:</p>
     * <ul>
     * <li>On the <strong>Number Pool Management</strong> page in the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a>, filter AXG privacy numbers and click <strong>Number Group G Management</strong> to view the group IDs of number groups G.****</li>
     * <li>If the <a href="https://help.aliyun.com/document_detail/110250.html">CreateAxgGroup</a> operation is called to create number group G, the value of <strong>GroupId</strong> in the response of the CreateAxgGroup operation is specified as the value of the request parameter <strong>GroupId</strong> of the BindAxg operation.</li>
     * </ul>
     * <blockquote>
     * <p> Number group G must have one or more phone numbers.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Specifies whether to record all calls made by the bound phone numbers.</p>
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
     * <p>abcdef</p>
     */
    @NameInMap("OutOrderId")
    public String outOrderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Phone number A in the AXG binding. Phone number A can be set to a mobile phone number or a landline phone number. The landline phone number must be added with an area code, and no hyphen is required between the area code and the landline phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>139****0000</p>
     */
    @NameInMap("PhoneNoA")
    public String phoneNoA;

    /**
     * <p>Phone number B in the AXG binding. If phone number A is used to call phone number X, the call is forwarded to phone number B. If you need to update phone number B, call the <a href="https://help.aliyun.com/document_detail/110253.html">UpdateSubscription</a> operation.</p>
     * <p>Phone number B can be set to a mobile phone number or a landline phone number. The landline phone number must be added with an area code, and no hyphen is required between the area code and the landline phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>139****0000</p>
     */
    @NameInMap("PhoneNoB")
    public String phoneNoB;

    /**
     * <p>Phone number X in the AXG binding. If you do not specify this parameter, a random phone number is selected from the phone number pool based on the value of the <strong>ExpectCity</strong> parameter and is used as phone number X.</p>
     * <blockquote>
     * <p> Phone number X is the phone number that you purchased in the Phone Number Protection console or by using the <a href="https://help.aliyun.com/document_detail/110266.html">BuySecretNo</a> operation before you bind a phone number. Phone number X is used to forward calls.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>139****0000</p>
     */
    @NameInMap("PhoneNoX")
    public String phoneNoX;

    /**
     * <p>The key of the phone number pool. Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view the key of the phone number pool on the <strong>Number Pool Management</strong> page.</p>
     * 
     * <strong>example:</strong>
     * <p>FC123456</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Sets the ringtone for enterprise Color Ring Back Tone (CRBT) in the AXG binding.</p>
     * <ul>
     * <li>Ringtone setting (with a callback number) when phone number A is used to call phone number X in the AXG binding: AXGRing_AB</li>
     * <li>Ringtone setting (without a callback number) when phone number A is used to call phone number X in the AXG binding: AXGRing_A</li>
     * <li>Ringtone setting when a phone number in number group G is used to call phone number X in the AXG binding: AXGRing_G</li>
     * <li>Enterprise CRBT codes: Enterprise CRBT codes can be queried in the Phone Number Protection console. You can choose <strong>Number Pool Management &gt; Enterprise CRBT Management</strong> to view and manage enterprise CRBT codes. You can also upload, delete, or perform other operations on enterprise CRBT codes.</li>
     * </ul>
     * <blockquote>
     * <p> The bound enterprise CRBTs are preferentially used. If no enterprise CRBT is set or the setting does not take effect, the enterprise CRBTs at the phone number pool level are used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AXGRing_AB&quot;:&quot;100000001&quot;,&quot;AXGRing_A&quot;:&quot;100000002&quot;,&quot;AXGRing_G&quot;:&quot;100000003&quot;}</p>
     */
    @NameInMap("RingConfig")
    public String ringConfig;

    public static BindAxgRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAxgRequest self = new BindAxgRequest();
        return TeaModel.build(map, self);
    }

    public BindAxgRequest setASRModelId(String ASRModelId) {
        this.ASRModelId = ASRModelId;
        return this;
    }
    public String getASRModelId() {
        return this.ASRModelId;
    }

    public BindAxgRequest setASRStatus(Boolean ASRStatus) {
        this.ASRStatus = ASRStatus;
        return this;
    }
    public Boolean getASRStatus() {
        return this.ASRStatus;
    }

    public BindAxgRequest setCallDisplayType(Integer callDisplayType) {
        this.callDisplayType = callDisplayType;
        return this;
    }
    public Integer getCallDisplayType() {
        return this.callDisplayType;
    }

    public BindAxgRequest setCallRestrict(String callRestrict) {
        this.callRestrict = callRestrict;
        return this;
    }
    public String getCallRestrict() {
        return this.callRestrict;
    }

    public BindAxgRequest setExpectCity(String expectCity) {
        this.expectCity = expectCity;
        return this;
    }
    public String getExpectCity() {
        return this.expectCity;
    }

    public BindAxgRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public BindAxgRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public BindAxgRequest setIsRecordingEnabled(Boolean isRecordingEnabled) {
        this.isRecordingEnabled = isRecordingEnabled;
        return this;
    }
    public Boolean getIsRecordingEnabled() {
        return this.isRecordingEnabled;
    }

    public BindAxgRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public BindAxgRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public BindAxgRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindAxgRequest setPhoneNoA(String phoneNoA) {
        this.phoneNoA = phoneNoA;
        return this;
    }
    public String getPhoneNoA() {
        return this.phoneNoA;
    }

    public BindAxgRequest setPhoneNoB(String phoneNoB) {
        this.phoneNoB = phoneNoB;
        return this;
    }
    public String getPhoneNoB() {
        return this.phoneNoB;
    }

    public BindAxgRequest setPhoneNoX(String phoneNoX) {
        this.phoneNoX = phoneNoX;
        return this;
    }
    public String getPhoneNoX() {
        return this.phoneNoX;
    }

    public BindAxgRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public BindAxgRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindAxgRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BindAxgRequest setRingConfig(String ringConfig) {
        this.ringConfig = ringConfig;
        return this;
    }
    public String getRingConfig() {
        return this.ringConfig;
    }

}
