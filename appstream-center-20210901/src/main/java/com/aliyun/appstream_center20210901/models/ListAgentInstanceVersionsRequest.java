// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAgentInstanceVersionsRequest extends TeaModel {
    /**
     * <p>The agent platform used to filter version numbers by business type. If not specified, the default value is ENTERPRISE.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("AgentPlatform")
    public String agentPlatform;

    /**
     * <p>The name of the agent provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenClaw</p>
     */
    @NameInMap("AgentProvider")
    public String agentProvider;

    public static ListAgentInstanceVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentInstanceVersionsRequest self = new ListAgentInstanceVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentInstanceVersionsRequest setAgentPlatform(String agentPlatform) {
        this.agentPlatform = agentPlatform;
        return this;
    }
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    public ListAgentInstanceVersionsRequest setAgentProvider(String agentProvider) {
        this.agentProvider = agentProvider;
        return this;
    }
    public String getAgentProvider() {
        return this.agentProvider;
    }

}
