// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBasicEndpointGroupResponseBody extends TeaModel {
    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateBasicEndpointGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBasicEndpointGroupResponseBody self = new UpdateBasicEndpointGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBasicEndpointGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
