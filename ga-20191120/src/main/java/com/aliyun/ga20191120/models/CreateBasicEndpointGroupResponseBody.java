// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicEndpointGroupResponseBody extends TeaModel {
    // 终端节点组Id
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBasicEndpointGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicEndpointGroupResponseBody self = new CreateBasicEndpointGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBasicEndpointGroupResponseBody setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public CreateBasicEndpointGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
