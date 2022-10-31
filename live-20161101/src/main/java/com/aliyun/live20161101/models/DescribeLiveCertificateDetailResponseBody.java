// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveCertificateDetailResponseBody extends TeaModel {
    @NameInMap("Cert")
    public String cert;

    @NameInMap("CertId")
    public Long certId;

    @NameInMap("CertName")
    public String certName;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveCertificateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveCertificateDetailResponseBody self = new DescribeLiveCertificateDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveCertificateDetailResponseBody setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public DescribeLiveCertificateDetailResponseBody setCertId(Long certId) {
        this.certId = certId;
        return this;
    }
    public Long getCertId() {
        return this.certId;
    }

    public DescribeLiveCertificateDetailResponseBody setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public DescribeLiveCertificateDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
