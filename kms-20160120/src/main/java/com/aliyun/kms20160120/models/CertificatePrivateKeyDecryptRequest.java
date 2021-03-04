// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CertificatePrivateKeyDecryptRequest extends TeaModel {
    @NameInMap("CertificateId")
    public String certificateId;

    @NameInMap("Algorithm")
    public String algorithm;

    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    public static CertificatePrivateKeyDecryptRequest build(java.util.Map<String, ?> map) throws Exception {
        CertificatePrivateKeyDecryptRequest self = new CertificatePrivateKeyDecryptRequest();
        return TeaModel.build(map, self);
    }

    public CertificatePrivateKeyDecryptRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public CertificatePrivateKeyDecryptRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CertificatePrivateKeyDecryptRequest setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

}
