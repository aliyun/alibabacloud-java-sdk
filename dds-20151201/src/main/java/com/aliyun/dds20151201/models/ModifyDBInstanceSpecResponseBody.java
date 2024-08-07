// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSpecResponseBody extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>21012408824****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1E9F1104-19E7-59F0-AB7F-F4EBFDEA****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceSpecResponseBody self = new ModifyDBInstanceSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceSpecResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyDBInstanceSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
