// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveCertificateDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Cert")
    @Validation(required = true)
    public String cert;

    @NameInMap("Key")
    @Validation(required = true)
    public String key;

    @NameInMap("CertId")
    @Validation(required = true)
    public Long certId;

    @NameInMap("CertName")
    @Validation(required = true)
    public String certName;

    public static DescribeLiveCertificateDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveCertificateDetailResponse self = new DescribeLiveCertificateDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveCertificateDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveCertificateDetailResponse setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public DescribeLiveCertificateDetailResponse setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeLiveCertificateDetailResponse setCertId(Long certId) {
        this.certId = certId;
        return this;
    }
    public Long getCertId() {
        return this.certId;
    }

    public DescribeLiveCertificateDetailResponse setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

}
