// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class PaymentStatementDetails extends TeaModel {
    @NameInMap("IsForward")
    public String isForward;

    @NameInMap("OrderAmt")
    public Double orderAmt;

    @NameInMap("OrderCd")
    public String orderCd;

    @NameInMap("OrderDiscountAmt")
    public Double orderDiscountAmt;

    @NameInMap("OrderFromType")
    public String orderFromType;

    @NameInMap("OrderTime")
    public String orderTime;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("PayChannelType")
    public String payChannelType;

    @NameInMap("PaySerialCd")
    public String paySerialCd;

    @NameInMap("PayToolType")
    public String payToolType;

    @NameInMap("PlatOrderCd")
    public String platOrderCd;

    @NameInMap("ReturnOrderAmt")
    public Double returnOrderAmt;

    @NameInMap("ReturnPaySerialCd")
    public String returnPaySerialCd;

    @NameInMap("ReturnServiceAmt")
    public Double returnServiceAmt;

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
