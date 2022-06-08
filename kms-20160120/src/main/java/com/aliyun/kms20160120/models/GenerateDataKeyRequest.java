// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateDataKeyRequest extends TeaModel {
    @NameInMap("EncryptionContext")
    public java.util.Map<String, ?> encryptionContext;

    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("KeySpec")
    public String keySpec;

    @NameInMap("NumberOfBytes")
    public Integer numberOfBytes;

    public static GenerateDataKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDataKeyRequest self = new GenerateDataKeyRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDataKeyRequest setEncryptionContext(java.util.Map<String, ?> encryptionContext) {
        this.encryptionContext = encryptionContext;
        return this;
    }
    public java.util.Map<String, ?> getEncryptionContext() {
        return this.encryptionContext;
    }

    public GenerateDataKeyRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GenerateDataKeyRequest setKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }
    public String getKeySpec() {
        return this.keySpec;
    }

    public GenerateDataKeyRequest setNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
        return this;
    }
    public Integer getNumberOfBytes() {
        return this.numberOfBytes;
    }

}
