// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class CancelOrRefundResponseBody extends TeaModel {
    @NameInMap("Data")
    public CancelOrRefundResponseBodyData data;

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

    public static CancelOrRefundResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelOrRefundResponseBody self = new CancelOrRefundResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelOrRefundResponseBody setData(CancelOrRefundResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CancelOrRefundResponseBodyData getData() {
        return this.data;
    }

    public CancelOrRefundResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CancelOrRefundResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CancelOrRefundResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelOrRefundResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CancelOrRefundResponseBody setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class CancelOrRefundResponseBodyDataTotalPenaltyAmount extends TeaModel {
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

        public static CancelOrRefundResponseBodyDataTotalPenaltyAmount build(java.util.Map<String, ?> map) throws Exception {
            CancelOrRefundResponseBodyDataTotalPenaltyAmount self = new CancelOrRefundResponseBodyDataTotalPenaltyAmount();
            return TeaModel.build(map, self);
        }

        public CancelOrRefundResponseBodyDataTotalPenaltyAmount setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public CancelOrRefundResponseBodyDataTotalPenaltyAmount setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public CancelOrRefundResponseBodyDataTotalPenaltyAmount setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class CancelOrRefundResponseBodyDataTotalRefundAmount extends TeaModel {
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

        public static CancelOrRefundResponseBodyDataTotalRefundAmount build(java.util.Map<String, ?> map) throws Exception {
            CancelOrRefundResponseBodyDataTotalRefundAmount self = new CancelOrRefundResponseBodyDataTotalRefundAmount();
            return TeaModel.build(map, self);
        }

        public CancelOrRefundResponseBodyDataTotalRefundAmount setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public CancelOrRefundResponseBodyDataTotalRefundAmount setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public CancelOrRefundResponseBodyDataTotalRefundAmount setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class CancelOrRefundResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>RF202606290001</p>
         */
        @NameInMap("RefundOrderId")
        public String refundOrderId;

        @NameInMap("TotalPenaltyAmount")
        public CancelOrRefundResponseBodyDataTotalPenaltyAmount totalPenaltyAmount;

        @NameInMap("TotalRefundAmount")
        public CancelOrRefundResponseBodyDataTotalRefundAmount totalRefundAmount;

        /**
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static CancelOrRefundResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CancelOrRefundResponseBodyData self = new CancelOrRefundResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CancelOrRefundResponseBodyData setRefundOrderId(String refundOrderId) {
            this.refundOrderId = refundOrderId;
            return this;
        }
        public String getRefundOrderId() {
            return this.refundOrderId;
        }

        public CancelOrRefundResponseBodyData setTotalPenaltyAmount(CancelOrRefundResponseBodyDataTotalPenaltyAmount totalPenaltyAmount) {
            this.totalPenaltyAmount = totalPenaltyAmount;
            return this;
        }
        public CancelOrRefundResponseBodyDataTotalPenaltyAmount getTotalPenaltyAmount() {
            return this.totalPenaltyAmount;
        }

        public CancelOrRefundResponseBodyData setTotalRefundAmount(CancelOrRefundResponseBodyDataTotalRefundAmount totalRefundAmount) {
            this.totalRefundAmount = totalRefundAmount;
            return this;
        }
        public CancelOrRefundResponseBodyDataTotalRefundAmount getTotalRefundAmount() {
            return this.totalRefundAmount;
        }

        public CancelOrRefundResponseBodyData setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

}
