// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateEndpointGroupAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateEndpointGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEndpointGroupAttributeResponseBody self = new UpdateEndpointGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEndpointGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
