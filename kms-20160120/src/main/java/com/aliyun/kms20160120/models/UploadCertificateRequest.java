// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UploadCertificateRequest extends TeaModel {
    @NameInMap("Certificate")
    public String certificate;

    @NameInMap("CertificateChain")
    public String certificateChain;

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
