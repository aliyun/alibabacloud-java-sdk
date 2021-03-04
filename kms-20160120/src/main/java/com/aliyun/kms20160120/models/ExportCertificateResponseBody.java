// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ExportCertificateResponseBody extends TeaModel {
    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CertificateId")
    public String certificateId;

    @NameInMap("CertificateChain")
    public String certificateChain;

    @NameInMap("PKCS12Blob")
    public String PKCS12Blob;

    @NameInMap("Certificate")
    public String certificate;

    public static ExportCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportCertificateResponseBody self = new ExportCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportCertificateResponseBody setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public ExportCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportCertificateResponseBody setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public ExportCertificateResponseBody setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }
    public String getCertificateChain() {
        return this.certificateChain;
    }

    public ExportCertificateResponseBody setPKCS12Blob(String PKCS12Blob) {
        this.PKCS12Blob = PKCS12Blob;
        return this;
    }
    public String getPKCS12Blob() {
        return this.PKCS12Blob;
    }

    public ExportCertificateResponseBody setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

}
