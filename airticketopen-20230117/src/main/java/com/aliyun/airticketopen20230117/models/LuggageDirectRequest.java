// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class LuggageDirectRequest extends TeaModel {
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
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        @NameInMap("arrival_terminal")
        public String arrivalTerminal;

        @NameInMap("arrival_time")
        public Long arrivalTime;

        @NameInMap("code_share")
        public Boolean codeShare;

        @NameInMap("departure_airport")
        public String departureAirport;

        @NameInMap("departure_terminal")
        public String departureTerminal;

        @NameInMap("departure_time")
        public Long departureTime;

        @NameInMap("marketing_airline")
        public String marketingAirline;

        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

        @NameInMap("operating_airline")
        public String operatingAirline;

        @NameInMap("stop_city_list")
        public String stopCityList;

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
