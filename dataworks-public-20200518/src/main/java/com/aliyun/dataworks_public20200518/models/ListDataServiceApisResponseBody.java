// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApisResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Data")
    public ListDataServiceApisResponseBodyData data;

    public static ListDataServiceApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApisResponseBody self = new ListDataServiceApisResponseBody();
        return TeaModel.build(map, self);
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

    public ListDataServiceApisResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataServiceApisResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataServiceApisResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataServiceApisResponseBody setData(ListDataServiceApisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataServiceApisResponseBodyData getData() {
        return this.data;
    }

    public static class ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorSolution")
        public String errorSolution;

        public static ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes self = new ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
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
        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterPosition")
        public Integer parameterPosition;

        @NameInMap("ParameterDescription")
        public String parameterDescription;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("ParameterOperator")
        public Integer parameterOperator;

        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        @NameInMap("ExampleValue")
        public String exampleValue;

        @NameInMap("IsRequiredParameter")
        public Boolean isRequiredParameter;

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

        public ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
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

    }

    public static class ListDataServiceApisResponseBodyDataApisRegistrationDetails extends TeaModel {
        @NameInMap("ServiceHost")
        public String serviceHost;

        @NameInMap("ServiceContentType")
        public Integer serviceContentType;

        @NameInMap("ServicePath")
        public String servicePath;

        @NameInMap("SuccessfulResultSample")
        public String successfulResultSample;

        @NameInMap("FailedResultSample")
        public String failedResultSample;

        @NameInMap("ServiceRequestBodyDescription")
        public String serviceRequestBodyDescription;

        @NameInMap("RegistrationErrorCodes")
        public java.util.List<ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes> registrationErrorCodes;

        @NameInMap("RegistrationRequestParameters")
        public java.util.List<ListDataServiceApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters> registrationRequestParameters;

        public static ListDataServiceApisResponseBodyDataApisRegistrationDetails build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseBodyDataApisRegistrationDetails self = new ListDataServiceApisResponseBodyDataApisRegistrationDetails();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetails setServiceHost(String serviceHost) {
            this.serviceHost = serviceHost;
            return this;
        }
        public String getServiceHost() {
            return this.serviceHost;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetails setServiceContentType(Integer serviceContentType) {
            this.serviceContentType = serviceContentType;
            return this;
        }
        public Integer getServiceContentType() {
            return this.serviceContentType;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetails setServicePath(String servicePath) {
            this.servicePath = servicePath;
            return this;
        }
        public String getServicePath() {
            return this.servicePath;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetails setSuccessfulResultSample(String successfulResultSample) {
            this.successfulResultSample = successfulResultSample;
            return this;
        }
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetails setFailedResultSample(String failedResultSample) {
            this.failedResultSample = failedResultSample;
            return this;
        }
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        public ListDataServiceApisResponseBodyDataApisRegistrationDetails setServiceRequestBodyDescription(String serviceRequestBodyDescription) {
            this.serviceRequestBodyDescription = serviceRequestBodyDescription;
            return this;
        }
        public String getServiceRequestBodyDescription() {
            return this.serviceRequestBodyDescription;
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

    }

    public static class ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters extends TeaModel {
        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterPosition")
        public Integer parameterPosition;

        @NameInMap("ParameterDescription")
        public String parameterDescription;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("ParameterOperator")
        public Integer parameterOperator;

        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        @NameInMap("ExampleValue")
        public String exampleValue;

        @NameInMap("IsRequiredParameter")
        public Boolean isRequiredParameter;

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

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
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

    }

    public static class ListDataServiceApisResponseBodyDataApisScriptDetailsScriptResponseParameters extends TeaModel {
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        @NameInMap("ExampleValue")
        public String exampleValue;

        public static ListDataServiceApisResponseBodyDataApisScriptDetailsScriptResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseBodyDataApisScriptDetailsScriptResponseParameters self = new ListDataServiceApisResponseBodyDataApisScriptDetailsScriptResponseParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptResponseParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptResponseParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

    }

    public static class ListDataServiceApisResponseBodyDataApisScriptDetailsScriptConnection extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("ConnectionId")
        public Long connectionId;

        public static ListDataServiceApisResponseBodyDataApisScriptDetailsScriptConnection build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseBodyDataApisScriptDetailsScriptConnection self = new ListDataServiceApisResponseBodyDataApisScriptDetailsScriptConnection();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptConnection setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptConnection setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

    }

    public static class ListDataServiceApisResponseBodyDataApisScriptDetails extends TeaModel {
        @NameInMap("Script")
        public String script;

        @NameInMap("IsPagedResponse")
        public Boolean isPagedResponse;

        @NameInMap("ScriptRequestParameters")
        public java.util.List<ListDataServiceApisResponseBodyDataApisScriptDetailsScriptRequestParameters> scriptRequestParameters;

        @NameInMap("ScriptResponseParameters")
        public java.util.List<ListDataServiceApisResponseBodyDataApisScriptDetailsScriptResponseParameters> scriptResponseParameters;

        @NameInMap("ScriptConnection")
        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptConnection scriptConnection;

        public static ListDataServiceApisResponseBodyDataApisScriptDetails build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseBodyDataApisScriptDetails self = new ListDataServiceApisResponseBodyDataApisScriptDetails();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetails setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public ListDataServiceApisResponseBodyDataApisScriptDetails setIsPagedResponse(Boolean isPagedResponse) {
            this.isPagedResponse = isPagedResponse;
            return this;
        }
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
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

        public ListDataServiceApisResponseBodyDataApisScriptDetails setScriptConnection(ListDataServiceApisResponseBodyDataApisScriptDetailsScriptConnection scriptConnection) {
            this.scriptConnection = scriptConnection;
            return this;
        }
        public ListDataServiceApisResponseBodyDataApisScriptDetailsScriptConnection getScriptConnection() {
            return this.scriptConnection;
        }

    }

    public static class ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters extends TeaModel {
        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterPosition")
        public Integer parameterPosition;

        @NameInMap("ParameterDescription")
        public String parameterDescription;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("ParameterOperator")
        public Integer parameterOperator;

        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        @NameInMap("ExampleValue")
        public String exampleValue;

        @NameInMap("IsRequiredParameter")
        public Boolean isRequiredParameter;

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

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
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

    }

    public static class ListDataServiceApisResponseBodyDataApisWizardDetailsWizardResponseParameters extends TeaModel {
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        @NameInMap("ExampleValue")
        public String exampleValue;

        public static ListDataServiceApisResponseBodyDataApisWizardDetailsWizardResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseBodyDataApisWizardDetailsWizardResponseParameters self = new ListDataServiceApisResponseBodyDataApisWizardDetailsWizardResponseParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardResponseParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardResponseParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

    }

    public static class ListDataServiceApisResponseBodyDataApisWizardDetailsWizardConnection extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("ConnectionId")
        public Long connectionId;

        public static ListDataServiceApisResponseBodyDataApisWizardDetailsWizardConnection build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseBodyDataApisWizardDetailsWizardConnection self = new ListDataServiceApisResponseBodyDataApisWizardDetailsWizardConnection();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardConnection setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardConnection setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

    }

    public static class ListDataServiceApisResponseBodyDataApisWizardDetails extends TeaModel {
        @NameInMap("IsPagedResponse")
        public Boolean isPagedResponse;

        @NameInMap("WizardRequestParameters")
        public java.util.List<ListDataServiceApisResponseBodyDataApisWizardDetailsWizardRequestParameters> wizardRequestParameters;

        @NameInMap("WizardResponseParameters")
        public java.util.List<ListDataServiceApisResponseBodyDataApisWizardDetailsWizardResponseParameters> wizardResponseParameters;

        @NameInMap("WizardConnection")
        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardConnection wizardConnection;

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

        public ListDataServiceApisResponseBodyDataApisWizardDetails setWizardConnection(ListDataServiceApisResponseBodyDataApisWizardDetailsWizardConnection wizardConnection) {
            this.wizardConnection = wizardConnection;
            return this;
        }
        public ListDataServiceApisResponseBodyDataApisWizardDetailsWizardConnection getWizardConnection() {
            return this.wizardConnection;
        }

    }

    public static class ListDataServiceApisResponseBodyDataApis extends TeaModel {
        @NameInMap("Timeout")
        public Integer timeout;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("ApiId")
        public Long apiId;

        @NameInMap("ApiMode")
        public Integer apiMode;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("ResponseContentType")
        public Integer responseContentType;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("VisibleRange")
        public Integer visibleRange;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OperatorId")
        public String operatorId;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Description")
        public String description;

        @NameInMap("FolderId")
        public Long folderId;

        @NameInMap("RequestMethod")
        public Integer requestMethod;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("ApiPath")
        public String apiPath;

        @NameInMap("Protocols")
        public java.util.List<Integer> protocols;

        @NameInMap("RegistrationDetails")
        public ListDataServiceApisResponseBodyDataApisRegistrationDetails registrationDetails;

        @NameInMap("ScriptDetails")
        public ListDataServiceApisResponseBodyDataApisScriptDetails scriptDetails;

        @NameInMap("WizardDetails")
        public ListDataServiceApisResponseBodyDataApisWizardDetails wizardDetails;

        public static ListDataServiceApisResponseBodyDataApis build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseBodyDataApis self = new ListDataServiceApisResponseBodyDataApis();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApisResponseBodyDataApis setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListDataServiceApisResponseBodyDataApis setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
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

        public ListDataServiceApisResponseBodyDataApis setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataServiceApisResponseBodyDataApis setResponseContentType(Integer responseContentType) {
            this.responseContentType = responseContentType;
            return this;
        }
        public Integer getResponseContentType() {
            return this.responseContentType;
        }

        public ListDataServiceApisResponseBodyDataApis setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDataServiceApisResponseBodyDataApis setVisibleRange(Integer visibleRange) {
            this.visibleRange = visibleRange;
            return this;
        }
        public Integer getVisibleRange() {
            return this.visibleRange;
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

        public ListDataServiceApisResponseBodyDataApis setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
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

        public ListDataServiceApisResponseBodyDataApis setRequestMethod(Integer requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }
        public Integer getRequestMethod() {
            return this.requestMethod;
        }

        public ListDataServiceApisResponseBodyDataApis setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDataServiceApisResponseBodyDataApis setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListDataServiceApisResponseBodyDataApis setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListDataServiceApisResponseBodyDataApis setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
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

        public ListDataServiceApisResponseBodyDataApis setScriptDetails(ListDataServiceApisResponseBodyDataApisScriptDetails scriptDetails) {
            this.scriptDetails = scriptDetails;
            return this;
        }
        public ListDataServiceApisResponseBodyDataApisScriptDetails getScriptDetails() {
            return this.scriptDetails;
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
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Apis")
        public java.util.List<ListDataServiceApisResponseBodyDataApis> apis;

        public static ListDataServiceApisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApisResponseBodyData self = new ListDataServiceApisResponseBodyData();
            return TeaModel.build(map, self);
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

        public ListDataServiceApisResponseBodyData setApis(java.util.List<ListDataServiceApisResponseBodyDataApis> apis) {
            this.apis = apis;
            return this;
        }
        public java.util.List<ListDataServiceApisResponseBodyDataApis> getApis() {
            return this.apis;
        }

    }

}
