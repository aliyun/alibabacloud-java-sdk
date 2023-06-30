// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDatabaseExportOrderDetailRequest extends TeaModel {
    /**
     * <p>The ticket ID. You can call the [ListOrders](~~144643~~) operation to obtain the ticket ID.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the [View information about the current tenant](~~181330~~) section of the "Manage DMS tenants" topic.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetDatabaseExportOrderDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseExportOrderDetailRequest self = new GetDatabaseExportOrderDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetDatabaseExportOrderDetailRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetDatabaseExportOrderDetailRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
