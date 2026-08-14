// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ProductHotspotDetectionResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The product hotzone recognition result.</p>
     */
    @NameInMap("Data")
    public ProductHotspotDetectionResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ProductHotspotDetectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProductHotspotDetectionResponseBody self = new ProductHotspotDetectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ProductHotspotDetectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ProductHotspotDetectionResponseBody setData(ProductHotspotDetectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ProductHotspotDetectionResponseBodyData getData() {
        return this.data;
    }

    public ProductHotspotDetectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ProductHotspotDetectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ProductHotspotDetectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ProductHotspotDetectionResponseBodyDataProductsBoxes extends TeaModel {
        /**
         * <p>The bottom boundary of the bounding box.</p>
         * 
         * <strong>example:</strong>
         * <p>947</p>
         */
        @NameInMap("Bottom")
        public Double bottom;

        /**
         * <p>The left boundary of the bounding box.</p>
         * 
         * <strong>example:</strong>
         * <p>280</p>
         */
        @NameInMap("Left")
        public Double left;

        /**
         * <p>The right boundary of the bounding box.</p>
         * 
         * <strong>example:</strong>
         * <p>743</p>
         */
        @NameInMap("Right")
        public Double right;

        /**
         * <p>The top boundary of the bounding box.</p>
         * 
         * <strong>example:</strong>
         * <p>965</p>
         */
        @NameInMap("Top")
        public Double top;

        public static ProductHotspotDetectionResponseBodyDataProductsBoxes build(java.util.Map<String, ?> map) throws Exception {
            ProductHotspotDetectionResponseBodyDataProductsBoxes self = new ProductHotspotDetectionResponseBodyDataProductsBoxes();
            return TeaModel.build(map, self);
        }

        public ProductHotspotDetectionResponseBodyDataProductsBoxes setBottom(Double bottom) {
            this.bottom = bottom;
            return this;
        }
        public Double getBottom() {
            return this.bottom;
        }

        public ProductHotspotDetectionResponseBodyDataProductsBoxes setLeft(Double left) {
            this.left = left;
            return this;
        }
        public Double getLeft() {
            return this.left;
        }

        public ProductHotspotDetectionResponseBodyDataProductsBoxes setRight(Double right) {
            this.right = right;
            return this;
        }
        public Double getRight() {
            return this.right;
        }

        public ProductHotspotDetectionResponseBodyDataProductsBoxes setTop(Double top) {
            this.top = top;
            return this;
        }
        public Double getTop() {
            return this.top;
        }

    }

    public static class ProductHotspotDetectionResponseBodyDataProducts extends TeaModel {
        /**
         * <p>The bounding boxes of the product instances.</p>
         */
        @NameInMap("Boxes")
        public java.util.List<ProductHotspotDetectionResponseBodyDataProductsBoxes> boxes;

        /**
         * <p>The product name.</p>
         * 
         * <strong>example:</strong>
         * <p>Beige metal chain-embellished Mary Jane flats</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The product ID generated by the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>product_1</p>
         */
        @NameInMap("ProductId")
        public String productId;

        public static ProductHotspotDetectionResponseBodyDataProducts build(java.util.Map<String, ?> map) throws Exception {
            ProductHotspotDetectionResponseBodyDataProducts self = new ProductHotspotDetectionResponseBodyDataProducts();
            return TeaModel.build(map, self);
        }

        public ProductHotspotDetectionResponseBodyDataProducts setBoxes(java.util.List<ProductHotspotDetectionResponseBodyDataProductsBoxes> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<ProductHotspotDetectionResponseBodyDataProductsBoxes> getBoxes() {
            return this.boxes;
        }

        public ProductHotspotDetectionResponseBodyDataProducts setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ProductHotspotDetectionResponseBodyDataProducts setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

    }

    public static class ProductHotspotDetectionResponseBodyData extends TeaModel {
        /**
         * <p>The list of recognized products and their bounding boxes.</p>
         */
        @NameInMap("Products")
        public java.util.List<ProductHotspotDetectionResponseBodyDataProducts> products;

        /**
         * <p>The usage information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProcessingCount&quot;:1}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static ProductHotspotDetectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ProductHotspotDetectionResponseBodyData self = new ProductHotspotDetectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ProductHotspotDetectionResponseBodyData setProducts(java.util.List<ProductHotspotDetectionResponseBodyDataProducts> products) {
            this.products = products;
            return this;
        }
        public java.util.List<ProductHotspotDetectionResponseBodyDataProducts> getProducts() {
            return this.products;
        }

        public ProductHotspotDetectionResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
