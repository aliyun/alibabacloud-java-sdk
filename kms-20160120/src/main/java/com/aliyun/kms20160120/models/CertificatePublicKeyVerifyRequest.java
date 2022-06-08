// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CertificatePublicKeyVerifyRequest extends TeaModel {
    @NameInMap("Algorithm")
    public String algorithm;

    @NameInMap("CertificateId")
    public String certificateId;

    @NameInMap("Message")
    public String message;

    @NameInMap("MessageType")
    public String messageType;

    @NameInMap("SignatureValue")
    public String signatureValue;

    public static CertificatePublicKeyVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        CertificatePublicKeyVerifyRequest self = new CertificatePublicKeyVerifyRequest();
        return TeaModel.build(map, self);
    }

    public CertificatePublicKeyVerifyRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CertificatePublicKeyVerifyRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public CertificatePublicKeyVerifyRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CertificatePublicKeyVerifyRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public CertificatePublicKeyVerifyRequest setSignatureValue(String signatureValue) {
        this.signatureValue = signatureValue;
        return this;
    }
    public String getSignatureValue() {
        return this.signatureValue;
    }

}
