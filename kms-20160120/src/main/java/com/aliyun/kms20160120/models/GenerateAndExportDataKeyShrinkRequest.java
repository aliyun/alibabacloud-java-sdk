// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateAndExportDataKeyShrinkRequest extends TeaModel {
    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("KeySpec")
    public String keySpec;

    @NameInMap("NumberOfBytes")
    public Integer numberOfBytes;

    @NameInMap("EncryptionContext")
    public String encryptionContextShrink;

    @NameInMap("PublicKeyBlob")
    public String publicKeyBlob;

    @NameInMap("WrappingKeySpec")
    public String wrappingKeySpec;

    @NameInMap("WrappingAlgorithm")
    public String wrappingAlgorithm;

    public static GenerateAndExportDataKeyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAndExportDataKeyShrinkRequest self = new GenerateAndExportDataKeyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAndExportDataKeyShrinkRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GenerateAndExportDataKeyShrinkRequest setKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }
    public String getKeySpec() {
        return this.keySpec;
    }

    public GenerateAndExportDataKeyShrinkRequest setNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
        return this;
    }
    public Integer getNumberOfBytes() {
        return this.numberOfBytes;
    }

    public GenerateAndExportDataKeyShrinkRequest setEncryptionContextShrink(String encryptionContextShrink) {
        this.encryptionContextShrink = encryptionContextShrink;
        return this;
    }
    public String getEncryptionContextShrink() {
        return this.encryptionContextShrink;
    }

    public GenerateAndExportDataKeyShrinkRequest setPublicKeyBlob(String publicKeyBlob) {
        this.publicKeyBlob = publicKeyBlob;
        return this;
    }
    public String getPublicKeyBlob() {
        return this.publicKeyBlob;
    }

    public GenerateAndExportDataKeyShrinkRequest setWrappingKeySpec(String wrappingKeySpec) {
        this.wrappingKeySpec = wrappingKeySpec;
        return this;
    }
    public String getWrappingKeySpec() {
        return this.wrappingKeySpec;
    }

    public GenerateAndExportDataKeyShrinkRequest setWrappingAlgorithm(String wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm;
        return this;
    }
    public String getWrappingAlgorithm() {
        return this.wrappingAlgorithm;
    }

}
