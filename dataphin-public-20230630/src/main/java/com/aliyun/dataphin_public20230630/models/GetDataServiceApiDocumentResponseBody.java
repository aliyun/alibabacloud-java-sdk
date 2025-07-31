// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceApiDocumentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDataServiceApiDocumentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

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
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <strong>example:</strong>
         * <p>102311</p>
         */
        @NameInMap("DatasourceId")
        public String datasourceId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DatasourceName")
        public String datasourceName;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HttpMethod")
        public Integer httpMethod;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Mode")
        public Integer mode;

        /**
         * <strong>example:</strong>
         * <p>/api/test</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>https</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
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
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("IsRequired")
        public Boolean isRequired;

        /**
         * <strong>example:</strong>
         * <p>col1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Sample")
        public String sample;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("IsRequired")
        public Boolean isRequired;

        /**
         * <strong>example:</strong>
         * <p>col1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Sample")
        public String sample;

        /**
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
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>col1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Sample")
        public String sample;

        /**
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
         * <strong>example:</strong>
         * <p>102101</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        @NameInMap("ApiRegisterInfo")
        public GetDataServiceApiDocumentResponseBodyDataApiRegisterInfo apiRegisterInfo;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("ApiTimeout")
        public Integer apiTimeout;

        /**
         * <strong>example:</strong>
         * <p>bizUnit_test</p>
         */
        @NameInMap("BizUnitName")
        public String bizUnitName;

        /**
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("CacheTime")
        public String cacheTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CreateType")
        public Integer createType;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DirectDatasourceId")
        public Long directDatasourceId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DirectDatasourceName")
        public String directDatasourceName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Env")
        public Integer env;

        /**
         * <strong>example:</strong>
         * <p>1011</p>
         */
        @NameInMap("GroupId")
        public Integer groupId;

        /**
         * <strong>example:</strong>
         * <p>1011</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("IsLogicalTable")
        public Boolean isLogicalTable;

        @NameInMap("IsPagedQuery")
        public Boolean isPagedQuery;

        @NameInMap("IsSpecialSql")
        public Boolean isSpecialSql;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Mode")
        public Integer mode;

        /**
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("OpenCache")
        public Boolean openCache;

        /**
         * <strong>example:</strong>
         * <p>10201</p>
         */
        @NameInMap("ProjectId")
        public Integer projectId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Protocol")
        public Integer protocol;

        @NameInMap("PublicParamList")
        public java.util.List<GetDataServiceApiDocumentResponseBodyDataPublicParamList> publicParamList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RequestMethod")
        public Integer requestMethod;

        @NameInMap("RequestParamList")
        public java.util.List<GetDataServiceApiDocumentResponseBodyDataRequestParamList> requestParamList;

        /**
         * <strong>example:</strong>
         * <p>10021</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        @NameInMap("ResponseParamList")
        public java.util.List<GetDataServiceApiDocumentResponseBodyDataResponseParamList> responseParamList;

        /**
         * <strong>example:</strong>
         * <p>{&quot;count&quot;: 88}</p>
         */
        @NameInMap("ResultSample")
        public String resultSample;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ReturnLimit")
        public Integer returnLimit;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReturnType")
        public Integer returnType;

        /**
         * <strong>example:</strong>
         * <p>NORMAL_SQL</p>
         */
        @NameInMap("ScriptType")
        public String scriptType;

        /**
         * <strong>example:</strong>
         * <p>select col1 from table1;</p>
         */
        @NameInMap("Sql")
        public String sql;

        /**
         * <strong>example:</strong>
         * <p>t_logical_test1</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Timeout")
        public String timeout;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UpdateRate")
        public Integer updateRate;

        /**
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
