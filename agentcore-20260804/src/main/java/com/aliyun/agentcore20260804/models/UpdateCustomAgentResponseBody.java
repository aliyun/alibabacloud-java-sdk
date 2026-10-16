// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateCustomAgentResponseBody extends TeaModel {
    /**
     * <p>The request result code. The value is SUCCESS when the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The latest submitted configuration and status of the custom agent. A successful response indicates that the request is accepted, but the configuration may not have taken effect yet.</p>
     */
    @NameInMap("data")
    public UpdateCustomAgentResponseBodyData data;

    /**
     * <p>The HTTP status code of the request. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The processing result message of the request. The value is success if the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The unique identifier of the request. You can use this ID to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>550E8400-E29B-41D4-A716-446655440000</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. A value of true indicates that the request is successful. Note that a successful creation, update, or deletion does not mean that the background operation is complete.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateCustomAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomAgentResponseBody self = new UpdateCustomAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCustomAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateCustomAgentResponseBody setData(UpdateCustomAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateCustomAgentResponseBodyData getData() {
        return this.data;
    }

    public UpdateCustomAgentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateCustomAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateCustomAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCustomAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateCustomAgentResponseBodyDataAgenticFsMounts extends TeaModel {
        /**
         * <p>The AgenticFS mount directory in the container, located under /mnt/agenticfs/.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/agenticfs/data</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>The relative directory in the mounted access point.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace/data</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>Specifies whether the mount is read-only. A value of true indicates a read-only mount, and a value of false indicates a read-write mount.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        /**
         * <p>The domain name of the AgenticFS access point used for the mount.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-0123456789abcdef0.0123456789-vlm36.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("server")
        public String server;

        public static UpdateCustomAgentResponseBodyDataAgenticFsMounts build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentResponseBodyDataAgenticFsMounts self = new UpdateCustomAgentResponseBodyDataAgenticFsMounts();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentResponseBodyDataAgenticFsMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public UpdateCustomAgentResponseBodyDataAgenticFsMounts setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateCustomAgentResponseBodyDataAgenticFsMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public UpdateCustomAgentResponseBodyDataAgenticFsMounts setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

    }

    public static class UpdateCustomAgentResponseBodyDataArtifactCode extends TeaModel {
        /**
         * <p>The startup entry point of the code package. Code package deployment is not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>python app.py</p>
         */
        @NameInMap("entrypoint")
        public String entrypoint;

        /**
         * <p>The language runtime identifier of the code package. Code package deployment is not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>python</p>
         */
        @NameInMap("languageRuntime")
        public String languageRuntime;

        /**
         * <p>The source URI of the code package. Code package deployment is not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://my-agent-bucket/packages/agent.zip</p>
         */
        @NameInMap("sourceUri")
        public String sourceUri;

        public static UpdateCustomAgentResponseBodyDataArtifactCode build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentResponseBodyDataArtifactCode self = new UpdateCustomAgentResponseBodyDataArtifactCode();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentResponseBodyDataArtifactCode setEntrypoint(String entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public String getEntrypoint() {
            return this.entrypoint;
        }

        public UpdateCustomAgentResponseBodyDataArtifactCode setLanguageRuntime(String languageRuntime) {
            this.languageRuntime = languageRuntime;
            return this;
        }
        public String getLanguageRuntime() {
            return this.languageRuntime;
        }

        public UpdateCustomAgentResponseBodyDataArtifactCode setSourceUri(String sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }
        public String getSourceUri() {
            return this.sourceUri;
        }

    }

    public static class UpdateCustomAgentResponseBodyDataArtifactContainer extends TeaModel {
        /**
         * <p>The custom executable program and startup parameters. If not configured, the default startup method of the image is used.</p>
         * 
         * <strong>example:</strong>
         * <p>python app.py</p>
         */
        @NameInMap("entrypoint")
        public String entrypoint;

        /**
         * <p>The ID of the ACR instance to which the image repository belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-a1b2c3d4e5f6</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The namespace to which the ACR image repository belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The name of the image repository in the ACR namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>chat-agent</p>
         */
        @NameInMap("repo")
        public String repo;

        /**
         * <p>The latest submitted image tag.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The image source type. A value of acr indicates Alibaba Cloud Container Registry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acr</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateCustomAgentResponseBodyDataArtifactContainer build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentResponseBodyDataArtifactContainer self = new UpdateCustomAgentResponseBodyDataArtifactContainer();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentResponseBodyDataArtifactContainer setEntrypoint(String entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public String getEntrypoint() {
            return this.entrypoint;
        }

        public UpdateCustomAgentResponseBodyDataArtifactContainer setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateCustomAgentResponseBodyDataArtifactContainer setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdateCustomAgentResponseBodyDataArtifactContainer setRepo(String repo) {
            this.repo = repo;
            return this;
        }
        public String getRepo() {
            return this.repo;
        }

        public UpdateCustomAgentResponseBodyDataArtifactContainer setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public UpdateCustomAgentResponseBodyDataArtifactContainer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateCustomAgentResponseBodyDataArtifact extends TeaModel {
        /**
         * <p>The code package configuration field. Code package deployment is not supported.</p>
         */
        @NameInMap("code")
        public UpdateCustomAgentResponseBodyDataArtifactCode code;

        /**
         * <p>The latest submitted ACR container image configuration.</p>
         */
        @NameInMap("container")
        public UpdateCustomAgentResponseBodyDataArtifactContainer container;

        /**
         * <p>The TCP port listened to by the agent service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        public static UpdateCustomAgentResponseBodyDataArtifact build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentResponseBodyDataArtifact self = new UpdateCustomAgentResponseBodyDataArtifact();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentResponseBodyDataArtifact setCode(UpdateCustomAgentResponseBodyDataArtifactCode code) {
            this.code = code;
            return this;
        }
        public UpdateCustomAgentResponseBodyDataArtifactCode getCode() {
            return this.code;
        }

        public UpdateCustomAgentResponseBodyDataArtifact setContainer(UpdateCustomAgentResponseBodyDataArtifactContainer container) {
            this.container = container;
            return this;
        }
        public UpdateCustomAgentResponseBodyDataArtifactContainer getContainer() {
            return this.container;
        }

        public UpdateCustomAgentResponseBodyDataArtifact setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class UpdateCustomAgentResponseBodyDataEnvironmentVariables extends TeaModel {
        /**
         * <p>The name of the environment variable.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LOG_LEVEL</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The string value of the environment variable. Empty strings are allowed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>info</p>
         */
        @NameInMap("value")
        public String value;

        public static UpdateCustomAgentResponseBodyDataEnvironmentVariables build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentResponseBodyDataEnvironmentVariables self = new UpdateCustomAgentResponseBodyDataEnvironmentVariables();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentResponseBodyDataEnvironmentVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateCustomAgentResponseBodyDataEnvironmentVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateCustomAgentResponseBodyDataEnvironment extends TeaModel {
        /**
         * <p>The latest submitted list of environment variables.</p>
         */
        @NameInMap("variables")
        public java.util.List<UpdateCustomAgentResponseBodyDataEnvironmentVariables> variables;

        public static UpdateCustomAgentResponseBodyDataEnvironment build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentResponseBodyDataEnvironment self = new UpdateCustomAgentResponseBodyDataEnvironment();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentResponseBodyDataEnvironment setVariables(java.util.List<UpdateCustomAgentResponseBodyDataEnvironmentVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<UpdateCustomAgentResponseBodyDataEnvironmentVariables> getVariables() {
            return this.variables;
        }

    }

    public static class UpdateCustomAgentResponseBodyDataHealthCheck extends TeaModel {
        /**
         * <p>This parameter does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("healthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The interval between two consecutive health checks, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("intervalSeconds")
        public Integer intervalSeconds;

        /**
         * <p>The Health Check Path for HTTP health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthz</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The port accessed for the HTTP health check.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The timeout period for a single health check, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("timeoutSeconds")
        public Integer timeoutSeconds;

        /**
         * <p>The number of consecutive health check failures required to mark the agent as unhealthy.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("unhealthyThreshold")
        public Integer unhealthyThreshold;

        public static UpdateCustomAgentResponseBodyDataHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentResponseBodyDataHealthCheck self = new UpdateCustomAgentResponseBodyDataHealthCheck();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentResponseBodyDataHealthCheck setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public UpdateCustomAgentResponseBodyDataHealthCheck setIntervalSeconds(Integer intervalSeconds) {
            this.intervalSeconds = intervalSeconds;
            return this;
        }
        public Integer getIntervalSeconds() {
            return this.intervalSeconds;
        }

        public UpdateCustomAgentResponseBodyDataHealthCheck setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateCustomAgentResponseBodyDataHealthCheck setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateCustomAgentResponseBodyDataHealthCheck setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public UpdateCustomAgentResponseBodyDataHealthCheck setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

    }

    public static class UpdateCustomAgentResponseBodyDataLatestExecutionError extends TeaModel {
        /**
         * <p>The reason code for the waiting or execution failure of the latest configuration. This code is used to determine the subsequent handling method.</p>
         * 
         * <strong>example:</strong>
         * <p>AgentExecutionFailed</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The description of the reason why the latest configuration is waiting or failed to execute. Refer to code and retryable to determine what to do next.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent execution failed. Check the configuration and resubmit</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>Specifies whether automatic retry is performed. If the value is true, you can query again later. If the value is false, check and fix the configuration based on the reason, and then resubmit the request.</p>
         */
        @NameInMap("retryable")
        public Boolean retryable;

        public static UpdateCustomAgentResponseBodyDataLatestExecutionError build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentResponseBodyDataLatestExecutionError self = new UpdateCustomAgentResponseBodyDataLatestExecutionError();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentResponseBodyDataLatestExecutionError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateCustomAgentResponseBodyDataLatestExecutionError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateCustomAgentResponseBodyDataLatestExecutionError setRetryable(Boolean retryable) {
            this.retryable = retryable;
            return this;
        }
        public Boolean getRetryable() {
            return this.retryable;
        }

    }

    public static class UpdateCustomAgentResponseBodyDataLoggingSls extends TeaModel {
        /**
         * <p>The name of the Simple Log Service logstore that receives agent logs.</p>
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

        public static UpdateCustomAgentResponseBodyDataLoggingSls build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentResponseBodyDataLoggingSls self = new UpdateCustomAgentResponseBodyDataLoggingSls();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentResponseBodyDataLoggingSls setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public UpdateCustomAgentResponseBodyDataLoggingSls setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class UpdateCustomAgentResponseBodyDataLogging extends TeaModel {
        /**
         * <p>The Simple Log Service (SLS) log delivery destination.</p>
         */
        @NameInMap("sls")
        public UpdateCustomAgentResponseBodyDataLoggingSls sls;

        public static UpdateCustomAgentResponseBodyDataLogging build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentResponseBodyDataLogging self = new UpdateCustomAgentResponseBodyDataLogging();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentResponseBodyDataLogging setSls(UpdateCustomAgentResponseBodyDataLoggingSls sls) {
            this.sls = sls;
            return this;
        }
        public UpdateCustomAgentResponseBodyDataLoggingSls getSls() {
            return this.sls;
        }

    }

    public static class UpdateCustomAgentResponseBodyDataNetworkAccessInternet extends TeaModel {
        /**
         * <p>Specifies whether Internet access is allowed on the agent side. The actual access is still limited by the workspace.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static UpdateCustomAgentResponseBodyDataNetworkAccessInternet build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentResponseBodyDataNetworkAccessInternet self = new UpdateCustomAgentResponseBodyDataNetworkAccessInternet();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentResponseBodyDataNetworkAccessInternet setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class UpdateCustomAgentResponseBodyDataNetworkAccessVpc extends TeaModel {
        /**
         * <p>Specifies whether access to the user VPC configured for the workspace is allowed on the agent side. The actual access is still limited by the workspace.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static UpdateCustomAgentResponseBodyDataNetworkAccessVpc build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentResponseBodyDataNetworkAccessVpc self = new UpdateCustomAgentResponseBodyDataNetworkAccessVpc();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentResponseBodyDataNetworkAccessVpc setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class UpdateCustomAgentResponseBodyDataNetwork extends TeaModel {
        /**
         * <p>The Internet access configuration of the agent. If this field is not configured, Internet access is allowed on the agent side, but it is still limited by the workspace.</p>
         */
        @NameInMap("accessInternet")
        public UpdateCustomAgentResponseBodyDataNetworkAccessInternet accessInternet;

        /**
         * <p>The user VPC access configuration of the agent. If this field is not configured, user VPC access is allowed on the agent side, but it is still limited by the workspace.</p>
         */
        @NameInMap("accessVpc")
        public UpdateCustomAgentResponseBodyDataNetworkAccessVpc accessVpc;

        public static UpdateCustomAgentResponseBodyDataNetwork build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentResponseBodyDataNetwork self = new UpdateCustomAgentResponseBodyDataNetwork();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentResponseBodyDataNetwork setAccessInternet(UpdateCustomAgentResponseBodyDataNetworkAccessInternet accessInternet) {
            this.accessInternet = accessInternet;
            return this;
        }
        public UpdateCustomAgentResponseBodyDataNetworkAccessInternet getAccessInternet() {
            return this.accessInternet;
        }

        public UpdateCustomAgentResponseBodyDataNetwork setAccessVpc(UpdateCustomAgentResponseBodyDataNetworkAccessVpc accessVpc) {
            this.accessVpc = accessVpc;
            return this;
        }
        public UpdateCustomAgentResponseBodyDataNetworkAccessVpc getAccessVpc() {
            return this.accessVpc;
        }

    }

    public static class UpdateCustomAgentResponseBodyDataOssMounts extends TeaModel {
        /**
         * <p>The name of the mounted OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-data</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The OSS mount directory in the container, located under /mnt/oss/.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/oss/train</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>The object directory prefix in the mounted bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>datasets/train</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>Specifies whether the mount is read-only. A value of true indicates a read-only mount, and a value of false indicates a read-write mount.</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        public static UpdateCustomAgentResponseBodyDataOssMounts build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentResponseBodyDataOssMounts self = new UpdateCustomAgentResponseBodyDataOssMounts();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentResponseBodyDataOssMounts setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public UpdateCustomAgentResponseBodyDataOssMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public UpdateCustomAgentResponseBodyDataOssMounts setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateCustomAgentResponseBodyDataOssMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class UpdateCustomAgentResponseBodyDataProtocolPaths extends TeaModel {
        /**
         * <p>The description of the current API path.</p>
         * 
         * <strong>example:</strong>
         * <p>AG-UI conversation API</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The API path corresponding to the current protocol.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/agui</p>
         */
        @NameInMap("name")
        public String name;

        public static UpdateCustomAgentResponseBodyDataProtocolPaths build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentResponseBodyDataProtocolPaths self = new UpdateCustomAgentResponseBodyDataProtocolPaths();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentResponseBodyDataProtocolPaths setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateCustomAgentResponseBodyDataProtocolPaths setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateCustomAgentResponseBodyDataProtocol extends TeaModel {
        /**
         * <p>The request header configurations for the current protocol. The key is the header name and the value is a string.</p>
         */
        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        /**
         * <p>The list of API paths corresponding to the current protocol.</p>
         */
        @NameInMap("paths")
        public java.util.List<UpdateCustomAgentResponseBodyDataProtocolPaths> paths;

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

        public static UpdateCustomAgentResponseBodyDataProtocol build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentResponseBodyDataProtocol self = new UpdateCustomAgentResponseBodyDataProtocol();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentResponseBodyDataProtocol setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public UpdateCustomAgentResponseBodyDataProtocol setPaths(java.util.List<UpdateCustomAgentResponseBodyDataProtocolPaths> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<UpdateCustomAgentResponseBodyDataProtocolPaths> getPaths() {
            return this.paths;
        }

        public UpdateCustomAgentResponseBodyDataProtocol setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateCustomAgentResponseBodyDataRuntimeCompute extends TeaModel {
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

        public static UpdateCustomAgentResponseBodyDataRuntimeCompute build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentResponseBodyDataRuntimeCompute self = new UpdateCustomAgentResponseBodyDataRuntimeCompute();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentResponseBodyDataRuntimeCompute setComputeClass(String computeClass) {
            this.computeClass = computeClass;
            return this;
        }
        public String getComputeClass() {
            return this.computeClass;
        }

    }

    public static class UpdateCustomAgentResponseBodyDataRuntimeHpa extends TeaModel {
        /**
         * <p>Specifies whether elastic scaling is enabled. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The maximum number of concurrent sessions configured for a single running instance.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("maxConcurrentSessionsPerSandbox")
        public Integer maxConcurrentSessionsPerSandbox;

        /**
         * <p>The maximum number of running instances configured.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxSandboxCount")
        public Integer maxSandboxCount;

        /**
         * <p>The minimum number of running instances configured.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minSandboxCount")
        public Integer minSandboxCount;

        /**
         * <p>The maximum idle time configured for a session, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("sessionTtlSeconds")
        public Integer sessionTtlSeconds;

        public static UpdateCustomAgentResponseBodyDataRuntimeHpa build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentResponseBodyDataRuntimeHpa self = new UpdateCustomAgentResponseBodyDataRuntimeHpa();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentResponseBodyDataRuntimeHpa setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateCustomAgentResponseBodyDataRuntimeHpa setMaxConcurrentSessionsPerSandbox(Integer maxConcurrentSessionsPerSandbox) {
            this.maxConcurrentSessionsPerSandbox = maxConcurrentSessionsPerSandbox;
            return this;
        }
        public Integer getMaxConcurrentSessionsPerSandbox() {
            return this.maxConcurrentSessionsPerSandbox;
        }

        public UpdateCustomAgentResponseBodyDataRuntimeHpa setMaxSandboxCount(Integer maxSandboxCount) {
            this.maxSandboxCount = maxSandboxCount;
            return this;
        }
        public Integer getMaxSandboxCount() {
            return this.maxSandboxCount;
        }

        public UpdateCustomAgentResponseBodyDataRuntimeHpa setMinSandboxCount(Integer minSandboxCount) {
            this.minSandboxCount = minSandboxCount;
            return this;
        }
        public Integer getMinSandboxCount() {
            return this.minSandboxCount;
        }

        public UpdateCustomAgentResponseBodyDataRuntimeHpa setSessionTtlSeconds(Integer sessionTtlSeconds) {
            this.sessionTtlSeconds = sessionTtlSeconds;
            return this;
        }
        public Integer getSessionTtlSeconds() {
            return this.sessionTtlSeconds;
        }

    }

    public static class UpdateCustomAgentResponseBodyDataRuntimeSessionPolicy extends TeaModel {
        /**
         * <p>The name of the HTTP request header used by the session policy. This parameter applies to ISOLATED_HEADER_FIELD.</p>
         * 
         * <strong>example:</strong>
         * <p>X-Session-Id</p>
         */
        @NameInMap("headerName")
        public String headerName;

        /**
         * <p>The type of the session policy. Valid values:</p>
         * <ul>
         * <li>AFFINITY: Session affinity.</li>
         * <li>ISOLATED_HEADER_FIELD: Uses the request header specified by headerName to associate sessions.</li>
         * <li>ISOLATED_COOKIE: Not recommended.
         * Note: The compatible value DISABLED in a request is returned as AFFINITY.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AFFINITY</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateCustomAgentResponseBodyDataRuntimeSessionPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentResponseBodyDataRuntimeSessionPolicy self = new UpdateCustomAgentResponseBodyDataRuntimeSessionPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentResponseBodyDataRuntimeSessionPolicy setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public UpdateCustomAgentResponseBodyDataRuntimeSessionPolicy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateCustomAgentResponseBodyDataRuntime extends TeaModel {
        /**
         * <p>The compute resource configuration for the agent runtime instance.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("compute")
        public UpdateCustomAgentResponseBodyDataRuntimeCompute compute;

        /**
         * <p>The elastic policy configurations for the agent.</p>
         */
        @NameInMap("hpa")
        public UpdateCustomAgentResponseBodyDataRuntimeHpa hpa;

        /**
         * <p>The session policy configurations for the agent.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("sessionPolicy")
        public UpdateCustomAgentResponseBodyDataRuntimeSessionPolicy sessionPolicy;

        public static UpdateCustomAgentResponseBodyDataRuntime build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentResponseBodyDataRuntime self = new UpdateCustomAgentResponseBodyDataRuntime();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentResponseBodyDataRuntime setCompute(UpdateCustomAgentResponseBodyDataRuntimeCompute compute) {
            this.compute = compute;
            return this;
        }
        public UpdateCustomAgentResponseBodyDataRuntimeCompute getCompute() {
            return this.compute;
        }

        public UpdateCustomAgentResponseBodyDataRuntime setHpa(UpdateCustomAgentResponseBodyDataRuntimeHpa hpa) {
            this.hpa = hpa;
            return this;
        }
        public UpdateCustomAgentResponseBodyDataRuntimeHpa getHpa() {
            return this.hpa;
        }

        public UpdateCustomAgentResponseBodyDataRuntime setSessionPolicy(UpdateCustomAgentResponseBodyDataRuntimeSessionPolicy sessionPolicy) {
            this.sessionPolicy = sessionPolicy;
            return this;
        }
        public UpdateCustomAgentResponseBodyDataRuntimeSessionPolicy getSessionPolicy() {
            return this.sessionPolicy;
        }

    }

    public static class UpdateCustomAgentResponseBodyData extends TeaModel {
        /**
         * <p>The unique identifier of the custom agent. You can obtain this ID from the response of the CreateCustomAgent or ListCustomAgents operation.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-550e8400e29b41d4a716446655440000</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The latest submitted list of additional AgenticFS mounts.</p>
         */
        @NameInMap("agenticFsMounts")
        public java.util.List<UpdateCustomAgentResponseBodyDataAgenticFsMounts> agenticFsMounts;

        /**
         * <p>The latest submitted deployment artifact configuration, including the service listening port and the ACR container image. To check whether the configuration has taken effect, refer to latestVersionStatus.</p>
         */
        @NameInMap("artifact")
        public UpdateCustomAgentResponseBodyDataArtifact artifact;

        /**
         * <p>The creation method of the agent. The value is CUSTOM for custom agents.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("createMode")
        public String createMode;

        /**
         * <p>The creation time of the agent. The time is in ISO 8601 format. The trailing Z indicates the UTC time zone. Fractional seconds may be included.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-10T06:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The deployment method of the agent. Custom agents are deployed and managed by the platform, and the value is MANAGED.</p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("deployType")
        public String deployType;

        /**
         * <p>The description of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom agent that provides conversation services</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The environment variable configuration for the agent process.</p>
         */
        @NameInMap("environment")
        public UpdateCustomAgentResponseBodyDataEnvironment environment;

        /**
         * <p>The HTTP health check configuration of the agent. This field is empty if no health check is configured.</p>
         */
        @NameInMap("healthCheck")
        public UpdateCustomAgentResponseBodyDataHealthCheck healthCheck;

        /**
         * <p>The waiting or execution error of the latest configuration version. This field is returned only when the version is waiting for a retry or fails to execute.</p>
         */
        @NameInMap("latestExecutionError")
        public UpdateCustomAgentResponseBodyDataLatestExecutionError latestExecutionError;

        /**
         * <p>The latest configuration version number. Updates with the same configuration may retain the original version number. This field does not indicate that the configuration has taken effect.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("latestSpecVersion")
        public Long latestSpecVersion;

        /**
         * <p>The execution status corresponding to latestSpecVersion. Valid values:</p>
         * <ul>
         * <li>pending: Waiting for execution.</li>
         * <li>processing: Executing.</li>
         * <li>waiting_retry: Waiting for a retry.</li>
         * <li>succeeded: Executed successfully.</li>
         * <li>failed: Execution failed.</li>
         * <li>superseded: Superseded by a subsequent version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>succeeded</p>
         */
        @NameInMap("latestVersionStatus")
        public String latestVersionStatus;

        /**
         * <p>The latest submitted log delivery configuration.</p>
         */
        @NameInMap("logging")
        public UpdateCustomAgentResponseBodyDataLogging logging;

        /**
         * <p>The name of the custom agent.</p>
         * 
         * <strong>example:</strong>
         * <p>my-custom-agent</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The network access configuration of the agent. The actual access scope is also limited by the network configuration of the workspace.</p>
         */
        @NameInMap("network")
        public UpdateCustomAgentResponseBodyDataNetwork network;

        /**
         * <p>The latest submitted list of OSS directory mounts.</p>
         */
        @NameInMap("ossMounts")
        public java.util.List<UpdateCustomAgentResponseBodyDataOssMounts> ossMounts;

        /**
         * <p>The list of invocation protocol configurations for the agent.</p>
         */
        @NameInMap("protocol")
        public java.util.List<UpdateCustomAgentResponseBodyDataProtocol> protocol;

        /**
         * <p>The region ID of the workspace to which the agent belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The ARN of the RAM role used by the agent to access user cloud resources.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1234567890123456:role/agentcore-runtime-role</p>
         */
        @NameInMap("roleArn")
        public String roleArn;

        /**
         * <p>The latest committed runtime configurations, including compute specifications, session policy, and elastic policy.</p>
         */
        @NameInMap("runtime")
        public UpdateCustomAgentResponseBodyDataRuntime runtime;

        /**
         * <p>The instance counts grouped by running instance phase. Keys include PENDING (creating or initializing), RUNNING (running), HIBERNATING (hibernating), HIBERNATED (hibernated), RESUMING (resuming), TERMINATING (terminating), and FAILED (failed). Only phases that actually occur are returned. Missing keys are treated as 0.</p>
         */
        @NameInMap("sandboxPhaseCounts")
        public java.util.Map<String, Long> sandboxPhaseCounts;

        /**
         * <p>The overall status of the agent. Valid values:</p>
         * <ul>
         * <li>Creating: The agent is being created.</li>
         * <li>Running: The agent is running.</li>
         * <li>Failed: The agent failed.</li>
         * <li>Updating: The agent is being updated.</li>
         * <li>Deleting: The agent is being deleted.</li>
         * <li>Deleted: The agent is deleted.
         * To query the execution progress of the latest configuration, check latestVersionStatus.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The time when the agent was last updated. The time is in ISO 8601 format. A trailing Z indicates the UTC time zone. Fractional seconds may be included.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-10T06:05:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The ID of the workspace to which the custom agent belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-a1b2c3d4e5f6</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static UpdateCustomAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomAgentResponseBodyData self = new UpdateCustomAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateCustomAgentResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public UpdateCustomAgentResponseBodyData setAgenticFsMounts(java.util.List<UpdateCustomAgentResponseBodyDataAgenticFsMounts> agenticFsMounts) {
            this.agenticFsMounts = agenticFsMounts;
            return this;
        }
        public java.util.List<UpdateCustomAgentResponseBodyDataAgenticFsMounts> getAgenticFsMounts() {
            return this.agenticFsMounts;
        }

        public UpdateCustomAgentResponseBodyData setArtifact(UpdateCustomAgentResponseBodyDataArtifact artifact) {
            this.artifact = artifact;
            return this;
        }
        public UpdateCustomAgentResponseBodyDataArtifact getArtifact() {
            return this.artifact;
        }

        public UpdateCustomAgentResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public UpdateCustomAgentResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateCustomAgentResponseBodyData setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public UpdateCustomAgentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateCustomAgentResponseBodyData setEnvironment(UpdateCustomAgentResponseBodyDataEnvironment environment) {
            this.environment = environment;
            return this;
        }
        public UpdateCustomAgentResponseBodyDataEnvironment getEnvironment() {
            return this.environment;
        }

        public UpdateCustomAgentResponseBodyData setHealthCheck(UpdateCustomAgentResponseBodyDataHealthCheck healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public UpdateCustomAgentResponseBodyDataHealthCheck getHealthCheck() {
            return this.healthCheck;
        }

        public UpdateCustomAgentResponseBodyData setLatestExecutionError(UpdateCustomAgentResponseBodyDataLatestExecutionError latestExecutionError) {
            this.latestExecutionError = latestExecutionError;
            return this;
        }
        public UpdateCustomAgentResponseBodyDataLatestExecutionError getLatestExecutionError() {
            return this.latestExecutionError;
        }

        public UpdateCustomAgentResponseBodyData setLatestSpecVersion(Long latestSpecVersion) {
            this.latestSpecVersion = latestSpecVersion;
            return this;
        }
        public Long getLatestSpecVersion() {
            return this.latestSpecVersion;
        }

        public UpdateCustomAgentResponseBodyData setLatestVersionStatus(String latestVersionStatus) {
            this.latestVersionStatus = latestVersionStatus;
            return this;
        }
        public String getLatestVersionStatus() {
            return this.latestVersionStatus;
        }

        public UpdateCustomAgentResponseBodyData setLogging(UpdateCustomAgentResponseBodyDataLogging logging) {
            this.logging = logging;
            return this;
        }
        public UpdateCustomAgentResponseBodyDataLogging getLogging() {
            return this.logging;
        }

        public UpdateCustomAgentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateCustomAgentResponseBodyData setNetwork(UpdateCustomAgentResponseBodyDataNetwork network) {
            this.network = network;
            return this;
        }
        public UpdateCustomAgentResponseBodyDataNetwork getNetwork() {
            return this.network;
        }

        public UpdateCustomAgentResponseBodyData setOssMounts(java.util.List<UpdateCustomAgentResponseBodyDataOssMounts> ossMounts) {
            this.ossMounts = ossMounts;
            return this;
        }
        public java.util.List<UpdateCustomAgentResponseBodyDataOssMounts> getOssMounts() {
            return this.ossMounts;
        }

        public UpdateCustomAgentResponseBodyData setProtocol(java.util.List<UpdateCustomAgentResponseBodyDataProtocol> protocol) {
            this.protocol = protocol;
            return this;
        }
        public java.util.List<UpdateCustomAgentResponseBodyDataProtocol> getProtocol() {
            return this.protocol;
        }

        public UpdateCustomAgentResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateCustomAgentResponseBodyData setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public UpdateCustomAgentResponseBodyData setRuntime(UpdateCustomAgentResponseBodyDataRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public UpdateCustomAgentResponseBodyDataRuntime getRuntime() {
            return this.runtime;
        }

        public UpdateCustomAgentResponseBodyData setSandboxPhaseCounts(java.util.Map<String, Long> sandboxPhaseCounts) {
            this.sandboxPhaseCounts = sandboxPhaseCounts;
            return this;
        }
        public java.util.Map<String, Long> getSandboxPhaseCounts() {
            return this.sandboxPhaseCounts;
        }

        public UpdateCustomAgentResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateCustomAgentResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateCustomAgentResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
