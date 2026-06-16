// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ScaleWithAdjustmentResponseBody extends TeaModel {
    /**
     * <p>The type of the scaling activity.</p>
     * <p>If this parameter is set to <code>CapacityChange</code>, the scaling activity only adjusts the desired capacity of the scaling group without immediately adding or removing instances.</p>
     * <p>This setting only affects scaling groups with a configured desired capacity.</p>
     * 
     * <strong>example:</strong>
     * <p>CapacityChange</p>
     */
    @NameInMap("ActivityType")
    public String activityType;

    /**
     * <p>The scaling plan result returned when ExecutionMode is set to PlanOnly.</p>
     */
    @NameInMap("PlanResult")
    public ScaleWithAdjustmentResponseBodyPlanResult planResult;

    /**
     * <p>The request ID.</p>
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
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><p><strong>Prepaid</strong>: subscription</p>
         * </li>
         * <li><p><strong>PostPaid</strong>: pay-as-you-go</p>
         * </li>
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
         * <p>The spot strategy of the instance. Valid values:</p>
         * <ul>
         * <li><p>NoSpot: A pay-as-you-go instance.</p>
         * </li>
         * <li><p>SpotWithPriceLimit: A spot instance with a user-specified price limit.</p>
         * </li>
         * <li><p>SpotAsPriceGo: A spot instance where the system automatically bids based on the current market price.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The availability zone ID.</p>
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
         * <p>The resource allocation details in the scaling plan result.</p>
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
