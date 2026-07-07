// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class RefundRenderCmd extends TeaModel {
    /**
     * <p>Refund Type: 1 for refund only, 3 for return and refund</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("bizClaimType")
    public Integer bizClaimType;

    /**
     * <p>Goods Status: 4 for not shipped, 1 for not received, 2 for received</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("goodsStatus")
    public Integer goodsStatus;

    /**
     * <p>Sub-distribution order ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6692****5458</p>
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
