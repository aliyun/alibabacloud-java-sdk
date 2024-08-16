// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RegisterTransitRouterMulticastGroupSourcesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9C5D5D70-0AFF-5E5C-8D8A-E92C90C8FB08</p>
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
