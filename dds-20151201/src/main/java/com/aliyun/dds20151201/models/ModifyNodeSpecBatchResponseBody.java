// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyNodeSpecBatchResponseBody extends TeaModel {
    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>21012719476****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0637BC25-6895-5500-871F-1127CA34****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyNodeSpecBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodeSpecBatchResponseBody self = new ModifyNodeSpecBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyNodeSpecBatchResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyNodeSpecBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
