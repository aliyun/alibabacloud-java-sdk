// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteWarehouseResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5C53F7EC-7C47-5DA5-8B6D-FE6B1F934E82</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWarehouseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWarehouseResponseBody self = new DeleteWarehouseResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWarehouseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
