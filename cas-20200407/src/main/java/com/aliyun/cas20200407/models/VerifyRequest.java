// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class VerifyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MessageType")
    public String messageType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SignatureValue")
    public String signatureValue;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SigningAlgorithm")
    public String signingAlgorithm;

    public static VerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyRequest self = new VerifyRequest();
        return TeaModel.build(map, self);
    }

    public VerifyRequest setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public VerifyRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public VerifyRequest setSignatureValue(String signatureValue) {
        this.signatureValue = signatureValue;
        return this;
    }
    public String getSignatureValue() {
        return this.signatureValue;
    }

    public VerifyRequest setSigningAlgorithm(String signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
        return this;
    }
    public String getSigningAlgorithm() {
        return this.signingAlgorithm;
    }

}
