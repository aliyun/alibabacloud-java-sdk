// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListApiByAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("ListResult")
    public ListApiByAppResponseBodyListResult listResult;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListApiByAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApiByAppResponseBody self = new ListApiByAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApiByAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListApiByAppResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListApiByAppResponseBody setListResult(ListApiByAppResponseBodyListResult listResult) {
        this.listResult = listResult;
        return this;
    }
    public ListApiByAppResponseBodyListResult getListResult() {
        return this.listResult;
    }

    public ListApiByAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApiByAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApiByAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListApiByAppResponseBodyListResultDataPublicParamListTableAndDsList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ds54321</p>
         */
        @NameInMap("DatasourceId")
        public String datasourceId;

        /**
         * <strong>example:</strong>
         * <p>publicDatasource</p>
         */
        @NameInMap("DatasourceName")
        public String datasourceName;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DatasourceType")
        public Long datasourceType;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example.com/public_datasource">https://example.com/public_datasource</a></p>
         */
        @NameInMap("DatasourceUrl")
        public String datasourceUrl;

        /**
         * <strong>example:</strong>
         * <p>public_table</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static ListApiByAppResponseBodyListResultDataPublicParamListTableAndDsList build(java.util.Map<String, ?> map) throws Exception {
            ListApiByAppResponseBodyListResultDataPublicParamListTableAndDsList self = new ListApiByAppResponseBodyListResultDataPublicParamListTableAndDsList();
            return TeaModel.build(map, self);
        }

        public ListApiByAppResponseBodyListResultDataPublicParamListTableAndDsList setDatasourceId(String datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }
        public String getDatasourceId() {
            return this.datasourceId;
        }

        public ListApiByAppResponseBodyListResultDataPublicParamListTableAndDsList setDatasourceName(String datasourceName) {
            this.datasourceName = datasourceName;
            return this;
        }
        public String getDatasourceName() {
            return this.datasourceName;
        }

        public ListApiByAppResponseBodyListResultDataPublicParamListTableAndDsList setDatasourceType(Long datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public Long getDatasourceType() {
            return this.datasourceType;
        }

        public ListApiByAppResponseBodyListResultDataPublicParamListTableAndDsList setDatasourceUrl(String datasourceUrl) {
            this.datasourceUrl = datasourceUrl;
            return this;
        }
        public String getDatasourceUrl() {
            return this.datasourceUrl;
        }

        public ListApiByAppResponseBodyListResultDataPublicParamListTableAndDsList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ListApiByAppResponseBodyListResultDataPublicParamList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>yyyy-MM-dd</p>
         */
        @NameInMap("DateFormat")
        public String dateFormat;

        /**
         * <strong>example:</strong>
         * <p>default_public_value</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>这是一个示例公共参数</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>CODE_003</p>
         */
        @NameInMap("DescriptionCode")
        public String descriptionCode;

        /**
         * <strong>example:</strong>
         * <p>3001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>app_key_value</p>
         */
        @NameInMap("InitialValue")
        public String initialValue;

        /**
         * <strong>example:</strong>
         * <p>publicColumn1</p>
         */
        @NameInMap("MappingColumn")
        public String mappingColumn;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Must")
        public Long must;

        /**
         * <strong>example:</strong>
         * <p>=</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Optional")
        public Long optional;

        /**
         * <strong>example:</strong>
         * <p>original_public_column</p>
         */
        @NameInMap("OriginalColumn")
        public String originalColumn;

        /**
         * <strong>example:</strong>
         * <p>publicParam1</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        /**
         * <strong>example:</strong>
         * <p>String</p>
         */
        @NameInMap("ParamType")
        public String paramType;

        /**
         * <strong>example:</strong>
         * <p>/path/to/public_param</p>
         */
        @NameInMap("ParameterLocation")
        public String parameterLocation;

        /**
         * <strong>example:</strong>
         * <p>publicValue1</p>
         */
        @NameInMap("Sample")
        public String sample;

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("TableAndDsList")
        public java.util.List<ListApiByAppResponseBodyListResultDataPublicParamListTableAndDsList> tableAndDsList;

        public static ListApiByAppResponseBodyListResultDataPublicParamList build(java.util.Map<String, ?> map) throws Exception {
            ListApiByAppResponseBodyListResultDataPublicParamList self = new ListApiByAppResponseBodyListResultDataPublicParamList();
            return TeaModel.build(map, self);
        }

        public ListApiByAppResponseBodyListResultDataPublicParamList setDateFormat(String dateFormat) {
            this.dateFormat = dateFormat;
            return this;
        }
        public String getDateFormat() {
            return this.dateFormat;
        }

        public ListApiByAppResponseBodyListResultDataPublicParamList setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListApiByAppResponseBodyListResultDataPublicParamList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApiByAppResponseBodyListResultDataPublicParamList setDescriptionCode(String descriptionCode) {
            this.descriptionCode = descriptionCode;
            return this;
        }
        public String getDescriptionCode() {
            return this.descriptionCode;
        }

        public ListApiByAppResponseBodyListResultDataPublicParamList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListApiByAppResponseBodyListResultDataPublicParamList setInitialValue(String initialValue) {
            this.initialValue = initialValue;
            return this;
        }
        public String getInitialValue() {
            return this.initialValue;
        }

        public ListApiByAppResponseBodyListResultDataPublicParamList setMappingColumn(String mappingColumn) {
            this.mappingColumn = mappingColumn;
            return this;
        }
        public String getMappingColumn() {
            return this.mappingColumn;
        }

        public ListApiByAppResponseBodyListResultDataPublicParamList setMust(Long must) {
            this.must = must;
            return this;
        }
        public Long getMust() {
            return this.must;
        }

        public ListApiByAppResponseBodyListResultDataPublicParamList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListApiByAppResponseBodyListResultDataPublicParamList setOptional(Long optional) {
            this.optional = optional;
            return this;
        }
        public Long getOptional() {
            return this.optional;
        }

        public ListApiByAppResponseBodyListResultDataPublicParamList setOriginalColumn(String originalColumn) {
            this.originalColumn = originalColumn;
            return this;
        }
        public String getOriginalColumn() {
            return this.originalColumn;
        }

        public ListApiByAppResponseBodyListResultDataPublicParamList setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public ListApiByAppResponseBodyListResultDataPublicParamList setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

        public ListApiByAppResponseBodyListResultDataPublicParamList setParameterLocation(String parameterLocation) {
            this.parameterLocation = parameterLocation;
            return this;
        }
        public String getParameterLocation() {
            return this.parameterLocation;
        }

        public ListApiByAppResponseBodyListResultDataPublicParamList setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public ListApiByAppResponseBodyListResultDataPublicParamList setTableAndDsList(java.util.List<ListApiByAppResponseBodyListResultDataPublicParamListTableAndDsList> tableAndDsList) {
            this.tableAndDsList = tableAndDsList;
            return this;
        }
        public java.util.List<ListApiByAppResponseBodyListResultDataPublicParamListTableAndDsList> getTableAndDsList() {
            return this.tableAndDsList;
        }

    }

    public static class ListApiByAppResponseBodyListResultDataRegisterApi extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>67890</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        /**
         * <strong>example:</strong>
         * <p>OAuth2</p>
         */
        @NameInMap("AuthenticationMode")
        public String authenticationMode;

        /**
         * <strong>example:</strong>
         * <p>ds67890</p>
         */
        @NameInMap("DatasourceId")
        public String datasourceId;

        /**
         * <strong>example:</strong>
         * <p>registerDatasource</p>
         */
        @NameInMap("DatasourceName")
        public String datasourceName;

        /**
         * <strong>example:</strong>
         * <p>{&quot;status&quot;:&quot;error&quot;,&quot;message&quot;:&quot;Invalid request&quot;}</p>
         */
        @NameInMap("FailExample")
        public String failExample;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HttpMethod")
        public Long httpMethod;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ModelType")
        public Long modelType;

        /**
         * <strong>example:</strong>
         * <p>/api/v1/register</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>HTTPS</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>{&quot;status&quot;:&quot;success&quot;,&quot;data&quot;:[]}</p>
         */
        @NameInMap("SuccessExample")
        public String successExample;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example.com/register_api">https://example.com/register_api</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ListApiByAppResponseBodyListResultDataRegisterApi build(java.util.Map<String, ?> map) throws Exception {
            ListApiByAppResponseBodyListResultDataRegisterApi self = new ListApiByAppResponseBodyListResultDataRegisterApi();
            return TeaModel.build(map, self);
        }

        public ListApiByAppResponseBodyListResultDataRegisterApi setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListApiByAppResponseBodyListResultDataRegisterApi setAuthenticationMode(String authenticationMode) {
            this.authenticationMode = authenticationMode;
            return this;
        }
        public String getAuthenticationMode() {
            return this.authenticationMode;
        }

        public ListApiByAppResponseBodyListResultDataRegisterApi setDatasourceId(String datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }
        public String getDatasourceId() {
            return this.datasourceId;
        }

        public ListApiByAppResponseBodyListResultDataRegisterApi setDatasourceName(String datasourceName) {
            this.datasourceName = datasourceName;
            return this;
        }
        public String getDatasourceName() {
            return this.datasourceName;
        }

        public ListApiByAppResponseBodyListResultDataRegisterApi setFailExample(String failExample) {
            this.failExample = failExample;
            return this;
        }
        public String getFailExample() {
            return this.failExample;
        }

        public ListApiByAppResponseBodyListResultDataRegisterApi setHttpMethod(Long httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public Long getHttpMethod() {
            return this.httpMethod;
        }

        public ListApiByAppResponseBodyListResultDataRegisterApi setModelType(Long modelType) {
            this.modelType = modelType;
            return this;
        }
        public Long getModelType() {
            return this.modelType;
        }

        public ListApiByAppResponseBodyListResultDataRegisterApi setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListApiByAppResponseBodyListResultDataRegisterApi setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListApiByAppResponseBodyListResultDataRegisterApi setSuccessExample(String successExample) {
            this.successExample = successExample;
            return this;
        }
        public String getSuccessExample() {
            return this.successExample;
        }

        public ListApiByAppResponseBodyListResultDataRegisterApi setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public ListApiByAppResponseBodyListResultDataRegisterApi setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListApiByAppResponseBodyListResultDataRequestParamListTableAndDsList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ds12345</p>
         */
        @NameInMap("DatasourceId")
        public String datasourceId;

        /**
         * <strong>example:</strong>
         * <p>exampleDatasource</p>
         */
        @NameInMap("DatasourceName")
        public String datasourceName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DatasourceType")
        public Long datasourceType;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example.com/datasource">https://example.com/datasource</a></p>
         */
        @NameInMap("DatasourceUrl")
        public String datasourceUrl;

        /**
         * <strong>example:</strong>
         * <p>example_table</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static ListApiByAppResponseBodyListResultDataRequestParamListTableAndDsList build(java.util.Map<String, ?> map) throws Exception {
            ListApiByAppResponseBodyListResultDataRequestParamListTableAndDsList self = new ListApiByAppResponseBodyListResultDataRequestParamListTableAndDsList();
            return TeaModel.build(map, self);
        }

        public ListApiByAppResponseBodyListResultDataRequestParamListTableAndDsList setDatasourceId(String datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }
        public String getDatasourceId() {
            return this.datasourceId;
        }

        public ListApiByAppResponseBodyListResultDataRequestParamListTableAndDsList setDatasourceName(String datasourceName) {
            this.datasourceName = datasourceName;
            return this;
        }
        public String getDatasourceName() {
            return this.datasourceName;
        }

        public ListApiByAppResponseBodyListResultDataRequestParamListTableAndDsList setDatasourceType(Long datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public Long getDatasourceType() {
            return this.datasourceType;
        }

        public ListApiByAppResponseBodyListResultDataRequestParamListTableAndDsList setDatasourceUrl(String datasourceUrl) {
            this.datasourceUrl = datasourceUrl;
            return this;
        }
        public String getDatasourceUrl() {
            return this.datasourceUrl;
        }

        public ListApiByAppResponseBodyListResultDataRequestParamListTableAndDsList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ListApiByAppResponseBodyListResultDataRequestParamList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>yyyy-MM-dd</p>
         */
        @NameInMap("DateFormat")
        public String dateFormat;

        /**
         * <strong>example:</strong>
         * <p>default_value</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>这是一个示例参数</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>CODE_001</p>
         */
        @NameInMap("DescriptionCode")
        public String descriptionCode;

        /**
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>app_key_value</p>
         */
        @NameInMap("InitialValue")
        public String initialValue;

        /**
         * <strong>example:</strong>
         * <p>column1</p>
         */
        @NameInMap("MappingColumn")
        public String mappingColumn;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Must")
        public Long must;

        /**
         * <strong>example:</strong>
         * <p>=</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Optional")
        public Long optional;

        /**
         * <strong>example:</strong>
         * <p>original_column</p>
         */
        @NameInMap("OriginalColumn")
        public String originalColumn;

        /**
         * <strong>example:</strong>
         * <p>param1</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        /**
         * <strong>example:</strong>
         * <p>String</p>
         */
        @NameInMap("ParamType")
        public String paramType;

        /**
         * <strong>example:</strong>
         * <p>/path/to/param</p>
         */
        @NameInMap("ParameterLocation")
        public String parameterLocation;

        /**
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Sample")
        public String sample;

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("TableAndDsList")
        public java.util.List<ListApiByAppResponseBodyListResultDataRequestParamListTableAndDsList> tableAndDsList;

        public static ListApiByAppResponseBodyListResultDataRequestParamList build(java.util.Map<String, ?> map) throws Exception {
            ListApiByAppResponseBodyListResultDataRequestParamList self = new ListApiByAppResponseBodyListResultDataRequestParamList();
            return TeaModel.build(map, self);
        }

        public ListApiByAppResponseBodyListResultDataRequestParamList setDateFormat(String dateFormat) {
            this.dateFormat = dateFormat;
            return this;
        }
        public String getDateFormat() {
            return this.dateFormat;
        }

        public ListApiByAppResponseBodyListResultDataRequestParamList setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListApiByAppResponseBodyListResultDataRequestParamList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApiByAppResponseBodyListResultDataRequestParamList setDescriptionCode(String descriptionCode) {
            this.descriptionCode = descriptionCode;
            return this;
        }
        public String getDescriptionCode() {
            return this.descriptionCode;
        }

        public ListApiByAppResponseBodyListResultDataRequestParamList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListApiByAppResponseBodyListResultDataRequestParamList setInitialValue(String initialValue) {
            this.initialValue = initialValue;
            return this;
        }
        public String getInitialValue() {
            return this.initialValue;
        }

        public ListApiByAppResponseBodyListResultDataRequestParamList setMappingColumn(String mappingColumn) {
            this.mappingColumn = mappingColumn;
            return this;
        }
        public String getMappingColumn() {
            return this.mappingColumn;
        }

        public ListApiByAppResponseBodyListResultDataRequestParamList setMust(Long must) {
            this.must = must;
            return this;
        }
        public Long getMust() {
            return this.must;
        }

        public ListApiByAppResponseBodyListResultDataRequestParamList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListApiByAppResponseBodyListResultDataRequestParamList setOptional(Long optional) {
            this.optional = optional;
            return this;
        }
        public Long getOptional() {
            return this.optional;
        }

        public ListApiByAppResponseBodyListResultDataRequestParamList setOriginalColumn(String originalColumn) {
            this.originalColumn = originalColumn;
            return this;
        }
        public String getOriginalColumn() {
            return this.originalColumn;
        }

        public ListApiByAppResponseBodyListResultDataRequestParamList setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public ListApiByAppResponseBodyListResultDataRequestParamList setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

        public ListApiByAppResponseBodyListResultDataRequestParamList setParameterLocation(String parameterLocation) {
            this.parameterLocation = parameterLocation;
            return this;
        }
        public String getParameterLocation() {
            return this.parameterLocation;
        }

        public ListApiByAppResponseBodyListResultDataRequestParamList setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public ListApiByAppResponseBodyListResultDataRequestParamList setTableAndDsList(java.util.List<ListApiByAppResponseBodyListResultDataRequestParamListTableAndDsList> tableAndDsList) {
            this.tableAndDsList = tableAndDsList;
            return this;
        }
        public java.util.List<ListApiByAppResponseBodyListResultDataRequestParamListTableAndDsList> getTableAndDsList() {
            return this.tableAndDsList;
        }

    }

    public static class ListApiByAppResponseBodyListResultDataResponseParamListTableAndDsList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ds67890</p>
         */
        @NameInMap("DatasourceId")
        public String datasourceId;

        /**
         * <strong>example:</strong>
         * <p>responseDatasource</p>
         */
        @NameInMap("DatasourceName")
        public String datasourceName;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DatasourceType")
        public Long datasourceType;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example.com/response_datasource">https://example.com/response_datasource</a></p>
         */
        @NameInMap("DatasourceUrl")
        public String datasourceUrl;

        /**
         * <strong>example:</strong>
         * <p>response_table</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static ListApiByAppResponseBodyListResultDataResponseParamListTableAndDsList build(java.util.Map<String, ?> map) throws Exception {
            ListApiByAppResponseBodyListResultDataResponseParamListTableAndDsList self = new ListApiByAppResponseBodyListResultDataResponseParamListTableAndDsList();
            return TeaModel.build(map, self);
        }

        public ListApiByAppResponseBodyListResultDataResponseParamListTableAndDsList setDatasourceId(String datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }
        public String getDatasourceId() {
            return this.datasourceId;
        }

        public ListApiByAppResponseBodyListResultDataResponseParamListTableAndDsList setDatasourceName(String datasourceName) {
            this.datasourceName = datasourceName;
            return this;
        }
        public String getDatasourceName() {
            return this.datasourceName;
        }

        public ListApiByAppResponseBodyListResultDataResponseParamListTableAndDsList setDatasourceType(Long datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public Long getDatasourceType() {
            return this.datasourceType;
        }

        public ListApiByAppResponseBodyListResultDataResponseParamListTableAndDsList setDatasourceUrl(String datasourceUrl) {
            this.datasourceUrl = datasourceUrl;
            return this;
        }
        public String getDatasourceUrl() {
            return this.datasourceUrl;
        }

        public ListApiByAppResponseBodyListResultDataResponseParamListTableAndDsList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ListApiByAppResponseBodyListResultDataResponseParamList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>yyyy-MM-dd</p>
         */
        @NameInMap("DateFormat")
        public String dateFormat;

        /**
         * <strong>example:</strong>
         * <p>default_response_value</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>这是一个示例响应参数</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>CODE_002</p>
         */
        @NameInMap("DescriptionCode")
        public String descriptionCode;

        /**
         * <strong>example:</strong>
         * <p>2001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>app_key_value</p>
         */
        @NameInMap("InitialValue")
        public String initialValue;

        /**
         * <strong>example:</strong>
         * <p>responseColumn1</p>
         */
        @NameInMap("MappingColumn")
        public String mappingColumn;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Must")
        public Long must;

        /**
         * <strong>example:</strong>
         * <p>=</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Optional")
        public Long optional;

        /**
         * <strong>example:</strong>
         * <p>original_response_column</p>
         */
        @NameInMap("OriginalColumn")
        public String originalColumn;

        /**
         * <strong>example:</strong>
         * <p>responseParam1</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        /**
         * <strong>example:</strong>
         * <p>String</p>
         */
        @NameInMap("ParamType")
        public String paramType;

        /**
         * <strong>example:</strong>
         * <p>/path/to/response_param</p>
         */
        @NameInMap("ParameterLocation")
        public String parameterLocation;

        /**
         * <strong>example:</strong>
         * <p>responseValue1</p>
         */
        @NameInMap("Sample")
        public String sample;

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("TableAndDsList")
        public java.util.List<ListApiByAppResponseBodyListResultDataResponseParamListTableAndDsList> tableAndDsList;

        public static ListApiByAppResponseBodyListResultDataResponseParamList build(java.util.Map<String, ?> map) throws Exception {
            ListApiByAppResponseBodyListResultDataResponseParamList self = new ListApiByAppResponseBodyListResultDataResponseParamList();
            return TeaModel.build(map, self);
        }

        public ListApiByAppResponseBodyListResultDataResponseParamList setDateFormat(String dateFormat) {
            this.dateFormat = dateFormat;
            return this;
        }
        public String getDateFormat() {
            return this.dateFormat;
        }

        public ListApiByAppResponseBodyListResultDataResponseParamList setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListApiByAppResponseBodyListResultDataResponseParamList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApiByAppResponseBodyListResultDataResponseParamList setDescriptionCode(String descriptionCode) {
            this.descriptionCode = descriptionCode;
            return this;
        }
        public String getDescriptionCode() {
            return this.descriptionCode;
        }

        public ListApiByAppResponseBodyListResultDataResponseParamList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListApiByAppResponseBodyListResultDataResponseParamList setInitialValue(String initialValue) {
            this.initialValue = initialValue;
            return this;
        }
        public String getInitialValue() {
            return this.initialValue;
        }

        public ListApiByAppResponseBodyListResultDataResponseParamList setMappingColumn(String mappingColumn) {
            this.mappingColumn = mappingColumn;
            return this;
        }
        public String getMappingColumn() {
            return this.mappingColumn;
        }

        public ListApiByAppResponseBodyListResultDataResponseParamList setMust(Long must) {
            this.must = must;
            return this;
        }
        public Long getMust() {
            return this.must;
        }

        public ListApiByAppResponseBodyListResultDataResponseParamList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListApiByAppResponseBodyListResultDataResponseParamList setOptional(Long optional) {
            this.optional = optional;
            return this;
        }
        public Long getOptional() {
            return this.optional;
        }

        public ListApiByAppResponseBodyListResultDataResponseParamList setOriginalColumn(String originalColumn) {
            this.originalColumn = originalColumn;
            return this;
        }
        public String getOriginalColumn() {
            return this.originalColumn;
        }

        public ListApiByAppResponseBodyListResultDataResponseParamList setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public ListApiByAppResponseBodyListResultDataResponseParamList setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

        public ListApiByAppResponseBodyListResultDataResponseParamList setParameterLocation(String parameterLocation) {
            this.parameterLocation = parameterLocation;
            return this;
        }
        public String getParameterLocation() {
            return this.parameterLocation;
        }

        public ListApiByAppResponseBodyListResultDataResponseParamList setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public ListApiByAppResponseBodyListResultDataResponseParamList setTableAndDsList(java.util.List<ListApiByAppResponseBodyListResultDataResponseParamListTableAndDsList> tableAndDsList) {
            this.tableAndDsList = tableAndDsList;
            return this;
        }
        public java.util.List<ListApiByAppResponseBodyListResultDataResponseParamListTableAndDsList> getTableAndDsList() {
            return this.tableAndDsList;
        }

    }

    public static class ListApiByAppResponseBodyListResultData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>987654321</p>
         */
        @NameInMap("ApiNo")
        public Long apiNo;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ApiTimeout")
        public Long apiTimeout;

        /**
         * <strong>example:</strong>
         * <p>exampleApp</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>exampleModule</p>
         */
        @NameInMap("BizModuleEnName")
        public String bizModuleEnName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CacheSwitch")
        public String cacheSwitch;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("CacheTime")
        public String cacheTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CreateType")
        public Long createType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DbEnv")
        public Long dbEnv;

        /**
         * <strong>example:</strong>
         * <p>这是一个示例API</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>54321</p>
         */
        @NameInMap("DirectDatasourceId")
        public Long directDatasourceId;

        /**
         * <strong>example:</strong>
         * <p>directDatasource</p>
         */
        @NameInMap("DirectDatasourceName")
        public String directDatasourceName;

        /**
         * <strong>example:</strong>
         * <p>67890</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <strong>example:</strong>
         * <p>exampleGroup</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("IsLogicalTable")
        public Boolean isLogicalTable;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsPagedQuery")
        public Long isPagedQuery;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxReturnNum")
        public Long maxReturnNum;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ModelType")
        public Long modelType;

        /**
         * <strong>example:</strong>
         * <p>exampleApi</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>112233</p>
         */
        @NameInMap("ProjId")
        public Long projId;

        /**
         * <strong>example:</strong>
         * <p>exampleProject</p>
         */
        @NameInMap("ProjName")
        public String projName;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Protocol")
        public Long protocol;

        /**
         * <strong>example:</strong>
         * <p>HTTP和HTTPS</p>
         */
        @NameInMap("ProtocolName")
        public String protocolName;

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("PublicParamList")
        public java.util.List<ListApiByAppResponseBodyListResultDataPublicParamList> publicParamList;

        @NameInMap("RegisterApi")
        public ListApiByAppResponseBodyListResultDataRegisterApi registerApi;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RequestMethod")
        public Long requestMethod;

        /**
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("RequestMethodName")
        public String requestMethodName;

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("RequestParamList")
        public java.util.List<ListApiByAppResponseBodyListResultDataRequestParamList> requestParamList;

        /**
         * <strong>example:</strong>
         * <p>exampleResourceGroup</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ResponseParamList")
        public java.util.List<ListApiByAppResponseBodyListResultDataResponseParamList> responseParamList;

        /**
         * <strong>example:</strong>
         * <p>{&quot;status&quot;:&quot;success&quot;,&quot;data&quot;:[]}</p>
         */
        @NameInMap("ResultSample")
        public String resultSample;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ReturnType")
        public Long returnType;

        /**
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        @NameInMap("ReturnTypeName")
        public String returnTypeName;

        /**
         * <strong>example:</strong>
         * <p>grp12345</p>
         */
        @NameInMap("RsGrpId")
        public String rsGrpId;

        /**
         * <strong>example:</strong>
         * <p>SQL</p>
         */
        @NameInMap("ScriptType")
        public String scriptType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpecialSql")
        public Long specialSql;

        /**
         * <strong>example:</strong>
         * <p>SELECT * FROM example_table</p>
         */
        @NameInMap("SqlStatement")
        public String sqlStatement;

        /**
         * <strong>example:</strong>
         * <p>exampleTable</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Timeout")
        public String timeout;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UpdateRate")
        public Long updateRate;

        /**
         * <strong>example:</strong>
         * <p>每日更新</p>
         */
        @NameInMap("UpdateRateName")
        public String updateRateName;

        /**
         * <strong>example:</strong>
         * <p>v1.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListApiByAppResponseBodyListResultData build(java.util.Map<String, ?> map) throws Exception {
            ListApiByAppResponseBodyListResultData self = new ListApiByAppResponseBodyListResultData();
            return TeaModel.build(map, self);
        }

        public ListApiByAppResponseBodyListResultData setApiNo(Long apiNo) {
            this.apiNo = apiNo;
            return this;
        }
        public Long getApiNo() {
            return this.apiNo;
        }

        public ListApiByAppResponseBodyListResultData setApiTimeout(Long apiTimeout) {
            this.apiTimeout = apiTimeout;
            return this;
        }
        public Long getApiTimeout() {
            return this.apiTimeout;
        }

        public ListApiByAppResponseBodyListResultData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListApiByAppResponseBodyListResultData setBizModuleEnName(String bizModuleEnName) {
            this.bizModuleEnName = bizModuleEnName;
            return this;
        }
        public String getBizModuleEnName() {
            return this.bizModuleEnName;
        }

        public ListApiByAppResponseBodyListResultData setCacheSwitch(String cacheSwitch) {
            this.cacheSwitch = cacheSwitch;
            return this;
        }
        public String getCacheSwitch() {
            return this.cacheSwitch;
        }

        public ListApiByAppResponseBodyListResultData setCacheTime(String cacheTime) {
            this.cacheTime = cacheTime;
            return this;
        }
        public String getCacheTime() {
            return this.cacheTime;
        }

        public ListApiByAppResponseBodyListResultData setCreateType(Long createType) {
            this.createType = createType;
            return this;
        }
        public Long getCreateType() {
            return this.createType;
        }

        public ListApiByAppResponseBodyListResultData setDbEnv(Long dbEnv) {
            this.dbEnv = dbEnv;
            return this;
        }
        public Long getDbEnv() {
            return this.dbEnv;
        }

        public ListApiByAppResponseBodyListResultData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApiByAppResponseBodyListResultData setDirectDatasourceId(Long directDatasourceId) {
            this.directDatasourceId = directDatasourceId;
            return this;
        }
        public Long getDirectDatasourceId() {
            return this.directDatasourceId;
        }

        public ListApiByAppResponseBodyListResultData setDirectDatasourceName(String directDatasourceName) {
            this.directDatasourceName = directDatasourceName;
            return this;
        }
        public String getDirectDatasourceName() {
            return this.directDatasourceName;
        }

        public ListApiByAppResponseBodyListResultData setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public ListApiByAppResponseBodyListResultData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListApiByAppResponseBodyListResultData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListApiByAppResponseBodyListResultData setIsLogicalTable(Boolean isLogicalTable) {
            this.isLogicalTable = isLogicalTable;
            return this;
        }
        public Boolean getIsLogicalTable() {
            return this.isLogicalTable;
        }

        public ListApiByAppResponseBodyListResultData setIsPagedQuery(Long isPagedQuery) {
            this.isPagedQuery = isPagedQuery;
            return this;
        }
        public Long getIsPagedQuery() {
            return this.isPagedQuery;
        }

        public ListApiByAppResponseBodyListResultData setMaxReturnNum(Long maxReturnNum) {
            this.maxReturnNum = maxReturnNum;
            return this;
        }
        public Long getMaxReturnNum() {
            return this.maxReturnNum;
        }

        public ListApiByAppResponseBodyListResultData setModelType(Long modelType) {
            this.modelType = modelType;
            return this;
        }
        public Long getModelType() {
            return this.modelType;
        }

        public ListApiByAppResponseBodyListResultData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApiByAppResponseBodyListResultData setProjId(Long projId) {
            this.projId = projId;
            return this;
        }
        public Long getProjId() {
            return this.projId;
        }

        public ListApiByAppResponseBodyListResultData setProjName(String projName) {
            this.projName = projName;
            return this;
        }
        public String getProjName() {
            return this.projName;
        }

        public ListApiByAppResponseBodyListResultData setProtocol(Long protocol) {
            this.protocol = protocol;
            return this;
        }
        public Long getProtocol() {
            return this.protocol;
        }

        public ListApiByAppResponseBodyListResultData setProtocolName(String protocolName) {
            this.protocolName = protocolName;
            return this;
        }
        public String getProtocolName() {
            return this.protocolName;
        }

        public ListApiByAppResponseBodyListResultData setPublicParamList(java.util.List<ListApiByAppResponseBodyListResultDataPublicParamList> publicParamList) {
            this.publicParamList = publicParamList;
            return this;
        }
        public java.util.List<ListApiByAppResponseBodyListResultDataPublicParamList> getPublicParamList() {
            return this.publicParamList;
        }

        public ListApiByAppResponseBodyListResultData setRegisterApi(ListApiByAppResponseBodyListResultDataRegisterApi registerApi) {
            this.registerApi = registerApi;
            return this;
        }
        public ListApiByAppResponseBodyListResultDataRegisterApi getRegisterApi() {
            return this.registerApi;
        }

        public ListApiByAppResponseBodyListResultData setRequestMethod(Long requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }
        public Long getRequestMethod() {
            return this.requestMethod;
        }

        public ListApiByAppResponseBodyListResultData setRequestMethodName(String requestMethodName) {
            this.requestMethodName = requestMethodName;
            return this;
        }
        public String getRequestMethodName() {
            return this.requestMethodName;
        }

        public ListApiByAppResponseBodyListResultData setRequestParamList(java.util.List<ListApiByAppResponseBodyListResultDataRequestParamList> requestParamList) {
            this.requestParamList = requestParamList;
            return this;
        }
        public java.util.List<ListApiByAppResponseBodyListResultDataRequestParamList> getRequestParamList() {
            return this.requestParamList;
        }

        public ListApiByAppResponseBodyListResultData setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public ListApiByAppResponseBodyListResultData setResponseParamList(java.util.List<ListApiByAppResponseBodyListResultDataResponseParamList> responseParamList) {
            this.responseParamList = responseParamList;
            return this;
        }
        public java.util.List<ListApiByAppResponseBodyListResultDataResponseParamList> getResponseParamList() {
            return this.responseParamList;
        }

        public ListApiByAppResponseBodyListResultData setResultSample(String resultSample) {
            this.resultSample = resultSample;
            return this;
        }
        public String getResultSample() {
            return this.resultSample;
        }

        public ListApiByAppResponseBodyListResultData setReturnType(Long returnType) {
            this.returnType = returnType;
            return this;
        }
        public Long getReturnType() {
            return this.returnType;
        }

        public ListApiByAppResponseBodyListResultData setReturnTypeName(String returnTypeName) {
            this.returnTypeName = returnTypeName;
            return this;
        }
        public String getReturnTypeName() {
            return this.returnTypeName;
        }

        public ListApiByAppResponseBodyListResultData setRsGrpId(String rsGrpId) {
            this.rsGrpId = rsGrpId;
            return this;
        }
        public String getRsGrpId() {
            return this.rsGrpId;
        }

        public ListApiByAppResponseBodyListResultData setScriptType(String scriptType) {
            this.scriptType = scriptType;
            return this;
        }
        public String getScriptType() {
            return this.scriptType;
        }

        public ListApiByAppResponseBodyListResultData setSpecialSql(Long specialSql) {
            this.specialSql = specialSql;
            return this;
        }
        public Long getSpecialSql() {
            return this.specialSql;
        }

        public ListApiByAppResponseBodyListResultData setSqlStatement(String sqlStatement) {
            this.sqlStatement = sqlStatement;
            return this;
        }
        public String getSqlStatement() {
            return this.sqlStatement;
        }

        public ListApiByAppResponseBodyListResultData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListApiByAppResponseBodyListResultData setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

        public ListApiByAppResponseBodyListResultData setUpdateRate(Long updateRate) {
            this.updateRate = updateRate;
            return this;
        }
        public Long getUpdateRate() {
            return this.updateRate;
        }

        public ListApiByAppResponseBodyListResultData setUpdateRateName(String updateRateName) {
            this.updateRateName = updateRateName;
            return this;
        }
        public String getUpdateRateName() {
            return this.updateRateName;
        }

        public ListApiByAppResponseBodyListResultData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListApiByAppResponseBodyListResult extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListApiByAppResponseBodyListResultData> data;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListApiByAppResponseBodyListResult build(java.util.Map<String, ?> map) throws Exception {
            ListApiByAppResponseBodyListResult self = new ListApiByAppResponseBodyListResult();
            return TeaModel.build(map, self);
        }

        public ListApiByAppResponseBodyListResult setData(java.util.List<ListApiByAppResponseBodyListResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListApiByAppResponseBodyListResultData> getData() {
            return this.data;
        }

        public ListApiByAppResponseBodyListResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
