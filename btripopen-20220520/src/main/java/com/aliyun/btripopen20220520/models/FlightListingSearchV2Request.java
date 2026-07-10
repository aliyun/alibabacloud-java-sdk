// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightListingSearchV2Request extends TeaModel {
    @NameInMap("airline_code")
    public String airlineCode;

    @NameInMap("cabin_type_list")
    public java.util.List<Integer> cabinTypeList;

    @NameInMap("direct_only")
    public Boolean directOnly;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("need_multi_class_price")
    public Boolean needMultiClassPrice;

    @NameInMap("need_query_service_fee")
    public Boolean needQueryServiceFee;

    @NameInMap("need_share_flight")
    public Boolean needShareFlight;

    @NameInMap("need_y_c_best_price")
    public Boolean needYCBestPrice;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("search_journeys")
    public java.util.List<FlightListingSearchV2RequestSearchJourneys> searchJourneys;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("search_mode")
    public Integer searchMode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("trip_type")
    public Integer tripType;

    public static FlightListingSearchV2Request build(java.util.Map<String, ?> map) throws Exception {
        FlightListingSearchV2Request self = new FlightListingSearchV2Request();
        return TeaModel.build(map, self);
    }

    public FlightListingSearchV2Request setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
        return this;
    }
    public String getAirlineCode() {
        return this.airlineCode;
    }

    public FlightListingSearchV2Request setCabinTypeList(java.util.List<Integer> cabinTypeList) {
        this.cabinTypeList = cabinTypeList;
        return this;
    }
    public java.util.List<Integer> getCabinTypeList() {
        return this.cabinTypeList;
    }

    public FlightListingSearchV2Request setDirectOnly(Boolean directOnly) {
        this.directOnly = directOnly;
        return this;
    }
    public Boolean getDirectOnly() {
        return this.directOnly;
    }

    public FlightListingSearchV2Request setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightListingSearchV2Request setNeedMultiClassPrice(Boolean needMultiClassPrice) {
        this.needMultiClassPrice = needMultiClassPrice;
        return this;
    }
    public Boolean getNeedMultiClassPrice() {
        return this.needMultiClassPrice;
    }

    public FlightListingSearchV2Request setNeedQueryServiceFee(Boolean needQueryServiceFee) {
        this.needQueryServiceFee = needQueryServiceFee;
        return this;
    }
    public Boolean getNeedQueryServiceFee() {
        return this.needQueryServiceFee;
    }

    public FlightListingSearchV2Request setNeedShareFlight(Boolean needShareFlight) {
        this.needShareFlight = needShareFlight;
        return this;
    }
    public Boolean getNeedShareFlight() {
        return this.needShareFlight;
    }

    public FlightListingSearchV2Request setNeedYCBestPrice(Boolean needYCBestPrice) {
        this.needYCBestPrice = needYCBestPrice;
        return this;
    }
    public Boolean getNeedYCBestPrice() {
        return this.needYCBestPrice;
    }

    public FlightListingSearchV2Request setSearchJourneys(java.util.List<FlightListingSearchV2RequestSearchJourneys> searchJourneys) {
        this.searchJourneys = searchJourneys;
        return this;
    }
    public java.util.List<FlightListingSearchV2RequestSearchJourneys> getSearchJourneys() {
        return this.searchJourneys;
    }

    public FlightListingSearchV2Request setSearchMode(Integer searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public Integer getSearchMode() {
        return this.searchMode;
    }

    public FlightListingSearchV2Request setTripType(Integer tripType) {
        this.tripType = tripType;
        return this;
    }
    public Integer getTripType() {
        return this.tripType;
    }

    public static class FlightListingSearchV2RequestSearchJourneysSelectedFlights extends TeaModel {
        @NameInMap("arr_airport_code")
        public String arrAirportCode;

        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("dep_airport_code")
        public String depAirportCode;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("flight_time")
        public String flightTime;

        @NameInMap("market_flight_no")
        public String marketFlightNo;

        @NameInMap("operate_flight_no")
        public String operateFlightNo;

        public static FlightListingSearchV2RequestSearchJourneysSelectedFlights build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchV2RequestSearchJourneysSelectedFlights self = new FlightListingSearchV2RequestSearchJourneysSelectedFlights();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchV2RequestSearchJourneysSelectedFlights setArrAirportCode(String arrAirportCode) {
            this.arrAirportCode = arrAirportCode;
            return this;
        }
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        public FlightListingSearchV2RequestSearchJourneysSelectedFlights setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightListingSearchV2RequestSearchJourneysSelectedFlights setDepAirportCode(String depAirportCode) {
            this.depAirportCode = depAirportCode;
            return this;
        }
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        public FlightListingSearchV2RequestSearchJourneysSelectedFlights setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightListingSearchV2RequestSearchJourneysSelectedFlights setFlightTime(String flightTime) {
            this.flightTime = flightTime;
            return this;
        }
        public String getFlightTime() {
            return this.flightTime;
        }

        public FlightListingSearchV2RequestSearchJourneysSelectedFlights setMarketFlightNo(String marketFlightNo) {
            this.marketFlightNo = marketFlightNo;
            return this;
        }
        public String getMarketFlightNo() {
            return this.marketFlightNo;
        }

        public FlightListingSearchV2RequestSearchJourneysSelectedFlights setOperateFlightNo(String operateFlightNo) {
            this.operateFlightNo = operateFlightNo;
            return this;
        }
        public String getOperateFlightNo() {
            return this.operateFlightNo;
        }

    }

    public static class FlightListingSearchV2RequestSearchJourneys extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("dep_date")
        public String depDate;

        @NameInMap("selected_flights")
        public java.util.List<FlightListingSearchV2RequestSearchJourneysSelectedFlights> selectedFlights;

        public static FlightListingSearchV2RequestSearchJourneys build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchV2RequestSearchJourneys self = new FlightListingSearchV2RequestSearchJourneys();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchV2RequestSearchJourneys setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightListingSearchV2RequestSearchJourneys setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightListingSearchV2RequestSearchJourneys setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public FlightListingSearchV2RequestSearchJourneys setSelectedFlights(java.util.List<FlightListingSearchV2RequestSearchJourneysSelectedFlights> selectedFlights) {
            this.selectedFlights = selectedFlights;
            return this;
        }
        public java.util.List<FlightListingSearchV2RequestSearchJourneysSelectedFlights> getSelectedFlights() {
            return this.selectedFlights;
        }

    }

}
