// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StartLoadBalancerListenerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartLoadBalancerListenerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartLoadBalancerListenerResponseBody self = new StartLoadBalancerListenerResponseBody();
        return TeaModel.build(map, self);
    }

    public StartLoadBalancerListenerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
