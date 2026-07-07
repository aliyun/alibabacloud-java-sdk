// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class OrderListResult extends TeaModel {
    /**
     * <p>Collection of orders</p>
     */
    @NameInMap("orderList")
    public java.util.List<OrderResult> orderList;

    /**
     * <p>The request ID for the API call</p>
     * 
     * <strong>example:</strong>
     * <p>841471F6-5D61-1331-8C38-2****B55</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Total number of orders</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("total")
    public Integer total;

    public static OrderListResult build(java.util.Map<String, ?> map) throws Exception {
        OrderListResult self = new OrderListResult();
        return TeaModel.build(map, self);
    }

    public OrderListResult setOrderList(java.util.List<OrderResult> orderList) {
        this.orderList = orderList;
        return this;
    }
    public java.util.List<OrderResult> getOrderList() {
        return this.orderList;
    }

    public OrderListResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OrderListResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
