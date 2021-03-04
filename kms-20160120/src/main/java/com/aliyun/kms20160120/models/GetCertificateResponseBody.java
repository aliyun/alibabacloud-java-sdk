// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetCertificateResponseBody extends TeaModel {
    @NameInMap("Csr")
    public String csr;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CertificateId")
    public String certificateId;

    @NameInMap("CertificateChain")
    public String certificateChain;

    @NameInMap("Certificate")
    public String certificate;

    public static GetCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCertificateResponseBody self = new GetCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCertificateResponseBody setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public GetCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCertificateResponseBody setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public GetCertificateResponseBody setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }
    public String getCertificateChain() {
        return this.certificateChain;
    }

    public GetCertificateResponseBody setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

}
