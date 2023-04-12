// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class ListOrderRequest extends TeaModel {
    @NameInMap("CredentialNo")
    public String credentialNo;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OrderStatus")
    public String orderStatus;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartDate")
    public String startDate;

    public static ListOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOrderRequest self = new ListOrderRequest();
        return TeaModel.build(map, self);
    }

    public ListOrderRequest setCredentialNo(String credentialNo) {
        this.credentialNo = credentialNo;
        return this;
    }
    public String getCredentialNo() {
        return this.credentialNo;
    }

    public ListOrderRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ListOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ListOrderRequest setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public ListOrderRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListOrderRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListOrderRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOrderRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
