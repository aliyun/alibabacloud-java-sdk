// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TicketChangingPayShrinkRequest extends TeaModel {
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
    public String extraShrink;

    @NameInMap("personal_pay_price")
    public Long personalPayPrice;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("total_pay_price")
    public Long totalPayPrice;

    public static TicketChangingPayShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TicketChangingPayShrinkRequest self = new TicketChangingPayShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TicketChangingPayShrinkRequest setCorpPayPrice(Long corpPayPrice) {
        this.corpPayPrice = corpPayPrice;
        return this;
    }
    public Long getCorpPayPrice() {
        return this.corpPayPrice;
    }

    public TicketChangingPayShrinkRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

    public TicketChangingPayShrinkRequest setDisSubOrderId(String disSubOrderId) {
        this.disSubOrderId = disSubOrderId;
        return this;
    }
    public String getDisSubOrderId() {
        return this.disSubOrderId;
    }

    public TicketChangingPayShrinkRequest setExtraShrink(String extraShrink) {
        this.extraShrink = extraShrink;
        return this;
    }
    public String getExtraShrink() {
        return this.extraShrink;
    }

    public TicketChangingPayShrinkRequest setPersonalPayPrice(Long personalPayPrice) {
        this.personalPayPrice = personalPayPrice;
        return this;
    }
    public Long getPersonalPayPrice() {
        return this.personalPayPrice;
    }

    public TicketChangingPayShrinkRequest setTotalPayPrice(Long totalPayPrice) {
        this.totalPayPrice = totalPayPrice;
        return this;
    }
    public Long getTotalPayPrice() {
        return this.totalPayPrice;
    }

}
