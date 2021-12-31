// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyNodeSpecResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyNodeSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodeSpecResponseBody self = new ModifyNodeSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyNodeSpecResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyNodeSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
