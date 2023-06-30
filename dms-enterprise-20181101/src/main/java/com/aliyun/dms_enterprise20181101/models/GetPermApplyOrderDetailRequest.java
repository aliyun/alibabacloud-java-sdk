// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetPermApplyOrderDetailRequest extends TeaModel {
    /**
     * <p>The ticket ID. You can call the [ListOrders](~~465867~~) operation to query the ticket ID.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The tenant ID.</p>
     * <br>
     * <p>> To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the [View information about the current tenant](~~181330~~) section of the "Manage DMS tenants" topic.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetPermApplyOrderDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPermApplyOrderDetailRequest self = new GetPermApplyOrderDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetPermApplyOrderDetailRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetPermApplyOrderDetailRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
