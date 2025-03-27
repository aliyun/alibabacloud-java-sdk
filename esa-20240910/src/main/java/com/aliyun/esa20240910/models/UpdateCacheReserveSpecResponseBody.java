// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCacheReserveSpecResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>esa-cr-9tuv*********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>2223332122***</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>40423A7F-A83D-1E24-B80E-86DD25790759</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCacheReserveSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCacheReserveSpecResponseBody self = new UpdateCacheReserveSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCacheReserveSpecResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateCacheReserveSpecResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateCacheReserveSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
