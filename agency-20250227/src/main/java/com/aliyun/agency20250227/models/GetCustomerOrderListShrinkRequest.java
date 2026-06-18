// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetCustomerOrderListShrinkRequest extends TeaModel {
    /**
     * <p>The customer account.</p>
     * 
     * <strong>example:</strong>
     * <p>test_123</p>
     */
    @NameInMap("CustomerAccount")
    public String customerAccount;

    /**
     * <p>The customer UID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("CustomerUid")
    public Long customerUid;

    /**
     * <p>The start timestamp for order creation. The time range cannot exceed 6 months. The order creation time range and the order payment time range cannot both be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>1727789348000</p>
     */
    @NameInMap("OrderCreateAfter")
    public Long orderCreateAfter;

    /**
     * <p>The end timestamp for order creation. The time range cannot exceed 6 months. The order creation time range and the order payment time range cannot both be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>1741008566000</p>
     */
    @NameInMap("OrderCreateBefore")
    public Long orderCreateBefore;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>13595216</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The start timestamp for order payment. The time range cannot exceed 6 months. The order creation time range and the order payment time range cannot both be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>1727789348000</p>
     */
    @NameInMap("OrderPayAfter")
    public Long orderPayAfter;

    /**
     * <p>The end timestamp for order payment. The time range cannot exceed 6 months. The order creation time range and the order payment time range cannot both be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>1741008566000</p>
     */
    @NameInMap("OrderPayBefore")
    public Long orderPayBefore;

    /**
     * <p>The order status. Valid values:</p>
     * <ul>
     * <li>1: unpaid</li>
     * <li>2: canceled</li>
     * <li>3: paid.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("OrderStatus")
    public Integer orderStatus;

    /**
     * <p>The list of order types.</p>
     */
    @NameInMap("OrderTypeList")
    public String orderTypeListShrink;

    /**
     * <p>The page number.</p>
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
     * <p>The minimum actual payment amount.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PayAmountAfter")
    public Double payAmountAfter;

    /**
     * <p>The maximum actual payment amount.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("PayAmountBefore")
    public Double payAmountBefore;

    /**
     * <p>The payment type. Valid values:</p>
     * <ul>
     * <li>1: non-delegated payment</li>
     * <li>2: delegated payment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PayType")
    public Integer payType;

    /**
     * <p>The product code.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The product name.</p>
     * 
     * <strong>example:</strong>
     * <p>弹性计算</p>
     */
    @NameInMap("ProductName")
    public String productName;

    /**
     * <p>The opportunity ID.</p>
     * 
     * <strong>example:</strong>
     * <p>202502002231</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The employee who follows up with the customer.</p>
     * 
     * <strong>example:</strong>
     * <p>1234532</p>
     */
    @NameInMap("RamAccountForCustomerManager")
    public String ramAccountForCustomerManager;

    public static GetCustomerOrderListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerOrderListShrinkRequest self = new GetCustomerOrderListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomerOrderListShrinkRequest setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount;
        return this;
    }
    public String getCustomerAccount() {
        return this.customerAccount;
    }

    public GetCustomerOrderListShrinkRequest setCustomerUid(Long customerUid) {
        this.customerUid = customerUid;
        return this;
    }
    public Long getCustomerUid() {
        return this.customerUid;
    }

    public GetCustomerOrderListShrinkRequest setOrderCreateAfter(Long orderCreateAfter) {
        this.orderCreateAfter = orderCreateAfter;
        return this;
    }
    public Long getOrderCreateAfter() {
        return this.orderCreateAfter;
    }

    public GetCustomerOrderListShrinkRequest setOrderCreateBefore(Long orderCreateBefore) {
        this.orderCreateBefore = orderCreateBefore;
        return this;
    }
    public Long getOrderCreateBefore() {
        return this.orderCreateBefore;
    }

    public GetCustomerOrderListShrinkRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetCustomerOrderListShrinkRequest setOrderPayAfter(Long orderPayAfter) {
        this.orderPayAfter = orderPayAfter;
        return this;
    }
    public Long getOrderPayAfter() {
        return this.orderPayAfter;
    }

    public GetCustomerOrderListShrinkRequest setOrderPayBefore(Long orderPayBefore) {
        this.orderPayBefore = orderPayBefore;
        return this;
    }
    public Long getOrderPayBefore() {
        return this.orderPayBefore;
    }

    public GetCustomerOrderListShrinkRequest setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public Integer getOrderStatus() {
        return this.orderStatus;
    }

    public GetCustomerOrderListShrinkRequest setOrderTypeListShrink(String orderTypeListShrink) {
        this.orderTypeListShrink = orderTypeListShrink;
        return this;
    }
    public String getOrderTypeListShrink() {
        return this.orderTypeListShrink;
    }

    public GetCustomerOrderListShrinkRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetCustomerOrderListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetCustomerOrderListShrinkRequest setPayAmountAfter(Double payAmountAfter) {
        this.payAmountAfter = payAmountAfter;
        return this;
    }
    public Double getPayAmountAfter() {
        return this.payAmountAfter;
    }

    public GetCustomerOrderListShrinkRequest setPayAmountBefore(Double payAmountBefore) {
        this.payAmountBefore = payAmountBefore;
        return this;
    }
    public Double getPayAmountBefore() {
        return this.payAmountBefore;
    }

    public GetCustomerOrderListShrinkRequest setPayType(Integer payType) {
        this.payType = payType;
        return this;
    }
    public Integer getPayType() {
        return this.payType;
    }

    public GetCustomerOrderListShrinkRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetCustomerOrderListShrinkRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public GetCustomerOrderListShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetCustomerOrderListShrinkRequest setRamAccountForCustomerManager(String ramAccountForCustomerManager) {
        this.ramAccountForCustomerManager = ramAccountForCustomerManager;
        return this;
    }
    public String getRamAccountForCustomerManager() {
        return this.ramAccountForCustomerManager;
    }

}
