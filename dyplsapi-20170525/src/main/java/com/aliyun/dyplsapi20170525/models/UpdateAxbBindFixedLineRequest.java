// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateAxbBindFixedLineRequest extends TeaModel {
    /**
     * <p>主叫侧放音编码</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("Anucode")
    public String anucode;

    /**
     * <p>被叫侧放音编码</p>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("Anucodecalled")
    public String anucodecalled;

    /**
     * <p>应用id，请求和绑定时的appId必须一致</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALPT_1234</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>过期时间,单位：秒，必须为数字 0：不会自动解绑 非0：自动解绑周期</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    /**
     * <p>扩展参数</p>
     */
    @NameInMap("Extra")
    public UpdateAxbBindFixedLineRequestExtra extra;

    /**
     * <p>消息请求标识</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>接入商自有字段，不能超过100个字符</p>
     * 
     * <strong>example:</strong>
     * <p>remark</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>绑定id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A100X558X0000400023</p>
     */
    @NameInMap("SubId")
    public String subId;

    /**
     * <p>格式为yyyyMMddHHmmss。时间采用北京时间，24小时制。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20150920190126</p>
     */
    @NameInMap("Subts")
    public String subts;

    /**
     * <p>接通后主叫侧的放音编码</p>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("TAnucodeConnect")
    public String TAnucodeConnect;

    /**
     * <p>真实号码，telA,telB不允许同时更新</p>
     * 
     * <strong>example:</strong>
     * <p>13900000000</p>
     */
    @NameInMap("TelA")
    public String telA;

    /**
     * <p>对端号码，telA,telB不允许同时更新</p>
     * 
     * <strong>example:</strong>
     * <p>13005711234</p>
     */
    @NameInMap("TelB")
    public String telB;

    /**
     * <p>业务时间戳，格式yyyyMMddHHmmssSSS，时间采用北京时间，24小时制，精确至毫秒</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20161114143116001</p>
     */
    @NameInMap("Ts")
    public String ts;

    public static UpdateAxbBindFixedLineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAxbBindFixedLineRequest self = new UpdateAxbBindFixedLineRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAxbBindFixedLineRequest setAnucode(String anucode) {
        this.anucode = anucode;
        return this;
    }
    public String getAnucode() {
        return this.anucode;
    }

    public UpdateAxbBindFixedLineRequest setAnucodecalled(String anucodecalled) {
        this.anucodecalled = anucodecalled;
        return this;
    }
    public String getAnucodecalled() {
        return this.anucodecalled;
    }

    public UpdateAxbBindFixedLineRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAxbBindFixedLineRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public UpdateAxbBindFixedLineRequest setExtra(UpdateAxbBindFixedLineRequestExtra extra) {
        this.extra = extra;
        return this;
    }
    public UpdateAxbBindFixedLineRequestExtra getExtra() {
        return this.extra;
    }

    public UpdateAxbBindFixedLineRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateAxbBindFixedLineRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateAxbBindFixedLineRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateAxbBindFixedLineRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateAxbBindFixedLineRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateAxbBindFixedLineRequest setSubId(String subId) {
        this.subId = subId;
        return this;
    }
    public String getSubId() {
        return this.subId;
    }

    public UpdateAxbBindFixedLineRequest setSubts(String subts) {
        this.subts = subts;
        return this;
    }
    public String getSubts() {
        return this.subts;
    }

    public UpdateAxbBindFixedLineRequest setTAnucodeConnect(String TAnucodeConnect) {
        this.TAnucodeConnect = TAnucodeConnect;
        return this;
    }
    public String getTAnucodeConnect() {
        return this.TAnucodeConnect;
    }

    public UpdateAxbBindFixedLineRequest setTelA(String telA) {
        this.telA = telA;
        return this;
    }
    public String getTelA() {
        return this.telA;
    }

    public UpdateAxbBindFixedLineRequest setTelB(String telB) {
        this.telB = telB;
        return this;
    }
    public String getTelB() {
        return this.telB;
    }

    public UpdateAxbBindFixedLineRequest setTs(String ts) {
        this.ts = ts;
        return this;
    }
    public String getTs() {
        return this.ts;
    }

    public static class UpdateAxbBindFixedLineRequestExtra extends TeaModel {
        /**
         * <p>录音控制， 0：不录音 1：录音</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Callrecording")
        public String callrecording;

        public static UpdateAxbBindFixedLineRequestExtra build(java.util.Map<String, ?> map) throws Exception {
            UpdateAxbBindFixedLineRequestExtra self = new UpdateAxbBindFixedLineRequestExtra();
            return TeaModel.build(map, self);
        }

        public UpdateAxbBindFixedLineRequestExtra setCallrecording(String callrecording) {
            this.callrecording = callrecording;
            return this;
        }
        public String getCallrecording() {
            return this.callrecording;
        }

    }

}
