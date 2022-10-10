// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListOrderResponseBody extends TeaModel {
    @NameInMap("Orders")
    public java.util.List<Order> orders;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrderResponseBody self = new ListOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrderResponseBody setOrders(java.util.List<Order> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<Order> getOrders() {
        return this.orders;
    }

    public ListOrderResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListOrderResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrderResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
