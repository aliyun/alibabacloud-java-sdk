// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyCenRouteMapResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCenRouteMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCenRouteMapResponseBody self = new ModifyCenRouteMapResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCenRouteMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
