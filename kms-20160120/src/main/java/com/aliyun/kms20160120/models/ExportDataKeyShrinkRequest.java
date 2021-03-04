// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ExportDataKeyShrinkRequest extends TeaModel {
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    @NameInMap("EncryptionContext")
    public String encryptionContextShrink;

    @NameInMap("PublicKeyBlob")
    public String publicKeyBlob;

    @NameInMap("WrappingKeySpec")
    public String wrappingKeySpec;

    @NameInMap("WrappingAlgorithm")
    public String wrappingAlgorithm;

    public static ExportDataKeyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportDataKeyShrinkRequest self = new ExportDataKeyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExportDataKeyShrinkRequest setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public ExportDataKeyShrinkRequest setEncryptionContextShrink(String encryptionContextShrink) {
        this.encryptionContextShrink = encryptionContextShrink;
        return this;
    }
    public String getEncryptionContextShrink() {
        return this.encryptionContextShrink;
    }

    public ExportDataKeyShrinkRequest setPublicKeyBlob(String publicKeyBlob) {
        this.publicKeyBlob = publicKeyBlob;
        return this;
    }
    public String getPublicKeyBlob() {
        return this.publicKeyBlob;
    }

    public ExportDataKeyShrinkRequest setWrappingKeySpec(String wrappingKeySpec) {
        this.wrappingKeySpec = wrappingKeySpec;
        return this;
    }
    public String getWrappingKeySpec() {
        return this.wrappingKeySpec;
    }

    public ExportDataKeyShrinkRequest setWrappingAlgorithm(String wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm;
        return this;
    }
    public String getWrappingAlgorithm() {
        return this.wrappingAlgorithm;
    }

}
