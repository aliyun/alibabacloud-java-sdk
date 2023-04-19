// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DetachServerGroupsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the scaling activity in which you detach the server group from the scaling group and Auto Scaling removes the ECS instances from the server group.</p>
     * <br>
     * <p>> This parameter is returned only if you set the ForceAttach parameter to true.</p>
     */
    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    public static DetachServerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachServerGroupsResponseBody self = new DetachServerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachServerGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetachServerGroupsResponseBody setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

}
