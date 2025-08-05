// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeletePrivateDnsEndpointResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>822B9125-6E1A-551C-8EAF-6E7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePrivateDnsEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivateDnsEndpointResponseBody self = new DeletePrivateDnsEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePrivateDnsEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
