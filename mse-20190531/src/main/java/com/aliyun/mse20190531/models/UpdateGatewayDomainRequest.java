// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayDomainRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the certificate.
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    // The unique ID of the gateway.
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    // Specifies whether to enable `HTTP/2`.
    // 
    // *   `open`: enables `HTTP/2`
    // *   `close`: disables `HTTP/2`
    // *   `globalConfig`: uses global configurations
    @NameInMap("Http2")
    public String http2;

    // The ID of the domain name.
    @NameInMap("Id")
    public Long id;

    // Specifies whether to forcibly use HTTPS.
    @NameInMap("MustHttps")
    public Boolean mustHttps;

    // The type of the protocol. Valid values:
    // 
    // *   HTTPS
    // *   HTTP
    @NameInMap("Protocol")
    public String protocol;

    // The maximum version of Transport Layer Security (TLS).
    @NameInMap("TlsMax")
    public String tlsMax;

    // The minimum version of TLS.
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

}
