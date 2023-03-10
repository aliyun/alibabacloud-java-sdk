// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class EnrichRequest extends TeaModel {
    @NameInMap("adults")
    public Integer adults;

    @NameInMap("cabin_class")
    public String cabinClass;

    @NameInMap("children")
    public Integer children;

    @NameInMap("infants")
    public Integer infants;

    @NameInMap("journey_param_list")
    public java.util.List<EnrichRequestJourneyParamList> journeyParamList;

    @NameInMap("solution_id")
    public String solutionId;

    public static EnrichRequest build(java.util.Map<String, ?> map) throws Exception {
        EnrichRequest self = new EnrichRequest();
        return TeaModel.build(map, self);
    }

    public EnrichRequest setAdults(Integer adults) {
        this.adults = adults;
        return this;
    }
    public Integer getAdults() {
        return this.adults;
    }

    public EnrichRequest setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
        return this;
    }
    public String getCabinClass() {
        return this.cabinClass;
    }

    public EnrichRequest setChildren(Integer children) {
        this.children = children;
        return this;
    }
    public Integer getChildren() {
        return this.children;
    }

    public EnrichRequest setInfants(Integer infants) {
        this.infants = infants;
        return this;
    }
    public Integer getInfants() {
        return this.infants;
    }

    public EnrichRequest setJourneyParamList(java.util.List<EnrichRequestJourneyParamList> journeyParamList) {
        this.journeyParamList = journeyParamList;
        return this;
    }
    public java.util.List<EnrichRequestJourneyParamList> getJourneyParamList() {
        return this.journeyParamList;
    }

    public EnrichRequest setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

    public static class EnrichRequestJourneyParamListSegmentParamList extends TeaModel {
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        @NameInMap("arrival_city")
        public String arrivalCity;

        @NameInMap("cabin")
        public String cabin;

        @NameInMap("child_cabin")
        public String childCabin;

        @NameInMap("departure_airport")
        public String departureAirport;

        @NameInMap("departure_city")
        public String departureCity;

        @NameInMap("departure_time")
        public String departureTime;

        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

        public static EnrichRequestJourneyParamListSegmentParamList build(java.util.Map<String, ?> map) throws Exception {
            EnrichRequestJourneyParamListSegmentParamList self = new EnrichRequestJourneyParamListSegmentParamList();
            return TeaModel.build(map, self);
        }

        public EnrichRequestJourneyParamListSegmentParamList setArrivalAirport(String arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return this;
        }
        public String getArrivalAirport() {
            return this.arrivalAirport;
        }

        public EnrichRequestJourneyParamListSegmentParamList setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        public EnrichRequestJourneyParamListSegmentParamList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public EnrichRequestJourneyParamListSegmentParamList setChildCabin(String childCabin) {
            this.childCabin = childCabin;
            return this;
        }
        public String getChildCabin() {
            return this.childCabin;
        }

        public EnrichRequestJourneyParamListSegmentParamList setDepartureAirport(String departureAirport) {
            this.departureAirport = departureAirport;
            return this;
        }
        public String getDepartureAirport() {
            return this.departureAirport;
        }

        public EnrichRequestJourneyParamListSegmentParamList setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }
        public String getDepartureCity() {
            return this.departureCity;
        }

        public EnrichRequestJourneyParamListSegmentParamList setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
            return this;
        }
        public String getDepartureTime() {
            return this.departureTime;
        }

        public EnrichRequestJourneyParamListSegmentParamList setMarketingFlightNo(String marketingFlightNo) {
            this.marketingFlightNo = marketingFlightNo;
            return this;
        }
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

    }

    public static class EnrichRequestJourneyParamList extends TeaModel {
        @NameInMap("arrival_city")
        public String arrivalCity;

        @NameInMap("departure_city")
        public String departureCity;

        @NameInMap("departure_date")
        public String departureDate;

        @NameInMap("segment_param_list")
        public java.util.List<EnrichRequestJourneyParamListSegmentParamList> segmentParamList;

        public static EnrichRequestJourneyParamList build(java.util.Map<String, ?> map) throws Exception {
            EnrichRequestJourneyParamList self = new EnrichRequestJourneyParamList();
            return TeaModel.build(map, self);
        }

        public EnrichRequestJourneyParamList setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        public EnrichRequestJourneyParamList setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }
        public String getDepartureCity() {
            return this.departureCity;
        }

        public EnrichRequestJourneyParamList setDepartureDate(String departureDate) {
            this.departureDate = departureDate;
            return this;
        }
        public String getDepartureDate() {
            return this.departureDate;
        }

        public EnrichRequestJourneyParamList setSegmentParamList(java.util.List<EnrichRequestJourneyParamListSegmentParamList> segmentParamList) {
            this.segmentParamList = segmentParamList;
            return this;
        }
        public java.util.List<EnrichRequestJourneyParamListSegmentParamList> getSegmentParamList() {
            return this.segmentParamList;
        }

    }

}
