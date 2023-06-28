// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteCustomRoutingEndpointsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCustomRoutingEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomRoutingEndpointsResponseBody self = new DeleteCustomRoutingEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomRoutingEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
