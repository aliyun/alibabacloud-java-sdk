// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateEndpointGroupsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EndpointGroupIds")
    public java.util.List<String> endpointGroupIds;

    public static UpdateEndpointGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEndpointGroupsResponseBody self = new UpdateEndpointGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEndpointGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateEndpointGroupsResponseBody setEndpointGroupIds(java.util.List<String> endpointGroupIds) {
        this.endpointGroupIds = endpointGroupIds;
        return this;
    }
    public java.util.List<String> getEndpointGroupIds() {
        return this.endpointGroupIds;
    }

}
