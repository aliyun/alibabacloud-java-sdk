// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class DataHotelsValue extends TeaModel {
    /**
     * <p>The check-in date in the format of yyyy-MM-dd.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01</p>
     */
    @NameInMap("CheckInDate")
    public String checkInDate;

    /**
     * <p>The check-out date in the format of yyyy-MM-dd.</p>
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

    public static class DataHotelsValueRoomsLowestSellingPrice extends TeaModel {
        /**
         * <p>The amount.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00</p>
         */
        @NameInMap("Amount")
        public Double amount;

        /**
         * <p>The currency code.</p>
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

        public static DataHotelsValueRoomsLowestSellingPrice build(java.util.Map<String, ?> map) throws Exception {
            DataHotelsValueRoomsLowestSellingPrice self = new DataHotelsValueRoomsLowestSellingPrice();
            return TeaModel.build(map, self);
        }

        public DataHotelsValueRoomsLowestSellingPrice setAmount(Double amount) {
            this.amount = amount;
            return this;
        }
        public Double getAmount() {
            return this.amount;
        }

        public DataHotelsValueRoomsLowestSellingPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DataHotelsValueRoomsLowestSellingPrice setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class DataHotelsValueRoomsOffersCancelPolicyPenalties extends TeaModel {
        /**
         * <p>The effective start time, in UTC millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1672531200000</p>
         */
        @NameInMap("Start")
        public Long start;

        /**
         * <p>The effective end time, in UTC millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1672617600000</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <p>The penalty type. Valid values: PERCENTAGE, AMOUNT, and NIGHTS.</p>
         * 
         * <strong>example:</strong>
         * <p>PERCENTAGE</p>
         */
        @NameInMap("PenaltyType")
        public String penaltyType;

        /**
         * <p>The penalty value (percentage, amount, or number of nights).</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PenaltyValue")
        public String penaltyValue;

        /**
         * <p>The currency. This parameter has a value only when PenaltyType is set to AMOUNT.</p>
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

        public DataHotelsValueRoomsOffersCancelPolicyPenalties setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public DataHotelsValueRoomsOffersCancelPolicyPenalties setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
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
         * <p>The policy type. Valid values: NON_REFUNDABLE, FREE_CANCELLATION, and PARTIAL_REFUND.</p>
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

    public static class DataHotelsValueRoomsOffersSellingTotalPrice extends TeaModel {
        /**
         * <p>The amount.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00</p>
         */
        @NameInMap("Amount")
        public Double amount;

        /**
         * <p>The currency code.</p>
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

        public static DataHotelsValueRoomsOffersSellingTotalPrice build(java.util.Map<String, ?> map) throws Exception {
            DataHotelsValueRoomsOffersSellingTotalPrice self = new DataHotelsValueRoomsOffersSellingTotalPrice();
            return TeaModel.build(map, self);
        }

        public DataHotelsValueRoomsOffersSellingTotalPrice setAmount(Double amount) {
            this.amount = amount;
            return this;
        }
        public Double getAmount() {
            return this.amount;
        }

        public DataHotelsValueRoomsOffersSellingTotalPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DataHotelsValueRoomsOffersSellingTotalPrice setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class DataHotelsValueRoomsOffersSellingDailyPricesPrice extends TeaModel {
        /**
         * <p>The amount.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00</p>
         */
        @NameInMap("Amount")
        public Double amount;

        /**
         * <p>The currency code.</p>
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

        public static DataHotelsValueRoomsOffersSellingDailyPricesPrice build(java.util.Map<String, ?> map) throws Exception {
            DataHotelsValueRoomsOffersSellingDailyPricesPrice self = new DataHotelsValueRoomsOffersSellingDailyPricesPrice();
            return TeaModel.build(map, self);
        }

        public DataHotelsValueRoomsOffersSellingDailyPricesPrice setAmount(Double amount) {
            this.amount = amount;
            return this;
        }
        public Double getAmount() {
            return this.amount;
        }

        public DataHotelsValueRoomsOffersSellingDailyPricesPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DataHotelsValueRoomsOffersSellingDailyPricesPrice setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class DataHotelsValueRoomsOffersSellingDailyPrices extends TeaModel {
        /**
         * <p>The check-in date.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-01</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>The price for the day.</p>
         */
        @NameInMap("Price")
        public DataHotelsValueRoomsOffersSellingDailyPricesPrice price;

        /**
         * <p>TraceId</p>
         * 
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static DataHotelsValueRoomsOffersSellingDailyPrices build(java.util.Map<String, ?> map) throws Exception {
            DataHotelsValueRoomsOffersSellingDailyPrices self = new DataHotelsValueRoomsOffersSellingDailyPrices();
            return TeaModel.build(map, self);
        }

        public DataHotelsValueRoomsOffersSellingDailyPrices setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DataHotelsValueRoomsOffersSellingDailyPrices setPrice(DataHotelsValueRoomsOffersSellingDailyPricesPrice price) {
            this.price = price;
            return this;
        }
        public DataHotelsValueRoomsOffersSellingDailyPricesPrice getPrice() {
            return this.price;
        }

        public DataHotelsValueRoomsOffersSellingDailyPrices setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class DataHotelsValueRoomsOffers extends TeaModel {
        /**
         * <p>The item-level offer identifier (price verification key, passed through as-is).</p>
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
         * <p>Room with breakfast</p>
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
        @NameInMap("SellingTotalPrice")
        public DataHotelsValueRoomsOffersSellingTotalPrice sellingTotalPrice;

        /**
         * <p>The list of daily selling prices.</p>
         */
        @NameInMap("SellingDailyPrices")
        public java.util.List<DataHotelsValueRoomsOffersSellingDailyPrices> sellingDailyPrices;

        /**
         * <p>The number of available rooms.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AvailableRooms")
        public Integer availableRooms;

        /**
         * <p>The maximum number of guests.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxOccupancy")
        public Integer maxOccupancy;

        /**
         * <p>The confirmation type. Valid values: INSTANT_CONFIRM and NON_INSTANT_CONFIRM.</p>
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

        public DataHotelsValueRoomsOffers setSellingTotalPrice(DataHotelsValueRoomsOffersSellingTotalPrice sellingTotalPrice) {
            this.sellingTotalPrice = sellingTotalPrice;
            return this;
        }
        public DataHotelsValueRoomsOffersSellingTotalPrice getSellingTotalPrice() {
            return this.sellingTotalPrice;
        }

        public DataHotelsValueRoomsOffers setSellingDailyPrices(java.util.List<DataHotelsValueRoomsOffersSellingDailyPrices> sellingDailyPrices) {
            this.sellingDailyPrices = sellingDailyPrices;
            return this;
        }
        public java.util.List<DataHotelsValueRoomsOffersSellingDailyPrices> getSellingDailyPrices() {
            return this.sellingDailyPrices;
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
         * <p>The lowest selling price for the room type on the day.</p>
         */
        @NameInMap("LowestSellingPrice")
        public DataHotelsValueRoomsLowestSellingPrice lowestSellingPrice;

        /**
         * <p>The list of all available offers for the room type. Calendar quotes cannot be used for price verification, so itemOfferKey is not returned.</p>
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

        public DataHotelsValueRooms setLowestSellingPrice(DataHotelsValueRoomsLowestSellingPrice lowestSellingPrice) {
            this.lowestSellingPrice = lowestSellingPrice;
            return this;
        }
        public DataHotelsValueRoomsLowestSellingPrice getLowestSellingPrice() {
            return this.lowestSellingPrice;
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
         * <p>The effective start time (UTC millisecond timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1672531200000</p>
         */
        @NameInMap("Start")
        public Long start;

        /**
         * <p>The effective end time (UTC millisecond timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1672617600000</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <p>The penalty type (PERCENTAGE/AMOUNT/NIGHTS).</p>
         * 
         * <strong>example:</strong>
         * <p>PERCENTAGE</p>
         */
        @NameInMap("PenaltyType")
        public String penaltyType;

        /**
         * <p>The penalty value (percentage/amount/number of nights).</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PenaltyValue")
        public String penaltyValue;

        /**
         * <p>The currency code (only applicable when the penalty type is AMOUNT).</p>
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

        public DataHotelsValueOffersCancelPolicyPenalties setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public DataHotelsValueOffersCancelPolicyPenalties setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
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

    public static class DataHotelsValueOffersSellingTotalPrice extends TeaModel {
        /**
         * <p>The amount.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00</p>
         */
        @NameInMap("Amount")
        public Double amount;

        /**
         * <p>The currency code.</p>
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

        public static DataHotelsValueOffersSellingTotalPrice build(java.util.Map<String, ?> map) throws Exception {
            DataHotelsValueOffersSellingTotalPrice self = new DataHotelsValueOffersSellingTotalPrice();
            return TeaModel.build(map, self);
        }

        public DataHotelsValueOffersSellingTotalPrice setAmount(Double amount) {
            this.amount = amount;
            return this;
        }
        public Double getAmount() {
            return this.amount;
        }

        public DataHotelsValueOffersSellingTotalPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DataHotelsValueOffersSellingTotalPrice setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class DataHotelsValueOffersSellingDailyPricesPrice extends TeaModel {
        /**
         * <p>The amount.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00</p>
         */
        @NameInMap("Amount")
        public Double amount;

        /**
         * <p>The currency code.</p>
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

        public static DataHotelsValueOffersSellingDailyPricesPrice build(java.util.Map<String, ?> map) throws Exception {
            DataHotelsValueOffersSellingDailyPricesPrice self = new DataHotelsValueOffersSellingDailyPricesPrice();
            return TeaModel.build(map, self);
        }

        public DataHotelsValueOffersSellingDailyPricesPrice setAmount(Double amount) {
            this.amount = amount;
            return this;
        }
        public Double getAmount() {
            return this.amount;
        }

        public DataHotelsValueOffersSellingDailyPricesPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DataHotelsValueOffersSellingDailyPricesPrice setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class DataHotelsValueOffersSellingDailyPrices extends TeaModel {
        /**
         * <p>The check-in date.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-01</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>The price for the day.</p>
         */
        @NameInMap("Price")
        public DataHotelsValueOffersSellingDailyPricesPrice price;

        /**
         * <p>TraceId</p>
         * 
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static DataHotelsValueOffersSellingDailyPrices build(java.util.Map<String, ?> map) throws Exception {
            DataHotelsValueOffersSellingDailyPrices self = new DataHotelsValueOffersSellingDailyPrices();
            return TeaModel.build(map, self);
        }

        public DataHotelsValueOffersSellingDailyPrices setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DataHotelsValueOffersSellingDailyPrices setPrice(DataHotelsValueOffersSellingDailyPricesPrice price) {
            this.price = price;
            return this;
        }
        public DataHotelsValueOffersSellingDailyPricesPrice getPrice() {
            return this.price;
        }

        public DataHotelsValueOffersSellingDailyPrices setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

    public static class DataHotelsValueOffers extends TeaModel {
        /**
         * <p>The item-domain offer identifier (price verification key, passed through as-is).</p>
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
         * <p>The cancellation and modification policy.</p>
         */
        @NameInMap("CancelPolicy")
        public DataHotelsValueOffersCancelPolicy cancelPolicy;

        /**
         * <p>The total selling price.</p>
         */
        @NameInMap("SellingTotalPrice")
        public DataHotelsValueOffersSellingTotalPrice sellingTotalPrice;

        /**
         * <p>The list of daily selling prices.</p>
         */
        @NameInMap("SellingDailyPrices")
        public java.util.List<DataHotelsValueOffersSellingDailyPrices> sellingDailyPrices;

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

        public DataHotelsValueOffers setSellingTotalPrice(DataHotelsValueOffersSellingTotalPrice sellingTotalPrice) {
            this.sellingTotalPrice = sellingTotalPrice;
            return this;
        }
        public DataHotelsValueOffersSellingTotalPrice getSellingTotalPrice() {
            return this.sellingTotalPrice;
        }

        public DataHotelsValueOffers setSellingDailyPrices(java.util.List<DataHotelsValueOffersSellingDailyPrices> sellingDailyPrices) {
            this.sellingDailyPrices = sellingDailyPrices;
            return this;
        }
        public java.util.List<DataHotelsValueOffersSellingDailyPrices> getSellingDailyPrices() {
            return this.sellingDailyPrices;
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
