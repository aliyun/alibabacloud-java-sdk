// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ImportKeyMaterialResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ec1017cf-ead4-f3ca-babc-c3b34f3dbecb</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ImportKeyMaterialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportKeyMaterialResponseBody self = new ImportKeyMaterialResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportKeyMaterialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
