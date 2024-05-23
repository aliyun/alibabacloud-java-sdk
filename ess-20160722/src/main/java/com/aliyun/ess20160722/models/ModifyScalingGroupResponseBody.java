// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class ModifyScalingGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyScalingGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingGroupResponseBody self = new ModifyScalingGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyScalingGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
