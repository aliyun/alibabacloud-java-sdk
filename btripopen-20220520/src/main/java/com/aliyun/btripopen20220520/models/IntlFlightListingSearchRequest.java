// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightListingSearchRequest extends TeaModel {
    @NameInMap("btrip_user_id")
    public String btripUserId;

    @NameInMap("buyer_name")
    public String buyerName;

    @NameInMap("cabin_type")
    public Integer cabinType;

    @NameInMap("direct_only")
    public Boolean directOnly;

    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("need_share_flight")
    public Boolean needShareFlight;

    @NameInMap("out_wheel_search")
    public Boolean outWheelSearch;

    @NameInMap("query_record_id")
    public String queryRecordId;

    @NameInMap("search_journeys")
    public java.util.List<IntlFlightListingSearchRequestSearchJourneys> searchJourneys;

    @NameInMap("search_mode")
    public Integer searchMode;

    @NameInMap("search_passenger_list")
    public java.util.List<IntlFlightListingSearchRequestSearchPassengerList> searchPassengerList;

    @NameInMap("supplier_code")
    public String supplierCode;

    @NameInMap("token")
    public String token;

    @NameInMap("trip_type")
    public Integer tripType;

    public static IntlFlightListingSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightListingSearchRequest self = new IntlFlightListingSearchRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightListingSearchRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public IntlFlightListingSearchRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public IntlFlightListingSearchRequest setCabinType(Integer cabinType) {
        this.cabinType = cabinType;
        return this;
    }
    public Integer getCabinType() {
        return this.cabinType;
    }

    public IntlFlightListingSearchRequest setDirectOnly(Boolean directOnly) {
        this.directOnly = directOnly;
        return this;
    }
    public Boolean getDirectOnly() {
        return this.directOnly;
    }

    public IntlFlightListingSearchRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public IntlFlightListingSearchRequest setNeedShareFlight(Boolean needShareFlight) {
        this.needShareFlight = needShareFlight;
        return this;
    }
    public Boolean getNeedShareFlight() {
        return this.needShareFlight;
    }

    public IntlFlightListingSearchRequest setOutWheelSearch(Boolean outWheelSearch) {
        this.outWheelSearch = outWheelSearch;
        return this;
    }
    public Boolean getOutWheelSearch() {
        return this.outWheelSearch;
    }

    public IntlFlightListingSearchRequest setQueryRecordId(String queryRecordId) {
        this.queryRecordId = queryRecordId;
        return this;
    }
    public String getQueryRecordId() {
        return this.queryRecordId;
    }

    public IntlFlightListingSearchRequest setSearchJourneys(java.util.List<IntlFlightListingSearchRequestSearchJourneys> searchJourneys) {
        this.searchJourneys = searchJourneys;
        return this;
    }
    public java.util.List<IntlFlightListingSearchRequestSearchJourneys> getSearchJourneys() {
        return this.searchJourneys;
    }

    public IntlFlightListingSearchRequest setSearchMode(Integer searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public Integer getSearchMode() {
        return this.searchMode;
    }

    public IntlFlightListingSearchRequest setSearchPassengerList(java.util.List<IntlFlightListingSearchRequestSearchPassengerList> searchPassengerList) {
        this.searchPassengerList = searchPassengerList;
        return this;
    }
    public java.util.List<IntlFlightListingSearchRequestSearchPassengerList> getSearchPassengerList() {
        return this.searchPassengerList;
    }

    public IntlFlightListingSearchRequest setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
        return this;
    }
    public String getSupplierCode() {
        return this.supplierCode;
    }

    public IntlFlightListingSearchRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public IntlFlightListingSearchRequest setTripType(Integer tripType) {
        this.tripType = tripType;
        return this;
    }
    public Integer getTripType() {
        return this.tripType;
    }

    public static class IntlFlightListingSearchRequestSearchJourneysSelectedFlights extends TeaModel {
        @NameInMap("arr_airport_code")
        public String arrAirportCode;

        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("cabin_type")
        public Integer cabinType;

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

        public static IntlFlightListingSearchRequestSearchJourneysSelectedFlights build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightListingSearchRequestSearchJourneysSelectedFlights self = new IntlFlightListingSearchRequestSearchJourneysSelectedFlights();
            return TeaModel.build(map, self);
        }

        public IntlFlightListingSearchRequestSearchJourneysSelectedFlights setArrAirportCode(String arrAirportCode) {
            this.arrAirportCode = arrAirportCode;
            return this;
        }
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        public IntlFlightListingSearchRequestSearchJourneysSelectedFlights setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightListingSearchRequestSearchJourneysSelectedFlights setCabinType(Integer cabinType) {
            this.cabinType = cabinType;
            return this;
        }
        public Integer getCabinType() {
            return this.cabinType;
        }

        public IntlFlightListingSearchRequestSearchJourneysSelectedFlights setDepAirportCode(String depAirportCode) {
            this.depAirportCode = depAirportCode;
            return this;
        }
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        public IntlFlightListingSearchRequestSearchJourneysSelectedFlights setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightListingSearchRequestSearchJourneysSelectedFlights setFlightTime(String flightTime) {
            this.flightTime = flightTime;
            return this;
        }
        public String getFlightTime() {
            return this.flightTime;
        }

        public IntlFlightListingSearchRequestSearchJourneysSelectedFlights setMarketFlightNo(String marketFlightNo) {
            this.marketFlightNo = marketFlightNo;
            return this;
        }
        public String getMarketFlightNo() {
            return this.marketFlightNo;
        }

        public IntlFlightListingSearchRequestSearchJourneysSelectedFlights setOperateFlightNo(String operateFlightNo) {
            this.operateFlightNo = operateFlightNo;
            return this;
        }
        public String getOperateFlightNo() {
            return this.operateFlightNo;
        }

    }

    public static class IntlFlightListingSearchRequestSearchJourneys extends TeaModel {
        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_date")
        public String depDate;

        @NameInMap("selected_flights")
        public java.util.List<IntlFlightListingSearchRequestSearchJourneysSelectedFlights> selectedFlights;

        public static IntlFlightListingSearchRequestSearchJourneys build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightListingSearchRequestSearchJourneys self = new IntlFlightListingSearchRequestSearchJourneys();
            return TeaModel.build(map, self);
        }

        public IntlFlightListingSearchRequestSearchJourneys setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightListingSearchRequestSearchJourneys setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightListingSearchRequestSearchJourneys setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public IntlFlightListingSearchRequestSearchJourneys setSelectedFlights(java.util.List<IntlFlightListingSearchRequestSearchJourneysSelectedFlights> selectedFlights) {
            this.selectedFlights = selectedFlights;
            return this;
        }
        public java.util.List<IntlFlightListingSearchRequestSearchJourneysSelectedFlights> getSelectedFlights() {
            return this.selectedFlights;
        }

    }

    public static class IntlFlightListingSearchRequestSearchPassengerList extends TeaModel {
        @NameInMap("cert_no")
        public String certNo;

        @NameInMap("cert_type")
        public Integer certType;

        @NameInMap("full_name")
        public String fullName;

        @NameInMap("type")
        public Integer type;

        public static IntlFlightListingSearchRequestSearchPassengerList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightListingSearchRequestSearchPassengerList self = new IntlFlightListingSearchRequestSearchPassengerList();
            return TeaModel.build(map, self);
        }

        public IntlFlightListingSearchRequestSearchPassengerList setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public IntlFlightListingSearchRequestSearchPassengerList setCertType(Integer certType) {
            this.certType = certType;
            return this;
        }
        public Integer getCertType() {
            return this.certType;
        }

        public IntlFlightListingSearchRequestSearchPassengerList setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public IntlFlightListingSearchRequestSearchPassengerList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
