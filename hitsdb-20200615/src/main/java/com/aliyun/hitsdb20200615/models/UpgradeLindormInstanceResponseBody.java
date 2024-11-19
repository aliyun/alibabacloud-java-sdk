// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpgradeLindormInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>111111111111111</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2A7D4F9D-AA26-4E15-A2B1-3E4792C6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeLindormInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeLindormInstanceResponseBody self = new UpgradeLindormInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeLindormInstanceResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public UpgradeLindormInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
