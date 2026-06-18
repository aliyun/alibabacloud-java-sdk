// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetCustomerOrderListResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetCustomerOrderListResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2103a30617045934095083027d88c5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static GetCustomerOrderListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerOrderListResponseBody self = new GetCustomerOrderListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomerOrderListResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetCustomerOrderListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomerOrderListResponseBody setData(java.util.List<GetCustomerOrderListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCustomerOrderListResponseBodyData> getData() {
        return this.data;
    }

    public GetCustomerOrderListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCustomerOrderListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCustomerOrderListResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetCustomerOrderListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetCustomerOrderListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomerOrderListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetCustomerOrderListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class GetCustomerOrderListResponseBodyData extends TeaModel {
        /**
         * <p>The order discount.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AmountDiscount")
        public Double amountDiscount;

        /**
         * <p>The actual payment amount.</p>
         * 
         * <strong>example:</strong>
         * <p>29137</p>
         */
        @NameInMap("AmountDue")
        public Double amountDue;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-24 14:20:40</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The customer account.</p>
         * 
         * <strong>example:</strong>
         * <p>test_123</p>
         */
        @NameInMap("CustomerAccount")
        public String customerAccount;

        /**
         * <p>The customer classification.</p>
         * 
         * <strong>example:</strong>
         * <p>C类</p>
         */
        @NameInMap("CustomerClassification")
        public String customerClassification;

        /**
         * <p>The customer UID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("CustomerUid")
        public Long customerUid;

        /**
         * <p>The coupon amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeductedAmountByCoupons")
        public Double deductedAmountByCoupons;

        /**
         * <p>The discounted price.</p>
         * 
         * <strong>example:</strong>
         * <p>29137</p>
         */
        @NameInMap("DiscountedPrice")
        public Double discountedPrice;

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>236414227150922</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        /**
         * <p>The order status. Valid values:</p>
         * <ul>
         * <li>1: unpaid</li>
         * <li>2: paid</li>
         * <li>3: canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("OrderStatus")
        public Integer orderStatus;

        /**
         * <p>The order type. Valid values: BUY, UPGRADE, DOWNGRADE, RENEW, REFUND, OTHERS.</p>
         * 
         * <strong>example:</strong>
         * <p>BUY</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>The payment time.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-24 14:20:40</p>
         */
        @NameInMap("PaidAt")
        public String paidAt;

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
         * <p>The original price or list price.</p>
         * 
         * <strong>example:</strong>
         * <p>29137</p>
         */
        @NameInMap("Price")
        public Double price;

        /**
         * <p>The product code.</p>
         * 
         * <strong>example:</strong>
         * <p>slb</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The product name.</p>
         * 
         * <strong>example:</strong>
         * <p>slb</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The opportunity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>202502230421</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The employee who follows up with the customer.</p>
         */
        @NameInMap("RamAccountForCustomerManagers")
        public java.util.List<String> ramAccountForCustomerManagers;

        public static GetCustomerOrderListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerOrderListResponseBodyData self = new GetCustomerOrderListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomerOrderListResponseBodyData setAmountDiscount(Double amountDiscount) {
            this.amountDiscount = amountDiscount;
            return this;
        }
        public Double getAmountDiscount() {
            return this.amountDiscount;
        }

        public GetCustomerOrderListResponseBodyData setAmountDue(Double amountDue) {
            this.amountDue = amountDue;
            return this;
        }
        public Double getAmountDue() {
            return this.amountDue;
        }

        public GetCustomerOrderListResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetCustomerOrderListResponseBodyData setCustomerAccount(String customerAccount) {
            this.customerAccount = customerAccount;
            return this;
        }
        public String getCustomerAccount() {
            return this.customerAccount;
        }

        public GetCustomerOrderListResponseBodyData setCustomerClassification(String customerClassification) {
            this.customerClassification = customerClassification;
            return this;
        }
        public String getCustomerClassification() {
            return this.customerClassification;
        }

        public GetCustomerOrderListResponseBodyData setCustomerUid(Long customerUid) {
            this.customerUid = customerUid;
            return this;
        }
        public Long getCustomerUid() {
            return this.customerUid;
        }

        public GetCustomerOrderListResponseBodyData setDeductedAmountByCoupons(Double deductedAmountByCoupons) {
            this.deductedAmountByCoupons = deductedAmountByCoupons;
            return this;
        }
        public Double getDeductedAmountByCoupons() {
            return this.deductedAmountByCoupons;
        }

        public GetCustomerOrderListResponseBodyData setDiscountedPrice(Double discountedPrice) {
            this.discountedPrice = discountedPrice;
            return this;
        }
        public Double getDiscountedPrice() {
            return this.discountedPrice;
        }

        public GetCustomerOrderListResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public GetCustomerOrderListResponseBodyData setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public GetCustomerOrderListResponseBodyData setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public GetCustomerOrderListResponseBodyData setPaidAt(String paidAt) {
            this.paidAt = paidAt;
            return this;
        }
        public String getPaidAt() {
            return this.paidAt;
        }

        public GetCustomerOrderListResponseBodyData setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public GetCustomerOrderListResponseBodyData setPrice(Double price) {
            this.price = price;
            return this;
        }
        public Double getPrice() {
            return this.price;
        }

        public GetCustomerOrderListResponseBodyData setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public GetCustomerOrderListResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetCustomerOrderListResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetCustomerOrderListResponseBodyData setRamAccountForCustomerManagers(java.util.List<String> ramAccountForCustomerManagers) {
            this.ramAccountForCustomerManagers = ramAccountForCustomerManagers;
            return this;
        }
        public java.util.List<String> getRamAccountForCustomerManagers() {
            return this.ramAccountForCustomerManagers;
        }

    }

}
