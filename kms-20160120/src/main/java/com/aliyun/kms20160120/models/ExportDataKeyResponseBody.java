// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ExportDataKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExportedDataKey")
    public String exportedDataKey;

    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("KeyVersionId")
    public String keyVersionId;

    public static ExportDataKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportDataKeyResponseBody self = new ExportDataKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportDataKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

}
