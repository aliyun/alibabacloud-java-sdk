// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateDomainRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123455-cn-hangzhou</p>
     */
    @NameInMap("caCertIndentifier")
    public String caCertIndentifier;

    /**
     * <strong>example:</strong>
     * <p>123458-cn-hangzhou</p>
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
     * <p>HTTP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <strong>example:</strong>
     * <p>TLS 1.3</p>
     */
    @NameInMap("tlsMax")
    public String tlsMax;

    /**
     * <strong>example:</strong>
     * <p>TLS 1.0</p>
     */
    @NameInMap("tlsMin")
    public String tlsMin;

    public static UpdateDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainRequest self = new UpdateDomainRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDomainRequest setCaCertIndentifier(String caCertIndentifier) {
        this.caCertIndentifier = caCertIndentifier;
        return this;
    }
    public String getCaCertIndentifier() {
        return this.caCertIndentifier;
    }

    public UpdateDomainRequest setCertIndentifier(String certIndentifier) {
        this.certIndentifier = certIndentifier;
        return this;
    }
    public String getCertIndentifier() {
        return this.certIndentifier;
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
