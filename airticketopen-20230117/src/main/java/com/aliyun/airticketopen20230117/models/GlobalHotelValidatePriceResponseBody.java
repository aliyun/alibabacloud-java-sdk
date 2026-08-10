// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelValidatePriceResponseBody extends TeaModel {
    @NameInMap("Data")
    public GlobalHotelValidatePriceResponseBodyData data;

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
     * <p>TracerId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static GlobalHotelValidatePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelValidatePriceResponseBody self = new GlobalHotelValidatePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public GlobalHotelValidatePriceResponseBody setData(GlobalHotelValidatePriceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GlobalHotelValidatePriceResponseBodyData getData() {
        return this.data;
    }

    public GlobalHotelValidatePriceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GlobalHotelValidatePriceResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GlobalHotelValidatePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GlobalHotelValidatePriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GlobalHotelValidatePriceResponseBody setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class GlobalHotelValidatePriceResponseBodyDataCancellationPoliciesPenalties extends TeaModel {
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
         * <p>TracerId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelValidatePriceResponseBodyDataCancellationPoliciesPenalties build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelValidatePriceResponseBodyDataCancellationPoliciesPenalties self = new GlobalHotelValidatePriceResponseBodyDataCancellationPoliciesPenalties();
            return TeaModel.build(map, self);
        }

        public GlobalHotelValidatePriceResponseBodyDataCancellationPoliciesPenalties setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GlobalHotelValidatePriceResponseBodyDataCancellationPoliciesPenalties setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GlobalHotelValidatePriceResponseBodyDataCancellationPoliciesPenalties setPenaltyType(String penaltyType) {
            this.penaltyType = penaltyType;
            return this;
        }
        public String getPenaltyType() {
            return this.penaltyType;
        }

        public GlobalHotelValidatePriceResponseBodyDataCancellationPoliciesPenalties setPenaltyValue(String penaltyValue) {
            this.penaltyValue = penaltyValue;
            return this;
        }
        public String getPenaltyValue() {
            return this.penaltyValue;
        }

        public GlobalHotelValidatePriceResponseBodyDataCancellationPoliciesPenalties setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public GlobalHotelValidatePriceResponseBodyDataCancellationPoliciesPenalties setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class GlobalHotelValidatePriceResponseBodyDataCancellationPolicies extends TeaModel {
        @NameInMap("Penalties")
        public java.util.List<GlobalHotelValidatePriceResponseBodyDataCancellationPoliciesPenalties> penalties;

        /**
         * <strong>example:</strong>
         * <p>FREE_CANCELLATION</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <strong>example:</strong>
         * <p>TracerId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelValidatePriceResponseBodyDataCancellationPolicies build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelValidatePriceResponseBodyDataCancellationPolicies self = new GlobalHotelValidatePriceResponseBodyDataCancellationPolicies();
            return TeaModel.build(map, self);
        }

        public GlobalHotelValidatePriceResponseBodyDataCancellationPolicies setPenalties(java.util.List<GlobalHotelValidatePriceResponseBodyDataCancellationPoliciesPenalties> penalties) {
            this.penalties = penalties;
            return this;
        }
        public java.util.List<GlobalHotelValidatePriceResponseBodyDataCancellationPoliciesPenalties> getPenalties() {
            return this.penalties;
        }

        public GlobalHotelValidatePriceResponseBodyDataCancellationPolicies setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public GlobalHotelValidatePriceResponseBodyDataCancellationPolicies setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class GlobalHotelValidatePriceResponseBodyDataPricingNightlyPrices extends TeaModel {
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
         * <p>TracerId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelValidatePriceResponseBodyDataPricingNightlyPrices build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelValidatePriceResponseBodyDataPricingNightlyPrices self = new GlobalHotelValidatePriceResponseBodyDataPricingNightlyPrices();
            return TeaModel.build(map, self);
        }

        public GlobalHotelValidatePriceResponseBodyDataPricingNightlyPrices setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GlobalHotelValidatePriceResponseBodyDataPricingNightlyPrices setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GlobalHotelValidatePriceResponseBodyDataPricingNightlyPrices setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class GlobalHotelValidatePriceResponseBodyDataPricing extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        @NameInMap("NightlyPrices")
        public java.util.List<GlobalHotelValidatePriceResponseBodyDataPricingNightlyPrices> nightlyPrices;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("TotalAmount")
        public String totalAmount;

        /**
         * <strong>example:</strong>
         * <p>TracerId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelValidatePriceResponseBodyDataPricing build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelValidatePriceResponseBodyDataPricing self = new GlobalHotelValidatePriceResponseBodyDataPricing();
            return TeaModel.build(map, self);
        }

        public GlobalHotelValidatePriceResponseBodyDataPricing setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GlobalHotelValidatePriceResponseBodyDataPricing setNightlyPrices(java.util.List<GlobalHotelValidatePriceResponseBodyDataPricingNightlyPrices> nightlyPrices) {
            this.nightlyPrices = nightlyPrices;
            return this;
        }
        public java.util.List<GlobalHotelValidatePriceResponseBodyDataPricingNightlyPrices> getNightlyPrices() {
            return this.nightlyPrices;
        }

        public GlobalHotelValidatePriceResponseBodyDataPricing setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public String getTotalAmount() {
            return this.totalAmount;
        }

        public GlobalHotelValidatePriceResponseBodyDataPricing setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class GlobalHotelValidatePriceResponseBodyData extends TeaModel {
        @NameInMap("CancellationPolicies")
        public java.util.List<GlobalHotelValidatePriceResponseBodyDataCancellationPolicies> cancellationPolicies;

        /**
         * <strong>example:</strong>
         * <p>itemOffer_123</p>
         */
        @NameInMap("ItemOfferId")
        public String itemOfferId;

        @NameInMap("Pricing")
        public GlobalHotelValidatePriceResponseBodyDataPricing pricing;

        /**
         * <strong>example:</strong>
         * <p>TracerId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelValidatePriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelValidatePriceResponseBodyData self = new GlobalHotelValidatePriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GlobalHotelValidatePriceResponseBodyData setCancellationPolicies(java.util.List<GlobalHotelValidatePriceResponseBodyDataCancellationPolicies> cancellationPolicies) {
            this.cancellationPolicies = cancellationPolicies;
            return this;
        }
        public java.util.List<GlobalHotelValidatePriceResponseBodyDataCancellationPolicies> getCancellationPolicies() {
            return this.cancellationPolicies;
        }

        public GlobalHotelValidatePriceResponseBodyData setItemOfferId(String itemOfferId) {
            this.itemOfferId = itemOfferId;
            return this;
        }
        public String getItemOfferId() {
            return this.itemOfferId;
        }

        public GlobalHotelValidatePriceResponseBodyData setPricing(GlobalHotelValidatePriceResponseBodyDataPricing pricing) {
            this.pricing = pricing;
            return this;
        }
        public GlobalHotelValidatePriceResponseBodyDataPricing getPricing() {
            return this.pricing;
        }

        public GlobalHotelValidatePriceResponseBodyData setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

}
