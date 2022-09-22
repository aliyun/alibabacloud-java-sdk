// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeResourceAllocationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourcePlanningResponse")
    public ResourcePlanningResponse resourcePlanningResponse;

    public static DescribeResourceAllocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceAllocationResponseBody self = new DescribeResourceAllocationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceAllocationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceAllocationResponseBody setResourcePlanningResponse(ResourcePlanningResponse resourcePlanningResponse) {
        this.resourcePlanningResponse = resourcePlanningResponse;
        return this;
    }
    public ResourcePlanningResponse getResourcePlanningResponse() {
        return this.resourcePlanningResponse;
    }

    public static class ResourceModel extends TeaModel {
        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("IoOptimized")
        public String ioOptimized;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("Price")
        public Float price;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ResourceModel build(java.util.Map<String, ?> map) throws Exception {
            ResourceModel self = new ResourceModel();
            return TeaModel.build(map, self);
        }

        public ResourceModel setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public ResourceModel setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public ResourceModel setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ResourceModel setIoOptimized(String ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        public ResourceModel setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public ResourceModel setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

        public ResourceModel setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ResourceModel setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public ResourceModel setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ResourceModels extends TeaModel {
        @NameInMap("ResourceModel")
        public java.util.List<ResourceModel> resourceModel;

        public static ResourceModels build(java.util.Map<String, ?> map) throws Exception {
            ResourceModels self = new ResourceModels();
            return TeaModel.build(map, self);
        }

        public ResourceModels setResourceModel(java.util.List<ResourceModel> resourceModel) {
            this.resourceModel = resourceModel;
            return this;
        }
        public java.util.List<ResourceModel> getResourceModel() {
            return this.resourceModel;
        }

    }

    public static class ResourcePlanningResponse extends TeaModel {
        @NameInMap("ResourceModels")
        public ResourceModels resourceModels;

        @NameInMap("SatisfiedAmount")
        public Integer satisfiedAmount;

        public static ResourcePlanningResponse build(java.util.Map<String, ?> map) throws Exception {
            ResourcePlanningResponse self = new ResourcePlanningResponse();
            return TeaModel.build(map, self);
        }

        public ResourcePlanningResponse setResourceModels(ResourceModels resourceModels) {
            this.resourceModels = resourceModels;
            return this;
        }
        public ResourceModels getResourceModels() {
            return this.resourceModels;
        }

        public ResourcePlanningResponse setSatisfiedAmount(Integer satisfiedAmount) {
            this.satisfiedAmount = satisfiedAmount;
            return this;
        }
        public Integer getSatisfiedAmount() {
            return this.satisfiedAmount;
        }

    }

}
