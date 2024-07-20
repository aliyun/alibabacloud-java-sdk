// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateCustomRoutingEndpointGroupDestinationsResponseBody extends TeaModel {
    /**
     * <p>The IDs of the endpoint group mappings.</p>
     */
    @NameInMap("DestinationIds")
    public java.util.List<String> destinationIds;

    /**
     * <p>The IDs of the endpoint group mappings.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomRoutingEndpointGroupDestinationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomRoutingEndpointGroupDestinationsResponseBody self = new CreateCustomRoutingEndpointGroupDestinationsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomRoutingEndpointGroupDestinationsResponseBody setDestinationIds(java.util.List<String> destinationIds) {
        this.destinationIds = destinationIds;
        return this;
    }
    public java.util.List<String> getDestinationIds() {
        return this.destinationIds;
    }

    public CreateCustomRoutingEndpointGroupDestinationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
