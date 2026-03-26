// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class Tool extends TeaModel {
    /**
     * <p>工具部署的制品类型，支持：Code（代码包）、Container（容器镜像）</p>
     * 
     * <strong>example:</strong>
     * <p>Code</p>
     */
    @NameInMap("artifactType")
    public String artifactType;

    /**
     * <p>代码包类型工具的配置信息，包括代码位置、入口函数等</p>
     */
    @NameInMap("codeConfiguration")
    public CodeConfiguration codeConfiguration;

    /**
     * <p>容器类型工具的配置信息，包括镜像地址、启动命令等</p>
     */
    @NameInMap("containerConfiguration")
    public ContainerConfiguration containerConfiguration;

    /**
     * <p>工具实例的 CPU 核心数，单位为核</p>
     * 
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>工具的创建方式，支持：MCP_REMOTE（远程 MCP 服务器）、MCP_LOCAL_STDIO（本地 MCP 标准输入输出）、MCP_BUNDLE（MCP 打包部署）、CODE_PACKAGE（代码包部署）、OPENAPI_IMPORT（OpenAPI 导入）</p>
     * 
     * <strong>example:</strong>
     * <p>MCP_REMOTE</p>
     */
    @NameInMap("createMethod")
    public String createMethod;

    /**
     * <p>工具的创建时间，ISO 8601 格式</p>
     * 
     * <strong>example:</strong>
     * <p>2025-09-10T10:00:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>工具使用的凭证名称，用于访问需要认证的外部服务</p>
     * 
     * <strong>example:</strong>
     * <p>my-credential</p>
     */
    @NameInMap("credentialName")
    public String credentialName;

    /**
     * <p>工具的详细描述信息，说明工具的功能和用途</p>
     * 
     * <strong>example:</strong>
     * <p>这是一个用于处理文档的 MCP 工具</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>工具运行时的环境变量配置，键值对形式</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ENV&quot;: &quot;production&quot;, &quot;LOG_LEVEL&quot;: &quot;info&quot;}</p>
     */
    @NameInMap("environmentVariables")
    public java.util.Map<String, String> environmentVariables;

    /**
     * <p>工具执行时使用的 RAM 角色 ARN，用于权限控制</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789:role/AliyunFCDefaultRole</p>
     */
    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    /**
     * <p>工具的日志配置，包括日志存储位置和日志级别等</p>
     */
    @NameInMap("logConfiguration")
    public LogConfiguration logConfiguration;

    /**
     * <p>MCP 工具的配置信息，包括会话亲和性、代理配置等</p>
     */
    @NameInMap("mcpConfig")
    public McpConfig mcpConfig;

    /**
     * <p>工具实例的内存大小，单位为 MB</p>
     * 
     * <strong>example:</strong>
     * <p>512</p>
     */
    @NameInMap("memory")
    public Integer memory;

    /**
     * <p>文件存储 NAS 的配置信息，用于工具访问 NAS 文件系统</p>
     */
    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    /**
     * <p>工具的网络配置，包括 VPC、安全组等信息</p>
     */
    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    /**
     * <p>对象存储 OSS 的挂载配置，用于工具访问 OSS 存储</p>
     */
    @NameInMap("ossMountConfig")
    public OSSMountConfig ossMountConfig;

    /**
     * <p>工具服务监听的端口号</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("port")
    public Integer port;

    /**
     * <p>工具使用的协议规范定义，JSON 格式的字符串</p>
     */
    @NameInMap("protocolSpec")
    public String protocolSpec;

    /**
     * <p>工具的当前运行状态，如：Running（运行中）、Stopped（已停止）、Failed（失败）等</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>工具状态的详细原因说明，特别是在失败或异常状态时提供错误信息</p>
     */
    @NameInMap("statusReason")
    public String statusReason;

    /**
     * <p>工具执行的超时时间，单位为秒</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    /**
     * <p>工具的唯一标识符，由系统自动生成</p>
     * 
     * <strong>example:</strong>
     * <p>tool-abc123</p>
     */
    @NameInMap("toolId")
    public String toolId;

    /**
     * <p>工具的名称，用于标识和引用工具</p>
     * 
     * <strong>example:</strong>
     * <p>my-mcp-tool</p>
     */
    @NameInMap("toolName")
    public String toolName;

    /**
     * <p>工具的类型，支持：MCP（Model Context Protocol 工具）、FUNCTIONCALL（函数调用工具）、SKILL（技能工具）</p>
     * 
     * <strong>example:</strong>
     * <p>MCP</p>
     */
    @NameInMap("toolType")
    public String toolType;

    /**
     * <p>工具的最后更新时间，ISO 8601 格式</p>
     * 
     * <strong>example:</strong>
     * <p>2025-09-10T12:00:00Z</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    /**
     * <p>工具所属的工作空间标识符</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-xyz789</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static Tool build(java.util.Map<String, ?> map) throws Exception {
        Tool self = new Tool();
        return TeaModel.build(map, self);
    }

    public Tool setArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }
    public String getArtifactType() {
        return this.artifactType;
    }

    public Tool setCodeConfiguration(CodeConfiguration codeConfiguration) {
        this.codeConfiguration = codeConfiguration;
        return this;
    }
    public CodeConfiguration getCodeConfiguration() {
        return this.codeConfiguration;
    }

    public Tool setContainerConfiguration(ContainerConfiguration containerConfiguration) {
        this.containerConfiguration = containerConfiguration;
        return this;
    }
    public ContainerConfiguration getContainerConfiguration() {
        return this.containerConfiguration;
    }

    public Tool setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public Tool setCreateMethod(String createMethod) {
        this.createMethod = createMethod;
        return this;
    }
    public String getCreateMethod() {
        return this.createMethod;
    }

    public Tool setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public Tool setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public Tool setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Tool setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public Tool setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public Tool setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    public Tool setMcpConfig(McpConfig mcpConfig) {
        this.mcpConfig = mcpConfig;
        return this;
    }
    public McpConfig getMcpConfig() {
        return this.mcpConfig;
    }

    public Tool setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public Tool setNasConfig(NASConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    public Tool setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public Tool setOssMountConfig(OSSMountConfig ossMountConfig) {
        this.ossMountConfig = ossMountConfig;
        return this;
    }
    public OSSMountConfig getOssMountConfig() {
        return this.ossMountConfig;
    }

    public Tool setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public Tool setProtocolSpec(String protocolSpec) {
        this.protocolSpec = protocolSpec;
        return this;
    }
    public String getProtocolSpec() {
        return this.protocolSpec;
    }

    public Tool setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Tool setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public Tool setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public Tool setToolId(String toolId) {
        this.toolId = toolId;
        return this;
    }
    public String getToolId() {
        return this.toolId;
    }

    public Tool setToolName(String toolName) {
        this.toolName = toolName;
        return this;
    }
    public String getToolName() {
        return this.toolName;
    }

    public Tool setToolType(String toolType) {
        this.toolType = toolType;
        return this;
    }
    public String getToolType() {
        return this.toolType;
    }

    public Tool setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public Tool setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
