// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayDomainRequest extends TeaModel {
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

    // Specifies whether to enable HTTPS.
    @NameInMap("MustHttps")
    public Boolean mustHttps;

    // The domain name.
    @NameInMap("Name")
    public String name;

    // The type of the protocol. Valid values:
    // 
    // *   `HTTP`
    // *   `HTTPS`
    @NameInMap("Protocol")
    public String protocol;

    // The maximum version of Transport Layer Security (TLS).
    @NameInMap("TlsMax")
    public String tlsMax;

    // The minimum version of TLS.
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

}
