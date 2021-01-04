// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetOrderBaseInfoRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    @NameInMap("OrderId")
    public Long orderId;

    public static GetOrderBaseInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrderBaseInfoRequest self = new GetOrderBaseInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetOrderBaseInfoRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public GetOrderBaseInfoRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
