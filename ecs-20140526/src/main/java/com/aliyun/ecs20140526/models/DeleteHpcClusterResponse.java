// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteHpcClusterResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteHpcClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHpcClusterResponse self = new DeleteHpcClusterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHpcClusterResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
