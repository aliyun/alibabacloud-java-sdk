// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DisableLoadBalancerAccessLogResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableLoadBalancerAccessLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableLoadBalancerAccessLogResponseBody self = new DisableLoadBalancerAccessLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableLoadBalancerAccessLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
