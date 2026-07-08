// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UpdateDatasetRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("AccessLevel")
    public String accessLevel;

    /**
     * <p>The configurations for a third-party search dataset.</p>
     */
    @NameInMap("DatasetConfig")
    public UpdateDatasetRequestDatasetConfig datasetConfig;

    /**
     * <p>The description of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>企业自定义数据集</p>
     */
    @NameInMap("DatasetDescription")
    public String datasetDescription;

    /**
     * <p>The dataset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DatasetId")
    public Long datasetId;

    /**
     * <p>Specifies whether to enable search for the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SearchDatasetEnable")
    public Integer searchDatasetEnable;

    /**
     * <p>The unique identifier of the Alibaba Cloud Model Studio workspace. For more information, see <a href="">Get a workspaceId</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetRequest self = new UpdateDatasetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetRequest setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }
    public String getAccessLevel() {
        return this.accessLevel;
    }

    public UpdateDatasetRequest setDatasetConfig(UpdateDatasetRequestDatasetConfig datasetConfig) {
        this.datasetConfig = datasetConfig;
        return this;
    }
    public UpdateDatasetRequestDatasetConfig getDatasetConfig() {
        return this.datasetConfig;
    }

    public UpdateDatasetRequest setDatasetDescription(String datasetDescription) {
        this.datasetDescription = datasetDescription;
        return this;
    }
    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    public UpdateDatasetRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public UpdateDatasetRequest setSearchDatasetEnable(Integer searchDatasetEnable) {
        this.searchDatasetEnable = searchDatasetEnable;
        return this;
    }
    public Integer getSearchDatasetEnable() {
        return this.searchDatasetEnable;
    }

    public UpdateDatasetRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class UpdateDatasetRequestDatasetConfigSearchSourceConfig extends TeaModel {
        /**
         * <p>Specifies whether the key-value pairs in metadata are used for generation. Default: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MetadataKeyValueGenerateEnable")
        public Boolean metadataKeyValueGenerateEnable;

        /**
         * <p>Specifies whether the key-value pairs in metadata are included in searches. Default: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MetadataKeyValueSearchEnable")
        public Boolean metadataKeyValueSearchEnable;

        /**
         * <p>Specifies whether tags are used for generation. Default: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TagGenerateEnable")
        public Boolean tagGenerateEnable;

        /**
         * <p>Specifies whether tags are included in searches. Default: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TagSearchEnable")
        public Boolean tagSearchEnable;

        public static UpdateDatasetRequestDatasetConfigSearchSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetRequestDatasetConfigSearchSourceConfig self = new UpdateDatasetRequestDatasetConfigSearchSourceConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfig setMetadataKeyValueGenerateEnable(Boolean metadataKeyValueGenerateEnable) {
            this.metadataKeyValueGenerateEnable = metadataKeyValueGenerateEnable;
            return this;
        }
        public Boolean getMetadataKeyValueGenerateEnable() {
            return this.metadataKeyValueGenerateEnable;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfig setMetadataKeyValueSearchEnable(Boolean metadataKeyValueSearchEnable) {
            this.metadataKeyValueSearchEnable = metadataKeyValueSearchEnable;
            return this;
        }
        public Boolean getMetadataKeyValueSearchEnable() {
            return this.metadataKeyValueSearchEnable;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfig setTagGenerateEnable(Boolean tagGenerateEnable) {
            this.tagGenerateEnable = tagGenerateEnable;
            return this;
        }
        public Boolean getTagGenerateEnable() {
            return this.tagGenerateEnable;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfig setTagSearchEnable(Boolean tagSearchEnable) {
            this.tagSearchEnable = tagSearchEnable;
            return this;
        }
        public Boolean getTagSearchEnable() {
            return this.tagSearchEnable;
        }

    }

    public static class UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders extends TeaModel {
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
         * <p>The data type of the parameter value. Default: string.</p>
         * 
         * <strong>example:</strong>
         * <p>参数值数据类型：默认string</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders self = new UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders setValueFormat(String valueFormat) {
            this.valueFormat = valueFormat;
            return this;
        }
        public String getValueFormat() {
            return this.valueFormat;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams extends TeaModel {
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
         * <p>The data type of the parameter value. Default: string.</p>
         * 
         * <strong>example:</strong>
         * <p>参数值数据类型：默认string</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams self = new UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams setValueFormat(String valueFormat) {
            this.valueFormat = valueFormat;
            return this;
        }
        public String getValueFormat() {
            return this.valueFormat;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig extends TeaModel {
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
        public java.util.List<UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders> headers;

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
        public java.util.List<UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams> params;

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

        public static UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig self = new UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setConnectTimeout(Integer connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }
        public Integer getConnectTimeout() {
            return this.connectTimeout;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setHeaders(java.util.List<UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.List<UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders> getHeaders() {
            return this.headers;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setParams(java.util.List<UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams> params) {
            this.params = params;
            return this;
        }
        public java.util.List<UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams> getParams() {
            return this.params;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setPathParamsEnable(Boolean pathParamsEnable) {
            this.pathParamsEnable = pathParamsEnable;
            return this;
        }
        public Boolean getPathParamsEnable() {
            return this.pathParamsEnable;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setSocketTimeout(Integer socketTimeout) {
            this.socketTimeout = socketTimeout;
            return this;
        }
        public Integer getSocketTimeout() {
            return this.socketTimeout;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes extends TeaModel {
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
         * <p>.title</p>
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

        public static UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes self = new UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes extends TeaModel {
        /**
         * <p>The child node configuration.</p>
         */
        @NameInMap("JqNodes")
        public java.util.List<UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes> jqNodes;

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
         * <p>.title</p>
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

        public static UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes self = new UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes setJqNodes(java.util.List<UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes> jqNodes) {
            this.jqNodes = jqNodes;
            return this;
        }
        public java.util.List<UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes> getJqNodes() {
            return this.jqNodes;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes extends TeaModel {
        /**
         * <p>The child node configuration.</p>
         */
        @NameInMap("JqNodes")
        public java.util.List<UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes> jqNodes;

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

        public static UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes self = new UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes setJqNodes(java.util.List<UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes> jqNodes) {
            this.jqNodes = jqNodes;
            return this;
        }
        public java.util.List<UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes> getJqNodes() {
            return this.jqNodes;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfig extends TeaModel {
        /**
         * <p>The node configuration.</p>
         */
        @NameInMap("JqNodes")
        public java.util.List<UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes> jqNodes;

        public static UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfig self = new UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfig setJqNodes(java.util.List<UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes> jqNodes) {
            this.jqNodes = jqNodes;
            return this;
        }
        public java.util.List<UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes> getJqNodes() {
            return this.jqNodes;
        }

    }

    public static class UpdateDatasetRequestDatasetConfigSearchSourceConfigs extends TeaModel {
        /**
         * <p>A searchable keyword used to verify availability.</p>
         * 
         * <strong>example:</strong>
         * <p>可以搜索到的关键词，用来验证是否可用</p>
         */
        @NameInMap("DemoQuery")
        public String demoQuery;

        /**
         * <p>The API request configuration.</p>
         */
        @NameInMap("SearchSourceRequestConfig")
        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig searchSourceRequestConfig;

        /**
         * <p>The API response configuration.</p>
         */
        @NameInMap("SearchSourceResponseConfig")
        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfig searchSourceResponseConfig;

        /**
         * <p>The default number of data entries for requests and responses.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static UpdateDatasetRequestDatasetConfigSearchSourceConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetRequestDatasetConfigSearchSourceConfigs self = new UpdateDatasetRequestDatasetConfigSearchSourceConfigs();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigs setDemoQuery(String demoQuery) {
            this.demoQuery = demoQuery;
            return this;
        }
        public String getDemoQuery() {
            return this.demoQuery;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigs setSearchSourceRequestConfig(UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig searchSourceRequestConfig) {
            this.searchSourceRequestConfig = searchSourceRequestConfig;
            return this;
        }
        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig getSearchSourceRequestConfig() {
            return this.searchSourceRequestConfig;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigs setSearchSourceResponseConfig(UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfig searchSourceResponseConfig) {
            this.searchSourceResponseConfig = searchSourceResponseConfig;
            return this;
        }
        public UpdateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfig getSearchSourceResponseConfig() {
            return this.searchSourceResponseConfig;
        }

        public UpdateDatasetRequestDatasetConfigSearchSourceConfigs setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class UpdateDatasetRequestDatasetConfig extends TeaModel {
        /**
         * <p>The dataset configuration items.</p>
         */
        @NameInMap("SearchSourceConfig")
        public UpdateDatasetRequestDatasetConfigSearchSourceConfig searchSourceConfig;

        /**
         * <p>Third-party search: API definition.</p>
         */
        @NameInMap("SearchSourceConfigs")
        public java.util.List<UpdateDatasetRequestDatasetConfigSearchSourceConfigs> searchSourceConfigs;

        public static UpdateDatasetRequestDatasetConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetRequestDatasetConfig self = new UpdateDatasetRequestDatasetConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetRequestDatasetConfig setSearchSourceConfig(UpdateDatasetRequestDatasetConfigSearchSourceConfig searchSourceConfig) {
            this.searchSourceConfig = searchSourceConfig;
            return this;
        }
        public UpdateDatasetRequestDatasetConfigSearchSourceConfig getSearchSourceConfig() {
            return this.searchSourceConfig;
        }

        public UpdateDatasetRequestDatasetConfig setSearchSourceConfigs(java.util.List<UpdateDatasetRequestDatasetConfigSearchSourceConfigs> searchSourceConfigs) {
            this.searchSourceConfigs = searchSourceConfigs;
            return this;
        }
        public java.util.List<UpdateDatasetRequestDatasetConfigSearchSourceConfigs> getSearchSourceConfigs() {
            return this.searchSourceConfigs;
        }

    }

}
