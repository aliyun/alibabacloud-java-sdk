// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteRouterInterfaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRouterInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouterInterfaceResponseBody self = new DeleteRouterInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRouterInterfaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
