// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnCertificateDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CertId")
    public Long certId;

    @NameInMap("CertName")
    public String certName;

    @NameInMap("Cert")
    public String cert;

    @NameInMap("Key")
    public String key;

    public static DescribeCdnCertificateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnCertificateDetailResponseBody self = new DescribeCdnCertificateDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnCertificateDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public DescribeCdnCertificateDetailResponseBody setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public DescribeCdnCertificateDetailResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
