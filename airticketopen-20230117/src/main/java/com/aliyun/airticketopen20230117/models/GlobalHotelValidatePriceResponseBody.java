// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelValidatePriceResponseBody extends TeaModel {
    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public GlobalHotelValidatePriceResponseBodyData data;

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
     * <p>TracerId</p>
     * 
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
         * <p>The currency code. This field has a value only when the penalty type is AMOUNT.</p>
         * 
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The effective end time as a UTC millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1672617600000</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>The penalty type (PERCENT/NIGHTS/NON_CANCELLABLE).</p>
         * 
         * <strong>example:</strong>
         * <p>PERCENTAGE</p>
         */
        @NameInMap("PenaltyType")
        public String penaltyType;

        /**
         * <p>The penalty value (percentage, amount, or number of nights). This field is not present when PenaltyType is NON_CANCELLABLE.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PenaltyValue")
        public String penaltyValue;

        /**
         * <p>The effective start time as a UTC millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1672531200000</p>
         */
        @NameInMap("Start")
        public String start;

        /**
         * <p>TracerId</p>
         * 
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

        public GlobalHotelValidatePriceResponseBodyDataCancellationPoliciesPenalties setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
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

        public GlobalHotelValidatePriceResponseBodyDataCancellationPoliciesPenalties setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
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
        /**
         * <p>The list of cancellation penalty details.</p>
         */
        @NameInMap("Penalties")
        public java.util.List<GlobalHotelValidatePriceResponseBodyDataCancellationPoliciesPenalties> penalties;

        /**
         * <p>The cancellation policy type (FREE_CANCEL/CONDITIONAL/NON_REFUNDABLE).</p>
         * 
         * <strong>example:</strong>
         * <p>FREE_CANCELLATION</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>TracerId</p>
         * 
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

    public static class GlobalHotelValidatePriceResponseBodyDataDailyPricesPrice extends TeaModel {
        /**
         * <p>The amount in the smallest currency unit.</p>
         * 
         * <strong>example:</strong>
         * <p>574</p>
         */
        @NameInMap("Amount")
        public String amount;

        /**
         * <p>The currency code (ISO 4217).</p>
         * 
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>null</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelValidatePriceResponseBodyDataDailyPricesPrice build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelValidatePriceResponseBodyDataDailyPricesPrice self = new GlobalHotelValidatePriceResponseBodyDataDailyPricesPrice();
            return TeaModel.build(map, self);
        }

        public GlobalHotelValidatePriceResponseBodyDataDailyPricesPrice setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GlobalHotelValidatePriceResponseBodyDataDailyPricesPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GlobalHotelValidatePriceResponseBodyDataDailyPricesPrice setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class GlobalHotelValidatePriceResponseBodyDataDailyPrices extends TeaModel {
        /**
         * <p>The date in yyyy-MM-dd format, in the local time zone of the hotel.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-16</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>The price for the night.</p>
         */
        @NameInMap("Price")
        public GlobalHotelValidatePriceResponseBodyDataDailyPricesPrice price;

        /**
         * <p>null</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelValidatePriceResponseBodyDataDailyPrices build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelValidatePriceResponseBodyDataDailyPrices self = new GlobalHotelValidatePriceResponseBodyDataDailyPrices();
            return TeaModel.build(map, self);
        }

        public GlobalHotelValidatePriceResponseBodyDataDailyPrices setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GlobalHotelValidatePriceResponseBodyDataDailyPrices setPrice(GlobalHotelValidatePriceResponseBodyDataDailyPricesPrice price) {
            this.price = price;
            return this;
        }
        public GlobalHotelValidatePriceResponseBodyDataDailyPricesPrice getPrice() {
            return this.price;
        }

        public GlobalHotelValidatePriceResponseBodyDataDailyPrices setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class GlobalHotelValidatePriceResponseBodyDataTotalPrice extends TeaModel {
        /**
         * <p>The amount in the smallest currency unit.</p>
         * 
         * <strong>example:</strong>
         * <p>574</p>
         */
        @NameInMap("Amount")
        public String amount;

        /**
         * <p>The currency code (ISO 4217).</p>
         * 
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>null</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelValidatePriceResponseBodyDataTotalPrice build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelValidatePriceResponseBodyDataTotalPrice self = new GlobalHotelValidatePriceResponseBodyDataTotalPrice();
            return TeaModel.build(map, self);
        }

        public GlobalHotelValidatePriceResponseBodyDataTotalPrice setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GlobalHotelValidatePriceResponseBodyDataTotalPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GlobalHotelValidatePriceResponseBodyDataTotalPrice setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class GlobalHotelValidatePriceResponseBodyData extends TeaModel {
        /**
         * <p>The cancellation policies.</p>
         */
        @NameInMap("CancellationPolicies")
        public java.util.List<GlobalHotelValidatePriceResponseBodyDataCancellationPolicies> cancellationPolicies;

        /**
         * <p>The list of daily prices.</p>
         */
        @NameInMap("DailyPrices")
        public java.util.List<GlobalHotelValidatePriceResponseBodyDataDailyPrices> dailyPrices;

        /**
         * <p>The price validation result ID, used for subsequent order creation.</p>
         * 
         * <strong>example:</strong>
         * <p>itemOffer_123</p>
         */
        @NameInMap("ItemOfferId")
        public String itemOfferId;

        /**
         * <p>The total selling price.</p>
         */
        @NameInMap("TotalPrice")
        public GlobalHotelValidatePriceResponseBodyDataTotalPrice totalPrice;

        /**
         * <p>TracerId</p>
         * 
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

        public GlobalHotelValidatePriceResponseBodyData setDailyPrices(java.util.List<GlobalHotelValidatePriceResponseBodyDataDailyPrices> dailyPrices) {
            this.dailyPrices = dailyPrices;
            return this;
        }
        public java.util.List<GlobalHotelValidatePriceResponseBodyDataDailyPrices> getDailyPrices() {
            return this.dailyPrices;
        }

        public GlobalHotelValidatePriceResponseBodyData setItemOfferId(String itemOfferId) {
            this.itemOfferId = itemOfferId;
            return this;
        }
        public String getItemOfferId() {
            return this.itemOfferId;
        }

        public GlobalHotelValidatePriceResponseBodyData setTotalPrice(GlobalHotelValidatePriceResponseBodyDataTotalPrice totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public GlobalHotelValidatePriceResponseBodyDataTotalPrice getTotalPrice() {
            return this.totalPrice;
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
