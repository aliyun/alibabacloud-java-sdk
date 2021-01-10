// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CreateContainerGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ContainerGroupId")
    public String containerGroupId;

    public static CreateContainerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateContainerGroupResponseBody self = new CreateContainerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateContainerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateContainerGroupResponseBody setContainerGroupId(String containerGroupId) {
        this.containerGroupId = containerGroupId;
        return this;
    }
    public String getContainerGroupId() {
        return this.containerGroupId;
    }

}
