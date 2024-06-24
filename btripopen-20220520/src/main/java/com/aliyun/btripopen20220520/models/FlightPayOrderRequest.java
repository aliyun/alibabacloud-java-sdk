// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightPayOrderRequest extends TeaModel {
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
    public java.util.Map<String, String> extra;

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

    public static FlightPayOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightPayOrderRequest self = new FlightPayOrderRequest();
        return TeaModel.build(map, self);
    }

    public FlightPayOrderRequest setCorpPayPrice(Long corpPayPrice) {
        this.corpPayPrice = corpPayPrice;
        return this;
    }
    public Long getCorpPayPrice() {
        return this.corpPayPrice;
    }

    public FlightPayOrderRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

    public FlightPayOrderRequest setExtra(java.util.Map<String, String> extra) {
        this.extra = extra;
        return this;
    }
    public java.util.Map<String, String> getExtra() {
        return this.extra;
    }

    public FlightPayOrderRequest setPersonalPayPrice(Long personalPayPrice) {
        this.personalPayPrice = personalPayPrice;
        return this;
    }
    public Long getPersonalPayPrice() {
        return this.personalPayPrice;
    }

    public FlightPayOrderRequest setTotalPayPrice(Long totalPayPrice) {
        this.totalPayPrice = totalPayPrice;
        return this;
    }
    public Long getTotalPayPrice() {
        return this.totalPayPrice;
    }

}
