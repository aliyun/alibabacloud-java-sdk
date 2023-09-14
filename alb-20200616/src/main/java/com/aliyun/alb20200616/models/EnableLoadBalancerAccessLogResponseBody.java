// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class EnableLoadBalancerAccessLogResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableLoadBalancerAccessLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableLoadBalancerAccessLogResponseBody self = new EnableLoadBalancerAccessLogResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableLoadBalancerAccessLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
