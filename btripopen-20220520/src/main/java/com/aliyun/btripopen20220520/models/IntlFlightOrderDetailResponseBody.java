// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOrderDetailResponseBody extends TeaModel {
    @NameInMap("module")
    public IntlFlightOrderDetailResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>A3F8DCAB-8301-5770-BD9F-71B0BF9E1A6E</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("trace_id")
    public String traceId;

    public static IntlFlightOrderDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightOrderDetailResponseBody self = new IntlFlightOrderDetailResponseBody();
        return TeaModel.build(map, self);
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

    public IntlFlightOrderDetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public IntlFlightOrderDetailResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
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
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:test@cainiao.com">test@cainiao.com</a></p>
         */
        @NameInMap("contact_email")
        public String contactEmail;

        @NameInMap("contact_name")
        public String contactName;

        /**
         * <strong>example:</strong>
         * <p>185006022345</p>
         */
        @NameInMap("contact_phone")
        public String contactPhone;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("send_msg_to_passenger")
        public Boolean sendMsgToPassenger;

        public static IntlFlightOrderDetailResponseBodyModuleContactInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleContactInfo self = new IntlFlightOrderDetailResponseBodyModuleContactInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleContactInfo setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public IntlFlightOrderDetailResponseBodyModuleContactInfo setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public IntlFlightOrderDetailResponseBodyModuleContactInfo setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }
        public String getContactPhone() {
            return this.contactPhone;
        }

        public IntlFlightOrderDetailResponseBodyModuleContactInfo setSendMsgToPassenger(Boolean sendMsgToPassenger) {
            this.sendMsgToPassenger = sendMsgToPassenger;
            return this;
        }
        public Boolean getSendMsgToPassenger() {
            return this.sendMsgToPassenger;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListFlightOtherInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("aircraft_age")
        public String aircraftAge;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("avg_delay_time")
        public String avgDelayTime;

        /**
         * <strong>example:</strong>
         * <p>32Q</p>
         */
        @NameInMap("equip_type")
        public String equipType;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("flight_cancel_rate")
        public String flightCancelRate;

        /**
         * <strong>example:</strong>
         * <p>195</p>
         */
        @NameInMap("flight_distance")
        public Integer flightDistance;

        /**
         * <strong>example:</strong>
         * <p>165</p>
         */
        @NameInMap("flight_duration")
        public Integer flightDuration;

        @NameInMap("flight_size")
        public String flightSize;

        /**
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("jet_bridge_rate")
        public String jetBridgeRate;

        @NameInMap("manufacturer")
        public String manufacturer;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("meal")
        public Integer meal;

        @NameInMap("meal_desc")
        public String mealDesc;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("on_time_rate")
        public String onTimeRate;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("wifi")
        public Boolean wifi;

        public static IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListFlightOtherInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListFlightOtherInfo self = new IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListFlightOtherInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListFlightOtherInfo setAircraftAge(String aircraftAge) {
            this.aircraftAge = aircraftAge;
            return this;
        }
        public String getAircraftAge() {
            return this.aircraftAge;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListFlightOtherInfo setAvgDelayTime(String avgDelayTime) {
            this.avgDelayTime = avgDelayTime;
            return this;
        }
        public String getAvgDelayTime() {
            return this.avgDelayTime;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListFlightOtherInfo setEquipType(String equipType) {
            this.equipType = equipType;
            return this;
        }
        public String getEquipType() {
            return this.equipType;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListFlightOtherInfo setFlightCancelRate(String flightCancelRate) {
            this.flightCancelRate = flightCancelRate;
            return this;
        }
        public String getFlightCancelRate() {
            return this.flightCancelRate;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListFlightOtherInfo setFlightDistance(Integer flightDistance) {
            this.flightDistance = flightDistance;
            return this;
        }
        public Integer getFlightDistance() {
            return this.flightDistance;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListFlightOtherInfo setFlightDuration(Integer flightDuration) {
            this.flightDuration = flightDuration;
            return this;
        }
        public Integer getFlightDuration() {
            return this.flightDuration;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListFlightOtherInfo setFlightSize(String flightSize) {
            this.flightSize = flightSize;
            return this;
        }
        public String getFlightSize() {
            return this.flightSize;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListFlightOtherInfo setJetBridgeRate(String jetBridgeRate) {
            this.jetBridgeRate = jetBridgeRate;
            return this;
        }
        public String getJetBridgeRate() {
            return this.jetBridgeRate;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListFlightOtherInfo setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListFlightOtherInfo setMeal(Integer meal) {
            this.meal = meal;
            return this;
        }
        public Integer getMeal() {
            return this.meal;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListFlightOtherInfo setMealDesc(String mealDesc) {
            this.mealDesc = mealDesc;
            return this;
        }
        public String getMealDesc() {
            return this.mealDesc;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListFlightOtherInfo setOnTimeRate(String onTimeRate) {
            this.onTimeRate = onTimeRate;
            return this;
        }
        public String getOnTimeRate() {
            return this.onTimeRate;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListFlightOtherInfo setWifi(Boolean wifi) {
            this.wifi = wifi;
            return this;
        }
        public Boolean getWifi() {
            return this.wifi;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListLuggageDirectInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("dep_city_luggage_direct")
        public Integer depCityLuggageDirect;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("stop_city_luggage_direct")
        public Integer stopCityLuggageDirect;

        public static IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListLuggageDirectInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListLuggageDirectInfo self = new IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListLuggageDirectInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListLuggageDirectInfo setDepCityLuggageDirect(Integer depCityLuggageDirect) {
            this.depCityLuggageDirect = depCityLuggageDirect;
            return this;
        }
        public Integer getDepCityLuggageDirect() {
            return this.depCityLuggageDirect;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListLuggageDirectInfo setStopCityLuggageDirect(Integer stopCityLuggageDirect) {
            this.stopCityLuggageDirect = stopCityLuggageDirect;
            return this;
        }
        public Integer getStopCityLuggageDirect() {
            return this.stopCityLuggageDirect;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListMarketingAirlineInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MU</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("alliance_name")
        public String allianceName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("cheap_airline")
        public Boolean cheapAirline;

        /**
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/tfs/TB15EXDFHY1gK0jSZTEXXXDQVXa-450-450.png">https://gw.alicdn.com/tfs/TB15EXDFHY1gK0jSZTEXXXDQVXa-450-450.png</a></p>
         */
        @NameInMap("icon_url")
        public String iconUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/tfs/TB15EXDFHY1gK0jSZTEXXXDQVXa-450-450.png">https://gw.alicdn.com/tfs/TB15EXDFHY1gK0jSZTEXXXDQVXa-450-450.png</a></p>
         */
        @NameInMap("logo_url")
        public String logoUrl;

        @NameInMap("short_name")
        public String shortName;

        public static IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListMarketingAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListMarketingAirlineInfo self = new IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListMarketingAirlineInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListMarketingAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListMarketingAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListMarketingAirlineInfo setAllianceName(String allianceName) {
            this.allianceName = allianceName;
            return this;
        }
        public String getAllianceName() {
            return this.allianceName;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListMarketingAirlineInfo setCheapAirline(Boolean cheapAirline) {
            this.cheapAirline = cheapAirline;
            return this;
        }
        public Boolean getCheapAirline() {
            return this.cheapAirline;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListMarketingAirlineInfo setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListMarketingAirlineInfo setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }
        public String getLogoUrl() {
            return this.logoUrl;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListMarketingAirlineInfo setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListOperatingAirlineInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MU</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("alliance_name")
        public String allianceName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("cheap_airline")
        public Boolean cheapAirline;

        /**
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/tfs/TB15EXDFHY1gK0jSZTEXXXDQVXa-450-450.png">https://gw.alicdn.com/tfs/TB15EXDFHY1gK0jSZTEXXXDQVXa-450-450.png</a></p>
         */
        @NameInMap("icon_url")
        public String iconUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/tfs/TB15EXDFHY1gK0jSZTEXXXDQVXa-450-450.png">https://gw.alicdn.com/tfs/TB15EXDFHY1gK0jSZTEXXXDQVXa-450-450.png</a></p>
         */
        @NameInMap("logo_url")
        public String logoUrl;

        @NameInMap("short_name")
        public String shortName;

        public static IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListOperatingAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListOperatingAirlineInfo self = new IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListOperatingAirlineInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListOperatingAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListOperatingAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListOperatingAirlineInfo setAllianceName(String allianceName) {
            this.allianceName = allianceName;
            return this;
        }
        public String getAllianceName() {
            return this.allianceName;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListOperatingAirlineInfo setCheapAirline(Boolean cheapAirline) {
            this.cheapAirline = cheapAirline;
            return this;
        }
        public Boolean getCheapAirline() {
            return this.cheapAirline;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListOperatingAirlineInfo setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListOperatingAirlineInfo setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }
        public String getLogoUrl() {
            return this.logoUrl;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListOperatingAirlineInfo setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListSegmentVisaRemark extends TeaModel {
        @NameInMap("dep_city_visa_remark")
        public String depCityVisaRemark;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("dep_city_visa_type")
        public Integer depCityVisaType;

        @NameInMap("stop_city_visa_remarks")
        public java.util.List<String> stopCityVisaRemarks;

        @NameInMap("stop_city_visa_types")
        public java.util.List<Integer> stopCityVisaTypes;

        public static IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListSegmentVisaRemark build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListSegmentVisaRemark self = new IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListSegmentVisaRemark();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListSegmentVisaRemark setDepCityVisaRemark(String depCityVisaRemark) {
            this.depCityVisaRemark = depCityVisaRemark;
            return this;
        }
        public String getDepCityVisaRemark() {
            return this.depCityVisaRemark;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListSegmentVisaRemark setDepCityVisaType(Integer depCityVisaType) {
            this.depCityVisaType = depCityVisaType;
            return this;
        }
        public Integer getDepCityVisaType() {
            return this.depCityVisaType;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListSegmentVisaRemark setStopCityVisaRemarks(java.util.List<String> stopCityVisaRemarks) {
            this.stopCityVisaRemarks = stopCityVisaRemarks;
            return this;
        }
        public java.util.List<String> getStopCityVisaRemarks() {
            return this.stopCityVisaRemarks;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListSegmentVisaRemark setStopCityVisaTypes(java.util.List<Integer> stopCityVisaTypes) {
            this.stopCityVisaTypes = stopCityVisaTypes;
            return this;
        }
        public java.util.List<Integer> getStopCityVisaTypes() {
            return this.stopCityVisaTypes;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListStopCityList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PVG</p>
         */
        @NameInMap("stop_airport")
        public String stopAirport;

        @NameInMap("stop_airport_name")
        public String stopAirportName;

        /**
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("stop_arr_terminal")
        public String stopArrTerminal;

        /**
         * <strong>example:</strong>
         * <p>2024-07-06 11:10:00</p>
         */
        @NameInMap("stop_arr_time")
        public String stopArrTime;

        /**
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("stop_city_code")
        public String stopCityCode;

        @NameInMap("stop_city_name")
        public String stopCityName;

        /**
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("stop_dep_terminal")
        public String stopDepTerminal;

        /**
         * <strong>example:</strong>
         * <p>2024-07-06 11:10:00</p>
         */
        @NameInMap("stop_dep_time")
        public String stopDepTime;

        public static IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListStopCityList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListStopCityList self = new IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListStopCityList();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListStopCityList setStopAirport(String stopAirport) {
            this.stopAirport = stopAirport;
            return this;
        }
        public String getStopAirport() {
            return this.stopAirport;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListStopCityList setStopAirportName(String stopAirportName) {
            this.stopAirportName = stopAirportName;
            return this;
        }
        public String getStopAirportName() {
            return this.stopAirportName;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListStopCityList setStopArrTerminal(String stopArrTerminal) {
            this.stopArrTerminal = stopArrTerminal;
            return this;
        }
        public String getStopArrTerminal() {
            return this.stopArrTerminal;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListStopCityList setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListStopCityList setStopCityCode(String stopCityCode) {
            this.stopCityCode = stopCityCode;
            return this;
        }
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListStopCityList setStopCityName(String stopCityName) {
            this.stopCityName = stopCityName;
            return this;
        }
        public String getStopCityName() {
            return this.stopCityName;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListStopCityList setStopDepTerminal(String stopDepTerminal) {
            this.stopDepTerminal = stopDepTerminal;
            return this;
        }
        public String getStopDepTerminal() {
            return this.stopDepTerminal;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListStopCityList setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HKG</p>
         */
        @NameInMap("arr_airport_code")
        public String arrAirportCode;

        @NameInMap("arr_airport_name")
        public String arrAirportName;

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
         * <p>T1</p>
         */
        @NameInMap("arr_terminal")
        public String arrTerminal;

        /**
         * <strong>example:</strong>
         * <p>2024-07-06 14:05:00</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("code_share")
        public Boolean codeShare;

        /**
         * <strong>example:</strong>
         * <p>PVG</p>
         */
        @NameInMap("dep_airport_code")
        public String depAirportCode;

        @NameInMap("dep_airport_name")
        public String depAirportName;

        /**
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_city_name")
        public String depCityName;

        /**
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("dep_terminal")
        public String depTerminal;

        /**
         * <strong>example:</strong>
         * <p>2024-07-06 11:10:00</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("flight_other_info")
        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListFlightOtherInfo flightOtherInfo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("journey_index")
        public Integer journeyIndex;

        @NameInMap("luggage_direct_info")
        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListLuggageDirectInfo luggageDirectInfo;

        /**
         * <strong>example:</strong>
         * <p>MU</p>
         */
        @NameInMap("marketing_airline")
        public String marketingAirline;

        @NameInMap("marketing_airline_info")
        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListMarketingAirlineInfo marketingAirlineInfo;

        /**
         * <strong>example:</strong>
         * <p>MU507</p>
         */
        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

        /**
         * <strong>example:</strong>
         * <p>MU</p>
         */
        @NameInMap("operating_airline")
        public String operatingAirline;

        @NameInMap("operating_airline_info")
        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListOperatingAirlineInfo operatingAirlineInfo;

        /**
         * <strong>example:</strong>
         * <p>MU507</p>
         */
        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("segment_index")
        public Integer segmentIndex;

        /**
         * <strong>example:</strong>
         * <p>MU507PVGHKG0706</p>
         */
        @NameInMap("segment_key")
        public String segmentKey;

        @NameInMap("segment_visa_remark")
        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListSegmentVisaRemark segmentVisaRemark;

        @NameInMap("stop_city_list")
        public java.util.List<IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListStopCityList> stopCityList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("stop_quantity")
        public Integer stopQuantity;

        public static IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList self = new IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setArrAirportCode(String arrAirportCode) {
            this.arrAirportCode = arrAirportCode;
            return this;
        }
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setArrAirportName(String arrAirportName) {
            this.arrAirportName = arrAirportName;
            return this;
        }
        public String getArrAirportName() {
            return this.arrAirportName;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setArrTerminal(String arrTerminal) {
            this.arrTerminal = arrTerminal;
            return this;
        }
        public String getArrTerminal() {
            return this.arrTerminal;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setCodeShare(Boolean codeShare) {
            this.codeShare = codeShare;
            return this;
        }
        public Boolean getCodeShare() {
            return this.codeShare;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setDepAirportCode(String depAirportCode) {
            this.depAirportCode = depAirportCode;
            return this;
        }
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setDepAirportName(String depAirportName) {
            this.depAirportName = depAirportName;
            return this;
        }
        public String getDepAirportName() {
            return this.depAirportName;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setDepTerminal(String depTerminal) {
            this.depTerminal = depTerminal;
            return this;
        }
        public String getDepTerminal() {
            return this.depTerminal;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setFlightOtherInfo(IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListFlightOtherInfo flightOtherInfo) {
            this.flightOtherInfo = flightOtherInfo;
            return this;
        }
        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListFlightOtherInfo getFlightOtherInfo() {
            return this.flightOtherInfo;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setLuggageDirectInfo(IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListLuggageDirectInfo luggageDirectInfo) {
            this.luggageDirectInfo = luggageDirectInfo;
            return this;
        }
        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListLuggageDirectInfo getLuggageDirectInfo() {
            return this.luggageDirectInfo;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setMarketingAirline(String marketingAirline) {
            this.marketingAirline = marketingAirline;
            return this;
        }
        public String getMarketingAirline() {
            return this.marketingAirline;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setMarketingAirlineInfo(IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListMarketingAirlineInfo marketingAirlineInfo) {
            this.marketingAirlineInfo = marketingAirlineInfo;
            return this;
        }
        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListMarketingAirlineInfo getMarketingAirlineInfo() {
            return this.marketingAirlineInfo;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setMarketingFlightNo(String marketingFlightNo) {
            this.marketingFlightNo = marketingFlightNo;
            return this;
        }
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setOperatingAirline(String operatingAirline) {
            this.operatingAirline = operatingAirline;
            return this;
        }
        public String getOperatingAirline() {
            return this.operatingAirline;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setOperatingAirlineInfo(IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListOperatingAirlineInfo operatingAirlineInfo) {
            this.operatingAirlineInfo = operatingAirlineInfo;
            return this;
        }
        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListOperatingAirlineInfo getOperatingAirlineInfo() {
            return this.operatingAirlineInfo;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setSegmentKey(String segmentKey) {
            this.segmentKey = segmentKey;
            return this;
        }
        public String getSegmentKey() {
            return this.segmentKey;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setSegmentVisaRemark(IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListSegmentVisaRemark segmentVisaRemark) {
            this.segmentVisaRemark = segmentVisaRemark;
            return this;
        }
        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListSegmentVisaRemark getSegmentVisaRemark() {
            return this.segmentVisaRemark;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setStopCityList(java.util.List<IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListStopCityList> stopCityList) {
            this.stopCityList = stopCityList;
            return this;
        }
        public java.util.List<IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentListStopCityList> getStopCityList() {
            return this.stopCityList;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList setStopQuantity(Integer stopQuantity) {
            this.stopQuantity = stopQuantity;
            return this;
        }
        public Integer getStopQuantity() {
            return this.stopQuantity;
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

        /**
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_city_name")
        public String depCityName;

        /**
         * <strong>example:</strong>
         * <p>2024-07-06</p>
         */
        @NameInMap("dep_date")
        public String depDate;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("journey_index")
        public Integer journeyIndex;

        @NameInMap("segment_list")
        public java.util.List<IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList> segmentList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("transfer_count")
        public Integer transferCount;

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

        public IntlFlightOrderDetailResponseBodyModuleJourneyList setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyList setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyList setSegmentList(java.util.List<IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList> segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public java.util.List<IntlFlightOrderDetailResponseBodyModuleJourneyListSegmentList> getSegmentList() {
            return this.segmentList;
        }

        public IntlFlightOrderDetailResponseBodyModuleJourneyList setTransferCount(Integer transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Integer getTransferCount() {
            return this.transferCount;
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

        @NameInMap("baggage_info_map")
        public java.util.Map<String, java.util.List<ModuleOrderItemListBaggageRuleBaggageInfoMapValue>> baggageInfoMap;

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

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListBaggageRule setBaggageInfoMap(java.util.Map<String, java.util.List<ModuleOrderItemListBaggageRuleBaggageInfoMapValue>> baggageInfoMap) {
            this.baggageInfoMap = baggageInfoMap;
            return this;
        }
        public java.util.Map<String, java.util.List<ModuleOrderItemListBaggageRuleBaggageInfoMapValue>> getBaggageInfoMap() {
            return this.baggageInfoMap;
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
         * <p>3.5</p>
         */
        @NameInMap("discount")
        public Double discount;

        /**
         * <strong>example:</strong>
         * <p>3.5折</p>
         */
        @NameInMap("discount_info")
        public String discountInfo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("modify_fee")
        public Long modifyFee;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("modify_tax_spread")
        public Long modifyTaxSpread;

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
        public Long sellPrice;

        /**
         * <strong>example:</strong>
         * <p>19300</p>
         */
        @NameInMap("tax")
        public Long tax;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("ticket_price")
        public Long ticketPrice;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("upgrade_fee")
        public Long upgradeFee;

        public static IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList self = new IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList setDiscount(Double discount) {
            this.discount = discount;
            return this;
        }
        public Double getDiscount() {
            return this.discount;
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList setDiscountInfo(String discountInfo) {
            this.discountInfo = discountInfo;
            return this;
        }
        public String getDiscountInfo() {
            return this.discountInfo;
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList setModifyFee(Long modifyFee) {
            this.modifyFee = modifyFee;
            return this;
        }
        public Long getModifyFee() {
            return this.modifyFee;
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList setModifyTaxSpread(Long modifyTaxSpread) {
            this.modifyTaxSpread = modifyTaxSpread;
            return this;
        }
        public Long getModifyTaxSpread() {
            return this.modifyTaxSpread;
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList setPassengerType(Integer passengerType) {
            this.passengerType = passengerType;
            return this;
        }
        public Integer getPassengerType() {
            return this.passengerType;
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList setSellPrice(Long sellPrice) {
            this.sellPrice = sellPrice;
            return this;
        }
        public Long getSellPrice() {
            return this.sellPrice;
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList setTax(Long tax) {
            this.tax = tax;
            return this;
        }
        public Long getTax() {
            return this.tax;
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList setTicketPrice(Long ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

        public IntlFlightOrderDetailResponseBodyModuleOrderItemListPassengerPriceList setUpgradeFee(Long upgradeFee) {
            this.upgradeFee = upgradeFee;
            return this;
        }
        public Long getUpgradeFee() {
            return this.upgradeFee;
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

        @NameInMap("offer_penalty_info_map")
        public java.util.Map<String, java.util.List<ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue>> offerPenaltyInfoMap;

        @NameInMap("refund_change_digest")
        public String refundChangeDigest;

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

    public static class IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListPriceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("modify_fee")
        public Long modifyFee;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("modify_tax_spread")
        public Long modifyTaxSpread;

        /**
         * <strong>example:</strong>
         * <p>26900</p>
         */
        @NameInMap("sell_price")
        public Long sellPrice;

        /**
         * <strong>example:</strong>
         * <p>24900</p>
         */
        @NameInMap("tax")
        public Long tax;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("ticket_price")
        public Long ticketPrice;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("upgrade_fee")
        public Long upgradeFee;

        public static IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListPriceInfo self = new IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListPriceInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListPriceInfo setModifyFee(Long modifyFee) {
            this.modifyFee = modifyFee;
            return this;
        }
        public Long getModifyFee() {
            return this.modifyFee;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListPriceInfo setModifyTaxSpread(Long modifyTaxSpread) {
            this.modifyTaxSpread = modifyTaxSpread;
            return this;
        }
        public Long getModifyTaxSpread() {
            return this.modifyTaxSpread;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListPriceInfo setSellPrice(Long sellPrice) {
            this.sellPrice = sellPrice;
            return this;
        }
        public Long getSellPrice() {
            return this.sellPrice;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListPriceInfo setTax(Long tax) {
            this.tax = tax;
            return this;
        }
        public Long getTax() {
            return this.tax;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListPriceInfo setTicketPrice(Long ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListPriceInfo setUpgradeFee(Long upgradeFee) {
            this.upgradeFee = upgradeFee;
            return this;
        }
        public Long getUpgradeFee() {
            return this.upgradeFee;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListTicketSegmentList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>K</p>
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
         * <p>OPEN FOR USE</p>
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
         * <p>MU507PVGHKG0706</p>
         */
        @NameInMap("segment_key")
        public String segmentKey;

        public static IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListTicketSegmentList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListTicketSegmentList self = new IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListTicketSegmentList();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListTicketSegmentList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListTicketSegmentList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListTicketSegmentList setModified(Boolean modified) {
            this.modified = modified;
            return this;
        }
        public Boolean getModified() {
            return this.modified;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListTicketSegmentList setOpenTicketStatus(String openTicketStatus) {
            this.openTicketStatus = openTicketStatus;
            return this;
        }
        public String getOpenTicketStatus() {
            return this.openTicketStatus;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListTicketSegmentList setRefunded(Boolean refunded) {
            this.refunded = refunded;
            return this;
        }
        public Boolean getRefunded() {
            return this.refunded;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListTicketSegmentList setSegmentKey(String segmentKey) {
            this.segmentKey = segmentKey;
            return this;
        }
        public String getSegmentKey() {
            return this.segmentKey;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-03-05 00:00:00</p>
         */
        @NameInMap("issue_time")
        public String issueTime;

        @NameInMap("price_info")
        public IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListPriceInfo priceInfo;

        /**
         * <strong>example:</strong>
         * <p>000-1709625883</p>
         */
        @NameInMap("ticket_no")
        public String ticketNo;

        @NameInMap("ticket_segment_list")
        public java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListTicketSegmentList> ticketSegmentList;

        public static IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketList self = new IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketList();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketList setIssueTime(String issueTime) {
            this.issueTime = issueTime;
            return this;
        }
        public String getIssueTime() {
            return this.issueTime;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketList setPriceInfo(IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListPriceInfo priceInfo) {
            this.priceInfo = priceInfo;
            return this;
        }
        public IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListPriceInfo getPriceInfo() {
            return this.priceInfo;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketList setTicketSegmentList(java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListTicketSegmentList> ticketSegmentList) {
            this.ticketSegmentList = ticketSegmentList;
            return this;
        }
        public java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketListTicketSegmentList> getTicketSegmentList() {
            return this.ticketSegmentList;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModulePassengerItemDetailList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8432002</p>
         */
        @NameInMap("passenger_id")
        public Long passengerId;

        @NameInMap("ticket_list")
        public java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketList> ticketList;

        public static IntlFlightOrderDetailResponseBodyModulePassengerItemDetailList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModulePassengerItemDetailList self = new IntlFlightOrderDetailResponseBodyModulePassengerItemDetailList();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerItemDetailList setPassengerId(Long passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public Long getPassengerId() {
            return this.passengerId;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerItemDetailList setTicketList(java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketList> ticketList) {
            this.ticketList = ticketList;
            return this;
        }
        public java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerItemDetailListTicketList> getTicketList() {
            return this.ticketList;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModulePassengerListCertInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("cert_nation")
        public String certNation;

        /**
         * <strong>example:</strong>
         * <p>H123456</p>
         */
        @NameInMap("cert_no")
        public String certNo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cert_type")
        public Integer certType;

        /**
         * <strong>example:</strong>
         * <p>2025-09-09</p>
         */
        @NameInMap("cert_valid_date")
        public String certValidDate;

        /**
         * <strong>example:</strong>
         * <p>ZHANG/SAN</p>
         */
        @NameInMap("name")
        public String name;

        public static IntlFlightOrderDetailResponseBodyModulePassengerListCertInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModulePassengerListCertInfo self = new IntlFlightOrderDetailResponseBodyModulePassengerListCertInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerListCertInfo setCertNation(String certNation) {
            this.certNation = certNation;
            return this;
        }
        public String getCertNation() {
            return this.certNation;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerListCertInfo setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerListCertInfo setCertType(Integer certType) {
            this.certType = certType;
            return this;
        }
        public Integer getCertType() {
            return this.certType;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerListCertInfo setCertValidDate(String certValidDate) {
            this.certValidDate = certValidDate;
            return this;
        }
        public String getCertValidDate() {
            return this.certValidDate;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerListCertInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModulePassengerListSubsidiaryCertInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("cert_nation")
        public String certNation;

        /**
         * <strong>example:</strong>
         * <p>H123456</p>
         */
        @NameInMap("cert_no")
        public String certNo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cert_type")
        public Integer certType;

        /**
         * <strong>example:</strong>
         * <p>2025-09-09</p>
         */
        @NameInMap("cert_valid_date")
        public String certValidDate;

        /**
         * <strong>example:</strong>
         * <p>ZHANG/SAN</p>
         */
        @NameInMap("name")
        public String name;

        public static IntlFlightOrderDetailResponseBodyModulePassengerListSubsidiaryCertInfoList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightOrderDetailResponseBodyModulePassengerListSubsidiaryCertInfoList self = new IntlFlightOrderDetailResponseBodyModulePassengerListSubsidiaryCertInfoList();
            return TeaModel.build(map, self);
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerListSubsidiaryCertInfoList setCertNation(String certNation) {
            this.certNation = certNation;
            return this;
        }
        public String getCertNation() {
            return this.certNation;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerListSubsidiaryCertInfoList setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerListSubsidiaryCertInfoList setCertType(Integer certType) {
            this.certType = certType;
            return this;
        }
        public Integer getCertType() {
            return this.certType;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerListSubsidiaryCertInfoList setCertValidDate(String certValidDate) {
            this.certValidDate = certValidDate;
            return this;
        }
        public String getCertValidDate() {
            return this.certValidDate;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerListSubsidiaryCertInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class IntlFlightOrderDetailResponseBodyModulePassengerList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1996-09-13</p>
         */
        @NameInMap("birthday")
        public String birthday;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("cascade_dept_mask")
        public String cascadeDeptMask;

        @NameInMap("cascade_dept_name")
        public String cascadeDeptName;

        @NameInMap("cert_info")
        public IntlFlightOrderDetailResponseBodyModulePassengerListCertInfo certInfo;

        @NameInMap("cost_center_name")
        public String costCenterName;

        /**
         * <strong>example:</strong>
         * <p>1009909</p>
         */
        @NameInMap("cost_center_number")
        public String costCenterNumber;

        /**
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("dept_id")
        public String deptId;

        @NameInMap("dept_name")
        public String deptName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("gender")
        public Integer gender;

        @NameInMap("invoice_id")
        public String invoiceId;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        /**
         * <strong>example:</strong>
         * <p>1001101</p>
         */
        @NameInMap("job_no")
        public String jobNo;

        /**
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("mobile_country_code")
        public String mobileCountryCode;

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
        @NameInMap("passenger_type")
        public Integer passengerType;

        /**
         * <strong>example:</strong>
         * <p>185006021321</p>
         */
        @NameInMap("phone")
        public String phone;

        /**
         * <strong>example:</strong>
         * <p>testcode</p>
         */
        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

        @NameInMap("subsidiary_cert_info_list")
        public java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerListSubsidiaryCertInfoList> subsidiaryCertInfoList;

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

        public IntlFlightOrderDetailResponseBodyModulePassengerList setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setCascadeDeptMask(String cascadeDeptMask) {
            this.cascadeDeptMask = cascadeDeptMask;
            return this;
        }
        public String getCascadeDeptMask() {
            return this.cascadeDeptMask;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setCascadeDeptName(String cascadeDeptName) {
            this.cascadeDeptName = cascadeDeptName;
            return this;
        }
        public String getCascadeDeptName() {
            return this.cascadeDeptName;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setCertInfo(IntlFlightOrderDetailResponseBodyModulePassengerListCertInfo certInfo) {
            this.certInfo = certInfo;
            return this;
        }
        public IntlFlightOrderDetailResponseBodyModulePassengerListCertInfo getCertInfo() {
            return this.certInfo;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setDeptId(String deptId) {
            this.deptId = deptId;
            return this;
        }
        public String getDeptId() {
            return this.deptId;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setGender(Integer gender) {
            this.gender = gender;
            return this;
        }
        public Integer getGender() {
            return this.gender;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setInvoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public String getInvoiceId() {
            return this.invoiceId;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setJobNo(String jobNo) {
            this.jobNo = jobNo;
            return this;
        }
        public String getJobNo() {
            return this.jobNo;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setMobileCountryCode(String mobileCountryCode) {
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
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

        public IntlFlightOrderDetailResponseBodyModulePassengerList setPassengerType(Integer passengerType) {
            this.passengerType = passengerType;
            return this;
        }
        public Integer getPassengerType() {
            return this.passengerType;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public IntlFlightOrderDetailResponseBodyModulePassengerList setSubsidiaryCertInfoList(java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerListSubsidiaryCertInfoList> subsidiaryCertInfoList) {
            this.subsidiaryCertInfoList = subsidiaryCertInfoList;
            return this;
        }
        public java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerListSubsidiaryCertInfoList> getSubsidiaryCertInfoList() {
            return this.subsidiaryCertInfoList;
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

    public static class IntlFlightOrderDetailResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>122928120369012</p>
         */
        @NameInMap("book_user_id")
        public String bookUserId;

        /**
         * <strong>example:</strong>
         * <p>ZHANG/SAN</p>
         */
        @NameInMap("book_user_name")
        public String bookUserName;

        @NameInMap("close_reason")
        public String closeReason;

        /**
         * <strong>example:</strong>
         * <p>1709708165000</p>
         */
        @NameInMap("close_time")
        public Long closeTime;

        /**
         * <strong>example:</strong>
         * <p>2024-03-06 14:56:05</p>
         */
        @NameInMap("close_time_str")
        public String closeTimeStr;

        @NameInMap("contact_info")
        public IntlFlightOrderDetailResponseBodyModuleContactInfo contactInfo;

        /**
         * <strong>example:</strong>
         * <p>1709708165000</p>
         */
        @NameInMap("create_time")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>2024-03-06 14:56:05</p>
         */
        @NameInMap("create_time_str")
        public String createTimeStr;

        @NameInMap("ext_info_map")
        public java.util.Map<String, String> extInfoMap;

        @NameInMap("journey_list")
        public java.util.List<IntlFlightOrderDetailResponseBodyModuleJourneyList> journeyList;

        /**
         * <strong>example:</strong>
         * <p>1012000000000000</p>
         */
        @NameInMap("order_id")
        public Long orderId;

        @NameInMap("order_item_list")
        public java.util.List<IntlFlightOrderDetailResponseBodyModuleOrderItemList> orderItemList;

        /**
         * <strong>example:</strong>
         * <p>F11374007131319304192</p>
         */
        @NameInMap("out_order_id")
        public String outOrderId;

        @NameInMap("passenger_item_detail_list")
        public java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerItemDetailList> passengerItemDetailList;

        @NameInMap("passenger_list")
        public java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerList> passengerList;

        /**
         * <strong>example:</strong>
         * <p>1709711779000</p>
         */
        @NameInMap("pay_expire_time")
        public Long payExpireTime;

        /**
         * <strong>example:</strong>
         * <p>2024-03-06 15:56:19</p>
         */
        @NameInMap("pay_expire_time_str")
        public String payExpireTimeStr;

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
        public Long payTime;

        /**
         * <strong>example:</strong>
         * <p>1709708435000</p>
         */
        @NameInMap("pay_time_str")
        public String payTimeStr;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("pay_type")
        public Integer payType;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>1709711779000</p>
         */
        @NameInMap("succeed_time")
        public Long succeedTime;

        /**
         * <strong>example:</strong>
         * <p>2024-03-06 15:56:19</p>
         */
        @NameInMap("succeed_time_str")
        public String succeedTimeStr;

        /**
         * <strong>example:</strong>
         * <p>21300</p>
         */
        @NameInMap("total_price")
        public Long totalPrice;

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

        public IntlFlightOrderDetailResponseBodyModule setBookUserId(String bookUserId) {
            this.bookUserId = bookUserId;
            return this;
        }
        public String getBookUserId() {
            return this.bookUserId;
        }

        public IntlFlightOrderDetailResponseBodyModule setBookUserName(String bookUserName) {
            this.bookUserName = bookUserName;
            return this;
        }
        public String getBookUserName() {
            return this.bookUserName;
        }

        public IntlFlightOrderDetailResponseBodyModule setCloseReason(String closeReason) {
            this.closeReason = closeReason;
            return this;
        }
        public String getCloseReason() {
            return this.closeReason;
        }

        public IntlFlightOrderDetailResponseBodyModule setCloseTime(Long closeTime) {
            this.closeTime = closeTime;
            return this;
        }
        public Long getCloseTime() {
            return this.closeTime;
        }

        public IntlFlightOrderDetailResponseBodyModule setCloseTimeStr(String closeTimeStr) {
            this.closeTimeStr = closeTimeStr;
            return this;
        }
        public String getCloseTimeStr() {
            return this.closeTimeStr;
        }

        public IntlFlightOrderDetailResponseBodyModule setContactInfo(IntlFlightOrderDetailResponseBodyModuleContactInfo contactInfo) {
            this.contactInfo = contactInfo;
            return this;
        }
        public IntlFlightOrderDetailResponseBodyModuleContactInfo getContactInfo() {
            return this.contactInfo;
        }

        public IntlFlightOrderDetailResponseBodyModule setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public IntlFlightOrderDetailResponseBodyModule setCreateTimeStr(String createTimeStr) {
            this.createTimeStr = createTimeStr;
            return this;
        }
        public String getCreateTimeStr() {
            return this.createTimeStr;
        }

        public IntlFlightOrderDetailResponseBodyModule setExtInfoMap(java.util.Map<String, String> extInfoMap) {
            this.extInfoMap = extInfoMap;
            return this;
        }
        public java.util.Map<String, String> getExtInfoMap() {
            return this.extInfoMap;
        }

        public IntlFlightOrderDetailResponseBodyModule setJourneyList(java.util.List<IntlFlightOrderDetailResponseBodyModuleJourneyList> journeyList) {
            this.journeyList = journeyList;
            return this;
        }
        public java.util.List<IntlFlightOrderDetailResponseBodyModuleJourneyList> getJourneyList() {
            return this.journeyList;
        }

        public IntlFlightOrderDetailResponseBodyModule setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public IntlFlightOrderDetailResponseBodyModule setOrderItemList(java.util.List<IntlFlightOrderDetailResponseBodyModuleOrderItemList> orderItemList) {
            this.orderItemList = orderItemList;
            return this;
        }
        public java.util.List<IntlFlightOrderDetailResponseBodyModuleOrderItemList> getOrderItemList() {
            return this.orderItemList;
        }

        public IntlFlightOrderDetailResponseBodyModule setOutOrderId(String outOrderId) {
            this.outOrderId = outOrderId;
            return this;
        }
        public String getOutOrderId() {
            return this.outOrderId;
        }

        public IntlFlightOrderDetailResponseBodyModule setPassengerItemDetailList(java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerItemDetailList> passengerItemDetailList) {
            this.passengerItemDetailList = passengerItemDetailList;
            return this;
        }
        public java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerItemDetailList> getPassengerItemDetailList() {
            return this.passengerItemDetailList;
        }

        public IntlFlightOrderDetailResponseBodyModule setPassengerList(java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerList> passengerList) {
            this.passengerList = passengerList;
            return this;
        }
        public java.util.List<IntlFlightOrderDetailResponseBodyModulePassengerList> getPassengerList() {
            return this.passengerList;
        }

        public IntlFlightOrderDetailResponseBodyModule setPayExpireTime(Long payExpireTime) {
            this.payExpireTime = payExpireTime;
            return this;
        }
        public Long getPayExpireTime() {
            return this.payExpireTime;
        }

        public IntlFlightOrderDetailResponseBodyModule setPayExpireTimeStr(String payExpireTimeStr) {
            this.payExpireTimeStr = payExpireTimeStr;
            return this;
        }
        public String getPayExpireTimeStr() {
            return this.payExpireTimeStr;
        }

        public IntlFlightOrderDetailResponseBodyModule setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

        public IntlFlightOrderDetailResponseBodyModule setPayTime(Long payTime) {
            this.payTime = payTime;
            return this;
        }
        public Long getPayTime() {
            return this.payTime;
        }

        public IntlFlightOrderDetailResponseBodyModule setPayTimeStr(String payTimeStr) {
            this.payTimeStr = payTimeStr;
            return this;
        }
        public String getPayTimeStr() {
            return this.payTimeStr;
        }

        public IntlFlightOrderDetailResponseBodyModule setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public IntlFlightOrderDetailResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public IntlFlightOrderDetailResponseBodyModule setSucceedTime(Long succeedTime) {
            this.succeedTime = succeedTime;
            return this;
        }
        public Long getSucceedTime() {
            return this.succeedTime;
        }

        public IntlFlightOrderDetailResponseBodyModule setSucceedTimeStr(String succeedTimeStr) {
            this.succeedTimeStr = succeedTimeStr;
            return this;
        }
        public String getSucceedTimeStr() {
            return this.succeedTimeStr;
        }

        public IntlFlightOrderDetailResponseBodyModule setTotalPrice(Long totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Long getTotalPrice() {
            return this.totalPrice;
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
