// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ExportDataKeyResponseBody extends TeaModel {
    /**
     * <p>The data key encrypted by using the public key and then exported.</p>
     */
    @NameInMap("ExportedDataKey")
    public String exportedDataKey;

    /**
     * <p>The ID of the CMK that is used to decrypt the specified ciphertext of the data key.</p>
     * <br>
     * <p>This parameter is the globally unique ID of the CMK.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The ID of the CMK version that is used to decrypt the specified ciphertext of the data key.</p>
     */
    @NameInMap("KeyVersionId")
    public String keyVersionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExportDataKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportDataKeyResponseBody self = new ExportDataKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportDataKeyResponseBody setExportedDataKey(String exportedDataKey) {
        this.exportedDataKey = exportedDataKey;
        return this;
    }
    public String getExportedDataKey() {
        return this.exportedDataKey;
    }

    public ExportDataKeyResponseBody setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public ExportDataKeyResponseBody setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
        return this;
    }
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    public ExportDataKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
