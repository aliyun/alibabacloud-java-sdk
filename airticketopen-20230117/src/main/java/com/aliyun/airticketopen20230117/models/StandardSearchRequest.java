// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class StandardSearchRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("adults")
    public Integer adults;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("air_legs")
    public java.util.List<StandardSearchRequestAirLegs> airLegs;

    /**
     * <strong>example:</strong>
     * <p>ALL_CABIN</p>
     */
    @NameInMap("cabin_class")
    public String cabinClass;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("children")
    public Integer children;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("infants")
    public Integer infants;

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
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_airport_list")
        public java.util.List<String> arrivalAirportList;

        /**
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_city")
        public String arrivalCity;

        /**
         * <strong>example:</strong>
         * <p>PVG</p>
         */
        @NameInMap("departure_airport_list")
        public java.util.List<String> departureAirportList;

        /**
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("departure_city")
        public String departureCity;

        /**
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
         * <strong>example:</strong>
         * <p>7C</p>
         */
        @NameInMap("airline_excluded_list")
        public java.util.List<String> airlineExcludedList;

        /**
         * <strong>example:</strong>
         * <p>FD</p>
         */
        @NameInMap("airline_prefer_list")
        public java.util.List<String> airlinePreferList;

        /**
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
