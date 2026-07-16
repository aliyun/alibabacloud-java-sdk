// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopListSearchResponseBody extends TeaModel {
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
    public IntlFlightReShopListSearchResponseBodyModule module;

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

    public static IntlFlightReShopListSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopListSearchResponseBody self = new IntlFlightReShopListSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopListSearchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IntlFlightReShopListSearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IntlFlightReShopListSearchResponseBody setModule(IntlFlightReShopListSearchResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IntlFlightReShopListSearchResponseBodyModule getModule() {
        return this.module;
    }

    public IntlFlightReShopListSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IntlFlightReShopListSearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IntlFlightReShopListSearchResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItemSubItemsSegmentPositionList extends TeaModel {
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
        @NameInMap("segment_index")
        public Integer segmentIndex;

        public static IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItemSubItemsSegmentPositionList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItemSubItemsSegmentPositionList self = new IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItemSubItemsSegmentPositionList();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItemSubItemsSegmentPositionList setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItemSubItemsSegmentPositionList setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

    }

    public static class IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItemSubItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5.1</p>
         */
        @NameInMap("discount_num")
        public Double discountNum;

        @NameInMap("segment_keys")
        public java.util.List<String> segmentKeys;

        @NameInMap("segment_position_list")
        public java.util.List<IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItemSubItemsSegmentPositionList> segmentPositionList;

        @NameInMap("shopping_item_map")
        public java.util.Map<String, ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValue> shoppingItemMap;

        /**
         * <strong>example:</strong>
         * <p>07df0bd9-f803-4a50-8449-f4bd675d9939</p>
         */
        @NameInMap("uniq_key")
        public String uniqKey;

        public static IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItemSubItems build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItemSubItems self = new IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItemSubItems();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItemSubItems setDiscountNum(Double discountNum) {
            this.discountNum = discountNum;
            return this;
        }
        public Double getDiscountNum() {
            return this.discountNum;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItemSubItems setSegmentKeys(java.util.List<String> segmentKeys) {
            this.segmentKeys = segmentKeys;
            return this;
        }
        public java.util.List<String> getSegmentKeys() {
            return this.segmentKeys;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItemSubItems setSegmentPositionList(java.util.List<IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItemSubItemsSegmentPositionList> segmentPositionList) {
            this.segmentPositionList = segmentPositionList;
            return this;
        }
        public java.util.List<IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItemSubItemsSegmentPositionList> getSegmentPositionList() {
            return this.segmentPositionList;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItemSubItems setShoppingItemMap(java.util.Map<String, ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValue> shoppingItemMap) {
            this.shoppingItemMap = shoppingItemMap;
            return this;
        }
        public java.util.Map<String, ModuleReShopItemListBestPriceItemSubItemsShoppingItemMapValue> getShoppingItemMap() {
            return this.shoppingItemMap;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItemSubItems setUniqKey(String uniqKey) {
            this.uniqKey = uniqKey;
            return this;
        }
        public String getUniqKey() {
            return this.uniqKey;
        }

    }

    public static class IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItem extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>b83e3d6ebb8b44dfb94c763abc66c966_2</p>
         */
        @NameInMap("item_id")
        public String itemId;

        /**
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("item_type")
        public String itemType;

        @NameInMap("shopping_item_map")
        public java.util.Map<String, ModuleReShopItemListBestPriceItemShoppingItemMapValue> shoppingItemMap;

        @NameInMap("sub_items")
        public java.util.List<IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItemSubItems> subItems;

        public static IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItem build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItem self = new IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItem();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItem setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItem setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItem setShoppingItemMap(java.util.Map<String, ModuleReShopItemListBestPriceItemShoppingItemMapValue> shoppingItemMap) {
            this.shoppingItemMap = shoppingItemMap;
            return this;
        }
        public java.util.Map<String, ModuleReShopItemListBestPriceItemShoppingItemMapValue> getShoppingItemMap() {
            return this.shoppingItemMap;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItem setSubItems(java.util.List<IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItemSubItems> subItems) {
            this.subItems = subItems;
            return this;
        }
        public java.util.List<IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItemSubItems> getSubItems() {
            return this.subItems;
        }

    }

    public static class IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CA</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        /**
         * <strong>example:</strong>
         * <p>中国国航</p>
         */
        @NameInMap("airline_name")
        public String airlineName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("cheap_airline")
        public Boolean cheapAirline;

        /**
         * <strong>example:</strong>
         * <p>https://</p>
         */
        @NameInMap("icon_url")
        public String iconUrl;

        /**
         * <strong>example:</strong>
         * <p>国航</p>
         */
        @NameInMap("short_name")
        public String shortName;

        public static IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo self = new IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo setCheapAirline(Boolean cheapAirline) {
            this.cheapAirline = cheapAirline;
            return this;
        }
        public Boolean getCheapAirline() {
            return this.cheapAirline;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

    }

    public static class IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("airport_code")
        public String airportCode;

        /**
         * <strong>example:</strong>
         * <p>萧山国际机场</p>
         */
        @NameInMap("airport_name")
        public String airportName;

        /**
         * <strong>example:</strong>
         * <p>萧山</p>
         */
        @NameInMap("airport_short_name")
        public String airportShortName;

        /**
         * <strong>example:</strong>
         * <p>T3</p>
         */
        @NameInMap("terminal")
        public String terminal;

        public static IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo self = new IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PKX</p>
         */
        @NameInMap("airport_code")
        public String airportCode;

        /**
         * <strong>example:</strong>
         * <p>大兴国际机场</p>
         */
        @NameInMap("airport_name")
        public String airportName;

        /**
         * <strong>example:</strong>
         * <p>大兴</p>
         */
        @NameInMap("airport_short_name")
        public String airportShortName;

        /**
         * <strong>example:</strong>
         * <p>T3</p>
         */
        @NameInMap("terminal")
        public String terminal;

        public static IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo self = new IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CA</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        /**
         * <strong>example:</strong>
         * <p>中国国航</p>
         */
        @NameInMap("airline_name")
        public String airlineName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("cheap_airline")
        public Boolean cheapAirline;

        /**
         * <strong>example:</strong>
         * <p>https://</p>
         */
        @NameInMap("icon_url")
        public String iconUrl;

        /**
         * <strong>example:</strong>
         * <p>国航</p>
         */
        @NameInMap("short_name")
        public String shortName;

        public static IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo self = new IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setCheapAirline(Boolean cheapAirline) {
            this.cheapAirline = cheapAirline;
            return this;
        }
        public Boolean getCheapAirline() {
            return this.cheapAirline;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

    }

    public static class IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo extends TeaModel {
        @NameInMap("operating_airline_info")
        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo operatingAirlineInfo;

        /**
         * <strong>example:</strong>
         * <p>CX601</p>
         */
        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        public static IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo self = new IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo setOperatingAirlineInfo(IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo operatingAirlineInfo) {
            this.operatingAirlineInfo = operatingAirlineInfo;
            return this;
        }
        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfoOperatingAirlineInfo getOperatingAirlineInfo() {
            return this.operatingAirlineInfo;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

    }

    public static class IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>330182</p>
         */
        @NameInMap("adcode")
        public String adcode;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("airport_city_code")
        public String airportCityCode;

        /**
         * <strong>example:</strong>
         * <p>杭州</p>
         */
        @NameInMap("airport_city_name")
        public String airportCityName;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("airport_code")
        public String airportCode;

        /**
         * <strong>example:</strong>
         * <p>萧山国际机场</p>
         */
        @NameInMap("airport_name")
        public String airportName;

        /**
         * <strong>example:</strong>
         * <p>杭州</p>
         */
        @NameInMap("airport_parent_city_name")
        public String airportParentCityName;

        /**
         * <strong>example:</strong>
         * <p>杭州</p>
         */
        @NameInMap("county_city_adcode")
        public String countyCityAdcode;

        /**
         * <strong>example:</strong>
         * <p>330182</p>
         */
        @NameInMap("county_city_name")
        public String countyCityName;

        /**
         * <strong>example:</strong>
         * <p>330182</p>
         */
        @NameInMap("prefecture_city_adcode")
        public String prefectureCityAdcode;

        /**
         * <strong>example:</strong>
         * <p>杭州</p>
         */
        @NameInMap("prefecture_city_name")
        public String prefectureCityName;

        public static IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo self = new IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo setAdcode(String adcode) {
            this.adcode = adcode;
            return this;
        }
        public String getAdcode() {
            return this.adcode;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo setAirportCityCode(String airportCityCode) {
            this.airportCityCode = airportCityCode;
            return this;
        }
        public String getAirportCityCode() {
            return this.airportCityCode;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo setAirportCityName(String airportCityName) {
            this.airportCityName = airportCityName;
            return this;
        }
        public String getAirportCityName() {
            return this.airportCityName;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo setAirportParentCityName(String airportParentCityName) {
            this.airportParentCityName = airportParentCityName;
            return this;
        }
        public String getAirportParentCityName() {
            return this.airportParentCityName;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo setCountyCityAdcode(String countyCityAdcode) {
            this.countyCityAdcode = countyCityAdcode;
            return this;
        }
        public String getCountyCityAdcode() {
            return this.countyCityAdcode;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo setCountyCityName(String countyCityName) {
            this.countyCityName = countyCityName;
            return this;
        }
        public String getCountyCityName() {
            return this.countyCityName;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo setPrefectureCityAdcode(String prefectureCityAdcode) {
            this.prefectureCityAdcode = prefectureCityAdcode;
            return this;
        }
        public String getPrefectureCityAdcode() {
            return this.prefectureCityAdcode;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo setPrefectureCityName(String prefectureCityName) {
            this.prefectureCityName = prefectureCityName;
            return this;
        }
        public String getPrefectureCityName() {
            return this.prefectureCityName;
        }

    }

    public static class IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("stop_airport")
        public String stopAirport;

        @NameInMap("stop_airport_county_info")
        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo stopAirportCountyInfo;

        /**
         * <strong>example:</strong>
         * <p>萧山国际机场</p>
         */
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
         * <p>BJS</p>
         */
        @NameInMap("stop_city_code")
        public String stopCityCode;

        /**
         * <strong>example:</strong>
         * <p>北京</p>
         */
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
         * <p>60</p>
         */
        @NameInMap("stop_time")
        public String stopTime;

        public static IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoList self = new IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoList();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoList setStopAirport(String stopAirport) {
            this.stopAirport = stopAirport;
            return this;
        }
        public String getStopAirport() {
            return this.stopAirport;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoList setStopAirportCountyInfo(IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo stopAirportCountyInfo) {
            this.stopAirportCountyInfo = stopAirportCountyInfo;
            return this;
        }
        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoListStopAirportCountyInfo getStopAirportCountyInfo() {
            return this.stopAirportCountyInfo;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoList setStopAirportName(String stopAirportName) {
            this.stopAirportName = stopAirportName;
            return this;
        }
        public String getStopAirportName() {
            return this.stopAirportName;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoList setStopArrTerm(String stopArrTerm) {
            this.stopArrTerm = stopArrTerm;
            return this;
        }
        public String getStopArrTerm() {
            return this.stopArrTerm;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoList setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoList setStopCityCode(String stopCityCode) {
            this.stopCityCode = stopCityCode;
            return this;
        }
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoList setStopCityName(String stopCityName) {
            this.stopCityName = stopCityName;
            return this;
        }
        public String getStopCityName() {
            return this.stopCityName;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoList setStopDepTerm(String stopDepTerm) {
            this.stopDepTerm = stopDepTerm;
            return this;
        }
        public String getStopDepTerm() {
            return this.stopDepTerm;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoList setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoList setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

    }

    public static class IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo extends TeaModel {
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

        public static IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo self = new IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo setDepCityLuggageDirect(Integer depCityLuggageDirect) {
            this.depCityLuggageDirect = depCityLuggageDirect;
            return this;
        }
        public Integer getDepCityLuggageDirect() {
            return this.depCityLuggageDirect;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo setStopCityLuggageDirect(Integer stopCityLuggageDirect) {
            this.stopCityLuggageDirect = stopCityLuggageDirect;
            return this;
        }
        public Integer getStopCityLuggageDirect() {
            return this.stopCityLuggageDirect;
        }

    }

    public static class IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosOtherInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2.5年</p>
         */
        @NameInMap("aircraft_age")
        public String aircraftAge;

        /**
         * <strong>example:</strong>
         * <p>平均延误58分钟</p>
         */
        @NameInMap("avg_delay_time")
        public String avgDelayTime;

        /**
         * <strong>example:</strong>
         * <p>10%</p>
         */
        @NameInMap("flight_cancel_rate")
        public String flightCancelRate;

        /**
         * <strong>example:</strong>
         * <p>10%</p>
         */
        @NameInMap("jet_bridge_rate")
        public String jetBridgeRate;

        /**
         * <strong>example:</strong>
         * <p>到达准点率90%</p>
         */
        @NameInMap("on_time_rate")
        public String onTimeRate;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("wifi")
        public Boolean wifi;

        public static IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosOtherInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosOtherInfo self = new IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosOtherInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosOtherInfo setAircraftAge(String aircraftAge) {
            this.aircraftAge = aircraftAge;
            return this;
        }
        public String getAircraftAge() {
            return this.aircraftAge;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosOtherInfo setAvgDelayTime(String avgDelayTime) {
            this.avgDelayTime = avgDelayTime;
            return this;
        }
        public String getAvgDelayTime() {
            return this.avgDelayTime;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosOtherInfo setFlightCancelRate(String flightCancelRate) {
            this.flightCancelRate = flightCancelRate;
            return this;
        }
        public String getFlightCancelRate() {
            return this.flightCancelRate;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosOtherInfo setJetBridgeRate(String jetBridgeRate) {
            this.jetBridgeRate = jetBridgeRate;
            return this;
        }
        public String getJetBridgeRate() {
            return this.jetBridgeRate;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosOtherInfo setOnTimeRate(String onTimeRate) {
            this.onTimeRate = onTimeRate;
            return this;
        }
        public String getOnTimeRate() {
            return this.onTimeRate;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosOtherInfo setWifi(Boolean wifi) {
            this.wifi = wifi;
            return this;
        }
        public Boolean getWifi() {
            return this.wifi;
        }

    }

    public static class IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>前往菲律宾的旅客，请确保持有往返纸质行程单以及纸质签证办理登记手续，否则可能会被当地政府拒绝入境</p>
         */
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

        public static IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark self = new IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark setDepCityVisaRemark(String depCityVisaRemark) {
            this.depCityVisaRemark = depCityVisaRemark;
            return this;
        }
        public String getDepCityVisaRemark() {
            return this.depCityVisaRemark;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark setDepCityVisaType(Integer depCityVisaType) {
            this.depCityVisaType = depCityVisaType;
            return this;
        }
        public Integer getDepCityVisaType() {
            return this.depCityVisaType;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark setStopCityVisaRemarks(java.util.List<String> stopCityVisaRemarks) {
            this.stopCityVisaRemarks = stopCityVisaRemarks;
            return this;
        }
        public java.util.List<String> getStopCityVisaRemarks() {
            return this.stopCityVisaRemarks;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark setStopCityVisaTypes(java.util.List<Integer> stopCityVisaTypes) {
            this.stopCityVisaTypes = stopCityVisaTypes;
            return this;
        }
        public java.util.List<Integer> getStopCityVisaTypes() {
            return this.stopCityVisaTypes;
        }

    }

    public static class IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CA</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        /**
         * <strong>example:</strong>
         * <p>中国国航</p>
         */
        @NameInMap("airline_name")
        public String airlineName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("cheap_airline")
        public Boolean cheapAirline;

        /**
         * <strong>example:</strong>
         * <p>https://</p>
         */
        @NameInMap("icon_url")
        public String iconUrl;

        /**
         * <strong>example:</strong>
         * <p>国航</p>
         */
        @NameInMap("short_name")
        public String shortName;

        public static IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo self = new IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo setCheapAirline(Boolean cheapAirline) {
            this.cheapAirline = cheapAirline;
            return this;
        }
        public Boolean getCheapAirline() {
            return this.cheapAirline;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

    }

    public static class IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos extends TeaModel {
        @NameInMap("airline_info")
        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo airlineInfo;

        @NameInMap("arr_airport_info")
        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo arrAirportInfo;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <strong>example:</strong>
         * <p>杭州</p>
         */
        @NameInMap("arr_city_name")
        public String arrCityName;

        /**
         * <strong>example:</strong>
         * <p>2023-08-13 09:25</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>2022-06-06T12:56:34Z</p>
         */
        @NameInMap("arr_time_u_t_c")
        public String arrTimeUTC;

        @NameInMap("dep_airport_info")
        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo depAirportInfo;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <strong>example:</strong>
         * <p>北京</p>
         */
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
         * <p>2022-06-06T12:56:34Z</p>
         */
        @NameInMap("dep_time_u_t_c")
        public String depTimeUTC;

        /**
         * <strong>example:</strong>
         * <p>320</p>
         */
        @NameInMap("duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>CA2013</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("flight_share_info")
        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo flightShareInfo;

        /**
         * <strong>example:</strong>
         * <p>中型机</p>
         */
        @NameInMap("flight_size")
        public String flightSize;

        @NameInMap("flight_stop_info_list")
        public java.util.List<IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoList> flightStopInfoList;

        /**
         * <strong>example:</strong>
         * <p>320</p>
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
        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo luggageDirectInfo;

        /**
         * <strong>example:</strong>
         * <p>空客</p>
         */
        @NameInMap("manufacturer")
        public String manufacturer;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("meal")
        public Integer meal;

        /**
         * <strong>example:</strong>
         * <p>小食</p>
         */
        @NameInMap("meal_desc")
        public String mealDesc;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("miles")
        public Integer miles;

        /**
         * <strong>example:</strong>
         * <p>90%</p>
         */
        @NameInMap("on_time_rate")
        public String onTimeRate;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("one_more")
        public Integer oneMore;

        /**
         * <strong>example:</strong>
         * <p>+1天</p>
         */
        @NameInMap("one_more_show")
        public String oneMoreShow;

        @NameInMap("other_info")
        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosOtherInfo otherInfo;

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

        @NameInMap("segment_visa_remark")
        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark segmentVisaRemark;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("share")
        public Boolean share;

        /**
         * <strong>example:</strong>
         * <p>中</p>
         */
        @NameInMap("short_flight_size")
        public String shortFlightSize;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("stop")
        public Boolean stop;

        @NameInMap("ticketing_airline_info")
        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo ticketingAirlineInfo;

        /**
         * <strong>example:</strong>
         * <p>5小时20分</p>
         */
        @NameInMap("total_time")
        public String totalTime;

        public static IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos self = new IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setAirlineInfo(IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo airlineInfo) {
            this.airlineInfo = airlineInfo;
            return this;
        }
        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosAirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setArrAirportInfo(IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo arrAirportInfo) {
            this.arrAirportInfo = arrAirportInfo;
            return this;
        }
        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setArrTimeUTC(String arrTimeUTC) {
            this.arrTimeUTC = arrTimeUTC;
            return this;
        }
        public String getArrTimeUTC() {
            return this.arrTimeUTC;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setDepAirportInfo(IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo depAirportInfo) {
            this.depAirportInfo = depAirportInfo;
            return this;
        }
        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosDepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setDepTimeUTC(String depTimeUTC) {
            this.depTimeUTC = depTimeUTC;
            return this;
        }
        public String getDepTimeUTC() {
            return this.depTimeUTC;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setFlightShareInfo(IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo flightShareInfo) {
            this.flightShareInfo = flightShareInfo;
            return this;
        }
        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightShareInfo getFlightShareInfo() {
            return this.flightShareInfo;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setFlightSize(String flightSize) {
            this.flightSize = flightSize;
            return this;
        }
        public String getFlightSize() {
            return this.flightSize;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setFlightStopInfoList(java.util.List<IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoList> flightStopInfoList) {
            this.flightStopInfoList = flightStopInfoList;
            return this;
        }
        public java.util.List<IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosFlightStopInfoList> getFlightStopInfoList() {
            return this.flightStopInfoList;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setFlightType(String flightType) {
            this.flightType = flightType;
            return this;
        }
        public String getFlightType() {
            return this.flightType;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setLuggageDirectInfo(IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo luggageDirectInfo) {
            this.luggageDirectInfo = luggageDirectInfo;
            return this;
        }
        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosLuggageDirectInfo getLuggageDirectInfo() {
            return this.luggageDirectInfo;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setMeal(Integer meal) {
            this.meal = meal;
            return this;
        }
        public Integer getMeal() {
            return this.meal;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setMealDesc(String mealDesc) {
            this.mealDesc = mealDesc;
            return this;
        }
        public String getMealDesc() {
            return this.mealDesc;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setMiles(Integer miles) {
            this.miles = miles;
            return this;
        }
        public Integer getMiles() {
            return this.miles;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setOnTimeRate(String onTimeRate) {
            this.onTimeRate = onTimeRate;
            return this;
        }
        public String getOnTimeRate() {
            return this.onTimeRate;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setOneMore(Integer oneMore) {
            this.oneMore = oneMore;
            return this;
        }
        public Integer getOneMore() {
            return this.oneMore;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setOneMoreShow(String oneMoreShow) {
            this.oneMoreShow = oneMoreShow;
            return this;
        }
        public String getOneMoreShow() {
            return this.oneMoreShow;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setOtherInfo(IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosOtherInfo otherInfo) {
            this.otherInfo = otherInfo;
            return this;
        }
        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosOtherInfo getOtherInfo() {
            return this.otherInfo;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setSegmentKey(String segmentKey) {
            this.segmentKey = segmentKey;
            return this;
        }
        public String getSegmentKey() {
            return this.segmentKey;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setSegmentVisaRemark(IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark segmentVisaRemark) {
            this.segmentVisaRemark = segmentVisaRemark;
            return this;
        }
        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosSegmentVisaRemark getSegmentVisaRemark() {
            return this.segmentVisaRemark;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setShare(Boolean share) {
            this.share = share;
            return this;
        }
        public Boolean getShare() {
            return this.share;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setShortFlightSize(String shortFlightSize) {
            this.shortFlightSize = shortFlightSize;
            return this;
        }
        public String getShortFlightSize() {
            return this.shortFlightSize;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setStop(Boolean stop) {
            this.stop = stop;
            return this;
        }
        public Boolean getStop() {
            return this.stop;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setTicketingAirlineInfo(IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo ticketingAirlineInfo) {
            this.ticketingAirlineInfo = ticketingAirlineInfo;
            return this;
        }
        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfosTicketingAirlineInfo getTicketingAirlineInfo() {
            return this.ticketingAirlineInfo;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos setTotalTime(String totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public String getTotalTime() {
            return this.totalTime;
        }

    }

    public static class IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <strong>example:</strong>
         * <p>杭州</p>
         */
        @NameInMap("arr_city_name")
        public String arrCityName;

        /**
         * <strong>example:</strong>
         * <p>2023-08-13 09:25</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <strong>example:</strong>
         * <p>北京</p>
         */
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

        @NameInMap("flight_segment_infos")
        public java.util.List<IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos> flightSegmentInfos;

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

        public static IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfos build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfos self = new IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfos();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfos setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfos setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfos setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfos setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfos setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfos setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfos setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfos setFlightSegmentInfos(java.util.List<IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos> flightSegmentInfos) {
            this.flightSegmentInfos = flightSegmentInfos;
            return this;
        }
        public java.util.List<IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfosFlightSegmentInfos> getFlightSegmentInfos() {
            return this.flightSegmentInfos;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfos setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfos setTransferTime(Integer transferTime) {
            this.transferTime = transferTime;
            return this;
        }
        public Integer getTransferTime() {
            return this.transferTime;
        }

    }

    public static class IntlFlightReShopListSearchResponseBodyModuleReShopItemList extends TeaModel {
        @NameInMap("best_price_item")
        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItem bestPriceItem;

        @NameInMap("flight_journey_infos")
        public java.util.List<IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfos> flightJourneyInfos;

        public static IntlFlightReShopListSearchResponseBodyModuleReShopItemList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopListSearchResponseBodyModuleReShopItemList self = new IntlFlightReShopListSearchResponseBodyModuleReShopItemList();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemList setBestPriceItem(IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItem bestPriceItem) {
            this.bestPriceItem = bestPriceItem;
            return this;
        }
        public IntlFlightReShopListSearchResponseBodyModuleReShopItemListBestPriceItem getBestPriceItem() {
            return this.bestPriceItem;
        }

        public IntlFlightReShopListSearchResponseBodyModuleReShopItemList setFlightJourneyInfos(java.util.List<IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfos> flightJourneyInfos) {
            this.flightJourneyInfos = flightJourneyInfos;
            return this;
        }
        public java.util.List<IntlFlightReShopListSearchResponseBodyModuleReShopItemListFlightJourneyInfos> getFlightJourneyInfos() {
            return this.flightJourneyInfos;
        }

    }

    public static class IntlFlightReShopListSearchResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("need_continue")
        public Boolean needContinue;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("next_req_wait_time")
        public Integer nextReqWaitTime;

        @NameInMap("re_shop_item_list")
        public java.util.List<IntlFlightReShopListSearchResponseBodyModuleReShopItemList> reShopItemList;

        /**
         * <strong>example:</strong>
         * <p>284e692fffdf71e8a49aebbe0657a625</p>
         */
        @NameInMap("token")
        public String token;

        public static IntlFlightReShopListSearchResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopListSearchResponseBodyModule self = new IntlFlightReShopListSearchResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopListSearchResponseBodyModule setNeedContinue(Boolean needContinue) {
            this.needContinue = needContinue;
            return this;
        }
        public Boolean getNeedContinue() {
            return this.needContinue;
        }

        public IntlFlightReShopListSearchResponseBodyModule setNextReqWaitTime(Integer nextReqWaitTime) {
            this.nextReqWaitTime = nextReqWaitTime;
            return this;
        }
        public Integer getNextReqWaitTime() {
            return this.nextReqWaitTime;
        }

        public IntlFlightReShopListSearchResponseBodyModule setReShopItemList(java.util.List<IntlFlightReShopListSearchResponseBodyModuleReShopItemList> reShopItemList) {
            this.reShopItemList = reShopItemList;
            return this;
        }
        public java.util.List<IntlFlightReShopListSearchResponseBodyModuleReShopItemList> getReShopItemList() {
            return this.reShopItemList;
        }

        public IntlFlightReShopListSearchResponseBodyModule setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
