// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTransitRouterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterResponseBody self = new UpdateTransitRouterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
