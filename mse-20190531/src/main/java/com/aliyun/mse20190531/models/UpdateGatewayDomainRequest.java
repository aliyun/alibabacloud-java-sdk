// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayDomainRequest extends TeaModel {
    /**
     * <p>The language of the returned information. Valid values:</p>
     * <ul>
     * <li>zh: Chinese (default).</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The CA certificate content.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----
     * MIIFazCCA1OgAwIBAgIRAIIQz7DSQONZRGPgu2OCiwAwDQYJKoZIhvcNAQELBQAw
     * TzELMAkGA1UEBhMCVVMxKTAnBgNVBAoTIEludGVybmV0IFNlY3VyaXR5IFJlc2Vh
     * cmNoIEdyb3VwMRUwEwYDVQQDEwxJU1JHIFJvb3QgWDEwHhcNMTUwNjA0MTEwNDM4
     * WhcNMzUwNjA0MTEwNDM4WjBPMQswCQYDVQQGEwJVUzEpMCcGA1UEChMgSW50ZXJu
     * ZXQgU2VjdXJpdHkgUmVzZWFyY2ggR3JvdXAxFTATBgNVBAMTDElTUkcgUm9vdCBY
     * MTCCAiIwDQYJKoZIhvcNAQEBBQADggIPADCCAgoCggIBAK3oJHP0FDfzm54rVygc
     * h77ct984kIxuPOZXoHj3dcKi/vVqbvYATyjb3miGbESTtrFj/RQSa78f0uoxmyF+
     * 0TM8ukj13Xnfs7j/EvEhmkvBioZxaUpmZmyPfjxwv60pIgbz5MDmgK7iS4+3mX6U
     * A5/TR5d8mUgjU+g4rk8Kb4Mu0UlXjIB0ttov0DiNewNwIRt18jA8+o+u3dpjq+sW
     * T8KOEUt+zwvo/7V3LvSye0rgTBIlDHCNAymg4VMk7BPZ7hm/ELNKjD+Jo2FR3qyH
     * B5T0Y3HsLuJvW5iB4YlcNHlsdu87kGJ55tukmi8mxdAQ4Q7e2RCOFvu396j3x+UC
     * B5iPNgiV5+I3lg02dZ77DnKxHZu8A/lJBdiB3QW0KtZB6awBdpUKD9jf1b0SHzUv
     * KBds0pjBqAlkd25HN7rOrFleaJ1/ctaJxQZBKT5ZPt0m9STJEadao0xAH0ahmbWn
     * OlFuhjuefXKnEgV4We0+UXgVCwOPjdAvBbI+e0ocS3MFEvzG6uBQE3xDk3SzynTn
     * jh8BCNAw1FtxNrQHusEwMFxIt4I7mKZ9YIqioymCzLq9gwQbooMDQaHWBfEbwrbw
     * qHyGO0aoSCqI3Haadr8faqU9GY/rOPNk3sgrDQoo//fb4hVC1CLQJ13hef4Y53CI
     * rU7m2Ys6xt0nUW7/vGT1M0NPAgMBAAGjQjBAMA4GA1UdDwEB/wQEAwIBBjAPBgNV
     * HRMBAf8EBTADAQH/MB0GA1UdDgQWBBR5tFnme7bl5AFzgAiIyBpY9umbbjANBgkq
     * hkiG9w0BAQsFAAOCAgEAVR9YqbyyqFDQDLHYGmkgJykIrGF1XIpu+ILlaS/V9lZL
     * ubhzEFnTIZd+50xx+7LSYK05qAvqFyFWhfFQDlnrzuBZ6brJFe+GnY+EgPbk6ZGQ
     * 3BebYhtF8GaV0nxvwuo77x/Py9auJ/GpsMiu/X1+mvoiBOv/2X/qkSsisRcOj/KK
     * NFtY2PwByVS5uCbMiogziUwthDyC3+6WVwW6LLv3xLfHTjuCvjHIInNzktHCgKQ5
     * ORAzI4JMPJ+GslWYHb4phowim57iaztXOoJwTdwJx4nLCgdNbOhdjsnvzqvHu7Ur
     * TkXWStAmzOVyyghqpZXjFaH3pO3JLF+l+/+sKAIuvtd7u+Nxe5AW0wdeRlN8NwdC
     * jNPElpzVmbUq4JUagEiuTDkHzsxHpFKVK7q4+63SM1N95R1NbdWhscdCb+ZAJzVc
     * oyi3B43njTOQ5yOf+1CceWxG1bQVs5ZufpsMljq4Ui0/1lvh+wjChP4kqKOJ2qxq
     * 4RgqsahDYVvTH9w7jXbyLeiNdd8XM2w9U/t7y0Ff/9yi0GE44Za4rF2LN9d11TPA
     * mRGunUHBcnWEvgJBQl9nJEiU0Zsnvgc/ubhPgXRR4Xq37Z0j4r7g1SgEEzwxA57d
     * emyPxgcYxn/eR44/KJ4EBs+lVDR3veyJm+kXQ99b21/+jh5Xos1AnX5iItreGCc=
     * -----END CERTIFICATE-----</p>
     */
    @NameInMap("CaCertIdentifier")
    public String caCertIdentifier;

    /**
     * <p>The certificate ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6209108-cn-hangzhou</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    /**
     * <p>Specifies whether to enable Web Application Firewall (WAF) for the gateway domain name.</p>
     */
    @NameInMap("EnableWaf")
    public Boolean enableWaf;

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
     * <li><code>open</code>: enables HTTP/2.</li>
     * <li><code>close</code>: disables HTTP/2.</li>
     * <li><code>globalConfig</code>: uses the global configuration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>close</p>
     */
    @NameInMap("Http2")
    public String http2;

    /**
     * <p>The ID of the domain name to be updated.</p>
     * 
     * <strong>example:</strong>
     * <p>94</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Specifies whether to enable mTLS.</p>
     */
    @NameInMap("MtlsEnabled")
    public Boolean mtlsEnabled;

    /**
     * <p>Specifies whether to force HTTPS.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MustHttps")
    public Boolean mustHttps;

    /**
     * <p>The protocol type. Valid values:</p>
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

    /**
     * <p>The TLS cipher suite configuration.</p>
     */
    @NameInMap("TlsCipherSuitesConfigJSON")
    public UpdateGatewayDomainRequestTlsCipherSuitesConfigJSON tlsCipherSuitesConfigJSON;

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

    public UpdateGatewayDomainRequest setEnableWaf(Boolean enableWaf) {
        this.enableWaf = enableWaf;
        return this;
    }
    public Boolean getEnableWaf() {
        return this.enableWaf;
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
        /**
         * <p>The cipher suite configuration type. Valid values:</p>
         * <ul>
         * <li>DEFAULT</li>
         * <li>CUSTOM</li>
         * </ul>
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
