// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceApiResponse extends TeaModel {
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
    public GetDataServiceApiResponseData data;

    public static GetDataServiceApiResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiResponse self = new GetDataServiceApiResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApiResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataServiceApiResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataServiceApiResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataServiceApiResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataServiceApiResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDataServiceApiResponse setData(GetDataServiceApiResponseData data) {
        this.data = data;
        return this;
    }
    public GetDataServiceApiResponseData getData() {
        return this.data;
    }

    public static class GetDataServiceApiResponseDataRegistrationDetailsRegistrationErrorCodes extends TeaModel {
        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("ErrorSolution")
        @Validation(required = true)
        public String errorSolution;

        public static GetDataServiceApiResponseDataRegistrationDetailsRegistrationErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseDataRegistrationDetailsRegistrationErrorCodes self = new GetDataServiceApiResponseDataRegistrationDetailsRegistrationErrorCodes();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseDataRegistrationDetailsRegistrationErrorCodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetDataServiceApiResponseDataRegistrationDetailsRegistrationErrorCodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetDataServiceApiResponseDataRegistrationDetailsRegistrationErrorCodes setErrorSolution(String errorSolution) {
            this.errorSolution = errorSolution;
            return this;
        }
        public String getErrorSolution() {
            return this.errorSolution;
        }

    }

    public static class GetDataServiceApiResponseDataRegistrationDetailsRegistrationRequestParameters extends TeaModel {
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

        public static GetDataServiceApiResponseDataRegistrationDetailsRegistrationRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseDataRegistrationDetailsRegistrationRequestParameters self = new GetDataServiceApiResponseDataRegistrationDetailsRegistrationRequestParameters();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseDataRegistrationDetailsRegistrationRequestParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetDataServiceApiResponseDataRegistrationDetailsRegistrationRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetDataServiceApiResponseDataRegistrationDetailsRegistrationRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public GetDataServiceApiResponseDataRegistrationDetailsRegistrationRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        public GetDataServiceApiResponseDataRegistrationDetailsRegistrationRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public GetDataServiceApiResponseDataRegistrationDetailsRegistrationRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServiceApiResponseDataRegistrationDetailsRegistrationRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetDataServiceApiResponseDataRegistrationDetailsRegistrationRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public GetDataServiceApiResponseDataRegistrationDetailsRegistrationRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

    }

    public static class GetDataServiceApiResponseDataRegistrationDetails extends TeaModel {
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
        public java.util.List<GetDataServiceApiResponseDataRegistrationDetailsRegistrationErrorCodes> registrationErrorCodes;

        @NameInMap("RegistrationRequestParameters")
        @Validation(required = true)
        public java.util.List<GetDataServiceApiResponseDataRegistrationDetailsRegistrationRequestParameters> registrationRequestParameters;

        public static GetDataServiceApiResponseDataRegistrationDetails build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseDataRegistrationDetails self = new GetDataServiceApiResponseDataRegistrationDetails();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseDataRegistrationDetails setFailedResultSample(String failedResultSample) {
            this.failedResultSample = failedResultSample;
            return this;
        }
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        public GetDataServiceApiResponseDataRegistrationDetails setServiceContentType(Integer serviceContentType) {
            this.serviceContentType = serviceContentType;
            return this;
        }
        public Integer getServiceContentType() {
            return this.serviceContentType;
        }

        public GetDataServiceApiResponseDataRegistrationDetails setServiceHost(String serviceHost) {
            this.serviceHost = serviceHost;
            return this;
        }
        public String getServiceHost() {
            return this.serviceHost;
        }

        public GetDataServiceApiResponseDataRegistrationDetails setServicePath(String servicePath) {
            this.servicePath = servicePath;
            return this;
        }
        public String getServicePath() {
            return this.servicePath;
        }

        public GetDataServiceApiResponseDataRegistrationDetails setServiceRequestBodyDescription(String serviceRequestBodyDescription) {
            this.serviceRequestBodyDescription = serviceRequestBodyDescription;
            return this;
        }
        public String getServiceRequestBodyDescription() {
            return this.serviceRequestBodyDescription;
        }

        public GetDataServiceApiResponseDataRegistrationDetails setSuccessfulResultSample(String successfulResultSample) {
            this.successfulResultSample = successfulResultSample;
            return this;
        }
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

        public GetDataServiceApiResponseDataRegistrationDetails setRegistrationErrorCodes(java.util.List<GetDataServiceApiResponseDataRegistrationDetailsRegistrationErrorCodes> registrationErrorCodes) {
            this.registrationErrorCodes = registrationErrorCodes;
            return this;
        }
        public java.util.List<GetDataServiceApiResponseDataRegistrationDetailsRegistrationErrorCodes> getRegistrationErrorCodes() {
            return this.registrationErrorCodes;
        }

        public GetDataServiceApiResponseDataRegistrationDetails setRegistrationRequestParameters(java.util.List<GetDataServiceApiResponseDataRegistrationDetailsRegistrationRequestParameters> registrationRequestParameters) {
            this.registrationRequestParameters = registrationRequestParameters;
            return this;
        }
        public java.util.List<GetDataServiceApiResponseDataRegistrationDetailsRegistrationRequestParameters> getRegistrationRequestParameters() {
            return this.registrationRequestParameters;
        }

    }

    public static class GetDataServiceApiResponseDataScriptDetailsScriptRequestParameters extends TeaModel {
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

        public static GetDataServiceApiResponseDataScriptDetailsScriptRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseDataScriptDetailsScriptRequestParameters self = new GetDataServiceApiResponseDataScriptDetailsScriptRequestParameters();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseDataScriptDetailsScriptRequestParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetDataServiceApiResponseDataScriptDetailsScriptRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetDataServiceApiResponseDataScriptDetailsScriptRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public GetDataServiceApiResponseDataScriptDetailsScriptRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        public GetDataServiceApiResponseDataScriptDetailsScriptRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public GetDataServiceApiResponseDataScriptDetailsScriptRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServiceApiResponseDataScriptDetailsScriptRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetDataServiceApiResponseDataScriptDetailsScriptRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public GetDataServiceApiResponseDataScriptDetailsScriptRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

    }

    public static class GetDataServiceApiResponseDataScriptDetailsScriptResponseParameters extends TeaModel {
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

        public static GetDataServiceApiResponseDataScriptDetailsScriptResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseDataScriptDetailsScriptResponseParameters self = new GetDataServiceApiResponseDataScriptDetailsScriptResponseParameters();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseDataScriptDetailsScriptResponseParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetDataServiceApiResponseDataScriptDetailsScriptResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public GetDataServiceApiResponseDataScriptDetailsScriptResponseParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public GetDataServiceApiResponseDataScriptDetailsScriptResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServiceApiResponseDataScriptDetailsScriptResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

    public static class GetDataServiceApiResponseDataScriptDetailsScriptConnection extends TeaModel {
        @NameInMap("ConnectionId")
        @Validation(required = true)
        public Long connectionId;

        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        public static GetDataServiceApiResponseDataScriptDetailsScriptConnection build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseDataScriptDetailsScriptConnection self = new GetDataServiceApiResponseDataScriptDetailsScriptConnection();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseDataScriptDetailsScriptConnection setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

        public GetDataServiceApiResponseDataScriptDetailsScriptConnection setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class GetDataServiceApiResponseDataScriptDetails extends TeaModel {
        @NameInMap("IsPagedResponse")
        @Validation(required = true)
        public Boolean isPagedResponse;

        @NameInMap("Script")
        @Validation(required = true)
        public String script;

        @NameInMap("ScriptRequestParameters")
        @Validation(required = true)
        public java.util.List<GetDataServiceApiResponseDataScriptDetailsScriptRequestParameters> scriptRequestParameters;

        @NameInMap("ScriptResponseParameters")
        @Validation(required = true)
        public java.util.List<GetDataServiceApiResponseDataScriptDetailsScriptResponseParameters> scriptResponseParameters;

        @NameInMap("ScriptConnection")
        @Validation(required = true)
        public GetDataServiceApiResponseDataScriptDetailsScriptConnection scriptConnection;

        public static GetDataServiceApiResponseDataScriptDetails build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseDataScriptDetails self = new GetDataServiceApiResponseDataScriptDetails();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseDataScriptDetails setIsPagedResponse(Boolean isPagedResponse) {
            this.isPagedResponse = isPagedResponse;
            return this;
        }
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
        }

        public GetDataServiceApiResponseDataScriptDetails setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public GetDataServiceApiResponseDataScriptDetails setScriptRequestParameters(java.util.List<GetDataServiceApiResponseDataScriptDetailsScriptRequestParameters> scriptRequestParameters) {
            this.scriptRequestParameters = scriptRequestParameters;
            return this;
        }
        public java.util.List<GetDataServiceApiResponseDataScriptDetailsScriptRequestParameters> getScriptRequestParameters() {
            return this.scriptRequestParameters;
        }

        public GetDataServiceApiResponseDataScriptDetails setScriptResponseParameters(java.util.List<GetDataServiceApiResponseDataScriptDetailsScriptResponseParameters> scriptResponseParameters) {
            this.scriptResponseParameters = scriptResponseParameters;
            return this;
        }
        public java.util.List<GetDataServiceApiResponseDataScriptDetailsScriptResponseParameters> getScriptResponseParameters() {
            return this.scriptResponseParameters;
        }

        public GetDataServiceApiResponseDataScriptDetails setScriptConnection(GetDataServiceApiResponseDataScriptDetailsScriptConnection scriptConnection) {
            this.scriptConnection = scriptConnection;
            return this;
        }
        public GetDataServiceApiResponseDataScriptDetailsScriptConnection getScriptConnection() {
            return this.scriptConnection;
        }

    }

    public static class GetDataServiceApiResponseDataWizardDetailsWizardRequestParameters extends TeaModel {
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

        public static GetDataServiceApiResponseDataWizardDetailsWizardRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseDataWizardDetailsWizardRequestParameters self = new GetDataServiceApiResponseDataWizardDetailsWizardRequestParameters();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseDataWizardDetailsWizardRequestParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetDataServiceApiResponseDataWizardDetailsWizardRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetDataServiceApiResponseDataWizardDetailsWizardRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public GetDataServiceApiResponseDataWizardDetailsWizardRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        public GetDataServiceApiResponseDataWizardDetailsWizardRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public GetDataServiceApiResponseDataWizardDetailsWizardRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServiceApiResponseDataWizardDetailsWizardRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetDataServiceApiResponseDataWizardDetailsWizardRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public GetDataServiceApiResponseDataWizardDetailsWizardRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

    }

    public static class GetDataServiceApiResponseDataWizardDetailsWizardResponseParameters extends TeaModel {
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

        public static GetDataServiceApiResponseDataWizardDetailsWizardResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseDataWizardDetailsWizardResponseParameters self = new GetDataServiceApiResponseDataWizardDetailsWizardResponseParameters();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseDataWizardDetailsWizardResponseParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetDataServiceApiResponseDataWizardDetailsWizardResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public GetDataServiceApiResponseDataWizardDetailsWizardResponseParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public GetDataServiceApiResponseDataWizardDetailsWizardResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServiceApiResponseDataWizardDetailsWizardResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

    public static class GetDataServiceApiResponseDataWizardDetailsWizardConnection extends TeaModel {
        @NameInMap("ConnectionId")
        @Validation(required = true)
        public Long connectionId;

        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        public static GetDataServiceApiResponseDataWizardDetailsWizardConnection build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseDataWizardDetailsWizardConnection self = new GetDataServiceApiResponseDataWizardDetailsWizardConnection();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseDataWizardDetailsWizardConnection setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

        public GetDataServiceApiResponseDataWizardDetailsWizardConnection setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class GetDataServiceApiResponseDataWizardDetails extends TeaModel {
        @NameInMap("IsPagedResponse")
        @Validation(required = true)
        public Boolean isPagedResponse;

        @NameInMap("WizardRequestParameters")
        @Validation(required = true)
        public java.util.List<GetDataServiceApiResponseDataWizardDetailsWizardRequestParameters> wizardRequestParameters;

        @NameInMap("WizardResponseParameters")
        @Validation(required = true)
        public java.util.List<GetDataServiceApiResponseDataWizardDetailsWizardResponseParameters> wizardResponseParameters;

        @NameInMap("WizardConnection")
        @Validation(required = true)
        public GetDataServiceApiResponseDataWizardDetailsWizardConnection wizardConnection;

        public static GetDataServiceApiResponseDataWizardDetails build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseDataWizardDetails self = new GetDataServiceApiResponseDataWizardDetails();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseDataWizardDetails setIsPagedResponse(Boolean isPagedResponse) {
            this.isPagedResponse = isPagedResponse;
            return this;
        }
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
        }

        public GetDataServiceApiResponseDataWizardDetails setWizardRequestParameters(java.util.List<GetDataServiceApiResponseDataWizardDetailsWizardRequestParameters> wizardRequestParameters) {
            this.wizardRequestParameters = wizardRequestParameters;
            return this;
        }
        public java.util.List<GetDataServiceApiResponseDataWizardDetailsWizardRequestParameters> getWizardRequestParameters() {
            return this.wizardRequestParameters;
        }

        public GetDataServiceApiResponseDataWizardDetails setWizardResponseParameters(java.util.List<GetDataServiceApiResponseDataWizardDetailsWizardResponseParameters> wizardResponseParameters) {
            this.wizardResponseParameters = wizardResponseParameters;
            return this;
        }
        public java.util.List<GetDataServiceApiResponseDataWizardDetailsWizardResponseParameters> getWizardResponseParameters() {
            return this.wizardResponseParameters;
        }

        public GetDataServiceApiResponseDataWizardDetails setWizardConnection(GetDataServiceApiResponseDataWizardDetailsWizardConnection wizardConnection) {
            this.wizardConnection = wizardConnection;
            return this;
        }
        public GetDataServiceApiResponseDataWizardDetailsWizardConnection getWizardConnection() {
            return this.wizardConnection;
        }

    }

    public static class GetDataServiceApiResponseData extends TeaModel {
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
        public GetDataServiceApiResponseDataRegistrationDetails registrationDetails;

        @NameInMap("ScriptDetails")
        @Validation(required = true)
        public GetDataServiceApiResponseDataScriptDetails scriptDetails;

        @NameInMap("WizardDetails")
        @Validation(required = true)
        public GetDataServiceApiResponseDataWizardDetails wizardDetails;

        @NameInMap("Protocols")
        @Validation(required = true)
        public java.util.List<Integer> protocols;

        public static GetDataServiceApiResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseData self = new GetDataServiceApiResponseData();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseData setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public GetDataServiceApiResponseData setApiMode(Integer apiMode) {
            this.apiMode = apiMode;
            return this;
        }
        public Integer getApiMode() {
            return this.apiMode;
        }

        public GetDataServiceApiResponseData setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetDataServiceApiResponseData setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

        public GetDataServiceApiResponseData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetDataServiceApiResponseData setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetDataServiceApiResponseData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataServiceApiResponseData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetDataServiceApiResponseData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetDataServiceApiResponseData setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public GetDataServiceApiResponseData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataServiceApiResponseData setRequestMethod(Integer requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }
        public Integer getRequestMethod() {
            return this.requestMethod;
        }

        public GetDataServiceApiResponseData setResponseContentType(Integer responseContentType) {
            this.responseContentType = responseContentType;
            return this;
        }
        public Integer getResponseContentType() {
            return this.responseContentType;
        }

        public GetDataServiceApiResponseData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetDataServiceApiResponseData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetDataServiceApiResponseData setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public GetDataServiceApiResponseData setVisibleRange(Integer visibleRange) {
            this.visibleRange = visibleRange;
            return this;
        }
        public Integer getVisibleRange() {
            return this.visibleRange;
        }

        public GetDataServiceApiResponseData setFolderId(Long folderId) {
            this.folderId = folderId;
            return this;
        }
        public Long getFolderId() {
            return this.folderId;
        }

        public GetDataServiceApiResponseData setRegistrationDetails(GetDataServiceApiResponseDataRegistrationDetails registrationDetails) {
            this.registrationDetails = registrationDetails;
            return this;
        }
        public GetDataServiceApiResponseDataRegistrationDetails getRegistrationDetails() {
            return this.registrationDetails;
        }

        public GetDataServiceApiResponseData setScriptDetails(GetDataServiceApiResponseDataScriptDetails scriptDetails) {
            this.scriptDetails = scriptDetails;
            return this;
        }
        public GetDataServiceApiResponseDataScriptDetails getScriptDetails() {
            return this.scriptDetails;
        }

        public GetDataServiceApiResponseData setWizardDetails(GetDataServiceApiResponseDataWizardDetails wizardDetails) {
            this.wizardDetails = wizardDetails;
            return this;
        }
        public GetDataServiceApiResponseDataWizardDetails getWizardDetails() {
            return this.wizardDetails;
        }

        public GetDataServiceApiResponseData setProtocols(java.util.List<Integer> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<Integer> getProtocols() {
            return this.protocols;
        }

    }

}
