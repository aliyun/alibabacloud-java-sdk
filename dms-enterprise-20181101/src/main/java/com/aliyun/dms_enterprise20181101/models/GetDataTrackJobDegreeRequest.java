// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataTrackJobDegreeRequest extends TeaModel {
    /**
     * <p>The ID of the ticket. You can call the [ListOrders](~~144643~~) operation to query the ticket ID.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to query the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetDataTrackJobDegreeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataTrackJobDegreeRequest self = new GetDataTrackJobDegreeRequest();
        return TeaModel.build(map, self);
    }

    public GetDataTrackJobDegreeRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetDataTrackJobDegreeRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
