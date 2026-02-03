// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class CreateDatasetRequest extends TeaModel {
    @NameInMap("DatasetConfig")
    public CreateDatasetRequestDatasetConfig datasetConfig;

    /**
     * <strong>example:</strong>
     * <p>企业自定义数据集</p>
     */
    @NameInMap("DatasetDescription")
    public String datasetDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>businessDataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <strong>example:</strong>
     * <p>CustomSemanticSearch</p>
     */
    @NameInMap("DatasetType")
    public String datasetType;

    @NameInMap("DocumentHandleConfig")
    public CreateDatasetRequestDocumentHandleConfig documentHandleConfig;

    /**
     * <strong>example:</strong>
     * <p>portal</p>
     */
    @NameInMap("InvokeType")
    public String invokeType;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SearchDatasetEnable")
    public Integer searchDatasetEnable;

    /**
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
        @NameInMap("MetadataKeyValueGenerateEnable")
        public Boolean metadataKeyValueGenerateEnable;

        @NameInMap("MetadataKeyValueSearchEnable")
        public Boolean metadataKeyValueSearchEnable;

        @NameInMap("TagGenerateEnable")
        public Boolean tagGenerateEnable;

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
         * <strong>example:</strong>
         * <p>参数名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>参数值</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <strong>example:</strong>
         * <p>valueType = time 时有效</p>
         */
        @NameInMap("ValueFormat")
        public String valueFormat;

        /**
         * <strong>example:</strong>
         * <p>参数值数据类型: 默认string</p>
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
         * <strong>example:</strong>
         * <p>参数名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>参数值</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <strong>example:</strong>
         * <p>valueType = time 时有效</p>
         */
        @NameInMap("ValueFormat")
        public String valueFormat;

        /**
         * <strong>example:</strong>
         * <p>参数值数据类型: 默认string</p>
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
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("ConnectTimeout")
        public Integer connectTimeout;

        @NameInMap("Headers")
        public java.util.List<CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders> headers;

        /**
         * <strong>example:</strong>
         * <p>请求方式</p>
         */
        @NameInMap("Method")
        public String method;

        @NameInMap("Params")
        public java.util.List<CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams> params;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PathParamsEnable")
        public Boolean pathParamsEnable;

        /**
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("SocketTimeout")
        public Integer socketTimeout;

        /**
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
         * <strong>example:</strong>
         * <p>title</p>
         */
        @NameInMap("Key")
        public String key;

        @NameInMap("Path")
        public String path;

        /**
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
        @NameInMap("JqNodes")
        public java.util.List<CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes> jqNodes;

        /**
         * <strong>example:</strong>
         * <p>title</p>
         */
        @NameInMap("Key")
        public String key;

        @NameInMap("Path")
        public String path;

        /**
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
        @NameInMap("JqNodes")
        public java.util.List<CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes> jqNodes;

        /**
         * <strong>example:</strong>
         * <p>节点key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>节点路径</p>
         */
        @NameInMap("Path")
        public String path;

        /**
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
         * <strong>example:</strong>
         * <p>可以搜索到的关键词，用来验证是否可用</p>
         */
        @NameInMap("DemoQuery")
        public String demoQuery;

        @NameInMap("SearchSourceRequestConfig")
        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceRequestConfig searchSourceRequestConfig;

        @NameInMap("SearchSourceResponseConfig")
        public CreateDatasetRequestDatasetConfigSearchSourceConfigsSearchSourceResponseConfig searchSourceResponseConfig;

        /**
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
        @NameInMap("SearchSourceConfig")
        public CreateDatasetRequestDatasetConfigSearchSourceConfig searchSourceConfig;

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
