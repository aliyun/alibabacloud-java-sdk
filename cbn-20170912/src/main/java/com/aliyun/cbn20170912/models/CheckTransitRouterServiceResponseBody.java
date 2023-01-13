// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CheckTransitRouterServiceResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the transit router feature is activated.</p>
     * <br>
     * <p>*   **true**: activated</p>
     * <p>*   If this value is not returned, the system prompts that the current account does not have the transit router feature activated.</p>
     */
    @NameInMap("Enabled")
    public String enabled;

    /**
     * <p>The ID of the request.</p>
     */
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
