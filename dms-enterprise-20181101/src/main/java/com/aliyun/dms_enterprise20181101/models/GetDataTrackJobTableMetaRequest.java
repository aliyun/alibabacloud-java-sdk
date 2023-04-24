// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataTrackJobTableMetaRequest extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

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
