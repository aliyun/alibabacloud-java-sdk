// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteNatGatewayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNatGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNatGatewayResponseBody self = new DeleteNatGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNatGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
