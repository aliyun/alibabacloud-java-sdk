// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CertificatePrivateKeySignRequest extends TeaModel {
    @NameInMap("CertificateId")
    public String certificateId;

    @NameInMap("Algorithm")
    public String algorithm;

    @NameInMap("MessageType")
    public String messageType;

    @NameInMap("Message")
    public String message;

    public static CertificatePrivateKeySignRequest build(java.util.Map<String, ?> map) throws Exception {
        CertificatePrivateKeySignRequest self = new CertificatePrivateKeySignRequest();
        return TeaModel.build(map, self);
    }

    public CertificatePrivateKeySignRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public CertificatePrivateKeySignRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CertificatePrivateKeySignRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public CertificatePrivateKeySignRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
