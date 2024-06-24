// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightListingSearchResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public IntlFlightListingSearchResponseBodyModule module;

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

    public static IntlFlightListingSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightListingSearchResponseBody self = new IntlFlightListingSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public IntlFlightListingSearchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IntlFlightListingSearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IntlFlightListingSearchResponseBody setModule(IntlFlightListingSearchResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IntlFlightListingSearchResponseBodyModule getModule() {
        return this.module;
    }

    public IntlFlightListingSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IntlFlightListingSearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IntlFlightListingSearchResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IntlFlightListingSearchResponseBodyModuleFlightItemListBestPriceItem extends TeaModel {
        @NameInMap("agreement_price_codes")
        public java.util.List<String> agreementPriceCodes;

        @NameInMap("item_type")
        public String itemType;

        @NameInMap("shopping_item_map")
        public java.util.Map<String, ModuleFlightItemListBestPriceItemShoppingItemMapValue> shoppingItemMap;

        public static IntlFlightListingSearchResponseBodyModuleFlightItemListBestPriceItem build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightListingSearchResponseBodyModuleFlightItemListBestPriceItem self = new IntlFlightListingSearchResponseBodyModuleFlightItemListBestPriceItem();
            return TeaModel.build(map, self);
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListBestPriceItem setAgreementPriceCodes(java.util.List<String> agreementPriceCodes) {
            this.agreementPriceCodes = agreementPriceCodes;
            return this;
        }
        public java.util.List<String> getAgreementPriceCodes() {
            return this.agreementPriceCodes;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListBestPriceItem setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListBestPriceItem setShoppingItemMap(java.util.Map<String, ModuleFlightItemListBestPriceItemShoppingItemMapValue> shoppingItemMap) {
            this.shoppingItemMap = shoppingItemMap;
            return this;
        }
        public java.util.Map<String, ModuleFlightItemListBestPriceItemShoppingItemMapValue> getShoppingItemMap() {
            return this.shoppingItemMap;
        }

    }

    public static class IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo extends TeaModel {
        @NameInMap("airline_chinese_name")
        public String airlineChineseName;

        @NameInMap("airline_chinese_short_name")
        public String airlineChineseShortName;

        /**
         * <strong>example:</strong>
         * <p>9H</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        /**
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/tfs/TB15EXDFHY1gK0jSZTEXXXDQVXa-450-450.png_80x80.jpg">https://gw.alicdn.com/tfs/TB15EXDFHY1gK0jSZTEXXXDQVXa-450-450.png_80x80.jpg</a></p>
         */
        @NameInMap("airline_icon")
        public String airlineIcon;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("cheap_flight")
        public Boolean cheapFlight;

        public static IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo self = new IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo setAirlineChineseName(String airlineChineseName) {
            this.airlineChineseName = airlineChineseName;
            return this;
        }
        public String getAirlineChineseName() {
            return this.airlineChineseName;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo setAirlineChineseShortName(String airlineChineseShortName) {
            this.airlineChineseShortName = airlineChineseShortName;
            return this;
        }
        public String getAirlineChineseShortName() {
            return this.airlineChineseShortName;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo setAirlineIcon(String airlineIcon) {
            this.airlineIcon = airlineIcon;
            return this;
        }
        public String getAirlineIcon() {
            return this.airlineIcon;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo setCheapFlight(Boolean cheapFlight) {
            this.cheapFlight = cheapFlight;
            return this;
        }
        public Boolean getCheapFlight() {
            return this.cheapFlight;
        }

    }

    public static class IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PKX</p>
         */
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("airport_short_name")
        public String airportShortName;

        /**
         * <strong>example:</strong>
         * <p>--</p>
         */
        @NameInMap("terminal")
        public String terminal;

        public static IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo self = new IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HGH</p>
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

        public static IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo self = new IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo extends TeaModel {
        @NameInMap("airline_chinese_name")
        public String airlineChineseName;

        @NameInMap("airline_chinese_short_name")
        public String airlineChineseShortName;

        /**
         * <strong>example:</strong>
         * <p>DR</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        /**
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/tfs/TB1gSXBFUT1gK0jSZFhXXaAtVXa-450-450.png_80x80.jpg">https://gw.alicdn.com/tfs/TB1gSXBFUT1gK0jSZFhXXaAtVXa-450-450.png_80x80.jpg</a></p>
         */
        @NameInMap("airline_icon")
        public String airlineIcon;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("cheap_flight")
        public Boolean cheapFlight;

        public static IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo self = new IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setAirlineChineseName(String airlineChineseName) {
            this.airlineChineseName = airlineChineseName;
            return this;
        }
        public String getAirlineChineseName() {
            return this.airlineChineseName;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setAirlineChineseShortName(String airlineChineseShortName) {
            this.airlineChineseShortName = airlineChineseShortName;
            return this;
        }
        public String getAirlineChineseShortName() {
            return this.airlineChineseShortName;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setAirlineIcon(String airlineIcon) {
            this.airlineIcon = airlineIcon;
            return this;
        }
        public String getAirlineIcon() {
            return this.airlineIcon;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setCheapFlight(Boolean cheapFlight) {
            this.cheapFlight = cheapFlight;
            return this;
        }
        public Boolean getCheapFlight() {
            return this.cheapFlight;
        }

    }

    public static class IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo extends TeaModel {
        @NameInMap("operating_airline_info")
        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo operatingAirlineInfo;

        /**
         * <strong>example:</strong>
         * <p>CX601</p>
         */
        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        public static IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo self = new IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo setOperatingAirlineInfo(IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo operatingAirlineInfo) {
            this.operatingAirlineInfo = operatingAirlineInfo;
            return this;
        }
        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo getOperatingAirlineInfo() {
            return this.operatingAirlineInfo;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

    }

    public static class IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo extends TeaModel {
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
         * <p>T3</p>
         */
        @NameInMap("stop_arr_term")
        public String stopArrTerm;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("stop_arr_time")
        public String stopArrTime;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("stop_city_code")
        public String stopCityCode;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("stop_city_name")
        public String stopCityName;

        @NameInMap("stop_city_names")
        public java.util.List<String> stopCityNames;

        /**
         * <strong>example:</strong>
         * <p>T4</p>
         */
        @NameInMap("stop_dep_term")
        public String stopDepTerm;

        /**
         * <strong>example:</strong>
         * <p>2023-08-13 07:25</p>
         */
        @NameInMap("stop_dep_time")
        public String stopDepTime;

        @NameInMap("stop_time")
        public String stopTime;

        public static IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo self = new IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopAirport(String stopAirport) {
            this.stopAirport = stopAirport;
            return this;
        }
        public String getStopAirport() {
            return this.stopAirport;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopAirportName(String stopAirportName) {
            this.stopAirportName = stopAirportName;
            return this;
        }
        public String getStopAirportName() {
            return this.stopAirportName;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopArrTerm(String stopArrTerm) {
            this.stopArrTerm = stopArrTerm;
            return this;
        }
        public String getStopArrTerm() {
            return this.stopArrTerm;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopCityCode(String stopCityCode) {
            this.stopCityCode = stopCityCode;
            return this;
        }
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopCityName(String stopCityName) {
            this.stopCityName = stopCityName;
            return this;
        }
        public String getStopCityName() {
            return this.stopCityName;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopCityNames(java.util.List<String> stopCityNames) {
            this.stopCityNames = stopCityNames;
            return this;
        }
        public java.util.List<String> getStopCityNames() {
            return this.stopCityNames;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopDepTerm(String stopDepTerm) {
            this.stopDepTerm = stopDepTerm;
            return this;
        }
        public String getStopDepTerm() {
            return this.stopDepTerm;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

    }

    public static class IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos extends TeaModel {
        @NameInMap("airline_info")
        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo airlineInfo;

        @NameInMap("arr_airport_info")
        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo arrAirportInfo;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_city_name")
        public String arrCityName;

        /**
         * <strong>example:</strong>
         * <p>2023-08-13 09:45</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("baggage_desc")
        public String baggageDesc;

        @NameInMap("dep_airport_info")
        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo depAirportInfo;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
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
         * <p>duration</p>
         * 
         * <strong>example:</strong>
         * <p>140</p>
         */
        @NameInMap("duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>HO1116</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("flight_share_info")
        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo flightShareInfo;

        @NameInMap("flight_size")
        public String flightSize;

        @NameInMap("flight_stop_info")
        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo flightStopInfo;

        /**
         * <strong>example:</strong>
         * <p>320</p>
         */
        @NameInMap("flight_type")
        public String flightType;

        @NameInMap("manufacturer")
        public String manufacturer;

        @NameInMap("meal_desc")
        public String mealDesc;

        /**
         * <strong>example:</strong>
         * <p>100099</p>
         */
        @NameInMap("miles")
        public Integer miles;

        /**
         * <strong>example:</strong>
         * <p>80.20%</p>
         */
        @NameInMap("on_time_rate")
        public String onTimeRate;

        /**
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>KN6728HGHPKX0725</p>
         */
        @NameInMap("segment_key")
        public String segmentKey;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("share")
        public Boolean share;

        @NameInMap("short_flight_size")
        public String shortFlightSize;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("stop")
        public Boolean stop;

        @NameInMap("total_time")
        public String totalTime;

        @NameInMap("transfer_time")
        public String transferTime;

        /**
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("transfer_time_number")
        public Integer transferTimeNumber;

        public static IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos self = new IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos();
            return TeaModel.build(map, self);
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setAirlineInfo(IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo airlineInfo) {
            this.airlineInfo = airlineInfo;
            return this;
        }
        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setArrAirportInfo(IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo arrAirportInfo) {
            this.arrAirportInfo = arrAirportInfo;
            return this;
        }
        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setBaggageDesc(String baggageDesc) {
            this.baggageDesc = baggageDesc;
            return this;
        }
        public String getBaggageDesc() {
            return this.baggageDesc;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setDepAirportInfo(IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo depAirportInfo) {
            this.depAirportInfo = depAirportInfo;
            return this;
        }
        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setFlightShareInfo(IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo flightShareInfo) {
            this.flightShareInfo = flightShareInfo;
            return this;
        }
        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo getFlightShareInfo() {
            return this.flightShareInfo;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setFlightSize(String flightSize) {
            this.flightSize = flightSize;
            return this;
        }
        public String getFlightSize() {
            return this.flightSize;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setFlightStopInfo(IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo flightStopInfo) {
            this.flightStopInfo = flightStopInfo;
            return this;
        }
        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo getFlightStopInfo() {
            return this.flightStopInfo;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setFlightType(String flightType) {
            this.flightType = flightType;
            return this;
        }
        public String getFlightType() {
            return this.flightType;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setMealDesc(String mealDesc) {
            this.mealDesc = mealDesc;
            return this;
        }
        public String getMealDesc() {
            return this.mealDesc;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setMiles(Integer miles) {
            this.miles = miles;
            return this;
        }
        public Integer getMiles() {
            return this.miles;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setOnTimeRate(String onTimeRate) {
            this.onTimeRate = onTimeRate;
            return this;
        }
        public String getOnTimeRate() {
            return this.onTimeRate;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setOneMore(Integer oneMore) {
            this.oneMore = oneMore;
            return this;
        }
        public Integer getOneMore() {
            return this.oneMore;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setOneMoreShow(String oneMoreShow) {
            this.oneMoreShow = oneMoreShow;
            return this;
        }
        public String getOneMoreShow() {
            return this.oneMoreShow;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setSegmentKey(String segmentKey) {
            this.segmentKey = segmentKey;
            return this;
        }
        public String getSegmentKey() {
            return this.segmentKey;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setShare(Boolean share) {
            this.share = share;
            return this;
        }
        public Boolean getShare() {
            return this.share;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setShortFlightSize(String shortFlightSize) {
            this.shortFlightSize = shortFlightSize;
            return this;
        }
        public String getShortFlightSize() {
            return this.shortFlightSize;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setStop(Boolean stop) {
            this.stop = stop;
            return this;
        }
        public Boolean getStop() {
            return this.stop;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setTotalTime(String totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public String getTotalTime() {
            return this.totalTime;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setTransferTime(String transferTime) {
            this.transferTime = transferTime;
            return this;
        }
        public String getTransferTime() {
            return this.transferTime;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setTransferTimeNumber(Integer transferTimeNumber) {
            this.transferTimeNumber = transferTimeNumber;
            return this;
        }
        public Integer getTransferTimeNumber() {
            return this.transferTimeNumber;
        }

    }

    public static class IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_city_name")
        public String arrCityName;

        /**
         * <strong>example:</strong>
         * <p>2023-08-13 09:45</p>
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
         * <p>2023-08-13 07:25</p>
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
        public java.util.List<IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos> flightSegmentInfos;

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

        public static IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfos build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfos self = new IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfos();
            return TeaModel.build(map, self);
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfos setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfos setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfos setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfos setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfos setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfos setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfos setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfos setFlightSegmentInfos(java.util.List<IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos> flightSegmentInfos) {
            this.flightSegmentInfos = flightSegmentInfos;
            return this;
        }
        public java.util.List<IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos> getFlightSegmentInfos() {
            return this.flightSegmentInfos;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfos setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfos setTransferTime(Integer transferTime) {
            this.transferTime = transferTime;
            return this;
        }
        public Integer getTransferTime() {
            return this.transferTime;
        }

    }

    public static class IntlFlightListingSearchResponseBodyModuleFlightItemList extends TeaModel {
        @NameInMap("best_price_item")
        public IntlFlightListingSearchResponseBodyModuleFlightItemListBestPriceItem bestPriceItem;

        @NameInMap("flight_journey_infos")
        public java.util.List<IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfos> flightJourneyInfos;

        public static IntlFlightListingSearchResponseBodyModuleFlightItemList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightListingSearchResponseBodyModuleFlightItemList self = new IntlFlightListingSearchResponseBodyModuleFlightItemList();
            return TeaModel.build(map, self);
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemList setBestPriceItem(IntlFlightListingSearchResponseBodyModuleFlightItemListBestPriceItem bestPriceItem) {
            this.bestPriceItem = bestPriceItem;
            return this;
        }
        public IntlFlightListingSearchResponseBodyModuleFlightItemListBestPriceItem getBestPriceItem() {
            return this.bestPriceItem;
        }

        public IntlFlightListingSearchResponseBodyModuleFlightItemList setFlightJourneyInfos(java.util.List<IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfos> flightJourneyInfos) {
            this.flightJourneyInfos = flightJourneyInfos;
            return this;
        }
        public java.util.List<IntlFlightListingSearchResponseBodyModuleFlightItemListFlightJourneyInfos> getFlightJourneyInfos() {
            return this.flightJourneyInfos;
        }

    }

    public static class IntlFlightListingSearchResponseBodyModule extends TeaModel {
        @NameInMap("flight_item_list")
        public java.util.List<IntlFlightListingSearchResponseBodyModuleFlightItemList> flightItemList;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("need_continue")
        public Boolean needContinue;

        /**
         * <strong>example:</strong>
         * <p>ASDFASDFASDFASDFASDF</p>
         */
        @NameInMap("query_record_id")
        public String queryRecordId;

        /**
         * <strong>example:</strong>
         * <p>ee229f2d-1835-4199-bfe6-fd14afe8645e</p>
         */
        @NameInMap("token")
        public String token;

        public static IntlFlightListingSearchResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightListingSearchResponseBodyModule self = new IntlFlightListingSearchResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IntlFlightListingSearchResponseBodyModule setFlightItemList(java.util.List<IntlFlightListingSearchResponseBodyModuleFlightItemList> flightItemList) {
            this.flightItemList = flightItemList;
            return this;
        }
        public java.util.List<IntlFlightListingSearchResponseBodyModuleFlightItemList> getFlightItemList() {
            return this.flightItemList;
        }

        public IntlFlightListingSearchResponseBodyModule setNeedContinue(Boolean needContinue) {
            this.needContinue = needContinue;
            return this;
        }
        public Boolean getNeedContinue() {
            return this.needContinue;
        }

        public IntlFlightListingSearchResponseBodyModule setQueryRecordId(String queryRecordId) {
            this.queryRecordId = queryRecordId;
            return this;
        }
        public String getQueryRecordId() {
            return this.queryRecordId;
        }

        public IntlFlightListingSearchResponseBodyModule setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
