// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteEndpointGroupsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEndpointGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEndpointGroupsResponseBody self = new DeleteEndpointGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEndpointGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
