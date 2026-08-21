// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class DataHotelsValue extends TeaModel {
    /**
     * <p>The check-in date (yyyy-MM-dd).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01</p>
     */
    @NameInMap("CheckInDate")
    public String checkInDate;

    /**
     * <p>The check-out date (yyyy-MM-dd).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-02</p>
     */
    @NameInMap("CheckOutDate")
    public String checkOutDate;

    /**
     * <p>The list of available room types for the day.</p>
     */
    @NameInMap("Rooms")
    public java.util.List<DataHotelsValueRooms> rooms;

    /**
     * <p>The standard room type ID.</p>
     * 
     * <strong>example:</strong>
     * <p>R001</p>
     */
    @NameInMap("StandardRoomId")
    public String standardRoomId;

    /**
     * <p>All available offers for the room type.</p>
     */
    @NameInMap("Offers")
    public java.util.List<DataHotelsValueOffers> offers;

    public static DataHotelsValue build(java.util.Map<String, ?> map) throws Exception {
        DataHotelsValue self = new DataHotelsValue();
        return TeaModel.build(map, self);
    }

    public DataHotelsValue setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
        return this;
    }
    public String getCheckInDate() {
        return this.checkInDate;
    }

    public DataHotelsValue setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
        return this;
    }
    public String getCheckOutDate() {
        return this.checkOutDate;
    }

    public DataHotelsValue setRooms(java.util.List<DataHotelsValueRooms> rooms) {
        this.rooms = rooms;
        return this;
    }
    public java.util.List<DataHotelsValueRooms> getRooms() {
        return this.rooms;
    }

    public DataHotelsValue setStandardRoomId(String standardRoomId) {
        this.standardRoomId = standardRoomId;
        return this;
    }
    public String getStandardRoomId() {
        return this.standardRoomId;
    }

    public DataHotelsValue setOffers(java.util.List<DataHotelsValueOffers> offers) {
        this.offers = offers;
        return this;
    }
    public java.util.List<DataHotelsValueOffers> getOffers() {
        return this.offers;
    }

    public static class DataHotelsValueRoomsLowestPrice extends TeaModel {
        /**
         * <p>The amount in the smallest currency unit.</p>
         * 
         * <strong>example:</strong>
         * <p>287</p>
         */
        @NameInMap("Amount")
        public String amount;

        /**
         * <p>The currency code.</p>
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

        public static DataHotelsValueRoomsLowestPrice build(java.util.Map<String, ?> map) throws Exception {
            DataHotelsValueRoomsLowestPrice self = new DataHotelsValueRoomsLowestPrice();
            return TeaModel.build(map, self);
        }

        public DataHotelsValueRoomsLowestPrice setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public DataHotelsValueRoomsLowestPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DataHotelsValueRoomsLowestPrice setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class DataHotelsValueRoomsOffersCancelPolicyPenalties extends TeaModel {
        /**
         * <p>The effective start time (UTC millisecond timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1672531200000</p>
         */
        @NameInMap("Start")
        public String start;

        /**
         * <p>The effective end time (UTC millisecond timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1672617600000</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>The penalty type (PERCENTAGE/AMOUNT/NIGHTS).</p>
         * 
         * <strong>example:</strong>
         * <p>PERCENTAGE</p>
         */
        @NameInMap("PenaltyType")
        public String penaltyType;

        /**
         * <p>The penalty value (percentage/amount/nights).</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PenaltyValue")
        public String penaltyValue;

        /**
         * <p>The currency code (present only when the penalty type is AMOUNT).</p>
         * 
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static DataHotelsValueRoomsOffersCancelPolicyPenalties build(java.util.Map<String, ?> map) throws Exception {
            DataHotelsValueRoomsOffersCancelPolicyPenalties self = new DataHotelsValueRoomsOffersCancelPolicyPenalties();
            return TeaModel.build(map, self);
        }

        public DataHotelsValueRoomsOffersCancelPolicyPenalties setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public DataHotelsValueRoomsOffersCancelPolicyPenalties setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public DataHotelsValueRoomsOffersCancelPolicyPenalties setPenaltyType(String penaltyType) {
            this.penaltyType = penaltyType;
            return this;
        }
        public String getPenaltyType() {
            return this.penaltyType;
        }

        public DataHotelsValueRoomsOffersCancelPolicyPenalties setPenaltyValue(String penaltyValue) {
            this.penaltyValue = penaltyValue;
            return this;
        }
        public String getPenaltyValue() {
            return this.penaltyValue;
        }

        public DataHotelsValueRoomsOffersCancelPolicyPenalties setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DataHotelsValueRoomsOffersCancelPolicyPenalties setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class DataHotelsValueRoomsOffersCancelPolicy extends TeaModel {
        /**
         * <p>The policy type (NON_REFUNDABLE/FREE_CANCELLATION/PARTIAL_REFUND).</p>
         * 
         * <strong>example:</strong>
         * <p>FREE_CANCELLATION</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>The list of penalty details.</p>
         */
        @NameInMap("Penalties")
        public java.util.List<DataHotelsValueRoomsOffersCancelPolicyPenalties> penalties;

        /**
         * <p>TraceId</p>
         * 
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static DataHotelsValueRoomsOffersCancelPolicy build(java.util.Map<String, ?> map) throws Exception {
            DataHotelsValueRoomsOffersCancelPolicy self = new DataHotelsValueRoomsOffersCancelPolicy();
            return TeaModel.build(map, self);
        }

        public DataHotelsValueRoomsOffersCancelPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public DataHotelsValueRoomsOffersCancelPolicy setPenalties(java.util.List<DataHotelsValueRoomsOffersCancelPolicyPenalties> penalties) {
            this.penalties = penalties;
            return this;
        }
        public java.util.List<DataHotelsValueRoomsOffersCancelPolicyPenalties> getPenalties() {
            return this.penalties;
        }

        public DataHotelsValueRoomsOffersCancelPolicy setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class DataHotelsValueRoomsOffersTotalPrice extends TeaModel {
        /**
         * <p>The amount in the smallest currency unit.</p>
         * 
         * <strong>example:</strong>
         * <p>287</p>
         */
        @NameInMap("Amount")
        public String amount;

        /**
         * <p>The currency code.</p>
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

        public static DataHotelsValueRoomsOffersTotalPrice build(java.util.Map<String, ?> map) throws Exception {
            DataHotelsValueRoomsOffersTotalPrice self = new DataHotelsValueRoomsOffersTotalPrice();
            return TeaModel.build(map, self);
        }

        public DataHotelsValueRoomsOffersTotalPrice setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public DataHotelsValueRoomsOffersTotalPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DataHotelsValueRoomsOffersTotalPrice setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class DataHotelsValueRoomsOffersDailyPricesPrice extends TeaModel {
        /**
         * <p>The amount in the smallest currency unit.</p>
         * 
         * <strong>example:</strong>
         * <p>287</p>
         */
        @NameInMap("Amount")
        public String amount;

        /**
         * <p>The currency code.</p>
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

        public static DataHotelsValueRoomsOffersDailyPricesPrice build(java.util.Map<String, ?> map) throws Exception {
            DataHotelsValueRoomsOffersDailyPricesPrice self = new DataHotelsValueRoomsOffersDailyPricesPrice();
            return TeaModel.build(map, self);
        }

        public DataHotelsValueRoomsOffersDailyPricesPrice setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public DataHotelsValueRoomsOffersDailyPricesPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DataHotelsValueRoomsOffersDailyPricesPrice setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class DataHotelsValueRoomsOffersDailyPrices extends TeaModel {
        /**
         * <p>The check-in date (yyyy-MM-dd, time zone: hotel local time zone).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-16</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>The price for the day.</p>
         */
        @NameInMap("Price")
        public DataHotelsValueRoomsOffersDailyPricesPrice price;

        /**
         * <p>null</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static DataHotelsValueRoomsOffersDailyPrices build(java.util.Map<String, ?> map) throws Exception {
            DataHotelsValueRoomsOffersDailyPrices self = new DataHotelsValueRoomsOffersDailyPrices();
            return TeaModel.build(map, self);
        }

        public DataHotelsValueRoomsOffersDailyPrices setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DataHotelsValueRoomsOffersDailyPrices setPrice(DataHotelsValueRoomsOffersDailyPricesPrice price) {
            this.price = price;
            return this;
        }
        public DataHotelsValueRoomsOffersDailyPricesPrice getPrice() {
            return this.price;
        }

        public DataHotelsValueRoomsOffersDailyPrices setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class DataHotelsValueRoomsOffers extends TeaModel {
        /**
         * <p>The item-level offer identifier (price verification key, pass through as-is).</p>
         * 
         * <strong>example:</strong>
         * <p>itemOffer_123</p>
         */
        @NameInMap("ItemOfferKey")
        public String itemOfferKey;

        /**
         * <p>The rate plan name.</p>
         * 
         * <strong>example:</strong>
         * <p>Breakfast included</p>
         */
        @NameInMap("RatePlanName")
        public String ratePlanName;

        /**
         * <p>The meal type.</p>
         * 
         * <strong>example:</strong>
         * <p>BREAKFAST</p>
         */
        @NameInMap("MealType")
        public String mealType;

        /**
         * <p>The number of meals included.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MealCount")
        public Integer mealCount;

        /**
         * <p>The cancellation policy.</p>
         */
        @NameInMap("CancelPolicy")
        public DataHotelsValueRoomsOffersCancelPolicy cancelPolicy;

        /**
         * <p>The total selling price.</p>
         */
        @NameInMap("TotalPrice")
        public DataHotelsValueRoomsOffersTotalPrice totalPrice;

        /**
         * <p>The list of daily prices.</p>
         */
        @NameInMap("DailyPrices")
        public java.util.List<DataHotelsValueRoomsOffersDailyPrices> dailyPrices;

        /**
         * <p>The number of available rooms.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AvailableRooms")
        public Integer availableRooms;

        /**
         * <p>The maximum number of guests allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxOccupancy")
        public Integer maxOccupancy;

        /**
         * <p>The confirmation type (INSTANT_CONFIRM/NON_INSTANT_CONFIRM).</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANT_CONFIRM</p>
         */
        @NameInMap("ConfirmType")
        public String confirmType;

        public static DataHotelsValueRoomsOffers build(java.util.Map<String, ?> map) throws Exception {
            DataHotelsValueRoomsOffers self = new DataHotelsValueRoomsOffers();
            return TeaModel.build(map, self);
        }

        public DataHotelsValueRoomsOffers setItemOfferKey(String itemOfferKey) {
            this.itemOfferKey = itemOfferKey;
            return this;
        }
        public String getItemOfferKey() {
            return this.itemOfferKey;
        }

        public DataHotelsValueRoomsOffers setRatePlanName(String ratePlanName) {
            this.ratePlanName = ratePlanName;
            return this;
        }
        public String getRatePlanName() {
            return this.ratePlanName;
        }

        public DataHotelsValueRoomsOffers setMealType(String mealType) {
            this.mealType = mealType;
            return this;
        }
        public String getMealType() {
            return this.mealType;
        }

        public DataHotelsValueRoomsOffers setMealCount(Integer mealCount) {
            this.mealCount = mealCount;
            return this;
        }
        public Integer getMealCount() {
            return this.mealCount;
        }

        public DataHotelsValueRoomsOffers setCancelPolicy(DataHotelsValueRoomsOffersCancelPolicy cancelPolicy) {
            this.cancelPolicy = cancelPolicy;
            return this;
        }
        public DataHotelsValueRoomsOffersCancelPolicy getCancelPolicy() {
            return this.cancelPolicy;
        }

        public DataHotelsValueRoomsOffers setTotalPrice(DataHotelsValueRoomsOffersTotalPrice totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public DataHotelsValueRoomsOffersTotalPrice getTotalPrice() {
            return this.totalPrice;
        }

        public DataHotelsValueRoomsOffers setDailyPrices(java.util.List<DataHotelsValueRoomsOffersDailyPrices> dailyPrices) {
            this.dailyPrices = dailyPrices;
            return this;
        }
        public java.util.List<DataHotelsValueRoomsOffersDailyPrices> getDailyPrices() {
            return this.dailyPrices;
        }

        public DataHotelsValueRoomsOffers setAvailableRooms(Integer availableRooms) {
            this.availableRooms = availableRooms;
            return this;
        }
        public Integer getAvailableRooms() {
            return this.availableRooms;
        }

        public DataHotelsValueRoomsOffers setMaxOccupancy(Integer maxOccupancy) {
            this.maxOccupancy = maxOccupancy;
            return this;
        }
        public Integer getMaxOccupancy() {
            return this.maxOccupancy;
        }

        public DataHotelsValueRoomsOffers setConfirmType(String confirmType) {
            this.confirmType = confirmType;
            return this;
        }
        public String getConfirmType() {
            return this.confirmType;
        }

    }

    public static class DataHotelsValueRooms extends TeaModel {
        /**
         * <p>The standard room type ID.</p>
         * 
         * <strong>example:</strong>
         * <p>R001</p>
         */
        @NameInMap("StandardRoomId")
        public String standardRoomId;

        /**
         * <p>The lowest price for the room type on the day.</p>
         */
        @NameInMap("LowestPrice")
        public DataHotelsValueRoomsLowestPrice lowestPrice;

        /**
         * <p>The list of all available offers for the room type.</p>
         */
        @NameInMap("Offers")
        public java.util.List<DataHotelsValueRoomsOffers> offers;

        public static DataHotelsValueRooms build(java.util.Map<String, ?> map) throws Exception {
            DataHotelsValueRooms self = new DataHotelsValueRooms();
            return TeaModel.build(map, self);
        }

        public DataHotelsValueRooms setStandardRoomId(String standardRoomId) {
            this.standardRoomId = standardRoomId;
            return this;
        }
        public String getStandardRoomId() {
            return this.standardRoomId;
        }

        public DataHotelsValueRooms setLowestPrice(DataHotelsValueRoomsLowestPrice lowestPrice) {
            this.lowestPrice = lowestPrice;
            return this;
        }
        public DataHotelsValueRoomsLowestPrice getLowestPrice() {
            return this.lowestPrice;
        }

        public DataHotelsValueRooms setOffers(java.util.List<DataHotelsValueRoomsOffers> offers) {
            this.offers = offers;
            return this;
        }
        public java.util.List<DataHotelsValueRoomsOffers> getOffers() {
            return this.offers;
        }

    }

    public static class DataHotelsValueOffersCancelPolicyPenalties extends TeaModel {
        /**
         * <p>The effective start time as a UTC millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1672531200000</p>
         */
        @NameInMap("Start")
        public String start;

        /**
         * <p>The effective end time as a UTC millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1672617600000</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>The penalty type (PERCENTAGE/AMOUNT/NIGHTS).</p>
         * 
         * <strong>example:</strong>
         * <p>PERCENTAGE</p>
         */
        @NameInMap("PenaltyType")
        public String penaltyType;

        /**
         * <p>The penalty value (percentage/amount/nights).</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PenaltyValue")
        public String penaltyValue;

        /**
         * <p>The currency code. This field is present only when the penalty type is AMOUNT.</p>
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

        public static DataHotelsValueOffersCancelPolicyPenalties build(java.util.Map<String, ?> map) throws Exception {
            DataHotelsValueOffersCancelPolicyPenalties self = new DataHotelsValueOffersCancelPolicyPenalties();
            return TeaModel.build(map, self);
        }

        public DataHotelsValueOffersCancelPolicyPenalties setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public DataHotelsValueOffersCancelPolicyPenalties setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public DataHotelsValueOffersCancelPolicyPenalties setPenaltyType(String penaltyType) {
            this.penaltyType = penaltyType;
            return this;
        }
        public String getPenaltyType() {
            return this.penaltyType;
        }

        public DataHotelsValueOffersCancelPolicyPenalties setPenaltyValue(String penaltyValue) {
            this.penaltyValue = penaltyValue;
            return this;
        }
        public String getPenaltyValue() {
            return this.penaltyValue;
        }

        public DataHotelsValueOffersCancelPolicyPenalties setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DataHotelsValueOffersCancelPolicyPenalties setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class DataHotelsValueOffersCancelPolicy extends TeaModel {
        /**
         * <p>The policy type (NON_REFUNDABLE/FREE_CANCELLATION/PARTIAL_REFUND).</p>
         * 
         * <strong>example:</strong>
         * <p>FREE_CANCELLATION</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>The list of penalty details.</p>
         */
        @NameInMap("Penalties")
        public java.util.List<DataHotelsValueOffersCancelPolicyPenalties> penalties;

        /**
         * <p>TraceId</p>
         * 
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static DataHotelsValueOffersCancelPolicy build(java.util.Map<String, ?> map) throws Exception {
            DataHotelsValueOffersCancelPolicy self = new DataHotelsValueOffersCancelPolicy();
            return TeaModel.build(map, self);
        }

        public DataHotelsValueOffersCancelPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public DataHotelsValueOffersCancelPolicy setPenalties(java.util.List<DataHotelsValueOffersCancelPolicyPenalties> penalties) {
            this.penalties = penalties;
            return this;
        }
        public java.util.List<DataHotelsValueOffersCancelPolicyPenalties> getPenalties() {
            return this.penalties;
        }

        public DataHotelsValueOffersCancelPolicy setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class DataHotelsValueOffersTotalPrice extends TeaModel {
        /**
         * <p>The amount in the smallest currency unit.</p>
         * 
         * <strong>example:</strong>
         * <p>287</p>
         */
        @NameInMap("Amount")
        public String amount;

        /**
         * <p>The currency code.</p>
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

        public static DataHotelsValueOffersTotalPrice build(java.util.Map<String, ?> map) throws Exception {
            DataHotelsValueOffersTotalPrice self = new DataHotelsValueOffersTotalPrice();
            return TeaModel.build(map, self);
        }

        public DataHotelsValueOffersTotalPrice setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public DataHotelsValueOffersTotalPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DataHotelsValueOffersTotalPrice setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class DataHotelsValueOffersDailyPricesPrice extends TeaModel {
        /**
         * <p>The amount in the smallest currency unit.</p>
         * 
         * <strong>example:</strong>
         * <p>287</p>
         */
        @NameInMap("Amount")
        public String amount;

        /**
         * <p>The currency code.</p>
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

        public static DataHotelsValueOffersDailyPricesPrice build(java.util.Map<String, ?> map) throws Exception {
            DataHotelsValueOffersDailyPricesPrice self = new DataHotelsValueOffersDailyPricesPrice();
            return TeaModel.build(map, self);
        }

        public DataHotelsValueOffersDailyPricesPrice setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public DataHotelsValueOffersDailyPricesPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DataHotelsValueOffersDailyPricesPrice setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class DataHotelsValueOffersDailyPrices extends TeaModel {
        /**
         * <p>The check-in date in yyyy-MM-dd format, based on the hotel local time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-16</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>The price for the day.</p>
         */
        @NameInMap("Price")
        public DataHotelsValueOffersDailyPricesPrice price;

        /**
         * <p>null</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static DataHotelsValueOffersDailyPrices build(java.util.Map<String, ?> map) throws Exception {
            DataHotelsValueOffersDailyPrices self = new DataHotelsValueOffersDailyPrices();
            return TeaModel.build(map, self);
        }

        public DataHotelsValueOffersDailyPrices setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DataHotelsValueOffersDailyPrices setPrice(DataHotelsValueOffersDailyPricesPrice price) {
            this.price = price;
            return this;
        }
        public DataHotelsValueOffersDailyPricesPrice getPrice() {
            return this.price;
        }

        public DataHotelsValueOffersDailyPrices setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class DataHotelsValueOffers extends TeaModel {
        /**
         * <p>The item offer key used for price verification. Pass through this value as-is.</p>
         * 
         * <strong>example:</strong>
         * <p>itemOffer_123</p>
         */
        @NameInMap("ItemOfferKey")
        public String itemOfferKey;

        /**
         * <p>The rate plan name.</p>
         * 
         * <strong>example:</strong>
         * <p>Breakfast Included</p>
         */
        @NameInMap("RatePlanName")
        public String ratePlanName;

        /**
         * <p>The meal type.</p>
         * 
         * <strong>example:</strong>
         * <p>BREAKFAST</p>
         */
        @NameInMap("MealType")
        public String mealType;

        /**
         * <p>The number of meals included.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MealCount")
        public Integer mealCount;

        /**
         * <p>The cancellation policy.</p>
         */
        @NameInMap("CancelPolicy")
        public DataHotelsValueOffersCancelPolicy cancelPolicy;

        /**
         * <p>The total selling price.</p>
         */
        @NameInMap("TotalPrice")
        public DataHotelsValueOffersTotalPrice totalPrice;

        /**
         * <p>The list of daily prices.</p>
         */
        @NameInMap("DailyPrices")
        public java.util.List<DataHotelsValueOffersDailyPrices> dailyPrices;

        /**
         * <p>The number of available rooms.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AvailableRooms")
        public Integer availableRooms;

        /**
         * <p>The maximum number of guests allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxOccupancy")
        public Integer maxOccupancy;

        /**
         * <p>The confirmation type (INSTANT_CONFIRM/NON_INSTANT_CONFIRM).</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANT_CONFIRM</p>
         */
        @NameInMap("ConfirmType")
        public String confirmType;

        public static DataHotelsValueOffers build(java.util.Map<String, ?> map) throws Exception {
            DataHotelsValueOffers self = new DataHotelsValueOffers();
            return TeaModel.build(map, self);
        }

        public DataHotelsValueOffers setItemOfferKey(String itemOfferKey) {
            this.itemOfferKey = itemOfferKey;
            return this;
        }
        public String getItemOfferKey() {
            return this.itemOfferKey;
        }

        public DataHotelsValueOffers setRatePlanName(String ratePlanName) {
            this.ratePlanName = ratePlanName;
            return this;
        }
        public String getRatePlanName() {
            return this.ratePlanName;
        }

        public DataHotelsValueOffers setMealType(String mealType) {
            this.mealType = mealType;
            return this;
        }
        public String getMealType() {
            return this.mealType;
        }

        public DataHotelsValueOffers setMealCount(Integer mealCount) {
            this.mealCount = mealCount;
            return this;
        }
        public Integer getMealCount() {
            return this.mealCount;
        }

        public DataHotelsValueOffers setCancelPolicy(DataHotelsValueOffersCancelPolicy cancelPolicy) {
            this.cancelPolicy = cancelPolicy;
            return this;
        }
        public DataHotelsValueOffersCancelPolicy getCancelPolicy() {
            return this.cancelPolicy;
        }

        public DataHotelsValueOffers setTotalPrice(DataHotelsValueOffersTotalPrice totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public DataHotelsValueOffersTotalPrice getTotalPrice() {
            return this.totalPrice;
        }

        public DataHotelsValueOffers setDailyPrices(java.util.List<DataHotelsValueOffersDailyPrices> dailyPrices) {
            this.dailyPrices = dailyPrices;
            return this;
        }
        public java.util.List<DataHotelsValueOffersDailyPrices> getDailyPrices() {
            return this.dailyPrices;
        }

        public DataHotelsValueOffers setAvailableRooms(Integer availableRooms) {
            this.availableRooms = availableRooms;
            return this;
        }
        public Integer getAvailableRooms() {
            return this.availableRooms;
        }

        public DataHotelsValueOffers setMaxOccupancy(Integer maxOccupancy) {
            this.maxOccupancy = maxOccupancy;
            return this;
        }
        public Integer getMaxOccupancy() {
            return this.maxOccupancy;
        }

        public DataHotelsValueOffers setConfirmType(String confirmType) {
            this.confirmType = confirmType;
            return this;
        }
        public String getConfirmType() {
            return this.confirmType;
        }

    }

}
