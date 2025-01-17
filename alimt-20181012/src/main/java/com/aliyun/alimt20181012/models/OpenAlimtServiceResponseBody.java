// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class OpenAlimtServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>xxxx-xxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenAlimtServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenAlimtServiceResponseBody self = new OpenAlimtServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenAlimtServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenAlimtServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
