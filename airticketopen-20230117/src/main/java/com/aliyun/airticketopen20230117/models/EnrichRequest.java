// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class EnrichRequest extends TeaModel {
    /**
     * <p>adult passenger amount 1-9</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("adults")
    public Integer adults;

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
     * <p>journey list</p>
     */
    @NameInMap("journey_param_list")
    public java.util.List<EnrichRequestJourneyParamList> journeyParamList;

    /**
     * <p>solution_id returned by Search</p>
     * 
     * <strong>example:</strong>
     * <p>eJwz8DeySEo0NjQ01TU3TU7TNTFINNO1SE5O0jVKM0hKNjEwTElLNYwz0A32cNT1dfPVNTIwMjYwNjRQ8/A3NLI01Q0Ic0cRBwBVFxJJ</p>
     */
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
        /**
         * <p>arrival airport code (capitalized)</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        /**
         * <p>arrival city code (capitalized)</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_city")
        public String arrivalCity;

        /**
         * <p>RBD</p>
         * 
         * <strong>example:</strong>
         * <p>V</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <p>child RBD</p>
         * 
         * <strong>example:</strong>
         * <p>E</p>
         */
        @NameInMap("child_cabin")
        public String childCabin;

        /**
         * <p>departure airport code (capitalized)</p>
         * 
         * <strong>example:</strong>
         * <p>PVG</p>
         */
        @NameInMap("departure_airport")
        public String departureAirport;

        /**
         * <p>departure city code (capitalized)</p>
         * 
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("departure_city")
        public String departureCity;

        /**
         * <p>departure time in string format (yyyy-MM-dd HH:mm:ss)</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10 07:55:00</p>
         */
        @NameInMap("departure_time")
        public String departureTime;

        /**
         * <p>marketing flight no. (eg: KA5809)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
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
        /**
         * <p>arrival city code (capitalized)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_city")
        public String arrivalCity;

        /**
         * <p>departure city code (capitalized)</p>
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

        /**
         * <p>segement param list</p>
         * <p>This parameter is required.</p>
         */
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
