// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyNetworkPackageBandwidthResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyNetworkPackageBandwidthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkPackageBandwidthResponseBody self = new ModifyNetworkPackageBandwidthResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkPackageBandwidthResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyNetworkPackageBandwidthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
