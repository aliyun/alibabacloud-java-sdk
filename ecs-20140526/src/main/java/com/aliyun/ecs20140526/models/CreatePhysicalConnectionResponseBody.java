// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    public static CreatePhysicalConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalConnectionResponseBody self = new CreatePhysicalConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePhysicalConnectionResponseBody setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

}
