// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RegisterTransitRouterMulticastGroupSourcesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RegisterTransitRouterMulticastGroupSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterTransitRouterMulticastGroupSourcesResponseBody self = new RegisterTransitRouterMulticastGroupSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterTransitRouterMulticastGroupSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
