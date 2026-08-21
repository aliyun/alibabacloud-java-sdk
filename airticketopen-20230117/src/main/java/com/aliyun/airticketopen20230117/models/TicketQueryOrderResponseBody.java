// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketQueryOrderResponseBody extends TeaModel {
    @NameInMap("Data")
    public TicketQueryOrderResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>DistributorOrderIdInvalid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>分销商订单号不合法</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static TicketQueryOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TicketQueryOrderResponseBody self = new TicketQueryOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public TicketQueryOrderResponseBody setData(TicketQueryOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TicketQueryOrderResponseBodyData getData() {
        return this.data;
    }

    public TicketQueryOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TicketQueryOrderResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public TicketQueryOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TicketQueryOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TicketQueryOrderResponseBodyDataOrder extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FundStatus")
        public Integer fundStatus;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OrderStatus")
        public Integer orderStatus;

        public static TicketQueryOrderResponseBodyDataOrder build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryOrderResponseBodyDataOrder self = new TicketQueryOrderResponseBodyDataOrder();
            return TeaModel.build(map, self);
        }

        public TicketQueryOrderResponseBodyDataOrder setFundStatus(Integer fundStatus) {
            this.fundStatus = fundStatus;
            return this;
        }
        public Integer getFundStatus() {
            return this.fundStatus;
        }

        public TicketQueryOrderResponseBodyDataOrder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public TicketQueryOrderResponseBodyDataOrder setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

    }

    public static class TicketQueryOrderResponseBodyDataVouchers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalTimes")
        public Integer totalTimes;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.alitrip.com/1234567890.png">https://www.alitrip.com/1234567890.png</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static TicketQueryOrderResponseBodyDataVouchers build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryOrderResponseBodyDataVouchers self = new TicketQueryOrderResponseBodyDataVouchers();
            return TeaModel.build(map, self);
        }

        public TicketQueryOrderResponseBodyDataVouchers setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public TicketQueryOrderResponseBodyDataVouchers setTotalTimes(Integer totalTimes) {
            this.totalTimes = totalTimes;
            return this;
        }
        public Integer getTotalTimes() {
            return this.totalTimes;
        }

        public TicketQueryOrderResponseBodyDataVouchers setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public TicketQueryOrderResponseBodyDataVouchers setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class TicketQueryOrderResponseBodyData extends TeaModel {
        @NameInMap("Order")
        public TicketQueryOrderResponseBodyDataOrder order;

        @NameInMap("Vouchers")
        public java.util.List<TicketQueryOrderResponseBodyDataVouchers> vouchers;

        public static TicketQueryOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryOrderResponseBodyData self = new TicketQueryOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TicketQueryOrderResponseBodyData setOrder(TicketQueryOrderResponseBodyDataOrder order) {
            this.order = order;
            return this;
        }
        public TicketQueryOrderResponseBodyDataOrder getOrder() {
            return this.order;
        }

        public TicketQueryOrderResponseBodyData setVouchers(java.util.List<TicketQueryOrderResponseBodyDataVouchers> vouchers) {
            this.vouchers = vouchers;
            return this;
        }
        public java.util.List<TicketQueryOrderResponseBodyDataVouchers> getVouchers() {
            return this.vouchers;
        }

    }

}
