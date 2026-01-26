// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateAgentRuntimeInput extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-agent-runtime</p>
     */
    @NameInMap("agentRuntimeName")
    public String agentRuntimeName;

    /**
     * <strong>example:</strong>
     * <p>Code</p>
     */
    @NameInMap("artifactType")
    public String artifactType;

    /**
     * <p>当artifactType为Code时的代码配置信息，包括代码源、入口文件等</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("codeConfiguration")
    public CodeConfiguration codeConfiguration;

    /**
     * <p>当artifactType为Container时的容器配置信息，包括镜像地址、启动命令等</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("containerConfiguration")
    public ContainerConfiguration containerConfiguration;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>用于访问智能体的凭证名称，访问智能体运行时将使用此凭证进行身份验证</p>
     * 
     * <strong>example:</strong>
     * <p>my-credential</p>
     */
    @NameInMap("credentialName")
    public String credentialName;

    /**
     * <strong>example:</strong>
     * <p>更新后的智能体运行时描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>智能体运行时的环境变量配置，用于在运行时传递配置参数</p>
     * 
     * <strong>example:</strong>
     * <p>ENV_VAR1=value1,ENV_VAR2=value2</p>
     */
    @NameInMap("environmentVariables")
    public java.util.Map<String, String> environmentVariables;

    /**
     * <p>为智能体运行时提供访问云服务权限的执行角色ARN</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1760720386195983:role/AgentRunExecutionRole</p>
     */
    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    /**
     * <p>外部注册类型的智能体访问端点地址，用于连接已部署在外部的智能体服务</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://external-agent.example.com/api">https://external-agent.example.com/api</a></p>
     */
    @NameInMap("externalAgentEndpointUrl")
    public String externalAgentEndpointUrl;

    /**
     * <p>智能体运行时的健康检查配置，用于监控运行时实例的健康状态</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("healthCheckConfiguration")
    public HealthCheckConfiguration healthCheckConfiguration;

    /**
     * <p>SLS（简单日志服务）配置</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("logConfiguration")
    public LogConfiguration logConfiguration;

    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("memory")
    public Integer memory;

    /**
     * <p>文件存储NAS的配置信息，用于挂载NAS文件系统到智能体运行时</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    /**
     * <p>智能体运行时的网络配置，包括VPC、安全组等网络访问设置</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    /**
     * <p>对象存储OSS的挂载配置信息，用于挂载OSS存储桶到智能体运行时</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ossMountConfig")
    public OSSMountConfig ossMountConfig;

    /**
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("port")
    public Integer port;

    /**
     * <p>智能体运行时的通信协议配置，定义运行时如何与外部系统交互</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("protocolConfiguration")
    public ProtocolConfiguration protocolConfiguration;

    /**
     * <p>每个运行时实例允许的最大并发会话数</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("sessionConcurrencyLimitPerInstance")
    public Integer sessionConcurrencyLimitPerInstance;

    /**
     * <p>会话的空闲超时时间，单位为秒。实例没有会话请求后处于空闲状态，空闲态为闲置计费模式，超过此超时时间后会话自动过期，不可继续使用</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("sessionIdleTimeoutSeconds")
    public Integer sessionIdleTimeoutSeconds;

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

}
