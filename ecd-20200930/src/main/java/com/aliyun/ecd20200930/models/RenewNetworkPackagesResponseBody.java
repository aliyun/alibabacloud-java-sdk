// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewNetworkPackagesResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

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
