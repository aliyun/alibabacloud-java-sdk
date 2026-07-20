// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopListSearchRequest extends TeaModel {
    /**
     * <p>The business travel order ID. Required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1002027205317939247</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <p>The external order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3985893777358602240</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    /**
     * <p>Specifies whether external polling is enabled. When enabled, the external frontend controls polling to reduce the response time of a single search. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("out_wheel_search")
    public Boolean outWheelSearch;

    /**
     * <p>The rebooking group key returned by the consultation API.</p>
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
     * <p>The list of journeys selected for rebooking.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("search_journeys")
    public java.util.List<IntlFlightReShopListSearchRequestSearchJourneys> searchJourneys;

    /**
     * <p>The list of passengers selected for rebooking.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("selected_passengers")
    public java.util.List<IntlFlightReShopListSearchRequestSelectedPassengers> selectedPassengers;

    /**
     * <p>The query record token for external polling.</p>
     * 
     * <strong>example:</strong>
     * <p>0305b8203a7767626f911d97a91a9473</p>
     */
    @NameInMap("token")
    public String token;

    public static IntlFlightReShopListSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopListSearchRequest self = new IntlFlightReShopListSearchRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopListSearchRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IntlFlightReShopListSearchRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public IntlFlightReShopListSearchRequest setOutWheelSearch(Boolean outWheelSearch) {
        this.outWheelSearch = outWheelSearch;
        return this;
    }
    public Boolean getOutWheelSearch() {
        return this.outWheelSearch;
    }

    public IntlFlightReShopListSearchRequest setPassengerJourneyGroupKey(String passengerJourneyGroupKey) {
        this.passengerJourneyGroupKey = passengerJourneyGroupKey;
        return this;
    }
    public String getPassengerJourneyGroupKey() {
        return this.passengerJourneyGroupKey;
    }

    public IntlFlightReShopListSearchRequest setReShopReasonCode(String reShopReasonCode) {
        this.reShopReasonCode = reShopReasonCode;
        return this;
    }
    public String getReShopReasonCode() {
        return this.reShopReasonCode;
    }

    public IntlFlightReShopListSearchRequest setSearchJourneys(java.util.List<IntlFlightReShopListSearchRequestSearchJourneys> searchJourneys) {
        this.searchJourneys = searchJourneys;
        return this;
    }
    public java.util.List<IntlFlightReShopListSearchRequestSearchJourneys> getSearchJourneys() {
        return this.searchJourneys;
    }

    public IntlFlightReShopListSearchRequest setSelectedPassengers(java.util.List<IntlFlightReShopListSearchRequestSelectedPassengers> selectedPassengers) {
        this.selectedPassengers = selectedPassengers;
        return this;
    }
    public java.util.List<IntlFlightReShopListSearchRequestSelectedPassengers> getSelectedPassengers() {
        return this.selectedPassengers;
    }

    public IntlFlightReShopListSearchRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public static class IntlFlightReShopListSearchRequestSearchJourneysSelectedFlights extends TeaModel {
        /**
         * <p>The three-letter code of the arrival city.</p>
         * 
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <p>The three-letter code of the departure city.</p>
         * 
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <p>The departure time. Format: yyyy-MM-dd HH:mm.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-01 07:10</p>
         */
        @NameInMap("flight_time")
        public String flightTime;

        /**
         * <p>The marketing carrier flight number.</p>
         * 
         * <strong>example:</strong>
         * <p>KA5809</p>
         */
        @NameInMap("market_flight_no")
        public String marketFlightNo;

        public static IntlFlightReShopListSearchRequestSearchJourneysSelectedFlights build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopListSearchRequestSearchJourneysSelectedFlights self = new IntlFlightReShopListSearchRequestSearchJourneysSelectedFlights();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopListSearchRequestSearchJourneysSelectedFlights setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightReShopListSearchRequestSearchJourneysSelectedFlights setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightReShopListSearchRequestSearchJourneysSelectedFlights setFlightTime(String flightTime) {
            this.flightTime = flightTime;
            return this;
        }
        public String getFlightTime() {
            return this.flightTime;
        }

        public IntlFlightReShopListSearchRequestSearchJourneysSelectedFlights setMarketFlightNo(String marketFlightNo) {
            this.marketFlightNo = marketFlightNo;
            return this;
        }
        public String getMarketFlightNo() {
            return this.marketFlightNo;
        }

    }

    public static class IntlFlightReShopListSearchRequestSearchJourneys extends TeaModel {
        /**
         * <p>The three-letter code of the arrival city.</p>
         * 
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <p>The three-letter code of the departure city.</p>
         * 
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <p>The preferred date selected by the user. Format: yyyy-MM-dd.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-28</p>
         */
        @NameInMap("dep_date")
        public String depDate;

        /**
         * <p>The selected flight information for rebooking.</p>
         */
        @NameInMap("selected_flights")
        public java.util.List<IntlFlightReShopListSearchRequestSearchJourneysSelectedFlights> selectedFlights;

        public static IntlFlightReShopListSearchRequestSearchJourneys build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopListSearchRequestSearchJourneys self = new IntlFlightReShopListSearchRequestSearchJourneys();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopListSearchRequestSearchJourneys setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightReShopListSearchRequestSearchJourneys setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightReShopListSearchRequestSearchJourneys setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public IntlFlightReShopListSearchRequestSearchJourneys setSelectedFlights(java.util.List<IntlFlightReShopListSearchRequestSearchJourneysSelectedFlights> selectedFlights) {
            this.selectedFlights = selectedFlights;
            return this;
        }
        public java.util.List<IntlFlightReShopListSearchRequestSearchJourneysSelectedFlights> getSelectedFlights() {
            return this.selectedFlights;
        }

    }

    public static class IntlFlightReShopListSearchRequestSelectedPassengers extends TeaModel {
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

        public static IntlFlightReShopListSearchRequestSelectedPassengers build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopListSearchRequestSelectedPassengers self = new IntlFlightReShopListSearchRequestSelectedPassengers();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopListSearchRequestSelectedPassengers setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public IntlFlightReShopListSearchRequestSelectedPassengers setPassengerId(Long passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public Long getPassengerId() {
            return this.passengerId;
        }

    }

}
