// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTransitRouterMulticastDomainResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>26273D23-5CB0-5EFC-AF5F-78A5448084C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTransitRouterMulticastDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTransitRouterMulticastDomainResponseBody self = new ModifyTransitRouterMulticastDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTransitRouterMulticastDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
