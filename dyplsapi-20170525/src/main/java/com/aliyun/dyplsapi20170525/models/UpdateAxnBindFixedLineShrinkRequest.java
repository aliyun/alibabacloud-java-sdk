// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateAxnBindFixedLineShrinkRequest extends TeaModel {
    /**
     * <p>放音编码必须包含3个场景的编码。按照“B-&gt;X,A-&gt;X,其他号码-&gt;X”的顺序填写编码，编码之间以逗号分隔。  比如：“1,2,3”表示B-&gt;X放音编号为1，A-&gt;X放音编号为2， 其他号码-&gt;X放音编号为3。</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Anucode")
    public String anucode;

    /**
     * <p>被叫侧放音编码  被叫放音编码必须包含2个场景的编码。按照“A被叫,其他号码被叫”的顺序填写编码，编码之间以逗号分隔。  比如：“1,2”表示A号码为被叫侧接听时的放音编号为1，其他号码为被叫侧接听时的放音编号为2。</p>
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
     * <p>位：秒，必须为数字 0：不会自动解绑 非0：自动解绑周期</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    /**
     * <p>额外字段</p>
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
     * <p>1234</p>
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
     * <p>GHX0534X202504221531579290029-2-1-aliaxn</p>
     */
    @NameInMap("SubId")
    public String subId;

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
     * 
     * <strong>example:</strong>
     * <p>15500001111</p>
     */
    @NameInMap("TelA")
    public String telA;

    /**
     * <p>B号码</p>
     * 
     * <strong>example:</strong>
     * <p>15500002222</p>
     */
    @NameInMap("TelB")
    public String telB;

    /**
     * <p>格式yyyyMMddHHmmssSSS，时间采用北京时间，24小时制，精确至毫秒</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20250421141723098</p>
     */
    @NameInMap("Ts")
    public String ts;

    public static UpdateAxnBindFixedLineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAxnBindFixedLineShrinkRequest self = new UpdateAxnBindFixedLineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAxnBindFixedLineShrinkRequest setAnucode(String anucode) {
        this.anucode = anucode;
        return this;
    }
    public String getAnucode() {
        return this.anucode;
    }

    public UpdateAxnBindFixedLineShrinkRequest setAnucodecalled(String anucodecalled) {
        this.anucodecalled = anucodecalled;
        return this;
    }
    public String getAnucodecalled() {
        return this.anucodecalled;
    }

    public UpdateAxnBindFixedLineShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAxnBindFixedLineShrinkRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public UpdateAxnBindFixedLineShrinkRequest setExtraShrink(String extraShrink) {
        this.extraShrink = extraShrink;
        return this;
    }
    public String getExtraShrink() {
        return this.extraShrink;
    }

    public UpdateAxnBindFixedLineShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateAxnBindFixedLineShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateAxnBindFixedLineShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateAxnBindFixedLineShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateAxnBindFixedLineShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateAxnBindFixedLineShrinkRequest setSubId(String subId) {
        this.subId = subId;
        return this;
    }
    public String getSubId() {
        return this.subId;
    }

    public UpdateAxnBindFixedLineShrinkRequest setSubts(String subts) {
        this.subts = subts;
        return this;
    }
    public String getSubts() {
        return this.subts;
    }

    public UpdateAxnBindFixedLineShrinkRequest setTAnucodeConnect(String TAnucodeConnect) {
        this.TAnucodeConnect = TAnucodeConnect;
        return this;
    }
    public String getTAnucodeConnect() {
        return this.TAnucodeConnect;
    }

    public UpdateAxnBindFixedLineShrinkRequest setTelA(String telA) {
        this.telA = telA;
        return this;
    }
    public String getTelA() {
        return this.telA;
    }

    public UpdateAxnBindFixedLineShrinkRequest setTelB(String telB) {
        this.telB = telB;
        return this;
    }
    public String getTelB() {
        return this.telB;
    }

    public UpdateAxnBindFixedLineShrinkRequest setTs(String ts) {
        this.ts = ts;
        return this;
    }
    public String getTs() {
        return this.ts;
    }

}
