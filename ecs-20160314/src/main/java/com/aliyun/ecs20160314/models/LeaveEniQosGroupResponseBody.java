// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class LeaveEniQosGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static LeaveEniQosGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LeaveEniQosGroupResponseBody self = new LeaveEniQosGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public LeaveEniQosGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
