// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateCustomAgentRequest extends TeaModel {
    /**
     * <p>The update configuration for the custom agent. Provide at least one top-level field. Omitted top-level fields retain their original values. When providing a configuration object, specify its required subfields and include any optional configurations that you want to retain. Arrays are replaced as a whole.</p>
     */
    @NameInMap("body")
    public UpdateCustomAgentRequestBody body;

    /**
     * <p>Idempotence is not currently guaranteed. Do not rely on this parameter to prevent duplicate requests.</p>
     * 
     * <strong>example:</strong>
     * <p>custom-agent-request-20261010-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateCustomAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomAgentRequest self = new UpdateCustomAgentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomAgentRequest setBody(UpdateCustomAgentRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomAgentRequestBody getBody() {
        return this.body;
    }

    public UpdateCustomAgentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateCustomAgentRequestBodyAgenticFsMounts extends TeaModel {
        /**
         * <p>The subdirectory under /mnt/agenticfs/ in the container. This field is required for each mount item. Mount targets must not be duplicated or form parent-child overrides.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/agenticfs/data</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>The existing non-empty relative directory under the access point. This field is required for each mount item. Root directories, absolute paths, and parent directory traversals are not allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace/data</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>Specifies whether the mount is read-only. A value of true indicates read-only, and a value of false indicates read and write. If this field is omitted, the default value is false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        /**
         * <p>The domain name of the access point. This field is required for each mount item. Use the DomainName value from the response of the NAS ListAccessPoints operation. Do not include the protocol, port, or path.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-0123456789abcdef0.0123456789-vlm36.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("server")
        public String server;

        public static UpdateCustomAgentRequestBodyAgenticFsMounts build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBodyAgenticFsMounts self = new UpdateCustomAgentRequestBodyAgenticFsMounts();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBodyAgenticFsMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public UpdateCustomAgentRequestBodyAgenticFsMounts setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateCustomAgentRequestBodyAgenticFsMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public UpdateCustomAgentRequestBodyAgenticFsMounts setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

    }

    public static class UpdateCustomAgentRequestBodyArtifactCode extends TeaModel {
        /**
         * <p>The startup command for the code package. This field is required in code package mode. The working directory is the extracted code root directory /code, such as python main.py. Quotes and escapes are supported. Environment variables, pipes, and logical operations are not automatically expanded. For complex commands, use scripts within the package.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>python main.py</p>
         */
        @NameInMap("entrypoint")
        public String entrypoint;

        /**
         * <p>The code runtime environment identifier, such as python3.12. When creating or switching environments, use the identifier returned by the ListAgentCodeRuntimes operation. The identifier is validated by the current version catalog and is not a fixed enumeration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>python3.12</p>
         */
        @NameInMap("languageRuntime")
        public String languageRuntime;

        /**
         * <p>The source address of the code package. This field supports oss:// addresses or HTTPS object addresses of standard OSS public domain names, including OSS signed URLs. Arbitrary external sites, custom domain names, and additional authentication request headers are not supported. After a local upload, use the sourceUri returned by the GetAgentCodePackageUploadUrl operation. The address is revalidated and transferred during creation or updates. After the transfer is saved, the platform returns a fixed oss:// address. This fixed address can be reused for regular updates.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://my-agent-bucket/packages/main.zip</p>
         */
        @NameInMap("sourceUri")
        public String sourceUri;

        public static UpdateCustomAgentRequestBodyArtifactCode build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBodyArtifactCode self = new UpdateCustomAgentRequestBodyArtifactCode();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBodyArtifactCode setEntrypoint(String entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public String getEntrypoint() {
            return this.entrypoint;
        }

        public UpdateCustomAgentRequestBodyArtifactCode setLanguageRuntime(String languageRuntime) {
            this.languageRuntime = languageRuntime;
            return this;
        }
        public String getLanguageRuntime() {
            return this.languageRuntime;
        }

        public UpdateCustomAgentRequestBodyArtifactCode setSourceUri(String sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }
        public String getSourceUri() {
            return this.sourceUri;
        }

    }

    public static class UpdateCustomAgentRequestBodyArtifactContainer extends TeaModel {
        /**
         * <p>The optional executable program and startup parameters. If specified, this field must be a non-empty string. When updating the artifact, omitting this field uses the default startup method of the image. To retain the original custom startup command, provide this field together.</p>
         * 
         * <strong>example:</strong>
         * <p>python app.py</p>
         */
        @NameInMap("entrypoint")
        public String entrypoint;

        /**
         * <p>The ID of the ACR instance to which the image repository belongs. This field cannot be empty.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-a1b2c3d4e5f6</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The namespace to which the ACR image repository belongs. This field cannot be empty.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The name of the image repository in the ACR namespace. This field cannot be empty.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>chat-agent</p>
         */
        @NameInMap("repo")
        public String repo;

        /**
         * <p>The image tag used for deployment. This field cannot be empty. When updating the tag, you must also provide artifact.port and other required image fields.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The image source type. Currently, only acr is supported, which indicates Alibaba Cloud Container Registry (ACR).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acr</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateCustomAgentRequestBodyArtifactContainer build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBodyArtifactContainer self = new UpdateCustomAgentRequestBodyArtifactContainer();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBodyArtifactContainer setEntrypoint(String entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public String getEntrypoint() {
            return this.entrypoint;
        }

        public UpdateCustomAgentRequestBodyArtifactContainer setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateCustomAgentRequestBodyArtifactContainer setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdateCustomAgentRequestBodyArtifactContainer setRepo(String repo) {
            this.repo = repo;
            return this;
        }
        public String getRepo() {
            return this.repo;
        }

        public UpdateCustomAgentRequestBodyArtifactContainer setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public UpdateCustomAgentRequestBodyArtifactContainer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateCustomAgentRequestBodyArtifact extends TeaModel {
        /**
         * <p>The code package deployment configuration. This field is mutually exclusive with the container field. Code packages use the ZIP or TAR.GZ format. Dependencies must be packaged by the user. The platform does not install dependencies or perform online builds.</p>
         */
        @NameInMap("code")
        public UpdateCustomAgentRequestBodyArtifactCode code;

        /**
         * <p>The ACR container image configuration. You must specify the type, instanceId, namespace, repo, and tag fields. Do not configure the code field at the same time.</p>
         */
        @NameInMap("container")
        public UpdateCustomAgentRequestBodyArtifactContainer container;

        /**
         * <p>The TCP port listened by the agent service. Valid values: 1 to 65535.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        public static UpdateCustomAgentRequestBodyArtifact build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBodyArtifact self = new UpdateCustomAgentRequestBodyArtifact();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBodyArtifact setCode(UpdateCustomAgentRequestBodyArtifactCode code) {
            this.code = code;
            return this;
        }
        public UpdateCustomAgentRequestBodyArtifactCode getCode() {
            return this.code;
        }

        public UpdateCustomAgentRequestBodyArtifact setContainer(UpdateCustomAgentRequestBodyArtifactContainer container) {
            this.container = container;
            return this;
        }
        public UpdateCustomAgentRequestBodyArtifactContainer getContainer() {
            return this.container;
        }

        public UpdateCustomAgentRequestBodyArtifact setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class UpdateCustomAgentRequestBodyEnvironmentVariables extends TeaModel {
        /**
         * <p>The name of the environment variable. This field cannot be empty and must be unique in the current environment variable list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LOG_LEVEL</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The value of the environment variable. This field must be a string. Empty strings are allowed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>info</p>
         */
        @NameInMap("value")
        public String value;

        public static UpdateCustomAgentRequestBodyEnvironmentVariables build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBodyEnvironmentVariables self = new UpdateCustomAgentRequestBodyEnvironmentVariables();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBodyEnvironmentVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateCustomAgentRequestBodyEnvironmentVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateCustomAgentRequestBodyEnvironment extends TeaModel {
        /**
         * <p>The list of environment variables. Each item includes a name and a value. This list is replaced as a whole during an update.</p>
         */
        @NameInMap("variables")
        public java.util.List<UpdateCustomAgentRequestBodyEnvironmentVariables> variables;

        public static UpdateCustomAgentRequestBodyEnvironment build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBodyEnvironment self = new UpdateCustomAgentRequestBodyEnvironment();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBodyEnvironment setVariables(java.util.List<UpdateCustomAgentRequestBodyEnvironmentVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<UpdateCustomAgentRequestBodyEnvironmentVariables> getVariables() {
            return this.variables;
        }

    }

    public static class UpdateCustomAgentRequestBodyHealthCheck extends TeaModel {
        /**
         * <p>This parameter currently does not take effect. Omit this field.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("healthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The interval between two health checks, in seconds. This field must be a positive integer. If this field is omitted, the default value is 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("intervalSeconds")
        public Integer intervalSeconds;

        /**
         * <p>The HTTP health check path. This field must start with a forward slash (/). If this field is omitted, the default value is /healthz.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthz</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The port accessed by the health check. This field is required when configuring a health check. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The timeout period for a single health check, in seconds. This field must be a positive integer and less than intervalSeconds. If this field is omitted, the default value is 2.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("timeoutSeconds")
        public Integer timeoutSeconds;

        /**
         * <p>The number of consecutive health check failures before the agent is considered unhealthy. This field must be a positive integer. If this field is omitted, the default value is 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("unhealthyThreshold")
        public Integer unhealthyThreshold;

        public static UpdateCustomAgentRequestBodyHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBodyHealthCheck self = new UpdateCustomAgentRequestBodyHealthCheck();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBodyHealthCheck setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public UpdateCustomAgentRequestBodyHealthCheck setIntervalSeconds(Integer intervalSeconds) {
            this.intervalSeconds = intervalSeconds;
            return this;
        }
        public Integer getIntervalSeconds() {
            return this.intervalSeconds;
        }

        public UpdateCustomAgentRequestBodyHealthCheck setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateCustomAgentRequestBodyHealthCheck setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateCustomAgentRequestBodyHealthCheck setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public UpdateCustomAgentRequestBodyHealthCheck setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

    }

    public static class UpdateCustomAgentRequestBodyLoggingSls extends TeaModel {
        /**
         * <p>The name of the SLS logstore that receives agent logs.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-runtime</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>The name of the SLS project that receives agent logs.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-logs</p>
         */
        @NameInMap("project")
        public String project;

        public static UpdateCustomAgentRequestBodyLoggingSls build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBodyLoggingSls self = new UpdateCustomAgentRequestBodyLoggingSls();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBodyLoggingSls setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public UpdateCustomAgentRequestBodyLoggingSls setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class UpdateCustomAgentRequestBodyLogging extends TeaModel {
        /**
         * <p>The SLS log delivery destination. When updating this object, you must provide both the project and logstore fields, and they cannot be empty.</p>
         */
        @NameInMap("sls")
        public UpdateCustomAgentRequestBodyLoggingSls sls;

        public static UpdateCustomAgentRequestBodyLogging build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBodyLogging self = new UpdateCustomAgentRequestBodyLogging();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBodyLogging setSls(UpdateCustomAgentRequestBodyLoggingSls sls) {
            this.sls = sls;
            return this;
        }
        public UpdateCustomAgentRequestBodyLoggingSls getSls() {
            return this.sls;
        }

    }

    public static class UpdateCustomAgentRequestBodyNetworkAccessInternet extends TeaModel {
        /**
         * <p>Specifies whether to allow the agent to access the Internet. When configuring accessInternet, you must provide a Boolean value. For this configuration to take effect, the workspace must also allow Internet access.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static UpdateCustomAgentRequestBodyNetworkAccessInternet build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBodyNetworkAccessInternet self = new UpdateCustomAgentRequestBodyNetworkAccessInternet();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBodyNetworkAccessInternet setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class UpdateCustomAgentRequestBodyNetworkAccessVpc extends TeaModel {
        /**
         * <p>Specifies whether to allow the agent to access the user VPC configured in the workspace. When configuring accessVpc, you must provide a Boolean value. For this configuration to take effect, the workspace must also allow VPC access.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static UpdateCustomAgentRequestBodyNetworkAccessVpc build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBodyNetworkAccessVpc self = new UpdateCustomAgentRequestBodyNetworkAccessVpc();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBodyNetworkAccessVpc setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class UpdateCustomAgentRequestBodyNetwork extends TeaModel {
        /**
         * <p>The Internet access configuration. When this access item is omitted, the agent does not restrict Internet access. However, the workspace must still allow Internet access.</p>
         */
        @NameInMap("accessInternet")
        public UpdateCustomAgentRequestBodyNetworkAccessInternet accessInternet;

        /**
         * <p>The user VPC access configuration. When this access item is omitted, the agent does not restrict VPC access. However, the workspace must still be configured to allow access to the user VPC.</p>
         */
        @NameInMap("accessVpc")
        public UpdateCustomAgentRequestBodyNetworkAccessVpc accessVpc;

        public static UpdateCustomAgentRequestBodyNetwork build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBodyNetwork self = new UpdateCustomAgentRequestBodyNetwork();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBodyNetwork setAccessInternet(UpdateCustomAgentRequestBodyNetworkAccessInternet accessInternet) {
            this.accessInternet = accessInternet;
            return this;
        }
        public UpdateCustomAgentRequestBodyNetworkAccessInternet getAccessInternet() {
            return this.accessInternet;
        }

        public UpdateCustomAgentRequestBodyNetwork setAccessVpc(UpdateCustomAgentRequestBodyNetworkAccessVpc accessVpc) {
            this.accessVpc = accessVpc;
            return this;
        }
        public UpdateCustomAgentRequestBodyNetworkAccessVpc getAccessVpc() {
            return this.accessVpc;
        }

    }

    public static class UpdateCustomAgentRequestBodyObservability extends TeaModel {
        /**
         * <p>Specifies whether to enable agent observability.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static UpdateCustomAgentRequestBodyObservability build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBodyObservability self = new UpdateCustomAgentRequestBodyObservability();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBodyObservability setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class UpdateCustomAgentRequestBodyOssMounts extends TeaModel {
        /**
         * <p>The name of the OSS bucket. This parameter is required for each mount item. The name must be 3 to 63 characters in length and can contain only lowercase letters, digits, and hyphens. It cannot start or end with a hyphen.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-data</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The subdirectory under /mnt/oss/ in the container. This parameter is required for each mount item. Mount targets must not be duplicated or form parent-child overlaps.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/oss/train</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>The non-empty object directory prefix in the bucket, such as datasets/train. Leading and trailing slashes are removed. The root directory is not supported. Do not use parent directory navigation.</p>
         * 
         * <strong>example:</strong>
         * <p>datasets/train</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>Specifies whether the mount is read-only. A value of true indicates read-only, and a value of false indicates read and write. If this field is omitted, the default value is false.</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        public static UpdateCustomAgentRequestBodyOssMounts build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBodyOssMounts self = new UpdateCustomAgentRequestBodyOssMounts();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBodyOssMounts setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public UpdateCustomAgentRequestBodyOssMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public UpdateCustomAgentRequestBodyOssMounts setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateCustomAgentRequestBodyOssMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class UpdateCustomAgentRequestBodyProtocolPaths extends TeaModel {
        /**
         * <p>The usage description of the current API path.</p>
         * 
         * <strong>example:</strong>
         * <p>AG-UI conversation API</p>
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

        public static UpdateCustomAgentRequestBodyProtocolPaths build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBodyProtocolPaths self = new UpdateCustomAgentRequestBodyProtocolPaths();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBodyProtocolPaths setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateCustomAgentRequestBodyProtocolPaths setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateCustomAgentRequestBodyProtocol extends TeaModel {
        /**
         * <p>The request header configuration for the current protocol. The key is a non-empty request header name, and the value must be a string.</p>
         */
        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        /**
         * <p>The list of API paths for the current protocol.</p>
         */
        @NameInMap("paths")
        public java.util.List<UpdateCustomAgentRequestBodyProtocolPaths> paths;

        /**
         * <p>The invocation protocol type. Valid values:</p>
         * <ul>
         * <li>agui: AG-UI protocol.</li>
         * <li>openai-chat-completion: OpenAI Chat Completions compatible protocol.</li>
         * <li>custom: Custom protocol.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agui</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateCustomAgentRequestBodyProtocol build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBodyProtocol self = new UpdateCustomAgentRequestBodyProtocol();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBodyProtocol setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public UpdateCustomAgentRequestBodyProtocol setPaths(java.util.List<UpdateCustomAgentRequestBodyProtocolPaths> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<UpdateCustomAgentRequestBodyProtocolPaths> getPaths() {
            return this.paths;
        }

        public UpdateCustomAgentRequestBodyProtocol setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateCustomAgentRequestBodyRuntimeCompute extends TeaModel {
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

        public static UpdateCustomAgentRequestBodyRuntimeCompute build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBodyRuntimeCompute self = new UpdateCustomAgentRequestBodyRuntimeCompute();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBodyRuntimeCompute setComputeClass(String computeClass) {
            this.computeClass = computeClass;
            return this;
        }
        public String getComputeClass() {
            return this.computeClass;
        }

    }

    public static class UpdateCustomAgentRequestBodyRuntimeHpa extends TeaModel {
        /**
         * <p>Specifies whether to enable elastic scaling. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.
         * Default value: false. This default value applies when runtime is provided and this field is omitted.</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The maximum number of concurrent sessions for a single runtime instance. Valid values: 1 to 100. When runtime is provided, omitting this field uses the default value of 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("maxConcurrentSessionsPerSandbox")
        public Integer maxConcurrentSessionsPerSandbox;

        /**
         * <p>The maximum number of runtime instances. Valid values: 1 to 100. The value cannot be less than minSandboxCount. When runtime is provided, omitting this field uses the default value of 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxSandboxCount")
        public Integer maxSandboxCount;

        /**
         * <p>The minimum number of runtime instances. Valid values: 1 to 100. The value cannot be greater than maxSandboxCount. When runtime is provided, omitting this field uses the default value of 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minSandboxCount")
        public Integer minSandboxCount;

        /**
         * <p>The session idle timeout in seconds. Valid values: 60 to 86400. When runtime is provided, omitting this field uses the default value of 600.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("sessionTtlSeconds")
        public Integer sessionTtlSeconds;

        public static UpdateCustomAgentRequestBodyRuntimeHpa build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBodyRuntimeHpa self = new UpdateCustomAgentRequestBodyRuntimeHpa();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBodyRuntimeHpa setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateCustomAgentRequestBodyRuntimeHpa setMaxConcurrentSessionsPerSandbox(Integer maxConcurrentSessionsPerSandbox) {
            this.maxConcurrentSessionsPerSandbox = maxConcurrentSessionsPerSandbox;
            return this;
        }
        public Integer getMaxConcurrentSessionsPerSandbox() {
            return this.maxConcurrentSessionsPerSandbox;
        }

        public UpdateCustomAgentRequestBodyRuntimeHpa setMaxSandboxCount(Integer maxSandboxCount) {
            this.maxSandboxCount = maxSandboxCount;
            return this;
        }
        public Integer getMaxSandboxCount() {
            return this.maxSandboxCount;
        }

        public UpdateCustomAgentRequestBodyRuntimeHpa setMinSandboxCount(Integer minSandboxCount) {
            this.minSandboxCount = minSandboxCount;
            return this;
        }
        public Integer getMinSandboxCount() {
            return this.minSandboxCount;
        }

        public UpdateCustomAgentRequestBodyRuntimeHpa setSessionTtlSeconds(Integer sessionTtlSeconds) {
            this.sessionTtlSeconds = sessionTtlSeconds;
            return this;
        }
        public Integer getSessionTtlSeconds() {
            return this.sessionTtlSeconds;
        }

    }

    public static class UpdateCustomAgentRequestBodyRuntimeSessionPolicy extends TeaModel {
        /**
         * <p>The name of the HTTP request header used by the session policy. This parameter is required when type is set to ISOLATED_HEADER_FIELD and must be a valid HTTP request header name. Omit this parameter for other policies.</p>
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
         * <li>ISOLATED_HEADER_FIELD: Associates sessions by using the request header specified by headerName.</li>
         * <li>ISOLATED_COOKIE: Cookie-based session policy. This value is not recommended.</li>
         * <li>DISABLED: Compatibility option. The response returns AFFINITY.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AFFINITY</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateCustomAgentRequestBodyRuntimeSessionPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBodyRuntimeSessionPolicy self = new UpdateCustomAgentRequestBodyRuntimeSessionPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBodyRuntimeSessionPolicy setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public UpdateCustomAgentRequestBodyRuntimeSessionPolicy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateCustomAgentRequestBodyRuntime extends TeaModel {
        /**
         * <p>The compute resource configuration for the agent runtime instance.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("compute")
        public UpdateCustomAgentRequestBodyRuntimeCompute compute;

        /**
         * <p>The optional elastic policy. When runtime is provided, omitting hpa or its fields uses the default values: enabled is false, the minimum number of instances is 1, the maximum number of instances is 10, the maximum number of concurrent sessions per instance is 100, and the session idle timeout is 600 seconds. To retain the original policy during an update, provide the complete hpa configuration.</p>
         */
        @NameInMap("hpa")
        public UpdateCustomAgentRequestBodyRuntimeHpa hpa;

        /**
         * <p>The session policy configuration used to set the session association method for requests.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("sessionPolicy")
        public UpdateCustomAgentRequestBodyRuntimeSessionPolicy sessionPolicy;

        public static UpdateCustomAgentRequestBodyRuntime build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBodyRuntime self = new UpdateCustomAgentRequestBodyRuntime();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBodyRuntime setCompute(UpdateCustomAgentRequestBodyRuntimeCompute compute) {
            this.compute = compute;
            return this;
        }
        public UpdateCustomAgentRequestBodyRuntimeCompute getCompute() {
            return this.compute;
        }

        public UpdateCustomAgentRequestBodyRuntime setHpa(UpdateCustomAgentRequestBodyRuntimeHpa hpa) {
            this.hpa = hpa;
            return this;
        }
        public UpdateCustomAgentRequestBodyRuntimeHpa getHpa() {
            return this.hpa;
        }

        public UpdateCustomAgentRequestBodyRuntime setSessionPolicy(UpdateCustomAgentRequestBodyRuntimeSessionPolicy sessionPolicy) {
            this.sessionPolicy = sessionPolicy;
            return this;
        }
        public UpdateCustomAgentRequestBodyRuntimeSessionPolicy getSessionPolicy() {
            return this.sessionPolicy;
        }

    }

    public static class UpdateCustomAgentRequestBody extends TeaModel {
        /**
         * <p>The list of additional AgenticFS mounts. The total number of AgenticFS mounts and ossMounts cannot exceed 10. During creation, omitting this field or passing an empty array [] indicates no additional mounts. During an update, omitting this field retains the original value, and passing an empty array [] clears the list. You cannot pass null.</p>
         */
        @NameInMap("agenticFsMounts")
        public java.util.List<UpdateCustomAgentRequestBodyAgenticFsMounts> agenticFsMounts;

        /**
         * <p>The deployment artifact configuration. You must specify the service listening port in the port field and choose either the code or container deployment method. During an update, you must provide the required fields for the selected method.</p>
         */
        @NameInMap("artifact")
        public UpdateCustomAgentRequestBodyArtifact artifact;

        /**
         * <p>The description of the agent purpose. The maximum length is 1,024 characters after leading and trailing whitespaces are removed. Omitting this field retains the original value. Pass null to clear the description.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom agent that provides conversation services</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The environment variable configuration for the agent process. Omitting this top-level field retains the original value. Providing this object but omitting the variables field clears the custom environment variables. To retain the variables, provide the complete list.</p>
         */
        @NameInMap("environment")
        public UpdateCustomAgentRequestBodyEnvironment environment;

        /**
         * <p>The optional HTTP health check configuration. When providing this object, you must specify the port field. Other unspecified items use default values. Omitting this field during creation indicates no configuration. During an update, omitting this top-level field retains the original configuration, and passing null removes the health check.</p>
         */
        @NameInMap("healthCheck")
        public UpdateCustomAgentRequestBodyHealthCheck healthCheck;

        /**
         * <p>The log delivery configuration for the agent. You can specify the Simple Log Service (SLS) project and logstore. After a successful creation or update, verify whether logs are delivered properly.</p>
         */
        @NameInMap("logging")
        public UpdateCustomAgentRequestBodyLogging logging;

        /**
         * <p>The name of the custom agent. The length is 1 to 128 characters after leading and trailing whitespaces are removed. The name must be unique within the same workspace. Omitting this field retains the original value. You cannot pass null or a blank name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-custom-agent</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The network access configuration for the agent. When providing this object, omitted access items are treated as allowed. The actual accessible range is still restricted by the workspace network configuration. To retain the original restrictions during an update, specify both accessInternet and accessVpc.</p>
         */
        @NameInMap("network")
        public UpdateCustomAgentRequestBodyNetwork network;

        /**
         * <p>The high-code agent observability configuration.</p>
         */
        @NameInMap("observability")
        public UpdateCustomAgentRequestBodyObservability observability;

        /**
         * <p>The OSS mount list. A maximum of 10 items in total with agenticFsMounts. Each item must include bucketName, path, and mountPath. Mount targets must not be duplicated or overlap. The entire list is replaced during an update. Pass an empty array to clear the list.</p>
         */
        @NameInMap("ossMounts")
        public java.util.List<UpdateCustomAgentRequestBodyOssMounts> ossMounts;

        /**
         * <p>The list of invocation protocols supported by the agent. Each item includes the protocol type and optional paths and request headers. The entire list is replaced during an update.</p>
         */
        @NameInMap("protocol")
        public java.util.List<UpdateCustomAgentRequestBodyProtocol> protocol;

        /**
         * <p>The ARN of the RAM role used when the agent accesses user cloud resources. The role must have permissions to access the cloud resources.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1234567890123456:role/agentcore-runtime-role</p>
         */
        @NameInMap("roleArn")
        public String roleArn;

        /**
         * <p>The runtime configuration. When this object is provided, compute and sessionPolicy must be present at the same time. To retain the original elastic policy, provide the complete hpa configuration. Omitting the top-level runtime field retains the original configuration.</p>
         */
        @NameInMap("runtime")
        public UpdateCustomAgentRequestBodyRuntime runtime;

        /**
         * <p>If this parameter is not passed during an update, the original value is retained. Explicitly set this parameter to true or false. The system does not automatically supplement false. The new contract rejects null and invalid types. Existing compatibility endpoints are processed according to migration agreements.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("useImageCache")
        public Boolean useImageCache;

        public static UpdateCustomAgentRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBody self = new UpdateCustomAgentRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBody setAgenticFsMounts(java.util.List<UpdateCustomAgentRequestBodyAgenticFsMounts> agenticFsMounts) {
            this.agenticFsMounts = agenticFsMounts;
            return this;
        }
        public java.util.List<UpdateCustomAgentRequestBodyAgenticFsMounts> getAgenticFsMounts() {
            return this.agenticFsMounts;
        }

        public UpdateCustomAgentRequestBody setArtifact(UpdateCustomAgentRequestBodyArtifact artifact) {
            this.artifact = artifact;
            return this;
        }
        public UpdateCustomAgentRequestBodyArtifact getArtifact() {
            return this.artifact;
        }

        public UpdateCustomAgentRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateCustomAgentRequestBody setEnvironment(UpdateCustomAgentRequestBodyEnvironment environment) {
            this.environment = environment;
            return this;
        }
        public UpdateCustomAgentRequestBodyEnvironment getEnvironment() {
            return this.environment;
        }

        public UpdateCustomAgentRequestBody setHealthCheck(UpdateCustomAgentRequestBodyHealthCheck healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public UpdateCustomAgentRequestBodyHealthCheck getHealthCheck() {
            return this.healthCheck;
        }

        public UpdateCustomAgentRequestBody setLogging(UpdateCustomAgentRequestBodyLogging logging) {
            this.logging = logging;
            return this;
        }
        public UpdateCustomAgentRequestBodyLogging getLogging() {
            return this.logging;
        }

        public UpdateCustomAgentRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateCustomAgentRequestBody setNetwork(UpdateCustomAgentRequestBodyNetwork network) {
            this.network = network;
            return this;
        }
        public UpdateCustomAgentRequestBodyNetwork getNetwork() {
            return this.network;
        }

        public UpdateCustomAgentRequestBody setObservability(UpdateCustomAgentRequestBodyObservability observability) {
            this.observability = observability;
            return this;
        }
        public UpdateCustomAgentRequestBodyObservability getObservability() {
            return this.observability;
        }

        public UpdateCustomAgentRequestBody setOssMounts(java.util.List<UpdateCustomAgentRequestBodyOssMounts> ossMounts) {
            this.ossMounts = ossMounts;
            return this;
        }
        public java.util.List<UpdateCustomAgentRequestBodyOssMounts> getOssMounts() {
            return this.ossMounts;
        }

        public UpdateCustomAgentRequestBody setProtocol(java.util.List<UpdateCustomAgentRequestBodyProtocol> protocol) {
            this.protocol = protocol;
            return this;
        }
        public java.util.List<UpdateCustomAgentRequestBodyProtocol> getProtocol() {
            return this.protocol;
        }

        public UpdateCustomAgentRequestBody setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public UpdateCustomAgentRequestBody setRuntime(UpdateCustomAgentRequestBodyRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public UpdateCustomAgentRequestBodyRuntime getRuntime() {
            return this.runtime;
        }

        public UpdateCustomAgentRequestBody setUseImageCache(Boolean useImageCache) {
            this.useImageCache = useImageCache;
            return this;
        }
        public Boolean getUseImageCache() {
            return this.useImageCache;
        }

    }

}
