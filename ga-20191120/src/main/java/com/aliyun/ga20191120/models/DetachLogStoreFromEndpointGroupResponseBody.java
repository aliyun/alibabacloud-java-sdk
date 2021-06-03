// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DetachLogStoreFromEndpointGroupResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DetachLogStoreFromEndpointGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachLogStoreFromEndpointGroupResponseBody self = new DetachLogStoreFromEndpointGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachLogStoreFromEndpointGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
