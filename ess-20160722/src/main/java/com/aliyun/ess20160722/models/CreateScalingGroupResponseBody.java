// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class CreateScalingGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static CreateScalingGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScalingGroupResponseBody self = new CreateScalingGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScalingGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScalingGroupResponseBody setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
