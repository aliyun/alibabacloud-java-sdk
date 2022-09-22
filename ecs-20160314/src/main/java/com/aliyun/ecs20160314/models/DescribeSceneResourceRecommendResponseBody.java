// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeSceneResourceRecommendResponseBody extends TeaModel {
    @NameInMap("RecommendProducts")
    public RecommendProducts recommendProducts;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSceneResourceRecommendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneResourceRecommendResponseBody self = new DescribeSceneResourceRecommendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSceneResourceRecommendResponseBody setRecommendProducts(RecommendProducts recommendProducts) {
        this.recommendProducts = recommendProducts;
        return this;
    }
    public RecommendProducts getRecommendProducts() {
        return this.recommendProducts;
    }

    public DescribeSceneResourceRecommendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InstanceType extends TeaModel {
        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        @NameInMap("InstanceTypeName")
        public String instanceTypeName;

        @NameInMap("Priority")
        public Integer priority;

        public static InstanceType build(java.util.Map<String, ?> map) throws Exception {
            InstanceType self = new InstanceType();
            return TeaModel.build(map, self);
        }

        public InstanceType setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public InstanceType setInstanceTypeName(String instanceTypeName) {
            this.instanceTypeName = instanceTypeName;
            return this;
        }
        public String getInstanceTypeName() {
            return this.instanceTypeName;
        }

        public InstanceType setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class InstanceTypes extends TeaModel {
        @NameInMap("InstanceType")
        public java.util.List<InstanceType> instanceType;

        public static InstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            InstanceTypes self = new InstanceTypes();
            return TeaModel.build(map, self);
        }

        public InstanceTypes setInstanceType(java.util.List<InstanceType> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public java.util.List<InstanceType> getInstanceType() {
            return this.instanceType;
        }

    }

    public static class RecommendInstanceSpec extends TeaModel {
        @NameInMap("Cores")
        public Integer cores;

        @NameInMap("InstanceTypes")
        public InstanceTypes instanceTypes;

        @NameInMap("Memory")
        public Float memory;

        public static RecommendInstanceSpec build(java.util.Map<String, ?> map) throws Exception {
            RecommendInstanceSpec self = new RecommendInstanceSpec();
            return TeaModel.build(map, self);
        }

        public RecommendInstanceSpec setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public RecommendInstanceSpec setInstanceTypes(InstanceTypes instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public InstanceTypes getInstanceTypes() {
            return this.instanceTypes;
        }

        public RecommendInstanceSpec setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

    }

    public static class RecommendInstanceSpecs extends TeaModel {
        @NameInMap("RecommendInstanceSpec")
        public java.util.List<RecommendInstanceSpec> recommendInstanceSpec;

        public static RecommendInstanceSpecs build(java.util.Map<String, ?> map) throws Exception {
            RecommendInstanceSpecs self = new RecommendInstanceSpecs();
            return TeaModel.build(map, self);
        }

        public RecommendInstanceSpecs setRecommendInstanceSpec(java.util.List<RecommendInstanceSpec> recommendInstanceSpec) {
            this.recommendInstanceSpec = recommendInstanceSpec;
            return this;
        }
        public java.util.List<RecommendInstanceSpec> getRecommendInstanceSpec() {
            return this.recommendInstanceSpec;
        }

    }

    public static class RecommendProduct extends TeaModel {
        @NameInMap("RecommendInstanceSpecs")
        public RecommendInstanceSpecs recommendInstanceSpecs;

        @NameInMap("RecommendReason")
        public String recommendReason;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static RecommendProduct build(java.util.Map<String, ?> map) throws Exception {
            RecommendProduct self = new RecommendProduct();
            return TeaModel.build(map, self);
        }

        public RecommendProduct setRecommendInstanceSpecs(RecommendInstanceSpecs recommendInstanceSpecs) {
            this.recommendInstanceSpecs = recommendInstanceSpecs;
            return this;
        }
        public RecommendInstanceSpecs getRecommendInstanceSpecs() {
            return this.recommendInstanceSpecs;
        }

        public RecommendProduct setRecommendReason(String recommendReason) {
            this.recommendReason = recommendReason;
            return this;
        }
        public String getRecommendReason() {
            return this.recommendReason;
        }

        public RecommendProduct setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public RecommendProduct setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public RecommendProduct setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
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
