// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DescribePayOrdersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PayOrders")
    public DescribePayOrdersResponseBodyPayOrders payOrders;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribePayOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePayOrdersResponseBody self = new DescribePayOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePayOrdersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePayOrdersResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribePayOrdersResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribePayOrdersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribePayOrdersResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribePayOrdersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePayOrdersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePayOrdersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePayOrdersResponseBody setPayOrders(DescribePayOrdersResponseBodyPayOrders payOrders) {
        this.payOrders = payOrders;
        return this;
    }
    public DescribePayOrdersResponseBodyPayOrders getPayOrders() {
        return this.payOrders;
    }

    public DescribePayOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePayOrdersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribePayOrdersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePayOrdersResponseBodyPayOrdersPayOrderInfo extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CommodityName")
        public String commodityName;

        @NameInMap("DetailName")
        public String detailName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtPay")
        public String gmtPay;

        @NameInMap("IsAccepted")
        public Boolean isAccepted;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("OrderStatus")
        public String orderStatus;

        @NameInMap("OrderType")
        public String orderType;

        @NameInMap("OriginalAmount")
        public Float originalAmount;

        @NameInMap("PayAmount")
        public Float payAmount;

        @NameInMap("Quantity")
        public Integer quantity;

        public static DescribePayOrdersResponseBodyPayOrdersPayOrderInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePayOrdersResponseBodyPayOrdersPayOrderInfo self = new DescribePayOrdersResponseBodyPayOrdersPayOrderInfo();
            return TeaModel.build(map, self);
        }

        public DescribePayOrdersResponseBodyPayOrdersPayOrderInfo setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribePayOrdersResponseBodyPayOrdersPayOrderInfo setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public DescribePayOrdersResponseBodyPayOrdersPayOrderInfo setDetailName(String detailName) {
            this.detailName = detailName;
            return this;
        }
        public String getDetailName() {
            return this.detailName;
        }

        public DescribePayOrdersResponseBodyPayOrdersPayOrderInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribePayOrdersResponseBodyPayOrdersPayOrderInfo setGmtPay(String gmtPay) {
            this.gmtPay = gmtPay;
            return this;
        }
        public String getGmtPay() {
            return this.gmtPay;
        }

        public DescribePayOrdersResponseBodyPayOrdersPayOrderInfo setIsAccepted(Boolean isAccepted) {
            this.isAccepted = isAccepted;
            return this;
        }
        public Boolean getIsAccepted() {
            return this.isAccepted;
        }

        public DescribePayOrdersResponseBodyPayOrdersPayOrderInfo setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public DescribePayOrdersResponseBodyPayOrdersPayOrderInfo setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public String getOrderStatus() {
            return this.orderStatus;
        }

        public DescribePayOrdersResponseBodyPayOrdersPayOrderInfo setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public DescribePayOrdersResponseBodyPayOrdersPayOrderInfo setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public DescribePayOrdersResponseBodyPayOrdersPayOrderInfo setPayAmount(Float payAmount) {
            this.payAmount = payAmount;
            return this;
        }
        public Float getPayAmount() {
            return this.payAmount;
        }

        public DescribePayOrdersResponseBodyPayOrdersPayOrderInfo setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

    }

    public static class DescribePayOrdersResponseBodyPayOrders extends TeaModel {
        @NameInMap("PayOrderInfo")
        public java.util.List<DescribePayOrdersResponseBodyPayOrdersPayOrderInfo> payOrderInfo;

        public static DescribePayOrdersResponseBodyPayOrders build(java.util.Map<String, ?> map) throws Exception {
            DescribePayOrdersResponseBodyPayOrders self = new DescribePayOrdersResponseBodyPayOrders();
            return TeaModel.build(map, self);
        }

        public DescribePayOrdersResponseBodyPayOrders setPayOrderInfo(java.util.List<DescribePayOrdersResponseBodyPayOrdersPayOrderInfo> payOrderInfo) {
            this.payOrderInfo = payOrderInfo;
            return this;
        }
        public java.util.List<DescribePayOrdersResponseBodyPayOrdersPayOrderInfo> getPayOrderInfo() {
            return this.payOrderInfo;
        }

    }

}
