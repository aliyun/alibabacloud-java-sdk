// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateDataKeyShrinkRequest extends TeaModel {
    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("KeySpec")
    public String keySpec;

    @NameInMap("NumberOfBytes")
    public Integer numberOfBytes;

    @NameInMap("EncryptionContext")
    public String encryptionContextShrink;

    public static GenerateDataKeyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDataKeyShrinkRequest self = new GenerateDataKeyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDataKeyShrinkRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GenerateDataKeyShrinkRequest setKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }
    public String getKeySpec() {
        return this.keySpec;
    }

    public GenerateDataKeyShrinkRequest setNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
        return this;
    }
    public Integer getNumberOfBytes() {
        return this.numberOfBytes;
    }

    public GenerateDataKeyShrinkRequest setEncryptionContextShrink(String encryptionContextShrink) {
        this.encryptionContextShrink = encryptionContextShrink;
        return this;
    }
    public String getEncryptionContextShrink() {
        return this.encryptionContextShrink;
    }

}
