// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CertificatePublicKeyEncryptResponseBody extends TeaModel {
    @NameInMap("CertificateId")
    public String certificateId;

    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    @NameInMap("RequestId")
    public String requestId;

    public static CertificatePublicKeyEncryptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CertificatePublicKeyEncryptResponseBody self = new CertificatePublicKeyEncryptResponseBody();
        return TeaModel.build(map, self);
    }

    public CertificatePublicKeyEncryptResponseBody setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public CertificatePublicKeyEncryptResponseBody setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public CertificatePublicKeyEncryptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
