// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class ConfigXShrinkRequest extends TeaModel {
    /**
     * <p>开/关呼叫能力状态‘0’：禁用‘1’：开启</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CallAbility")
    public String callAbility;

    /**
     * <p>客户uid</p>
     * 
     * <strong>example:</strong>
     * <p>1898871967585852</p>
     */
    @NameInMap("CallerParentId")
    public Long callerParentId;

    /**
     * <p>号码池key</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC5**********************a1a</p>
     */
    @NameInMap("CustomerPoolKey")
    public String customerPoolKey;

    /**
     * <p>是否透传来显为真实主叫：00-非透传：互相拨打时都显示工作号;10-透传：A客户为主叫时,B员工的来显为客户A号码;B员工为主叫时,A客户的来显为工作号;默认为 00</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("GNFlag")
    public String GNFlag;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>请求去重ID, reqId最大长度为20位,接入方需要保持原子性</p>
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
     * <p>顺振控制参数</p>
     */
    @NameInMap("SequenceCalls")
    public String sequenceCallsShrink;

    /**
     * <p>顺振模式：0-不顺振（默认）1-有条件顺振，先接续calledNo指定被叫，如果该被叫未能接通，再顺振sequenceCalls号码列表2-无条件顺振，不接续calledNo指定被叫，直接顺振sequenceCalls号码列表</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SequenceMode")
    public String sequenceMode;

    /**
     * <p>开/关短信功能状态‘0’：禁用；‘1’：开启；</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SmsAbility")
    public String smsAbility;

    /**
     * <p>是否透传来显为真实用户0：不透传; 1：透传默认：0不透传</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SmsSignMode")
    public String smsSignMode;

    /**
     * <p>X号码</p>
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
