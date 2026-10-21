// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetCustomAgentResponseBody extends TeaModel {
    /**
     * <p>The request result code. The value is SUCCESS if the request is successful.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The latest submitted configuration and status of the custom agent. To determine whether the configuration has taken effect, refer to latestVersionStatus.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("data")
    public GetCustomAgentResponseBodyData data;

    /**
     * <p>The HTTP status code of the request. A value of 200 indicates success.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The processing result description of the request. A value of success indicates success.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The unique identifier of the request, which is used to locate and troubleshoot issues.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550E8400-E29B-41D4-A716-446655440000</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. A value of true indicates that the request was successful. A successful creation, update, or deletion does not mean that the background operation is complete.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetCustomAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomAgentResponseBody self = new GetCustomAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomAgentResponseBody setData(GetCustomAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCustomAgentResponseBodyData getData() {
        return this.data;
    }

    public GetCustomAgentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCustomAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCustomAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCustomAgentResponseBodyDataAgenticFsMounts extends TeaModel {
        /**
         * <p>The AgenticFS mount directory in the container, located under /mnt/agenticfs/.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/agenticfs/data</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>The relative directory within the mounted access point.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace/data</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>Specifies whether the mount is read-only. A value of true indicates read-only, and false indicates read and write.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        /**
         * <p>The AgenticFS access point domain name used for the mount.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-0123456789abcdef0.0123456789-vlm36.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("server")
        public String server;

        public static GetCustomAgentResponseBodyDataAgenticFsMounts build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentResponseBodyDataAgenticFsMounts self = new GetCustomAgentResponseBodyDataAgenticFsMounts();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentResponseBodyDataAgenticFsMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public GetCustomAgentResponseBodyDataAgenticFsMounts setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetCustomAgentResponseBodyDataAgenticFsMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public GetCustomAgentResponseBodyDataAgenticFsMounts setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

    }

    public static class GetCustomAgentResponseBodyDataArtifactCode extends TeaModel {
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

        public static GetCustomAgentResponseBodyDataArtifactCode build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentResponseBodyDataArtifactCode self = new GetCustomAgentResponseBodyDataArtifactCode();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentResponseBodyDataArtifactCode setEntrypoint(String entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public String getEntrypoint() {
            return this.entrypoint;
        }

        public GetCustomAgentResponseBodyDataArtifactCode setLanguageRuntime(String languageRuntime) {
            this.languageRuntime = languageRuntime;
            return this;
        }
        public String getLanguageRuntime() {
            return this.languageRuntime;
        }

        public GetCustomAgentResponseBodyDataArtifactCode setSourceUri(String sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }
        public String getSourceUri() {
            return this.sourceUri;
        }

    }

    public static class GetCustomAgentResponseBodyDataArtifactContainer extends TeaModel {
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
         * <p>The image source type. A value of acr indicates Alibaba Cloud Container Registry (ACR).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acr</p>
         */
        @NameInMap("type")
        public String type;

        public static GetCustomAgentResponseBodyDataArtifactContainer build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentResponseBodyDataArtifactContainer self = new GetCustomAgentResponseBodyDataArtifactContainer();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentResponseBodyDataArtifactContainer setEntrypoint(String entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public String getEntrypoint() {
            return this.entrypoint;
        }

        public GetCustomAgentResponseBodyDataArtifactContainer setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetCustomAgentResponseBodyDataArtifactContainer setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetCustomAgentResponseBodyDataArtifactContainer setRepo(String repo) {
            this.repo = repo;
            return this;
        }
        public String getRepo() {
            return this.repo;
        }

        public GetCustomAgentResponseBodyDataArtifactContainer setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetCustomAgentResponseBodyDataArtifactContainer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetCustomAgentResponseBodyDataArtifact extends TeaModel {
        /**
         * <p>The code package configuration field. Code package deployment is not supported.</p>
         */
        @NameInMap("code")
        public GetCustomAgentResponseBodyDataArtifactCode code;

        /**
         * <p>The latest submitted ACR container image configuration.</p>
         */
        @NameInMap("container")
        public GetCustomAgentResponseBodyDataArtifactContainer container;

        /**
         * <p>The TCP port listened by the agent service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        public static GetCustomAgentResponseBodyDataArtifact build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentResponseBodyDataArtifact self = new GetCustomAgentResponseBodyDataArtifact();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentResponseBodyDataArtifact setCode(GetCustomAgentResponseBodyDataArtifactCode code) {
            this.code = code;
            return this;
        }
        public GetCustomAgentResponseBodyDataArtifactCode getCode() {
            return this.code;
        }

        public GetCustomAgentResponseBodyDataArtifact setContainer(GetCustomAgentResponseBodyDataArtifactContainer container) {
            this.container = container;
            return this;
        }
        public GetCustomAgentResponseBodyDataArtifactContainer getContainer() {
            return this.container;
        }

        public GetCustomAgentResponseBodyDataArtifact setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class GetCustomAgentResponseBodyDataEnvironmentVariables extends TeaModel {
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

        public static GetCustomAgentResponseBodyDataEnvironmentVariables build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentResponseBodyDataEnvironmentVariables self = new GetCustomAgentResponseBodyDataEnvironmentVariables();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentResponseBodyDataEnvironmentVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCustomAgentResponseBodyDataEnvironmentVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetCustomAgentResponseBodyDataEnvironment extends TeaModel {
        /**
         * <p>The latest submitted list of environment variables.</p>
         */
        @NameInMap("variables")
        public java.util.List<GetCustomAgentResponseBodyDataEnvironmentVariables> variables;

        public static GetCustomAgentResponseBodyDataEnvironment build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentResponseBodyDataEnvironment self = new GetCustomAgentResponseBodyDataEnvironment();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentResponseBodyDataEnvironment setVariables(java.util.List<GetCustomAgentResponseBodyDataEnvironmentVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<GetCustomAgentResponseBodyDataEnvironmentVariables> getVariables() {
            return this.variables;
        }

    }

    public static class GetCustomAgentResponseBodyDataHealthCheck extends TeaModel {
        /**
         * <p>This parameter does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("healthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The interval between two health checks, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("intervalSeconds")
        public Integer intervalSeconds;

        /**
         * <p>The HTTP health check path.</p>
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
         * <p>The number of consecutive health check failures required to mark the instance as unhealthy.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("unhealthyThreshold")
        public Integer unhealthyThreshold;

        public static GetCustomAgentResponseBodyDataHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentResponseBodyDataHealthCheck self = new GetCustomAgentResponseBodyDataHealthCheck();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentResponseBodyDataHealthCheck setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public GetCustomAgentResponseBodyDataHealthCheck setIntervalSeconds(Integer intervalSeconds) {
            this.intervalSeconds = intervalSeconds;
            return this;
        }
        public Integer getIntervalSeconds() {
            return this.intervalSeconds;
        }

        public GetCustomAgentResponseBodyDataHealthCheck setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetCustomAgentResponseBodyDataHealthCheck setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetCustomAgentResponseBodyDataHealthCheck setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public GetCustomAgentResponseBodyDataHealthCheck setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

    }

    public static class GetCustomAgentResponseBodyDataLatestExecutionError extends TeaModel {
        /**
         * <p>The reason code for the wait or execution failure of the latest configuration. This code is used to determine the subsequent handling method.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AgentExecutionFailed</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The description of the reason why the latest configuration is waiting or failed to execute. Refer to code and retryable to determine what to do next.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent execution failed. Check the configuration and resubmit</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>Specifies whether automatic retries are performed. If the value is true, you can query again later. If the value is false, check and fix the configuration based on the reason, and then resubmit.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("retryable")
        public Boolean retryable;

        public static GetCustomAgentResponseBodyDataLatestExecutionError build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentResponseBodyDataLatestExecutionError self = new GetCustomAgentResponseBodyDataLatestExecutionError();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentResponseBodyDataLatestExecutionError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetCustomAgentResponseBodyDataLatestExecutionError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetCustomAgentResponseBodyDataLatestExecutionError setRetryable(Boolean retryable) {
            this.retryable = retryable;
            return this;
        }
        public Boolean getRetryable() {
            return this.retryable;
        }

    }

    public static class GetCustomAgentResponseBodyDataLoggingSls extends TeaModel {
        /**
         * <p>The name of the SLS Logstore that receives agent logs.</p>
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

        public static GetCustomAgentResponseBodyDataLoggingSls build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentResponseBodyDataLoggingSls self = new GetCustomAgentResponseBodyDataLoggingSls();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentResponseBodyDataLoggingSls setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public GetCustomAgentResponseBodyDataLoggingSls setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class GetCustomAgentResponseBodyDataLogging extends TeaModel {
        /**
         * <p>The Simple Log Service (SLS) log delivery destination.</p>
         */
        @NameInMap("sls")
        public GetCustomAgentResponseBodyDataLoggingSls sls;

        public static GetCustomAgentResponseBodyDataLogging build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentResponseBodyDataLogging self = new GetCustomAgentResponseBodyDataLogging();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentResponseBodyDataLogging setSls(GetCustomAgentResponseBodyDataLoggingSls sls) {
            this.sls = sls;
            return this;
        }
        public GetCustomAgentResponseBodyDataLoggingSls getSls() {
            return this.sls;
        }

    }

    public static class GetCustomAgentResponseBodyDataNetworkAccessInternet extends TeaModel {
        /**
         * <p>Specifies whether Internet access is allowed on the agent side. The actual access remains restricted by the workspace.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static GetCustomAgentResponseBodyDataNetworkAccessInternet build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentResponseBodyDataNetworkAccessInternet self = new GetCustomAgentResponseBodyDataNetworkAccessInternet();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentResponseBodyDataNetworkAccessInternet setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class GetCustomAgentResponseBodyDataNetworkAccessVpc extends TeaModel {
        /**
         * <p>Specifies whether access to the user VPC configured for the workspace is allowed on the agent side. The actual access remains restricted by the workspace.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static GetCustomAgentResponseBodyDataNetworkAccessVpc build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentResponseBodyDataNetworkAccessVpc self = new GetCustomAgentResponseBodyDataNetworkAccessVpc();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentResponseBodyDataNetworkAccessVpc setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class GetCustomAgentResponseBodyDataNetwork extends TeaModel {
        /**
         * <p>The Internet access configuration of the agent. If this parameter is not configured, Internet access is allowed on the agent side but remains restricted by the workspace.</p>
         */
        @NameInMap("accessInternet")
        public GetCustomAgentResponseBodyDataNetworkAccessInternet accessInternet;

        /**
         * <p>The user VPC access configuration of the agent. If this parameter is not configured, user VPC access is allowed on the agent side but remains restricted by the workspace.</p>
         */
        @NameInMap("accessVpc")
        public GetCustomAgentResponseBodyDataNetworkAccessVpc accessVpc;

        public static GetCustomAgentResponseBodyDataNetwork build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentResponseBodyDataNetwork self = new GetCustomAgentResponseBodyDataNetwork();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentResponseBodyDataNetwork setAccessInternet(GetCustomAgentResponseBodyDataNetworkAccessInternet accessInternet) {
            this.accessInternet = accessInternet;
            return this;
        }
        public GetCustomAgentResponseBodyDataNetworkAccessInternet getAccessInternet() {
            return this.accessInternet;
        }

        public GetCustomAgentResponseBodyDataNetwork setAccessVpc(GetCustomAgentResponseBodyDataNetworkAccessVpc accessVpc) {
            this.accessVpc = accessVpc;
            return this;
        }
        public GetCustomAgentResponseBodyDataNetworkAccessVpc getAccessVpc() {
            return this.accessVpc;
        }

    }

    public static class GetCustomAgentResponseBodyDataObservability extends TeaModel {
        /**
         * <p>Default value: true. If set to false, the platform Python probe is not loaded at runtime, and you must collect observability data yourself.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static GetCustomAgentResponseBodyDataObservability build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentResponseBodyDataObservability self = new GetCustomAgentResponseBodyDataObservability();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentResponseBodyDataObservability setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class GetCustomAgentResponseBodyDataOssMounts extends TeaModel {
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
         * <p>Specifies whether the mount is read-only. A value of true indicates read-only, and false indicates read and write.</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        public static GetCustomAgentResponseBodyDataOssMounts build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentResponseBodyDataOssMounts self = new GetCustomAgentResponseBodyDataOssMounts();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentResponseBodyDataOssMounts setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetCustomAgentResponseBodyDataOssMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public GetCustomAgentResponseBodyDataOssMounts setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetCustomAgentResponseBodyDataOssMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class GetCustomAgentResponseBodyDataProtocolPaths extends TeaModel {
        /**
         * <p>The usage description of the current API path.</p>
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

        public static GetCustomAgentResponseBodyDataProtocolPaths build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentResponseBodyDataProtocolPaths self = new GetCustomAgentResponseBodyDataProtocolPaths();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentResponseBodyDataProtocolPaths setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCustomAgentResponseBodyDataProtocolPaths setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetCustomAgentResponseBodyDataProtocol extends TeaModel {
        /**
         * <p>The request header configuration for the current protocol. The key is the name and the value is a string.</p>
         */
        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        /**
         * <p>The list of API paths corresponding to the current protocol.</p>
         */
        @NameInMap("paths")
        public java.util.List<GetCustomAgentResponseBodyDataProtocolPaths> paths;

        /**
         * <p>The invocation protocol type. Valid values: agui: AG-UI protocol; openai-chat-completion: OpenAI Chat Completions compatible protocol; custom: custom protocol.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agui</p>
         */
        @NameInMap("type")
        public String type;

        public static GetCustomAgentResponseBodyDataProtocol build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentResponseBodyDataProtocol self = new GetCustomAgentResponseBodyDataProtocol();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentResponseBodyDataProtocol setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public GetCustomAgentResponseBodyDataProtocol setPaths(java.util.List<GetCustomAgentResponseBodyDataProtocolPaths> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<GetCustomAgentResponseBodyDataProtocolPaths> getPaths() {
            return this.paths;
        }

        public GetCustomAgentResponseBodyDataProtocol setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetCustomAgentResponseBodyDataRuntimeCompute extends TeaModel {
        /**
         * <p>The compute specification. Valid values: INTERACTIVE: 1 vCPU and 2 GiB of memory; STANDARD: 2 vCPUs and 4 GiB of memory; HEAVY: 4 vCPUs and 8 GiB of memory.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("computeClass")
        public String computeClass;

        public static GetCustomAgentResponseBodyDataRuntimeCompute build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentResponseBodyDataRuntimeCompute self = new GetCustomAgentResponseBodyDataRuntimeCompute();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentResponseBodyDataRuntimeCompute setComputeClass(String computeClass) {
            this.computeClass = computeClass;
            return this;
        }
        public String getComputeClass() {
            return this.computeClass;
        }

    }

    public static class GetCustomAgentResponseBodyDataRuntimeHpa extends TeaModel {
        /**
         * <p>Specifies whether to enable elastic scaling. A value of true indicates that elastic scaling is enabled. A value of false indicates that elastic scaling is disabled.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The configured maximum number of concurrent sessions for a single runtime instance.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("maxConcurrentSessionsPerSandbox")
        public Integer maxConcurrentSessionsPerSandbox;

        /**
         * <p>The configured maximum number of runtime instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxSandboxCount")
        public Integer maxSandboxCount;

        /**
         * <p>The configured minimum number of runtime instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minSandboxCount")
        public Integer minSandboxCount;

        /**
         * <p>The configured session idle timeout limit, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("sessionTtlSeconds")
        public Integer sessionTtlSeconds;

        public static GetCustomAgentResponseBodyDataRuntimeHpa build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentResponseBodyDataRuntimeHpa self = new GetCustomAgentResponseBodyDataRuntimeHpa();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentResponseBodyDataRuntimeHpa setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetCustomAgentResponseBodyDataRuntimeHpa setMaxConcurrentSessionsPerSandbox(Integer maxConcurrentSessionsPerSandbox) {
            this.maxConcurrentSessionsPerSandbox = maxConcurrentSessionsPerSandbox;
            return this;
        }
        public Integer getMaxConcurrentSessionsPerSandbox() {
            return this.maxConcurrentSessionsPerSandbox;
        }

        public GetCustomAgentResponseBodyDataRuntimeHpa setMaxSandboxCount(Integer maxSandboxCount) {
            this.maxSandboxCount = maxSandboxCount;
            return this;
        }
        public Integer getMaxSandboxCount() {
            return this.maxSandboxCount;
        }

        public GetCustomAgentResponseBodyDataRuntimeHpa setMinSandboxCount(Integer minSandboxCount) {
            this.minSandboxCount = minSandboxCount;
            return this;
        }
        public Integer getMinSandboxCount() {
            return this.minSandboxCount;
        }

        public GetCustomAgentResponseBodyDataRuntimeHpa setSessionTtlSeconds(Integer sessionTtlSeconds) {
            this.sessionTtlSeconds = sessionTtlSeconds;
            return this;
        }
        public Integer getSessionTtlSeconds() {
            return this.sessionTtlSeconds;
        }

    }

    public static class GetCustomAgentResponseBodyDataRuntimeSessionPolicy extends TeaModel {
        /**
         * <p>The name of the HTTP request header used by the session policy. This parameter is applicable to ISOLATED_HEADER_FIELD.</p>
         * 
         * <strong>example:</strong>
         * <p>X-Session-Id</p>
         */
        @NameInMap("headerName")
        public String headerName;

        /**
         * <p>The session policy type. Valid values: AFFINITY: session affinity; ISOLATED_HEADER_FIELD: uses the request header specified by headerName to associate sessions. ISOLATED_COOKIE is not recommended. The compatible value DISABLED in requests is returned as AFFINITY.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AFFINITY</p>
         */
        @NameInMap("type")
        public String type;

        public static GetCustomAgentResponseBodyDataRuntimeSessionPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentResponseBodyDataRuntimeSessionPolicy self = new GetCustomAgentResponseBodyDataRuntimeSessionPolicy();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentResponseBodyDataRuntimeSessionPolicy setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public GetCustomAgentResponseBodyDataRuntimeSessionPolicy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetCustomAgentResponseBodyDataRuntime extends TeaModel {
        /**
         * <p>The compute resource configuration of the agent runtime instance.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("compute")
        public GetCustomAgentResponseBodyDataRuntimeCompute compute;

        /**
         * <p>The elastic policy configuration of the agent.</p>
         */
        @NameInMap("hpa")
        public GetCustomAgentResponseBodyDataRuntimeHpa hpa;

        /**
         * <p>The session policy configuration of the agent.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("sessionPolicy")
        public GetCustomAgentResponseBodyDataRuntimeSessionPolicy sessionPolicy;

        public static GetCustomAgentResponseBodyDataRuntime build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentResponseBodyDataRuntime self = new GetCustomAgentResponseBodyDataRuntime();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentResponseBodyDataRuntime setCompute(GetCustomAgentResponseBodyDataRuntimeCompute compute) {
            this.compute = compute;
            return this;
        }
        public GetCustomAgentResponseBodyDataRuntimeCompute getCompute() {
            return this.compute;
        }

        public GetCustomAgentResponseBodyDataRuntime setHpa(GetCustomAgentResponseBodyDataRuntimeHpa hpa) {
            this.hpa = hpa;
            return this;
        }
        public GetCustomAgentResponseBodyDataRuntimeHpa getHpa() {
            return this.hpa;
        }

        public GetCustomAgentResponseBodyDataRuntime setSessionPolicy(GetCustomAgentResponseBodyDataRuntimeSessionPolicy sessionPolicy) {
            this.sessionPolicy = sessionPolicy;
            return this;
        }
        public GetCustomAgentResponseBodyDataRuntimeSessionPolicy getSessionPolicy() {
            return this.sessionPolicy;
        }

    }

    public static class GetCustomAgentResponseBodyData extends TeaModel {
        /**
         * <p>The unique identifier of the custom agent. You can obtain this identifier from the response of CreateCustomAgent or ListCustomAgents.</p>
         * <p>This parameter is required.</p>
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
        public java.util.List<GetCustomAgentResponseBodyDataAgenticFsMounts> agenticFsMounts;

        /**
         * <p>The latest submitted deployment artifact configuration, including the service listening port and ACR container image. To determine whether the configuration has taken effect, refer to latestVersionStatus.</p>
         */
        @NameInMap("artifact")
        public GetCustomAgentResponseBodyDataArtifact artifact;

        /**
         * <p>The creation method of the agent. CUSTOM is returned for custom agents.</p>
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
         * <p>The deployment method of the agent. MANAGED is returned for custom agents because they are deployed and managed by the platform.</p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("deployType")
        public String deployType;

        /**
         * <p>The description of the agent\&quot;s purpose.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom agent that provides conversational services</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The value is null if no effective version exists. Do not use latestSpecVersion as a substitute. This field cannot be used to release the occupation protection of old cached instances.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("effectiveSpecVersion")
        public Long effectiveSpecVersion;

        /**
         * <p>The environment variable configuration for the agent process.</p>
         */
        @NameInMap("environment")
        public GetCustomAgentResponseBodyDataEnvironment environment;

        /**
         * <p>The HTTP health check configuration of the agent. The value is empty if not configured.</p>
         */
        @NameInMap("healthCheck")
        public GetCustomAgentResponseBodyDataHealthCheck healthCheck;

        /**
         * <p>This field is always returned. If useImageCache is true, the value is the non-empty logical ID of the current workspace. If useImageCache is false, the value is null. The occupation of old instances after disabling is independently protected by the backend and is not backfilled as the current configuration association.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>img-example</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("imageCacheId")
        public String imageCacheId;

        /**
         * <p>The wait or execution error of the latest configuration version. This field is returned only when the version is waiting for a retry or fails to execute.</p>
         */
        @NameInMap("latestExecutionError")
        public GetCustomAgentResponseBodyDataLatestExecutionError latestExecutionError;

        /**
         * <p>The current latest configuration version number. Updates with the same configuration may retain the original version number. This field does not indicate that the configuration has taken effect.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("latestSpecVersion")
        public Long latestSpecVersion;

        /**
         * <p>The execution status corresponding to latestSpecVersion. Valid values: pending (waiting for execution), processing (executing), waiting_retry (waiting for a retry), succeeded (execution successful), failed (execution failed), and superseded (replaced by a subsequent version).</p>
         * 
         * <strong>example:</strong>
         * <p>succeeded</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("latestVersionStatus")
        public String latestVersionStatus;

        /**
         * <p>The latest submitted log delivery configuration.</p>
         */
        @NameInMap("logging")
        public GetCustomAgentResponseBodyDataLogging logging;

        /**
         * <p>The custom agent name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-custom-agent</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The network access configuration of the agent. The actual access scope is also restricted by the workspace network configuration.</p>
         */
        @NameInMap("network")
        public GetCustomAgentResponseBodyDataNetwork network;

        /**
         * <p>The high-code agent observability configuration.</p>
         */
        @NameInMap("observability")
        public GetCustomAgentResponseBodyDataObservability observability;

        /**
         * <p>The list of recently submitted OSS directory mounts.</p>
         */
        @NameInMap("ossMounts")
        public java.util.List<GetCustomAgentResponseBodyDataOssMounts> ossMounts;

        /**
         * <p>The list of invocation protocol configurations for the agent.</p>
         */
        @NameInMap("protocol")
        public java.util.List<GetCustomAgentResponseBodyDataProtocol> protocol;

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
         * <p>The latest committed runtime configuration, including compute specifications, session policy, and elastic policy.</p>
         */
        @NameInMap("runtime")
        public GetCustomAgentResponseBodyDataRuntime runtime;

        /**
         * <p>The number of instances by runtime instance phase. Keys include PENDING (creating or initializing), RUNNING (running), HIBERNATING (hibernating), HIBERNATED (hibernated), RESUMING (resuming), TERMINATING (terminating), and FAILED (failed). Only phases that actually occur are returned. Missing keys are treated as 0.</p>
         */
        @NameInMap("sandboxPhaseCounts")
        public java.util.Map<String, Long> sandboxPhaseCounts;

        /**
         * <p>The overall status of the agent. Valid values: Creating: creating; Running: running; Failed: failed; Updating: updating; Deleting: deleting; Deleted: deleted. To query the execution progress of the latest configuration, check latestVersionStatus.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The time when the agent was last updated. The time is in ISO 8601 format. The trailing Z indicates the UTC time zone. Fractional seconds may be included.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-10T06:05:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>Required. Reflects the accepted final configuration. If this field is missing in historical data, false is returned. Do not infer based on the cache status.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("useImageCache")
        public Boolean useImageCache;

        /**
         * <p>The ID of the workspace to which the custom agent belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-a1b2c3d4e5f6</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static GetCustomAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomAgentResponseBodyData self = new GetCustomAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomAgentResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetCustomAgentResponseBodyData setAgenticFsMounts(java.util.List<GetCustomAgentResponseBodyDataAgenticFsMounts> agenticFsMounts) {
            this.agenticFsMounts = agenticFsMounts;
            return this;
        }
        public java.util.List<GetCustomAgentResponseBodyDataAgenticFsMounts> getAgenticFsMounts() {
            return this.agenticFsMounts;
        }

        public GetCustomAgentResponseBodyData setArtifact(GetCustomAgentResponseBodyDataArtifact artifact) {
            this.artifact = artifact;
            return this;
        }
        public GetCustomAgentResponseBodyDataArtifact getArtifact() {
            return this.artifact;
        }

        public GetCustomAgentResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public GetCustomAgentResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetCustomAgentResponseBodyData setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public GetCustomAgentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCustomAgentResponseBodyData setEffectiveSpecVersion(Long effectiveSpecVersion) {
            this.effectiveSpecVersion = effectiveSpecVersion;
            return this;
        }
        public Long getEffectiveSpecVersion() {
            return this.effectiveSpecVersion;
        }

        public GetCustomAgentResponseBodyData setEnvironment(GetCustomAgentResponseBodyDataEnvironment environment) {
            this.environment = environment;
            return this;
        }
        public GetCustomAgentResponseBodyDataEnvironment getEnvironment() {
            return this.environment;
        }

        public GetCustomAgentResponseBodyData setHealthCheck(GetCustomAgentResponseBodyDataHealthCheck healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public GetCustomAgentResponseBodyDataHealthCheck getHealthCheck() {
            return this.healthCheck;
        }

        public GetCustomAgentResponseBodyData setImageCacheId(String imageCacheId) {
            this.imageCacheId = imageCacheId;
            return this;
        }
        public String getImageCacheId() {
            return this.imageCacheId;
        }

        public GetCustomAgentResponseBodyData setLatestExecutionError(GetCustomAgentResponseBodyDataLatestExecutionError latestExecutionError) {
            this.latestExecutionError = latestExecutionError;
            return this;
        }
        public GetCustomAgentResponseBodyDataLatestExecutionError getLatestExecutionError() {
            return this.latestExecutionError;
        }

        public GetCustomAgentResponseBodyData setLatestSpecVersion(Long latestSpecVersion) {
            this.latestSpecVersion = latestSpecVersion;
            return this;
        }
        public Long getLatestSpecVersion() {
            return this.latestSpecVersion;
        }

        public GetCustomAgentResponseBodyData setLatestVersionStatus(String latestVersionStatus) {
            this.latestVersionStatus = latestVersionStatus;
            return this;
        }
        public String getLatestVersionStatus() {
            return this.latestVersionStatus;
        }

        public GetCustomAgentResponseBodyData setLogging(GetCustomAgentResponseBodyDataLogging logging) {
            this.logging = logging;
            return this;
        }
        public GetCustomAgentResponseBodyDataLogging getLogging() {
            return this.logging;
        }

        public GetCustomAgentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCustomAgentResponseBodyData setNetwork(GetCustomAgentResponseBodyDataNetwork network) {
            this.network = network;
            return this;
        }
        public GetCustomAgentResponseBodyDataNetwork getNetwork() {
            return this.network;
        }

        public GetCustomAgentResponseBodyData setObservability(GetCustomAgentResponseBodyDataObservability observability) {
            this.observability = observability;
            return this;
        }
        public GetCustomAgentResponseBodyDataObservability getObservability() {
            return this.observability;
        }

        public GetCustomAgentResponseBodyData setOssMounts(java.util.List<GetCustomAgentResponseBodyDataOssMounts> ossMounts) {
            this.ossMounts = ossMounts;
            return this;
        }
        public java.util.List<GetCustomAgentResponseBodyDataOssMounts> getOssMounts() {
            return this.ossMounts;
        }

        public GetCustomAgentResponseBodyData setProtocol(java.util.List<GetCustomAgentResponseBodyDataProtocol> protocol) {
            this.protocol = protocol;
            return this;
        }
        public java.util.List<GetCustomAgentResponseBodyDataProtocol> getProtocol() {
            return this.protocol;
        }

        public GetCustomAgentResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetCustomAgentResponseBodyData setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public GetCustomAgentResponseBodyData setRuntime(GetCustomAgentResponseBodyDataRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public GetCustomAgentResponseBodyDataRuntime getRuntime() {
            return this.runtime;
        }

        public GetCustomAgentResponseBodyData setSandboxPhaseCounts(java.util.Map<String, Long> sandboxPhaseCounts) {
            this.sandboxPhaseCounts = sandboxPhaseCounts;
            return this;
        }
        public java.util.Map<String, Long> getSandboxPhaseCounts() {
            return this.sandboxPhaseCounts;
        }

        public GetCustomAgentResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCustomAgentResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetCustomAgentResponseBodyData setUseImageCache(Boolean useImageCache) {
            this.useImageCache = useImageCache;
            return this;
        }
        public Boolean getUseImageCache() {
            return this.useImageCache;
        }

        public GetCustomAgentResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
