// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ImportKeyMaterialRequest extends TeaModel {
    /**
     * <p>Use <strong>GetParametersForImport</strong> the Returned public key and the base64-encoded key material.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bCPZx7I6v6KXsqEpr2OXKxuj2CCRtKdwp75Bw+BGncYqBdfjFBYRtOE6HRlT0oeiRDWzwnw9OA54OL36smDJrq4Lo9x0CyYDiuKnRkcKtMtlzW0din7Pd7IlZWWRdVueiw2qpzl7PkUWQGTdsdbzpfJJQ+qj/cRIrk/E83UGyeyytSpgnb+lu0xEYcPajRyWNsbi98N3pqqQzHXNNHO2NJqHlnQgglqTiBEjkGeKFhfKmTc3vjulIdVa3EaVIN6lwWfgx+UUYSrvbA77WDYKlDsZ4SbK2/T7za9Tp1qU7Ynqba7OKGVVj7PMbiaO80AxWZnjUMYCgEp5w7V+seOXqw==</p>
     */
    @NameInMap("EncryptedKeyMaterial")
    public String encryptedKeyMaterial;

    /**
     * <p>By calling <strong>GetParametersForImport</strong> the import token.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Base64String</p>
     */
    @NameInMap("ImportToken")
    public String importToken;

    /**
     * <p>The ID of the CMK to be imported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234abcd-12ab-34cd-56ef-12345678****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The time when the key material expires.</p>
     * <p>If this parameter is not specified or set this parameter to 0, the key material does not expire.</p>
     * <blockquote>
     * <p> The value cannot be earlier than the time when the API is called (based on the server time).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
