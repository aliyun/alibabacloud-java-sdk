// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateAgentRuntimeInput extends TeaModel {
    /**
     * <p>A unique name for the agent runtime.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-runtime</p>
     */
    @NameInMap("agentRuntimeName")
    public String agentRuntimeName;

    @NameInMap("armsConfiguration")
    public ArmsConfiguration armsConfiguration;

    /**
     * <p>The deployment type for the agent runtime. Valid values: Code and Container.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Code</p>
     */
    @NameInMap("artifactType")
    public String artifactType;

    /**
     * <p>The code configuration, including the code source and entrypoint. This parameter is required when artifactType is Code.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("codeConfiguration")
    public CodeConfiguration codeConfiguration;

    /**
     * <p>The container configuration, including the image URL and startup command. This parameter is required when artifactType is Container.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("containerConfiguration")
    public ContainerConfiguration containerConfiguration;

    /**
     * <p>The amount of CPU allocated to the agent runtime, in cores.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>The ID of the credential used to authenticate with external services.</p>
     * 
     * <strong>example:</strong>
     * <p>cred-1234567890abcdef</p>
     */
    @NameInMap("credentialId")
    @Deprecated
    public String credentialId;

    /**
     * <p>The name of the credential used to access the agent runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>my-credential</p>
     */
    @NameInMap("credentialName")
    public String credentialName;

    /**
     * <p>A description of the agent runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>AI agent runtime for customer service automation</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to disable on-demand elasticity. By default, on-demand elasticity is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disableOndemand")
    public Boolean disableOndemand;

    /**
     * <p>Specifies whether to disable session affinity. By default, session affinity is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disableSessionAffinity")
    public Boolean disableSessionAffinity;

    /**
     * <p>The disk size allocated to the agent runtime.</p>
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
     * <p>A key-value map of environment variables to set for the agent runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>ENV_VAR1=value1,ENV_VAR2=value2</p>
     */
    @NameInMap("environmentVariables")
    public java.util.Map<String, String> environmentVariables;

    /**
     * <p>The ARN of the execution role that the agent runtime uses to access cloud services.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1760720386195983:role/AgentRunExecutionRole</p>
     */
    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    /**
     * <p>The endpoint URL of an external agent service.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://external-agent.example.com/api">https://external-agent.example.com/api</a></p>
     */
    @NameInMap("externalAgentEndpointUrl")
    public String externalAgentEndpointUrl;

    /**
     * <p>The name of the request header used for session affinity when sessionAffinityType is HEADER_FIELD.</p>
     * 
     * <strong>example:</strong>
     * <p>x-agentrun-session-id</p>
     */
    @NameInMap("headerFieldName")
    public String headerFieldName;

    /**
     * <p>The health check configuration for the agent runtime, used to monitor the health of its instances.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("healthCheckConfiguration")
    public HealthCheckConfiguration healthCheckConfiguration;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("memory")
    public Integer memory;

    /**
     * <p>The configuration for mounting a NAS file system to the agent runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    /**
     * <p>The network configuration for the agent runtime, including VPC and security group settings.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    /**
     * <p>The configuration for mounting an OSS bucket to the agent runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ossMountConfig")
    public OSSMountConfig ossMountConfig;

    /**
     * <p>The port on which the agent runtime listens for external requests.</p>
     * <p>This parameter is required.</p>
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
     * <p>The ID of the resource group for the agent runtime.</p>
     */
    @NameInMap("resourceGroupId")
    @Deprecated
    public String resourceGroupId;

    /**
     * <p>The session affinity mode. NONE disables session affinity. HEADER_FIELD enables session affinity based on a request header. GENERATED_COOKIE uses a service-generated cookie to maintain session affinity. COOKIE is a compatibility alias that the server normalizes to GENERATED_COOKIE.</p>
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
     * <p>The time in seconds that a session can remain idle before it expires and is terminated.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("sessionIdleTimeoutSeconds")
    public Integer sessionIdleTimeoutSeconds;

    /**
     * <p>The system tags for the agent runtime, used for system-level resource classification and management.</p>
     * 
     * <strong>example:</strong>
     * <p>system-tag-1,system-tag-2</p>
     */
    @NameInMap("systemTags")
    public java.util.List<String> systemTags;

    /**
     * <p>The ID of the workspace for the agent runtime, used for resource isolation and access control.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-1234567890abcdef</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static CreateAgentRuntimeInput build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentRuntimeInput self = new CreateAgentRuntimeInput();
        return TeaModel.build(map, self);
    }

    public CreateAgentRuntimeInput setAgentRuntimeName(String agentRuntimeName) {
        this.agentRuntimeName = agentRuntimeName;
        return this;
    }
    public String getAgentRuntimeName() {
        return this.agentRuntimeName;
    }

    public CreateAgentRuntimeInput setArmsConfiguration(ArmsConfiguration armsConfiguration) {
        this.armsConfiguration = armsConfiguration;
        return this;
    }
    public ArmsConfiguration getArmsConfiguration() {
        return this.armsConfiguration;
    }

    public CreateAgentRuntimeInput setArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }
    public String getArtifactType() {
        return this.artifactType;
    }

    public CreateAgentRuntimeInput setCodeConfiguration(CodeConfiguration codeConfiguration) {
        this.codeConfiguration = codeConfiguration;
        return this;
    }
    public CodeConfiguration getCodeConfiguration() {
        return this.codeConfiguration;
    }

    public CreateAgentRuntimeInput setContainerConfiguration(ContainerConfiguration containerConfiguration) {
        this.containerConfiguration = containerConfiguration;
        return this;
    }
    public ContainerConfiguration getContainerConfiguration() {
        return this.containerConfiguration;
    }

    public CreateAgentRuntimeInput setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    @Deprecated
    public CreateAgentRuntimeInput setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public CreateAgentRuntimeInput setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public CreateAgentRuntimeInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAgentRuntimeInput setDisableOndemand(Boolean disableOndemand) {
        this.disableOndemand = disableOndemand;
        return this;
    }
    public Boolean getDisableOndemand() {
        return this.disableOndemand;
    }

    public CreateAgentRuntimeInput setDisableSessionAffinity(Boolean disableSessionAffinity) {
        this.disableSessionAffinity = disableSessionAffinity;
        return this;
    }
    public Boolean getDisableSessionAffinity() {
        return this.disableSessionAffinity;
    }

    public CreateAgentRuntimeInput setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public CreateAgentRuntimeInput setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public CreateAgentRuntimeInput setEnableSessionIsolation(Boolean enableSessionIsolation) {
        this.enableSessionIsolation = enableSessionIsolation;
        return this;
    }
    public Boolean getEnableSessionIsolation() {
        return this.enableSessionIsolation;
    }

    public CreateAgentRuntimeInput setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public CreateAgentRuntimeInput setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public CreateAgentRuntimeInput setExternalAgentEndpointUrl(String externalAgentEndpointUrl) {
        this.externalAgentEndpointUrl = externalAgentEndpointUrl;
        return this;
    }
    public String getExternalAgentEndpointUrl() {
        return this.externalAgentEndpointUrl;
    }

    public CreateAgentRuntimeInput setHeaderFieldName(String headerFieldName) {
        this.headerFieldName = headerFieldName;
        return this;
    }
    public String getHeaderFieldName() {
        return this.headerFieldName;
    }

    public CreateAgentRuntimeInput setHealthCheckConfiguration(HealthCheckConfiguration healthCheckConfiguration) {
        this.healthCheckConfiguration = healthCheckConfiguration;
        return this;
    }
    public HealthCheckConfiguration getHealthCheckConfiguration() {
        return this.healthCheckConfiguration;
    }

    public CreateAgentRuntimeInput setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    public CreateAgentRuntimeInput setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public CreateAgentRuntimeInput setNasConfig(NASConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    public CreateAgentRuntimeInput setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public CreateAgentRuntimeInput setOssMountConfig(OSSMountConfig ossMountConfig) {
        this.ossMountConfig = ossMountConfig;
        return this;
    }
    public OSSMountConfig getOssMountConfig() {
        return this.ossMountConfig;
    }

    public CreateAgentRuntimeInput setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public CreateAgentRuntimeInput setProtocolConfiguration(ProtocolConfiguration protocolConfiguration) {
        this.protocolConfiguration = protocolConfiguration;
        return this;
    }
    public ProtocolConfiguration getProtocolConfiguration() {
        return this.protocolConfiguration;
    }

    @Deprecated
    public CreateAgentRuntimeInput setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateAgentRuntimeInput setSessionAffinityType(String sessionAffinityType) {
        this.sessionAffinityType = sessionAffinityType;
        return this;
    }
    public String getSessionAffinityType() {
        return this.sessionAffinityType;
    }

    public CreateAgentRuntimeInput setSessionConcurrencyLimitPerInstance(Integer sessionConcurrencyLimitPerInstance) {
        this.sessionConcurrencyLimitPerInstance = sessionConcurrencyLimitPerInstance;
        return this;
    }
    public Integer getSessionConcurrencyLimitPerInstance() {
        return this.sessionConcurrencyLimitPerInstance;
    }

    public CreateAgentRuntimeInput setSessionIdleTimeoutSeconds(Integer sessionIdleTimeoutSeconds) {
        this.sessionIdleTimeoutSeconds = sessionIdleTimeoutSeconds;
        return this;
    }
    public Integer getSessionIdleTimeoutSeconds() {
        return this.sessionIdleTimeoutSeconds;
    }

    public CreateAgentRuntimeInput setSystemTags(java.util.List<String> systemTags) {
        this.systemTags = systemTags;
        return this;
    }
    public java.util.List<String> getSystemTags() {
        return this.systemTags;
    }

    public CreateAgentRuntimeInput setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
