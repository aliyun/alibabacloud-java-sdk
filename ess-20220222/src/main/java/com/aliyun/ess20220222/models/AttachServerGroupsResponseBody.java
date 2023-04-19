// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachServerGroupsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the scaling activity in which you attach the server group to the scaling group and Auto Scaling adds the ECS instances in the scaling group to the server group.</p>
     * <br>
     * <p>> This parameter is returned only if you set the ForceAttach parameter to true.</p>
     */
    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    public static AttachServerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachServerGroupsResponseBody self = new AttachServerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachServerGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachServerGroupsResponseBody setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

}
