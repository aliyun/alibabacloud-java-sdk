// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class QueryOrderResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryOrderResponseBodyData data;

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

    public static QueryOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderResponseBody self = new QueryOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrderResponseBody setData(QueryOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryOrderResponseBodyData getData() {
        return this.data;
    }

    public QueryOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryOrderResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryOrderResponseBody setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class QueryOrderResponseBodyDataItemInfoCancelPolicyPenalties extends TeaModel {
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

        public static QueryOrderResponseBodyDataItemInfoCancelPolicyPenalties build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderResponseBodyDataItemInfoCancelPolicyPenalties self = new QueryOrderResponseBodyDataItemInfoCancelPolicyPenalties();
            return TeaModel.build(map, self);
        }

        public QueryOrderResponseBodyDataItemInfoCancelPolicyPenalties setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryOrderResponseBodyDataItemInfoCancelPolicyPenalties setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public QueryOrderResponseBodyDataItemInfoCancelPolicyPenalties setPenaltyType(String penaltyType) {
            this.penaltyType = penaltyType;
            return this;
        }
        public String getPenaltyType() {
            return this.penaltyType;
        }

        public QueryOrderResponseBodyDataItemInfoCancelPolicyPenalties setPenaltyValue(String penaltyValue) {
            this.penaltyValue = penaltyValue;
            return this;
        }
        public String getPenaltyValue() {
            return this.penaltyValue;
        }

        public QueryOrderResponseBodyDataItemInfoCancelPolicyPenalties setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public QueryOrderResponseBodyDataItemInfoCancelPolicyPenalties setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class QueryOrderResponseBodyDataItemInfoCancelPolicy extends TeaModel {
        @NameInMap("Penalties")
        public java.util.List<QueryOrderResponseBodyDataItemInfoCancelPolicyPenalties> penalties;

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

        public static QueryOrderResponseBodyDataItemInfoCancelPolicy build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderResponseBodyDataItemInfoCancelPolicy self = new QueryOrderResponseBodyDataItemInfoCancelPolicy();
            return TeaModel.build(map, self);
        }

        public QueryOrderResponseBodyDataItemInfoCancelPolicy setPenalties(java.util.List<QueryOrderResponseBodyDataItemInfoCancelPolicyPenalties> penalties) {
            this.penalties = penalties;
            return this;
        }
        public java.util.List<QueryOrderResponseBodyDataItemInfoCancelPolicyPenalties> getPenalties() {
            return this.penalties;
        }

        public QueryOrderResponseBodyDataItemInfoCancelPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public QueryOrderResponseBodyDataItemInfoCancelPolicy setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class QueryOrderResponseBodyDataItemInfoDailyPricesPriceCurrency extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("CurrencyCode")
        public String currencyCode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DefaultFractionDigits")
        public Integer defaultFractionDigits;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NumericCode")
        public Integer numericCode;

        public static QueryOrderResponseBodyDataItemInfoDailyPricesPriceCurrency build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderResponseBodyDataItemInfoDailyPricesPriceCurrency self = new QueryOrderResponseBodyDataItemInfoDailyPricesPriceCurrency();
            return TeaModel.build(map, self);
        }

        public QueryOrderResponseBodyDataItemInfoDailyPricesPriceCurrency setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public QueryOrderResponseBodyDataItemInfoDailyPricesPriceCurrency setDefaultFractionDigits(Integer defaultFractionDigits) {
            this.defaultFractionDigits = defaultFractionDigits;
            return this;
        }
        public Integer getDefaultFractionDigits() {
            return this.defaultFractionDigits;
        }

        public QueryOrderResponseBodyDataItemInfoDailyPricesPriceCurrency setNumericCode(Integer numericCode) {
            this.numericCode = numericCode;
            return this;
        }
        public Integer getNumericCode() {
            return this.numericCode;
        }

    }

    public static class QueryOrderResponseBodyDataItemInfoDailyPricesPrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cent")
        public Long cent;

        @NameInMap("Currency")
        public QueryOrderResponseBodyDataItemInfoDailyPricesPriceCurrency currency;

        public static QueryOrderResponseBodyDataItemInfoDailyPricesPrice build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderResponseBodyDataItemInfoDailyPricesPrice self = new QueryOrderResponseBodyDataItemInfoDailyPricesPrice();
            return TeaModel.build(map, self);
        }

        public QueryOrderResponseBodyDataItemInfoDailyPricesPrice setCent(Long cent) {
            this.cent = cent;
            return this;
        }
        public Long getCent() {
            return this.cent;
        }

        public QueryOrderResponseBodyDataItemInfoDailyPricesPrice setCurrency(QueryOrderResponseBodyDataItemInfoDailyPricesPriceCurrency currency) {
            this.currency = currency;
            return this;
        }
        public QueryOrderResponseBodyDataItemInfoDailyPricesPriceCurrency getCurrency() {
            return this.currency;
        }

    }

    public static class QueryOrderResponseBodyDataItemInfoDailyPrices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>LocalDate</p>
         */
        @NameInMap("Date")
        public String date;

        @NameInMap("Price")
        public QueryOrderResponseBodyDataItemInfoDailyPricesPrice price;

        public static QueryOrderResponseBodyDataItemInfoDailyPrices build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderResponseBodyDataItemInfoDailyPrices self = new QueryOrderResponseBodyDataItemInfoDailyPrices();
            return TeaModel.build(map, self);
        }

        public QueryOrderResponseBodyDataItemInfoDailyPrices setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public QueryOrderResponseBodyDataItemInfoDailyPrices setPrice(QueryOrderResponseBodyDataItemInfoDailyPricesPrice price) {
            this.price = price;
            return this;
        }
        public QueryOrderResponseBodyDataItemInfoDailyPricesPrice getPrice() {
            return this.price;
        }

    }

    public static class QueryOrderResponseBodyDataItemInfoMeal extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>含早餐</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>BREAKFAST</p>
         */
        @NameInMap("MealType")
        public String mealType;

        /**
         * <strong>example:</strong>
         * <p>TracerId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static QueryOrderResponseBodyDataItemInfoMeal build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderResponseBodyDataItemInfoMeal self = new QueryOrderResponseBodyDataItemInfoMeal();
            return TeaModel.build(map, self);
        }

        public QueryOrderResponseBodyDataItemInfoMeal setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryOrderResponseBodyDataItemInfoMeal setMealType(String mealType) {
            this.mealType = mealType;
            return this;
        }
        public String getMealType() {
            return this.mealType;
        }

        public QueryOrderResponseBodyDataItemInfoMeal setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class QueryOrderResponseBodyDataItemInfoSellingTotalPrice extends TeaModel {
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

        public static QueryOrderResponseBodyDataItemInfoSellingTotalPrice build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderResponseBodyDataItemInfoSellingTotalPrice self = new QueryOrderResponseBodyDataItemInfoSellingTotalPrice();
            return TeaModel.build(map, self);
        }

        public QueryOrderResponseBodyDataItemInfoSellingTotalPrice setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public QueryOrderResponseBodyDataItemInfoSellingTotalPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryOrderResponseBodyDataItemInfoSellingTotalPrice setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class QueryOrderResponseBodyDataItemInfo extends TeaModel {
        @NameInMap("CancelPolicy")
        public QueryOrderResponseBodyDataItemInfoCancelPolicy cancelPolicy;

        /**
         * <strong>example:</strong>
         * <p>2026-07-01</p>
         */
        @NameInMap("CheckIn")
        public String checkIn;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CheckInNumber")
        public Integer checkInNumber;

        /**
         * <strong>example:</strong>
         * <p>2026-07-03</p>
         */
        @NameInMap("CheckOut")
        public String checkOut;

        @NameInMap("DailyPrices")
        public java.util.List<QueryOrderResponseBodyDataItemInfoDailyPrices> dailyPrices;

        @NameInMap("Meal")
        public QueryOrderResponseBodyDataItemInfoMeal meal;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RoomCount")
        public Integer roomCount;

        @NameInMap("SellingTotalPrice")
        public QueryOrderResponseBodyDataItemInfoSellingTotalPrice sellingTotalPrice;

        public static QueryOrderResponseBodyDataItemInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderResponseBodyDataItemInfo self = new QueryOrderResponseBodyDataItemInfo();
            return TeaModel.build(map, self);
        }

        public QueryOrderResponseBodyDataItemInfo setCancelPolicy(QueryOrderResponseBodyDataItemInfoCancelPolicy cancelPolicy) {
            this.cancelPolicy = cancelPolicy;
            return this;
        }
        public QueryOrderResponseBodyDataItemInfoCancelPolicy getCancelPolicy() {
            return this.cancelPolicy;
        }

        public QueryOrderResponseBodyDataItemInfo setCheckIn(String checkIn) {
            this.checkIn = checkIn;
            return this;
        }
        public String getCheckIn() {
            return this.checkIn;
        }

        public QueryOrderResponseBodyDataItemInfo setCheckInNumber(Integer checkInNumber) {
            this.checkInNumber = checkInNumber;
            return this;
        }
        public Integer getCheckInNumber() {
            return this.checkInNumber;
        }

        public QueryOrderResponseBodyDataItemInfo setCheckOut(String checkOut) {
            this.checkOut = checkOut;
            return this;
        }
        public String getCheckOut() {
            return this.checkOut;
        }

        public QueryOrderResponseBodyDataItemInfo setDailyPrices(java.util.List<QueryOrderResponseBodyDataItemInfoDailyPrices> dailyPrices) {
            this.dailyPrices = dailyPrices;
            return this;
        }
        public java.util.List<QueryOrderResponseBodyDataItemInfoDailyPrices> getDailyPrices() {
            return this.dailyPrices;
        }

        public QueryOrderResponseBodyDataItemInfo setMeal(QueryOrderResponseBodyDataItemInfoMeal meal) {
            this.meal = meal;
            return this;
        }
        public QueryOrderResponseBodyDataItemInfoMeal getMeal() {
            return this.meal;
        }

        public QueryOrderResponseBodyDataItemInfo setRoomCount(Integer roomCount) {
            this.roomCount = roomCount;
            return this;
        }
        public Integer getRoomCount() {
            return this.roomCount;
        }

        public QueryOrderResponseBodyDataItemInfo setSellingTotalPrice(QueryOrderResponseBodyDataItemInfoSellingTotalPrice sellingTotalPrice) {
            this.sellingTotalPrice = sellingTotalPrice;
            return this;
        }
        public QueryOrderResponseBodyDataItemInfoSellingTotalPrice getSellingTotalPrice() {
            return this.sellingTotalPrice;
        }

    }

    public static class QueryOrderResponseBodyDataPaymentAmount extends TeaModel {
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
         * <p>TracerId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static QueryOrderResponseBodyDataPaymentAmount build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderResponseBodyDataPaymentAmount self = new QueryOrderResponseBodyDataPaymentAmount();
            return TeaModel.build(map, self);
        }

        public QueryOrderResponseBodyDataPaymentAmount setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public QueryOrderResponseBodyDataPaymentAmount setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryOrderResponseBodyDataPaymentAmount setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class QueryOrderResponseBodyDataPayment extends TeaModel {
        @NameInMap("Amount")
        public QueryOrderResponseBodyDataPaymentAmount amount;

        /**
         * <strong>example:</strong>
         * <p>1672531200000</p>
         */
        @NameInMap("GmtPaid")
        public Long gmtPaid;

        /**
         * <strong>example:</strong>
         * <p>BALANCE</p>
         */
        @NameInMap("PaymentMethod")
        public String paymentMethod;

        /**
         * <strong>example:</strong>
         * <p>PAY202606290001</p>
         */
        @NameInMap("PaymentTransactionId")
        public String paymentTransactionId;

        public static QueryOrderResponseBodyDataPayment build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderResponseBodyDataPayment self = new QueryOrderResponseBodyDataPayment();
            return TeaModel.build(map, self);
        }

        public QueryOrderResponseBodyDataPayment setAmount(QueryOrderResponseBodyDataPaymentAmount amount) {
            this.amount = amount;
            return this;
        }
        public QueryOrderResponseBodyDataPaymentAmount getAmount() {
            return this.amount;
        }

        public QueryOrderResponseBodyDataPayment setGmtPaid(Long gmtPaid) {
            this.gmtPaid = gmtPaid;
            return this;
        }
        public Long getGmtPaid() {
            return this.gmtPaid;
        }

        public QueryOrderResponseBodyDataPayment setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }
        public String getPaymentMethod() {
            return this.paymentMethod;
        }

        public QueryOrderResponseBodyDataPayment setPaymentTransactionId(String paymentTransactionId) {
            this.paymentTransactionId = paymentTransactionId;
            return this;
        }
        public String getPaymentTransactionId() {
            return this.paymentTransactionId;
        }

    }

    public static class QueryOrderResponseBodyDataRefundOrdersTotalPenaltyAmount extends TeaModel {
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

        public static QueryOrderResponseBodyDataRefundOrdersTotalPenaltyAmount build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderResponseBodyDataRefundOrdersTotalPenaltyAmount self = new QueryOrderResponseBodyDataRefundOrdersTotalPenaltyAmount();
            return TeaModel.build(map, self);
        }

        public QueryOrderResponseBodyDataRefundOrdersTotalPenaltyAmount setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public QueryOrderResponseBodyDataRefundOrdersTotalPenaltyAmount setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryOrderResponseBodyDataRefundOrdersTotalPenaltyAmount setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class QueryOrderResponseBodyDataRefundOrdersTotalRefundAmount extends TeaModel {
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

        public static QueryOrderResponseBodyDataRefundOrdersTotalRefundAmount build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderResponseBodyDataRefundOrdersTotalRefundAmount self = new QueryOrderResponseBodyDataRefundOrdersTotalRefundAmount();
            return TeaModel.build(map, self);
        }

        public QueryOrderResponseBodyDataRefundOrdersTotalRefundAmount setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public QueryOrderResponseBodyDataRefundOrdersTotalRefundAmount setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryOrderResponseBodyDataRefundOrdersTotalRefundAmount setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class QueryOrderResponseBodyDataRefundOrders extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1672531200000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>TXN001</p>
         */
        @NameInMap("RefundTransactionId")
        public String refundTransactionId;

        /**
         * <strong>example:</strong>
         * <p>不符合条件</p>
         */
        @NameInMap("RejectReason")
        public String rejectReason;

        /**
         * <strong>example:</strong>
         * <p>RF202606290001</p>
         */
        @NameInMap("SellRefundOrderNo")
        public String sellRefundOrderNo;

        /**
         * <strong>example:</strong>
         * <p>REFUNDED</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("TotalPenaltyAmount")
        public QueryOrderResponseBodyDataRefundOrdersTotalPenaltyAmount totalPenaltyAmount;

        @NameInMap("TotalRefundAmount")
        public QueryOrderResponseBodyDataRefundOrdersTotalRefundAmount totalRefundAmount;

        public static QueryOrderResponseBodyDataRefundOrders build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderResponseBodyDataRefundOrders self = new QueryOrderResponseBodyDataRefundOrders();
            return TeaModel.build(map, self);
        }

        public QueryOrderResponseBodyDataRefundOrders setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryOrderResponseBodyDataRefundOrders setRefundTransactionId(String refundTransactionId) {
            this.refundTransactionId = refundTransactionId;
            return this;
        }
        public String getRefundTransactionId() {
            return this.refundTransactionId;
        }

        public QueryOrderResponseBodyDataRefundOrders setRejectReason(String rejectReason) {
            this.rejectReason = rejectReason;
            return this;
        }
        public String getRejectReason() {
            return this.rejectReason;
        }

        public QueryOrderResponseBodyDataRefundOrders setSellRefundOrderNo(String sellRefundOrderNo) {
            this.sellRefundOrderNo = sellRefundOrderNo;
            return this;
        }
        public String getSellRefundOrderNo() {
            return this.sellRefundOrderNo;
        }

        public QueryOrderResponseBodyDataRefundOrders setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryOrderResponseBodyDataRefundOrders setTotalPenaltyAmount(QueryOrderResponseBodyDataRefundOrdersTotalPenaltyAmount totalPenaltyAmount) {
            this.totalPenaltyAmount = totalPenaltyAmount;
            return this;
        }
        public QueryOrderResponseBodyDataRefundOrdersTotalPenaltyAmount getTotalPenaltyAmount() {
            return this.totalPenaltyAmount;
        }

        public QueryOrderResponseBodyDataRefundOrders setTotalRefundAmount(QueryOrderResponseBodyDataRefundOrdersTotalRefundAmount totalRefundAmount) {
            this.totalRefundAmount = totalRefundAmount;
            return this;
        }
        public QueryOrderResponseBodyDataRefundOrdersTotalRefundAmount getTotalRefundAmount() {
            return this.totalRefundAmount;
        }

    }

    public static class QueryOrderResponseBodyDataRoomStaysGuests extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("FirstName")
        public String firstName;

        /**
         * <strong>example:</strong>
         * <p>Doe</p>
         */
        @NameInMap("LastName")
        public String lastName;

        /**
         * <strong>example:</strong>
         * <p>TracerId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static QueryOrderResponseBodyDataRoomStaysGuests build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderResponseBodyDataRoomStaysGuests self = new QueryOrderResponseBodyDataRoomStaysGuests();
            return TeaModel.build(map, self);
        }

        public QueryOrderResponseBodyDataRoomStaysGuests setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public QueryOrderResponseBodyDataRoomStaysGuests setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public QueryOrderResponseBodyDataRoomStaysGuests setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class QueryOrderResponseBodyDataRoomStays extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONF001</p>
         */
        @NameInMap("ConfirmationId")
        public String confirmationId;

        @NameInMap("Guests")
        public java.util.List<QueryOrderResponseBodyDataRoomStaysGuests> guests;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RoomIndex")
        public Integer roomIndex;

        /**
         * <strong>example:</strong>
         * <p>豪华大床房</p>
         */
        @NameInMap("RoomName")
        public String roomName;

        public static QueryOrderResponseBodyDataRoomStays build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderResponseBodyDataRoomStays self = new QueryOrderResponseBodyDataRoomStays();
            return TeaModel.build(map, self);
        }

        public QueryOrderResponseBodyDataRoomStays setConfirmationId(String confirmationId) {
            this.confirmationId = confirmationId;
            return this;
        }
        public String getConfirmationId() {
            return this.confirmationId;
        }

        public QueryOrderResponseBodyDataRoomStays setGuests(java.util.List<QueryOrderResponseBodyDataRoomStaysGuests> guests) {
            this.guests = guests;
            return this;
        }
        public java.util.List<QueryOrderResponseBodyDataRoomStaysGuests> getGuests() {
            return this.guests;
        }

        public QueryOrderResponseBodyDataRoomStays setRoomIndex(Integer roomIndex) {
            this.roomIndex = roomIndex;
            return this;
        }
        public Integer getRoomIndex() {
            return this.roomIndex;
        }

        public QueryOrderResponseBodyDataRoomStays setRoomName(String roomName) {
            this.roomName = roomName;
            return this;
        }
        public String getRoomName() {
            return this.roomName;
        }

    }

    public static class QueryOrderResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("BuyerId")
        public String buyerId;

        /**
         * <strong>example:</strong>
         * <p>EXT_ORDER_001</p>
         */
        @NameInMap("ExternalOrderNo")
        public String externalOrderNo;

        /**
         * <strong>example:</strong>
         * <p>1672531200000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("ItemInfo")
        public QueryOrderResponseBodyDataItemInfo itemInfo;

        /**
         * <strong>example:</strong>
         * <p>SO202606290001</p>
         */
        @NameInMap("OrderNo")
        public String orderNo;

        @NameInMap("Payment")
        public QueryOrderResponseBodyDataPayment payment;

        @NameInMap("RefundOrders")
        public java.util.List<QueryOrderResponseBodyDataRefundOrders> refundOrders;

        @NameInMap("RoomStays")
        public java.util.List<QueryOrderResponseBodyDataRoomStays> roomStays;

        /**
         * <strong>example:</strong>
         * <p>POP</p>
         */
        @NameInMap("SalesChannel")
        public String salesChannel;

        /**
         * <strong>example:</strong>
         * <p>CONFIRMED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>TracerId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static QueryOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderResponseBodyData self = new QueryOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOrderResponseBodyData setBuyerId(String buyerId) {
            this.buyerId = buyerId;
            return this;
        }
        public String getBuyerId() {
            return this.buyerId;
        }

        public QueryOrderResponseBodyData setExternalOrderNo(String externalOrderNo) {
            this.externalOrderNo = externalOrderNo;
            return this;
        }
        public String getExternalOrderNo() {
            return this.externalOrderNo;
        }

        public QueryOrderResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryOrderResponseBodyData setItemInfo(QueryOrderResponseBodyDataItemInfo itemInfo) {
            this.itemInfo = itemInfo;
            return this;
        }
        public QueryOrderResponseBodyDataItemInfo getItemInfo() {
            return this.itemInfo;
        }

        public QueryOrderResponseBodyData setOrderNo(String orderNo) {
            this.orderNo = orderNo;
            return this;
        }
        public String getOrderNo() {
            return this.orderNo;
        }

        public QueryOrderResponseBodyData setPayment(QueryOrderResponseBodyDataPayment payment) {
            this.payment = payment;
            return this;
        }
        public QueryOrderResponseBodyDataPayment getPayment() {
            return this.payment;
        }

        public QueryOrderResponseBodyData setRefundOrders(java.util.List<QueryOrderResponseBodyDataRefundOrders> refundOrders) {
            this.refundOrders = refundOrders;
            return this;
        }
        public java.util.List<QueryOrderResponseBodyDataRefundOrders> getRefundOrders() {
            return this.refundOrders;
        }

        public QueryOrderResponseBodyData setRoomStays(java.util.List<QueryOrderResponseBodyDataRoomStays> roomStays) {
            this.roomStays = roomStays;
            return this;
        }
        public java.util.List<QueryOrderResponseBodyDataRoomStays> getRoomStays() {
            return this.roomStays;
        }

        public QueryOrderResponseBodyData setSalesChannel(String salesChannel) {
            this.salesChannel = salesChannel;
            return this;
        }
        public String getSalesChannel() {
            return this.salesChannel;
        }

        public QueryOrderResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryOrderResponseBodyData setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

}
