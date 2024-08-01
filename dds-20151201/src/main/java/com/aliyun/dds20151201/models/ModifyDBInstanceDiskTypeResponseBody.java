// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDiskTypeResponseBody extends TeaModel {
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
     * <p>D8F1D721-6439-4257-A89C-F1E8E9C9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceDiskTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceDiskTypeResponseBody self = new ModifyDBInstanceDiskTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceDiskTypeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyDBInstanceDiskTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
