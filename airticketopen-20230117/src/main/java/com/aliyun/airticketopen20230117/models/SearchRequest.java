// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class SearchRequest extends TeaModel {
    @NameInMap("adults")
    public Integer adults;

    @NameInMap("air_legs")
    public java.util.List<SearchRequestAirLegs> airLegs;

    @NameInMap("cabin_class")
    public String cabinClass;

    @NameInMap("children")
    public Integer children;

    @NameInMap("infants")
    public Integer infants;

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

    public static class SearchRequestAirLegs extends TeaModel {
        @NameInMap("arrival_airport_list")
        public java.util.List<String> arrivalAirportList;

        @NameInMap("arrival_city")
        public String arrivalCity;

        @NameInMap("departure_airport_list")
        public java.util.List<String> departureAirportList;

        @NameInMap("departure_city")
        public String departureCity;

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

}
