// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApisResponse extends TeaModel {
    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public ListDataServiceApisResponseData data;

    public static ListDataServiceApisResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApisResponse self = new ListDataServiceApisResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApisResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataServiceApisResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataServiceApisResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataServiceApisResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServiceApisResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataServiceApisResponse setData(ListDataServiceApisResponseData data) {
        this.data = data;
        return this;
    }
    public ListDataServiceApisResponseData getData() {
        return this.data;
    }

    public static class ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationErrorCodes extends TeaModel {
        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("ErrorSolution")
        @Validation(required = true)
        public String errorSolution;

        public static ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationErrorCodes self = new ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationErrorCodes();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationErrorCodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationErrorCodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationErrorCodes setErrorSolution(String errorSolution) {
            this.errorSolution = errorSolution;
            return this;
        }
        public String getErrorSolution() {
            return this.errorSolution;
        }

    }

    public static class ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationRequestParameters extends TeaModel {
        @NameInMap("ColumnName")
        @Validation(required = true)
        public String columnName;

        @NameInMap("DefaultValue")
        @Validation(required = true)
        public String defaultValue;

        @NameInMap("ExampleValue")
        @Validation(required = true)
        public String exampleValue;

        @NameInMap("IsRequiredParameter")
        @Validation(required = true)
        public Boolean isRequiredParameter;

        @NameInMap("ParameterDataType")
        @Validation(required = true)
        public Integer parameterDataType;

        @NameInMap("ParameterDescription")
        @Validation(required = true)
        public String parameterDescription;

        @NameInMap("ParameterName")
        @Validation(required = true)
        public String parameterName;

        @NameInMap("ParameterOperator")
        @Validation(required = true)
        public Integer parameterOperator;

        @NameInMap("ParameterPosition")
        @Validation(required = true)
        public Integer parameterPosition;

        public static ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationRequestParameters self = new ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationRequestParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationRequestParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        public ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

    }

    public static class ListDataServiceApisResponseDataApisRegistrationDetails extends TeaModel {
        @NameInMap("FailedResultSample")
        @Validation(required = true)
        public String failedResultSample;

        @NameInMap("ServiceContentType")
        @Validation(required = true)
        public Integer serviceContentType;

        @NameInMap("ServiceHost")
        @Validation(required = true)
        public String serviceHost;

        @NameInMap("ServicePath")
        @Validation(required = true)
        public String servicePath;

        @NameInMap("ServiceRequestBodyDescription")
        @Validation(required = true)
        public String serviceRequestBodyDescription;

        @NameInMap("SuccessfulResultSample")
        @Validation(required = true)
        public String successfulResultSample;

        @NameInMap("RegistrationErrorCodes")
        @Validation(required = true)
        public java.util.List<ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationErrorCodes> registrationErrorCodes;

        @NameInMap("RegistrationRequestParameters")
        @Validation(required = true)
        public java.util.List<ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationRequestParameters> registrationRequestParameters;

        public static ListDataServiceApisResponseDataApisRegistrationDetails build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseDataApisRegistrationDetails self = new ListDataServiceApisResponseDataApisRegistrationDetails();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseDataApisRegistrationDetails setFailedResultSample(String failedResultSample) {
            this.failedResultSample = failedResultSample;
            return this;
        }
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        public ListDataServiceApisResponseDataApisRegistrationDetails setServiceContentType(Integer serviceContentType) {
            this.serviceContentType = serviceContentType;
            return this;
        }
        public Integer getServiceContentType() {
            return this.serviceContentType;
        }

        public ListDataServiceApisResponseDataApisRegistrationDetails setServiceHost(String serviceHost) {
            this.serviceHost = serviceHost;
            return this;
        }
        public String getServiceHost() {
            return this.serviceHost;
        }

        public ListDataServiceApisResponseDataApisRegistrationDetails setServicePath(String servicePath) {
            this.servicePath = servicePath;
            return this;
        }
        public String getServicePath() {
            return this.servicePath;
        }

        public ListDataServiceApisResponseDataApisRegistrationDetails setServiceRequestBodyDescription(String serviceRequestBodyDescription) {
            this.serviceRequestBodyDescription = serviceRequestBodyDescription;
            return this;
        }
        public String getServiceRequestBodyDescription() {
            return this.serviceRequestBodyDescription;
        }

        public ListDataServiceApisResponseDataApisRegistrationDetails setSuccessfulResultSample(String successfulResultSample) {
            this.successfulResultSample = successfulResultSample;
            return this;
        }
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

        public ListDataServiceApisResponseDataApisRegistrationDetails setRegistrationErrorCodes(java.util.List<ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationErrorCodes> registrationErrorCodes) {
            this.registrationErrorCodes = registrationErrorCodes;
            return this;
        }
        public java.util.List<ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationErrorCodes> getRegistrationErrorCodes() {
            return this.registrationErrorCodes;
        }

        public ListDataServiceApisResponseDataApisRegistrationDetails setRegistrationRequestParameters(java.util.List<ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationRequestParameters> registrationRequestParameters) {
            this.registrationRequestParameters = registrationRequestParameters;
            return this;
        }
        public java.util.List<ListDataServiceApisResponseDataApisRegistrationDetailsRegistrationRequestParameters> getRegistrationRequestParameters() {
            return this.registrationRequestParameters;
        }

    }

    public static class ListDataServiceApisResponseDataApisScriptDetailsScriptRequestParameters extends TeaModel {
        @NameInMap("ColumnName")
        @Validation(required = true)
        public String columnName;

        @NameInMap("DefaultValue")
        @Validation(required = true)
        public String defaultValue;

        @NameInMap("ExampleValue")
        @Validation(required = true)
        public String exampleValue;

        @NameInMap("IsRequiredParameter")
        @Validation(required = true)
        public Boolean isRequiredParameter;

        @NameInMap("ParameterDataType")
        @Validation(required = true)
        public Integer parameterDataType;

        @NameInMap("ParameterDescription")
        @Validation(required = true)
        public String parameterDescription;

        @NameInMap("ParameterName")
        @Validation(required = true)
        public String parameterName;

        @NameInMap("ParameterOperator")
        @Validation(required = true)
        public Integer parameterOperator;

        @NameInMap("ParameterPosition")
        @Validation(required = true)
        public Integer parameterPosition;

        public static ListDataServiceApisResponseDataApisScriptDetailsScriptRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseDataApisScriptDetailsScriptRequestParameters self = new ListDataServiceApisResponseDataApisScriptDetailsScriptRequestParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseDataApisScriptDetailsScriptRequestParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListDataServiceApisResponseDataApisScriptDetailsScriptRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListDataServiceApisResponseDataApisScriptDetailsScriptRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServiceApisResponseDataApisScriptDetailsScriptRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        public ListDataServiceApisResponseDataApisScriptDetailsScriptRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServiceApisResponseDataApisScriptDetailsScriptRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServiceApisResponseDataApisScriptDetailsScriptRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListDataServiceApisResponseDataApisScriptDetailsScriptRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public ListDataServiceApisResponseDataApisScriptDetailsScriptRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

    }

    public static class ListDataServiceApisResponseDataApisScriptDetailsScriptResponseParameters extends TeaModel {
        @NameInMap("ColumnName")
        @Validation(required = true)
        public String columnName;

        @NameInMap("ExampleValue")
        @Validation(required = true)
        public String exampleValue;

        @NameInMap("ParameterDataType")
        @Validation(required = true)
        public Integer parameterDataType;

        @NameInMap("ParameterDescription")
        @Validation(required = true)
        public String parameterDescription;

        @NameInMap("ParameterName")
        @Validation(required = true)
        public String parameterName;

        public static ListDataServiceApisResponseDataApisScriptDetailsScriptResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseDataApisScriptDetailsScriptResponseParameters self = new ListDataServiceApisResponseDataApisScriptDetailsScriptResponseParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseDataApisScriptDetailsScriptResponseParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListDataServiceApisResponseDataApisScriptDetailsScriptResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServiceApisResponseDataApisScriptDetailsScriptResponseParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServiceApisResponseDataApisScriptDetailsScriptResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServiceApisResponseDataApisScriptDetailsScriptResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

    public static class ListDataServiceApisResponseDataApisScriptDetailsScriptConnection extends TeaModel {
        @NameInMap("ConnectionId")
        @Validation(required = true)
        public Long connectionId;

        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        public static ListDataServiceApisResponseDataApisScriptDetailsScriptConnection build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseDataApisScriptDetailsScriptConnection self = new ListDataServiceApisResponseDataApisScriptDetailsScriptConnection();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseDataApisScriptDetailsScriptConnection setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

        public ListDataServiceApisResponseDataApisScriptDetailsScriptConnection setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ListDataServiceApisResponseDataApisScriptDetails extends TeaModel {
        @NameInMap("IsPagedResponse")
        @Validation(required = true)
        public Boolean isPagedResponse;

        @NameInMap("Script")
        @Validation(required = true)
        public String script;

        @NameInMap("ScriptRequestParameters")
        @Validation(required = true)
        public java.util.List<ListDataServiceApisResponseDataApisScriptDetailsScriptRequestParameters> scriptRequestParameters;

        @NameInMap("ScriptResponseParameters")
        @Validation(required = true)
        public java.util.List<ListDataServiceApisResponseDataApisScriptDetailsScriptResponseParameters> scriptResponseParameters;

        @NameInMap("ScriptConnection")
        @Validation(required = true)
        public ListDataServiceApisResponseDataApisScriptDetailsScriptConnection scriptConnection;

        public static ListDataServiceApisResponseDataApisScriptDetails build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseDataApisScriptDetails self = new ListDataServiceApisResponseDataApisScriptDetails();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseDataApisScriptDetails setIsPagedResponse(Boolean isPagedResponse) {
            this.isPagedResponse = isPagedResponse;
            return this;
        }
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
        }

        public ListDataServiceApisResponseDataApisScriptDetails setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public ListDataServiceApisResponseDataApisScriptDetails setScriptRequestParameters(java.util.List<ListDataServiceApisResponseDataApisScriptDetailsScriptRequestParameters> scriptRequestParameters) {
            this.scriptRequestParameters = scriptRequestParameters;
            return this;
        }
        public java.util.List<ListDataServiceApisResponseDataApisScriptDetailsScriptRequestParameters> getScriptRequestParameters() {
            return this.scriptRequestParameters;
        }

        public ListDataServiceApisResponseDataApisScriptDetails setScriptResponseParameters(java.util.List<ListDataServiceApisResponseDataApisScriptDetailsScriptResponseParameters> scriptResponseParameters) {
            this.scriptResponseParameters = scriptResponseParameters;
            return this;
        }
        public java.util.List<ListDataServiceApisResponseDataApisScriptDetailsScriptResponseParameters> getScriptResponseParameters() {
            return this.scriptResponseParameters;
        }

        public ListDataServiceApisResponseDataApisScriptDetails setScriptConnection(ListDataServiceApisResponseDataApisScriptDetailsScriptConnection scriptConnection) {
            this.scriptConnection = scriptConnection;
            return this;
        }
        public ListDataServiceApisResponseDataApisScriptDetailsScriptConnection getScriptConnection() {
            return this.scriptConnection;
        }

    }

    public static class ListDataServiceApisResponseDataApisWizardDetailsWizardRequestParameters extends TeaModel {
        @NameInMap("ColumnName")
        @Validation(required = true)
        public String columnName;

        @NameInMap("DefaultValue")
        @Validation(required = true)
        public String defaultValue;

        @NameInMap("ExampleValue")
        @Validation(required = true)
        public String exampleValue;

        @NameInMap("IsRequiredParameter")
        @Validation(required = true)
        public Boolean isRequiredParameter;

        @NameInMap("ParameterDataType")
        @Validation(required = true)
        public Integer parameterDataType;

        @NameInMap("ParameterDescription")
        @Validation(required = true)
        public String parameterDescription;

        @NameInMap("ParameterName")
        @Validation(required = true)
        public String parameterName;

        @NameInMap("ParameterOperator")
        @Validation(required = true)
        public Integer parameterOperator;

        @NameInMap("ParameterPosition")
        @Validation(required = true)
        public Integer parameterPosition;

        public static ListDataServiceApisResponseDataApisWizardDetailsWizardRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseDataApisWizardDetailsWizardRequestParameters self = new ListDataServiceApisResponseDataApisWizardDetailsWizardRequestParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseDataApisWizardDetailsWizardRequestParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListDataServiceApisResponseDataApisWizardDetailsWizardRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListDataServiceApisResponseDataApisWizardDetailsWizardRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServiceApisResponseDataApisWizardDetailsWizardRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        public ListDataServiceApisResponseDataApisWizardDetailsWizardRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServiceApisResponseDataApisWizardDetailsWizardRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServiceApisResponseDataApisWizardDetailsWizardRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListDataServiceApisResponseDataApisWizardDetailsWizardRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public ListDataServiceApisResponseDataApisWizardDetailsWizardRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

    }

    public static class ListDataServiceApisResponseDataApisWizardDetailsWizardResponseParameters extends TeaModel {
        @NameInMap("ColumnName")
        @Validation(required = true)
        public String columnName;

        @NameInMap("ExampleValue")
        @Validation(required = true)
        public String exampleValue;

        @NameInMap("ParameterDataType")
        @Validation(required = true)
        public Integer parameterDataType;

        @NameInMap("ParameterDescription")
        @Validation(required = true)
        public String parameterDescription;

        @NameInMap("ParameterName")
        @Validation(required = true)
        public String parameterName;

        public static ListDataServiceApisResponseDataApisWizardDetailsWizardResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseDataApisWizardDetailsWizardResponseParameters self = new ListDataServiceApisResponseDataApisWizardDetailsWizardResponseParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseDataApisWizardDetailsWizardResponseParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListDataServiceApisResponseDataApisWizardDetailsWizardResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServiceApisResponseDataApisWizardDetailsWizardResponseParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServiceApisResponseDataApisWizardDetailsWizardResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServiceApisResponseDataApisWizardDetailsWizardResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

    public static class ListDataServiceApisResponseDataApisWizardDetailsWizardConnection extends TeaModel {
        @NameInMap("ConnectionId")
        @Validation(required = true)
        public Long connectionId;

        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        public static ListDataServiceApisResponseDataApisWizardDetailsWizardConnection build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseDataApisWizardDetailsWizardConnection self = new ListDataServiceApisResponseDataApisWizardDetailsWizardConnection();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseDataApisWizardDetailsWizardConnection setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

        public ListDataServiceApisResponseDataApisWizardDetailsWizardConnection setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ListDataServiceApisResponseDataApisWizardDetails extends TeaModel {
        @NameInMap("IsPagedResponse")
        @Validation(required = true)
        public Boolean isPagedResponse;

        @NameInMap("WizardRequestParameters")
        @Validation(required = true)
        public java.util.List<ListDataServiceApisResponseDataApisWizardDetailsWizardRequestParameters> wizardRequestParameters;

        @NameInMap("WizardResponseParameters")
        @Validation(required = true)
        public java.util.List<ListDataServiceApisResponseDataApisWizardDetailsWizardResponseParameters> wizardResponseParameters;

        @NameInMap("WizardConnection")
        @Validation(required = true)
        public ListDataServiceApisResponseDataApisWizardDetailsWizardConnection wizardConnection;

        public static ListDataServiceApisResponseDataApisWizardDetails build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseDataApisWizardDetails self = new ListDataServiceApisResponseDataApisWizardDetails();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseDataApisWizardDetails setIsPagedResponse(Boolean isPagedResponse) {
            this.isPagedResponse = isPagedResponse;
            return this;
        }
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
        }

        public ListDataServiceApisResponseDataApisWizardDetails setWizardRequestParameters(java.util.List<ListDataServiceApisResponseDataApisWizardDetailsWizardRequestParameters> wizardRequestParameters) {
            this.wizardRequestParameters = wizardRequestParameters;
            return this;
        }
        public java.util.List<ListDataServiceApisResponseDataApisWizardDetailsWizardRequestParameters> getWizardRequestParameters() {
            return this.wizardRequestParameters;
        }

        public ListDataServiceApisResponseDataApisWizardDetails setWizardResponseParameters(java.util.List<ListDataServiceApisResponseDataApisWizardDetailsWizardResponseParameters> wizardResponseParameters) {
            this.wizardResponseParameters = wizardResponseParameters;
            return this;
        }
        public java.util.List<ListDataServiceApisResponseDataApisWizardDetailsWizardResponseParameters> getWizardResponseParameters() {
            return this.wizardResponseParameters;
        }

        public ListDataServiceApisResponseDataApisWizardDetails setWizardConnection(ListDataServiceApisResponseDataApisWizardDetailsWizardConnection wizardConnection) {
            this.wizardConnection = wizardConnection;
            return this;
        }
        public ListDataServiceApisResponseDataApisWizardDetailsWizardConnection getWizardConnection() {
            return this.wizardConnection;
        }

    }

    public static class ListDataServiceApisResponseDataApis extends TeaModel {
        @NameInMap("ApiId")
        @Validation(required = true)
        public Long apiId;

        @NameInMap("ApiMode")
        @Validation(required = true)
        public Integer apiMode;

        @NameInMap("ApiName")
        @Validation(required = true)
        public String apiName;

        @NameInMap("ApiPath")
        @Validation(required = true)
        public String apiPath;

        @NameInMap("CreatedTime")
        @Validation(required = true)
        public String createdTime;

        @NameInMap("CreatorId")
        @Validation(required = true)
        public String creatorId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public String modifiedTime;

        @NameInMap("OperatorId")
        @Validation(required = true)
        public String operatorId;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("RequestMethod")
        @Validation(required = true)
        public Integer requestMethod;

        @NameInMap("ResponseContentType")
        @Validation(required = true)
        public Integer responseContentType;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("Timeout")
        @Validation(required = true)
        public Integer timeout;

        @NameInMap("VisibleRange")
        @Validation(required = true)
        public Integer visibleRange;

        @NameInMap("FolderId")
        @Validation(required = true)
        public Long folderId;

        @NameInMap("RegistrationDetails")
        @Validation(required = true)
        public ListDataServiceApisResponseDataApisRegistrationDetails registrationDetails;

        @NameInMap("ScriptDetails")
        @Validation(required = true)
        public ListDataServiceApisResponseDataApisScriptDetails scriptDetails;

        @NameInMap("WizardDetails")
        @Validation(required = true)
        public ListDataServiceApisResponseDataApisWizardDetails wizardDetails;

        @NameInMap("Protocols")
        @Validation(required = true)
        public java.util.List<Integer> protocols;

        public static ListDataServiceApisResponseDataApis build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseDataApis self = new ListDataServiceApisResponseDataApis();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseDataApis setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListDataServiceApisResponseDataApis setApiMode(Integer apiMode) {
            this.apiMode = apiMode;
            return this;
        }
        public Integer getApiMode() {
            return this.apiMode;
        }

        public ListDataServiceApisResponseDataApis setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListDataServiceApisResponseDataApis setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

        public ListDataServiceApisResponseDataApis setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDataServiceApisResponseDataApis setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDataServiceApisResponseDataApis setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataServiceApisResponseDataApis setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListDataServiceApisResponseDataApis setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListDataServiceApisResponseDataApis setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public ListDataServiceApisResponseDataApis setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataServiceApisResponseDataApis setRequestMethod(Integer requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }
        public Integer getRequestMethod() {
            return this.requestMethod;
        }

        public ListDataServiceApisResponseDataApis setResponseContentType(Integer responseContentType) {
            this.responseContentType = responseContentType;
            return this;
        }
        public Integer getResponseContentType() {
            return this.responseContentType;
        }

        public ListDataServiceApisResponseDataApis setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDataServiceApisResponseDataApis setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListDataServiceApisResponseDataApis setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListDataServiceApisResponseDataApis setVisibleRange(Integer visibleRange) {
            this.visibleRange = visibleRange;
            return this;
        }
        public Integer getVisibleRange() {
            return this.visibleRange;
        }

        public ListDataServiceApisResponseDataApis setFolderId(Long folderId) {
            this.folderId = folderId;
            return this;
        }
        public Long getFolderId() {
            return this.folderId;
        }

        public ListDataServiceApisResponseDataApis setRegistrationDetails(ListDataServiceApisResponseDataApisRegistrationDetails registrationDetails) {
            this.registrationDetails = registrationDetails;
            return this;
        }
        public ListDataServiceApisResponseDataApisRegistrationDetails getRegistrationDetails() {
            return this.registrationDetails;
        }

        public ListDataServiceApisResponseDataApis setScriptDetails(ListDataServiceApisResponseDataApisScriptDetails scriptDetails) {
            this.scriptDetails = scriptDetails;
            return this;
        }
        public ListDataServiceApisResponseDataApisScriptDetails getScriptDetails() {
            return this.scriptDetails;
        }

        public ListDataServiceApisResponseDataApis setWizardDetails(ListDataServiceApisResponseDataApisWizardDetails wizardDetails) {
            this.wizardDetails = wizardDetails;
            return this;
        }
        public ListDataServiceApisResponseDataApisWizardDetails getWizardDetails() {
            return this.wizardDetails;
        }

        public ListDataServiceApisResponseDataApis setProtocols(java.util.List<Integer> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<Integer> getProtocols() {
            return this.protocols;
        }

    }

    public static class ListDataServiceApisResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Apis")
        @Validation(required = true)
        public java.util.List<ListDataServiceApisResponseDataApis> apis;

        public static ListDataServiceApisResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseData self = new ListDataServiceApisResponseData();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataServiceApisResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataServiceApisResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListDataServiceApisResponseData setApis(java.util.List<ListDataServiceApisResponseDataApis> apis) {
            this.apis = apis;
            return this;
        }
        public java.util.List<ListDataServiceApisResponseDataApis> getApis() {
            return this.apis;
        }

    }

}
