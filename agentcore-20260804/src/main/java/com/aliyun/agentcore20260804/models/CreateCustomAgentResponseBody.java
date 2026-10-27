// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateCustomAgentResponseBody extends TeaModel {
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
     * <p>The latest submitted configuration and status of the custom agent. A successful response indicates that the request is accepted, but the configuration may not have taken effect.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("data")
    public CreateCustomAgentResponseBodyData data;

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
     * <p>The result message of the request. The value is success if the request succeeds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The unique identifier of the request. You can use this ID to locate and troubleshoot issues.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550E8400-E29B-41D4-A716-446655440000</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. A value of true indicates success. A successful creation, update, or deletion does not mean that the background operation is complete.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateCustomAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomAgentResponseBody self = new CreateCustomAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCustomAgentResponseBody setData(CreateCustomAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateCustomAgentResponseBodyData getData() {
        return this.data;
    }

    public CreateCustomAgentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateCustomAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCustomAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCustomAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateCustomAgentResponseBodyDataAgenticFsMounts extends TeaModel {
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
         * <p>Specifies whether the mount is read-only. Valid values:</p>
         * <ul>
         * <li>true: Read-only.</li>
         * <li>false: Readable and writable.</li>
         * </ul>
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

        public static CreateCustomAgentResponseBodyDataAgenticFsMounts build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataAgenticFsMounts self = new CreateCustomAgentResponseBodyDataAgenticFsMounts();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataAgenticFsMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public CreateCustomAgentResponseBodyDataAgenticFsMounts setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateCustomAgentResponseBodyDataAgenticFsMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public CreateCustomAgentResponseBodyDataAgenticFsMounts setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

    }

    public static class CreateCustomAgentResponseBodyDataArtifactCode extends TeaModel {
        /**
         * <p>The startup command for the code package. This parameter is required in code package mode. The working directory is the root directory of the extracted code, which is /code. Example: python main.py. Quotes and escapes are supported. Environment variables, pipes, and logical operations are not automatically expanded. For complex commands, use a script within the package.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>python main.py</p>
         */
        @NameInMap("entrypoint")
        public String entrypoint;

        /**
         * <p>The identifier of the code runtime environment in the currently saved configuration. The runtime image uses the saved snapshot. Adding a new version to the directory does not automatically change the existing configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>python3.12</p>
         */
        @NameInMap("languageRuntime")
        public String languageRuntime;

        /**
         * <p>The oss:// address of the platform-fixed code package referenced in the currently saved configuration. This address does not include the signature parameters of the source HTTPS link. You can use this address to reuse an existing code package. To download the content, call GetAgentCodePackageDownloadUrl.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://agentcore-platform-example/code-packages/workspaces/ws-a1b2c3d4e5f6/550e8400-e29b-41d4-a716-446655440000/package.zip</p>
         */
        @NameInMap("sourceUri")
        public String sourceUri;

        public static CreateCustomAgentResponseBodyDataArtifactCode build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataArtifactCode self = new CreateCustomAgentResponseBodyDataArtifactCode();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataArtifactCode setEntrypoint(String entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public String getEntrypoint() {
            return this.entrypoint;
        }

        public CreateCustomAgentResponseBodyDataArtifactCode setLanguageRuntime(String languageRuntime) {
            this.languageRuntime = languageRuntime;
            return this;
        }
        public String getLanguageRuntime() {
            return this.languageRuntime;
        }

        public CreateCustomAgentResponseBodyDataArtifactCode setSourceUri(String sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }
        public String getSourceUri() {
            return this.sourceUri;
        }

    }

    public static class CreateCustomAgentResponseBodyDataArtifactContainer extends TeaModel {
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
         * <p>The source type of the image. A value of acr indicates Alibaba Cloud Container Registry (ACR).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acr</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateCustomAgentResponseBodyDataArtifactContainer build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataArtifactContainer self = new CreateCustomAgentResponseBodyDataArtifactContainer();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataArtifactContainer setEntrypoint(String entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public String getEntrypoint() {
            return this.entrypoint;
        }

        public CreateCustomAgentResponseBodyDataArtifactContainer setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateCustomAgentResponseBodyDataArtifactContainer setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateCustomAgentResponseBodyDataArtifactContainer setRepo(String repo) {
            this.repo = repo;
            return this;
        }
        public String getRepo() {
            return this.repo;
        }

        public CreateCustomAgentResponseBodyDataArtifactContainer setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public CreateCustomAgentResponseBodyDataArtifactContainer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateCustomAgentResponseBodyDataArtifact extends TeaModel {
        /**
         * <p>The code package deployment configuration. This parameter is mutually exclusive with container. Code packages use the ZIP or TAR.GZ format. Dependencies must be packaged by the user. The platform does not install dependencies or perform online builds.</p>
         */
        @NameInMap("code")
        public CreateCustomAgentResponseBodyDataArtifactCode code;

        /**
         * <p>The latest submitted ACR container image configuration.</p>
         */
        @NameInMap("container")
        public CreateCustomAgentResponseBodyDataArtifactContainer container;

        /**
         * <p>The TCP port listened on by the agent service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        public static CreateCustomAgentResponseBodyDataArtifact build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataArtifact self = new CreateCustomAgentResponseBodyDataArtifact();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataArtifact setCode(CreateCustomAgentResponseBodyDataArtifactCode code) {
            this.code = code;
            return this;
        }
        public CreateCustomAgentResponseBodyDataArtifactCode getCode() {
            return this.code;
        }

        public CreateCustomAgentResponseBodyDataArtifact setContainer(CreateCustomAgentResponseBodyDataArtifactContainer container) {
            this.container = container;
            return this;
        }
        public CreateCustomAgentResponseBodyDataArtifactContainer getContainer() {
            return this.container;
        }

        public CreateCustomAgentResponseBodyDataArtifact setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class CreateCustomAgentResponseBodyDataCodePackageInfo extends TeaModel {
        /**
         * <p>The CRC64 checksum of the code package object.</p>
         * 
         * <strong>example:</strong>
         * <p>456</p>
         */
        @NameInMap("crc64")
        public String crc64;

        /**
         * <p>The ETag of the code package object.</p>
         * 
         * <strong>example:</strong>
         * <p>fixed-etag</p>
         */
        @NameInMap("etag")
        public String etag;

        /**
         * <p>The original file name of the code package.</p>
         * 
         * <strong>example:</strong>
         * <p>main.zip</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <p>The compressed size of the code package.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("fileSize")
        public Long fileSize;

        /**
         * <p>The format of the code package.</p>
         * 
         * <strong>example:</strong>
         * <p>zip</p>
         */
        @NameInMap("format")
        public String format;

        public static CreateCustomAgentResponseBodyDataCodePackageInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataCodePackageInfo self = new CreateCustomAgentResponseBodyDataCodePackageInfo();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataCodePackageInfo setCrc64(String crc64) {
            this.crc64 = crc64;
            return this;
        }
        public String getCrc64() {
            return this.crc64;
        }

        public CreateCustomAgentResponseBodyDataCodePackageInfo setEtag(String etag) {
            this.etag = etag;
            return this;
        }
        public String getEtag() {
            return this.etag;
        }

        public CreateCustomAgentResponseBodyDataCodePackageInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateCustomAgentResponseBodyDataCodePackageInfo setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public CreateCustomAgentResponseBodyDataCodePackageInfo setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class CreateCustomAgentResponseBodyDataEnvironmentVariables extends TeaModel {
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

        public static CreateCustomAgentResponseBodyDataEnvironmentVariables build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataEnvironmentVariables self = new CreateCustomAgentResponseBodyDataEnvironmentVariables();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataEnvironmentVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateCustomAgentResponseBodyDataEnvironmentVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateCustomAgentResponseBodyDataEnvironment extends TeaModel {
        /**
         * <p>The latest submitted list of environment variables.</p>
         */
        @NameInMap("variables")
        public java.util.List<CreateCustomAgentResponseBodyDataEnvironmentVariables> variables;

        public static CreateCustomAgentResponseBodyDataEnvironment build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataEnvironment self = new CreateCustomAgentResponseBodyDataEnvironment();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataEnvironment setVariables(java.util.List<CreateCustomAgentResponseBodyDataEnvironmentVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<CreateCustomAgentResponseBodyDataEnvironmentVariables> getVariables() {
            return this.variables;
        }

    }

    public static class CreateCustomAgentResponseBodyDataHealthCheck extends TeaModel {
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
         * <p>The HTTP Health Check Path.</p>
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

        public static CreateCustomAgentResponseBodyDataHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataHealthCheck self = new CreateCustomAgentResponseBodyDataHealthCheck();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataHealthCheck setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public CreateCustomAgentResponseBodyDataHealthCheck setIntervalSeconds(Integer intervalSeconds) {
            this.intervalSeconds = intervalSeconds;
            return this;
        }
        public Integer getIntervalSeconds() {
            return this.intervalSeconds;
        }

        public CreateCustomAgentResponseBodyDataHealthCheck setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateCustomAgentResponseBodyDataHealthCheck setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateCustomAgentResponseBodyDataHealthCheck setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public CreateCustomAgentResponseBodyDataHealthCheck setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

    }

    public static class CreateCustomAgentResponseBodyDataImageCachePreparation extends TeaModel {
        /**
         * <p>The ID of the cache associated with this request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>img-example</p>
         */
        @NameInMap("imageId")
        public String imageId;

        /**
         * <p>The cache status at the time of acceptance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("statusAtAcceptance")
        public String statusAtAcceptance;

        /**
         * <p>The acceptance status of the cache preparation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACCEPTED</p>
         */
        @NameInMap("submissionStatus")
        public String submissionStatus;

        public static CreateCustomAgentResponseBodyDataImageCachePreparation build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataImageCachePreparation self = new CreateCustomAgentResponseBodyDataImageCachePreparation();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataImageCachePreparation setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateCustomAgentResponseBodyDataImageCachePreparation setStatusAtAcceptance(String statusAtAcceptance) {
            this.statusAtAcceptance = statusAtAcceptance;
            return this;
        }
        public String getStatusAtAcceptance() {
            return this.statusAtAcceptance;
        }

        public CreateCustomAgentResponseBodyDataImageCachePreparation setSubmissionStatus(String submissionStatus) {
            this.submissionStatus = submissionStatus;
            return this;
        }
        public String getSubmissionStatus() {
            return this.submissionStatus;
        }

    }

    public static class CreateCustomAgentResponseBodyDataLatestExecutionError extends TeaModel {
        /**
         * <p>The reason code for the wait or execution failure of the latest configuration, which is used to determine the subsequent handling method.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AgentExecutionFailed</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The description of the reason why the latest configuration failed to wait or execute. Use this field along with the code and retryable fields to determine What to do next.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent execution failed. Check the configuration and resubmit</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>Specifies whether the system automatically retries the operation. If the value is true, you can query the status again later. If the value is false, check and fix the configuration based on the failure reason, and then resubmit the request.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("retryable")
        public Boolean retryable;

        public static CreateCustomAgentResponseBodyDataLatestExecutionError build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataLatestExecutionError self = new CreateCustomAgentResponseBodyDataLatestExecutionError();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataLatestExecutionError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateCustomAgentResponseBodyDataLatestExecutionError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateCustomAgentResponseBodyDataLatestExecutionError setRetryable(Boolean retryable) {
            this.retryable = retryable;
            return this;
        }
        public Boolean getRetryable() {
            return this.retryable;
        }

    }

    public static class CreateCustomAgentResponseBodyDataLoggingSls extends TeaModel {
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

        public static CreateCustomAgentResponseBodyDataLoggingSls build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataLoggingSls self = new CreateCustomAgentResponseBodyDataLoggingSls();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataLoggingSls setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public CreateCustomAgentResponseBodyDataLoggingSls setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class CreateCustomAgentResponseBodyDataLogging extends TeaModel {
        /**
         * <p>The Simple Log Service (SLS) log delivery destination.</p>
         */
        @NameInMap("sls")
        public CreateCustomAgentResponseBodyDataLoggingSls sls;

        public static CreateCustomAgentResponseBodyDataLogging build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataLogging self = new CreateCustomAgentResponseBodyDataLogging();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataLogging setSls(CreateCustomAgentResponseBodyDataLoggingSls sls) {
            this.sls = sls;
            return this;
        }
        public CreateCustomAgentResponseBodyDataLoggingSls getSls() {
            return this.sls;
        }

    }

    public static class CreateCustomAgentResponseBodyDataNetworkAccessInternet extends TeaModel {
        /**
         * <p>Specifies whether Internet access is allowed on the agent side. The actual access is still restricted by the workspace.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static CreateCustomAgentResponseBodyDataNetworkAccessInternet build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataNetworkAccessInternet self = new CreateCustomAgentResponseBodyDataNetworkAccessInternet();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataNetworkAccessInternet setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class CreateCustomAgentResponseBodyDataNetworkAccessVpc extends TeaModel {
        /**
         * <p>Specifies whether access to the user VPC configured for the workspace is allowed on the agent side. The actual access is still restricted by the workspace.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static CreateCustomAgentResponseBodyDataNetworkAccessVpc build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataNetworkAccessVpc self = new CreateCustomAgentResponseBodyDataNetworkAccessVpc();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataNetworkAccessVpc setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class CreateCustomAgentResponseBodyDataNetwork extends TeaModel {
        /**
         * <p>The Internet access configuration of the agent. If this field is not configured, Internet access is allowed on the agent side but is still restricted by the workspace.</p>
         */
        @NameInMap("accessInternet")
        public CreateCustomAgentResponseBodyDataNetworkAccessInternet accessInternet;

        /**
         * <p>The user VPC access configuration of the agent. If this field is not configured, user VPC access is allowed on the agent side but is still restricted by the workspace.</p>
         */
        @NameInMap("accessVpc")
        public CreateCustomAgentResponseBodyDataNetworkAccessVpc accessVpc;

        public static CreateCustomAgentResponseBodyDataNetwork build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataNetwork self = new CreateCustomAgentResponseBodyDataNetwork();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataNetwork setAccessInternet(CreateCustomAgentResponseBodyDataNetworkAccessInternet accessInternet) {
            this.accessInternet = accessInternet;
            return this;
        }
        public CreateCustomAgentResponseBodyDataNetworkAccessInternet getAccessInternet() {
            return this.accessInternet;
        }

        public CreateCustomAgentResponseBodyDataNetwork setAccessVpc(CreateCustomAgentResponseBodyDataNetworkAccessVpc accessVpc) {
            this.accessVpc = accessVpc;
            return this;
        }
        public CreateCustomAgentResponseBodyDataNetworkAccessVpc getAccessVpc() {
            return this.accessVpc;
        }

    }

    public static class CreateCustomAgentResponseBodyDataObservability extends TeaModel {
        /**
         * <p>Specifies whether to enable agent observability.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static CreateCustomAgentResponseBodyDataObservability build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataObservability self = new CreateCustomAgentResponseBodyDataObservability();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataObservability setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class CreateCustomAgentResponseBodyDataOssMounts extends TeaModel {
        /**
         * <p>The name of the mounted OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-data</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The OSS mount directory in the container, which is located under /mnt/oss/.</p>
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
         * <p>Specifies whether the mount is read-only. Valid values:</p>
         * <ul>
         * <li>true: Read-only.</li>
         * <li>false: Readable and writable.</li>
         * </ul>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        public static CreateCustomAgentResponseBodyDataOssMounts build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataOssMounts self = new CreateCustomAgentResponseBodyDataOssMounts();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataOssMounts setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public CreateCustomAgentResponseBodyDataOssMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public CreateCustomAgentResponseBodyDataOssMounts setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateCustomAgentResponseBodyDataOssMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class CreateCustomAgentResponseBodyDataProtocolPaths extends TeaModel {
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

        public static CreateCustomAgentResponseBodyDataProtocolPaths build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataProtocolPaths self = new CreateCustomAgentResponseBodyDataProtocolPaths();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataProtocolPaths setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateCustomAgentResponseBodyDataProtocolPaths setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateCustomAgentResponseBodyDataProtocol extends TeaModel {
        /**
         * <p>The request header configuration for the current protocol. The key is the header name, and the value is a string.</p>
         */
        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        /**
         * <p>The list of API paths corresponding to the current protocol.</p>
         */
        @NameInMap("paths")
        public java.util.List<CreateCustomAgentResponseBodyDataProtocolPaths> paths;

        /**
         * <p>The invocation protocol type. Valid values: agui: AG-UI protocol. openai-chat-completion: OpenAI Chat Completions compatible protocol. custom: Custom protocol.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agui</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateCustomAgentResponseBodyDataProtocol build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataProtocol self = new CreateCustomAgentResponseBodyDataProtocol();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataProtocol setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public CreateCustomAgentResponseBodyDataProtocol setPaths(java.util.List<CreateCustomAgentResponseBodyDataProtocolPaths> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<CreateCustomAgentResponseBodyDataProtocolPaths> getPaths() {
            return this.paths;
        }

        public CreateCustomAgentResponseBodyDataProtocol setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateCustomAgentResponseBodyDataRuntimeCompute extends TeaModel {
        /**
         * <p>The compute specification. Valid values: INTERACTIVE: 1 vCPU and 2 GiB of memory. STANDARD: 2 vCPUs and 4 GiB of memory. HEAVY: 4 vCPUs and 8 GiB of memory.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("computeClass")
        public String computeClass;

        public static CreateCustomAgentResponseBodyDataRuntimeCompute build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataRuntimeCompute self = new CreateCustomAgentResponseBodyDataRuntimeCompute();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataRuntimeCompute setComputeClass(String computeClass) {
            this.computeClass = computeClass;
            return this;
        }
        public String getComputeClass() {
            return this.computeClass;
        }

    }

    public static class CreateCustomAgentResponseBodyDataRuntimeHpa extends TeaModel {
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
         * <p>The maximum idle time for a session, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("sessionTtlSeconds")
        public Integer sessionTtlSeconds;

        public static CreateCustomAgentResponseBodyDataRuntimeHpa build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataRuntimeHpa self = new CreateCustomAgentResponseBodyDataRuntimeHpa();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataRuntimeHpa setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateCustomAgentResponseBodyDataRuntimeHpa setMaxConcurrentSessionsPerSandbox(Integer maxConcurrentSessionsPerSandbox) {
            this.maxConcurrentSessionsPerSandbox = maxConcurrentSessionsPerSandbox;
            return this;
        }
        public Integer getMaxConcurrentSessionsPerSandbox() {
            return this.maxConcurrentSessionsPerSandbox;
        }

        public CreateCustomAgentResponseBodyDataRuntimeHpa setMaxSandboxCount(Integer maxSandboxCount) {
            this.maxSandboxCount = maxSandboxCount;
            return this;
        }
        public Integer getMaxSandboxCount() {
            return this.maxSandboxCount;
        }

        public CreateCustomAgentResponseBodyDataRuntimeHpa setMinSandboxCount(Integer minSandboxCount) {
            this.minSandboxCount = minSandboxCount;
            return this;
        }
        public Integer getMinSandboxCount() {
            return this.minSandboxCount;
        }

        public CreateCustomAgentResponseBodyDataRuntimeHpa setSessionTtlSeconds(Integer sessionTtlSeconds) {
            this.sessionTtlSeconds = sessionTtlSeconds;
            return this;
        }
        public Integer getSessionTtlSeconds() {
            return this.sessionTtlSeconds;
        }

    }

    public static class CreateCustomAgentResponseBodyDataRuntimeSessionPolicy extends TeaModel {
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
         * <li>ISOLATED_HEADER_FIELD: Associates sessions by using the request header specified by headerName.
         * ISOLATED_COOKIE is not recommended. The compatible value DISABLED in a request is returned as AFFINITY.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AFFINITY</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateCustomAgentResponseBodyDataRuntimeSessionPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataRuntimeSessionPolicy self = new CreateCustomAgentResponseBodyDataRuntimeSessionPolicy();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataRuntimeSessionPolicy setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public CreateCustomAgentResponseBodyDataRuntimeSessionPolicy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateCustomAgentResponseBodyDataRuntime extends TeaModel {
        /**
         * <p>The compute resource configuration for the agent runtime instance.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("compute")
        public CreateCustomAgentResponseBodyDataRuntimeCompute compute;

        /**
         * <p>The elastic policy configuration of the agent.</p>
         */
        @NameInMap("hpa")
        public CreateCustomAgentResponseBodyDataRuntimeHpa hpa;

        /**
         * <p>The session policy configuration of the agent.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("sessionPolicy")
        public CreateCustomAgentResponseBodyDataRuntimeSessionPolicy sessionPolicy;

        public static CreateCustomAgentResponseBodyDataRuntime build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyDataRuntime self = new CreateCustomAgentResponseBodyDataRuntime();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyDataRuntime setCompute(CreateCustomAgentResponseBodyDataRuntimeCompute compute) {
            this.compute = compute;
            return this;
        }
        public CreateCustomAgentResponseBodyDataRuntimeCompute getCompute() {
            return this.compute;
        }

        public CreateCustomAgentResponseBodyDataRuntime setHpa(CreateCustomAgentResponseBodyDataRuntimeHpa hpa) {
            this.hpa = hpa;
            return this;
        }
        public CreateCustomAgentResponseBodyDataRuntimeHpa getHpa() {
            return this.hpa;
        }

        public CreateCustomAgentResponseBodyDataRuntime setSessionPolicy(CreateCustomAgentResponseBodyDataRuntimeSessionPolicy sessionPolicy) {
            this.sessionPolicy = sessionPolicy;
            return this;
        }
        public CreateCustomAgentResponseBodyDataRuntimeSessionPolicy getSessionPolicy() {
            return this.sessionPolicy;
        }

    }

    public static class CreateCustomAgentResponseBodyData extends TeaModel {
        /**
         * <p>The unique identifier of the custom agent. You can obtain this ID from the response of CreateCustomAgent or ListCustomAgents.</p>
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
        public java.util.List<CreateCustomAgentResponseBodyDataAgenticFsMounts> agenticFsMounts;

        /**
         * <p>The latest submitted deployment artifact configuration, including the service listening port and the ACR container image. To check whether the configuration has taken effect, refer to latestVersionStatus.</p>
         */
        @NameInMap("artifact")
        public CreateCustomAgentResponseBodyDataArtifact artifact;

        /**
         * <p>The currently saved code package information.</p>
         */
        @NameInMap("codePackageInfo")
        public CreateCustomAgentResponseBodyDataCodePackageInfo codePackageInfo;

        /**
         * <p>The creation method of the agent. For custom agents, the value is CUSTOM.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("createMode")
        public String createMode;

        /**
         * <p>The time when the agent was created. The time is in ISO 8601 format. The trailing Z indicates the UTC time zone. Fractional seconds may be included.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-10T06:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The deployment method of the agent. Custom agents are deployed and managed by the platform. The value is MANAGED.</p>
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
         * <p>The effective configuration version.</p>
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
        public CreateCustomAgentResponseBodyDataEnvironment environment;

        /**
         * <p>The HTTP health check configuration of the agent. This field is empty if no health check is configured.</p>
         */
        @NameInMap("healthCheck")
        public CreateCustomAgentResponseBodyDataHealthCheck healthCheck;

        /**
         * <p>The ID of the currently associated image cache.</p>
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
         * <p>The cache preparation acceptance summary for this request.</p>
         */
        @NameInMap("imageCachePreparation")
        public CreateCustomAgentResponseBodyDataImageCachePreparation imageCachePreparation;

        /**
         * <p>The wait or execution error of the latest configuration version. This field is returned only when the version is waiting for a retry or fails to execute.</p>
         */
        @NameInMap("latestExecutionError")
        public CreateCustomAgentResponseBodyDataLatestExecutionError latestExecutionError;

        /**
         * <p>The current latest configuration version number. Updates to the same configuration may retain the original version number. This field does not indicate that the configuration has taken effect.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("latestSpecVersion")
        public Long latestSpecVersion;

        /**
         * <p>The execution status corresponding to the latestSpecVersion. Valid values:</p>
         * <ul>
         * <li>pending: Waiting for execution.</li>
         * <li>processing: Executing.</li>
         * <li>waiting_retry: Waiting for a retry.</li>
         * <li>succeeded: Execution succeeded.</li>
         * <li>failed: Execution failed.</li>
         * <li>superseded: Superseded by a subsequent version.</li>
         * </ul>
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
        public CreateCustomAgentResponseBodyDataLogging logging;

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
         * <p>The network access configuration of the agent. The actual access scope is also restricted by the network configuration of the workspace.</p>
         */
        @NameInMap("network")
        public CreateCustomAgentResponseBodyDataNetwork network;

        /**
         * <p>The high-code agent observability configuration.</p>
         */
        @NameInMap("observability")
        public CreateCustomAgentResponseBodyDataObservability observability;

        /**
         * <p>The latest submitted list of OSS directory mounts.</p>
         */
        @NameInMap("ossMounts")
        public java.util.List<CreateCustomAgentResponseBodyDataOssMounts> ossMounts;

        /**
         * <p>The list of invocation protocol configurations for the agent.</p>
         */
        @NameInMap("protocol")
        public java.util.List<CreateCustomAgentResponseBodyDataProtocol> protocol;

        /**
         * <p>The region ID of the workspace to which the agent belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role used by the agent to access user cloud resources.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1234567890123456:role/agentcore-runtime-role</p>
         */
        @NameInMap("roleArn")
        public String roleArn;

        /**
         * <p>The runtime configuration of the latest commit, including compute specifications, session policy, and elastic policy.</p>
         */
        @NameInMap("runtime")
        public CreateCustomAgentResponseBodyDataRuntime runtime;

        /**
         * <p>The instance counts by sandbox phase. Keys include PENDING (creating or initializing), RUNNING (running), HIBERNATING (hibernating), HIBERNATED (hibernated), RESUMING (resuming), TERMINATING (terminating), and FAILED (failed). Only phases that actually occur are returned. Missing keys are treated as 0.</p>
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
         * To check the execution progress of the latest configuration, query latestVersionStatus.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>Specifies whether the image cache is enabled.</p>
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

        public static CreateCustomAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomAgentResponseBodyData self = new CreateCustomAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateCustomAgentResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public CreateCustomAgentResponseBodyData setAgenticFsMounts(java.util.List<CreateCustomAgentResponseBodyDataAgenticFsMounts> agenticFsMounts) {
            this.agenticFsMounts = agenticFsMounts;
            return this;
        }
        public java.util.List<CreateCustomAgentResponseBodyDataAgenticFsMounts> getAgenticFsMounts() {
            return this.agenticFsMounts;
        }

        public CreateCustomAgentResponseBodyData setArtifact(CreateCustomAgentResponseBodyDataArtifact artifact) {
            this.artifact = artifact;
            return this;
        }
        public CreateCustomAgentResponseBodyDataArtifact getArtifact() {
            return this.artifact;
        }

        public CreateCustomAgentResponseBodyData setCodePackageInfo(CreateCustomAgentResponseBodyDataCodePackageInfo codePackageInfo) {
            this.codePackageInfo = codePackageInfo;
            return this;
        }
        public CreateCustomAgentResponseBodyDataCodePackageInfo getCodePackageInfo() {
            return this.codePackageInfo;
        }

        public CreateCustomAgentResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public CreateCustomAgentResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateCustomAgentResponseBodyData setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public CreateCustomAgentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateCustomAgentResponseBodyData setEffectiveSpecVersion(Long effectiveSpecVersion) {
            this.effectiveSpecVersion = effectiveSpecVersion;
            return this;
        }
        public Long getEffectiveSpecVersion() {
            return this.effectiveSpecVersion;
        }

        public CreateCustomAgentResponseBodyData setEnvironment(CreateCustomAgentResponseBodyDataEnvironment environment) {
            this.environment = environment;
            return this;
        }
        public CreateCustomAgentResponseBodyDataEnvironment getEnvironment() {
            return this.environment;
        }

        public CreateCustomAgentResponseBodyData setHealthCheck(CreateCustomAgentResponseBodyDataHealthCheck healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public CreateCustomAgentResponseBodyDataHealthCheck getHealthCheck() {
            return this.healthCheck;
        }

        public CreateCustomAgentResponseBodyData setImageCacheId(String imageCacheId) {
            this.imageCacheId = imageCacheId;
            return this;
        }
        public String getImageCacheId() {
            return this.imageCacheId;
        }

        public CreateCustomAgentResponseBodyData setImageCachePreparation(CreateCustomAgentResponseBodyDataImageCachePreparation imageCachePreparation) {
            this.imageCachePreparation = imageCachePreparation;
            return this;
        }
        public CreateCustomAgentResponseBodyDataImageCachePreparation getImageCachePreparation() {
            return this.imageCachePreparation;
        }

        public CreateCustomAgentResponseBodyData setLatestExecutionError(CreateCustomAgentResponseBodyDataLatestExecutionError latestExecutionError) {
            this.latestExecutionError = latestExecutionError;
            return this;
        }
        public CreateCustomAgentResponseBodyDataLatestExecutionError getLatestExecutionError() {
            return this.latestExecutionError;
        }

        public CreateCustomAgentResponseBodyData setLatestSpecVersion(Long latestSpecVersion) {
            this.latestSpecVersion = latestSpecVersion;
            return this;
        }
        public Long getLatestSpecVersion() {
            return this.latestSpecVersion;
        }

        public CreateCustomAgentResponseBodyData setLatestVersionStatus(String latestVersionStatus) {
            this.latestVersionStatus = latestVersionStatus;
            return this;
        }
        public String getLatestVersionStatus() {
            return this.latestVersionStatus;
        }

        public CreateCustomAgentResponseBodyData setLogging(CreateCustomAgentResponseBodyDataLogging logging) {
            this.logging = logging;
            return this;
        }
        public CreateCustomAgentResponseBodyDataLogging getLogging() {
            return this.logging;
        }

        public CreateCustomAgentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateCustomAgentResponseBodyData setNetwork(CreateCustomAgentResponseBodyDataNetwork network) {
            this.network = network;
            return this;
        }
        public CreateCustomAgentResponseBodyDataNetwork getNetwork() {
            return this.network;
        }

        public CreateCustomAgentResponseBodyData setObservability(CreateCustomAgentResponseBodyDataObservability observability) {
            this.observability = observability;
            return this;
        }
        public CreateCustomAgentResponseBodyDataObservability getObservability() {
            return this.observability;
        }

        public CreateCustomAgentResponseBodyData setOssMounts(java.util.List<CreateCustomAgentResponseBodyDataOssMounts> ossMounts) {
            this.ossMounts = ossMounts;
            return this;
        }
        public java.util.List<CreateCustomAgentResponseBodyDataOssMounts> getOssMounts() {
            return this.ossMounts;
        }

        public CreateCustomAgentResponseBodyData setProtocol(java.util.List<CreateCustomAgentResponseBodyDataProtocol> protocol) {
            this.protocol = protocol;
            return this;
        }
        public java.util.List<CreateCustomAgentResponseBodyDataProtocol> getProtocol() {
            return this.protocol;
        }

        public CreateCustomAgentResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateCustomAgentResponseBodyData setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public CreateCustomAgentResponseBodyData setRuntime(CreateCustomAgentResponseBodyDataRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public CreateCustomAgentResponseBodyDataRuntime getRuntime() {
            return this.runtime;
        }

        public CreateCustomAgentResponseBodyData setSandboxPhaseCounts(java.util.Map<String, Long> sandboxPhaseCounts) {
            this.sandboxPhaseCounts = sandboxPhaseCounts;
            return this;
        }
        public java.util.Map<String, Long> getSandboxPhaseCounts() {
            return this.sandboxPhaseCounts;
        }

        public CreateCustomAgentResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateCustomAgentResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateCustomAgentResponseBodyData setUseImageCache(Boolean useImageCache) {
            this.useImageCache = useImageCache;
            return this;
        }
        public Boolean getUseImageCache() {
            return this.useImageCache;
        }

        public CreateCustomAgentResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
