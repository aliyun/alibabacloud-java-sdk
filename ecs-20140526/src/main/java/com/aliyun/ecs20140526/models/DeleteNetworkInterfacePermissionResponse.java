// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteNetworkInterfacePermissionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteNetworkInterfacePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkInterfacePermissionResponse self = new DeleteNetworkInterfacePermissionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkInterfacePermissionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
