// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateHpcClusterResponseBody extends TeaModel {
    /**
     * <p>The ID of cluster.</p>
     */
    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateHpcClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHpcClusterResponseBody self = new CreateHpcClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHpcClusterResponseBody setHpcClusterId(String hpcClusterId) {
        this.hpcClusterId = hpcClusterId;
        return this;
    }
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    public CreateHpcClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
