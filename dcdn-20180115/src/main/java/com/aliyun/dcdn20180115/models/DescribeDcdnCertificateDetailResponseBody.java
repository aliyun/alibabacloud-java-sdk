// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnCertificateDetailResponseBody extends TeaModel {
    @NameInMap("Cert")
    public String cert;

    @NameInMap("CertId")
    public Long certId;

    @NameInMap("CertName")
    public String certName;

    @NameInMap("Key")
    public String key;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnCertificateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnCertificateDetailResponseBody self = new DescribeDcdnCertificateDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnCertificateDetailResponseBody setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public DescribeDcdnCertificateDetailResponseBody setCertId(Long certId) {
        this.certId = certId;
        return this;
    }
    public Long getCertId() {
        return this.certId;
    }

    public DescribeDcdnCertificateDetailResponseBody setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public DescribeDcdnCertificateDetailResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeDcdnCertificateDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
