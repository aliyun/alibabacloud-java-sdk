// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectOrderDetailRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    @NameInMap("OrderId")
    public Long orderId;

    public static GetDataCorrectOrderDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataCorrectOrderDetailRequest self = new GetDataCorrectOrderDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetDataCorrectOrderDetailRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public GetDataCorrectOrderDetailRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
