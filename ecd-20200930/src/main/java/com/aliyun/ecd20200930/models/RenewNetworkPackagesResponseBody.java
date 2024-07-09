// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewNetworkPackagesResponseBody extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>214726268900640</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RenewNetworkPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewNetworkPackagesResponseBody self = new RenewNetworkPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewNetworkPackagesResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RenewNetworkPackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
