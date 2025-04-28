// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateDataServiceApiRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateDataServiceApiRequestCreateCommand createCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateDataServiceApiRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataServiceApiRequest self = new CreateDataServiceApiRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataServiceApiRequest setCreateCommand(CreateDataServiceApiRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateDataServiceApiRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateDataServiceApiRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateDataServiceApiRequestCreateCommandScriptDetailsScriptRequestParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ExampleValue")
        public String exampleValue;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsRequiredParameter")
        public Boolean isRequiredParameter;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("ParameterDataType")
        public String parameterDataType;

        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>=</p>
         */
        @NameInMap("ParameterValueType")
        public String parameterValueType;

        public static CreateDataServiceApiRequestCreateCommandScriptDetailsScriptRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateDataServiceApiRequestCreateCommandScriptDetailsScriptRequestParameters self = new CreateDataServiceApiRequestCreateCommandScriptDetailsScriptRequestParameters();
            return TeaModel.build(map, self);
        }

        public CreateDataServiceApiRequestCreateCommandScriptDetailsScriptRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public CreateDataServiceApiRequestCreateCommandScriptDetailsScriptRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        public CreateDataServiceApiRequestCreateCommandScriptDetailsScriptRequestParameters setParameterDataType(String parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public String getParameterDataType() {
            return this.parameterDataType;
        }

        public CreateDataServiceApiRequestCreateCommandScriptDetailsScriptRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public CreateDataServiceApiRequestCreateCommandScriptDetailsScriptRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public CreateDataServiceApiRequestCreateCommandScriptDetailsScriptRequestParameters setParameterValueType(String parameterValueType) {
            this.parameterValueType = parameterValueType;
            return this;
        }
        public String getParameterValueType() {
            return this.parameterValueType;
        }

    }

    public static class CreateDataServiceApiRequestCreateCommandScriptDetailsScriptResponseParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>amazing</p>
         */
        @NameInMap("ExampleValue")
        public String exampleValue;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("ParameterDataType")
        public String parameterDataType;

        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        public static CreateDataServiceApiRequestCreateCommandScriptDetailsScriptResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateDataServiceApiRequestCreateCommandScriptDetailsScriptResponseParameters self = new CreateDataServiceApiRequestCreateCommandScriptDetailsScriptResponseParameters();
            return TeaModel.build(map, self);
        }

        public CreateDataServiceApiRequestCreateCommandScriptDetailsScriptResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public CreateDataServiceApiRequestCreateCommandScriptDetailsScriptResponseParameters setParameterDataType(String parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public String getParameterDataType() {
            return this.parameterDataType;
        }

        public CreateDataServiceApiRequestCreateCommandScriptDetailsScriptResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public CreateDataServiceApiRequestCreateCommandScriptDetailsScriptResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

    public static class CreateDataServiceApiRequestCreateCommandScriptDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6668888888888812345L</p>
         */
        @NameInMap("DatasourceID")
        public Long datasourceID;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DatasourceType")
        public Integer datasourceType;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsPaginated")
        public Boolean isPaginated;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>select a,b,c from table1 where d = ${d}</p>
         */
        @NameInMap("Script")
        public String script;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ScriptRequestParameters")
        public java.util.List<CreateDataServiceApiRequestCreateCommandScriptDetailsScriptRequestParameters> scriptRequestParameters;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ScriptResponseParameters")
        public java.util.List<CreateDataServiceApiRequestCreateCommandScriptDetailsScriptResponseParameters> scriptResponseParameters;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SortPriority")
        public Integer sortPriority;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SqlMode")
        public Integer sqlMode;

        public static CreateDataServiceApiRequestCreateCommandScriptDetails build(java.util.Map<String, ?> map) throws Exception {
            CreateDataServiceApiRequestCreateCommandScriptDetails self = new CreateDataServiceApiRequestCreateCommandScriptDetails();
            return TeaModel.build(map, self);
        }

        public CreateDataServiceApiRequestCreateCommandScriptDetails setDatasourceID(Long datasourceID) {
            this.datasourceID = datasourceID;
            return this;
        }
        public Long getDatasourceID() {
            return this.datasourceID;
        }

        public CreateDataServiceApiRequestCreateCommandScriptDetails setDatasourceType(Integer datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public Integer getDatasourceType() {
            return this.datasourceType;
        }

        public CreateDataServiceApiRequestCreateCommandScriptDetails setIsPaginated(Boolean isPaginated) {
            this.isPaginated = isPaginated;
            return this;
        }
        public Boolean getIsPaginated() {
            return this.isPaginated;
        }

        public CreateDataServiceApiRequestCreateCommandScriptDetails setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public CreateDataServiceApiRequestCreateCommandScriptDetails setScriptRequestParameters(java.util.List<CreateDataServiceApiRequestCreateCommandScriptDetailsScriptRequestParameters> scriptRequestParameters) {
            this.scriptRequestParameters = scriptRequestParameters;
            return this;
        }
        public java.util.List<CreateDataServiceApiRequestCreateCommandScriptDetailsScriptRequestParameters> getScriptRequestParameters() {
            return this.scriptRequestParameters;
        }

        public CreateDataServiceApiRequestCreateCommandScriptDetails setScriptResponseParameters(java.util.List<CreateDataServiceApiRequestCreateCommandScriptDetailsScriptResponseParameters> scriptResponseParameters) {
            this.scriptResponseParameters = scriptResponseParameters;
            return this;
        }
        public java.util.List<CreateDataServiceApiRequestCreateCommandScriptDetailsScriptResponseParameters> getScriptResponseParameters() {
            return this.scriptResponseParameters;
        }

        public CreateDataServiceApiRequestCreateCommandScriptDetails setSortPriority(Integer sortPriority) {
            this.sortPriority = sortPriority;
            return this;
        }
        public Integer getSortPriority() {
            return this.sortPriority;
        }

        public CreateDataServiceApiRequestCreateCommandScriptDetails setSqlMode(Integer sqlMode) {
            this.sqlMode = sqlMode;
            return this;
        }
        public Integer getSqlMode() {
            return this.sqlMode;
        }

    }

    public static class CreateDataServiceApiRequestCreateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("ApiGroupId")
        public Long apiGroupId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ApiGroupName")
        public String apiGroupName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>API_01</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ApiType")
        public Integer apiType;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("BizProtocol")
        public java.util.List<Integer> bizProtocol;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("CacheTimeout")
        public Integer cacheTimeout;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallMode")
        public Integer callMode;

        @NameInMap("CustomUpdateRate")
        public String customUpdateRate;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ExecutionTimeout")
        public Integer executionTimeout;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Mode")
        public Integer mode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RequestType")
        public Integer requestType;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ScriptDetails")
        public CreateDataServiceApiRequestCreateCommandScriptDetails scriptDetails;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UpdateRate")
        public Integer updateRate;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>V1</p>
         */
        @NameInMap("Version")
        public String version;

        public static CreateDataServiceApiRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateDataServiceApiRequestCreateCommand self = new CreateDataServiceApiRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateDataServiceApiRequestCreateCommand setApiGroupId(Long apiGroupId) {
            this.apiGroupId = apiGroupId;
            return this;
        }
        public Long getApiGroupId() {
            return this.apiGroupId;
        }

        public CreateDataServiceApiRequestCreateCommand setApiGroupName(String apiGroupName) {
            this.apiGroupName = apiGroupName;
            return this;
        }
        public String getApiGroupName() {
            return this.apiGroupName;
        }

        public CreateDataServiceApiRequestCreateCommand setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public CreateDataServiceApiRequestCreateCommand setApiType(Integer apiType) {
            this.apiType = apiType;
            return this;
        }
        public Integer getApiType() {
            return this.apiType;
        }

        public CreateDataServiceApiRequestCreateCommand setBizProtocol(java.util.List<Integer> bizProtocol) {
            this.bizProtocol = bizProtocol;
            return this;
        }
        public java.util.List<Integer> getBizProtocol() {
            return this.bizProtocol;
        }

        public CreateDataServiceApiRequestCreateCommand setCacheTimeout(Integer cacheTimeout) {
            this.cacheTimeout = cacheTimeout;
            return this;
        }
        public Integer getCacheTimeout() {
            return this.cacheTimeout;
        }

        public CreateDataServiceApiRequestCreateCommand setCallMode(Integer callMode) {
            this.callMode = callMode;
            return this;
        }
        public Integer getCallMode() {
            return this.callMode;
        }

        public CreateDataServiceApiRequestCreateCommand setCustomUpdateRate(String customUpdateRate) {
            this.customUpdateRate = customUpdateRate;
            return this;
        }
        public String getCustomUpdateRate() {
            return this.customUpdateRate;
        }

        public CreateDataServiceApiRequestCreateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateDataServiceApiRequestCreateCommand setExecutionTimeout(Integer executionTimeout) {
            this.executionTimeout = executionTimeout;
            return this;
        }
        public Integer getExecutionTimeout() {
            return this.executionTimeout;
        }

        public CreateDataServiceApiRequestCreateCommand setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public CreateDataServiceApiRequestCreateCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public CreateDataServiceApiRequestCreateCommand setRequestType(Integer requestType) {
            this.requestType = requestType;
            return this;
        }
        public Integer getRequestType() {
            return this.requestType;
        }

        public CreateDataServiceApiRequestCreateCommand setScriptDetails(CreateDataServiceApiRequestCreateCommandScriptDetails scriptDetails) {
            this.scriptDetails = scriptDetails;
            return this;
        }
        public CreateDataServiceApiRequestCreateCommandScriptDetails getScriptDetails() {
            return this.scriptDetails;
        }

        public CreateDataServiceApiRequestCreateCommand setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public CreateDataServiceApiRequestCreateCommand setUpdateRate(Integer updateRate) {
            this.updateRate = updateRate;
            return this;
        }
        public Integer getUpdateRate() {
            return this.updateRate;
        }

        public CreateDataServiceApiRequestCreateCommand setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
