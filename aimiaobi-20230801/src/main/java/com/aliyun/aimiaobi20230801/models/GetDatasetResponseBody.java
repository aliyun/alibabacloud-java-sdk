// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetDatasetResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public GetDatasetResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. A value of \<code>true\\</code> indicates success. A value of \<code>false\\</code> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetResponseBody self = new GetDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatasetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDatasetResponseBody setData(GetDatasetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDatasetResponseBodyData getData() {
        return this.data;
    }

    public GetDatasetResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDatasetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatasetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDatasetResponseBodyDataDatasetConfigSearchSourceConfig extends TeaModel {
        /**
         * <p>Specifies whether to include the key-value pairs of metadata in the generation. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MetadataKeyValueGenerateEnable")
        public String metadataKeyValueGenerateEnable;

        /**
         * <p>Specifies whether to include the key-value pairs of metadata in the search. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MetadataKeyValueSearchEnable")
        public String metadataKeyValueSearchEnable;

        /**
         * <p>Specifies whether to include tags in the generation. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TagGenerateEnable")
        public String tagGenerateEnable;

        /**
         * <p>Specifies whether to include tags in the search. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TagSearchEnable")
        public String tagSearchEnable;

        public static GetDatasetResponseBodyDataDatasetConfigSearchSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDataDatasetConfigSearchSourceConfig self = new GetDatasetResponseBodyDataDatasetConfigSearchSourceConfig();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfig setMetadataKeyValueGenerateEnable(String metadataKeyValueGenerateEnable) {
            this.metadataKeyValueGenerateEnable = metadataKeyValueGenerateEnable;
            return this;
        }
        public String getMetadataKeyValueGenerateEnable() {
            return this.metadataKeyValueGenerateEnable;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfig setMetadataKeyValueSearchEnable(String metadataKeyValueSearchEnable) {
            this.metadataKeyValueSearchEnable = metadataKeyValueSearchEnable;
            return this;
        }
        public String getMetadataKeyValueSearchEnable() {
            return this.metadataKeyValueSearchEnable;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfig setTagGenerateEnable(String tagGenerateEnable) {
            this.tagGenerateEnable = tagGenerateEnable;
            return this;
        }
        public String getTagGenerateEnable() {
            return this.tagGenerateEnable;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfig setTagSearchEnable(String tagSearchEnable) {
            this.tagSearchEnable = tagSearchEnable;
            return this;
        }
        public String getTagSearchEnable() {
            return this.tagSearchEnable;
        }

    }

    public static class GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders extends TeaModel {
        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>参数名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>参数值</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>This parameter is valid only when \<code>ValueType\\</code> is set to \<code>time\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>valueType = time 时有效</p>
         */
        @NameInMap("ValueFormat")
        public String valueFormat;

        /**
         * <p>The data type of the parameter value. Default value: string.</p>
         * 
         * <strong>example:</strong>
         * <p>参数值数据类型：默认string</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders self = new GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders setValueFormat(String valueFormat) {
            this.valueFormat = valueFormat;
            return this;
        }
        public String getValueFormat() {
            return this.valueFormat;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams extends TeaModel {
        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>参数名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>参数值</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>This parameter is valid only when \<code>ValueType\\</code> is set to \<code>time\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>valueType = time 时有效</p>
         */
        @NameInMap("ValueFormat")
        public String valueFormat;

        /**
         * <p>The data type of the parameter value. Default value: string.</p>
         * 
         * <strong>example:</strong>
         * <p>参数值数据类型：默认string</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams self = new GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams setValueFormat(String valueFormat) {
            this.valueFormat = valueFormat;
            return this;
        }
        public String getValueFormat() {
            return this.valueFormat;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfig extends TeaModel {
        /**
         * <p>The request body.</p>
         * 
         * <strong>example:</strong>
         * <p>请求body</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <p>The connection timeout period.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ConnectTimeout")
        public Integer connectTimeout;

        /**
         * <p>The HTTP request headers.</p>
         */
        @NameInMap("Headers")
        public java.util.List<GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders> headers;

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
        public java.util.List<GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams> params;

        /**
         * <p>Specifies whether to enable path parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PathParamsEnable")
        public Boolean pathParamsEnable;

        /**
         * <p>The read timeout period.</p>
         * 
         * <strong>example:</strong>
         * <p>78</p>
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

        public static GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfig self = new GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfig();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setConnectTimeout(Integer connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }
        public Integer getConnectTimeout() {
            return this.connectTimeout;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setHeaders(java.util.List<GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.List<GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfigHeaders> getHeaders() {
            return this.headers;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setParams(java.util.List<GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams> params) {
            this.params = params;
            return this;
        }
        public java.util.List<GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfigParams> getParams() {
            return this.params;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setPathParamsEnable(Boolean pathParamsEnable) {
            this.pathParamsEnable = pathParamsEnable;
            return this;
        }
        public Boolean getPathParamsEnable() {
            return this.pathParamsEnable;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setSocketTimeout(Integer socketTimeout) {
            this.socketTimeout = socketTimeout;
            return this;
        }
        public Integer getSocketTimeout() {
            return this.socketTimeout;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfig setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes extends TeaModel {
        /**
         * <p>The key of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>title</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The path of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>.title</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The data type of the node. Valid values: string, number, list, object, and base.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes self = new GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes extends TeaModel {
        /**
         * <p>The child node configurations.</p>
         */
        @NameInMap("JqNodes")
        public java.util.List<GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes> jqNodes;

        /**
         * <p>The key of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>title</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The path of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>.title</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The data type of the node. Valid values: string, number, list, object, and base.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes self = new GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes setJqNodes(java.util.List<GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes> jqNodes) {
            this.jqNodes = jqNodes;
            return this;
        }
        public java.util.List<GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodesJqNodes> getJqNodes() {
            return this.jqNodes;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes extends TeaModel {
        /**
         * <p>The child node configurations.</p>
         */
        @NameInMap("JqNodes")
        public java.util.List<GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes> jqNodes;

        /**
         * <p>The key of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>节点key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The path of the node.</p>
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

        public static GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes self = new GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes setJqNodes(java.util.List<GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes> jqNodes) {
            this.jqNodes = jqNodes;
            return this;
        }
        public java.util.List<GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodesJqNodes> getJqNodes() {
            return this.jqNodes;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfig extends TeaModel {
        /**
         * <p>The node configurations.</p>
         */
        @NameInMap("JqNodes")
        public java.util.List<GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes> jqNodes;

        public static GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfig self = new GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfig();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfig setJqNodes(java.util.List<GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes> jqNodes) {
            this.jqNodes = jqNodes;
            return this;
        }
        public java.util.List<GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfigJqNodes> getJqNodes() {
            return this.jqNodes;
        }

    }

    public static class GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigs extends TeaModel {
        /**
         * <p>A sample query keyword. This keyword is used to test whether the search source is available.</p>
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
        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfig searchSourceRequestConfig;

        /**
         * <p>The API response configuration.</p>
         */
        @NameInMap("SearchSourceResponseConfig")
        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfig searchSourceResponseConfig;

        /**
         * <p>The default number of data entries for requests and responses.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigs self = new GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigs();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigs setDemoQuery(String demoQuery) {
            this.demoQuery = demoQuery;
            return this;
        }
        public String getDemoQuery() {
            return this.demoQuery;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigs setSearchSourceRequestConfig(GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfig searchSourceRequestConfig) {
            this.searchSourceRequestConfig = searchSourceRequestConfig;
            return this;
        }
        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceRequestConfig getSearchSourceRequestConfig() {
            return this.searchSourceRequestConfig;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigs setSearchSourceResponseConfig(GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfig searchSourceResponseConfig) {
            this.searchSourceResponseConfig = searchSourceResponseConfig;
            return this;
        }
        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigsSearchSourceResponseConfig getSearchSourceResponseConfig() {
            return this.searchSourceResponseConfig;
        }

        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigs setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class GetDatasetResponseBodyDataDatasetConfig extends TeaModel {
        /**
         * <p>The configuration items for the dataset.</p>
         */
        @NameInMap("SearchSourceConfig")
        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfig searchSourceConfig;

        /**
         * <p>Third-party search: API definition.</p>
         */
        @NameInMap("SearchSourceConfigs")
        public java.util.List<GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigs> searchSourceConfigs;

        public static GetDatasetResponseBodyDataDatasetConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDataDatasetConfig self = new GetDatasetResponseBodyDataDatasetConfig();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDataDatasetConfig setSearchSourceConfig(GetDatasetResponseBodyDataDatasetConfigSearchSourceConfig searchSourceConfig) {
            this.searchSourceConfig = searchSourceConfig;
            return this;
        }
        public GetDatasetResponseBodyDataDatasetConfigSearchSourceConfig getSearchSourceConfig() {
            return this.searchSourceConfig;
        }

        public GetDatasetResponseBodyDataDatasetConfig setSearchSourceConfigs(java.util.List<GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigs> searchSourceConfigs) {
            this.searchSourceConfigs = searchSourceConfigs;
            return this;
        }
        public java.util.List<GetDatasetResponseBodyDataDatasetConfigSearchSourceConfigs> getSearchSourceConfigs() {
            return this.searchSourceConfigs;
        }

    }

    public static class GetDatasetResponseBodyDataDocumentHandleConfig extends TeaModel {
        /**
         * <p>Specifies whether to disable the processing logic for multimedia files. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DisableHandleMultimodalMedia")
        public Boolean disableHandleMultimodalMedia;

        public static GetDatasetResponseBodyDataDocumentHandleConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDataDocumentHandleConfig self = new GetDatasetResponseBodyDataDocumentHandleConfig();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDataDocumentHandleConfig setDisableHandleMultimodalMedia(Boolean disableHandleMultimodalMedia) {
            this.disableHandleMultimodalMedia = disableHandleMultimodalMedia;
            return this;
        }
        public Boolean getDisableHandleMultimodalMedia() {
            return this.disableHandleMultimodalMedia;
        }

    }

    public static class GetDatasetResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("AccessLevel")
        public String accessLevel;

        /**
         * <p>The time when the dataset was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-12 21:46:24</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The user who created the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The search configuration of the dataset.</p>
         */
        @NameInMap("DatasetConfig")
        public GetDatasetResponseBodyDataDatasetConfig datasetConfig;

        /**
         * <p>The display name of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("DatasetDescription")
        public String datasetDescription;

        /**
         * <p>The ID of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DatasetId")
        public Long datasetId;

        /**
         * <p>The name of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        /**
         * <p>The type of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>CustomSemanticSearch</p>
         */
        @NameInMap("DatasetType")
        public String datasetType;

        /**
         * <p>The document processing configuration.</p>
         */
        @NameInMap("DocumentHandleConfig")
        public GetDatasetResponseBodyDataDocumentHandleConfig documentHandleConfig;

        /**
         * <p>The switch that enables or disables search for the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SearchDatasetEnable")
        public Integer searchDatasetEnable;

        public static GetDatasetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyData self = new GetDatasetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyData setAccessLevel(String accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public String getAccessLevel() {
            return this.accessLevel;
        }

        public GetDatasetResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDatasetResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetDatasetResponseBodyData setDatasetConfig(GetDatasetResponseBodyDataDatasetConfig datasetConfig) {
            this.datasetConfig = datasetConfig;
            return this;
        }
        public GetDatasetResponseBodyDataDatasetConfig getDatasetConfig() {
            return this.datasetConfig;
        }

        public GetDatasetResponseBodyData setDatasetDescription(String datasetDescription) {
            this.datasetDescription = datasetDescription;
            return this;
        }
        public String getDatasetDescription() {
            return this.datasetDescription;
        }

        public GetDatasetResponseBodyData setDatasetId(Long datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Long getDatasetId() {
            return this.datasetId;
        }

        public GetDatasetResponseBodyData setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public GetDatasetResponseBodyData setDatasetType(String datasetType) {
            this.datasetType = datasetType;
            return this;
        }
        public String getDatasetType() {
            return this.datasetType;
        }

        public GetDatasetResponseBodyData setDocumentHandleConfig(GetDatasetResponseBodyDataDocumentHandleConfig documentHandleConfig) {
            this.documentHandleConfig = documentHandleConfig;
            return this;
        }
        public GetDatasetResponseBodyDataDocumentHandleConfig getDocumentHandleConfig() {
            return this.documentHandleConfig;
        }

        public GetDatasetResponseBodyData setSearchDatasetEnable(Integer searchDatasetEnable) {
            this.searchDatasetEnable = searchDatasetEnable;
            return this;
        }
        public Integer getSearchDatasetEnable() {
            return this.searchDatasetEnable;
        }

    }

}
