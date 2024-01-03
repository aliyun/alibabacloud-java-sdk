// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ValuateTemplateResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of the inquiry.</p>
     */
    @NameInMap("Data")
    public ValuateTemplateResponseBodyData data;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The discount amount.</p>
         */
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        /**
         * <p>The error message that is returned.</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <p>The resource type.</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The original price.</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <p>The pricing unit.</p>
         */
        @NameInMap("PriceUnit")
        public String priceUnit;

        /**
         * <p>The discount information.</p>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <p>The resource ID.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The price at which the transaction is made.</p>
         */
        @NameInMap("TradePrice")
        public Float tradePrice;

        /**
         * <p>Indicates whether the instance is newly created. Valid values:\</p>
         * <p>1: The instance is newly created.\</p>
         * <p>2: The instance already exists.\</p>
         * <p>0: The price of the instance is not included.</p>
         */
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
        /**
         * <p>The discount amount.</p>
         */
        @NameInMap("DiscountAmount")
        public Double discountAmount;

        /**
         * <p>The error message that is returned.</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <p>The resource type.</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The original price.</p>
         */
        @NameInMap("OriginalPrice")
        public Double originalPrice;

        /**
         * <p>The information about the price.</p>
         */
        @NameInMap("PriceList")
        public java.util.List<ValuateTemplateResponseBodyDataResourceListPriceList> priceList;

        /**
         * <p>The pricing unit.</p>
         */
        @NameInMap("PriceUnit")
        public String priceUnit;

        /**
         * <p>The discount information.</p>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <p>The price at which the transaction is made.</p>
         */
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
        /**
         * <p>The result set of the inquiry.</p>
         */
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
