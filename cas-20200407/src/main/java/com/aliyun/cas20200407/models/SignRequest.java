// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class SignRequest extends TeaModel {
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
    @NameInMap("SigningAlgorithm")
    public String signingAlgorithm;

    public static SignRequest build(java.util.Map<String, ?> map) throws Exception {
        SignRequest self = new SignRequest();
        return TeaModel.build(map, self);
    }

    public SignRequest setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public SignRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SignRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public SignRequest setSigningAlgorithm(String signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
        return this;
    }
    public String getSigningAlgorithm() {
        return this.signingAlgorithm;
    }

}
