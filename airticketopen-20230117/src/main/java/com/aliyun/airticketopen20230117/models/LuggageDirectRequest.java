// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class LuggageDirectRequest extends TeaModel {
    /**
     * <p>The list of flight segments that constitute an itinerary. Maximum size: 2.</p>
     */
    @NameInMap("flight_segment_param_list")
    public java.util.List<LuggageDirectRequestFlightSegmentParamList> flightSegmentParamList;

    public static LuggageDirectRequest build(java.util.Map<String, ?> map) throws Exception {
        LuggageDirectRequest self = new LuggageDirectRequest();
        return TeaModel.build(map, self);
    }

    public LuggageDirectRequest setFlightSegmentParamList(java.util.List<LuggageDirectRequestFlightSegmentParamList> flightSegmentParamList) {
        this.flightSegmentParamList = flightSegmentParamList;
        return this;
    }
    public java.util.List<LuggageDirectRequestFlightSegmentParamList> getFlightSegmentParamList() {
        return this.flightSegmentParamList;
    }

    public static class LuggageDirectRequestFlightSegmentParamList extends TeaModel {
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

        public static LuggageDirectRequestFlightSegmentParamList build(java.util.Map<String, ?> map) throws Exception {
            LuggageDirectRequestFlightSegmentParamList self = new LuggageDirectRequestFlightSegmentParamList();
            return TeaModel.build(map, self);
        }

        public LuggageDirectRequestFlightSegmentParamList setArrivalAirport(String arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return this;
        }
        public String getArrivalAirport() {
            return this.arrivalAirport;
        }

        public LuggageDirectRequestFlightSegmentParamList setArrivalTerminal(String arrivalTerminal) {
            this.arrivalTerminal = arrivalTerminal;
            return this;
        }
        public String getArrivalTerminal() {
            return this.arrivalTerminal;
        }

        public LuggageDirectRequestFlightSegmentParamList setArrivalTime(Long arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }
        public Long getArrivalTime() {
            return this.arrivalTime;
        }

        public LuggageDirectRequestFlightSegmentParamList setCodeShare(Boolean codeShare) {
            this.codeShare = codeShare;
            return this;
        }
        public Boolean getCodeShare() {
            return this.codeShare;
        }

        public LuggageDirectRequestFlightSegmentParamList setDepartureAirport(String departureAirport) {
            this.departureAirport = departureAirport;
            return this;
        }
        public String getDepartureAirport() {
            return this.departureAirport;
        }

        public LuggageDirectRequestFlightSegmentParamList setDepartureTerminal(String departureTerminal) {
            this.departureTerminal = departureTerminal;
            return this;
        }
        public String getDepartureTerminal() {
            return this.departureTerminal;
        }

        public LuggageDirectRequestFlightSegmentParamList setDepartureTime(Long departureTime) {
            this.departureTime = departureTime;
            return this;
        }
        public Long getDepartureTime() {
            return this.departureTime;
        }

        public LuggageDirectRequestFlightSegmentParamList setMarketingAirline(String marketingAirline) {
            this.marketingAirline = marketingAirline;
            return this;
        }
        public String getMarketingAirline() {
            return this.marketingAirline;
        }

        public LuggageDirectRequestFlightSegmentParamList setMarketingFlightNo(String marketingFlightNo) {
            this.marketingFlightNo = marketingFlightNo;
            return this;
        }
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        public LuggageDirectRequestFlightSegmentParamList setOperatingAirline(String operatingAirline) {
            this.operatingAirline = operatingAirline;
            return this;
        }
        public String getOperatingAirline() {
            return this.operatingAirline;
        }

        public LuggageDirectRequestFlightSegmentParamList setStopCityList(String stopCityList) {
            this.stopCityList = stopCityList;
            return this;
        }
        public String getStopCityList() {
            return this.stopCityList;
        }

        public LuggageDirectRequestFlightSegmentParamList setTicketingAirline(String ticketingAirline) {
            this.ticketingAirline = ticketingAirline;
            return this;
        }
        public String getTicketingAirline() {
            return this.ticketingAirline;
        }

    }

}
