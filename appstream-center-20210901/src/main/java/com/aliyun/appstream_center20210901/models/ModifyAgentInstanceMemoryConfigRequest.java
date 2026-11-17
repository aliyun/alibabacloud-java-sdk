// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyAgentInstanceMemoryConfigRequest extends TeaModel {
    /**
     * <p>The list of agent instance IDs. You can specify 1 to 100 IDs, and the IDs must be unique. Each instance must belong to the current account, support memory management, and have the memory feature configured.</p>
     */
    @NameInMap("AgentInstanceIds")
    public java.util.List<String> agentInstanceIds;

    /**
     * <p>Required. Specifies whether to enable the memory feature. Valid values:</p>
     * <ul>
     * <li>true: Enables the memory feature.</li>
     * <li>false: Disables the memory feature.
     * Before you enable the feature, ensure that the tenant-level memory store is enabled.</li>
     * </ul>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    public static ModifyAgentInstanceMemoryConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAgentInstanceMemoryConfigRequest self = new ModifyAgentInstanceMemoryConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAgentInstanceMemoryConfigRequest setAgentInstanceIds(java.util.List<String> agentInstanceIds) {
        this.agentInstanceIds = agentInstanceIds;
        return this;
    }
    public java.util.List<String> getAgentInstanceIds() {
        return this.agentInstanceIds;
    }

    public ModifyAgentInstanceMemoryConfigRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
