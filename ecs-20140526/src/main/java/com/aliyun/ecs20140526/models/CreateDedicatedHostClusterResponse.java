// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostClusterResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DedicatedHostClusterId")
    @Validation(required = true)
    public String dedicatedHostClusterId;

    public static CreateDedicatedHostClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedHostClusterResponse self = new CreateDedicatedHostClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedHostClusterResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDedicatedHostClusterResponse setDedicatedHostClusterId(String dedicatedHostClusterId) {
        this.dedicatedHostClusterId = dedicatedHostClusterId;
        return this;
    }
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
    }

}
