// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetCustomerOrdersRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test_123</p>
     */
    @NameInMap("CustomerAccount")
    public String customerAccount;

    /**
     * <strong>example:</strong>
     * <p>myBd</p>
     */
    @NameInMap("CustomerManager")
    public String customerManager;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("CustomerUid")
    public Long customerUid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-23 00:00:00</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <strong>example:</strong>
     * <p>209335720330622</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OrderSource")
    public Integer orderSource;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("OrderStatus")
    public Integer orderStatus;

    /**
     * <strong>example:</strong>
     * <p>RENEW</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>vm_intl</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-13 00:00:00</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
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
