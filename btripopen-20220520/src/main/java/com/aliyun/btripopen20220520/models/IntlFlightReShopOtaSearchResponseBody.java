// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopOtaSearchResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public IntlFlightReShopOtaSearchResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>210bc4b116835992457938931db4de</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static IntlFlightReShopOtaSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopOtaSearchResponseBody self = new IntlFlightReShopOtaSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopOtaSearchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IntlFlightReShopOtaSearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IntlFlightReShopOtaSearchResponseBody setModule(IntlFlightReShopOtaSearchResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IntlFlightReShopOtaSearchResponseBodyModule getModule() {
        return this.module;
    }

    public IntlFlightReShopOtaSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IntlFlightReShopOtaSearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IntlFlightReShopOtaSearchResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo extends TeaModel {
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("cheap_airline")
        public Boolean cheapAirline;

        @NameInMap("icon_url")
        public String iconUrl;

        @NameInMap("short_name")
        public String shortName;

        public static IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo self = new IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo setCheapAirline(Boolean cheapAirline) {
            this.cheapAirline = cheapAirline;
            return this;
        }
        public Boolean getCheapAirline() {
            return this.cheapAirline;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

    }

    public static class IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosArrAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("airport_short_name")
        public String airportShortName;

        @NameInMap("terminal")
        public String terminal;

        public static IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosArrAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosArrAirportInfo self = new IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosArrAirportInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosArrAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosArrAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosArrAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosArrAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosDepAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("airport_short_name")
        public String airportShortName;

        @NameInMap("terminal")
        public String terminal;

        public static IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosDepAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosDepAirportInfo self = new IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosDepAirportInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosDepAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosDepAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosDepAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosDepAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo extends TeaModel {
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("cheap_airline")
        public Boolean cheapAirline;

        @NameInMap("icon_url")
        public String iconUrl;

        @NameInMap("short_name")
        public String shortName;

        public static IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo self = new IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setCheapAirline(Boolean cheapAirline) {
            this.cheapAirline = cheapAirline;
            return this;
        }
        public Boolean getCheapAirline() {
            return this.cheapAirline;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

    }

    public static class IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfo extends TeaModel {
        @NameInMap("operating_airline_info")
        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo operatingAirlineInfo;

        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        public static IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfo self = new IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfo setOperatingAirlineInfo(IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo operatingAirlineInfo) {
            this.operatingAirlineInfo = operatingAirlineInfo;
            return this;
        }
        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo getOperatingAirlineInfo() {
            return this.operatingAirlineInfo;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfo setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

    }

    public static class IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo extends TeaModel {
        @NameInMap("adcode")
        public String adcode;

        @NameInMap("airport_city_code")
        public String airportCityCode;

        @NameInMap("airport_city_name")
        public String airportCityName;

        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("airport_parent_city_name")
        public String airportParentCityName;

        @NameInMap("county_city_adcode")
        public String countyCityAdcode;

        @NameInMap("county_city_name")
        public String countyCityName;

        @NameInMap("prefecture_city_adcode")
        public String prefectureCityAdcode;

        @NameInMap("prefecture_city_name")
        public String prefectureCityName;

        public static IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo self = new IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo setAdcode(String adcode) {
            this.adcode = adcode;
            return this;
        }
        public String getAdcode() {
            return this.adcode;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo setAirportCityCode(String airportCityCode) {
            this.airportCityCode = airportCityCode;
            return this;
        }
        public String getAirportCityCode() {
            return this.airportCityCode;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo setAirportCityName(String airportCityName) {
            this.airportCityName = airportCityName;
            return this;
        }
        public String getAirportCityName() {
            return this.airportCityName;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo setAirportParentCityName(String airportParentCityName) {
            this.airportParentCityName = airportParentCityName;
            return this;
        }
        public String getAirportParentCityName() {
            return this.airportParentCityName;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo setCountyCityAdcode(String countyCityAdcode) {
            this.countyCityAdcode = countyCityAdcode;
            return this;
        }
        public String getCountyCityAdcode() {
            return this.countyCityAdcode;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo setCountyCityName(String countyCityName) {
            this.countyCityName = countyCityName;
            return this;
        }
        public String getCountyCityName() {
            return this.countyCityName;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo setPrefectureCityAdcode(String prefectureCityAdcode) {
            this.prefectureCityAdcode = prefectureCityAdcode;
            return this;
        }
        public String getPrefectureCityAdcode() {
            return this.prefectureCityAdcode;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo setPrefectureCityName(String prefectureCityName) {
            this.prefectureCityName = prefectureCityName;
            return this;
        }
        public String getPrefectureCityName() {
            return this.prefectureCityName;
        }

    }

    public static class IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoList extends TeaModel {
        @NameInMap("stop_airport")
        public String stopAirport;

        @NameInMap("stop_airport_county_info")
        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo stopAirportCountyInfo;

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

        @NameInMap("stop_dep_term")
        public String stopDepTerm;

        @NameInMap("stop_dep_time")
        public String stopDepTime;

        @NameInMap("stop_time")
        public String stopTime;

        public static IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoList self = new IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoList();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoList setStopAirport(String stopAirport) {
            this.stopAirport = stopAirport;
            return this;
        }
        public String getStopAirport() {
            return this.stopAirport;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoList setStopAirportCountyInfo(IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo stopAirportCountyInfo) {
            this.stopAirportCountyInfo = stopAirportCountyInfo;
            return this;
        }
        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo getStopAirportCountyInfo() {
            return this.stopAirportCountyInfo;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoList setStopAirportName(String stopAirportName) {
            this.stopAirportName = stopAirportName;
            return this;
        }
        public String getStopAirportName() {
            return this.stopAirportName;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoList setStopArrTerm(String stopArrTerm) {
            this.stopArrTerm = stopArrTerm;
            return this;
        }
        public String getStopArrTerm() {
            return this.stopArrTerm;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoList setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoList setStopCityCode(String stopCityCode) {
            this.stopCityCode = stopCityCode;
            return this;
        }
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoList setStopCityName(String stopCityName) {
            this.stopCityName = stopCityName;
            return this;
        }
        public String getStopCityName() {
            return this.stopCityName;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoList setStopDepTerm(String stopDepTerm) {
            this.stopDepTerm = stopDepTerm;
            return this;
        }
        public String getStopDepTerm() {
            return this.stopDepTerm;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoList setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoList setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

    }

    public static class IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo extends TeaModel {
        @NameInMap("dep_city_luggage_direct")
        public Integer depCityLuggageDirect;

        @NameInMap("stop_city_luggage_direct")
        public Integer stopCityLuggageDirect;

        public static IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo self = new IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo setDepCityLuggageDirect(Integer depCityLuggageDirect) {
            this.depCityLuggageDirect = depCityLuggageDirect;
            return this;
        }
        public Integer getDepCityLuggageDirect() {
            return this.depCityLuggageDirect;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo setStopCityLuggageDirect(Integer stopCityLuggageDirect) {
            this.stopCityLuggageDirect = stopCityLuggageDirect;
            return this;
        }
        public Integer getStopCityLuggageDirect() {
            return this.stopCityLuggageDirect;
        }

    }

    public static class IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosOtherInfo extends TeaModel {
        @NameInMap("aircraft_age")
        public String aircraftAge;

        @NameInMap("avg_delay_time")
        public String avgDelayTime;

        @NameInMap("flight_cancel_rate")
        public String flightCancelRate;

        @NameInMap("jet_bridge_rate")
        public String jetBridgeRate;

        @NameInMap("on_time_rate")
        public String onTimeRate;

        @NameInMap("wifi")
        public Boolean wifi;

        public static IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosOtherInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosOtherInfo self = new IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosOtherInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosOtherInfo setAircraftAge(String aircraftAge) {
            this.aircraftAge = aircraftAge;
            return this;
        }
        public String getAircraftAge() {
            return this.aircraftAge;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosOtherInfo setAvgDelayTime(String avgDelayTime) {
            this.avgDelayTime = avgDelayTime;
            return this;
        }
        public String getAvgDelayTime() {
            return this.avgDelayTime;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosOtherInfo setFlightCancelRate(String flightCancelRate) {
            this.flightCancelRate = flightCancelRate;
            return this;
        }
        public String getFlightCancelRate() {
            return this.flightCancelRate;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosOtherInfo setJetBridgeRate(String jetBridgeRate) {
            this.jetBridgeRate = jetBridgeRate;
            return this;
        }
        public String getJetBridgeRate() {
            return this.jetBridgeRate;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosOtherInfo setOnTimeRate(String onTimeRate) {
            this.onTimeRate = onTimeRate;
            return this;
        }
        public String getOnTimeRate() {
            return this.onTimeRate;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosOtherInfo setWifi(Boolean wifi) {
            this.wifi = wifi;
            return this;
        }
        public Boolean getWifi() {
            return this.wifi;
        }

    }

    public static class IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark extends TeaModel {
        @NameInMap("dep_city_visa_remark")
        public String depCityVisaRemark;

        @NameInMap("dep_city_visa_type")
        public Integer depCityVisaType;

        @NameInMap("stop_city_visa_remarks")
        public java.util.List<String> stopCityVisaRemarks;

        @NameInMap("stop_city_visa_types")
        public java.util.List<Integer> stopCityVisaTypes;

        public static IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark self = new IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark setDepCityVisaRemark(String depCityVisaRemark) {
            this.depCityVisaRemark = depCityVisaRemark;
            return this;
        }
        public String getDepCityVisaRemark() {
            return this.depCityVisaRemark;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark setDepCityVisaType(Integer depCityVisaType) {
            this.depCityVisaType = depCityVisaType;
            return this;
        }
        public Integer getDepCityVisaType() {
            return this.depCityVisaType;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark setStopCityVisaRemarks(java.util.List<String> stopCityVisaRemarks) {
            this.stopCityVisaRemarks = stopCityVisaRemarks;
            return this;
        }
        public java.util.List<String> getStopCityVisaRemarks() {
            return this.stopCityVisaRemarks;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark setStopCityVisaTypes(java.util.List<Integer> stopCityVisaTypes) {
            this.stopCityVisaTypes = stopCityVisaTypes;
            return this;
        }
        public java.util.List<Integer> getStopCityVisaTypes() {
            return this.stopCityVisaTypes;
        }

    }

    public static class IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo extends TeaModel {
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("cheap_airline")
        public Boolean cheapAirline;

        @NameInMap("icon_url")
        public String iconUrl;

        @NameInMap("short_name")
        public String shortName;

        public static IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo self = new IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo setCheapAirline(Boolean cheapAirline) {
            this.cheapAirline = cheapAirline;
            return this;
        }
        public Boolean getCheapAirline() {
            return this.cheapAirline;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

    }

    public static class IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos extends TeaModel {
        @NameInMap("airline_info")
        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo airlineInfo;

        @NameInMap("arr_airport_info")
        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosArrAirportInfo arrAirportInfo;

        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_city_name")
        public String arrCityName;

        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("arr_time_u_t_c")
        public String arrTimeUTC;

        @NameInMap("dep_airport_info")
        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosDepAirportInfo depAirportInfo;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_city_name")
        public String depCityName;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("dep_time_u_t_c")
        public String depTimeUTC;

        @NameInMap("duration")
        public Integer duration;

        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("flight_share_info")
        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfo flightShareInfo;

        @NameInMap("flight_size")
        public String flightSize;

        @NameInMap("flight_stop_info_list")
        public java.util.List<IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoList> flightStopInfoList;

        @NameInMap("flight_type")
        public String flightType;

        @NameInMap("journey_index")
        public Integer journeyIndex;

        @NameInMap("luggage_direct_info")
        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo luggageDirectInfo;

        @NameInMap("manufacturer")
        public String manufacturer;

        @NameInMap("meal")
        public Integer meal;

        @NameInMap("meal_desc")
        public String mealDesc;

        @NameInMap("miles")
        public Integer miles;

        @NameInMap("on_time_rate")
        public String onTimeRate;

        @NameInMap("one_more")
        public Integer oneMore;

        @NameInMap("one_more_show")
        public String oneMoreShow;

        @NameInMap("other_info")
        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosOtherInfo otherInfo;

        @NameInMap("segment_index")
        public Integer segmentIndex;

        @NameInMap("segment_key")
        public String segmentKey;

        @NameInMap("segment_visa_remark")
        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark segmentVisaRemark;

        @NameInMap("share")
        public Boolean share;

        @NameInMap("short_flight_size")
        public String shortFlightSize;

        @NameInMap("stop")
        public Boolean stop;

        @NameInMap("ticketing_airline_info")
        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo ticketingAirlineInfo;

        @NameInMap("total_time")
        public String totalTime;

        public static IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos self = new IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setAirlineInfo(IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo airlineInfo) {
            this.airlineInfo = airlineInfo;
            return this;
        }
        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosAirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setArrAirportInfo(IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosArrAirportInfo arrAirportInfo) {
            this.arrAirportInfo = arrAirportInfo;
            return this;
        }
        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setArrTimeUTC(String arrTimeUTC) {
            this.arrTimeUTC = arrTimeUTC;
            return this;
        }
        public String getArrTimeUTC() {
            return this.arrTimeUTC;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setDepAirportInfo(IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosDepAirportInfo depAirportInfo) {
            this.depAirportInfo = depAirportInfo;
            return this;
        }
        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosDepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setDepTimeUTC(String depTimeUTC) {
            this.depTimeUTC = depTimeUTC;
            return this;
        }
        public String getDepTimeUTC() {
            return this.depTimeUTC;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setFlightShareInfo(IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfo flightShareInfo) {
            this.flightShareInfo = flightShareInfo;
            return this;
        }
        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightShareInfo getFlightShareInfo() {
            return this.flightShareInfo;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setFlightSize(String flightSize) {
            this.flightSize = flightSize;
            return this;
        }
        public String getFlightSize() {
            return this.flightSize;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setFlightStopInfoList(java.util.List<IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoList> flightStopInfoList) {
            this.flightStopInfoList = flightStopInfoList;
            return this;
        }
        public java.util.List<IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosFlightStopInfoList> getFlightStopInfoList() {
            return this.flightStopInfoList;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setFlightType(String flightType) {
            this.flightType = flightType;
            return this;
        }
        public String getFlightType() {
            return this.flightType;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setLuggageDirectInfo(IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo luggageDirectInfo) {
            this.luggageDirectInfo = luggageDirectInfo;
            return this;
        }
        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo getLuggageDirectInfo() {
            return this.luggageDirectInfo;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setMeal(Integer meal) {
            this.meal = meal;
            return this;
        }
        public Integer getMeal() {
            return this.meal;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setMealDesc(String mealDesc) {
            this.mealDesc = mealDesc;
            return this;
        }
        public String getMealDesc() {
            return this.mealDesc;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setMiles(Integer miles) {
            this.miles = miles;
            return this;
        }
        public Integer getMiles() {
            return this.miles;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setOnTimeRate(String onTimeRate) {
            this.onTimeRate = onTimeRate;
            return this;
        }
        public String getOnTimeRate() {
            return this.onTimeRate;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setOneMore(Integer oneMore) {
            this.oneMore = oneMore;
            return this;
        }
        public Integer getOneMore() {
            return this.oneMore;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setOneMoreShow(String oneMoreShow) {
            this.oneMoreShow = oneMoreShow;
            return this;
        }
        public String getOneMoreShow() {
            return this.oneMoreShow;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setOtherInfo(IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosOtherInfo otherInfo) {
            this.otherInfo = otherInfo;
            return this;
        }
        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosOtherInfo getOtherInfo() {
            return this.otherInfo;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setSegmentKey(String segmentKey) {
            this.segmentKey = segmentKey;
            return this;
        }
        public String getSegmentKey() {
            return this.segmentKey;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setSegmentVisaRemark(IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark segmentVisaRemark) {
            this.segmentVisaRemark = segmentVisaRemark;
            return this;
        }
        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark getSegmentVisaRemark() {
            return this.segmentVisaRemark;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setShare(Boolean share) {
            this.share = share;
            return this;
        }
        public Boolean getShare() {
            return this.share;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setShortFlightSize(String shortFlightSize) {
            this.shortFlightSize = shortFlightSize;
            return this;
        }
        public String getShortFlightSize() {
            return this.shortFlightSize;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setStop(Boolean stop) {
            this.stop = stop;
            return this;
        }
        public Boolean getStop() {
            return this.stop;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setTicketingAirlineInfo(IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo ticketingAirlineInfo) {
            this.ticketingAirlineInfo = ticketingAirlineInfo;
            return this;
        }
        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo getTicketingAirlineInfo() {
            return this.ticketingAirlineInfo;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos setTotalTime(String totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public String getTotalTime() {
            return this.totalTime;
        }

    }

    public static class IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfos extends TeaModel {
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

        @NameInMap("flight_segment_infos")
        public java.util.List<IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos> flightSegmentInfos;

        @NameInMap("journey_index")
        public Integer journeyIndex;

        @NameInMap("transfer_time")
        public Integer transferTime;

        public static IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfos build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfos self = new IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfos();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfos setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfos setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfos setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfos setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfos setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfos setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfos setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfos setFlightSegmentInfos(java.util.List<IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos> flightSegmentInfos) {
            this.flightSegmentInfos = flightSegmentInfos;
            return this;
        }
        public java.util.List<IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfosFlightSegmentInfos> getFlightSegmentInfos() {
            return this.flightSegmentInfos;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfos setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfos setTransferTime(Integer transferTime) {
            this.transferTime = transferTime;
            return this;
        }
        public Integer getTransferTime() {
            return this.transferTime;
        }

    }

    public static class IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsBaggageRule extends TeaModel {
        @NameInMap("baggage_desc_show_color")
        public String baggageDescShowColor;

        @NameInMap("baggage_digest")
        public String baggageDigest;

        @NameInMap("baggage_rule_desc")
        public String baggageRuleDesc;

        @NameInMap("offer_baggage_info_map")
        public java.util.Map<String, java.util.List<ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue>> offerBaggageInfoMap;

        @NameInMap("structured_baggage")
        public Boolean structuredBaggage;

        public static IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsBaggageRule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsBaggageRule self = new IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsBaggageRule();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsBaggageRule setBaggageDescShowColor(String baggageDescShowColor) {
            this.baggageDescShowColor = baggageDescShowColor;
            return this;
        }
        public String getBaggageDescShowColor() {
            return this.baggageDescShowColor;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsBaggageRule setBaggageDigest(String baggageDigest) {
            this.baggageDigest = baggageDigest;
            return this;
        }
        public String getBaggageDigest() {
            return this.baggageDigest;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsBaggageRule setBaggageRuleDesc(String baggageRuleDesc) {
            this.baggageRuleDesc = baggageRuleDesc;
            return this;
        }
        public String getBaggageRuleDesc() {
            return this.baggageRuleDesc;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsBaggageRule setOfferBaggageInfoMap(java.util.Map<String, java.util.List<ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue>> offerBaggageInfoMap) {
            this.offerBaggageInfoMap = offerBaggageInfoMap;
            return this;
        }
        public java.util.Map<String, java.util.List<ModuleReShopItemListSubItemsBaggageRuleOfferBaggageInfoMapValue>> getOfferBaggageInfoMap() {
            return this.offerBaggageInfoMap;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsBaggageRule setStructuredBaggage(Boolean structuredBaggage) {
            this.structuredBaggage = structuredBaggage;
            return this;
        }
        public Boolean getStructuredBaggage() {
            return this.structuredBaggage;
        }

    }

    public static class IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsRefundChangeRule extends TeaModel {
        @NameInMap("cancel_fee_ind")
        public Boolean cancelFeeInd;

        @NameInMap("change_fee_ind")
        public Boolean changeFeeInd;

        @NameInMap("change_rule_desc")
        public String changeRuleDesc;

        @NameInMap("change_rule_show_color")
        public String changeRuleShowColor;

        @NameInMap("offer_penalty_info_map")
        public java.util.Map<String, java.util.List<ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue>> offerPenaltyInfoMap;

        @NameInMap("refund_change_digest")
        public String refundChangeDigest;

        @NameInMap("refund_change_rule_desc")
        public String refundChangeRuleDesc;

        @NameInMap("refund_rule_desc")
        public String refundRuleDesc;

        @NameInMap("refund_rule_show_color")
        public String refundRuleShowColor;

        @NameInMap("structured_refund")
        public Boolean structuredRefund;

        public static IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsRefundChangeRule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsRefundChangeRule self = new IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsRefundChangeRule();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsRefundChangeRule setCancelFeeInd(Boolean cancelFeeInd) {
            this.cancelFeeInd = cancelFeeInd;
            return this;
        }
        public Boolean getCancelFeeInd() {
            return this.cancelFeeInd;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsRefundChangeRule setChangeFeeInd(Boolean changeFeeInd) {
            this.changeFeeInd = changeFeeInd;
            return this;
        }
        public Boolean getChangeFeeInd() {
            return this.changeFeeInd;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsRefundChangeRule setChangeRuleDesc(String changeRuleDesc) {
            this.changeRuleDesc = changeRuleDesc;
            return this;
        }
        public String getChangeRuleDesc() {
            return this.changeRuleDesc;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsRefundChangeRule setChangeRuleShowColor(String changeRuleShowColor) {
            this.changeRuleShowColor = changeRuleShowColor;
            return this;
        }
        public String getChangeRuleShowColor() {
            return this.changeRuleShowColor;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsRefundChangeRule setOfferPenaltyInfoMap(java.util.Map<String, java.util.List<ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue>> offerPenaltyInfoMap) {
            this.offerPenaltyInfoMap = offerPenaltyInfoMap;
            return this;
        }
        public java.util.Map<String, java.util.List<ModuleReShopItemListSubItemsRefundChangeRuleOfferPenaltyInfoMapValue>> getOfferPenaltyInfoMap() {
            return this.offerPenaltyInfoMap;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsRefundChangeRule setRefundChangeDigest(String refundChangeDigest) {
            this.refundChangeDigest = refundChangeDigest;
            return this;
        }
        public String getRefundChangeDigest() {
            return this.refundChangeDigest;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsRefundChangeRule setRefundChangeRuleDesc(String refundChangeRuleDesc) {
            this.refundChangeRuleDesc = refundChangeRuleDesc;
            return this;
        }
        public String getRefundChangeRuleDesc() {
            return this.refundChangeRuleDesc;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsRefundChangeRule setRefundRuleDesc(String refundRuleDesc) {
            this.refundRuleDesc = refundRuleDesc;
            return this;
        }
        public String getRefundRuleDesc() {
            return this.refundRuleDesc;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsRefundChangeRule setRefundRuleShowColor(String refundRuleShowColor) {
            this.refundRuleShowColor = refundRuleShowColor;
            return this;
        }
        public String getRefundRuleShowColor() {
            return this.refundRuleShowColor;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsRefundChangeRule setStructuredRefund(Boolean structuredRefund) {
            this.structuredRefund = structuredRefund;
            return this;
        }
        public Boolean getStructuredRefund() {
            return this.structuredRefund;
        }

    }

    public static class IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsSegmentPositionList extends TeaModel {
        @NameInMap("journey_index")
        public Integer journeyIndex;

        @NameInMap("segment_index")
        public Integer segmentIndex;

        public static IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsSegmentPositionList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsSegmentPositionList self = new IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsSegmentPositionList();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsSegmentPositionList setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsSegmentPositionList setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

    }

    public static class IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItems extends TeaModel {
        @NameInMap("baggage_rule")
        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsBaggageRule baggageRule;

        @NameInMap("discount_num")
        public Double discountNum;

        @NameInMap("refund_change_rule")
        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsRefundChangeRule refundChangeRule;

        @NameInMap("segment_keys")
        public java.util.List<String> segmentKeys;

        @NameInMap("segment_position_list")
        public java.util.List<IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsSegmentPositionList> segmentPositionList;

        @NameInMap("shopping_item_map")
        public java.util.Map<String, ModuleReShopItemListSubItemsShoppingItemMapValue> shoppingItemMap;

        @NameInMap("uniq_key")
        public String uniqKey;

        public static IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItems build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItems self = new IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItems();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItems setBaggageRule(IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsBaggageRule baggageRule) {
            this.baggageRule = baggageRule;
            return this;
        }
        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsBaggageRule getBaggageRule() {
            return this.baggageRule;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItems setDiscountNum(Double discountNum) {
            this.discountNum = discountNum;
            return this;
        }
        public Double getDiscountNum() {
            return this.discountNum;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItems setRefundChangeRule(IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsRefundChangeRule refundChangeRule) {
            this.refundChangeRule = refundChangeRule;
            return this;
        }
        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsRefundChangeRule getRefundChangeRule() {
            return this.refundChangeRule;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItems setSegmentKeys(java.util.List<String> segmentKeys) {
            this.segmentKeys = segmentKeys;
            return this;
        }
        public java.util.List<String> getSegmentKeys() {
            return this.segmentKeys;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItems setSegmentPositionList(java.util.List<IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsSegmentPositionList> segmentPositionList) {
            this.segmentPositionList = segmentPositionList;
            return this;
        }
        public java.util.List<IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItemsSegmentPositionList> getSegmentPositionList() {
            return this.segmentPositionList;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItems setShoppingItemMap(java.util.Map<String, ModuleReShopItemListSubItemsShoppingItemMapValue> shoppingItemMap) {
            this.shoppingItemMap = shoppingItemMap;
            return this;
        }
        public java.util.Map<String, ModuleReShopItemListSubItemsShoppingItemMapValue> getShoppingItemMap() {
            return this.shoppingItemMap;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItems setUniqKey(String uniqKey) {
            this.uniqKey = uniqKey;
            return this;
        }
        public String getUniqKey() {
            return this.uniqKey;
        }

    }

    public static class IntlFlightReShopOtaSearchResponseBodyModuleReShopItemList extends TeaModel {
        @NameInMap("item_id")
        public String itemId;

        @NameInMap("item_type")
        public String itemType;

        @NameInMap("shopping_item_map")
        public java.util.Map<String, ModuleReShopItemListShoppingItemMapValue> shoppingItemMap;

        @NameInMap("sub_items")
        public java.util.List<IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItems> subItems;

        public static IntlFlightReShopOtaSearchResponseBodyModuleReShopItemList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopOtaSearchResponseBodyModuleReShopItemList self = new IntlFlightReShopOtaSearchResponseBodyModuleReShopItemList();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemList setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemList setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemList setShoppingItemMap(java.util.Map<String, ModuleReShopItemListShoppingItemMapValue> shoppingItemMap) {
            this.shoppingItemMap = shoppingItemMap;
            return this;
        }
        public java.util.Map<String, ModuleReShopItemListShoppingItemMapValue> getShoppingItemMap() {
            return this.shoppingItemMap;
        }

        public IntlFlightReShopOtaSearchResponseBodyModuleReShopItemList setSubItems(java.util.List<IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItems> subItems) {
            this.subItems = subItems;
            return this;
        }
        public java.util.List<IntlFlightReShopOtaSearchResponseBodyModuleReShopItemListSubItems> getSubItems() {
            return this.subItems;
        }

    }

    public static class IntlFlightReShopOtaSearchResponseBodyModule extends TeaModel {
        @NameInMap("flight_journey_infos")
        public java.util.List<IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfos> flightJourneyInfos;

        @NameInMap("need_continue")
        public Boolean needContinue;

        @NameInMap("next_req_wait_time")
        public Integer nextReqWaitTime;

        @NameInMap("re_shop_item_list")
        public java.util.List<IntlFlightReShopOtaSearchResponseBodyModuleReShopItemList> reShopItemList;

        @NameInMap("token")
        public String token;

        public static IntlFlightReShopOtaSearchResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopOtaSearchResponseBodyModule self = new IntlFlightReShopOtaSearchResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopOtaSearchResponseBodyModule setFlightJourneyInfos(java.util.List<IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfos> flightJourneyInfos) {
            this.flightJourneyInfos = flightJourneyInfos;
            return this;
        }
        public java.util.List<IntlFlightReShopOtaSearchResponseBodyModuleFlightJourneyInfos> getFlightJourneyInfos() {
            return this.flightJourneyInfos;
        }

        public IntlFlightReShopOtaSearchResponseBodyModule setNeedContinue(Boolean needContinue) {
            this.needContinue = needContinue;
            return this;
        }
        public Boolean getNeedContinue() {
            return this.needContinue;
        }

        public IntlFlightReShopOtaSearchResponseBodyModule setNextReqWaitTime(Integer nextReqWaitTime) {
            this.nextReqWaitTime = nextReqWaitTime;
            return this;
        }
        public Integer getNextReqWaitTime() {
            return this.nextReqWaitTime;
        }

        public IntlFlightReShopOtaSearchResponseBodyModule setReShopItemList(java.util.List<IntlFlightReShopOtaSearchResponseBodyModuleReShopItemList> reShopItemList) {
            this.reShopItemList = reShopItemList;
            return this;
        }
        public java.util.List<IntlFlightReShopOtaSearchResponseBodyModuleReShopItemList> getReShopItemList() {
            return this.reShopItemList;
        }

        public IntlFlightReShopOtaSearchResponseBodyModule setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
