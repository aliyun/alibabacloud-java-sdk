// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ValidatePriceResponseBody extends TeaModel {
    @NameInMap("Data")
    public ValidatePriceResponseBodyData data;

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
     * <p>traceId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static ValidatePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidatePriceResponseBody self = new ValidatePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidatePriceResponseBody setData(ValidatePriceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ValidatePriceResponseBodyData getData() {
        return this.data;
    }

    public ValidatePriceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ValidatePriceResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ValidatePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidatePriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ValidatePriceResponseBody setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class ValidatePriceResponseBodyDataCancellationPoliciesPenalties extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>1672617600000</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <strong>example:</strong>
         * <p>PERCENTAGE</p>
         */
        @NameInMap("PenaltyType")
        public String penaltyType;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PenaltyValue")
        public String penaltyValue;

        /**
         * <strong>example:</strong>
         * <p>1672531200000</p>
         */
        @NameInMap("Start")
        public Long start;

        /**
         * <strong>example:</strong>
         * <p>traceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static ValidatePriceResponseBodyDataCancellationPoliciesPenalties build(java.util.Map<String, ?> map) throws Exception {
            ValidatePriceResponseBodyDataCancellationPoliciesPenalties self = new ValidatePriceResponseBodyDataCancellationPoliciesPenalties();
            return TeaModel.build(map, self);
        }

        public ValidatePriceResponseBodyDataCancellationPoliciesPenalties setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public ValidatePriceResponseBodyDataCancellationPoliciesPenalties setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public ValidatePriceResponseBodyDataCancellationPoliciesPenalties setPenaltyType(String penaltyType) {
            this.penaltyType = penaltyType;
            return this;
        }
        public String getPenaltyType() {
            return this.penaltyType;
        }

        public ValidatePriceResponseBodyDataCancellationPoliciesPenalties setPenaltyValue(String penaltyValue) {
            this.penaltyValue = penaltyValue;
            return this;
        }
        public String getPenaltyValue() {
            return this.penaltyValue;
        }

        public ValidatePriceResponseBodyDataCancellationPoliciesPenalties setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public ValidatePriceResponseBodyDataCancellationPoliciesPenalties setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class ValidatePriceResponseBodyDataCancellationPolicies extends TeaModel {
        @NameInMap("Penalties")
        public java.util.List<ValidatePriceResponseBodyDataCancellationPoliciesPenalties> penalties;

        /**
         * <strong>example:</strong>
         * <p>FREE_CANCELLATION</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <strong>example:</strong>
         * <p>traceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static ValidatePriceResponseBodyDataCancellationPolicies build(java.util.Map<String, ?> map) throws Exception {
            ValidatePriceResponseBodyDataCancellationPolicies self = new ValidatePriceResponseBodyDataCancellationPolicies();
            return TeaModel.build(map, self);
        }

        public ValidatePriceResponseBodyDataCancellationPolicies setPenalties(java.util.List<ValidatePriceResponseBodyDataCancellationPoliciesPenalties> penalties) {
            this.penalties = penalties;
            return this;
        }
        public java.util.List<ValidatePriceResponseBodyDataCancellationPoliciesPenalties> getPenalties() {
            return this.penalties;
        }

        public ValidatePriceResponseBodyDataCancellationPolicies setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public ValidatePriceResponseBodyDataCancellationPolicies setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class ValidatePriceResponseBodyDataPricingNightlyPrices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("Amount")
        public String amount;

        /**
         * <strong>example:</strong>
         * <p>2026-07-01</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <strong>example:</strong>
         * <p>traceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static ValidatePriceResponseBodyDataPricingNightlyPrices build(java.util.Map<String, ?> map) throws Exception {
            ValidatePriceResponseBodyDataPricingNightlyPrices self = new ValidatePriceResponseBodyDataPricingNightlyPrices();
            return TeaModel.build(map, self);
        }

        public ValidatePriceResponseBodyDataPricingNightlyPrices setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public ValidatePriceResponseBodyDataPricingNightlyPrices setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public ValidatePriceResponseBodyDataPricingNightlyPrices setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class ValidatePriceResponseBodyDataPricing extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        @NameInMap("NightlyPrices")
        public java.util.List<ValidatePriceResponseBodyDataPricingNightlyPrices> nightlyPrices;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("TotalAmount")
        public String totalAmount;

        /**
         * <strong>example:</strong>
         * <p>traceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static ValidatePriceResponseBodyDataPricing build(java.util.Map<String, ?> map) throws Exception {
            ValidatePriceResponseBodyDataPricing self = new ValidatePriceResponseBodyDataPricing();
            return TeaModel.build(map, self);
        }

        public ValidatePriceResponseBodyDataPricing setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public ValidatePriceResponseBodyDataPricing setNightlyPrices(java.util.List<ValidatePriceResponseBodyDataPricingNightlyPrices> nightlyPrices) {
            this.nightlyPrices = nightlyPrices;
            return this;
        }
        public java.util.List<ValidatePriceResponseBodyDataPricingNightlyPrices> getNightlyPrices() {
            return this.nightlyPrices;
        }

        public ValidatePriceResponseBodyDataPricing setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public String getTotalAmount() {
            return this.totalAmount;
        }

        public ValidatePriceResponseBodyDataPricing setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class ValidatePriceResponseBodyData extends TeaModel {
        @NameInMap("CancellationPolicies")
        public java.util.List<ValidatePriceResponseBodyDataCancellationPolicies> cancellationPolicies;

        /**
         * <strong>example:</strong>
         * <p>itemOffer_123</p>
         */
        @NameInMap("ItemOfferId")
        public String itemOfferId;

        @NameInMap("Pricing")
        public ValidatePriceResponseBodyDataPricing pricing;

        /**
         * <strong>example:</strong>
         * <p>traceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static ValidatePriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ValidatePriceResponseBodyData self = new ValidatePriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ValidatePriceResponseBodyData setCancellationPolicies(java.util.List<ValidatePriceResponseBodyDataCancellationPolicies> cancellationPolicies) {
            this.cancellationPolicies = cancellationPolicies;
            return this;
        }
        public java.util.List<ValidatePriceResponseBodyDataCancellationPolicies> getCancellationPolicies() {
            return this.cancellationPolicies;
        }

        public ValidatePriceResponseBodyData setItemOfferId(String itemOfferId) {
            this.itemOfferId = itemOfferId;
            return this;
        }
        public String getItemOfferId() {
            return this.itemOfferId;
        }

        public ValidatePriceResponseBodyData setPricing(ValidatePriceResponseBodyDataPricing pricing) {
            this.pricing = pricing;
            return this;
        }
        public ValidatePriceResponseBodyDataPricing getPricing() {
            return this.pricing;
        }

        public ValidatePriceResponseBodyData setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

}
