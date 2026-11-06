// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateCustomAgentRequest extends TeaModel {
    /**
     * <p>The update configuration of the custom code or image agent. You must provide at least one top-level field. Omitted top-level fields retain their original values. When submitting <code>artifact</code>, specify <code>port</code> and the required fields for the corresponding artifact source. When submitting <code>runtime</code>, specify <code>compute</code> and <code>sessionPolicy</code>, and include the complete <code>hpa</code> that needs to be retained. <code>environment.variables</code> and other arrays are replaced as complete lists.</p>
     */
    @NameInMap("body")
    public UpdateCustomAgentRequestBody body;

    /**
     * <p>The idempotency token passed through query parameters. Required when explicitly submitting customImage or container.type=custom. Optional for ACR image and code package submissions. The length is 1 to 128 characters. Letters, digits, periods, underscores, colons, and hyphens are allowed. Reuse the same token for retries of the same submission. Using the same token for different parameters is rejected.</p>
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
         * <p>The absolute mount path in the container, such as <code>/data/train</code>. Mount targets must not be duplicated or form parent-child overwrites, and must avoid platform reserved directories.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/agenticfs/data</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>The existing non-empty relative directory under the access point. This parameter is required for each mount item. Root directories, absolute paths, or parent directory jumps are not allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace/data</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>Specifies whether the mount is read-only. <code>true</code> indicates read-only, and <code>false</code> indicates read and write. The default value is <code>false</code> if omitted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        /**
         * <p>The access point domain name. This parameter is required for each mount item. It takes the <code>DomainName</code> from the NAS ListAccessPoints response and does not contain a protocol, port, or path.</p>
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
         * <p>The code package startup command. This parameter is required in code package mode. The working directory is the root directory of the extracted code <code>/code</code>, such as <code>python main.py</code>. Quotes and escapes are supported, but environment variables, pipes, or logical operations are not automatically expanded. Use scripts in the package for complex commands.</p>
         * 
         * <strong>example:</strong>
         * <p>python main.py</p>
         */
        @NameInMap("entrypoint")
        public String entrypoint;

        /**
         * <p>The code runtime environment identifier, such as <code>python3.12</code>. When creating or switching environments, use the identifier returned by ListAgentCodeRuntimes. It is verified by the current version catalog and is not a fixed enumeration.</p>
         * 
         * <strong>example:</strong>
         * <p>python3.12</p>
         */
        @NameInMap("languageRuntime")
        public String languageRuntime;

        /**
         * <p>The code package source address. It supports <code>oss://</code> addresses or HTTPS object addresses of standard OSS public domain name, including OSS signed URLs. Arbitrary external sites, custom domain names, or additional authentication request headers are not supported. After local upload, use the <code>sourceUri</code> returned by GetAgentCodePackageUploadUrl. It is re-verified and transferred during creation or update, and a fixed <code>oss://</code> address on the platform is returned after saving. Common updates can reuse this fixed address.</p>
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
         * <p>The optional executable program and startup parameters. It must be a non-empty string when specified. If <code>container</code> is submitted but <code>entrypoint</code> is not specified, the default startup method of the image is used. Quotes and escapes are supported, but variables, pipes, or logical operations are not automatically expanded.</p>
         * 
         * <strong>example:</strong>
         * <p>python app.py</p>
         */
        @NameInMap("entrypoint")
        public String entrypoint;

        /**
         * <p>The ID of the ACR instance to which the image repository belongs. It cannot be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-a1b2c3d4e5f6</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The namespace to which the ACR image repository belongs. It cannot be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The name of the image repository in the ACR namespace. It cannot be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>chat-agent</p>
         */
        @NameInMap("repo")
        public String repo;

        /**
         * <p>The ACR image tag. This parameter is required when submitting the ACR container configuration and must be a non-empty string, such as <code>v1.0.1</code>. When updating the tag, also specify <code>artifact.port</code> and <code>type</code>, <code>instanceId</code>, <code>namespace</code>, and <code>repo</code> in the container configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The image source type. <code>acr</code> indicates an ACR image, and <code>custom</code> indicates a custom image source. For the corresponding source configuration, see the descriptions of <code>artifact.container</code> and <code>customImage</code>.</p>
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
         * <p>The code package deployment configuration, which is mutually exclusive with <code>container</code>. You must provide <code>sourceUri</code>, <code>languageRuntime</code>, and <code>entrypoint</code> at the same time, and specify <code>artifact.port</code>. ZIP or TAR.GZ is supported, and dependencies are provided by the caller in the package.</p>
         */
        @NameInMap("code")
        public UpdateCustomAgentRequestBodyArtifactCode code;

        /**
         * <p>The container image deployment configuration, which is mutually exclusive with <code>code</code>. For ACR sources, specify <code>type=acr</code>, <code>instanceId</code>, <code>namespace</code>, <code>repo</code>, and <code>tag</code>. For custom sources, specify <code>type=custom</code> and submit the complete <code>customImage</code>.</p>
         */
        @NameInMap("container")
        public UpdateCustomAgentRequestBodyArtifactContainer container;

        /**
         * <p>The TCP port listened by the agent service. Valid values: 1 to 65535. This parameter is required when submitting <code>artifact</code>. If the entire <code>artifact</code> is omitted, the original artifact configuration is retained.</p>
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

    public static class UpdateCustomAgentRequestBodyCustomImagePullNetwork extends TeaModel {
        /**
         * <p>This parameter is required when <code>type=vpc</code> and must belong to the selected VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-example</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <p>This parameter is required when submitting <code>pullNetwork</code> and is verified by the backend. The default for new creations is the public network, which is independent of the agent runtime network.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>This parameter is required when <code>type=vpc</code> and must belong to the selected VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-example</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        /**
         * <p>This parameter is required when <code>type=vpc</code>. The associated account and region are verified by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-example</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static UpdateCustomAgentRequestBodyCustomImagePullNetwork build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBodyCustomImagePullNetwork self = new UpdateCustomAgentRequestBodyCustomImagePullNetwork();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBodyCustomImagePullNetwork setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateCustomAgentRequestBodyCustomImagePullNetwork setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateCustomAgentRequestBodyCustomImagePullNetwork setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public UpdateCustomAgentRequestBodyCustomImagePullNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class UpdateCustomAgentRequestBodyCustomImage extends TeaModel {
        /**
         * <p>This parameter is required when submitting <code>customImage</code> and is verified by the backend. It must be a complete <code>registry[:port]/repository:tag</code> or <code>registry[:port]/repository@sha256:digest</code> address. Multi-level paths are supported, and it does not contain a protocol or user information.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.example.com/team/agent:v1</p>
         */
        @NameInMap("image")
        public String image;

        /**
         * <p>The current repository password or token.</p>
         * 
         * <strong>example:</strong>
         * <p>example-registry-token</p>
         */
        @NameInMap("password")
        public String password;

        /**
         * <p>This parameter is required when submitting <code>customImage</code> and is verified by the backend. It is the complete independent pull network configuration. For the public network, only pass <code>type=public</code>.</p>
         */
        @NameInMap("pullNetwork")
        public UpdateCustomAgentRequestBodyCustomImagePullNetwork pullNetwork;

        /**
         * <p>Specifies whether to skip HTTPS certificate verification.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("skipTlsVerify")
        public Boolean skipTlsVerify;

        /**
         * <p>The current repository username.</p>
         * 
         * <strong>example:</strong>
         * <p>reader</p>
         */
        @NameInMap("username")
        public String username;

        public static UpdateCustomAgentRequestBodyCustomImage build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentRequestBodyCustomImage self = new UpdateCustomAgentRequestBodyCustomImage();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentRequestBodyCustomImage setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public UpdateCustomAgentRequestBodyCustomImage setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public UpdateCustomAgentRequestBodyCustomImage setPullNetwork(UpdateCustomAgentRequestBodyCustomImagePullNetwork pullNetwork) {
            this.pullNetwork = pullNetwork;
            return this;
        }
        public UpdateCustomAgentRequestBodyCustomImagePullNetwork getPullNetwork() {
            return this.pullNetwork;
        }

        public UpdateCustomAgentRequestBodyCustomImage setSkipTlsVerify(Boolean skipTlsVerify) {
            this.skipTlsVerify = skipTlsVerify;
            return this;
        }
        public Boolean getSkipTlsVerify() {
            return this.skipTlsVerify;
        }

        public UpdateCustomAgentRequestBodyCustomImage setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class UpdateCustomAgentRequestBodyEnvironmentVariables extends TeaModel {
        /**
         * <p>The name of the environment variable. It cannot be empty and must be unique within the current list of environment variables.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LOG_LEVEL</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The value of the environment variable. It must be a string, and empty strings are allowed.</p>
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
         * <p>The complete list of user environment variables. A non-empty list replaces the original list entirely, and an empty array clears the list. The name of each item must be non-empty and unique within the list. The value must be a string, and empty strings are allowed.</p>
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
         * <p>This parameter is currently invalid. Omit it.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("healthyThreshold")
        @Deprecated
        public Integer healthyThreshold;

        /**
         * <p>The interval between two health checks, in seconds. It must be a positive integer. Default value: 10.</p>
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
         * <p>The port accessed for health checks. This parameter is required when configuring a health check. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The timeout period for a single health check, in seconds. It must be a positive integer and less than intervalSeconds. Default value: 2.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("timeoutSeconds")
        public Integer timeoutSeconds;

        /**
         * <p>The number of consecutive health check failures before the instance is considered unhealthy. It must be a positive integer. Default value: 3.</p>
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

        @Deprecated
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
         * <p>The Simple Log Service log delivery destination. When updating this object, both project and logstore must be provided and cannot be empty.</p>
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
         * <p>Specifies whether to allow the agent to access the Internet. A Boolean value is required when configuring accessInternet. The workspace must also allow Internet access for this to take effect.</p>
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
         * <p>Specifies whether to allow the agent to access the user VPC configured for the workspace. A Boolean value is required when configuring accessVpc. The workspace must also allow VPC access for this to take effect.</p>
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
         * <p>The Internet access configuration. If this access item is omitted, Internet access is not restricted on the agent side. The workspace must still allow Internet access.</p>
         */
        @NameInMap("accessInternet")
        public UpdateCustomAgentRequestBodyNetworkAccessInternet accessInternet;

        /**
         * <p>The user VPC access configuration. If this access item is omitted, VPC access is not restricted on the agent side. The workspace must still be configured to allow access to the user VPC.</p>
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
         * <p>The name of the OSS bucket. This parameter is required for each mount item. The length is 3 to 63 characters. It can contain only lowercase letters, digits, and hyphens, and cannot start or end with a hyphen.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-data</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The absolute mount path in the container, such as <code>/data/train</code>. Mount targets must not be duplicated or form parent-child overwrites, and must avoid platform reserved directories.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/oss/train</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>The non-empty relative object directory prefix in the bucket. This parameter is required for each mount item.</p>
         * 
         * <strong>example:</strong>
         * <p>datasets/train</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>Specifies whether the mount is read-only. <code>true</code> indicates read-only, and <code>false</code> indicates read and write. The default value is <code>false</code> if omitted.</p>
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
         * <p>The description of the current API path.</p>
         * 
         * <strong>example:</strong>
         * <p>AG-UI conversation API</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The non-empty API path corresponding to the current protocol.</p>
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
         * <p>The list of API paths corresponding to the current protocol.</p>
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
         * <p>Specifies whether to enable elastic scaling. Default value: false.</p>
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
         * <p>The upper limit of instances. Valid values: 0 to 100. Default value: 10. This value cannot be less than minSandboxCount.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxSandboxCount")
        public Integer maxSandboxCount;

        /**
         * <p>The lower limit of instances. Valid values: 0 to 100. Default value: 1. This value cannot be greater than maxSandboxCount.</p>
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
         * <li>ISOLATED_COOKIE: Not recommended for use at this time.</li>
         * <li>DISABLED: A compatibility option. The response returns AFFINITY.</li>
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
         * <p>The elastic and session configuration. Omitted fields use default values. To retain the original policy during an update, submit the complete hpa object or omit the entire runtime object.</p>
         */
        @NameInMap("hpa")
        public UpdateCustomAgentRequestBodyRuntimeHpa hpa;

        /**
         * <p>The session policy configuration, which is used to set the session association method for requests.</p>
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
         * <p>The inbound access method.</p>
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
         * <p>The NAS storage mount configuration. Currently, the AgenticFS type is supported, which is used to mount file directories in access points to agent runtime instances. The AgenticFS directory mount list can contain up to 10 items in total with <code>ossMounts</code>. If omitted or set to <code>[]</code> during creation, it indicates no mounts. If omitted during update, the original value is retained. If set to <code>[]</code>, the list is cleared. <code>null</code> is not accepted.</p>
         */
        @NameInMap("agenticFsMounts")
        public java.util.List<UpdateCustomAgentRequestBodyAgenticFsMounts> agenticFsMounts;

        /**
         * <p>The deployment artifact update configuration. If the entire <code>artifact</code> is omitted, the original configuration is retained. When submitting this object, specify <code>port</code> and the required fields for the selected source. Only one source can exist in <code>code</code> and <code>container</code>.</p>
         */
        @NameInMap("artifact")
        public UpdateCustomAgentRequestBodyArtifact artifact;

        /**
         * <p>Omission indicates retaining the source, and complete submission indicates actively updating the custom image. You do not need to submit it if only the port and startup command change.</p>
         */
        @NameInMap("customImage")
        public UpdateCustomAgentRequestBodyCustomImage customImage;

        /**
         * <p>The description of the agent. The maximum length is 1,024 characters after leading and trailing whitespaces are removed. If this parameter is omitted, the original value is retained. If null is passed, the description is cleared.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom agent that provides conversational services</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The user environment variable configuration for the agent process. If the entire environment object is omitted, the original value is retained. If variables is provided, the entire list is replaced, and any variables to be retained must be submitted together. Setting variables to an empty array, setting environment to null, or providing environment while omitting variables clears the user-configured environment variables.</p>
         */
        @NameInMap("environment")
        public UpdateCustomAgentRequestBodyEnvironment environment;

        /**
         * <p>The optional HTTP health check configuration. If this object is provided, port is required, and unspecified items use default values. If omitted during creation, no health check is configured. If this top-level field is omitted during an update, the original configuration is retained. If null is passed, the health check is removed.</p>
         */
        @NameInMap("healthCheck")
        public UpdateCustomAgentRequestBodyHealthCheck healthCheck;

        /**
         * <p>The log delivery configuration for the agent. You can specify the Simple Log Service project and Logstore. After a successful creation or update, verify that logs are delivered properly.</p>
         */
        @NameInMap("logging")
        public UpdateCustomAgentRequestBodyLogging logging;

        /**
         * <p>The name of the custom code or image agent. The length is 1 to 128 characters after leading and trailing whitespaces are removed. The name must be unique within the same workspace. If this parameter is omitted, the original value is retained. It cannot be null or an empty name.</p>
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
        public UpdateCustomAgentRequestBodyNetwork network;

        /**
         * <p>The high-code agent observability configuration.</p>
         */
        @NameInMap("observability")
        public UpdateCustomAgentRequestBodyObservability observability;

        /**
         * <p>The list of OSS directory mounts. The total number of items combined with agenticFsMounts cannot exceed 10. During an update, this list is replaced entirely. Pass an empty array to clear the mounts.</p>
         */
        @NameInMap("ossMounts")
        public java.util.List<UpdateCustomAgentRequestBodyOssMounts> ossMounts;

        /**
         * <p>The list of invocation protocols supported by the agent. Each item includes the protocol type and optional paths and request headers. This list is replaced entirely during an update.</p>
         */
        @NameInMap("protocol")
        public java.util.List<UpdateCustomAgentRequestBodyProtocol> protocol;

        /**
         * <p>The ARN of the RAM role used by the agent to access user cloud resources. The role must have permissions to access the cloud resources.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1234567890123456:role/agentcore-runtime-role</p>
         */
        @NameInMap("roleArn")
        public String roleArn;

        /**
         * <p>The runtime configuration. If the entire object is omitted, the original configuration is retained. If provided, both compute and sessionPolicy must be specified. Omitted items in hpa use default values.</p>
         */
        @NameInMap("runtime")
        public UpdateCustomAgentRequestBodyRuntime runtime;

        /**
         * <p>Retains the original value if omitted in an update. Explicitly set to true or false without automatically defaulting to false. The new contract rejects null and invalid types. Existing compatibility endpoints are handled according to migration conventions.</p>
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

        public UpdateCustomAgentRequestBody setAccessMode(String accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public String getAccessMode() {
            return this.accessMode;
        }

        public UpdateCustomAgentRequestBody setAccessScope(String accessScope) {
            this.accessScope = accessScope;
            return this;
        }
        public String getAccessScope() {
            return this.accessScope;
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

        public UpdateCustomAgentRequestBody setCustomImage(UpdateCustomAgentRequestBodyCustomImage customImage) {
            this.customImage = customImage;
            return this;
        }
        public UpdateCustomAgentRequestBodyCustomImage getCustomImage() {
            return this.customImage;
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
