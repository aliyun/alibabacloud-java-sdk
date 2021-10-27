// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitDeviceRequest extends TeaModel {
    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("BizData")
    public String bizData;

    @NameInMap("CertifyId")
    public String certifyId;

    @NameInMap("CertifyPrincipal")
    public String certifyPrincipal;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("DeviceToken")
    public String deviceToken;

    @NameInMap("Merchant")
    public String merchant;

    @NameInMap("MetaInfo")
    public String metaInfo;

    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    @NameInMap("ProduceNode")
    public String produceNode;

    @NameInMap("ProductName")
    public String productName;

    @NameInMap("UaToken")
    public String uaToken;

    @NameInMap("WebUmidToken")
    public String webUmidToken;

    public static InitDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        InitDeviceRequest self = new InitDeviceRequest();
        return TeaModel.build(map, self);
    }

    public InitDeviceRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public InitDeviceRequest setBizData(String bizData) {
        this.bizData = bizData;
        return this;
    }
    public String getBizData() {
        return this.bizData;
    }

    public InitDeviceRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public InitDeviceRequest setCertifyPrincipal(String certifyPrincipal) {
        this.certifyPrincipal = certifyPrincipal;
        return this;
    }
    public String getCertifyPrincipal() {
        return this.certifyPrincipal;
    }

    public InitDeviceRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public InitDeviceRequest setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
        return this;
    }
    public String getDeviceToken() {
        return this.deviceToken;
    }

    public InitDeviceRequest setMerchant(String merchant) {
        this.merchant = merchant;
        return this;
    }
    public String getMerchant() {
        return this.merchant;
    }

    public InitDeviceRequest setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }
    public String getMetaInfo() {
        return this.metaInfo;
    }

    public InitDeviceRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public InitDeviceRequest setProduceNode(String produceNode) {
        this.produceNode = produceNode;
        return this;
    }
    public String getProduceNode() {
        return this.produceNode;
    }

    public InitDeviceRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public InitDeviceRequest setUaToken(String uaToken) {
        this.uaToken = uaToken;
        return this;
    }
    public String getUaToken() {
        return this.uaToken;
    }

    public InitDeviceRequest setWebUmidToken(String webUmidToken) {
        this.webUmidToken = webUmidToken;
        return this;
    }
    public String getWebUmidToken() {
        return this.webUmidToken;
    }

}
