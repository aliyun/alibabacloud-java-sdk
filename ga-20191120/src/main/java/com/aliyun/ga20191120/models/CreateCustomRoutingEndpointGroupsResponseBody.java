// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateCustomRoutingEndpointGroupsResponseBody extends TeaModel {
    /**
     * <p>The list of endpoint group IDs.</p>
     */
    @NameInMap("EndpointGroupIds")
    public java.util.List<String> endpointGroupIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomRoutingEndpointGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomRoutingEndpointGroupsResponseBody self = new CreateCustomRoutingEndpointGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomRoutingEndpointGroupsResponseBody setEndpointGroupIds(java.util.List<String> endpointGroupIds) {
        this.endpointGroupIds = endpointGroupIds;
        return this;
    }
    public java.util.List<String> getEndpointGroupIds() {
        return this.endpointGroupIds;
    }

    public CreateCustomRoutingEndpointGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
