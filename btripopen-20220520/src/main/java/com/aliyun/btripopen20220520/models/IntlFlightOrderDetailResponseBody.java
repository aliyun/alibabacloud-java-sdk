// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOrderDetailResponseBody extends TeaModel {
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
    public IntlFlightOrderDetailResponseBodyModule module;

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

    public static IntlFlightOrderDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightOrderDetailResponseBody self = new IntlFlightOrderDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public IntlFlightOrderDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IntlFlightOrderDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IntlFlightOrderDetailResponseBody setModule(IntlFlightOrderDetailResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IntlFlightOrderDetailResponseBodyModule getModule() {
        return this.module;
    }

    public IntlFlightOrderDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IntlFlightOrderDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IntlFlightOrderDetailResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IntlFlightOrderDetailResponseBodyModuleContactInfo extends TeaModel {
        @NameInMap("contact_name")
        public String contactName;

        public static IntlFlightOrderDetailResponseBodyModuleContactInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleContactInfo self = new IntlFlightOrderDetailResponseBodyModuleContactInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleContactInfo setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosAirlineInfo extends TeaModel {
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("short_name")
        public String shortName;

        public static IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosAirlineInfo self = new IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosAirlineInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosAirlineInfo setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosArrAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("airport_short_name")
        public String airportShortName;

        @NameInMap("terminal")
        public String terminal;

        public static IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosArrAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosArrAirportInfo self = new IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosArrAirportInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosArrAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosArrAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosArrAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosArrAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosDepAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("airport_short_name")
        public String airportShortName;

        @NameInMap("terminal")
        public String terminal;

        public static IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosDepAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosDepAirportInfo self = new IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosDepAirportInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosDepAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosDepAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosDepAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosDepAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo extends TeaModel {
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("short_name")
        public String shortName;

        public static IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo self = new IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfo extends TeaModel {
        @NameInMap("operating_airline_info")
        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo operatingAirlineInfo;

        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        public static IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfo self = new IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfo setOperatingAirlineInfo(IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo operatingAirlineInfo) {
            this.operatingAirlineInfo = operatingAirlineInfo;
            return this;
        }
        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo getOperatingAirlineInfo() {
            return this.operatingAirlineInfo;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfo setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList extends TeaModel {
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

        @NameInMap("stop_dep_term")
        public String stopDepTerm;

        @NameInMap("stop_dep_time")
        public String stopDepTime;

        @NameInMap("stop_time")
        public String stopTime;

        public static IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList self = new IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList setStopAirport(String stopAirport) {
            this.stopAirport = stopAirport;
            return this;
        }
        public String getStopAirport() {
            return this.stopAirport;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList setStopAirportName(String stopAirportName) {
            this.stopAirportName = stopAirportName;
            return this;
        }
        public String getStopAirportName() {
            return this.stopAirportName;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList setStopArrTerm(String stopArrTerm) {
            this.stopArrTerm = stopArrTerm;
            return this;
        }
        public String getStopArrTerm() {
            return this.stopArrTerm;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList setStopCityCode(String stopCityCode) {
            this.stopCityCode = stopCityCode;
            return this;
        }
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList setStopCityName(String stopCityName) {
            this.stopCityName = stopCityName;
            return this;
        }
        public String getStopCityName() {
            return this.stopCityName;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList setStopDepTerm(String stopDepTerm) {
            this.stopDepTerm = stopDepTerm;
            return this;
        }
        public String getStopDepTerm() {
            return this.stopDepTerm;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosLuggageDirectInfo extends TeaModel {
        @NameInMap("dep_city_luggage_direct")
        public Integer depCityLuggageDirect;

        @NameInMap("stop_city_luggage_direct")
        public Integer stopCityLuggageDirect;

        public static IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosLuggageDirectInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosLuggageDirectInfo self = new IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosLuggageDirectInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosLuggageDirectInfo setDepCityLuggageDirect(Integer depCityLuggageDirect) {
            this.depCityLuggageDirect = depCityLuggageDirect;
            return this;
        }
        public Integer getDepCityLuggageDirect() {
            return this.depCityLuggageDirect;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosLuggageDirectInfo setStopCityLuggageDirect(Integer stopCityLuggageDirect) {
            this.stopCityLuggageDirect = stopCityLuggageDirect;
            return this;
        }
        public Integer getStopCityLuggageDirect() {
            return this.stopCityLuggageDirect;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosSegmentVisaRemark extends TeaModel {
        @NameInMap("dep_city_visa_remark")
        public String depCityVisaRemark;

        @NameInMap("dep_city_visa_type")
        public Integer depCityVisaType;

        @NameInMap("stop_city_visa_remarks")
        public java.util.List<String> stopCityVisaRemarks;

        @NameInMap("stop_city_visa_types")
        public java.util.List<Integer> stopCityVisaTypes;

        public static IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosSegmentVisaRemark build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosSegmentVisaRemark self = new IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosSegmentVisaRemark();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosSegmentVisaRemark setDepCityVisaRemark(String depCityVisaRemark) {
            this.depCityVisaRemark = depCityVisaRemark;
            return this;
        }
        public String getDepCityVisaRemark() {
            return this.depCityVisaRemark;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosSegmentVisaRemark setDepCityVisaType(Integer depCityVisaType) {
            this.depCityVisaType = depCityVisaType;
            return this;
        }
        public Integer getDepCityVisaType() {
            return this.depCityVisaType;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosSegmentVisaRemark setStopCityVisaRemarks(java.util.List<String> stopCityVisaRemarks) {
            this.stopCityVisaRemarks = stopCityVisaRemarks;
            return this;
        }
        public java.util.List<String> getStopCityVisaRemarks() {
            return this.stopCityVisaRemarks;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosSegmentVisaRemark setStopCityVisaTypes(java.util.List<Integer> stopCityVisaTypes) {
            this.stopCityVisaTypes = stopCityVisaTypes;
            return this;
        }
        public java.util.List<Integer> getStopCityVisaTypes() {
            return this.stopCityVisaTypes;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos extends TeaModel {
        @NameInMap("airline_info")
        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosAirlineInfo airlineInfo;

        @NameInMap("arr_airport_info")
        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosArrAirportInfo arrAirportInfo;

        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_city_name")
        public String arrCityName;

        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("dep_airport_info")
        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosDepAirportInfo depAirportInfo;

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
        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfo flightShareInfo;

        @NameInMap("flight_size")
        public String flightSize;

        @NameInMap("flight_stop_info_list")
        public java.util.List<IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList> flightStopInfoList;

        @NameInMap("flight_type")
        public String flightType;

        @NameInMap("luggage_direct_info")
        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosLuggageDirectInfo luggageDirectInfo;

        @NameInMap("manufacturer")
        public String manufacturer;

        @NameInMap("meal_desc")
        public String mealDesc;

        @NameInMap("one_more")
        public Integer oneMore;

        @NameInMap("one_more_show")
        public String oneMoreShow;

        @NameInMap("segment_index")
        public Integer segmentIndex;

        @NameInMap("segment_key")
        public String segmentKey;

        @NameInMap("segment_visa_remark")
        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosSegmentVisaRemark segmentVisaRemark;

        @NameInMap("share")
        public Boolean share;

        @NameInMap("short_flight_size")
        public String shortFlightSize;

        @NameInMap("stop")
        public Boolean stop;

        @NameInMap("total_time")
        public String totalTime;

        public static IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos self = new IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setAirlineInfo(IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosAirlineInfo airlineInfo) {
            this.airlineInfo = airlineInfo;
            return this;
        }
        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosAirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setArrAirportInfo(IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosArrAirportInfo arrAirportInfo) {
            this.arrAirportInfo = arrAirportInfo;
            return this;
        }
        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setDepAirportInfo(IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosDepAirportInfo depAirportInfo) {
            this.depAirportInfo = depAirportInfo;
            return this;
        }
        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosDepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setFlightShareInfo(IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfo flightShareInfo) {
            this.flightShareInfo = flightShareInfo;
            return this;
        }
        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfo getFlightShareInfo() {
            return this.flightShareInfo;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setFlightSize(String flightSize) {
            this.flightSize = flightSize;
            return this;
        }
        public String getFlightSize() {
            return this.flightSize;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setFlightStopInfoList(java.util.List<IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList> flightStopInfoList) {
            this.flightStopInfoList = flightStopInfoList;
            return this;
        }
        public java.util.List<IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList> getFlightStopInfoList() {
            return this.flightStopInfoList;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setFlightType(String flightType) {
            this.flightType = flightType;
            return this;
        }
        public String getFlightType() {
            return this.flightType;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setLuggageDirectInfo(IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosLuggageDirectInfo luggageDirectInfo) {
            this.luggageDirectInfo = luggageDirectInfo;
            return this;
        }
        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosLuggageDirectInfo getLuggageDirectInfo() {
            return this.luggageDirectInfo;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setMealDesc(String mealDesc) {
            this.mealDesc = mealDesc;
            return this;
        }
        public String getMealDesc() {
            return this.mealDesc;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setOneMore(Integer oneMore) {
            this.oneMore = oneMore;
            return this;
        }
        public Integer getOneMore() {
            return this.oneMore;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setOneMoreShow(String oneMoreShow) {
            this.oneMoreShow = oneMoreShow;
            return this;
        }
        public String getOneMoreShow() {
            return this.oneMoreShow;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setSegmentKey(String segmentKey) {
            this.segmentKey = segmentKey;
            return this;
        }
        public String getSegmentKey() {
            return this.segmentKey;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setSegmentVisaRemark(IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosSegmentVisaRemark segmentVisaRemark) {
            this.segmentVisaRemark = segmentVisaRemark;
            return this;
        }
        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfosSegmentVisaRemark getSegmentVisaRemark() {
            return this.segmentVisaRemark;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setShare(Boolean share) {
            this.share = share;
            return this;
        }
        public Boolean getShare() {
            return this.share;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setShortFlightSize(String shortFlightSize) {
            this.shortFlightSize = shortFlightSize;
            return this;
        }
        public String getShortFlightSize() {
            return this.shortFlightSize;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setStop(Boolean stop) {
            this.stop = stop;
            return this;
        }
        public Boolean getStop() {
            return this.stop;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos setTotalTime(String totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public String getTotalTime() {
            return this.totalTime;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModuleJourneyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HKG</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_city_name")
        public String arrCityName;

        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_city_name")
        public String depCityName;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("duration")
        public Integer duration;

        @NameInMap("flight_segment_infos")
        public java.util.List<IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos> flightSegmentInfos;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("journey_index")
        public Integer journeyIndex;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("transfer_time")
        public Integer transferTime;

        public static IntlFlightOrderDetailResponseBodyModuleJourneyList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleJourneyList self = new IntlFlightOrderDetailResponseBodyModuleJourneyList();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyList setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyList setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyList setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyList setFlightSegmentInfos(java.util.List<IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos> flightSegmentInfos) {
            this.flightSegmentInfos = flightSegmentInfos;
            return this;
        }
        public java.util.List<IntlFlightOrderDetailResponseBodyModuleJourneyListFlightSegmentInfos> getFlightSegmentInfos() {
            return this.flightSegmentInfos;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyList setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyList setTransferTime(Integer transferTime) {
            this.transferTime = transferTime;
            return this;
        }
        public Integer getTransferTime() {
            return this.transferTime;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModuleOrderItemListBaggageRule extends TeaModel {
        @NameInMap("baggage_digest")
        public String baggageDigest;

        @NameInMap("offer_baggage_info_map")
        public java.util.Map<String, java.util.List<ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue>> offerBaggageInfoMap;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("structured_baggage")
        public Boolean structuredBaggage;

        public static IntlFlightOrderDetailResponseBodyModuleOrderItemListBaggageRule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleOrderItemListBaggageRule self = new IntlFlightOrderDetailResponseBodyModuleOrderItemListBaggageRule();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListBaggageRule setBaggageDigest(String baggageDigest) {
            this.baggageDigest = baggageDigest;
            return this;
        }
        public String getBaggageDigest() {
            return this.baggageDigest;
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListBaggageRule setOfferBaggageInfoMap(java.util.Map<String, java.util.List<ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue>> offerBaggageInfoMap) {
            this.offerBaggageInfoMap = offerBaggageInfoMap;
            return this;
        }
        public java.util.Map<String, java.util.List<ModuleOrderItemListBaggageRuleOfferBaggageInfoMapValue>> getOfferBaggageInfoMap() {
            return this.offerBaggageInfoMap;
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListBaggageRule setStructuredBaggage(Boolean structuredBaggage) {
            this.structuredBaggage = structuredBaggage;
            return this;
        }
        public Boolean getStructuredBaggage() {
            return this.structuredBaggage;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("passenger_type")
        public Integer passengerType;

        /**
         * <strong>example:</strong>
         * <p>21300</p>
         */
        @NameInMap("sell_price")
        public Integer sellPrice;

        /**
         * <strong>example:</strong>
         * <p>19300</p>
         */
        @NameInMap("tax")
        public Integer tax;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("ticket_price")
        public Integer ticketPrice;

        public static IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList self = new IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList setPassengerType(Integer passengerType) {
            this.passengerType = passengerType;
            return this;
        }
        public Integer getPassengerType() {
            return this.passengerType;
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList setSellPrice(Integer sellPrice) {
            this.sellPrice = sellPrice;
            return this;
        }
        public Integer getSellPrice() {
            return this.sellPrice;
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList setTax(Integer tax) {
            this.tax = tax;
            return this;
        }
        public Integer getTax() {
            return this.tax;
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModuleOrderItemListRefundChangeRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("cancel_fee_ind")
        public Boolean cancelFeeInd;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("change_fee_ind")
        public Boolean changeFeeInd;

        @NameInMap("change_rule_desc")
        public String changeRuleDesc;

        @NameInMap("offer_penalty_info_map")
        public java.util.Map<String, java.util.List<ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue>> offerPenaltyInfoMap;

        @NameInMap("refund_change_digest")
        public String refundChangeDigest;

        @NameInMap("refund_rule_desc")
        public String refundRuleDesc;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("structured_refund")
        public Boolean structuredRefund;

        public static IntlFlightOrderDetailResponseBodyModuleOrderItemListRefundChangeRule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleOrderItemListRefundChangeRule self = new IntlFlightOrderDetailResponseBodyModuleOrderItemListRefundChangeRule();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListRefundChangeRule setCancelFeeInd(Boolean cancelFeeInd) {
            this.cancelFeeInd = cancelFeeInd;
            return this;
        }
        public Boolean getCancelFeeInd() {
            return this.cancelFeeInd;
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListRefundChangeRule setChangeFeeInd(Boolean changeFeeInd) {
            this.changeFeeInd = changeFeeInd;
            return this;
        }
        public Boolean getChangeFeeInd() {
            return this.changeFeeInd;
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListRefundChangeRule setChangeRuleDesc(String changeRuleDesc) {
            this.changeRuleDesc = changeRuleDesc;
            return this;
        }
        public String getChangeRuleDesc() {
            return this.changeRuleDesc;
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListRefundChangeRule setOfferPenaltyInfoMap(java.util.Map<String, java.util.List<ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue>> offerPenaltyInfoMap) {
            this.offerPenaltyInfoMap = offerPenaltyInfoMap;
            return this;
        }
        public java.util.Map<String, java.util.List<ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue>> getOfferPenaltyInfoMap() {
            return this.offerPenaltyInfoMap;
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListRefundChangeRule setRefundChangeDigest(String refundChangeDigest) {
            this.refundChangeDigest = refundChangeDigest;
            return this;
        }
        public String getRefundChangeDigest() {
            return this.refundChangeDigest;
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListRefundChangeRule setRefundRuleDesc(String refundRuleDesc) {
            this.refundRuleDesc = refundRuleDesc;
            return this;
        }
        public String getRefundRuleDesc() {
            return this.refundRuleDesc;
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListRefundChangeRule setStructuredRefund(Boolean structuredRefund) {
            this.structuredRefund = structuredRefund;
            return this;
        }
        public Boolean getStructuredRefund() {
            return this.structuredRefund;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModuleOrderItemList extends TeaModel {
        @NameInMap("baggage_rule")
        public IntlFlightOrderDetailResponseBodyModuleOrderItemListBaggageRule baggageRule;

        @NameInMap("passenger_price_list")
        public java.util.List<IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList> passengerPriceList;

        @NameInMap("refund_change_rule")
        public IntlFlightOrderDetailResponseBodyModuleOrderItemListRefundChangeRule refundChangeRule;

        @NameInMap("segment_key_list")
        public java.util.List<String> segmentKeyList;

        public static IntlFlightOrderDetailResponseBodyModuleOrderItemList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleOrderItemList self = new IntlFlightOrderDetailResponseBodyModuleOrderItemList();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemList setBaggageRule(IntlFlightOrderDetailResponseBodyModuleOrderItemListBaggageRule baggageRule) {
            this.baggageRule = baggageRule;
            return this;
        }
        public IntlFlightOrderDetailResponseBodyModuleOrderItemListBaggageRule getBaggageRule() {
            return this.baggageRule;
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemList setPassengerPriceList(java.util.List<IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList> passengerPriceList) {
            this.passengerPriceList = passengerPriceList;
            return this;
        }
        public java.util.List<IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList> getPassengerPriceList() {
            return this.passengerPriceList;
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemList setRefundChangeRule(IntlFlightOrderDetailResponseBodyModuleOrderItemListRefundChangeRule refundChangeRule) {
            this.refundChangeRule = refundChangeRule;
            return this;
        }
        public IntlFlightOrderDetailResponseBodyModuleOrderItemListRefundChangeRule getRefundChangeRule() {
            return this.refundChangeRule;
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemList setSegmentKeyList(java.util.List<String> segmentKeyList) {
            this.segmentKeyList = segmentKeyList;
            return this;
        }
        public java.util.List<String> getSegmentKeyList() {
            return this.segmentKeyList;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModulePassengerList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ZHANG/SAN</p>
         */
        @NameInMap("full_name")
        public String fullName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("gender")
        public Integer gender;

        /**
         * <strong>example:</strong>
         * <p>1001101</p>
         */
        @NameInMap("job_no")
        public String jobNo;

        @NameInMap("nationality")
        public String nationality;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("nationality_code")
        public String nationalityCode;

        /**
         * <strong>example:</strong>
         * <p>8432002</p>
         */
        @NameInMap("passenger_id")
        public Long passengerId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("type")
        public Integer type;

        /**
         * <strong>example:</strong>
         * <p>12292812036903456</p>
         */
        @NameInMap("user_id")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("user_type")
        public Integer userType;

        public static IntlFlightOrderDetailResponseBodyModulePassengerList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModulePassengerList self = new IntlFlightOrderDetailResponseBodyModulePassengerList();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setGender(Integer gender) {
            this.gender = gender;
            return this;
        }
        public Integer getGender() {
            return this.gender;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setJobNo(String jobNo) {
            this.jobNo = jobNo;
            return this;
        }
        public String getJobNo() {
            return this.jobNo;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setNationalityCode(String nationalityCode) {
            this.nationalityCode = nationalityCode;
            return this;
        }
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setPassengerId(Long passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public Long getPassengerId() {
            return this.passengerId;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListPriceInfo extends TeaModel {
        @NameInMap("sell_price")
        public Integer sellPrice;

        @NameInMap("tax")
        public Integer tax;

        @NameInMap("ticket_price")
        public Integer ticketPrice;

        public static IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListPriceInfo self = new IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListPriceInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListPriceInfo setSellPrice(Integer sellPrice) {
            this.sellPrice = sellPrice;
            return this;
        }
        public Integer getSellPrice() {
            return this.sellPrice;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListPriceInfo setTax(Integer tax) {
            this.tax = tax;
            return this;
        }
        public Integer getTax() {
            return this.tax;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListPriceInfo setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList extends TeaModel {
        @NameInMap("cabin")
        public String cabin;

        @NameInMap("cabin_class")
        public String cabinClass;

        @NameInMap("modified")
        public Boolean modified;

        @NameInMap("open_ticket_status")
        public String openTicketStatus;

        @NameInMap("refunded")
        public Boolean refunded;

        @NameInMap("segment_key")
        public String segmentKey;

        public static IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList self = new IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList setModified(Boolean modified) {
            this.modified = modified;
            return this;
        }
        public Boolean getModified() {
            return this.modified;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList setOpenTicketStatus(String openTicketStatus) {
            this.openTicketStatus = openTicketStatus;
            return this;
        }
        public String getOpenTicketStatus() {
            return this.openTicketStatus;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList setRefunded(Boolean refunded) {
            this.refunded = refunded;
            return this;
        }
        public Boolean getRefunded() {
            return this.refunded;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList setSegmentKey(String segmentKey) {
            this.segmentKey = segmentKey;
            return this;
        }
        public String getSegmentKey() {
            return this.segmentKey;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketList extends TeaModel {
        @NameInMap("issue_time")
        public String issueTime;

        @NameInMap("pnr_no")
        public String pnrNo;

        @NameInMap("price_info")
        public IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListPriceInfo priceInfo;

        @NameInMap("segment_key_list")
        public java.util.List<String> segmentKeyList;

        @NameInMap("ticket_no")
        public String ticketNo;

        @NameInMap("ticket_segment_list")
        public java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList> ticketSegmentList;

        public static IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketList self = new IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketList();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketList setIssueTime(String issueTime) {
            this.issueTime = issueTime;
            return this;
        }
        public String getIssueTime() {
            return this.issueTime;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketList setPnrNo(String pnrNo) {
            this.pnrNo = pnrNo;
            return this;
        }
        public String getPnrNo() {
            return this.pnrNo;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketList setPriceInfo(IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListPriceInfo priceInfo) {
            this.priceInfo = priceInfo;
            return this;
        }
        public IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListPriceInfo getPriceInfo() {
            return this.priceInfo;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketList setSegmentKeyList(java.util.List<String> segmentKeyList) {
            this.segmentKeyList = segmentKeyList;
            return this;
        }
        public java.util.List<String> getSegmentKeyList() {
            return this.segmentKeyList;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketList setTicketSegmentList(java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList> ticketSegmentList) {
            this.ticketSegmentList = ticketSegmentList;
            return this;
        }
        public java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList> getTicketSegmentList() {
            return this.ticketSegmentList;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModulePassengerTicketList extends TeaModel {
        @NameInMap("passenger_id")
        public Long passengerId;

        @NameInMap("ticket_list")
        public java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketList> ticketList;

        public static IntlFlightOrderDetailResponseBodyModulePassengerTicketList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModulePassengerTicketList self = new IntlFlightOrderDetailResponseBodyModulePassengerTicketList();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerTicketList setPassengerId(Long passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public Long getPassengerId() {
            return this.passengerId;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerTicketList setTicketList(java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketList> ticketList) {
            this.ticketList = ticketList;
            return this;
        }
        public java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerTicketListTicketList> getTicketList() {
            return this.ticketList;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModule extends TeaModel {
        @NameInMap("booker_user_id")
        public String bookerUserId;

        @NameInMap("booker_user_name")
        public String bookerUserName;

        @NameInMap("close_reason")
        public String closeReason;

        /**
         * <strong>example:</strong>
         * <p>1709708165000</p>
         */
        @NameInMap("close_time")
        public String closeTime;

        @NameInMap("contact_info")
        public IntlFlightOrderDetailResponseBodyModuleContactInfo contactInfo;

        @NameInMap("journey_list")
        public java.util.List<IntlFlightOrderDetailResponseBodyModuleJourneyList> journeyList;

        /**
         * <strong>example:</strong>
         * <p>1012000000000000</p>
         */
        @NameInMap("order_id")
        public String orderId;

        @NameInMap("order_item_list")
        public java.util.List<IntlFlightOrderDetailResponseBodyModuleOrderItemList> orderItemList;

        @NameInMap("order_status")
        public Integer orderStatus;

        /**
         * <strong>example:</strong>
         * <p>F11374007131319304192</p>
         */
        @NameInMap("out_order_id")
        public String outOrderId;

        @NameInMap("passenger_list")
        public java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerList> passengerList;

        @NameInMap("passenger_ticket_list")
        public java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerTicketList> passengerTicketList;

        @NameInMap("pay_latest_time")
        public String payLatestTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pay_status")
        public Integer payStatus;

        /**
         * <strong>example:</strong>
         * <p>2024-03-06 15:00:35</p>
         */
        @NameInMap("pay_time")
        public String payTime;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("pay_type")
        public Integer payType;

        @NameInMap("success_time")
        public String successTime;

        /**
         * <strong>example:</strong>
         * <p>21300</p>
         */
        @NameInMap("total_price")
        public Long totalPrice;

        @NameInMap("total_tax_price")
        public Long totalTaxPrice;

        @NameInMap("total_ticket_price")
        public Long totalTicketPrice;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("trip_type")
        public Integer tripType;

        public static IntlFlightOrderDetailResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModule self = new IntlFlightOrderDetailResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModule setBookerUserId(String bookerUserId) {
            this.bookerUserId = bookerUserId;
            return this;
        }
        public String getBookerUserId() {
            return this.bookerUserId;
        }

        public IntlFlightOrderDetailResponseBodyModule setBookerUserName(String bookerUserName) {
            this.bookerUserName = bookerUserName;
            return this;
        }
        public String getBookerUserName() {
            return this.bookerUserName;
        }

        public IntlFlightOrderDetailResponseBodyModule setCloseReason(String closeReason) {
            this.closeReason = closeReason;
            return this;
        }
        public String getCloseReason() {
            return this.closeReason;
        }

        public IntlFlightOrderDetailResponseBodyModule setCloseTime(String closeTime) {
            this.closeTime = closeTime;
            return this;
        }
        public String getCloseTime() {
            return this.closeTime;
        }

        public IntlFlightOrderDetailResponseBodyModule setContactInfo(IntlFlightOrderDetailResponseBodyModuleContactInfo contactInfo) {
            this.contactInfo = contactInfo;
            return this;
        }
        public IntlFlightOrderDetailResponseBodyModuleContactInfo getContactInfo() {
            return this.contactInfo;
        }

        public IntlFlightOrderDetailResponseBodyModule setJourneyList(java.util.List<IntlFlightOrderDetailResponseBodyModuleJourneyList> journeyList) {
            this.journeyList = journeyList;
            return this;
        }
        public java.util.List<IntlFlightOrderDetailResponseBodyModuleJourneyList> getJourneyList() {
            return this.journeyList;
        }

        public IntlFlightOrderDetailResponseBodyModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public IntlFlightOrderDetailResponseBodyModule setOrderItemList(java.util.List<IntlFlightOrderDetailResponseBodyModuleOrderItemList> orderItemList) {
            this.orderItemList = orderItemList;
            return this;
        }
        public java.util.List<IntlFlightOrderDetailResponseBodyModuleOrderItemList> getOrderItemList() {
            return this.orderItemList;
        }

        public IntlFlightOrderDetailResponseBodyModule setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public IntlFlightOrderDetailResponseBodyModule setOutOrderId(String outOrderId) {
            this.outOrderId = outOrderId;
            return this;
        }
        public String getOutOrderId() {
            return this.outOrderId;
        }

        public IntlFlightOrderDetailResponseBodyModule setPassengerList(java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerList> passengerList) {
            this.passengerList = passengerList;
            return this;
        }
        public java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerList> getPassengerList() {
            return this.passengerList;
        }

        public IntlFlightOrderDetailResponseBodyModule setPassengerTicketList(java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerTicketList> passengerTicketList) {
            this.passengerTicketList = passengerTicketList;
            return this;
        }
        public java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerTicketList> getPassengerTicketList() {
            return this.passengerTicketList;
        }

        public IntlFlightOrderDetailResponseBodyModule setPayLatestTime(String payLatestTime) {
            this.payLatestTime = payLatestTime;
            return this;
        }
        public String getPayLatestTime() {
            return this.payLatestTime;
        }

        public IntlFlightOrderDetailResponseBodyModule setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

        public IntlFlightOrderDetailResponseBodyModule setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public IntlFlightOrderDetailResponseBodyModule setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public IntlFlightOrderDetailResponseBodyModule setSuccessTime(String successTime) {
            this.successTime = successTime;
            return this;
        }
        public String getSuccessTime() {
            return this.successTime;
        }

        public IntlFlightOrderDetailResponseBodyModule setTotalPrice(Long totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Long getTotalPrice() {
            return this.totalPrice;
        }

        public IntlFlightOrderDetailResponseBodyModule setTotalTaxPrice(Long totalTaxPrice) {
            this.totalTaxPrice = totalTaxPrice;
            return this;
        }
        public Long getTotalTaxPrice() {
            return this.totalTaxPrice;
        }

        public IntlFlightOrderDetailResponseBodyModule setTotalTicketPrice(Long totalTicketPrice) {
            this.totalTicketPrice = totalTicketPrice;
            return this;
        }
        public Long getTotalTicketPrice() {
            return this.totalTicketPrice;
        }

        public IntlFlightOrderDetailResponseBodyModule setTripType(Integer tripType) {
            this.tripType = tripType;
            return this;
        }
        public Integer getTripType() {
            return this.tripType;
        }

    }

}
