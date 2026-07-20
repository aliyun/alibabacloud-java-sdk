// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOtaSearchV2Request extends TeaModel {
    @NameInMap("cabin_type_list")
    public java.util.List<Integer> cabinTypeList;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("direct_only")
    public Boolean directOnly;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cheshi</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("need_share_flight")
    public Boolean needShareFlight;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("search_journeys")
    public java.util.List<FlightOtaSearchV2RequestSearchJourneys> searchJourneys;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("search_mode")
    public Integer searchMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("trip_type")
    public Integer tripType;

    public static FlightOtaSearchV2Request build(java.util.Map<String, ?> map) throws Exception {
        FlightOtaSearchV2Request self = new FlightOtaSearchV2Request();
        return TeaModel.build(map, self);
    }

    public FlightOtaSearchV2Request setCabinTypeList(java.util.List<Integer> cabinTypeList) {
        this.cabinTypeList = cabinTypeList;
        return this;
    }
    public java.util.List<Integer> getCabinTypeList() {
        return this.cabinTypeList;
    }

    public FlightOtaSearchV2Request setDirectOnly(Boolean directOnly) {
        this.directOnly = directOnly;
        return this;
    }
    public Boolean getDirectOnly() {
        return this.directOnly;
    }

    public FlightOtaSearchV2Request setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightOtaSearchV2Request setNeedShareFlight(Boolean needShareFlight) {
        this.needShareFlight = needShareFlight;
        return this;
    }
    public Boolean getNeedShareFlight() {
        return this.needShareFlight;
    }

    public FlightOtaSearchV2Request setSearchJourneys(java.util.List<FlightOtaSearchV2RequestSearchJourneys> searchJourneys) {
        this.searchJourneys = searchJourneys;
        return this;
    }
    public java.util.List<FlightOtaSearchV2RequestSearchJourneys> getSearchJourneys() {
        return this.searchJourneys;
    }

    public FlightOtaSearchV2Request setSearchMode(Integer searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public Integer getSearchMode() {
        return this.searchMode;
    }

    public FlightOtaSearchV2Request setTripType(Integer tripType) {
        this.tripType = tripType;
        return this;
    }
    public Integer getTripType() {
        return this.tripType;
    }

    public static class FlightOtaSearchV2RequestSearchJourneysSelectedFlights extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("arr_airport_code")
        public String arrAirportCode;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <strong>example:</strong>
         * <p>PKX</p>
         */
        @NameInMap("dep_airport_code")
        public String depAirportCode;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <strong>example:</strong>
         * <p>2023-09-01 07:10:00</p>
         */
        @NameInMap("flight_time")
        public String flightTime;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HO3925</p>
         */
        @NameInMap("market_flight_no")
        public String marketFlightNo;

        /**
         * <strong>example:</strong>
         * <p>CX601</p>
         */
        @NameInMap("operate_flight_no")
        public String operateFlightNo;

        public static FlightOtaSearchV2RequestSearchJourneysSelectedFlights build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchV2RequestSearchJourneysSelectedFlights self = new FlightOtaSearchV2RequestSearchJourneysSelectedFlights();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchV2RequestSearchJourneysSelectedFlights setArrAirportCode(String arrAirportCode) {
            this.arrAirportCode = arrAirportCode;
            return this;
        }
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        public FlightOtaSearchV2RequestSearchJourneysSelectedFlights setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightOtaSearchV2RequestSearchJourneysSelectedFlights setDepAirportCode(String depAirportCode) {
            this.depAirportCode = depAirportCode;
            return this;
        }
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        public FlightOtaSearchV2RequestSearchJourneysSelectedFlights setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightOtaSearchV2RequestSearchJourneysSelectedFlights setFlightTime(String flightTime) {
            this.flightTime = flightTime;
            return this;
        }
        public String getFlightTime() {
            return this.flightTime;
        }

        public FlightOtaSearchV2RequestSearchJourneysSelectedFlights setMarketFlightNo(String marketFlightNo) {
            this.marketFlightNo = marketFlightNo;
            return this;
        }
        public String getMarketFlightNo() {
            return this.marketFlightNo;
        }

        public FlightOtaSearchV2RequestSearchJourneysSelectedFlights setOperateFlightNo(String operateFlightNo) {
            this.operateFlightNo = operateFlightNo;
            return this;
        }
        public String getOperateFlightNo() {
            return this.operateFlightNo;
        }

    }

    public static class FlightOtaSearchV2RequestSearchJourneys extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HGH</p>
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
         * <p>2023-09-01</p>
         */
        @NameInMap("dep_date")
        public String depDate;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("selected_flights")
        public java.util.List<FlightOtaSearchV2RequestSearchJourneysSelectedFlights> selectedFlights;

        public static FlightOtaSearchV2RequestSearchJourneys build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchV2RequestSearchJourneys self = new FlightOtaSearchV2RequestSearchJourneys();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchV2RequestSearchJourneys setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightOtaSearchV2RequestSearchJourneys setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightOtaSearchV2RequestSearchJourneys setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public FlightOtaSearchV2RequestSearchJourneys setSelectedFlights(java.util.List<FlightOtaSearchV2RequestSearchJourneysSelectedFlights> selectedFlights) {
            this.selectedFlights = selectedFlights;
            return this;
        }
        public java.util.List<FlightOtaSearchV2RequestSearchJourneysSelectedFlights> getSelectedFlights() {
            return this.selectedFlights;
        }

    }

}
