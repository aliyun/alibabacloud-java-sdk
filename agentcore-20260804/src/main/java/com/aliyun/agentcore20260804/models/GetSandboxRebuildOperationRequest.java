// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetSandboxRebuildOperationRequest extends TeaModel {
    /**
     * <p>The service registration endpoint ID. This parameter is optional. If specified, the operation targets the runtime instance corresponding to the endpoint under the agent. If omitted, the default latest runtime identity is used. Pass the endpoint ID instead of the endpoint name. Keep this parameter consistent when querying instances, committing rebuilds, and querying tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>se-7f3a92c1</p>
     */
    @NameInMap("serviceEndpointId")
    public String serviceEndpointId;

    public static GetSandboxRebuildOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSandboxRebuildOperationRequest self = new GetSandboxRebuildOperationRequest();
        return TeaModel.build(map, self);
    }

    public GetSandboxRebuildOperationRequest setServiceEndpointId(String serviceEndpointId) {
        this.serviceEndpointId = serviceEndpointId;
        return this;
    }
    public String getServiceEndpointId() {
        return this.serviceEndpointId;
    }

}
