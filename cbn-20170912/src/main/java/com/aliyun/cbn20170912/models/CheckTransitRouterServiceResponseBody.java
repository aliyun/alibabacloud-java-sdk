// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CheckTransitRouterServiceResponseBody extends TeaModel {
    @NameInMap("Enabled")
    public String enabled;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckTransitRouterServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckTransitRouterServiceResponseBody self = new CheckTransitRouterServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckTransitRouterServiceResponseBody setEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }
    public String getEnabled() {
        return this.enabled;
    }

    public CheckTransitRouterServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
