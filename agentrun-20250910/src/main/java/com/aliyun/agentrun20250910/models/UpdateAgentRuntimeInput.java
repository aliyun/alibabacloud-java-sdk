// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateAgentRuntimeInput extends TeaModel {
    /**
     * <p>The name of the agent runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-runtime</p>
     */
    @NameInMap("agentRuntimeName")
    public String agentRuntimeName;

    /**
     * <p>应用实时监控服务（ARMS）的配置信息</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("armsConfiguration")
    public ArmsConfiguration armsConfiguration;

    /**
     * <p>The artifact type.</p>
     * 
     * <strong>example:</strong>
     * <p>Code</p>
     */
    @NameInMap("artifactType")
    public String artifactType;

    /**
     * <p>The code configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("codeConfiguration")
    public CodeConfiguration codeConfiguration;

    /**
     * <p>The container configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("containerConfiguration")
    public ContainerConfiguration containerConfiguration;

    /**
     * <p>The number of CPU cores.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>The name of the credential that the agent runtime uses to authenticate requests.</p>
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
     * <p>更新后的智能体运行时描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to disable on-demand elasticity. Set to true to disable. Default: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disableOndemand")
    public Boolean disableOndemand;

    /**
     * <p>Specifies whether to disable session affinity. Set to true to disable. Default: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disableSessionAffinity")
    public Boolean disableSessionAffinity;

    /**
     * <p>The disk size in gigabytes (GB).</p>
     */
    @NameInMap("diskSize")
    public Integer diskSize;

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
     * <p>Environment variables for the agent runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>ENV_VAR1=value1,ENV_VAR2=value2</p>
     */
    @NameInMap("environmentVariables")
    public java.util.Map<String, String> environmentVariables;

    /**
     * <p>The execution role ARN that grants the agent runtime permissions to access cloud services.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1760720386195983:role/AgentRunExecutionRole</p>
     */
    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    /**
     * <p>The endpoint URL for an externally registered agent. The platform uses this URL to connect to an agent service deployed outside the platform.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://external-agent.example.com/api">https://external-agent.example.com/api</a></p>
     */
    @NameInMap("externalAgentEndpointUrl")
    public String externalAgentEndpointUrl;

    /**
     * <p>Specifies whether to perform a best-effort eviction of active Function Compute (FC) sessions when the configuration is updated. This helps the new settings take effect faster.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("forceEvictInstances")
    public Boolean forceEvictInstances;

    /**
     * <p>The name of the request header used for session affinity when sessionAffinityType is set to &quot;HEADER_FIELD&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>x-agentrun-session-id</p>
     */
    @NameInMap("headerFieldName")
    public String headerFieldName;

    /**
     * <p>The health check configuration for monitoring the health of agent runtime instances.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("healthCheckConfiguration")
    public HealthCheckConfiguration healthCheckConfiguration;

    /**
     * <p>The configuration for Simple Log Service (SLS).</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("logConfiguration")
    public LogConfiguration logConfiguration;

    /**
     * <p>The amount of memory in megabytes (MB).</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("memory")
    public Integer memory;

    /**
     * <p>Configuration for mounting a NAS file system to the agent runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    /**
     * <p>The network configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    /**
     * <p>Configuration for mounting an OSS bucket to the agent runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ossMountConfig")
    public OSSMountConfig ossMountConfig;

    /**
     * <p>The port on which the agent service listens.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("port")
    public Integer port;

    /**
     * <p>The protocol configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("protocolConfiguration")
    public ProtocolConfiguration protocolConfiguration;

    /**
     * <p>The session affinity mode. Valid values: NONE (disables session affinity), HEADER_FIELD (routes requests based on a request header), and GENERATED_COOKIE (routes requests using a cookie generated by Function Compute (FC)). The value COOKIE is an alias for GENERATED_COOKIE.</p>
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
     * <p>The idle timeout for a session, in seconds. If an instance remains idle longer than this timeout after receiving no requests, the session expires.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("sessionIdleTimeoutSeconds")
    public Integer sessionIdleTimeoutSeconds;

    /**
     * <p>The system tags for the agent runtime, used for resource classification and management.</p>
     * 
     * <strong>example:</strong>
     * <p>system-tag-1,system-tag-2</p>
     */
    @NameInMap("systemTags")
    public java.util.List<String> systemTags;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static UpdateAgentRuntimeInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentRuntimeInput self = new UpdateAgentRuntimeInput();
        return TeaModel.build(map, self);
    }

    public UpdateAgentRuntimeInput setAgentRuntimeName(String agentRuntimeName) {
        this.agentRuntimeName = agentRuntimeName;
        return this;
    }
    public String getAgentRuntimeName() {
        return this.agentRuntimeName;
    }

    public UpdateAgentRuntimeInput setArmsConfiguration(ArmsConfiguration armsConfiguration) {
        this.armsConfiguration = armsConfiguration;
        return this;
    }
    public ArmsConfiguration getArmsConfiguration() {
        return this.armsConfiguration;
    }

    public UpdateAgentRuntimeInput setArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }
    public String getArtifactType() {
        return this.artifactType;
    }

    public UpdateAgentRuntimeInput setCodeConfiguration(CodeConfiguration codeConfiguration) {
        this.codeConfiguration = codeConfiguration;
        return this;
    }
    public CodeConfiguration getCodeConfiguration() {
        return this.codeConfiguration;
    }

    public UpdateAgentRuntimeInput setContainerConfiguration(ContainerConfiguration containerConfiguration) {
        this.containerConfiguration = containerConfiguration;
        return this;
    }
    public ContainerConfiguration getContainerConfiguration() {
        return this.containerConfiguration;
    }

    public UpdateAgentRuntimeInput setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public UpdateAgentRuntimeInput setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public UpdateAgentRuntimeInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAgentRuntimeInput setDisableOndemand(Boolean disableOndemand) {
        this.disableOndemand = disableOndemand;
        return this;
    }
    public Boolean getDisableOndemand() {
        return this.disableOndemand;
    }

    public UpdateAgentRuntimeInput setDisableSessionAffinity(Boolean disableSessionAffinity) {
        this.disableSessionAffinity = disableSessionAffinity;
        return this;
    }
    public Boolean getDisableSessionAffinity() {
        return this.disableSessionAffinity;
    }

    public UpdateAgentRuntimeInput setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public UpdateAgentRuntimeInput setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public UpdateAgentRuntimeInput setEnableSessionIsolation(Boolean enableSessionIsolation) {
        this.enableSessionIsolation = enableSessionIsolation;
        return this;
    }
    public Boolean getEnableSessionIsolation() {
        return this.enableSessionIsolation;
    }

    public UpdateAgentRuntimeInput setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public UpdateAgentRuntimeInput setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public UpdateAgentRuntimeInput setExternalAgentEndpointUrl(String externalAgentEndpointUrl) {
        this.externalAgentEndpointUrl = externalAgentEndpointUrl;
        return this;
    }
    public String getExternalAgentEndpointUrl() {
        return this.externalAgentEndpointUrl;
    }

    public UpdateAgentRuntimeInput setForceEvictInstances(Boolean forceEvictInstances) {
        this.forceEvictInstances = forceEvictInstances;
        return this;
    }
    public Boolean getForceEvictInstances() {
        return this.forceEvictInstances;
    }

    public UpdateAgentRuntimeInput setHeaderFieldName(String headerFieldName) {
        this.headerFieldName = headerFieldName;
        return this;
    }
    public String getHeaderFieldName() {
        return this.headerFieldName;
    }

    public UpdateAgentRuntimeInput setHealthCheckConfiguration(HealthCheckConfiguration healthCheckConfiguration) {
        this.healthCheckConfiguration = healthCheckConfiguration;
        return this;
    }
    public HealthCheckConfiguration getHealthCheckConfiguration() {
        return this.healthCheckConfiguration;
    }

    public UpdateAgentRuntimeInput setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    public UpdateAgentRuntimeInput setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public UpdateAgentRuntimeInput setNasConfig(NASConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    public UpdateAgentRuntimeInput setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public UpdateAgentRuntimeInput setOssMountConfig(OSSMountConfig ossMountConfig) {
        this.ossMountConfig = ossMountConfig;
        return this;
    }
    public OSSMountConfig getOssMountConfig() {
        return this.ossMountConfig;
    }

    public UpdateAgentRuntimeInput setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public UpdateAgentRuntimeInput setProtocolConfiguration(ProtocolConfiguration protocolConfiguration) {
        this.protocolConfiguration = protocolConfiguration;
        return this;
    }
    public ProtocolConfiguration getProtocolConfiguration() {
        return this.protocolConfiguration;
    }

    public UpdateAgentRuntimeInput setSessionAffinityType(String sessionAffinityType) {
        this.sessionAffinityType = sessionAffinityType;
        return this;
    }
    public String getSessionAffinityType() {
        return this.sessionAffinityType;
    }

    public UpdateAgentRuntimeInput setSessionConcurrencyLimitPerInstance(Integer sessionConcurrencyLimitPerInstance) {
        this.sessionConcurrencyLimitPerInstance = sessionConcurrencyLimitPerInstance;
        return this;
    }
    public Integer getSessionConcurrencyLimitPerInstance() {
        return this.sessionConcurrencyLimitPerInstance;
    }

    public UpdateAgentRuntimeInput setSessionIdleTimeoutSeconds(Integer sessionIdleTimeoutSeconds) {
        this.sessionIdleTimeoutSeconds = sessionIdleTimeoutSeconds;
        return this;
    }
    public Integer getSessionIdleTimeoutSeconds() {
        return this.sessionIdleTimeoutSeconds;
    }

    public UpdateAgentRuntimeInput setSystemTags(java.util.List<String> systemTags) {
        this.systemTags = systemTags;
        return this;
    }
    public java.util.List<String> getSystemTags() {
        return this.systemTags;
    }

    public UpdateAgentRuntimeInput setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
