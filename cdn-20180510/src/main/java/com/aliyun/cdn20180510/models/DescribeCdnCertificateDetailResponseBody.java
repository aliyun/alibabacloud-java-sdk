// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnCertificateDetailResponseBody extends TeaModel {
    @NameInMap("CertName")
    public String certName;

    @NameInMap("Key")
    public String key;

    @NameInMap("Cert")
    public String cert;

    @NameInMap("CertId")
    public Long certId;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnCertificateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnCertificateDetailResponseBody self = new DescribeCdnCertificateDetailResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeCdnCertificateDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
