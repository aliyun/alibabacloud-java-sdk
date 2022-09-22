// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeRecommendProductResponseBody extends TeaModel {
    @NameInMap("RecommendProducts")
    public RecommendProducts recommendProducts;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRecommendProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendProductResponseBody self = new DescribeRecommendProductResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendProductResponseBody setRecommendProducts(RecommendProducts recommendProducts) {
        this.recommendProducts = recommendProducts;
        return this;
    }
    public RecommendProducts getRecommendProducts() {
        return this.recommendProducts;
    }

    public DescribeRecommendProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InstanceType extends TeaModel {
        @NameInMap("Cores")
        public Integer cores;

        @NameInMap("Generation")
        public String generation;

        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("SupportIoOptimized")
        public String supportIoOptimized;

        public static InstanceType build(java.util.Map<String, ?> map) throws Exception {
            InstanceType self = new InstanceType();
            return TeaModel.build(map, self);
        }

        public InstanceType setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public InstanceType setGeneration(String generation) {
            this.generation = generation;
            return this;
        }
        public String getGeneration() {
            return this.generation;
        }

        public InstanceType setInstanceFamilyLevel(String instanceFamilyLevel) {
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        public InstanceType setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public InstanceType setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public InstanceType setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public InstanceType setSupportIoOptimized(String supportIoOptimized) {
            this.supportIoOptimized = supportIoOptimized;
            return this;
        }
        public String getSupportIoOptimized() {
            return this.supportIoOptimized;
        }

    }

    public static class RecommendInstanceType extends TeaModel {
        @NameInMap("CapacitySpecification")
        public String capacitySpecification;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InstanceType")
        public InstanceType instanceType;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("Price")
        public Float price;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        public static RecommendInstanceType build(java.util.Map<String, ?> map) throws Exception {
            RecommendInstanceType self = new RecommendInstanceType();
            return TeaModel.build(map, self);
        }

        public RecommendInstanceType setCapacitySpecification(String capacitySpecification) {
            this.capacitySpecification = capacitySpecification;
            return this;
        }
        public String getCapacitySpecification() {
            return this.capacitySpecification;
        }

        public RecommendInstanceType setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public RecommendInstanceType setInstanceType(InstanceType instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public InstanceType getInstanceType() {
            return this.instanceType;
        }

        public RecommendInstanceType setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public RecommendInstanceType setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

        public RecommendInstanceType setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public RecommendInstanceType setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

    }

    public static class RecommendInstanceTypes extends TeaModel {
        @NameInMap("RecommendInstanceType")
        public java.util.List<RecommendInstanceType> recommendInstanceType;

        public static RecommendInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            RecommendInstanceTypes self = new RecommendInstanceTypes();
            return TeaModel.build(map, self);
        }

        public RecommendInstanceTypes setRecommendInstanceType(java.util.List<RecommendInstanceType> recommendInstanceType) {
            this.recommendInstanceType = recommendInstanceType;
            return this;
        }
        public java.util.List<RecommendInstanceType> getRecommendInstanceType() {
            return this.recommendInstanceType;
        }

    }

    public static class RecommendProduct extends TeaModel {
        @NameInMap("RecommendInstanceTypes")
        public RecommendInstanceTypes recommendInstanceTypes;

        @NameInMap("ZoneId")
        public String zoneId;

        public static RecommendProduct build(java.util.Map<String, ?> map) throws Exception {
            RecommendProduct self = new RecommendProduct();
            return TeaModel.build(map, self);
        }

        public RecommendProduct setRecommendInstanceTypes(RecommendInstanceTypes recommendInstanceTypes) {
            this.recommendInstanceTypes = recommendInstanceTypes;
            return this;
        }
        public RecommendInstanceTypes getRecommendInstanceTypes() {
            return this.recommendInstanceTypes;
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
