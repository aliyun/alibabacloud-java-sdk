// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateDataServiceApiRequest extends TeaModel {
    /**
     * <p>The request for creating an API.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateDataServiceApiRequestCreateCommand createCommand;

    /**
     * <p>The tenant ID.</p>
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

    public static class CreateDataServiceApiRequestCreateCommandDmlConfig extends TeaModel {
        /**
         * <p>The data volume per batch. Valid values:</p>
         * <ul>
         * <li>When the data volume type is single record, this parameter cannot be set.</li>
         * <li>When the data volume type is batch:<ul>
         * <li>If the transaction processing mode is 1, this parameter cannot be set.</li>
         * <li>If the transaction processing mode is 2, the value ranges from 1 to 1000000.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("BatchInputDataSize")
        public Integer batchInputDataSize;

        /**
         * <p>The data volume type. Valid values:</p>
         * <ul>
         * <li>1: single record</li>
         * <li>2: batch.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DataVolumeType")
        public Integer dataVolumeType;

        /**
         * <p>The error handling method. Valid values:</p>
         * <ul>
         * <li>1: partial success allowed</li>
         * <li>2: all must succeed</li>
         * </ul>
         * <p>Parameter rules:</p>
         * <ul>
         * <li>When the data volume type is single record, this parameter cannot be set.</li>
         * <li>When the data volume type is batch, the value is 1 or 2.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ErrorHandlingType")
        public Integer errorHandlingType;

        /**
         * <p>The maximum number of input records. Valid values:</p>
         * <ul>
         * <li>When the data volume type is single record, this parameter cannot be set.</li>
         * <li>When the data volume type is batch, the value ranges from 1 to 1000000.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("MaxInputDataSize")
        public Integer maxInputDataSize;

        /**
         * <p>The degree of parallelism. Valid values:</p>
         * <ul>
         * <li>When the data volume type is single record, this parameter cannot be set.</li>
         * <li>When the data volume type is batch:<ul>
         * <li>If the transaction processing mode is 1, this parameter cannot be set.</li>
         * <li>If the transaction processing mode is 2, the value ranges from 1 to 5.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParallelNum")
        public Integer parallelNum;

        /**
         * <p>The transaction processing mode. Valid values:</p>
         * <ul>
         * <li>0: no transaction</li>
         * <li>1: no batching</li>
         * <li>2: batch processing</li>
         * </ul>
         * <p>Parameter rules:</p>
         * <ul>
         * <li>When the data volume type is single record, the transaction processing mode is 0.</li>
         * <li>When the data volume type is batch:<ul>
         * <li>If the error handling method is 1, the transaction processing mode is 1 or 2.</li>
         * <li>If the error handling method is 2, the transaction processing mode can only be 1.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TransactionType")
        public Integer transactionType;

        public static CreateDataServiceApiRequestCreateCommandDmlConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDataServiceApiRequestCreateCommandDmlConfig self = new CreateDataServiceApiRequestCreateCommandDmlConfig();
            return TeaModel.build(map, self);
        }

        public CreateDataServiceApiRequestCreateCommandDmlConfig setBatchInputDataSize(Integer batchInputDataSize) {
            this.batchInputDataSize = batchInputDataSize;
            return this;
        }
        public Integer getBatchInputDataSize() {
            return this.batchInputDataSize;
        }

        public CreateDataServiceApiRequestCreateCommandDmlConfig setDataVolumeType(Integer dataVolumeType) {
            this.dataVolumeType = dataVolumeType;
            return this;
        }
        public Integer getDataVolumeType() {
            return this.dataVolumeType;
        }

        public CreateDataServiceApiRequestCreateCommandDmlConfig setErrorHandlingType(Integer errorHandlingType) {
            this.errorHandlingType = errorHandlingType;
            return this;
        }
        public Integer getErrorHandlingType() {
            return this.errorHandlingType;
        }

        public CreateDataServiceApiRequestCreateCommandDmlConfig setMaxInputDataSize(Integer maxInputDataSize) {
            this.maxInputDataSize = maxInputDataSize;
            return this;
        }
        public Integer getMaxInputDataSize() {
            return this.maxInputDataSize;
        }

        public CreateDataServiceApiRequestCreateCommandDmlConfig setParallelNum(Integer parallelNum) {
            this.parallelNum = parallelNum;
            return this;
        }
        public Integer getParallelNum() {
            return this.parallelNum;
        }

        public CreateDataServiceApiRequestCreateCommandDmlConfig setTransactionType(Integer transactionType) {
            this.transactionType = transactionType;
            return this;
        }
        public Integer getTransactionType() {
            return this.transactionType;
        }

    }

    public static class CreateDataServiceApiRequestCreateCommandScriptDetailsScriptRequestParameters extends TeaModel {
        /**
         * <p>The default value of the input parameter for operation-type APIs. This parameter takes effect when the parameter is not required. If not specified, the value is null.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The example value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ExampleValue")
        public String exampleValue;

        /**
         * <p>Specifies whether the parameter is required.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsRequiredParameter")
        public Boolean isRequiredParameter;

        /**
         * <p>The data type. Valid values:</p>
         * <ul>
         * <li>&quot;STRING&quot;</li>
         * <li>&quot;DOUBLE&quot;</li>
         * <li>&quot;INT&quot;</li>
         * <li>&quot;DATE&quot;</li>
         * <li>&quot;LONG&quot;</li>
         * <li>&quot;FLOAT&quot;</li>
         * <li>&quot;BOOLEAN&quot;</li>
         * <li>&quot;SHORT&quot;</li>
         * <li>&quot;BYTE&quot;</li>
         * <li>&quot;BIGDECIMAL&quot;</li>
         * <li>&quot;BINARY&quot;</li>
         * <li>&quot;ARRAY&quot;</li>
         * <li>&quot;Array(int)&quot;</li>
         * <li>&quot;Array(string)&quot;.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("ParameterDataType")
        public String parameterDataType;

        /**
         * <p>The parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>字段d</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The parameter name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The value type of the parameter. Valid values:</p>
         * <ul>
         * <li>1 (single value): A fixed value used for operators such as =, &gt;=, &lt;=, &gt;, &lt;, !=, and between. </li>
         * <li>2 (multiple values): The input parameter contains multiple values separated by commas (,). Used for In and Not In operators.</li>
         * </ul>
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

        public CreateDataServiceApiRequestCreateCommandScriptDetailsScriptRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
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
         * <p>The example value.</p>
         * 
         * <strong>example:</strong>
         * <p>amazing</p>
         */
        @NameInMap("ExampleValue")
        public String exampleValue;

        /**
         * <p>The data type. Valid values:</p>
         * <ul>
         * <li>&quot;STRING&quot;</li>
         * <li>&quot;DOUBLE&quot;</li>
         * <li>&quot;INT&quot;</li>
         * <li>&quot;DATE&quot;</li>
         * <li>&quot;LONG&quot;</li>
         * <li>&quot;FLOAT&quot;</li>
         * <li>&quot;BOOLEAN&quot;</li>
         * <li>&quot;SHORT&quot;</li>
         * <li>&quot;BYTE&quot;</li>
         * <li>&quot;BIGDECIMAL&quot;</li>
         * <li>&quot;BINARY&quot;</li>
         * <li>&quot;ARRAY&quot;</li>
         * <li>&quot;Array(int)&quot;</li>
         * <li>&quot;Array(string)&quot;.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("ParameterDataType")
        public String parameterDataType;

        /**
         * <p>The parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>字段a</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The location of the response parameter for operation-type APIs. This parameter must be set when the API is an operation-type API with batch data volume. Valid values:</p>
         * <ul>
         * <li>success: the response data of a successful operation</li>
         * <li>failed: the response data of a failed operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("ParameterLocation")
        public String parameterLocation;

        /**
         * <p>The parameter name.</p>
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

        public CreateDataServiceApiRequestCreateCommandScriptDetailsScriptResponseParameters setParameterLocation(String parameterLocation) {
            this.parameterLocation = parameterLocation;
            return this;
        }
        public String getParameterLocation() {
            return this.parameterLocation;
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
         * <p>The ID of the datasource. This parameter is required when the API mode is direct datasource connection.</p>
         * 
         * <strong>example:</strong>
         * <p>6668888888888812345L</p>
         */
        @NameInMap("DatasourceID")
        public Long datasourceID;

        /**
         * <p>The data type on which the API is based. Valid values:</p>
         * <ul>
         * <li>1: datasource.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DatasourceType")
        public Integer datasourceType;

        /**
         * <p>Specifies whether to paginate the results. This parameter is required only when RequestType is set to List. Default value: false. Pagination is not supported in asynchronous call mode.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsPaginated")
        public Boolean isPaginated;

        /**
         * <p>The SQL script.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>select a,b,c from table1 where d = ${d}</p>
         */
        @NameInMap("Script")
        public String script;

        /**
         * <p>The list of request parameters for the script API.</p>
         */
        @NameInMap("ScriptRequestParameters")
        public java.util.List<CreateDataServiceApiRequestCreateCommandScriptDetailsScriptRequestParameters> scriptRequestParameters;

        /**
         * <p>The list of response parameters for the script API.</p>
         */
        @NameInMap("ScriptResponseParameters")
        public java.util.List<CreateDataServiceApiRequestCreateCommandScriptDetailsScriptResponseParameters> scriptResponseParameters;

        /**
         * <p>The sorting priority. This parameter takes effect only when the SQL mode is basic mode. Default value: 2. Valid values:</p>
         * <ul>
         * <li>1: SQL script </li>
         * <li>2: OrderByList request parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SortPriority")
        public Integer sortPriority;

        /**
         * <p>The SQL mode. Valid values:</p>
         * <ul>
         * <li>1: basic mode</li>
         * <li>2: advanced mode.</li>
         * </ul>
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
         * <p>The group ID of the API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("ApiGroupId")
        public Long apiGroupId;

        /**
         * <p>The group name of the API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>默认API分组</p>
         */
        @NameInMap("ApiGroupName")
        public String apiGroupName;

        /**
         * <p>The name of the API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>API_01</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The type of the API. Valid values:</p>
         * <ul>
         * <li>3: datasource SQL mode.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ApiType")
        public Integer apiType;

        /**
         * <p>The protocol. Different gateway types support different protocols. For more information, see the documentation. Valid values:</p>
         * <ul>
         * <li>0: HTTP </li>
         * <li>1: HTTPS.</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        @NameInMap("BizProtocol")
        public java.util.List<Integer> bizProtocol;

        /**
         * <p>The cache timeout period, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("CacheTimeout")
        public Integer cacheTimeout;

        /**
         * <p>The call mode of the API. Default value: 1. Valid values:</p>
         * <ul>
         * <li>1: synchronous call</li>
         * <li>2: asynchronous call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallMode")
        public Integer callMode;

        /**
         * <p>The custom update frequency. This parameter is required when the update frequency is set to custom.</p>
         * 
         * <strong>example:</strong>
         * <p>每天8点</p>
         */
        @NameInMap("CustomUpdateRate")
        public String customUpdateRate;

        /**
         * <p>The description of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The configuration of the operation-type API. This parameter is not required when creating a query-type API.</p>
         */
        @NameInMap("DmlConfig")
        public CreateDataServiceApiRequestCreateCommandDmlConfig dmlConfig;

        /**
         * <p>The execution timeout period for asynchronous API calls. This parameter takes effect only for asynchronous API calls and is required when the call mode is asynchronous.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ExecutionTimeout")
        public Integer executionTimeout;

        /**
         * <p>The development mode of the API. Valid values:</p>
         * <ul>
         * <li>0: Basic mode </li>
         * <li>1: Dev-Prod mode.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Mode")
        public Integer mode;

        /**
         * <p>The ID of the data service project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The request method of the API. Valid values:</p>
         * <ul>
         * <li>0 (GET): Returns a single record. The query result is unique. </li>
         * <li>1 (LIST): Returns multiple records.</li>
         * <li>2 (CREATE): Creates objects. Supports single or batch creation.</li>
         * <li>3 (UPDATE): Updates objects. Supports single or batch updates.</li>
         * <li>4 (DELETE): Deletes objects. Supports single or batch deletions.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RequestType")
        public Integer requestType;

        /**
         * <p>Specifies whether to return the SQL in the result.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ReturnSqlSwitch")
        public Boolean returnSqlSwitch;

        /**
         * <p>The list of row-level permission IDs.</p>
         */
        @NameInMap("RowPermissionIds")
        public java.util.List<Long> rowPermissionIds;

        /**
         * <p>The details of the script API.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ScriptDetails")
        public CreateDataServiceApiRequestCreateCommandScriptDetails scriptDetails;

        /**
         * <p>The timeout period, in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The update frequency. Default value: 1. Valid values:</p>
         * <ul>
         * <li>0: custom</li>
         * <li>1: day</li>
         * <li>2: hour</li>
         * <li>3: minute.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UpdateRate")
        public Integer updateRate;

        /**
         * <p>The version of the API.</p>
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

        public CreateDataServiceApiRequestCreateCommand setDmlConfig(CreateDataServiceApiRequestCreateCommandDmlConfig dmlConfig) {
            this.dmlConfig = dmlConfig;
            return this;
        }
        public CreateDataServiceApiRequestCreateCommandDmlConfig getDmlConfig() {
            return this.dmlConfig;
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

        public CreateDataServiceApiRequestCreateCommand setReturnSqlSwitch(Boolean returnSqlSwitch) {
            this.returnSqlSwitch = returnSqlSwitch;
            return this;
        }
        public Boolean getReturnSqlSwitch() {
            return this.returnSqlSwitch;
        }

        public CreateDataServiceApiRequestCreateCommand setRowPermissionIds(java.util.List<Long> rowPermissionIds) {
            this.rowPermissionIds = rowPermissionIds;
            return this;
        }
        public java.util.List<Long> getRowPermissionIds() {
            return this.rowPermissionIds;
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
