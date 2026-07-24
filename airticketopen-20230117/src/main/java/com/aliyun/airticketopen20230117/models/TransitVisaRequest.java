// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TransitVisaRequest extends TeaModel {
    /**
     * <p>The list of flight segments that constitute an itinerary. Maximum size: 2.</p>
     */
    @NameInMap("flight_segment_param_list")
    public java.util.List<TransitVisaRequestFlightSegmentParamList> flightSegmentParamList;

    public static TransitVisaRequest build(java.util.Map<String, ?> map) throws Exception {
        TransitVisaRequest self = new TransitVisaRequest();
        return TeaModel.build(map, self);
    }

    public TransitVisaRequest setFlightSegmentParamList(java.util.List<TransitVisaRequestFlightSegmentParamList> flightSegmentParamList) {
        this.flightSegmentParamList = flightSegmentParamList;
        return this;
    }
    public java.util.List<TransitVisaRequestFlightSegmentParamList> getFlightSegmentParamList() {
        return this.flightSegmentParamList;
    }

    public static class TransitVisaRequestFlightSegmentParamList extends TeaModel {
        /**
         * <p>The three-letter IATA code of the arrival airport.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SIN</p>
         */
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        /**
         * <p>The arrival terminal.</p>
         * 
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("arrival_terminal")
        public String arrivalTerminal;

        /**
         * <p>The arrival time. A 13-digit UNIX timestamp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1705285430445</p>
         */
        @NameInMap("arrival_time")
        public Long arrivalTime;

        /**
         * <p>Indicates whether the flight is a codeshare flight.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("code_share")
        public Boolean codeShare;

        /**
         * <p>The three-letter IATA code of the departure airport.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("departure_airport")
        public String departureAirport;

        /**
         * <p>The departure terminal.</p>
         * 
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("departure_terminal")
        public String departureTerminal;

        /**
         * <p>The departure time. A 13-digit UNIX timestamp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1705285430445</p>
         */
        @NameInMap("departure_time")
        public Long departureTime;

        /**
         * <p>The marketing airline.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CZ</p>
         */
        @NameInMap("marketing_airline")
        public String marketingAirline;

        /**
         * <p>The flight number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CZ616</p>
         */
        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

        /**
         * <p>The operating airline.</p>
         * 
         * <strong>example:</strong>
         * <p>CZ</p>
         */
        @NameInMap("operating_airline")
        public String operatingAirline;

        /**
         * <p>The three-letter IATA codes of stopover cities.</p>
         * 
         * <strong>example:</strong>
         * <p>SEL,HKG</p>
         */
        @NameInMap("stop_city_list")
        public String stopCityList;

        /**
         * <p>The ticketing airline.</p>
         * 
         * <strong>example:</strong>
         * <p>CZ</p>
         */
        @NameInMap("ticketing_airline")
        public String ticketingAirline;

        public static TransitVisaRequestFlightSegmentParamList build(java.util.Map<String, ?> map) throws Exception {
            TransitVisaRequestFlightSegmentParamList self = new TransitVisaRequestFlightSegmentParamList();
            return TeaModel.build(map, self);
        }

        public TransitVisaRequestFlightSegmentParamList setArrivalAirport(String arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return this;
        }
        public String getArrivalAirport() {
            return this.arrivalAirport;
        }

        public TransitVisaRequestFlightSegmentParamList setArrivalTerminal(String arrivalTerminal) {
            this.arrivalTerminal = arrivalTerminal;
            return this;
        }
        public String getArrivalTerminal() {
            return this.arrivalTerminal;
        }

        public TransitVisaRequestFlightSegmentParamList setArrivalTime(Long arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }
        public Long getArrivalTime() {
            return this.arrivalTime;
        }

        public TransitVisaRequestFlightSegmentParamList setCodeShare(Boolean codeShare) {
            this.codeShare = codeShare;
            return this;
        }
        public Boolean getCodeShare() {
            return this.codeShare;
        }

        public TransitVisaRequestFlightSegmentParamList setDepartureAirport(String departureAirport) {
            this.departureAirport = departureAirport;
            return this;
        }
        public String getDepartureAirport() {
            return this.departureAirport;
        }

        public TransitVisaRequestFlightSegmentParamList setDepartureTerminal(String departureTerminal) {
            this.departureTerminal = departureTerminal;
            return this;
        }
        public String getDepartureTerminal() {
            return this.departureTerminal;
        }

        public TransitVisaRequestFlightSegmentParamList setDepartureTime(Long departureTime) {
            this.departureTime = departureTime;
            return this;
        }
        public Long getDepartureTime() {
            return this.departureTime;
        }

        public TransitVisaRequestFlightSegmentParamList setMarketingAirline(String marketingAirline) {
            this.marketingAirline = marketingAirline;
            return this;
        }
        public String getMarketingAirline() {
            return this.marketingAirline;
        }

        public TransitVisaRequestFlightSegmentParamList setMarketingFlightNo(String marketingFlightNo) {
            this.marketingFlightNo = marketingFlightNo;
            return this;
        }
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        public TransitVisaRequestFlightSegmentParamList setOperatingAirline(String operatingAirline) {
            this.operatingAirline = operatingAirline;
            return this;
        }
        public String getOperatingAirline() {
            return this.operatingAirline;
        }

        public TransitVisaRequestFlightSegmentParamList setStopCityList(String stopCityList) {
            this.stopCityList = stopCityList;
            return this;
        }
        public String getStopCityList() {
            return this.stopCityList;
        }

        public TransitVisaRequestFlightSegmentParamList setTicketingAirline(String ticketingAirline) {
            this.ticketingAirline = ticketingAirline;
            return this;
        }
        public String getTicketingAirline() {
            return this.ticketingAirline;
        }

    }

}
