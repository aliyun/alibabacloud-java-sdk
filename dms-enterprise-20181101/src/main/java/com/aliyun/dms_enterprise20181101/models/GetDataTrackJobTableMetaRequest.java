// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataTrackJobTableMetaRequest extends TeaModel {
    /**
     * <p>The ID of the ticket. You can call the [ListOrders](~~144643~~) operation to query the ID of the ticket.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the ID of the tenant.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetDataTrackJobTableMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataTrackJobTableMetaRequest self = new GetDataTrackJobTableMetaRequest();
        return TeaModel.build(map, self);
    }

    public GetDataTrackJobTableMetaRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetDataTrackJobTableMetaRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
