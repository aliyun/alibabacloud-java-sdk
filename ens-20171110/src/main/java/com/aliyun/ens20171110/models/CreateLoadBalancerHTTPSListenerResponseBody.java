// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerHTTPSListenerResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLoadBalancerHTTPSListenerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerHTTPSListenerResponseBody self = new CreateLoadBalancerHTTPSListenerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerHTTPSListenerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
