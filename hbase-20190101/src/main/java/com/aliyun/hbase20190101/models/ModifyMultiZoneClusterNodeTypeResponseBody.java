// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyMultiZoneClusterNodeTypeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12341234123****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>06CF7A6F-A81C-431D-BACD-793F24A67C54</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyMultiZoneClusterNodeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMultiZoneClusterNodeTypeResponseBody self = new ModifyMultiZoneClusterNodeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMultiZoneClusterNodeTypeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyMultiZoneClusterNodeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
