// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DetachAlbServerGroupsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the scaling activity in which the ALB server group is disassociated from the scaling group and the ECS instances in the ALB server group are removed from the ALB server group. This parameter is returned only after you set the `ForceDetach` parameter to `true`.</p>
     */
    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    public static DetachAlbServerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachAlbServerGroupsResponseBody self = new DetachAlbServerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachAlbServerGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetachAlbServerGroupsResponseBody setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

}
