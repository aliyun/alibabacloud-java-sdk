// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopApplyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>asyncKey_2390u230slgw023</p>
     */
    @NameInMap("async_apply_key")
    public String asyncApplyKey;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("async_apply_mode")
    public Boolean asyncApplyMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1017035199907040165</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>D1736316966048SC4877</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    /**
     * <strong>example:</strong>
     * <p>JPM20241024354</p>
     */
    @NameInMap("out_re_shop_apply_id")
    public String outReShopApplyId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>edcac4f4c79d40ccb141ddb6da567e65</p>
     */
    @NameInMap("passenger_journey_group_key")
    public String passengerJourneyGroupKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("re_shop_reason_code")
    public String reShopReasonCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("selected_journeys")
    public java.util.List<IntlFlightReShopApplyRequestSelectedJourneys> selectedJourneys;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("selected_passengers")
    public java.util.List<IntlFlightReShopApplyRequestSelectedPassengers> selectedPassengers;

    @NameInMap("user_intention_memo")
    public String userIntentionMemo;

    public static IntlFlightReShopApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopApplyRequest self = new IntlFlightReShopApplyRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopApplyRequest setAsyncApplyKey(String asyncApplyKey) {
        this.asyncApplyKey = asyncApplyKey;
        return this;
    }
    public String getAsyncApplyKey() {
        return this.asyncApplyKey;
    }

    public IntlFlightReShopApplyRequest setAsyncApplyMode(Boolean asyncApplyMode) {
        this.asyncApplyMode = asyncApplyMode;
        return this;
    }
    public Boolean getAsyncApplyMode() {
        return this.asyncApplyMode;
    }

    public IntlFlightReShopApplyRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IntlFlightReShopApplyRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public IntlFlightReShopApplyRequest setOutReShopApplyId(String outReShopApplyId) {
        this.outReShopApplyId = outReShopApplyId;
        return this;
    }
    public String getOutReShopApplyId() {
        return this.outReShopApplyId;
    }

    public IntlFlightReShopApplyRequest setPassengerJourneyGroupKey(String passengerJourneyGroupKey) {
        this.passengerJourneyGroupKey = passengerJourneyGroupKey;
        return this;
    }
    public String getPassengerJourneyGroupKey() {
        return this.passengerJourneyGroupKey;
    }

    public IntlFlightReShopApplyRequest setReShopReasonCode(String reShopReasonCode) {
        this.reShopReasonCode = reShopReasonCode;
        return this;
    }
    public String getReShopReasonCode() {
        return this.reShopReasonCode;
    }

    public IntlFlightReShopApplyRequest setSelectedJourneys(java.util.List<IntlFlightReShopApplyRequestSelectedJourneys> selectedJourneys) {
        this.selectedJourneys = selectedJourneys;
        return this;
    }
    public java.util.List<IntlFlightReShopApplyRequestSelectedJourneys> getSelectedJourneys() {
        return this.selectedJourneys;
    }

    public IntlFlightReShopApplyRequest setSelectedPassengers(java.util.List<IntlFlightReShopApplyRequestSelectedPassengers> selectedPassengers) {
        this.selectedPassengers = selectedPassengers;
        return this;
    }
    public java.util.List<IntlFlightReShopApplyRequestSelectedPassengers> getSelectedPassengers() {
        return this.selectedPassengers;
    }

    public IntlFlightReShopApplyRequest setUserIntentionMemo(String userIntentionMemo) {
        this.userIntentionMemo = userIntentionMemo;
        return this;
    }
    public String getUserIntentionMemo() {
        return this.userIntentionMemo;
    }

    public static class IntlFlightReShopApplyRequestSelectedJourneysSelectedFlights extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HKG</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>KN6728HGHPKX0725</p>
         */
        @NameInMap("segment_key")
        public String segmentKey;

        public static IntlFlightReShopApplyRequestSelectedJourneysSelectedFlights build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopApplyRequestSelectedJourneysSelectedFlights self = new IntlFlightReShopApplyRequestSelectedJourneysSelectedFlights();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopApplyRequestSelectedJourneysSelectedFlights setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightReShopApplyRequestSelectedJourneysSelectedFlights setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightReShopApplyRequestSelectedJourneysSelectedFlights setSegmentKey(String segmentKey) {
            this.segmentKey = segmentKey;
            return this;
        }
        public String getSegmentKey() {
            return this.segmentKey;
        }

    }

    public static class IntlFlightReShopApplyRequestSelectedJourneys extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DLC</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TSN</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-10</p>
         */
        @NameInMap("intent_date")
        public String intentDate;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("selected_flights")
        public java.util.List<IntlFlightReShopApplyRequestSelectedJourneysSelectedFlights> selectedFlights;

        public static IntlFlightReShopApplyRequestSelectedJourneys build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopApplyRequestSelectedJourneys self = new IntlFlightReShopApplyRequestSelectedJourneys();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopApplyRequestSelectedJourneys setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightReShopApplyRequestSelectedJourneys setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightReShopApplyRequestSelectedJourneys setIntentDate(String intentDate) {
            this.intentDate = intentDate;
            return this;
        }
        public String getIntentDate() {
            return this.intentDate;
        }

        public IntlFlightReShopApplyRequestSelectedJourneys setSelectedFlights(java.util.List<IntlFlightReShopApplyRequestSelectedJourneysSelectedFlights> selectedFlights) {
            this.selectedFlights = selectedFlights;
            return this;
        }
        public java.util.List<IntlFlightReShopApplyRequestSelectedJourneysSelectedFlights> getSelectedFlights() {
            return this.selectedFlights;
        }

    }

    public static class IntlFlightReShopApplyRequestSelectedPassengers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ZHANG/SAN</p>
         */
        @NameInMap("full_name")
        public String fullName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("passenger_id")
        public Long passengerId;

        public static IntlFlightReShopApplyRequestSelectedPassengers build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopApplyRequestSelectedPassengers self = new IntlFlightReShopApplyRequestSelectedPassengers();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopApplyRequestSelectedPassengers setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public IntlFlightReShopApplyRequestSelectedPassengers setPassengerId(Long passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public Long getPassengerId() {
            return this.passengerId;
        }

    }

}
