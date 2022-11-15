// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateCustomRoutingEndpointGroupDestinationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCustomRoutingEndpointGroupDestinationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomRoutingEndpointGroupDestinationsResponseBody self = new UpdateCustomRoutingEndpointGroupDestinationsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCustomRoutingEndpointGroupDestinationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
