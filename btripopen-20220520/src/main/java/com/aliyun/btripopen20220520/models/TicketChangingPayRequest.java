// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TicketChangingPayRequest extends TeaModel {
    @NameInMap("corp_pay_price")
    public Long corpPayPrice;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dis_order_id")
    public String disOrderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dis_sub_order_id")
    public String disSubOrderId;

    @NameInMap("extra")
    public java.util.Map<String, String> extra;

    @NameInMap("personal_pay_price")
    public Long personalPayPrice;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("total_pay_price")
    public Long totalPayPrice;

    public static TicketChangingPayRequest build(java.util.Map<String, ?> map) throws Exception {
        TicketChangingPayRequest self = new TicketChangingPayRequest();
        return TeaModel.build(map, self);
    }

    public TicketChangingPayRequest setCorpPayPrice(Long corpPayPrice) {
        this.corpPayPrice = corpPayPrice;
        return this;
    }
    public Long getCorpPayPrice() {
        return this.corpPayPrice;
    }

    public TicketChangingPayRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

    public TicketChangingPayRequest setDisSubOrderId(String disSubOrderId) {
        this.disSubOrderId = disSubOrderId;
        return this;
    }
    public String getDisSubOrderId() {
        return this.disSubOrderId;
    }

    public TicketChangingPayRequest setExtra(java.util.Map<String, String> extra) {
        this.extra = extra;
        return this;
    }
    public java.util.Map<String, String> getExtra() {
        return this.extra;
    }

    public TicketChangingPayRequest setPersonalPayPrice(Long personalPayPrice) {
        this.personalPayPrice = personalPayPrice;
        return this;
    }
    public Long getPersonalPayPrice() {
        return this.personalPayPrice;
    }

    public TicketChangingPayRequest setTotalPayPrice(Long totalPayPrice) {
        this.totalPayPrice = totalPayPrice;
        return this;
    }
    public Long getTotalPayPrice() {
        return this.totalPayPrice;
    }

}
