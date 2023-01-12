// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateCustomRoutingEndpointGroupsResponseBody extends TeaModel {
    /**
     * <p>The IDs of the endpoint groups.</p>
     */
    @NameInMap("EndpointGroupIds")
    public java.util.List<String> endpointGroupIds;

    /**
     * <p>The ID of the request.</p>
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
