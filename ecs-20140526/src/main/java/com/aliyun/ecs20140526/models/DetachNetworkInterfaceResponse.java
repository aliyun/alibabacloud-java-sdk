// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachNetworkInterfaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DetachNetworkInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachNetworkInterfaceResponse self = new DetachNetworkInterfaceResponse();
        return TeaModel.build(map, self);
    }

}
