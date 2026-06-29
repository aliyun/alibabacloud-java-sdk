// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceApiDocumentResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The API documentation.</p>
     */
    @NameInMap("Data")
    public GetDataServiceApiDocumentResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend exception.</p>
     * 
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
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataServiceApiDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiDocumentResponseBody self = new GetDataServiceApiDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApiDocumentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataServiceApiDocumentResponseBody setData(GetDataServiceApiDocumentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataServiceApiDocumentResponseBodyData getData() {
        return this.data;
    }

    public GetDataServiceApiDocumentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataServiceApiDocumentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDataServiceApiDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataServiceApiDocumentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataServiceApiDocumentResponseBodyDataApiRegisterInfo extends TeaModel {
        /**
         * <p>The authentication method for the API data source. Valid values:</p>
         * <ul>
         * <li>1: BearToken</li>
         * <li>2: ApiKey</li>
         * <li>3: None</li>
         * <li>4: AppKeyAuth</li>
         * <li>5: BasicAuth.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The API data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>102311</p>
         */
        @NameInMap("DatasourceId")
        public String datasourceId;

        /**
         * <p>The API data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DatasourceName")
        public String datasourceName;

        /**
         * <p>The HTTP method for the registered API. Valid values:</p>
         * <ul>
         * <li>1: GET</li>
         * <li>2: POST.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HttpMethod")
        public Integer httpMethod;

        /**
         * <p>The mode. Valid values:</p>
         * <ul>
         * <li>0: basic</li>
         * <li>1: dev_prod.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Mode")
        public Integer mode;

        /**
         * <p>The service path.</p>
         * 
         * <strong>example:</strong>
         * <p>/api/test</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The request protocol for the API data source.</p>
         * 
         * <strong>example:</strong>
         * <p>https</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The timeout period, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The API data source URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://192.168.1.1:8080">http://192.168.1.1:8080</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetDataServiceApiDocumentResponseBodyDataApiRegisterInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiDocumentResponseBodyDataApiRegisterInfo self = new GetDataServiceApiDocumentResponseBodyDataApiRegisterInfo();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiDocumentResponseBodyDataApiRegisterInfo setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public GetDataServiceApiDocumentResponseBodyDataApiRegisterInfo setDatasourceId(String datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }
        public String getDatasourceId() {
            return this.datasourceId;
        }

        public GetDataServiceApiDocumentResponseBodyDataApiRegisterInfo setDatasourceName(String datasourceName) {
            this.datasourceName = datasourceName;
            return this;
        }
        public String getDatasourceName() {
            return this.datasourceName;
        }

        public GetDataServiceApiDocumentResponseBodyDataApiRegisterInfo setHttpMethod(Integer httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public Integer getHttpMethod() {
            return this.httpMethod;
        }

        public GetDataServiceApiDocumentResponseBodyDataApiRegisterInfo setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public GetDataServiceApiDocumentResponseBodyDataApiRegisterInfo setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetDataServiceApiDocumentResponseBodyDataApiRegisterInfo setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetDataServiceApiDocumentResponseBodyDataApiRegisterInfo setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public GetDataServiceApiDocumentResponseBodyDataApiRegisterInfo setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetDataServiceApiDocumentResponseBodyDataPublicParamList extends TeaModel {
        /**
         * <p>The parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Specifies whether the request parameter is required. Valid values:</p>
         * <ul>
         * <li>1: Required.</li>
         * <li>0: Optional.</li>
         * </ul>
         */
        @NameInMap("IsRequired")
        public Boolean isRequired;

        /**
         * <p>The frontend parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>col1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter example.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Sample")
        public String sample;

        /**
         * <p>The parameter type.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataServiceApiDocumentResponseBodyDataPublicParamList build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiDocumentResponseBodyDataPublicParamList self = new GetDataServiceApiDocumentResponseBodyDataPublicParamList();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiDocumentResponseBodyDataPublicParamList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataServiceApiDocumentResponseBodyDataPublicParamList setIsRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        public GetDataServiceApiDocumentResponseBodyDataPublicParamList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataServiceApiDocumentResponseBodyDataPublicParamList setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public GetDataServiceApiDocumentResponseBodyDataPublicParamList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataServiceApiDocumentResponseBodyDataRequestParamList extends TeaModel {
        /**
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Specifies whether the request parameter is required. Valid values:</p>
         * <ul>
         * <li>1: Required.</li>
         * <li>0: Optional.</li>
         * </ul>
         */
        @NameInMap("IsRequired")
        public Boolean isRequired;

        /**
         * <p>The frontend parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>col1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter example.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Sample")
        public String sample;

        /**
         * <p>The parameter type.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataServiceApiDocumentResponseBodyDataRequestParamList build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiDocumentResponseBodyDataRequestParamList self = new GetDataServiceApiDocumentResponseBodyDataRequestParamList();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiDocumentResponseBodyDataRequestParamList setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetDataServiceApiDocumentResponseBodyDataRequestParamList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataServiceApiDocumentResponseBodyDataRequestParamList setIsRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        public GetDataServiceApiDocumentResponseBodyDataRequestParamList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataServiceApiDocumentResponseBodyDataRequestParamList setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public GetDataServiceApiDocumentResponseBodyDataRequestParamList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataServiceApiDocumentResponseBodyDataResponseParamList extends TeaModel {
        /**
         * <p>The parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The frontend parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>col1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter example.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Sample")
        public String sample;

        /**
         * <p>The parameter type.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDataServiceApiDocumentResponseBodyDataResponseParamList build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiDocumentResponseBodyDataResponseParamList self = new GetDataServiceApiDocumentResponseBodyDataResponseParamList();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiDocumentResponseBodyDataResponseParamList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataServiceApiDocumentResponseBodyDataResponseParamList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataServiceApiDocumentResponseBodyDataResponseParamList setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public GetDataServiceApiDocumentResponseBodyDataResponseParamList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDataServiceApiDocumentResponseBodyData extends TeaModel {
        /**
         * <p>The API ID.</p>
         * 
         * <strong>example:</strong>
         * <p>102101</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        /**
         * <p>The API registration information.</p>
         */
        @NameInMap("ApiRegisterInfo")
        public GetDataServiceApiDocumentResponseBodyDataApiRegisterInfo apiRegisterInfo;

        /**
         * <p>The timeout period of the direct API, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("ApiTimeout")
        public Integer apiTimeout;

        /**
         * <p>The business unit name. This parameter has a value only for logical tables.</p>
         * 
         * <strong>example:</strong>
         * <p>bizUnit_test</p>
         */
        @NameInMap("BizUnitName")
        public String bizUnitName;

        /**
         * <p>The cache duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("CacheTime")
        public String cacheTime;

        /**
         * <p>The creation type. Valid values:</p>
         * <ul>
         * <li>0: custom mode</li>
         * <li>1: wizard mode</li>
         * <li>2: direct API.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CreateType")
        public Integer createType;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The data source ID of the direct API.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DirectDatasourceId")
        public Long directDatasourceId;

        /**
         * <p>The data source name of the direct API.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DirectDatasourceName")
        public String directDatasourceName;

        /**
         * <p>The environment. Valid values:</p>
         * <ul>
         * <li>0: dev</li>
         * <li>1: prod.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Env")
        public Integer env;

        /**
         * <p>The API group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1011</p>
         */
        @NameInMap("GroupId")
        public Integer groupId;

        /**
         * <p>The API group name.</p>
         * 
         * <strong>example:</strong>
         * <p>1011</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>Indicates whether the table is a logical table.</p>
         */
        @NameInMap("IsLogicalTable")
        public Boolean isLogicalTable;

        /**
         * <p>Indicates whether the query is a paged query. Valid values:</p>
         * <ul>
         * <li>1: Yes.</li>
         * <li>0: No.</li>
         * </ul>
         */
        @NameInMap("IsPagedQuery")
        public Boolean isPagedQuery;

        /**
         * <p>Specifies whether the SQL is special. Valid values:</p>
         * <ul>
         * <li>0: No.</li>
         * <li>1: Yes.</li>
         * </ul>
         */
        @NameInMap("IsSpecialSql")
        public Boolean isSpecialSql;

        /**
         * <p>The mode. Valid values:</p>
         * <ul>
         * <li>0: basic</li>
         * <li>1: dev_prod.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Mode")
        public Integer mode;

        /**
         * <p>The API name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether caching is enabled. Valid values:</p>
         * <ul>
         * <li>0: Disabled.</li>
         * <li>1: Enabled.</li>
         * </ul>
         */
        @NameInMap("OpenCache")
        public Boolean openCache;

        /**
         * <p>The data service project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10201</p>
         */
        @NameInMap("ProjectId")
        public Integer projectId;

        /**
         * <p>The data service project name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The protocol. Valid values:</p>
         * <ul>
         * <li>1: HTTPS</li>
         * <li>2: HTTP</li>
         * <li>3: both HTTP and HTTPS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Protocol")
        public Integer protocol;

        /**
         * <p>The list of common parameters.</p>
         */
        @NameInMap("PublicParamList")
        public java.util.List<GetDataServiceApiDocumentResponseBodyDataPublicParamList> publicParamList;

        /**
         * <p>The request method. Valid values:</p>
         * <ul>
         * <li>1: get</li>
         * <li>2: list.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RequestMethod")
        public Integer requestMethod;

        /**
         * <p>The list of request parameters.</p>
         */
        @NameInMap("RequestParamList")
        public java.util.List<GetDataServiceApiDocumentResponseBodyDataRequestParamList> requestParamList;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10021</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The resource group name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        /**
         * <p>The list of response parameters.</p>
         */
        @NameInMap("ResponseParamList")
        public java.util.List<GetDataServiceApiDocumentResponseBodyDataResponseParamList> responseParamList;

        /**
         * <p>The sample invocation result.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;count&quot;: 88}</p>
         */
        @NameInMap("ResultSample")
        public String resultSample;

        /**
         * <p>The maximum number of records returned by the direct API.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ReturnLimit")
        public Integer returnLimit;

        /**
         * <p>The return data type. Valid values:</p>
         * <ul>
         * <li>1: JSON.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReturnType")
        public Integer returnType;

        /**
         * <p>The script type. Valid values:</p>
         * <ul>
         * <li>NORMAL_SQL: basic SQL</li>
         * <li>MYBATIS_SQL: advanced SQL</li>
         * <li>AVIATOR: Aviator expression.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL_SQL</p>
         */
        @NameInMap("ScriptType")
        public String scriptType;

        /**
         * <p>The SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>select col1 from table1;</p>
         */
        @NameInMap("Sql")
        public String sql;

        /**
         * <p>The logical table name. This parameter has a value only for logical tables.</p>
         * 
         * <strong>example:</strong>
         * <p>t_logical_test1</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The timeout period, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Timeout")
        public String timeout;

        /**
         * <p>The update frequency. Valid values:</p>
         * <ul>
         * <li>0: custom</li>
         * <li>1: daily</li>
         * <li>2: hourly</li>
         * <li>3: every minute.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UpdateRate")
        public Integer updateRate;

        /**
         * <p>The version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetDataServiceApiDocumentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiDocumentResponseBodyData self = new GetDataServiceApiDocumentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiDocumentResponseBodyData setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public GetDataServiceApiDocumentResponseBodyData setApiRegisterInfo(GetDataServiceApiDocumentResponseBodyDataApiRegisterInfo apiRegisterInfo) {
            this.apiRegisterInfo = apiRegisterInfo;
            return this;
        }
        public GetDataServiceApiDocumentResponseBodyDataApiRegisterInfo getApiRegisterInfo() {
            return this.apiRegisterInfo;
        }

        public GetDataServiceApiDocumentResponseBodyData setApiTimeout(Integer apiTimeout) {
            this.apiTimeout = apiTimeout;
            return this;
        }
        public Integer getApiTimeout() {
            return this.apiTimeout;
        }

        public GetDataServiceApiDocumentResponseBodyData setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public GetDataServiceApiDocumentResponseBodyData setCacheTime(String cacheTime) {
            this.cacheTime = cacheTime;
            return this;
        }
        public String getCacheTime() {
            return this.cacheTime;
        }

        public GetDataServiceApiDocumentResponseBodyData setCreateType(Integer createType) {
            this.createType = createType;
            return this;
        }
        public Integer getCreateType() {
            return this.createType;
        }

        public GetDataServiceApiDocumentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataServiceApiDocumentResponseBodyData setDirectDatasourceId(Long directDatasourceId) {
            this.directDatasourceId = directDatasourceId;
            return this;
        }
        public Long getDirectDatasourceId() {
            return this.directDatasourceId;
        }

        public GetDataServiceApiDocumentResponseBodyData setDirectDatasourceName(String directDatasourceName) {
            this.directDatasourceName = directDatasourceName;
            return this;
        }
        public String getDirectDatasourceName() {
            return this.directDatasourceName;
        }

        public GetDataServiceApiDocumentResponseBodyData setEnv(Integer env) {
            this.env = env;
            return this;
        }
        public Integer getEnv() {
            return this.env;
        }

        public GetDataServiceApiDocumentResponseBodyData setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public GetDataServiceApiDocumentResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetDataServiceApiDocumentResponseBodyData setIsLogicalTable(Boolean isLogicalTable) {
            this.isLogicalTable = isLogicalTable;
            return this;
        }
        public Boolean getIsLogicalTable() {
            return this.isLogicalTable;
        }

        public GetDataServiceApiDocumentResponseBodyData setIsPagedQuery(Boolean isPagedQuery) {
            this.isPagedQuery = isPagedQuery;
            return this;
        }
        public Boolean getIsPagedQuery() {
            return this.isPagedQuery;
        }

        public GetDataServiceApiDocumentResponseBodyData setIsSpecialSql(Boolean isSpecialSql) {
            this.isSpecialSql = isSpecialSql;
            return this;
        }
        public Boolean getIsSpecialSql() {
            return this.isSpecialSql;
        }

        public GetDataServiceApiDocumentResponseBodyData setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public GetDataServiceApiDocumentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataServiceApiDocumentResponseBodyData setOpenCache(Boolean openCache) {
            this.openCache = openCache;
            return this;
        }
        public Boolean getOpenCache() {
            return this.openCache;
        }

        public GetDataServiceApiDocumentResponseBodyData setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public GetDataServiceApiDocumentResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetDataServiceApiDocumentResponseBodyData setProtocol(Integer protocol) {
            this.protocol = protocol;
            return this;
        }
        public Integer getProtocol() {
            return this.protocol;
        }

        public GetDataServiceApiDocumentResponseBodyData setPublicParamList(java.util.List<GetDataServiceApiDocumentResponseBodyDataPublicParamList> publicParamList) {
            this.publicParamList = publicParamList;
            return this;
        }
        public java.util.List<GetDataServiceApiDocumentResponseBodyDataPublicParamList> getPublicParamList() {
            return this.publicParamList;
        }

        public GetDataServiceApiDocumentResponseBodyData setRequestMethod(Integer requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }
        public Integer getRequestMethod() {
            return this.requestMethod;
        }

        public GetDataServiceApiDocumentResponseBodyData setRequestParamList(java.util.List<GetDataServiceApiDocumentResponseBodyDataRequestParamList> requestParamList) {
            this.requestParamList = requestParamList;
            return this;
        }
        public java.util.List<GetDataServiceApiDocumentResponseBodyDataRequestParamList> getRequestParamList() {
            return this.requestParamList;
        }

        public GetDataServiceApiDocumentResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetDataServiceApiDocumentResponseBodyData setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public GetDataServiceApiDocumentResponseBodyData setResponseParamList(java.util.List<GetDataServiceApiDocumentResponseBodyDataResponseParamList> responseParamList) {
            this.responseParamList = responseParamList;
            return this;
        }
        public java.util.List<GetDataServiceApiDocumentResponseBodyDataResponseParamList> getResponseParamList() {
            return this.responseParamList;
        }

        public GetDataServiceApiDocumentResponseBodyData setResultSample(String resultSample) {
            this.resultSample = resultSample;
            return this;
        }
        public String getResultSample() {
            return this.resultSample;
        }

        public GetDataServiceApiDocumentResponseBodyData setReturnLimit(Integer returnLimit) {
            this.returnLimit = returnLimit;
            return this;
        }
        public Integer getReturnLimit() {
            return this.returnLimit;
        }

        public GetDataServiceApiDocumentResponseBodyData setReturnType(Integer returnType) {
            this.returnType = returnType;
            return this;
        }
        public Integer getReturnType() {
            return this.returnType;
        }

        public GetDataServiceApiDocumentResponseBodyData setScriptType(String scriptType) {
            this.scriptType = scriptType;
            return this;
        }
        public String getScriptType() {
            return this.scriptType;
        }

        public GetDataServiceApiDocumentResponseBodyData setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public GetDataServiceApiDocumentResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetDataServiceApiDocumentResponseBodyData setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

        public GetDataServiceApiDocumentResponseBodyData setUpdateRate(Integer updateRate) {
            this.updateRate = updateRate;
            return this;
        }
        public Integer getUpdateRate() {
            return this.updateRate;
        }

        public GetDataServiceApiDocumentResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
