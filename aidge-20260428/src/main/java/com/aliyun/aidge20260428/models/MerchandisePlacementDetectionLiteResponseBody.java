// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MerchandisePlacementDetectionLiteResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public MerchandisePlacementDetectionLiteResponseBodyData data;

    /**
     * <p>The response message or failure description.</p>
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

    public static MerchandisePlacementDetectionLiteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MerchandisePlacementDetectionLiteResponseBody self = new MerchandisePlacementDetectionLiteResponseBody();
        return TeaModel.build(map, self);
    }

    public MerchandisePlacementDetectionLiteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MerchandisePlacementDetectionLiteResponseBody setData(MerchandisePlacementDetectionLiteResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MerchandisePlacementDetectionLiteResponseBodyData getData() {
        return this.data;
    }

    public MerchandisePlacementDetectionLiteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MerchandisePlacementDetectionLiteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MerchandisePlacementDetectionLiteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MerchandisePlacementDetectionLiteResponseBodyDataResultGroundingRegions extends TeaModel {
        /**
         * <p>The 2D bounding box in the format of [top-left x, top-left y, bottom-right x, bottom-right y]. The values range from 0 to 1000. The left coordinate is less than the right coordinate, and the top coordinate is less than the bottom coordinate.</p>
         */
        @NameInMap("Bbox_2d")
        public java.util.List<Long> bbox2d;

        /**
         * <p>The target category.</p>
         * 
         * <strong>example:</strong>
         * <p>price_tag</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The confirmable short name or text of up to 24 characters. This field is an empty string when the text is unclear.</p>
         * 
         * <strong>example:</strong>
         * <p>5.50</p>
         */
        @NameInMap("Text")
        public String text;

        public static MerchandisePlacementDetectionLiteResponseBodyDataResultGroundingRegions build(java.util.Map<String, ?> map) throws Exception {
            MerchandisePlacementDetectionLiteResponseBodyDataResultGroundingRegions self = new MerchandisePlacementDetectionLiteResponseBodyDataResultGroundingRegions();
            return TeaModel.build(map, self);
        }

        public MerchandisePlacementDetectionLiteResponseBodyDataResultGroundingRegions setBbox2d(java.util.List<Long> bbox2d) {
            this.bbox2d = bbox2d;
            return this;
        }
        public java.util.List<Long> getBbox2d() {
            return this.bbox2d;
        }

        public MerchandisePlacementDetectionLiteResponseBodyDataResultGroundingRegions setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public MerchandisePlacementDetectionLiteResponseBodyDataResultGroundingRegions setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class MerchandisePlacementDetectionLiteResponseBodyDataResultGrounding extends TeaModel {
        /**
         * <p>The coverage status. Valid values:</p>
         * <ul>
         * <li>complete: The relevant visible targets are complete.</li>
         * <li>partial: Only some targets are valid or recognizable.</li>
         * <li>Empty string: No valid supplementary grounding results are obtained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>complete</p>
         */
        @NameInMap("Coverage")
        public String coverage;

        /**
         * <p>The target array, which contains up to 12 items. This array can be empty when no relevant targets are found.</p>
         */
        @NameInMap("Regions")
        public java.util.List<MerchandisePlacementDetectionLiteResponseBodyDataResultGroundingRegions> regions;

        public static MerchandisePlacementDetectionLiteResponseBodyDataResultGrounding build(java.util.Map<String, ?> map) throws Exception {
            MerchandisePlacementDetectionLiteResponseBodyDataResultGrounding self = new MerchandisePlacementDetectionLiteResponseBodyDataResultGrounding();
            return TeaModel.build(map, self);
        }

        public MerchandisePlacementDetectionLiteResponseBodyDataResultGrounding setCoverage(String coverage) {
            this.coverage = coverage;
            return this;
        }
        public String getCoverage() {
            return this.coverage;
        }

        public MerchandisePlacementDetectionLiteResponseBodyDataResultGrounding setRegions(java.util.List<MerchandisePlacementDetectionLiteResponseBodyDataResultGroundingRegions> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<MerchandisePlacementDetectionLiteResponseBodyDataResultGroundingRegions> getRegions() {
            return this.regions;
        }

    }

    public static class MerchandisePlacementDetectionLiteResponseBodyDataResultProductsBoxes extends TeaModel {
        /**
         * <p>The bottom coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Bottom")
        public Long bottom;

        /**
         * <p>The left coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Left")
        public Long left;

        /**
         * <p>The right coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>(\&quot;874\&quot;)</p>
         */
        @NameInMap("Right")
        public Long right;

        /**
         * <p>The bottom coordinate.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Top")
        public Long top;

        public static MerchandisePlacementDetectionLiteResponseBodyDataResultProductsBoxes build(java.util.Map<String, ?> map) throws Exception {
            MerchandisePlacementDetectionLiteResponseBodyDataResultProductsBoxes self = new MerchandisePlacementDetectionLiteResponseBodyDataResultProductsBoxes();
            return TeaModel.build(map, self);
        }

        public MerchandisePlacementDetectionLiteResponseBodyDataResultProductsBoxes setBottom(Long bottom) {
            this.bottom = bottom;
            return this;
        }
        public Long getBottom() {
            return this.bottom;
        }

        public MerchandisePlacementDetectionLiteResponseBodyDataResultProductsBoxes setLeft(Long left) {
            this.left = left;
            return this;
        }
        public Long getLeft() {
            return this.left;
        }

        public MerchandisePlacementDetectionLiteResponseBodyDataResultProductsBoxes setRight(Long right) {
            this.right = right;
            return this;
        }
        public Long getRight() {
            return this.right;
        }

        public MerchandisePlacementDetectionLiteResponseBodyDataResultProductsBoxes setTop(Long top) {
            this.top = top;
            return this;
        }
        public Long getTop() {
            return this.top;
        }

    }

    public static class MerchandisePlacementDetectionLiteResponseBodyDataResultProducts extends TeaModel {
        /**
         * <p>The bounding boxes corresponding to the SKU.</p>
         */
        @NameInMap("Boxes")
        public java.util.List<MerchandisePlacementDetectionLiteResponseBodyDataResultProductsBoxes> boxes;

        /**
         * <p>The recognition code, which is obtained by removing the trailing _ce from the recognition name.</p>
         * 
         * <strong>example:</strong>
         * <p>sku_test</p>
         */
        @NameInMap("SkuId")
        public String skuId;

        public static MerchandisePlacementDetectionLiteResponseBodyDataResultProducts build(java.util.Map<String, ?> map) throws Exception {
            MerchandisePlacementDetectionLiteResponseBodyDataResultProducts self = new MerchandisePlacementDetectionLiteResponseBodyDataResultProducts();
            return TeaModel.build(map, self);
        }

        public MerchandisePlacementDetectionLiteResponseBodyDataResultProducts setBoxes(java.util.List<MerchandisePlacementDetectionLiteResponseBodyDataResultProductsBoxes> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<MerchandisePlacementDetectionLiteResponseBodyDataResultProductsBoxes> getBoxes() {
            return this.boxes;
        }

        public MerchandisePlacementDetectionLiteResponseBodyDataResultProducts setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

    }

    public static class MerchandisePlacementDetectionLiteResponseBodyDataResult extends TeaModel {
        /**
         * <p>The supplementary element grounding results.</p>
         */
        @NameInMap("Grounding")
        public MerchandisePlacementDetectionLiteResponseBodyDataResultGrounding grounding;

        /**
         * <p>The product items.</p>
         */
        @NameInMap("Products")
        public java.util.List<MerchandisePlacementDetectionLiteResponseBodyDataResultProducts> products;

        /**
         * <p>The deduplicated list of SkuIds.</p>
         */
        @NameInMap("SkuIds")
        public java.util.List<String> skuIds;

        /**
         * <p>The result type, which is fixed to sku.</p>
         * 
         * <strong>example:</strong>
         * <p>sku</p>
         */
        @NameInMap("Type")
        public String type;

        public static MerchandisePlacementDetectionLiteResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            MerchandisePlacementDetectionLiteResponseBodyDataResult self = new MerchandisePlacementDetectionLiteResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public MerchandisePlacementDetectionLiteResponseBodyDataResult setGrounding(MerchandisePlacementDetectionLiteResponseBodyDataResultGrounding grounding) {
            this.grounding = grounding;
            return this;
        }
        public MerchandisePlacementDetectionLiteResponseBodyDataResultGrounding getGrounding() {
            return this.grounding;
        }

        public MerchandisePlacementDetectionLiteResponseBodyDataResult setProducts(java.util.List<MerchandisePlacementDetectionLiteResponseBodyDataResultProducts> products) {
            this.products = products;
            return this;
        }
        public java.util.List<MerchandisePlacementDetectionLiteResponseBodyDataResultProducts> getProducts() {
            return this.products;
        }

        public MerchandisePlacementDetectionLiteResponseBodyDataResult setSkuIds(java.util.List<String> skuIds) {
            this.skuIds = skuIds;
            return this;
        }
        public java.util.List<String> getSkuIds() {
            return this.skuIds;
        }

        public MerchandisePlacementDetectionLiteResponseBodyDataResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MerchandisePlacementDetectionLiteResponseBodyData extends TeaModel {
        /**
         * <p>The result.</p>
         */
        @NameInMap("Result")
        public MerchandisePlacementDetectionLiteResponseBodyDataResult result;

        /**
         * <p>The usage map. The value is {&quot;ProcessingCount&quot;:1} for a successful call, and an empty object for a failed call.</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static MerchandisePlacementDetectionLiteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MerchandisePlacementDetectionLiteResponseBodyData self = new MerchandisePlacementDetectionLiteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MerchandisePlacementDetectionLiteResponseBodyData setResult(MerchandisePlacementDetectionLiteResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public MerchandisePlacementDetectionLiteResponseBodyDataResult getResult() {
            return this.result;
        }

        public MerchandisePlacementDetectionLiteResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
