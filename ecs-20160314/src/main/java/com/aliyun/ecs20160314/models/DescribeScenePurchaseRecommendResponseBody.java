// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeScenePurchaseRecommendResponseBody extends TeaModel {
    @NameInMap("RecommendProducts")
    public RecommendProducts recommendProducts;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeScenePurchaseRecommendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScenePurchaseRecommendResponseBody self = new DescribeScenePurchaseRecommendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScenePurchaseRecommendResponseBody setRecommendProducts(RecommendProducts recommendProducts) {
        this.recommendProducts = recommendProducts;
        return this;
    }
    public RecommendProducts getRecommendProducts() {
        return this.recommendProducts;
    }

    public DescribeScenePurchaseRecommendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecommendSpSpec extends TeaModel {
        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("EffectiveDate")
        public String effectiveDate;

        @NameInMap("PayMode")
        public String payMode;

        @NameInMap("PricingCycle")
        public String pricingCycle;

        @NameInMap("RecommendReason")
        public String recommendReason;

        @NameInMap("Type")
        public String type;

        public static RecommendSpSpec build(java.util.Map<String, ?> map) throws Exception {
            RecommendSpSpec self = new RecommendSpSpec();
            return TeaModel.build(map, self);
        }

        public RecommendSpSpec setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public RecommendSpSpec setEffectiveDate(String effectiveDate) {
            this.effectiveDate = effectiveDate;
            return this;
        }
        public String getEffectiveDate() {
            return this.effectiveDate;
        }

        public RecommendSpSpec setPayMode(String payMode) {
            this.payMode = payMode;
            return this;
        }
        public String getPayMode() {
            return this.payMode;
        }

        public RecommendSpSpec setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        public RecommendSpSpec setRecommendReason(String recommendReason) {
            this.recommendReason = recommendReason;
            return this;
        }
        public String getRecommendReason() {
            return this.recommendReason;
        }

        public RecommendSpSpec setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RecommendSpSpecs extends TeaModel {
        @NameInMap("RecommendSpSpec")
        public java.util.List<RecommendSpSpec> recommendSpSpec;

        public static RecommendSpSpecs build(java.util.Map<String, ?> map) throws Exception {
            RecommendSpSpecs self = new RecommendSpSpecs();
            return TeaModel.build(map, self);
        }

        public RecommendSpSpecs setRecommendSpSpec(java.util.List<RecommendSpSpec> recommendSpSpec) {
            this.recommendSpSpec = recommendSpSpec;
            return this;
        }
        public java.util.List<RecommendSpSpec> getRecommendSpSpec() {
            return this.recommendSpSpec;
        }

    }

    public static class RecommendProduct extends TeaModel {
        @NameInMap("RecommendSpSpecs")
        public RecommendSpSpecs recommendSpSpecs;

        @NameInMap("RegionId")
        public String regionId;

        public static RecommendProduct build(java.util.Map<String, ?> map) throws Exception {
            RecommendProduct self = new RecommendProduct();
            return TeaModel.build(map, self);
        }

        public RecommendProduct setRecommendSpSpecs(RecommendSpSpecs recommendSpSpecs) {
            this.recommendSpSpecs = recommendSpSpecs;
            return this;
        }
        public RecommendSpSpecs getRecommendSpSpecs() {
            return this.recommendSpSpecs;
        }

        public RecommendProduct setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class RecommendProducts extends TeaModel {
        @NameInMap("RecommendProduct")
        public java.util.List<RecommendProduct> recommendProduct;

        public static RecommendProducts build(java.util.Map<String, ?> map) throws Exception {
            RecommendProducts self = new RecommendProducts();
            return TeaModel.build(map, self);
        }

        public RecommendProducts setRecommendProduct(java.util.List<RecommendProduct> recommendProduct) {
            this.recommendProduct = recommendProduct;
            return this;
        }
        public java.util.List<RecommendProduct> getRecommendProduct() {
            return this.recommendProduct;
        }

    }

}
