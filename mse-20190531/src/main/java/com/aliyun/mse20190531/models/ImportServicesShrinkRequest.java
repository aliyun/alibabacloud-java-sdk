// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ImportServicesShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese.</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The Function Compute service alias. This parameter is required when the service source is Function Compute.</p>
     * 
     * <strong>example:</strong>
     * <p>test-alias</p>
     */
    @NameInMap("FcAlias")
    public String fcAlias;

    /**
     * <p>The Function Compute service name. This parameter is required when the service source is Function Compute.</p>
     * 
     * <strong>example:</strong>
     * <p>guide</p>
     */
    @NameInMap("FcServiceName")
    public String fcServiceName;

    /**
     * <p>The Function Compute service version. This parameter is required when the service source is Function Compute.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
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
     * <p>The service list.</p>
     * 
     * <strong>example:</strong>
     * <p>DNS</p>
     */
    @NameInMap("ServiceList")
    public String serviceListShrink;

    /**
     * <p>The service source ID. This parameter is used when you add a service from a specified source.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SourceId")
    public Long sourceId;

    /**
     * <p>The service source. Valid values:</p>
     * <ul>
     * <li>MSE: Microservices Engine (MSE Nacos).</li>
     * <li>K8s: Container Service for Kubernetes (ACK).</li>
     * <li>VIP: Fixed address.</li>
     * <li>DNS: DNS domain name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DNS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The TLS settings.</p>
     * <ul>
     * <li><p>TLS pattern: mode</p>
     * </li>
     * <li><p>Certificate ID: certId</p>
     * </li>
     * <li><p>CA certificate ID: caCertId</p>
     * </li>
     * <li><p>CA certificate public key: caCertContent</p>
     * </li>
     * <li><p>Service name identity: sni</p>
     * </li>
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

    public ImportServicesShrinkRequest setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public Long getSourceId() {
        return this.sourceId;
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
