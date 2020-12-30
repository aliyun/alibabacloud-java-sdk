// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class DeleteVpcEndpointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVpcEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcEndpointResponseBody self = new DeleteVpcEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVpcEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
