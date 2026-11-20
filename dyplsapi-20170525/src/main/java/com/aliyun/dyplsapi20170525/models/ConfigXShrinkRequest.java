// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class ConfigXShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the call capability. Valid values:</p>
     * <ul>
     * <li><p>0: Disable.</p>
     * </li>
     * <li><p>1: Enable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CallAbility")
    public String callAbility;

    /**
     * <p>The customer UID.</p>
     * 
     * <strong>example:</strong>
     * <p>1898871967585852</p>
     */
    @NameInMap("CallerParentId")
    public Long callerParentId;

    /**
     * <p>The key of the number pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC5**********************a1a</p>
     */
    @NameInMap("CustomerPoolKey")
    public String customerPoolKey;

    /**
     * <p>Specifies whether to pass through the caller ID to display the actual caller. Valid values:</p>
     * <ul>
     * <li><p>00: No pass-through. The work number is displayed when either party calls the other.</p>
     * </li>
     * <li><p>10: Pass-through. When Customer A is the caller, the caller ID displayed to Employee B is the number of Customer A. When Employee B is the caller, the caller ID displayed to Customer A is the work number.</p>
     * </li>
     * </ul>
     * <p>Default value: 00.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("GNFlag")
    public String GNFlag;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The request deduplication ID. The maximum length of reqId is 20 characters. The caller must ensure atomicity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>564**********879</p>
     */
    @NameInMap("ReqId")
    public String reqId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The sequential ringing control parameters.</p>
     */
    @NameInMap("SequenceCalls")
    public String sequenceCallsShrink;

    /**
     * <p>The sequential ringing mode. Valid values:</p>
     * <ul>
     * <li><p>0: No sequential ringing. This is the default value.</p>
     * </li>
     * <li><p>1: Conditional sequential ringing. The system first connects to the callee specified by calledNo. If the callee cannot be connected, the system sequentially rings the numbers in the sequenceCalls list.</p>
     * </li>
     * <li><p>2: Unconditional sequential ringing. The system does not connect to the callee specified by calledNo and directly sequentially rings the numbers in the sequenceCalls list.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SequenceMode")
    public String sequenceMode;

    /**
     * <p>Specifies whether to enable the SMS feature. Valid values:</p>
     * <ul>
     * <li><p>0: Disable.</p>
     * </li>
     * <li><p>1: Enable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SmsAbility")
    public String smsAbility;

    /**
     * <p>Specifies whether to pass through the SMS signature to display the actual user. Valid values:</p>
     * <ul>
     * <li><p>0: No pass-through.</p>
     * </li>
     * <li><p>1: Pass-through.</p>
     * </li>
     * </ul>
     * <p>Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SmsSignMode")
    public String smsSignMode;

    /**
     * <p>The X number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>17*******22</p>
     */
    @NameInMap("TelX")
    public String telX;

    public static ConfigXShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigXShrinkRequest self = new ConfigXShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ConfigXShrinkRequest setCallAbility(String callAbility) {
        this.callAbility = callAbility;
        return this;
    }
    public String getCallAbility() {
        return this.callAbility;
    }

    public ConfigXShrinkRequest setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public ConfigXShrinkRequest setCustomerPoolKey(String customerPoolKey) {
        this.customerPoolKey = customerPoolKey;
        return this;
    }
    public String getCustomerPoolKey() {
        return this.customerPoolKey;
    }

    public ConfigXShrinkRequest setGNFlag(String GNFlag) {
        this.GNFlag = GNFlag;
        return this;
    }
    public String getGNFlag() {
        return this.GNFlag;
    }

    public ConfigXShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ConfigXShrinkRequest setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

    public ConfigXShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ConfigXShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ConfigXShrinkRequest setSequenceCallsShrink(String sequenceCallsShrink) {
        this.sequenceCallsShrink = sequenceCallsShrink;
        return this;
    }
    public String getSequenceCallsShrink() {
        return this.sequenceCallsShrink;
    }

    public ConfigXShrinkRequest setSequenceMode(String sequenceMode) {
        this.sequenceMode = sequenceMode;
        return this;
    }
    public String getSequenceMode() {
        return this.sequenceMode;
    }

    public ConfigXShrinkRequest setSmsAbility(String smsAbility) {
        this.smsAbility = smsAbility;
        return this;
    }
    public String getSmsAbility() {
        return this.smsAbility;
    }

    public ConfigXShrinkRequest setSmsSignMode(String smsSignMode) {
        this.smsSignMode = smsSignMode;
        return this;
    }
    public String getSmsSignMode() {
        return this.smsSignMode;
    }

    public ConfigXShrinkRequest setTelX(String telX) {
        this.telX = telX;
        return this;
    }
    public String getTelX() {
        return this.telX;
    }

}
