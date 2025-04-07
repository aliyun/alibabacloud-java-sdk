// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRoutineRouteResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>34DCBC8A-<strong><strong>-</strong></strong>-****-6DAA11D7DDBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRoutineRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoutineRouteResponseBody self = new UpdateRoutineRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRoutineRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
