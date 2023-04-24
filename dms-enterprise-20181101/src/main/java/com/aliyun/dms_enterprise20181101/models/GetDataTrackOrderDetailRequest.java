// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataTrackOrderDetailRequest extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("Tid")
    public Long tid;

    public static GetDataTrackOrderDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataTrackOrderDetailRequest self = new GetDataTrackOrderDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetDataTrackOrderDetailRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetDataTrackOrderDetailRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
