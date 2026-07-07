// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class OrderResult extends TeaModel {
    /**
     * <p>The order creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-09-11T12:22:24.000+08:00</p>
     */
    @NameInMap("createDate")
    public String createDate;

    /**
     * <p>The distributor ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12****01</p>
     */
    @NameInMap("distributorId")
    public String distributorId;

    /**
     * <p>The logistics status. Valid values: 1 (Awaiting Seller\&quot;s Shipment), 2 (Awaiting Buyer\&quot;s Confirmation), 3 (Received), 4 (Returned), 5 (Partially Received), 6 (Partially Shipped), and 8 (Logistics Order Not Created).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("logisticsStatus")
    public String logisticsStatus;

    /**
     * <p>The order amount, in cents.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("orderAmount")
    public Long orderAmount;

    /**
     * <p>The reason the order was closed.</p>
     * 
     * <strong>example:</strong>
     * <p>系统关单</p>
     */
    @NameInMap("orderClosedReason")
    public String orderClosedReason;

    /**
     * <p>The ID of the main order.</p>
     * 
     * <strong>example:</strong>
     * <p>6692****5457</p>
     */
    @NameInMap("orderId")
    public String orderId;

    /**
     * <p>The list of sub-orders.</p>
     */
    @NameInMap("orderLineList")
    public java.util.List<OrderLineResult> orderLineList;

    /**
     * <p>The order status. Valid values: 1 (Pending Payment), 2 (Paid), 4 (Closed with Refund), 6 (Transaction Successful), and 8 (Closed).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("orderStatus")
    public String orderStatus;

    /**
     * <p>The unique identifier for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>841471F6-5D61-1331-8C38-2****B55</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static OrderResult build(java.util.Map<String, ?> map) throws Exception {
        OrderResult self = new OrderResult();
        return TeaModel.build(map, self);
    }

    public OrderResult setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }
    public String getCreateDate() {
        return this.createDate;
    }

    public OrderResult setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public OrderResult setLogisticsStatus(String logisticsStatus) {
        this.logisticsStatus = logisticsStatus;
        return this;
    }
    public String getLogisticsStatus() {
        return this.logisticsStatus;
    }

    public OrderResult setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
        return this;
    }
    public Long getOrderAmount() {
        return this.orderAmount;
    }

    public OrderResult setOrderClosedReason(String orderClosedReason) {
        this.orderClosedReason = orderClosedReason;
        return this;
    }
    public String getOrderClosedReason() {
        return this.orderClosedReason;
    }

    public OrderResult setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OrderResult setOrderLineList(java.util.List<OrderLineResult> orderLineList) {
        this.orderLineList = orderLineList;
        return this;
    }
    public java.util.List<OrderLineResult> getOrderLineList() {
        return this.orderLineList;
    }

    public OrderResult setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public OrderResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
