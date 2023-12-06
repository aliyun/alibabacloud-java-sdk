// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataArchiveOrderDetailRequest extends TeaModel {
    /**
     * <p>The IDs of data archiving tickets.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The tenant ID.</p>
     * <br>
     * <p>>  To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see [Manage DMS tenants](~~181330~~).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetDataArchiveOrderDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataArchiveOrderDetailRequest self = new GetDataArchiveOrderDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetDataArchiveOrderDetailRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetDataArchiveOrderDetailRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
