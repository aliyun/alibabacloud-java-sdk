// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class GrantVirtualBorderRouterResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GrantVirtualBorderRouterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantVirtualBorderRouterResponseBody self = new GrantVirtualBorderRouterResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantVirtualBorderRouterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
