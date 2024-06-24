// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightPayOrderShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("corp_pay_price")
    public Long corpPayPrice;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dis123</p>
     */
    @NameInMap("dis_order_id")
    public String disOrderId;

    @NameInMap("extra")
    public String extraShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("personal_pay_price")
    public Long personalPayPrice;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total_pay_price")
    public Long totalPayPrice;

    public static FlightPayOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightPayOrderShrinkRequest self = new FlightPayOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FlightPayOrderShrinkRequest setCorpPayPrice(Long corpPayPrice) {
        this.corpPayPrice = corpPayPrice;
        return this;
    }
    public Long getCorpPayPrice() {
        return this.corpPayPrice;
    }

    public FlightPayOrderShrinkRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

    public FlightPayOrderShrinkRequest setExtraShrink(String extraShrink) {
        this.extraShrink = extraShrink;
        return this;
    }
    public String getExtraShrink() {
        return this.extraShrink;
    }

    public FlightPayOrderShrinkRequest setPersonalPayPrice(Long personalPayPrice) {
        this.personalPayPrice = personalPayPrice;
        return this;
    }
    public Long getPersonalPayPrice() {
        return this.personalPayPrice;
    }

    public FlightPayOrderShrinkRequest setTotalPayPrice(Long totalPayPrice) {
        this.totalPayPrice = totalPayPrice;
        return this;
    }
    public Long getTotalPayPrice() {
        return this.totalPayPrice;
    }

}
