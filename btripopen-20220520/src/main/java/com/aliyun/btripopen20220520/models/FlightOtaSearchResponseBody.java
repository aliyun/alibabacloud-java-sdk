// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOtaSearchResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public FlightOtaSearchResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static FlightOtaSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightOtaSearchResponseBody self = new FlightOtaSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightOtaSearchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightOtaSearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightOtaSearchResponseBody setModule(FlightOtaSearchResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightOtaSearchResponseBodyModule getModule() {
        return this.module;
    }

    public FlightOtaSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightOtaSearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightOtaSearchResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightOtaSearchResponseBodyModuleFlightListAirlineInfo extends TeaModel {
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("airline_simple_name")
        public String airlineSimpleName;

        public static FlightOtaSearchResponseBodyModuleFlightListAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListAirlineInfo self = new FlightOtaSearchResponseBodyModuleFlightListAirlineInfo();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public FlightOtaSearchResponseBodyModuleFlightListAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public FlightOtaSearchResponseBodyModuleFlightListAirlineInfo setAirlineSimpleName(String airlineSimpleName) {
            this.airlineSimpleName = airlineSimpleName;
            return this;
        }
        public String getAirlineSimpleName() {
            return this.airlineSimpleName;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListArrAirportInfo extends TeaModel {
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

        public static FlightOtaSearchResponseBodyModuleFlightListArrAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListArrAirportInfo self = new FlightOtaSearchResponseBodyModuleFlightListArrAirportInfo();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListArrAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public FlightOtaSearchResponseBodyModuleFlightListArrAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public FlightOtaSearchResponseBodyModuleFlightListArrAirportInfo setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public FlightOtaSearchResponseBodyModuleFlightListArrAirportInfo setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public FlightOtaSearchResponseBodyModuleFlightListArrAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription extends TeaModel {
        @NameInMap("desc")
        public String desc;

        @NameInMap("icon")
        public String icon;

        @NameInMap("image")
        public String image;

        @NameInMap("title")
        public String title;

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO extends TeaModel {
        @NameInMap("image")
        public String image;

        @NameInMap("largest")
        public String largest;

        @NameInMap("middle")
        public String middle;

        @NameInMap("smallest")
        public String smallest;

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setLargest(String largest) {
            this.largest = largest;
            return this;
        }
        public String getLargest() {
            return this.largest;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setMiddle(String middle) {
            this.middle = middle;
            return this;
        }
        public String getMiddle() {
            return this.middle;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setSmallest(String smallest) {
            this.smallest = smallest;
            return this;
        }
        public String getSmallest() {
            return this.smallest;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes extends TeaModel {
        @NameInMap("baggage_desc")
        public java.util.List<String> baggageDesc;

        @NameInMap("baggage_sub_content_type")
        public Integer baggageSubContentType;

        @NameInMap("description")
        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription description;

        @NameInMap("image_d_o")
        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO imageDO;

        @NameInMap("is_highlight")
        public Boolean isHighlight;

        @NameInMap("sub_title")
        public String subTitle;

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setBaggageDesc(java.util.List<String> baggageDesc) {
            this.baggageDesc = baggageDesc;
            return this;
        }
        public java.util.List<String> getBaggageDesc() {
            return this.baggageDesc;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setBaggageSubContentType(Integer baggageSubContentType) {
            this.baggageSubContentType = baggageSubContentType;
            return this;
        }
        public Integer getBaggageSubContentType() {
            return this.baggageSubContentType;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setDescription(FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription description) {
            this.description = description;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription getDescription() {
            return this.description;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setImageDO(FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO imageDO) {
            this.imageDO = imageDO;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO getImageDO() {
            return this.imageDO;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setIsHighlight(Boolean isHighlight) {
            this.isHighlight = isHighlight;
            return this;
        }
        public Boolean getIsHighlight() {
            return this.isHighlight;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setSubTitle(String subTitle) {
            this.subTitle = subTitle;
            return this;
        }
        public String getSubTitle() {
            return this.subTitle;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems extends TeaModel {
        @NameInMap("baggage_sub_content_visualizes")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes> baggageSubContentVisualizes;

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

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems setBaggageSubContentVisualizes(java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes> baggageSubContentVisualizes) {
            this.baggageSubContentVisualizes = baggageSubContentVisualizes;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes> getBaggageSubContentVisualizes() {
            return this.baggageSubContentVisualizes;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems setExtraContentVisualizes(java.util.List<?> extraContentVisualizes) {
            this.extraContentVisualizes = extraContentVisualizes;
            return this;
        }
        public java.util.List<?> getExtraContentVisualizes() {
            return this.extraContentVisualizes;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemTips extends TeaModel {
        @NameInMap("logo")
        public String logo;

        @NameInMap("tips_desc")
        public String tipsDesc;

        @NameInMap("tips_image")
        public String tipsImage;

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemTips build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemTips self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemTips();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemTips setLogo(String logo) {
            this.logo = logo;
            return this;
        }
        public String getLogo() {
            return this.logo;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemTips setTipsDesc(String tipsDesc) {
            this.tipsDesc = tipsDesc;
            return this;
        }
        public String getTipsDesc() {
            return this.tipsDesc;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemTips setTipsImage(String tipsImage) {
            this.tipsImage = tipsImage;
            return this;
        }
        public String getTipsImage() {
            return this.tipsImage;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem extends TeaModel {
        @NameInMap("baggage_sub_items")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems> baggageSubItems;

        @NameInMap("index")
        public Integer index;

        @NameInMap("table_head")
        public String tableHead;

        @NameInMap("tips")
        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemTips tips;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public Integer type;

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem setBaggageSubItems(java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems> baggageSubItems) {
            this.baggageSubItems = baggageSubItems;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems> getBaggageSubItems() {
            return this.baggageSubItems;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem setTips(FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemTips tips) {
            this.tips = tips;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemTips getTips() {
            return this.tips;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo extends TeaModel {
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

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRule extends TeaModel {
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo> info;

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRule build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRule self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRule();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRule setInfo(java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemExtraContents extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("title")
        public String title;

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemExtraContents build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemExtraContents self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemExtraContents();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemExtraContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemExtraContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents extends TeaModel {
        @NameInMap("fee_desc")
        public String feeDesc;

        @NameInMap("fee_range")
        public String feeRange;

        @NameInMap("style")
        public Integer style;

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents setFeeDesc(String feeDesc) {
            this.feeDesc = feeDesc;
            return this;
        }
        public String getFeeDesc() {
            return this.feeDesc;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents setFeeRange(String feeRange) {
            this.feeRange = feeRange;
            return this;
        }
        public String getFeeRange() {
            return this.feeRange;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents setStyle(Integer style) {
            this.style = style;
            return this;
        }
        public Integer getStyle() {
            return this.style;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItems extends TeaModel {
        @NameInMap("is_struct")
        public Boolean isStruct;

        /**
         * <p>PTC</p>
         */
        @NameInMap("ptc")
        public String ptc;

        @NameInMap("refund_sub_contents")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents> refundSubContents;

        @NameInMap("title")
        public String title;

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItems self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItems();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItems setRefundSubContents(java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents> refundSubContents) {
            this.refundSubContents = refundSubContents;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents> getRefundSubContents() {
            return this.refundSubContents;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem extends TeaModel {
        @NameInMap("extra_contents")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemExtraContents> extraContents;

        @NameInMap("index")
        public Integer index;

        @NameInMap("refund_sub_items")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItems> refundSubItems;

        @NameInMap("sub_table_head")
        public java.util.List<String> subTableHead;

        @NameInMap("table_head")
        public String tableHead;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public Integer type;

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem setExtraContents(java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemExtraContents> extraContents) {
            this.extraContents = extraContents;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemExtraContents> getExtraContents() {
            return this.extraContents;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem setRefundSubItems(java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItems> refundSubItems) {
            this.refundSubItems = refundSubItems;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem setSubTableHead(java.util.List<String> subTableHead) {
            this.subTableHead = subTableHead;
            return this;
        }
        public java.util.List<String> getSubTableHead() {
            return this.subTableHead;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo extends TeaModel {
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

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRule extends TeaModel {
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo> info;

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRule build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRule self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRule();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRule setInfo(java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemExtraContents extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("title")
        public String title;

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemExtraContents build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemExtraContents self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemExtraContents();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemExtraContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemExtraContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents extends TeaModel {
        @NameInMap("fee_desc")
        public String feeDesc;

        @NameInMap("fee_range")
        public String feeRange;

        @NameInMap("style")
        public Integer style;

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents setFeeDesc(String feeDesc) {
            this.feeDesc = feeDesc;
            return this;
        }
        public String getFeeDesc() {
            return this.feeDesc;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents setFeeRange(String feeRange) {
            this.feeRange = feeRange;
            return this;
        }
        public String getFeeRange() {
            return this.feeRange;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents setStyle(Integer style) {
            this.style = style;
            return this;
        }
        public Integer getStyle() {
            return this.style;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItems extends TeaModel {
        @NameInMap("is_struct")
        public Boolean isStruct;

        /**
         * <p>PTC</p>
         */
        @NameInMap("ptc")
        public String ptc;

        @NameInMap("refund_sub_contents")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents> refundSubContents;

        @NameInMap("title")
        public String title;

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItems self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItems();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItems setRefundSubContents(java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents> refundSubContents) {
            this.refundSubContents = refundSubContents;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents> getRefundSubContents() {
            return this.refundSubContents;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem extends TeaModel {
        @NameInMap("extra_contents")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemExtraContents> extraContents;

        @NameInMap("index")
        public Integer index;

        @NameInMap("refund_sub_items")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItems> refundSubItems;

        @NameInMap("sub_table_head")
        public java.util.List<String> subTableHead;

        @NameInMap("table_head")
        public String tableHead;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public Integer type;

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem setExtraContents(java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemExtraContents> extraContents) {
            this.extraContents = extraContents;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemExtraContents> getExtraContents() {
            return this.extraContents;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem setRefundSubItems(java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItems> refundSubItems) {
            this.refundSubItems = refundSubItems;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem setSubTableHead(java.util.List<String> subTableHead) {
            this.subTableHead = subTableHead;
            return this;
        }
        public java.util.List<String> getSubTableHead() {
            return this.subTableHead;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo extends TeaModel {
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

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRule extends TeaModel {
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo> info;

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRule build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRule self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRule();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRule setInfo(java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo extends TeaModel {
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

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRule extends TeaModel {
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo> info;

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRule build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRule self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRule();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRule setInfo(java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleList extends TeaModel {
        @NameInMap("baggage_info")
        public String baggageInfo;

        @NameInMap("baggage_item")
        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem baggageItem;

        @NameInMap("change_rule")
        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRule changeRule;

        @NameInMap("change_rule_item")
        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem changeRuleItem;

        @NameInMap("extra")
        public String extra;

        @NameInMap("refund_rule")
        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRule refundRule;

        @NameInMap("refund_rule_item")
        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem refundRuleItem;

        @NameInMap("sign_rule")
        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRule signRule;

        @NameInMap("tuigaiqian_info")
        public String tuigaiqianInfo;

        @NameInMap("upgrade_rule")
        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRule upgradeRule;

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleList build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleList self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleList();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleList setBaggageInfo(String baggageInfo) {
            this.baggageInfo = baggageInfo;
            return this;
        }
        public String getBaggageInfo() {
            return this.baggageInfo;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleList setBaggageItem(FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem baggageItem) {
            this.baggageItem = baggageItem;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem getBaggageItem() {
            return this.baggageItem;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleList setChangeRule(FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRule changeRule) {
            this.changeRule = changeRule;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRule getChangeRule() {
            return this.changeRule;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleList setChangeRuleItem(FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem changeRuleItem) {
            this.changeRuleItem = changeRuleItem;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem getChangeRuleItem() {
            return this.changeRuleItem;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleList setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleList setRefundRule(FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRule refundRule) {
            this.refundRule = refundRule;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRule getRefundRule() {
            return this.refundRule;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleList setRefundRuleItem(FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem refundRuleItem) {
            this.refundRuleItem = refundRuleItem;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem getRefundRuleItem() {
            return this.refundRuleItem;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleList setSignRule(FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRule signRule) {
            this.signRule = signRule;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRule getSignRule() {
            return this.signRule;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleList setTuigaiqianInfo(String tuigaiqianInfo) {
            this.tuigaiqianInfo = tuigaiqianInfo;
            return this;
        }
        public String getTuigaiqianInfo() {
            return this.tuigaiqianInfo;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleList setUpgradeRule(FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRule upgradeRule) {
            this.upgradeRule = upgradeRule;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRule getUpgradeRule() {
            return this.upgradeRule;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListCabinInfoList extends TeaModel {
        @NameInMap("agent_id")
        public Long agentId;

        @NameInMap("basic_cabin_price")
        public Integer basicCabinPrice;

        @NameInMap("build_price")
        public Integer buildPrice;

        @NameInMap("cabin")
        public String cabin;

        @NameInMap("cabin_class")
        public String cabinClass;

        @NameInMap("cabin_class_name")
        public String cabinClassName;

        @NameInMap("child_cabin")
        public String childCabin;

        @NameInMap("class_name")
        public String className;

        @NameInMap("class_rule")
        public String classRule;

        @NameInMap("discount")
        public String discount;

        @NameInMap("flight_rule_list")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleList> flightRuleList;

        @NameInMap("flight_rule_list_str")
        public String flightRuleListStr;

        @NameInMap("invoice_type")
        public Integer invoiceType;

        @NameInMap("is_protocol")
        public Boolean isProtocol;

        @NameInMap("oil_price")
        public Integer oilPrice;

        @NameInMap("order_params")
        public String orderParams;

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

        @NameInMap("ticket_price")
        public Integer ticketPrice;

        @NameInMap("total_price")
        public Integer totalPrice;

        public static FlightOtaSearchResponseBodyModuleFlightListCabinInfoList build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListCabinInfoList self = new FlightOtaSearchResponseBodyModuleFlightListCabinInfoList();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setBasicCabinPrice(Integer basicCabinPrice) {
            this.basicCabinPrice = basicCabinPrice;
            return this;
        }
        public Integer getBasicCabinPrice() {
            return this.basicCabinPrice;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setBuildPrice(Integer buildPrice) {
            this.buildPrice = buildPrice;
            return this;
        }
        public Integer getBuildPrice() {
            return this.buildPrice;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setCabinClassName(String cabinClassName) {
            this.cabinClassName = cabinClassName;
            return this;
        }
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setChildCabin(String childCabin) {
            this.childCabin = childCabin;
            return this;
        }
        public String getChildCabin() {
            return this.childCabin;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setClassRule(String classRule) {
            this.classRule = classRule;
            return this;
        }
        public String getClassRule() {
            return this.classRule;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setDiscount(String discount) {
            this.discount = discount;
            return this;
        }
        public String getDiscount() {
            return this.discount;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setFlightRuleList(java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleList> flightRuleList) {
            this.flightRuleList = flightRuleList;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoListFlightRuleList> getFlightRuleList() {
            return this.flightRuleList;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setFlightRuleListStr(String flightRuleListStr) {
            this.flightRuleListStr = flightRuleListStr;
            return this;
        }
        public String getFlightRuleListStr() {
            return this.flightRuleListStr;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setInvoiceType(Integer invoiceType) {
            this.invoiceType = invoiceType;
            return this;
        }
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setIsProtocol(Boolean isProtocol) {
            this.isProtocol = isProtocol;
            return this;
        }
        public Boolean getIsProtocol() {
            return this.isProtocol;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setOilPrice(Integer oilPrice) {
            this.oilPrice = oilPrice;
            return this;
        }
        public Integer getOilPrice() {
            return this.oilPrice;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setOrderParams(String orderParams) {
            this.orderParams = orderParams;
            return this;
        }
        public String getOrderParams() {
            return this.orderParams;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setOtaItemId(String otaItemId) {
            this.otaItemId = otaItemId;
            return this;
        }
        public String getOtaItemId() {
            return this.otaItemId;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setPrice(Integer price) {
            this.price = price;
            return this;
        }
        public Integer getPrice() {
            return this.price;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setProductType(Long productType) {
            this.productType = productType;
            return this;
        }
        public Long getProductType() {
            return this.productType;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setProductTypeDesc(String productTypeDesc) {
            this.productTypeDesc = productTypeDesc;
            return this;
        }
        public String getProductTypeDesc() {
            return this.productTypeDesc;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setPromotionPrice(String promotionPrice) {
            this.promotionPrice = promotionPrice;
            return this;
        }
        public String getPromotionPrice() {
            return this.promotionPrice;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setRemainedSeatCount(String remainedSeatCount) {
            this.remainedSeatCount = remainedSeatCount;
            return this;
        }
        public String getRemainedSeatCount() {
            return this.remainedSeatCount;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        public FlightOtaSearchResponseBodyModuleFlightListCabinInfoList setTotalPrice(Integer totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Integer getTotalPrice() {
            return this.totalPrice;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListDepAirportInfo extends TeaModel {
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

        public static FlightOtaSearchResponseBodyModuleFlightListDepAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListDepAirportInfo self = new FlightOtaSearchResponseBodyModuleFlightListDepAirportInfo();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListDepAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public FlightOtaSearchResponseBodyModuleFlightListDepAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public FlightOtaSearchResponseBodyModuleFlightListDepAirportInfo setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public FlightOtaSearchResponseBodyModuleFlightListDepAirportInfo setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public FlightOtaSearchResponseBodyModuleFlightListDepAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription extends TeaModel {
        @NameInMap("desc")
        public String desc;

        @NameInMap("icon")
        public String icon;

        @NameInMap("image")
        public String image;

        @NameInMap("title")
        public String title;

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO extends TeaModel {
        @NameInMap("image")
        public String image;

        @NameInMap("largest")
        public String largest;

        @NameInMap("middle")
        public String middle;

        @NameInMap("smallest")
        public String smallest;

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setLargest(String largest) {
            this.largest = largest;
            return this;
        }
        public String getLargest() {
            return this.largest;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setMiddle(String middle) {
            this.middle = middle;
            return this;
        }
        public String getMiddle() {
            return this.middle;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setSmallest(String smallest) {
            this.smallest = smallest;
            return this;
        }
        public String getSmallest() {
            return this.smallest;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes extends TeaModel {
        @NameInMap("baggage_desc")
        public java.util.List<String> baggageDesc;

        @NameInMap("baggage_sub_content_type")
        public Integer baggageSubContentType;

        @NameInMap("description")
        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription description;

        @NameInMap("image_d_o")
        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO imageDO;

        @NameInMap("is_highlight")
        public Boolean isHighlight;

        @NameInMap("sub_title")
        public String subTitle;

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setBaggageDesc(java.util.List<String> baggageDesc) {
            this.baggageDesc = baggageDesc;
            return this;
        }
        public java.util.List<String> getBaggageDesc() {
            return this.baggageDesc;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setBaggageSubContentType(Integer baggageSubContentType) {
            this.baggageSubContentType = baggageSubContentType;
            return this;
        }
        public Integer getBaggageSubContentType() {
            return this.baggageSubContentType;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setDescription(FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription description) {
            this.description = description;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription getDescription() {
            return this.description;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setImageDO(FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO imageDO) {
            this.imageDO = imageDO;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO getImageDO() {
            return this.imageDO;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setIsHighlight(Boolean isHighlight) {
            this.isHighlight = isHighlight;
            return this;
        }
        public Boolean getIsHighlight() {
            return this.isHighlight;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setSubTitle(String subTitle) {
            this.subTitle = subTitle;
            return this;
        }
        public String getSubTitle() {
            return this.subTitle;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems extends TeaModel {
        @NameInMap("baggage_sub_content_visualizes")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes> baggageSubContentVisualizes;

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

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems setBaggageSubContentVisualizes(java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes> baggageSubContentVisualizes) {
            this.baggageSubContentVisualizes = baggageSubContentVisualizes;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes> getBaggageSubContentVisualizes() {
            return this.baggageSubContentVisualizes;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems setExtraContentVisualizes(java.util.List<?> extraContentVisualizes) {
            this.extraContentVisualizes = extraContentVisualizes;
            return this;
        }
        public java.util.List<?> getExtraContentVisualizes() {
            return this.extraContentVisualizes;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemTips extends TeaModel {
        @NameInMap("logo")
        public String logo;

        @NameInMap("tips_desc")
        public String tipsDesc;

        @NameInMap("tips_image")
        public String tipsImage;

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemTips build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemTips self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemTips();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemTips setLogo(String logo) {
            this.logo = logo;
            return this;
        }
        public String getLogo() {
            return this.logo;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemTips setTipsDesc(String tipsDesc) {
            this.tipsDesc = tipsDesc;
            return this;
        }
        public String getTipsDesc() {
            return this.tipsDesc;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemTips setTipsImage(String tipsImage) {
            this.tipsImage = tipsImage;
            return this;
        }
        public String getTipsImage() {
            return this.tipsImage;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItem extends TeaModel {
        @NameInMap("baggage_sub_items")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems> baggageSubItems;

        @NameInMap("index")
        public Integer index;

        @NameInMap("table_head")
        public String tableHead;

        @NameInMap("tips")
        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemTips tips;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public Integer type;

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItem build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItem self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItem();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItem setBaggageSubItems(java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems> baggageSubItems) {
            this.baggageSubItems = baggageSubItems;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems> getBaggageSubItems() {
            return this.baggageSubItems;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItem setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItem setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItem setTips(FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemTips tips) {
            this.tips = tips;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItemTips getTips() {
            return this.tips;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItem setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo extends TeaModel {
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

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRule extends TeaModel {
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo> info;

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRule build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRule self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRule();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRule setInfo(java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("title")
        public String title;

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents extends TeaModel {
        @NameInMap("fee_desc")
        public String feeDesc;

        @NameInMap("fee_range")
        public String feeRange;

        @NameInMap("style")
        public Integer style;

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents setFeeDesc(String feeDesc) {
            this.feeDesc = feeDesc;
            return this;
        }
        public String getFeeDesc() {
            return this.feeDesc;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents setFeeRange(String feeRange) {
            this.feeRange = feeRange;
            return this;
        }
        public String getFeeRange() {
            return this.feeRange;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents setStyle(Integer style) {
            this.style = style;
            return this;
        }
        public Integer getStyle() {
            return this.style;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems extends TeaModel {
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
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents> refundSubContents;

        @NameInMap("title")
        public String title;

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems setRefundSubContents(java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents> refundSubContents) {
            this.refundSubContents = refundSubContents;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents> getRefundSubContents() {
            return this.refundSubContents;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem extends TeaModel {
        @NameInMap("extra_contents")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents> extraContents;

        @NameInMap("index")
        public Integer index;

        @NameInMap("refund_sub_items")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems> refundSubItems;

        @NameInMap("sub_table_head")
        public java.util.List<String> subTableHead;

        @NameInMap("table_head")
        public String tableHead;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public Integer type;

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem setExtraContents(java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents> extraContents) {
            this.extraContents = extraContents;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents> getExtraContents() {
            return this.extraContents;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem setRefundSubItems(java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems> refundSubItems) {
            this.refundSubItems = refundSubItems;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem setSubTableHead(java.util.List<String> subTableHead) {
            this.subTableHead = subTableHead;
            return this;
        }
        public java.util.List<String> getSubTableHead() {
            return this.subTableHead;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo extends TeaModel {
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

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRule extends TeaModel {
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo> info;

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRule build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRule self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRule();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRule setInfo(java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("title")
        public String title;

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents extends TeaModel {
        @NameInMap("fee_desc")
        public String feeDesc;

        @NameInMap("fee_range")
        public String feeRange;

        @NameInMap("style")
        public Integer style;

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents setFeeDesc(String feeDesc) {
            this.feeDesc = feeDesc;
            return this;
        }
        public String getFeeDesc() {
            return this.feeDesc;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents setFeeRange(String feeRange) {
            this.feeRange = feeRange;
            return this;
        }
        public String getFeeRange() {
            return this.feeRange;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents setStyle(Integer style) {
            this.style = style;
            return this;
        }
        public Integer getStyle() {
            return this.style;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems extends TeaModel {
        @NameInMap("is_struct")
        public Boolean isStruct;

        /**
         * <p>PTC</p>
         */
        @NameInMap("ptc")
        public String ptc;

        @NameInMap("refund_sub_contents")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents> refundSubContents;

        @NameInMap("title")
        public String title;

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems setRefundSubContents(java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents> refundSubContents) {
            this.refundSubContents = refundSubContents;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents> getRefundSubContents() {
            return this.refundSubContents;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem extends TeaModel {
        @NameInMap("extra_contents")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents> extraContents;

        @NameInMap("index")
        public Integer index;

        @NameInMap("refund_sub_items")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems> refundSubItems;

        @NameInMap("sub_table_head")
        public java.util.List<String> subTableHead;

        @NameInMap("table_head")
        public String tableHead;

        @NameInMap("title")
        public String title;

        @NameInMap("type")
        public Integer type;

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem setExtraContents(java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents> extraContents) {
            this.extraContents = extraContents;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents> getExtraContents() {
            return this.extraContents;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem setRefundSubItems(java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems> refundSubItems) {
            this.refundSubItems = refundSubItems;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem setSubTableHead(java.util.List<String> subTableHead) {
            this.subTableHead = subTableHead;
            return this;
        }
        public java.util.List<String> getSubTableHead() {
            return this.subTableHead;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo extends TeaModel {
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

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleListSignRule extends TeaModel {
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo> info;

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleListSignRule build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleListSignRule self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleListSignRule();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListSignRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListSignRule setInfo(java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListSignRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo extends TeaModel {
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

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleListUpgradeRule extends TeaModel {
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo> info;

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleListUpgradeRule build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleListUpgradeRule self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleListUpgradeRule();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListUpgradeRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListUpgradeRule setInfo(java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightListFlightRuleList extends TeaModel {
        @NameInMap("baggage_info")
        public String baggageInfo;

        @NameInMap("baggage_item")
        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItem baggageItem;

        @NameInMap("change_rule")
        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRule changeRule;

        @NameInMap("change_rule_item")
        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem changeRuleItem;

        @NameInMap("extra")
        public String extra;

        @NameInMap("refund_rule")
        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRule refundRule;

        @NameInMap("refund_rule_item")
        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem refundRuleItem;

        @NameInMap("sign_rule")
        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListSignRule signRule;

        @NameInMap("tuigaiqian_info")
        public String tuigaiqianInfo;

        @NameInMap("upgrade_rule")
        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListUpgradeRule upgradeRule;

        public static FlightOtaSearchResponseBodyModuleFlightListFlightRuleList build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightListFlightRuleList self = new FlightOtaSearchResponseBodyModuleFlightListFlightRuleList();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleList setBaggageInfo(String baggageInfo) {
            this.baggageInfo = baggageInfo;
            return this;
        }
        public String getBaggageInfo() {
            return this.baggageInfo;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleList setBaggageItem(FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItem baggageItem) {
            this.baggageItem = baggageItem;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListBaggageItem getBaggageItem() {
            return this.baggageItem;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleList setChangeRule(FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRule changeRule) {
            this.changeRule = changeRule;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRule getChangeRule() {
            return this.changeRule;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleList setChangeRuleItem(FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem changeRuleItem) {
            this.changeRuleItem = changeRuleItem;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListChangeRuleItem getChangeRuleItem() {
            return this.changeRuleItem;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleList setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleList setRefundRule(FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRule refundRule) {
            this.refundRule = refundRule;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRule getRefundRule() {
            return this.refundRule;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleList setRefundRuleItem(FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem refundRuleItem) {
            this.refundRuleItem = refundRuleItem;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListRefundRuleItem getRefundRuleItem() {
            return this.refundRuleItem;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleList setSignRule(FlightOtaSearchResponseBodyModuleFlightListFlightRuleListSignRule signRule) {
            this.signRule = signRule;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListSignRule getSignRule() {
            return this.signRule;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleList setTuigaiqianInfo(String tuigaiqianInfo) {
            this.tuigaiqianInfo = tuigaiqianInfo;
            return this;
        }
        public String getTuigaiqianInfo() {
            return this.tuigaiqianInfo;
        }

        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleList setUpgradeRule(FlightOtaSearchResponseBodyModuleFlightListFlightRuleListUpgradeRule upgradeRule) {
            this.upgradeRule = upgradeRule;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListFlightRuleListUpgradeRule getUpgradeRule() {
            return this.upgradeRule;
        }

    }

    public static class FlightOtaSearchResponseBodyModuleFlightList extends TeaModel {
        @NameInMap("airline_info")
        public FlightOtaSearchResponseBodyModuleFlightListAirlineInfo airlineInfo;

        @NameInMap("arr_airport_info")
        public FlightOtaSearchResponseBodyModuleFlightListArrAirportInfo arrAirportInfo;

        @NameInMap("arr_date")
        public String arrDate;

        @NameInMap("build_price")
        public Integer buildPrice;

        @NameInMap("cabin")
        public String cabin;

        @NameInMap("cabin_class")
        public String cabinClass;

        @NameInMap("cabin_info_list")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoList> cabinInfoList;

        @NameInMap("carrier_airline")
        public String carrierAirline;

        @NameInMap("carrier_no")
        public String carrierNo;

        @NameInMap("dep_airport_info")
        public FlightOtaSearchResponseBodyModuleFlightListDepAirportInfo depAirportInfo;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_date")
        public String depDate;

        @NameInMap("discount")
        public Integer discount;

        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("flight_rule_list")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleList> flightRuleList;

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

        public static FlightOtaSearchResponseBodyModuleFlightList build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModuleFlightList self = new FlightOtaSearchResponseBodyModuleFlightList();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModuleFlightList setAirlineInfo(FlightOtaSearchResponseBodyModuleFlightListAirlineInfo airlineInfo) {
            this.airlineInfo = airlineInfo;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListAirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setArrAirportInfo(FlightOtaSearchResponseBodyModuleFlightListArrAirportInfo arrAirportInfo) {
            this.arrAirportInfo = arrAirportInfo;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setArrDate(String arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public String getArrDate() {
            return this.arrDate;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setBuildPrice(Integer buildPrice) {
            this.buildPrice = buildPrice;
            return this;
        }
        public Integer getBuildPrice() {
            return this.buildPrice;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setCabinInfoList(java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoList> cabinInfoList) {
            this.cabinInfoList = cabinInfoList;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListCabinInfoList> getCabinInfoList() {
            return this.cabinInfoList;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setCarrierAirline(String carrierAirline) {
            this.carrierAirline = carrierAirline;
            return this;
        }
        public String getCarrierAirline() {
            return this.carrierAirline;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setCarrierNo(String carrierNo) {
            this.carrierNo = carrierNo;
            return this;
        }
        public String getCarrierNo() {
            return this.carrierNo;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setDepAirportInfo(FlightOtaSearchResponseBodyModuleFlightListDepAirportInfo depAirportInfo) {
            this.depAirportInfo = depAirportInfo;
            return this;
        }
        public FlightOtaSearchResponseBodyModuleFlightListDepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setDiscount(Integer discount) {
            this.discount = discount;
            return this;
        }
        public Integer getDiscount() {
            return this.discount;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setFlightRuleList(java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleList> flightRuleList) {
            this.flightRuleList = flightRuleList;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightListFlightRuleList> getFlightRuleList() {
            return this.flightRuleList;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setFlightRuleListStr(String flightRuleListStr) {
            this.flightRuleListStr = flightRuleListStr;
            return this;
        }
        public String getFlightRuleListStr() {
            return this.flightRuleListStr;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setFlightSize(String flightSize) {
            this.flightSize = flightSize;
            return this;
        }
        public String getFlightSize() {
            return this.flightSize;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setFlightType(String flightType) {
            this.flightType = flightType;
            return this;
        }
        public String getFlightType() {
            return this.flightType;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setInvoiceType(Integer invoiceType) {
            this.invoiceType = invoiceType;
            return this;
        }
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setIsProtocol(Boolean isProtocol) {
            this.isProtocol = isProtocol;
            return this;
        }
        public Boolean getIsProtocol() {
            return this.isProtocol;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setIsShare(Boolean isShare) {
            this.isShare = isShare;
            return this;
        }
        public Boolean getIsShare() {
            return this.isShare;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setIsStop(Boolean isStop) {
            this.isStop = isStop;
            return this;
        }
        public Boolean getIsStop() {
            return this.isStop;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setIsTransfer(Boolean isTransfer) {
            this.isTransfer = isTransfer;
            return this;
        }
        public Boolean getIsTransfer() {
            return this.isTransfer;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setMealDesc(String mealDesc) {
            this.mealDesc = mealDesc;
            return this;
        }
        public String getMealDesc() {
            return this.mealDesc;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setOilPrice(Integer oilPrice) {
            this.oilPrice = oilPrice;
            return this;
        }
        public Integer getOilPrice() {
            return this.oilPrice;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setOtaItemId(String otaItemId) {
            this.otaItemId = otaItemId;
            return this;
        }
        public String getOtaItemId() {
            return this.otaItemId;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setPrice(Integer price) {
            this.price = price;
            return this;
        }
        public Integer getPrice() {
            return this.price;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setProductType(Long productType) {
            this.productType = productType;
            return this;
        }
        public Long getProductType() {
            return this.productType;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setProductTypeDesc(String productTypeDesc) {
            this.productTypeDesc = productTypeDesc;
            return this;
        }
        public String getProductTypeDesc() {
            return this.productTypeDesc;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setPromotionPrice(String promotionPrice) {
            this.promotionPrice = promotionPrice;
            return this;
        }
        public String getPromotionPrice() {
            return this.promotionPrice;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setRemainedSeatCount(String remainedSeatCount) {
            this.remainedSeatCount = remainedSeatCount;
            return this;
        }
        public String getRemainedSeatCount() {
            return this.remainedSeatCount;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setSecretParams(String secretParams) {
            this.secretParams = secretParams;
            return this;
        }
        public String getSecretParams() {
            return this.secretParams;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setSegmentNumber(String segmentNumber) {
            this.segmentNumber = segmentNumber;
            return this;
        }
        public String getSegmentNumber() {
            return this.segmentNumber;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setStopCity(String stopCity) {
            this.stopCity = stopCity;
            return this;
        }
        public String getStopCity() {
            return this.stopCity;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setTotalPrice(String totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public String getTotalPrice() {
            return this.totalPrice;
        }

        public FlightOtaSearchResponseBodyModuleFlightList setTripType(Integer tripType) {
            this.tripType = tripType;
            return this;
        }
        public Integer getTripType() {
            return this.tripType;
        }

    }

    public static class FlightOtaSearchResponseBodyModule extends TeaModel {
        @NameInMap("flight_list")
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightList> flightList;

        public static FlightOtaSearchResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaSearchResponseBodyModule self = new FlightOtaSearchResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightOtaSearchResponseBodyModule setFlightList(java.util.List<FlightOtaSearchResponseBodyModuleFlightList> flightList) {
            this.flightList = flightList;
            return this;
        }
        public java.util.List<FlightOtaSearchResponseBodyModuleFlightList> getFlightList() {
            return this.flightList;
        }

    }

}
