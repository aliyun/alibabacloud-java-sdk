// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateAndExportDataKeyRequest extends TeaModel {
    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("KeySpec")
    public String keySpec;

    @NameInMap("NumberOfBytes")
    public Integer numberOfBytes;

    @NameInMap("EncryptionContext")
    public java.util.Map<String, ?> encryptionContext;

    @NameInMap("PublicKeyBlob")
    public String publicKeyBlob;

    @NameInMap("WrappingKeySpec")
    public String wrappingKeySpec;

    @NameInMap("WrappingAlgorithm")
    public String wrappingAlgorithm;

    public static GenerateAndExportDataKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAndExportDataKeyRequest self = new GenerateAndExportDataKeyRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAndExportDataKeyRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GenerateAndExportDataKeyRequest setKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }
    public String getKeySpec() {
        return this.keySpec;
    }

    public GenerateAndExportDataKeyRequest setNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
        return this;
    }
    public Integer getNumberOfBytes() {
        return this.numberOfBytes;
    }

    public GenerateAndExportDataKeyRequest setEncryptionContext(java.util.Map<String, ?> encryptionContext) {
        this.encryptionContext = encryptionContext;
        return this;
    }
    public java.util.Map<String, ?> getEncryptionContext() {
        return this.encryptionContext;
    }

    public GenerateAndExportDataKeyRequest setPublicKeyBlob(String publicKeyBlob) {
        this.publicKeyBlob = publicKeyBlob;
        return this;
    }
    public String getPublicKeyBlob() {
        return this.publicKeyBlob;
    }

    public GenerateAndExportDataKeyRequest setWrappingKeySpec(String wrappingKeySpec) {
        this.wrappingKeySpec = wrappingKeySpec;
        return this;
    }
    public String getWrappingKeySpec() {
        return this.wrappingKeySpec;
    }

    public GenerateAndExportDataKeyRequest setWrappingAlgorithm(String wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm;
        return this;
    }
    public String getWrappingAlgorithm() {
        return this.wrappingAlgorithm;
    }

}
