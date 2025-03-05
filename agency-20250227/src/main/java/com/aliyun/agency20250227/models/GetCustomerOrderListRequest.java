// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetCustomerOrderListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test_123</p>
     */
    @NameInMap("CustomerAccount")
    public String customerAccount;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("CustomerUid")
    public Long customerUid;

    /**
     * <strong>example:</strong>
     * <p>1727789348000</p>
     */
    @NameInMap("OrderCreateAfter")
    public Long orderCreateAfter;

    /**
     * <strong>example:</strong>
     * <p>1741008566000</p>
     */
    @NameInMap("OrderCreateBefore")
    public Long orderCreateBefore;

    /**
     * <strong>example:</strong>
     * <p>13595216</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <strong>example:</strong>
     * <p>1727789348000</p>
     */
    @NameInMap("OrderPayAfter")
    public Long orderPayAfter;

    /**
     * <strong>example:</strong>
     * <p>1741008566000</p>
     */
    @NameInMap("OrderPayBefore")
    public Long orderPayBefore;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("OrderStatus")
    public Integer orderStatus;

    @NameInMap("OrderTypeList")
    public java.util.List<String> orderTypeList;

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
     * <p>1</p>
     */
    @NameInMap("PayAmountAfter")
    public Double payAmountAfter;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("PayAmountBefore")
    public Double payAmountBefore;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PayType")
    public Integer payType;

    /**
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductName")
    public String productName;

    /**
     * <strong>example:</strong>
     * <p>202502002231</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>1234532</p>
     */
    @NameInMap("RamAccountForCustomerManager")
    public String ramAccountForCustomerManager;

    public static GetCustomerOrderListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerOrderListRequest self = new GetCustomerOrderListRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomerOrderListRequest setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount;
        return this;
    }
    public String getCustomerAccount() {
        return this.customerAccount;
    }

    public GetCustomerOrderListRequest setCustomerUid(Long customerUid) {
        this.customerUid = customerUid;
        return this;
    }
    public Long getCustomerUid() {
        return this.customerUid;
    }

    public GetCustomerOrderListRequest setOrderCreateAfter(Long orderCreateAfter) {
        this.orderCreateAfter = orderCreateAfter;
        return this;
    }
    public Long getOrderCreateAfter() {
        return this.orderCreateAfter;
    }

    public GetCustomerOrderListRequest setOrderCreateBefore(Long orderCreateBefore) {
        this.orderCreateBefore = orderCreateBefore;
        return this;
    }
    public Long getOrderCreateBefore() {
        return this.orderCreateBefore;
    }

    public GetCustomerOrderListRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetCustomerOrderListRequest setOrderPayAfter(Long orderPayAfter) {
        this.orderPayAfter = orderPayAfter;
        return this;
    }
    public Long getOrderPayAfter() {
        return this.orderPayAfter;
    }

    public GetCustomerOrderListRequest setOrderPayBefore(Long orderPayBefore) {
        this.orderPayBefore = orderPayBefore;
        return this;
    }
    public Long getOrderPayBefore() {
        return this.orderPayBefore;
    }

    public GetCustomerOrderListRequest setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public Integer getOrderStatus() {
        return this.orderStatus;
    }

    public GetCustomerOrderListRequest setOrderTypeList(java.util.List<String> orderTypeList) {
        this.orderTypeList = orderTypeList;
        return this;
    }
    public java.util.List<String> getOrderTypeList() {
        return this.orderTypeList;
    }

    public GetCustomerOrderListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetCustomerOrderListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetCustomerOrderListRequest setPayAmountAfter(Double payAmountAfter) {
        this.payAmountAfter = payAmountAfter;
        return this;
    }
    public Double getPayAmountAfter() {
        return this.payAmountAfter;
    }

    public GetCustomerOrderListRequest setPayAmountBefore(Double payAmountBefore) {
        this.payAmountBefore = payAmountBefore;
        return this;
    }
    public Double getPayAmountBefore() {
        return this.payAmountBefore;
    }

    public GetCustomerOrderListRequest setPayType(Integer payType) {
        this.payType = payType;
        return this;
    }
    public Integer getPayType() {
        return this.payType;
    }

    public GetCustomerOrderListRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetCustomerOrderListRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public GetCustomerOrderListRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetCustomerOrderListRequest setRamAccountForCustomerManager(String ramAccountForCustomerManager) {
        this.ramAccountForCustomerManager = ramAccountForCustomerManager;
        return this;
    }
    public String getRamAccountForCustomerManager() {
        return this.ramAccountForCustomerManager;
    }

}
