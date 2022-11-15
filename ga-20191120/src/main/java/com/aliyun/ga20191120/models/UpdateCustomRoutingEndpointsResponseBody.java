// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateCustomRoutingEndpointsResponseBody extends TeaModel {
    @NameInMap("EndpointIds")
    public java.util.List<String> endpointIds;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCustomRoutingEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomRoutingEndpointsResponseBody self = new UpdateCustomRoutingEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCustomRoutingEndpointsResponseBody setEndpointIds(java.util.List<String> endpointIds) {
        this.endpointIds = endpointIds;
        return this;
    }
    public java.util.List<String> getEndpointIds() {
        return this.endpointIds;
    }

    public UpdateCustomRoutingEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
