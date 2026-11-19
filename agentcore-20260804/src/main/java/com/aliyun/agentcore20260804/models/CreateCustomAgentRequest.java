// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateCustomAgentRequest extends TeaModel {
    /**
     * <p>The JSON configuration of the custom code or image agent. You must specify name, artifact, roleArn, and runtime.</p>
     */
    @NameInMap("body")
    public CreateCustomAgentRequestBody body;

    /**
     * <p>The idempotency token passed as a query parameter. This parameter is required when you explicitly submit a customImage or set container.type to custom. It is optional when you submit an ACR image or a code package. The token must be 1 to 128 characters in length and can contain letters, digits, periods, underscores, colons, and hyphens. Reuse the same token for retries of the same submission. If you use the same token for different parameters, the request is rejected.</p>
     * 
     * <strong>example:</strong>
     * <p>custom-agent-request-20261010-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateCustomAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomAgentRequest self = new CreateCustomAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomAgentRequest setBody(CreateCustomAgentRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomAgentRequestBody getBody() {
        return this.body;
    }

    public CreateCustomAgentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateCustomAgentRequestBodyAgenticFsMounts extends TeaModel {
        /**
         * <p>The absolute mount path within the container, such as /data/train. Mount targets cannot be duplicated or form parent-child directory overrides, and must avoid platform reserved directories.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/agenticfs/data</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>The existing non-empty relative directory under the AccessPoint. This field is required for each mount item. Root directories, absolute paths, and parent directory traversals are not allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace/data</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>Specifies whether the mount is read-only. true indicates read-only, and false indicates read and write. If omitted, the default value is false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        /**
         * <p>The AccessPoint domain name. This field is required for each mount item and validated by the backend. Use the DomainName from the NAS ListAccessPoints response. Do not include the protocol, port, or path.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-0123456789abcdef0.0123456789-vlm36.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("server")
        public String server;

        public static CreateCustomAgentRequestBodyAgenticFsMounts build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBodyAgenticFsMounts self = new CreateCustomAgentRequestBodyAgenticFsMounts();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestBodyAgenticFsMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public CreateCustomAgentRequestBodyAgenticFsMounts setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateCustomAgentRequestBodyAgenticFsMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public CreateCustomAgentRequestBodyAgenticFsMounts setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

    }

    public static class CreateCustomAgentRequestBodyArtifactCode extends TeaModel {
        /**
         * <p>The startup command for the code package. This parameter is required in code package mode. The working directory is the extracted code root directory /code, such as python main.py. Quotes and escapes are supported. Environment variables, pipes, and logical operations are not automatically expanded. Use scripts within the package for complex commands.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>python main.py</p>
         */
        @NameInMap("entrypoint")
        public String entrypoint;

        /**
         * <p>The identifier of the code runtime environment, such as python3.12. When creating or switching environments, use the identifier returned by ListAgentCodeRuntimes. The identifier is validated by the current version catalog and is not a fixed enum.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>python3.12</p>
         */
        @NameInMap("languageRuntime")
        public String languageRuntime;

        /**
         * <p>The source URI of the code package. OSS URIs (oss://) and HTTPS object URLs of a standard OSS public domain name (including OSS signed URLs) are supported. External sites, custom domain names, and extra authentication request headers are not supported. For local uploads, use the sourceUri returned by GetAgentCodePackageUploadUrl. The URI is revalidated and transferred during creation or update. A fixed oss:// URI of the platform is returned after saving and can be reused for regular updates.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://my-agent-bucket/packages/main.zip</p>
         */
        @NameInMap("sourceUri")
        public String sourceUri;

        public static CreateCustomAgentRequestBodyArtifactCode build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBodyArtifactCode self = new CreateCustomAgentRequestBodyArtifactCode();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestBodyArtifactCode setEntrypoint(String entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public String getEntrypoint() {
            return this.entrypoint;
        }

        public CreateCustomAgentRequestBodyArtifactCode setLanguageRuntime(String languageRuntime) {
            this.languageRuntime = languageRuntime;
            return this;
        }
        public String getLanguageRuntime() {
            return this.languageRuntime;
        }

        public CreateCustomAgentRequestBodyArtifactCode setSourceUri(String sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }
        public String getSourceUri() {
            return this.sourceUri;
        }

    }

    public static class CreateCustomAgentRequestBodyArtifactContainer extends TeaModel {
        /**
         * <p>The optional image startup command. If specified, it must be a non-empty string. If omitted, the default startup method of the image is used.</p>
         * 
         * <strong>example:</strong>
         * <p>python app.py</p>
         */
        @NameInMap("entrypoint")
        public String entrypoint;

        /**
         * <p>The ID of the ACR instance to which the image repository belongs. This parameter cannot be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-a1b2c3d4e5f6</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The namespace to which the ACR image repository belongs. This parameter cannot be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The name of the image repository in the ACR namespace. This parameter cannot be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>chat-agent</p>
         */
        @NameInMap("repo")
        public String repo;

        /**
         * <p>The image tag used for deployment. This parameter cannot be empty. When updating the tag, you must also provide artifact.port and other required image fields.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The image source type. acr indicates an ACR image, and custom indicates a custom image source. For the corresponding source configurations, refer to the descriptions of artifact.container and customImage.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acr</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateCustomAgentRequestBodyArtifactContainer build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBodyArtifactContainer self = new CreateCustomAgentRequestBodyArtifactContainer();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestBodyArtifactContainer setEntrypoint(String entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public String getEntrypoint() {
            return this.entrypoint;
        }

        public CreateCustomAgentRequestBodyArtifactContainer setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateCustomAgentRequestBodyArtifactContainer setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateCustomAgentRequestBodyArtifactContainer setRepo(String repo) {
            this.repo = repo;
            return this;
        }
        public String getRepo() {
            return this.repo;
        }

        public CreateCustomAgentRequestBodyArtifactContainer setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public CreateCustomAgentRequestBodyArtifactContainer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateCustomAgentRequestBodyArtifact extends TeaModel {
        /**
         * <p>The code package deployment configuration. This parameter is mutually exclusive with container. You must provide sourceUri, languageRuntime, and entrypoint, and specify artifact.port. ZIP and TAR.GZ formats are supported. Dependencies must be included in the package by the caller.</p>
         */
        @NameInMap("code")
        public CreateCustomAgentRequestBodyArtifactCode code;

        /**
         * <p>The container image deployment configuration. This parameter is mutually exclusive with code. For ACR sources, specify type=acr, instanceId, namespace, repo, and tag. For custom sources, specify type=custom and provide the complete customImage.</p>
         */
        @NameInMap("container")
        public CreateCustomAgentRequestBodyArtifactContainer container;

        /**
         * <p>The TCP port listened on by the agent service. Valid values: 1 to 65535.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        public static CreateCustomAgentRequestBodyArtifact build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBodyArtifact self = new CreateCustomAgentRequestBodyArtifact();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestBodyArtifact setCode(CreateCustomAgentRequestBodyArtifactCode code) {
            this.code = code;
            return this;
        }
        public CreateCustomAgentRequestBodyArtifactCode getCode() {
            return this.code;
        }

        public CreateCustomAgentRequestBodyArtifact setContainer(CreateCustomAgentRequestBodyArtifactContainer container) {
            this.container = container;
            return this;
        }
        public CreateCustomAgentRequestBodyArtifactContainer getContainer() {
            return this.container;
        }

        public CreateCustomAgentRequestBodyArtifact setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class CreateCustomAgentRequestBodyCustomImagePullNetwork extends TeaModel {
        /**
         * <p>The vSwitch ID. This field is required when type is vpc. The vSwitch must belong to the selected VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-example</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <p>The pull network type. This field is required when submitting pullNetwork and is validated by the backend. The default value for new creations is public. It is independent of the agent runtime network.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The vSwitch ID. This field is required when type is vpc. The vSwitch must belong to the selected VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-example</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID. This field is required when type is vpc. The associated account and region are validated by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-example</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static CreateCustomAgentRequestBodyCustomImagePullNetwork build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBodyCustomImagePullNetwork self = new CreateCustomAgentRequestBodyCustomImagePullNetwork();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestBodyCustomImagePullNetwork setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateCustomAgentRequestBodyCustomImagePullNetwork setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateCustomAgentRequestBodyCustomImagePullNetwork setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateCustomAgentRequestBodyCustomImagePullNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class CreateCustomAgentRequestBodyCustomImage extends TeaModel {
        /**
         * <p>The image address. This field is required when submitting customImage and is validated by the backend. Specify the complete registry[:port]/repository:tag or registry[:port]/repository@sha256:digest. Multi-level paths are supported. Do not include the protocol or user information.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.example.com/team/agent:v1</p>
         */
        @NameInMap("image")
        public String image;

        /**
         * <p>The password or token for the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>example-registry-token</p>
         */
        @NameInMap("password")
        public String password;

        /**
         * <p>The image pull network configuration. This field is required when submitting customImage and is validated by the backend. Specify the complete independent pull network configuration. For the Internet, only pass type=public.</p>
         */
        @NameInMap("pullNetwork")
        public CreateCustomAgentRequestBodyCustomImagePullNetwork pullNetwork;

        /**
         * <p>Specifies whether to skip HTTPS certificate verification.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("skipTlsVerify")
        public Boolean skipTlsVerify;

        /**
         * <p>The username for the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>reader</p>
         */
        @NameInMap("username")
        public String username;

        public static CreateCustomAgentRequestBodyCustomImage build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBodyCustomImage self = new CreateCustomAgentRequestBodyCustomImage();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestBodyCustomImage setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public CreateCustomAgentRequestBodyCustomImage setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateCustomAgentRequestBodyCustomImage setPullNetwork(CreateCustomAgentRequestBodyCustomImagePullNetwork pullNetwork) {
            this.pullNetwork = pullNetwork;
            return this;
        }
        public CreateCustomAgentRequestBodyCustomImagePullNetwork getPullNetwork() {
            return this.pullNetwork;
        }

        public CreateCustomAgentRequestBodyCustomImage setSkipTlsVerify(Boolean skipTlsVerify) {
            this.skipTlsVerify = skipTlsVerify;
            return this;
        }
        public Boolean getSkipTlsVerify() {
            return this.skipTlsVerify;
        }

        public CreateCustomAgentRequestBodyCustomImage setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class CreateCustomAgentRequestBodyEnvironmentVariables extends TeaModel {
        /**
         * <p>The name of the environment variable. This parameter cannot be empty and must be unique within the current environment variable list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LOG_LEVEL</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The value of the environment variable. This parameter must be a string. Empty strings are allowed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>info</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateCustomAgentRequestBodyEnvironmentVariables build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBodyEnvironmentVariables self = new CreateCustomAgentRequestBodyEnvironmentVariables();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestBodyEnvironmentVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateCustomAgentRequestBodyEnvironmentVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateCustomAgentRequestBodyEnvironment extends TeaModel {
        /**
         * <p>The list of environment variables. Each item includes a name and a value. The entire list is replaced during an update.</p>
         */
        @NameInMap("variables")
        public java.util.List<CreateCustomAgentRequestBodyEnvironmentVariables> variables;

        public static CreateCustomAgentRequestBodyEnvironment build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBodyEnvironment self = new CreateCustomAgentRequestBodyEnvironment();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestBodyEnvironment setVariables(java.util.List<CreateCustomAgentRequestBodyEnvironmentVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<CreateCustomAgentRequestBodyEnvironmentVariables> getVariables() {
            return this.variables;
        }

    }

    public static class CreateCustomAgentRequestBodyHealthCheck extends TeaModel {
        /**
         * <p>This parameter does not take effect. Omit this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("healthyThreshold")
        @Deprecated
        public Integer healthyThreshold;

        /**
         * <p>The interval between two health checks, in seconds. This parameter must be a positive integer. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("intervalSeconds")
        public Integer intervalSeconds;

        /**
         * <p>The HTTP health check path. It must start with a forward slash (/). Default value: /healthz.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthz</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The port accessed for health checks. This parameter is required when health checks are configured. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The timeout period for a single health check, in seconds. This parameter must be a positive integer and less than intervalSeconds. Default value: 2.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("timeoutSeconds")
        public Integer timeoutSeconds;

        /**
         * <p>The number of consecutive health check failures required to mark the instance as unhealthy. This parameter must be a positive integer. Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("unhealthyThreshold")
        public Integer unhealthyThreshold;

        public static CreateCustomAgentRequestBodyHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBodyHealthCheck self = new CreateCustomAgentRequestBodyHealthCheck();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public CreateCustomAgentRequestBodyHealthCheck setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public CreateCustomAgentRequestBodyHealthCheck setIntervalSeconds(Integer intervalSeconds) {
            this.intervalSeconds = intervalSeconds;
            return this;
        }
        public Integer getIntervalSeconds() {
            return this.intervalSeconds;
        }

        public CreateCustomAgentRequestBodyHealthCheck setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateCustomAgentRequestBodyHealthCheck setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateCustomAgentRequestBodyHealthCheck setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public CreateCustomAgentRequestBodyHealthCheck setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

    }

    public static class CreateCustomAgentRequestBodyLoggingSls extends TeaModel {
        /**
         * <p>The name of the Simple Log Service Logstore that receives agent logs.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-runtime</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>The name of the Simple Log Service project that receives agent logs.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-logs</p>
         */
        @NameInMap("project")
        public String project;

        public static CreateCustomAgentRequestBodyLoggingSls build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBodyLoggingSls self = new CreateCustomAgentRequestBodyLoggingSls();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestBodyLoggingSls setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public CreateCustomAgentRequestBodyLoggingSls setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class CreateCustomAgentRequestBodyLogging extends TeaModel {
        /**
         * <p>The Simple Log Service log delivery destination. When this object is configured, neither project nor logstore can be empty.</p>
         */
        @NameInMap("sls")
        public CreateCustomAgentRequestBodyLoggingSls sls;

        public static CreateCustomAgentRequestBodyLogging build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBodyLogging self = new CreateCustomAgentRequestBodyLogging();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestBodyLogging setSls(CreateCustomAgentRequestBodyLoggingSls sls) {
            this.sls = sls;
            return this;
        }
        public CreateCustomAgentRequestBodyLoggingSls getSls() {
            return this.sls;
        }

    }

    public static class CreateCustomAgentRequestBodyNetworkAccessInternet extends TeaModel {
        /**
         * <p>Specifies whether to allow the agent to access the Internet. A Boolean value must be provided when accessInternet is configured. For this setting to take effect, the workspace must also allow Internet access.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static CreateCustomAgentRequestBodyNetworkAccessInternet build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBodyNetworkAccessInternet self = new CreateCustomAgentRequestBodyNetworkAccessInternet();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestBodyNetworkAccessInternet setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class CreateCustomAgentRequestBodyNetworkAccessVpc extends TeaModel {
        /**
         * <p>Specifies whether to allow the agent to access the user VPC configured for the workspace. A Boolean value must be provided when accessVpc is configured. For this setting to take effect, the workspace must also allow VPC access.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static CreateCustomAgentRequestBodyNetworkAccessVpc build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBodyNetworkAccessVpc self = new CreateCustomAgentRequestBodyNetworkAccessVpc();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestBodyNetworkAccessVpc setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class CreateCustomAgentRequestBodyNetwork extends TeaModel {
        /**
         * <p>The Internet access configuration. If this access item is omitted, Internet access is not restricted on the agent side. However, the workspace must still allow Internet access.</p>
         */
        @NameInMap("accessInternet")
        public CreateCustomAgentRequestBodyNetworkAccessInternet accessInternet;

        /**
         * <p>The user VPC access configuration. If this access item is omitted, VPC access is not restricted on the agent side. However, the workspace must still be configured to allow access to the user VPC.</p>
         */
        @NameInMap("accessVpc")
        public CreateCustomAgentRequestBodyNetworkAccessVpc accessVpc;

        public static CreateCustomAgentRequestBodyNetwork build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBodyNetwork self = new CreateCustomAgentRequestBodyNetwork();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestBodyNetwork setAccessInternet(CreateCustomAgentRequestBodyNetworkAccessInternet accessInternet) {
            this.accessInternet = accessInternet;
            return this;
        }
        public CreateCustomAgentRequestBodyNetworkAccessInternet getAccessInternet() {
            return this.accessInternet;
        }

        public CreateCustomAgentRequestBodyNetwork setAccessVpc(CreateCustomAgentRequestBodyNetworkAccessVpc accessVpc) {
            this.accessVpc = accessVpc;
            return this;
        }
        public CreateCustomAgentRequestBodyNetworkAccessVpc getAccessVpc() {
            return this.accessVpc;
        }

    }

    public static class CreateCustomAgentRequestBodyObservability extends TeaModel {
        /**
         * <p>Specifies whether to enable agent observability.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static CreateCustomAgentRequestBodyObservability build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBodyObservability self = new CreateCustomAgentRequestBodyObservability();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestBodyObservability setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class CreateCustomAgentRequestBodyOssMounts extends TeaModel {
        /**
         * <p>The name of the OSS bucket. This parameter is required for each mount. The name must be 3 to 63 characters in length and can contain only lowercase letters, digits, and hyphens. It cannot start or end with a hyphen.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-data</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The absolute mount path within the container, such as /data/train. Mount targets cannot be duplicated or form parent-child directory overrides, and must avoid platform reserved directories.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/oss/train</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>The non-empty relative object directory prefix in the bucket. This parameter is required for each mount. Root directory and parent directory traversal are not allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>datasets/train</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>Specifies whether the mount is read-only. true indicates read-only, and false indicates read and write. If omitted, the default value is false.</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        public static CreateCustomAgentRequestBodyOssMounts build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBodyOssMounts self = new CreateCustomAgentRequestBodyOssMounts();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestBodyOssMounts setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public CreateCustomAgentRequestBodyOssMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public CreateCustomAgentRequestBodyOssMounts setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateCustomAgentRequestBodyOssMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class CreateCustomAgentRequestBodyProtocolPaths extends TeaModel {
        /**
         * <p>The description of the current API path.</p>
         * 
         * <strong>example:</strong>
         * <p>AG-UI chat API</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The non-empty API path for the current protocol.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/agui</p>
         */
        @NameInMap("name")
        public String name;

        public static CreateCustomAgentRequestBodyProtocolPaths build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBodyProtocolPaths self = new CreateCustomAgentRequestBodyProtocolPaths();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestBodyProtocolPaths setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateCustomAgentRequestBodyProtocolPaths setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateCustomAgentRequestBodyProtocol extends TeaModel {
        /**
         * <p>The request header configuration for the current protocol. The key is a non-empty request header name, and the value must be a string.</p>
         */
        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        /**
         * <p>The list of API paths for the current protocol.</p>
         */
        @NameInMap("paths")
        public java.util.List<CreateCustomAgentRequestBodyProtocolPaths> paths;

        /**
         * <p>The Protocol Type of the invoke protocol. Valid values: agui: AG-UI protocol. openai-chat-completion: OpenAI Chat Completions compatible protocol. custom: custom protocol.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agui</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateCustomAgentRequestBodyProtocol build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBodyProtocol self = new CreateCustomAgentRequestBodyProtocol();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestBodyProtocol setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public CreateCustomAgentRequestBodyProtocol setPaths(java.util.List<CreateCustomAgentRequestBodyProtocolPaths> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<CreateCustomAgentRequestBodyProtocolPaths> getPaths() {
            return this.paths;
        }

        public CreateCustomAgentRequestBodyProtocol setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateCustomAgentRequestBodyRuntimeCompute extends TeaModel {
        /**
         * <p>The compute specification. Valid values:</p>
         * <ul>
         * <li>INTERACTIVE: 1 vCPU and 2 GiB of memory.</li>
         * <li>STANDARD: 2 vCPUs and 4 GiB of memory.</li>
         * <li>HEAVY: 4 vCPUs and 8 GiB of memory.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("computeClass")
        public String computeClass;

        public static CreateCustomAgentRequestBodyRuntimeCompute build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBodyRuntimeCompute self = new CreateCustomAgentRequestBodyRuntimeCompute();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestBodyRuntimeCompute setComputeClass(String computeClass) {
            this.computeClass = computeClass;
            return this;
        }
        public String getComputeClass() {
            return this.computeClass;
        }

    }

    public static class CreateCustomAgentRequestBodyRuntimeHpa extends TeaModel {
        /**
         * <p>Specifies whether to enable auto scaling. Default value: false.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The maximum number of concurrent sessions allowed per instance. Valid values: 1 to 20. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("maxConcurrentSessionsPerSandbox")
        public Integer maxConcurrentSessionsPerSandbox;

        /**
         * <p>The maximum number of instances. Valid values: 0 to 100. Default value: 10. This value cannot be less than minSandboxCount.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxSandboxCount")
        public Integer maxSandboxCount;

        /**
         * <p>The minimum number of instances. Valid values: 0 to 100. Default value: 1. This value cannot be greater than maxSandboxCount.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minSandboxCount")
        public Integer minSandboxCount;

        /**
         * <p>The maximum idle time for a session, in seconds. Valid values: 60 to 86400. Default value: 600.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("sessionTtlSeconds")
        public Integer sessionTtlSeconds;

        public static CreateCustomAgentRequestBodyRuntimeHpa build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBodyRuntimeHpa self = new CreateCustomAgentRequestBodyRuntimeHpa();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestBodyRuntimeHpa setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateCustomAgentRequestBodyRuntimeHpa setMaxConcurrentSessionsPerSandbox(Integer maxConcurrentSessionsPerSandbox) {
            this.maxConcurrentSessionsPerSandbox = maxConcurrentSessionsPerSandbox;
            return this;
        }
        public Integer getMaxConcurrentSessionsPerSandbox() {
            return this.maxConcurrentSessionsPerSandbox;
        }

        public CreateCustomAgentRequestBodyRuntimeHpa setMaxSandboxCount(Integer maxSandboxCount) {
            this.maxSandboxCount = maxSandboxCount;
            return this;
        }
        public Integer getMaxSandboxCount() {
            return this.maxSandboxCount;
        }

        public CreateCustomAgentRequestBodyRuntimeHpa setMinSandboxCount(Integer minSandboxCount) {
            this.minSandboxCount = minSandboxCount;
            return this;
        }
        public Integer getMinSandboxCount() {
            return this.minSandboxCount;
        }

        public CreateCustomAgentRequestBodyRuntimeHpa setSessionTtlSeconds(Integer sessionTtlSeconds) {
            this.sessionTtlSeconds = sessionTtlSeconds;
            return this;
        }
        public Integer getSessionTtlSeconds() {
            return this.sessionTtlSeconds;
        }

    }

    public static class CreateCustomAgentRequestBodyRuntimeSessionPolicy extends TeaModel {
        /**
         * <p>The name of the request header for session identification. This parameter is required when type is set to ISOLATED_HEADER_FIELD and must be a valid HTTP request header name. Do not specify this parameter for other policies.</p>
         * 
         * <strong>example:</strong>
         * <p>X-Session-Id</p>
         */
        @NameInMap("headerName")
        public String headerName;

        /**
         * <p>The session policy type. Valid values:</p>
         * <ul>
         * <li>AFFINITY: Session affinity.</li>
         * <li>ISOLATED_HEADER_FIELD: Associates sessions by using the request header specified in headerName.</li>
         * <li>ISOLATED_COOKIE: Not recommended.</li>
         * <li>DISABLED: A compatibility option. The response returns AFFINITY.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AFFINITY</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateCustomAgentRequestBodyRuntimeSessionPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBodyRuntimeSessionPolicy self = new CreateCustomAgentRequestBodyRuntimeSessionPolicy();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestBodyRuntimeSessionPolicy setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public CreateCustomAgentRequestBodyRuntimeSessionPolicy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateCustomAgentRequestBodyRuntime extends TeaModel {
        /**
         * <p>The compute resource configuration for the agent runtime instance.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("compute")
        public CreateCustomAgentRequestBodyRuntimeCompute compute;

        /**
         * <p>The scaling and session configuration. Omitted fields use default values. To retain the original policy during an update, submit the complete hpa object or omit the entire runtime object.</p>
         */
        @NameInMap("hpa")
        public CreateCustomAgentRequestBodyRuntimeHpa hpa;

        /**
         * <p>The session policy configuration used to set the session association method for requests.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("sessionPolicy")
        public CreateCustomAgentRequestBodyRuntimeSessionPolicy sessionPolicy;

        public static CreateCustomAgentRequestBodyRuntime build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBodyRuntime self = new CreateCustomAgentRequestBodyRuntime();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestBodyRuntime setCompute(CreateCustomAgentRequestBodyRuntimeCompute compute) {
            this.compute = compute;
            return this;
        }
        public CreateCustomAgentRequestBodyRuntimeCompute getCompute() {
            return this.compute;
        }

        public CreateCustomAgentRequestBodyRuntime setHpa(CreateCustomAgentRequestBodyRuntimeHpa hpa) {
            this.hpa = hpa;
            return this;
        }
        public CreateCustomAgentRequestBodyRuntimeHpa getHpa() {
            return this.hpa;
        }

        public CreateCustomAgentRequestBodyRuntime setSessionPolicy(CreateCustomAgentRequestBodyRuntimeSessionPolicy sessionPolicy) {
            this.sessionPolicy = sessionPolicy;
            return this;
        }
        public CreateCustomAgentRequestBodyRuntimeSessionPolicy getSessionPolicy() {
            return this.sessionPolicy;
        }

    }

    public static class CreateCustomAgentRequestBody extends TeaModel {
        /**
         * <p>The inbound access mode.</p>
         * 
         * <strong>example:</strong>
         * <p>API_KEY</p>
         */
        @NameInMap("accessMode")
        public String accessMode;

        /**
         * <p>The user access scope.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("accessScope")
        public String accessScope;

        /**
         * <p>The NAS storage mount configuration. Currently, only the AgenticFS type is supported. It is used to mount file directories from access points to agent runtime instances. This is a list of AgenticFS directory mounts. The total number of items in this list and ossMounts cannot exceed 10. If omitted or set to [] during creation, no mounts are configured. During an update, omitting the field retains the existing mounts, and [] clears the mounts. Null is not accepted.</p>
         */
        @NameInMap("agenticFsMounts")
        public java.util.List<CreateCustomAgentRequestBodyAgenticFsMounts> agenticFsMounts;

        /**
         * <p>The artifact deployment configuration. You must specify the service listening port and choose either code or container as the deployment method.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("artifact")
        public CreateCustomAgentRequestBodyArtifact artifact;

        /**
         * <p>The source of the custom image. This field is required when artifact.container.type is custom. Omit this field for other sources.</p>
         */
        @NameInMap("customImage")
        public CreateCustomAgentRequestBodyCustomImage customImage;

        /**
         * <p>The description of the agent purpose. The maximum length is 1024 characters after leading and trailing spaces are removed.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom agent that provides conversation services</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The environment variable configuration passed to the agent runtime process.</p>
         */
        @NameInMap("environment")
        public CreateCustomAgentRequestBodyEnvironment environment;

        /**
         * <p>The optional HTTP health check configuration. If this object is provided, port must be specified. Unspecified items use default values. Omitting this object during creation means no health check is configured. During an update, omitting this top-level field retains the original configuration, while passing null removes the health check.</p>
         */
        @NameInMap("healthCheck")
        public CreateCustomAgentRequestBodyHealthCheck healthCheck;

        /**
         * <p>The log delivery configuration for the agent. You can specify the Simple Log Service project and Logstore. After a successful creation or update, verify whether logs are delivered properly.</p>
         */
        @NameInMap("logging")
        public CreateCustomAgentRequestBodyLogging logging;

        /**
         * <p>The name of the custom code or image agent. The length is 1 to 128 characters after leading and trailing spaces are removed. The name must be unique within the same workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-custom-agent</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The network access configuration for the agent. If this object is provided, omitted access items are treated as allowed. The actual accessible range is still restricted by the workspace network configuration. To retain the original restrictions during an update, specify both accessInternet and accessVpc.</p>
         */
        @NameInMap("network")
        public CreateCustomAgentRequestBodyNetwork network;

        /**
         * <p>The high-code agent observability configuration.</p>
         */
        @NameInMap("observability")
        public CreateCustomAgentRequestBodyObservability observability;

        /**
         * <p>The list of OSS directory mounts. You can specify a combined maximum of 10 items for OSS and agenticFsMounts. When you update this parameter, the entire list is replaced. Pass an empty array [] to clear the list.</p>
         */
        @NameInMap("ossMounts")
        public java.util.List<CreateCustomAgentRequestBodyOssMounts> ossMounts;

        /**
         * <p>The list of invocation protocols supported by the agent. Each item includes the protocol type, and optional paths and request headers. When you update this parameter, the entire list is replaced.</p>
         */
        @NameInMap("protocol")
        public java.util.List<CreateCustomAgentRequestBodyProtocol> protocol;

        /**
         * <p>The ARN of the RAM role used by the agent to access user cloud resources. The role must have permissions to access the cloud resources.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1234567890123456:role/agentcore-runtime-role</p>
         */
        @NameInMap("roleArn")
        public String roleArn;

        /**
         * <p>The runtime configuration. You must provide both compute and sessionPolicy. Omitted fields in hpa use default values.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("runtime")
        public CreateCustomAgentRequestBodyRuntime runtime;

        /**
         * <p>Specifies whether to use the image cache. If omitted during creation, the default value is false. You can explicitly set it to true or false. The new contract rejects null and invalid types. Existing compatible endpoints handle this based on migration agreements. In the current phase, the custom source is normalized to false by the console. The frontend omits it, and explicit true is rejected. The platform copy is still retained.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("useImageCache")
        public Boolean useImageCache;

        public static CreateCustomAgentRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentRequestBody self = new CreateCustomAgentRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentRequestBody setAccessMode(String accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public String getAccessMode() {
            return this.accessMode;
        }

        public CreateCustomAgentRequestBody setAccessScope(String accessScope) {
            this.accessScope = accessScope;
            return this;
        }
        public String getAccessScope() {
            return this.accessScope;
        }

        public CreateCustomAgentRequestBody setAgenticFsMounts(java.util.List<CreateCustomAgentRequestBodyAgenticFsMounts> agenticFsMounts) {
            this.agenticFsMounts = agenticFsMounts;
            return this;
        }
        public java.util.List<CreateCustomAgentRequestBodyAgenticFsMounts> getAgenticFsMounts() {
            return this.agenticFsMounts;
        }

        public CreateCustomAgentRequestBody setArtifact(CreateCustomAgentRequestBodyArtifact artifact) {
            this.artifact = artifact;
            return this;
        }
        public CreateCustomAgentRequestBodyArtifact getArtifact() {
            return this.artifact;
        }

        public CreateCustomAgentRequestBody setCustomImage(CreateCustomAgentRequestBodyCustomImage customImage) {
            this.customImage = customImage;
            return this;
        }
        public CreateCustomAgentRequestBodyCustomImage getCustomImage() {
            return this.customImage;
        }

        public CreateCustomAgentRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateCustomAgentRequestBody setEnvironment(CreateCustomAgentRequestBodyEnvironment environment) {
            this.environment = environment;
            return this;
        }
        public CreateCustomAgentRequestBodyEnvironment getEnvironment() {
            return this.environment;
        }

        public CreateCustomAgentRequestBody setHealthCheck(CreateCustomAgentRequestBodyHealthCheck healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public CreateCustomAgentRequestBodyHealthCheck getHealthCheck() {
            return this.healthCheck;
        }

        public CreateCustomAgentRequestBody setLogging(CreateCustomAgentRequestBodyLogging logging) {
            this.logging = logging;
            return this;
        }
        public CreateCustomAgentRequestBodyLogging getLogging() {
            return this.logging;
        }

        public CreateCustomAgentRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateCustomAgentRequestBody setNetwork(CreateCustomAgentRequestBodyNetwork network) {
            this.network = network;
            return this;
        }
        public CreateCustomAgentRequestBodyNetwork getNetwork() {
            return this.network;
        }

        public CreateCustomAgentRequestBody setObservability(CreateCustomAgentRequestBodyObservability observability) {
            this.observability = observability;
            return this;
        }
        public CreateCustomAgentRequestBodyObservability getObservability() {
            return this.observability;
        }

        public CreateCustomAgentRequestBody setOssMounts(java.util.List<CreateCustomAgentRequestBodyOssMounts> ossMounts) {
            this.ossMounts = ossMounts;
            return this;
        }
        public java.util.List<CreateCustomAgentRequestBodyOssMounts> getOssMounts() {
            return this.ossMounts;
        }

        public CreateCustomAgentRequestBody setProtocol(java.util.List<CreateCustomAgentRequestBodyProtocol> protocol) {
            this.protocol = protocol;
            return this;
        }
        public java.util.List<CreateCustomAgentRequestBodyProtocol> getProtocol() {
            return this.protocol;
        }

        public CreateCustomAgentRequestBody setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public CreateCustomAgentRequestBody setRuntime(CreateCustomAgentRequestBodyRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public CreateCustomAgentRequestBodyRuntime getRuntime() {
            return this.runtime;
        }

        public CreateCustomAgentRequestBody setUseImageCache(Boolean useImageCache) {
            this.useImageCache = useImageCache;
            return this;
        }
        public Boolean getUseImageCache() {
            return this.useImageCache;
        }

    }

}
