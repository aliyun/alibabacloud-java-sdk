// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelCancelOrRefundResponseBody extends TeaModel {
    @NameInMap("Data")
    public GlobalHotelCancelOrRefundResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>CreateOrderFailed</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>创建订单失败</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>260E4F99-983D-1919-834C-5C42E98E5B2B</p>
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
     * <p>TraceId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static GlobalHotelCancelOrRefundResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelCancelOrRefundResponseBody self = new GlobalHotelCancelOrRefundResponseBody();
        return TeaModel.build(map, self);
    }

    public GlobalHotelCancelOrRefundResponseBody setData(GlobalHotelCancelOrRefundResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GlobalHotelCancelOrRefundResponseBodyData getData() {
        return this.data;
    }

    public GlobalHotelCancelOrRefundResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GlobalHotelCancelOrRefundResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GlobalHotelCancelOrRefundResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GlobalHotelCancelOrRefundResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GlobalHotelCancelOrRefundResponseBody setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class GlobalHotelCancelOrRefundResponseBodyDataTotalPenaltyAmount extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Amount")
        public String amount;

        /**
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelCancelOrRefundResponseBodyDataTotalPenaltyAmount build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelCancelOrRefundResponseBodyDataTotalPenaltyAmount self = new GlobalHotelCancelOrRefundResponseBodyDataTotalPenaltyAmount();
            return TeaModel.build(map, self);
        }

        public GlobalHotelCancelOrRefundResponseBodyDataTotalPenaltyAmount setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GlobalHotelCancelOrRefundResponseBodyDataTotalPenaltyAmount setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GlobalHotelCancelOrRefundResponseBodyDataTotalPenaltyAmount setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class GlobalHotelCancelOrRefundResponseBodyDataTotalRefundAmount extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Amount")
        public String amount;

        /**
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelCancelOrRefundResponseBodyDataTotalRefundAmount build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelCancelOrRefundResponseBodyDataTotalRefundAmount self = new GlobalHotelCancelOrRefundResponseBodyDataTotalRefundAmount();
            return TeaModel.build(map, self);
        }

        public GlobalHotelCancelOrRefundResponseBodyDataTotalRefundAmount setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GlobalHotelCancelOrRefundResponseBodyDataTotalRefundAmount setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GlobalHotelCancelOrRefundResponseBodyDataTotalRefundAmount setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class GlobalHotelCancelOrRefundResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>RF202606290001</p>
         */
        @NameInMap("RefundOrderId")
        public String refundOrderId;

        @NameInMap("TotalPenaltyAmount")
        public GlobalHotelCancelOrRefundResponseBodyDataTotalPenaltyAmount totalPenaltyAmount;

        @NameInMap("TotalRefundAmount")
        public GlobalHotelCancelOrRefundResponseBodyDataTotalRefundAmount totalRefundAmount;

        /**
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelCancelOrRefundResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelCancelOrRefundResponseBodyData self = new GlobalHotelCancelOrRefundResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GlobalHotelCancelOrRefundResponseBodyData setRefundOrderId(String refundOrderId) {
            this.refundOrderId = refundOrderId;
            return this;
        }
        public String getRefundOrderId() {
            return this.refundOrderId;
        }

        public GlobalHotelCancelOrRefundResponseBodyData setTotalPenaltyAmount(GlobalHotelCancelOrRefundResponseBodyDataTotalPenaltyAmount totalPenaltyAmount) {
            this.totalPenaltyAmount = totalPenaltyAmount;
            return this;
        }
        public GlobalHotelCancelOrRefundResponseBodyDataTotalPenaltyAmount getTotalPenaltyAmount() {
            return this.totalPenaltyAmount;
        }

        public GlobalHotelCancelOrRefundResponseBodyData setTotalRefundAmount(GlobalHotelCancelOrRefundResponseBodyDataTotalRefundAmount totalRefundAmount) {
            this.totalRefundAmount = totalRefundAmount;
            return this;
        }
        public GlobalHotelCancelOrRefundResponseBodyDataTotalRefundAmount getTotalRefundAmount() {
            return this.totalRefundAmount;
        }

        public GlobalHotelCancelOrRefundResponseBodyData setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

}
