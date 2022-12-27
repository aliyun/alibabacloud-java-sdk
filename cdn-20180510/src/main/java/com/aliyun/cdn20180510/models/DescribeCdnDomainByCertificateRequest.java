// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainByCertificateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    // The public key of the SSL certificate. You must encode the public key in Base64 and then call the encodeURIComponent function to encode the public key again.
    // 
    // The public key must be in the PEM format.
    @NameInMap("SSLPub")
    public String SSLPub;

    // Specifies whether the domain name list to return contains only domain names with HTTPS enabled or disabled.
    // 
    // - true: The domain name list contains only domain names with HTTPS enabled.
    // - false: The domain name list contains only domain names with HTTPS disabled.
    @NameInMap("SSLStatus")
    public Boolean SSLStatus;

    public static DescribeCdnDomainByCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainByCertificateRequest self = new DescribeCdnDomainByCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDomainByCertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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
