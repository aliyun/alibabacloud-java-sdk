// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ImportKeyMaterialRequest extends TeaModel {
    /**
     * <p>Use **GetParametersForImport** the Returned public key and the base64-encoded key material.</p>
     */
    @NameInMap("EncryptedKeyMaterial")
    public String encryptedKeyMaterial;

    /**
     * <p>By calling **GetParametersForImport** the import token.</p>
     */
    @NameInMap("ImportToken")
    public String importToken;

    /**
     * <p>The ID of the CMK to be imported.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The time when the key material expires.</p>
     * <br>
     * <p>If this parameter is not specified or set this parameter to 0, the key material does not expire.</p>
     * <br>
     * <p>>  The value cannot be earlier than the time when the API is called (based on the server time).</p>
     */
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
