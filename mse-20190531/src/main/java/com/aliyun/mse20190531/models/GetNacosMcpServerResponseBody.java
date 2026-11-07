// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetNacosMcpServerResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public GetNacosMcpServerResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>72FC625E-9629-591B-9C01-3F0BFDAB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNacosMcpServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNacosMcpServerResponseBody self = new GetNacosMcpServerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNacosMcpServerResponseBody setData(GetNacosMcpServerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetNacosMcpServerResponseBodyData getData() {
        return this.data;
    }

    public GetNacosMcpServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNacosMcpServerResponseBodyDataAllVersions extends TeaModel {
        /**
         * <p>Indicates whether it is the latest version.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Is_latest")
        public Boolean isLatest;

        /**
         * <p>The release date.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-16</p>
         */
        @NameInMap("Release_date")
        public String releaseDate;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.9</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetNacosMcpServerResponseBodyDataAllVersions build(java.util.Map<String, ?> map) throws Exception {
            GetNacosMcpServerResponseBodyDataAllVersions self = new GetNacosMcpServerResponseBodyDataAllVersions();
            return TeaModel.build(map, self);
        }

        public GetNacosMcpServerResponseBodyDataAllVersions setIsLatest(Boolean isLatest) {
            this.isLatest = isLatest;
            return this;
        }
        public Boolean getIsLatest() {
            return this.isLatest;
        }

        public GetNacosMcpServerResponseBodyDataAllVersions setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }
        public String getReleaseDate() {
            return this.releaseDate;
        }

        public GetNacosMcpServerResponseBodyDataAllVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetNacosMcpServerResponseBodyDataBackendEndpoints extends TeaModel {
        /**
         * <p>The address.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The path.</p>
         * 
         * <strong>example:</strong>
         * <p>/sse</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        public static GetNacosMcpServerResponseBodyDataBackendEndpoints build(java.util.Map<String, ?> map) throws Exception {
            GetNacosMcpServerResponseBodyDataBackendEndpoints self = new GetNacosMcpServerResponseBodyDataBackendEndpoints();
            return TeaModel.build(map, self);
        }

        public GetNacosMcpServerResponseBodyDataBackendEndpoints setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetNacosMcpServerResponseBodyDataBackendEndpoints setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetNacosMcpServerResponseBodyDataBackendEndpoints setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class GetNacosMcpServerResponseBodyDataRemoteServerConfigServiceRef extends TeaModel {
        /**
         * <p>The group to which the service belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-service</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        public static GetNacosMcpServerResponseBodyDataRemoteServerConfigServiceRef build(java.util.Map<String, ?> map) throws Exception {
            GetNacosMcpServerResponseBodyDataRemoteServerConfigServiceRef self = new GetNacosMcpServerResponseBodyDataRemoteServerConfigServiceRef();
            return TeaModel.build(map, self);
        }

        public GetNacosMcpServerResponseBodyDataRemoteServerConfigServiceRef setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetNacosMcpServerResponseBodyDataRemoteServerConfigServiceRef setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public GetNacosMcpServerResponseBodyDataRemoteServerConfigServiceRef setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class GetNacosMcpServerResponseBodyDataRemoteServerConfig extends TeaModel {
        /**
         * <p>The exposed path.</p>
         * 
         * <strong>example:</strong>
         * <p>/sse</p>
         */
        @NameInMap("ExportPath")
        public String exportPath;

        /**
         * <p>The service reference.</p>
         */
        @NameInMap("ServiceRef")
        public GetNacosMcpServerResponseBodyDataRemoteServerConfigServiceRef serviceRef;

        public static GetNacosMcpServerResponseBodyDataRemoteServerConfig build(java.util.Map<String, ?> map) throws Exception {
            GetNacosMcpServerResponseBodyDataRemoteServerConfig self = new GetNacosMcpServerResponseBodyDataRemoteServerConfig();
            return TeaModel.build(map, self);
        }

        public GetNacosMcpServerResponseBodyDataRemoteServerConfig setExportPath(String exportPath) {
            this.exportPath = exportPath;
            return this;
        }
        public String getExportPath() {
            return this.exportPath;
        }

        public GetNacosMcpServerResponseBodyDataRemoteServerConfig setServiceRef(GetNacosMcpServerResponseBodyDataRemoteServerConfigServiceRef serviceRef) {
            this.serviceRef = serviceRef;
            return this;
        }
        public GetNacosMcpServerResponseBodyDataRemoteServerConfigServiceRef getServiceRef() {
            return this.serviceRef;
        }

    }

    public static class GetNacosMcpServerResponseBodyDataToolSpecTools extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>a weather query tool</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The input schema of the tool.</p>
         */
        @NameInMap("InputSchema")
        public java.util.Map<String, ?> inputSchema;

        /**
         * <p>The tool name.</p>
         * 
         * <strong>example:</strong>
         * <p>get_weather</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetNacosMcpServerResponseBodyDataToolSpecTools build(java.util.Map<String, ?> map) throws Exception {
            GetNacosMcpServerResponseBodyDataToolSpecTools self = new GetNacosMcpServerResponseBodyDataToolSpecTools();
            return TeaModel.build(map, self);
        }

        public GetNacosMcpServerResponseBodyDataToolSpecTools setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetNacosMcpServerResponseBodyDataToolSpecTools setInputSchema(java.util.Map<String, ?> inputSchema) {
            this.inputSchema = inputSchema;
            return this;
        }
        public java.util.Map<String, ?> getInputSchema() {
            return this.inputSchema;
        }

        public GetNacosMcpServerResponseBodyDataToolSpecTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetNacosMcpServerResponseBodyDataToolSpec extends TeaModel {
        /**
         * <p>The list of security authentication schemes in the MCP tool definition.</p>
         */
        @NameInMap("SecuritySchemes")
        public Object securitySchemes;

        /**
         * <p>The storage format type of the MCP tool definition.</p>
         * 
         * <strong>example:</strong>
         * <p>cipher-kms-256</p>
         */
        @NameInMap("SpecificationType")
        public String specificationType;

        /**
         * <p>The decryption result status of the MCP tool definition.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("ToolDecryptStatus")
        public String toolDecryptStatus;

        /**
         * <p>The list of tools.</p>
         */
        @NameInMap("Tools")
        public java.util.List<GetNacosMcpServerResponseBodyDataToolSpecTools> tools;

        /**
         * <p>The tool metadata map.</p>
         */
        @NameInMap("ToolsMeta")
        public java.util.Map<String, DataToolSpecToolsMetaValue> toolsMeta;

        public static GetNacosMcpServerResponseBodyDataToolSpec build(java.util.Map<String, ?> map) throws Exception {
            GetNacosMcpServerResponseBodyDataToolSpec self = new GetNacosMcpServerResponseBodyDataToolSpec();
            return TeaModel.build(map, self);
        }

        public GetNacosMcpServerResponseBodyDataToolSpec setSecuritySchemes(Object securitySchemes) {
            this.securitySchemes = securitySchemes;
            return this;
        }
        public Object getSecuritySchemes() {
            return this.securitySchemes;
        }

        public GetNacosMcpServerResponseBodyDataToolSpec setSpecificationType(String specificationType) {
            this.specificationType = specificationType;
            return this;
        }
        public String getSpecificationType() {
            return this.specificationType;
        }

        public GetNacosMcpServerResponseBodyDataToolSpec setToolDecryptStatus(String toolDecryptStatus) {
            this.toolDecryptStatus = toolDecryptStatus;
            return this;
        }
        public String getToolDecryptStatus() {
            return this.toolDecryptStatus;
        }

        public GetNacosMcpServerResponseBodyDataToolSpec setTools(java.util.List<GetNacosMcpServerResponseBodyDataToolSpecTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<GetNacosMcpServerResponseBodyDataToolSpecTools> getTools() {
            return this.tools;
        }

        public GetNacosMcpServerResponseBodyDataToolSpec setToolsMeta(java.util.Map<String, DataToolSpecToolsMetaValue> toolsMeta) {
            this.toolsMeta = toolsMeta;
            return this;
        }
        public java.util.Map<String, DataToolSpecToolsMetaValue> getToolsMeta() {
            return this.toolsMeta;
        }

    }

    public static class GetNacosMcpServerResponseBodyDataVersionDetail extends TeaModel {
        /**
         * <p>Indicates whether it is the latest version.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsLatest")
        public Boolean isLatest;

        /**
         * <p>The release date.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-16</p>
         */
        @NameInMap("ReleaseDate")
        public String releaseDate;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.11.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetNacosMcpServerResponseBodyDataVersionDetail build(java.util.Map<String, ?> map) throws Exception {
            GetNacosMcpServerResponseBodyDataVersionDetail self = new GetNacosMcpServerResponseBodyDataVersionDetail();
            return TeaModel.build(map, self);
        }

        public GetNacosMcpServerResponseBodyDataVersionDetail setIsLatest(Boolean isLatest) {
            this.isLatest = isLatest;
            return this;
        }
        public Boolean getIsLatest() {
            return this.isLatest;
        }

        public GetNacosMcpServerResponseBodyDataVersionDetail setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }
        public String getReleaseDate() {
            return this.releaseDate;
        }

        public GetNacosMcpServerResponseBodyDataVersionDetail setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetNacosMcpServerResponseBodyData extends TeaModel {
        /**
         * <p>All version information of the current MCP server.</p>
         */
        @NameInMap("AllVersions")
        public java.util.List<GetNacosMcpServerResponseBodyDataAllVersions> allVersions;

        /**
         * <p>The backend service endpoints.</p>
         */
        @NameInMap("BackendEndpoints")
        public java.util.List<GetNacosMcpServerResponseBodyDataBackendEndpoints> backendEndpoints;

        /**
         * <p>The capabilities of the current MCP server.</p>
         */
        @NameInMap("Capabilities")
        public java.util.List<String> capabilities;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the gateway is enabled.</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The exposed protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-sse</p>
         */
        @NameInMap("FrontProtocol")
        public String frontProtocol;

        /**
         * <p>The ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5e3c5211-d365-4013-8540-c4106ec2a5dc</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The local MCP server configuration.</p>
         */
        @NameInMap("LocalServerConfig")
        public java.util.Map<String, ?> localServerConfig;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-sse</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The remote server configuration.</p>
         */
        @NameInMap("RemoteServerConfig")
        public GetNacosMcpServerResponseBodyDataRemoteServerConfig remoteServerConfig;

        /**
         * <p>The tool specification.</p>
         */
        @NameInMap("ToolSpec")
        public GetNacosMcpServerResponseBodyDataToolSpec toolSpec;

        /**
         * <p>The version details.</p>
         */
        @NameInMap("VersionDetail")
        public GetNacosMcpServerResponseBodyDataVersionDetail versionDetail;

        /**
         * <p>The YAML configuration of the AI gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>allowTools:</p>
         * <ul>
         * <li>demo-tool
         * securityScheme: {}
         * server:
         * name: mcp-demo
         * tools:</li>
         * <li>args:<ul>
         * <li>name: name
         * description: name
         * type: string
         * description: a demo tool
         * name: demo-tool</li>
         * </ul>
         * </li>
         * </ul>
         */
        @NameInMap("YamlConfig")
        public String yamlConfig;

        public static GetNacosMcpServerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNacosMcpServerResponseBodyData self = new GetNacosMcpServerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNacosMcpServerResponseBodyData setAllVersions(java.util.List<GetNacosMcpServerResponseBodyDataAllVersions> allVersions) {
            this.allVersions = allVersions;
            return this;
        }
        public java.util.List<GetNacosMcpServerResponseBodyDataAllVersions> getAllVersions() {
            return this.allVersions;
        }

        public GetNacosMcpServerResponseBodyData setBackendEndpoints(java.util.List<GetNacosMcpServerResponseBodyDataBackendEndpoints> backendEndpoints) {
            this.backendEndpoints = backendEndpoints;
            return this;
        }
        public java.util.List<GetNacosMcpServerResponseBodyDataBackendEndpoints> getBackendEndpoints() {
            return this.backendEndpoints;
        }

        public GetNacosMcpServerResponseBodyData setCapabilities(java.util.List<String> capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public java.util.List<String> getCapabilities() {
            return this.capabilities;
        }

        public GetNacosMcpServerResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetNacosMcpServerResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetNacosMcpServerResponseBodyData setFrontProtocol(String frontProtocol) {
            this.frontProtocol = frontProtocol;
            return this;
        }
        public String getFrontProtocol() {
            return this.frontProtocol;
        }

        public GetNacosMcpServerResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetNacosMcpServerResponseBodyData setLocalServerConfig(java.util.Map<String, ?> localServerConfig) {
            this.localServerConfig = localServerConfig;
            return this;
        }
        public java.util.Map<String, ?> getLocalServerConfig() {
            return this.localServerConfig;
        }

        public GetNacosMcpServerResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetNacosMcpServerResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetNacosMcpServerResponseBodyData setRemoteServerConfig(GetNacosMcpServerResponseBodyDataRemoteServerConfig remoteServerConfig) {
            this.remoteServerConfig = remoteServerConfig;
            return this;
        }
        public GetNacosMcpServerResponseBodyDataRemoteServerConfig getRemoteServerConfig() {
            return this.remoteServerConfig;
        }

        public GetNacosMcpServerResponseBodyData setToolSpec(GetNacosMcpServerResponseBodyDataToolSpec toolSpec) {
            this.toolSpec = toolSpec;
            return this;
        }
        public GetNacosMcpServerResponseBodyDataToolSpec getToolSpec() {
            return this.toolSpec;
        }

        public GetNacosMcpServerResponseBodyData setVersionDetail(GetNacosMcpServerResponseBodyDataVersionDetail versionDetail) {
            this.versionDetail = versionDetail;
            return this;
        }
        public GetNacosMcpServerResponseBodyDataVersionDetail getVersionDetail() {
            return this.versionDetail;
        }

        public GetNacosMcpServerResponseBodyData setYamlConfig(String yamlConfig) {
            this.yamlConfig = yamlConfig;
            return this;
        }
        public String getYamlConfig() {
            return this.yamlConfig;
        }

    }

}
