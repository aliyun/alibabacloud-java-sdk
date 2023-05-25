// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceNetworkSpecResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceNetworkSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNetworkSpecResponseBody self = new ModifyInstanceNetworkSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNetworkSpecResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyInstanceNetworkSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
