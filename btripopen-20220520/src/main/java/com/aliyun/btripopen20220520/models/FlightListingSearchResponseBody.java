// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightListingSearchResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public FlightListingSearchResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static FlightListingSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightListingSearchResponseBody self = new FlightListingSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightListingSearchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightListingSearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightListingSearchResponseBody setModule(FlightListingSearchResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightListingSearchResponseBodyModule getModule() {
        return this.module;
    }

    public FlightListingSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightListingSearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightListingSearchResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightListingSearchResponseBodyModuleFlightListAirlineInfo extends TeaModel {
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("airline_simple_name")
        public String airlineSimpleName;

        public static FlightListingSearchResponseBodyModuleFlightListAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListAirlineInfo self = new FlightListingSearchResponseBodyModuleFlightListAirlineInfo();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public FlightListingSearchResponseBodyModuleFlightListAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public FlightListingSearchResponseBodyModuleFlightListAirlineInfo setAirlineSimpleName(String airlineSimpleName) {
            this.airlineSimpleName = airlineSimpleName;
            return this;
        }
        public String getAirlineSimpleName() {
            return this.airlineSimpleName;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListArrAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("terminal")
        public String terminal;

        public static FlightListingSearchResponseBodyModuleFlightListArrAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListArrAirportInfo self = new FlightListingSearchResponseBodyModuleFlightListArrAirportInfo();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListArrAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public FlightListingSearchResponseBodyModuleFlightListArrAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public FlightListingSearchResponseBodyModuleFlightListArrAirportInfo setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public FlightListingSearchResponseBodyModuleFlightListArrAirportInfo setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public FlightListingSearchResponseBodyModuleFlightListArrAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListDepAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("terminal")
        public String terminal;

        public static FlightListingSearchResponseBodyModuleFlightListDepAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListDepAirportInfo self = new FlightListingSearchResponseBodyModuleFlightListDepAirportInfo();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListDepAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public FlightListingSearchResponseBodyModuleFlightListDepAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public FlightListingSearchResponseBodyModuleFlightListDepAirportInfo setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public FlightListingSearchResponseBodyModuleFlightListDepAirportInfo setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public FlightListingSearchResponseBodyModuleFlightListDepAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription extends TeaModel {
        @NameInMap("desc")
        public String desc;

        @NameInMap("icon")
        public String icon;

        @NameInMap("image")
        public String image;

        @NameInMap("title")
        public String title;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO extends TeaModel {
        @NameInMap("image")
        public String image;

        @NameInMap("largest")
        public String largest;

        @NameInMap("middle")
        public String middle;

        @NameInMap("smallest")
        public String smallest;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setLargest(String largest) {
            this.largest = largest;
            return this;
        }
        public String getLargest() {
            return this.largest;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setMiddle(String middle) {
            this.middle = middle;
            return this;
        }
        public String getMiddle() {
            return this.middle;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setSmallest(String smallest) {
            this.smallest = smallest;
            return this;
        }
        public String getSmallest() {
            return this.smallest;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes extends TeaModel {
        @NameInMap("baggage_desc")
        public java.util.List<String> baggageDesc;

        @NameInMap("baggage_sub_content_type")
        public Integer baggageSubContentType;

        @NameInMap("description")
        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription description;

        @NameInMap("image_d_o")
        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO imageDO;

        @NameInMap("is_highlight")
        public Boolean isHighlight;

        @NameInMap("sub_title")
        public String subTitle;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setBaggageDesc(java.util.List<String> baggageDesc) {
            this.baggageDesc = baggageDesc;
            return this;
        }
        public java.util.List<String> getBaggageDesc() {
            return this.baggageDesc;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setBaggageSubContentType(Integer baggageSubContentType) {
            this.baggageSubContentType = baggageSubContentType;
            return this;
        }
        public Integer getBaggageSubContentType() {
            return this.baggageSubContentType;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setDescription(FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription description) {
            this.description = description;
            return this;
        }
        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription getDescription() {
            return this.description;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setImageDO(FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO imageDO) {
            this.imageDO = imageDO;
            return this;
        }
        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO getImageDO() {
            return this.imageDO;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setIsHighlight(Boolean isHighlight) {
            this.isHighlight = isHighlight;
            return this;
        }
        public Boolean getIsHighlight() {
            return this.isHighlight;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setSubTitle(String subTitle) {
            this.subTitle = subTitle;
            return this;
        }
        public String getSubTitle() {
            return this.subTitle;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems extends TeaModel {
        @NameInMap("baggage_sub_content_visualizes")
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes> baggageSubContentVisualizes;

        @NameInMap("extra_content_visualizes")
        public java.util.List<?> extraContentVisualizes;

        @NameInMap("is_struct")
        public Boolean isStruct;

        /**
         * <p>PTC</p>
         */
        @NameInMap("ptc")
        public String ptc;

        @NameInMap("title")
        public String title;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems setBaggageSubContentVisualizes(java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes> baggageSubContentVisualizes) {
            this.baggageSubContentVisualizes = baggageSubContentVisualizes;
            return this;
        }
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes> getBaggageSubContentVisualizes() {
            return this.baggageSubContentVisualizes;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems setExtraContentVisualizes(java.util.List<?> extraContentVisualizes) {
            this.extraContentVisualizes = extraContentVisualizes;
            return this;
        }
        public java.util.List<?> getExtraContentVisualizes() {
            return this.extraContentVisualizes;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemTips extends TeaModel {
        @NameInMap("logo")
        public String logo;

        @NameInMap("tips_desc")
        public String tipsDesc;

        @NameInMap("tips_image")
        public String tipsImage;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemTips build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemTips self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemTips();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemTips setLogo(String logo) {
            this.logo = logo;
            return this;
        }
        public String getLogo() {
            return this.logo;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemTips setTipsDesc(String tipsDesc) {
            this.tipsDesc = tipsDesc;
            return this;
        }
        public String getTipsDesc() {
            return this.tipsDesc;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemTips setTipsImage(String tipsImage) {
            this.tipsImage = tipsImage;
            return this;
        }
        public String getTipsImage() {
            return this.tipsImage;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItem extends TeaModel {
        @NameInMap("baggage_sub_items")
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems> baggageSubItems;

        @NameInMap("index")
        public Integer index;

        @NameInMap("table_head")
        public String tableHead;

        @NameInMap("tips")
        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemTips tips;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public Integer type;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItem build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItem self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItem();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItem setBaggageSubItems(java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems> baggageSubItems) {
            this.baggageSubItems = baggageSubItems;
            return this;
        }
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems> getBaggageSubItems() {
            return this.baggageSubItems;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItem setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItem setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItem setTips(FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemTips tips) {
            this.tips = tips;
            return this;
        }
        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItemTips getTips() {
            return this.tips;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItem setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("cost")
        public Integer cost;

        @NameInMap("cost_percent")
        public Integer costPercent;

        @NameInMap("time_stamp")
        public Integer timeStamp;

        @NameInMap("time_type")
        public String timeType;

        @NameInMap("title")
        public String title;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRule extends TeaModel {
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo> info;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRule build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRule self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRule();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRule setInfo(java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("title")
        public String title;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents extends TeaModel {
        @NameInMap("fee_desc")
        public String feeDesc;

        @NameInMap("fee_range")
        public String feeRange;

        @NameInMap("style")
        public Integer style;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents setFeeDesc(String feeDesc) {
            this.feeDesc = feeDesc;
            return this;
        }
        public String getFeeDesc() {
            return this.feeDesc;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents setFeeRange(String feeRange) {
            this.feeRange = feeRange;
            return this;
        }
        public String getFeeRange() {
            return this.feeRange;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents setStyle(Integer style) {
            this.style = style;
            return this;
        }
        public Integer getStyle() {
            return this.style;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems extends TeaModel {
        /**
         * <p>isStruct : true</p>
         */
        @NameInMap("is_struct")
        public Boolean isStruct;

        /**
         * <p>PTC</p>
         */
        @NameInMap("ptc")
        public String ptc;

        @NameInMap("refund_sub_contents")
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents> refundSubContents;

        @NameInMap("title")
        public String title;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems setRefundSubContents(java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents> refundSubContents) {
            this.refundSubContents = refundSubContents;
            return this;
        }
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents> getRefundSubContents() {
            return this.refundSubContents;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem extends TeaModel {
        @NameInMap("extra_contents")
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents> extraContents;

        @NameInMap("index")
        public Integer index;

        @NameInMap("refund_sub_items")
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems> refundSubItems;

        @NameInMap("sub_table_head")
        public java.util.List<String> subTableHead;

        @NameInMap("table_head")
        public String tableHead;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public Integer type;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem setExtraContents(java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents> extraContents) {
            this.extraContents = extraContents;
            return this;
        }
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents> getExtraContents() {
            return this.extraContents;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem setRefundSubItems(java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems> refundSubItems) {
            this.refundSubItems = refundSubItems;
            return this;
        }
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem setSubTableHead(java.util.List<String> subTableHead) {
            this.subTableHead = subTableHead;
            return this;
        }
        public java.util.List<String> getSubTableHead() {
            return this.subTableHead;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("cost")
        public Integer cost;

        @NameInMap("cost_percent")
        public Integer costPercent;

        @NameInMap("time_stamp")
        public Integer timeStamp;

        @NameInMap("time_type")
        public String timeType;

        @NameInMap("title")
        public String title;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRule extends TeaModel {
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo> info;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRule build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRule self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRule();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRule setInfo(java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("title")
        public String title;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents extends TeaModel {
        @NameInMap("fee_desc")
        public String feeDesc;

        @NameInMap("fee_range")
        public String feeRange;

        @NameInMap("style")
        public Integer style;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents setFeeDesc(String feeDesc) {
            this.feeDesc = feeDesc;
            return this;
        }
        public String getFeeDesc() {
            return this.feeDesc;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents setFeeRange(String feeRange) {
            this.feeRange = feeRange;
            return this;
        }
        public String getFeeRange() {
            return this.feeRange;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents setStyle(Integer style) {
            this.style = style;
            return this;
        }
        public Integer getStyle() {
            return this.style;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems extends TeaModel {
        @NameInMap("is_struct")
        public Boolean isStruct;

        /**
         * <p>PTC</p>
         */
        @NameInMap("ptc")
        public String ptc;

        @NameInMap("refund_sub_contents")
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents> refundSubContents;

        @NameInMap("title")
        public String title;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems setRefundSubContents(java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents> refundSubContents) {
            this.refundSubContents = refundSubContents;
            return this;
        }
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents> getRefundSubContents() {
            return this.refundSubContents;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem extends TeaModel {
        @NameInMap("extra_contents")
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents> extraContents;

        @NameInMap("index")
        public Integer index;

        @NameInMap("refund_sub_items")
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems> refundSubItems;

        @NameInMap("sub_table_head")
        public java.util.List<String> subTableHead;

        @NameInMap("table_head")
        public String tableHead;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public Integer type;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem setExtraContents(java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents> extraContents) {
            this.extraContents = extraContents;
            return this;
        }
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents> getExtraContents() {
            return this.extraContents;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem setRefundSubItems(java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems> refundSubItems) {
            this.refundSubItems = refundSubItems;
            return this;
        }
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem setSubTableHead(java.util.List<String> subTableHead) {
            this.subTableHead = subTableHead;
            return this;
        }
        public java.util.List<String> getSubTableHead() {
            return this.subTableHead;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("cost")
        public Integer cost;

        @NameInMap("cost_percent")
        public Integer costPercent;

        @NameInMap("time_stamp")
        public Integer timeStamp;

        @NameInMap("time_type")
        public String timeType;

        @NameInMap("title")
        public String title;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleListSignRule extends TeaModel {
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo> info;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleListSignRule build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleListSignRule self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleListSignRule();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListSignRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListSignRule setInfo(java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("cost")
        public Integer cost;

        @NameInMap("cost_percent")
        public Integer costPercent;

        @NameInMap("time_stamp")
        public Integer timeStamp;

        @NameInMap("time_type")
        public String timeType;

        @NameInMap("title")
        public String title;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleListUpgradeRule extends TeaModel {
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo> info;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleListUpgradeRule build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleListUpgradeRule self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleListUpgradeRule();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListUpgradeRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListUpgradeRule setInfo(java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightListFlightRuleList extends TeaModel {
        @NameInMap("baggage_info")
        public String baggageInfo;

        @NameInMap("baggage_item")
        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItem baggageItem;

        @NameInMap("change_rule")
        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRule changeRule;

        @NameInMap("change_rule_item")
        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem changeRuleItem;

        @NameInMap("extra")
        public String extra;

        @NameInMap("refund_rule")
        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRule refundRule;

        @NameInMap("refund_rule_item")
        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem refundRuleItem;

        @NameInMap("sign_rule")
        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListSignRule signRule;

        @NameInMap("tuigaiqian_info")
        public String tuigaiqianInfo;

        @NameInMap("upgrade_rule")
        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListUpgradeRule upgradeRule;

        public static FlightListingSearchResponseBodyModuleFlightListFlightRuleList build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightListFlightRuleList self = new FlightListingSearchResponseBodyModuleFlightListFlightRuleList();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleList setBaggageInfo(String baggageInfo) {
            this.baggageInfo = baggageInfo;
            return this;
        }
        public String getBaggageInfo() {
            return this.baggageInfo;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleList setBaggageItem(FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItem baggageItem) {
            this.baggageItem = baggageItem;
            return this;
        }
        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListBaggageItem getBaggageItem() {
            return this.baggageItem;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleList setChangeRule(FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRule changeRule) {
            this.changeRule = changeRule;
            return this;
        }
        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRule getChangeRule() {
            return this.changeRule;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleList setChangeRuleItem(FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem changeRuleItem) {
            this.changeRuleItem = changeRuleItem;
            return this;
        }
        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem getChangeRuleItem() {
            return this.changeRuleItem;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleList setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleList setRefundRule(FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRule refundRule) {
            this.refundRule = refundRule;
            return this;
        }
        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRule getRefundRule() {
            return this.refundRule;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleList setRefundRuleItem(FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem refundRuleItem) {
            this.refundRuleItem = refundRuleItem;
            return this;
        }
        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem getRefundRuleItem() {
            return this.refundRuleItem;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleList setSignRule(FlightListingSearchResponseBodyModuleFlightListFlightRuleListSignRule signRule) {
            this.signRule = signRule;
            return this;
        }
        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListSignRule getSignRule() {
            return this.signRule;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleList setTuigaiqianInfo(String tuigaiqianInfo) {
            this.tuigaiqianInfo = tuigaiqianInfo;
            return this;
        }
        public String getTuigaiqianInfo() {
            return this.tuigaiqianInfo;
        }

        public FlightListingSearchResponseBodyModuleFlightListFlightRuleList setUpgradeRule(FlightListingSearchResponseBodyModuleFlightListFlightRuleListUpgradeRule upgradeRule) {
            this.upgradeRule = upgradeRule;
            return this;
        }
        public FlightListingSearchResponseBodyModuleFlightListFlightRuleListUpgradeRule getUpgradeRule() {
            return this.upgradeRule;
        }

    }

    public static class FlightListingSearchResponseBodyModuleFlightList extends TeaModel {
        @NameInMap("airline_info")
        public FlightListingSearchResponseBodyModuleFlightListAirlineInfo airlineInfo;

        @NameInMap("arr_airport_info")
        public FlightListingSearchResponseBodyModuleFlightListArrAirportInfo arrAirportInfo;

        @NameInMap("arr_date")
        public String arrDate;

        @NameInMap("basic_cabin_price")
        public Integer basicCabinPrice;

        @NameInMap("build_price")
        public Integer buildPrice;

        @NameInMap("cabin")
        public String cabin;

        @NameInMap("cabin_class")
        public String cabinClass;

        @NameInMap("carrier_airline")
        public String carrierAirline;

        @NameInMap("carrier_no")
        public String carrierNo;

        @NameInMap("dep_airport_info")
        public FlightListingSearchResponseBodyModuleFlightListDepAirportInfo depAirportInfo;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_date")
        public String depDate;

        @NameInMap("discount")
        public Integer discount;

        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("flight_rule_list")
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleList> flightRuleList;

        @NameInMap("flight_rule_list_str")
        public String flightRuleListStr;

        @NameInMap("flight_size")
        public String flightSize;

        @NameInMap("flight_type")
        public String flightType;

        @NameInMap("invoice_type")
        public Integer invoiceType;

        @NameInMap("is_protocol")
        public Boolean isProtocol;

        @NameInMap("is_share")
        public Boolean isShare;

        @NameInMap("is_stop")
        public Boolean isStop;

        @NameInMap("is_transfer")
        public Boolean isTransfer;

        @NameInMap("meal_desc")
        public String mealDesc;

        @NameInMap("oil_price")
        public Integer oilPrice;

        @NameInMap("ota_item_id")
        public String otaItemId;

        @NameInMap("price")
        public Integer price;

        @NameInMap("product_type")
        public Long productType;

        @NameInMap("product_type_desc")
        public String productTypeDesc;

        @NameInMap("promotion_price")
        public String promotionPrice;

        @NameInMap("remained_seat_count")
        public String remainedSeatCount;

        @NameInMap("secret_params")
        public String secretParams;

        @NameInMap("segment_number")
        public String segmentNumber;

        @NameInMap("stop_arr_time")
        public String stopArrTime;

        @NameInMap("stop_city")
        public String stopCity;

        @NameInMap("stop_dep_time")
        public String stopDepTime;

        @NameInMap("ticket_price")
        public Integer ticketPrice;

        @NameInMap("total_price")
        public String totalPrice;

        @NameInMap("trip_type")
        public Integer tripType;

        public static FlightListingSearchResponseBodyModuleFlightList build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModuleFlightList self = new FlightListingSearchResponseBodyModuleFlightList();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModuleFlightList setAirlineInfo(FlightListingSearchResponseBodyModuleFlightListAirlineInfo airlineInfo) {
            this.airlineInfo = airlineInfo;
            return this;
        }
        public FlightListingSearchResponseBodyModuleFlightListAirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        public FlightListingSearchResponseBodyModuleFlightList setArrAirportInfo(FlightListingSearchResponseBodyModuleFlightListArrAirportInfo arrAirportInfo) {
            this.arrAirportInfo = arrAirportInfo;
            return this;
        }
        public FlightListingSearchResponseBodyModuleFlightListArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        public FlightListingSearchResponseBodyModuleFlightList setArrDate(String arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public String getArrDate() {
            return this.arrDate;
        }

        public FlightListingSearchResponseBodyModuleFlightList setBasicCabinPrice(Integer basicCabinPrice) {
            this.basicCabinPrice = basicCabinPrice;
            return this;
        }
        public Integer getBasicCabinPrice() {
            return this.basicCabinPrice;
        }

        public FlightListingSearchResponseBodyModuleFlightList setBuildPrice(Integer buildPrice) {
            this.buildPrice = buildPrice;
            return this;
        }
        public Integer getBuildPrice() {
            return this.buildPrice;
        }

        public FlightListingSearchResponseBodyModuleFlightList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public FlightListingSearchResponseBodyModuleFlightList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public FlightListingSearchResponseBodyModuleFlightList setCarrierAirline(String carrierAirline) {
            this.carrierAirline = carrierAirline;
            return this;
        }
        public String getCarrierAirline() {
            return this.carrierAirline;
        }

        public FlightListingSearchResponseBodyModuleFlightList setCarrierNo(String carrierNo) {
            this.carrierNo = carrierNo;
            return this;
        }
        public String getCarrierNo() {
            return this.carrierNo;
        }

        public FlightListingSearchResponseBodyModuleFlightList setDepAirportInfo(FlightListingSearchResponseBodyModuleFlightListDepAirportInfo depAirportInfo) {
            this.depAirportInfo = depAirportInfo;
            return this;
        }
        public FlightListingSearchResponseBodyModuleFlightListDepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        public FlightListingSearchResponseBodyModuleFlightList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightListingSearchResponseBodyModuleFlightList setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public FlightListingSearchResponseBodyModuleFlightList setDiscount(Integer discount) {
            this.discount = discount;
            return this;
        }
        public Integer getDiscount() {
            return this.discount;
        }

        public FlightListingSearchResponseBodyModuleFlightList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightListingSearchResponseBodyModuleFlightList setFlightRuleList(java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleList> flightRuleList) {
            this.flightRuleList = flightRuleList;
            return this;
        }
        public java.util.List<FlightListingSearchResponseBodyModuleFlightListFlightRuleList> getFlightRuleList() {
            return this.flightRuleList;
        }

        public FlightListingSearchResponseBodyModuleFlightList setFlightRuleListStr(String flightRuleListStr) {
            this.flightRuleListStr = flightRuleListStr;
            return this;
        }
        public String getFlightRuleListStr() {
            return this.flightRuleListStr;
        }

        public FlightListingSearchResponseBodyModuleFlightList setFlightSize(String flightSize) {
            this.flightSize = flightSize;
            return this;
        }
        public String getFlightSize() {
            return this.flightSize;
        }

        public FlightListingSearchResponseBodyModuleFlightList setFlightType(String flightType) {
            this.flightType = flightType;
            return this;
        }
        public String getFlightType() {
            return this.flightType;
        }

        public FlightListingSearchResponseBodyModuleFlightList setInvoiceType(Integer invoiceType) {
            this.invoiceType = invoiceType;
            return this;
        }
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        public FlightListingSearchResponseBodyModuleFlightList setIsProtocol(Boolean isProtocol) {
            this.isProtocol = isProtocol;
            return this;
        }
        public Boolean getIsProtocol() {
            return this.isProtocol;
        }

        public FlightListingSearchResponseBodyModuleFlightList setIsShare(Boolean isShare) {
            this.isShare = isShare;
            return this;
        }
        public Boolean getIsShare() {
            return this.isShare;
        }

        public FlightListingSearchResponseBodyModuleFlightList setIsStop(Boolean isStop) {
            this.isStop = isStop;
            return this;
        }
        public Boolean getIsStop() {
            return this.isStop;
        }

        public FlightListingSearchResponseBodyModuleFlightList setIsTransfer(Boolean isTransfer) {
            this.isTransfer = isTransfer;
            return this;
        }
        public Boolean getIsTransfer() {
            return this.isTransfer;
        }

        public FlightListingSearchResponseBodyModuleFlightList setMealDesc(String mealDesc) {
            this.mealDesc = mealDesc;
            return this;
        }
        public String getMealDesc() {
            return this.mealDesc;
        }

        public FlightListingSearchResponseBodyModuleFlightList setOilPrice(Integer oilPrice) {
            this.oilPrice = oilPrice;
            return this;
        }
        public Integer getOilPrice() {
            return this.oilPrice;
        }

        public FlightListingSearchResponseBodyModuleFlightList setOtaItemId(String otaItemId) {
            this.otaItemId = otaItemId;
            return this;
        }
        public String getOtaItemId() {
            return this.otaItemId;
        }

        public FlightListingSearchResponseBodyModuleFlightList setPrice(Integer price) {
            this.price = price;
            return this;
        }
        public Integer getPrice() {
            return this.price;
        }

        public FlightListingSearchResponseBodyModuleFlightList setProductType(Long productType) {
            this.productType = productType;
            return this;
        }
        public Long getProductType() {
            return this.productType;
        }

        public FlightListingSearchResponseBodyModuleFlightList setProductTypeDesc(String productTypeDesc) {
            this.productTypeDesc = productTypeDesc;
            return this;
        }
        public String getProductTypeDesc() {
            return this.productTypeDesc;
        }

        public FlightListingSearchResponseBodyModuleFlightList setPromotionPrice(String promotionPrice) {
            this.promotionPrice = promotionPrice;
            return this;
        }
        public String getPromotionPrice() {
            return this.promotionPrice;
        }

        public FlightListingSearchResponseBodyModuleFlightList setRemainedSeatCount(String remainedSeatCount) {
            this.remainedSeatCount = remainedSeatCount;
            return this;
        }
        public String getRemainedSeatCount() {
            return this.remainedSeatCount;
        }

        public FlightListingSearchResponseBodyModuleFlightList setSecretParams(String secretParams) {
            this.secretParams = secretParams;
            return this;
        }
        public String getSecretParams() {
            return this.secretParams;
        }

        public FlightListingSearchResponseBodyModuleFlightList setSegmentNumber(String segmentNumber) {
            this.segmentNumber = segmentNumber;
            return this;
        }
        public String getSegmentNumber() {
            return this.segmentNumber;
        }

        public FlightListingSearchResponseBodyModuleFlightList setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public FlightListingSearchResponseBodyModuleFlightList setStopCity(String stopCity) {
            this.stopCity = stopCity;
            return this;
        }
        public String getStopCity() {
            return this.stopCity;
        }

        public FlightListingSearchResponseBodyModuleFlightList setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        public FlightListingSearchResponseBodyModuleFlightList setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        public FlightListingSearchResponseBodyModuleFlightList setTotalPrice(String totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public String getTotalPrice() {
            return this.totalPrice;
        }

        public FlightListingSearchResponseBodyModuleFlightList setTripType(Integer tripType) {
            this.tripType = tripType;
            return this;
        }
        public Integer getTripType() {
            return this.tripType;
        }

    }

    public static class FlightListingSearchResponseBodyModule extends TeaModel {
        @NameInMap("flight_list")
        public java.util.List<FlightListingSearchResponseBodyModuleFlightList> flightList;

        public static FlightListingSearchResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightListingSearchResponseBodyModule self = new FlightListingSearchResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightListingSearchResponseBodyModule setFlightList(java.util.List<FlightListingSearchResponseBodyModuleFlightList> flightList) {
            this.flightList = flightList;
            return this;
        }
        public java.util.List<FlightListingSearchResponseBodyModuleFlightList> getFlightList() {
            return this.flightList;
        }

    }

}
