// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterCidrResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTransitRouterCidrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterCidrResponseBody self = new DeleteTransitRouterCidrResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterCidrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
