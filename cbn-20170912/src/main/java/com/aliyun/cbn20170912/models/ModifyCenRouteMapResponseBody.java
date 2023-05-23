// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyCenRouteMapResponseBody extends TeaModel {
    /**
     * <p>The action that is performed on the community. Valid values:</p>
     * <br>
     * <p>*   **Additive**: adds the community to the route.</p>
     * <p>*   **Replace**: replaces the original community of the route.</p>
     * <br>
     * <p>This parameter specifies the action to be performed when a route meets the match condition.</p>
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
