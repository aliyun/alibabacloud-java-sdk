// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ReEncryptShrinkRequest extends TeaModel {
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    @NameInMap("SourceKeyId")
    public String sourceKeyId;

    @NameInMap("SourceKeyVersionId")
    public String sourceKeyVersionId;

    @NameInMap("SourceEncryptionAlgorithm")
    public String sourceEncryptionAlgorithm;

    @NameInMap("SourceEncryptionContext")
    public String sourceEncryptionContextShrink;

    @NameInMap("DestinationKeyId")
    public String destinationKeyId;

    @NameInMap("DestinationEncryptionContext")
    public String destinationEncryptionContextShrink;

    public static ReEncryptShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReEncryptShrinkRequest self = new ReEncryptShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReEncryptShrinkRequest setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public ReEncryptShrinkRequest setSourceKeyId(String sourceKeyId) {
        this.sourceKeyId = sourceKeyId;
        return this;
    }
    public String getSourceKeyId() {
        return this.sourceKeyId;
    }

    public ReEncryptShrinkRequest setSourceKeyVersionId(String sourceKeyVersionId) {
        this.sourceKeyVersionId = sourceKeyVersionId;
        return this;
    }
    public String getSourceKeyVersionId() {
        return this.sourceKeyVersionId;
    }

    public ReEncryptShrinkRequest setSourceEncryptionAlgorithm(String sourceEncryptionAlgorithm) {
        this.sourceEncryptionAlgorithm = sourceEncryptionAlgorithm;
        return this;
    }
    public String getSourceEncryptionAlgorithm() {
        return this.sourceEncryptionAlgorithm;
    }

    public ReEncryptShrinkRequest setSourceEncryptionContextShrink(String sourceEncryptionContextShrink) {
        this.sourceEncryptionContextShrink = sourceEncryptionContextShrink;
        return this;
    }
    public String getSourceEncryptionContextShrink() {
        return this.sourceEncryptionContextShrink;
    }

    public ReEncryptShrinkRequest setDestinationKeyId(String destinationKeyId) {
        this.destinationKeyId = destinationKeyId;
        return this;
    }
    public String getDestinationKeyId() {
        return this.destinationKeyId;
    }

    public ReEncryptShrinkRequest setDestinationEncryptionContextShrink(String destinationEncryptionContextShrink) {
        this.destinationEncryptionContextShrink = destinationEncryptionContextShrink;
        return this;
    }
    public String getDestinationEncryptionContextShrink() {
        return this.destinationEncryptionContextShrink;
    }

}
