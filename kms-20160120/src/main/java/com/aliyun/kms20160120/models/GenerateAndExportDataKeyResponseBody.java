// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateAndExportDataKeyResponseBody extends TeaModel {
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    @NameInMap("ExportedDataKey")
    public String exportedDataKey;

    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("KeyVersionId")
    public String keyVersionId;

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
