// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOtaSearchRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10023</p>
     */
    @NameInMap("btrip_user_id")
    public String btripUserId;

    @NameInMap("buyer_name")
    public String buyerName;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("cabin_type")
    public Integer cabinType;

    /**
     * <strong>example:</strong>
     * <p>open12igetbis4o07v10B1TlOWcM00</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("search_journeys")
    public java.util.List<IntlFlightOtaSearchRequestSearchJourneys> searchJourneys;

    @NameInMap("search_passenger_list")
    public java.util.List<IntlFlightOtaSearchRequestSearchPassengerList> searchPassengerList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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

    public IntlFlightOtaSearchRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
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

    public IntlFlightOtaSearchRequest setTripType(Integer tripType) {
        this.tripType = tripType;
        return this;
    }
    public Integer getTripType() {
        return this.tripType;
    }

    public static class IntlFlightOtaSearchRequestSearchJourneysSelectedFlights extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("arr_airport_code")
        public String arrAirportCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NNG</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <strong>example:</strong>
         * <p>KOW</p>
         */
        @NameInMap("dep_airport_code")
        public String depAirportCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CTU</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-15 12:00:00</p>
         */
        @NameInMap("flight_time")
        public String flightTime;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>KA5809</p>
         */
        @NameInMap("market_flight_no")
        public String marketFlightNo;

        /**
         * <strong>example:</strong>
         * <p>CX601</p>
         */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZQZ</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-15</p>
         */
        @NameInMap("dep_date")
        public String depDate;

        /**
         * <p>This parameter is required.</p>
         */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>13412341234</p>
         */
        @NameInMap("cert_no")
        public String certNo;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("cert_type")
        public Integer certType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZHANGSAN</p>
         */
        @NameInMap("full_name")
        public String fullName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
