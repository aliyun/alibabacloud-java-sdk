// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class TypedAIAsset extends TeaModel {
    /**
     * <p>The access method for the MCP. Valid values: local_process for local processes, remote_service for remote services, and unknown for undetermined methods.</p>
     * 
     * <strong>example:</strong>
     * <p>local_process</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>The database primary key of the agent instance associated with the leaf asset, returned as a decimal numeric string. The value can be 0 when no agent is associated, and it can also be 0 in the details of the agent itself. This field is not returned in aggregated lists.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456789</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The configuration path where the LLM, MCP, or tool declaration is located. This is not a skill package identifier. It is returned in instance details but not in aggregated lists.</p>
     * 
     * <strong>example:</strong>
     * <p>/home/example/.config/example-agent/config.json</p>
     */
    @NameInMap("ConfigPath")
    public String configPath;

    /**
     * <p>The description text collected for an MCP, tool, or skill. This is not returned if missing. Aggregated lists only return descriptions that are consistent within the group.</p>
     * 
     * <strong>example:</strong>
     * <p>Read and organize the documents in the specified directory.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The configured service endpoint for an LLM model service or remote MCP. Local stdio MCPs may not have this field. Its presence does not indicate a successful connection or actual invocation.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://api.example.com/v1">https://api.example.com/v1</a></p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The classification of the LLM service endpoint. Valid values: official for official services, third_party for third-party services, and unknown for undetermined services. This classification does not represent a security detection conclusion.</p>
     * 
     * <strong>example:</strong>
     * <p>official</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The time when the asset instance was first observed. The value is a database datetime string that may include six decimal places for seconds, without a unified time zone indicator. This field is not returned in aggregated lists.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-16 10:30:00.000000</p>
     */
    @NameInMap("FirstSeen")
    public String firstSeen;

    /**
     * <p>The installation form of the agent, such as desktop_app, ide_extension, cli, or sdk. This is not the endpoint operating system such as Windows or macOS. The specific value is subject to the instance recognition result.</p>
     * 
     * <strong>example:</strong>
     * <p>cli</p>
     */
    @NameInMap("Form")
    public String form;

    /**
     * <p>The database primary key of the table where the asset instance is located, returned as a decimal numeric string to prevent precision loss of large integers. This is not the asset aggregation key AssetKey, and this instance field is not returned in aggregated lists.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456789</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The collected product identity clues and their categorization by identifier type. These are used for auxiliary identification and do not indicate that signatures, publishers, or file contents have been authenticated through security authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;macos_bundle_id&quot;:[&quot;com.example.agent&quot;],&quot;npm_package&quot;:[&quot;@example/agent-cli&quot;]}</p>
     */
    @NameInMap("IdentityIdentifiers")
    public TypedAIAssetIdentityIdentifiers identityIdentifiers;

    /**
     * <p>The installation path of the agent instance. This field is used only for instance details and is not returned in aggregated lists. It is not applicable to other asset types.</p>
     * 
     * <strong>example:</strong>
     * <p>/opt/example-agent</p>
     */
    @NameInMap("InstallPath")
    public String installPath;

    /**
     * <p>The instance identity installed or declared within the endpoint, calculated by the script based on the asset type, ownership, and location. The identity scope must still include the tenant and endpoint, and it cannot be used as a globally unique ID across endpoints. This field is not returned in aggregation lists.</p>
     * 
     * <strong>example:</strong>
     * <p>sha256:70e28ce51d55863f2ac5bb81efcee54026ff9fdde9b52346c659f4e24017e7f6</p>
     */
    @NameInMap("InstanceLocalId")
    public String instanceLocalId;

    /**
     * <p>The time of the last successful detection for the current skill content. This field is empty or not returned if no saved successful detection record exists. The value is a database datetime string without a unified time zone indicator. This field is not returned in aggregated lists.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-16 10:30:00.000000</p>
     */
    @NameInMap("LastCheckTime")
    public String lastCheckTime;

    /**
     * <p>The database ID of the latest detection task associated with the current skill content, returned as a decimal numeric string. The value can be 0 if no task is associated. The presence of a task ID does not indicate that the detection is complete. This field is not returned in aggregated lists.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456791</p>
     */
    @NameInMap("LastDetectTaskId")
    public String lastDetectTaskId;

    /**
     * <p>The time when the asset instance was last actually observed. The value is a database datetime string that may include six decimal places for seconds. This is not the page query time. This field is not returned in aggregated lists.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-16 11:30:00.000000</p>
     */
    @NameInMap("LastSeen")
    public String lastSeen;

    /**
     * <p>The array of static recognition basis tags matched by the agent, which can include model_call, tool_call, autonomous_execution, state_management, and agent_declaration. This does not indicate that the agent was actually executed or passed security certification.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;model_call&quot;,&quot;tool_call&quot;]</p>
     */
    @NameInMap("MatchedRules")
    public java.util.List<String> matchedRules;

    /**
     * <p>The database primary key of the MCP instance associated with the tool, returned as a decimal numeric string. The value can be 0 when no MCP is associated, and this field is not applicable to other asset types. This field is not returned in aggregated lists.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456790</p>
     */
    @NameInMap("McpId")
    public String mcpId;

    /**
     * <p>The product code of the agent. The specific value is subject to the product catalog in the recognition rules. This field is not returned when it is not applicable, unidentified, or inconsistent across aggregated attributes.</p>
     * 
     * <strong>example:</strong>
     * <p>example_agent</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The provider identifier matched based on the service endpoint and provider directory. This may not be returned if no match is found and is not the product code of the associated agent.</p>
     * 
     * <strong>example:</strong>
     * <p>example_provider</p>
     */
    @NameInMap("ProviderId")
    public String providerId;

    /**
     * <p>The provider display name of the tool. This is generated from the associated MCP, agent, or declaration source and is not a proof of security or trust.</p>
     * 
     * <strong>example:</strong>
     * <p>Example MCP</p>
     */
    @NameInMap("ProviderName")
    public String providerName;

    /**
     * <p>The Chinese display name of the service provider. The directory name is prioritized. The name parsed from the service endpoint may be used if no match is found. The presence of this field does not indicate that the service provider is identified.</p>
     * 
     * <strong>example:</strong>
     * <p>示例模型服务商</p>
     */
    @NameInMap("ProviderNameCn")
    public String providerNameCn;

    /**
     * <p>The English display name of the service provider. The directory name is prioritized. The name parsed from the service endpoint may be used if no match is found. The presence of this field does not indicate that the service provider is identified.</p>
     * 
     * <strong>example:</strong>
     * <p>Example Model Provider</p>
     */
    @NameInMap("ProviderNameEn")
    public String providerNameEn;

    /**
     * <p>The declared provider type of the tool. Valid values: mcp, agent, software, file, or unknown. This describes the declaration source and does not represent the actual caller, authorization status, or vendor identity.</p>
     * 
     * <strong>example:</strong>
     * <p>mcp</p>
     */
    @NameInMap("ProviderType")
    public String providerType;

    /**
     * <p>The static recognition basis of the agent, which lists the source paths and evidence text grouped by recognition tags. This is not a runtime audit record, and instance-level evidence is not returned in aggregated lists.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;model_call&quot;:[{&quot;source_path&quot;:&quot;/opt/example-agent/model.py&quot;}]}</p>
     */
    @NameInMap("RecognitionEvidence")
    public TypedAIAssetRecognitionEvidence recognitionEvidence;

    /**
     * <p>The product recognition status of the agent. identified indicates recognized, unidentified indicates pending recognition, and conflict indicates a recognition conflict. This status does not indicate whether the asset is secure.</p>
     * 
     * <strong>example:</strong>
     * <p>identified</p>
     */
    @NameInMap("RecognitionStatus")
    public String recognitionStatus;

    /**
     * <p>The counts of high, medium, and low-risk items saved for the current skill content. This may be empty or not returned when no detection results are available. A missing value cannot be interpreted as a zero risk count or an indication of security.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;highRiskCnt&quot;:1,&quot;mediumRiskCnt&quot;:0,&quot;lowRiskCnt&quot;:0}</p>
     */
    @NameInMap("RiskInfo")
    public TypedAIAssetRiskInfo riskInfo;

    /**
     * <p>The final risk level saved for the current skill content. This is not returned when no detection conclusion is available. The value high is provided only as a format example and does not serve as a new enumeration constraint.</p>
     * 
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>The scan batch identifier of the most recent scan where the instance was actually observed. This is not a database primary key or asset content hash. This field is not returned in aggregated lists.</p>
     * 
     * <strong>example:</strong>
     * <p>scan-0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("ScanId")
    public String scanId;

    /**
     * <p>The source channel classification of the skill. The default value for current collection and storage is unknown. The unknown value cannot be inferred as an official or community source.</p>
     * 
     * <strong>example:</strong>
     * <p>unknown</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The SHA-256 hash of the complete skill package bytes. The format is a 64-character lowercase hexadecimal string without the sha256: prefix. The current script uses the skill-canonical-zip-v1 specification for compression. This is not equivalent to the installation instance ID and does not indicate that the package has been inspected or is secure.</p>
     * 
     * <strong>example:</strong>
     * <p>60d3292dd23fe7d2760d6a228123d1e4eb3d91bdb511089015e854d68ea9e460</p>
     */
    @NameInMap("StandardSha256")
    public String standardSha256;

    /**
     * <p>The transport protocol declared in the MCP configuration. The collected value is retained as-is, such as stdio, sse, or streamable_http. This cannot be used to determine whether the service is running or has been invoked.</p>
     * 
     * <strong>example:</strong>
     * <p>stdio</p>
     */
    @NameInMap("Transport")
    public String transport;

    /**
     * <p>The vendor code for the collected and stored skill. The current default value is 1000. This cannot be used to infer a specific vendor or security status.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Vendor")
    public Integer vendor;

    /**
     * <p>The collected installation version of the agent. This field is not returned when the version is not collected. In aggregated lists, this field is returned only when the versions of all instances in the group are identical and not empty.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.3</p>
     */
    @NameInMap("Version")
    public String version;

    public static TypedAIAsset build(java.util.Map<String, ?> map) throws Exception {
        TypedAIAsset self = new TypedAIAsset();
        return TeaModel.build(map, self);
    }

    public TypedAIAsset setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public TypedAIAsset setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public TypedAIAsset setConfigPath(String configPath) {
        this.configPath = configPath;
        return this;
    }
    public String getConfigPath() {
        return this.configPath;
    }

    public TypedAIAsset setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public TypedAIAsset setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public TypedAIAsset setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public TypedAIAsset setFirstSeen(String firstSeen) {
        this.firstSeen = firstSeen;
        return this;
    }
    public String getFirstSeen() {
        return this.firstSeen;
    }

    public TypedAIAsset setForm(String form) {
        this.form = form;
        return this;
    }
    public String getForm() {
        return this.form;
    }

    public TypedAIAsset setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public TypedAIAsset setIdentityIdentifiers(TypedAIAssetIdentityIdentifiers identityIdentifiers) {
        this.identityIdentifiers = identityIdentifiers;
        return this;
    }
    public TypedAIAssetIdentityIdentifiers getIdentityIdentifiers() {
        return this.identityIdentifiers;
    }

    public TypedAIAsset setInstallPath(String installPath) {
        this.installPath = installPath;
        return this;
    }
    public String getInstallPath() {
        return this.installPath;
    }

    public TypedAIAsset setInstanceLocalId(String instanceLocalId) {
        this.instanceLocalId = instanceLocalId;
        return this;
    }
    public String getInstanceLocalId() {
        return this.instanceLocalId;
    }

    public TypedAIAsset setLastCheckTime(String lastCheckTime) {
        this.lastCheckTime = lastCheckTime;
        return this;
    }
    public String getLastCheckTime() {
        return this.lastCheckTime;
    }

    public TypedAIAsset setLastDetectTaskId(String lastDetectTaskId) {
        this.lastDetectTaskId = lastDetectTaskId;
        return this;
    }
    public String getLastDetectTaskId() {
        return this.lastDetectTaskId;
    }

    public TypedAIAsset setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
        return this;
    }
    public String getLastSeen() {
        return this.lastSeen;
    }

    public TypedAIAsset setMatchedRules(java.util.List<String> matchedRules) {
        this.matchedRules = matchedRules;
        return this;
    }
    public java.util.List<String> getMatchedRules() {
        return this.matchedRules;
    }

    public TypedAIAsset setMcpId(String mcpId) {
        this.mcpId = mcpId;
        return this;
    }
    public String getMcpId() {
        return this.mcpId;
    }

    public TypedAIAsset setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public TypedAIAsset setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public TypedAIAsset setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

    public TypedAIAsset setProviderNameCn(String providerNameCn) {
        this.providerNameCn = providerNameCn;
        return this;
    }
    public String getProviderNameCn() {
        return this.providerNameCn;
    }

    public TypedAIAsset setProviderNameEn(String providerNameEn) {
        this.providerNameEn = providerNameEn;
        return this;
    }
    public String getProviderNameEn() {
        return this.providerNameEn;
    }

    public TypedAIAsset setProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }
    public String getProviderType() {
        return this.providerType;
    }

    public TypedAIAsset setRecognitionEvidence(TypedAIAssetRecognitionEvidence recognitionEvidence) {
        this.recognitionEvidence = recognitionEvidence;
        return this;
    }
    public TypedAIAssetRecognitionEvidence getRecognitionEvidence() {
        return this.recognitionEvidence;
    }

    public TypedAIAsset setRecognitionStatus(String recognitionStatus) {
        this.recognitionStatus = recognitionStatus;
        return this;
    }
    public String getRecognitionStatus() {
        return this.recognitionStatus;
    }

    public TypedAIAsset setRiskInfo(TypedAIAssetRiskInfo riskInfo) {
        this.riskInfo = riskInfo;
        return this;
    }
    public TypedAIAssetRiskInfo getRiskInfo() {
        return this.riskInfo;
    }

    public TypedAIAsset setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public TypedAIAsset setScanId(String scanId) {
        this.scanId = scanId;
        return this;
    }
    public String getScanId() {
        return this.scanId;
    }

    public TypedAIAsset setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public TypedAIAsset setStandardSha256(String standardSha256) {
        this.standardSha256 = standardSha256;
        return this;
    }
    public String getStandardSha256() {
        return this.standardSha256;
    }

    public TypedAIAsset setTransport(String transport) {
        this.transport = transport;
        return this;
    }
    public String getTransport() {
        return this.transport;
    }

    public TypedAIAsset setVendor(Integer vendor) {
        this.vendor = vendor;
        return this;
    }
    public Integer getVendor() {
        return this.vendor;
    }

    public TypedAIAsset setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class TypedAIAssetIdentityIdentifiersPeProductIdentity extends TeaModel {
        /**
         * <p>The CompanyName field in a Windows PE version resource. This is not a certified vendor identity.</p>
         * 
         * <strong>example:</strong>
         * <p>Example Corp</p>
         */
        @NameInMap("company_name")
        public String companyName;

        /**
         * <p>The ProductName field in a Windows PE version resource.</p>
         * 
         * <strong>example:</strong>
         * <p>Example Agent</p>
         */
        @NameInMap("product_name")
        public String productName;

        public static TypedAIAssetIdentityIdentifiersPeProductIdentity build(java.util.Map<String, ?> map) throws Exception {
            TypedAIAssetIdentityIdentifiersPeProductIdentity self = new TypedAIAssetIdentityIdentifiersPeProductIdentity();
            return TeaModel.build(map, self);
        }

        public TypedAIAssetIdentityIdentifiersPeProductIdentity setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public TypedAIAssetIdentityIdentifiersPeProductIdentity setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

    public static class TypedAIAssetIdentityIdentifiersWindowsAppxIdentity extends TeaModel {
        /**
         * <p>The original package name of the Identity.Name in a Windows AppX/MSIX manifest.</p>
         * 
         * <strong>example:</strong>
         * <p>Example.Agent</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The publisher string of the Identity.Publisher in a Windows AppX/MSIX manifest. This is not equivalent to the signature verification result.</p>
         * 
         * <strong>example:</strong>
         * <p>CN=Example Corp, O=Example Corp, C=US</p>
         */
        @NameInMap("publisher")
        public String publisher;

        public static TypedAIAssetIdentityIdentifiersWindowsAppxIdentity build(java.util.Map<String, ?> map) throws Exception {
            TypedAIAssetIdentityIdentifiersWindowsAppxIdentity self = new TypedAIAssetIdentityIdentifiersWindowsAppxIdentity();
            return TeaModel.build(map, self);
        }

        public TypedAIAssetIdentityIdentifiersWindowsAppxIdentity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TypedAIAssetIdentityIdentifiersWindowsAppxIdentity setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }
        public String getPublisher() {
            return this.publisher;
        }

    }

    public static class TypedAIAssetIdentityIdentifiers extends TeaModel {
        /**
         * <p>The array of application names declared in desktop application manifests.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Example Agent&quot;]</p>
         */
        @NameInMap("desktop_manifest_name")
        public java.util.List<String> desktopManifestName;

        /**
         * <p>The array of plugin IDs declared in JetBrains plugin manifests.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;com.example.agent.plugin&quot;]</p>
         */
        @NameInMap("jetbrains_plugin_id")
        public java.util.List<String> jetbrainsPluginId;

        /**
         * <p>The array of macOS application bundle identifiers. These describe collected product identity clues and do not indicate that signatures are verified.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;com.example.agent&quot;]</p>
         */
        @NameInMap("macos_bundle_id")
        public java.util.List<String> macosBundleId;

        /**
         * <p>The array of npm package names. Scoped packages retain the @scope/name format.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;@example/agent-cli&quot;]</p>
         */
        @NameInMap("npm_package")
        public java.util.List<String> npmPackage;

        /**
         * <p>The array of product name and company name combinations in Windows PE version resources. These are not file hashes or verified signature identities.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;product_name&quot;:&quot;Example Agent&quot;,&quot;company_name&quot;:&quot;Example Corp&quot;}]</p>
         */
        @NameInMap("pe_product_identity")
        public java.util.List<TypedAIAssetIdentityIdentifiersPeProductIdentity> peProductIdentity;

        /**
         * <p>The array of Python package distribution names. These are used for product identity identification and are not a list of import module names.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;example-agent-sdk&quot;]</p>
         */
        @NameInMap("pypi_package")
        public java.util.List<String> pypiPackage;

        /**
         * <p>The array of VS Code extension identifiers. Each is typically the publisher name and extension name connected by a dot.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;example.agent-assistant&quot;]</p>
         */
        @NameInMap("vscode_extension_id")
        public java.util.List<String> vscodeExtensionId;

        /**
         * <p>The array of Windows AppX/MSIX manifest identities. Each item provides both the package name and publisher. This does not indicate that the publisher signature is verified.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;Example.Agent&quot;,&quot;publisher&quot;:&quot;CN=Example Corp, O=Example Corp, C=US&quot;}]</p>
         */
        @NameInMap("windows_appx_identity")
        public java.util.List<TypedAIAssetIdentityIdentifiersWindowsAppxIdentity> windowsAppxIdentity;

        /**
         * <p>The array of Windows application package family names. Each includes the package name and publisher identifier suffix and is not the application installation path.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Example.Agent_123456789abcd&quot;]</p>
         */
        @NameInMap("windows_package_family_name")
        public java.util.List<String> windowsPackageFamilyName;

        public static TypedAIAssetIdentityIdentifiers build(java.util.Map<String, ?> map) throws Exception {
            TypedAIAssetIdentityIdentifiers self = new TypedAIAssetIdentityIdentifiers();
            return TeaModel.build(map, self);
        }

        public TypedAIAssetIdentityIdentifiers setDesktopManifestName(java.util.List<String> desktopManifestName) {
            this.desktopManifestName = desktopManifestName;
            return this;
        }
        public java.util.List<String> getDesktopManifestName() {
            return this.desktopManifestName;
        }

        public TypedAIAssetIdentityIdentifiers setJetbrainsPluginId(java.util.List<String> jetbrainsPluginId) {
            this.jetbrainsPluginId = jetbrainsPluginId;
            return this;
        }
        public java.util.List<String> getJetbrainsPluginId() {
            return this.jetbrainsPluginId;
        }

        public TypedAIAssetIdentityIdentifiers setMacosBundleId(java.util.List<String> macosBundleId) {
            this.macosBundleId = macosBundleId;
            return this;
        }
        public java.util.List<String> getMacosBundleId() {
            return this.macosBundleId;
        }

        public TypedAIAssetIdentityIdentifiers setNpmPackage(java.util.List<String> npmPackage) {
            this.npmPackage = npmPackage;
            return this;
        }
        public java.util.List<String> getNpmPackage() {
            return this.npmPackage;
        }

        public TypedAIAssetIdentityIdentifiers setPeProductIdentity(java.util.List<TypedAIAssetIdentityIdentifiersPeProductIdentity> peProductIdentity) {
            this.peProductIdentity = peProductIdentity;
            return this;
        }
        public java.util.List<TypedAIAssetIdentityIdentifiersPeProductIdentity> getPeProductIdentity() {
            return this.peProductIdentity;
        }

        public TypedAIAssetIdentityIdentifiers setPypiPackage(java.util.List<String> pypiPackage) {
            this.pypiPackage = pypiPackage;
            return this;
        }
        public java.util.List<String> getPypiPackage() {
            return this.pypiPackage;
        }

        public TypedAIAssetIdentityIdentifiers setVscodeExtensionId(java.util.List<String> vscodeExtensionId) {
            this.vscodeExtensionId = vscodeExtensionId;
            return this;
        }
        public java.util.List<String> getVscodeExtensionId() {
            return this.vscodeExtensionId;
        }

        public TypedAIAssetIdentityIdentifiers setWindowsAppxIdentity(java.util.List<TypedAIAssetIdentityIdentifiersWindowsAppxIdentity> windowsAppxIdentity) {
            this.windowsAppxIdentity = windowsAppxIdentity;
            return this;
        }
        public java.util.List<TypedAIAssetIdentityIdentifiersWindowsAppxIdentity> getWindowsAppxIdentity() {
            return this.windowsAppxIdentity;
        }

        public TypedAIAssetIdentityIdentifiers setWindowsPackageFamilyName(java.util.List<String> windowsPackageFamilyName) {
            this.windowsPackageFamilyName = windowsPackageFamilyName;
            return this;
        }
        public java.util.List<String> getWindowsPackageFamilyName() {
            return this.windowsPackageFamilyName;
        }

    }

    public static class TypedAIAssetRecognitionEvidenceAgentDeclaration extends TeaModel {
        /**
         * <p>The collected declaration text related to the recognition basis. This is currently used mainly for agent_declaration, and other recognition evidence may not return content. This should not be interpreted as an actual execution log.</p>
         * 
         * <strong>example:</strong>
         * <p>An AI agent that plans tasks and uses configured tools.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The local file or configuration path where the recognition evidence is located. This is used to display and locate static clues, and is not a server-side downloadable URL.</p>
         * 
         * <strong>example:</strong>
         * <p>/opt/example-agent/package.json</p>
         */
        @NameInMap("source_path")
        public String sourcePath;

        public static TypedAIAssetRecognitionEvidenceAgentDeclaration build(java.util.Map<String, ?> map) throws Exception {
            TypedAIAssetRecognitionEvidenceAgentDeclaration self = new TypedAIAssetRecognitionEvidenceAgentDeclaration();
            return TeaModel.build(map, self);
        }

        public TypedAIAssetRecognitionEvidenceAgentDeclaration setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public TypedAIAssetRecognitionEvidenceAgentDeclaration setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

    }

    public static class TypedAIAssetRecognitionEvidenceAutonomousExecution extends TeaModel {
        /**
         * <p>The collected declaration text related to the recognition basis. This is currently used mainly for agent_declaration, and other recognition evidence may not return content. This should not be interpreted as an actual execution log.</p>
         * 
         * <strong>example:</strong>
         * <p>An AI agent that plans tasks and uses configured tools.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The local file or configuration path where the recognition evidence is located. This is used to display and locate static clues, and is not a server-side downloadable URL.</p>
         * 
         * <strong>example:</strong>
         * <p>/opt/example-agent/package.json</p>
         */
        @NameInMap("source_path")
        public String sourcePath;

        public static TypedAIAssetRecognitionEvidenceAutonomousExecution build(java.util.Map<String, ?> map) throws Exception {
            TypedAIAssetRecognitionEvidenceAutonomousExecution self = new TypedAIAssetRecognitionEvidenceAutonomousExecution();
            return TeaModel.build(map, self);
        }

        public TypedAIAssetRecognitionEvidenceAutonomousExecution setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public TypedAIAssetRecognitionEvidenceAutonomousExecution setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

    }

    public static class TypedAIAssetRecognitionEvidenceModelCall extends TeaModel {
        /**
         * <p>The collected declaration text related to the recognition basis. This is currently used mainly for agent_declaration, and other recognition evidence may not return content. This should not be interpreted as an actual execution log.</p>
         * 
         * <strong>example:</strong>
         * <p>An AI agent that plans tasks and uses configured tools.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The local file or configuration path where the recognition evidence is located. This is used to display and locate static clues, and is not a server-side downloadable URL.</p>
         * 
         * <strong>example:</strong>
         * <p>/opt/example-agent/package.json</p>
         */
        @NameInMap("source_path")
        public String sourcePath;

        public static TypedAIAssetRecognitionEvidenceModelCall build(java.util.Map<String, ?> map) throws Exception {
            TypedAIAssetRecognitionEvidenceModelCall self = new TypedAIAssetRecognitionEvidenceModelCall();
            return TeaModel.build(map, self);
        }

        public TypedAIAssetRecognitionEvidenceModelCall setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public TypedAIAssetRecognitionEvidenceModelCall setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

    }

    public static class TypedAIAssetRecognitionEvidenceStateManagement extends TeaModel {
        /**
         * <p>The collected declaration text related to the recognition basis. This is currently used mainly for agent_declaration, and other recognition evidence may not return content. This should not be interpreted as an actual execution log.</p>
         * 
         * <strong>example:</strong>
         * <p>An AI agent that plans tasks and uses configured tools.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The local file or configuration path where the recognition evidence is located. This is used to display and locate static clues, and is not a server-side downloadable URL.</p>
         * 
         * <strong>example:</strong>
         * <p>/opt/example-agent/package.json</p>
         */
        @NameInMap("source_path")
        public String sourcePath;

        public static TypedAIAssetRecognitionEvidenceStateManagement build(java.util.Map<String, ?> map) throws Exception {
            TypedAIAssetRecognitionEvidenceStateManagement self = new TypedAIAssetRecognitionEvidenceStateManagement();
            return TeaModel.build(map, self);
        }

        public TypedAIAssetRecognitionEvidenceStateManagement setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public TypedAIAssetRecognitionEvidenceStateManagement setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

    }

    public static class TypedAIAssetRecognitionEvidenceToolCall extends TeaModel {
        /**
         * <p>The collected declaration text related to the recognition basis. This is currently used mainly for agent_declaration, and other recognition evidence may not return content. This should not be interpreted as an actual execution log.</p>
         * 
         * <strong>example:</strong>
         * <p>An AI agent that plans tasks and uses configured tools.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The local file or configuration path where the recognition evidence is located. This is used to display and locate static clues, and is not a server-side downloadable URL.</p>
         * 
         * <strong>example:</strong>
         * <p>/opt/example-agent/package.json</p>
         */
        @NameInMap("source_path")
        public String sourcePath;

        public static TypedAIAssetRecognitionEvidenceToolCall build(java.util.Map<String, ?> map) throws Exception {
            TypedAIAssetRecognitionEvidenceToolCall self = new TypedAIAssetRecognitionEvidenceToolCall();
            return TeaModel.build(map, self);
        }

        public TypedAIAssetRecognitionEvidenceToolCall setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public TypedAIAssetRecognitionEvidenceToolCall setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

    }

    public static class TypedAIAssetRecognitionEvidence extends TeaModel {
        /**
         * <p>The array of evidence for explicit declarations of agent roles, capabilities, or usage methods. The declaration content itself does not constitute security certification.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;source_path&quot;:&quot;/opt/example-agent/package.json&quot;,&quot;content&quot;:&quot;An AI agent that plans tasks and uses configured tools.&quot;}]</p>
         */
        @NameInMap("agent_declaration")
        public java.util.List<TypedAIAssetRecognitionEvidenceAgentDeclaration> agentDeclaration;

        /**
         * <p>The array of static evidence related to autonomous task execution or agent loops. This does not indicate that actual execution was observed during this scan.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;source_path&quot;:&quot;/opt/example-agent/agent.py&quot;}]</p>
         */
        @NameInMap("autonomous_execution")
        public java.util.List<TypedAIAssetRecognitionEvidenceAutonomousExecution> autonomousExecution;

        /**
         * <p>The array of static evidence related to model clients, requests, or configurations. This does not indicate that model requests were actually sent.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;source_path&quot;:&quot;/opt/example-agent/model.py&quot;}]</p>
         */
        @NameInMap("model_call")
        public java.util.List<TypedAIAssetRecognitionEvidenceModelCall> modelCall;

        /**
         * <p>The array of static evidence related to sessions, memory, or state management. This does not prove actual data persistence or runtime behavior.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;source_path&quot;:&quot;/opt/example-agent/session.py&quot;}]</p>
         */
        @NameInMap("state_management")
        public java.util.List<TypedAIAssetRecognitionEvidenceStateManagement> stateManagement;

        /**
         * <p>The array of static evidence related to tool declarations or code to invoke tools. This does not indicate that the tools were actually executed.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;source_path&quot;:&quot;/opt/example-agent/tools.py&quot;}]</p>
         */
        @NameInMap("tool_call")
        public java.util.List<TypedAIAssetRecognitionEvidenceToolCall> toolCall;

        public static TypedAIAssetRecognitionEvidence build(java.util.Map<String, ?> map) throws Exception {
            TypedAIAssetRecognitionEvidence self = new TypedAIAssetRecognitionEvidence();
            return TeaModel.build(map, self);
        }

        public TypedAIAssetRecognitionEvidence setAgentDeclaration(java.util.List<TypedAIAssetRecognitionEvidenceAgentDeclaration> agentDeclaration) {
            this.agentDeclaration = agentDeclaration;
            return this;
        }
        public java.util.List<TypedAIAssetRecognitionEvidenceAgentDeclaration> getAgentDeclaration() {
            return this.agentDeclaration;
        }

        public TypedAIAssetRecognitionEvidence setAutonomousExecution(java.util.List<TypedAIAssetRecognitionEvidenceAutonomousExecution> autonomousExecution) {
            this.autonomousExecution = autonomousExecution;
            return this;
        }
        public java.util.List<TypedAIAssetRecognitionEvidenceAutonomousExecution> getAutonomousExecution() {
            return this.autonomousExecution;
        }

        public TypedAIAssetRecognitionEvidence setModelCall(java.util.List<TypedAIAssetRecognitionEvidenceModelCall> modelCall) {
            this.modelCall = modelCall;
            return this;
        }
        public java.util.List<TypedAIAssetRecognitionEvidenceModelCall> getModelCall() {
            return this.modelCall;
        }

        public TypedAIAssetRecognitionEvidence setStateManagement(java.util.List<TypedAIAssetRecognitionEvidenceStateManagement> stateManagement) {
            this.stateManagement = stateManagement;
            return this;
        }
        public java.util.List<TypedAIAssetRecognitionEvidenceStateManagement> getStateManagement() {
            return this.stateManagement;
        }

        public TypedAIAssetRecognitionEvidence setToolCall(java.util.List<TypedAIAssetRecognitionEvidenceToolCall> toolCall) {
            this.toolCall = toolCall;
            return this;
        }
        public java.util.List<TypedAIAssetRecognitionEvidenceToolCall> getToolCall() {
            return this.toolCall;
        }

    }

    public static class TypedAIAssetRiskInfo extends TeaModel {
        /**
         * <p>The number of high-risk items in the currently saved detection results. This is interpreted as an actual count only when detection results are available.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("highRiskCnt")
        public Long highRiskCnt;

        /**
         * <p>The number of low-risk items in the currently saved detection results. A value of zero indicates no low-risk items in the results but does not indicate overall security.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("lowRiskCnt")
        public Long lowRiskCnt;

        /**
         * <p>The number of medium-risk items in the currently saved detection results. A value of zero indicates no medium-risk items in the results but does not indicate the absence of other risks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("mediumRiskCnt")
        public Long mediumRiskCnt;

        public static TypedAIAssetRiskInfo build(java.util.Map<String, ?> map) throws Exception {
            TypedAIAssetRiskInfo self = new TypedAIAssetRiskInfo();
            return TeaModel.build(map, self);
        }

        public TypedAIAssetRiskInfo setHighRiskCnt(Long highRiskCnt) {
            this.highRiskCnt = highRiskCnt;
            return this;
        }
        public Long getHighRiskCnt() {
            return this.highRiskCnt;
        }

        public TypedAIAssetRiskInfo setLowRiskCnt(Long lowRiskCnt) {
            this.lowRiskCnt = lowRiskCnt;
            return this;
        }
        public Long getLowRiskCnt() {
            return this.lowRiskCnt;
        }

        public TypedAIAssetRiskInfo setMediumRiskCnt(Long mediumRiskCnt) {
            this.mediumRiskCnt = mediumRiskCnt;
            return this;
        }
        public Long getMediumRiskCnt() {
            return this.mediumRiskCnt;
        }

    }

}
