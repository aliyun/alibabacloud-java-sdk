// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class DeleteScalingGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteScalingGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteScalingGroupResponseBody self = new DeleteScalingGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteScalingGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
