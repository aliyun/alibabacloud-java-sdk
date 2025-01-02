// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateDomainRequest extends TeaModel {
    @NameInMap("caCertIdentifier")
    public String caCertIdentifier;

    @NameInMap("certIdentifier")
    public String certIdentifier;

    /**
     * <p>Set the HTTPS protocol type, whether to enable forced HTTPS redirection.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("forceHttps")
    public Boolean forceHttps;

    /**
     * <p>HTTP/2 settings.</p>
     * 
     * <strong>example:</strong>
     * <p>Open</p>
     */
    @NameInMap("http2Option")
    public String http2Option;

    /**
     * <p>The protocol type supported by the domain.</p>
     * <ul>
     * <li>HTTP: Supports only HTTP protocol.</li>
     * <li>HTTPS: Supports only HTTPS protocol.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <p>TLS Cipher Suite Configuration.</p>
     */
    @NameInMap("tlsCipherSuitesConfig")
    public TlsCipherSuitesConfig tlsCipherSuitesConfig;

    /**
     * <p>Maximum TLS protocol version, supports up to TLS 1.3.</p>
     * 
     * <strong>example:</strong>
     * <p>TLS 1.3</p>
     */
    @NameInMap("tlsMax")
    public String tlsMax;

    /**
     * <p>Minimum TLS protocol version, supports down to TLS 1.0.</p>
     * 
     * <strong>example:</strong>
     * <p>TLS 1.0</p>
     */
    @NameInMap("tlsMin")
    public String tlsMin;

    public static UpdateDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainRequest self = new UpdateDomainRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDomainRequest setCaCertIdentifier(String caCertIdentifier) {
        this.caCertIdentifier = caCertIdentifier;
        return this;
    }
    public String getCaCertIdentifier() {
        return this.caCertIdentifier;
    }

    public UpdateDomainRequest setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public UpdateDomainRequest setForceHttps(Boolean forceHttps) {
        this.forceHttps = forceHttps;
        return this;
    }
    public Boolean getForceHttps() {
        return this.forceHttps;
    }

    public UpdateDomainRequest setHttp2Option(String http2Option) {
        this.http2Option = http2Option;
        return this;
    }
    public String getHttp2Option() {
        return this.http2Option;
    }

    public UpdateDomainRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdateDomainRequest setTlsCipherSuitesConfig(TlsCipherSuitesConfig tlsCipherSuitesConfig) {
        this.tlsCipherSuitesConfig = tlsCipherSuitesConfig;
        return this;
    }
    public TlsCipherSuitesConfig getTlsCipherSuitesConfig() {
        return this.tlsCipherSuitesConfig;
    }

    public UpdateDomainRequest setTlsMax(String tlsMax) {
        this.tlsMax = tlsMax;
        return this;
    }
    public String getTlsMax() {
        return this.tlsMax;
    }

    public UpdateDomainRequest setTlsMin(String tlsMin) {
        this.tlsMin = tlsMin;
        return this;
    }
    public String getTlsMin() {
        return this.tlsMin;
    }

}
