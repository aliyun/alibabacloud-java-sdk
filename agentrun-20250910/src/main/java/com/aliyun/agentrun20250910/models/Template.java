// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class Template extends TeaModel {
    /**
     * <p>Indicates whether the data link can invoke APIs to create, stop, or delete sandbox instances</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("allowAnonymousManage")
    public Boolean allowAnonymousManage;

    /**
     * <p>Custom image configuration</p>
     */
    @NameInMap("containerConfiguration")
    public ContainerConfiguration containerConfiguration;

    /**
     * <p>Number of CPU cores</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>Creation Time</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-15T17:12:59.375168+08:00</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>Authentication configuration</p>
     */
    @NameInMap("credentialConfiguration")
    public CredentialConfiguration credentialConfiguration;

    /**
     * <p>Description</p>
     * 
     * <strong>example:</strong>
     * <p>template描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Disk size</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("diskSize")
    public Integer diskSize;

    /**
     * <p>Sandbox Agent Toggle</p>
     */
    @NameInMap("enableAgent")
    public Boolean enableAgent;

    @NameInMap("enablePreStop")
    public Boolean enablePreStop;

    /**
     * <p>Environment variable configuration for the agent runtime</p>
     */
    @NameInMap("environmentVariables")
    public java.util.Map<String, String> environmentVariables;

    /**
     * <p>Execution role</p>
     * 
     * <strong>example:</strong>
     * <p>acs:agentrun:cn-hangzhou:12345678:templates/efb6de2f-1814-42a2-b7f3-474a0e0b3a48</p>
     */
    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    /**
     * <p>Update Time</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-15T17:12:59.375168+08:00</p>
     */
    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    /**
     * <p>Log configuration</p>
     */
    @NameInMap("logConfiguration")
    public LogConfiguration logConfiguration;

    /**
     * <p>MCP options</p>
     */
    @NameInMap("mcpOptions")
    public TemplateMcpOptions mcpOptions;

    /**
     * <p>MCP server status</p>
     */
    @NameInMap("mcpState")
    public TemplateMcpState mcpState;

    /**
     * <p>Memory specification</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4096</p>
     */
    @NameInMap("memory")
    public Integer memory;

    /**
     * <p>NAS mount configuration item</p>
     */
    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    /**
     * <p>Network configuration</p>
     */
    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    /**
     * <p>OSS configuration</p>
     */
    @NameInMap("ossConfiguration")
    public java.util.List<OssConfiguration> ossConfiguration;

    @NameInMap("preStopTimeoutInSeconds")
    public Integer preStopTimeoutInSeconds;

    /**
     * <p>Resource Name</p>
     * 
     * <strong>example:</strong>
     * <p>agentrun-f2570dd4-c8a2-452c-8bd5-4ef74b0a69b5</p>
     */
    @NameInMap("resourceName")
    public String resourceName;

    /**
     * <p>Sandbox idle timeout</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("sandboxIdleTimeoutInSeconds")
    public String sandboxIdleTimeoutInSeconds;

    /**
     * <p>Sandbox lifecycle time to live (deprecated)</p>
     * 
     * <strong>example:</strong>
     * <p>已弃用</p>
     */
    @NameInMap("sandboxTTLInSeconds")
    public String sandboxTTLInSeconds;

    /**
     * <p>Elasticity Status</p>
     */
    @NameInMap("scalingStatus")
    public ScalingStatus scalingStatus;

    /**
     * <p>Status</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>Status reason</p>
     * 
     * <strong>example:</strong>
     * <p>SDK Error</p>
     */
    @NameInMap("statusReason")
    public String statusReason;

    /**
     * <p>Template ARN</p>
     * 
     * <strong>example:</strong>
     * <p>acs:agentrun:cn-hangzhou:12345678:templates/efb6de2f-1814-42a2-b7f3-474a0e0b3a48</p>
     */
    @NameInMap("templateArn")
    public String templateArn;

    /**
     * <p>Template Configuration (flexible object structure that varies based on templateType)</p>
     */
    @NameInMap("templateConfiguration")
    public java.util.Map<String, ?> templateConfiguration;

    /**
     * <p>Template ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>996ffd5e-003f-4700-9f24-9e2a1c19019b.schema</p>
     */
    @NameInMap("templateId")
    public String templateId;

    /**
     * <p>Template Name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>browser-1767874121726</p>
     */
    @NameInMap("templateName")
    public String templateName;

    /**
     * <p>templatetype</p>
     * 
     * <strong>example:</strong>
     * <p>Browser</p>
     */
    @NameInMap("templateType")
    public String templateType;

    /**
     * <p>Template Version</p>
     * 
     * <strong>example:</strong>
     * <p>预留</p>
     */
    @NameInMap("templateVersion")
    public String templateVersion;

    /**
     * <p>Associated Space ID</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static Template build(java.util.Map<String, ?> map) throws Exception {
        Template self = new Template();
        return TeaModel.build(map, self);
    }

    public Template setAllowAnonymousManage(Boolean allowAnonymousManage) {
        this.allowAnonymousManage = allowAnonymousManage;
        return this;
    }
    public Boolean getAllowAnonymousManage() {
        return this.allowAnonymousManage;
    }

    public Template setContainerConfiguration(ContainerConfiguration containerConfiguration) {
        this.containerConfiguration = containerConfiguration;
        return this;
    }
    public ContainerConfiguration getContainerConfiguration() {
        return this.containerConfiguration;
    }

    public Template setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public Template setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public Template setCredentialConfiguration(CredentialConfiguration credentialConfiguration) {
        this.credentialConfiguration = credentialConfiguration;
        return this;
    }
    public CredentialConfiguration getCredentialConfiguration() {
        return this.credentialConfiguration;
    }

    public Template setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Template setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public Template setEnableAgent(Boolean enableAgent) {
        this.enableAgent = enableAgent;
        return this;
    }
    public Boolean getEnableAgent() {
        return this.enableAgent;
    }

    public Template setEnablePreStop(Boolean enablePreStop) {
        this.enablePreStop = enablePreStop;
        return this;
    }
    public Boolean getEnablePreStop() {
        return this.enablePreStop;
    }

    public Template setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public Template setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public Template setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public Template setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    public Template setMcpOptions(TemplateMcpOptions mcpOptions) {
        this.mcpOptions = mcpOptions;
        return this;
    }
    public TemplateMcpOptions getMcpOptions() {
        return this.mcpOptions;
    }

    public Template setMcpState(TemplateMcpState mcpState) {
        this.mcpState = mcpState;
        return this;
    }
    public TemplateMcpState getMcpState() {
        return this.mcpState;
    }

    public Template setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public Template setNasConfig(NASConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    public Template setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public Template setOssConfiguration(java.util.List<OssConfiguration> ossConfiguration) {
        this.ossConfiguration = ossConfiguration;
        return this;
    }
    public java.util.List<OssConfiguration> getOssConfiguration() {
        return this.ossConfiguration;
    }

    public Template setPreStopTimeoutInSeconds(Integer preStopTimeoutInSeconds) {
        this.preStopTimeoutInSeconds = preStopTimeoutInSeconds;
        return this;
    }
    public Integer getPreStopTimeoutInSeconds() {
        return this.preStopTimeoutInSeconds;
    }

    public Template setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public Template setSandboxIdleTimeoutInSeconds(String sandboxIdleTimeoutInSeconds) {
        this.sandboxIdleTimeoutInSeconds = sandboxIdleTimeoutInSeconds;
        return this;
    }
    public String getSandboxIdleTimeoutInSeconds() {
        return this.sandboxIdleTimeoutInSeconds;
    }

    public Template setSandboxTTLInSeconds(String sandboxTTLInSeconds) {
        this.sandboxTTLInSeconds = sandboxTTLInSeconds;
        return this;
    }
    public String getSandboxTTLInSeconds() {
        return this.sandboxTTLInSeconds;
    }

    public Template setScalingStatus(ScalingStatus scalingStatus) {
        this.scalingStatus = scalingStatus;
        return this;
    }
    public ScalingStatus getScalingStatus() {
        return this.scalingStatus;
    }

    public Template setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Template setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public Template setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
        return this;
    }
    public String getTemplateArn() {
        return this.templateArn;
    }

    public Template setTemplateConfiguration(java.util.Map<String, ?> templateConfiguration) {
        this.templateConfiguration = templateConfiguration;
        return this;
    }
    public java.util.Map<String, ?> getTemplateConfiguration() {
        return this.templateConfiguration;
    }

    public Template setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public Template setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public Template setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public Template setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public Template setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class TemplateMcpOptions extends TeaModel {
        /**
         * <p>List of enabled tools</p>
         */
        @NameInMap("enabledTools")
        public java.util.List<String> enabledTools;

        /**
         * <p>Transport type</p>
         * 
         * <strong>example:</strong>
         * <p>streamable-http</p>
         */
        @NameInMap("transport")
        public String transport;

        public static TemplateMcpOptions build(java.util.Map<String, ?> map) throws Exception {
            TemplateMcpOptions self = new TemplateMcpOptions();
            return TeaModel.build(map, self);
        }

        public TemplateMcpOptions setEnabledTools(java.util.List<String> enabledTools) {
            this.enabledTools = enabledTools;
            return this;
        }
        public java.util.List<String> getEnabledTools() {
            return this.enabledTools;
        }

        public TemplateMcpOptions setTransport(String transport) {
            this.transport = transport;
            return this;
        }
        public String getTransport() {
            return this.transport;
        }

    }

    public static class TemplateMcpState extends TeaModel {
        /**
         * <p>Access Endpoint</p>
         * 
         * <strong>example:</strong>
         * <p>/mcp</p>
         */
        @NameInMap("accessEndpoint")
        public String accessEndpoint;

        /**
         * <p>MCP Status</p>
         * 
         * <strong>example:</strong>
         * <p>CREATING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Status reason</p>
         * 
         * <strong>example:</strong>
         * <p>SDK Error</p>
         */
        @NameInMap("statusReason")
        public String statusReason;

        public static TemplateMcpState build(java.util.Map<String, ?> map) throws Exception {
            TemplateMcpState self = new TemplateMcpState();
            return TeaModel.build(map, self);
        }

        public TemplateMcpState setAccessEndpoint(String accessEndpoint) {
            this.accessEndpoint = accessEndpoint;
            return this;
        }
        public String getAccessEndpoint() {
            return this.accessEndpoint;
        }

        public TemplateMcpState setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public TemplateMcpState setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

    }

}
