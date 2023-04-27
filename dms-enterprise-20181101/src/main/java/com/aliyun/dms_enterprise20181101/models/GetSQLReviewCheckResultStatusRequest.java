// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetSQLReviewCheckResultStatusRequest extends TeaModel {
    /**
     * <p>The ID of the ticket. You can obtain the ticket ID from the response parameters of the [CreateSQLReviewOrder](~~257777~~) operation.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the ID of the tenant.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetSQLReviewCheckResultStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSQLReviewCheckResultStatusRequest self = new GetSQLReviewCheckResultStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetSQLReviewCheckResultStatusRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetSQLReviewCheckResultStatusRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
