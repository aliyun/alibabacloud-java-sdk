// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelQueryOrderResponseBody extends TeaModel {
    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public GlobalHotelQueryOrderResponseBodyData data;

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
     * <p>The unique ID of the request.</p>
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

    public static GlobalHotelQueryOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelQueryOrderResponseBody self = new GlobalHotelQueryOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public GlobalHotelQueryOrderResponseBody setData(GlobalHotelQueryOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GlobalHotelQueryOrderResponseBodyData getData() {
        return this.data;
    }

    public GlobalHotelQueryOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GlobalHotelQueryOrderResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GlobalHotelQueryOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GlobalHotelQueryOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GlobalHotelQueryOrderResponseBody setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicyPenalties extends TeaModel {
        /**
         * <p>The currency code. This parameter is valid only when the penalty type is AMOUNT.</p>
         * 
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The effective end time in UTC millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1672617600000</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <p>The penalty type.</p>
         * 
         * <strong>example:</strong>
         * <p>PERCENTAGE</p>
         */
        @NameInMap("PenaltyType")
        public String penaltyType;

        /**
         * <p>The penalty value, which can be a percentage, amount, or number of nights.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PenaltyValue")
        public String penaltyValue;

        /**
         * <p>The effective start time in UTC millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1672531200000</p>
         */
        @NameInMap("Start")
        public Long start;

        /**
         * <p>TracerId</p>
         * 
         * <strong>example:</strong>
         * <p>TracerId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicyPenalties build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicyPenalties self = new GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicyPenalties();
            return TeaModel.build(map, self);
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicyPenalties setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicyPenalties setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicyPenalties setPenaltyType(String penaltyType) {
            this.penaltyType = penaltyType;
            return this;
        }
        public String getPenaltyType() {
            return this.penaltyType;
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicyPenalties setPenaltyValue(String penaltyValue) {
            this.penaltyValue = penaltyValue;
            return this;
        }
        public String getPenaltyValue() {
            return this.penaltyValue;
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicyPenalties setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicyPenalties setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicy extends TeaModel {
        /**
         * <p>The list of cancellation penalties.</p>
         */
        @NameInMap("Penalties")
        public java.util.List<GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicyPenalties> penalties;

        /**
         * <p>The cancellation policy type.</p>
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

        public static GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicy build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicy self = new GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicy();
            return TeaModel.build(map, self);
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicy setPenalties(java.util.List<GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicyPenalties> penalties) {
            this.penalties = penalties;
            return this;
        }
        public java.util.List<GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicyPenalties> getPenalties() {
            return this.penalties;
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicy setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPricesPriceCurrency extends TeaModel {
        /**
         * <p>The currency code.</p>
         * 
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("CurrencyCode")
        public String currencyCode;

        /**
         * <p>DefaultFractionDigits</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DefaultFractionDigits")
        public Integer defaultFractionDigits;

        /**
         * <p>NumericCode</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NumericCode")
        public Integer numericCode;

        public static GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPricesPriceCurrency build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPricesPriceCurrency self = new GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPricesPriceCurrency();
            return TeaModel.build(map, self);
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPricesPriceCurrency setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPricesPriceCurrency setDefaultFractionDigits(Integer defaultFractionDigits) {
            this.defaultFractionDigits = defaultFractionDigits;
            return this;
        }
        public Integer getDefaultFractionDigits() {
            return this.defaultFractionDigits;
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPricesPriceCurrency setNumericCode(Integer numericCode) {
            this.numericCode = numericCode;
            return this;
        }
        public Integer getNumericCode() {
            return this.numericCode;
        }

    }

    public static class GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPricesPrice extends TeaModel {
        /**
         * <p>cent</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cent")
        public Long cent;

        /**
         * <p>The currency.</p>
         */
        @NameInMap("Currency")
        public GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPricesPriceCurrency currency;

        public static GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPricesPrice build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPricesPrice self = new GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPricesPrice();
            return TeaModel.build(map, self);
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPricesPrice setCent(Long cent) {
            this.cent = cent;
            return this;
        }
        public Long getCent() {
            return this.cent;
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPricesPrice setCurrency(GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPricesPriceCurrency currency) {
            this.currency = currency;
            return this;
        }
        public GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPricesPriceCurrency getCurrency() {
            return this.currency;
        }

    }

    public static class GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPrices extends TeaModel {
        /**
         * <p>LocalDate</p>
         * 
         * <strong>example:</strong>
         * <p>LocalDate</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>The price.</p>
         */
        @NameInMap("Price")
        public GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPricesPrice price;

        public static GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPrices build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPrices self = new GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPrices();
            return TeaModel.build(map, self);
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPrices setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPrices setPrice(GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPricesPrice price) {
            this.price = price;
            return this;
        }
        public GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPricesPrice getPrice() {
            return this.price;
        }

    }

    public static class GlobalHotelQueryOrderResponseBodyDataItemInfoMeal extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Breakfast included</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The meal type.</p>
         * 
         * <strong>example:</strong>
         * <p>BREAKFAST</p>
         */
        @NameInMap("MealType")
        public String mealType;

        /**
         * <p>TracerId</p>
         * 
         * <strong>example:</strong>
         * <p>TracerId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelQueryOrderResponseBodyDataItemInfoMeal build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelQueryOrderResponseBodyDataItemInfoMeal self = new GlobalHotelQueryOrderResponseBodyDataItemInfoMeal();
            return TeaModel.build(map, self);
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfoMeal setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfoMeal setMealType(String mealType) {
            this.mealType = mealType;
            return this;
        }
        public String getMealType() {
            return this.mealType;
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfoMeal setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class GlobalHotelQueryOrderResponseBodyDataItemInfoSellingTotalPrice extends TeaModel {
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
         * <p>TracerId</p>
         * 
         * <strong>example:</strong>
         * <p>TracerId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelQueryOrderResponseBodyDataItemInfoSellingTotalPrice build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelQueryOrderResponseBodyDataItemInfoSellingTotalPrice self = new GlobalHotelQueryOrderResponseBodyDataItemInfoSellingTotalPrice();
            return TeaModel.build(map, self);
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfoSellingTotalPrice setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfoSellingTotalPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfoSellingTotalPrice setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class GlobalHotelQueryOrderResponseBodyDataItemInfo extends TeaModel {
        /**
         * <p>The cancellation policy.</p>
         */
        @NameInMap("CancelPolicy")
        public GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicy cancelPolicy;

        /**
         * <p>The check-in date in yyyy-MM-dd format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-01</p>
         */
        @NameInMap("CheckIn")
        public String checkIn;

        /**
         * <p>The number of guests checking in.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CheckInNumber")
        public Integer checkInNumber;

        /**
         * <p>The check-out date in yyyy-MM-dd format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-03</p>
         */
        @NameInMap("CheckOut")
        public String checkOut;

        /**
         * <p>The list of nightly rates.</p>
         */
        @NameInMap("DailyPrices")
        public java.util.List<GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPrices> dailyPrices;

        /**
         * <p>The meal information.</p>
         */
        @NameInMap("Meal")
        public GlobalHotelQueryOrderResponseBodyDataItemInfoMeal meal;

        /**
         * <p>The number of rooms.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RoomCount")
        public Integer roomCount;

        /**
         * <p>The total selling price.</p>
         */
        @NameInMap("SellingTotalPrice")
        public GlobalHotelQueryOrderResponseBodyDataItemInfoSellingTotalPrice sellingTotalPrice;

        public static GlobalHotelQueryOrderResponseBodyDataItemInfo build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelQueryOrderResponseBodyDataItemInfo self = new GlobalHotelQueryOrderResponseBodyDataItemInfo();
            return TeaModel.build(map, self);
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfo setCancelPolicy(GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicy cancelPolicy) {
            this.cancelPolicy = cancelPolicy;
            return this;
        }
        public GlobalHotelQueryOrderResponseBodyDataItemInfoCancelPolicy getCancelPolicy() {
            return this.cancelPolicy;
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfo setCheckIn(String checkIn) {
            this.checkIn = checkIn;
            return this;
        }
        public String getCheckIn() {
            return this.checkIn;
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfo setCheckInNumber(Integer checkInNumber) {
            this.checkInNumber = checkInNumber;
            return this;
        }
        public Integer getCheckInNumber() {
            return this.checkInNumber;
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfo setCheckOut(String checkOut) {
            this.checkOut = checkOut;
            return this;
        }
        public String getCheckOut() {
            return this.checkOut;
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfo setDailyPrices(java.util.List<GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPrices> dailyPrices) {
            this.dailyPrices = dailyPrices;
            return this;
        }
        public java.util.List<GlobalHotelQueryOrderResponseBodyDataItemInfoDailyPrices> getDailyPrices() {
            return this.dailyPrices;
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfo setMeal(GlobalHotelQueryOrderResponseBodyDataItemInfoMeal meal) {
            this.meal = meal;
            return this;
        }
        public GlobalHotelQueryOrderResponseBodyDataItemInfoMeal getMeal() {
            return this.meal;
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfo setRoomCount(Integer roomCount) {
            this.roomCount = roomCount;
            return this;
        }
        public Integer getRoomCount() {
            return this.roomCount;
        }

        public GlobalHotelQueryOrderResponseBodyDataItemInfo setSellingTotalPrice(GlobalHotelQueryOrderResponseBodyDataItemInfoSellingTotalPrice sellingTotalPrice) {
            this.sellingTotalPrice = sellingTotalPrice;
            return this;
        }
        public GlobalHotelQueryOrderResponseBodyDataItemInfoSellingTotalPrice getSellingTotalPrice() {
            return this.sellingTotalPrice;
        }

    }

    public static class GlobalHotelQueryOrderResponseBodyDataPaymentAmount extends TeaModel {
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
         * <p>TracerId</p>
         * 
         * <strong>example:</strong>
         * <p>TracerId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelQueryOrderResponseBodyDataPaymentAmount build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelQueryOrderResponseBodyDataPaymentAmount self = new GlobalHotelQueryOrderResponseBodyDataPaymentAmount();
            return TeaModel.build(map, self);
        }

        public GlobalHotelQueryOrderResponseBodyDataPaymentAmount setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GlobalHotelQueryOrderResponseBodyDataPaymentAmount setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GlobalHotelQueryOrderResponseBodyDataPaymentAmount setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class GlobalHotelQueryOrderResponseBodyDataPayment extends TeaModel {
        /**
         * <p>The payment amount.</p>
         */
        @NameInMap("Amount")
        public GlobalHotelQueryOrderResponseBodyDataPaymentAmount amount;

        /**
         * <p>The payment completion time in UTC millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1672531200000</p>
         */
        @NameInMap("GmtPaid")
        public Long gmtPaid;

        /**
         * <p>The payment method.</p>
         * 
         * <strong>example:</strong>
         * <p>BALANCE</p>
         */
        @NameInMap("PaymentMethod")
        public String paymentMethod;

        /**
         * <p>The payment transaction ID.</p>
         * 
         * <strong>example:</strong>
         * <p>PAY202606290001</p>
         */
        @NameInMap("PaymentTransactionId")
        public String paymentTransactionId;

        public static GlobalHotelQueryOrderResponseBodyDataPayment build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelQueryOrderResponseBodyDataPayment self = new GlobalHotelQueryOrderResponseBodyDataPayment();
            return TeaModel.build(map, self);
        }

        public GlobalHotelQueryOrderResponseBodyDataPayment setAmount(GlobalHotelQueryOrderResponseBodyDataPaymentAmount amount) {
            this.amount = amount;
            return this;
        }
        public GlobalHotelQueryOrderResponseBodyDataPaymentAmount getAmount() {
            return this.amount;
        }

        public GlobalHotelQueryOrderResponseBodyDataPayment setGmtPaid(Long gmtPaid) {
            this.gmtPaid = gmtPaid;
            return this;
        }
        public Long getGmtPaid() {
            return this.gmtPaid;
        }

        public GlobalHotelQueryOrderResponseBodyDataPayment setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }
        public String getPaymentMethod() {
            return this.paymentMethod;
        }

        public GlobalHotelQueryOrderResponseBodyDataPayment setPaymentTransactionId(String paymentTransactionId) {
            this.paymentTransactionId = paymentTransactionId;
            return this;
        }
        public String getPaymentTransactionId() {
            return this.paymentTransactionId;
        }

    }

    public static class GlobalHotelQueryOrderResponseBodyDataRefundOrdersTotalPenaltyAmount extends TeaModel {
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

        public static GlobalHotelQueryOrderResponseBodyDataRefundOrdersTotalPenaltyAmount build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelQueryOrderResponseBodyDataRefundOrdersTotalPenaltyAmount self = new GlobalHotelQueryOrderResponseBodyDataRefundOrdersTotalPenaltyAmount();
            return TeaModel.build(map, self);
        }

        public GlobalHotelQueryOrderResponseBodyDataRefundOrdersTotalPenaltyAmount setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GlobalHotelQueryOrderResponseBodyDataRefundOrdersTotalPenaltyAmount setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GlobalHotelQueryOrderResponseBodyDataRefundOrdersTotalPenaltyAmount setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class GlobalHotelQueryOrderResponseBodyDataRefundOrdersTotalRefundAmount extends TeaModel {
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

        public static GlobalHotelQueryOrderResponseBodyDataRefundOrdersTotalRefundAmount build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelQueryOrderResponseBodyDataRefundOrdersTotalRefundAmount self = new GlobalHotelQueryOrderResponseBodyDataRefundOrdersTotalRefundAmount();
            return TeaModel.build(map, self);
        }

        public GlobalHotelQueryOrderResponseBodyDataRefundOrdersTotalRefundAmount setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GlobalHotelQueryOrderResponseBodyDataRefundOrdersTotalRefundAmount setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GlobalHotelQueryOrderResponseBodyDataRefundOrdersTotalRefundAmount setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class GlobalHotelQueryOrderResponseBodyDataRefundOrders extends TeaModel {
        /**
         * <p>The creation time of the refund order, in UTC millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1672531200000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The refund transaction ID.</p>
         * 
         * <strong>example:</strong>
         * <p>TXN001</p>
         */
        @NameInMap("RefundTransactionId")
        public String refundTransactionId;

        /**
         * <p>The reason for rejection.</p>
         * 
         * <strong>example:</strong>
         * <p>Supplier rejected</p>
         */
        @NameInMap("RejectReason")
        public String rejectReason;

        /**
         * <p>The external refund order number.</p>
         * 
         * <strong>example:</strong>
         * <p>RF202606290001</p>
         */
        @NameInMap("SellRefundOrderNo")
        public String sellRefundOrderNo;

        /**
         * <p>The unified refund status.</p>
         * 
         * <strong>example:</strong>
         * <p>REFUNDED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The penalty amount on the sales side.</p>
         */
        @NameInMap("TotalPenaltyAmount")
        public GlobalHotelQueryOrderResponseBodyDataRefundOrdersTotalPenaltyAmount totalPenaltyAmount;

        /**
         * <p>The actual refund amount.</p>
         */
        @NameInMap("TotalRefundAmount")
        public GlobalHotelQueryOrderResponseBodyDataRefundOrdersTotalRefundAmount totalRefundAmount;

        public static GlobalHotelQueryOrderResponseBodyDataRefundOrders build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelQueryOrderResponseBodyDataRefundOrders self = new GlobalHotelQueryOrderResponseBodyDataRefundOrders();
            return TeaModel.build(map, self);
        }

        public GlobalHotelQueryOrderResponseBodyDataRefundOrders setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GlobalHotelQueryOrderResponseBodyDataRefundOrders setRefundTransactionId(String refundTransactionId) {
            this.refundTransactionId = refundTransactionId;
            return this;
        }
        public String getRefundTransactionId() {
            return this.refundTransactionId;
        }

        public GlobalHotelQueryOrderResponseBodyDataRefundOrders setRejectReason(String rejectReason) {
            this.rejectReason = rejectReason;
            return this;
        }
        public String getRejectReason() {
            return this.rejectReason;
        }

        public GlobalHotelQueryOrderResponseBodyDataRefundOrders setSellRefundOrderNo(String sellRefundOrderNo) {
            this.sellRefundOrderNo = sellRefundOrderNo;
            return this;
        }
        public String getSellRefundOrderNo() {
            return this.sellRefundOrderNo;
        }

        public GlobalHotelQueryOrderResponseBodyDataRefundOrders setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GlobalHotelQueryOrderResponseBodyDataRefundOrders setTotalPenaltyAmount(GlobalHotelQueryOrderResponseBodyDataRefundOrdersTotalPenaltyAmount totalPenaltyAmount) {
            this.totalPenaltyAmount = totalPenaltyAmount;
            return this;
        }
        public GlobalHotelQueryOrderResponseBodyDataRefundOrdersTotalPenaltyAmount getTotalPenaltyAmount() {
            return this.totalPenaltyAmount;
        }

        public GlobalHotelQueryOrderResponseBodyDataRefundOrders setTotalRefundAmount(GlobalHotelQueryOrderResponseBodyDataRefundOrdersTotalRefundAmount totalRefundAmount) {
            this.totalRefundAmount = totalRefundAmount;
            return this;
        }
        public GlobalHotelQueryOrderResponseBodyDataRefundOrdersTotalRefundAmount getTotalRefundAmount() {
            return this.totalRefundAmount;
        }

    }

    public static class GlobalHotelQueryOrderResponseBodyDataRoomStaysGuests extends TeaModel {
        /**
         * <p>The first name of the guest.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("FirstName")
        public String firstName;

        /**
         * <p>The last name of the guest.</p>
         * 
         * <strong>example:</strong>
         * <p>Doe</p>
         */
        @NameInMap("LastName")
        public String lastName;

        /**
         * <p>TraceId</p>
         * 
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelQueryOrderResponseBodyDataRoomStaysGuests build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelQueryOrderResponseBodyDataRoomStaysGuests self = new GlobalHotelQueryOrderResponseBodyDataRoomStaysGuests();
            return TeaModel.build(map, self);
        }

        public GlobalHotelQueryOrderResponseBodyDataRoomStaysGuests setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public GlobalHotelQueryOrderResponseBodyDataRoomStaysGuests setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public GlobalHotelQueryOrderResponseBodyDataRoomStaysGuests setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class GlobalHotelQueryOrderResponseBodyDataRoomStays extends TeaModel {
        /**
         * <p>The room confirmation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CONF001</p>
         */
        @NameInMap("ConfirmationId")
        public String confirmationId;

        /**
         * <p>The list of guests.</p>
         */
        @NameInMap("Guests")
        public java.util.List<GlobalHotelQueryOrderResponseBodyDataRoomStaysGuests> guests;

        /**
         * <p>The room index, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RoomIndex")
        public Integer roomIndex;

        /**
         * <p>The delivery status. Valid values: PENDING_CHECKIN, CHECKED_IN, CHECKED_OUT, and CANCELLED. The value is null before the delivery is created.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECKED_IN</p>
         */
        @NameInMap("Status")
        public String status;

        public static GlobalHotelQueryOrderResponseBodyDataRoomStays build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelQueryOrderResponseBodyDataRoomStays self = new GlobalHotelQueryOrderResponseBodyDataRoomStays();
            return TeaModel.build(map, self);
        }

        public GlobalHotelQueryOrderResponseBodyDataRoomStays setConfirmationId(String confirmationId) {
            this.confirmationId = confirmationId;
            return this;
        }
        public String getConfirmationId() {
            return this.confirmationId;
        }

        public GlobalHotelQueryOrderResponseBodyDataRoomStays setGuests(java.util.List<GlobalHotelQueryOrderResponseBodyDataRoomStaysGuests> guests) {
            this.guests = guests;
            return this;
        }
        public java.util.List<GlobalHotelQueryOrderResponseBodyDataRoomStaysGuests> getGuests() {
            return this.guests;
        }

        public GlobalHotelQueryOrderResponseBodyDataRoomStays setRoomIndex(Integer roomIndex) {
            this.roomIndex = roomIndex;
            return this;
        }
        public Integer getRoomIndex() {
            return this.roomIndex;
        }

        public GlobalHotelQueryOrderResponseBodyDataRoomStays setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GlobalHotelQueryOrderResponseBodyData extends TeaModel {
        /**
         * <p>The buyer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("BuyerId")
        public String buyerId;

        /**
         * <p>The external order number of the buyer.</p>
         * 
         * <strong>example:</strong>
         * <p>EXT_ORDER_001</p>
         */
        @NameInMap("ExternalOrderNo")
        public String externalOrderNo;

        /**
         * <p>The creation time in UTC millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1672531200000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The item information.</p>
         */
        @NameInMap("ItemInfo")
        public GlobalHotelQueryOrderResponseBodyDataItemInfo itemInfo;

        /**
         * <p>The order number.</p>
         * 
         * <strong>example:</strong>
         * <p>SO202606290001</p>
         */
        @NameInMap("OrderNo")
        public String orderNo;

        /**
         * <p>The payment information.</p>
         */
        @NameInMap("Payment")
        public GlobalHotelQueryOrderResponseBodyDataPayment payment;

        /**
         * <p>The list of refund orders.</p>
         */
        @NameInMap("RefundOrders")
        public java.util.List<GlobalHotelQueryOrderResponseBodyDataRefundOrders> refundOrders;

        /**
         * <p>The list of room stays.</p>
         */
        @NameInMap("RoomStays")
        public java.util.List<GlobalHotelQueryOrderResponseBodyDataRoomStays> roomStays;

        /**
         * <p>The sales channel.</p>
         * 
         * <strong>example:</strong>
         * <p>POP</p>
         */
        @NameInMap("SalesChannel")
        public String salesChannel;

        /**
         * <p>The unified order status.</p>
         * 
         * <strong>example:</strong>
         * <p>CONFIRMED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>TracerId</p>
         * 
         * <strong>example:</strong>
         * <p>TracerId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static GlobalHotelQueryOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelQueryOrderResponseBodyData self = new GlobalHotelQueryOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GlobalHotelQueryOrderResponseBodyData setBuyerId(String buyerId) {
            this.buyerId = buyerId;
            return this;
        }
        public String getBuyerId() {
            return this.buyerId;
        }

        public GlobalHotelQueryOrderResponseBodyData setExternalOrderNo(String externalOrderNo) {
            this.externalOrderNo = externalOrderNo;
            return this;
        }
        public String getExternalOrderNo() {
            return this.externalOrderNo;
        }

        public GlobalHotelQueryOrderResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GlobalHotelQueryOrderResponseBodyData setItemInfo(GlobalHotelQueryOrderResponseBodyDataItemInfo itemInfo) {
            this.itemInfo = itemInfo;
            return this;
        }
        public GlobalHotelQueryOrderResponseBodyDataItemInfo getItemInfo() {
            return this.itemInfo;
        }

        public GlobalHotelQueryOrderResponseBodyData setOrderNo(String orderNo) {
            this.orderNo = orderNo;
            return this;
        }
        public String getOrderNo() {
            return this.orderNo;
        }

        public GlobalHotelQueryOrderResponseBodyData setPayment(GlobalHotelQueryOrderResponseBodyDataPayment payment) {
            this.payment = payment;
            return this;
        }
        public GlobalHotelQueryOrderResponseBodyDataPayment getPayment() {
            return this.payment;
        }

        public GlobalHotelQueryOrderResponseBodyData setRefundOrders(java.util.List<GlobalHotelQueryOrderResponseBodyDataRefundOrders> refundOrders) {
            this.refundOrders = refundOrders;
            return this;
        }
        public java.util.List<GlobalHotelQueryOrderResponseBodyDataRefundOrders> getRefundOrders() {
            return this.refundOrders;
        }

        public GlobalHotelQueryOrderResponseBodyData setRoomStays(java.util.List<GlobalHotelQueryOrderResponseBodyDataRoomStays> roomStays) {
            this.roomStays = roomStays;
            return this;
        }
        public java.util.List<GlobalHotelQueryOrderResponseBodyDataRoomStays> getRoomStays() {
            return this.roomStays;
        }

        public GlobalHotelQueryOrderResponseBodyData setSalesChannel(String salesChannel) {
            this.salesChannel = salesChannel;
            return this;
        }
        public String getSalesChannel() {
            return this.salesChannel;
        }

        public GlobalHotelQueryOrderResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GlobalHotelQueryOrderResponseBodyData setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

}
