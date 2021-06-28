// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetSQLReviewCheckResultStatusRequest extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

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
