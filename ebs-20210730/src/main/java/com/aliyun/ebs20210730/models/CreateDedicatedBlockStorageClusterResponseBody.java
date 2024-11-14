// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateDedicatedBlockStorageClusterResponseBody extends TeaModel {
    /**
     * <p>The ID of the dedicated block storage cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>dbsc-f8z4d3k4nsgg9okb****</p>
     */
    @NameInMap("DbscId")
    public String dbscId;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50155660025****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4F****</p>
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
