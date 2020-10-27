// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ActivateRouterInterfaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ActivateRouterInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateRouterInterfaceResponse self = new ActivateRouterInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public ActivateRouterInterfaceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
