// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListPaymentStatementDetailsRequest extends TeaModel {
    // mallId
    @NameInMap("MallId")
    public String mallId;

    // OrderCd
    @NameInMap("OrderCd")
    public String orderCd;

    // OrderDateEnd
    @NameInMap("OrderDateEnd")
    public String orderDateEnd;

    // OrderDateStart
    @NameInMap("OrderDateStart")
    public String orderDateStart;

    // OrderFrom
    @NameInMap("OrderFrom")
    public String orderFrom;

    // OrderType
    @NameInMap("OrderType")
    public String orderType;

    // pageNumber
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // pageSize
    @NameInMap("PageSize")
    public Integer pageSize;

    // payChannelType
    @NameInMap("PayChannelType")
    public String payChannelType;

    // PlatOrderCd
    @NameInMap("PlatOrderCd")
    public String platOrderCd;

    public static ListPaymentStatementDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPaymentStatementDetailsRequest self = new ListPaymentStatementDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListPaymentStatementDetailsRequest setMallId(String mallId) {
        this.mallId = mallId;
        return this;
    }
    public String getMallId() {
        return this.mallId;
    }

    public ListPaymentStatementDetailsRequest setOrderCd(String orderCd) {
        this.orderCd = orderCd;
        return this;
    }
    public String getOrderCd() {
        return this.orderCd;
    }

    public ListPaymentStatementDetailsRequest setOrderDateEnd(String orderDateEnd) {
        this.orderDateEnd = orderDateEnd;
        return this;
    }
    public String getOrderDateEnd() {
        return this.orderDateEnd;
    }

    public ListPaymentStatementDetailsRequest setOrderDateStart(String orderDateStart) {
        this.orderDateStart = orderDateStart;
        return this;
    }
    public String getOrderDateStart() {
        return this.orderDateStart;
    }

    public ListPaymentStatementDetailsRequest setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom;
        return this;
    }
    public String getOrderFrom() {
        return this.orderFrom;
    }

    public ListPaymentStatementDetailsRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListPaymentStatementDetailsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPaymentStatementDetailsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPaymentStatementDetailsRequest setPayChannelType(String payChannelType) {
        this.payChannelType = payChannelType;
        return this;
    }
    public String getPayChannelType() {
        return this.payChannelType;
    }

    public ListPaymentStatementDetailsRequest setPlatOrderCd(String platOrderCd) {
        this.platOrderCd = platOrderCd;
        return this;
    }
    public String getPlatOrderCd() {
        return this.platOrderCd;
    }

}
