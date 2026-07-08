// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateWarehouseResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F0206B77-14B9-584C-8A3A-09D5827FBC50</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The instance ID of the certificate warehouse.</p>
     * 
     * <strong>example:</strong>
     * <p>cas-wh-typ-serial</p>
     */
    @NameInMap("WarehouseInstanceId")
    public String warehouseInstanceId;

    public static CreateWarehouseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWarehouseResponseBody self = new CreateWarehouseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWarehouseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWarehouseResponseBody setWarehouseInstanceId(String warehouseInstanceId) {
        this.warehouseInstanceId = warehouseInstanceId;
        return this;
    }
    public String getWarehouseInstanceId() {
        return this.warehouseInstanceId;
    }

}
