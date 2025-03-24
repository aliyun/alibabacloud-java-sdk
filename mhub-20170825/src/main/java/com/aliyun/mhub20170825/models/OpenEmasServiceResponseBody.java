// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class OpenEmasServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20671870151****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>126D4DDD-05A5-49B1-B18C-39C4A929BFB2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenEmasServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenEmasServiceResponseBody self = new OpenEmasServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenEmasServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenEmasServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
