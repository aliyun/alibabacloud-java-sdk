// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DescribePayOrdersRequest extends TeaModel {
    @NameInMap("FromDate")
    public String fromDate;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ToDate")
    public String toDate;

    public static DescribePayOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePayOrdersRequest self = new DescribePayOrdersRequest();
        return TeaModel.build(map, self);
    }

    public DescribePayOrdersRequest setFromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }
    public String getFromDate() {
        return this.fromDate;
    }

    public DescribePayOrdersRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DescribePayOrdersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePayOrdersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePayOrdersRequest setToDate(String toDate) {
        this.toDate = toDate;
        return this;
    }
    public String getToDate() {
        return this.toDate;
    }

}
