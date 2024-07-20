// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DetachLogStoreFromEndpointGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>64ADAB1E-0B7F-4FD8-A404-3BECC0E9CCFF</p>
     */
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
