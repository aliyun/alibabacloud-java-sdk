// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class RebuildSandboxRequest extends TeaModel {
    /**
     * <p>The service registration endpoint ID. This parameter is optional. If specified, the operation targets the runtime instance corresponding to the endpoint under the agent. If omitted, the default latest runtime identity is used. Pass the endpoint ID, not the endpoint name. Keep this parameter consistent when querying instances, committing rebuilds, and querying nodes.</p>
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
