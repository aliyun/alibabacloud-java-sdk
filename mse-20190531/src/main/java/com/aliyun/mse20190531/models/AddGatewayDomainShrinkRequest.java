// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayDomainShrinkRequest extends TeaModel {
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

    /**
     * <p>The ID of the certificate.</p>
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
     * <p>Specifies whether to enable <code>HTTP/2</code>.</p>
     * <ul>
     * <li><code>open</code>: enables <code>HTTP/2</code></li>
     * <li><code>close</code>: disables <code>HTTP/2</code></li>
     * <li><code>globalConfig</code>: uses global configurations</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>close</p>
     */
    @NameInMap("Http2")
    public String http2;

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
     * <p>The type of the protocol. Valid values:</p>
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

    @NameInMap("TlsCipherSuitesConfigJSON")
    public String tlsCipherSuitesConfigJSONShrink;

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

    public static AddGatewayDomainShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayDomainShrinkRequest self = new AddGatewayDomainShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddGatewayDomainShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddGatewayDomainShrinkRequest setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public AddGatewayDomainShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public AddGatewayDomainShrinkRequest setHttp2(String http2) {
        this.http2 = http2;
        return this;
    }
    public String getHttp2() {
        return this.http2;
    }

    public AddGatewayDomainShrinkRequest setMustHttps(Boolean mustHttps) {
        this.mustHttps = mustHttps;
        return this;
    }
    public Boolean getMustHttps() {
        return this.mustHttps;
    }

    public AddGatewayDomainShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddGatewayDomainShrinkRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public AddGatewayDomainShrinkRequest setTlsCipherSuitesConfigJSONShrink(String tlsCipherSuitesConfigJSONShrink) {
        this.tlsCipherSuitesConfigJSONShrink = tlsCipherSuitesConfigJSONShrink;
        return this;
    }
    public String getTlsCipherSuitesConfigJSONShrink() {
        return this.tlsCipherSuitesConfigJSONShrink;
    }

    public AddGatewayDomainShrinkRequest setTlsMax(String tlsMax) {
        this.tlsMax = tlsMax;
        return this;
    }
    public String getTlsMax() {
        return this.tlsMax;
    }

    public AddGatewayDomainShrinkRequest setTlsMin(String tlsMin) {
        this.tlsMin = tlsMin;
        return this;
    }
    public String getTlsMin() {
        return this.tlsMin;
    }

}
