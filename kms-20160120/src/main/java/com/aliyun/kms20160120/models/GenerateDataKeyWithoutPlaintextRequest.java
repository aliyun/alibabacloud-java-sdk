// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateDataKeyWithoutPlaintextRequest extends TeaModel {
    @NameInMap("EncryptionContext")
    public java.util.Map<String, ?> encryptionContext;

    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("KeySpec")
    public String keySpec;

    @NameInMap("NumberOfBytes")
    public Integer numberOfBytes;

    public static GenerateDataKeyWithoutPlaintextRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDataKeyWithoutPlaintextRequest self = new GenerateDataKeyWithoutPlaintextRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDataKeyWithoutPlaintextRequest setEncryptionContext(java.util.Map<String, ?> encryptionContext) {
        this.encryptionContext = encryptionContext;
        return this;
    }
    public java.util.Map<String, ?> getEncryptionContext() {
        return this.encryptionContext;
    }

    public GenerateDataKeyWithoutPlaintextRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GenerateDataKeyWithoutPlaintextRequest setKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }
    public String getKeySpec() {
        return this.keySpec;
    }

    public GenerateDataKeyWithoutPlaintextRequest setNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
        return this;
    }
    public Integer getNumberOfBytes() {
        return this.numberOfBytes;
    }

}
