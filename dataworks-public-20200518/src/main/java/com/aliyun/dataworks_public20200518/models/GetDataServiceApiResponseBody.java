// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceApiResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetDataServiceApiResponseBodyData data;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataServiceApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiResponseBody self = new GetDataServiceApiResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApiResponseBody setData(GetDataServiceApiResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataServiceApiResponseBodyData getData() {
        return this.data;
    }

    public GetDataServiceApiResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataServiceApiResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataServiceApiResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataServiceApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataServiceApiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes extends TeaModel {
        /**
         * <p>The error code returned.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The solution used to fix the error.</p>
         */
        @NameInMap("ErrorSolution")
        public String errorSolution;

        public static GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes self = new GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes setErrorSolution(String errorSolution) {
            this.errorSolution = errorSolution;
            return this;
        }
        public String getErrorSolution() {
            return this.errorSolution;
        }

    }

    public static class GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters extends TeaModel {
        /**
         * <p>The name of the associated field. This parameter is supported only if the API is generated in wizard mode.</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The default value.</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The sample value.</p>
         */
        @NameInMap("ExampleValue")
        public String exampleValue;

        /**
         * <p>Indicates whether the parameter is required.</p>
         */
        @NameInMap("IsRequiredParameter")
        public Boolean isRequiredParameter;

        /**
         * <p>The data type of the parameter. Valid values: 0, 1, 2, 3, 4, and 5. The value 0 indicates the STRING data type, the value 1 indicates the INT data type, the value 2 indicates the LONG data type, the value 3 indicates the FLOAT data type, the value 4 indicates the DOUBLE data type, and the value 5 indicates the BOOLEAN data type.</p>
         */
        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        /**
         * <p>The description.</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The operator used for the value of the parameter. Valid values:</p>
         * <br>
         * <p>*   0: indicates that the operator is Equal.</p>
         * <p>*   1: indicates that the operator is Like.</p>
         * <p>*   2: indicates that the operator is Const.</p>
         * <p>*   3: indicates that the operator is In.</p>
         * <br>
         * <p>APIs generated in wizard mode support the Equal, Like, and In operators. APIs generated in script mode support the Equal operator. APIs generated by registration support the Equal and Const operators.</p>
         */
        @NameInMap("ParameterOperator")
        public Integer parameterOperator;

        /**
         * <p>The position of the parameter. Valid values:</p>
         * <br>
         * <p>*   0: indicates that the parameter is in the URL path of the request.</p>
         * <p>*   1: indicates that the parameter is in the Query parameter of the request URL.</p>
         * <p>*   2: indicates that the parameter is in the request header.</p>
         * <p>*   3: indicates that the parameter is in the request body.</p>
         * <br>
         * <p>APIs generated in wizard or script mode support only the Query position. APIs generated by registration whose request method is GET or DELETE support the Query and Head positions. APIs generated by registration whose request method is PUT or POST support the Query, Head, and Body positions.</p>
         */
        @NameInMap("ParameterPosition")
        public Integer parameterPosition;

        public static GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters self = new GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

    }

    public static class GetDataServiceApiResponseBodyDataRegistrationDetails extends TeaModel {
        /**
         * <p>The sample error response of the API.</p>
         */
        @NameInMap("FailedResultSample")
        public String failedResultSample;

        /**
         * <p>The error codes returned for the API generated by registration.</p>
         */
        @NameInMap("RegistrationErrorCodes")
        public java.util.List<GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes> registrationErrorCodes;

        /**
         * <p>The request parameters of the API generated by registration.</p>
         */
        @NameInMap("RegistrationRequestParameters")
        public java.util.List<GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters> registrationRequestParameters;

        /**
         * <p>The format in which the response of the API request is returned. Valid values:</p>
         * <br>
         * <p>*   0: indicates the JSON format.</p>
         * <p>*   1: indicates the XML format.</p>
         * <br>
         * <p>APIs generated in wizard or script mode support the JSON format. APIs generated by registration support the JSON and XML formats.</p>
         */
        @NameInMap("ServiceContentType")
        public Integer serviceContentType;

        /**
         * <p>The address of the backend service.</p>
         */
        @NameInMap("ServiceHost")
        public String serviceHost;

        /**
         * <p>The path of the backend service.</p>
         */
        @NameInMap("ServicePath")
        public String servicePath;

        /**
         * <p>The description of the request body initiated to call the backend service.</p>
         */
        @NameInMap("ServiceRequestBodyDescription")
        public String serviceRequestBodyDescription;

        /**
         * <p>Sample success responses</p>
         */
        @NameInMap("SuccessfulResultSample")
        public String successfulResultSample;

        public static GetDataServiceApiResponseBodyDataRegistrationDetails build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseBodyDataRegistrationDetails self = new GetDataServiceApiResponseBodyDataRegistrationDetails();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetails setFailedResultSample(String failedResultSample) {
            this.failedResultSample = failedResultSample;
            return this;
        }
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetails setRegistrationErrorCodes(java.util.List<GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes> registrationErrorCodes) {
            this.registrationErrorCodes = registrationErrorCodes;
            return this;
        }
        public java.util.List<GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes> getRegistrationErrorCodes() {
            return this.registrationErrorCodes;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetails setRegistrationRequestParameters(java.util.List<GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters> registrationRequestParameters) {
            this.registrationRequestParameters = registrationRequestParameters;
            return this;
        }
        public java.util.List<GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters> getRegistrationRequestParameters() {
            return this.registrationRequestParameters;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetails setServiceContentType(Integer serviceContentType) {
            this.serviceContentType = serviceContentType;
            return this;
        }
        public Integer getServiceContentType() {
            return this.serviceContentType;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetails setServiceHost(String serviceHost) {
            this.serviceHost = serviceHost;
            return this;
        }
        public String getServiceHost() {
            return this.serviceHost;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetails setServicePath(String servicePath) {
            this.servicePath = servicePath;
            return this;
        }
        public String getServicePath() {
            return this.servicePath;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetails setServiceRequestBodyDescription(String serviceRequestBodyDescription) {
            this.serviceRequestBodyDescription = serviceRequestBodyDescription;
            return this;
        }
        public String getServiceRequestBodyDescription() {
            return this.serviceRequestBodyDescription;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetails setSuccessfulResultSample(String successfulResultSample) {
            this.successfulResultSample = successfulResultSample;
            return this;
        }
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

    }

    public static class GetDataServiceApiResponseBodyDataScriptDetailsScriptConnection extends TeaModel {
        /**
         * <p>The ID of the data source.</p>
         */
        @NameInMap("ConnectionId")
        public Long connectionId;

        /**
         * <p>The name of the table in the data source.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static GetDataServiceApiResponseBodyDataScriptDetailsScriptConnection build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseBodyDataScriptDetailsScriptConnection self = new GetDataServiceApiResponseBodyDataScriptDetailsScriptConnection();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptConnection setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptConnection setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters extends TeaModel {
        /**
         * <p>The name of the associated field. This parameter is supported only if the API is generated in wizard mode.</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The default value.</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The sample value.</p>
         */
        @NameInMap("ExampleValue")
        public String exampleValue;

        /**
         * <p>Indicates whether the parameter is required.</p>
         */
        @NameInMap("IsRequiredParameter")
        public Boolean isRequiredParameter;

        /**
         * <p>The data type of the parameter. Valid values: 0, 1, 2, 3, 4, and 5. The value 0 indicates the STRING data type, the value 1 indicates the INT data type, the value 2 indicates the LONG data type, the value 3 indicates the FLOAT data type, the value 4 indicates the DOUBLE data type, and the value 5 indicates the BOOLEAN data type.</p>
         */
        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        /**
         * <p>The description.</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The operator used for the value of the parameter. Valid values: 0, 1, 2, and 3. The value 0 indicates that the operator is Equal, the value 1 indicates that the operator is Like, the value 2 indicates that the operator is Const, and the value 3 indicates that the operator is In. APIs generated in wizard mode support the Equal, Like, and In operators. APIs generated in script mode support the Equal operator. APIs generated by registration support the Equal and Const operators.</p>
         */
        @NameInMap("ParameterOperator")
        public Integer parameterOperator;

        /**
         * <p>The position of the parameter. Valid values: 0, 1, 2, and 3. The value 0 indicates that the parameter is in the URL path of the request, the value 1 indicates that the parameter is in the Query parameter of the request URL, the value 2 indicates that the parameter is in the request header, and the value 3 indicates that the parameter is in the request body. APIs generated in wizard or script mode support only the Query position. APIs generated by registration whose request method is GET or DELETE support the Query and Head positions. APIs generated by registration whose request method is PUT or POST support the Query, Head, and Body positions.</p>
         */
        @NameInMap("ParameterPosition")
        public Integer parameterPosition;

        public static GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters self = new GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

    }

    public static class GetDataServiceApiResponseBodyDataScriptDetailsScriptResponseParameters extends TeaModel {
        /**
         * <p>The name of the associated field. This parameter is supported only if the API is generated in wizard mode.</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The sample value.</p>
         */
        @NameInMap("ExampleValue")
        public String exampleValue;

        /**
         * <p>The data type of the parameter. Valid values: 0, 1, 2, 3, 4, and 5. The value 0 indicates the STRING data type, the value 1 indicates the INT data type, the value 2 indicates the LONG data type, the value 3 indicates the FLOAT data type, the value 4 indicates the DOUBLE data type, and the value 5 indicates the BOOLEAN data type.</p>
         */
        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        /**
         * <p>The description.</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        public static GetDataServiceApiResponseBodyDataScriptDetailsScriptResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseBodyDataScriptDetailsScriptResponseParameters self = new GetDataServiceApiResponseBodyDataScriptDetailsScriptResponseParameters();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptResponseParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptResponseParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

    public static class GetDataServiceApiResponseBodyDataScriptDetails extends TeaModel {
        /**
         * <p>Indicates whether the entries were returned by page.</p>
         */
        @NameInMap("IsPagedResponse")
        public Boolean isPagedResponse;

        /**
         * <p>The SQL script.</p>
         */
        @NameInMap("Script")
        public String script;

        /**
         * <p>The data source information of the API generated in script mode.</p>
         */
        @NameInMap("ScriptConnection")
        public GetDataServiceApiResponseBodyDataScriptDetailsScriptConnection scriptConnection;

        /**
         * <p>The request parameters of the API generated in script mode.</p>
         */
        @NameInMap("ScriptRequestParameters")
        public java.util.List<GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters> scriptRequestParameters;

        /**
         * <p>The response parameters of the API generated in script mode.</p>
         */
        @NameInMap("ScriptResponseParameters")
        public java.util.List<GetDataServiceApiResponseBodyDataScriptDetailsScriptResponseParameters> scriptResponseParameters;

        public static GetDataServiceApiResponseBodyDataScriptDetails build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseBodyDataScriptDetails self = new GetDataServiceApiResponseBodyDataScriptDetails();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseBodyDataScriptDetails setIsPagedResponse(Boolean isPagedResponse) {
            this.isPagedResponse = isPagedResponse;
            return this;
        }
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
        }

        public GetDataServiceApiResponseBodyDataScriptDetails setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public GetDataServiceApiResponseBodyDataScriptDetails setScriptConnection(GetDataServiceApiResponseBodyDataScriptDetailsScriptConnection scriptConnection) {
            this.scriptConnection = scriptConnection;
            return this;
        }
        public GetDataServiceApiResponseBodyDataScriptDetailsScriptConnection getScriptConnection() {
            return this.scriptConnection;
        }

        public GetDataServiceApiResponseBodyDataScriptDetails setScriptRequestParameters(java.util.List<GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters> scriptRequestParameters) {
            this.scriptRequestParameters = scriptRequestParameters;
            return this;
        }
        public java.util.List<GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters> getScriptRequestParameters() {
            return this.scriptRequestParameters;
        }

        public GetDataServiceApiResponseBodyDataScriptDetails setScriptResponseParameters(java.util.List<GetDataServiceApiResponseBodyDataScriptDetailsScriptResponseParameters> scriptResponseParameters) {
            this.scriptResponseParameters = scriptResponseParameters;
            return this;
        }
        public java.util.List<GetDataServiceApiResponseBodyDataScriptDetailsScriptResponseParameters> getScriptResponseParameters() {
            return this.scriptResponseParameters;
        }

    }

    public static class GetDataServiceApiResponseBodyDataWizardDetailsWizardConnection extends TeaModel {
        /**
         * <p>The ID of the data source.</p>
         */
        @NameInMap("ConnectionId")
        public Long connectionId;

        /**
         * <p>The name of the table in the data source.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static GetDataServiceApiResponseBodyDataWizardDetailsWizardConnection build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseBodyDataWizardDetailsWizardConnection self = new GetDataServiceApiResponseBodyDataWizardDetailsWizardConnection();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardConnection setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardConnection setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters extends TeaModel {
        /**
         * <p>The name of the associated field. This parameter is supported only if the API is generated in wizard mode.</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The default value.</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The sample value.</p>
         */
        @NameInMap("ExampleValue")
        public String exampleValue;

        /**
         * <p>Indicates whether the parameter is required.</p>
         */
        @NameInMap("IsRequiredParameter")
        public Boolean isRequiredParameter;

        /**
         * <p>The data type of the parameter. Valid values: 0, 1, 2, 3, 4, and 5. The value 0 indicates the STRING data type, the value 1 indicates the INT data type, the value 2 indicates the LONG data type, the value 3 indicates the FLOAT data type, the value 4 indicates the DOUBLE data type, and the value 5 indicates the BOOLEAN data type.</p>
         */
        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        /**
         * <p>The description.</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The operator used for the value of the parameter. Valid values: 0, 1, 2, and 3. The value 0 indicates that the operator is Equal, the value 1 indicates that the operator is Like, the value 2 indicates that the operator is Const, and the value 3 indicates that the operator is In. APIs generated in wizard mode support the Equal, Like, and In operators. APIs generated in script mode support the Equal operator. APIs generated by registration support the Equal and Const operators.</p>
         */
        @NameInMap("ParameterOperator")
        public Integer parameterOperator;

        /**
         * <p>The position of the parameter. Valid values: 0, 1, 2, and 3. The value 0 indicates that the parameter is in the URL path of the request, the value 1 indicates that the parameter is in the Query parameter of the request URL, the value 2 indicates that the parameter is in the request header, and the value 3 indicates that the parameter is in the request body. APIs generated in wizard or script mode support only the Query position. APIs generated by registration whose request method is GET or DELETE support the Query and Head positions. APIs generated by registration whose request method is PUT or POST support the Query, Head, and Body positions.</p>
         */
        @NameInMap("ParameterPosition")
        public Integer parameterPosition;

        public static GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters self = new GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

    }

    public static class GetDataServiceApiResponseBodyDataWizardDetailsWizardResponseParameters extends TeaModel {
        /**
         * <p>The name of the associated field. This parameter is supported only if the API is generated in wizard mode.</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The sample value.</p>
         */
        @NameInMap("ExampleValue")
        public String exampleValue;

        /**
         * <p>The data type of the parameter. Valid values: 0, 1, 2, 3, 4, and 5. The value 0 indicates the STRING data type, the value 1 indicates the INT data type, the value 2 indicates the LONG data type, the value 3 indicates the FLOAT data type, the value 4 indicates the DOUBLE data type, and the value 5 indicates the BOOLEAN data type.</p>
         */
        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        /**
         * <p>The description.</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        public static GetDataServiceApiResponseBodyDataWizardDetailsWizardResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseBodyDataWizardDetailsWizardResponseParameters self = new GetDataServiceApiResponseBodyDataWizardDetailsWizardResponseParameters();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardResponseParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardResponseParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

    public static class GetDataServiceApiResponseBodyDataWizardDetails extends TeaModel {
        /**
         * <p>Indicates whether the entries were returned by page.</p>
         */
        @NameInMap("IsPagedResponse")
        public Boolean isPagedResponse;

        /**
         * <p>The data source information of the API generated in wizard mode.</p>
         */
        @NameInMap("WizardConnection")
        public GetDataServiceApiResponseBodyDataWizardDetailsWizardConnection wizardConnection;

        /**
         * <p>The request parameters of the API generated in wizard mode.</p>
         */
        @NameInMap("WizardRequestParameters")
        public java.util.List<GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters> wizardRequestParameters;

        /**
         * <p>The response parameters of the API generated in wizard mode.</p>
         */
        @NameInMap("WizardResponseParameters")
        public java.util.List<GetDataServiceApiResponseBodyDataWizardDetailsWizardResponseParameters> wizardResponseParameters;

        public static GetDataServiceApiResponseBodyDataWizardDetails build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseBodyDataWizardDetails self = new GetDataServiceApiResponseBodyDataWizardDetails();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseBodyDataWizardDetails setIsPagedResponse(Boolean isPagedResponse) {
            this.isPagedResponse = isPagedResponse;
            return this;
        }
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
        }

        public GetDataServiceApiResponseBodyDataWizardDetails setWizardConnection(GetDataServiceApiResponseBodyDataWizardDetailsWizardConnection wizardConnection) {
            this.wizardConnection = wizardConnection;
            return this;
        }
        public GetDataServiceApiResponseBodyDataWizardDetailsWizardConnection getWizardConnection() {
            return this.wizardConnection;
        }

        public GetDataServiceApiResponseBodyDataWizardDetails setWizardRequestParameters(java.util.List<GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters> wizardRequestParameters) {
            this.wizardRequestParameters = wizardRequestParameters;
            return this;
        }
        public java.util.List<GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters> getWizardRequestParameters() {
            return this.wizardRequestParameters;
        }

        public GetDataServiceApiResponseBodyDataWizardDetails setWizardResponseParameters(java.util.List<GetDataServiceApiResponseBodyDataWizardDetailsWizardResponseParameters> wizardResponseParameters) {
            this.wizardResponseParameters = wizardResponseParameters;
            return this;
        }
        public java.util.List<GetDataServiceApiResponseBodyDataWizardDetailsWizardResponseParameters> getWizardResponseParameters() {
            return this.wizardResponseParameters;
        }

    }

    public static class GetDataServiceApiResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the DataService Studio API.</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        /**
         * <p>The type of the API. Valid values: 0, 1, and 2. The value 0 indicates that the API is generated in wizard mode. The value 1 indicates that the API is generated in script mode. The value 2 indicates that the API is generated by registration.</p>
         */
        @NameInMap("ApiMode")
        public Integer apiMode;

        /**
         * <p>The name of the API.</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The path of the API.</p>
         */
        @NameInMap("ApiPath")
        public String apiPath;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The ID of the Alibaba Cloud account used by the creator of the API.</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the folder.</p>
         */
        @NameInMap("FolderId")
        public Long folderId;

        /**
         * <p>The ID of the group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The time when the API was last modified.</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The ID of the Alibaba Cloud account used by the user who last modified the API.</p>
         */
        @NameInMap("OperatorId")
        public String operatorId;

        /**
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The list of fields.</p>
         */
        @NameInMap("Protocols")
        public java.util.List<Integer> protocols;

        /**
         * <p>The details of the API generated by registration. This parameter is returned only if the API is generated by registration.</p>
         */
        @NameInMap("RegistrationDetails")
        public GetDataServiceApiResponseBodyDataRegistrationDetails registrationDetails;

        /**
         * <p>The request method of the API. Valid values: 0, 1, 2, and 3. The value 0 indicates the GET method, the value 1 indicates the POST method, the value 2 indicates the PUT method, and the value 3 indicates the DELETE method. APIs generated in wizard or script mode support the GET and POST methods. APIs generated by registration support the GET, POST, PUT, and DELETE methods.</p>
         */
        @NameInMap("RequestMethod")
        public Integer requestMethod;

        /**
         * <p>The format in which the response of the API request is returned. Valid values: 0 and 1. The value 0 indicates the JSON format. The value 1 indicates the XML format. APIs generated in wizard or script mode support the JSON format. APIs generated by registration support the JSON and XML formats.</p>
         */
        @NameInMap("ResponseContentType")
        public Integer responseContentType;

        /**
         * <p>The details of the API generated in script mode. This parameter is returned only if the API is generated in script mode.</p>
         */
        @NameInMap("ScriptDetails")
        public GetDataServiceApiResponseBodyDataScriptDetails scriptDetails;

        /**
         * <p>The status of the API. Valid values: 0 and 1. The value 0 indicates that the API is not published. The value 1 indicates that the API is published.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>The timeout period of the API request. Unit: milliseconds.</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The scope in which the API is visible. Valid values: 0 and 1. The value 0 indicates that the API is visible to the members in a specific workspace. The value 1 indicates that the API is visible only to the API creator.</p>
         */
        @NameInMap("VisibleRange")
        public Integer visibleRange;

        /**
         * <p>The details of the API generated in wizard mode. This parameter is returned only if the API is generated in wizard mode.</p>
         */
        @NameInMap("WizardDetails")
        public GetDataServiceApiResponseBodyDataWizardDetails wizardDetails;

        public static GetDataServiceApiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseBodyData self = new GetDataServiceApiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseBodyData setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public GetDataServiceApiResponseBodyData setApiMode(Integer apiMode) {
            this.apiMode = apiMode;
            return this;
        }
        public Integer getApiMode() {
            return this.apiMode;
        }

        public GetDataServiceApiResponseBodyData setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetDataServiceApiResponseBodyData setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

        public GetDataServiceApiResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetDataServiceApiResponseBodyData setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetDataServiceApiResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataServiceApiResponseBodyData setFolderId(Long folderId) {
            this.folderId = folderId;
            return this;
        }
        public Long getFolderId() {
            return this.folderId;
        }

        public GetDataServiceApiResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetDataServiceApiResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetDataServiceApiResponseBodyData setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public GetDataServiceApiResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataServiceApiResponseBodyData setProtocols(java.util.List<Integer> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<Integer> getProtocols() {
            return this.protocols;
        }

        public GetDataServiceApiResponseBodyData setRegistrationDetails(GetDataServiceApiResponseBodyDataRegistrationDetails registrationDetails) {
            this.registrationDetails = registrationDetails;
            return this;
        }
        public GetDataServiceApiResponseBodyDataRegistrationDetails getRegistrationDetails() {
            return this.registrationDetails;
        }

        public GetDataServiceApiResponseBodyData setRequestMethod(Integer requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }
        public Integer getRequestMethod() {
            return this.requestMethod;
        }

        public GetDataServiceApiResponseBodyData setResponseContentType(Integer responseContentType) {
            this.responseContentType = responseContentType;
            return this;
        }
        public Integer getResponseContentType() {
            return this.responseContentType;
        }

        public GetDataServiceApiResponseBodyData setScriptDetails(GetDataServiceApiResponseBodyDataScriptDetails scriptDetails) {
            this.scriptDetails = scriptDetails;
            return this;
        }
        public GetDataServiceApiResponseBodyDataScriptDetails getScriptDetails() {
            return this.scriptDetails;
        }

        public GetDataServiceApiResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetDataServiceApiResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetDataServiceApiResponseBodyData setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public GetDataServiceApiResponseBodyData setVisibleRange(Integer visibleRange) {
            this.visibleRange = visibleRange;
            return this;
        }
        public Integer getVisibleRange() {
            return this.visibleRange;
        }

        public GetDataServiceApiResponseBodyData setWizardDetails(GetDataServiceApiResponseBodyDataWizardDetails wizardDetails) {
            this.wizardDetails = wizardDetails;
            return this;
        }
        public GetDataServiceApiResponseBodyDataWizardDetails getWizardDetails() {
            return this.wizardDetails;
        }

    }

}
