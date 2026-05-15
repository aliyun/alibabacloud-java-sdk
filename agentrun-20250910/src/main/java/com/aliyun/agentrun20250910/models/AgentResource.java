// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class AgentResource extends TeaModel {
    /**
     * <p>当 resourceType 为 Flow 时，此字段包含完整的工作流对象，包括所有配置和状态信息；当 resourceType 为 AgentRuntime 时，此字段为空</p>
     */
    @NameInMap("flow")
    public Flow flow;

    /**
     * <p>资源的最新发布版本摘要，包含版本号、描述和创建时间。如果资源没有已发布版本，则此字段为空</p>
     */
    @NameInMap("latestVersion")
    public AgentResourceLatestVersion latestVersion;

    /**
     * <p>资源类型标识符，用于区分资源是智能体运行时（AgentRuntime）还是工作流（Flow）</p>
     * 
     * <strong>example:</strong>
     * <p>AgentRuntime</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>当 resourceType 为 AgentRuntime 时，此字段包含完整的智能体运行时对象，包括所有配置和状态信息；当 resourceType 为 Flow 时，此字段为空</p>
     */
    @NameInMap("runtime")
    public AgentRuntime runtime;

    public static AgentResource build(java.util.Map<String, ?> map) throws Exception {
        AgentResource self = new AgentResource();
        return TeaModel.build(map, self);
    }

    public AgentResource setFlow(Flow flow) {
        this.flow = flow;
        return this;
    }
    public Flow getFlow() {
        return this.flow;
    }

    public AgentResource setLatestVersion(AgentResourceLatestVersion latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public AgentResourceLatestVersion getLatestVersion() {
        return this.latestVersion;
    }

    public AgentResource setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public AgentResource setRuntime(AgentRuntime runtime) {
        this.runtime = runtime;
        return this;
    }
    public AgentRuntime getRuntime() {
        return this.runtime;
    }

    public static class AgentResourceLatestVersion extends TeaModel {
        /**
         * <p>版本发布时间，采用ISO 8601格式</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-15T08:30:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>该版本的描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>修复了消息处理的并发问题</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>版本发布者（仅 AgentRuntime 类型资源返回）</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("publisher")
        public String publisher;

        /**
         * <p>最新发布的版本号</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("version")
        public String version;

        public static AgentResourceLatestVersion build(java.util.Map<String, ?> map) throws Exception {
            AgentResourceLatestVersion self = new AgentResourceLatestVersion();
            return TeaModel.build(map, self);
        }

        public AgentResourceLatestVersion setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public AgentResourceLatestVersion setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AgentResourceLatestVersion setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }
        public String getPublisher() {
            return this.publisher;
        }

        public AgentResourceLatestVersion setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
