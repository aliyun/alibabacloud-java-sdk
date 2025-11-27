// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class RenewWuyingServerResponseBody extends TeaModel {
    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>23977848****97</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RenewWuyingServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewWuyingServerResponseBody self = new RenewWuyingServerResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewWuyingServerResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RenewWuyingServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
