// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class AgentRuntimeVersion extends TeaModel {
    /**
     * <p>智能体运行时的ARN</p>
     * 
     * <strong>example:</strong>
     * <p>acs:agentrun:cn-hangzhou:1760720386195983:runtimes/7a1b6d39-9f8f-4ce2-b9c9-6db1b0b9e169</p>
     */
    @NameInMap("agentRuntimeArn")
    public String agentRuntimeArn;

    /**
     * <p>智能体运行时的ID</p>
     * 
     * <strong>example:</strong>
     * <p>ar-1234567890abcdef</p>
     */
    @NameInMap("agentRuntimeId")
    public String agentRuntimeId;

    /**
     * <p>智能体运行时的名称</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-runtime</p>
     */
    @NameInMap("agentRuntimeName")
    public String agentRuntimeName;

    /**
     * <p>已发布版本的版本号</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("agentRuntimeVersion")
    public String agentRuntimeVersion;

    /**
     * <p>此版本的描述</p>
     * 
     * <strong>example:</strong>
     * <p>Initial release with basic functionality</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>最后更新的时间戳</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T10:30:00Z</p>
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
