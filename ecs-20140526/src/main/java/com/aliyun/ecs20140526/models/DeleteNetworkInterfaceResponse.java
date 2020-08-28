// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteNetworkInterfaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteNetworkInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkInterfaceResponse self = new DeleteNetworkInterfaceResponse();
        return TeaModel.build(map, self);
    }

}
