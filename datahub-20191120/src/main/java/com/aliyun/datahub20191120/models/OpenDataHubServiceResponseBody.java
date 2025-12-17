// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20191120.models;

import com.aliyun.tea.*;

public class OpenDataHubServiceResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static OpenDataHubServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenDataHubServiceResponseBody self = new OpenDataHubServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenDataHubServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenDataHubServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
