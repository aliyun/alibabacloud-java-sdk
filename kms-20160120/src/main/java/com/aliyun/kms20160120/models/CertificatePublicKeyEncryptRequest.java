// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CertificatePublicKeyEncryptRequest extends TeaModel {
    @NameInMap("Algorithm")
    public String algorithm;

    @NameInMap("CertificateId")
    public String certificateId;

    @NameInMap("Plaintext")
    public String plaintext;

    public static CertificatePublicKeyEncryptRequest build(java.util.Map<String, ?> map) throws Exception {
        CertificatePublicKeyEncryptRequest self = new CertificatePublicKeyEncryptRequest();
        return TeaModel.build(map, self);
    }

    public CertificatePublicKeyEncryptRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CertificatePublicKeyEncryptRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public CertificatePublicKeyEncryptRequest setPlaintext(String plaintext) {
        this.plaintext = plaintext;
        return this;
    }
    public String getPlaintext() {
        return this.plaintext;
    }

}
