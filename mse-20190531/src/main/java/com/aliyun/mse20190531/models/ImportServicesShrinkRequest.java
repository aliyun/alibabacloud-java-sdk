// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ImportServicesShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("FcServiceName")
    public String fcServiceName;

    @NameInMap("FcVersion")
    public String fcVersion;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The information about services.</p>
     */
    @NameInMap("ServiceList")
    public String serviceListShrink;

    /**
     * <p>The service source. Valid values:</p>
     * <br>
     * <p>*   MSE: MSE Nacos instance</p>
     * <p>*   K8s: ACK cluster</p>
     * <p>*   VIP: fixed address</p>
     * <p>*   DNS: DNS domain</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The Transport Layer Security (TLS) settings. Valid values:</p>
     * <br>
     * <p>*   mode: TLS mode</p>
     * <p>*   certId: certificate ID</p>
     * <p>*   caCertId: CA certificate ID</p>
     * <p>*   caCertContent: CA certificate public key</p>
     * <p>*   sni: service name identification</p>
     */
    @NameInMap("TlsSetting")
    public String tlsSetting;

    public static ImportServicesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportServicesShrinkRequest self = new ImportServicesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImportServicesShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ImportServicesShrinkRequest setFcServiceName(String fcServiceName) {
        this.fcServiceName = fcServiceName;
        return this;
    }
    public String getFcServiceName() {
        return this.fcServiceName;
    }

    public ImportServicesShrinkRequest setFcVersion(String fcVersion) {
        this.fcVersion = fcVersion;
        return this;
    }
    public String getFcVersion() {
        return this.fcVersion;
    }

    public ImportServicesShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public ImportServicesShrinkRequest setServiceListShrink(String serviceListShrink) {
        this.serviceListShrink = serviceListShrink;
        return this;
    }
    public String getServiceListShrink() {
        return this.serviceListShrink;
    }

    public ImportServicesShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ImportServicesShrinkRequest setTlsSetting(String tlsSetting) {
        this.tlsSetting = tlsSetting;
        return this;
    }
    public String getTlsSetting() {
        return this.tlsSetting;
    }

}
