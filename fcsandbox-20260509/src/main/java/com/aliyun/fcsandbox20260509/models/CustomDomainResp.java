// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CustomDomainResp extends TeaModel {
    /**
     * <p>The certificate configuration used by the domain name.</p>
     */
    @NameInMap("certConfig")
    public CertConfig certConfig;

    /**
     * <p>The creation time of the custom domain name.</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <p>The description of the custom domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom domain name for the production cloud sandbox</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The custom domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>api.example.com</p>
     */
    @NameInMap("domainName")
    public String domainName;

    /**
     * <p>The TLS configuration used by the domain name.</p>
     */
    @NameInMap("tlsConfig")
    public TLSConfig tlsConfig;

    /**
     * <p>The last update time of the custom domain name.</p>
     */
    @NameInMap("updatedAt")
    public Long updatedAt;

    public static CustomDomainResp build(java.util.Map<String, ?> map) throws Exception {
        CustomDomainResp self = new CustomDomainResp();
        return TeaModel.build(map, self);
    }

    public CustomDomainResp setCertConfig(CertConfig certConfig) {
        this.certConfig = certConfig;
        return this;
    }
    public CertConfig getCertConfig() {
        return this.certConfig;
    }

    public CustomDomainResp setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public CustomDomainResp setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CustomDomainResp setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CustomDomainResp setTlsConfig(TLSConfig tlsConfig) {
        this.tlsConfig = tlsConfig;
        return this;
    }
    public TLSConfig getTlsConfig() {
        return this.tlsConfig;
    }

    public CustomDomainResp setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
