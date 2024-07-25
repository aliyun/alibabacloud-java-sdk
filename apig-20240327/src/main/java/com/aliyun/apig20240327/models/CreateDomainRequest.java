// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateDomainRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>194445-cn-hangzhou</p>
     */
    @NameInMap("caCertIndentifier")
    public String caCertIndentifier;

    /**
     * <strong>example:</strong>
     * <p>194445-cn-hangzhou</p>
     */
    @NameInMap("certIndentifier")
    public String certIndentifier;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("forceHttps")
    public Boolean forceHttps;

    /**
     * <strong>example:</strong>
     * <p>Open</p>
     */
    @NameInMap("http2Option")
    public String http2Option;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc.com</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <strong>example:</strong>
     * <p>TLS1.3</p>
     */
    @NameInMap("tlsMax")
    public String tlsMax;

    /**
     * <strong>example:</strong>
     * <p>TLS1.0</p>
     */
    @NameInMap("tlsMin")
    public String tlsMin;

    public static CreateDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainRequest self = new CreateDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateDomainRequest setCaCertIndentifier(String caCertIndentifier) {
        this.caCertIndentifier = caCertIndentifier;
        return this;
    }
    public String getCaCertIndentifier() {
        return this.caCertIndentifier;
    }

    public CreateDomainRequest setCertIndentifier(String certIndentifier) {
        this.certIndentifier = certIndentifier;
        return this;
    }
    public String getCertIndentifier() {
        return this.certIndentifier;
    }

    public CreateDomainRequest setForceHttps(Boolean forceHttps) {
        this.forceHttps = forceHttps;
        return this;
    }
    public Boolean getForceHttps() {
        return this.forceHttps;
    }

    public CreateDomainRequest setHttp2Option(String http2Option) {
        this.http2Option = http2Option;
        return this;
    }
    public String getHttp2Option() {
        return this.http2Option;
    }

    public CreateDomainRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDomainRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateDomainRequest setTlsMax(String tlsMax) {
        this.tlsMax = tlsMax;
        return this;
    }
    public String getTlsMax() {
        return this.tlsMax;
    }

    public CreateDomainRequest setTlsMin(String tlsMin) {
        this.tlsMin = tlsMin;
        return this;
    }
    public String getTlsMin() {
        return this.tlsMin;
    }

}
