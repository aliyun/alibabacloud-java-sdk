// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateDomainRequest extends TeaModel {
    /**
     * <p>The CA certificate identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>1ef1da5f-38ed-69b3-****-037781890265</p>
     */
    @NameInMap("caCertIdentifier")
    public String caCertIdentifier;

    /**
     * <p>The certificate identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>1ef1da5f-38ed-69b3-****-037781890265</p>
     */
    @NameInMap("certIdentifier")
    public String certIdentifier;

    /**
     * <p>The client CA certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----
     * MIIFBTCCAu2gAwIBAgIUORLpYPGSFD1YOP6PMbE7Wd/mpTQwDQYJKoZIhvcNAQEL
     * BQAwE************************************************2VwVOJ2gqX3
     * YuGaxvIbDy0iQJ1GMerPRyzJTeVEtdIKT29u0PdFRr4KZWom35qX7G4=
     * -----END CERTIFICATE-----</p>
     */
    @NameInMap("clientCACert")
    public String clientCACert;

    /**
     * <p>The scope of the domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>Dedicated</p>
     */
    @NameInMap("domainScope")
    public String domainScope;

    /**
     * <p>Specifies whether to enable forced HTTPS redirect when the protocol type is set to HTTPS. This parameter is required when the protocol is HTTPS.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("forceHttps")
    public Boolean forceHttps;

    /**
     * <p>The HTTP/2 settings.</p>
     * 
     * <strong>example:</strong>
     * <p>Open</p>
     */
    @NameInMap("http2Option")
    public String http2Option;

    /**
     * <p>Specifies whether to enable mutual TLS (mTLS) authentication.</p>
     */
    @NameInMap("mTLSEnabled")
    public Boolean mTLSEnabled;

    /**
     * <p>The protocol type supported by the domain name.</p>
     * <ul>
     * <li>HTTP: Only HTTP is supported.</li>
     * <li>HTTPS: Only HTTPS is supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <p>The cipher suite configuration.</p>
     */
    @NameInMap("tlsCipherSuitesConfig")
    public TlsCipherSuitesConfig tlsCipherSuitesConfig;

    /**
     * <p>The maximum TLS protocol version. TLS 1.3 is the maximum supported version.</p>
     * 
     * <strong>example:</strong>
     * <p>TLS 1.3</p>
     */
    @NameInMap("tlsMax")
    public String tlsMax;

    /**
     * <p>The minimum TLS protocol version. TLS 1.0 is the minimum supported version.</p>
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

    public UpdateDomainRequest setClientCACert(String clientCACert) {
        this.clientCACert = clientCACert;
        return this;
    }
    public String getClientCACert() {
        return this.clientCACert;
    }

    public UpdateDomainRequest setDomainScope(String domainScope) {
        this.domainScope = domainScope;
        return this;
    }
    public String getDomainScope() {
        return this.domainScope;
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

    public UpdateDomainRequest setMTLSEnabled(Boolean mTLSEnabled) {
        this.mTLSEnabled = mTLSEnabled;
        return this;
    }
    public Boolean getMTLSEnabled() {
        return this.mTLSEnabled;
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
