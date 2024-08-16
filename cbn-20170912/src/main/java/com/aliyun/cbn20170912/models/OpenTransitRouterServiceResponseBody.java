// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class OpenTransitRouterServiceResponseBody extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>21370700730****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>866DEBE1-6411-51EC-80D8-975349B9FB4A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenTransitRouterServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenTransitRouterServiceResponseBody self = new OpenTransitRouterServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenTransitRouterServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenTransitRouterServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
