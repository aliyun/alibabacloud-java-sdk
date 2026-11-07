// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayDomainRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese. This is the default value.</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The content of the CA certificate.</p>
     */
    @NameInMap("CaCertIdentifier")
    public String caCertIdentifier;

    /**
     * <p>The certificate ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6828169-cn-hangzhou</p>
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
     * <p>Specifies whether to enable HTTP/2. Valid values:</p>
     * <ul>
     * <li><code>open</code>: Enables HTTP/2.</li>
     * <li><code>close</code>: Disables HTTP/2.</li>
     * <li><code>globalConfig</code>: Uses the global configuration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>close</p>
     */
    @NameInMap("Http2")
    public String http2;

    /**
     * <p>Specifies whether to enable mTLS.</p>
     */
    @NameInMap("MtlsEnabled")
    public Boolean mtlsEnabled;

    /**
     * <p>Specifies whether to enable HTTPS.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MustHttps")
    public Boolean mustHttps;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>test.com</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The protocol type. Valid values:</p>
     * <ul>
     * <li><code>HTTP</code></li>
     * <li><code>HTTPS</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The TLS cipher suite configuration.</p>
     */
    @NameInMap("TlsCipherSuitesConfigJSON")
    public AddGatewayDomainRequestTlsCipherSuitesConfigJSON tlsCipherSuitesConfigJSON;

    /**
     * <p>The maximum TLS version.</p>
     * 
     * <strong>example:</strong>
     * <p>TLS 1.3</p>
     */
    @NameInMap("TlsMax")
    public String tlsMax;

    /**
     * <p>The minimum TLS version.</p>
     * 
     * <strong>example:</strong>
     * <p>TLS 1.0</p>
     */
    @NameInMap("TlsMin")
    public String tlsMin;

    public static AddGatewayDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayDomainRequest self = new AddGatewayDomainRequest();
        return TeaModel.build(map, self);
    }

    public AddGatewayDomainRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddGatewayDomainRequest setCaCertIdentifier(String caCertIdentifier) {
        this.caCertIdentifier = caCertIdentifier;
        return this;
    }
    public String getCaCertIdentifier() {
        return this.caCertIdentifier;
    }

    public AddGatewayDomainRequest setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public AddGatewayDomainRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public AddGatewayDomainRequest setHttp2(String http2) {
        this.http2 = http2;
        return this;
    }
    public String getHttp2() {
        return this.http2;
    }

    public AddGatewayDomainRequest setMtlsEnabled(Boolean mtlsEnabled) {
        this.mtlsEnabled = mtlsEnabled;
        return this;
    }
    public Boolean getMtlsEnabled() {
        return this.mtlsEnabled;
    }

    public AddGatewayDomainRequest setMustHttps(Boolean mustHttps) {
        this.mustHttps = mustHttps;
        return this;
    }
    public Boolean getMustHttps() {
        return this.mustHttps;
    }

    public AddGatewayDomainRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddGatewayDomainRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public AddGatewayDomainRequest setTlsCipherSuitesConfigJSON(AddGatewayDomainRequestTlsCipherSuitesConfigJSON tlsCipherSuitesConfigJSON) {
        this.tlsCipherSuitesConfigJSON = tlsCipherSuitesConfigJSON;
        return this;
    }
    public AddGatewayDomainRequestTlsCipherSuitesConfigJSON getTlsCipherSuitesConfigJSON() {
        return this.tlsCipherSuitesConfigJSON;
    }

    public AddGatewayDomainRequest setTlsMax(String tlsMax) {
        this.tlsMax = tlsMax;
        return this;
    }
    public String getTlsMax() {
        return this.tlsMax;
    }

    public AddGatewayDomainRequest setTlsMin(String tlsMin) {
        this.tlsMin = tlsMin;
        return this;
    }
    public String getTlsMin() {
        return this.tlsMin;
    }

    public static class AddGatewayDomainRequestTlsCipherSuitesConfigJSON extends TeaModel {
        /**
         * <p>The cipher suite configuration type.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <p>The list of cipher suite names.</p>
         */
        @NameInMap("TlsCipherSuites")
        public java.util.List<String> tlsCipherSuites;

        public static AddGatewayDomainRequestTlsCipherSuitesConfigJSON build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayDomainRequestTlsCipherSuitesConfigJSON self = new AddGatewayDomainRequestTlsCipherSuitesConfigJSON();
            return TeaModel.build(map, self);
        }

        public AddGatewayDomainRequestTlsCipherSuitesConfigJSON setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public AddGatewayDomainRequestTlsCipherSuitesConfigJSON setTlsCipherSuites(java.util.List<String> tlsCipherSuites) {
            this.tlsCipherSuites = tlsCipherSuites;
            return this;
        }
        public java.util.List<String> getTlsCipherSuites() {
            return this.tlsCipherSuites;
        }

    }

}
