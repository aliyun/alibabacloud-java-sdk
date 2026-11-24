// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ScaleWithAdjustmentResponseBody extends TeaModel {
    /**
     * <p>The type of the scaling activity. If <code>ActivityType</code> is <code>CapacityChange</code>, the scaling activity corresponding to the returned <code>ScalingActivityId</code> only modifies the expected number of instances in the scaling group and does not immediately execute scale-out or scale-in. Applicable scope: scaling groups with the expected number of instances configured.</p>
     * 
     * <strong>example:</strong>
     * <p>CapacityChange</p>
     */
    @NameInMap("ActivityType")
    public String activityType;

    /**
     * <p>The elastic planning results returned when ExecutionMode is set to PlanOnly.</p>
     */
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
        /**
         * <p>The number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.u1-c1m8.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The preemption policy for the instance. Valid values:</p>
         * <ul>
         * <li>NoSpot: regular pay-as-you-go instance.</li>
         * <li>SpotWithPriceLimit: spot instance with a maximum price limit.</li>
         * <li>SpotAsPriceGo: spot instance whose price is automatically set by the system based on the current market price.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-g</p>
         */
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
        /**
         * <p>The resource allocation information in the elastic planning results.</p>
         */
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
