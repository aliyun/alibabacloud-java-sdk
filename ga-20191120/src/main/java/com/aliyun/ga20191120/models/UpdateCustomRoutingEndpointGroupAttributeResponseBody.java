// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateCustomRoutingEndpointGroupAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCustomRoutingEndpointGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomRoutingEndpointGroupAttributeResponseBody self = new UpdateCustomRoutingEndpointGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCustomRoutingEndpointGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
