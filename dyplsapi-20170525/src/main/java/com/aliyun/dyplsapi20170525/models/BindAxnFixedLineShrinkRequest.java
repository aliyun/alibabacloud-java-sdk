// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxnFixedLineShrinkRequest extends TeaModel {
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
    public String extraShrink;

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

    public static BindAxnFixedLineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAxnFixedLineShrinkRequest self = new BindAxnFixedLineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BindAxnFixedLineShrinkRequest setAnucode(String anucode) {
        this.anucode = anucode;
        return this;
    }
    public String getAnucode() {
        return this.anucode;
    }

    public BindAxnFixedLineShrinkRequest setAnucodecalled(String anucodecalled) {
        this.anucodecalled = anucodecalled;
        return this;
    }
    public String getAnucodecalled() {
        return this.anucodecalled;
    }

    public BindAxnFixedLineShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BindAxnFixedLineShrinkRequest setAreacode(String areacode) {
        this.areacode = areacode;
        return this;
    }
    public String getAreacode() {
        return this.areacode;
    }

    public BindAxnFixedLineShrinkRequest setBindType(String bindType) {
        this.bindType = bindType;
        return this;
    }
    public String getBindType() {
        return this.bindType;
    }

    public BindAxnFixedLineShrinkRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public BindAxnFixedLineShrinkRequest setExtraShrink(String extraShrink) {
        this.extraShrink = extraShrink;
        return this;
    }
    public String getExtraShrink() {
        return this.extraShrink;
    }

    public BindAxnFixedLineShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public BindAxnFixedLineShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindAxnFixedLineShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public BindAxnFixedLineShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindAxnFixedLineShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BindAxnFixedLineShrinkRequest setSubts(String subts) {
        this.subts = subts;
        return this;
    }
    public String getSubts() {
        return this.subts;
    }

    public BindAxnFixedLineShrinkRequest setTAnucodeConnect(String TAnucodeConnect) {
        this.TAnucodeConnect = TAnucodeConnect;
        return this;
    }
    public String getTAnucodeConnect() {
        return this.TAnucodeConnect;
    }

    public BindAxnFixedLineShrinkRequest setTelA(String telA) {
        this.telA = telA;
        return this;
    }
    public String getTelA() {
        return this.telA;
    }

    public BindAxnFixedLineShrinkRequest setTelB(String telB) {
        this.telB = telB;
        return this;
    }
    public String getTelB() {
        return this.telB;
    }

    public BindAxnFixedLineShrinkRequest setTelX(String telX) {
        this.telX = telX;
        return this;
    }
    public String getTelX() {
        return this.telX;
    }

    public BindAxnFixedLineShrinkRequest setTs(String ts) {
        this.ts = ts;
        return this;
    }
    public String getTs() {
        return this.ts;
    }

}
