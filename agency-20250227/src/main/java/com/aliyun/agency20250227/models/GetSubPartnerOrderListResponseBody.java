// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetSubPartnerOrderListResponseBody extends TeaModel {
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
    public java.util.List<GetSubPartnerOrderListResponseBodyData> data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries that meet the query conditions. This is an optional parameter and is not returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static GetSubPartnerOrderListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubPartnerOrderListResponseBody self = new GetSubPartnerOrderListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubPartnerOrderListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSubPartnerOrderListResponseBody setData(java.util.List<GetSubPartnerOrderListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetSubPartnerOrderListResponseBodyData> getData() {
        return this.data;
    }

    public GetSubPartnerOrderListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubPartnerOrderListResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetSubPartnerOrderListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSubPartnerOrderListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSubPartnerOrderListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSubPartnerOrderListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class GetSubPartnerOrderListResponseBodyData extends TeaModel {
        /**
         * <p>The order discount.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("AmountDiscount")
        public Double amountDiscount;

        /**
         * <p>The actual payment amount.</p>
         * 
         * <strong>example:</strong>
         * <p>3750</p>
         */
        @NameInMap("AmountDue")
        public Double amountDue;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-07 07:52:22</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The customer classification.</p>
         * 
         * <strong>example:</strong>
         * <p>C类</p>
         */
        @NameInMap("CustomerClassification")
        public String customerClassification;

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
         * <p>3750</p>
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
         * <li>2: deprecated</li>
         * <li>3: paid.</li>
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
         * <li>BUY: new purchase</li>
         * <li>UPGRADE: upgrade</li>
         * <li>DOWNGRADE: downgrade</li>
         * <li>RENEW: renewal</li>
         * <li>REFUND: refund</li>
         * <li>OTHERS: other.</li>
         * </ul>
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
         * <p>2024-07-07 07:52:22</p>
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
         * <p>3750</p>
         */
        @NameInMap("Price")
        public Double price;

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
         * <p>202502233443</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The name of the secondary partner.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx有限公司</p>
         */
        @NameInMap("SubPartnerName")
        public String subPartnerName;

        /**
         * <p>The UID of the secondary partner.</p>
         * 
         * <strong>example:</strong>
         * <p>1123132</p>
         */
        @NameInMap("SubPartnerUid")
        public Long subPartnerUid;

        public static GetSubPartnerOrderListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSubPartnerOrderListResponseBodyData self = new GetSubPartnerOrderListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSubPartnerOrderListResponseBodyData setAmountDiscount(Double amountDiscount) {
            this.amountDiscount = amountDiscount;
            return this;
        }
        public Double getAmountDiscount() {
            return this.amountDiscount;
        }

        public GetSubPartnerOrderListResponseBodyData setAmountDue(Double amountDue) {
            this.amountDue = amountDue;
            return this;
        }
        public Double getAmountDue() {
            return this.amountDue;
        }

        public GetSubPartnerOrderListResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetSubPartnerOrderListResponseBodyData setCustomerClassification(String customerClassification) {
            this.customerClassification = customerClassification;
            return this;
        }
        public String getCustomerClassification() {
            return this.customerClassification;
        }

        public GetSubPartnerOrderListResponseBodyData setDeductedAmountByCoupons(Double deductedAmountByCoupons) {
            this.deductedAmountByCoupons = deductedAmountByCoupons;
            return this;
        }
        public Double getDeductedAmountByCoupons() {
            return this.deductedAmountByCoupons;
        }

        public GetSubPartnerOrderListResponseBodyData setDiscountedPrice(Double discountedPrice) {
            this.discountedPrice = discountedPrice;
            return this;
        }
        public Double getDiscountedPrice() {
            return this.discountedPrice;
        }

        public GetSubPartnerOrderListResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public GetSubPartnerOrderListResponseBodyData setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public GetSubPartnerOrderListResponseBodyData setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public GetSubPartnerOrderListResponseBodyData setPaidAt(String paidAt) {
            this.paidAt = paidAt;
            return this;
        }
        public String getPaidAt() {
            return this.paidAt;
        }

        public GetSubPartnerOrderListResponseBodyData setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public GetSubPartnerOrderListResponseBodyData setPrice(Double price) {
            this.price = price;
            return this;
        }
        public Double getPrice() {
            return this.price;
        }

        public GetSubPartnerOrderListResponseBodyData setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public GetSubPartnerOrderListResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetSubPartnerOrderListResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetSubPartnerOrderListResponseBodyData setSubPartnerName(String subPartnerName) {
            this.subPartnerName = subPartnerName;
            return this;
        }
        public String getSubPartnerName() {
            return this.subPartnerName;
        }

        public GetSubPartnerOrderListResponseBodyData setSubPartnerUid(Long subPartnerUid) {
            this.subPartnerUid = subPartnerUid;
            return this;
        }
        public Long getSubPartnerUid() {
            return this.subPartnerUid;
        }

    }

}
