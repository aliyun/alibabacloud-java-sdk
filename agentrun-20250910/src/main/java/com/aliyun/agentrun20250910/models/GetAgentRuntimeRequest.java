// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetAgentRuntimeRequest extends TeaModel {
    /**
     * <p>Agent Runtime Version</p>
     * 
     * <strong>example:</strong>
     * <p>v1.0.0</p>
     */
    @NameInMap("agentRuntimeVersion")
    public String agentRuntimeVersion;

    public static GetAgentRuntimeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentRuntimeRequest self = new GetAgentRuntimeRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentRuntimeRequest setAgentRuntimeVersion(String agentRuntimeVersion) {
        this.agentRuntimeVersion = agentRuntimeVersion;
        return this;
    }
    public String getAgentRuntimeVersion() {
        return this.agentRuntimeVersion;
    }

}
