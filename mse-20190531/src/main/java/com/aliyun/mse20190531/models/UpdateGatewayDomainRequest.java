// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayDomainRequest extends TeaModel {
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

    @NameInMap("CaCertIdentifier")
    public String caCertIdentifier;

    /**
     * <p>The ID of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>6209108-cn-hangzhou</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-86575c0bc9f04ecfbacb92b8e392****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>Specifies whether to enable <code>HTTP/2</code>.</p>
     * <ul>
     * <li><code>open</code>: <code>HTTP/2</code> is enabled.</li>
     * <li><code>close</code>: <code>HTTP/2</code> is disabled.</li>
     * <li><code>globalConfig</code>: Global configurations are used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>close</p>
     */
    @NameInMap("Http2")
    public String http2;

    /**
     * <p>The ID of the domain name that you want to update.</p>
     * 
     * <strong>example:</strong>
     * <p>94</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("MtlsEnabled")
    public Boolean mtlsEnabled;

    /**
     * <p>Specifies whether to forcibly use HTTPS.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MustHttps")
    public Boolean mustHttps;

    /**
     * <p>The type of the protocol. Valid values:</p>
     * <ul>
     * <li>HTTPS</li>
     * <li>HTTP</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTPS</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("TlsCipherSuitesConfigJSON")
    public UpdateGatewayDomainRequestTlsCipherSuitesConfigJSON tlsCipherSuitesConfigJSON;

    /**
     * <p>The maximum version of Transport Layer Security (TLS).</p>
     * 
     * <strong>example:</strong>
     * <p>TLS 1.3</p>
     */
    @NameInMap("TlsMax")
    public String tlsMax;

    /**
     * <p>The minimum version of TLS.</p>
     * 
     * <strong>example:</strong>
     * <p>TLS 1.0</p>
     */
    @NameInMap("TlsMin")
    public String tlsMin;

    public static UpdateGatewayDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayDomainRequest self = new UpdateGatewayDomainRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayDomainRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayDomainRequest setCaCertIdentifier(String caCertIdentifier) {
        this.caCertIdentifier = caCertIdentifier;
        return this;
    }
    public String getCaCertIdentifier() {
        return this.caCertIdentifier;
    }

    public UpdateGatewayDomainRequest setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public UpdateGatewayDomainRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayDomainRequest setHttp2(String http2) {
        this.http2 = http2;
        return this;
    }
    public String getHttp2() {
        return this.http2;
    }

    public UpdateGatewayDomainRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateGatewayDomainRequest setMtlsEnabled(Boolean mtlsEnabled) {
        this.mtlsEnabled = mtlsEnabled;
        return this;
    }
    public Boolean getMtlsEnabled() {
        return this.mtlsEnabled;
    }

    public UpdateGatewayDomainRequest setMustHttps(Boolean mustHttps) {
        this.mustHttps = mustHttps;
        return this;
    }
    public Boolean getMustHttps() {
        return this.mustHttps;
    }

    public UpdateGatewayDomainRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdateGatewayDomainRequest setTlsCipherSuitesConfigJSON(UpdateGatewayDomainRequestTlsCipherSuitesConfigJSON tlsCipherSuitesConfigJSON) {
        this.tlsCipherSuitesConfigJSON = tlsCipherSuitesConfigJSON;
        return this;
    }
    public UpdateGatewayDomainRequestTlsCipherSuitesConfigJSON getTlsCipherSuitesConfigJSON() {
        return this.tlsCipherSuitesConfigJSON;
    }

    public UpdateGatewayDomainRequest setTlsMax(String tlsMax) {
        this.tlsMax = tlsMax;
        return this;
    }
    public String getTlsMax() {
        return this.tlsMax;
    }

    public UpdateGatewayDomainRequest setTlsMin(String tlsMin) {
        this.tlsMin = tlsMin;
        return this;
    }
    public String getTlsMin() {
        return this.tlsMin;
    }

    public static class UpdateGatewayDomainRequestTlsCipherSuitesConfigJSON extends TeaModel {
        @NameInMap("ConfigType")
        public String configType;

        @NameInMap("TlsCipherSuites")
        public java.util.List<String> tlsCipherSuites;

        public static UpdateGatewayDomainRequestTlsCipherSuitesConfigJSON build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayDomainRequestTlsCipherSuitesConfigJSON self = new UpdateGatewayDomainRequestTlsCipherSuitesConfigJSON();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayDomainRequestTlsCipherSuitesConfigJSON setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public UpdateGatewayDomainRequestTlsCipherSuitesConfigJSON setTlsCipherSuites(java.util.List<String> tlsCipherSuites) {
            this.tlsCipherSuites = tlsCipherSuites;
            return this;
        }
        public java.util.List<String> getTlsCipherSuites() {
            return this.tlsCipherSuites;
        }

    }

}
