// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxnFixedLineRequest extends TeaModel {
    /**
     * <p>放音编码必须包含3个场景的编码。按照“B-&gt;X,A-&gt;X,其他号码-&gt;X”的顺序填写编码，编码之间以逗号分隔。  比如：“1,2,3”表示B-&gt;X放音编号为1，A-&gt;X放音编号为2， 其他号码-&gt;X放音编号为3</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001,10002,10003</p>
     */
    @NameInMap("Anucode")
    public String anucode;

    /**
     * <p>被叫侧放音编码  被叫放音编码必须包含2个场景的编码。按照“A被叫,其他号码被叫”的顺序填写编码，编码之间以逗号分隔。  比如：“1,2”表示A号码为被叫侧接听时的放音编号为1，其他号码为被叫侧接听时的放音编号为2</p>
     * 
     * <strong>example:</strong>
     * <p>10001,10002</p>
     */
    @NameInMap("Anucodecalled")
    public String anucodecalled;

    /**
     * <p>业务id标识，由阿里云分配给客户侧</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alitest</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>去掉“0” 例如：北京（10）；在平台分配X号码模式中，平台从号码池中分配该地区的X号码，避免产生呼叫长途费</p>
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
     * <p>mode101</p>
     */
    @NameInMap("BindType")
    public String bindType;

    /**
     * <p>位：秒，必须为数字 0：不会自动解绑 非0：自动解绑周期</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    /**
     * <p>扩展参数</p>
     */
    @NameInMap("Extra")
    public BindAxnFixedLineRequestExtra extra;

    /**
     * <p>消息请求唯一标识</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345dkwkd99d</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>接入商自有字段，最大100字符长度</p>
     * 
     * <strong>example:</strong>
     * <p>12444</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>格式为yyyyMMddHHmmss。时间采用北京时间，24小时制。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20250421141723098</p>
     */
    @NameInMap("Subts")
    public String subts;

    /**
     * <p>接通后主叫侧放音编码  接通后主叫侧放音编码必须包含2个场景的编码。按照“A被叫,其他号码被叫”的顺序填写编码，编码之间以逗号分隔。  比如：“1,2”表示A号码为被叫时主叫侧的放音编号为1，其他号码被叫为被叫时主叫侧的放音编号为2</p>
     * 
     * <strong>example:</strong>
     * <p>10001,10002</p>
     */
    @NameInMap("TAnucodeConnect")
    public String TAnucodeConnect;

    /**
     * <p>A号码</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15500001111</p>
     */
    @NameInMap("TelA")
    public String telA;

    /**
     * <p>N号码</p>
     * 
     * <strong>example:</strong>
     * <p>15500002222</p>
     */
    @NameInMap("TelB")
    public String telB;

    /**
     * <p>X号码； 平台分配号码模式下，该参数可不带，系统忽略该参数</p>
     * 
     * <strong>example:</strong>
     * <p>0571409312</p>
     */
    @NameInMap("TelX")
    public String telX;

    /**
     * <p>格式yyyyMMddHHmmssSSS，时间采用北京时间，24小时制，精确至毫秒</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20250421141723098</p>
     */
    @NameInMap("Ts")
    public String ts;

    public static BindAxnFixedLineRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAxnFixedLineRequest self = new BindAxnFixedLineRequest();
        return TeaModel.build(map, self);
    }

    public BindAxnFixedLineRequest setAnucode(String anucode) {
        this.anucode = anucode;
        return this;
    }
    public String getAnucode() {
        return this.anucode;
    }

    public BindAxnFixedLineRequest setAnucodecalled(String anucodecalled) {
        this.anucodecalled = anucodecalled;
        return this;
    }
    public String getAnucodecalled() {
        return this.anucodecalled;
    }

    public BindAxnFixedLineRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BindAxnFixedLineRequest setAreacode(String areacode) {
        this.areacode = areacode;
        return this;
    }
    public String getAreacode() {
        return this.areacode;
    }

    public BindAxnFixedLineRequest setBindType(String bindType) {
        this.bindType = bindType;
        return this;
    }
    public String getBindType() {
        return this.bindType;
    }

    public BindAxnFixedLineRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public BindAxnFixedLineRequest setExtra(BindAxnFixedLineRequestExtra extra) {
        this.extra = extra;
        return this;
    }
    public BindAxnFixedLineRequestExtra getExtra() {
        return this.extra;
    }

    public BindAxnFixedLineRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public BindAxnFixedLineRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindAxnFixedLineRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public BindAxnFixedLineRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindAxnFixedLineRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BindAxnFixedLineRequest setSubts(String subts) {
        this.subts = subts;
        return this;
    }
    public String getSubts() {
        return this.subts;
    }

    public BindAxnFixedLineRequest setTAnucodeConnect(String TAnucodeConnect) {
        this.TAnucodeConnect = TAnucodeConnect;
        return this;
    }
    public String getTAnucodeConnect() {
        return this.TAnucodeConnect;
    }

    public BindAxnFixedLineRequest setTelA(String telA) {
        this.telA = telA;
        return this;
    }
    public String getTelA() {
        return this.telA;
    }

    public BindAxnFixedLineRequest setTelB(String telB) {
        this.telB = telB;
        return this;
    }
    public String getTelB() {
        return this.telB;
    }

    public BindAxnFixedLineRequest setTelX(String telX) {
        this.telX = telX;
        return this;
    }
    public String getTelX() {
        return this.telX;
    }

    public BindAxnFixedLineRequest setTs(String ts) {
        this.ts = ts;
        return this;
    }
    public String getTs() {
        return this.ts;
    }

    public static class BindAxnFixedLineRequestExtra extends TeaModel {
        /**
         * <p>A通过X呼叫，即A主叫X，仅下列值有效。默认是0。 0：不能外呼 1：接续最近的N号码 2：回拨固定号码：telB</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Callback")
        public String callback;

        /**
         * <p>仅下列值有效。默认是0（不开通录音功能）。 0：不录音 1：录音</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Callrecording")
        public String callrecording;

        public static BindAxnFixedLineRequestExtra build(java.util.Map<String, ?> map) throws Exception {
            BindAxnFixedLineRequestExtra self = new BindAxnFixedLineRequestExtra();
            return TeaModel.build(map, self);
        }

        public BindAxnFixedLineRequestExtra setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

        public BindAxnFixedLineRequestExtra setCallrecording(String callrecording) {
            this.callrecording = callrecording;
            return this;
        }
        public String getCallrecording() {
            return this.callrecording;
        }

    }

}
