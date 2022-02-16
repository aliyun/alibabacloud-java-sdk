// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class UploadSSLCertificateRequest extends TeaModel {
    @NameInMap("CertName")
    public String certName;

    @NameInMap("Certificate")
    public String certificate;

    @NameInMap("EncryptCertificate")
    public String encryptCertificate;

    @NameInMap("EncryptPrivateKey")
    public String encryptPrivateKey;

    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("SignCertificate")
    public String signCertificate;

    @NameInMap("SignPrivateKey")
    public String signPrivateKey;

    public static UploadSSLCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadSSLCertificateRequest self = new UploadSSLCertificateRequest();
        return TeaModel.build(map, self);
    }

    public UploadSSLCertificateRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public UploadSSLCertificateRequest setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public UploadSSLCertificateRequest setEncryptCertificate(String encryptCertificate) {
        this.encryptCertificate = encryptCertificate;
        return this;
    }
    public String getEncryptCertificate() {
        return this.encryptCertificate;
    }

    public UploadSSLCertificateRequest setEncryptPrivateKey(String encryptPrivateKey) {
        this.encryptPrivateKey = encryptPrivateKey;
        return this;
    }
    public String getEncryptPrivateKey() {
        return this.encryptPrivateKey;
    }

    public UploadSSLCertificateRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public UploadSSLCertificateRequest setSignCertificate(String signCertificate) {
        this.signCertificate = signCertificate;
        return this;
    }
    public String getSignCertificate() {
        return this.signCertificate;
    }

    public UploadSSLCertificateRequest setSignPrivateKey(String signPrivateKey) {
        this.signPrivateKey = signPrivateKey;
        return this;
    }
    public String getSignPrivateKey() {
        return this.signPrivateKey;
    }

}
