// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateAxnExtensionBindFixedLineRequest extends TeaModel {
    /**
     * <p>放音编码必须包含3个场景的编码。按照“B-&gt;X,A-&gt;X,其他号码-&gt;X”的顺序填写编码，编码之间以逗号分隔。  AXN分机号业务的放音编码,B-&gt;X和其他号码-&gt;X的编码一致  比如：“1,2,3”表示B-&gt;X放音编号为1，A-&gt;X放音编号为2， 其他号码-&gt;X放音编号为3</p>
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
     * <p>单位：秒，必须为数字 0：不会自动解绑 非0：自动解绑周期</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    /**
     * <p>AXx的扩展参数项</p>
     */
    @NameInMap("Extraaxx")
    public UpdateAxnExtensionBindFixedLineRequestExtraaxx extraaxx;

    /**
     * <p>消息请求标识</p>
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
     * <p>1233</p>
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
     * <p>可参考绑定响应</p>
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
     * <p>接通后主叫侧放音编码  接通后主叫侧放音编码必须包含2个场景的编码。按照“A被叫,其他号码被叫”的顺序填写编码，编码之间以逗号分隔。  比如：“1,2”表示A号码为被叫时主叫侧的放音编号为1，其他号码为被叫时主叫侧的放音编号为2</p>
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
     * <p>格式yyyyMMddHHmmssSSS，时间采用北京时间，24小时制，精确至毫秒</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20250421141723098</p>
     */
    @NameInMap("Ts")
    public String ts;

    public static UpdateAxnExtensionBindFixedLineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAxnExtensionBindFixedLineRequest self = new UpdateAxnExtensionBindFixedLineRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAxnExtensionBindFixedLineRequest setAnucode(String anucode) {
        this.anucode = anucode;
        return this;
    }
    public String getAnucode() {
        return this.anucode;
    }

    public UpdateAxnExtensionBindFixedLineRequest setAnucodecalled(String anucodecalled) {
        this.anucodecalled = anucodecalled;
        return this;
    }
    public String getAnucodecalled() {
        return this.anucodecalled;
    }

    public UpdateAxnExtensionBindFixedLineRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAxnExtensionBindFixedLineRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public UpdateAxnExtensionBindFixedLineRequest setExtraaxx(UpdateAxnExtensionBindFixedLineRequestExtraaxx extraaxx) {
        this.extraaxx = extraaxx;
        return this;
    }
    public UpdateAxnExtensionBindFixedLineRequestExtraaxx getExtraaxx() {
        return this.extraaxx;
    }

    public UpdateAxnExtensionBindFixedLineRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateAxnExtensionBindFixedLineRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateAxnExtensionBindFixedLineRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateAxnExtensionBindFixedLineRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateAxnExtensionBindFixedLineRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateAxnExtensionBindFixedLineRequest setSubId(String subId) {
        this.subId = subId;
        return this;
    }
    public String getSubId() {
        return this.subId;
    }

    public UpdateAxnExtensionBindFixedLineRequest setSubts(String subts) {
        this.subts = subts;
        return this;
    }
    public String getSubts() {
        return this.subts;
    }

    public UpdateAxnExtensionBindFixedLineRequest setTAnucodeConnect(String TAnucodeConnect) {
        this.TAnucodeConnect = TAnucodeConnect;
        return this;
    }
    public String getTAnucodeConnect() {
        return this.TAnucodeConnect;
    }

    public UpdateAxnExtensionBindFixedLineRequest setTelA(String telA) {
        this.telA = telA;
        return this;
    }
    public String getTelA() {
        return this.telA;
    }

    public UpdateAxnExtensionBindFixedLineRequest setTs(String ts) {
        this.ts = ts;
        return this;
    }
    public String getTs() {
        return this.ts;
    }

    public static class UpdateAxnExtensionBindFixedLineRequestExtraaxx extends TeaModel {
        /**
         * <p>可选。 A通过X呼叫，即A主叫X，仅下列值有效。默认是0。 0：不能外呼 1：接续最近的B号码</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Callback")
        public String callback;

        /**
         * <p>录音控制，仅下列值有效。默认是0（不开通录音功能）。 0：不录音 1：录音</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Callrecording")
        public String callrecording;

        public static UpdateAxnExtensionBindFixedLineRequestExtraaxx build(java.util.Map<String, ?> map) throws Exception {
            UpdateAxnExtensionBindFixedLineRequestExtraaxx self = new UpdateAxnExtensionBindFixedLineRequestExtraaxx();
            return TeaModel.build(map, self);
        }

        public UpdateAxnExtensionBindFixedLineRequestExtraaxx setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

        public UpdateAxnExtensionBindFixedLineRequestExtraaxx setCallrecording(String callrecording) {
            this.callrecording = callrecording;
            return this;
        }
        public String getCallrecording() {
            return this.callrecording;
        }

    }

}
