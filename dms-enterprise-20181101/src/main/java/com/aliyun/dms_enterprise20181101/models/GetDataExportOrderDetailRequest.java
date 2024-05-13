// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataExportOrderDetailRequest extends TeaModel {
    /**
     * <p>The ticket ID. You can call the [ListOrders](https://help.aliyun.com/document_detail/465867.html) operation to query the ticket ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see [Manage DMS tenants](https://help.aliyun.com/document_detail/181330.html).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetDataExportOrderDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataExportOrderDetailRequest self = new GetDataExportOrderDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetDataExportOrderDetailRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetDataExportOrderDetailRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
