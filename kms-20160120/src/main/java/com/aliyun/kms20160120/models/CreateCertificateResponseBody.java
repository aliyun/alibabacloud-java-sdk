// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateCertificateResponseBody extends TeaModel {
    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the certificate.</p>
     */
    @NameInMap("Arn")
    public String arn;

    /**
     * <p>The ID of the certificate. It is the globally unique identifier (GUID) of the certificate in Certificates Manager.</p>
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

    public static CreateCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateResponseBody self = new CreateCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCertificateResponseBody setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public CreateCertificateResponseBody setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public CreateCertificateResponseBody setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public CreateCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
