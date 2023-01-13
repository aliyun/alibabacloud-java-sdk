// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ScaleWithAdjustmentResponseBody extends TeaModel {
    /**
     * <p>The type of scaling activity.</p>
     * <br>
     * <p>When the ActivityType is CapacityChange, it means that the scaling activity corresponding to the return value ScalingActivityId only modifies the expected number of instances of the scaling group, and does not perform scaling immediately. Scope of application: scaling groups of the expected number of instances.</p>
     */
    @NameInMap("ActivityType")
    public String activityType;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the scaling activity.</p>
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

}
