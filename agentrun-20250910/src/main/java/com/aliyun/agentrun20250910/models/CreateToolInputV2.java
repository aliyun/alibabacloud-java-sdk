// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateToolInputV2 extends TeaModel {
    /**
     * <p>工具部署的制品类型，支持：Code（代码包）、Container（容器镜像）</p>
     * 
     * <strong>example:</strong>
     * <p>Code</p>
     */
    @NameInMap("artifactType")
    public String artifactType;

    /**
     * <p>代码包类型工具的配置信息，包括代码位置、入口函数、运行时等，仅在制品类型为 Code 时需要提供</p>
     */
    @NameInMap("codeConfiguration")
    public CodeConfiguration codeConfiguration;

    /**
     * <p>容器类型工具的配置信息，包括镜像地址、启动命令、端口映射等，仅在制品类型为 Container 时需要提供</p>
     */
    @NameInMap("containerConfiguration")
    public ContainerConfiguration containerConfiguration;

    /**
     * <p>工具实例的 CPU 核心数，单位为核，支持小数，如 0.5 表示半核</p>
     * 
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>工具的创建方式，必填项。支持：MCP_REMOTE（远程 MCP 服务器）、MCP_LOCAL_STDIO（本地 MCP 标准输入输出）、MCP_BUNDLE（MCP 打包部署）、CODE_PACKAGE（代码包部署）、OPENAPI_IMPORT（OpenAPI 导入）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MCP_REMOTE</p>
     */
    @NameInMap("createMethod")
    public String createMethod;

    /**
     * <p>工具使用的凭证名称，用于访问需要认证的外部服务，需要提前在系统中创建凭证</p>
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
     * <p>工具运行时的环境变量配置，键值对形式，用于传递配置信息到工具运行环境</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ENV&quot;: &quot;production&quot;, &quot;LOG_LEVEL&quot;: &quot;info&quot;}</p>
     */
    @NameInMap("environmentVariables")
    public java.util.Map<String, String> environmentVariables;

    /**
     * <p>工具执行时使用的 RAM 角色 ARN，用于权限控制，格式如：acs:ram::123456789:role/AliyunFCDefaultRole</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789:role/AliyunFCDefaultRole</p>
     */
    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    /**
     * <p>工具的日志配置，包括日志存储位置（SLS）、日志级别等</p>
     */
    @NameInMap("logConfiguration")
    public LogConfiguration logConfiguration;

    /**
     * <p>MCP 工具的配置信息，包括会话亲和性、代理配置、绑定配置等，仅在工具类型为 MCP 时需要提供</p>
     */
    @NameInMap("mcpConfig")
    public McpConfig mcpConfig;

    /**
     * <p>工具实例的内存大小，单位为 MB，建议根据工具的实际需求配置</p>
     * 
     * <strong>example:</strong>
     * <p>512</p>
     */
    @NameInMap("memory")
    public Integer memory;

    /**
     * <p>文件存储 NAS 的配置信息，用于工具访问 NAS 文件系统，实现持久化存储</p>
     */
    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    /**
     * <p>工具的网络配置，包括 VPC、安全组、交换机等信息，用于配置工具的网络访问能力</p>
     */
    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    /**
     * <p>对象存储 OSS 的挂载配置，用于工具访问 OSS 存储桶中的文件</p>
     */
    @NameInMap("ossMountConfig")
    public OSSMountConfig ossMountConfig;

    /**
     * <p>工具服务监听的端口号，用于接收请求</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("port")
    public Integer port;

    /**
     * <p>工具使用的协议规范定义，JSON 格式的字符串，定义工具的接口和交互方式</p>
     */
    @NameInMap("protocolSpec")
    public String protocolSpec;

    /**
     * <p>工具执行的超时时间，单位为秒，超过此时间工具调用将被终止</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    /**
     * <p>工具的名称，必填项，用于标识和引用工具，需要在工作空间内唯一</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-mcp-tool</p>
     */
    @NameInMap("toolName")
    public String toolName;

    /**
     * <p>工具的类型，必填项。支持：MCP（Model Context Protocol 工具）、FUNCTIONCALL（函数调用工具）、SKILL（技能工具）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MCP</p>
     */
    @NameInMap("toolType")
    public String toolType;

    /**
     * <p>工具所属的工作空间标识符，可选项，不填则使用默认工作空间</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-xyz789</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static CreateToolInputV2 build(java.util.Map<String, ?> map) throws Exception {
        CreateToolInputV2 self = new CreateToolInputV2();
        return TeaModel.build(map, self);
    }

    public CreateToolInputV2 setArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }
    public String getArtifactType() {
        return this.artifactType;
    }

    public CreateToolInputV2 setCodeConfiguration(CodeConfiguration codeConfiguration) {
        this.codeConfiguration = codeConfiguration;
        return this;
    }
    public CodeConfiguration getCodeConfiguration() {
        return this.codeConfiguration;
    }

    public CreateToolInputV2 setContainerConfiguration(ContainerConfiguration containerConfiguration) {
        this.containerConfiguration = containerConfiguration;
        return this;
    }
    public ContainerConfiguration getContainerConfiguration() {
        return this.containerConfiguration;
    }

    public CreateToolInputV2 setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public CreateToolInputV2 setCreateMethod(String createMethod) {
        this.createMethod = createMethod;
        return this;
    }
    public String getCreateMethod() {
        return this.createMethod;
    }

    public CreateToolInputV2 setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public CreateToolInputV2 setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateToolInputV2 setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public CreateToolInputV2 setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public CreateToolInputV2 setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    public CreateToolInputV2 setMcpConfig(McpConfig mcpConfig) {
        this.mcpConfig = mcpConfig;
        return this;
    }
    public McpConfig getMcpConfig() {
        return this.mcpConfig;
    }

    public CreateToolInputV2 setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public CreateToolInputV2 setNasConfig(NASConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    public CreateToolInputV2 setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public CreateToolInputV2 setOssMountConfig(OSSMountConfig ossMountConfig) {
        this.ossMountConfig = ossMountConfig;
        return this;
    }
    public OSSMountConfig getOssMountConfig() {
        return this.ossMountConfig;
    }

    public CreateToolInputV2 setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public CreateToolInputV2 setProtocolSpec(String protocolSpec) {
        this.protocolSpec = protocolSpec;
        return this;
    }
    public String getProtocolSpec() {
        return this.protocolSpec;
    }

    public CreateToolInputV2 setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public CreateToolInputV2 setToolName(String toolName) {
        this.toolName = toolName;
        return this;
    }
    public String getToolName() {
        return this.toolName;
    }

    public CreateToolInputV2 setToolType(String toolType) {
        this.toolType = toolType;
        return this;
    }
    public String getToolType() {
        return this.toolType;
    }

    public CreateToolInputV2 setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
