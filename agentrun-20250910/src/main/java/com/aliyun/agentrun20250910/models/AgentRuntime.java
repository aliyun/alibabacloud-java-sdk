// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class AgentRuntime extends TeaModel {
    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the agent runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:agentrun:cn-hangzhou:1760720386195983:runtimes/7a1b6d39-9f8f-4ce2-b9c9-6db1b0b9e169</p>
     */
    @NameInMap("agentRuntimeArn")
    public String agentRuntimeArn;

    /**
     * <p>The unique identifier of the agent runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>ar-1234567890abcdef</p>
     */
    @NameInMap("agentRuntimeId")
    public String agentRuntimeId;

    /**
     * <p>The name of the agent runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-runtime</p>
     */
    @NameInMap("agentRuntimeName")
    public String agentRuntimeName;

    /**
     * <p>The version number of the agent runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("agentRuntimeVersion")
    public String agentRuntimeVersion;

    /**
     * <p>The deployment type of the agent runtime. Valid values: <code>Code</code> and <code>Container</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Code</p>
     */
    @NameInMap("artifactType")
    public String artifactType;

    /**
     * <p>The code configuration details. This parameter is applicable when <code>artifactType</code> is set to <code>Code</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("codeConfiguration")
    public CodeConfiguration codeConfiguration;

    /**
     * <p>The container configuration details. This parameter is applicable when <code>artifactType</code> is set to <code>Container</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("containerConfiguration")
    public ContainerConfiguration containerConfiguration;

    /**
     * <p>The amount of CPU allocated to the agent runtime, in vCPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>The creation time of the agent runtime, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T10:30:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>The name of the credential used to authenticate requests to the agent runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>my-credential</p>
     */
    @NameInMap("credentialName")
    public String credentialName;

    /**
     * <p>The description of the agent runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>AI agent runtime for customer service automation</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to disable on-demand elasticity. Default: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disableOndemand")
    public Boolean disableOndemand;

    /**
     * <p>Specifies whether to disable session affinity. Default: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disableSessionAffinity")
    public Boolean disableSessionAffinity;

    /**
     * <p>The disk size.</p>
     */
    @NameInMap("diskSize")
    public Integer diskSize;

    /**
     * <p>The edition of the agent runtime.</p>
     */
    @NameInMap("edition")
    public String edition;

    /**
     * <p>Specifies whether to enable session isolation. If enabled, each session runs in an isolated environment.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableSessionIsolation")
    public Boolean enableSessionIsolation;

    /**
     * <p>The environment variables for the agent runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>ENV_VAR1=value1,ENV_VAR2=value2</p>
     */
    @NameInMap("environmentVariables")
    public java.util.Map<String, String> environmentVariables;

    /**
     * <p>The ARN of the execution role that grants the agent runtime permission to access cloud services.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1760720386195983:role/AgentRunExecutionRole</p>
     */
    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    /**
     * <p>The endpoint URL of an externally deployed agent service.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://external-agent.example.com/api">https://external-agent.example.com/api</a></p>
     */
    @NameInMap("externalAgentEndpointUrl")
    public String externalAgentEndpointUrl;

    /**
     * <p>The name of the request header used for session affinity when <code>sessionAffinityType</code> is <code>HEADER_FIELD</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>x-agentrun-session-id</p>
     */
    @NameInMap("headerFieldName")
    public String headerFieldName;

    /**
     * <p>The health check configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("healthCheckConfiguration")
    public HealthCheckConfiguration healthCheckConfiguration;

    /**
     * <p>The last update time of the agent runtime, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T11:45:00Z</p>
     */
    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    /**
     * <p>The Log Service configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("logConfiguration")
    public LogConfiguration logConfiguration;

    /**
     * <p>The amount of memory allocated to the agent runtime, in MB.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("memory")
    public Integer memory;

    /**
     * <p>The NAS file system configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    /**
     * <p>The network configuration of the agent runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    /**
     * <p>The OSS bucket mount configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ossMountConfig")
    public OSSMountConfig ossMountConfig;

    /**
     * <p>The port on which the agent runtime listens.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("port")
    public Integer port;

    /**
     * <p>The communication protocol configuration for the agent runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("protocolConfiguration")
    public ProtocolConfiguration protocolConfiguration;

    /**
     * <p>The ID of the resource group to which the agent runtime belongs.</p>
     */
    @NameInMap("resourceGroupId")
    @Deprecated
    public String resourceGroupId;

    /**
     * <p>The session affinity mode. Valid values: <code>NONE</code>, <code>HEADER_FIELD</code>, and <code>GENERATED_COOKIE</code>. <code>COOKIE</code> is a compatibility alias for <code>GENERATED_COOKIE</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>GENERATED_COOKIE</p>
     */
    @NameInMap("sessionAffinityType")
    public String sessionAffinityType;

    /**
     * <p>The maximum number of concurrent sessions allowed per runtime instance.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("sessionConcurrencyLimitPerInstance")
    public Integer sessionConcurrencyLimitPerInstance;

    /**
     * <p>The idle timeout period for a session, in seconds. After this period of inactivity, the session expires and can no longer be used.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("sessionIdleTimeoutSeconds")
    public Integer sessionIdleTimeoutSeconds;

    /**
     * <p>The current status of the agent runtime. Possible values: <code>READY</code>, <code>CREATING</code>, and <code>FAILED</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The reason for the current status.</p>
     * 
     * <strong>example:</strong>
     * <p>Runtime is ready for use</p>
     */
    @NameInMap("statusReason")
    public String statusReason;

    /**
     * <p>The system tags for the agent runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>system-tag-1,system-tag-2</p>
     */
    @NameInMap("systemTags")
    public java.util.List<String> systemTags;

    /**
     * <p>The ID of the workspace for the agent runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-1234567890abcdef</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static AgentRuntime build(java.util.Map<String, ?> map) throws Exception {
        AgentRuntime self = new AgentRuntime();
        return TeaModel.build(map, self);
    }

    public AgentRuntime setAgentRuntimeArn(String agentRuntimeArn) {
        this.agentRuntimeArn = agentRuntimeArn;
        return this;
    }
    public String getAgentRuntimeArn() {
        return this.agentRuntimeArn;
    }

    public AgentRuntime setAgentRuntimeId(String agentRuntimeId) {
        this.agentRuntimeId = agentRuntimeId;
        return this;
    }
    public String getAgentRuntimeId() {
        return this.agentRuntimeId;
    }

    public AgentRuntime setAgentRuntimeName(String agentRuntimeName) {
        this.agentRuntimeName = agentRuntimeName;
        return this;
    }
    public String getAgentRuntimeName() {
        return this.agentRuntimeName;
    }

    public AgentRuntime setAgentRuntimeVersion(String agentRuntimeVersion) {
        this.agentRuntimeVersion = agentRuntimeVersion;
        return this;
    }
    public String getAgentRuntimeVersion() {
        return this.agentRuntimeVersion;
    }

    public AgentRuntime setArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }
    public String getArtifactType() {
        return this.artifactType;
    }

    public AgentRuntime setCodeConfiguration(CodeConfiguration codeConfiguration) {
        this.codeConfiguration = codeConfiguration;
        return this;
    }
    public CodeConfiguration getCodeConfiguration() {
        return this.codeConfiguration;
    }

    public AgentRuntime setContainerConfiguration(ContainerConfiguration containerConfiguration) {
        this.containerConfiguration = containerConfiguration;
        return this;
    }
    public ContainerConfiguration getContainerConfiguration() {
        return this.containerConfiguration;
    }

    public AgentRuntime setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public AgentRuntime setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public AgentRuntime setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public AgentRuntime setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AgentRuntime setDisableOndemand(Boolean disableOndemand) {
        this.disableOndemand = disableOndemand;
        return this;
    }
    public Boolean getDisableOndemand() {
        return this.disableOndemand;
    }

    public AgentRuntime setDisableSessionAffinity(Boolean disableSessionAffinity) {
        this.disableSessionAffinity = disableSessionAffinity;
        return this;
    }
    public Boolean getDisableSessionAffinity() {
        return this.disableSessionAffinity;
    }

    public AgentRuntime setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public AgentRuntime setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public AgentRuntime setEnableSessionIsolation(Boolean enableSessionIsolation) {
        this.enableSessionIsolation = enableSessionIsolation;
        return this;
    }
    public Boolean getEnableSessionIsolation() {
        return this.enableSessionIsolation;
    }

    public AgentRuntime setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public AgentRuntime setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public AgentRuntime setExternalAgentEndpointUrl(String externalAgentEndpointUrl) {
        this.externalAgentEndpointUrl = externalAgentEndpointUrl;
        return this;
    }
    public String getExternalAgentEndpointUrl() {
        return this.externalAgentEndpointUrl;
    }

    public AgentRuntime setHeaderFieldName(String headerFieldName) {
        this.headerFieldName = headerFieldName;
        return this;
    }
    public String getHeaderFieldName() {
        return this.headerFieldName;
    }

    public AgentRuntime setHealthCheckConfiguration(HealthCheckConfiguration healthCheckConfiguration) {
        this.healthCheckConfiguration = healthCheckConfiguration;
        return this;
    }
    public HealthCheckConfiguration getHealthCheckConfiguration() {
        return this.healthCheckConfiguration;
    }

    public AgentRuntime setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public AgentRuntime setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    public AgentRuntime setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public AgentRuntime setNasConfig(NASConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    public AgentRuntime setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public AgentRuntime setOssMountConfig(OSSMountConfig ossMountConfig) {
        this.ossMountConfig = ossMountConfig;
        return this;
    }
    public OSSMountConfig getOssMountConfig() {
        return this.ossMountConfig;
    }

    public AgentRuntime setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public AgentRuntime setProtocolConfiguration(ProtocolConfiguration protocolConfiguration) {
        this.protocolConfiguration = protocolConfiguration;
        return this;
    }
    public ProtocolConfiguration getProtocolConfiguration() {
        return this.protocolConfiguration;
    }

    @Deprecated
    public AgentRuntime setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AgentRuntime setSessionAffinityType(String sessionAffinityType) {
        this.sessionAffinityType = sessionAffinityType;
        return this;
    }
    public String getSessionAffinityType() {
        return this.sessionAffinityType;
    }

    public AgentRuntime setSessionConcurrencyLimitPerInstance(Integer sessionConcurrencyLimitPerInstance) {
        this.sessionConcurrencyLimitPerInstance = sessionConcurrencyLimitPerInstance;
        return this;
    }
    public Integer getSessionConcurrencyLimitPerInstance() {
        return this.sessionConcurrencyLimitPerInstance;
    }

    public AgentRuntime setSessionIdleTimeoutSeconds(Integer sessionIdleTimeoutSeconds) {
        this.sessionIdleTimeoutSeconds = sessionIdleTimeoutSeconds;
        return this;
    }
    public Integer getSessionIdleTimeoutSeconds() {
        return this.sessionIdleTimeoutSeconds;
    }

    public AgentRuntime setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AgentRuntime setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public AgentRuntime setSystemTags(java.util.List<String> systemTags) {
        this.systemTags = systemTags;
        return this;
    }
    public java.util.List<String> getSystemTags() {
        return this.systemTags;
    }

    public AgentRuntime setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
