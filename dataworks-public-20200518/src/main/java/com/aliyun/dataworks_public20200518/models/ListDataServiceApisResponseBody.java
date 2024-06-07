// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApisResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ListDataServiceApisResponseBodyData data;

    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataServiceApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApisResponseBody self = new ListDataServiceApisResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApisResponseBody setData(ListDataServiceApisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataServiceApisResponseBodyData getData() {
        return this.data;
    }

    public ListDataServiceApisResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataServiceApisResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataServiceApisResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataServiceApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServiceApisResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes extends TeaModel {
        /**
         * <p>The error code.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The solution used to fix the error.</p>
         */
        @NameInMap("ErrorSolution")
        public String errorSolution;

        public static ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes self = new ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes setErrorSolution(String errorSolution) {
            this.errorSolution = errorSolution;
            return this;
        }
        public String getErrorSolution() {
            return this.errorSolution;
        }

    }

    public static class ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters extends TeaModel {
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
         * <p>The data type of the parameter. Valid values:</p>
         * <br>
         * <p>*   0: String</p>
         * <p>*   1: Int</p>
         * <p>*   2: Long</p>
         * <p>*   3: Float</p>
         * <p>*   4: Double</p>
         * <p>*   5: Boolean</p>
         * <p>*   6: StringList</p>
         * <p>*   7: IntList</p>
         * <p>*   8: LongList</p>
         * <p>*   9: FloatList</p>
         * <p>*   10: DoubleList</p>
         * <p>*   11: BooleanList</p>
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
         * <p>The operator used for the value of the parameter. Valid values: 0, 1, 2, and 3. The value 0 indicates the Equal operator. The value 1 indicates the Like operator. The value 2 indicates the Const operator. The value 3 indicates the In operator. APIs generated in wizard mode support the Equal, Like, and In operators. APIs generated in script mode support the Equal operator. APIs generated by registration support the Equal and Const operators.</p>
         */
        @NameInMap("ParameterOperator")
        public Integer parameterOperator;

        /**
         * <p>The position of the parameter. Valid values: 0, 1, 2, and 3. The value 0 indicates that the parameter is in the URL path of the request. The value 1 indicates that the parameter is in the Query parameter of the request URL. The value 2 indicates that the parameter is in the request header. The value 3 indicates that the parameter is in the request body. APIs generated in wizard or script mode support only the Query position. APIs generated by registration whose request method is GET or DELETE support the Query and Head positions. APIs generated by registration whose request method is PUT or POST support the Query, Head, and Body positions.</p>
         */
        @NameInMap("ParameterPosition")
        public Integer parameterPosition;

        public static ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters self = new ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

    }

    public static class ListDataServiceApisResponseBodyDataApisRegistrationDetails extends TeaModel {
        /**
         * <p>The sample error response of the API.</p>
         */
        @NameInMap("FailedResultSample")
        public String failedResultSample;

        /**
         * <p>The error codes returned for the API generated by registration.</p>
         */
        @NameInMap("RegistrationErrorCodes")
        public java.util.List<ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes> registrationErrorCodes;

        /**
         * <p>The request parameters of the API generated by registration.</p>
         */
        @NameInMap("RegistrationRequestParameters")
        public java.util.List<ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters> registrationRequestParameters;

        /**
         * <p>The format in which the response of the API request is returned. Valid values: 0 and 1. The value 0 indicates the JSON format. The value 1 indicates the XML format. APIs generated in wizard or script mode support the JSON format. APIs generated by registration support the JSON and XML formats.</p>
         */
        @NameInMap("ServiceContentType")
        public Integer serviceContentType;

        /**
         * <p>The URL of the backend service.</p>
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
         * <p>The sample success response of the API.</p>
         */
        @NameInMap("SuccessfulResultSample")
        public String successfulResultSample;

        public static ListDataServiceApisResponseBodyDataApisRegistrationDetails build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseBodyDataApisRegistrationDetails self = new ListDataServiceApisResponseBodyDataApisRegistrationDetails();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetails setFailedResultSample(String failedResultSample) {
            this.failedResultSample = failedResultSample;
            return this;
        }
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetails setRegistrationErrorCodes(java.util.List<ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes> registrationErrorCodes) {
            this.registrationErrorCodes = registrationErrorCodes;
            return this;
        }
        public java.util.List<ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes> getRegistrationErrorCodes() {
            return this.registrationErrorCodes;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetails setRegistrationRequestParameters(java.util.List<ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters> registrationRequestParameters) {
            this.registrationRequestParameters = registrationRequestParameters;
            return this;
        }
        public java.util.List<ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters> getRegistrationRequestParameters() {
            return this.registrationRequestParameters;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetails setServiceContentType(Integer serviceContentType) {
            this.serviceContentType = serviceContentType;
            return this;
        }
        public Integer getServiceContentType() {
            return this.serviceContentType;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetails setServiceHost(String serviceHost) {
            this.serviceHost = serviceHost;
            return this;
        }
        public String getServiceHost() {
            return this.serviceHost;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetails setServicePath(String servicePath) {
            this.servicePath = servicePath;
            return this;
        }
        public String getServicePath() {
            return this.servicePath;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetails setServiceRequestBodyDescription(String serviceRequestBodyDescription) {
            this.serviceRequestBodyDescription = serviceRequestBodyDescription;
            return this;
        }
        public String getServiceRequestBodyDescription() {
            return this.serviceRequestBodyDescription;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetails setSuccessfulResultSample(String successfulResultSample) {
            this.successfulResultSample = successfulResultSample;
            return this;
        }
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

    }

    public static class ListDataServiceApisResponseBodyDataApisScriptDetailsScriptConnection extends TeaModel {
        /**
         * <p>The data source ID.</p>
         */
        @NameInMap("ConnectionId")
        public Long connectionId;

        /**
         * <p>The name of the table in the data source.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static ListDataServiceApisResponseBodyDataApisScriptDetailsScriptConnection build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseBodyDataApisScriptDetailsScriptConnection self = new ListDataServiceApisResponseBodyDataApisScriptDetailsScriptConnection();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptConnection setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptConnection setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters extends TeaModel {
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
         * <p>The data type of the parameter. Valid values:</p>
         * <br>
         * <p>*   0: String</p>
         * <p>*   1: Int</p>
         * <p>*   2: Long</p>
         * <p>*   3: Float</p>
         * <p>*   4: Double</p>
         * <p>*   5: Boolean</p>
         * <p>*   6: StringList</p>
         * <p>*   7: IntList</p>
         * <p>*   8: LongList</p>
         * <p>*   9: FloatList</p>
         * <p>*   10: DoubleList</p>
         * <p>*   11: BooleanList</p>
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
         * <p>*   0: Equal</p>
         * <p>*   1: Like</p>
         * <p>*   2: Const</p>
         * <p>*   3: In</p>
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

        public static ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters self = new ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

    }

    public static class ListDataServiceApisResponseBodyDataApisScriptDetailsScriptResponseParameters extends TeaModel {
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
         * <p>The data type of the parameter. Valid values:</p>
         * <br>
         * <p>*   0: String</p>
         * <p>*   1: Int</p>
         * <p>*   2: Long</p>
         * <p>*   3: Float</p>
         * <p>*   4: Double</p>
         * <p>*   5: Boolean</p>
         * <p>*   6: StringList</p>
         * <p>*   7: IntList</p>
         * <p>*   8: LongList</p>
         * <p>*   9: FloatList</p>
         * <p>*   10: DoubleList</p>
         * <p>*   11: BooleanList</p>
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

        public static ListDataServiceApisResponseBodyDataApisScriptDetailsScriptResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseBodyDataApisScriptDetailsScriptResponseParameters self = new ListDataServiceApisResponseBodyDataApisScriptDetailsScriptResponseParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptResponseParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptResponseParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

    public static class ListDataServiceApisResponseBodyDataApisScriptDetails extends TeaModel {
        /**
         * <p>Indicates whether the entries are returned by page.</p>
         */
        @NameInMap("IsPagedResponse")
        public Boolean isPagedResponse;

        /**
         * <p>The SQL script.</p>
         */
        @NameInMap("Script")
        public String script;

        /**
         * <p>The data source information about the API generated in script mode.</p>
         */
        @NameInMap("ScriptConnection")
        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptConnection scriptConnection;

        /**
         * <p>The request parameters of the API generated in script mode.</p>
         */
        @NameInMap("ScriptRequestParameters")
        public java.util.List<ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters> scriptRequestParameters;

        /**
         * <p>The response parameters of the API generated in script mode.</p>
         */
        @NameInMap("ScriptResponseParameters")
        public java.util.List<ListDataServiceApisResponseBodyDataApisScriptDetailsScriptResponseParameters> scriptResponseParameters;

        public static ListDataServiceApisResponseBodyDataApisScriptDetails build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseBodyDataApisScriptDetails self = new ListDataServiceApisResponseBodyDataApisScriptDetails();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetails setIsPagedResponse(Boolean isPagedResponse) {
            this.isPagedResponse = isPagedResponse;
            return this;
        }
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetails setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetails setScriptConnection(ListDataServiceApisResponseBodyDataApisScriptDetailsScriptConnection scriptConnection) {
            this.scriptConnection = scriptConnection;
            return this;
        }
        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptConnection getScriptConnection() {
            return this.scriptConnection;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetails setScriptRequestParameters(java.util.List<ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters> scriptRequestParameters) {
            this.scriptRequestParameters = scriptRequestParameters;
            return this;
        }
        public java.util.List<ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters> getScriptRequestParameters() {
            return this.scriptRequestParameters;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetails setScriptResponseParameters(java.util.List<ListDataServiceApisResponseBodyDataApisScriptDetailsScriptResponseParameters> scriptResponseParameters) {
            this.scriptResponseParameters = scriptResponseParameters;
            return this;
        }
        public java.util.List<ListDataServiceApisResponseBodyDataApisScriptDetailsScriptResponseParameters> getScriptResponseParameters() {
            return this.scriptResponseParameters;
        }

    }

    public static class ListDataServiceApisResponseBodyDataApisWizardDetailsWizardConnection extends TeaModel {
        /**
         * <p>The data source ID.</p>
         */
        @NameInMap("ConnectionId")
        public Long connectionId;

        /**
         * <p>The name of the table in the data source.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static ListDataServiceApisResponseBodyDataApisWizardDetailsWizardConnection build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseBodyDataApisWizardDetailsWizardConnection self = new ListDataServiceApisResponseBodyDataApisWizardDetailsWizardConnection();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardConnection setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardConnection setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters extends TeaModel {
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
         * <p>The data type of the parameter. Valid values:</p>
         * <br>
         * <p>*   0: String</p>
         * <p>*   1: Int</p>
         * <p>*   2: Long</p>
         * <p>*   3: Float</p>
         * <p>*   4: Double</p>
         * <p>*   5: Boolean</p>
         * <p>*   6: StringList</p>
         * <p>*   7: IntList</p>
         * <p>*   8: LongList</p>
         * <p>*   9: FloatList</p>
         * <p>*   10: DoubleList</p>
         * <p>*   11: BooleanList</p>
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
         * <p>The operator used for the value of the parameter. Valid values: 0, 1, 2, and 3. The value 0 indicates the Equal operator. The value 1 indicates the Like operator. The value 2 indicates the Const operator. The value 3 indicates the In operator. APIs generated in wizard mode support the Equal, Like, and In operators. APIs generated in script mode support the Equal operator. APIs generated by registration support the Equal and Const operators.</p>
         */
        @NameInMap("ParameterOperator")
        public Integer parameterOperator;

        /**
         * <p>The position of the parameter. Valid values: 0, 1, 2, and 3. The value 0 indicates that the parameter is in the URL path of the request. The value 1 indicates that the parameter is in the Query parameter of the request URL. The value 2 indicates that the parameter is in the request header. The value 3 indicates that the parameter is in the request body. APIs generated in wizard or script mode support only the Query position. APIs generated by registration whose request method is GET or DELETE support the Query and Head positions. APIs generated by registration whose request method is PUT or POST support the Query, Head, and Body positions.</p>
         */
        @NameInMap("ParameterPosition")
        public Integer parameterPosition;

        public static ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters self = new ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

    }

    public static class ListDataServiceApisResponseBodyDataApisWizardDetailsWizardResponseParameters extends TeaModel {
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
         * <p>The data type of the parameter. Valid values:</p>
         * <br>
         * <p>*   0: String</p>
         * <p>*   1: Int</p>
         * <p>*   2: Long</p>
         * <p>*   3: Float</p>
         * <p>*   4: Double</p>
         * <p>*   5: Boolean</p>
         * <p>*   6: StringList</p>
         * <p>*   7: IntList</p>
         * <p>*   8: LongList</p>
         * <p>*   9: FloatList</p>
         * <p>*   10: DoubleList</p>
         * <p>*   11: BooleanList</p>
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

        public static ListDataServiceApisResponseBodyDataApisWizardDetailsWizardResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseBodyDataApisWizardDetailsWizardResponseParameters self = new ListDataServiceApisResponseBodyDataApisWizardDetailsWizardResponseParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardResponseParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardResponseParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

    public static class ListDataServiceApisResponseBodyDataApisWizardDetails extends TeaModel {
        /**
         * <p>Indicates whether the entries are returned by page.</p>
         */
        @NameInMap("IsPagedResponse")
        public Boolean isPagedResponse;

        /**
         * <p>The data source information about the API generated in wizard mode.</p>
         */
        @NameInMap("WizardConnection")
        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardConnection wizardConnection;

        /**
         * <p>The request parameters of the API generated in wizard mode.</p>
         */
        @NameInMap("WizardRequestParameters")
        public java.util.List<ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters> wizardRequestParameters;

        /**
         * <p>The response parameters of the API generated in wizard mode.</p>
         */
        @NameInMap("WizardResponseParameters")
        public java.util.List<ListDataServiceApisResponseBodyDataApisWizardDetailsWizardResponseParameters> wizardResponseParameters;

        public static ListDataServiceApisResponseBodyDataApisWizardDetails build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseBodyDataApisWizardDetails self = new ListDataServiceApisResponseBodyDataApisWizardDetails();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetails setIsPagedResponse(Boolean isPagedResponse) {
            this.isPagedResponse = isPagedResponse;
            return this;
        }
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetails setWizardConnection(ListDataServiceApisResponseBodyDataApisWizardDetailsWizardConnection wizardConnection) {
            this.wizardConnection = wizardConnection;
            return this;
        }
        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardConnection getWizardConnection() {
            return this.wizardConnection;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetails setWizardRequestParameters(java.util.List<ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters> wizardRequestParameters) {
            this.wizardRequestParameters = wizardRequestParameters;
            return this;
        }
        public java.util.List<ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters> getWizardRequestParameters() {
            return this.wizardRequestParameters;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetails setWizardResponseParameters(java.util.List<ListDataServiceApisResponseBodyDataApisWizardDetailsWizardResponseParameters> wizardResponseParameters) {
            this.wizardResponseParameters = wizardResponseParameters;
            return this;
        }
        public java.util.List<ListDataServiceApisResponseBodyDataApisWizardDetailsWizardResponseParameters> getWizardResponseParameters() {
            return this.wizardResponseParameters;
        }

    }

    public static class ListDataServiceApisResponseBodyDataApis extends TeaModel {
        /**
         * <p>The API ID.</p>
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
         * <p>The time when the API was created.</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The ID of the Alibaba Cloud account used by the creator of the API.</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The description of the API.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The folder ID.</p>
         */
        @NameInMap("FolderId")
        public Long folderId;

        /**
         * <p>The group ID.</p>
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
         * <p>The workspace ID.</p>
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
        public ListDataServiceApisResponseBodyDataApisRegistrationDetails registrationDetails;

        /**
         * <p>The request method of the API. Valid values: 0, 1, 2, and 3. The value 0 indicates the GET method. The value 1 indicates the POST method. The value 2 indicates the PUT method. The value 3 indicates the DELETE method. APIs generated in wizard or script mode support the GET and POST methods. APIs generated by registration support the GET, POST, PUT, and DELETE methods.</p>
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
        public ListDataServiceApisResponseBodyDataApisScriptDetails scriptDetails;

        /**
         * <p>The status of the API. Valid values: 0 and 1. The value 0 indicates that the API is not published. The value 1 indicates that the API is published.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The tenant ID.</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>The timeout period of the API request. Unit: milliseconds.</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The scope in which the API is visible. Valid values: 0 and 1. The value 0 indicates that the API is visible within the workspace. The value 1 indicates that the API is visible only to its owner.</p>
         */
        @NameInMap("VisibleRange")
        public Integer visibleRange;

        /**
         * <p>The details of the API generated in wizard mode. This parameter is returned only if the API is generated in wizard mode.</p>
         */
        @NameInMap("WizardDetails")
        public ListDataServiceApisResponseBodyDataApisWizardDetails wizardDetails;

        public static ListDataServiceApisResponseBodyDataApis build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseBodyDataApis self = new ListDataServiceApisResponseBodyDataApis();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseBodyDataApis setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListDataServiceApisResponseBodyDataApis setApiMode(Integer apiMode) {
            this.apiMode = apiMode;
            return this;
        }
        public Integer getApiMode() {
            return this.apiMode;
        }

        public ListDataServiceApisResponseBodyDataApis setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListDataServiceApisResponseBodyDataApis setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

        public ListDataServiceApisResponseBodyDataApis setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDataServiceApisResponseBodyDataApis setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDataServiceApisResponseBodyDataApis setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataServiceApisResponseBodyDataApis setFolderId(Long folderId) {
            this.folderId = folderId;
            return this;
        }
        public Long getFolderId() {
            return this.folderId;
        }

        public ListDataServiceApisResponseBodyDataApis setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListDataServiceApisResponseBodyDataApis setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListDataServiceApisResponseBodyDataApis setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public ListDataServiceApisResponseBodyDataApis setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataServiceApisResponseBodyDataApis setProtocols(java.util.List<Integer> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<Integer> getProtocols() {
            return this.protocols;
        }

        public ListDataServiceApisResponseBodyDataApis setRegistrationDetails(ListDataServiceApisResponseBodyDataApisRegistrationDetails registrationDetails) {
            this.registrationDetails = registrationDetails;
            return this;
        }
        public ListDataServiceApisResponseBodyDataApisRegistrationDetails getRegistrationDetails() {
            return this.registrationDetails;
        }

        public ListDataServiceApisResponseBodyDataApis setRequestMethod(Integer requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }
        public Integer getRequestMethod() {
            return this.requestMethod;
        }

        public ListDataServiceApisResponseBodyDataApis setResponseContentType(Integer responseContentType) {
            this.responseContentType = responseContentType;
            return this;
        }
        public Integer getResponseContentType() {
            return this.responseContentType;
        }

        public ListDataServiceApisResponseBodyDataApis setScriptDetails(ListDataServiceApisResponseBodyDataApisScriptDetails scriptDetails) {
            this.scriptDetails = scriptDetails;
            return this;
        }
        public ListDataServiceApisResponseBodyDataApisScriptDetails getScriptDetails() {
            return this.scriptDetails;
        }

        public ListDataServiceApisResponseBodyDataApis setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDataServiceApisResponseBodyDataApis setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListDataServiceApisResponseBodyDataApis setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListDataServiceApisResponseBodyDataApis setVisibleRange(Integer visibleRange) {
            this.visibleRange = visibleRange;
            return this;
        }
        public Integer getVisibleRange() {
            return this.visibleRange;
        }

        public ListDataServiceApisResponseBodyDataApis setWizardDetails(ListDataServiceApisResponseBodyDataApisWizardDetails wizardDetails) {
            this.wizardDetails = wizardDetails;
            return this;
        }
        public ListDataServiceApisResponseBodyDataApisWizardDetails getWizardDetails() {
            return this.wizardDetails;
        }

    }

    public static class ListDataServiceApisResponseBodyData extends TeaModel {
        /**
         * <p>The list of APIs in the development state.</p>
         */
        @NameInMap("Apis")
        public java.util.List<ListDataServiceApisResponseBodyDataApis> apis;

        /**
         * <p>The page number. The value of this parameter is the same as that of the PageNumber parameter in the request.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page. Valid values: 1 to 50. Default value: 10.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataServiceApisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseBodyData self = new ListDataServiceApisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseBodyData setApis(java.util.List<ListDataServiceApisResponseBodyDataApis> apis) {
            this.apis = apis;
            return this;
        }
        public java.util.List<ListDataServiceApisResponseBodyDataApis> getApis() {
            return this.apis;
        }

        public ListDataServiceApisResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataServiceApisResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataServiceApisResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
