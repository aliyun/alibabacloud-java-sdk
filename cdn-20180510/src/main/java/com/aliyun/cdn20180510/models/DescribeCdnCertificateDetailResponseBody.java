// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnCertificateDetailResponseBody extends TeaModel {
    // The content of the SSL certificate.
    @NameInMap("Cert")
    public String cert;

    // The ID of the SSL certificate.
    @NameInMap("CertId")
    public Long certId;

    // The name of the SSL certificate.
    @NameInMap("CertName")
    public String certName;

    // The key of the SSL certificate.
    @NameInMap("Key")
    public String key;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnCertificateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnCertificateDetailResponseBody self = new DescribeCdnCertificateDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnCertificateDetailResponseBody setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public DescribeCdnCertificateDetailResponseBody setCertId(Long certId) {
        this.certId = certId;
        return this;
    }
    public Long getCertId() {
        return this.certId;
    }

    public DescribeCdnCertificateDetailResponseBody setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public DescribeCdnCertificateDetailResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeCdnCertificateDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
