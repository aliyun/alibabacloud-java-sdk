// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopOtaSearchRequest extends TeaModel {
    /**
     * <p>The business travel order ID. This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1017089206331988332</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <p>The external order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>JP2024071800000002</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    /**
     * <p>Specifies whether to enable external polling. When enabled, the external frontend controls polling, which reduces the response time (RT) of a single search. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("out_wheel_search")
    public Boolean outWheelSearch;

    /**
     * <p>The rebooking group key returned by the consultation operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>edcac4f4c79d40ccb141ddb6da567e65</p>
     */
    @NameInMap("passenger_journey_group_key")
    public String passengerJourneyGroupKey;

    /**
     * <p>The rebooking reason code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("re_shop_reason_code")
    public String reShopReasonCode;

    /**
     * <p>The search journeys. Only pass the journeys to be rebooked.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("search_journeys")
    public java.util.List<IntlFlightReShopOtaSearchRequestSearchJourneys> searchJourneys;

    /**
     * <p>The list of selected passengers for rebooking.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("selected_passengers")
    public java.util.List<IntlFlightReShopOtaSearchRequestSelectedPassengers> selectedPassengers;

    /**
     * <p>The query record token used for external polling.</p>
     * 
     * <strong>example:</strong>
     * <p>9960b412-cc05-4d10-b570-93372d816807</p>
     */
    @NameInMap("token")
    public String token;

    public static IntlFlightReShopOtaSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopOtaSearchRequest self = new IntlFlightReShopOtaSearchRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopOtaSearchRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IntlFlightReShopOtaSearchRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public IntlFlightReShopOtaSearchRequest setOutWheelSearch(Boolean outWheelSearch) {
        this.outWheelSearch = outWheelSearch;
        return this;
    }
    public Boolean getOutWheelSearch() {
        return this.outWheelSearch;
    }

    public IntlFlightReShopOtaSearchRequest setPassengerJourneyGroupKey(String passengerJourneyGroupKey) {
        this.passengerJourneyGroupKey = passengerJourneyGroupKey;
        return this;
    }
    public String getPassengerJourneyGroupKey() {
        return this.passengerJourneyGroupKey;
    }

    public IntlFlightReShopOtaSearchRequest setReShopReasonCode(String reShopReasonCode) {
        this.reShopReasonCode = reShopReasonCode;
        return this;
    }
    public String getReShopReasonCode() {
        return this.reShopReasonCode;
    }

    public IntlFlightReShopOtaSearchRequest setSearchJourneys(java.util.List<IntlFlightReShopOtaSearchRequestSearchJourneys> searchJourneys) {
        this.searchJourneys = searchJourneys;
        return this;
    }
    public java.util.List<IntlFlightReShopOtaSearchRequestSearchJourneys> getSearchJourneys() {
        return this.searchJourneys;
    }

    public IntlFlightReShopOtaSearchRequest setSelectedPassengers(java.util.List<IntlFlightReShopOtaSearchRequestSelectedPassengers> selectedPassengers) {
        this.selectedPassengers = selectedPassengers;
        return this;
    }
    public java.util.List<IntlFlightReShopOtaSearchRequestSelectedPassengers> getSelectedPassengers() {
        return this.selectedPassengers;
    }

    public IntlFlightReShopOtaSearchRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public static class IntlFlightReShopOtaSearchRequestSearchJourneysSelectedFlights extends TeaModel {
        /**
         * <p>The three-letter code of the arrival city.</p>
         * 
         * <strong>example:</strong>
         * <p>MEL</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <p>The three-letter code of the departure city.</p>
         * 
         * <strong>example:</strong>
         * <p>HKG</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <p>The departure time. Format: yyyy-MM-dd HH:mm.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-28 12:00</p>
         */
        @NameInMap("flight_time")
        public String flightTime;

        /**
         * <p>The marketing flight number.</p>
         * 
         * <strong>example:</strong>
         * <p>HO3925</p>
         */
        @NameInMap("market_flight_no")
        public String marketFlightNo;

        public static IntlFlightReShopOtaSearchRequestSearchJourneysSelectedFlights build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopOtaSearchRequestSearchJourneysSelectedFlights self = new IntlFlightReShopOtaSearchRequestSearchJourneysSelectedFlights();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopOtaSearchRequestSearchJourneysSelectedFlights setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightReShopOtaSearchRequestSearchJourneysSelectedFlights setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightReShopOtaSearchRequestSearchJourneysSelectedFlights setFlightTime(String flightTime) {
            this.flightTime = flightTime;
            return this;
        }
        public String getFlightTime() {
            return this.flightTime;
        }

        public IntlFlightReShopOtaSearchRequestSearchJourneysSelectedFlights setMarketFlightNo(String marketFlightNo) {
            this.marketFlightNo = marketFlightNo;
            return this;
        }
        public String getMarketFlightNo() {
            return this.marketFlightNo;
        }

    }

    public static class IntlFlightReShopOtaSearchRequestSearchJourneys extends TeaModel {
        /**
         * <p>The three-letter code of the arrival city.</p>
         * 
         * <strong>example:</strong>
         * <p>MEL</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <p>The three-letter code of the departure city.</p>
         * 
         * <strong>example:</strong>
         * <p>HKG</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <p>The departure date. Format: yyyy-MM-dd.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-28</p>
         */
        @NameInMap("dep_date")
        public String depDate;

        /**
         * <p>The selected flight information for rebooking.</p>
         */
        @NameInMap("selected_flights")
        public java.util.List<IntlFlightReShopOtaSearchRequestSearchJourneysSelectedFlights> selectedFlights;

        public static IntlFlightReShopOtaSearchRequestSearchJourneys build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopOtaSearchRequestSearchJourneys self = new IntlFlightReShopOtaSearchRequestSearchJourneys();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopOtaSearchRequestSearchJourneys setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightReShopOtaSearchRequestSearchJourneys setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightReShopOtaSearchRequestSearchJourneys setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public IntlFlightReShopOtaSearchRequestSearchJourneys setSelectedFlights(java.util.List<IntlFlightReShopOtaSearchRequestSearchJourneysSelectedFlights> selectedFlights) {
            this.selectedFlights = selectedFlights;
            return this;
        }
        public java.util.List<IntlFlightReShopOtaSearchRequestSearchJourneysSelectedFlights> getSelectedFlights() {
            return this.selectedFlights;
        }

    }

    public static class IntlFlightReShopOtaSearchRequestSelectedPassengers extends TeaModel {
        /**
         * <p>The full name of the passenger.</p>
         * 
         * <strong>example:</strong>
         * <p>ZHANG/SAN</p>
         */
        @NameInMap("full_name")
        public String fullName;

        /**
         * <p>The passenger ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000001</p>
         */
        @NameInMap("passenger_id")
        public Long passengerId;

        public static IntlFlightReShopOtaSearchRequestSelectedPassengers build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopOtaSearchRequestSelectedPassengers self = new IntlFlightReShopOtaSearchRequestSelectedPassengers();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopOtaSearchRequestSelectedPassengers setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public IntlFlightReShopOtaSearchRequestSelectedPassengers setPassengerId(Long passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public Long getPassengerId() {
            return this.passengerId;
        }

    }

}
