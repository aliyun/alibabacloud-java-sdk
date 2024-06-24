// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightSearchListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public FlightSearchListResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>A5009956-1077-52FB-B520-EA8C7E91D722</p>
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
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static FlightSearchListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightSearchListResponseBody self = new FlightSearchListResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightSearchListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightSearchListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightSearchListResponseBody setModule(FlightSearchListResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightSearchListResponseBodyModule getModule() {
        return this.module;
    }

    public FlightSearchListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightSearchListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightSearchListResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightSearchListResponseBodyModuleFlightListAirlineInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CA</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("airline_simple_name")
        public String airlineSimpleName;

        public static FlightSearchListResponseBodyModuleFlightListAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListAirlineInfo self = new FlightSearchListResponseBodyModuleFlightListAirlineInfo();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public FlightSearchListResponseBodyModuleFlightListAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public FlightSearchListResponseBodyModuleFlightListAirlineInfo setAirlineSimpleName(String airlineSimpleName) {
            this.airlineSimpleName = airlineSimpleName;
            return this;
        }
        public String getAirlineSimpleName() {
            return this.airlineSimpleName;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListArrAirportInfo extends TeaModel {
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
         * <p>HGH</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        /**
         * <strong>example:</strong>
         * <p>T3</p>
         */
        @NameInMap("terminal")
        public String terminal;

        public static FlightSearchListResponseBodyModuleFlightListArrAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListArrAirportInfo self = new FlightSearchListResponseBodyModuleFlightListArrAirportInfo();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListArrAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public FlightSearchListResponseBodyModuleFlightListArrAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public FlightSearchListResponseBodyModuleFlightListArrAirportInfo setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public FlightSearchListResponseBodyModuleFlightListArrAirportInfo setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public FlightSearchListResponseBodyModuleFlightListArrAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription extends TeaModel {
        @NameInMap("desc")
        public String desc;

        /**
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/imgextra/i4/O1CN01UynXG31pjsEtA3tMF_!!6000000005397-2-tps-36-36.png">https://gw.alicdn.com/imgextra/i4/O1CN01UynXG31pjsEtA3tMF_!!6000000005397-2-tps-36-36.png</a></p>
         */
        @NameInMap("icon")
        public String icon;

        /**
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/imgextra/i1/O1CN01qe7wL21gJ0SmEXXL7_!!6000000004120-2-tps-1206-768.png">https://gw.alicdn.com/imgextra/i1/O1CN01qe7wL21gJ0SmEXXL7_!!6000000004120-2-tps-1206-768.png</a></p>
         */
        @NameInMap("image")
        public String image;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("image")
        public String image;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("largest")
        public String largest;

        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("middle")
        public String middle;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("smallest")
        public String smallest;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setLargest(String largest) {
            this.largest = largest;
            return this;
        }
        public String getLargest() {
            return this.largest;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setMiddle(String middle) {
            this.middle = middle;
            return this;
        }
        public String getMiddle() {
            return this.middle;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setSmallest(String smallest) {
            this.smallest = smallest;
            return this;
        }
        public String getSmallest() {
            return this.smallest;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes extends TeaModel {
        @NameInMap("baggage_desc")
        public java.util.List<String> baggageDesc;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("baggage_sub_content_type")
        public Integer baggageSubContentType;

        @NameInMap("description")
        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription description;

        @NameInMap("image_d_o")
        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO imageDO;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_highlight")
        public Boolean isHighlight;

        @NameInMap("sub_title")
        public String subTitle;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setBaggageDesc(java.util.List<String> baggageDesc) {
            this.baggageDesc = baggageDesc;
            return this;
        }
        public java.util.List<String> getBaggageDesc() {
            return this.baggageDesc;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setBaggageSubContentType(Integer baggageSubContentType) {
            this.baggageSubContentType = baggageSubContentType;
            return this;
        }
        public Integer getBaggageSubContentType() {
            return this.baggageSubContentType;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setDescription(FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription description) {
            this.description = description;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription getDescription() {
            return this.description;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setImageDO(FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO imageDO) {
            this.imageDO = imageDO;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO getImageDO() {
            return this.imageDO;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setIsHighlight(Boolean isHighlight) {
            this.isHighlight = isHighlight;
            return this;
        }
        public Boolean getIsHighlight() {
            return this.isHighlight;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setSubTitle(String subTitle) {
            this.subTitle = subTitle;
            return this;
        }
        public String getSubTitle() {
            return this.subTitle;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems extends TeaModel {
        @NameInMap("baggage_sub_content_visualizes")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes> baggageSubContentVisualizes;

        @NameInMap("extra_content_visualizes")
        public java.util.List<?> extraContentVisualizes;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_struct")
        public Boolean isStruct;

        /**
         * <p>PTC</p>
         * 
         * <strong>example:</strong>
         * <p>ADT</p>
         */
        @NameInMap("ptc")
        public String ptc;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems setBaggageSubContentVisualizes(java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes> baggageSubContentVisualizes) {
            this.baggageSubContentVisualizes = baggageSubContentVisualizes;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes> getBaggageSubContentVisualizes() {
            return this.baggageSubContentVisualizes;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems setExtraContentVisualizes(java.util.List<?> extraContentVisualizes) {
            this.extraContentVisualizes = extraContentVisualizes;
            return this;
        }
        public java.util.List<?> getExtraContentVisualizes() {
            return this.extraContentVisualizes;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemTips extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/imgextra/i1/O1CN019zl3WZ22fNLxzx2cR_!!6000000007147-2-tps-125-45.png">https://gw.alicdn.com/imgextra/i1/O1CN019zl3WZ22fNLxzx2cR_!!6000000007147-2-tps-125-45.png</a></p>
         */
        @NameInMap("logo")
        public String logo;

        @NameInMap("tips_desc")
        public String tipsDesc;

        /**
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/imgextra/i3/O1CN01rJxjw61f3bXNHAmlk_!!6000000003951-2-tps-1050-675.png">https://gw.alicdn.com/imgextra/i3/O1CN01rJxjw61f3bXNHAmlk_!!6000000003951-2-tps-1050-675.png</a></p>
         */
        @NameInMap("tips_image")
        public String tipsImage;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemTips build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemTips self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemTips();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemTips setLogo(String logo) {
            this.logo = logo;
            return this;
        }
        public String getLogo() {
            return this.logo;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemTips setTipsDesc(String tipsDesc) {
            this.tipsDesc = tipsDesc;
            return this;
        }
        public String getTipsDesc() {
            return this.tipsDesc;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemTips setTipsImage(String tipsImage) {
            this.tipsImage = tipsImage;
            return this;
        }
        public String getTipsImage() {
            return this.tipsImage;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem extends TeaModel {
        @NameInMap("baggage_sub_items")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems> baggageSubItems;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("index")
        public Integer index;

        @NameInMap("table_head")
        public String tableHead;

        @NameInMap("tips")
        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemTips tips;

        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("type")
        public Integer type;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem setBaggageSubItems(java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems> baggageSubItems) {
            this.baggageSubItems = baggageSubItems;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemBaggageSubItems> getBaggageSubItems() {
            return this.baggageSubItems;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem setTips(FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemTips tips) {
            this.tips = tips;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItemTips getTips() {
            return this.tips;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("cost")
        public Integer cost;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("cost_percent")
        public Integer costPercent;

        /**
         * <strong>example:</strong>
         * <p>1675036500000</p>
         */
        @NameInMap("time_stamp")
        public Integer timeStamp;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("time_type")
        public String timeType;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo> info;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRule build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRule self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRule();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRule setInfo(java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemExtraContents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemExtraContents build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemExtraContents self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemExtraContents();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemExtraContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemExtraContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents extends TeaModel {
        @NameInMap("fee_desc")
        public String feeDesc;

        @NameInMap("fee_range")
        public String feeRange;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("style")
        public Integer style;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents setFeeDesc(String feeDesc) {
            this.feeDesc = feeDesc;
            return this;
        }
        public String getFeeDesc() {
            return this.feeDesc;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents setFeeRange(String feeRange) {
            this.feeRange = feeRange;
            return this;
        }
        public String getFeeRange() {
            return this.feeRange;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents setStyle(Integer style) {
            this.style = style;
            return this;
        }
        public Integer getStyle() {
            return this.style;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_struct")
        public Boolean isStruct;

        /**
         * <p>PTC</p>
         * 
         * <strong>example:</strong>
         * <p>ADT</p>
         */
        @NameInMap("ptc")
        public String ptc;

        @NameInMap("refund_sub_contents")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents> refundSubContents;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItems self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItems();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItems setRefundSubContents(java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents> refundSubContents) {
            this.refundSubContents = refundSubContents;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents> getRefundSubContents() {
            return this.refundSubContents;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem extends TeaModel {
        @NameInMap("extra_contents")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemExtraContents> extraContents;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public Integer index;

        @NameInMap("refund_sub_items")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItems> refundSubItems;

        @NameInMap("sub_table_head")
        public java.util.List<String> subTableHead;

        @NameInMap("table_head")
        public String tableHead;

        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("type")
        public Integer type;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem setExtraContents(java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemExtraContents> extraContents) {
            this.extraContents = extraContents;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemExtraContents> getExtraContents() {
            return this.extraContents;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem setRefundSubItems(java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItems> refundSubItems) {
            this.refundSubItems = refundSubItems;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItemRefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem setSubTableHead(java.util.List<String> subTableHead) {
            this.subTableHead = subTableHead;
            return this;
        }
        public java.util.List<String> getSubTableHead() {
            return this.subTableHead;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("cost")
        public Integer cost;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("cost_percent")
        public Integer costPercent;

        /**
         * <strong>example:</strong>
         * <p>1675036500000</p>
         */
        @NameInMap("time_stamp")
        public Integer timeStamp;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("time_type")
        public String timeType;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo> info;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRule build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRule self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRule();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRule setInfo(java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemExtraContents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemExtraContents build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemExtraContents self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemExtraContents();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemExtraContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemExtraContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents extends TeaModel {
        @NameInMap("fee_desc")
        public String feeDesc;

        @NameInMap("fee_range")
        public String feeRange;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("style")
        public Integer style;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents setFeeDesc(String feeDesc) {
            this.feeDesc = feeDesc;
            return this;
        }
        public String getFeeDesc() {
            return this.feeDesc;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents setFeeRange(String feeRange) {
            this.feeRange = feeRange;
            return this;
        }
        public String getFeeRange() {
            return this.feeRange;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents setStyle(Integer style) {
            this.style = style;
            return this;
        }
        public Integer getStyle() {
            return this.style;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_struct")
        public Boolean isStruct;

        /**
         * <p>PTC</p>
         * 
         * <strong>example:</strong>
         * <p>ADT</p>
         */
        @NameInMap("ptc")
        public String ptc;

        @NameInMap("refund_sub_contents")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents> refundSubContents;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItems self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItems();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItems setRefundSubContents(java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents> refundSubContents) {
            this.refundSubContents = refundSubContents;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents> getRefundSubContents() {
            return this.refundSubContents;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem extends TeaModel {
        @NameInMap("extra_contents")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemExtraContents> extraContents;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("index")
        public Integer index;

        @NameInMap("refund_sub_items")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItems> refundSubItems;

        @NameInMap("sub_table_head")
        public java.util.List<String> subTableHead;

        @NameInMap("table_head")
        public String tableHead;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("type")
        public Integer type;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem setExtraContents(java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemExtraContents> extraContents) {
            this.extraContents = extraContents;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemExtraContents> getExtraContents() {
            return this.extraContents;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem setRefundSubItems(java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItems> refundSubItems) {
            this.refundSubItems = refundSubItems;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItemRefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem setSubTableHead(java.util.List<String> subTableHead) {
            this.subTableHead = subTableHead;
            return this;
        }
        public java.util.List<String> getSubTableHead() {
            return this.subTableHead;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("cost")
        public Integer cost;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("cost_percent")
        public Integer costPercent;

        /**
         * <strong>example:</strong>
         * <p>1675036500000</p>
         */
        @NameInMap("time_stamp")
        public Integer timeStamp;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("time_type")
        public String timeType;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo> info;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRule build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRule self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRule();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRule setInfo(java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("cost")
        public Integer cost;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("cost_percent")
        public Integer costPercent;

        /**
         * <strong>example:</strong>
         * <p>1675036500000</p>
         */
        @NameInMap("time_stamp")
        public Integer timeStamp;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("time_type")
        public String timeType;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo> info;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRule build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRule self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRule();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRule setInfo(java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("baggage_info")
        public String baggageInfo;

        @NameInMap("baggage_item")
        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem baggageItem;

        @NameInMap("change_rule")
        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRule changeRule;

        @NameInMap("change_rule_item")
        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem changeRuleItem;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("extra")
        public String extra;

        @NameInMap("refund_rule")
        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRule refundRule;

        @NameInMap("refund_rule_item")
        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem refundRuleItem;

        @NameInMap("sign_rule")
        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRule signRule;

        @NameInMap("tuigaiqian_info")
        public String tuigaiqianInfo;

        @NameInMap("upgrade_rule")
        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRule upgradeRule;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleList build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleList self = new FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleList();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleList setBaggageInfo(String baggageInfo) {
            this.baggageInfo = baggageInfo;
            return this;
        }
        public String getBaggageInfo() {
            return this.baggageInfo;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleList setBaggageItem(FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem baggageItem) {
            this.baggageItem = baggageItem;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListBaggageItem getBaggageItem() {
            return this.baggageItem;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleList setChangeRule(FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRule changeRule) {
            this.changeRule = changeRule;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRule getChangeRule() {
            return this.changeRule;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleList setChangeRuleItem(FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem changeRuleItem) {
            this.changeRuleItem = changeRuleItem;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListChangeRuleItem getChangeRuleItem() {
            return this.changeRuleItem;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleList setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleList setRefundRule(FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRule refundRule) {
            this.refundRule = refundRule;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRule getRefundRule() {
            return this.refundRule;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleList setRefundRuleItem(FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem refundRuleItem) {
            this.refundRuleItem = refundRuleItem;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListRefundRuleItem getRefundRuleItem() {
            return this.refundRuleItem;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleList setSignRule(FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRule signRule) {
            this.signRule = signRule;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListSignRule getSignRule() {
            return this.signRule;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleList setTuigaiqianInfo(String tuigaiqianInfo) {
            this.tuigaiqianInfo = tuigaiqianInfo;
            return this;
        }
        public String getTuigaiqianInfo() {
            return this.tuigaiqianInfo;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleList setUpgradeRule(FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRule upgradeRule) {
            this.upgradeRule = upgradeRule;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleListUpgradeRule getUpgradeRule() {
            return this.upgradeRule;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListCabinInfoList extends TeaModel {
        @NameInMap("agent_id")
        public Long agentId;

        @NameInMap("basic_cabin_price")
        public Integer basicCabinPrice;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("build_price")
        public Integer buildPrice;

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

        @NameInMap("cabin_class_name")
        public String cabinClassName;

        /**
         * <strong>example:</strong>
         * <p>G</p>
         */
        @NameInMap("child_cabin")
        public String childCabin;

        @NameInMap("class_name")
        public String className;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("class_rule")
        public String classRule;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("discount")
        public String discount;

        @NameInMap("flight_rule_list")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleList> flightRuleList;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("flight_rule_list_str")
        public String flightRuleListStr;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("invoice_type")
        public Integer invoiceType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_protocol")
        public Boolean isProtocol;

        /**
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;value&quot;}</p>
         */
        @NameInMap("memo")
        public String memo;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("oil_price")
        public Integer oilPrice;

        /**
         * <strong>example:</strong>
         * <p>1000_1_0</p>
         */
        @NameInMap("order_params")
        public String orderParams;

        /**
         * <strong>example:</strong>
         * <p>wisdiii2ii22ii2</p>
         */
        @NameInMap("ota_item_id")
        public String otaItemId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("price")
        public Integer price;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("product_type")
        public Long productType;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("product_type_desc")
        public String productTypeDesc;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("promotion_price")
        public String promotionPrice;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("remained_seat_count")
        public String remainedSeatCount;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ticket_price")
        public Integer ticketPrice;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total_price")
        public Integer totalPrice;

        public static FlightSearchListResponseBodyModuleFlightListCabinInfoList build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListCabinInfoList self = new FlightSearchListResponseBodyModuleFlightListCabinInfoList();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setBasicCabinPrice(Integer basicCabinPrice) {
            this.basicCabinPrice = basicCabinPrice;
            return this;
        }
        public Integer getBasicCabinPrice() {
            return this.basicCabinPrice;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setBuildPrice(Integer buildPrice) {
            this.buildPrice = buildPrice;
            return this;
        }
        public Integer getBuildPrice() {
            return this.buildPrice;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setCabinClassName(String cabinClassName) {
            this.cabinClassName = cabinClassName;
            return this;
        }
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setChildCabin(String childCabin) {
            this.childCabin = childCabin;
            return this;
        }
        public String getChildCabin() {
            return this.childCabin;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setClassRule(String classRule) {
            this.classRule = classRule;
            return this;
        }
        public String getClassRule() {
            return this.classRule;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setDiscount(String discount) {
            this.discount = discount;
            return this;
        }
        public String getDiscount() {
            return this.discount;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setFlightRuleList(java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleList> flightRuleList) {
            this.flightRuleList = flightRuleList;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoListFlightRuleList> getFlightRuleList() {
            return this.flightRuleList;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setFlightRuleListStr(String flightRuleListStr) {
            this.flightRuleListStr = flightRuleListStr;
            return this;
        }
        public String getFlightRuleListStr() {
            return this.flightRuleListStr;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setInvoiceType(Integer invoiceType) {
            this.invoiceType = invoiceType;
            return this;
        }
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setIsProtocol(Boolean isProtocol) {
            this.isProtocol = isProtocol;
            return this;
        }
        public Boolean getIsProtocol() {
            return this.isProtocol;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setOilPrice(Integer oilPrice) {
            this.oilPrice = oilPrice;
            return this;
        }
        public Integer getOilPrice() {
            return this.oilPrice;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setOrderParams(String orderParams) {
            this.orderParams = orderParams;
            return this;
        }
        public String getOrderParams() {
            return this.orderParams;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setOtaItemId(String otaItemId) {
            this.otaItemId = otaItemId;
            return this;
        }
        public String getOtaItemId() {
            return this.otaItemId;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setPrice(Integer price) {
            this.price = price;
            return this;
        }
        public Integer getPrice() {
            return this.price;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setProductType(Long productType) {
            this.productType = productType;
            return this;
        }
        public Long getProductType() {
            return this.productType;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setProductTypeDesc(String productTypeDesc) {
            this.productTypeDesc = productTypeDesc;
            return this;
        }
        public String getProductTypeDesc() {
            return this.productTypeDesc;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setPromotionPrice(String promotionPrice) {
            this.promotionPrice = promotionPrice;
            return this;
        }
        public String getPromotionPrice() {
            return this.promotionPrice;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setRemainedSeatCount(String remainedSeatCount) {
            this.remainedSeatCount = remainedSeatCount;
            return this;
        }
        public String getRemainedSeatCount() {
            return this.remainedSeatCount;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        public FlightSearchListResponseBodyModuleFlightListCabinInfoList setTotalPrice(Integer totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Integer getTotalPrice() {
            return this.totalPrice;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListDepAirportInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PEK</p>
         */
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        /**
         * <strong>example:</strong>
         * <p>T3</p>
         */
        @NameInMap("terminal")
        public String terminal;

        public static FlightSearchListResponseBodyModuleFlightListDepAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListDepAirportInfo self = new FlightSearchListResponseBodyModuleFlightListDepAirportInfo();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListDepAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public FlightSearchListResponseBodyModuleFlightListDepAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public FlightSearchListResponseBodyModuleFlightListDepAirportInfo setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public FlightSearchListResponseBodyModuleFlightListDepAirportInfo setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public FlightSearchListResponseBodyModuleFlightListDepAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription extends TeaModel {
        @NameInMap("desc")
        public String desc;

        /**
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/imgextra/i4/O1CN01UynXG31pjsEtA3tMF_!!6000000005397-2-tps-36-36.png">https://gw.alicdn.com/imgextra/i4/O1CN01UynXG31pjsEtA3tMF_!!6000000005397-2-tps-36-36.png</a></p>
         */
        @NameInMap("icon")
        public String icon;

        /**
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/imgextra/i1/O1CN01qe7wL21gJ0SmEXXL7_!!6000000004120-2-tps-1206-768.png">https://gw.alicdn.com/imgextra/i1/O1CN01qe7wL21gJ0SmEXXL7_!!6000000004120-2-tps-1206-768.png</a></p>
         */
        @NameInMap("image")
        public String image;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription self = new FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("image")
        public String image;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("largest")
        public String largest;

        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("middle")
        public String middle;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("smallest")
        public String smallest;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO self = new FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setLargest(String largest) {
            this.largest = largest;
            return this;
        }
        public String getLargest() {
            return this.largest;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setMiddle(String middle) {
            this.middle = middle;
            return this;
        }
        public String getMiddle() {
            return this.middle;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setSmallest(String smallest) {
            this.smallest = smallest;
            return this;
        }
        public String getSmallest() {
            return this.smallest;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes extends TeaModel {
        @NameInMap("baggage_desc")
        public java.util.List<String> baggageDesc;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("baggage_sub_content_type")
        public Integer baggageSubContentType;

        @NameInMap("description")
        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription description;

        @NameInMap("image_d_o")
        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO imageDO;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_highlight")
        public Boolean isHighlight;

        @NameInMap("sub_title")
        public String subTitle;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes self = new FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setBaggageDesc(java.util.List<String> baggageDesc) {
            this.baggageDesc = baggageDesc;
            return this;
        }
        public java.util.List<String> getBaggageDesc() {
            return this.baggageDesc;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setBaggageSubContentType(Integer baggageSubContentType) {
            this.baggageSubContentType = baggageSubContentType;
            return this;
        }
        public Integer getBaggageSubContentType() {
            return this.baggageSubContentType;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setDescription(FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription description) {
            this.description = description;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription getDescription() {
            return this.description;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setImageDO(FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO imageDO) {
            this.imageDO = imageDO;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO getImageDO() {
            return this.imageDO;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setIsHighlight(Boolean isHighlight) {
            this.isHighlight = isHighlight;
            return this;
        }
        public Boolean getIsHighlight() {
            return this.isHighlight;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setSubTitle(String subTitle) {
            this.subTitle = subTitle;
            return this;
        }
        public String getSubTitle() {
            return this.subTitle;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems extends TeaModel {
        @NameInMap("baggage_sub_content_visualizes")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes> baggageSubContentVisualizes;

        @NameInMap("extra_content_visualizes")
        public java.util.List<?> extraContentVisualizes;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_struct")
        public Boolean isStruct;

        /**
         * <p>PTC</p>
         * 
         * <strong>example:</strong>
         * <p>ADT</p>
         */
        @NameInMap("ptc")
        public String ptc;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems self = new FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems setBaggageSubContentVisualizes(java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes> baggageSubContentVisualizes) {
            this.baggageSubContentVisualizes = baggageSubContentVisualizes;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes> getBaggageSubContentVisualizes() {
            return this.baggageSubContentVisualizes;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems setExtraContentVisualizes(java.util.List<?> extraContentVisualizes) {
            this.extraContentVisualizes = extraContentVisualizes;
            return this;
        }
        public java.util.List<?> getExtraContentVisualizes() {
            return this.extraContentVisualizes;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemTips extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/imgextra/i1/O1CN019zl3WZ22fNLxzx2cR_!!6000000007147-2-tps-125-45.png">https://gw.alicdn.com/imgextra/i1/O1CN019zl3WZ22fNLxzx2cR_!!6000000007147-2-tps-125-45.png</a></p>
         */
        @NameInMap("logo")
        public String logo;

        @NameInMap("tips_desc")
        public String tipsDesc;

        /**
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/imgextra/i3/O1CN01rJxjw61f3bXNHAmlk_!!6000000003951-2-tps-1050-675.png">https://gw.alicdn.com/imgextra/i3/O1CN01rJxjw61f3bXNHAmlk_!!6000000003951-2-tps-1050-675.png</a></p>
         */
        @NameInMap("tips_image")
        public String tipsImage;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemTips build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemTips self = new FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemTips();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemTips setLogo(String logo) {
            this.logo = logo;
            return this;
        }
        public String getLogo() {
            return this.logo;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemTips setTipsDesc(String tipsDesc) {
            this.tipsDesc = tipsDesc;
            return this;
        }
        public String getTipsDesc() {
            return this.tipsDesc;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemTips setTipsImage(String tipsImage) {
            this.tipsImage = tipsImage;
            return this;
        }
        public String getTipsImage() {
            return this.tipsImage;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItem extends TeaModel {
        @NameInMap("baggage_sub_items")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems> baggageSubItems;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("index")
        public Integer index;

        @NameInMap("table_head")
        public String tableHead;

        @NameInMap("tips")
        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemTips tips;

        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("type")
        public Integer type;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItem build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItem self = new FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItem();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItem setBaggageSubItems(java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems> baggageSubItems) {
            this.baggageSubItems = baggageSubItems;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemBaggageSubItems> getBaggageSubItems() {
            return this.baggageSubItems;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItem setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItem setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItem setTips(FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemTips tips) {
            this.tips = tips;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItemTips getTips() {
            return this.tips;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItem setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleInfo extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("cost")
        public Integer cost;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("cost_percent")
        public Integer costPercent;

        /**
         * <strong>example:</strong>
         * <p>1675036500000</p>
         */
        @NameInMap("time_stamp")
        public Integer timeStamp;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("time_type")
        public String timeType;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleInfo self = new FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleInfo> info;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRule build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRule self = new FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRule();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRule setInfo(java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents self = new FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents extends TeaModel {
        @NameInMap("fee_desc")
        public String feeDesc;

        @NameInMap("fee_range")
        public String feeRange;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("style")
        public Integer style;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents self = new FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents setFeeDesc(String feeDesc) {
            this.feeDesc = feeDesc;
            return this;
        }
        public String getFeeDesc() {
            return this.feeDesc;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents setFeeRange(String feeRange) {
            this.feeRange = feeRange;
            return this;
        }
        public String getFeeRange() {
            return this.feeRange;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents setStyle(Integer style) {
            this.style = style;
            return this;
        }
        public Integer getStyle() {
            return this.style;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_struct")
        public Boolean isStruct;

        /**
         * <p>PTC</p>
         * 
         * <strong>example:</strong>
         * <p>ADT</p>
         */
        @NameInMap("ptc")
        public String ptc;

        @NameInMap("refund_sub_contents")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents> refundSubContents;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems self = new FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems setRefundSubContents(java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents> refundSubContents) {
            this.refundSubContents = refundSubContents;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents> getRefundSubContents() {
            return this.refundSubContents;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItem extends TeaModel {
        @NameInMap("extra_contents")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents> extraContents;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public Integer index;

        @NameInMap("refund_sub_items")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems> refundSubItems;

        @NameInMap("sub_table_head")
        public java.util.List<String> subTableHead;

        @NameInMap("table_head")
        public String tableHead;

        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("type")
        public Integer type;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItem build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItem self = new FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItem();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItem setExtraContents(java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents> extraContents) {
            this.extraContents = extraContents;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemExtraContents> getExtraContents() {
            return this.extraContents;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItem setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItem setRefundSubItems(java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems> refundSubItems) {
            this.refundSubItems = refundSubItems;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItemRefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItem setSubTableHead(java.util.List<String> subTableHead) {
            this.subTableHead = subTableHead;
            return this;
        }
        public java.util.List<String> getSubTableHead() {
            return this.subTableHead;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItem setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItem setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleInfo extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("cost")
        public Integer cost;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("cost_percent")
        public Integer costPercent;

        /**
         * <strong>example:</strong>
         * <p>1675036500000</p>
         */
        @NameInMap("time_stamp")
        public Integer timeStamp;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("time_type")
        public String timeType;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleInfo self = new FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleInfo> info;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRule build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRule self = new FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRule();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRule setInfo(java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents self = new FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents extends TeaModel {
        @NameInMap("fee_desc")
        public String feeDesc;

        @NameInMap("fee_range")
        public String feeRange;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("style")
        public Integer style;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents self = new FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents setFeeDesc(String feeDesc) {
            this.feeDesc = feeDesc;
            return this;
        }
        public String getFeeDesc() {
            return this.feeDesc;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents setFeeRange(String feeRange) {
            this.feeRange = feeRange;
            return this;
        }
        public String getFeeRange() {
            return this.feeRange;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents setStyle(Integer style) {
            this.style = style;
            return this;
        }
        public Integer getStyle() {
            return this.style;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_struct")
        public Boolean isStruct;

        /**
         * <p>PTC</p>
         * 
         * <strong>example:</strong>
         * <p>ADT</p>
         */
        @NameInMap("ptc")
        public String ptc;

        @NameInMap("refund_sub_contents")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents> refundSubContents;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems self = new FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems setRefundSubContents(java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents> refundSubContents) {
            this.refundSubContents = refundSubContents;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents> getRefundSubContents() {
            return this.refundSubContents;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItem extends TeaModel {
        @NameInMap("extra_contents")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents> extraContents;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("index")
        public Integer index;

        @NameInMap("refund_sub_items")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems> refundSubItems;

        @NameInMap("sub_table_head")
        public java.util.List<String> subTableHead;

        @NameInMap("table_head")
        public String tableHead;

        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("type")
        public Integer type;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItem build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItem self = new FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItem();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItem setExtraContents(java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents> extraContents) {
            this.extraContents = extraContents;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemExtraContents> getExtraContents() {
            return this.extraContents;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItem setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItem setRefundSubItems(java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems> refundSubItems) {
            this.refundSubItems = refundSubItems;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItemRefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItem setSubTableHead(java.util.List<String> subTableHead) {
            this.subTableHead = subTableHead;
            return this;
        }
        public java.util.List<String> getSubTableHead() {
            return this.subTableHead;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItem setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItem setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleListSignRuleInfo extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("cost")
        public Integer cost;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("cost_percent")
        public Integer costPercent;

        /**
         * <strong>example:</strong>
         * <p>1675036500000</p>
         */
        @NameInMap("time_stamp")
        public Integer timeStamp;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("time_type")
        public String timeType;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleListSignRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleListSignRuleInfo self = new FlightSearchListResponseBodyModuleFlightListFlightRuleListSignRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListSignRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListSignRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListSignRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListSignRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListSignRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListSignRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleListSignRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListSignRuleInfo> info;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleListSignRule build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleListSignRule self = new FlightSearchListResponseBodyModuleFlightListFlightRuleListSignRule();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListSignRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListSignRule setInfo(java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListSignRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListSignRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("cost")
        public Integer cost;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("cost_percent")
        public Integer costPercent;

        /**
         * <strong>example:</strong>
         * <p>1675036500000</p>
         */
        @NameInMap("time_stamp")
        public Integer timeStamp;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("time_type")
        public String timeType;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo self = new FlightSearchListResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleListUpgradeRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo> info;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleListUpgradeRule build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleListUpgradeRule self = new FlightSearchListResponseBodyModuleFlightListFlightRuleListUpgradeRule();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListUpgradeRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleListUpgradeRule setInfo(java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleListUpgradeRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListFlightRuleList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("baggage_info")
        public String baggageInfo;

        @NameInMap("baggage_item")
        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItem baggageItem;

        @NameInMap("change_rule")
        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRule changeRule;

        @NameInMap("change_rule_item")
        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItem changeRuleItem;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("extra")
        public String extra;

        @NameInMap("refund_rule")
        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRule refundRule;

        @NameInMap("refund_rule_item")
        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItem refundRuleItem;

        @NameInMap("sign_rule")
        public FlightSearchListResponseBodyModuleFlightListFlightRuleListSignRule signRule;

        @NameInMap("tuigaiqian_info")
        public String tuigaiqianInfo;

        @NameInMap("upgrade_rule")
        public FlightSearchListResponseBodyModuleFlightListFlightRuleListUpgradeRule upgradeRule;

        public static FlightSearchListResponseBodyModuleFlightListFlightRuleList build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListFlightRuleList self = new FlightSearchListResponseBodyModuleFlightListFlightRuleList();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleList setBaggageInfo(String baggageInfo) {
            this.baggageInfo = baggageInfo;
            return this;
        }
        public String getBaggageInfo() {
            return this.baggageInfo;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleList setBaggageItem(FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItem baggageItem) {
            this.baggageItem = baggageItem;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListFlightRuleListBaggageItem getBaggageItem() {
            return this.baggageItem;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleList setChangeRule(FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRule changeRule) {
            this.changeRule = changeRule;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRule getChangeRule() {
            return this.changeRule;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleList setChangeRuleItem(FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItem changeRuleItem) {
            this.changeRuleItem = changeRuleItem;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListFlightRuleListChangeRuleItem getChangeRuleItem() {
            return this.changeRuleItem;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleList setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleList setRefundRule(FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRule refundRule) {
            this.refundRule = refundRule;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRule getRefundRule() {
            return this.refundRule;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleList setRefundRuleItem(FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItem refundRuleItem) {
            this.refundRuleItem = refundRuleItem;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListFlightRuleListRefundRuleItem getRefundRuleItem() {
            return this.refundRuleItem;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleList setSignRule(FlightSearchListResponseBodyModuleFlightListFlightRuleListSignRule signRule) {
            this.signRule = signRule;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListFlightRuleListSignRule getSignRule() {
            return this.signRule;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleList setTuigaiqianInfo(String tuigaiqianInfo) {
            this.tuigaiqianInfo = tuigaiqianInfo;
            return this;
        }
        public String getTuigaiqianInfo() {
            return this.tuigaiqianInfo;
        }

        public FlightSearchListResponseBodyModuleFlightListFlightRuleList setUpgradeRule(FlightSearchListResponseBodyModuleFlightListFlightRuleListUpgradeRule upgradeRule) {
            this.upgradeRule = upgradeRule;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListFlightRuleListUpgradeRule getUpgradeRule() {
            return this.upgradeRule;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferAirlineInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ZH</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("airline_simple_name")
        public String airlineSimpleName;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferAirlineInfo self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferAirlineInfo();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferAirlineInfo setAirlineSimpleName(String airlineSimpleName) {
            this.airlineSimpleName = airlineSimpleName;
            return this;
        }
        public String getAirlineSimpleName() {
            return this.airlineSimpleName;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferArrAirportInfo extends TeaModel {
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
         * <p>HGH</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        /**
         * <strong>example:</strong>
         * <p>T4</p>
         */
        @NameInMap("terminal")
        public String terminal;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferArrAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferArrAirportInfo self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferArrAirportInfo();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferArrAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferArrAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferArrAirportInfo setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferArrAirportInfo setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferArrAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferDepAirportInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PEK</p>
         */
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        /**
         * <strong>example:</strong>
         * <p>T3</p>
         */
        @NameInMap("terminal")
        public String terminal;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferDepAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferDepAirportInfo self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferDepAirportInfo();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferDepAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferDepAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferDepAirportInfo setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferDepAirportInfo setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferDepAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription extends TeaModel {
        @NameInMap("desc")
        public String desc;

        /**
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/imgextra/i4/O1CN01UynXG31pjsEtA3tMF_!!6000000005397-2-tps-36-36.png">https://gw.alicdn.com/imgextra/i4/O1CN01UynXG31pjsEtA3tMF_!!6000000005397-2-tps-36-36.png</a></p>
         */
        @NameInMap("icon")
        public String icon;

        /**
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/imgextra/i1/O1CN01qe7wL21gJ0SmEXXL7_!!6000000004120-2-tps-1206-768.png">https://gw.alicdn.com/imgextra/i1/O1CN01qe7wL21gJ0SmEXXL7_!!6000000004120-2-tps-1206-768.png</a></p>
         */
        @NameInMap("image")
        public String image;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("image")
        public String image;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("largest")
        public String largest;

        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("middle")
        public String middle;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("smallest")
        public String smallest;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setLargest(String largest) {
            this.largest = largest;
            return this;
        }
        public String getLargest() {
            return this.largest;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setMiddle(String middle) {
            this.middle = middle;
            return this;
        }
        public String getMiddle() {
            return this.middle;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO setSmallest(String smallest) {
            this.smallest = smallest;
            return this;
        }
        public String getSmallest() {
            return this.smallest;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes extends TeaModel {
        @NameInMap("baggage_desc")
        public java.util.List<String> baggageDesc;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("baggage_sub_content_type")
        public Integer baggageSubContentType;

        @NameInMap("description")
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription description;

        @NameInMap("image_d_o")
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO imageDO;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_highlight")
        public Boolean isHighlight;

        @NameInMap("sub_title")
        public String subTitle;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setBaggageDesc(java.util.List<String> baggageDesc) {
            this.baggageDesc = baggageDesc;
            return this;
        }
        public java.util.List<String> getBaggageDesc() {
            return this.baggageDesc;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setBaggageSubContentType(Integer baggageSubContentType) {
            this.baggageSubContentType = baggageSubContentType;
            return this;
        }
        public Integer getBaggageSubContentType() {
            return this.baggageSubContentType;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setDescription(FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription description) {
            this.description = description;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesDescription getDescription() {
            return this.description;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setImageDO(FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO imageDO) {
            this.imageDO = imageDO;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizesImageDO getImageDO() {
            return this.imageDO;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setIsHighlight(Boolean isHighlight) {
            this.isHighlight = isHighlight;
            return this;
        }
        public Boolean getIsHighlight() {
            return this.isHighlight;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes setSubTitle(String subTitle) {
            this.subTitle = subTitle;
            return this;
        }
        public String getSubTitle() {
            return this.subTitle;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItems extends TeaModel {
        @NameInMap("baggage_sub_content_visualizes")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes> baggageSubContentVisualizes;

        @NameInMap("extra_content_visualizes")
        public java.util.List<?> extraContentVisualizes;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_struct")
        public Boolean isStruct;

        /**
         * <p>PTC</p>
         * 
         * <strong>example:</strong>
         * <p>ADT</p>
         */
        @NameInMap("ptc")
        public String ptc;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItems self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItems();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItems setBaggageSubContentVisualizes(java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes> baggageSubContentVisualizes) {
            this.baggageSubContentVisualizes = baggageSubContentVisualizes;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItemsBaggageSubContentVisualizes> getBaggageSubContentVisualizes() {
            return this.baggageSubContentVisualizes;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItems setExtraContentVisualizes(java.util.List<?> extraContentVisualizes) {
            this.extraContentVisualizes = extraContentVisualizes;
            return this;
        }
        public java.util.List<?> getExtraContentVisualizes() {
            return this.extraContentVisualizes;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemTips extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/imgextra/i1/O1CN019zl3WZ22fNLxzx2cR_!!6000000007147-2-tps-125-45.png">https://gw.alicdn.com/imgextra/i1/O1CN019zl3WZ22fNLxzx2cR_!!6000000007147-2-tps-125-45.png</a></p>
         */
        @NameInMap("logo")
        public String logo;

        @NameInMap("tips_desc")
        public String tipsDesc;

        /**
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/imgextra/i3/O1CN01rJxjw61f3bXNHAmlk_!!6000000003951-2-tps-1050-675.png">https://gw.alicdn.com/imgextra/i3/O1CN01rJxjw61f3bXNHAmlk_!!6000000003951-2-tps-1050-675.png</a></p>
         */
        @NameInMap("tips_image")
        public String tipsImage;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemTips build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemTips self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemTips();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemTips setLogo(String logo) {
            this.logo = logo;
            return this;
        }
        public String getLogo() {
            return this.logo;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemTips setTipsDesc(String tipsDesc) {
            this.tipsDesc = tipsDesc;
            return this;
        }
        public String getTipsDesc() {
            return this.tipsDesc;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemTips setTipsImage(String tipsImage) {
            this.tipsImage = tipsImage;
            return this;
        }
        public String getTipsImage() {
            return this.tipsImage;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItem extends TeaModel {
        @NameInMap("baggage_sub_items")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItems> baggageSubItems;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("index")
        public Integer index;

        @NameInMap("table_head")
        public String tableHead;

        @NameInMap("tips")
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemTips tips;

        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("type")
        public Integer type;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItem build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItem self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItem();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItem setBaggageSubItems(java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItems> baggageSubItems) {
            this.baggageSubItems = baggageSubItems;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemBaggageSubItems> getBaggageSubItems() {
            return this.baggageSubItems;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItem setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItem setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItem setTips(FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemTips tips) {
            this.tips = tips;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItemTips getTips() {
            return this.tips;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItem setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleInfo extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("cost")
        public Integer cost;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("cost_percent")
        public Integer costPercent;

        /**
         * <strong>example:</strong>
         * <p>1675036500000</p>
         */
        @NameInMap("time_stamp")
        public Integer timeStamp;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("time_type")
        public String timeType;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleInfo self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleInfo> info;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRule build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRule self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRule();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRule setInfo(java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemExtraContents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemExtraContents build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemExtraContents self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemExtraContents();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemExtraContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemExtraContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents extends TeaModel {
        @NameInMap("fee_desc")
        public String feeDesc;

        @NameInMap("fee_range")
        public String feeRange;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("style")
        public Integer style;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents setFeeDesc(String feeDesc) {
            this.feeDesc = feeDesc;
            return this;
        }
        public String getFeeDesc() {
            return this.feeDesc;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents setFeeRange(String feeRange) {
            this.feeRange = feeRange;
            return this;
        }
        public String getFeeRange() {
            return this.feeRange;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents setStyle(Integer style) {
            this.style = style;
            return this;
        }
        public Integer getStyle() {
            return this.style;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemRefundSubItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_struct")
        public Boolean isStruct;

        /**
         * <p>PTC</p>
         * 
         * <strong>example:</strong>
         * <p>ADT</p>
         */
        @NameInMap("ptc")
        public String ptc;

        @NameInMap("refund_sub_contents")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents> refundSubContents;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemRefundSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemRefundSubItems self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemRefundSubItems();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemRefundSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemRefundSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemRefundSubItems setRefundSubContents(java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents> refundSubContents) {
            this.refundSubContents = refundSubContents;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemRefundSubItemsRefundSubContents> getRefundSubContents() {
            return this.refundSubContents;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemRefundSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItem extends TeaModel {
        @NameInMap("extra_contents")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemExtraContents> extraContents;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public Integer index;

        @NameInMap("refund_sub_items")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemRefundSubItems> refundSubItems;

        @NameInMap("sub_table_head")
        public java.util.List<String> subTableHead;

        @NameInMap("table_head")
        public String tableHead;

        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("type")
        public Integer type;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItem build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItem self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItem();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItem setExtraContents(java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemExtraContents> extraContents) {
            this.extraContents = extraContents;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemExtraContents> getExtraContents() {
            return this.extraContents;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItem setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItem setRefundSubItems(java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemRefundSubItems> refundSubItems) {
            this.refundSubItems = refundSubItems;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItemRefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItem setSubTableHead(java.util.List<String> subTableHead) {
            this.subTableHead = subTableHead;
            return this;
        }
        public java.util.List<String> getSubTableHead() {
            return this.subTableHead;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItem setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItem setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleInfo extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("cost")
        public Integer cost;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("cost_percent")
        public Integer costPercent;

        /**
         * <strong>example:</strong>
         * <p>1675036500000</p>
         */
        @NameInMap("time_stamp")
        public Integer timeStamp;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("time_type")
        public String timeType;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleInfo self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleInfo> info;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRule build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRule self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRule();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRule setInfo(java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemExtraContents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemExtraContents build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemExtraContents self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemExtraContents();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemExtraContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemExtraContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents extends TeaModel {
        @NameInMap("fee_desc")
        public String feeDesc;

        @NameInMap("fee_range")
        public String feeRange;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("style")
        public Integer style;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents setFeeDesc(String feeDesc) {
            this.feeDesc = feeDesc;
            return this;
        }
        public String getFeeDesc() {
            return this.feeDesc;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents setFeeRange(String feeRange) {
            this.feeRange = feeRange;
            return this;
        }
        public String getFeeRange() {
            return this.feeRange;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents setStyle(Integer style) {
            this.style = style;
            return this;
        }
        public Integer getStyle() {
            return this.style;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemRefundSubItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_struct")
        public Boolean isStruct;

        /**
         * <p>PTC</p>
         * 
         * <strong>example:</strong>
         * <p>ADT</p>
         */
        @NameInMap("ptc")
        public String ptc;

        @NameInMap("refund_sub_contents")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents> refundSubContents;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemRefundSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemRefundSubItems self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemRefundSubItems();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemRefundSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemRefundSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemRefundSubItems setRefundSubContents(java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents> refundSubContents) {
            this.refundSubContents = refundSubContents;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemRefundSubItemsRefundSubContents> getRefundSubContents() {
            return this.refundSubContents;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemRefundSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItem extends TeaModel {
        @NameInMap("extra_contents")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemExtraContents> extraContents;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("index")
        public Integer index;

        @NameInMap("refund_sub_items")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemRefundSubItems> refundSubItems;

        @NameInMap("sub_table_head")
        public java.util.List<String> subTableHead;

        @NameInMap("table_head")
        public String tableHead;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("type")
        public Integer type;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItem build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItem self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItem();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItem setExtraContents(java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemExtraContents> extraContents) {
            this.extraContents = extraContents;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemExtraContents> getExtraContents() {
            return this.extraContents;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItem setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItem setRefundSubItems(java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemRefundSubItems> refundSubItems) {
            this.refundSubItems = refundSubItems;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItemRefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItem setSubTableHead(java.util.List<String> subTableHead) {
            this.subTableHead = subTableHead;
            return this;
        }
        public java.util.List<String> getSubTableHead() {
            return this.subTableHead;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItem setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItem setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListSignRuleInfo extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("cost")
        public Integer cost;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("cost_percent")
        public Integer costPercent;

        /**
         * <strong>example:</strong>
         * <p>1675036500000</p>
         */
        @NameInMap("time_stamp")
        public Integer timeStamp;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("time_type")
        public String timeType;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListSignRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListSignRuleInfo self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListSignRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListSignRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListSignRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListSignRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListSignRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListSignRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListSignRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListSignRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListSignRuleInfo> info;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListSignRule build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListSignRule self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListSignRule();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListSignRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListSignRule setInfo(java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListSignRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListSignRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListUpgradeRuleInfo extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("cost")
        public Integer cost;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("cost_percent")
        public Integer costPercent;

        /**
         * <strong>example:</strong>
         * <p>1675036500000</p>
         */
        @NameInMap("time_stamp")
        public Integer timeStamp;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("time_type")
        public String timeType;

        @NameInMap("title")
        public String title;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListUpgradeRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListUpgradeRuleInfo self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListUpgradeRuleInfo();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListUpgradeRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListUpgradeRuleInfo setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListUpgradeRuleInfo setCostPercent(Integer costPercent) {
            this.costPercent = costPercent;
            return this;
        }
        public Integer getCostPercent() {
            return this.costPercent;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListUpgradeRuleInfo setTimeStamp(Integer timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Integer getTimeStamp() {
            return this.timeStamp;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListUpgradeRuleInfo setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListUpgradeRuleInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListUpgradeRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("able")
        public Boolean able;

        @NameInMap("info")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListUpgradeRuleInfo> info;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListUpgradeRule build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListUpgradeRule self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListUpgradeRule();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListUpgradeRule setAble(Boolean able) {
            this.able = able;
            return this;
        }
        public Boolean getAble() {
            return this.able;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListUpgradeRule setInfo(java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListUpgradeRuleInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListUpgradeRuleInfo> getInfo() {
            return this.info;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("baggage_info")
        public String baggageInfo;

        @NameInMap("baggage_item")
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItem baggageItem;

        @NameInMap("change_rule")
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRule changeRule;

        @NameInMap("change_rule_item")
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItem changeRuleItem;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("extra")
        public String extra;

        @NameInMap("refund_rule")
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRule refundRule;

        @NameInMap("refund_rule_item")
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItem refundRuleItem;

        @NameInMap("sign_rule")
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListSignRule signRule;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("tuigaiqian_info")
        public String tuigaiqianInfo;

        @NameInMap("upgrade_rule")
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListUpgradeRule upgradeRule;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleList build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleList self = new FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleList();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleList setBaggageInfo(String baggageInfo) {
            this.baggageInfo = baggageInfo;
            return this;
        }
        public String getBaggageInfo() {
            return this.baggageInfo;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleList setBaggageItem(FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItem baggageItem) {
            this.baggageItem = baggageItem;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListBaggageItem getBaggageItem() {
            return this.baggageItem;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleList setChangeRule(FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRule changeRule) {
            this.changeRule = changeRule;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRule getChangeRule() {
            return this.changeRule;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleList setChangeRuleItem(FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItem changeRuleItem) {
            this.changeRuleItem = changeRuleItem;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListChangeRuleItem getChangeRuleItem() {
            return this.changeRuleItem;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleList setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleList setRefundRule(FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRule refundRule) {
            this.refundRule = refundRule;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRule getRefundRule() {
            return this.refundRule;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleList setRefundRuleItem(FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItem refundRuleItem) {
            this.refundRuleItem = refundRuleItem;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListRefundRuleItem getRefundRuleItem() {
            return this.refundRuleItem;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleList setSignRule(FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListSignRule signRule) {
            this.signRule = signRule;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListSignRule getSignRule() {
            return this.signRule;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleList setTuigaiqianInfo(String tuigaiqianInfo) {
            this.tuigaiqianInfo = tuigaiqianInfo;
            return this;
        }
        public String getTuigaiqianInfo() {
            return this.tuigaiqianInfo;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleList setUpgradeRule(FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListUpgradeRule upgradeRule) {
            this.upgradeRule = upgradeRule;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleListUpgradeRule getUpgradeRule() {
            return this.upgradeRule;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightListTransferInfo extends TeaModel {
        @NameInMap("flight_size")
        public String flightSize;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("flight_type")
        public String flightType;

        @NameInMap("transfer_airline_info")
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferAirlineInfo transferAirlineInfo;

        @NameInMap("transfer_arr_airport_info")
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferArrAirportInfo transferArrAirportInfo;

        /**
         * <strong>example:</strong>
         * <p>yyyy-MM-dd HH:mm:ss</p>
         */
        @NameInMap("transfer_arr_date")
        public String transferArrDate;

        @NameInMap("transfer_dep_airport_info")
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferDepAirportInfo transferDepAirportInfo;

        /**
         * <strong>example:</strong>
         * <p>yyyy-MM-dd HH:mm:ss</p>
         */
        @NameInMap("transfer_dep_date")
        public String transferDepDate;

        /**
         * <strong>example:</strong>
         * <p>CA1234</p>
         */
        @NameInMap("transfer_flight_no")
        public String transferFlightNo;

        @NameInMap("transfer_flight_rule_list")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleList> transferFlightRuleList;

        public static FlightSearchListResponseBodyModuleFlightListTransferInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightListTransferInfo self = new FlightSearchListResponseBodyModuleFlightListTransferInfo();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfo setFlightSize(String flightSize) {
            this.flightSize = flightSize;
            return this;
        }
        public String getFlightSize() {
            return this.flightSize;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfo setFlightType(String flightType) {
            this.flightType = flightType;
            return this;
        }
        public String getFlightType() {
            return this.flightType;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfo setTransferAirlineInfo(FlightSearchListResponseBodyModuleFlightListTransferInfoTransferAirlineInfo transferAirlineInfo) {
            this.transferAirlineInfo = transferAirlineInfo;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferAirlineInfo getTransferAirlineInfo() {
            return this.transferAirlineInfo;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfo setTransferArrAirportInfo(FlightSearchListResponseBodyModuleFlightListTransferInfoTransferArrAirportInfo transferArrAirportInfo) {
            this.transferArrAirportInfo = transferArrAirportInfo;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferArrAirportInfo getTransferArrAirportInfo() {
            return this.transferArrAirportInfo;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfo setTransferArrDate(String transferArrDate) {
            this.transferArrDate = transferArrDate;
            return this;
        }
        public String getTransferArrDate() {
            return this.transferArrDate;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfo setTransferDepAirportInfo(FlightSearchListResponseBodyModuleFlightListTransferInfoTransferDepAirportInfo transferDepAirportInfo) {
            this.transferDepAirportInfo = transferDepAirportInfo;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListTransferInfoTransferDepAirportInfo getTransferDepAirportInfo() {
            return this.transferDepAirportInfo;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfo setTransferDepDate(String transferDepDate) {
            this.transferDepDate = transferDepDate;
            return this;
        }
        public String getTransferDepDate() {
            return this.transferDepDate;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfo setTransferFlightNo(String transferFlightNo) {
            this.transferFlightNo = transferFlightNo;
            return this;
        }
        public String getTransferFlightNo() {
            return this.transferFlightNo;
        }

        public FlightSearchListResponseBodyModuleFlightListTransferInfo setTransferFlightRuleList(java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleList> transferFlightRuleList) {
            this.transferFlightRuleList = transferFlightRuleList;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListTransferInfoTransferFlightRuleList> getTransferFlightRuleList() {
            return this.transferFlightRuleList;
        }

    }

    public static class FlightSearchListResponseBodyModuleFlightList extends TeaModel {
        @NameInMap("airline_info")
        public FlightSearchListResponseBodyModuleFlightListAirlineInfo airlineInfo;

        @NameInMap("arr_airport_info")
        public FlightSearchListResponseBodyModuleFlightListArrAirportInfo arrAirportInfo;

        /**
         * <strong>example:</strong>
         * <p>yyyy-MM-dd HH:mm:ss</p>
         */
        @NameInMap("arr_date")
        public String arrDate;

        @NameInMap("basic_cabin_price")
        public Integer basicCabinPrice;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("build_price")
        public Integer buildPrice;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        @NameInMap("cabin_info_list")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoList> cabinInfoList;

        /**
         * <strong>example:</strong>
         * <p>FM</p>
         */
        @NameInMap("carrier_airline")
        public String carrierAirline;

        /**
         * <strong>example:</strong>
         * <p>FM9152</p>
         */
        @NameInMap("carrier_no")
        public String carrierNo;

        @NameInMap("class_rule")
        public String classRule;

        @NameInMap("dep_airport_info")
        public FlightSearchListResponseBodyModuleFlightListDepAirportInfo depAirportInfo;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <strong>example:</strong>
         * <p>yyyy-MM-dd HH:mm:ss</p>
         */
        @NameInMap("dep_date")
        public String depDate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("discount")
        public Integer discount;

        /**
         * <strong>example:</strong>
         * <p>CA1234</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("flight_rule_list")
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleList> flightRuleList;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("flight_rule_list_str")
        public String flightRuleListStr;

        @NameInMap("flight_size")
        public String flightSize;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("flight_type")
        public String flightType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("invoice_type")
        public Integer invoiceType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_protocol")
        public Boolean isProtocol;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("is_share")
        public Boolean isShare;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("is_stop")
        public Boolean isStop;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("is_transfer")
        public Boolean isTransfer;

        @NameInMap("meal_desc")
        public String mealDesc;

        /**
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;value&quot;}</p>
         */
        @NameInMap("memo")
        public String memo;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("oil_price")
        public Integer oilPrice;

        /**
         * <strong>example:</strong>
         * <p>wisdiii2ii22ii2</p>
         */
        @NameInMap("ota_item_id")
        public String otaItemId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("price")
        public Integer price;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("product_type")
        public Long productType;

        @NameInMap("product_type_desc")
        public String productTypeDesc;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("promotion_price")
        public String promotionPrice;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("remained_seat_count")
        public String remainedSeatCount;

        /**
         * <strong>example:</strong>
         * <p>1000_1_0</p>
         */
        @NameInMap("secret_params")
        public String secretParams;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("segment_number")
        public String segmentNumber;

        /**
         * <strong>example:</strong>
         * <p>yyyy-MM-dd HH:mm:ss</p>
         */
        @NameInMap("stop_arr_time")
        public String stopArrTime;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("stop_city")
        public String stopCity;

        /**
         * <strong>example:</strong>
         * <p>yyyy-MM-dd HH:mm:ss</p>
         */
        @NameInMap("stop_dep_time")
        public String stopDepTime;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ticket_price")
        public Integer ticketPrice;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total_price")
        public String totalPrice;

        @NameInMap("transfer_info")
        public FlightSearchListResponseBodyModuleFlightListTransferInfo transferInfo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("trip_type")
        public Integer tripType;

        public static FlightSearchListResponseBodyModuleFlightList build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModuleFlightList self = new FlightSearchListResponseBodyModuleFlightList();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModuleFlightList setAirlineInfo(FlightSearchListResponseBodyModuleFlightListAirlineInfo airlineInfo) {
            this.airlineInfo = airlineInfo;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListAirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        public FlightSearchListResponseBodyModuleFlightList setArrAirportInfo(FlightSearchListResponseBodyModuleFlightListArrAirportInfo arrAirportInfo) {
            this.arrAirportInfo = arrAirportInfo;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        public FlightSearchListResponseBodyModuleFlightList setArrDate(String arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public String getArrDate() {
            return this.arrDate;
        }

        public FlightSearchListResponseBodyModuleFlightList setBasicCabinPrice(Integer basicCabinPrice) {
            this.basicCabinPrice = basicCabinPrice;
            return this;
        }
        public Integer getBasicCabinPrice() {
            return this.basicCabinPrice;
        }

        public FlightSearchListResponseBodyModuleFlightList setBuildPrice(Integer buildPrice) {
            this.buildPrice = buildPrice;
            return this;
        }
        public Integer getBuildPrice() {
            return this.buildPrice;
        }

        public FlightSearchListResponseBodyModuleFlightList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public FlightSearchListResponseBodyModuleFlightList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public FlightSearchListResponseBodyModuleFlightList setCabinInfoList(java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoList> cabinInfoList) {
            this.cabinInfoList = cabinInfoList;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListCabinInfoList> getCabinInfoList() {
            return this.cabinInfoList;
        }

        public FlightSearchListResponseBodyModuleFlightList setCarrierAirline(String carrierAirline) {
            this.carrierAirline = carrierAirline;
            return this;
        }
        public String getCarrierAirline() {
            return this.carrierAirline;
        }

        public FlightSearchListResponseBodyModuleFlightList setCarrierNo(String carrierNo) {
            this.carrierNo = carrierNo;
            return this;
        }
        public String getCarrierNo() {
            return this.carrierNo;
        }

        public FlightSearchListResponseBodyModuleFlightList setClassRule(String classRule) {
            this.classRule = classRule;
            return this;
        }
        public String getClassRule() {
            return this.classRule;
        }

        public FlightSearchListResponseBodyModuleFlightList setDepAirportInfo(FlightSearchListResponseBodyModuleFlightListDepAirportInfo depAirportInfo) {
            this.depAirportInfo = depAirportInfo;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListDepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        public FlightSearchListResponseBodyModuleFlightList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightSearchListResponseBodyModuleFlightList setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public FlightSearchListResponseBodyModuleFlightList setDiscount(Integer discount) {
            this.discount = discount;
            return this;
        }
        public Integer getDiscount() {
            return this.discount;
        }

        public FlightSearchListResponseBodyModuleFlightList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightSearchListResponseBodyModuleFlightList setFlightRuleList(java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleList> flightRuleList) {
            this.flightRuleList = flightRuleList;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightListFlightRuleList> getFlightRuleList() {
            return this.flightRuleList;
        }

        public FlightSearchListResponseBodyModuleFlightList setFlightRuleListStr(String flightRuleListStr) {
            this.flightRuleListStr = flightRuleListStr;
            return this;
        }
        public String getFlightRuleListStr() {
            return this.flightRuleListStr;
        }

        public FlightSearchListResponseBodyModuleFlightList setFlightSize(String flightSize) {
            this.flightSize = flightSize;
            return this;
        }
        public String getFlightSize() {
            return this.flightSize;
        }

        public FlightSearchListResponseBodyModuleFlightList setFlightType(String flightType) {
            this.flightType = flightType;
            return this;
        }
        public String getFlightType() {
            return this.flightType;
        }

        public FlightSearchListResponseBodyModuleFlightList setInvoiceType(Integer invoiceType) {
            this.invoiceType = invoiceType;
            return this;
        }
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        public FlightSearchListResponseBodyModuleFlightList setIsProtocol(Boolean isProtocol) {
            this.isProtocol = isProtocol;
            return this;
        }
        public Boolean getIsProtocol() {
            return this.isProtocol;
        }

        public FlightSearchListResponseBodyModuleFlightList setIsShare(Boolean isShare) {
            this.isShare = isShare;
            return this;
        }
        public Boolean getIsShare() {
            return this.isShare;
        }

        public FlightSearchListResponseBodyModuleFlightList setIsStop(Boolean isStop) {
            this.isStop = isStop;
            return this;
        }
        public Boolean getIsStop() {
            return this.isStop;
        }

        public FlightSearchListResponseBodyModuleFlightList setIsTransfer(Boolean isTransfer) {
            this.isTransfer = isTransfer;
            return this;
        }
        public Boolean getIsTransfer() {
            return this.isTransfer;
        }

        public FlightSearchListResponseBodyModuleFlightList setMealDesc(String mealDesc) {
            this.mealDesc = mealDesc;
            return this;
        }
        public String getMealDesc() {
            return this.mealDesc;
        }

        public FlightSearchListResponseBodyModuleFlightList setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public FlightSearchListResponseBodyModuleFlightList setOilPrice(Integer oilPrice) {
            this.oilPrice = oilPrice;
            return this;
        }
        public Integer getOilPrice() {
            return this.oilPrice;
        }

        public FlightSearchListResponseBodyModuleFlightList setOtaItemId(String otaItemId) {
            this.otaItemId = otaItemId;
            return this;
        }
        public String getOtaItemId() {
            return this.otaItemId;
        }

        public FlightSearchListResponseBodyModuleFlightList setPrice(Integer price) {
            this.price = price;
            return this;
        }
        public Integer getPrice() {
            return this.price;
        }

        public FlightSearchListResponseBodyModuleFlightList setProductType(Long productType) {
            this.productType = productType;
            return this;
        }
        public Long getProductType() {
            return this.productType;
        }

        public FlightSearchListResponseBodyModuleFlightList setProductTypeDesc(String productTypeDesc) {
            this.productTypeDesc = productTypeDesc;
            return this;
        }
        public String getProductTypeDesc() {
            return this.productTypeDesc;
        }

        public FlightSearchListResponseBodyModuleFlightList setPromotionPrice(String promotionPrice) {
            this.promotionPrice = promotionPrice;
            return this;
        }
        public String getPromotionPrice() {
            return this.promotionPrice;
        }

        public FlightSearchListResponseBodyModuleFlightList setRemainedSeatCount(String remainedSeatCount) {
            this.remainedSeatCount = remainedSeatCount;
            return this;
        }
        public String getRemainedSeatCount() {
            return this.remainedSeatCount;
        }

        public FlightSearchListResponseBodyModuleFlightList setSecretParams(String secretParams) {
            this.secretParams = secretParams;
            return this;
        }
        public String getSecretParams() {
            return this.secretParams;
        }

        public FlightSearchListResponseBodyModuleFlightList setSegmentNumber(String segmentNumber) {
            this.segmentNumber = segmentNumber;
            return this;
        }
        public String getSegmentNumber() {
            return this.segmentNumber;
        }

        public FlightSearchListResponseBodyModuleFlightList setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public FlightSearchListResponseBodyModuleFlightList setStopCity(String stopCity) {
            this.stopCity = stopCity;
            return this;
        }
        public String getStopCity() {
            return this.stopCity;
        }

        public FlightSearchListResponseBodyModuleFlightList setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        public FlightSearchListResponseBodyModuleFlightList setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        public FlightSearchListResponseBodyModuleFlightList setTotalPrice(String totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public String getTotalPrice() {
            return this.totalPrice;
        }

        public FlightSearchListResponseBodyModuleFlightList setTransferInfo(FlightSearchListResponseBodyModuleFlightListTransferInfo transferInfo) {
            this.transferInfo = transferInfo;
            return this;
        }
        public FlightSearchListResponseBodyModuleFlightListTransferInfo getTransferInfo() {
            return this.transferInfo;
        }

        public FlightSearchListResponseBodyModuleFlightList setTripType(Integer tripType) {
            this.tripType = tripType;
            return this;
        }
        public Integer getTripType() {
            return this.tripType;
        }

    }

    public static class FlightSearchListResponseBodyModule extends TeaModel {
        @NameInMap("flight_list")
        public java.util.List<FlightSearchListResponseBodyModuleFlightList> flightList;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("is_replace_pnr")
        public Boolean isReplacePnr;

        public static FlightSearchListResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightSearchListResponseBodyModule self = new FlightSearchListResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightSearchListResponseBodyModule setFlightList(java.util.List<FlightSearchListResponseBodyModuleFlightList> flightList) {
            this.flightList = flightList;
            return this;
        }
        public java.util.List<FlightSearchListResponseBodyModuleFlightList> getFlightList() {
            return this.flightList;
        }

        public FlightSearchListResponseBodyModule setIsReplacePnr(Boolean isReplacePnr) {
            this.isReplacePnr = isReplacePnr;
            return this;
        }
        public Boolean getIsReplacePnr() {
            return this.isReplacePnr;
        }

    }

}
