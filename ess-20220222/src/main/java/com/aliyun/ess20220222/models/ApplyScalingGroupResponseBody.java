// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ApplyScalingGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CC107349-57B7-4405-B1BF-9BF5AF7F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>asg-bp1igpak5ft1flyp****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static ApplyScalingGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyScalingGroupResponseBody self = new ApplyScalingGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyScalingGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyScalingGroupResponseBody setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
