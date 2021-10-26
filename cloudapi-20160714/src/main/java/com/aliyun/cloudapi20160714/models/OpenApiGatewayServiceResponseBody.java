// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class OpenApiGatewayServiceResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static OpenApiGatewayServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenApiGatewayServiceResponseBody self = new OpenApiGatewayServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenApiGatewayServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenApiGatewayServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
