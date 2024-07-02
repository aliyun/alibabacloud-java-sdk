// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class OrderResult extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2023-09-11T12:22:24.000+08:00</p>
     */
    @NameInMap("createDate")
    public String createDate;

    /**
     * <strong>example:</strong>
     * <p>12****01</p>
     */
    @NameInMap("distributorId")
    public String distributorId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("logisticsStatus")
    public String logisticsStatus;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("orderAmount")
    public Long orderAmount;

    /**
     * <strong>example:</strong>
     * <p>6692****5457</p>
     */
    @NameInMap("orderId")
    public String orderId;

    @NameInMap("orderLineList")
    public java.util.List<OrderLineResult> orderLineList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("orderStatus")
    public String orderStatus;

    /**
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
