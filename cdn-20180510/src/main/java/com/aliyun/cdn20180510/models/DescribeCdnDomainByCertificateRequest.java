// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainByCertificateRequest extends TeaModel {
    /**
     * <p>Specifies whether the domain name list to return match the SSL certificate.</p>
     * <br>
     * <p>*   true: The domain name list match the SSL certificate.</p>
     * <p>*   false: The domain name list do not match the SSL certificate.</p>
     */
    @NameInMap("Exact")
    public Boolean exact;

    /**
     * <p>The public key of the SSL certificate. You must encode the public key in Base64 and then call the encodeURIComponent function to encode the public key again.</p>
     * <br>
     * <p>The public key must be in the PEM format.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SSLPub")
    public String SSLPub;

    /**
     * <p>Specifies whether the domain name list to return contains only domain names with HTTPS enabled or disabled.</p>
     * <br>
     * <p>*   true: The domain name list contains only domain names with HTTPS enabled.</p>
     * <p>*   false: The domain name list contains only domain names with HTTPS disabled.</p>
     */
    @NameInMap("SSLStatus")
    public Boolean SSLStatus;

    public static DescribeCdnDomainByCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainByCertificateRequest self = new DescribeCdnDomainByCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDomainByCertificateRequest setExact(Boolean exact) {
        this.exact = exact;
        return this;
    }
    public Boolean getExact() {
        return this.exact;
    }

    public DescribeCdnDomainByCertificateRequest setSSLPub(String SSLPub) {
        this.SSLPub = SSLPub;
        return this;
    }
    public String getSSLPub() {
        return this.SSLPub;
    }

    public DescribeCdnDomainByCertificateRequest setSSLStatus(Boolean SSLStatus) {
        this.SSLStatus = SSLStatus;
        return this;
    }
    public Boolean getSSLStatus() {
        return this.SSLStatus;
    }

}
