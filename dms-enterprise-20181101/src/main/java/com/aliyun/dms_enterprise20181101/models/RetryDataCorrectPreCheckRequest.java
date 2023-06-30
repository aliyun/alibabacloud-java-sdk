// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RetryDataCorrectPreCheckRequest extends TeaModel {
    /**
     * <p>The ID of the data change ticket. You can call the [ListOrders](~~144643~~) operation to query the ID of the data change ticket.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static RetryDataCorrectPreCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryDataCorrectPreCheckRequest self = new RetryDataCorrectPreCheckRequest();
        return TeaModel.build(map, self);
    }

    public RetryDataCorrectPreCheckRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public RetryDataCorrectPreCheckRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
