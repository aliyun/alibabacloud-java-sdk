// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ImportKeyMaterialRequest extends TeaModel {
    @NameInMap("EncryptedKeyMaterial")
    public String encryptedKeyMaterial;

    @NameInMap("ImportToken")
    public String importToken;

    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("KeyMaterialExpireUnix")
    public Long keyMaterialExpireUnix;

    public static ImportKeyMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportKeyMaterialRequest self = new ImportKeyMaterialRequest();
        return TeaModel.build(map, self);
    }

    public ImportKeyMaterialRequest setEncryptedKeyMaterial(String encryptedKeyMaterial) {
        this.encryptedKeyMaterial = encryptedKeyMaterial;
        return this;
    }
    public String getEncryptedKeyMaterial() {
        return this.encryptedKeyMaterial;
    }

    public ImportKeyMaterialRequest setImportToken(String importToken) {
        this.importToken = importToken;
        return this;
    }
    public String getImportToken() {
        return this.importToken;
    }

    public ImportKeyMaterialRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public ImportKeyMaterialRequest setKeyMaterialExpireUnix(Long keyMaterialExpireUnix) {
        this.keyMaterialExpireUnix = keyMaterialExpireUnix;
        return this;
    }
    public Long getKeyMaterialExpireUnix() {
        return this.keyMaterialExpireUnix;
    }

}
