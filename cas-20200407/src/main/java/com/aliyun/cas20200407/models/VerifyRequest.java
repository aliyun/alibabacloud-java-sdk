// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class VerifyRequest extends TeaModel {
    @NameInMap("Identifier")
    public String identifier;

    @NameInMap("Message")
    public String message;

    @NameInMap("MessageType")
    public String messageType;

    @NameInMap("SignatureValue")
    public String signatureValue;

    @NameInMap("SigningAlgorithm")
    public String signingAlgorithm;

    public static VerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyRequest self = new VerifyRequest();
        return TeaModel.build(map, self);
    }

    public VerifyRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
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
