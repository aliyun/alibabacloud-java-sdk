// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListCustomAgentsResponseBody extends TeaModel {
    /**
     * <p>The request result code. The value is SUCCESS when the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code of the current request. The value is 200 when the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of custom agent summaries on the current page. To query the complete configuration and the execution result of the latest version, call the GetCustomAgent operation.</p>
     */
    @NameInMap("items")
    public java.util.List<ListCustomAgentsResponseBodyItems> items;

    /**
     * <p>The maximum number of results returned per page for the current query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The message that describes the processing result of the request. The value is success if the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The opaque token used to query the next page. An empty value indicates that no more pages exist. Pass this token as is in subsequent requests.</p>
     * 
     * <strong>example:</strong>
     * <p>djE6YWdlbnRjb3JlLmFnZW50Lmxpc3QuY3VzdG9tOjIw</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The unique identifier of the request, used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>550E8400-E29B-41D4-A716-446655440000</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was processed successfully. A value of true indicates success. A successful creation, update, or deletion does not mean that the background operation is complete.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of custom agents that meet the query conditions in the specified workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListCustomAgentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomAgentsResponseBody self = new ListCustomAgentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomAgentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCustomAgentsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCustomAgentsResponseBody setItems(java.util.List<ListCustomAgentsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListCustomAgentsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListCustomAgentsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCustomAgentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCustomAgentsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCustomAgentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomAgentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListCustomAgentsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCustomAgentsResponseBodyItemsArtifactCode extends TeaModel {
        /**
         * <p>The startup command for the code package. This parameter is required in code package mode. The working directory is the root directory of the extracted code, which is /code. Example: python main.py. Quotes and escape characters are supported. Environment variables, pipes, and logical operations are not automatically expanded. For complex commands, use a script within the package.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>python main.py</p>
         */
        @NameInMap("entrypoint")
        public String entrypoint;

        /**
         * <p>The identifier of the code runtime environment in the currently saved configuration. The runtime image uses a saved snapshot. Adding a new version to the directory does not automatically change the existing configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>python3.12</p>
         */
        @NameInMap("languageRuntime")
        public String languageRuntime;

        /**
         * <p>The fixed oss:// address of the platform code package referenced by the currently saved configuration. This address does not include the signature parameters of the source HTTPS link. You can use this address to reuse an existing code package. To download the content, call the GetAgentCodePackageDownloadUrl operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://agentcore-platform-example/code-packages/workspaces/ws-a1b2c3d4e5f6/550e8400-e29b-41d4-a716-446655440000/package.zip</p>
         */
        @NameInMap("sourceUri")
        public String sourceUri;

        public static ListCustomAgentsResponseBodyItemsArtifactCode build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentsResponseBodyItemsArtifactCode self = new ListCustomAgentsResponseBodyItemsArtifactCode();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentsResponseBodyItemsArtifactCode setEntrypoint(String entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public String getEntrypoint() {
            return this.entrypoint;
        }

        public ListCustomAgentsResponseBodyItemsArtifactCode setLanguageRuntime(String languageRuntime) {
            this.languageRuntime = languageRuntime;
            return this;
        }
        public String getLanguageRuntime() {
            return this.languageRuntime;
        }

        public ListCustomAgentsResponseBodyItemsArtifactCode setSourceUri(String sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }
        public String getSourceUri() {
            return this.sourceUri;
        }

    }

    public static class ListCustomAgentsResponseBodyItemsArtifactContainer extends TeaModel {
        /**
         * <p>The custom container startup command and parameters. If this parameter is not configured, the default startup method of the image is used.</p>
         * 
         * <strong>example:</strong>
         * <p>python main.py</p>
         */
        @NameInMap("entrypoint")
        public String entrypoint;

        /**
         * <p>The ID of the Container Registry Enterprise instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-example</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The namespace of the Container Registry instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>team</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The name of the Container Registry image repository.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("repo")
        public String repo;

        /**
         * <p>The tag of the image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("tag")
        public String tag;

        /**
         * <p>The source type of the container image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acr</p>
         */
        @NameInMap("type")
        public String type;

        public static ListCustomAgentsResponseBodyItemsArtifactContainer build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentsResponseBodyItemsArtifactContainer self = new ListCustomAgentsResponseBodyItemsArtifactContainer();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentsResponseBodyItemsArtifactContainer setEntrypoint(String entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public String getEntrypoint() {
            return this.entrypoint;
        }

        public ListCustomAgentsResponseBodyItemsArtifactContainer setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCustomAgentsResponseBodyItemsArtifactContainer setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListCustomAgentsResponseBodyItemsArtifactContainer setRepo(String repo) {
            this.repo = repo;
            return this;
        }
        public String getRepo() {
            return this.repo;
        }

        public ListCustomAgentsResponseBodyItemsArtifactContainer setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListCustomAgentsResponseBodyItemsArtifactContainer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListCustomAgentsResponseBodyItemsArtifact extends TeaModel {
        /**
         * <p>The code package deployment configuration. This parameter is mutually exclusive with container. The code package uses the ZIP or TAR.GZ format. Dependencies are packaged by the user. The platform does not install dependencies or perform online builds.</p>
         */
        @NameInMap("code")
        public ListCustomAgentsResponseBodyItemsArtifactCode code;

        /**
         * <p>The container image deployment configuration.</p>
         */
        @NameInMap("container")
        public ListCustomAgentsResponseBodyItemsArtifactContainer container;

        /**
         * <p>The listening port of the agent service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        public static ListCustomAgentsResponseBodyItemsArtifact build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentsResponseBodyItemsArtifact self = new ListCustomAgentsResponseBodyItemsArtifact();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentsResponseBodyItemsArtifact setCode(ListCustomAgentsResponseBodyItemsArtifactCode code) {
            this.code = code;
            return this;
        }
        public ListCustomAgentsResponseBodyItemsArtifactCode getCode() {
            return this.code;
        }

        public ListCustomAgentsResponseBodyItemsArtifact setContainer(ListCustomAgentsResponseBodyItemsArtifactContainer container) {
            this.container = container;
            return this;
        }
        public ListCustomAgentsResponseBodyItemsArtifactContainer getContainer() {
            return this.container;
        }

        public ListCustomAgentsResponseBodyItemsArtifact setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class ListCustomAgentsResponseBodyItemsCodePackageInfo extends TeaModel {
        /**
         * <p>The CRC64 value of the code package object.</p>
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

        public static ListCustomAgentsResponseBodyItemsCodePackageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentsResponseBodyItemsCodePackageInfo self = new ListCustomAgentsResponseBodyItemsCodePackageInfo();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentsResponseBodyItemsCodePackageInfo setCrc64(String crc64) {
            this.crc64 = crc64;
            return this;
        }
        public String getCrc64() {
            return this.crc64;
        }

        public ListCustomAgentsResponseBodyItemsCodePackageInfo setEtag(String etag) {
            this.etag = etag;
            return this;
        }
        public String getEtag() {
            return this.etag;
        }

        public ListCustomAgentsResponseBodyItemsCodePackageInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListCustomAgentsResponseBodyItemsCodePackageInfo setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public ListCustomAgentsResponseBodyItemsCodePackageInfo setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class ListCustomAgentsResponseBodyItemsProtocolPaths extends TeaModel {
        /**
         * <p>The purpose description of the current API path.</p>
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

        public static ListCustomAgentsResponseBodyItemsProtocolPaths build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentsResponseBodyItemsProtocolPaths self = new ListCustomAgentsResponseBodyItemsProtocolPaths();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentsResponseBodyItemsProtocolPaths setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCustomAgentsResponseBodyItemsProtocolPaths setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListCustomAgentsResponseBodyItemsProtocol extends TeaModel {
        /**
         * <p>The request header configuration for the current protocol. The key is the header name and the value is a string.</p>
         */
        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        /**
         * <p>The list of API paths corresponding to the current protocol.</p>
         */
        @NameInMap("paths")
        public java.util.List<ListCustomAgentsResponseBodyItemsProtocolPaths> paths;

        /**
         * <p>The invoke Protocol Type. Valid values: agui (AG-UI protocol), openai-chat-completion (OpenAI Chat Completions compatible protocol), and custom (custom protocol).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agui</p>
         */
        @NameInMap("type")
        public String type;

        public static ListCustomAgentsResponseBodyItemsProtocol build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentsResponseBodyItemsProtocol self = new ListCustomAgentsResponseBodyItemsProtocol();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentsResponseBodyItemsProtocol setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public ListCustomAgentsResponseBodyItemsProtocol setPaths(java.util.List<ListCustomAgentsResponseBodyItemsProtocolPaths> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<ListCustomAgentsResponseBodyItemsProtocolPaths> getPaths() {
            return this.paths;
        }

        public ListCustomAgentsResponseBodyItemsProtocol setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListCustomAgentsResponseBodyItems extends TeaModel {
        /**
         * <p>The unique identifier of the custom agent. You can obtain this ID from the response of the CreateCustomAgent or ListCustomAgents operation.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-550e8400e29b41d4a716446655440000</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The agent artifact.</p>
         */
        @NameInMap("artifact")
        public ListCustomAgentsResponseBodyItemsArtifact artifact;

        /**
         * <p>The currently saved code package information.</p>
         */
        @NameInMap("codePackageInfo")
        public ListCustomAgentsResponseBodyItemsCodePackageInfo codePackageInfo;

        /**
         * <p>The creation method of the agent. The value is CUSTOM for custom agents.</p>
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
         * <p>The deployment method of the agent. Custom agents are deployed and managed by the platform. The value is MANAGED for custom agents.</p>
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
         * <p>Custom agent that provides conversation services</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The latest configuration version number. Updates with the same configuration may retain the original version number. This field does not indicate that the configuration has taken effect.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("latestSpecVersion")
        public Long latestSpecVersion;

        /**
         * <p>The name of the custom agent.</p>
         * 
         * <strong>example:</strong>
         * <p>my-custom-agent</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The list of invocation protocol configurations for the agent.</p>
         */
        @NameInMap("protocol")
        public java.util.List<ListCustomAgentsResponseBodyItemsProtocol> protocol;

        /**
         * <p>The compute specifications of the agent. Valid values: INTERACTIVE, STANDARD, and HEAVY.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("runtime")
        public String runtime;

        /**
         * <p>The overall status of the agent. Valid values: Creating, Running, Failed, Updating, Deleting, and Deleted. To query the execution progress of the latest configuration, call the GetCustomAgent operation.</p>
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
         * <p>The ID of the workspace to which the custom agent belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-a1b2c3d4e5f6</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static ListCustomAgentsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentsResponseBodyItems self = new ListCustomAgentsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentsResponseBodyItems setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListCustomAgentsResponseBodyItems setArtifact(ListCustomAgentsResponseBodyItemsArtifact artifact) {
            this.artifact = artifact;
            return this;
        }
        public ListCustomAgentsResponseBodyItemsArtifact getArtifact() {
            return this.artifact;
        }

        public ListCustomAgentsResponseBodyItems setCodePackageInfo(ListCustomAgentsResponseBodyItemsCodePackageInfo codePackageInfo) {
            this.codePackageInfo = codePackageInfo;
            return this;
        }
        public ListCustomAgentsResponseBodyItemsCodePackageInfo getCodePackageInfo() {
            return this.codePackageInfo;
        }

        public ListCustomAgentsResponseBodyItems setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public ListCustomAgentsResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListCustomAgentsResponseBodyItems setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public ListCustomAgentsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCustomAgentsResponseBodyItems setLatestSpecVersion(Long latestSpecVersion) {
            this.latestSpecVersion = latestSpecVersion;
            return this;
        }
        public Long getLatestSpecVersion() {
            return this.latestSpecVersion;
        }

        public ListCustomAgentsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCustomAgentsResponseBodyItems setProtocol(java.util.List<ListCustomAgentsResponseBodyItemsProtocol> protocol) {
            this.protocol = protocol;
            return this;
        }
        public java.util.List<ListCustomAgentsResponseBodyItemsProtocol> getProtocol() {
            return this.protocol;
        }

        public ListCustomAgentsResponseBodyItems setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public ListCustomAgentsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCustomAgentsResponseBodyItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListCustomAgentsResponseBodyItems setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
