// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOtaItemDetailResponseBody extends TeaModel {
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
    public FlightOtaItemDetailResponseBodyModule module;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>92359A00-85D8-16C4-AED0-249618DEEC17</p>
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
     * <p>210bc60a16916374201706365d2a16</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static FlightOtaItemDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightOtaItemDetailResponseBody self = new FlightOtaItemDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightOtaItemDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightOtaItemDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightOtaItemDetailResponseBody setModule(FlightOtaItemDetailResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightOtaItemDetailResponseBodyModule getModule() {
        return this.module;
    }

    public FlightOtaItemDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightOtaItemDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightOtaItemDetailResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizesDescription extends TeaModel {
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

        public static FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizesDescription build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizesDescription self = new FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizesDescription();
            return TeaModel.build(map, self);
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizesDescription setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizesDescription setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizesDescription setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizesDescription setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizesImageDO extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/imgextra/i3/O1CN01kLt3m923XsUs6WVif_!!6000000007266-2-tps-280-300.png">https://gw.alicdn.com/imgextra/i3/O1CN01kLt3m923XsUs6WVif_!!6000000007266-2-tps-280-300.png</a></p>
         */
        @NameInMap("image")
        public String image;

        /**
         * <strong>example:</strong>
         * <p>55</p>
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

        public static FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizesImageDO build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizesImageDO self = new FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizesImageDO();
            return TeaModel.build(map, self);
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizesImageDO setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizesImageDO setLargest(String largest) {
            this.largest = largest;
            return this;
        }
        public String getLargest() {
            return this.largest;
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizesImageDO setMiddle(String middle) {
            this.middle = middle;
            return this;
        }
        public String getMiddle() {
            return this.middle;
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizesImageDO setSmallest(String smallest) {
            this.smallest = smallest;
            return this;
        }
        public String getSmallest() {
            return this.smallest;
        }

    }

    public static class FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizes extends TeaModel {
        /**
         * <p>baggage_desc</p>
         */
        @NameInMap("baggage_desc")
        public java.util.List<String> baggageDesc;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("baggage_sub_content_type")
        public Integer baggageSubContentType;

        @NameInMap("description")
        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizesDescription description;

        @NameInMap("image_d_o")
        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizesImageDO imageDO;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("is_highlight")
        public Boolean isHighlight;

        @NameInMap("sub_title")
        public String subTitle;

        public static FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizes build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizes self = new FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizes();
            return TeaModel.build(map, self);
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizes setBaggageDesc(java.util.List<String> baggageDesc) {
            this.baggageDesc = baggageDesc;
            return this;
        }
        public java.util.List<String> getBaggageDesc() {
            return this.baggageDesc;
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizes setBaggageSubContentType(Integer baggageSubContentType) {
            this.baggageSubContentType = baggageSubContentType;
            return this;
        }
        public Integer getBaggageSubContentType() {
            return this.baggageSubContentType;
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizes setDescription(FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizesDescription description) {
            this.description = description;
            return this;
        }
        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizesDescription getDescription() {
            return this.description;
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizes setImageDO(FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizesImageDO imageDO) {
            this.imageDO = imageDO;
            return this;
        }
        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizesImageDO getImageDO() {
            return this.imageDO;
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizes setIsHighlight(Boolean isHighlight) {
            this.isHighlight = isHighlight;
            return this;
        }
        public Boolean getIsHighlight() {
            return this.isHighlight;
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizes setSubTitle(String subTitle) {
            this.subTitle = subTitle;
            return this;
        }
        public String getSubTitle() {
            return this.subTitle;
        }

    }

    public static class FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItems extends TeaModel {
        @NameInMap("baggage_sub_content_visualizes")
        public java.util.List<FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizes> baggageSubContentVisualizes;

        @NameInMap("extra_content_visualizes")
        public java.util.List<?> extraContentVisualizes;

        /**
         * <strong>example:</strong>
         * <p>false</p>
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

        public static FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItems self = new FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItems();
            return TeaModel.build(map, self);
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItems setBaggageSubContentVisualizes(java.util.List<FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizes> baggageSubContentVisualizes) {
            this.baggageSubContentVisualizes = baggageSubContentVisualizes;
            return this;
        }
        public java.util.List<FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItemsBaggageSubContentVisualizes> getBaggageSubContentVisualizes() {
            return this.baggageSubContentVisualizes;
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItems setExtraContentVisualizes(java.util.List<?> extraContentVisualizes) {
            this.extraContentVisualizes = extraContentVisualizes;
            return this;
        }
        public java.util.List<?> getExtraContentVisualizes() {
            return this.extraContentVisualizes;
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaItemDetailResponseBodyModuleBaggageRuleTips extends TeaModel {
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

        public static FlightOtaItemDetailResponseBodyModuleBaggageRuleTips build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaItemDetailResponseBodyModuleBaggageRuleTips self = new FlightOtaItemDetailResponseBodyModuleBaggageRuleTips();
            return TeaModel.build(map, self);
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRuleTips setLogo(String logo) {
            this.logo = logo;
            return this;
        }
        public String getLogo() {
            return this.logo;
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRuleTips setTipsDesc(String tipsDesc) {
            this.tipsDesc = tipsDesc;
            return this;
        }
        public String getTipsDesc() {
            return this.tipsDesc;
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRuleTips setTipsImage(String tipsImage) {
            this.tipsImage = tipsImage;
            return this;
        }
        public String getTipsImage() {
            return this.tipsImage;
        }

    }

    public static class FlightOtaItemDetailResponseBodyModuleBaggageRule extends TeaModel {
        @NameInMap("baggage_sub_items")
        public java.util.List<FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItems> baggageSubItems;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public Integer index;

        /**
         * <strong>example:</strong>
         * <p>tableHead</p>
         */
        @NameInMap("table_head")
        public String tableHead;

        @NameInMap("tips")
        public FlightOtaItemDetailResponseBodyModuleBaggageRuleTips tips;

        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("type")
        public Integer type;

        public static FlightOtaItemDetailResponseBodyModuleBaggageRule build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaItemDetailResponseBodyModuleBaggageRule self = new FlightOtaItemDetailResponseBodyModuleBaggageRule();
            return TeaModel.build(map, self);
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRule setBaggageSubItems(java.util.List<FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItems> baggageSubItems) {
            this.baggageSubItems = baggageSubItems;
            return this;
        }
        public java.util.List<FlightOtaItemDetailResponseBodyModuleBaggageRuleBaggageSubItems> getBaggageSubItems() {
            return this.baggageSubItems;
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRule setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRule setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRule setTips(FlightOtaItemDetailResponseBodyModuleBaggageRuleTips tips) {
            this.tips = tips;
            return this;
        }
        public FlightOtaItemDetailResponseBodyModuleBaggageRuleTips getTips() {
            return this.tips;
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRule setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public FlightOtaItemDetailResponseBodyModuleBaggageRule setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightOtaItemDetailResponseBodyModuleChangeRuleExtraContents extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("title")
        public String title;

        public static FlightOtaItemDetailResponseBodyModuleChangeRuleExtraContents build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaItemDetailResponseBodyModuleChangeRuleExtraContents self = new FlightOtaItemDetailResponseBodyModuleChangeRuleExtraContents();
            return TeaModel.build(map, self);
        }

        public FlightOtaItemDetailResponseBodyModuleChangeRuleExtraContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightOtaItemDetailResponseBodyModuleChangeRuleExtraContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaItemDetailResponseBodyModuleChangeRuleRefundSubItemsRefundSubContents extends TeaModel {
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

        public static FlightOtaItemDetailResponseBodyModuleChangeRuleRefundSubItemsRefundSubContents build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaItemDetailResponseBodyModuleChangeRuleRefundSubItemsRefundSubContents self = new FlightOtaItemDetailResponseBodyModuleChangeRuleRefundSubItemsRefundSubContents();
            return TeaModel.build(map, self);
        }

        public FlightOtaItemDetailResponseBodyModuleChangeRuleRefundSubItemsRefundSubContents setFeeDesc(String feeDesc) {
            this.feeDesc = feeDesc;
            return this;
        }
        public String getFeeDesc() {
            return this.feeDesc;
        }

        public FlightOtaItemDetailResponseBodyModuleChangeRuleRefundSubItemsRefundSubContents setFeeRange(String feeRange) {
            this.feeRange = feeRange;
            return this;
        }
        public String getFeeRange() {
            return this.feeRange;
        }

        public FlightOtaItemDetailResponseBodyModuleChangeRuleRefundSubItemsRefundSubContents setStyle(Integer style) {
            this.style = style;
            return this;
        }
        public Integer getStyle() {
            return this.style;
        }

    }

    public static class FlightOtaItemDetailResponseBodyModuleChangeRuleRefundSubItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
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
        public java.util.List<FlightOtaItemDetailResponseBodyModuleChangeRuleRefundSubItemsRefundSubContents> refundSubContents;

        @NameInMap("title")
        public String title;

        public static FlightOtaItemDetailResponseBodyModuleChangeRuleRefundSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaItemDetailResponseBodyModuleChangeRuleRefundSubItems self = new FlightOtaItemDetailResponseBodyModuleChangeRuleRefundSubItems();
            return TeaModel.build(map, self);
        }

        public FlightOtaItemDetailResponseBodyModuleChangeRuleRefundSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public FlightOtaItemDetailResponseBodyModuleChangeRuleRefundSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public FlightOtaItemDetailResponseBodyModuleChangeRuleRefundSubItems setRefundSubContents(java.util.List<FlightOtaItemDetailResponseBodyModuleChangeRuleRefundSubItemsRefundSubContents> refundSubContents) {
            this.refundSubContents = refundSubContents;
            return this;
        }
        public java.util.List<FlightOtaItemDetailResponseBodyModuleChangeRuleRefundSubItemsRefundSubContents> getRefundSubContents() {
            return this.refundSubContents;
        }

        public FlightOtaItemDetailResponseBodyModuleChangeRuleRefundSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaItemDetailResponseBodyModuleChangeRule extends TeaModel {
        @NameInMap("extra_contents")
        public java.util.List<FlightOtaItemDetailResponseBodyModuleChangeRuleExtraContents> extraContents;

        /**
         * <strong>example:</strong>
         * <p>HO3925</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("free_baggage")
        public Integer freeBaggage;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public Integer index;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("level")
        public Integer level;

        @NameInMap("refund_sub_items")
        public java.util.List<FlightOtaItemDetailResponseBodyModuleChangeRuleRefundSubItems> refundSubItems;

        /**
         * <p>subTableHead</p>
         */
        @NameInMap("sub_table_head")
        public java.util.List<String> subTableHead;

        /**
         * <strong>example:</strong>
         * <p>tableHead</p>
         */
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

        public static FlightOtaItemDetailResponseBodyModuleChangeRule build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaItemDetailResponseBodyModuleChangeRule self = new FlightOtaItemDetailResponseBodyModuleChangeRule();
            return TeaModel.build(map, self);
        }

        public FlightOtaItemDetailResponseBodyModuleChangeRule setExtraContents(java.util.List<FlightOtaItemDetailResponseBodyModuleChangeRuleExtraContents> extraContents) {
            this.extraContents = extraContents;
            return this;
        }
        public java.util.List<FlightOtaItemDetailResponseBodyModuleChangeRuleExtraContents> getExtraContents() {
            return this.extraContents;
        }

        public FlightOtaItemDetailResponseBodyModuleChangeRule setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightOtaItemDetailResponseBodyModuleChangeRule setFreeBaggage(Integer freeBaggage) {
            this.freeBaggage = freeBaggage;
            return this;
        }
        public Integer getFreeBaggage() {
            return this.freeBaggage;
        }

        public FlightOtaItemDetailResponseBodyModuleChangeRule setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public FlightOtaItemDetailResponseBodyModuleChangeRule setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public FlightOtaItemDetailResponseBodyModuleChangeRule setRefundSubItems(java.util.List<FlightOtaItemDetailResponseBodyModuleChangeRuleRefundSubItems> refundSubItems) {
            this.refundSubItems = refundSubItems;
            return this;
        }
        public java.util.List<FlightOtaItemDetailResponseBodyModuleChangeRuleRefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
        }

        public FlightOtaItemDetailResponseBodyModuleChangeRule setSubTableHead(java.util.List<String> subTableHead) {
            this.subTableHead = subTableHead;
            return this;
        }
        public java.util.List<String> getSubTableHead() {
            return this.subTableHead;
        }

        public FlightOtaItemDetailResponseBodyModuleChangeRule setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public FlightOtaItemDetailResponseBodyModuleChangeRule setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public FlightOtaItemDetailResponseBodyModuleChangeRule setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightOtaItemDetailResponseBodyModuleRefundRuleExtraContents extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("title")
        public String title;

        public static FlightOtaItemDetailResponseBodyModuleRefundRuleExtraContents build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaItemDetailResponseBodyModuleRefundRuleExtraContents self = new FlightOtaItemDetailResponseBodyModuleRefundRuleExtraContents();
            return TeaModel.build(map, self);
        }

        public FlightOtaItemDetailResponseBodyModuleRefundRuleExtraContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FlightOtaItemDetailResponseBodyModuleRefundRuleExtraContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaItemDetailResponseBodyModuleRefundRuleRefundSubItemsRefundSubContents extends TeaModel {
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

        public static FlightOtaItemDetailResponseBodyModuleRefundRuleRefundSubItemsRefundSubContents build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaItemDetailResponseBodyModuleRefundRuleRefundSubItemsRefundSubContents self = new FlightOtaItemDetailResponseBodyModuleRefundRuleRefundSubItemsRefundSubContents();
            return TeaModel.build(map, self);
        }

        public FlightOtaItemDetailResponseBodyModuleRefundRuleRefundSubItemsRefundSubContents setFeeDesc(String feeDesc) {
            this.feeDesc = feeDesc;
            return this;
        }
        public String getFeeDesc() {
            return this.feeDesc;
        }

        public FlightOtaItemDetailResponseBodyModuleRefundRuleRefundSubItemsRefundSubContents setFeeRange(String feeRange) {
            this.feeRange = feeRange;
            return this;
        }
        public String getFeeRange() {
            return this.feeRange;
        }

        public FlightOtaItemDetailResponseBodyModuleRefundRuleRefundSubItemsRefundSubContents setStyle(Integer style) {
            this.style = style;
            return this;
        }
        public Integer getStyle() {
            return this.style;
        }

    }

    public static class FlightOtaItemDetailResponseBodyModuleRefundRuleRefundSubItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
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
        public java.util.List<FlightOtaItemDetailResponseBodyModuleRefundRuleRefundSubItemsRefundSubContents> refundSubContents;

        @NameInMap("title")
        public String title;

        public static FlightOtaItemDetailResponseBodyModuleRefundRuleRefundSubItems build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaItemDetailResponseBodyModuleRefundRuleRefundSubItems self = new FlightOtaItemDetailResponseBodyModuleRefundRuleRefundSubItems();
            return TeaModel.build(map, self);
        }

        public FlightOtaItemDetailResponseBodyModuleRefundRuleRefundSubItems setIsStruct(Boolean isStruct) {
            this.isStruct = isStruct;
            return this;
        }
        public Boolean getIsStruct() {
            return this.isStruct;
        }

        public FlightOtaItemDetailResponseBodyModuleRefundRuleRefundSubItems setPtc(String ptc) {
            this.ptc = ptc;
            return this;
        }
        public String getPtc() {
            return this.ptc;
        }

        public FlightOtaItemDetailResponseBodyModuleRefundRuleRefundSubItems setRefundSubContents(java.util.List<FlightOtaItemDetailResponseBodyModuleRefundRuleRefundSubItemsRefundSubContents> refundSubContents) {
            this.refundSubContents = refundSubContents;
            return this;
        }
        public java.util.List<FlightOtaItemDetailResponseBodyModuleRefundRuleRefundSubItemsRefundSubContents> getRefundSubContents() {
            return this.refundSubContents;
        }

        public FlightOtaItemDetailResponseBodyModuleRefundRuleRefundSubItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOtaItemDetailResponseBodyModuleRefundRule extends TeaModel {
        @NameInMap("extra_contents")
        public java.util.List<FlightOtaItemDetailResponseBodyModuleRefundRuleExtraContents> extraContents;

        /**
         * <strong>example:</strong>
         * <p>HO3925</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("free_baggage")
        public Integer freeBaggage;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public Integer index;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("level")
        public Integer level;

        @NameInMap("refund_sub_items")
        public java.util.List<FlightOtaItemDetailResponseBodyModuleRefundRuleRefundSubItems> refundSubItems;

        /**
         * <p>subTableHead</p>
         */
        @NameInMap("sub_table_head")
        public java.util.List<String> subTableHead;

        /**
         * <strong>example:</strong>
         * <p>tableHead</p>
         */
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

        public static FlightOtaItemDetailResponseBodyModuleRefundRule build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaItemDetailResponseBodyModuleRefundRule self = new FlightOtaItemDetailResponseBodyModuleRefundRule();
            return TeaModel.build(map, self);
        }

        public FlightOtaItemDetailResponseBodyModuleRefundRule setExtraContents(java.util.List<FlightOtaItemDetailResponseBodyModuleRefundRuleExtraContents> extraContents) {
            this.extraContents = extraContents;
            return this;
        }
        public java.util.List<FlightOtaItemDetailResponseBodyModuleRefundRuleExtraContents> getExtraContents() {
            return this.extraContents;
        }

        public FlightOtaItemDetailResponseBodyModuleRefundRule setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightOtaItemDetailResponseBodyModuleRefundRule setFreeBaggage(Integer freeBaggage) {
            this.freeBaggage = freeBaggage;
            return this;
        }
        public Integer getFreeBaggage() {
            return this.freeBaggage;
        }

        public FlightOtaItemDetailResponseBodyModuleRefundRule setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public FlightOtaItemDetailResponseBodyModuleRefundRule setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public FlightOtaItemDetailResponseBodyModuleRefundRule setRefundSubItems(java.util.List<FlightOtaItemDetailResponseBodyModuleRefundRuleRefundSubItems> refundSubItems) {
            this.refundSubItems = refundSubItems;
            return this;
        }
        public java.util.List<FlightOtaItemDetailResponseBodyModuleRefundRuleRefundSubItems> getRefundSubItems() {
            return this.refundSubItems;
        }

        public FlightOtaItemDetailResponseBodyModuleRefundRule setSubTableHead(java.util.List<String> subTableHead) {
            this.subTableHead = subTableHead;
            return this;
        }
        public java.util.List<String> getSubTableHead() {
            return this.subTableHead;
        }

        public FlightOtaItemDetailResponseBodyModuleRefundRule setTableHead(String tableHead) {
            this.tableHead = tableHead;
            return this;
        }
        public String getTableHead() {
            return this.tableHead;
        }

        public FlightOtaItemDetailResponseBodyModuleRefundRule setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public FlightOtaItemDetailResponseBodyModuleRefundRule setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightOtaItemDetailResponseBodyModule extends TeaModel {
        @NameInMap("baggage_rule")
        public java.util.List<FlightOtaItemDetailResponseBodyModuleBaggageRule> baggageRule;

        @NameInMap("change_rule")
        public java.util.List<FlightOtaItemDetailResponseBodyModuleChangeRule> changeRule;

        @NameInMap("refund_rule")
        public java.util.List<FlightOtaItemDetailResponseBodyModuleRefundRule> refundRule;

        /**
         * <strong>example:</strong>
         * <p>1830</p>
         */
        @NameInMap("sell_price")
        public Integer sellPrice;

        @NameInMap("sell_price_list")
        public java.util.List<Integer> sellPriceList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("trip_type")
        public Integer tripType;

        public static FlightOtaItemDetailResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightOtaItemDetailResponseBodyModule self = new FlightOtaItemDetailResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightOtaItemDetailResponseBodyModule setBaggageRule(java.util.List<FlightOtaItemDetailResponseBodyModuleBaggageRule> baggageRule) {
            this.baggageRule = baggageRule;
            return this;
        }
        public java.util.List<FlightOtaItemDetailResponseBodyModuleBaggageRule> getBaggageRule() {
            return this.baggageRule;
        }

        public FlightOtaItemDetailResponseBodyModule setChangeRule(java.util.List<FlightOtaItemDetailResponseBodyModuleChangeRule> changeRule) {
            this.changeRule = changeRule;
            return this;
        }
        public java.util.List<FlightOtaItemDetailResponseBodyModuleChangeRule> getChangeRule() {
            return this.changeRule;
        }

        public FlightOtaItemDetailResponseBodyModule setRefundRule(java.util.List<FlightOtaItemDetailResponseBodyModuleRefundRule> refundRule) {
            this.refundRule = refundRule;
            return this;
        }
        public java.util.List<FlightOtaItemDetailResponseBodyModuleRefundRule> getRefundRule() {
            return this.refundRule;
        }

        public FlightOtaItemDetailResponseBodyModule setSellPrice(Integer sellPrice) {
            this.sellPrice = sellPrice;
            return this;
        }
        public Integer getSellPrice() {
            return this.sellPrice;
        }

        public FlightOtaItemDetailResponseBodyModule setSellPriceList(java.util.List<Integer> sellPriceList) {
            this.sellPriceList = sellPriceList;
            return this;
        }
        public java.util.List<Integer> getSellPriceList() {
            return this.sellPriceList;
        }

        public FlightOtaItemDetailResponseBodyModule setTripType(Integer tripType) {
            this.tripType = tripType;
            return this;
        }
        public Integer getTripType() {
            return this.tripType;
        }

    }

}
