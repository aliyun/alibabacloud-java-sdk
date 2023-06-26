// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateDedicatedBlockStorageClusterResponseBody extends TeaModel {
    /**
     * <p>The ID of the dedicated block storage cluster.</p>
     */
    @NameInMap("DbscId")
    public String dbscId;

    /**
     * <p>The ID of the order.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDedicatedBlockStorageClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedBlockStorageClusterResponseBody self = new CreateDedicatedBlockStorageClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedBlockStorageClusterResponseBody setDbscId(String dbscId) {
        this.dbscId = dbscId;
        return this;
    }
    public String getDbscId() {
        return this.dbscId;
    }

    public CreateDedicatedBlockStorageClusterResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateDedicatedBlockStorageClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
