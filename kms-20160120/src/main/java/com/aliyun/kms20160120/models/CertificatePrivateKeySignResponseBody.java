// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CertificatePrivateKeySignResponseBody extends TeaModel {
    @NameInMap("CertificateId")
    public String certificateId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SignatureValue")
    public String signatureValue;

    public static CertificatePrivateKeySignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CertificatePrivateKeySignResponseBody self = new CertificatePrivateKeySignResponseBody();
        return TeaModel.build(map, self);
    }

    public CertificatePrivateKeySignResponseBody setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public CertificatePrivateKeySignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CertificatePrivateKeySignResponseBody setSignatureValue(String signatureValue) {
        this.signatureValue = signatureValue;
        return this;
    }
    public String getSignatureValue() {
        return this.signatureValue;
    }

}
