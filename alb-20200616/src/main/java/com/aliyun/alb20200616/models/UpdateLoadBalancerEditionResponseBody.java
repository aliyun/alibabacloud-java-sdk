// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerEditionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLoadBalancerEditionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerEditionResponseBody self = new UpdateLoadBalancerEditionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerEditionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
