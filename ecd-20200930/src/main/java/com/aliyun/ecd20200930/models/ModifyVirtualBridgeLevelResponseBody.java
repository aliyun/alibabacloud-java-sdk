// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyVirtualBridgeLevelResponseBody extends TeaModel {
    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F7E4322D-D679-5ACB-A909-490D2F0E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVirtualBridgeLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualBridgeLevelResponseBody self = new ModifyVirtualBridgeLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualBridgeLevelResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ModifyVirtualBridgeLevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
