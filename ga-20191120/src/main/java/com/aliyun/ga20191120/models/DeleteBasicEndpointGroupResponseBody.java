// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteBasicEndpointGroupResponseBody extends TeaModel {
    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBasicEndpointGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBasicEndpointGroupResponseBody self = new DeleteBasicEndpointGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBasicEndpointGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
