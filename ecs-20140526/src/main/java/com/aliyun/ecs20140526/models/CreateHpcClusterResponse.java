// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateHpcClusterResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("HpcClusterId")
    @Validation(required = true)
    public String hpcClusterId;

    public static CreateHpcClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHpcClusterResponse self = new CreateHpcClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateHpcClusterResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHpcClusterResponse setHpcClusterId(String hpcClusterId) {
        this.hpcClusterId = hpcClusterId;
        return this;
    }
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

}
