// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightListingSearchV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public FlightListingSearchV2ResponseBodyModule module;

    /**
     * <p>requestId</p>
     * 
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
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>210e842b16611337974412836dae27</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static FlightListingSearchV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightListingSearchV2ResponseBody self = new FlightListingSearchV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightListingSearchV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightListingSearchV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightListingSearchV2ResponseBody setModule(FlightListingSearchV2ResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightListingSearchV2ResponseBodyModule getModule() {
        return this.module;
    }

    public FlightListingSearchV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightListingSearchV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightListingSearchV2ResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightListingSearchV2ResponseBodyModuleFlightItemListBestPriceItemSubItems extends TeaModel {
        @NameInMap("shopping_item_map")
        public java.util.Map<String, ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValue> shoppingItemMap;

        /**
         * <strong>example:</strong>
         * <p>07df0bd9-f803-4a50-8449-f4bd675d9939</p>
         */
        @NameInMap("uniq_key")
        public String uniqKey;

        public static FlightListingSearchV2ResponseBodyModuleFlightItemListBestPriceItemSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchV2ResponseBodyModuleFlightItemListBestPriceItemSubItems self = new FlightListingSearchV2ResponseBodyModuleFlightItemListBestPriceItemSubItems();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListBestPriceItemSubItems setShoppingItemMap(java.util.Map<String, ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValue> shoppingItemMap) {
            this.shoppingItemMap = shoppingItemMap;
            return this;
        }
        public java.util.Map<String, ModuleFlightItemListBestPriceItemSubItemsShoppingItemMapValue> getShoppingItemMap() {
            return this.shoppingItemMap;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListBestPriceItemSubItems setUniqKey(String uniqKey) {
            this.uniqKey = uniqKey;
            return this;
        }
        public String getUniqKey() {
            return this.uniqKey;
        }

    }

    public static class FlightListingSearchV2ResponseBodyModuleFlightItemListBestPriceItem extends TeaModel {
        @NameInMap("flight_rule_infos")
        public java.util.Map<String, ModuleFlightItemListBestPriceItemFlightRuleInfosValue> flightRuleInfos;

        /**
         * <strong>example:</strong>
         * <p>e50d380fc05942cc8ac57af8ae02f448_0</p>
         */
        @NameInMap("item_id")
        public String itemId;

        @NameInMap("shopping_item_map")
        public java.util.Map<String, ModuleFlightItemListBestPriceItemShoppingItemMapValue> shoppingItemMap;

        @NameInMap("sub_item_position_map")
        public java.util.Map<String, java.util.List<ModuleFlightItemListBestPriceItemSubItemPositionMapValue>> subItemPositionMap;

        @NameInMap("sub_items")
        public java.util.List<FlightListingSearchV2ResponseBodyModuleFlightItemListBestPriceItemSubItems> subItems;

        public static FlightListingSearchV2ResponseBodyModuleFlightItemListBestPriceItem build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchV2ResponseBodyModuleFlightItemListBestPriceItem self = new FlightListingSearchV2ResponseBodyModuleFlightItemListBestPriceItem();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListBestPriceItem setFlightRuleInfos(java.util.Map<String, ModuleFlightItemListBestPriceItemFlightRuleInfosValue> flightRuleInfos) {
            this.flightRuleInfos = flightRuleInfos;
            return this;
        }
        public java.util.Map<String, ModuleFlightItemListBestPriceItemFlightRuleInfosValue> getFlightRuleInfos() {
            return this.flightRuleInfos;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListBestPriceItem setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListBestPriceItem setShoppingItemMap(java.util.Map<String, ModuleFlightItemListBestPriceItemShoppingItemMapValue> shoppingItemMap) {
            this.shoppingItemMap = shoppingItemMap;
            return this;
        }
        public java.util.Map<String, ModuleFlightItemListBestPriceItemShoppingItemMapValue> getShoppingItemMap() {
            return this.shoppingItemMap;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListBestPriceItem setSubItemPositionMap(java.util.Map<String, java.util.List<ModuleFlightItemListBestPriceItemSubItemPositionMapValue>> subItemPositionMap) {
            this.subItemPositionMap = subItemPositionMap;
            return this;
        }
        public java.util.Map<String, java.util.List<ModuleFlightItemListBestPriceItemSubItemPositionMapValue>> getSubItemPositionMap() {
            return this.subItemPositionMap;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListBestPriceItem setSubItems(java.util.List<FlightListingSearchV2ResponseBodyModuleFlightItemListBestPriceItemSubItems> subItems) {
            this.subItems = subItems;
            return this;
        }
        public java.util.List<FlightListingSearchV2ResponseBodyModuleFlightItemListBestPriceItemSubItems> getSubItems() {
            return this.subItems;
        }

    }

    public static class FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo extends TeaModel {
        @NameInMap("airline_chinese_name")
        public String airlineChineseName;

        @NameInMap("airline_chinese_short_name")
        public String airlineChineseShortName;

        /**
         * <strong>example:</strong>
         * <p>MU</p>
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

        public static FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo self = new FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo setAirlineChineseName(String airlineChineseName) {
            this.airlineChineseName = airlineChineseName;
            return this;
        }
        public String getAirlineChineseName() {
            return this.airlineChineseName;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo setAirlineChineseShortName(String airlineChineseShortName) {
            this.airlineChineseShortName = airlineChineseShortName;
            return this;
        }
        public String getAirlineChineseShortName() {
            return this.airlineChineseShortName;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo setAirlineIcon(String airlineIcon) {
            this.airlineIcon = airlineIcon;
            return this;
        }
        public String getAirlineIcon() {
            return this.airlineIcon;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo setCheapFlight(Boolean cheapFlight) {
            this.cheapFlight = cheapFlight;
            return this;
        }
        public Boolean getCheapFlight() {
            return this.cheapFlight;
        }

    }

    public static class FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PKX</p>
         */
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        /**
         * <strong>example:</strong>
         * <p>#FF7300</p>
         */
        @NameInMap("airport_name_color")
        public String airportNameColor;

        @NameInMap("airport_short_name")
        public String airportShortName;

        /**
         * <strong>example:</strong>
         * <p>--</p>
         */
        @NameInMap("terminal")
        public String terminal;

        public static FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo self = new FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo setAirportNameColor(String airportNameColor) {
            this.airportNameColor = airportNameColor;
            return this;
        }
        public String getAirportNameColor() {
            return this.airportNameColor;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        /**
         * <strong>example:</strong>
         * <p>#FF7300</p>
         */
        @NameInMap("airport_name_color")
        public String airportNameColor;

        @NameInMap("airport_short_name")
        public String airportShortName;

        /**
         * <strong>example:</strong>
         * <p>T3</p>
         */
        @NameInMap("terminal")
        public String terminal;

        public static FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo self = new FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo setAirportNameColor(String airportNameColor) {
            this.airportNameColor = airportNameColor;
            return this;
        }
        public String getAirportNameColor() {
            return this.airportNameColor;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo extends TeaModel {
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

        public static FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo self = new FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setAirlineChineseName(String airlineChineseName) {
            this.airlineChineseName = airlineChineseName;
            return this;
        }
        public String getAirlineChineseName() {
            return this.airlineChineseName;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setAirlineChineseShortName(String airlineChineseShortName) {
            this.airlineChineseShortName = airlineChineseShortName;
            return this;
        }
        public String getAirlineChineseShortName() {
            return this.airlineChineseShortName;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setAirlineIcon(String airlineIcon) {
            this.airlineIcon = airlineIcon;
            return this;
        }
        public String getAirlineIcon() {
            return this.airlineIcon;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setCheapFlight(Boolean cheapFlight) {
            this.cheapFlight = cheapFlight;
            return this;
        }
        public Boolean getCheapFlight() {
            return this.cheapFlight;
        }

    }

    public static class FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo extends TeaModel {
        @NameInMap("operating_airline_info")
        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo operatingAirlineInfo;

        /**
         * <strong>example:</strong>
         * <p>CX601</p>
         */
        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        public static FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo self = new FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo setOperatingAirlineInfo(FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo operatingAirlineInfo) {
            this.operatingAirlineInfo = operatingAirlineInfo;
            return this;
        }
        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo getOperatingAirlineInfo() {
            return this.operatingAirlineInfo;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

    }

    public static class FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo extends TeaModel {
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

        public static FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo self = new FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopAirport(String stopAirport) {
            this.stopAirport = stopAirport;
            return this;
        }
        public String getStopAirport() {
            return this.stopAirport;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopAirportName(String stopAirportName) {
            this.stopAirportName = stopAirportName;
            return this;
        }
        public String getStopAirportName() {
            return this.stopAirportName;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopArrTerm(String stopArrTerm) {
            this.stopArrTerm = stopArrTerm;
            return this;
        }
        public String getStopArrTerm() {
            return this.stopArrTerm;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopCityCode(String stopCityCode) {
            this.stopCityCode = stopCityCode;
            return this;
        }
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopCityName(String stopCityName) {
            this.stopCityName = stopCityName;
            return this;
        }
        public String getStopCityName() {
            return this.stopCityName;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopCityNames(java.util.List<String> stopCityNames) {
            this.stopCityNames = stopCityNames;
            return this;
        }
        public java.util.List<String> getStopCityNames() {
            return this.stopCityNames;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopDepTerm(String stopDepTerm) {
            this.stopDepTerm = stopDepTerm;
            return this;
        }
        public String getStopDepTerm() {
            return this.stopDepTerm;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

    }

    public static class FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos extends TeaModel {
        @NameInMap("airline_info")
        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo airlineInfo;

        @NameInMap("arr_airport_info")
        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo arrAirportInfo;

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
        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo depAirportInfo;

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

        @NameInMap("extra_info")
        public java.util.Map<String, ?> extraInfo;

        /**
         * <strong>example:</strong>
         * <p>MU5131</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("flight_share_info")
        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo flightShareInfo;

        @NameInMap("flight_size")
        public String flightSize;

        @NameInMap("flight_stop_info")
        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo flightStopInfo;

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

        @NameInMap("miles")
        public Integer miles;

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

        @NameInMap("transfer_time_number")
        public Integer transferTimeNumber;

        public static FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos self = new FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setAirlineInfo(FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo airlineInfo) {
            this.airlineInfo = airlineInfo;
            return this;
        }
        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setArrAirportInfo(FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo arrAirportInfo) {
            this.arrAirportInfo = arrAirportInfo;
            return this;
        }
        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setBaggageDesc(String baggageDesc) {
            this.baggageDesc = baggageDesc;
            return this;
        }
        public String getBaggageDesc() {
            return this.baggageDesc;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setDepAirportInfo(FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo depAirportInfo) {
            this.depAirportInfo = depAirportInfo;
            return this;
        }
        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setExtraInfo(java.util.Map<String, ?> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtraInfo() {
            return this.extraInfo;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setFlightShareInfo(FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo flightShareInfo) {
            this.flightShareInfo = flightShareInfo;
            return this;
        }
        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo getFlightShareInfo() {
            return this.flightShareInfo;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setFlightSize(String flightSize) {
            this.flightSize = flightSize;
            return this;
        }
        public String getFlightSize() {
            return this.flightSize;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setFlightStopInfo(FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo flightStopInfo) {
            this.flightStopInfo = flightStopInfo;
            return this;
        }
        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfo getFlightStopInfo() {
            return this.flightStopInfo;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setFlightType(String flightType) {
            this.flightType = flightType;
            return this;
        }
        public String getFlightType() {
            return this.flightType;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setMealDesc(String mealDesc) {
            this.mealDesc = mealDesc;
            return this;
        }
        public String getMealDesc() {
            return this.mealDesc;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setMiles(Integer miles) {
            this.miles = miles;
            return this;
        }
        public Integer getMiles() {
            return this.miles;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setOnTimeRate(String onTimeRate) {
            this.onTimeRate = onTimeRate;
            return this;
        }
        public String getOnTimeRate() {
            return this.onTimeRate;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setOneMore(Integer oneMore) {
            this.oneMore = oneMore;
            return this;
        }
        public Integer getOneMore() {
            return this.oneMore;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setOneMoreShow(String oneMoreShow) {
            this.oneMoreShow = oneMoreShow;
            return this;
        }
        public String getOneMoreShow() {
            return this.oneMoreShow;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setShare(Boolean share) {
            this.share = share;
            return this;
        }
        public Boolean getShare() {
            return this.share;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setShortFlightSize(String shortFlightSize) {
            this.shortFlightSize = shortFlightSize;
            return this;
        }
        public String getShortFlightSize() {
            return this.shortFlightSize;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setStop(Boolean stop) {
            this.stop = stop;
            return this;
        }
        public Boolean getStop() {
            return this.stop;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setTotalTime(String totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public String getTotalTime() {
            return this.totalTime;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setTransferTime(String transferTime) {
            this.transferTime = transferTime;
            return this;
        }
        public String getTransferTime() {
            return this.transferTime;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos setTransferTimeNumber(Integer transferTimeNumber) {
            this.transferTimeNumber = transferTimeNumber;
            return this;
        }
        public Integer getTransferTimeNumber() {
            return this.transferTimeNumber;
        }

    }

    public static class FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfos extends TeaModel {
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
         * <p>140</p>
         */
        @NameInMap("duration")
        public Integer duration;

        @NameInMap("extensions")
        public java.util.Map<String, String> extensions;

        @NameInMap("flight_segment_infos")
        public java.util.List<FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos> flightSegmentInfos;

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

        public static FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfos build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfos self = new FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfos();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfos setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfos setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfos setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfos setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfos setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfos setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfos setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfos setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfos setFlightSegmentInfos(java.util.List<FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos> flightSegmentInfos) {
            this.flightSegmentInfos = flightSegmentInfos;
            return this;
        }
        public java.util.List<FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfosFlightSegmentInfos> getFlightSegmentInfos() {
            return this.flightSegmentInfos;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfos setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfos setTransferTime(Integer transferTime) {
            this.transferTime = transferTime;
            return this;
        }
        public Integer getTransferTime() {
            return this.transferTime;
        }

    }

    public static class FlightListingSearchV2ResponseBodyModuleFlightItemListItemListSubItems extends TeaModel {
        @NameInMap("shopping_item_map")
        public java.util.Map<String, ModuleFlightItemListItemListSubItemsShoppingItemMapValue> shoppingItemMap;

        /**
         * <strong>example:</strong>
         * <p>07df0bd9-f803-4a50-8449-f4bd675d9939</p>
         */
        @NameInMap("uniq_key")
        public String uniqKey;

        public static FlightListingSearchV2ResponseBodyModuleFlightItemListItemListSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchV2ResponseBodyModuleFlightItemListItemListSubItems self = new FlightListingSearchV2ResponseBodyModuleFlightItemListItemListSubItems();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListItemListSubItems setShoppingItemMap(java.util.Map<String, ModuleFlightItemListItemListSubItemsShoppingItemMapValue> shoppingItemMap) {
            this.shoppingItemMap = shoppingItemMap;
            return this;
        }
        public java.util.Map<String, ModuleFlightItemListItemListSubItemsShoppingItemMapValue> getShoppingItemMap() {
            return this.shoppingItemMap;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListItemListSubItems setUniqKey(String uniqKey) {
            this.uniqKey = uniqKey;
            return this;
        }
        public String getUniqKey() {
            return this.uniqKey;
        }

    }

    public static class FlightListingSearchV2ResponseBodyModuleFlightItemListItemList extends TeaModel {
        @NameInMap("flight_rule_infos")
        public java.util.Map<String, ModuleFlightItemListItemListFlightRuleInfosValue> flightRuleInfos;

        /**
         * <strong>example:</strong>
         * <p>e50d380fc05942cc8ac57af8ae02f448_0</p>
         */
        @NameInMap("item_id")
        public String itemId;

        @NameInMap("shopping_item_map")
        public java.util.Map<String, ModuleFlightItemListItemListShoppingItemMapValue> shoppingItemMap;

        @NameInMap("sub_item_position_map")
        public java.util.Map<String, java.util.List<ModuleFlightItemListItemListSubItemPositionMapValue>> subItemPositionMap;

        @NameInMap("sub_items")
        public java.util.List<FlightListingSearchV2ResponseBodyModuleFlightItemListItemListSubItems> subItems;

        public static FlightListingSearchV2ResponseBodyModuleFlightItemListItemList build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchV2ResponseBodyModuleFlightItemListItemList self = new FlightListingSearchV2ResponseBodyModuleFlightItemListItemList();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListItemList setFlightRuleInfos(java.util.Map<String, ModuleFlightItemListItemListFlightRuleInfosValue> flightRuleInfos) {
            this.flightRuleInfos = flightRuleInfos;
            return this;
        }
        public java.util.Map<String, ModuleFlightItemListItemListFlightRuleInfosValue> getFlightRuleInfos() {
            return this.flightRuleInfos;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListItemList setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListItemList setShoppingItemMap(java.util.Map<String, ModuleFlightItemListItemListShoppingItemMapValue> shoppingItemMap) {
            this.shoppingItemMap = shoppingItemMap;
            return this;
        }
        public java.util.Map<String, ModuleFlightItemListItemListShoppingItemMapValue> getShoppingItemMap() {
            return this.shoppingItemMap;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListItemList setSubItemPositionMap(java.util.Map<String, java.util.List<ModuleFlightItemListItemListSubItemPositionMapValue>> subItemPositionMap) {
            this.subItemPositionMap = subItemPositionMap;
            return this;
        }
        public java.util.Map<String, java.util.List<ModuleFlightItemListItemListSubItemPositionMapValue>> getSubItemPositionMap() {
            return this.subItemPositionMap;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemListItemList setSubItems(java.util.List<FlightListingSearchV2ResponseBodyModuleFlightItemListItemListSubItems> subItems) {
            this.subItems = subItems;
            return this;
        }
        public java.util.List<FlightListingSearchV2ResponseBodyModuleFlightItemListItemListSubItems> getSubItems() {
            return this.subItems;
        }

    }

    public static class FlightListingSearchV2ResponseBodyModuleFlightItemList extends TeaModel {
        @NameInMap("best_price_item")
        public FlightListingSearchV2ResponseBodyModuleFlightItemListBestPriceItem bestPriceItem;

        @NameInMap("flight_journey_infos")
        public java.util.List<FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfos> flightJourneyInfos;

        @NameInMap("item_list")
        public java.util.List<FlightListingSearchV2ResponseBodyModuleFlightItemListItemList> itemList;

        public static FlightListingSearchV2ResponseBodyModuleFlightItemList build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchV2ResponseBodyModuleFlightItemList self = new FlightListingSearchV2ResponseBodyModuleFlightItemList();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemList setBestPriceItem(FlightListingSearchV2ResponseBodyModuleFlightItemListBestPriceItem bestPriceItem) {
            this.bestPriceItem = bestPriceItem;
            return this;
        }
        public FlightListingSearchV2ResponseBodyModuleFlightItemListBestPriceItem getBestPriceItem() {
            return this.bestPriceItem;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemList setFlightJourneyInfos(java.util.List<FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfos> flightJourneyInfos) {
            this.flightJourneyInfos = flightJourneyInfos;
            return this;
        }
        public java.util.List<FlightListingSearchV2ResponseBodyModuleFlightItemListFlightJourneyInfos> getFlightJourneyInfos() {
            return this.flightJourneyInfos;
        }

        public FlightListingSearchV2ResponseBodyModuleFlightItemList setItemList(java.util.List<FlightListingSearchV2ResponseBodyModuleFlightItemListItemList> itemList) {
            this.itemList = itemList;
            return this;
        }
        public java.util.List<FlightListingSearchV2ResponseBodyModuleFlightItemListItemList> getItemList() {
            return this.itemList;
        }

    }

    public static class FlightListingSearchV2ResponseBodyModule extends TeaModel {
        @NameInMap("flight_item_list")
        public java.util.List<FlightListingSearchV2ResponseBodyModuleFlightItemList> flightItemList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("search_mode")
        public Integer searchMode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("trip_type")
        public Integer tripType;

        public static FlightListingSearchV2ResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchV2ResponseBodyModule self = new FlightListingSearchV2ResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchV2ResponseBodyModule setFlightItemList(java.util.List<FlightListingSearchV2ResponseBodyModuleFlightItemList> flightItemList) {
            this.flightItemList = flightItemList;
            return this;
        }
        public java.util.List<FlightListingSearchV2ResponseBodyModuleFlightItemList> getFlightItemList() {
            return this.flightItemList;
        }

        public FlightListingSearchV2ResponseBodyModule setSearchMode(Integer searchMode) {
            this.searchMode = searchMode;
            return this;
        }
        public Integer getSearchMode() {
            return this.searchMode;
        }

        public FlightListingSearchV2ResponseBodyModule setTripType(Integer tripType) {
            this.tripType = tripType;
            return this;
        }
        public Integer getTripType() {
            return this.tripType;
        }

    }

}
