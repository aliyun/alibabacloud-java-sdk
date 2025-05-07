// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxbFixedLineRequest extends TeaModel {
    /**
     * <p>主叫侧放音编码，AXB业务时必须设置。  放音编码必须包含3个场景的编码。按照“B-&gt;X,A-&gt;X,其他号码-&gt;X”的顺序填写编码，编码之间以逗号分隔。  比如：“1,2,3”表示B-&gt;X放音编号为1，A-&gt;X放音编号为2， 其他号码-&gt;X放音编号为3</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("Anucode")
    public String anucode;

    /**
     * <p>接通后被叫侧放音编码,接通后被叫侧放音编码  被叫放音编码必须包含2个场景的编码。按照“A被叫,B被叫”的顺序填写编码，编码之间以逗号分隔。  比如：“1,2”表示A号码为被叫侧接听时的放音编号为1，B号码为被叫侧接听时的放音编号为2。</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Anucodecalled")
    public String anucodecalled;

    /**
     * <p>应用id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALPT_1234</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>区号,去掉“0” 例如：北京（10）；在平台分配X号码模式中，平台从号码池中分配该地区的X号码，避免产生呼叫长途费。</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Areacode")
    public String areacode;

    /**
     * <p>绑定类型，值如下： mode101：客户携带X号码 mode102：平台分配X号码</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("BindType")
    public String bindType;

    /**
     * <p>过期时间,单位：秒，必须为数字 0：不会自动解绑 非0：自动解绑周期</p>
     * <p>This parameter is required.</p>
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
    public BindAxbFixedLineRequestExtra extra;

    /**
     * <p>消息请求标识</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15433678436</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>接入商自有字段，不能超过100个长度</p>
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
     * <p>绑定时间，格式为yyyyMMddHHmmss。时间采用北京时间，24小时制。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20161114143116</p>
     */
    @NameInMap("Subts")
    public String subts;

    /**
     * <p>接通后主叫侧的放音编码,接通后主叫侧放音编码  接通后主叫侧放音编码必须包含2个场景的编码。按照“A被叫,B被叫”的顺序填写编码，编码之间以逗号分隔。  比如：“1,2”表示A号码为被叫时主叫侧的放音编号为1，B号码为被叫时主叫侧的放音编号为2。</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("TAnucodeConnect")
    public String TAnucodeConnect;

    /**
     * <p>真实号码</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>18456713271</p>
     */
    @NameInMap("TelA")
    public String telA;

    /**
     * <p>对端号码</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>18971362645</p>
     */
    @NameInMap("TelB")
    public String telB;

    /**
     * <p>X号码； 平台分配号码模式下，该参数可不带，系统忽略该参数  格式为yyyyMMddHHmmss。时间采用北京时间，24小时制。</p>
     * 
     * <strong>example:</strong>
     * <p>19767562345</p>
     */
    @NameInMap("TelX")
    public String telX;

    /**
     * <p>业务时间戳，格式yyyyMMddHHmmssSSS，时间采用北京时间，24小时制，精确至毫秒</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20161114143116001</p>
     */
    @NameInMap("Ts")
    public String ts;

    public static BindAxbFixedLineRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAxbFixedLineRequest self = new BindAxbFixedLineRequest();
        return TeaModel.build(map, self);
    }

    public BindAxbFixedLineRequest setAnucode(String anucode) {
        this.anucode = anucode;
        return this;
    }
    public String getAnucode() {
        return this.anucode;
    }

    public BindAxbFixedLineRequest setAnucodecalled(String anucodecalled) {
        this.anucodecalled = anucodecalled;
        return this;
    }
    public String getAnucodecalled() {
        return this.anucodecalled;
    }

    public BindAxbFixedLineRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BindAxbFixedLineRequest setAreacode(String areacode) {
        this.areacode = areacode;
        return this;
    }
    public String getAreacode() {
        return this.areacode;
    }

    public BindAxbFixedLineRequest setBindType(String bindType) {
        this.bindType = bindType;
        return this;
    }
    public String getBindType() {
        return this.bindType;
    }

    public BindAxbFixedLineRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public BindAxbFixedLineRequest setExtra(BindAxbFixedLineRequestExtra extra) {
        this.extra = extra;
        return this;
    }
    public BindAxbFixedLineRequestExtra getExtra() {
        return this.extra;
    }

    public BindAxbFixedLineRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public BindAxbFixedLineRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindAxbFixedLineRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public BindAxbFixedLineRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindAxbFixedLineRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BindAxbFixedLineRequest setSubts(String subts) {
        this.subts = subts;
        return this;
    }
    public String getSubts() {
        return this.subts;
    }

    public BindAxbFixedLineRequest setTAnucodeConnect(String TAnucodeConnect) {
        this.TAnucodeConnect = TAnucodeConnect;
        return this;
    }
    public String getTAnucodeConnect() {
        return this.TAnucodeConnect;
    }

    public BindAxbFixedLineRequest setTelA(String telA) {
        this.telA = telA;
        return this;
    }
    public String getTelA() {
        return this.telA;
    }

    public BindAxbFixedLineRequest setTelB(String telB) {
        this.telB = telB;
        return this;
    }
    public String getTelB() {
        return this.telB;
    }

    public BindAxbFixedLineRequest setTelX(String telX) {
        this.telX = telX;
        return this;
    }
    public String getTelX() {
        return this.telX;
    }

    public BindAxbFixedLineRequest setTs(String ts) {
        this.ts = ts;
        return this;
    }
    public String getTs() {
        return this.ts;
    }

    public static class BindAxbFixedLineRequestExtra extends TeaModel {
        /**
         * <p>录音控制，默认是0（不开通录音功能）。 0：不录音 1：录音</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Callrecording")
        public String callrecording;

        public static BindAxbFixedLineRequestExtra build(java.util.Map<String, ?> map) throws Exception {
            BindAxbFixedLineRequestExtra self = new BindAxbFixedLineRequestExtra();
            return TeaModel.build(map, self);
        }

        public BindAxbFixedLineRequestExtra setCallrecording(String callrecording) {
            this.callrecording = callrecording;
            return this;
        }
        public String getCallrecording() {
            return this.callrecording;
        }

    }

}
