// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteCustomRoutingEndpointGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCustomRoutingEndpointGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomRoutingEndpointGroupsResponseBody self = new DeleteCustomRoutingEndpointGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomRoutingEndpointGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
