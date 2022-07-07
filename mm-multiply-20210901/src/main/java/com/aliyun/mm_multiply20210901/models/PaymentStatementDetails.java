// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class PaymentStatementDetails extends TeaModel {
    // 正逆向单类型
    @NameInMap("IsForward")
    public String isForward;

    // 正向交易订单金额
    @NameInMap("OrderAmt")
    public Double orderAmt;

    // 商城订单编号
    @NameInMap("OrderCd")
    public String orderCd;

    // 支付渠道优惠金额
    @NameInMap("OrderDiscountAmt")
    public Double orderDiscountAmt;

    // 订单来源
    @NameInMap("OrderFromType")
    public String orderFromType;

    // 下单时间
    @NameInMap("OrderTime")
    public String orderTime;

    // 订单状态
    @NameInMap("OrderType")
    public String orderType;

    // 付款方式
    @NameInMap("PayChannelType")
    public String payChannelType;

    // 正向流水号
    @NameInMap("PaySerialCd")
    public String paySerialCd;

    // 支付方式
    @NameInMap("PayToolType")
    public String payToolType;

    // 猫淘订单编号
    @NameInMap("PlatOrderCd")
    public String platOrderCd;

    // 逆向交易金额
    @NameInMap("ReturnOrderAmt")
    public Double returnOrderAmt;

    // 逆向流水号
    @NameInMap("ReturnPaySerialCd")
    public String returnPaySerialCd;

    // 逆向手续费
    @NameInMap("ReturnServiceAmt")
    public Double returnServiceAmt;

    // 正向手续费
    @NameInMap("ServiceAmt")
    public Double serviceAmt;

    public static PaymentStatementDetails build(java.util.Map<String, ?> map) throws Exception {
        PaymentStatementDetails self = new PaymentStatementDetails();
        return TeaModel.build(map, self);
    }

    public PaymentStatementDetails setIsForward(String isForward) {
        this.isForward = isForward;
        return this;
    }
    public String getIsForward() {
        return this.isForward;
    }

    public PaymentStatementDetails setOrderAmt(Double orderAmt) {
        this.orderAmt = orderAmt;
        return this;
    }
    public Double getOrderAmt() {
        return this.orderAmt;
    }

    public PaymentStatementDetails setOrderCd(String orderCd) {
        this.orderCd = orderCd;
        return this;
    }
    public String getOrderCd() {
        return this.orderCd;
    }

    public PaymentStatementDetails setOrderDiscountAmt(Double orderDiscountAmt) {
        this.orderDiscountAmt = orderDiscountAmt;
        return this;
    }
    public Double getOrderDiscountAmt() {
        return this.orderDiscountAmt;
    }

    public PaymentStatementDetails setOrderFromType(String orderFromType) {
        this.orderFromType = orderFromType;
        return this;
    }
    public String getOrderFromType() {
        return this.orderFromType;
    }

    public PaymentStatementDetails setOrderTime(String orderTime) {
        this.orderTime = orderTime;
        return this;
    }
    public String getOrderTime() {
        return this.orderTime;
    }

    public PaymentStatementDetails setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public PaymentStatementDetails setPayChannelType(String payChannelType) {
        this.payChannelType = payChannelType;
        return this;
    }
    public String getPayChannelType() {
        return this.payChannelType;
    }

    public PaymentStatementDetails setPaySerialCd(String paySerialCd) {
        this.paySerialCd = paySerialCd;
        return this;
    }
    public String getPaySerialCd() {
        return this.paySerialCd;
    }

    public PaymentStatementDetails setPayToolType(String payToolType) {
        this.payToolType = payToolType;
        return this;
    }
    public String getPayToolType() {
        return this.payToolType;
    }

    public PaymentStatementDetails setPlatOrderCd(String platOrderCd) {
        this.platOrderCd = platOrderCd;
        return this;
    }
    public String getPlatOrderCd() {
        return this.platOrderCd;
    }

    public PaymentStatementDetails setReturnOrderAmt(Double returnOrderAmt) {
        this.returnOrderAmt = returnOrderAmt;
        return this;
    }
    public Double getReturnOrderAmt() {
        return this.returnOrderAmt;
    }

    public PaymentStatementDetails setReturnPaySerialCd(String returnPaySerialCd) {
        this.returnPaySerialCd = returnPaySerialCd;
        return this;
    }
    public String getReturnPaySerialCd() {
        return this.returnPaySerialCd;
    }

    public PaymentStatementDetails setReturnServiceAmt(Double returnServiceAmt) {
        this.returnServiceAmt = returnServiceAmt;
        return this;
    }
    public Double getReturnServiceAmt() {
        return this.returnServiceAmt;
    }

    public PaymentStatementDetails setServiceAmt(Double serviceAmt) {
        this.serviceAmt = serviceAmt;
        return this;
    }
    public Double getServiceAmt() {
        return this.serviceAmt;
    }

}
