// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterPolicyTableResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C46FF5A8-C5F0-4024-8262-B16B639225A0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTransitRouterPolicyTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterPolicyTableResponseBody self = new DeleteTransitRouterPolicyTableResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterPolicyTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
