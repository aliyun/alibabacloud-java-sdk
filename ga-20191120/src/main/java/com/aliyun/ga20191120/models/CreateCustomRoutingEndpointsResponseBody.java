// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateCustomRoutingEndpointsResponseBody extends TeaModel {
    /**
     * <p>The IDs of the endpoints.</p>
     */
    @NameInMap("EndpointIds")
    public java.util.List<String> endpointIds;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomRoutingEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomRoutingEndpointsResponseBody self = new CreateCustomRoutingEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomRoutingEndpointsResponseBody setEndpointIds(java.util.List<String> endpointIds) {
        this.endpointIds = endpointIds;
        return this;
    }
    public java.util.List<String> getEndpointIds() {
        return this.endpointIds;
    }

    public CreateCustomRoutingEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
