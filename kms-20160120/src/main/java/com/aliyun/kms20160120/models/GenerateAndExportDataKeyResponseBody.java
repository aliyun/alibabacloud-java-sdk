// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateAndExportDataKeyResponseBody extends TeaModel {
    /**
     * <p>The ciphertext of the data key encrypted by using the primary CMK version.</p>
     */
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    /**
     * <p>The data key encrypted by using the public key and then exported.</p>
     */
    @NameInMap("ExportedDataKey")
    public String exportedDataKey;

    /**
     * <p>The globally unique ID of the CMK.</p>
     * <br>
     * <p>>  If you set the KeyId parameter to an alias, the ID of the CMK to which the alias is bound is returned.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The ID of the CMK version that is used to encrypt the plaintext. It is the primary version of the CMK.</p>
     */
    @NameInMap("KeyVersionId")
    public String keyVersionId;

    /**
     * <p>The ID of the request.</p>
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
