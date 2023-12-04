// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOtaSearchRequest extends TeaModel {
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

    @NameInMap("search_journeys")
    public java.util.List<IntlFlightOtaSearchRequestSearchJourneys> searchJourneys;

    @NameInMap("search_passenger_list")
    public java.util.List<IntlFlightOtaSearchRequestSearchPassengerList> searchPassengerList;

    @NameInMap("supplier_code")
    public String supplierCode;

    @NameInMap("trip_type")
    public Integer tripType;

    public static IntlFlightOtaSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightOtaSearchRequest self = new IntlFlightOtaSearchRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightOtaSearchRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public IntlFlightOtaSearchRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public IntlFlightOtaSearchRequest setCabinType(Integer cabinType) {
        this.cabinType = cabinType;
        return this;
    }
    public Integer getCabinType() {
        return this.cabinType;
    }

    public IntlFlightOtaSearchRequest setDirectOnly(Boolean directOnly) {
        this.directOnly = directOnly;
        return this;
    }
    public Boolean getDirectOnly() {
        return this.directOnly;
    }

    public IntlFlightOtaSearchRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public IntlFlightOtaSearchRequest setNeedShareFlight(Boolean needShareFlight) {
        this.needShareFlight = needShareFlight;
        return this;
    }
    public Boolean getNeedShareFlight() {
        return this.needShareFlight;
    }

    public IntlFlightOtaSearchRequest setSearchJourneys(java.util.List<IntlFlightOtaSearchRequestSearchJourneys> searchJourneys) {
        this.searchJourneys = searchJourneys;
        return this;
    }
    public java.util.List<IntlFlightOtaSearchRequestSearchJourneys> getSearchJourneys() {
        return this.searchJourneys;
    }

    public IntlFlightOtaSearchRequest setSearchPassengerList(java.util.List<IntlFlightOtaSearchRequestSearchPassengerList> searchPassengerList) {
        this.searchPassengerList = searchPassengerList;
        return this;
    }
    public java.util.List<IntlFlightOtaSearchRequestSearchPassengerList> getSearchPassengerList() {
        return this.searchPassengerList;
    }

    public IntlFlightOtaSearchRequest setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
        return this;
    }
    public String getSupplierCode() {
        return this.supplierCode;
    }

    public IntlFlightOtaSearchRequest setTripType(Integer tripType) {
        this.tripType = tripType;
        return this;
    }
    public Integer getTripType() {
        return this.tripType;
    }

    public static class IntlFlightOtaSearchRequestSearchJourneysSelectedFlights extends TeaModel {
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

        public static IntlFlightOtaSearchRequestSearchJourneysSelectedFlights build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOtaSearchRequestSearchJourneysSelectedFlights self = new IntlFlightOtaSearchRequestSearchJourneysSelectedFlights();
            return TeaModel.build(map, self);
        }

        public IntlFlightOtaSearchRequestSearchJourneysSelectedFlights setArrAirportCode(String arrAirportCode) {
            this.arrAirportCode = arrAirportCode;
            return this;
        }
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        public IntlFlightOtaSearchRequestSearchJourneysSelectedFlights setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightOtaSearchRequestSearchJourneysSelectedFlights setCabinType(Integer cabinType) {
            this.cabinType = cabinType;
            return this;
        }
        public Integer getCabinType() {
            return this.cabinType;
        }

        public IntlFlightOtaSearchRequestSearchJourneysSelectedFlights setDepAirportCode(String depAirportCode) {
            this.depAirportCode = depAirportCode;
            return this;
        }
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        public IntlFlightOtaSearchRequestSearchJourneysSelectedFlights setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightOtaSearchRequestSearchJourneysSelectedFlights setFlightTime(String flightTime) {
            this.flightTime = flightTime;
            return this;
        }
        public String getFlightTime() {
            return this.flightTime;
        }

        public IntlFlightOtaSearchRequestSearchJourneysSelectedFlights setMarketFlightNo(String marketFlightNo) {
            this.marketFlightNo = marketFlightNo;
            return this;
        }
        public String getMarketFlightNo() {
            return this.marketFlightNo;
        }

        public IntlFlightOtaSearchRequestSearchJourneysSelectedFlights setOperateFlightNo(String operateFlightNo) {
            this.operateFlightNo = operateFlightNo;
            return this;
        }
        public String getOperateFlightNo() {
            return this.operateFlightNo;
        }

    }

    public static class IntlFlightOtaSearchRequestSearchJourneys extends TeaModel {
        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_date")
        public String depDate;

        @NameInMap("selected_flights")
        public java.util.List<IntlFlightOtaSearchRequestSearchJourneysSelectedFlights> selectedFlights;

        public static IntlFlightOtaSearchRequestSearchJourneys build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOtaSearchRequestSearchJourneys self = new IntlFlightOtaSearchRequestSearchJourneys();
            return TeaModel.build(map, self);
        }

        public IntlFlightOtaSearchRequestSearchJourneys setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightOtaSearchRequestSearchJourneys setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightOtaSearchRequestSearchJourneys setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public IntlFlightOtaSearchRequestSearchJourneys setSelectedFlights(java.util.List<IntlFlightOtaSearchRequestSearchJourneysSelectedFlights> selectedFlights) {
            this.selectedFlights = selectedFlights;
            return this;
        }
        public java.util.List<IntlFlightOtaSearchRequestSearchJourneysSelectedFlights> getSelectedFlights() {
            return this.selectedFlights;
        }

    }

    public static class IntlFlightOtaSearchRequestSearchPassengerList extends TeaModel {
        @NameInMap("cert_no")
        public String certNo;

        @NameInMap("cert_type")
        public Integer certType;

        @NameInMap("full_name")
        public String fullName;

        @NameInMap("type")
        public Integer type;

        public static IntlFlightOtaSearchRequestSearchPassengerList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOtaSearchRequestSearchPassengerList self = new IntlFlightOtaSearchRequestSearchPassengerList();
            return TeaModel.build(map, self);
        }

        public IntlFlightOtaSearchRequestSearchPassengerList setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public IntlFlightOtaSearchRequestSearchPassengerList setCertType(Integer certType) {
            this.certType = certType;
            return this;
        }
        public Integer getCertType() {
            return this.certType;
        }

        public IntlFlightOtaSearchRequestSearchPassengerList setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public IntlFlightOtaSearchRequestSearchPassengerList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
