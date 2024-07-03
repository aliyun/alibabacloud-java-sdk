// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateSubscriptionRequest extends TeaModel {
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
     * <p>Re-sets the phone number display logic in the phone number binding. Fixed value: <strong>1</strong>, indicating that phone number X is displayed on both the calling phone and the called phone.</p>
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
     * <p>One-way call restrictions. Valid values:</p>
     * <ul>
     * <li><strong>CONTROL_AX_DISABLE</strong>: Phone number A cannot be used to call phone number X.</li>
     * <li><strong>CONTROL_BX_DISABLE</strong>: Phone number B cannot be used to call phone number X.</li>
     * <li><strong>CONTROL_CLEAR_DISABLE</strong>: The call restrictions are cleared.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required when <strong>OperateType</strong> is set to <strong>updateCallRestrict</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CONTROL_BX_DISABLE</p>
     */
    @NameInMap("CallRestrict")
    public String callRestrict;

    /**
     * <p>Re-sets the expiration time of the phone number binding.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is required when <strong>OperateType</strong> is set to <strong>updateExpire</strong>.</p>
     * </li>
     * <li><p>The expiration time must be more than 1 minute later than the time when you call this API operation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2019-09-05 12:00:00</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    /**
     * <p>The ID of number group G in the phone number binding.</p>
     * <blockquote>
     * <p> This parameter is required when <strong>OperateType</strong> is set to <strong>updateAxgGroup</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Re-sets the recording status in the phone number binding.</p>
     * <blockquote>
     * <p> This parameter does not have a default value. If you do not specify this parameter, the value of the corresponding field is not updated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsRecordingEnabled")
    public Boolean isRecordingEnabled;

    /**
     * <p>The operation to modify the phone number binding. Valid values:</p>
     * <ul>
     * <li><strong>updateNoA</strong>: modifies phone number A.</li>
     * <li><strong>updateNoB</strong>: modifies phone number B.</li>
     * <li><strong>updateExpire</strong>: modifies the validity period of the binding.</li>
     * <li><strong>updateAxgGroup</strong>: modifies number group G.</li>
     * <li><strong>updateCallRestrict</strong>: modifies one-way call restrictions.</li>
     * <li><strong>updateCallDisplayType</strong>: updates the number display logic for calls.</li>
     * <li><strong>updateOutId</strong>: updates the value of the OutId parameter.</li>
     * <li><strong>updateIsRecordingEnabled</strong>: updates the status of the recording feature in the binding.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>updateNoA</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>Re-sets the value of the OutId parameter in the phone number binding.</p>
     * 
     * <strong>example:</strong>
     * <p>abcdef</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Phone number A in the phone number binding.</p>
     * <blockquote>
     * <p> This parameter is required when <strong>OperateType</strong> is set to <strong>updateNoA</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1390000****</p>
     */
    @NameInMap("PhoneNoA")
    public String phoneNoA;

    /**
     * <p>Phone number B in the phone number binding.</p>
     * <blockquote>
     * <p> This parameter is required when <strong>OperateType</strong> is set to <strong>updateNoB</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1390000****</p>
     */
    @NameInMap("PhoneNoB")
    public String phoneNoB;

    /**
     * <p>Phone number X in the phone number binding.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1390000****</p>
     */
    @NameInMap("PhoneNoX")
    public String phoneNoX;

    /**
     * <p>The key of the phone number pool.</p>
     * <p>Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view the key of the phone number pool on the <strong>Number Pool Management</strong> page.</p>
     * <blockquote>
     * <p> This parameter is required when <strong>ProductType</strong> is left empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>FC122356****</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    /**
     * <p>The product type. Valid values:</p>
     * <ul>
     * <li><strong>AXB_170</strong></li>
     * <li><strong>AXN_170</strong></li>
     * <li><strong>AXN_95</strong></li>
     * <li><strong>AXN_EXTENSION_REUSE</strong></li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is applicable to the original key accounts of Alibaba Cloud. This parameter can be ignored for Alibaba Cloud users.</p>
     * </li>
     * <li><p>This parameter is required when <strong>PoolKey</strong> is left empty.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AXB_170</p>
     */
    @NameInMap("ProductType")
    public String productType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Updates the ringtone code for enterprise Color Ring Back Tone (CRBT) in the phone number binding.</p>
     * <p>AXB product:</p>
     * <ul>
     * <li>Ringtone setting when phone number A is used to call phone number X in the AXB binding: AXBRing_A</li>
     * <li>Ringtone setting when phone number B is used to call phone number X in the AXB binding: AXBRing_B</li>
     * </ul>
     * <p>AXN product:</p>
     * <ul>
     * <li>Ringtone setting (with a callback number) when phone number A is used to call phone number X in the AXN extension binding: AXNRing_AB</li>
     * <li>Ringtone setting (without a callback number) when phone number A is used to call phone number X in the AXN extension binding: AXNRing_A</li>
     * <li>Ringtone setting when phone number N is used to call phone number X in the AXN extension binding: AXNRing_N</li>
     * </ul>
     * <p>AXG product:</p>
     * <ul>
     * <li>Ringtone setting (with a callback number) when phone number A is used to call phone number X in the AXG binding: AXGRing_AB</li>
     * <li>Ringtone setting (without a callback number) when phone number A is used to call phone number X in the AXG binding: AXGRing_A</li>
     * <li>Ringtone setting when a phone number in number group G is used to call phone number X in the AXG binding: AXGRing_G</li>
     * </ul>
     * <p>Enterprise CRBT codes: Enterprise CRBT codes can be queried in the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a>. You can choose <strong>Number Pool Management</strong> &gt; <strong>Enterprise CRBT Management</strong> to view and manage enterprise CRBT codes. You can also upload, delete, or perform other operations on enterprise CRBT codes.</p>
     * <blockquote>
     * <p> The bound enterprise CRBTs are preferentially used. If no enterprise CRBT is set or the setting does not take effect, the enterprise CRBTs at the phone number pool level are used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AXBRing_B&quot;:&quot;100000001&quot;,&quot;AXBRing_A&quot;:&quot;100000001&quot;}</p>
     */
    @NameInMap("RingConfig")
    public String ringConfig;

    /**
     * <p>The binding ID.</p>
     * <p>Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a>, choose <strong>Number and Number Pool</strong> &gt; <strong>Number Management</strong>. On the Number Management page, select the desired record and click Details to view the binding ID. Alternatively, you can view the value of the <strong>SubsId</strong> parameter returned by an API operation for a phone number binding such as BindAxb. The value of this parameter indicates a binding ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100000076879****</p>
     */
    @NameInMap("SubsId")
    public String subsId;

    public static UpdateSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscriptionRequest self = new UpdateSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSubscriptionRequest setASRModelId(String ASRModelId) {
        this.ASRModelId = ASRModelId;
        return this;
    }
    public String getASRModelId() {
        return this.ASRModelId;
    }

    public UpdateSubscriptionRequest setASRStatus(Boolean ASRStatus) {
        this.ASRStatus = ASRStatus;
        return this;
    }
    public Boolean getASRStatus() {
        return this.ASRStatus;
    }

    public UpdateSubscriptionRequest setCallDisplayType(Integer callDisplayType) {
        this.callDisplayType = callDisplayType;
        return this;
    }
    public Integer getCallDisplayType() {
        return this.callDisplayType;
    }

    public UpdateSubscriptionRequest setCallRestrict(String callRestrict) {
        this.callRestrict = callRestrict;
        return this;
    }
    public String getCallRestrict() {
        return this.callRestrict;
    }

    public UpdateSubscriptionRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public UpdateSubscriptionRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateSubscriptionRequest setIsRecordingEnabled(Boolean isRecordingEnabled) {
        this.isRecordingEnabled = isRecordingEnabled;
        return this;
    }
    public Boolean getIsRecordingEnabled() {
        return this.isRecordingEnabled;
    }

    public UpdateSubscriptionRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public UpdateSubscriptionRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public UpdateSubscriptionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateSubscriptionRequest setPhoneNoA(String phoneNoA) {
        this.phoneNoA = phoneNoA;
        return this;
    }
    public String getPhoneNoA() {
        return this.phoneNoA;
    }

    public UpdateSubscriptionRequest setPhoneNoB(String phoneNoB) {
        this.phoneNoB = phoneNoB;
        return this;
    }
    public String getPhoneNoB() {
        return this.phoneNoB;
    }

    public UpdateSubscriptionRequest setPhoneNoX(String phoneNoX) {
        this.phoneNoX = phoneNoX;
        return this;
    }
    public String getPhoneNoX() {
        return this.phoneNoX;
    }

    public UpdateSubscriptionRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public UpdateSubscriptionRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public UpdateSubscriptionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateSubscriptionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateSubscriptionRequest setRingConfig(String ringConfig) {
        this.ringConfig = ringConfig;
        return this;
    }
    public String getRingConfig() {
        return this.ringConfig;
    }

    public UpdateSubscriptionRequest setSubsId(String subsId) {
        this.subsId = subsId;
        return this;
    }
    public String getSubsId() {
        return this.subsId;
    }

}
