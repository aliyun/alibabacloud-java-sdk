// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateRouterInterfaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RouterInterfaceId")
    @Validation(required = true)
    public String routerInterfaceId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public Long orderId;

    public static CreateRouterInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRouterInterfaceResponse self = new CreateRouterInterfaceResponse();
        return TeaModel.build(map, self);
    }

}
