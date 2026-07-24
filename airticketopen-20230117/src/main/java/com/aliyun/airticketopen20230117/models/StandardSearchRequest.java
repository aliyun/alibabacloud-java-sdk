// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class StandardSearchRequest extends TeaModel {
    /**
     * <p>Number of adult passengers, range 1-9</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("adults")
    public Integer adults;

    /**
     * <p>Journey array. At least one of departure_city and departure_airport_list must be non-empty; when departure_airport_list has values, they must belong to the same city. At least one of arrival_city and arrival_airport_list must be non-empty; when arrival_airport_list has values, they must belong to the same city.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("air_legs")
    public java.util.List<StandardSearchRequestAirLegs> airLegs;

    /**
     * <p>Defaults to ALL_CABIN if not specified. Cabin class ALL_CABIN: All cabin classes; Y: Economy class; FC: First class and Business class; S: Premium Economy class; YS: Economy class and Premium Economy class; YSC: Economy class, Premium Economy class, and Business class;</p>
     * 
     * <strong>example:</strong>
     * <p>ALL_CABIN</p>
     */
    @NameInMap("cabin_class")
    public String cabinClass;

    /**
     * <p>Number of child passengers, range 0-9</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("children")
    public Integer children;

    /**
     * <p>Number of infant passengers, range 0-9</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("infants")
    public Integer infants;

    /**
     * <p>Search control options, optional</p>
     */
    @NameInMap("search_control_options")
    public StandardSearchRequestSearchControlOptions searchControlOptions;

    public static StandardSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        StandardSearchRequest self = new StandardSearchRequest();
        return TeaModel.build(map, self);
    }

    public StandardSearchRequest setAdults(Integer adults) {
        this.adults = adults;
        return this;
    }
    public Integer getAdults() {
        return this.adults;
    }

    public StandardSearchRequest setAirLegs(java.util.List<StandardSearchRequestAirLegs> airLegs) {
        this.airLegs = airLegs;
        return this;
    }
    public java.util.List<StandardSearchRequestAirLegs> getAirLegs() {
        return this.airLegs;
    }

    public StandardSearchRequest setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
        return this;
    }
    public String getCabinClass() {
        return this.cabinClass;
    }

    public StandardSearchRequest setChildren(Integer children) {
        this.children = children;
        return this;
    }
    public Integer getChildren() {
        return this.children;
    }

    public StandardSearchRequest setInfants(Integer infants) {
        this.infants = infants;
        return this;
    }
    public Integer getInfants() {
        return this.infants;
    }

    public StandardSearchRequest setSearchControlOptions(StandardSearchRequestSearchControlOptions searchControlOptions) {
        this.searchControlOptions = searchControlOptions;
        return this;
    }
    public StandardSearchRequestSearchControlOptions getSearchControlOptions() {
        return this.searchControlOptions;
    }

    public static class StandardSearchRequestAirLegs extends TeaModel {
        /**
         * <p>Arrival airport three-letter code</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_airport_list")
        public java.util.List<String> arrivalAirportList;

        /**
         * <p>Arrival city three-letter code</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_city")
        public String arrivalCity;

        /**
         * <p>Departure airport three-letter code</p>
         * 
         * <strong>example:</strong>
         * <p>PVG</p>
         */
        @NameInMap("departure_airport_list")
        public java.util.List<String> departureAirportList;

        /**
         * <p>Departure city three-letter code</p>
         * 
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("departure_city")
        public String departureCity;

        /**
         * <p>Departure date (e.g.: yyyyMMdd)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20230320</p>
         */
        @NameInMap("departure_date")
        public String departureDate;

        public static StandardSearchRequestAirLegs build(java.util.Map<String, ?> map) throws Exception {
            StandardSearchRequestAirLegs self = new StandardSearchRequestAirLegs();
            return TeaModel.build(map, self);
        }

        public StandardSearchRequestAirLegs setArrivalAirportList(java.util.List<String> arrivalAirportList) {
            this.arrivalAirportList = arrivalAirportList;
            return this;
        }
        public java.util.List<String> getArrivalAirportList() {
            return this.arrivalAirportList;
        }

        public StandardSearchRequestAirLegs setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        public StandardSearchRequestAirLegs setDepartureAirportList(java.util.List<String> departureAirportList) {
            this.departureAirportList = departureAirportList;
            return this;
        }
        public java.util.List<String> getDepartureAirportList() {
            return this.departureAirportList;
        }

        public StandardSearchRequestAirLegs setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }
        public String getDepartureCity() {
            return this.departureCity;
        }

        public StandardSearchRequestAirLegs setDepartureDate(String departureDate) {
            this.departureDate = departureDate;
            return this;
        }
        public String getDepartureDate() {
            return this.departureDate;
        }

    }

    public static class StandardSearchRequestSearchControlOptions extends TeaModel {
        /**
         * <p>Excluded airlines list</p>
         * 
         * <strong>example:</strong>
         * <p>7C</p>
         */
        @NameInMap("airline_excluded_list")
        public java.util.List<String> airlineExcludedList;

        /**
         * <p>Preferred airlines list</p>
         * 
         * <strong>example:</strong>
         * <p>FD</p>
         */
        @NameInMap("airline_prefer_list")
        public java.util.List<String> airlinePreferList;

        /**
         * <p>Ticketing service quality</p>
         * 
         * <strong>example:</strong>
         * <p>A1</p>
         */
        @NameInMap("service_quality")
        public String serviceQuality;

        public static StandardSearchRequestSearchControlOptions build(java.util.Map<String, ?> map) throws Exception {
            StandardSearchRequestSearchControlOptions self = new StandardSearchRequestSearchControlOptions();
            return TeaModel.build(map, self);
        }

        public StandardSearchRequestSearchControlOptions setAirlineExcludedList(java.util.List<String> airlineExcludedList) {
            this.airlineExcludedList = airlineExcludedList;
            return this;
        }
        public java.util.List<String> getAirlineExcludedList() {
            return this.airlineExcludedList;
        }

        public StandardSearchRequestSearchControlOptions setAirlinePreferList(java.util.List<String> airlinePreferList) {
            this.airlinePreferList = airlinePreferList;
            return this;
        }
        public java.util.List<String> getAirlinePreferList() {
            return this.airlinePreferList;
        }

        public StandardSearchRequestSearchControlOptions setServiceQuality(String serviceQuality) {
            this.serviceQuality = serviceQuality;
            return this;
        }
        public String getServiceQuality() {
            return this.serviceQuality;
        }

    }

}
