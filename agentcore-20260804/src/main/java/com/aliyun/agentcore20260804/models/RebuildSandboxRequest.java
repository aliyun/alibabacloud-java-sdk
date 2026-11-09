// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class RebuildSandboxRequest extends TeaModel {
    /**
     * <p>The ID of the service registration endpoint. This parameter is optional. If you specify this parameter, the operation targets the runtime instance that corresponds to the service registration endpoint under the agent. If you omit this parameter, the default latest runtime identity is used. Pass the service registration endpoint ID instead of the service registration endpoint name. You must keep this parameter consistent when you query instances, commit rebuilds, and query nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>se-7f3a92c1</p>
     */
    @NameInMap("serviceEndpointId")
    public String serviceEndpointId;

    public static RebuildSandboxRequest build(java.util.Map<String, ?> map) throws Exception {
        RebuildSandboxRequest self = new RebuildSandboxRequest();
        return TeaModel.build(map, self);
    }

    public RebuildSandboxRequest setServiceEndpointId(String serviceEndpointId) {
        this.serviceEndpointId = serviceEndpointId;
        return this;
    }
    public String getServiceEndpointId() {
        return this.serviceEndpointId;
    }

}
