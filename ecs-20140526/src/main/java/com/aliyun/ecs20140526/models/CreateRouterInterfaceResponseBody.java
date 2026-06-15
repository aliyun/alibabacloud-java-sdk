// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateRouterInterfaceResponseBody extends TeaModel {
    /**
     * <p>The order ID. This parameter is returned only for subscription-based router interfaces.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The router interface ID.</p>
     */
    @NameInMap("RouterInterfaceId")
    public String routerInterfaceId;

    public static CreateRouterInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRouterInterfaceResponseBody self = new CreateRouterInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRouterInterfaceResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateRouterInterfaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRouterInterfaceResponseBody setRouterInterfaceId(String routerInterfaceId) {
        this.routerInterfaceId = routerInterfaceId;
        return this;
    }
    public String getRouterInterfaceId() {
        return this.routerInterfaceId;
    }

}
