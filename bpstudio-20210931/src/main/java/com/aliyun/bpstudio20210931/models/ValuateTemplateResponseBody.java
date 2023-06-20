// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ValuateTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ValuateTemplateResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ValuateTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValuateTemplateResponseBody self = new ValuateTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ValuateTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ValuateTemplateResponseBody setData(ValuateTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ValuateTemplateResponseBodyData getData() {
        return this.data;
    }

    public ValuateTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ValuateTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ValuateTemplateResponseBodyDataResourceListPriceList extends TeaModel {
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        @NameInMap("Error")
        public String error;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("PriceUnit")
        public String priceUnit;

        @NameInMap("PromotionName")
        public String promotionName;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("TradePrice")
        public Float tradePrice;

        @NameInMap("Type")
        public String type;

        public static ValuateTemplateResponseBodyDataResourceListPriceList build(java.util.Map<String, ?> map) throws Exception {
            ValuateTemplateResponseBodyDataResourceListPriceList self = new ValuateTemplateResponseBodyDataResourceListPriceList();
            return TeaModel.build(map, self);
        }

        public ValuateTemplateResponseBodyDataResourceListPriceList setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public ValuateTemplateResponseBodyDataResourceListPriceList setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public ValuateTemplateResponseBodyDataResourceListPriceList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ValuateTemplateResponseBodyDataResourceListPriceList setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public ValuateTemplateResponseBodyDataResourceListPriceList setPriceUnit(String priceUnit) {
            this.priceUnit = priceUnit;
            return this;
        }
        public String getPriceUnit() {
            return this.priceUnit;
        }

        public ValuateTemplateResponseBodyDataResourceListPriceList setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public ValuateTemplateResponseBodyDataResourceListPriceList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ValuateTemplateResponseBodyDataResourceListPriceList setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public ValuateTemplateResponseBodyDataResourceListPriceList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ValuateTemplateResponseBodyDataResourceList extends TeaModel {
        @NameInMap("DiscountAmount")
        public Double discountAmount;

        @NameInMap("Error")
        public String error;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("OriginalPrice")
        public Double originalPrice;

        @NameInMap("PriceList")
        public java.util.List<ValuateTemplateResponseBodyDataResourceListPriceList> priceList;

        @NameInMap("PriceUnit")
        public String priceUnit;

        @NameInMap("PromotionName")
        public String promotionName;

        @NameInMap("TradePrice")
        public Double tradePrice;

        public static ValuateTemplateResponseBodyDataResourceList build(java.util.Map<String, ?> map) throws Exception {
            ValuateTemplateResponseBodyDataResourceList self = new ValuateTemplateResponseBodyDataResourceList();
            return TeaModel.build(map, self);
        }

        public ValuateTemplateResponseBodyDataResourceList setDiscountAmount(Double discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Double getDiscountAmount() {
            return this.discountAmount;
        }

        public ValuateTemplateResponseBodyDataResourceList setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public ValuateTemplateResponseBodyDataResourceList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ValuateTemplateResponseBodyDataResourceList setOriginalPrice(Double originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Double getOriginalPrice() {
            return this.originalPrice;
        }

        public ValuateTemplateResponseBodyDataResourceList setPriceList(java.util.List<ValuateTemplateResponseBodyDataResourceListPriceList> priceList) {
            this.priceList = priceList;
            return this;
        }
        public java.util.List<ValuateTemplateResponseBodyDataResourceListPriceList> getPriceList() {
            return this.priceList;
        }

        public ValuateTemplateResponseBodyDataResourceList setPriceUnit(String priceUnit) {
            this.priceUnit = priceUnit;
            return this;
        }
        public String getPriceUnit() {
            return this.priceUnit;
        }

        public ValuateTemplateResponseBodyDataResourceList setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public ValuateTemplateResponseBodyDataResourceList setTradePrice(Double tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Double getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class ValuateTemplateResponseBodyData extends TeaModel {
        @NameInMap("ResourceList")
        public java.util.List<ValuateTemplateResponseBodyDataResourceList> resourceList;

        public static ValuateTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ValuateTemplateResponseBodyData self = new ValuateTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ValuateTemplateResponseBodyData setResourceList(java.util.List<ValuateTemplateResponseBodyDataResourceList> resourceList) {
            this.resourceList = resourceList;
            return this;
        }
        public java.util.List<ValuateTemplateResponseBodyDataResourceList> getResourceList() {
            return this.resourceList;
        }

    }

}
