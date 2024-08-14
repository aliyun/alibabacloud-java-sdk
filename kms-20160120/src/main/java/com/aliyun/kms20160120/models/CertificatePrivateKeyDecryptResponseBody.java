// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CertificatePrivateKeyDecryptResponseBody extends TeaModel {
    /**
     * <p>The ID of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-12345678****</p>
     */
    @NameInMap("CertificateId")
    public String certificateId;

    /**
     * <p>The plaintext after data is decrypted.</p>
     * <p>The value is encoded in Base64.</p>
     * 
     * <strong>example:</strong>
     * <p>VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4</p>
     */
    @NameInMap("Plaintext")
    public String plaintext;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5979d897-d69f-4fc9-87dd-f3bb73c40b80</p>
     */
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
