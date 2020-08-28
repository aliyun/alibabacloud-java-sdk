// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteNatGatewayResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteNatGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNatGatewayResponse self = new DeleteNatGatewayResponse();
        return TeaModel.build(map, self);
    }

}
