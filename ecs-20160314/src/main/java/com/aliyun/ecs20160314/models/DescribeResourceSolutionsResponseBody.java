// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeResourceSolutionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourcePlanningResponses")
    public ResourcePlanningResponses resourcePlanningResponses;

    public static DescribeResourceSolutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceSolutionsResponseBody self = new DescribeResourceSolutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceSolutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceSolutionsResponseBody setResourcePlanningResponses(ResourcePlanningResponses resourcePlanningResponses) {
        this.resourcePlanningResponses = resourcePlanningResponses;
        return this;
    }
    public ResourcePlanningResponses getResourcePlanningResponses() {
        return this.resourcePlanningResponses;
    }

    public static class RecommendReasons extends TeaModel {
        @NameInMap("RecommendReason")
        public java.util.List<String> recommendReason;

        public static RecommendReasons build(java.util.Map<String, ?> map) throws Exception {
            RecommendReasons self = new RecommendReasons();
            return TeaModel.build(map, self);
        }

        public RecommendReasons setRecommendReason(java.util.List<String> recommendReason) {
            this.recommendReason = recommendReason;
            return this;
        }
        public java.util.List<String> getRecommendReason() {
            return this.recommendReason;
        }

    }

    public static class ResourceModel extends TeaModel {
        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("DeliveryTime")
        public String deliveryTime;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("RegionId")
        public String regionId;

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

        public ResourceModel setDeliveryTime(String deliveryTime) {
            this.deliveryTime = deliveryTime;
            return this;
        }
        public String getDeliveryTime() {
            return this.deliveryTime;
        }

        public ResourceModel setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ResourceModel setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
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
        @NameInMap("RecommendReasons")
        public RecommendReasons recommendReasons;

        @NameInMap("ResourceModels")
        public ResourceModels resourceModels;

        @NameInMap("SatisfiedAmount")
        public Integer satisfiedAmount;

        public static ResourcePlanningResponse build(java.util.Map<String, ?> map) throws Exception {
            ResourcePlanningResponse self = new ResourcePlanningResponse();
            return TeaModel.build(map, self);
        }

        public ResourcePlanningResponse setRecommendReasons(RecommendReasons recommendReasons) {
            this.recommendReasons = recommendReasons;
            return this;
        }
        public RecommendReasons getRecommendReasons() {
            return this.recommendReasons;
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

    public static class ResourcePlanningResponses extends TeaModel {
        @NameInMap("ResourcePlanningResponse")
        public java.util.List<ResourcePlanningResponse> resourcePlanningResponse;

        public static ResourcePlanningResponses build(java.util.Map<String, ?> map) throws Exception {
            ResourcePlanningResponses self = new ResourcePlanningResponses();
            return TeaModel.build(map, self);
        }

        public ResourcePlanningResponses setResourcePlanningResponse(java.util.List<ResourcePlanningResponse> resourcePlanningResponse) {
            this.resourcePlanningResponse = resourcePlanningResponse;
            return this;
        }
        public java.util.List<ResourcePlanningResponse> getResourcePlanningResponse() {
            return this.resourcePlanningResponse;
        }

    }

}
