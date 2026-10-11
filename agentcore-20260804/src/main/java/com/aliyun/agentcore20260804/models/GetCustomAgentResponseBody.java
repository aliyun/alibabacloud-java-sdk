// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetCustomAgentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetCustomAgentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>550E8400-E29B-41D4-A716-446655440000</p>
     */
    @NameInMap("requestId")
    public String requestId;

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
         * <strong>example:</strong>
         * <p>/mnt/agenticfs/data</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <strong>example:</strong>
         * <p>workspace/data</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>python app.py</p>
         */
        @NameInMap("entrypoint")
        public String entrypoint;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>python</p>
         */
        @NameInMap("languageRuntime")
        public String languageRuntime;

        /**
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
         * <strong>example:</strong>
         * <p>python app.py</p>
         */
        @NameInMap("entrypoint")
        public String entrypoint;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-a1b2c3d4e5f6</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>chat-agent</p>
         */
        @NameInMap("repo")
        public String repo;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
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
        @NameInMap("code")
        public GetCustomAgentResponseBodyDataArtifactCode code;

        @NameInMap("container")
        public GetCustomAgentResponseBodyDataArtifactContainer container;

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LOG_LEVEL</p>
         */
        @NameInMap("name")
        public String name;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("healthyThreshold")
        public Integer healthyThreshold;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("intervalSeconds")
        public Integer intervalSeconds;

        /**
         * <strong>example:</strong>
         * <p>/healthz</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("timeoutSeconds")
        public Integer timeoutSeconds;

        /**
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
         * <strong>example:</strong>
         * <p>AgentExecutionFailed</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>Agent 执行失败，请检查配置后重新提交。</p>
         */
        @NameInMap("message")
        public String message;

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
         * <strong>example:</strong>
         * <p>agent-runtime</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
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
        @NameInMap("accessInternet")
        public GetCustomAgentResponseBodyDataNetworkAccessInternet accessInternet;

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

    public static class GetCustomAgentResponseBodyDataOssMounts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>my-agent-data</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <strong>example:</strong>
         * <p>/mnt/oss/train</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <strong>example:</strong>
         * <p>datasets/train</p>
         */
        @NameInMap("path")
        public String path;

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
         * <strong>example:</strong>
         * <p>AG-UI 对话接口</p>
         */
        @NameInMap("description")
        public String description;

        /**
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
        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        @NameInMap("paths")
        public java.util.List<GetCustomAgentResponseBodyDataProtocolPaths> paths;

        /**
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>正整数，必须与 sessionTtlSeconds 同时配置。</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("maxConcurrentSessionsPerSandbox")
        public Integer maxConcurrentSessionsPerSandbox;

        /**
         * <p>开启时为正整数，关闭时为非负整数；不得小于 minSandboxCount。</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxSandboxCount")
        public Integer maxSandboxCount;

        /**
         * <p>非负整数。开启弹性时必填；关闭时如提供上下限，必须成对提供。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minSandboxCount")
        public Integer minSandboxCount;

        /**
         * <p>正整数，必须与 maxConcurrentSessionsPerSandbox 同时配置。</p>
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
         * <strong>example:</strong>
         * <p>X-Session-Id</p>
         */
        @NameInMap("headerName")
        public String headerName;

        /**
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("compute")
        public GetCustomAgentResponseBodyDataRuntimeCompute compute;

        /**
         * <p>Agent 当前 spec 版本的 HPA 配置，与 Managed Agent 一致。开启时必须提供最小和最大 Sandbox 数；并发会话上限与会话空闲超时必须一起配置。</p>
         */
        @NameInMap("hpa")
        public GetCustomAgentResponseBodyDataRuntimeHpa hpa;

        /**
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
         * <strong>example:</strong>
         * <p>agent-550e8400e29b41d4a716446655440000</p>
         */
        @NameInMap("agentId")
        public String agentId;

        @NameInMap("agenticFsMounts")
        public java.util.List<GetCustomAgentResponseBodyDataAgenticFsMounts> agenticFsMounts;

        @NameInMap("artifact")
        public GetCustomAgentResponseBodyDataArtifact artifact;

        /**
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("createMode")
        public String createMode;

        /**
         * <strong>example:</strong>
         * <p>2026-10-10T06:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("deployType")
        public String deployType;

        /**
         * <strong>example:</strong>
         * <p>提供对话服务的自定义智能体</p>
         */
        @NameInMap("description")
        public String description;

        @NameInMap("environment")
        public GetCustomAgentResponseBodyDataEnvironment environment;

        @NameInMap("healthCheck")
        public GetCustomAgentResponseBodyDataHealthCheck healthCheck;

        /**
         * <p>可选。仅解释同一响应 latestSpecVersion/latestVersionStatus 的等待或失败；正常待处理、执行中或成功时省略。消息由 Console 白名单映射，不返回原始运行时诊断、Checkpoint 或凭证。</p>
         */
        @NameInMap("latestExecutionError")
        public GetCustomAgentResponseBodyDataLatestExecutionError latestExecutionError;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("latestSpecVersion")
        public Long latestSpecVersion;

        /**
         * <strong>example:</strong>
         * <p>succeeded</p>
         */
        @NameInMap("latestVersionStatus")
        public String latestVersionStatus;

        @NameInMap("logging")
        public GetCustomAgentResponseBodyDataLogging logging;

        /**
         * <strong>example:</strong>
         * <p>my-custom-agent</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("network")
        public GetCustomAgentResponseBodyDataNetwork network;

        @NameInMap("ossMounts")
        public java.util.List<GetCustomAgentResponseBodyDataOssMounts> ossMounts;

        @NameInMap("protocol")
        public java.util.List<GetCustomAgentResponseBodyDataProtocol> protocol;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>acs:ram::1234567890123456:role/agentcore-runtime-role</p>
         */
        @NameInMap("roleArn")
        public String roleArn;

        @NameInMap("runtime")
        public GetCustomAgentResponseBodyDataRuntime runtime;

        @NameInMap("sandboxPhaseCounts")
        public java.util.Map<String, Long> sandboxPhaseCounts;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2026-10-10T06:05:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
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

        public GetCustomAgentResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
