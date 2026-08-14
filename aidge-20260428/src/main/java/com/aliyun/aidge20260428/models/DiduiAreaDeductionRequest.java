// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class DiduiAreaDeductionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Products")
    public java.util.List<DiduiAreaDeductionRequestProducts> products;

    /**
     * <strong>example:</strong>
     * <p>rag_xxx</p>
     */
    @NameInMap("RagId")
    public String ragId;

    /**
     * <strong>example:</strong>
     * <p>didui-request-001</p>
     */
    @NameInMap("ReqId")
    public String reqId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/didui.jpg">https://example.com/didui.jpg</a></p>
     */
    @NameInMap("TargetImageUrl")
    public String targetImageUrl;

    public static DiduiAreaDeductionRequest build(java.util.Map<String, ?> map) throws Exception {
        DiduiAreaDeductionRequest self = new DiduiAreaDeductionRequest();
        return TeaModel.build(map, self);
    }

    public DiduiAreaDeductionRequest setProducts(java.util.List<DiduiAreaDeductionRequestProducts> products) {
        this.products = products;
        return this;
    }
    public java.util.List<DiduiAreaDeductionRequestProducts> getProducts() {
        return this.products;
    }

    public DiduiAreaDeductionRequest setRagId(String ragId) {
        this.ragId = ragId;
        return this;
    }
    public String getRagId() {
        return this.ragId;
    }

    public DiduiAreaDeductionRequest setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }
    public String getReqId() {
        return this.reqId;
    }

    public DiduiAreaDeductionRequest setTargetImageUrl(String targetImageUrl) {
        this.targetImageUrl = targetImageUrl;
        return this;
    }
    public String getTargetImageUrl() {
        return this.targetImageUrl;
    }

    public static class DiduiAreaDeductionRequestProductsBoxes extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>689</p>
         */
        @NameInMap("Bottom")
        public Double bottom;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>763</p>
         */
        @NameInMap("Left")
        public Double left;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>904</p>
         */
        @NameInMap("Right")
        public Double right;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>606</p>
         */
        @NameInMap("Top")
        public Double top;

        public static DiduiAreaDeductionRequestProductsBoxes build(java.util.Map<String, ?> map) throws Exception {
            DiduiAreaDeductionRequestProductsBoxes self = new DiduiAreaDeductionRequestProductsBoxes();
            return TeaModel.build(map, self);
        }

        public DiduiAreaDeductionRequestProductsBoxes setBottom(Double bottom) {
            this.bottom = bottom;
            return this;
        }
        public Double getBottom() {
            return this.bottom;
        }

        public DiduiAreaDeductionRequestProductsBoxes setLeft(Double left) {
            this.left = left;
            return this;
        }
        public Double getLeft() {
            return this.left;
        }

        public DiduiAreaDeductionRequestProductsBoxes setRight(Double right) {
            this.right = right;
            return this;
        }
        public Double getRight() {
            return this.right;
        }

        public DiduiAreaDeductionRequestProductsBoxes setTop(Double top) {
            this.top = top;
            return this;
        }
        public Double getTop() {
            return this.top;
        }

    }

    public static class DiduiAreaDeductionRequestProducts extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Boxes")
        public java.util.List<DiduiAreaDeductionRequestProductsBoxes> boxes;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6901234579</p>
         */
        @NameInMap("SkuId")
        public String skuId;

        public static DiduiAreaDeductionRequestProducts build(java.util.Map<String, ?> map) throws Exception {
            DiduiAreaDeductionRequestProducts self = new DiduiAreaDeductionRequestProducts();
            return TeaModel.build(map, self);
        }

        public DiduiAreaDeductionRequestProducts setBoxes(java.util.List<DiduiAreaDeductionRequestProductsBoxes> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<DiduiAreaDeductionRequestProductsBoxes> getBoxes() {
            return this.boxes;
        }

        public DiduiAreaDeductionRequestProducts setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

    }

}
