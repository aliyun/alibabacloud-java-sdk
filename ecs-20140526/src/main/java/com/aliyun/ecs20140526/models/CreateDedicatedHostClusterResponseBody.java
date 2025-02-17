// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostClusterResponseBody extends TeaModel {
    /**
     * <p>The ID of the host group.</p>
     * 
     * <strong>example:</strong>
     * <p>dc-bp12wlf6bw0vz9v2****</p>
     */
    @NameInMap("DedicatedHostClusterId")
    public String dedicatedHostClusterId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E2A664A6-2933-4C64-88AE-5033D003****</p>
     */
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
