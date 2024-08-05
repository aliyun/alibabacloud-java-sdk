// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class OpenApiGatewayServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>210981***530495</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>2D39D1B3-8548-508A-9CE2-7F4A3F2A7989</p>
     */
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
