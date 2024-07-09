// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainByCertificateRequest extends TeaModel {
    /**
     * <p>Specifies whether the domain name list to return match the SSL certificate.</p>
     * <ul>
     * <li>true: The domain name list match the SSL certificate.</li>
     * <li>false: The domain name list do not match the SSL certificate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Exact")
    public Boolean exact;

    /**
     * <p>The public key of the SSL certificate. You must encode the public key in Base64 and then call the encodeURIComponent function to encode the public key again.</p>
     * <p>The public key must be in the PEM format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SSLPub")
    public String SSLPub;

    /**
     * <p>Specifies whether the domain name list to return contains only domain names with HTTPS enabled or disabled.</p>
     * <ul>
     * <li>true: The domain name list contains only domain names with HTTPS enabled.</li>
     * <li>false: The domain name list contains only domain names with HTTPS disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
