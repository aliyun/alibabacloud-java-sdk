// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateEndpointGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateEndpointGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEndpointGroupResponseBody self = new UpdateEndpointGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEndpointGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
