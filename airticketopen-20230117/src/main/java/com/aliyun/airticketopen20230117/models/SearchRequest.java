// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class SearchRequest extends TeaModel {
    /**
     * <p>adult passenger amount 1-9</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("adults")
    public Integer adults;

    /**
     * <p>itinerary list</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("air_legs")
    public java.util.List<SearchRequestAirLegs> airLegs;

    /**
     * <p>cabin class</p>
     * <ol>
     * <li><strong>ALL_CABIN</strong> : all cabin class</li>
     * <li><strong>Y</strong> : economy class</li>
     * <li><strong>FC</strong> : first class and business class</li>
     * <li><strong>S</strong> : premium economy class</li>
     * <li><strong>YS</strong> : economy class and premium economy class</li>
     * <li><strong>YSC</strong> : economy class, premium economy class and business class</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>ALL_CABIN</p>
     */
    @NameInMap("cabin_class")
    public String cabinClass;

    /**
     * <p>child passenger amount 0-9</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("children")
    public Integer children;

    /**
     * <p>infant passenger amount 0-9</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("infants")
    public Integer infants;

    /**
     * <p>search controls</p>
     */
    @NameInMap("search_control_options")
    public SearchRequestSearchControlOptions searchControlOptions;

    public static SearchRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchRequest self = new SearchRequest();
        return TeaModel.build(map, self);
    }

    public SearchRequest setAdults(Integer adults) {
        this.adults = adults;
        return this;
    }
    public Integer getAdults() {
        return this.adults;
    }

    public SearchRequest setAirLegs(java.util.List<SearchRequestAirLegs> airLegs) {
        this.airLegs = airLegs;
        return this;
    }
    public java.util.List<SearchRequestAirLegs> getAirLegs() {
        return this.airLegs;
    }

    public SearchRequest setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
        return this;
    }
    public String getCabinClass() {
        return this.cabinClass;
    }

    public SearchRequest setChildren(Integer children) {
        this.children = children;
        return this;
    }
    public Integer getChildren() {
        return this.children;
    }

    public SearchRequest setInfants(Integer infants) {
        this.infants = infants;
        return this;
    }
    public Integer getInfants() {
        return this.infants;
    }

    public SearchRequest setSearchControlOptions(SearchRequestSearchControlOptions searchControlOptions) {
        this.searchControlOptions = searchControlOptions;
        return this;
    }
    public SearchRequestSearchControlOptions getSearchControlOptions() {
        return this.searchControlOptions;
    }

    public static class SearchRequestAirLegs extends TeaModel {
        /**
         * <p>arrival airport [IATA airport code] list</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_airport_list")
        public java.util.List<String> arrivalAirportList;

        /**
         * <p>arrival city code</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_city")
        public String arrivalCity;

        /**
         * <p>departure airport [IATA airport code] list</p>
         * 
         * <strong>example:</strong>
         * <p>PVG</p>
         */
        @NameInMap("departure_airport_list")
        public java.util.List<String> departureAirportList;

        /**
         * <p>departure city code</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("departure_city")
        public String departureCity;

        /**
         * <p>departure date (eg: yyyyMMdd)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20230310</p>
         */
        @NameInMap("departure_date")
        public String departureDate;

        public static SearchRequestAirLegs build(java.util.Map<String, ?> map) throws Exception {
            SearchRequestAirLegs self = new SearchRequestAirLegs();
            return TeaModel.build(map, self);
        }

        public SearchRequestAirLegs setArrivalAirportList(java.util.List<String> arrivalAirportList) {
            this.arrivalAirportList = arrivalAirportList;
            return this;
        }
        public java.util.List<String> getArrivalAirportList() {
            return this.arrivalAirportList;
        }

        public SearchRequestAirLegs setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        public SearchRequestAirLegs setDepartureAirportList(java.util.List<String> departureAirportList) {
            this.departureAirportList = departureAirportList;
            return this;
        }
        public java.util.List<String> getDepartureAirportList() {
            return this.departureAirportList;
        }

        public SearchRequestAirLegs setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }
        public String getDepartureCity() {
            return this.departureCity;
        }

        public SearchRequestAirLegs setDepartureDate(String departureDate) {
            this.departureDate = departureDate;
            return this;
        }
        public String getDepartureDate() {
            return this.departureDate;
        }

    }

    public static class SearchRequestSearchControlOptions extends TeaModel {
        /**
         * <p>excluded airlines list</p>
         */
        @NameInMap("airline_excluded_list")
        public java.util.List<String> airlineExcludedList;

        /**
         * <p>preferred airlines list</p>
         */
        @NameInMap("airline_prefer_list")
        public java.util.List<String> airlinePreferList;

        public static SearchRequestSearchControlOptions build(java.util.Map<String, ?> map) throws Exception {
            SearchRequestSearchControlOptions self = new SearchRequestSearchControlOptions();
            return TeaModel.build(map, self);
        }

        public SearchRequestSearchControlOptions setAirlineExcludedList(java.util.List<String> airlineExcludedList) {
            this.airlineExcludedList = airlineExcludedList;
            return this;
        }
        public java.util.List<String> getAirlineExcludedList() {
            return this.airlineExcludedList;
        }

        public SearchRequestSearchControlOptions setAirlinePreferList(java.util.List<String> airlinePreferList) {
            this.airlinePreferList = airlinePreferList;
            return this;
        }
        public java.util.List<String> getAirlinePreferList() {
            return this.airlinePreferList;
        }

    }

}
