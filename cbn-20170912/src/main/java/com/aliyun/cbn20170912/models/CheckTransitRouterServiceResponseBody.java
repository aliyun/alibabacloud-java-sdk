// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CheckTransitRouterServiceResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the transit router service is activated for the current Alibaba Cloud account.</p>
     * <ul>
     * <li><strong>true</strong>: The service is activated.</li>
     * <li>If this parameter is not returned, the transit router service is not activated for the current Alibaba Cloud account, and the system returns a corresponding message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public String enabled;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5D93C8B9-C354-5C3E-BEFB-BA8A2C314D68</p>
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
