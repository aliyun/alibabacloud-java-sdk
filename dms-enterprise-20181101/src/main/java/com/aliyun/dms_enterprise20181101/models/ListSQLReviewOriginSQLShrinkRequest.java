// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSQLReviewOriginSQLShrinkRequest extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("OrderActionDetail")
    public String orderActionDetailShrink;

    @NameInMap("Tid")
    public Long tid;

    public static ListSQLReviewOriginSQLShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSQLReviewOriginSQLShrinkRequest self = new ListSQLReviewOriginSQLShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListSQLReviewOriginSQLShrinkRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ListSQLReviewOriginSQLShrinkRequest setOrderActionDetailShrink(String orderActionDetailShrink) {
        this.orderActionDetailShrink = orderActionDetailShrink;
        return this;
    }
    public String getOrderActionDetailShrink() {
        return this.orderActionDetailShrink;
    }

    public ListSQLReviewOriginSQLShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
