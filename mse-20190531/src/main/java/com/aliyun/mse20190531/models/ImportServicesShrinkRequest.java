// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ImportServicesShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("FcAlias")
    public String fcAlias;

    @NameInMap("FcServiceName")
    public String fcServiceName;

    @NameInMap("FcVersion")
    public String fcVersion;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-77e1153db6e14c0a8b1fae20bcb89ca5</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The information about services.</p>
     * 
     * <strong>example:</strong>
     * <p>DNS</p>
     */
    @NameInMap("ServiceList")
    public String serviceListShrink;

    /**
     * <p>The service source. Valid values:</p>
     * <ul>
     * <li>MSE: MSE Nacos instance</li>
     * <li>K8s: ACK cluster</li>
     * <li>VIP: fixed address</li>
     * <li>DNS: DNS domain</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DNS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The Transport Layer Security (TLS) settings. Valid values:</p>
     * <ul>
     * <li>mode: TLS mode</li>
     * <li>certId: certificate ID</li>
     * <li>caCertId: CA certificate ID</li>
     * <li>caCertContent: CA certificate public key</li>
     * <li>sni: service name identification</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;mode&quot;: &quot;MUTUAL&quot;,
     *       &quot;certId&quot;: &quot;1*****-cn-hangzhou&quot;,
     *       &quot;caCertContent&quot;: &quot;123&quot;,
     *       &quot;sni&quot;: &quot;ceshi&quot;
     * }</p>
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

    public ImportServicesShrinkRequest setFcAlias(String fcAlias) {
        this.fcAlias = fcAlias;
        return this;
    }
    public String getFcAlias() {
        return this.fcAlias;
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
