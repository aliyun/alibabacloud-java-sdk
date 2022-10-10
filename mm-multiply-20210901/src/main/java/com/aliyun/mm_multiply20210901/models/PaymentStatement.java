// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class PaymentStatement extends TeaModel {
    @NameInMap("DiscountAmt")
    public Double discountAmt;

    @NameInMap("OrderAmt1d")
    public Double orderAmt1d;

    @NameInMap("OrderCnt1d")
    public Long orderCnt1d;

    @NameInMap("PayChannelType")
    public String payChannelType;

    @NameInMap("PayDate")
    public String payDate;

    @NameInMap("ReturnOrderAmt1d")
    public Double returnOrderAmt1d;

    @NameInMap("ReturnOrderCnt1d")
    public Long returnOrderCnt1d;

    @NameInMap("ReturnServiceAmt1d")
    public Double returnServiceAmt1d;

    @NameInMap("ServiceAmt1d")
    public Double serviceAmt1d;

    @NameInMap("SettleAmt1d")
    public Double settleAmt1d;

    public static PaymentStatement build(java.util.Map<String, ?> map) throws Exception {
        PaymentStatement self = new PaymentStatement();
        return TeaModel.build(map, self);
    }

    public PaymentStatement setDiscountAmt(Double discountAmt) {
        this.discountAmt = discountAmt;
        return this;
    }
    public Double getDiscountAmt() {
        return this.discountAmt;
    }

    public PaymentStatement setOrderAmt1d(Double orderAmt1d) {
        this.orderAmt1d = orderAmt1d;
        return this;
    }
    public Double getOrderAmt1d() {
        return this.orderAmt1d;
    }

    public PaymentStatement setOrderCnt1d(Long orderCnt1d) {
        this.orderCnt1d = orderCnt1d;
        return this;
    }
    public Long getOrderCnt1d() {
        return this.orderCnt1d;
    }

    public PaymentStatement setPayChannelType(String payChannelType) {
        this.payChannelType = payChannelType;
        return this;
    }
    public String getPayChannelType() {
        return this.payChannelType;
    }

    public PaymentStatement setPayDate(String payDate) {
        this.payDate = payDate;
        return this;
    }
    public String getPayDate() {
        return this.payDate;
    }

    public PaymentStatement setReturnOrderAmt1d(Double returnOrderAmt1d) {
        this.returnOrderAmt1d = returnOrderAmt1d;
        return this;
    }
    public Double getReturnOrderAmt1d() {
        return this.returnOrderAmt1d;
    }

    public PaymentStatement setReturnOrderCnt1d(Long returnOrderCnt1d) {
        this.returnOrderCnt1d = returnOrderCnt1d;
        return this;
    }
    public Long getReturnOrderCnt1d() {
        return this.returnOrderCnt1d;
    }

    public PaymentStatement setReturnServiceAmt1d(Double returnServiceAmt1d) {
        this.returnServiceAmt1d = returnServiceAmt1d;
        return this;
    }
    public Double getReturnServiceAmt1d() {
        return this.returnServiceAmt1d;
    }

    public PaymentStatement setServiceAmt1d(Double serviceAmt1d) {
        this.serviceAmt1d = serviceAmt1d;
        return this;
    }
    public Double getServiceAmt1d() {
        return this.serviceAmt1d;
    }

    public PaymentStatement setSettleAmt1d(Double settleAmt1d) {
        this.settleAmt1d = settleAmt1d;
        return this;
    }
    public Double getSettleAmt1d() {
        return this.settleAmt1d;
    }

}
