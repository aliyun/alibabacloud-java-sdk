// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetSubPartnerOrderListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetSubPartnerOrderListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
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
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
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
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("AmountDiscount")
        public Double amountDiscount;

        /**
         * <strong>example:</strong>
         * <p>3750</p>
         */
        @NameInMap("AmountDue")
        public Double amountDue;

        /**
         * <strong>example:</strong>
         * <p>2024-07-07 07:52:22</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("CustomerClassification")
        public String customerClassification;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeductedAmountByCoupons")
        public Double deductedAmountByCoupons;

        /**
         * <strong>example:</strong>
         * <p>3750</p>
         */
        @NameInMap("DiscountedPrice")
        public Double discountedPrice;

        /**
         * <strong>example:</strong>
         * <p>236414227150922</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("OrderStatus")
        public Integer orderStatus;

        /**
         * <strong>example:</strong>
         * <p>BUY</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <strong>example:</strong>
         * <p>2024-07-07 07:52:22</p>
         */
        @NameInMap("PaidAt")
        public String paidAt;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PayType")
        public Integer payType;

        /**
         * <strong>example:</strong>
         * <p>3750</p>
         */
        @NameInMap("Price")
        public Double price;

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
         * <p>202502233443</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("SubPartnerName")
        public String subPartnerName;

        /**
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
