// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class DescribeSSLCertificatePublicKeyDetailRequest extends TeaModel {
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    public static DescribeSSLCertificatePublicKeyDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSSLCertificatePublicKeyDetailRequest self = new DescribeSSLCertificatePublicKeyDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSSLCertificatePublicKeyDetailRequest setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

}
