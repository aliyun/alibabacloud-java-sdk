// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetCustomerOrdersRequest extends TeaModel {
    /**
     * <p>The customer account.</p>
     * 
     * <strong>example:</strong>
     * <p>test_123</p>
     */
    @NameInMap("CustomerAccount")
    public String customerAccount;

    /**
     * <p>The account manager.</p>
     * 
     * <strong>example:</strong>
     * <p>myBd</p>
     */
    @NameInMap("CustomerManager")
    public String customerManager;

    /**
     * <p>The customer UID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("CustomerUid")
    public Long customerUid;

    /**
     * <p>The end time. This parameter is used in combination with TimeType. Format: yyyy-MM-dd HH:mm:ss.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-23 00:00:00</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>209335720330622</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The order source. Valid values:</p>
     * <ul>
     * <li>0: Regular customer.</li>
     * <li>1: Enterprise customer.</li>
     * <li>2: Tier-2 distributor.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OrderSource")
    public Integer orderSource;

    /**
     * <p>The order status. Valid values:</p>
     * <ul>
     * <li>1: Unpaid.</li>
     * <li>2: Canceled.</li>
     * <li>3: Paid.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("OrderStatus")
    public Integer orderStatus;

    /**
     * <p>The order type. Valid values:</p>
     * <ul>
     * <li>BUY: New purchase.</li>
     * <li>UPGRADE: Upgrade.</li>
     * <li>DOWNGRADE: Downgrade.</li>
     * <li>RENEW: Renewal.</li>
     * <li>REFUND: Refund.</li>
     * <li>OTHERS: Others.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RENEW</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The current page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product detail code.</p>
     * 
     * <strong>example:</strong>
     * <p>vm_intl</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The start time. This parameter is used in combination with TimeType. Format: yyyy-MM-dd HH:mm:ss.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-13 00:00:00</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The time type used as the basis for the query. This is not a date or time value. Valid values:</p>
     * <ul>
     * <li>1: Payment time.</li>
     * <li>2: Order placement time.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TimeType")
    public Integer timeType;

    public static GetCustomerOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerOrdersRequest self = new GetCustomerOrdersRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomerOrdersRequest setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount;
        return this;
    }
    public String getCustomerAccount() {
        return this.customerAccount;
    }

    public GetCustomerOrdersRequest setCustomerManager(String customerManager) {
        this.customerManager = customerManager;
        return this;
    }
    public String getCustomerManager() {
        return this.customerManager;
    }

    public GetCustomerOrdersRequest setCustomerUid(Long customerUid) {
        this.customerUid = customerUid;
        return this;
    }
    public Long getCustomerUid() {
        return this.customerUid;
    }

    public GetCustomerOrdersRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetCustomerOrdersRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetCustomerOrdersRequest setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
        return this;
    }
    public Integer getOrderSource() {
        return this.orderSource;
    }

    public GetCustomerOrdersRequest setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public Integer getOrderStatus() {
        return this.orderStatus;
    }

    public GetCustomerOrdersRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public GetCustomerOrdersRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetCustomerOrdersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetCustomerOrdersRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public GetCustomerOrdersRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public GetCustomerOrdersRequest setTimeType(Integer timeType) {
        this.timeType = timeType;
        return this;
    }
    public Integer getTimeType() {
        return this.timeType;
    }

}
