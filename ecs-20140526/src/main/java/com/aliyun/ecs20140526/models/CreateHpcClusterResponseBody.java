// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateHpcClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    public static CreateHpcClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHpcClusterResponseBody self = new CreateHpcClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHpcClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHpcClusterResponseBody setHpcClusterId(String hpcClusterId) {
        this.hpcClusterId = hpcClusterId;
        return this;
    }
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

}
