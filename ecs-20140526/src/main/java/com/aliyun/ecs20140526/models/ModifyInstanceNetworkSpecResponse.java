// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceNetworkSpecResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public String orderId;

    public static ModifyInstanceNetworkSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNetworkSpecResponse self = new ModifyInstanceNetworkSpecResponse();
        return TeaModel.build(map, self);
    }

}
