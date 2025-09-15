// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopDetailResponseBody extends TeaModel {
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
    public IntlFlightReShopDetailResponseBodyModule module;

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

    public static IntlFlightReShopDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopDetailResponseBody self = new IntlFlightReShopDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IntlFlightReShopDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IntlFlightReShopDetailResponseBody setModule(IntlFlightReShopDetailResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IntlFlightReShopDetailResponseBodyModule getModule() {
        return this.module;
    }

    public IntlFlightReShopDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IntlFlightReShopDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IntlFlightReShopDetailResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IntlFlightReShopDetailResponseBodyModuleBaggageRule extends TeaModel {
        @NameInMap("baggage_rule_desc")
        public String baggageRuleDesc;

        public static IntlFlightReShopDetailResponseBodyModuleBaggageRule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModuleBaggageRule self = new IntlFlightReShopDetailResponseBodyModuleBaggageRule();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModuleBaggageRule setBaggageRuleDesc(String baggageRuleDesc) {
            this.baggageRuleDesc = baggageRuleDesc;
            return this;
        }
        public String getBaggageRuleDesc() {
            return this.baggageRuleDesc;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosAirlineInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>NS</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("short_name")
        public String shortName;

        public static IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosAirlineInfo self = new IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosAirlineInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosAirlineInfo setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosArrAirportInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DLC</p>
         */
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("airport_short_name")
        public String airportShortName;

        /**
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("terminal")
        public String terminal;

        public static IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosArrAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosArrAirportInfo self = new IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosArrAirportInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosArrAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosArrAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosArrAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosArrAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosDepAirportInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PEK</p>
         */
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("airport_short_name")
        public String airportShortName;

        /**
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("terminal")
        public String terminal;

        public static IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosDepAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosDepAirportInfo self = new IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosDepAirportInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosDepAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosDepAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosDepAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosDepAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CA</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("short_name")
        public String shortName;

        public static IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo self = new IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfo extends TeaModel {
        @NameInMap("operating_airline_info")
        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo operatingAirlineInfo;

        /**
         * <strong>example:</strong>
         * <p>CA1234</p>
         */
        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        public static IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfo self = new IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfo setOperatingAirlineInfo(IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo operatingAirlineInfo) {
            this.operatingAirlineInfo = operatingAirlineInfo;
            return this;
        }
        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo getOperatingAirlineInfo() {
            return this.operatingAirlineInfo;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfo setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PEK</p>
         */
        @NameInMap("stop_airport")
        public String stopAirport;

        @NameInMap("stop_airport_name")
        public String stopAirportName;

        /**
         * <strong>example:</strong>
         * <p>T3</p>
         */
        @NameInMap("stop_arr_term")
        public String stopArrTerm;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01 05:00</p>
         */
        @NameInMap("stop_arr_time")
        public String stopArrTime;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("stop_city_code")
        public String stopCityCode;

        @NameInMap("stop_city_name")
        public String stopCityName;

        /**
         * <strong>example:</strong>
         * <p>T2</p>
         */
        @NameInMap("stop_dep_term")
        public String stopDepTerm;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01 07:00</p>
         */
        @NameInMap("stop_dep_time")
        public String stopDepTime;

        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("stop_time")
        public String stopTime;

        public static IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList self = new IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList setStopAirport(String stopAirport) {
            this.stopAirport = stopAirport;
            return this;
        }
        public String getStopAirport() {
            return this.stopAirport;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList setStopAirportName(String stopAirportName) {
            this.stopAirportName = stopAirportName;
            return this;
        }
        public String getStopAirportName() {
            return this.stopAirportName;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList setStopArrTerm(String stopArrTerm) {
            this.stopArrTerm = stopArrTerm;
            return this;
        }
        public String getStopArrTerm() {
            return this.stopArrTerm;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList setStopCityCode(String stopCityCode) {
            this.stopCityCode = stopCityCode;
            return this;
        }
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList setStopCityName(String stopCityName) {
            this.stopCityName = stopCityName;
            return this;
        }
        public String getStopCityName() {
            return this.stopCityName;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList setStopDepTerm(String stopDepTerm) {
            this.stopDepTerm = stopDepTerm;
            return this;
        }
        public String getStopDepTerm() {
            return this.stopDepTerm;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosLuggageDirectInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("dep_city_luggage_direct")
        public Integer depCityLuggageDirect;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("stop_city_luggage_direct")
        public Integer stopCityLuggageDirect;

        public static IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosLuggageDirectInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosLuggageDirectInfo self = new IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosLuggageDirectInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosLuggageDirectInfo setDepCityLuggageDirect(Integer depCityLuggageDirect) {
            this.depCityLuggageDirect = depCityLuggageDirect;
            return this;
        }
        public Integer getDepCityLuggageDirect() {
            return this.depCityLuggageDirect;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosLuggageDirectInfo setStopCityLuggageDirect(Integer stopCityLuggageDirect) {
            this.stopCityLuggageDirect = stopCityLuggageDirect;
            return this;
        }
        public Integer getStopCityLuggageDirect() {
            return this.stopCityLuggageDirect;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosSegmentVisaRemark extends TeaModel {
        @NameInMap("dep_city_visa_remark")
        public String depCityVisaRemark;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("dep_city_visa_type")
        public Integer depCityVisaType;

        @NameInMap("stop_city_visa_remarks")
        public java.util.List<String> stopCityVisaRemarks;

        @NameInMap("stop_city_visa_types")
        public java.util.List<Integer> stopCityVisaTypes;

        public static IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosSegmentVisaRemark build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosSegmentVisaRemark self = new IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosSegmentVisaRemark();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosSegmentVisaRemark setDepCityVisaRemark(String depCityVisaRemark) {
            this.depCityVisaRemark = depCityVisaRemark;
            return this;
        }
        public String getDepCityVisaRemark() {
            return this.depCityVisaRemark;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosSegmentVisaRemark setDepCityVisaType(Integer depCityVisaType) {
            this.depCityVisaType = depCityVisaType;
            return this;
        }
        public Integer getDepCityVisaType() {
            return this.depCityVisaType;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosSegmentVisaRemark setStopCityVisaRemarks(java.util.List<String> stopCityVisaRemarks) {
            this.stopCityVisaRemarks = stopCityVisaRemarks;
            return this;
        }
        public java.util.List<String> getStopCityVisaRemarks() {
            return this.stopCityVisaRemarks;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosSegmentVisaRemark setStopCityVisaTypes(java.util.List<Integer> stopCityVisaTypes) {
            this.stopCityVisaTypes = stopCityVisaTypes;
            return this;
        }
        public java.util.List<Integer> getStopCityVisaTypes() {
            return this.stopCityVisaTypes;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos extends TeaModel {
        @NameInMap("airline_info")
        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosAirlineInfo airlineInfo;

        @NameInMap("arr_airport_info")
        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosArrAirportInfo arrAirportInfo;

        /**
         * <strong>example:</strong>
         * <p>HKG</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_city_name")
        public String arrCityName;

        /**
         * <strong>example:</strong>
         * <p>2025-01-01 02:00</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("dep_airport_info")
        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosDepAirportInfo depAirportInfo;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_city_name")
        public String depCityName;

        /**
         * <strong>example:</strong>
         * <p>2025-01-01 01:00</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        /**
         * <strong>example:</strong>
         * <p>130</p>
         */
        @NameInMap("duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>NS8210</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("flight_share_info")
        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfo flightShareInfo;

        @NameInMap("flight_size")
        public String flightSize;

        @NameInMap("flight_stop_info_list")
        public java.util.List<IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList> flightStopInfoList;

        /**
         * <strong>example:</strong>
         * <p>737</p>
         */
        @NameInMap("flight_type")
        public String flightType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("journey_index")
        public Integer journeyIndex;

        @NameInMap("luggage_direct_info")
        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosLuggageDirectInfo luggageDirectInfo;

        @NameInMap("manufacturer")
        public String manufacturer;

        @NameInMap("meal_desc")
        public String mealDesc;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("one_more")
        public Integer oneMore;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("one_more_show")
        public String oneMoreShow;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("segment_index")
        public Integer segmentIndex;

        /**
         * <strong>example:</strong>
         * <p>NS8210XIYHGH0501</p>
         */
        @NameInMap("segment_key")
        public String segmentKey;

        @NameInMap("segment_visa_remark")
        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosSegmentVisaRemark segmentVisaRemark;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("share")
        public Boolean share;

        @NameInMap("short_flight_size")
        public String shortFlightSize;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("stop")
        public Boolean stop;

        @NameInMap("total_time")
        public String totalTime;

        public static IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos self = new IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setAirlineInfo(IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosAirlineInfo airlineInfo) {
            this.airlineInfo = airlineInfo;
            return this;
        }
        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosAirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setArrAirportInfo(IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosArrAirportInfo arrAirportInfo) {
            this.arrAirportInfo = arrAirportInfo;
            return this;
        }
        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setDepAirportInfo(IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosDepAirportInfo depAirportInfo) {
            this.depAirportInfo = depAirportInfo;
            return this;
        }
        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosDepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setFlightShareInfo(IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfo flightShareInfo) {
            this.flightShareInfo = flightShareInfo;
            return this;
        }
        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightShareInfo getFlightShareInfo() {
            return this.flightShareInfo;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setFlightSize(String flightSize) {
            this.flightSize = flightSize;
            return this;
        }
        public String getFlightSize() {
            return this.flightSize;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setFlightStopInfoList(java.util.List<IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList> flightStopInfoList) {
            this.flightStopInfoList = flightStopInfoList;
            return this;
        }
        public java.util.List<IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosFlightStopInfoList> getFlightStopInfoList() {
            return this.flightStopInfoList;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setFlightType(String flightType) {
            this.flightType = flightType;
            return this;
        }
        public String getFlightType() {
            return this.flightType;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setLuggageDirectInfo(IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosLuggageDirectInfo luggageDirectInfo) {
            this.luggageDirectInfo = luggageDirectInfo;
            return this;
        }
        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosLuggageDirectInfo getLuggageDirectInfo() {
            return this.luggageDirectInfo;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setMealDesc(String mealDesc) {
            this.mealDesc = mealDesc;
            return this;
        }
        public String getMealDesc() {
            return this.mealDesc;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setOneMore(Integer oneMore) {
            this.oneMore = oneMore;
            return this;
        }
        public Integer getOneMore() {
            return this.oneMore;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setOneMoreShow(String oneMoreShow) {
            this.oneMoreShow = oneMoreShow;
            return this;
        }
        public String getOneMoreShow() {
            return this.oneMoreShow;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setSegmentKey(String segmentKey) {
            this.segmentKey = segmentKey;
            return this;
        }
        public String getSegmentKey() {
            return this.segmentKey;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setSegmentVisaRemark(IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosSegmentVisaRemark segmentVisaRemark) {
            this.segmentVisaRemark = segmentVisaRemark;
            return this;
        }
        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfosSegmentVisaRemark getSegmentVisaRemark() {
            return this.segmentVisaRemark;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setShare(Boolean share) {
            this.share = share;
            return this;
        }
        public Boolean getShare() {
            return this.share;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setShortFlightSize(String shortFlightSize) {
            this.shortFlightSize = shortFlightSize;
            return this;
        }
        public String getShortFlightSize() {
            return this.shortFlightSize;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setStop(Boolean stop) {
            this.stop = stop;
            return this;
        }
        public Boolean getStop() {
            return this.stop;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos setTotalTime(String totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public String getTotalTime() {
            return this.totalTime;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModuleJourneyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HKG</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_city_name")
        public String arrCityName;

        /**
         * <strong>example:</strong>
         * <p>2025-01-01 02:00</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_city_name")
        public String depCityName;

        /**
         * <strong>example:</strong>
         * <p>2025-01-01 01:00</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("duration")
        public Integer duration;

        @NameInMap("flight_segment_infos")
        public java.util.List<IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos> flightSegmentInfos;

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

        public static IntlFlightReShopDetailResponseBodyModuleJourneyList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModuleJourneyList self = new IntlFlightReShopDetailResponseBodyModuleJourneyList();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyList setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyList setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyList setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyList setFlightSegmentInfos(java.util.List<IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos> flightSegmentInfos) {
            this.flightSegmentInfos = flightSegmentInfos;
            return this;
        }
        public java.util.List<IntlFlightReShopDetailResponseBodyModuleJourneyListFlightSegmentInfos> getFlightSegmentInfos() {
            return this.flightSegmentInfos;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyList setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IntlFlightReShopDetailResponseBodyModuleJourneyList setTransferTime(Integer transferTime) {
            this.transferTime = transferTime;
            return this;
        }
        public Integer getTransferTime() {
            return this.transferTime;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosAirlineInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CA</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("short_name")
        public String shortName;

        public static IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosAirlineInfo self = new IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosAirlineInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosAirlineInfo setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosArrAirportInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HKG</p>
         */
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("airport_short_name")
        public String airportShortName;

        /**
         * <strong>example:</strong>
         * <p>T3</p>
         */
        @NameInMap("terminal")
        public String terminal;

        public static IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosArrAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosArrAirportInfo self = new IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosArrAirportInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosArrAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosArrAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosArrAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosArrAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosDepAirportInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PEK</p>
         */
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("airport_short_name")
        public String airportShortName;

        /**
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("terminal")
        public String terminal;

        public static IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosDepAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosDepAirportInfo self = new IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosDepAirportInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosDepAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosDepAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosDepAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosDepAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MU</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("short_name")
        public String shortName;

        public static IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo self = new IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightShareInfo extends TeaModel {
        @NameInMap("operating_airline_info")
        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo operatingAirlineInfo;

        /**
         * <strong>example:</strong>
         * <p>CA0001</p>
         */
        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        public static IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightShareInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightShareInfo self = new IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightShareInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightShareInfo setOperatingAirlineInfo(IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo operatingAirlineInfo) {
            this.operatingAirlineInfo = operatingAirlineInfo;
            return this;
        }
        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightShareInfoOperatingAirlineInfo getOperatingAirlineInfo() {
            return this.operatingAirlineInfo;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightShareInfo setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightStopInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("stop_airport")
        public String stopAirport;

        @NameInMap("stop_airport_name")
        public String stopAirportName;

        /**
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("stop_arr_term")
        public String stopArrTerm;

        /**
         * <strong>example:</strong>
         * <p>2023-08-13 07:25</p>
         */
        @NameInMap("stop_arr_time")
        public String stopArrTime;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("stop_city_code")
        public String stopCityCode;

        @NameInMap("stop_city_name")
        public String stopCityName;

        /**
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("stop_dep_term")
        public String stopDepTerm;

        /**
         * <strong>example:</strong>
         * <p>2023-08-13 09:25</p>
         */
        @NameInMap("stop_dep_time")
        public String stopDepTime;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("stop_time")
        public String stopTime;

        public static IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightStopInfoList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightStopInfoList self = new IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightStopInfoList();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightStopInfoList setStopAirport(String stopAirport) {
            this.stopAirport = stopAirport;
            return this;
        }
        public String getStopAirport() {
            return this.stopAirport;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightStopInfoList setStopAirportName(String stopAirportName) {
            this.stopAirportName = stopAirportName;
            return this;
        }
        public String getStopAirportName() {
            return this.stopAirportName;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightStopInfoList setStopArrTerm(String stopArrTerm) {
            this.stopArrTerm = stopArrTerm;
            return this;
        }
        public String getStopArrTerm() {
            return this.stopArrTerm;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightStopInfoList setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightStopInfoList setStopCityCode(String stopCityCode) {
            this.stopCityCode = stopCityCode;
            return this;
        }
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightStopInfoList setStopCityName(String stopCityName) {
            this.stopCityName = stopCityName;
            return this;
        }
        public String getStopCityName() {
            return this.stopCityName;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightStopInfoList setStopDepTerm(String stopDepTerm) {
            this.stopDepTerm = stopDepTerm;
            return this;
        }
        public String getStopDepTerm() {
            return this.stopDepTerm;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightStopInfoList setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightStopInfoList setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosLuggageDirectInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("dep_city_luggage_direct")
        public Integer depCityLuggageDirect;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("stop_city_luggage_direct")
        public Integer stopCityLuggageDirect;

        public static IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosLuggageDirectInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosLuggageDirectInfo self = new IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosLuggageDirectInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosLuggageDirectInfo setDepCityLuggageDirect(Integer depCityLuggageDirect) {
            this.depCityLuggageDirect = depCityLuggageDirect;
            return this;
        }
        public Integer getDepCityLuggageDirect() {
            return this.depCityLuggageDirect;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosLuggageDirectInfo setStopCityLuggageDirect(Integer stopCityLuggageDirect) {
            this.stopCityLuggageDirect = stopCityLuggageDirect;
            return this;
        }
        public Integer getStopCityLuggageDirect() {
            return this.stopCityLuggageDirect;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosSegmentVisaRemark extends TeaModel {
        @NameInMap("dep_city_visa_remark")
        public String depCityVisaRemark;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("dep_city_visa_type")
        public Integer depCityVisaType;

        @NameInMap("stop_city_visa_remarks")
        public java.util.List<String> stopCityVisaRemarks;

        @NameInMap("stop_city_visa_types")
        public java.util.List<Integer> stopCityVisaTypes;

        public static IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosSegmentVisaRemark build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosSegmentVisaRemark self = new IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosSegmentVisaRemark();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosSegmentVisaRemark setDepCityVisaRemark(String depCityVisaRemark) {
            this.depCityVisaRemark = depCityVisaRemark;
            return this;
        }
        public String getDepCityVisaRemark() {
            return this.depCityVisaRemark;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosSegmentVisaRemark setDepCityVisaType(Integer depCityVisaType) {
            this.depCityVisaType = depCityVisaType;
            return this;
        }
        public Integer getDepCityVisaType() {
            return this.depCityVisaType;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosSegmentVisaRemark setStopCityVisaRemarks(java.util.List<String> stopCityVisaRemarks) {
            this.stopCityVisaRemarks = stopCityVisaRemarks;
            return this;
        }
        public java.util.List<String> getStopCityVisaRemarks() {
            return this.stopCityVisaRemarks;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosSegmentVisaRemark setStopCityVisaTypes(java.util.List<Integer> stopCityVisaTypes) {
            this.stopCityVisaTypes = stopCityVisaTypes;
            return this;
        }
        public java.util.List<Integer> getStopCityVisaTypes() {
            return this.stopCityVisaTypes;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos extends TeaModel {
        @NameInMap("airline_info")
        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosAirlineInfo airlineInfo;

        @NameInMap("arr_airport_info")
        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosArrAirportInfo arrAirportInfo;

        /**
         * <strong>example:</strong>
         * <p>HKG</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_city_name")
        public String arrCityName;

        /**
         * <strong>example:</strong>
         * <p>2023-08-13 09:25</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("dep_airport_info")
        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosDepAirportInfo depAirportInfo;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_city_name")
        public String depCityName;

        /**
         * <strong>example:</strong>
         * <p>2023-08-13 07:25</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>NS8210</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("flight_share_info")
        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightShareInfo flightShareInfo;

        @NameInMap("flight_size")
        public String flightSize;

        @NameInMap("flight_stop_info_list")
        public java.util.List<IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightStopInfoList> flightStopInfoList;

        /**
         * <strong>example:</strong>
         * <p>738</p>
         */
        @NameInMap("flight_type")
        public String flightType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("journey_index")
        public Integer journeyIndex;

        @NameInMap("luggage_direct_info")
        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosLuggageDirectInfo luggageDirectInfo;

        @NameInMap("manufacturer")
        public String manufacturer;

        @NameInMap("meal_desc")
        public String mealDesc;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("one_more")
        public Integer oneMore;

        @NameInMap("one_more_show")
        public String oneMoreShow;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("segment_index")
        public Integer segmentIndex;

        /**
         * <strong>example:</strong>
         * <p>NS8210XIYHGH0501</p>
         */
        @NameInMap("segment_key")
        public String segmentKey;

        @NameInMap("segment_visa_remark")
        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosSegmentVisaRemark segmentVisaRemark;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("share")
        public Boolean share;

        @NameInMap("short_flight_size")
        public String shortFlightSize;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("stop")
        public Boolean stop;

        @NameInMap("total_time")
        public String totalTime;

        public static IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos self = new IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setAirlineInfo(IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosAirlineInfo airlineInfo) {
            this.airlineInfo = airlineInfo;
            return this;
        }
        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosAirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setArrAirportInfo(IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosArrAirportInfo arrAirportInfo) {
            this.arrAirportInfo = arrAirportInfo;
            return this;
        }
        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setDepAirportInfo(IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosDepAirportInfo depAirportInfo) {
            this.depAirportInfo = depAirportInfo;
            return this;
        }
        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosDepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setFlightShareInfo(IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightShareInfo flightShareInfo) {
            this.flightShareInfo = flightShareInfo;
            return this;
        }
        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightShareInfo getFlightShareInfo() {
            return this.flightShareInfo;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setFlightSize(String flightSize) {
            this.flightSize = flightSize;
            return this;
        }
        public String getFlightSize() {
            return this.flightSize;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setFlightStopInfoList(java.util.List<IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightStopInfoList> flightStopInfoList) {
            this.flightStopInfoList = flightStopInfoList;
            return this;
        }
        public java.util.List<IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosFlightStopInfoList> getFlightStopInfoList() {
            return this.flightStopInfoList;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setFlightType(String flightType) {
            this.flightType = flightType;
            return this;
        }
        public String getFlightType() {
            return this.flightType;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setLuggageDirectInfo(IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosLuggageDirectInfo luggageDirectInfo) {
            this.luggageDirectInfo = luggageDirectInfo;
            return this;
        }
        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosLuggageDirectInfo getLuggageDirectInfo() {
            return this.luggageDirectInfo;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setMealDesc(String mealDesc) {
            this.mealDesc = mealDesc;
            return this;
        }
        public String getMealDesc() {
            return this.mealDesc;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setOneMore(Integer oneMore) {
            this.oneMore = oneMore;
            return this;
        }
        public Integer getOneMore() {
            return this.oneMore;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setOneMoreShow(String oneMoreShow) {
            this.oneMoreShow = oneMoreShow;
            return this;
        }
        public String getOneMoreShow() {
            return this.oneMoreShow;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setSegmentKey(String segmentKey) {
            this.segmentKey = segmentKey;
            return this;
        }
        public String getSegmentKey() {
            return this.segmentKey;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setSegmentVisaRemark(IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosSegmentVisaRemark segmentVisaRemark) {
            this.segmentVisaRemark = segmentVisaRemark;
            return this;
        }
        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfosSegmentVisaRemark getSegmentVisaRemark() {
            return this.segmentVisaRemark;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setShare(Boolean share) {
            this.share = share;
            return this;
        }
        public Boolean getShare() {
            return this.share;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setShortFlightSize(String shortFlightSize) {
            this.shortFlightSize = shortFlightSize;
            return this;
        }
        public String getShortFlightSize() {
            return this.shortFlightSize;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setStop(Boolean stop) {
            this.stop = stop;
            return this;
        }
        public Boolean getStop() {
            return this.stop;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos setTotalTime(String totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public String getTotalTime() {
            return this.totalTime;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModuleOriginJourneyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HKG</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_city_name")
        public String arrCityName;

        /**
         * <strong>example:</strong>
         * <p>2025-01-01 02:00</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_city_name")
        public String depCityName;

        /**
         * <strong>example:</strong>
         * <p>2025-01-01 01:00</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("duration")
        public Integer duration;

        @NameInMap("flight_segment_infos")
        public java.util.List<IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos> flightSegmentInfos;

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

        public static IntlFlightReShopDetailResponseBodyModuleOriginJourneyList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModuleOriginJourneyList self = new IntlFlightReShopDetailResponseBodyModuleOriginJourneyList();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyList setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyList setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyList setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyList setFlightSegmentInfos(java.util.List<IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos> flightSegmentInfos) {
            this.flightSegmentInfos = flightSegmentInfos;
            return this;
        }
        public java.util.List<IntlFlightReShopDetailResponseBodyModuleOriginJourneyListFlightSegmentInfos> getFlightSegmentInfos() {
            return this.flightSegmentInfos;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyList setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IntlFlightReShopDetailResponseBodyModuleOriginJourneyList setTransferTime(Integer transferTime) {
            this.transferTime = transferTime;
            return this;
        }
        public Integer getTransferTime() {
            return this.transferTime;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModulePassengerList extends TeaModel {
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
         * <p>76230022</p>
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
         * <p>btrip8432002</p>
         */
        @NameInMap("user_id")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("user_type")
        public Integer userType;

        public static IntlFlightReShopDetailResponseBodyModulePassengerList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModulePassengerList self = new IntlFlightReShopDetailResponseBodyModulePassengerList();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerList setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerList setGender(Integer gender) {
            this.gender = gender;
            return this;
        }
        public Integer getGender() {
            return this.gender;
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerList setJobNo(String jobNo) {
            this.jobNo = jobNo;
            return this;
        }
        public String getJobNo() {
            return this.jobNo;
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerList setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerList setNationalityCode(String nationalityCode) {
            this.nationalityCode = nationalityCode;
            return this;
        }
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerList setPassengerId(Long passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public Long getPassengerId() {
            return this.passengerId;
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerList setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModulePassengerPriceInfoListPriceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4000</p>
         */
        @NameInMap("handling_amount")
        public Long handlingAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("tax_diff_amount")
        public Long taxDiffAmount;

        /**
         * <strong>example:</strong>
         * <p>125000</p>
         */
        @NameInMap("total_amount")
        public Long totalAmount;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("upgrade_amount")
        public Long upgradeAmount;

        public static IntlFlightReShopDetailResponseBodyModulePassengerPriceInfoListPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModulePassengerPriceInfoListPriceInfo self = new IntlFlightReShopDetailResponseBodyModulePassengerPriceInfoListPriceInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerPriceInfoListPriceInfo setHandlingAmount(Long handlingAmount) {
            this.handlingAmount = handlingAmount;
            return this;
        }
        public Long getHandlingAmount() {
            return this.handlingAmount;
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerPriceInfoListPriceInfo setTaxDiffAmount(Long taxDiffAmount) {
            this.taxDiffAmount = taxDiffAmount;
            return this;
        }
        public Long getTaxDiffAmount() {
            return this.taxDiffAmount;
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerPriceInfoListPriceInfo setTotalAmount(Long totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Long getTotalAmount() {
            return this.totalAmount;
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerPriceInfoListPriceInfo setUpgradeAmount(Long upgradeAmount) {
            this.upgradeAmount = upgradeAmount;
            return this;
        }
        public Long getUpgradeAmount() {
            return this.upgradeAmount;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModulePassengerPriceInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("passenger_id")
        public Long passengerId;

        @NameInMap("price_info")
        public IntlFlightReShopDetailResponseBodyModulePassengerPriceInfoListPriceInfo priceInfo;

        public static IntlFlightReShopDetailResponseBodyModulePassengerPriceInfoList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModulePassengerPriceInfoList self = new IntlFlightReShopDetailResponseBodyModulePassengerPriceInfoList();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerPriceInfoList setPassengerId(Long passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public Long getPassengerId() {
            return this.passengerId;
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerPriceInfoList setPriceInfo(IntlFlightReShopDetailResponseBodyModulePassengerPriceInfoListPriceInfo priceInfo) {
            this.priceInfo = priceInfo;
            return this;
        }
        public IntlFlightReShopDetailResponseBodyModulePassengerPriceInfoListPriceInfo getPriceInfo() {
            return this.priceInfo;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>G</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("modified")
        public Boolean modified;

        /**
         * <strong>example:</strong>
         * <p>OPEN_FOR_USE</p>
         */
        @NameInMap("open_ticket_status")
        public String openTicketStatus;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("refunded")
        public Boolean refunded;

        /**
         * <strong>example:</strong>
         * <p>HX236HKGPVG0509</p>
         */
        @NameInMap("segment_key")
        public String segmentKey;

        public static IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList self = new IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList setModified(Boolean modified) {
            this.modified = modified;
            return this;
        }
        public Boolean getModified() {
            return this.modified;
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList setOpenTicketStatus(String openTicketStatus) {
            this.openTicketStatus = openTicketStatus;
            return this;
        }
        public String getOpenTicketStatus() {
            return this.openTicketStatus;
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList setRefunded(Boolean refunded) {
            this.refunded = refunded;
            return this;
        }
        public Boolean getRefunded() {
            return this.refunded;
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList setSegmentKey(String segmentKey) {
            this.segmentKey = segmentKey;
            return this;
        }
        public String getSegmentKey() {
            return this.segmentKey;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-01-01 00:00:09</p>
         */
        @NameInMap("issue_time")
        public String issueTime;

        /**
         * <strong>example:</strong>
         * <p>P123456</p>
         */
        @NameInMap("pnr_no")
        public String pnrNo;

        @NameInMap("segment_key_list")
        public java.util.List<String> segmentKeyList;

        /**
         * <strong>example:</strong>
         * <p>781-9574833593</p>
         */
        @NameInMap("ticket_no")
        public String ticketNo;

        @NameInMap("ticket_segment_list")
        public java.util.List<IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList> ticketSegmentList;

        public static IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketList self = new IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketList();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketList setIssueTime(String issueTime) {
            this.issueTime = issueTime;
            return this;
        }
        public String getIssueTime() {
            return this.issueTime;
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketList setPnrNo(String pnrNo) {
            this.pnrNo = pnrNo;
            return this;
        }
        public String getPnrNo() {
            return this.pnrNo;
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketList setSegmentKeyList(java.util.List<String> segmentKeyList) {
            this.segmentKeyList = segmentKeyList;
            return this;
        }
        public java.util.List<String> getSegmentKeyList() {
            return this.segmentKeyList;
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketList setTicketSegmentList(java.util.List<IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList> ticketSegmentList) {
            this.ticketSegmentList = ticketSegmentList;
            return this;
        }
        public java.util.List<IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketListTicketSegmentList> getTicketSegmentList() {
            return this.ticketSegmentList;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModulePassengerTicketList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2345678</p>
         */
        @NameInMap("passenger_id")
        public Long passengerId;

        @NameInMap("ticket_list")
        public java.util.List<IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketList> ticketList;

        public static IntlFlightReShopDetailResponseBodyModulePassengerTicketList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModulePassengerTicketList self = new IntlFlightReShopDetailResponseBodyModulePassengerTicketList();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerTicketList setPassengerId(Long passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public Long getPassengerId() {
            return this.passengerId;
        }

        public IntlFlightReShopDetailResponseBodyModulePassengerTicketList setTicketList(java.util.List<IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketList> ticketList) {
            this.ticketList = ticketList;
            return this;
        }
        public java.util.List<IntlFlightReShopDetailResponseBodyModulePassengerTicketListTicketList> getTicketList() {
            return this.ticketList;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModulePriceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4000</p>
         */
        @NameInMap("handling_amount")
        public Long handlingAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("tax_diff_amount")
        public Long taxDiffAmount;

        /**
         * <strong>example:</strong>
         * <p>125000</p>
         */
        @NameInMap("total_amount")
        public Long totalAmount;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("upgrade_amount")
        public Long upgradeAmount;

        public static IntlFlightReShopDetailResponseBodyModulePriceInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModulePriceInfo self = new IntlFlightReShopDetailResponseBodyModulePriceInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModulePriceInfo setHandlingAmount(Long handlingAmount) {
            this.handlingAmount = handlingAmount;
            return this;
        }
        public Long getHandlingAmount() {
            return this.handlingAmount;
        }

        public IntlFlightReShopDetailResponseBodyModulePriceInfo setTaxDiffAmount(Long taxDiffAmount) {
            this.taxDiffAmount = taxDiffAmount;
            return this;
        }
        public Long getTaxDiffAmount() {
            return this.taxDiffAmount;
        }

        public IntlFlightReShopDetailResponseBodyModulePriceInfo setTotalAmount(Long totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Long getTotalAmount() {
            return this.totalAmount;
        }

        public IntlFlightReShopDetailResponseBodyModulePriceInfo setUpgradeAmount(Long upgradeAmount) {
            this.upgradeAmount = upgradeAmount;
            return this;
        }
        public Long getUpgradeAmount() {
            return this.upgradeAmount;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModuleRefundChangeRule extends TeaModel {
        @NameInMap("refund_change_rule_desc")
        public String refundChangeRuleDesc;

        public static IntlFlightReShopDetailResponseBodyModuleRefundChangeRule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModuleRefundChangeRule self = new IntlFlightReShopDetailResponseBodyModuleRefundChangeRule();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModuleRefundChangeRule setRefundChangeRuleDesc(String refundChangeRuleDesc) {
            this.refundChangeRuleDesc = refundChangeRuleDesc;
            return this;
        }
        public String getRefundChangeRuleDesc() {
            return this.refundChangeRuleDesc;
        }

    }

    public static class IntlFlightReShopDetailResponseBodyModule extends TeaModel {
        @NameInMap("baggage_rule")
        public IntlFlightReShopDetailResponseBodyModuleBaggageRule baggageRule;

        @NameInMap("close_reason")
        public String closeReason;

        /**
         * <strong>example:</strong>
         * <p>2024-03-06 15:00:35</p>
         */
        @NameInMap("close_time")
        public String closeTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("close_type")
        public Integer closeType;

        @NameInMap("journey_list")
        public java.util.List<IntlFlightReShopDetailResponseBodyModuleJourneyList> journeyList;

        /**
         * <strong>example:</strong>
         * <p>1017124195788186048</p>
         */
        @NameInMap("order_id")
        public Long orderId;

        @NameInMap("origin_journey_list")
        public java.util.List<IntlFlightReShopDetailResponseBodyModuleOriginJourneyList> originJourneyList;

        /**
         * <strong>example:</strong>
         * <p>F11552194294228713472</p>
         */
        @NameInMap("out_order_id")
        public String outOrderId;

        /**
         * <strong>example:</strong>
         * <p>JPM20241024354</p>
         */
        @NameInMap("out_re_shop_apply_id")
        public String outReShopApplyId;

        @NameInMap("passenger_list")
        public java.util.List<IntlFlightReShopDetailResponseBodyModulePassengerList> passengerList;

        @NameInMap("passenger_price_info_list")
        public java.util.List<IntlFlightReShopDetailResponseBodyModulePassengerPriceInfoList> passengerPriceInfoList;

        @NameInMap("passenger_ticket_list")
        public java.util.List<IntlFlightReShopDetailResponseBodyModulePassengerTicketList> passengerTicketList;

        /**
         * <strong>example:</strong>
         * <p>2024-03-06 15:35:00</p>
         */
        @NameInMap("pay_latest_time")
        public String payLatestTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("pay_status")
        public Integer payStatus;

        @NameInMap("price_info")
        public IntlFlightReShopDetailResponseBodyModulePriceInfo priceInfo;

        /**
         * <strong>example:</strong>
         * <p>1017035199374643191</p>
         */
        @NameInMap("re_shop_apply_id")
        public Long reShopApplyId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("re_shop_reason_code")
        public String reShopReasonCode;

        @NameInMap("re_shop_reason_desc")
        public String reShopReasonDesc;

        @NameInMap("refund_change_rule")
        public IntlFlightReShopDetailResponseBodyModuleRefundChangeRule refundChangeRule;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>2024-03-06 15:01:35</p>
         */
        @NameInMap("success_time")
        public String successTime;

        @NameInMap("user_intention_memo")
        public String userIntentionMemo;

        public static IntlFlightReShopDetailResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopDetailResponseBodyModule self = new IntlFlightReShopDetailResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopDetailResponseBodyModule setBaggageRule(IntlFlightReShopDetailResponseBodyModuleBaggageRule baggageRule) {
            this.baggageRule = baggageRule;
            return this;
        }
        public IntlFlightReShopDetailResponseBodyModuleBaggageRule getBaggageRule() {
            return this.baggageRule;
        }

        public IntlFlightReShopDetailResponseBodyModule setCloseReason(String closeReason) {
            this.closeReason = closeReason;
            return this;
        }
        public String getCloseReason() {
            return this.closeReason;
        }

        public IntlFlightReShopDetailResponseBodyModule setCloseTime(String closeTime) {
            this.closeTime = closeTime;
            return this;
        }
        public String getCloseTime() {
            return this.closeTime;
        }

        public IntlFlightReShopDetailResponseBodyModule setCloseType(Integer closeType) {
            this.closeType = closeType;
            return this;
        }
        public Integer getCloseType() {
            return this.closeType;
        }

        public IntlFlightReShopDetailResponseBodyModule setJourneyList(java.util.List<IntlFlightReShopDetailResponseBodyModuleJourneyList> journeyList) {
            this.journeyList = journeyList;
            return this;
        }
        public java.util.List<IntlFlightReShopDetailResponseBodyModuleJourneyList> getJourneyList() {
            return this.journeyList;
        }

        public IntlFlightReShopDetailResponseBodyModule setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public IntlFlightReShopDetailResponseBodyModule setOriginJourneyList(java.util.List<IntlFlightReShopDetailResponseBodyModuleOriginJourneyList> originJourneyList) {
            this.originJourneyList = originJourneyList;
            return this;
        }
        public java.util.List<IntlFlightReShopDetailResponseBodyModuleOriginJourneyList> getOriginJourneyList() {
            return this.originJourneyList;
        }

        public IntlFlightReShopDetailResponseBodyModule setOutOrderId(String outOrderId) {
            this.outOrderId = outOrderId;
            return this;
        }
        public String getOutOrderId() {
            return this.outOrderId;
        }

        public IntlFlightReShopDetailResponseBodyModule setOutReShopApplyId(String outReShopApplyId) {
            this.outReShopApplyId = outReShopApplyId;
            return this;
        }
        public String getOutReShopApplyId() {
            return this.outReShopApplyId;
        }

        public IntlFlightReShopDetailResponseBodyModule setPassengerList(java.util.List<IntlFlightReShopDetailResponseBodyModulePassengerList> passengerList) {
            this.passengerList = passengerList;
            return this;
        }
        public java.util.List<IntlFlightReShopDetailResponseBodyModulePassengerList> getPassengerList() {
            return this.passengerList;
        }

        public IntlFlightReShopDetailResponseBodyModule setPassengerPriceInfoList(java.util.List<IntlFlightReShopDetailResponseBodyModulePassengerPriceInfoList> passengerPriceInfoList) {
            this.passengerPriceInfoList = passengerPriceInfoList;
            return this;
        }
        public java.util.List<IntlFlightReShopDetailResponseBodyModulePassengerPriceInfoList> getPassengerPriceInfoList() {
            return this.passengerPriceInfoList;
        }

        public IntlFlightReShopDetailResponseBodyModule setPassengerTicketList(java.util.List<IntlFlightReShopDetailResponseBodyModulePassengerTicketList> passengerTicketList) {
            this.passengerTicketList = passengerTicketList;
            return this;
        }
        public java.util.List<IntlFlightReShopDetailResponseBodyModulePassengerTicketList> getPassengerTicketList() {
            return this.passengerTicketList;
        }

        public IntlFlightReShopDetailResponseBodyModule setPayLatestTime(String payLatestTime) {
            this.payLatestTime = payLatestTime;
            return this;
        }
        public String getPayLatestTime() {
            return this.payLatestTime;
        }

        public IntlFlightReShopDetailResponseBodyModule setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

        public IntlFlightReShopDetailResponseBodyModule setPriceInfo(IntlFlightReShopDetailResponseBodyModulePriceInfo priceInfo) {
            this.priceInfo = priceInfo;
            return this;
        }
        public IntlFlightReShopDetailResponseBodyModulePriceInfo getPriceInfo() {
            return this.priceInfo;
        }

        public IntlFlightReShopDetailResponseBodyModule setReShopApplyId(Long reShopApplyId) {
            this.reShopApplyId = reShopApplyId;
            return this;
        }
        public Long getReShopApplyId() {
            return this.reShopApplyId;
        }

        public IntlFlightReShopDetailResponseBodyModule setReShopReasonCode(String reShopReasonCode) {
            this.reShopReasonCode = reShopReasonCode;
            return this;
        }
        public String getReShopReasonCode() {
            return this.reShopReasonCode;
        }

        public IntlFlightReShopDetailResponseBodyModule setReShopReasonDesc(String reShopReasonDesc) {
            this.reShopReasonDesc = reShopReasonDesc;
            return this;
        }
        public String getReShopReasonDesc() {
            return this.reShopReasonDesc;
        }

        public IntlFlightReShopDetailResponseBodyModule setRefundChangeRule(IntlFlightReShopDetailResponseBodyModuleRefundChangeRule refundChangeRule) {
            this.refundChangeRule = refundChangeRule;
            return this;
        }
        public IntlFlightReShopDetailResponseBodyModuleRefundChangeRule getRefundChangeRule() {
            return this.refundChangeRule;
        }

        public IntlFlightReShopDetailResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public IntlFlightReShopDetailResponseBodyModule setSuccessTime(String successTime) {
            this.successTime = successTime;
            return this;
        }
        public String getSuccessTime() {
            return this.successTime;
        }

        public IntlFlightReShopDetailResponseBodyModule setUserIntentionMemo(String userIntentionMemo) {
            this.userIntentionMemo = userIntentionMemo;
            return this;
        }
        public String getUserIntentionMemo() {
            return this.userIntentionMemo;
        }

    }

}
