// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteNetworkAccessEndpointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNetworkAccessEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkAccessEndpointResponseBody self = new DeleteNetworkAccessEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkAccessEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
