// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class CreateDatasetRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("AccessLevel")
    public String accessLevel;

    /**
     * <p>The dataset search configuration.</p>
     */
    @NameInMap("DatasetConfig")
    public CreateDatasetRequestDatasetConfig datasetConfig;

    /**
     * <p>The description of the dataset. This is the display name in the console. Use a human-readable name.</p>
     * 
     * <strong>example:</strong>
     * <p>企业知识库</p>
     */
    @NameInMap("DatasetDescription")
    public String datasetDescription;

    /**
     * <p>The name of the dataset. The name must be globally unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>businessDataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The type of the dataset. Valid values:</p>
     * <ul>
     * <li><p>CustomSemanticSearch: A custom semantic index. This is the default value. Upload documents to build the dataset.</p>
     * </li>
     * <li><p>ThirdSearch: A third-party search source (API). Configure your own search API.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CustomSemanticSearch</p>
     */
    @NameInMap("DatasetType")
    public String datasetType;

    /**
     * <p>Dataset index configuration.</p>
     */
    @NameInMap("DocumentHandleConfig")
    public CreateDatasetRequestDocumentHandleConfig documentHandleConfig;

    /**
     * <p>The invocation method. Currently, only portal is supported, which indicates an invocation from the console.</p>
     * <ul>
     * <li><p>If left empty: When DatasetType is ThirdSearch, datasetConfig.SearchSourceConfigs (third-party API definition) is required.</p>
     * </li>
     * <li><p>If set to portal: When DatasetType is ThirdSearch, the system initializes a SearchSourceConfigs (third-party API demo) example by default for your reference.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>portal</p>
     */
    @NameInMap("InvokeType")
    public String invokeType;

    /**
     * <p>The dataset search switch. Valid values:</p>
     * <ul>
     * <li><p>0: Disabled for all.</p>
     * </li>
     * <li><p>1: Visible only to Miao Search.</p>
     * </li>
     * <li><p>2: Visible only to Miao Bi.</p>
     * </li>
     * <li><p>3: Visible to both Miao Search and Miao Bi. This is the default value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SearchDatasetEnable")
    public Integer searchDatasetEnable;

    /**
     * <p>The unique ID of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Obtain a workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetRequest self = new CreateDatasetRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetRequest setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }
    public String getAccessLevel() {
        return this.accessLevel;
    }

    public CreateDatasetRequest setDatasetConfig(CreateDatasetRequestDatasetConfig datasetConfig) {
        this.datasetConfig = datasetConfig;
        return this;
    }
    public CreateDatasetRequestDatasetConfig getDatasetConfig() {
        return this.datasetConfig;
    }

    public CreateDatasetRequest setDatasetDescription(String datasetDescription) {
        this.datasetDescription = datasetDescription;
        return this;
    }
    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    public CreateDatasetRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateDatasetRequest setDatasetType(String datasetType) {
        this.datasetType = datasetType;
        return this;
    }
    public String getDatasetType() {
        return this.datasetType;
    }

    public CreateDatasetRequest setDocumentHandleConfig(CreateDatasetRequestDocumentHandleConfig documentHandleConfig) {
        this.documentHandleConfig = documentHandleConfig;
        return this;
    }
    public CreateDatasetRequestDocumentHandleConfig getDocumentHandleConfig() {
        return this.documentHandleConfig;
    }

    public CreateDatasetRequest setInvokeType(String invokeType) {
        this.invokeType = invokeType;
        return this;
    }
    public String getInvokeType() {
        return this.invokeType;
    }

    public CreateDatasetRequest setSearchDatasetEnable(Integer searchDatasetEnable) {
        this.searchDatasetEnable = searchDatasetEnable;
        return this;
    }
    public Integer getSearchDatasetEnable() {
        return this.searchDatasetEnable;
    }

    public CreateDatasetRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateDatasetRequestDatasetConfigSearchSourceConfig extends TeaModel {
        /**
         * <p>Specifies whether the metadata key-value pairs are used in generation. The default value is true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MetadataKeyValueGenerateEnable")
        public Boolean metadataKeyValueGenerateEnable;

        /**
         * <p>Specifies whether the metadata key-value pairs are used in searches. The default value is true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MetadataKeyValueSearchEnable")
        public Boolean metadataKeyValueSearchEnable;

        /**
         * <p>Specifies whether tags are used in generation. The default value is true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TagGenerateEnable")
        public Boolean tagGenerateEnable;

        /**
         * <p>Specifies whether tags are used in searches. The default value is true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TagSearchEnable")
        public Boolean tagSearchEnable;

        public static CreateDatasetRequestDatasetConfigSearchSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestDatasetConfigSearchSourceConfig self = new CreateDatasetRequestDatasetConfigSearchSourceConfig();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfig setMetadataKeyValueGenerateEnable(Boolean metadataKeyValueGenerateEnable) {
            this.metadataKeyValueGenerateEnable = metadataKeyValueGenerateEnable;
            return this;
        }
        public Boolean getMetadataKeyValueGenerateEnable() {
            return this.metadataKeyValueGenerateEnable;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfig setMetadataKeyValueSearchEnable(Boolean metadataKeyValueSearchEnable) {
            this.metadataKeyValueSearchEnable = metadataKeyValueSearchEnable;
            return this;
        }
        public Boolean getMetadataKeyValueSearchEnable() {
            return this.metadataKeyValueSearchEnable;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfig setTagGenerateEnable(Boolean tagGenerateEnable) {
            this.tagGenerateEnable = tagGenerateEnable;
            return this;
        }
        public Boolean getTagGenerateEnable() {
            return this.tagGenerateEnable;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfig setTagSearchEnable(Boolean tagSearchEnable) {
            this.tagSearchEnable = tagSearchEnable;
            return this;
        }
        public Boolean getTagSearchEnable() {
            return this.tagSearchEnable;
        }

    }

    public static class CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders extends TeaModel {
        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>参数名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>参数值</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>This parameter is valid only when ValueType is set to time.</p>
         * 
         * <strong>example:</strong>
         * <p>valueType = time 时有效</p>
         */
        @NameInMap("ValueFormat")
        public String valueFormat;

        /**
         * <p>The data type of the parameter value. The default value is string.</p>
         * 
         * <strong>example:</strong>
         * <p>参数值数据类型：默认string</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders self = new CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders setValueFormat(String valueFormat) {
            this.valueFormat = valueFormat;
            return this;
        }
        public String getValueFormat() {
            return this.valueFormat;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams extends TeaModel {
        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>参数名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>参数值</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>This parameter is valid only when ValueType is set to time.</p>
         * 
         * <strong>example:</strong>
         * <p>valueType = time 时有效</p>
         */
        @NameInMap("ValueFormat")
        public String valueFormat;

        /**
         * <p>The data type of the parameter value. The default value is string.</p>
         * 
         * <strong>example:</strong>
         * <p>参数值数据类型：默认string</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams self = new CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams setValueFormat(String valueFormat) {
            this.valueFormat = valueFormat;
            return this;
        }
        public String getValueFormat() {
            return this.valueFormat;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig extends TeaModel {
        /**
         * <p>The request body.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <p>The connection timeout period, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("ConnectTimeout")
        public Integer connectTimeout;

        /**
         * <p>The HTTP request headers.</p>
         */
        @NameInMap("Headers")
        public java.util.List<CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders> headers;

        /**
         * <p>The request method.</p>
         * 
         * <strong>example:</strong>
         * <p>请求方式</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The request path parameters.</p>
         */
        @NameInMap("Params")
        public java.util.List<CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams> params;

        /**
         * <p>Specifies whether to enable path parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PathParamsEnable")
        public Boolean pathParamsEnable;

        /**
         * <p>The read timeout period, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("SocketTimeout")
        public Integer socketTimeout;

        /**
         * <p>The API URL.</p>
         * 
         * <strong>example:</strong>
         * <p>api地址</p>
         */
        @NameInMap("Url")
        public String url;

        public static CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig self = new CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setConnectTimeout(Integer connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }
        public Integer getConnectTimeout() {
            return this.connectTimeout;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setHeaders(java.util.List<CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.List<CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders> getHeaders() {
            return this.headers;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setParams(java.util.List<CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams> params) {
            this.params = params;
            return this;
        }
        public java.util.List<CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams> getParams() {
            return this.params;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setPathParamsEnable(Boolean pathParamsEnable) {
            this.pathParamsEnable = pathParamsEnable;
            return this;
        }
        public Boolean getPathParamsEnable() {
            return this.pathParamsEnable;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setSocketTimeout(Integer socketTimeout) {
            this.socketTimeout = socketTimeout;
            return this;
        }
        public Integer getSocketTimeout() {
            return this.socketTimeout;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes extends TeaModel {
        /**
         * <p>The node key.</p>
         * 
         * <strong>example:</strong>
         * <p>title</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The node path.</p>
         * 
         * <strong>example:</strong>
         * <p>节点路径</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes self = new CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes extends TeaModel {
        /**
         * <p>Child node configuration.</p>
         */
        @NameInMap("JqNodes")
        public java.util.List<CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes> jqNodes;

        /**
         * <p>The node key.</p>
         * 
         * <strong>example:</strong>
         * <p>title</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The path.</p>
         * 
         * <strong>example:</strong>
         * <p>节点路径</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes self = new CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes setJqNodes(java.util.List<CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes> jqNodes) {
            this.jqNodes = jqNodes;
            return this;
        }
        public java.util.List<CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes> getJqNodes() {
            return this.jqNodes;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes extends TeaModel {
        /**
         * <p>Child node configuration.</p>
         */
        @NameInMap("JqNodes")
        public java.util.List<CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes> jqNodes;

        /**
         * <p>The node key.</p>
         * 
         * <strong>example:</strong>
         * <p>节点key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The node path.</p>
         * 
         * <strong>example:</strong>
         * <p>节点路径</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The data type of the node. Valid values: string, number, list, object, and base.</p>
         * 
         * <strong>example:</strong>
         * <p>节点数据类型：string number list object base</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes self = new CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes setJqNodes(java.util.List<CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes> jqNodes) {
            this.jqNodes = jqNodes;
            return this;
        }
        public java.util.List<CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes> getJqNodes() {
            return this.jqNodes;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfig extends TeaModel {
        /**
         * <p>Node configuration.</p>
         */
        @NameInMap("JqNodes")
        public java.util.List<CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes> jqNodes;

        public static CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfig self = new CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfig();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfig setJqNodes(java.util.List<CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes> jqNodes) {
            this.jqNodes = jqNodes;
            return this;
        }
        public java.util.List<CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes> getJqNodes() {
            return this.jqNodes;
        }

    }

    public static class CreateDatasetRequestDatasetConfigSearchSourceConfigs extends TeaModel {
        /**
         * <p>A searchable keyword used to verify availability.</p>
         * 
         * <strong>example:</strong>
         * <p>可以搜索到的关键词，用来验证是否可用</p>
         */
        @NameInMap("DemoQuery")
        public String demoQuery;

        /**
         * <p>API request configuration.</p>
         */
        @NameInMap("SearchSourceRequestConfig")
        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig searchSourceRequestConfig;

        /**
         * <p>API response configuration.</p>
         */
        @NameInMap("SearchSourceResponseConfig")
        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfig searchSourceResponseConfig;

        /**
         * <p>The default limit on the number of data entries for requests and responses.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static CreateDatasetRequestDatasetConfigSearchSourceConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestDatasetConfigSearchSourceConfigs self = new CreateDatasetRequestDatasetConfigSearchSourceConfigs();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigs setDemoQuery(String demoQuery) {
            this.demoQuery = demoQuery;
            return this;
        }
        public String getDemoQuery() {
            return this.demoQuery;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigs setSearchSourceRequestConfig(CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig searchSourceRequestConfig) {
            this.searchSourceRequestConfig = searchSourceRequestConfig;
            return this;
        }
        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig getSearchSourceRequestConfig() {
            return this.searchSourceRequestConfig;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigs setSearchSourceResponseConfig(CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfig searchSourceResponseConfig) {
            this.searchSourceResponseConfig = searchSourceResponseConfig;
            return this;
        }
        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfig getSearchSourceResponseConfig() {
            return this.searchSourceResponseConfig;
        }

        public CreateDatasetRequestDatasetConfigSearchSourceConfigs setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class CreateDatasetRequestDatasetConfig extends TeaModel {
        /**
         * <p>Dataset configuration items.</p>
         */
        @NameInMap("SearchSourceConfig")
        public CreateDatasetRequestDatasetConfigSearchSourceConfig searchSourceConfig;

        /**
         * <p>Third-party search: API definition.</p>
         */
        @NameInMap("SearchSourceConfigs")
        public java.util.List<CreateDatasetRequestDatasetConfigSearchSourceConfigs> searchSourceConfigs;

        public static CreateDatasetRequestDatasetConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestDatasetConfig self = new CreateDatasetRequestDatasetConfig();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestDatasetConfig setSearchSourceConfig(CreateDatasetRequestDatasetConfigSearchSourceConfig searchSourceConfig) {
            this.searchSourceConfig = searchSourceConfig;
            return this;
        }
        public CreateDatasetRequestDatasetConfigSearchSourceConfig getSearchSourceConfig() {
            return this.searchSourceConfig;
        }

        public CreateDatasetRequestDatasetConfig setSearchSourceConfigs(java.util.List<CreateDatasetRequestDatasetConfigSearchSourceConfigs> searchSourceConfigs) {
            this.searchSourceConfigs = searchSourceConfigs;
            return this;
        }
        public java.util.List<CreateDatasetRequestDatasetConfigSearchSourceConfigs> getSearchSourceConfigs() {
            return this.searchSourceConfigs;
        }

    }

    public static class CreateDatasetRequestDocumentHandleConfig extends TeaModel {
        /**
         * <p>Disables the processing logic for multimedia files.</p>
         * <ul>
         * <li><p>true: Disables multimodal (image and video) indexing. Only text is indexed and searched.</p>
         * </li>
         * <li><p>false: Enables multimodal (text, image, and video) indexing. This setting takes effect only after you activate ApsaraVideo and grant authorization in system administration. If you set this to false but authorization is not granted, image and video indexing is automatically skipped. This is the default value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DisableHandleMultimodalMedia")
        public Boolean disableHandleMultimodalMedia;

        public static CreateDatasetRequestDocumentHandleConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestDocumentHandleConfig self = new CreateDatasetRequestDocumentHandleConfig();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestDocumentHandleConfig setDisableHandleMultimodalMedia(Boolean disableHandleMultimodalMedia) {
            this.disableHandleMultimodalMedia = disableHandleMultimodalMedia;
            return this;
        }
        public Boolean getDisableHandleMultimodalMedia() {
            return this.disableHandleMultimodalMedia;
        }

    }

}
