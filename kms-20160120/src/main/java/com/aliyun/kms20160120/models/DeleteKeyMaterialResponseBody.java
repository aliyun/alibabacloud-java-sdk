// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteKeyMaterialResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4162a6af-bc99-40b3-a552-89dcc8aaf7c8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteKeyMaterialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeyMaterialResponseBody self = new DeleteKeyMaterialResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteKeyMaterialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
