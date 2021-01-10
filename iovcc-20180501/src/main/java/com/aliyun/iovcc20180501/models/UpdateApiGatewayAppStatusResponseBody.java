// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateApiGatewayAppStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateApiGatewayAppStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiGatewayAppStatusResponseBody self = new UpdateApiGatewayAppStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApiGatewayAppStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
