// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainByCertificateRequest extends TeaModel {
    /**
     * <p>The public key of the certificate.</p>
     * <br>
     * <p>You must use Base64 encoding schemes and then the encodeURIComponent method to encode the public key. PEM files are supported.</p>
     */
    @NameInMap("SSLPub")
    public String SSLPub;

    /**
     * <p>Specifies whether the domain name list to return contains only domain names with HTTPS enabled or disabled.</p>
     * <br>
     * <p>*   true: The list contains only domain names with HTTPS enabled.</p>
     * <p>*   false: The list contains only domain names with HTTPS disabled.</p>
     */
    @NameInMap("SSLStatus")
    public Boolean SSLStatus;

    public static DescribeDcdnDomainByCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainByCertificateRequest self = new DescribeDcdnDomainByCertificateRequest();
        return TeaModel.build(map, self);
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
