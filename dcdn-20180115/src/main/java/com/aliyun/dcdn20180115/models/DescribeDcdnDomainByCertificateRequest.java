// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainByCertificateRequest extends TeaModel {
    /**
     * <p>Specifies whether the domain name list to return matches the SSL certificate.</p>
     * <ul>
     * <li><strong>true</strong>: The domain name list matches the SSL certificate.</li>
     * <li><strong>false</strong>: The domain name list does not match the SSL certificate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Exact")
    public Boolean exact;

    /**
     * <p>The public key of the certificate.</p>
     * <p>You must use Base64 encoding schemes and then the encodeURIComponent method to encode the public key. PEM files are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("SSLPub")
    public String SSLPub;

    /**
     * <p>Specifies whether the domain name list to return contains only domain names with HTTPS enabled or disabled.</p>
     * <ul>
     * <li>true: The list contains only domain names with HTTPS enabled.</li>
     * <li>false: The list contains only domain names with HTTPS disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SSLStatus")
    public Boolean SSLStatus;

    public static DescribeDcdnDomainByCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainByCertificateRequest self = new DescribeDcdnDomainByCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainByCertificateRequest setExact(Boolean exact) {
        this.exact = exact;
        return this;
    }
    public Boolean getExact() {
        return this.exact;
    }

    public DescribeDcdnDomainByCertificateRequest setSSLPub(String SSLPub) {
        this.SSLPub = SSLPub;
        return this;
    }
    public String getSSLPub() {
        return this.SSLPub;
    }

    public DescribeDcdnDomainByCertificateRequest setSSLStatus(Boolean SSLStatus) {
        this.SSLStatus = SSLStatus;
        return this;
    }
    public Boolean getSSLStatus() {
        return this.SSLStatus;
    }

}
