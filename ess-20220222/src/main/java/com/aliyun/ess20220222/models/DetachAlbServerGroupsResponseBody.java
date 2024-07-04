// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DetachAlbServerGroupsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the scaling activity in which the ALB server group is disassociated from the scaling group and the ECS instances in the ALB server group are removed from the ALB server group. This parameter is returned only after you set the <code>ForceDetach</code> parameter to <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>asa-2ze6wxj8vsohn6j9****</p>
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
