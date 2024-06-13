// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class EncryptRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    @NameInMap("MessageType")
    public String messageType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Plaintext")
    public String plaintext;

    public static EncryptRequest build(java.util.Map<String, ?> map) throws Exception {
        EncryptRequest self = new EncryptRequest();
        return TeaModel.build(map, self);
    }

    public EncryptRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public EncryptRequest setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public EncryptRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public EncryptRequest setPlaintext(String plaintext) {
        this.plaintext = plaintext;
        return this;
    }
    public String getPlaintext() {
        return this.plaintext;
    }

}
