// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerResponseBody extends TeaModel {
    /**
     * <p>The ID of the ALB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-o9ulmq5hgn68jk****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLoadBalancerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerResponseBody self = new CreateLoadBalancerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CreateLoadBalancerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
