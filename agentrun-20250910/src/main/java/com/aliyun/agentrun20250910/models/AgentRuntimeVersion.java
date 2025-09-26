// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class AgentRuntimeVersion extends TeaModel {
    /**
     * <p>智能体运行时的ARN</p>
     */
    @NameInMap("agentRuntimeArn")
    public String agentRuntimeArn;

    /**
     * <p>智能体运行时的ID</p>
     */
    @NameInMap("agentRuntimeId")
    public String agentRuntimeId;

    /**
     * <p>智能体运行时的名称</p>
     */
    @NameInMap("agentRuntimeName")
    public String agentRuntimeName;

    /**
     * <p>已发布版本的版本号</p>
     */
    @NameInMap("agentRuntimeVersion")
    public String agentRuntimeVersion;

    /**
     * <p>此版本的描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>最后更新的时间戳</p>
     */
    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    public static AgentRuntimeVersion build(java.util.Map<String, ?> map) throws Exception {
        AgentRuntimeVersion self = new AgentRuntimeVersion();
        return TeaModel.build(map, self);
    }

    public AgentRuntimeVersion setAgentRuntimeArn(String agentRuntimeArn) {
        this.agentRuntimeArn = agentRuntimeArn;
        return this;
    }
    public String getAgentRuntimeArn() {
        return this.agentRuntimeArn;
    }

    public AgentRuntimeVersion setAgentRuntimeId(String agentRuntimeId) {
        this.agentRuntimeId = agentRuntimeId;
        return this;
    }
    public String getAgentRuntimeId() {
        return this.agentRuntimeId;
    }

    public AgentRuntimeVersion setAgentRuntimeName(String agentRuntimeName) {
        this.agentRuntimeName = agentRuntimeName;
        return this;
    }
    public String getAgentRuntimeName() {
        return this.agentRuntimeName;
    }

    public AgentRuntimeVersion setAgentRuntimeVersion(String agentRuntimeVersion) {
        this.agentRuntimeVersion = agentRuntimeVersion;
        return this;
    }
    public String getAgentRuntimeVersion() {
        return this.agentRuntimeVersion;
    }

    public AgentRuntimeVersion setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AgentRuntimeVersion setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

}
