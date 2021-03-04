// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CertificatePublicKeyVerifyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CertificateId")
    public String certificateId;

    @NameInMap("SignatureValid")
    public Boolean signatureValid;

    public static CertificatePublicKeyVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CertificatePublicKeyVerifyResponseBody self = new CertificatePublicKeyVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public CertificatePublicKeyVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CertificatePublicKeyVerifyResponseBody setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public CertificatePublicKeyVerifyResponseBody setSignatureValid(Boolean signatureValid) {
        this.signatureValid = signatureValid;
        return this;
    }
    public Boolean getSignatureValid() {
        return this.signatureValid;
    }

}
