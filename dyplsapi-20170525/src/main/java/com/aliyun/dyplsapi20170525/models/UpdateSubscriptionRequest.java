// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateSubscriptionRequest extends TeaModel {
    /**
     * <p>The ID of the ASR model.</p>
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
     * <p>Re-sets the phone number display logic in the phone number binding. Fixed value: **1**, indicating that phone number X is displayed on both the calling phone and the called phone.</p>
     * <br>
     * <p>>  Due to the regulatory restrictions imposed by carriers, the setting to display real phone numbers during calls does not take effect.</p>
     */
    @NameInMap("CallDisplayType")
    public Integer callDisplayType;

    /**
     * <p>One-way call restrictions. Valid values:</p>
     * <br>
     * <p>*   **CONTROL_AX_DISABLE**: Phone number A cannot be used to call phone number X.</p>
     * <p>*   **CONTROL_BX_DISABLE**: Phone number B cannot be used to call phone number X.</p>
     * <p>*   **CONTROL_CLEAR_DISABLE**: The call restrictions are cleared.</p>
     * <br>
     * <p>>  This parameter is required when **OperateType** is set to **updateCallRestrict**.</p>
     */
    @NameInMap("CallRestrict")
    public String callRestrict;

    /**
     * <p>Re-sets the expiration time of the phone number binding.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter is required when **OperateType** is set to **updateExpire**.</p>
     * <br>
     * <p>*   The expiration time must be more than 1 minute later than the time when you call this API operation.</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    /**
     * <p>The ID of number group G in the phone number binding.</p>
     * <br>
     * <p>>  This parameter is required when **OperateType** is set to **updateAxgGroup**.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Re-sets the recording status in the phone number binding.</p>
     * <br>
     * <p>>  This parameter does not have a default value. If you do not specify this parameter, the value of the corresponding field is not updated.</p>
     */
    @NameInMap("IsRecordingEnabled")
    public Boolean isRecordingEnabled;

    /**
     * <p>The operation to modify the phone number binding. Valid values:</p>
     * <br>
     * <p>*   **updateNoA**: modifies phone number A.</p>
     * <p>*   **updateNoB**: modifies phone number B.</p>
     * <p>*   **updateExpire**: modifies the validity period of the binding.</p>
     * <p>*   **updateAxgGroup**: modifies number group G.</p>
     * <p>*   **updateCallRestrict**: modifies one-way call restrictions.</p>
     * <p>*   **updateCallDisplayType**: updates the number display logic for calls.</p>
     * <p>*   **updateOutId**: updates the value of the OutId parameter.</p>
     * <p>*   **updateIsRecordingEnabled**: updates the status of the recording feature in the binding.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>Re-sets the value of the OutId parameter in the phone number binding.</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Phone number A in the phone number binding.</p>
     * <br>
     * <p>>  This parameter is required when **OperateType** is set to **updateNoA**.</p>
     */
    @NameInMap("PhoneNoA")
    public String phoneNoA;

    /**
     * <p>Phone number B in the phone number binding.</p>
     * <br>
     * <p>>  This parameter is required when **OperateType** is set to **updateNoB**.</p>
     */
    @NameInMap("PhoneNoB")
    public String phoneNoB;

    /**
     * <p>Phone number X in the phone number binding.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PhoneNoX")
    public String phoneNoX;

    /**
     * <p>The key of the phone number pool.</p>
     * <br>
     * <p>Log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) and view the key of the phone number pool on the **Number Pool Management** page.</p>
     * <br>
     * <p>>  This parameter is required when **ProductType** is left empty.</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    /**
     * <p>The product type. Valid values:</p>
     * <br>
     * <p>*   **AXB_170**</p>
     * <p>*   **AXN_170**</p>
     * <p>*   **AXN_95**</p>
     * <p>*   **AXN_EXTENSION_REUSE**</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter is applicable to the original key accounts of Alibaba Cloud. This parameter can be ignored for Alibaba Cloud users.</p>
     * <br>
     * <p>*   This parameter is required when **PoolKey** is left empty.</p>
     */
    @NameInMap("ProductType")
    public String productType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Updates the ringtone code for enterprise Color Ring Back Tone (CRBT) in the phone number binding.</p>
     * <br>
     * <p>AXB product:</p>
     * <br>
     * <p>*   Ringtone setting when phone number A is used to call phone number X in the AXB binding: AXBRing_A</p>
     * <p>*   Ringtone setting when phone number B is used to call phone number X in the AXB binding: AXBRing_B</p>
     * <br>
     * <p>AXN product:</p>
     * <br>
     * <p>*   Ringtone setting (with a callback number) when phone number A is used to call phone number X in the AXN extension binding: AXNRing_AB</p>
     * <p>*   Ringtone setting (without a callback number) when phone number A is used to call phone number X in the AXN extension binding: AXNRing_A</p>
     * <p>*   Ringtone setting when phone number N is used to call phone number X in the AXN extension binding: AXNRing_N</p>
     * <br>
     * <p>AXG product:</p>
     * <br>
     * <p>*   Ringtone setting (with a callback number) when phone number A is used to call phone number X in the AXG binding: AXGRing_AB</p>
     * <p>*   Ringtone setting (without a callback number) when phone number A is used to call phone number X in the AXG binding: AXGRing_A</p>
     * <p>*   Ringtone setting when a phone number in number group G is used to call phone number X in the AXG binding: AXGRing_G</p>
     * <br>
     * <p>Enterprise CRBT codes: Enterprise CRBT codes can be queried in the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account). You can choose **Number Pool Management** > **Enterprise CRBT Management** to view and manage enterprise CRBT codes. You can also upload, delete, or perform other operations on enterprise CRBT codes.</p>
     * <br>
     * <p>>  The bound enterprise CRBTs are preferentially used. If no enterprise CRBT is set or the setting does not take effect, the enterprise CRBTs at the phone number pool level are used.</p>
     */
    @NameInMap("RingConfig")
    public String ringConfig;

    /**
     * <p>The binding ID.</p>
     * <br>
     * <p>Log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account), choose **Number and Number Pool** > **Number Management**. On the Number Management page, select the desired record and click Details to view the binding ID. Alternatively, you can view the value of the **SubsId** parameter returned by an API operation for a phone number binding such as BindAxb. The value of this parameter indicates a binding ID.</p>
     * <br>
     * <p>This parameter is required.</p>
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
