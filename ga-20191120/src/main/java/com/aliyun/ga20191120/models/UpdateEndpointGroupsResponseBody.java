// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateEndpointGroupsResponseBody extends TeaModel {
    /**
     * <p>The IDs of the endpoint groups.</p>
     */
    @NameInMap("EndpointGroupIds")
    public java.util.List<String> endpointGroupIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6FEA0CF3-D3B9-43E5-A304-D217037876A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateEndpointGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEndpointGroupsResponseBody self = new UpdateEndpointGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEndpointGroupsResponseBody setEndpointGroupIds(java.util.List<String> endpointGroupIds) {
        this.endpointGroupIds = endpointGroupIds;
        return this;
    }
    public java.util.List<String> getEndpointGroupIds() {
        return this.endpointGroupIds;
    }

    public UpdateEndpointGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
