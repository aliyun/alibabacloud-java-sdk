// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateAndExportDataKeyResponseBody extends TeaModel {
    /**
     * <p>The ciphertext of the data key encrypted by using the primary CMK version.</p>
     * 
     * <strong>example:</strong>
     * <p>ODZhOWVmZDktM2QxNi00ODk0LWJkNGYtMWZjNDNmM2YyYWJmS7FmDBBQ0BkKsQrtRnidtPwirmDcS0ZuJCU41xxAAWk4Z8qsADfbV0b+i6kQmlvj79dJdGOvtX69Uycs901qOjop4bTS****</p>
     */
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    /**
     * <p>The data key encrypted by using the public key and then exported.</p>
     * 
     * <strong>example:</strong>
     * <p>BQKP+1zK6+ZEMxTP5qaVzcsgXtWplYBKm0NXdSnB5FzliFxE1bSiu4dnEIlca2JpeH7yz1/S6fed630H+hIH6DoM25fTLNcKj+mFB0Xnh9m2+HN59Mn4qyTfcUeadnfCXSWcGBouhXFwcdd2rJ3n337bzTf4jm659gZu3L0i6PLuxM9p7mqdwO0cKJPfGVfhnfMz+f4alMg79WB/NNyE2lyX7/qxvV49ObNrrJbKSFiz8Djocaf0IESNLMbfYI5bXjWkJlX92DQbKhibtQW8ZOJ//ZC6t0AWcUoKL6QDm/dg5koQalcleRinpB+QadFm894sLbVZ9+N4GVs*******</p>
     */
    @NameInMap("ExportedDataKey")
    public String exportedDataKey;

    /**
     * <p>The globally unique ID of the CMK.</p>
     * <blockquote>
     * <p> If you set the KeyId parameter to an alias, the ID of the CMK to which the alias is bound is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>599fa825-17de-417e-9554-bb032cc6****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The ID of the CMK version that is used to encrypt the plaintext. It is the primary version of the CMK.</p>
     * 
     * <strong>example:</strong>
     * <p>2ab1a983-7072-4bbc-a582-584b5bd8****</p>
     */
    @NameInMap("KeyVersionId")
    public String keyVersionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7021b6ec-4be7-4d3c-8a68-1e85d4d515a0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateAndExportDataKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateAndExportDataKeyResponseBody self = new GenerateAndExportDataKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateAndExportDataKeyResponseBody setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public GenerateAndExportDataKeyResponseBody setExportedDataKey(String exportedDataKey) {
        this.exportedDataKey = exportedDataKey;
        return this;
    }
    public String getExportedDataKey() {
        return this.exportedDataKey;
    }

    public GenerateAndExportDataKeyResponseBody setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GenerateAndExportDataKeyResponseBody setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
        return this;
    }
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    public GenerateAndExportDataKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
