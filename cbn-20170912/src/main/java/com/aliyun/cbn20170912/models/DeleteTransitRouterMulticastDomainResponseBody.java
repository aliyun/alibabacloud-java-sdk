// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterMulticastDomainResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>40194E53-2484-5831-BB53-E11D123C1A32</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTransitRouterMulticastDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterMulticastDomainResponseBody self = new DeleteTransitRouterMulticastDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterMulticastDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
