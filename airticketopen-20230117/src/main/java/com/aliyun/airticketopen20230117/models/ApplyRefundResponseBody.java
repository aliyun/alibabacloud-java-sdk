// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ApplyRefundResponseBody extends TeaModel {
    @NameInMap("Data")
    public ApplyRefundResponseBodyData data;

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

    public static ApplyRefundResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyRefundResponseBody self = new ApplyRefundResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyRefundResponseBody setData(ApplyRefundResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ApplyRefundResponseBodyData getData() {
        return this.data;
    }

    public ApplyRefundResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ApplyRefundResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ApplyRefundResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyRefundResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ApplyRefundResponseBody setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class ApplyRefundResponseBodyDataTotalPenaltyAmount extends TeaModel {
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

        public static ApplyRefundResponseBodyDataTotalPenaltyAmount build(java.util.Map<String, ?> map) throws Exception {
            ApplyRefundResponseBodyDataTotalPenaltyAmount self = new ApplyRefundResponseBodyDataTotalPenaltyAmount();
            return TeaModel.build(map, self);
        }

        public ApplyRefundResponseBodyDataTotalPenaltyAmount setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public ApplyRefundResponseBodyDataTotalPenaltyAmount setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public ApplyRefundResponseBodyDataTotalPenaltyAmount setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class ApplyRefundResponseBodyDataTotalRefundAmount extends TeaModel {
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

        public static ApplyRefundResponseBodyDataTotalRefundAmount build(java.util.Map<String, ?> map) throws Exception {
            ApplyRefundResponseBodyDataTotalRefundAmount self = new ApplyRefundResponseBodyDataTotalRefundAmount();
            return TeaModel.build(map, self);
        }

        public ApplyRefundResponseBodyDataTotalRefundAmount setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public ApplyRefundResponseBodyDataTotalRefundAmount setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public ApplyRefundResponseBodyDataTotalRefundAmount setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class ApplyRefundResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("SellRefundOrderId")
        public Long sellRefundOrderId;

        @NameInMap("TotalPenaltyAmount")
        public ApplyRefundResponseBodyDataTotalPenaltyAmount totalPenaltyAmount;

        @NameInMap("TotalRefundAmount")
        public ApplyRefundResponseBodyDataTotalRefundAmount totalRefundAmount;

        /**
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static ApplyRefundResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ApplyRefundResponseBodyData self = new ApplyRefundResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ApplyRefundResponseBodyData setSellRefundOrderId(Long sellRefundOrderId) {
            this.sellRefundOrderId = sellRefundOrderId;
            return this;
        }
        public Long getSellRefundOrderId() {
            return this.sellRefundOrderId;
        }

        public ApplyRefundResponseBodyData setTotalPenaltyAmount(ApplyRefundResponseBodyDataTotalPenaltyAmount totalPenaltyAmount) {
            this.totalPenaltyAmount = totalPenaltyAmount;
            return this;
        }
        public ApplyRefundResponseBodyDataTotalPenaltyAmount getTotalPenaltyAmount() {
            return this.totalPenaltyAmount;
        }

        public ApplyRefundResponseBodyData setTotalRefundAmount(ApplyRefundResponseBodyDataTotalRefundAmount totalRefundAmount) {
            this.totalRefundAmount = totalRefundAmount;
            return this;
        }
        public ApplyRefundResponseBodyDataTotalRefundAmount getTotalRefundAmount() {
            return this.totalRefundAmount;
        }

        public ApplyRefundResponseBodyData setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

}
