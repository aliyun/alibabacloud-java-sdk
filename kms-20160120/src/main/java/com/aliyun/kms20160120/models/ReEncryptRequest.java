// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ReEncryptRequest extends TeaModel {
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    @NameInMap("SourceKeyId")
    public String sourceKeyId;

    @NameInMap("SourceKeyVersionId")
    public String sourceKeyVersionId;

    @NameInMap("SourceEncryptionAlgorithm")
    public String sourceEncryptionAlgorithm;

    @NameInMap("SourceEncryptionContext")
    public java.util.Map<String, ?> sourceEncryptionContext;

    @NameInMap("DestinationKeyId")
    public String destinationKeyId;

    @NameInMap("DestinationEncryptionContext")
    public java.util.Map<String, ?> destinationEncryptionContext;

    public static ReEncryptRequest build(java.util.Map<String, ?> map) throws Exception {
        ReEncryptRequest self = new ReEncryptRequest();
        return TeaModel.build(map, self);
    }

    public ReEncryptRequest setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public ReEncryptRequest setSourceKeyId(String sourceKeyId) {
        this.sourceKeyId = sourceKeyId;
        return this;
    }
    public String getSourceKeyId() {
        return this.sourceKeyId;
    }

    public ReEncryptRequest setSourceKeyVersionId(String sourceKeyVersionId) {
        this.sourceKeyVersionId = sourceKeyVersionId;
        return this;
    }
    public String getSourceKeyVersionId() {
        return this.sourceKeyVersionId;
    }

    public ReEncryptRequest setSourceEncryptionAlgorithm(String sourceEncryptionAlgorithm) {
        this.sourceEncryptionAlgorithm = sourceEncryptionAlgorithm;
        return this;
    }
    public String getSourceEncryptionAlgorithm() {
        return this.sourceEncryptionAlgorithm;
    }

    public ReEncryptRequest setSourceEncryptionContext(java.util.Map<String, ?> sourceEncryptionContext) {
        this.sourceEncryptionContext = sourceEncryptionContext;
        return this;
    }
    public java.util.Map<String, ?> getSourceEncryptionContext() {
        return this.sourceEncryptionContext;
    }

    public ReEncryptRequest setDestinationKeyId(String destinationKeyId) {
        this.destinationKeyId = destinationKeyId;
        return this;
    }
    public String getDestinationKeyId() {
        return this.destinationKeyId;
    }

    public ReEncryptRequest setDestinationEncryptionContext(java.util.Map<String, ?> destinationEncryptionContext) {
        this.destinationEncryptionContext = destinationEncryptionContext;
        return this;
    }
    public java.util.Map<String, ?> getDestinationEncryptionContext() {
        return this.destinationEncryptionContext;
    }

}
