// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelApplyRefundResponseBody extends TeaModel {
    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public GlobalHotelApplyRefundResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateOrderFailed</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Failed to create order</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>260E4F99-983D-1919-834C-5C42E98E5B2B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>TraceId</p>
     * 
     * <strong>example:</strong>
     * <p>TraceId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static GlobalHotelApplyRefundResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelApplyRefundResponseBody self = new GlobalHotelApplyRefundResponseBody();
        return TeaModel.build(map, self);
    }

    public GlobalHotelApplyRefundResponseBody setData(GlobalHotelApplyRefundResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GlobalHotelApplyRefundResponseBodyData getData() {
        return this.data;
    }

    public GlobalHotelApplyRefundResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GlobalHotelApplyRefundResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GlobalHotelApplyRefundResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GlobalHotelApplyRefundResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GlobalHotelApplyRefundResponseBody setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class GlobalHotelApplyRefundResponseBodyDataTotalPenaltyAmount extends TeaModel {
        /**
         * <p>The amount in the smallest currency unit.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Amount")
        public String amount;

        /**
         * <p>The currency code in ISO 4217 format.</p>
         * 
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>TraceId</p>
         * 
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelApplyRefundResponseBodyDataTotalPenaltyAmount build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelApplyRefundResponseBodyDataTotalPenaltyAmount self = new GlobalHotelApplyRefundResponseBodyDataTotalPenaltyAmount();
            return TeaModel.build(map, self);
        }

        public GlobalHotelApplyRefundResponseBodyDataTotalPenaltyAmount setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GlobalHotelApplyRefundResponseBodyDataTotalPenaltyAmount setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GlobalHotelApplyRefundResponseBodyDataTotalPenaltyAmount setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class GlobalHotelApplyRefundResponseBodyDataTotalRefundAmount extends TeaModel {
        /**
         * <p>The amount in the smallest currency unit.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Amount")
        public String amount;

        /**
         * <p>The currency code in ISO 4217 format.</p>
         * 
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>TraceId</p>
         * 
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelApplyRefundResponseBodyDataTotalRefundAmount build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelApplyRefundResponseBodyDataTotalRefundAmount self = new GlobalHotelApplyRefundResponseBodyDataTotalRefundAmount();
            return TeaModel.build(map, self);
        }

        public GlobalHotelApplyRefundResponseBodyDataTotalRefundAmount setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GlobalHotelApplyRefundResponseBodyDataTotalRefundAmount setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GlobalHotelApplyRefundResponseBodyDataTotalRefundAmount setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class GlobalHotelApplyRefundResponseBodyData extends TeaModel {
        /**
         * <p>The after-sales refund order number.</p>
         * 
         * <strong>example:</strong>
         * <p>RF202606290001</p>
         */
        @NameInMap("RefundOrderNo")
        public String refundOrderNo;

        /**
         * <p>The total penalty amount.</p>
         */
        @NameInMap("TotalPenaltyAmount")
        public GlobalHotelApplyRefundResponseBodyDataTotalPenaltyAmount totalPenaltyAmount;

        /**
         * <p>The total refund amount.</p>
         */
        @NameInMap("TotalRefundAmount")
        public GlobalHotelApplyRefundResponseBodyDataTotalRefundAmount totalRefundAmount;

        /**
         * <p>TraceId</p>
         * 
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelApplyRefundResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelApplyRefundResponseBodyData self = new GlobalHotelApplyRefundResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GlobalHotelApplyRefundResponseBodyData setRefundOrderNo(String refundOrderNo) {
            this.refundOrderNo = refundOrderNo;
            return this;
        }
        public String getRefundOrderNo() {
            return this.refundOrderNo;
        }

        public GlobalHotelApplyRefundResponseBodyData setTotalPenaltyAmount(GlobalHotelApplyRefundResponseBodyDataTotalPenaltyAmount totalPenaltyAmount) {
            this.totalPenaltyAmount = totalPenaltyAmount;
            return this;
        }
        public GlobalHotelApplyRefundResponseBodyDataTotalPenaltyAmount getTotalPenaltyAmount() {
            return this.totalPenaltyAmount;
        }

        public GlobalHotelApplyRefundResponseBodyData setTotalRefundAmount(GlobalHotelApplyRefundResponseBodyDataTotalRefundAmount totalRefundAmount) {
            this.totalRefundAmount = totalRefundAmount;
            return this;
        }
        public GlobalHotelApplyRefundResponseBodyDataTotalRefundAmount getTotalRefundAmount() {
            return this.totalRefundAmount;
        }

        public GlobalHotelApplyRefundResponseBodyData setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

}
