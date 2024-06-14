// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UploadCertificateRequest extends TeaModel {
    /**
     * <p>The certificate issued by the CA, which is in the Privacy Enhanced Mail (PEM) format.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Certificate")
    public String certificate;

    /**
     * <p>The certificate chain issued by the CA, which is in the PEM format.</p>
     */
    @NameInMap("CertificateChain")
    public String certificateChain;

    /**
     * <p>The ID of the certificate. The ID must be globally unique in Certificates Manager.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CertificateId")
    public String certificateId;

    public static UploadCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadCertificateRequest self = new UploadCertificateRequest();
        return TeaModel.build(map, self);
    }

    public UploadCertificateRequest setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public UploadCertificateRequest setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }
    public String getCertificateChain() {
        return this.certificateChain;
    }

    public UploadCertificateRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

}
