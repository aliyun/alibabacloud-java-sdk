// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RecoverVirtualBorderRouterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RecoverVirtualBorderRouterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecoverVirtualBorderRouterResponseBody self = new RecoverVirtualBorderRouterResponseBody();
        return TeaModel.build(map, self);
    }

    public RecoverVirtualBorderRouterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
