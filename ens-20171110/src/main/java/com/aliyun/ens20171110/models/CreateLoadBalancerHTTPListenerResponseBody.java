// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerHTTPListenerResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLoadBalancerHTTPListenerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerHTTPListenerResponseBody self = new CreateLoadBalancerHTTPListenerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerHTTPListenerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
