// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostClusterResponseBody extends TeaModel {
    @NameInMap("DedicatedHostClusterId")
    public String dedicatedHostClusterId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDedicatedHostClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedHostClusterResponseBody self = new CreateDedicatedHostClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedHostClusterResponseBody setDedicatedHostClusterId(String dedicatedHostClusterId) {
        this.dedicatedHostClusterId = dedicatedHostClusterId;
        return this;
    }
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
    }

    public CreateDedicatedHostClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
