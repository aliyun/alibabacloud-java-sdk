// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceApiResponseBody extends TeaModel {
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
    public GetDataServiceApiResponseBodyData data;

    public static GetDataServiceApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiResponseBody self = new GetDataServiceApiResponseBody();
        return TeaModel.build(map, self);
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

    public GetDataServiceApiResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataServiceApiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDataServiceApiResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataServiceApiResponseBody setData(GetDataServiceApiResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataServiceApiResponseBodyData getData() {
        return this.data;
    }

    public static class GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorSolution")
        public String errorSolution;

        public static GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes self = new GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
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

        public GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
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

    }

    public static class GetDataServiceApiResponseBodyDataRegistrationDetails extends TeaModel {
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
        public java.util.List<GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes> registrationErrorCodes;

        @NameInMap("RegistrationRequestParameters")
        public java.util.List<GetDataServiceApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters> registrationRequestParameters;

        public static GetDataServiceApiResponseBodyDataRegistrationDetails build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseBodyDataRegistrationDetails self = new GetDataServiceApiResponseBodyDataRegistrationDetails();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetails setServiceHost(String serviceHost) {
            this.serviceHost = serviceHost;
            return this;
        }
        public String getServiceHost() {
            return this.serviceHost;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetails setServiceContentType(Integer serviceContentType) {
            this.serviceContentType = serviceContentType;
            return this;
        }
        public Integer getServiceContentType() {
            return this.serviceContentType;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetails setServicePath(String servicePath) {
            this.servicePath = servicePath;
            return this;
        }
        public String getServicePath() {
            return this.servicePath;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetails setSuccessfulResultSample(String successfulResultSample) {
            this.successfulResultSample = successfulResultSample;
            return this;
        }
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetails setFailedResultSample(String failedResultSample) {
            this.failedResultSample = failedResultSample;
            return this;
        }
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        public GetDataServiceApiResponseBodyDataRegistrationDetails setServiceRequestBodyDescription(String serviceRequestBodyDescription) {
            this.serviceRequestBodyDescription = serviceRequestBodyDescription;
            return this;
        }
        public String getServiceRequestBodyDescription() {
            return this.serviceRequestBodyDescription;
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

    }

    public static class GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters extends TeaModel {
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

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
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

    }

    public static class GetDataServiceApiResponseBodyDataScriptDetailsScriptResponseParameters extends TeaModel {
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

        public static GetDataServiceApiResponseBodyDataScriptDetailsScriptResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseBodyDataScriptDetailsScriptResponseParameters self = new GetDataServiceApiResponseBodyDataScriptDetailsScriptResponseParameters();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptResponseParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptResponseParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

    }

    public static class GetDataServiceApiResponseBodyDataScriptDetailsScriptConnection extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("ConnectionId")
        public Long connectionId;

        public static GetDataServiceApiResponseBodyDataScriptDetailsScriptConnection build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseBodyDataScriptDetailsScriptConnection self = new GetDataServiceApiResponseBodyDataScriptDetailsScriptConnection();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptConnection setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetDataServiceApiResponseBodyDataScriptDetailsScriptConnection setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

    }

    public static class GetDataServiceApiResponseBodyDataScriptDetails extends TeaModel {
        @NameInMap("Script")
        public String script;

        @NameInMap("IsPagedResponse")
        public Boolean isPagedResponse;

        @NameInMap("ScriptRequestParameters")
        public java.util.List<GetDataServiceApiResponseBodyDataScriptDetailsScriptRequestParameters> scriptRequestParameters;

        @NameInMap("ScriptResponseParameters")
        public java.util.List<GetDataServiceApiResponseBodyDataScriptDetailsScriptResponseParameters> scriptResponseParameters;

        @NameInMap("ScriptConnection")
        public GetDataServiceApiResponseBodyDataScriptDetailsScriptConnection scriptConnection;

        public static GetDataServiceApiResponseBodyDataScriptDetails build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseBodyDataScriptDetails self = new GetDataServiceApiResponseBodyDataScriptDetails();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseBodyDataScriptDetails setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public GetDataServiceApiResponseBodyDataScriptDetails setIsPagedResponse(Boolean isPagedResponse) {
            this.isPagedResponse = isPagedResponse;
            return this;
        }
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
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

        public GetDataServiceApiResponseBodyDataScriptDetails setScriptConnection(GetDataServiceApiResponseBodyDataScriptDetailsScriptConnection scriptConnection) {
            this.scriptConnection = scriptConnection;
            return this;
        }
        public GetDataServiceApiResponseBodyDataScriptDetailsScriptConnection getScriptConnection() {
            return this.scriptConnection;
        }

    }

    public static class GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters extends TeaModel {
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

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
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

    }

    public static class GetDataServiceApiResponseBodyDataWizardDetailsWizardResponseParameters extends TeaModel {
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

        public static GetDataServiceApiResponseBodyDataWizardDetailsWizardResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseBodyDataWizardDetailsWizardResponseParameters self = new GetDataServiceApiResponseBodyDataWizardDetailsWizardResponseParameters();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardResponseParameters setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardResponseParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

    }

    public static class GetDataServiceApiResponseBodyDataWizardDetailsWizardConnection extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("ConnectionId")
        public Long connectionId;

        public static GetDataServiceApiResponseBodyDataWizardDetailsWizardConnection build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseBodyDataWizardDetailsWizardConnection self = new GetDataServiceApiResponseBodyDataWizardDetailsWizardConnection();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardConnection setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetDataServiceApiResponseBodyDataWizardDetailsWizardConnection setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

    }

    public static class GetDataServiceApiResponseBodyDataWizardDetails extends TeaModel {
        @NameInMap("IsPagedResponse")
        public Boolean isPagedResponse;

        @NameInMap("WizardRequestParameters")
        public java.util.List<GetDataServiceApiResponseBodyDataWizardDetailsWizardRequestParameters> wizardRequestParameters;

        @NameInMap("WizardResponseParameters")
        public java.util.List<GetDataServiceApiResponseBodyDataWizardDetailsWizardResponseParameters> wizardResponseParameters;

        @NameInMap("WizardConnection")
        public GetDataServiceApiResponseBodyDataWizardDetailsWizardConnection wizardConnection;

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

        public GetDataServiceApiResponseBodyDataWizardDetails setWizardConnection(GetDataServiceApiResponseBodyDataWizardDetailsWizardConnection wizardConnection) {
            this.wizardConnection = wizardConnection;
            return this;
        }
        public GetDataServiceApiResponseBodyDataWizardDetailsWizardConnection getWizardConnection() {
            return this.wizardConnection;
        }

    }

    public static class GetDataServiceApiResponseBodyData extends TeaModel {
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
        public GetDataServiceApiResponseBodyDataRegistrationDetails registrationDetails;

        @NameInMap("ScriptDetails")
        public GetDataServiceApiResponseBodyDataScriptDetails scriptDetails;

        @NameInMap("WizardDetails")
        public GetDataServiceApiResponseBodyDataWizardDetails wizardDetails;

        public static GetDataServiceApiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiResponseBodyData self = new GetDataServiceApiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiResponseBodyData setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public GetDataServiceApiResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
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

        public GetDataServiceApiResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataServiceApiResponseBodyData setResponseContentType(Integer responseContentType) {
            this.responseContentType = responseContentType;
            return this;
        }
        public Integer getResponseContentType() {
            return this.responseContentType;
        }

        public GetDataServiceApiResponseBodyData setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetDataServiceApiResponseBodyData setVisibleRange(Integer visibleRange) {
            this.visibleRange = visibleRange;
            return this;
        }
        public Integer getVisibleRange() {
            return this.visibleRange;
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

        public GetDataServiceApiResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
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

        public GetDataServiceApiResponseBodyData setRequestMethod(Integer requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }
        public Integer getRequestMethod() {
            return this.requestMethod;
        }

        public GetDataServiceApiResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetDataServiceApiResponseBodyData setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetDataServiceApiResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetDataServiceApiResponseBodyData setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
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

        public GetDataServiceApiResponseBodyData setScriptDetails(GetDataServiceApiResponseBodyDataScriptDetails scriptDetails) {
            this.scriptDetails = scriptDetails;
            return this;
        }
        public GetDataServiceApiResponseBodyDataScriptDetails getScriptDetails() {
            return this.scriptDetails;
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
