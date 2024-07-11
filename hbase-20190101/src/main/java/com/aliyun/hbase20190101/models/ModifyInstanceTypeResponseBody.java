// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyInstanceTypeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123412341234123</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>3E19E345-101D-4014-946C-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceTypeResponseBody self = new ModifyInstanceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceTypeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyInstanceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
