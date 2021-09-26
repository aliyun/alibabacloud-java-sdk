// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServicePublishedApiResponseBody extends TeaModel {
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
    public GetDataServicePublishedApiResponseBodyData data;

    public static GetDataServicePublishedApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataServicePublishedApiResponseBody self = new GetDataServicePublishedApiResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataServicePublishedApiResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataServicePublishedApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataServicePublishedApiResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataServicePublishedApiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDataServicePublishedApiResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataServicePublishedApiResponseBody setData(GetDataServicePublishedApiResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataServicePublishedApiResponseBodyData getData() {
        return this.data;
    }

    public static class GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorSolution")
        public String errorSolution;

        public static GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes self = new GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes setErrorSolution(String errorSolution) {
            this.errorSolution = errorSolution;
            return this;
        }
        public String getErrorSolution() {
            return this.errorSolution;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters extends TeaModel {
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

        @NameInMap("ExampleValue")
        public String exampleValue;

        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        @NameInMap("IsRequiredParameter")
        public Boolean isRequiredParameter;

        public static GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters self = new GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataRegistrationDetails extends TeaModel {
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
        public java.util.List<GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes> registrationErrorCodes;

        @NameInMap("RegistrationRequestParameters")
        public java.util.List<GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters> registrationRequestParameters;

        public static GetDataServicePublishedApiResponseBodyDataRegistrationDetails build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataRegistrationDetails self = new GetDataServicePublishedApiResponseBodyDataRegistrationDetails();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetails setServiceHost(String serviceHost) {
            this.serviceHost = serviceHost;
            return this;
        }
        public String getServiceHost() {
            return this.serviceHost;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetails setServiceContentType(Integer serviceContentType) {
            this.serviceContentType = serviceContentType;
            return this;
        }
        public Integer getServiceContentType() {
            return this.serviceContentType;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetails setServicePath(String servicePath) {
            this.servicePath = servicePath;
            return this;
        }
        public String getServicePath() {
            return this.servicePath;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetails setSuccessfulResultSample(String successfulResultSample) {
            this.successfulResultSample = successfulResultSample;
            return this;
        }
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetails setFailedResultSample(String failedResultSample) {
            this.failedResultSample = failedResultSample;
            return this;
        }
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetails setServiceRequestBodyDescription(String serviceRequestBodyDescription) {
            this.serviceRequestBodyDescription = serviceRequestBodyDescription;
            return this;
        }
        public String getServiceRequestBodyDescription() {
            return this.serviceRequestBodyDescription;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetails setRegistrationErrorCodes(java.util.List<GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes> registrationErrorCodes) {
            this.registrationErrorCodes = registrationErrorCodes;
            return this;
        }
        public java.util.List<GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationErrorCodes> getRegistrationErrorCodes() {
            return this.registrationErrorCodes;
        }

        public GetDataServicePublishedApiResponseBodyDataRegistrationDetails setRegistrationRequestParameters(java.util.List<GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters> registrationRequestParameters) {
            this.registrationRequestParameters = registrationRequestParameters;
            return this;
        }
        public java.util.List<GetDataServicePublishedApiResponseBodyDataRegistrationDetailsRegistrationRequestParameters> getRegistrationRequestParameters() {
            return this.registrationRequestParameters;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptErrorCodes extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorSolution")
        public String errorSolution;

        public static GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptErrorCodes self = new GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptErrorCodes();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptErrorCodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptErrorCodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptErrorCodes setErrorSolution(String errorSolution) {
            this.errorSolution = errorSolution;
            return this;
        }
        public String getErrorSolution() {
            return this.errorSolution;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters extends TeaModel {
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

        @NameInMap("ExampleValue")
        public String exampleValue;

        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        @NameInMap("IsRequiredParameter")
        public Boolean isRequiredParameter;

        public static GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters self = new GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptResponseParameters extends TeaModel {
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ExampleValue")
        public String exampleValue;

        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        public static GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptResponseParameters self = new GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptResponseParameters();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptResponseParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptConnection extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("ConnectionId")
        public Long connectionId;

        public static GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptConnection build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptConnection self = new GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptConnection();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptConnection setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptConnection setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataScriptDetails extends TeaModel {
        @NameInMap("IsPagedResponse")
        public Boolean isPagedResponse;

        @NameInMap("SuccessfulResultSample")
        public String successfulResultSample;

        @NameInMap("FailedResultSample")
        public String failedResultSample;

        @NameInMap("Script")
        public String script;

        @NameInMap("ScriptErrorCodes")
        public java.util.List<GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptErrorCodes> scriptErrorCodes;

        @NameInMap("ScriptRequestParameters")
        public java.util.List<GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters> scriptRequestParameters;

        @NameInMap("ScriptResponseParameters")
        public java.util.List<GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptResponseParameters> scriptResponseParameters;

        @NameInMap("ScriptConnection")
        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptConnection scriptConnection;

        public static GetDataServicePublishedApiResponseBodyDataScriptDetails build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataScriptDetails self = new GetDataServicePublishedApiResponseBodyDataScriptDetails();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetails setIsPagedResponse(Boolean isPagedResponse) {
            this.isPagedResponse = isPagedResponse;
            return this;
        }
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetails setSuccessfulResultSample(String successfulResultSample) {
            this.successfulResultSample = successfulResultSample;
            return this;
        }
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetails setFailedResultSample(String failedResultSample) {
            this.failedResultSample = failedResultSample;
            return this;
        }
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetails setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetails setScriptErrorCodes(java.util.List<GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptErrorCodes> scriptErrorCodes) {
            this.scriptErrorCodes = scriptErrorCodes;
            return this;
        }
        public java.util.List<GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptErrorCodes> getScriptErrorCodes() {
            return this.scriptErrorCodes;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetails setScriptRequestParameters(java.util.List<GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters> scriptRequestParameters) {
            this.scriptRequestParameters = scriptRequestParameters;
            return this;
        }
        public java.util.List<GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptRequestParameters> getScriptRequestParameters() {
            return this.scriptRequestParameters;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetails setScriptResponseParameters(java.util.List<GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptResponseParameters> scriptResponseParameters) {
            this.scriptResponseParameters = scriptResponseParameters;
            return this;
        }
        public java.util.List<GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptResponseParameters> getScriptResponseParameters() {
            return this.scriptResponseParameters;
        }

        public GetDataServicePublishedApiResponseBodyDataScriptDetails setScriptConnection(GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptConnection scriptConnection) {
            this.scriptConnection = scriptConnection;
            return this;
        }
        public GetDataServicePublishedApiResponseBodyDataScriptDetailsScriptConnection getScriptConnection() {
            return this.scriptConnection;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardErrorCodes extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorSolution")
        public String errorSolution;

        public static GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardErrorCodes self = new GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardErrorCodes();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardErrorCodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardErrorCodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardErrorCodes setErrorSolution(String errorSolution) {
            this.errorSolution = errorSolution;
            return this;
        }
        public String getErrorSolution() {
            return this.errorSolution;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters extends TeaModel {
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

        @NameInMap("ExampleValue")
        public String exampleValue;

        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        @NameInMap("IsRequiredParameter")
        public Boolean isRequiredParameter;

        public static GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters self = new GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardResponseParameters extends TeaModel {
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ExampleValue")
        public String exampleValue;

        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        public static GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardResponseParameters self = new GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardResponseParameters();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardResponseParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardConnection extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("ConnectionId")
        public Long connectionId;

        public static GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardConnection build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardConnection self = new GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardConnection();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardConnection setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardConnection setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyDataWizardDetails extends TeaModel {
        @NameInMap("IsPagedResponse")
        public Boolean isPagedResponse;

        @NameInMap("SuccessfulResultSample")
        public String successfulResultSample;

        @NameInMap("FailedResultSample")
        public String failedResultSample;

        @NameInMap("WizardErrorCodes")
        public java.util.List<GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardErrorCodes> wizardErrorCodes;

        @NameInMap("WizardRequestParameters")
        public java.util.List<GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters> wizardRequestParameters;

        @NameInMap("WizardResponseParameters")
        public java.util.List<GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardResponseParameters> wizardResponseParameters;

        @NameInMap("WizardConnection")
        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardConnection wizardConnection;

        public static GetDataServicePublishedApiResponseBodyDataWizardDetails build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyDataWizardDetails self = new GetDataServicePublishedApiResponseBodyDataWizardDetails();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetails setIsPagedResponse(Boolean isPagedResponse) {
            this.isPagedResponse = isPagedResponse;
            return this;
        }
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetails setSuccessfulResultSample(String successfulResultSample) {
            this.successfulResultSample = successfulResultSample;
            return this;
        }
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetails setFailedResultSample(String failedResultSample) {
            this.failedResultSample = failedResultSample;
            return this;
        }
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetails setWizardErrorCodes(java.util.List<GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardErrorCodes> wizardErrorCodes) {
            this.wizardErrorCodes = wizardErrorCodes;
            return this;
        }
        public java.util.List<GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardErrorCodes> getWizardErrorCodes() {
            return this.wizardErrorCodes;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetails setWizardRequestParameters(java.util.List<GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters> wizardRequestParameters) {
            this.wizardRequestParameters = wizardRequestParameters;
            return this;
        }
        public java.util.List<GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardRequestParameters> getWizardRequestParameters() {
            return this.wizardRequestParameters;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetails setWizardResponseParameters(java.util.List<GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardResponseParameters> wizardResponseParameters) {
            this.wizardResponseParameters = wizardResponseParameters;
            return this;
        }
        public java.util.List<GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardResponseParameters> getWizardResponseParameters() {
            return this.wizardResponseParameters;
        }

        public GetDataServicePublishedApiResponseBodyDataWizardDetails setWizardConnection(GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardConnection wizardConnection) {
            this.wizardConnection = wizardConnection;
            return this;
        }
        public GetDataServicePublishedApiResponseBodyDataWizardDetailsWizardConnection getWizardConnection() {
            return this.wizardConnection;
        }

    }

    public static class GetDataServicePublishedApiResponseBodyData extends TeaModel {
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
        public GetDataServicePublishedApiResponseBodyDataRegistrationDetails registrationDetails;

        @NameInMap("ScriptDetails")
        public GetDataServicePublishedApiResponseBodyDataScriptDetails scriptDetails;

        @NameInMap("WizardDetails")
        public GetDataServicePublishedApiResponseBodyDataWizardDetails wizardDetails;

        public static GetDataServicePublishedApiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseBodyData self = new GetDataServicePublishedApiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataServicePublishedApiResponseBodyData setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public GetDataServicePublishedApiResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetDataServicePublishedApiResponseBodyData setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public GetDataServicePublishedApiResponseBodyData setApiMode(Integer apiMode) {
            this.apiMode = apiMode;
            return this;
        }
        public Integer getApiMode() {
            return this.apiMode;
        }

        public GetDataServicePublishedApiResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDataServicePublishedApiResponseBodyData setResponseContentType(Integer responseContentType) {
            this.responseContentType = responseContentType;
            return this;
        }
        public Integer getResponseContentType() {
            return this.responseContentType;
        }

        public GetDataServicePublishedApiResponseBodyData setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetDataServicePublishedApiResponseBodyData setVisibleRange(Integer visibleRange) {
            this.visibleRange = visibleRange;
            return this;
        }
        public Integer getVisibleRange() {
            return this.visibleRange;
        }

        public GetDataServicePublishedApiResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetDataServicePublishedApiResponseBodyData setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public GetDataServicePublishedApiResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetDataServicePublishedApiResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataServicePublishedApiResponseBodyData setRequestMethod(Integer requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }
        public Integer getRequestMethod() {
            return this.requestMethod;
        }

        public GetDataServicePublishedApiResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetDataServicePublishedApiResponseBodyData setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetDataServicePublishedApiResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetDataServicePublishedApiResponseBodyData setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

        public GetDataServicePublishedApiResponseBodyData setProtocols(java.util.List<Integer> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<Integer> getProtocols() {
            return this.protocols;
        }

        public GetDataServicePublishedApiResponseBodyData setRegistrationDetails(GetDataServicePublishedApiResponseBodyDataRegistrationDetails registrationDetails) {
            this.registrationDetails = registrationDetails;
            return this;
        }
        public GetDataServicePublishedApiResponseBodyDataRegistrationDetails getRegistrationDetails() {
            return this.registrationDetails;
        }

        public GetDataServicePublishedApiResponseBodyData setScriptDetails(GetDataServicePublishedApiResponseBodyDataScriptDetails scriptDetails) {
            this.scriptDetails = scriptDetails;
            return this;
        }
        public GetDataServicePublishedApiResponseBodyDataScriptDetails getScriptDetails() {
            return this.scriptDetails;
        }

        public GetDataServicePublishedApiResponseBodyData setWizardDetails(GetDataServicePublishedApiResponseBodyDataWizardDetails wizardDetails) {
            this.wizardDetails = wizardDetails;
            return this;
        }
        public GetDataServicePublishedApiResponseBodyDataWizardDetails getWizardDetails() {
            return this.wizardDetails;
        }

    }

}
