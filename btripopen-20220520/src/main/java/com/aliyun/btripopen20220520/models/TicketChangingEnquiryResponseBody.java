// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TicketChangingEnquiryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public TicketChangingEnquiryResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>B72B39C8-32DE-558D-AD1C-D53F11F6ADFE</p>
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

    public static TicketChangingEnquiryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TicketChangingEnquiryResponseBody self = new TicketChangingEnquiryResponseBody();
        return TeaModel.build(map, self);
    }

    public TicketChangingEnquiryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TicketChangingEnquiryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TicketChangingEnquiryResponseBody setModule(TicketChangingEnquiryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TicketChangingEnquiryResponseBodyModule getModule() {
        return this.module;
    }

    public TicketChangingEnquiryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TicketChangingEnquiryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TicketChangingEnquiryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListAirlineInfo extends TeaModel {
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

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListAirlineInfo self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListAirlineInfo();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListAirlineInfo setAirlineSimpleName(String airlineSimpleName) {
            this.airlineSimpleName = airlineSimpleName;
            return this;
        }
        public String getAirlineSimpleName() {
            return this.airlineSimpleName;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo extends TeaModel {
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

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizesDescription extends TeaModel {
        @NameInMap("desc")
        public String desc;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("icon")
        public String icon;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("image")
        public String image;

        @NameInMap("title")
        public String title;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizesDescription build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizesDescription self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizesDescription();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizesDescription setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizesDescription setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizesDescription setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizesDescription setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizesImageDO extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/imgextra/i3/O1CN01kLt3m923XsUs6WVif_!!6000000007266-2-tps-280-300.png">https://gw.alicdn.com/imgextra/i3/O1CN01kLt3m923XsUs6WVif_!!6000000007266-2-tps-280-300.png</a></p>
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

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizesImageDO build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizesImageDO self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizesImageDO();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizesImageDO setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizesImageDO setLargest(String largest) {
            this.largest = largest;
            return this;
        }
        public String getLargest() {
            return this.largest;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizesImageDO setMiddle(String middle) {
            this.middle = middle;
            return this;
        }
        public String getMiddle() {
            return this.middle;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizesImageDO setSmallest(String smallest) {
            this.smallest = smallest;
            return this;
        }
        public String getSmallest() {
            return this.smallest;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizes extends TeaModel {
        @NameInMap("baggage_desc")
        public java.util.List<String> baggageDesc;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("baggage_sub_content_type")
        public Integer baggageSubContentType;

        @NameInMap("description")
        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizesDescription description;

        @NameInMap("imageDO")
        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizesImageDO imageDO;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_highlight")
        public Boolean isHighlight;

        @NameInMap("subTitle")
        public String subTitle;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizes build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizes self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizes();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizes setBaggageDesc(java.util.List<String> baggageDesc) {
            this.baggageDesc = baggageDesc;
            return this;
        }
        public java.util.List<String> getBaggageDesc() {
            return this.baggageDesc;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizes setBaggageSubContentType(Integer baggageSubContentType) {
            this.baggageSubContentType = baggageSubContentType;
            return this;
        }
        public Integer getBaggageSubContentType() {
            return this.baggageSubContentType;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizes setDescription(TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizesDescription description) {
            this.description = description;
            return this;
        }
        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizesDescription getDescription() {
            return this.description;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizes setImageDO(TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizesImageDO imageDO) {
            this.imageDO = imageDO;
            return this;
        }
        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizesImageDO getImageDO() {
            return this.imageDO;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizes setIsHighlight(Boolean isHighlight) {
            this.isHighlight = isHighlight;
            return this;
        }
        public Boolean getIsHighlight() {
            return this.isHighlight;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizes setSubTitle(String subTitle) {
            this.subTitle = subTitle;
            return this;
        }
        public String getSubTitle() {
            return this.subTitle;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContents extends TeaModel {
        @NameInMap("baggage_desc")
        public String baggageDesc;

        @NameInMap("icon")
        public String icon;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("style")
        public Integer style;

        @NameInMap("sub_title")
        public String subTitle;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContents build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContents self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContents();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContents setBaggageDesc(String baggageDesc) {
            this.baggageDesc = baggageDesc;
            return this;
        }
        public String getBaggageDesc() {
            return this.baggageDesc;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContents setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContents setStyle(Integer style) {
            this.style = style;
            return this;
        }
        public Integer getStyle() {
            return this.style;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContents setSubTitle(String subTitle) {
            this.subTitle = subTitle;
            return this;
        }
        public String getSubTitle() {
            return this.subTitle;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItems extends TeaModel {
        /**
         * <p>attributes</p>
         */
        @NameInMap("attributes")
        public java.util.Map<String, ?> attributes;

        @NameInMap("baggage_sub_content_visualizes")
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizes> baggageSubContentVisualizes;

        @NameInMap("baggage_sub_contents")
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContents> baggageSubContents;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_struct")
        public Boolean isStruct;

        /**
         * <strong>example:</strong>
         * <p>ADT</p>
         */
        @NameInMap("ptc")
        public String ptc;

        @NameInMap("title")
        public String title;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItems build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItems self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItems();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItems setAttributes(java.util.Map<String, ?> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.Map<String, ?> getAttributes() {
            return this.attributes;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItems setBaggageSubContentVisualizes(java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizes> baggageSubContentVisualizes) {
            this.baggageSubContentVisualizes = baggageSubContentVisualizes;
            return this;
        }
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContentVisualizes> getBaggageSubContentVisualizes() {
            return this.baggageSubContentVisualizes;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItems setBaggageSubContents(java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContents> baggageSubContents) {
            this.baggageSubContents = baggageSubContents;
            return this;
        }
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItemsBaggageSubContents> getBaggageSubContents() {
            return this.baggageSubContents;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsTips extends TeaModel {
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

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsTips build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsTips self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsTips();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsTips setLogo(String logo) {
            this.logo = logo;
            return this;
        }
        public String getLogo() {
            return this.logo;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsTips setTipsDesc(String tipsDesc) {
            this.tipsDesc = tipsDesc;
            return this;
        }
        public String getTipsDesc() {
            return this.tipsDesc;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsTips setTipsImage(String tipsImage) {
            this.tipsImage = tipsImage;
            return this;
        }
        public String getTipsImage() {
            return this.tipsImage;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetails extends TeaModel {
        @NameInMap("baggage_sub_items")
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItems> baggageSubItems;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public Integer index;

        @NameInMap("table_head")
        public String tableHead;

        @NameInMap("tips")
        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsTips tips;

        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("type")
        public Integer type;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetails build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetails self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetails();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetails setBaggageSubItems(java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItems> baggageSubItems) {
            this.baggageSubItems = baggageSubItems;
            return this;
        }
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsBaggageSubItems> getBaggageSubItems() {
            return this.baggageSubItems;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetails setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetails setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetails setTips(TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsTips tips) {
            this.tips = tips;
            return this;
        }
        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetailsTips getTips() {
            return this.tips;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetails setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetails setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsExtraContents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("content")
        public String content;

        @NameInMap("icon")
        public String icon;

        @NameInMap("title")
        public String title;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsExtraContents build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsExtraContents self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsExtraContents();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsExtraContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsExtraContents setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsExtraContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsRefundSubItemsRefundSubContents extends TeaModel {
        @NameInMap("fee_desc")
        public String feeDesc;

        @NameInMap("fee_range")
        public String feeRange;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("style")
        public String style;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsRefundSubItemsRefundSubContents build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsRefundSubItemsRefundSubContents self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsRefundSubItemsRefundSubContents();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsRefundSubItemsRefundSubContents setFeeDesc(String feeDesc) {
            this.feeDesc = feeDesc;
            return this;
        }
        public String getFeeDesc() {
            return this.feeDesc;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsRefundSubItemsRefundSubContents setFeeRange(String feeRange) {
            this.feeRange = feeRange;
            return this;
        }
        public String getFeeRange() {
            return this.feeRange;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsRefundSubItemsRefundSubContents setStyle(String style) {
            this.style = style;
            return this;
        }
        public String getStyle() {
            return this.style;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsRefundSubItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_struct")
        public Boolean isStruct;

        /**
         * <strong>example:</strong>
         * <p>ADT</p>
         */
        @NameInMap("ptc")
        public String ptc;

        @NameInMap("refund_sub_contents")
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsRefundSubItemsRefundSubContents> refundSubContents;

        @NameInMap("title")
        public String title;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsRefundSubItems build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsRefundSubItems self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsRefundSubItems();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsRefundSubItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsRefundSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsRefundSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsRefundSubItems setRefundSubContents(java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsRefundSubItemsRefundSubContents> refundSubContents) {
            this.refundSubContents = refundSubContents;
            return this;
        }
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsRefundSubItemsRefundSubContents> getRefundSubContents() {
            return this.refundSubContents;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsRefundSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetails extends TeaModel {
        @NameInMap("extra_contents")
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsExtraContents> extraContents;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public Integer index;

        @NameInMap("refund_sub_items")
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsRefundSubItems> refundSubItems;

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

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetails build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetails self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetails();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetails setExtraContents(java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsExtraContents> extraContents) {
            this.extraContents = extraContents;
            return this;
        }
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsExtraContents> getExtraContents() {
            return this.extraContents;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetails setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetails setRefundSubItems(java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsRefundSubItems> refundSubItems) {
            this.refundSubItems = refundSubItems;
            return this;
        }
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetailsRefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetails setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetails setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetails setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsExtraContents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("content")
        public String content;

        @NameInMap("icon")
        public String icon;

        @NameInMap("title")
        public String title;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsExtraContents build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsExtraContents self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsExtraContents();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsExtraContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsExtraContents setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsExtraContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsRefundSubItemsRefundSubContents extends TeaModel {
        @NameInMap("fee_desc")
        public String feeDesc;

        @NameInMap("fee_range")
        public String feeRange;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("style")
        public String style;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsRefundSubItemsRefundSubContents build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsRefundSubItemsRefundSubContents self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsRefundSubItemsRefundSubContents();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsRefundSubItemsRefundSubContents setFeeDesc(String feeDesc) {
            this.feeDesc = feeDesc;
            return this;
        }
        public String getFeeDesc() {
            return this.feeDesc;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsRefundSubItemsRefundSubContents setFeeRange(String feeRange) {
            this.feeRange = feeRange;
            return this;
        }
        public String getFeeRange() {
            return this.feeRange;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsRefundSubItemsRefundSubContents setStyle(String style) {
            this.style = style;
            return this;
        }
        public String getStyle() {
            return this.style;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsRefundSubItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_struct")
        public Boolean isStruct;

        /**
         * <strong>example:</strong>
         * <p>ADT</p>
         */
        @NameInMap("ptc")
        public String ptc;

        @NameInMap("refund_sub_contents")
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsRefundSubItemsRefundSubContents> refundSubContents;

        @NameInMap("title")
        public String title;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsRefundSubItems build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsRefundSubItems self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsRefundSubItems();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsRefundSubItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsRefundSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsRefundSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsRefundSubItems setRefundSubContents(java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsRefundSubItemsRefundSubContents> refundSubContents) {
            this.refundSubContents = refundSubContents;
            return this;
        }
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsRefundSubItemsRefundSubContents> getRefundSubContents() {
            return this.refundSubContents;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsRefundSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetails extends TeaModel {
        @NameInMap("extra_contents")
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsExtraContents> extraContents;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public Integer index;

        @NameInMap("refund_sub_items")
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsRefundSubItems> refundSubItems;

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

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetails build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetails self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetails();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetails setExtraContents(java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsExtraContents> extraContents) {
            this.extraContents = extraContents;
            return this;
        }
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsExtraContents> getExtraContents() {
            return this.extraContents;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetails setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetails setRefundSubItems(java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsRefundSubItems> refundSubItems) {
            this.refundSubItems = refundSubItems;
            return this;
        }
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetailsRefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetails setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetails setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetails setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRq extends TeaModel {
        @NameInMap("baggage_details")
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetails> baggageDetails;

        @NameInMap("change_details")
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetails> changeDetails;

        @NameInMap("refund_details")
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetails> refundDetails;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRq build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRq self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRq();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRq setBaggageDetails(java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetails> baggageDetails) {
            this.baggageDetails = baggageDetails;
            return this;
        }
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqBaggageDetails> getBaggageDetails() {
            return this.baggageDetails;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRq setChangeDetails(java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetails> changeDetails) {
            this.changeDetails = changeDetails;
            return this;
        }
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqChangeDetails> getChangeDetails() {
            return this.changeDetails;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRq setRefundDetails(java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetails> refundDetails) {
            this.refundDetails = refundDetails;
            return this;
        }
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRqRefundDetails> getRefundDetails() {
            return this.refundDetails;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListModifyPriceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("passenger_type")
        public Integer passengerType;

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
        @NameInMap("upgrade_fee")
        public Integer upgradeFee;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("upgrade_price")
        public Integer upgradePrice;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListModifyPriceList build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListModifyPriceList self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListModifyPriceList();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListModifyPriceList setPassengerType(Integer passengerType) {
            this.passengerType = passengerType;
            return this;
        }
        public Integer getPassengerType() {
            return this.passengerType;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListModifyPriceList setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListModifyPriceList setUpgradeFee(Integer upgradeFee) {
            this.upgradeFee = upgradeFee;
            return this;
        }
        public Integer getUpgradeFee() {
            return this.upgradeFee;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListModifyPriceList setUpgradePrice(Integer upgradePrice) {
            this.upgradePrice = upgradePrice;
            return this;
        }
        public Integer getUpgradePrice() {
            return this.upgradePrice;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList extends TeaModel {
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

        @NameInMap("cabin_desc")
        public String cabinDesc;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("cabin_discount")
        public Integer cabinDiscount;

        @NameInMap("change_ota_item_rule_rq")
        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRq changeOtaItemRuleRq;

        /**
         * <strong>example:</strong>
         * <p>G</p>
         */
        @NameInMap("child_cabin")
        public String childCabin;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("left_num")
        public String leftNum;

        @NameInMap("modify_price_list")
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListModifyPriceList> modifyPriceList;

        /**
         * <strong>example:</strong>
         * <p>360379a11ee84e9aa011baa41b758fe6</p>
         */
        @NameInMap("ota_itemid")
        public String otaItemid;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList setCabinDesc(String cabinDesc) {
            this.cabinDesc = cabinDesc;
            return this;
        }
        public String getCabinDesc() {
            return this.cabinDesc;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList setCabinDiscount(Integer cabinDiscount) {
            this.cabinDiscount = cabinDiscount;
            return this;
        }
        public Integer getCabinDiscount() {
            return this.cabinDiscount;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList setChangeOtaItemRuleRq(TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRq changeOtaItemRuleRq) {
            this.changeOtaItemRuleRq = changeOtaItemRuleRq;
            return this;
        }
        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListChangeOtaItemRuleRq getChangeOtaItemRuleRq() {
            return this.changeOtaItemRuleRq;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList setChildCabin(String childCabin) {
            this.childCabin = childCabin;
            return this;
        }
        public String getChildCabin() {
            return this.childCabin;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList setLeftNum(String leftNum) {
            this.leftNum = leftNum;
            return this;
        }
        public String getLeftNum() {
            return this.leftNum;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList setModifyPriceList(java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListModifyPriceList> modifyPriceList) {
            this.modifyPriceList = modifyPriceList;
            return this;
        }
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListModifyPriceList> getModifyPriceList() {
            return this.modifyPriceList;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList setOtaItemid(String otaItemid) {
            this.otaItemid = otaItemid;
            return this;
        }
        public String getOtaItemid() {
            return this.otaItemid;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo extends TeaModel {
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

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListLowestCabinPrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("passenger_type")
        public Integer passengerType;

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
        @NameInMap("upgrade_fee")
        public Integer upgradeFee;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("upgrade_price")
        public Integer upgradePrice;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListLowestCabinPrice build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListLowestCabinPrice self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListLowestCabinPrice();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListLowestCabinPrice setPassengerType(Integer passengerType) {
            this.passengerType = passengerType;
            return this;
        }
        public Integer getPassengerType() {
            return this.passengerType;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListLowestCabinPrice setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListLowestCabinPrice setUpgradeFee(Integer upgradeFee) {
            this.upgradeFee = upgradeFee;
            return this;
        }
        public Integer getUpgradeFee() {
            return this.upgradeFee;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListLowestCabinPrice setUpgradePrice(Integer upgradePrice) {
            this.upgradePrice = upgradePrice;
            return this;
        }
        public Integer getUpgradePrice() {
            return this.upgradePrice;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoList extends TeaModel {
        @NameInMap("airline_info")
        public TicketChangingEnquiryResponseBodyModuleFlightInfoListAirlineInfo airlineInfo;

        @NameInMap("arr_airport_info")
        public TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo arrAirportInfo;

        @NameInMap("cabin_list")
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList> cabinList;

        /**
         * <strong>example:</strong>
         * <p>CA1704</p>
         */
        @NameInMap("carrier_airline")
        public String carrierAirline;

        /**
         * <strong>example:</strong>
         * <p>CA1704</p>
         */
        @NameInMap("carrier_no")
        public String carrierNo;

        @NameInMap("dep_airport_info")
        public TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo depAirportInfo;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <strong>example:</strong>
         * <p>CA1351</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("is_share")
        public Boolean isShare;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("lowest_cabin")
        public String lowestCabin;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("lowest_cabin_class")
        public String lowestCabinClass;

        @NameInMap("lowest_cabin_desc")
        public String lowestCabinDesc;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("lowest_cabin_num")
        public String lowestCabinNum;

        @NameInMap("lowest_cabin_price")
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListLowestCabinPrice> lowestCabinPrice;

        /**
         * <strong>example:</strong>
         * <p>2000-00-00 00:00:00</p>
         */
        @NameInMap("modify_flight_arr_time")
        public String modifyFlightArrTime;

        /**
         * <strong>example:</strong>
         * <p>2000-00-00 00:00:00</p>
         */
        @NameInMap("modify_flight_dep_date")
        public String modifyFlightDepDate;

        /**
         * <strong>example:</strong>
         * <p>2000-00-00 00:00:00</p>
         */
        @NameInMap("modify_flight_dep_time")
        public String modifyFlightDepTime;

        /**
         * <strong>example:</strong>
         * <p>d1fb9e0a794f45e1b762d36ff1d17zz</p>
         */
        @NameInMap("session_id")
        public String sessionId;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoList build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoList self = new TicketChangingEnquiryResponseBodyModuleFlightInfoList();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setAirlineInfo(TicketChangingEnquiryResponseBodyModuleFlightInfoListAirlineInfo airlineInfo) {
            this.airlineInfo = airlineInfo;
            return this;
        }
        public TicketChangingEnquiryResponseBodyModuleFlightInfoListAirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setArrAirportInfo(TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo arrAirportInfo) {
            this.arrAirportInfo = arrAirportInfo;
            return this;
        }
        public TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setCabinList(java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList> cabinList) {
            this.cabinList = cabinList;
            return this;
        }
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList> getCabinList() {
            return this.cabinList;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setCarrierAirline(String carrierAirline) {
            this.carrierAirline = carrierAirline;
            return this;
        }
        public String getCarrierAirline() {
            return this.carrierAirline;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setCarrierNo(String carrierNo) {
            this.carrierNo = carrierNo;
            return this;
        }
        public String getCarrierNo() {
            return this.carrierNo;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setDepAirportInfo(TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo depAirportInfo) {
            this.depAirportInfo = depAirportInfo;
            return this;
        }
        public TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setIsShare(Boolean isShare) {
            this.isShare = isShare;
            return this;
        }
        public Boolean getIsShare() {
            return this.isShare;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setLowestCabin(String lowestCabin) {
            this.lowestCabin = lowestCabin;
            return this;
        }
        public String getLowestCabin() {
            return this.lowestCabin;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setLowestCabinClass(String lowestCabinClass) {
            this.lowestCabinClass = lowestCabinClass;
            return this;
        }
        public String getLowestCabinClass() {
            return this.lowestCabinClass;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setLowestCabinDesc(String lowestCabinDesc) {
            this.lowestCabinDesc = lowestCabinDesc;
            return this;
        }
        public String getLowestCabinDesc() {
            return this.lowestCabinDesc;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setLowestCabinNum(String lowestCabinNum) {
            this.lowestCabinNum = lowestCabinNum;
            return this;
        }
        public String getLowestCabinNum() {
            return this.lowestCabinNum;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setLowestCabinPrice(java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListLowestCabinPrice> lowestCabinPrice) {
            this.lowestCabinPrice = lowestCabinPrice;
            return this;
        }
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListLowestCabinPrice> getLowestCabinPrice() {
            return this.lowestCabinPrice;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setModifyFlightArrTime(String modifyFlightArrTime) {
            this.modifyFlightArrTime = modifyFlightArrTime;
            return this;
        }
        public String getModifyFlightArrTime() {
            return this.modifyFlightArrTime;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setModifyFlightDepDate(String modifyFlightDepDate) {
            this.modifyFlightDepDate = modifyFlightDepDate;
            return this;
        }
        public String getModifyFlightDepDate() {
            return this.modifyFlightDepDate;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setModifyFlightDepTime(String modifyFlightDepTime) {
            this.modifyFlightDepTime = modifyFlightDepTime;
            return this;
        }
        public String getModifyFlightDepTime() {
            return this.modifyFlightDepTime;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModule extends TeaModel {
        @NameInMap("flight_info_list")
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoList> flightInfoList;

        public static TicketChangingEnquiryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModule self = new TicketChangingEnquiryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModule setFlightInfoList(java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoList> flightInfoList) {
            this.flightInfoList = flightInfoList;
            return this;
        }
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoList> getFlightInfoList() {
            return this.flightInfoList;
        }

    }

}
