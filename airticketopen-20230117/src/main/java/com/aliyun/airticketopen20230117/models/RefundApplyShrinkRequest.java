// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class RefundApplyShrinkRequest extends TeaModel {
    @NameInMap("order_num")
    public Long orderNum;

    @NameInMap("refund_journeys")
    public String refundJourneysShrink;

    @NameInMap("refund_passenger_list")
    public String refundPassengerListShrink;

    @NameInMap("refund_type")
    public String refundTypeShrink;

    public static RefundApplyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundApplyShrinkRequest self = new RefundApplyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RefundApplyShrinkRequest setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public Long getOrderNum() {
        return this.orderNum;
    }

    public RefundApplyShrinkRequest setRefundJourneysShrink(String refundJourneysShrink) {
        this.refundJourneysShrink = refundJourneysShrink;
        return this;
    }
    public String getRefundJourneysShrink() {
        return this.refundJourneysShrink;
    }

    public RefundApplyShrinkRequest setRefundPassengerListShrink(String refundPassengerListShrink) {
        this.refundPassengerListShrink = refundPassengerListShrink;
        return this;
    }
    public String getRefundPassengerListShrink() {
        return this.refundPassengerListShrink;
    }

    public RefundApplyShrinkRequest setRefundTypeShrink(String refundTypeShrink) {
        this.refundTypeShrink = refundTypeShrink;
        return this;
    }
    public String getRefundTypeShrink() {
        return this.refundTypeShrink;
    }

}
