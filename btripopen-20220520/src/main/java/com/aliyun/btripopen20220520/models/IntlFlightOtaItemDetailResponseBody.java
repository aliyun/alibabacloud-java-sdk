// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOtaItemDetailResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public IntlFlightOtaItemDetailResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static IntlFlightOtaItemDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightOtaItemDetailResponseBody self = new IntlFlightOtaItemDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public IntlFlightOtaItemDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IntlFlightOtaItemDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IntlFlightOtaItemDetailResponseBody setModule(IntlFlightOtaItemDetailResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IntlFlightOtaItemDetailResponseBodyModule getModule() {
        return this.module;
    }

    public IntlFlightOtaItemDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IntlFlightOtaItemDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IntlFlightOtaItemDetailResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo extends TeaModel {
        @NameInMap("airline_chinese_name")
        public String airlineChineseName;

        @NameInMap("airline_chinese_short_name")
        public String airlineChineseShortName;

        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_icon")
        public String airlineIcon;

        @NameInMap("cheap_flight")
        public Boolean cheapFlight;

        public static IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo self = new IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo setAirlineChineseName(String airlineChineseName) {
            this.airlineChineseName = airlineChineseName;
            return this;
        }
        public String getAirlineChineseName() {
            return this.airlineChineseName;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo setAirlineChineseShortName(String airlineChineseShortName) {
            this.airlineChineseShortName = airlineChineseShortName;
            return this;
        }
        public String getAirlineChineseShortName() {
            return this.airlineChineseShortName;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo setAirlineIcon(String airlineIcon) {
            this.airlineIcon = airlineIcon;
            return this;
        }
        public String getAirlineIcon() {
            return this.airlineIcon;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo setCheapFlight(Boolean cheapFlight) {
            this.cheapFlight = cheapFlight;
            return this;
        }
        public Boolean getCheapFlight() {
            return this.cheapFlight;
        }

    }

    public static class IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosArrAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("airport_short_name")
        public String airportShortName;

        @NameInMap("terminal")
        public String terminal;

        public static IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosArrAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosArrAirportInfo self = new IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosArrAirportInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosArrAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosArrAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosArrAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosArrAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosDepAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("airport_short_name")
        public String airportShortName;

        @NameInMap("terminal")
        public String terminal;

        public static IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosDepAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosDepAirportInfo self = new IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosDepAirportInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosDepAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosDepAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosDepAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosDepAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo extends TeaModel {
        @NameInMap("airline_chinese_name")
        public String airlineChineseName;

        @NameInMap("airline_chinese_short_name")
        public String airlineChineseShortName;

        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_icon")
        public String airlineIcon;

        @NameInMap("cheap_flight")
        public Boolean cheapFlight;

        public static IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo self = new IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setAirlineChineseName(String airlineChineseName) {
            this.airlineChineseName = airlineChineseName;
            return this;
        }
        public String getAirlineChineseName() {
            return this.airlineChineseName;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setAirlineChineseShortName(String airlineChineseShortName) {
            this.airlineChineseShortName = airlineChineseShortName;
            return this;
        }
        public String getAirlineChineseShortName() {
            return this.airlineChineseShortName;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setAirlineIcon(String airlineIcon) {
            this.airlineIcon = airlineIcon;
            return this;
        }
        public String getAirlineIcon() {
            return this.airlineIcon;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setCheapFlight(Boolean cheapFlight) {
            this.cheapFlight = cheapFlight;
            return this;
        }
        public Boolean getCheapFlight() {
            return this.cheapFlight;
        }

    }

    public static class IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfo extends TeaModel {
        @NameInMap("operating_airline_info")
        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo operatingAirlineInfo;

        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        public static IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfo self = new IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfo setOperatingAirlineInfo(IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo operatingAirlineInfo) {
            this.operatingAirlineInfo = operatingAirlineInfo;
            return this;
        }
        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo getOperatingAirlineInfo() {
            return this.operatingAirlineInfo;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfo setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

    }

    public static class IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfo extends TeaModel {
        @NameInMap("stop_airport")
        public String stopAirport;

        @NameInMap("stop_airport_name")
        public String stopAirportName;

        @NameInMap("stop_arr_term")
        public String stopArrTerm;

        @NameInMap("stop_arr_time")
        public String stopArrTime;

        @NameInMap("stop_city_code")
        public String stopCityCode;

        @NameInMap("stop_city_name")
        public String stopCityName;

        @NameInMap("stop_city_names")
        public java.util.List<String> stopCityNames;

        @NameInMap("stop_dep_term")
        public String stopDepTerm;

        @NameInMap("stop_dep_time")
        public String stopDepTime;

        @NameInMap("stop_time")
        public String stopTime;

        public static IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfo self = new IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopAirport(String stopAirport) {
            this.stopAirport = stopAirport;
            return this;
        }
        public String getStopAirport() {
            return this.stopAirport;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopAirportName(String stopAirportName) {
            this.stopAirportName = stopAirportName;
            return this;
        }
        public String getStopAirportName() {
            return this.stopAirportName;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopArrTerm(String stopArrTerm) {
            this.stopArrTerm = stopArrTerm;
            return this;
        }
        public String getStopArrTerm() {
            return this.stopArrTerm;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopCityCode(String stopCityCode) {
            this.stopCityCode = stopCityCode;
            return this;
        }
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopCityName(String stopCityName) {
            this.stopCityName = stopCityName;
            return this;
        }
        public String getStopCityName() {
            return this.stopCityName;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopCityNames(java.util.List<String> stopCityNames) {
            this.stopCityNames = stopCityNames;
            return this;
        }
        public java.util.List<String> getStopCityNames() {
            return this.stopCityNames;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopDepTerm(String stopDepTerm) {
            this.stopDepTerm = stopDepTerm;
            return this;
        }
        public String getStopDepTerm() {
            return this.stopDepTerm;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

    }

    public static class IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo extends TeaModel {
        @NameInMap("dep_city_luggage_direct")
        public Integer depCityLuggageDirect;

        @NameInMap("stop_city_luggage_direct")
        public Integer stopCityLuggageDirect;

        public static IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo self = new IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo setDepCityLuggageDirect(Integer depCityLuggageDirect) {
            this.depCityLuggageDirect = depCityLuggageDirect;
            return this;
        }
        public Integer getDepCityLuggageDirect() {
            return this.depCityLuggageDirect;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo setStopCityLuggageDirect(Integer stopCityLuggageDirect) {
            this.stopCityLuggageDirect = stopCityLuggageDirect;
            return this;
        }
        public Integer getStopCityLuggageDirect() {
            return this.stopCityLuggageDirect;
        }

    }

    public static class IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark extends TeaModel {
        @NameInMap("dep_city_visa_remark")
        public String depCityVisaRemark;

        @NameInMap("dep_city_visa_type")
        public Integer depCityVisaType;

        @NameInMap("stop_city_visa_remarks")
        public java.util.List<String> stopCityVisaRemarks;

        @NameInMap("stop_city_visa_types")
        public java.util.List<Integer> stopCityVisaTypes;

        public static IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark self = new IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark();
            return TeaModel.build(map, self);
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark setDepCityVisaRemark(String depCityVisaRemark) {
            this.depCityVisaRemark = depCityVisaRemark;
            return this;
        }
        public String getDepCityVisaRemark() {
            return this.depCityVisaRemark;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark setDepCityVisaType(Integer depCityVisaType) {
            this.depCityVisaType = depCityVisaType;
            return this;
        }
        public Integer getDepCityVisaType() {
            return this.depCityVisaType;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark setStopCityVisaRemarks(java.util.List<String> stopCityVisaRemarks) {
            this.stopCityVisaRemarks = stopCityVisaRemarks;
            return this;
        }
        public java.util.List<String> getStopCityVisaRemarks() {
            return this.stopCityVisaRemarks;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark setStopCityVisaTypes(java.util.List<Integer> stopCityVisaTypes) {
            this.stopCityVisaTypes = stopCityVisaTypes;
            return this;
        }
        public java.util.List<Integer> getStopCityVisaTypes() {
            return this.stopCityVisaTypes;
        }

    }

    public static class IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos extends TeaModel {
        @NameInMap("airline_info")
        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo airlineInfo;

        @NameInMap("arr_airport_info")
        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosArrAirportInfo arrAirportInfo;

        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_city_name")
        public String arrCityName;

        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("baggage_desc")
        public String baggageDesc;

        @NameInMap("dep_airport_info")
        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosDepAirportInfo depAirportInfo;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_city_name")
        public String depCityName;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("duration")
        public Integer duration;

        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("flight_share_info")
        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfo flightShareInfo;

        @NameInMap("flight_size")
        public String flightSize;

        @NameInMap("flight_stop_info")
        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfo flightStopInfo;

        @NameInMap("flight_type")
        public String flightType;

        @NameInMap("luggage_direct_info")
        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo luggageDirectInfo;

        @NameInMap("manufacturer")
        public String manufacturer;

        @NameInMap("meal_desc")
        public String mealDesc;

        @NameInMap("on_time_rate")
        public String onTimeRate;

        @NameInMap("one_more")
        public Integer oneMore;

        @NameInMap("one_more_show")
        public String oneMoreShow;

        @NameInMap("segment_index")
        public Integer segmentIndex;

        @NameInMap("segment_key")
        public String segmentKey;

        @NameInMap("segment_visa_remark")
        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark segmentVisaRemark;

        @NameInMap("share")
        public Boolean share;

        @NameInMap("short_flight_size")
        public String shortFlightSize;

        @NameInMap("stop")
        public Boolean stop;

        @NameInMap("total_time")
        public String totalTime;

        @NameInMap("transfer_time")
        public String transferTime;

        @NameInMap("transfer_time_number")
        public Integer transferTimeNumber;

        public static IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos self = new IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos();
            return TeaModel.build(map, self);
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setAirlineInfo(IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo airlineInfo) {
            this.airlineInfo = airlineInfo;
            return this;
        }
        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setArrAirportInfo(IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosArrAirportInfo arrAirportInfo) {
            this.arrAirportInfo = arrAirportInfo;
            return this;
        }
        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setBaggageDesc(String baggageDesc) {
            this.baggageDesc = baggageDesc;
            return this;
        }
        public String getBaggageDesc() {
            return this.baggageDesc;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setDepAirportInfo(IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosDepAirportInfo depAirportInfo) {
            this.depAirportInfo = depAirportInfo;
            return this;
        }
        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosDepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setFlightShareInfo(IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfo flightShareInfo) {
            this.flightShareInfo = flightShareInfo;
            return this;
        }
        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfo getFlightShareInfo() {
            return this.flightShareInfo;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setFlightSize(String flightSize) {
            this.flightSize = flightSize;
            return this;
        }
        public String getFlightSize() {
            return this.flightSize;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setFlightStopInfo(IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfo flightStopInfo) {
            this.flightStopInfo = flightStopInfo;
            return this;
        }
        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfo getFlightStopInfo() {
            return this.flightStopInfo;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setFlightType(String flightType) {
            this.flightType = flightType;
            return this;
        }
        public String getFlightType() {
            return this.flightType;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setLuggageDirectInfo(IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo luggageDirectInfo) {
            this.luggageDirectInfo = luggageDirectInfo;
            return this;
        }
        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo getLuggageDirectInfo() {
            return this.luggageDirectInfo;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setMealDesc(String mealDesc) {
            this.mealDesc = mealDesc;
            return this;
        }
        public String getMealDesc() {
            return this.mealDesc;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setOnTimeRate(String onTimeRate) {
            this.onTimeRate = onTimeRate;
            return this;
        }
        public String getOnTimeRate() {
            return this.onTimeRate;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setOneMore(Integer oneMore) {
            this.oneMore = oneMore;
            return this;
        }
        public Integer getOneMore() {
            return this.oneMore;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setOneMoreShow(String oneMoreShow) {
            this.oneMoreShow = oneMoreShow;
            return this;
        }
        public String getOneMoreShow() {
            return this.oneMoreShow;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setSegmentKey(String segmentKey) {
            this.segmentKey = segmentKey;
            return this;
        }
        public String getSegmentKey() {
            return this.segmentKey;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setSegmentVisaRemark(IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark segmentVisaRemark) {
            this.segmentVisaRemark = segmentVisaRemark;
            return this;
        }
        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark getSegmentVisaRemark() {
            return this.segmentVisaRemark;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setShare(Boolean share) {
            this.share = share;
            return this;
        }
        public Boolean getShare() {
            return this.share;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setShortFlightSize(String shortFlightSize) {
            this.shortFlightSize = shortFlightSize;
            return this;
        }
        public String getShortFlightSize() {
            return this.shortFlightSize;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setStop(Boolean stop) {
            this.stop = stop;
            return this;
        }
        public Boolean getStop() {
            return this.stop;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setTotalTime(String totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public String getTotalTime() {
            return this.totalTime;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setTransferTime(String transferTime) {
            this.transferTime = transferTime;
            return this;
        }
        public String getTransferTime() {
            return this.transferTime;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setTransferTimeNumber(Integer transferTimeNumber) {
            this.transferTimeNumber = transferTimeNumber;
            return this;
        }
        public Integer getTransferTimeNumber() {
            return this.transferTimeNumber;
        }

    }

    public static class IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfos extends TeaModel {
        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_city_name")
        public String arrCityName;

        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_city_name")
        public String depCityName;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("duration")
        public Integer duration;

        @NameInMap("extensions")
        public java.util.Map<String, String> extensions;

        @NameInMap("flight_segment_infos")
        public java.util.List<IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos> flightSegmentInfos;

        @NameInMap("journey_index")
        public Integer journeyIndex;

        @NameInMap("transfer_time")
        public Integer transferTime;

        public static IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfos build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfos self = new IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfos();
            return TeaModel.build(map, self);
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfos setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfos setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfos setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfos setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfos setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfos setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfos setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfos setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfos setFlightSegmentInfos(java.util.List<IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos> flightSegmentInfos) {
            this.flightSegmentInfos = flightSegmentInfos;
            return this;
        }
        public java.util.List<IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfosFlightSegmentInfos> getFlightSegmentInfos() {
            return this.flightSegmentInfos;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfos setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfos setTransferTime(Integer transferTime) {
            this.transferTime = transferTime;
            return this;
        }
        public Integer getTransferTime() {
            return this.transferTime;
        }

    }

    public static class IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoListFlightRuleInfo extends TeaModel {
        @NameInMap("baggage_desc")
        public String baggageDesc;

        @NameInMap("refund_change_rule_desc")
        public String refundChangeRuleDesc;

        public static IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoListFlightRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoListFlightRuleInfo self = new IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoListFlightRuleInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoListFlightRuleInfo setBaggageDesc(String baggageDesc) {
            this.baggageDesc = baggageDesc;
            return this;
        }
        public String getBaggageDesc() {
            return this.baggageDesc;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoListFlightRuleInfo setRefundChangeRuleDesc(String refundChangeRuleDesc) {
            this.refundChangeRuleDesc = refundChangeRuleDesc;
            return this;
        }
        public String getRefundChangeRuleDesc() {
            return this.refundChangeRuleDesc;
        }

    }

    public static class IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoListSegmentPosition extends TeaModel {
        @NameInMap("journey_index")
        public Integer journeyIndex;

        @NameInMap("segment_index")
        public Integer segmentIndex;

        public static IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoListSegmentPosition build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoListSegmentPosition self = new IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoListSegmentPosition();
            return TeaModel.build(map, self);
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoListSegmentPosition setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoListSegmentPosition setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

    }

    public static class IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoList extends TeaModel {
        @NameInMap("flight_rule_info")
        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoListFlightRuleInfo flightRuleInfo;

        @NameInMap("segment_position")
        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoListSegmentPosition segmentPosition;

        public static IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoList self = new IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoList();
            return TeaModel.build(map, self);
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoList setFlightRuleInfo(IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoListFlightRuleInfo flightRuleInfo) {
            this.flightRuleInfo = flightRuleInfo;
            return this;
        }
        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoListFlightRuleInfo getFlightRuleInfo() {
            return this.flightRuleInfo;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoList setSegmentPosition(IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoListSegmentPosition segmentPosition) {
            this.segmentPosition = segmentPosition;
            return this;
        }
        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoListSegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

    }

    public static class IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItemsBaggageRule extends TeaModel {
        @NameInMap("baggage_digest")
        public String baggageDigest;

        @NameInMap("baggage_info_map")
        public java.util.Map<String, java.util.List<ModuleGroupItemSubItemsBaggageRuleBaggageInfoMapValue>> baggageInfoMap;

        @NameInMap("structured_baggage")
        public Boolean structuredBaggage;

        public static IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItemsBaggageRule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItemsBaggageRule self = new IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItemsBaggageRule();
            return TeaModel.build(map, self);
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItemsBaggageRule setBaggageDigest(String baggageDigest) {
            this.baggageDigest = baggageDigest;
            return this;
        }
        public String getBaggageDigest() {
            return this.baggageDigest;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItemsBaggageRule setBaggageInfoMap(java.util.Map<String, java.util.List<ModuleGroupItemSubItemsBaggageRuleBaggageInfoMapValue>> baggageInfoMap) {
            this.baggageInfoMap = baggageInfoMap;
            return this;
        }
        public java.util.Map<String, java.util.List<ModuleGroupItemSubItemsBaggageRuleBaggageInfoMapValue>> getBaggageInfoMap() {
            return this.baggageInfoMap;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItemsBaggageRule setStructuredBaggage(Boolean structuredBaggage) {
            this.structuredBaggage = structuredBaggage;
            return this;
        }
        public Boolean getStructuredBaggage() {
            return this.structuredBaggage;
        }

    }

    public static class IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItemsRefundChangeRule extends TeaModel {
        @NameInMap("cancel_fee_ind")
        public Boolean cancelFeeInd;

        @NameInMap("change_fee_ind")
        public Boolean changeFeeInd;

        @NameInMap("offer_penalty_info_map")
        public java.util.Map<String, java.util.List<ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue>> offerPenaltyInfoMap;

        @NameInMap("refund_change_digest")
        public String refundChangeDigest;

        @NameInMap("structured_refund")
        public Boolean structuredRefund;

        public static IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItemsRefundChangeRule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItemsRefundChangeRule self = new IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItemsRefundChangeRule();
            return TeaModel.build(map, self);
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItemsRefundChangeRule setCancelFeeInd(Boolean cancelFeeInd) {
            this.cancelFeeInd = cancelFeeInd;
            return this;
        }
        public Boolean getCancelFeeInd() {
            return this.cancelFeeInd;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItemsRefundChangeRule setChangeFeeInd(Boolean changeFeeInd) {
            this.changeFeeInd = changeFeeInd;
            return this;
        }
        public Boolean getChangeFeeInd() {
            return this.changeFeeInd;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItemsRefundChangeRule setOfferPenaltyInfoMap(java.util.Map<String, java.util.List<ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue>> offerPenaltyInfoMap) {
            this.offerPenaltyInfoMap = offerPenaltyInfoMap;
            return this;
        }
        public java.util.Map<String, java.util.List<ModuleGroupItemSubItemsRefundChangeRuleOfferPenaltyInfoMapValue>> getOfferPenaltyInfoMap() {
            return this.offerPenaltyInfoMap;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItemsRefundChangeRule setRefundChangeDigest(String refundChangeDigest) {
            this.refundChangeDigest = refundChangeDigest;
            return this;
        }
        public String getRefundChangeDigest() {
            return this.refundChangeDigest;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItemsRefundChangeRule setStructuredRefund(Boolean structuredRefund) {
            this.structuredRefund = structuredRefund;
            return this;
        }
        public Boolean getStructuredRefund() {
            return this.structuredRefund;
        }

    }

    public static class IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItems extends TeaModel {
        @NameInMap("baggage_rule")
        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItemsBaggageRule baggageRule;

        @NameInMap("refund_change_rule")
        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItemsRefundChangeRule refundChangeRule;

        @NameInMap("segment_keys")
        public java.util.List<String> segmentKeys;

        @NameInMap("shopping_item_map")
        public java.util.Map<String, ModuleGroupItemSubItemsShoppingItemMapValue> shoppingItemMap;

        @NameInMap("uniq_key")
        public String uniqKey;

        public static IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItems build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItems self = new IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItems();
            return TeaModel.build(map, self);
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItems setBaggageRule(IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItemsBaggageRule baggageRule) {
            this.baggageRule = baggageRule;
            return this;
        }
        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItemsBaggageRule getBaggageRule() {
            return this.baggageRule;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItems setRefundChangeRule(IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItemsRefundChangeRule refundChangeRule) {
            this.refundChangeRule = refundChangeRule;
            return this;
        }
        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItemsRefundChangeRule getRefundChangeRule() {
            return this.refundChangeRule;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItems setSegmentKeys(java.util.List<String> segmentKeys) {
            this.segmentKeys = segmentKeys;
            return this;
        }
        public java.util.List<String> getSegmentKeys() {
            return this.segmentKeys;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItems setShoppingItemMap(java.util.Map<String, ModuleGroupItemSubItemsShoppingItemMapValue> shoppingItemMap) {
            this.shoppingItemMap = shoppingItemMap;
            return this;
        }
        public java.util.Map<String, ModuleGroupItemSubItemsShoppingItemMapValue> getShoppingItemMap() {
            return this.shoppingItemMap;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItems setUniqKey(String uniqKey) {
            this.uniqKey = uniqKey;
            return this;
        }
        public String getUniqKey() {
            return this.uniqKey;
        }

    }

    public static class IntlFlightOtaItemDetailResponseBodyModuleGroupItem extends TeaModel {
        @NameInMap("agreement_price_codes")
        public java.util.List<String> agreementPriceCodes;

        @NameInMap("flight_rule_info_list")
        public java.util.List<IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoList> flightRuleInfoList;

        @NameInMap("item_id")
        public String itemId;

        @NameInMap("shopping_item_map")
        public java.util.Map<String, ModuleGroupItemShoppingItemMapValue> shoppingItemMap;

        @NameInMap("sub_item_position_map")
        public java.util.Map<String, java.util.List<ModuleGroupItemSubItemPositionMapValue>> subItemPositionMap;

        @NameInMap("sub_items")
        public java.util.List<IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItems> subItems;

        public static IntlFlightOtaItemDetailResponseBodyModuleGroupItem build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOtaItemDetailResponseBodyModuleGroupItem self = new IntlFlightOtaItemDetailResponseBodyModuleGroupItem();
            return TeaModel.build(map, self);
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItem setAgreementPriceCodes(java.util.List<String> agreementPriceCodes) {
            this.agreementPriceCodes = agreementPriceCodes;
            return this;
        }
        public java.util.List<String> getAgreementPriceCodes() {
            return this.agreementPriceCodes;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItem setFlightRuleInfoList(java.util.List<IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoList> flightRuleInfoList) {
            this.flightRuleInfoList = flightRuleInfoList;
            return this;
        }
        public java.util.List<IntlFlightOtaItemDetailResponseBodyModuleGroupItemFlightRuleInfoList> getFlightRuleInfoList() {
            return this.flightRuleInfoList;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItem setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItem setShoppingItemMap(java.util.Map<String, ModuleGroupItemShoppingItemMapValue> shoppingItemMap) {
            this.shoppingItemMap = shoppingItemMap;
            return this;
        }
        public java.util.Map<String, ModuleGroupItemShoppingItemMapValue> getShoppingItemMap() {
            return this.shoppingItemMap;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItem setSubItemPositionMap(java.util.Map<String, java.util.List<ModuleGroupItemSubItemPositionMapValue>> subItemPositionMap) {
            this.subItemPositionMap = subItemPositionMap;
            return this;
        }
        public java.util.Map<String, java.util.List<ModuleGroupItemSubItemPositionMapValue>> getSubItemPositionMap() {
            return this.subItemPositionMap;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleGroupItem setSubItems(java.util.List<IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItems> subItems) {
            this.subItems = subItems;
            return this;
        }
        public java.util.List<IntlFlightOtaItemDetailResponseBodyModuleGroupItemSubItems> getSubItems() {
            return this.subItems;
        }

    }

    public static class IntlFlightOtaItemDetailResponseBodyModuleShutterDocs extends TeaModel {
        @NameInMap("contents")
        public java.util.List<String> contents;

        @NameInMap("main_title")
        public String mainTitle;

        public static IntlFlightOtaItemDetailResponseBodyModuleShutterDocs build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOtaItemDetailResponseBodyModuleShutterDocs self = new IntlFlightOtaItemDetailResponseBodyModuleShutterDocs();
            return TeaModel.build(map, self);
        }

        public IntlFlightOtaItemDetailResponseBodyModuleShutterDocs setContents(java.util.List<String> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<String> getContents() {
            return this.contents;
        }

        public IntlFlightOtaItemDetailResponseBodyModuleShutterDocs setMainTitle(String mainTitle) {
            this.mainTitle = mainTitle;
            return this;
        }
        public String getMainTitle() {
            return this.mainTitle;
        }

    }

    public static class IntlFlightOtaItemDetailResponseBodyModule extends TeaModel {
        @NameInMap("flight_journey_infos")
        public java.util.List<IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfos> flightJourneyInfos;

        @NameInMap("group_item")
        public IntlFlightOtaItemDetailResponseBodyModuleGroupItem groupItem;

        @NameInMap("shutter_docs")
        public java.util.List<IntlFlightOtaItemDetailResponseBodyModuleShutterDocs> shutterDocs;

        @NameInMap("trip_type")
        public Integer tripType;

        public static IntlFlightOtaItemDetailResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOtaItemDetailResponseBodyModule self = new IntlFlightOtaItemDetailResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IntlFlightOtaItemDetailResponseBodyModule setFlightJourneyInfos(java.util.List<IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfos> flightJourneyInfos) {
            this.flightJourneyInfos = flightJourneyInfos;
            return this;
        }
        public java.util.List<IntlFlightOtaItemDetailResponseBodyModuleFlightJourneyInfos> getFlightJourneyInfos() {
            return this.flightJourneyInfos;
        }

        public IntlFlightOtaItemDetailResponseBodyModule setGroupItem(IntlFlightOtaItemDetailResponseBodyModuleGroupItem groupItem) {
            this.groupItem = groupItem;
            return this;
        }
        public IntlFlightOtaItemDetailResponseBodyModuleGroupItem getGroupItem() {
            return this.groupItem;
        }

        public IntlFlightOtaItemDetailResponseBodyModule setShutterDocs(java.util.List<IntlFlightOtaItemDetailResponseBodyModuleShutterDocs> shutterDocs) {
            this.shutterDocs = shutterDocs;
            return this;
        }
        public java.util.List<IntlFlightOtaItemDetailResponseBodyModuleShutterDocs> getShutterDocs() {
            return this.shutterDocs;
        }

        public IntlFlightOtaItemDetailResponseBodyModule setTripType(Integer tripType) {
            this.tripType = tripType;
            return this;
        }
        public Integer getTripType() {
            return this.tripType;
        }

    }

}
