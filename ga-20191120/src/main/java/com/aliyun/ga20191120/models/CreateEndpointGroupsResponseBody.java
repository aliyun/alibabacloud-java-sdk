// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateEndpointGroupsResponseBody extends TeaModel {
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

    public static CreateEndpointGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEndpointGroupsResponseBody self = new CreateEndpointGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEndpointGroupsResponseBody setEndpointGroupIds(java.util.List<String> endpointGroupIds) {
        this.endpointGroupIds = endpointGroupIds;
        return this;
    }
    public java.util.List<String> getEndpointGroupIds() {
        return this.endpointGroupIds;
    }

    public CreateEndpointGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
