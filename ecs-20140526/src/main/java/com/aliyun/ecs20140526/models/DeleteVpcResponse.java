// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteVpcResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcResponse self = new DeleteVpcResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVpcResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
