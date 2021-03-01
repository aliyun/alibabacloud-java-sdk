// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetPermApplyOrderDetailRequest extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

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

}
