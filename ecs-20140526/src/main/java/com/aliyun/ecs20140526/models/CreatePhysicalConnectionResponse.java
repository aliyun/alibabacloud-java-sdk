// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PhysicalConnectionId")
    @Validation(required = true)
    public String physicalConnectionId;

    public static CreatePhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalConnectionResponse self = new CreatePhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalConnectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePhysicalConnectionResponse setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

}
