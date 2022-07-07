// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListReverseOrderResponseBody extends TeaModel {
    @NameInMap("Orders")
    public java.util.List<ReverseOrder> orders;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListReverseOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListReverseOrderResponseBody self = new ListReverseOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public ListReverseOrderResponseBody setOrders(java.util.List<ReverseOrder> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<ReverseOrder> getOrders() {
        return this.orders;
    }

    public ListReverseOrderResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListReverseOrderResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListReverseOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListReverseOrderResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
