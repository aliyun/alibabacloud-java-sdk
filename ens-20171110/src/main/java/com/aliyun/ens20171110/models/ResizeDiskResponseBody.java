// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ResizeDiskResponseBody extends TeaModel {
    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>21522202681****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>689412F2-8402-181E-8C87-1EF62331DCC4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResizeDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResizeDiskResponseBody self = new ResizeDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public ResizeDiskResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ResizeDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
