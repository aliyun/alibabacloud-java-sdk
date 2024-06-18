// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateDynamicRouteResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BE4FB974-11BC-5453-9BE1-1606A73EACA6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDynamicRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDynamicRouteResponseBody self = new UpdateDynamicRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDynamicRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
