// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ConnectRouterInterfaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ConnectRouterInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ConnectRouterInterfaceResponse self = new ConnectRouterInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public ConnectRouterInterfaceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
