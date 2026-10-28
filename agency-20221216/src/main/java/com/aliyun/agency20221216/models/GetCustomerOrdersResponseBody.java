// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetCustomerOrdersResponseBody extends TeaModel {
    /**
     * <p>The result code.</p>
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
    public java.util.List<GetCustomerOrdersResponseBodyData> data;

    /**
     * <p>The message. The value is the same as the Code parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The message. The value is the same as the Code parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The current page number.</p>
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
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>23309219-4A34-589D-A3E0-9B2A3BFFD24F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>200: OK.</li>
     * <li>201: Parameter error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static GetCustomerOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerOrdersResponseBody self = new GetCustomerOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomerOrdersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomerOrdersResponseBody setData(java.util.List<GetCustomerOrdersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCustomerOrdersResponseBodyData> getData() {
        return this.data;
    }

    public GetCustomerOrdersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCustomerOrdersResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetCustomerOrdersResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetCustomerOrdersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetCustomerOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomerOrdersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetCustomerOrdersResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class GetCustomerOrdersResponseBodyData extends TeaModel {
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
        @NameInMap("CustomerNo")
        public Long customerNo;

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>236414227150922</p>
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
        public String orderSource;

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
         * <p>BUY</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>The original order price.</p>
         * 
         * <strong>example:</strong>
         * <p>3.92</p>
         */
        @NameInMap("OriginalCost")
        public Double originalCost;

        /**
         * <p>The payment method.</p>
         * 
         * <strong>example:</strong>
         * <p>3:32</p>
         */
        @NameInMap("PaymentMethod")
        public String paymentMethod;

        /**
         * <p>The payment time. Format: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-13 13:02:02</p>
         */
        @NameInMap("PaymentTime")
        public String paymentTime;

        /**
         * <p>The payable amount.</p>
         * 
         * <strong>example:</strong>
         * <p>3.92</p>
         */
        @NameInMap("PretaxCost")
        public Double pretaxCost;

        /**
         * <p>The product details.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("ProductDetail")
        public String productDetail;

        /**
         * <p>The product detail code.</p>
         * 
         * <strong>example:</strong>
         * <p>snapshot</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The order placement time. Format: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-13 13:02:02</p>
         */
        @NameInMap("TimeToOrder")
        public String timeToOrder;

        public static GetCustomerOrdersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerOrdersResponseBodyData self = new GetCustomerOrdersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomerOrdersResponseBodyData setCustomerAccount(String customerAccount) {
            this.customerAccount = customerAccount;
            return this;
        }
        public String getCustomerAccount() {
            return this.customerAccount;
        }

        public GetCustomerOrdersResponseBodyData setCustomerManager(String customerManager) {
            this.customerManager = customerManager;
            return this;
        }
        public String getCustomerManager() {
            return this.customerManager;
        }

        public GetCustomerOrdersResponseBodyData setCustomerNo(Long customerNo) {
            this.customerNo = customerNo;
            return this;
        }
        public Long getCustomerNo() {
            return this.customerNo;
        }

        public GetCustomerOrdersResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public GetCustomerOrdersResponseBodyData setOrderSource(String orderSource) {
            this.orderSource = orderSource;
            return this;
        }
        public String getOrderSource() {
            return this.orderSource;
        }

        public GetCustomerOrdersResponseBodyData setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public GetCustomerOrdersResponseBodyData setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public GetCustomerOrdersResponseBodyData setOriginalCost(Double originalCost) {
            this.originalCost = originalCost;
            return this;
        }
        public Double getOriginalCost() {
            return this.originalCost;
        }

        public GetCustomerOrdersResponseBodyData setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }
        public String getPaymentMethod() {
            return this.paymentMethod;
        }

        public GetCustomerOrdersResponseBodyData setPaymentTime(String paymentTime) {
            this.paymentTime = paymentTime;
            return this;
        }
        public String getPaymentTime() {
            return this.paymentTime;
        }

        public GetCustomerOrdersResponseBodyData setPretaxCost(Double pretaxCost) {
            this.pretaxCost = pretaxCost;
            return this;
        }
        public Double getPretaxCost() {
            return this.pretaxCost;
        }

        public GetCustomerOrdersResponseBodyData setProductDetail(String productDetail) {
            this.productDetail = productDetail;
            return this;
        }
        public String getProductDetail() {
            return this.productDetail;
        }

        public GetCustomerOrdersResponseBodyData setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetCustomerOrdersResponseBodyData setTimeToOrder(String timeToOrder) {
            this.timeToOrder = timeToOrder;
            return this;
        }
        public String getTimeToOrder() {
            return this.timeToOrder;
        }

    }

}
