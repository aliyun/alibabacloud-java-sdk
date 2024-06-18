// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteDynamicRouteResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>748CFDC7-1EB6-5B8B-9405-DA76ED5BB60D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDynamicRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDynamicRouteResponseBody self = new DeleteDynamicRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDynamicRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
