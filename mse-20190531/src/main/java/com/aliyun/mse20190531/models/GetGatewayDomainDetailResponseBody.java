// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayDomainDetailResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data.</p>
     */
    @NameInMap("Data")
    public GetGatewayDomainDetailResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>You are not authorized to perform this operation.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>88B83302-CD88-54D3-8DF2-208BFDC73F0D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request is successful.</li>
     * <li><code>false</code>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetGatewayDomainDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayDomainDetailResponseBody self = new GetGatewayDomainDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayDomainDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetGatewayDomainDetailResponseBody setData(GetGatewayDomainDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGatewayDomainDetailResponseBodyData getData() {
        return this.data;
    }

    public GetGatewayDomainDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetGatewayDomainDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGatewayDomainDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGatewayDomainDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetGatewayDomainDetailResponseBodyDataTlsCipherSuitesConfig extends TeaModel {
        /**
         * <p>The TLS cipher suite configuration type. DEFAULT indicates the default configuration, and CUSTOM indicates the custom configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <p>The list of TLS cipher suite names.</p>
         */
        @NameInMap("TlsCipherSuites")
        public java.util.List<String> tlsCipherSuites;

        public static GetGatewayDomainDetailResponseBodyDataTlsCipherSuitesConfig build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayDomainDetailResponseBodyDataTlsCipherSuitesConfig self = new GetGatewayDomainDetailResponseBodyDataTlsCipherSuitesConfig();
            return TeaModel.build(map, self);
        }

        public GetGatewayDomainDetailResponseBodyDataTlsCipherSuitesConfig setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public GetGatewayDomainDetailResponseBodyDataTlsCipherSuitesConfig setTlsCipherSuites(java.util.List<String> tlsCipherSuites) {
            this.tlsCipherSuites = tlsCipherSuites;
            return this;
        }
        public java.util.List<String> getTlsCipherSuites() {
            return this.tlsCipherSuites;
        }

    }

    public static class GetGatewayDomainDetailResponseBodyData extends TeaModel {
        /**
         * <p>The certificate expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-01 02:35:12</p>
         */
        @NameInMap("AfterDate")
        public Long afterDate;

        /**
         * <p>The algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <p>The certificate issuance time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-01 02:35:12</p>
         */
        @NameInMap("BeforeDate")
        public Long beforeDate;

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
         * <p>The certificate identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>234-cn-hangzhou</p>
         */
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        /**
         * <p>The certificate name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The public domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>Indicates whether WAF protection is enabled for the domain name.</p>
         */
        @NameInMap("EnableWaf")
        public Boolean enableWaf;

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-7ea3da97b96543e19f6c597cd4a9****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The certificate expiration time in GMT.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-01 02:35:12</p>
         */
        @NameInMap("GmtAfter")
        public String gmtAfter;

        /**
         * <p>The certificate issuance time in GMT.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-01 02:35:12</p>
         */
        @NameInMap("GmtBefore")
        public String gmtBefore;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-07T10:07:57.000+0000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-07T10:07:57.000+0000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Indicates whether HTTP/2 is enabled. Valid values:</p>
         * <ul>
         * <li><code>open</code>: HTTP/2 is enabled.</li>
         * <li><code>close</code>: HTTP/2 is disabled.</li>
         * <li><code>globalConfig</code>: The global configuration is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>close</p>
         */
        @NameInMap("Http2")
        public String http2;

        /**
         * <p>The ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the domain name is managed.</p>
         */
        @NameInMap("IsManaged")
        public Boolean isManaged;

        /**
         * <p>The issuer.</p>
         * 
         * <strong>example:</strong>
         * <p>Istio</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>Indicates whether mTLS is enabled.</p>
         */
        @NameInMap("MtlsEnabled")
        public Boolean mtlsEnabled;

        /**
         * <p>Indicates whether HTTPS is forced.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MustHttps")
        public Boolean mustHttps;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The gateway protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The subject alternative names.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("Sans")
        public String sans;

        /**
         * <p>Indicates whether the gateway supports WAF protection.</p>
         */
        @NameInMap("SupportWaf")
        public Boolean supportWaf;

        /**
         * <p>The TLS cipher suite configuration, including the configuration type and the list of cipher suite names.</p>
         */
        @NameInMap("TlsCipherSuitesConfig")
        public GetGatewayDomainDetailResponseBodyDataTlsCipherSuitesConfig tlsCipherSuitesConfig;

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

        public static GetGatewayDomainDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayDomainDetailResponseBodyData self = new GetGatewayDomainDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGatewayDomainDetailResponseBodyData setAfterDate(Long afterDate) {
            this.afterDate = afterDate;
            return this;
        }
        public Long getAfterDate() {
            return this.afterDate;
        }

        public GetGatewayDomainDetailResponseBodyData setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public GetGatewayDomainDetailResponseBodyData setBeforeDate(Long beforeDate) {
            this.beforeDate = beforeDate;
            return this;
        }
        public Long getBeforeDate() {
            return this.beforeDate;
        }

        public GetGatewayDomainDetailResponseBodyData setCaCertIdentifier(String caCertIdentifier) {
            this.caCertIdentifier = caCertIdentifier;
            return this;
        }
        public String getCaCertIdentifier() {
            return this.caCertIdentifier;
        }

        public GetGatewayDomainDetailResponseBodyData setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        public GetGatewayDomainDetailResponseBodyData setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public GetGatewayDomainDetailResponseBodyData setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public GetGatewayDomainDetailResponseBodyData setEnableWaf(Boolean enableWaf) {
            this.enableWaf = enableWaf;
            return this;
        }
        public Boolean getEnableWaf() {
            return this.enableWaf;
        }

        public GetGatewayDomainDetailResponseBodyData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public GetGatewayDomainDetailResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public GetGatewayDomainDetailResponseBodyData setGmtAfter(String gmtAfter) {
            this.gmtAfter = gmtAfter;
            return this;
        }
        public String getGmtAfter() {
            return this.gmtAfter;
        }

        public GetGatewayDomainDetailResponseBodyData setGmtBefore(String gmtBefore) {
            this.gmtBefore = gmtBefore;
            return this;
        }
        public String getGmtBefore() {
            return this.gmtBefore;
        }

        public GetGatewayDomainDetailResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetGatewayDomainDetailResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetGatewayDomainDetailResponseBodyData setHttp2(String http2) {
            this.http2 = http2;
            return this;
        }
        public String getHttp2() {
            return this.http2;
        }

        public GetGatewayDomainDetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetGatewayDomainDetailResponseBodyData setIsManaged(Boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public Boolean getIsManaged() {
            return this.isManaged;
        }

        public GetGatewayDomainDetailResponseBodyData setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public GetGatewayDomainDetailResponseBodyData setMtlsEnabled(Boolean mtlsEnabled) {
            this.mtlsEnabled = mtlsEnabled;
            return this;
        }
        public Boolean getMtlsEnabled() {
            return this.mtlsEnabled;
        }

        public GetGatewayDomainDetailResponseBodyData setMustHttps(Boolean mustHttps) {
            this.mustHttps = mustHttps;
            return this;
        }
        public Boolean getMustHttps() {
            return this.mustHttps;
        }

        public GetGatewayDomainDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayDomainDetailResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetGatewayDomainDetailResponseBodyData setSans(String sans) {
            this.sans = sans;
            return this;
        }
        public String getSans() {
            return this.sans;
        }

        public GetGatewayDomainDetailResponseBodyData setSupportWaf(Boolean supportWaf) {
            this.supportWaf = supportWaf;
            return this;
        }
        public Boolean getSupportWaf() {
            return this.supportWaf;
        }

        public GetGatewayDomainDetailResponseBodyData setTlsCipherSuitesConfig(GetGatewayDomainDetailResponseBodyDataTlsCipherSuitesConfig tlsCipherSuitesConfig) {
            this.tlsCipherSuitesConfig = tlsCipherSuitesConfig;
            return this;
        }
        public GetGatewayDomainDetailResponseBodyDataTlsCipherSuitesConfig getTlsCipherSuitesConfig() {
            return this.tlsCipherSuitesConfig;
        }

        public GetGatewayDomainDetailResponseBodyData setTlsMax(String tlsMax) {
            this.tlsMax = tlsMax;
            return this;
        }
        public String getTlsMax() {
            return this.tlsMax;
        }

        public GetGatewayDomainDetailResponseBodyData setTlsMin(String tlsMin) {
            this.tlsMin = tlsMin;
            return this;
        }
        public String getTlsMin() {
            return this.tlsMin;
        }

    }

}
