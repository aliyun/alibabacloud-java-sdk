// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class ConfigXRequest extends TeaModel {
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
    public java.util.List<ConfigXRequestSequenceCalls> sequenceCalls;

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

    public static ConfigXRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigXRequest self = new ConfigXRequest();
        return TeaModel.build(map, self);
    }

    public ConfigXRequest setCallAbility(String callAbility) {
        this.callAbility = callAbility;
        return this;
    }
    public String getCallAbility() {
        return this.callAbility;
    }

    public ConfigXRequest setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public ConfigXRequest setCustomerPoolKey(String customerPoolKey) {
        this.customerPoolKey = customerPoolKey;
        return this;
    }
    public String getCustomerPoolKey() {
        return this.customerPoolKey;
    }

    public ConfigXRequest setGNFlag(String GNFlag) {
        this.GNFlag = GNFlag;
        return this;
    }
    public String getGNFlag() {
        return this.GNFlag;
    }

    public ConfigXRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ConfigXRequest setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

    public ConfigXRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ConfigXRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ConfigXRequest setSequenceCalls(java.util.List<ConfigXRequestSequenceCalls> sequenceCalls) {
        this.sequenceCalls = sequenceCalls;
        return this;
    }
    public java.util.List<ConfigXRequestSequenceCalls> getSequenceCalls() {
        return this.sequenceCalls;
    }

    public ConfigXRequest setSequenceMode(String sequenceMode) {
        this.sequenceMode = sequenceMode;
        return this;
    }
    public String getSequenceMode() {
        return this.sequenceMode;
    }

    public ConfigXRequest setSmsAbility(String smsAbility) {
        this.smsAbility = smsAbility;
        return this;
    }
    public String getSmsAbility() {
        return this.smsAbility;
    }

    public ConfigXRequest setSmsSignMode(String smsSignMode) {
        this.smsSignMode = smsSignMode;
        return this;
    }
    public String getSmsSignMode() {
        return this.smsSignMode;
    }

    public ConfigXRequest setTelX(String telX) {
        this.telX = telX;
        return this;
    }
    public String getTelX() {
        return this.telX;
    }

    public static class ConfigXRequestSequenceCalls extends TeaModel {
        /**
         * <p>The playback code for the sequential ringing prompt tone. The format is the same as callNoPlayCode.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("SequenceCallNoPlayCode")
        public String sequenceCallNoPlayCode;

        /**
         * <p>The callee number for sequential ringing.</p>
         * 
         * <strong>example:</strong>
         * <p>18*******33</p>
         */
        @NameInMap("SequenceCalledNo")
        public String sequenceCalledNo;

        /**
         * <p>The playback code for the caller and callee after the call is connected. The format is the same as calledPlayCode.</p>
         * 
         * <strong>example:</strong>
         * <p>02</p>
         */
        @NameInMap("SequenceCalledPlayCode")
        public String sequenceCalledPlayCode;

        public static ConfigXRequestSequenceCalls build(java.util.Map<String, ?> map) throws Exception {
            ConfigXRequestSequenceCalls self = new ConfigXRequestSequenceCalls();
            return TeaModel.build(map, self);
        }

        public ConfigXRequestSequenceCalls setSequenceCallNoPlayCode(String sequenceCallNoPlayCode) {
            this.sequenceCallNoPlayCode = sequenceCallNoPlayCode;
            return this;
        }
        public String getSequenceCallNoPlayCode() {
            return this.sequenceCallNoPlayCode;
        }

        public ConfigXRequestSequenceCalls setSequenceCalledNo(String sequenceCalledNo) {
            this.sequenceCalledNo = sequenceCalledNo;
            return this;
        }
        public String getSequenceCalledNo() {
            return this.sequenceCalledNo;
        }

        public ConfigXRequestSequenceCalls setSequenceCalledPlayCode(String sequenceCalledPlayCode) {
            this.sequenceCalledPlayCode = sequenceCalledPlayCode;
            return this;
        }
        public String getSequenceCalledPlayCode() {
            return this.sequenceCalledPlayCode;
        }

    }

}
