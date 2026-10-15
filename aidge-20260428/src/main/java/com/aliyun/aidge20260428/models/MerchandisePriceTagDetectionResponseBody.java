// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MerchandisePriceTagDetectionResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The scenario recognition result.</p>
     */
    @NameInMap("Data")
    public MerchandisePriceTagDetectionResponseBodyData data;

    /**
     * <p>The return message or failure description.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>70CBEFDF-BB17-1EB3-8A21-569F3124738F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static MerchandisePriceTagDetectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MerchandisePriceTagDetectionResponseBody self = new MerchandisePriceTagDetectionResponseBody();
        return TeaModel.build(map, self);
    }

    public MerchandisePriceTagDetectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MerchandisePriceTagDetectionResponseBody setData(MerchandisePriceTagDetectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MerchandisePriceTagDetectionResponseBodyData getData() {
        return this.data;
    }

    public MerchandisePriceTagDetectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MerchandisePriceTagDetectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MerchandisePriceTagDetectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MerchandisePriceTagDetectionResponseBodyDataResultGroundingRegions extends TeaModel {
        /**
         * <p>The bounding box coordinates.</p>
         */
        @NameInMap("Bbox2d")
        public java.util.List<Double> bbox2d;

        /**
         * <p>The label.</p>
         * 
         * <strong>example:</strong>
         * <p>price_tag</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The recognized text.</p>
         * 
         * <strong>example:</strong>
         * <p>5.50</p>
         */
        @NameInMap("Text")
        public String text;

        public static MerchandisePriceTagDetectionResponseBodyDataResultGroundingRegions build(java.util.Map<String, ?> map) throws Exception {
            MerchandisePriceTagDetectionResponseBodyDataResultGroundingRegions self = new MerchandisePriceTagDetectionResponseBodyDataResultGroundingRegions();
            return TeaModel.build(map, self);
        }

        public MerchandisePriceTagDetectionResponseBodyDataResultGroundingRegions setBbox2d(java.util.List<Double> bbox2d) {
            this.bbox2d = bbox2d;
            return this;
        }
        public java.util.List<Double> getBbox2d() {
            return this.bbox2d;
        }

        public MerchandisePriceTagDetectionResponseBodyDataResultGroundingRegions setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public MerchandisePriceTagDetectionResponseBodyDataResultGroundingRegions setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class MerchandisePriceTagDetectionResponseBodyDataResultGrounding extends TeaModel {
        /**
         * <p>The coverage.</p>
         * 
         * <strong>example:</strong>
         * <p>complete</p>
         */
        @NameInMap("Coverage")
        public String coverage;

        /**
         * <p>The region list.</p>
         */
        @NameInMap("Regions")
        public java.util.List<MerchandisePriceTagDetectionResponseBodyDataResultGroundingRegions> regions;

        public static MerchandisePriceTagDetectionResponseBodyDataResultGrounding build(java.util.Map<String, ?> map) throws Exception {
            MerchandisePriceTagDetectionResponseBodyDataResultGrounding self = new MerchandisePriceTagDetectionResponseBodyDataResultGrounding();
            return TeaModel.build(map, self);
        }

        public MerchandisePriceTagDetectionResponseBodyDataResultGrounding setCoverage(String coverage) {
            this.coverage = coverage;
            return this;
        }
        public String getCoverage() {
            return this.coverage;
        }

        public MerchandisePriceTagDetectionResponseBodyDataResultGrounding setRegions(java.util.List<MerchandisePriceTagDetectionResponseBodyDataResultGroundingRegions> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<MerchandisePriceTagDetectionResponseBodyDataResultGroundingRegions> getRegions() {
            return this.regions;
        }

    }

    public static class MerchandisePriceTagDetectionResponseBodyDataResultPriceTagsLocation extends TeaModel {
        /**
         * <p>The bottom boundary of the detection box.</p>
         * 
         * <strong>example:</strong>
         * <p>369</p>
         */
        @NameInMap("Bottom")
        public String bottom;

        /**
         * <p>The left boundary of the detection box.</p>
         * 
         * <strong>example:</strong>
         * <p>796</p>
         */
        @NameInMap("Left")
        public String left;

        /**
         * <p>The right boundary of the detection box.</p>
         * 
         * <strong>example:</strong>
         * <p>820</p>
         */
        @NameInMap("Right")
        public String right;

        /**
         * <p>The top boundary of the detection box.</p>
         * 
         * <strong>example:</strong>
         * <p>338</p>
         */
        @NameInMap("top")
        public String top;

        public static MerchandisePriceTagDetectionResponseBodyDataResultPriceTagsLocation build(java.util.Map<String, ?> map) throws Exception {
            MerchandisePriceTagDetectionResponseBodyDataResultPriceTagsLocation self = new MerchandisePriceTagDetectionResponseBodyDataResultPriceTagsLocation();
            return TeaModel.build(map, self);
        }

        public MerchandisePriceTagDetectionResponseBodyDataResultPriceTagsLocation setBottom(String bottom) {
            this.bottom = bottom;
            return this;
        }
        public String getBottom() {
            return this.bottom;
        }

        public MerchandisePriceTagDetectionResponseBodyDataResultPriceTagsLocation setLeft(String left) {
            this.left = left;
            return this;
        }
        public String getLeft() {
            return this.left;
        }

        public MerchandisePriceTagDetectionResponseBodyDataResultPriceTagsLocation setRight(String right) {
            this.right = right;
            return this;
        }
        public String getRight() {
            return this.right;
        }

        public MerchandisePriceTagDetectionResponseBodyDataResultPriceTagsLocation setTop(String top) {
            this.top = top;
            return this;
        }
        public String getTop() {
            return this.top;
        }

    }

    public static class MerchandisePriceTagDetectionResponseBodyDataResultPriceTags extends TeaModel {
        /**
         * <p>The location.</p>
         */
        @NameInMap("Location")
        public MerchandisePriceTagDetectionResponseBodyDataResultPriceTagsLocation location;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("OriginalPrice")
        public String originalPrice;

        /**
         * <p>The selling price, retained as a string to avoid being parsed as a reserved word or reserved character.</p>
         * 
         * <strong>example:</strong>
         * <p>5.50</p>
         */
        @NameInMap("Price")
        public String price;

        /**
         * <p>The associated product code.</p>
         * 
         * <strong>example:</strong>
         * <p>001</p>
         */
        @NameInMap("SkuCode")
        public String skuCode;

        /**
         * <p>The associated product name.</p>
         * 
         * <strong>example:</strong>
         * <p>sku_test</p>
         */
        @NameInMap("SkuName")
        public String skuName;

        public static MerchandisePriceTagDetectionResponseBodyDataResultPriceTags build(java.util.Map<String, ?> map) throws Exception {
            MerchandisePriceTagDetectionResponseBodyDataResultPriceTags self = new MerchandisePriceTagDetectionResponseBodyDataResultPriceTags();
            return TeaModel.build(map, self);
        }

        public MerchandisePriceTagDetectionResponseBodyDataResultPriceTags setLocation(MerchandisePriceTagDetectionResponseBodyDataResultPriceTagsLocation location) {
            this.location = location;
            return this;
        }
        public MerchandisePriceTagDetectionResponseBodyDataResultPriceTagsLocation getLocation() {
            return this.location;
        }

        public MerchandisePriceTagDetectionResponseBodyDataResultPriceTags setOriginalPrice(String originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public String getOriginalPrice() {
            return this.originalPrice;
        }

        public MerchandisePriceTagDetectionResponseBodyDataResultPriceTags setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public MerchandisePriceTagDetectionResponseBodyDataResultPriceTags setSkuCode(String skuCode) {
            this.skuCode = skuCode;
            return this;
        }
        public String getSkuCode() {
            return this.skuCode;
        }

        public MerchandisePriceTagDetectionResponseBodyDataResultPriceTags setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

    }

    public static class MerchandisePriceTagDetectionResponseBodyDataResult extends TeaModel {
        /**
         * <p>The localization information.</p>
         */
        @NameInMap("Grounding")
        public MerchandisePriceTagDetectionResponseBodyDataResultGrounding grounding;

        /**
         * <p>The price tag list. This can be an empty array if no price tags are recognized under normal conditions.</p>
         */
        @NameInMap("PriceTags")
        public java.util.List<MerchandisePriceTagDetectionResponseBodyDataResultPriceTags> priceTags;

        /**
         * <p>The value is fixed to priceTag.</p>
         * 
         * <strong>example:</strong>
         * <p>priceTag</p>
         */
        @NameInMap("Type")
        public String type;

        public static MerchandisePriceTagDetectionResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            MerchandisePriceTagDetectionResponseBodyDataResult self = new MerchandisePriceTagDetectionResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public MerchandisePriceTagDetectionResponseBodyDataResult setGrounding(MerchandisePriceTagDetectionResponseBodyDataResultGrounding grounding) {
            this.grounding = grounding;
            return this;
        }
        public MerchandisePriceTagDetectionResponseBodyDataResultGrounding getGrounding() {
            return this.grounding;
        }

        public MerchandisePriceTagDetectionResponseBodyDataResult setPriceTags(java.util.List<MerchandisePriceTagDetectionResponseBodyDataResultPriceTags> priceTags) {
            this.priceTags = priceTags;
            return this;
        }
        public java.util.List<MerchandisePriceTagDetectionResponseBodyDataResultPriceTags> getPriceTags() {
            return this.priceTags;
        }

        public MerchandisePriceTagDetectionResponseBodyDataResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MerchandisePriceTagDetectionResponseBodyData extends TeaModel {
        /**
         * <p>The detection and recognition result details.</p>
         */
        @NameInMap("Result")
        public MerchandisePriceTagDetectionResponseBodyDataResult result;

        /**
         * <p>The usage information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProcessingCount&quot;:1}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static MerchandisePriceTagDetectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MerchandisePriceTagDetectionResponseBodyData self = new MerchandisePriceTagDetectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MerchandisePriceTagDetectionResponseBodyData setResult(MerchandisePriceTagDetectionResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public MerchandisePriceTagDetectionResponseBodyDataResult getResult() {
            return this.result;
        }

        public MerchandisePriceTagDetectionResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
