// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class RefundRenderCmd extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("bizClaimType")
    public Integer bizClaimType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("goodsStatus")
    public Integer goodsStatus;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("orderLineId")
    public String orderLineId;

    public static RefundRenderCmd build(java.util.Map<String, ?> map) throws Exception {
        RefundRenderCmd self = new RefundRenderCmd();
        return TeaModel.build(map, self);
    }

    public RefundRenderCmd setBizClaimType(Integer bizClaimType) {
        this.bizClaimType = bizClaimType;
        return this;
    }
    public Integer getBizClaimType() {
        return this.bizClaimType;
    }

    public RefundRenderCmd setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
        return this;
    }
    public Integer getGoodsStatus() {
        return this.goodsStatus;
    }

    public RefundRenderCmd setOrderLineId(String orderLineId) {
        this.orderLineId = orderLineId;
        return this;
    }
    public String getOrderLineId() {
        return this.orderLineId;
    }

}
