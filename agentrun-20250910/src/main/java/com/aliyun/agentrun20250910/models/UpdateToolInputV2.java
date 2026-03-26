// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateToolInputV2 extends TeaModel {
    /**
     * <p>更新工具部署的制品类型，支持：Code（代码包）、Container（容器镜像）</p>
     * 
     * <strong>example:</strong>
     * <p>Code</p>
     */
    @NameInMap("artifactType")
    public String artifactType;

    /**
     * <p>更新代码包类型工具的配置信息</p>
     */
    @NameInMap("codeConfiguration")
    public CodeConfiguration codeConfiguration;

    /**
     * <p>更新容器类型工具的配置信息</p>
     */
    @NameInMap("containerConfiguration")
    public ContainerConfiguration containerConfiguration;

    /**
     * <p>更新工具实例的 CPU 核心数，单位为核</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>更新工具的创建方式。支持：MCP_REMOTE、MCP_LOCAL_STDIO、MCP_BUNDLE、CODE_PACKAGE、OPENAPI_IMPORT</p>
     * 
     * <strong>example:</strong>
     * <p>MCP_REMOTE</p>
     */
    @NameInMap("createMethod")
    public String createMethod;

    /**
     * <p>更新工具使用的凭证名称</p>
     * 
     * <strong>example:</strong>
     * <p>my-credential</p>
     */
    @NameInMap("credentialName")
    public String credentialName;

    /**
     * <p>更新工具的描述信息</p>
     * 
     * <strong>example:</strong>
     * <p>更新后的工具描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>更新工具运行时的环境变量配置</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ENV&quot;: &quot;production&quot;}</p>
     */
    @NameInMap("environmentVariables")
    public java.util.Map<String, String> environmentVariables;

    /**
     * <p>更新工具执行时使用的 RAM 角色 ARN</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789:role/AliyunFCDefaultRole</p>
     */
    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    /**
     * <p>更新工具的日志配置</p>
     */
    @NameInMap("logConfiguration")
    public LogConfiguration logConfiguration;

    /**
     * <p>更新 MCP 工具的配置信息，包括会话亲和性、代理配置等</p>
     */
    @NameInMap("mcpConfig")
    public McpConfig mcpConfig;

    /**
     * <p>更新工具实例的内存大小，单位为 MB</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("memory")
    public Integer memory;

    /**
     * <p>更新文件存储 NAS 的配置信息</p>
     */
    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    /**
     * <p>更新工具的网络配置</p>
     */
    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    /**
     * <p>更新对象存储 OSS 的挂载配置</p>
     */
    @NameInMap("ossMountConfig")
    public OSSMountConfig ossMountConfig;

    /**
     * <p>更新工具服务监听的端口号</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("port")
    public Integer port;

    /**
     * <p>更新工具使用的协议规范定义</p>
     */
    @NameInMap("protocolSpec")
    public String protocolSpec;

    /**
     * <p>更新工具执行的超时时间，单位为秒</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    /**
     * <p>更新工具所属的工作空间标识符</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-xyz789</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static UpdateToolInputV2 build(java.util.Map<String, ?> map) throws Exception {
        UpdateToolInputV2 self = new UpdateToolInputV2();
        return TeaModel.build(map, self);
    }

    public UpdateToolInputV2 setArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }
    public String getArtifactType() {
        return this.artifactType;
    }

    public UpdateToolInputV2 setCodeConfiguration(CodeConfiguration codeConfiguration) {
        this.codeConfiguration = codeConfiguration;
        return this;
    }
    public CodeConfiguration getCodeConfiguration() {
        return this.codeConfiguration;
    }

    public UpdateToolInputV2 setContainerConfiguration(ContainerConfiguration containerConfiguration) {
        this.containerConfiguration = containerConfiguration;
        return this;
    }
    public ContainerConfiguration getContainerConfiguration() {
        return this.containerConfiguration;
    }

    public UpdateToolInputV2 setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public UpdateToolInputV2 setCreateMethod(String createMethod) {
        this.createMethod = createMethod;
        return this;
    }
    public String getCreateMethod() {
        return this.createMethod;
    }

    public UpdateToolInputV2 setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public UpdateToolInputV2 setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateToolInputV2 setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public UpdateToolInputV2 setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public UpdateToolInputV2 setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    public UpdateToolInputV2 setMcpConfig(McpConfig mcpConfig) {
        this.mcpConfig = mcpConfig;
        return this;
    }
    public McpConfig getMcpConfig() {
        return this.mcpConfig;
    }

    public UpdateToolInputV2 setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public UpdateToolInputV2 setNasConfig(NASConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    public UpdateToolInputV2 setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public UpdateToolInputV2 setOssMountConfig(OSSMountConfig ossMountConfig) {
        this.ossMountConfig = ossMountConfig;
        return this;
    }
    public OSSMountConfig getOssMountConfig() {
        return this.ossMountConfig;
    }

    public UpdateToolInputV2 setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public UpdateToolInputV2 setProtocolSpec(String protocolSpec) {
        this.protocolSpec = protocolSpec;
        return this;
    }
    public String getProtocolSpec() {
        return this.protocolSpec;
    }

    public UpdateToolInputV2 setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public UpdateToolInputV2 setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
