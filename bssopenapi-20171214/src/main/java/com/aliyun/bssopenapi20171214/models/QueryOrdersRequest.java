// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryOrdersRequest extends TeaModel {
    /**
     * <p>The end time of the period during which the orders were created. By default, orders within the last hour are queried. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    /**
     * <p>The start time of the period during which the orders were created. By default, orders within the last hour are queried. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    /**
     * <p>The type of the order. Valid values:</p>
     * <br>
     * <p>*   New: purchases an instance.</p>
     * <p>*   Renew: renews an instance.</p>
     * <p>*   Upgrade: upgrades the configurations of an instance.</p>
     * <p>*   Refund: applies for a refund.</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the page to return.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of payment. Valid values for a non-refund order:</p>
     * <br>
     * <p>*   Unpaid: The order is not paid.</p>
     * <p>*   Paid: The order is paid.</p>
     * <p>*   Cancelled: The order is canceled.</p>
     * <br>
     * <p>> : You can set this parameter to NULL for a refund order.</p>
     */
    @NameInMap("PaymentStatus")
    public String paymentStatus;

    /**
     * <p>The code of the service.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The type of the service.</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The billing method. Valid values:</p>
     * <br>
     * <p>*   Subscription: subscription</p>
     * <p>*   PayAsYouGo: pay-as-you-go</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static QueryOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrdersRequest self = new QueryOrdersRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrdersRequest setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public QueryOrdersRequest setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    public QueryOrdersRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public QueryOrdersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryOrdersRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryOrdersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryOrdersRequest setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }
    public String getPaymentStatus() {
        return this.paymentStatus;
    }

    public QueryOrdersRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryOrdersRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QueryOrdersRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

}
