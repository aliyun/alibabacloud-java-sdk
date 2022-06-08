// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CertificatePrivateKeyDecryptResponseBody extends TeaModel {
    @NameInMap("CertificateId")
    public String certificateId;

    @NameInMap("Plaintext")
    public String plaintext;

    @NameInMap("RequestId")
    public String requestId;

    public static CertificatePrivateKeyDecryptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CertificatePrivateKeyDecryptResponseBody self = new CertificatePrivateKeyDecryptResponseBody();
        return TeaModel.build(map, self);
    }

    public CertificatePrivateKeyDecryptResponseBody setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public CertificatePrivateKeyDecryptResponseBody setPlaintext(String plaintext) {
        this.plaintext = plaintext;
        return this;
    }
    public String getPlaintext() {
        return this.plaintext;
    }

    public CertificatePrivateKeyDecryptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
