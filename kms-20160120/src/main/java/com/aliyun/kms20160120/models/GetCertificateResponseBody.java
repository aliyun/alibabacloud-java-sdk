// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetCertificateResponseBody extends TeaModel {
    /**
     * <p>The certificate in the Privacy Enhanced Mail (PEM) format.</p>
     */
    @NameInMap("Certificate")
    public String certificate;

    /**
     * <p>The certificate chain in the PEM format.</p>
     */
    @NameInMap("CertificateChain")
    public String certificateChain;

    /**
     * <p>The ID of the certificate.</p>
     */
    @NameInMap("CertificateId")
    public String certificateId;

    /**
     * <p>The CSR in the PEM format.</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCertificateResponseBody self = new GetCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCertificateResponseBody setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public GetCertificateResponseBody setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }
    public String getCertificateChain() {
        return this.certificateChain;
    }

    public GetCertificateResponseBody setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
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

}
