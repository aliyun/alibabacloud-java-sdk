// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ImportEncryptionCertificateRequest extends TeaModel {
    @NameInMap("CertificateId")
    public String certificateId;

    @NameInMap("EncryptedSymmetricKey")
    public String encryptedSymmetricKey;

    @NameInMap("EncryptedPrivateKey")
    public String encryptedPrivateKey;

    @NameInMap("SymmetricAlgorithm")
    public String symmetricAlgorithm;

    @NameInMap("AsymmetricAlgorithm")
    public String asymmetricAlgorithm;

    @NameInMap("Certificate")
    public String certificate;

    @NameInMap("CertificateChain")
    public String certificateChain;

    public static ImportEncryptionCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportEncryptionCertificateRequest self = new ImportEncryptionCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ImportEncryptionCertificateRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public ImportEncryptionCertificateRequest setEncryptedSymmetricKey(String encryptedSymmetricKey) {
        this.encryptedSymmetricKey = encryptedSymmetricKey;
        return this;
    }
    public String getEncryptedSymmetricKey() {
        return this.encryptedSymmetricKey;
    }

    public ImportEncryptionCertificateRequest setEncryptedPrivateKey(String encryptedPrivateKey) {
        this.encryptedPrivateKey = encryptedPrivateKey;
        return this;
    }
    public String getEncryptedPrivateKey() {
        return this.encryptedPrivateKey;
    }

    public ImportEncryptionCertificateRequest setSymmetricAlgorithm(String symmetricAlgorithm) {
        this.symmetricAlgorithm = symmetricAlgorithm;
        return this;
    }
    public String getSymmetricAlgorithm() {
        return this.symmetricAlgorithm;
    }

    public ImportEncryptionCertificateRequest setAsymmetricAlgorithm(String asymmetricAlgorithm) {
        this.asymmetricAlgorithm = asymmetricAlgorithm;
        return this;
    }
    public String getAsymmetricAlgorithm() {
        return this.asymmetricAlgorithm;
    }

    public ImportEncryptionCertificateRequest setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public ImportEncryptionCertificateRequest setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }
    public String getCertificateChain() {
        return this.certificateChain;
    }

}
