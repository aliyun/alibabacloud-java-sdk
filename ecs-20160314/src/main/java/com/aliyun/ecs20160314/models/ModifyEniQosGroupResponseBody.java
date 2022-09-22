// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyEniQosGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyEniQosGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyEniQosGroupResponseBody self = new ModifyEniQosGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyEniQosGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
