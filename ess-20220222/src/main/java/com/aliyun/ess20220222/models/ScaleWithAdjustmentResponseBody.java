// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ScaleWithAdjustmentResponseBody extends TeaModel {
    /**
     * <p>The type of the scaling activity.</p>
     * <p>If <code>ActivityType</code> is set to <code>CapacityChange</code>, only the expected number of instances is changed during the scaling activity specified by ScalingActivityId and no scale-out is triggered.</p>
     * <p>This parameter is applicable to only scaling groups that have an expected number of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>CapacityChange</p>
     */
    @NameInMap("ActivityType")
    public String activityType;

    @NameInMap("PlanResult")
    public ScaleWithAdjustmentResponseBodyPlanResult planResult;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the scaling activity.</p>
     * 
     * <strong>example:</strong>
     * <p>asa-bp175o6f6ego3r2j****</p>
     */
    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    public static ScaleWithAdjustmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScaleWithAdjustmentResponseBody self = new ScaleWithAdjustmentResponseBody();
        return TeaModel.build(map, self);
    }

    public ScaleWithAdjustmentResponseBody setActivityType(String activityType) {
        this.activityType = activityType;
        return this;
    }
    public String getActivityType() {
        return this.activityType;
    }

    public ScaleWithAdjustmentResponseBody setPlanResult(ScaleWithAdjustmentResponseBodyPlanResult planResult) {
        this.planResult = planResult;
        return this;
    }
    public ScaleWithAdjustmentResponseBodyPlanResult getPlanResult() {
        return this.planResult;
    }

    public ScaleWithAdjustmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ScaleWithAdjustmentResponseBody setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

    public static class ScaleWithAdjustmentResponseBodyPlanResultResourceAllocations extends TeaModel {
        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ScaleWithAdjustmentResponseBodyPlanResultResourceAllocations build(java.util.Map<String, ?> map) throws Exception {
            ScaleWithAdjustmentResponseBodyPlanResultResourceAllocations self = new ScaleWithAdjustmentResponseBodyPlanResultResourceAllocations();
            return TeaModel.build(map, self);
        }

        public ScaleWithAdjustmentResponseBodyPlanResultResourceAllocations setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public ScaleWithAdjustmentResponseBodyPlanResultResourceAllocations setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public ScaleWithAdjustmentResponseBodyPlanResultResourceAllocations setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ScaleWithAdjustmentResponseBodyPlanResultResourceAllocations setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public ScaleWithAdjustmentResponseBodyPlanResultResourceAllocations setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ScaleWithAdjustmentResponseBodyPlanResult extends TeaModel {
        @NameInMap("ResourceAllocations")
        public java.util.List<ScaleWithAdjustmentResponseBodyPlanResultResourceAllocations> resourceAllocations;

        public static ScaleWithAdjustmentResponseBodyPlanResult build(java.util.Map<String, ?> map) throws Exception {
            ScaleWithAdjustmentResponseBodyPlanResult self = new ScaleWithAdjustmentResponseBodyPlanResult();
            return TeaModel.build(map, self);
        }

        public ScaleWithAdjustmentResponseBodyPlanResult setResourceAllocations(java.util.List<ScaleWithAdjustmentResponseBodyPlanResultResourceAllocations> resourceAllocations) {
            this.resourceAllocations = resourceAllocations;
            return this;
        }
        public java.util.List<ScaleWithAdjustmentResponseBodyPlanResultResourceAllocations> getResourceAllocations() {
            return this.resourceAllocations;
        }

    }

}
