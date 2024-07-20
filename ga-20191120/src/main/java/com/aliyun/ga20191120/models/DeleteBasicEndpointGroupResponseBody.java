// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteBasicEndpointGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBasicEndpointGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBasicEndpointGroupResponseBody self = new DeleteBasicEndpointGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBasicEndpointGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
