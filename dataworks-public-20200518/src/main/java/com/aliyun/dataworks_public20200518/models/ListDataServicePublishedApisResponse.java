// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServicePublishedApisResponse extends TeaModel {
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
    public ListDataServicePublishedApisResponseData data;

    public static ListDataServicePublishedApisResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServicePublishedApisResponse self = new ListDataServicePublishedApisResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServicePublishedApisResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataServicePublishedApisResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataServicePublishedApisResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataServicePublishedApisResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServicePublishedApisResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataServicePublishedApisResponse setData(ListDataServicePublishedApisResponseData data) {
        this.data = data;
        return this;
    }
    public ListDataServicePublishedApisResponseData getData() {
        return this.data;
    }

    public static class ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationErrorCodes extends TeaModel {
        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("ErrorSolution")
        @Validation(required = true)
        public String errorSolution;

        public static ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationErrorCodes self = new ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationErrorCodes();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationErrorCodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationErrorCodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationErrorCodes setErrorSolution(String errorSolution) {
            this.errorSolution = errorSolution;
            return this;
        }
        public String getErrorSolution() {
            return this.errorSolution;
        }

    }

    public static class ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationRequestParameters extends TeaModel {
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

        public static ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationRequestParameters self = new ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationRequestParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        public ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

    }

    public static class ListDataServicePublishedApisResponseDataApisRegistrationDetails extends TeaModel {
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
        public java.util.List<ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationErrorCodes> registrationErrorCodes;

        @NameInMap("RegistrationRequestParameters")
        @Validation(required = true)
        public java.util.List<ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationRequestParameters> registrationRequestParameters;

        public static ListDataServicePublishedApisResponseDataApisRegistrationDetails build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseDataApisRegistrationDetails self = new ListDataServicePublishedApisResponseDataApisRegistrationDetails();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseDataApisRegistrationDetails setFailedResultSample(String failedResultSample) {
            this.failedResultSample = failedResultSample;
            return this;
        }
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        public ListDataServicePublishedApisResponseDataApisRegistrationDetails setServiceContentType(Integer serviceContentType) {
            this.serviceContentType = serviceContentType;
            return this;
        }
        public Integer getServiceContentType() {
            return this.serviceContentType;
        }

        public ListDataServicePublishedApisResponseDataApisRegistrationDetails setServiceHost(String serviceHost) {
            this.serviceHost = serviceHost;
            return this;
        }
        public String getServiceHost() {
            return this.serviceHost;
        }

        public ListDataServicePublishedApisResponseDataApisRegistrationDetails setServicePath(String servicePath) {
            this.servicePath = servicePath;
            return this;
        }
        public String getServicePath() {
            return this.servicePath;
        }

        public ListDataServicePublishedApisResponseDataApisRegistrationDetails setServiceRequestBodyDescription(String serviceRequestBodyDescription) {
            this.serviceRequestBodyDescription = serviceRequestBodyDescription;
            return this;
        }
        public String getServiceRequestBodyDescription() {
            return this.serviceRequestBodyDescription;
        }

        public ListDataServicePublishedApisResponseDataApisRegistrationDetails setSuccessfulResultSample(String successfulResultSample) {
            this.successfulResultSample = successfulResultSample;
            return this;
        }
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

        public ListDataServicePublishedApisResponseDataApisRegistrationDetails setRegistrationErrorCodes(java.util.List<ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationErrorCodes> registrationErrorCodes) {
            this.registrationErrorCodes = registrationErrorCodes;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationErrorCodes> getRegistrationErrorCodes() {
            return this.registrationErrorCodes;
        }

        public ListDataServicePublishedApisResponseDataApisRegistrationDetails setRegistrationRequestParameters(java.util.List<ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationRequestParameters> registrationRequestParameters) {
            this.registrationRequestParameters = registrationRequestParameters;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseDataApisRegistrationDetailsRegistrationRequestParameters> getRegistrationRequestParameters() {
            return this.registrationRequestParameters;
        }

    }

    public static class ListDataServicePublishedApisResponseDataApisScriptDetailsScriptErrorCodes extends TeaModel {
        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("ErrorSolution")
        @Validation(required = true)
        public String errorSolution;

        public static ListDataServicePublishedApisResponseDataApisScriptDetailsScriptErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseDataApisScriptDetailsScriptErrorCodes self = new ListDataServicePublishedApisResponseDataApisScriptDetailsScriptErrorCodes();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetailsScriptErrorCodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetailsScriptErrorCodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetailsScriptErrorCodes setErrorSolution(String errorSolution) {
            this.errorSolution = errorSolution;
            return this;
        }
        public String getErrorSolution() {
            return this.errorSolution;
        }

    }

    public static class ListDataServicePublishedApisResponseDataApisScriptDetailsScriptRequestParameters extends TeaModel {
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

        public static ListDataServicePublishedApisResponseDataApisScriptDetailsScriptRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseDataApisScriptDetailsScriptRequestParameters self = new ListDataServicePublishedApisResponseDataApisScriptDetailsScriptRequestParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetailsScriptRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetailsScriptRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetailsScriptRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetailsScriptRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetailsScriptRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetailsScriptRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetailsScriptRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetailsScriptRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

    }

    public static class ListDataServicePublishedApisResponseDataApisScriptDetailsScriptResponseParameters extends TeaModel {
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

        public static ListDataServicePublishedApisResponseDataApisScriptDetailsScriptResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseDataApisScriptDetailsScriptResponseParameters self = new ListDataServicePublishedApisResponseDataApisScriptDetailsScriptResponseParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetailsScriptResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetailsScriptResponseParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetailsScriptResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetailsScriptResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

    public static class ListDataServicePublishedApisResponseDataApisScriptDetailsScriptConnection extends TeaModel {
        @NameInMap("ConnectionId")
        @Validation(required = true)
        public Long connectionId;

        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        public static ListDataServicePublishedApisResponseDataApisScriptDetailsScriptConnection build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseDataApisScriptDetailsScriptConnection self = new ListDataServicePublishedApisResponseDataApisScriptDetailsScriptConnection();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetailsScriptConnection setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetailsScriptConnection setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ListDataServicePublishedApisResponseDataApisScriptDetails extends TeaModel {
        @NameInMap("FailedResultSample")
        @Validation(required = true)
        public String failedResultSample;

        @NameInMap("IsPagedResponse")
        @Validation(required = true)
        public Boolean isPagedResponse;

        @NameInMap("Script")
        @Validation(required = true)
        public String script;

        @NameInMap("SuccessfulResultSample")
        @Validation(required = true)
        public String successfulResultSample;

        @NameInMap("ScriptErrorCodes")
        @Validation(required = true)
        public java.util.List<ListDataServicePublishedApisResponseDataApisScriptDetailsScriptErrorCodes> scriptErrorCodes;

        @NameInMap("ScriptRequestParameters")
        @Validation(required = true)
        public java.util.List<ListDataServicePublishedApisResponseDataApisScriptDetailsScriptRequestParameters> scriptRequestParameters;

        @NameInMap("ScriptResponseParameters")
        @Validation(required = true)
        public java.util.List<ListDataServicePublishedApisResponseDataApisScriptDetailsScriptResponseParameters> scriptResponseParameters;

        @NameInMap("ScriptConnection")
        @Validation(required = true)
        public ListDataServicePublishedApisResponseDataApisScriptDetailsScriptConnection scriptConnection;

        public static ListDataServicePublishedApisResponseDataApisScriptDetails build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseDataApisScriptDetails self = new ListDataServicePublishedApisResponseDataApisScriptDetails();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetails setFailedResultSample(String failedResultSample) {
            this.failedResultSample = failedResultSample;
            return this;
        }
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetails setIsPagedResponse(Boolean isPagedResponse) {
            this.isPagedResponse = isPagedResponse;
            return this;
        }
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetails setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetails setSuccessfulResultSample(String successfulResultSample) {
            this.successfulResultSample = successfulResultSample;
            return this;
        }
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetails setScriptErrorCodes(java.util.List<ListDataServicePublishedApisResponseDataApisScriptDetailsScriptErrorCodes> scriptErrorCodes) {
            this.scriptErrorCodes = scriptErrorCodes;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseDataApisScriptDetailsScriptErrorCodes> getScriptErrorCodes() {
            return this.scriptErrorCodes;
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetails setScriptRequestParameters(java.util.List<ListDataServicePublishedApisResponseDataApisScriptDetailsScriptRequestParameters> scriptRequestParameters) {
            this.scriptRequestParameters = scriptRequestParameters;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseDataApisScriptDetailsScriptRequestParameters> getScriptRequestParameters() {
            return this.scriptRequestParameters;
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetails setScriptResponseParameters(java.util.List<ListDataServicePublishedApisResponseDataApisScriptDetailsScriptResponseParameters> scriptResponseParameters) {
            this.scriptResponseParameters = scriptResponseParameters;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseDataApisScriptDetailsScriptResponseParameters> getScriptResponseParameters() {
            return this.scriptResponseParameters;
        }

        public ListDataServicePublishedApisResponseDataApisScriptDetails setScriptConnection(ListDataServicePublishedApisResponseDataApisScriptDetailsScriptConnection scriptConnection) {
            this.scriptConnection = scriptConnection;
            return this;
        }
        public ListDataServicePublishedApisResponseDataApisScriptDetailsScriptConnection getScriptConnection() {
            return this.scriptConnection;
        }

    }

    public static class ListDataServicePublishedApisResponseDataApisWizardDetailsWizardErrorCodes extends TeaModel {
        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("ErrorSolution")
        @Validation(required = true)
        public String errorSolution;

        public static ListDataServicePublishedApisResponseDataApisWizardDetailsWizardErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseDataApisWizardDetailsWizardErrorCodes self = new ListDataServicePublishedApisResponseDataApisWizardDetailsWizardErrorCodes();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetailsWizardErrorCodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetailsWizardErrorCodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetailsWizardErrorCodes setErrorSolution(String errorSolution) {
            this.errorSolution = errorSolution;
            return this;
        }
        public String getErrorSolution() {
            return this.errorSolution;
        }

    }

    public static class ListDataServicePublishedApisResponseDataApisWizardDetailsWizardRequestParameters extends TeaModel {
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

        public static ListDataServicePublishedApisResponseDataApisWizardDetailsWizardRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseDataApisWizardDetailsWizardRequestParameters self = new ListDataServicePublishedApisResponseDataApisWizardDetailsWizardRequestParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetailsWizardRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetailsWizardRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetailsWizardRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetailsWizardRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetailsWizardRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetailsWizardRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetailsWizardRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetailsWizardRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

    }

    public static class ListDataServicePublishedApisResponseDataApisWizardDetailsWizardResponseParameters extends TeaModel {
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

        public static ListDataServicePublishedApisResponseDataApisWizardDetailsWizardResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseDataApisWizardDetailsWizardResponseParameters self = new ListDataServicePublishedApisResponseDataApisWizardDetailsWizardResponseParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetailsWizardResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetailsWizardResponseParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetailsWizardResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetailsWizardResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

    public static class ListDataServicePublishedApisResponseDataApisWizardDetailsWizardConnection extends TeaModel {
        @NameInMap("ConnectionId")
        @Validation(required = true)
        public Long connectionId;

        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        public static ListDataServicePublishedApisResponseDataApisWizardDetailsWizardConnection build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseDataApisWizardDetailsWizardConnection self = new ListDataServicePublishedApisResponseDataApisWizardDetailsWizardConnection();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetailsWizardConnection setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetailsWizardConnection setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ListDataServicePublishedApisResponseDataApisWizardDetails extends TeaModel {
        @NameInMap("FailedResultSample")
        @Validation(required = true)
        public String failedResultSample;

        @NameInMap("IsPagedResponse")
        @Validation(required = true)
        public Boolean isPagedResponse;

        @NameInMap("SuccessfulResultSample")
        @Validation(required = true)
        public String successfulResultSample;

        @NameInMap("WizardErrorCodes")
        @Validation(required = true)
        public java.util.List<ListDataServicePublishedApisResponseDataApisWizardDetailsWizardErrorCodes> wizardErrorCodes;

        @NameInMap("WizardRequestParameters")
        @Validation(required = true)
        public java.util.List<ListDataServicePublishedApisResponseDataApisWizardDetailsWizardRequestParameters> wizardRequestParameters;

        @NameInMap("WizardResponseParameters")
        @Validation(required = true)
        public java.util.List<ListDataServicePublishedApisResponseDataApisWizardDetailsWizardResponseParameters> wizardResponseParameters;

        @NameInMap("WizardConnection")
        @Validation(required = true)
        public ListDataServicePublishedApisResponseDataApisWizardDetailsWizardConnection wizardConnection;

        public static ListDataServicePublishedApisResponseDataApisWizardDetails build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseDataApisWizardDetails self = new ListDataServicePublishedApisResponseDataApisWizardDetails();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetails setFailedResultSample(String failedResultSample) {
            this.failedResultSample = failedResultSample;
            return this;
        }
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetails setIsPagedResponse(Boolean isPagedResponse) {
            this.isPagedResponse = isPagedResponse;
            return this;
        }
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetails setSuccessfulResultSample(String successfulResultSample) {
            this.successfulResultSample = successfulResultSample;
            return this;
        }
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetails setWizardErrorCodes(java.util.List<ListDataServicePublishedApisResponseDataApisWizardDetailsWizardErrorCodes> wizardErrorCodes) {
            this.wizardErrorCodes = wizardErrorCodes;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseDataApisWizardDetailsWizardErrorCodes> getWizardErrorCodes() {
            return this.wizardErrorCodes;
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetails setWizardRequestParameters(java.util.List<ListDataServicePublishedApisResponseDataApisWizardDetailsWizardRequestParameters> wizardRequestParameters) {
            this.wizardRequestParameters = wizardRequestParameters;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseDataApisWizardDetailsWizardRequestParameters> getWizardRequestParameters() {
            return this.wizardRequestParameters;
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetails setWizardResponseParameters(java.util.List<ListDataServicePublishedApisResponseDataApisWizardDetailsWizardResponseParameters> wizardResponseParameters) {
            this.wizardResponseParameters = wizardResponseParameters;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseDataApisWizardDetailsWizardResponseParameters> getWizardResponseParameters() {
            return this.wizardResponseParameters;
        }

        public ListDataServicePublishedApisResponseDataApisWizardDetails setWizardConnection(ListDataServicePublishedApisResponseDataApisWizardDetailsWizardConnection wizardConnection) {
            this.wizardConnection = wizardConnection;
            return this;
        }
        public ListDataServicePublishedApisResponseDataApisWizardDetailsWizardConnection getWizardConnection() {
            return this.wizardConnection;
        }

    }

    public static class ListDataServicePublishedApisResponseDataApis extends TeaModel {
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

        @NameInMap("RegistrationDetails")
        @Validation(required = true)
        public ListDataServicePublishedApisResponseDataApisRegistrationDetails registrationDetails;

        @NameInMap("ScriptDetails")
        @Validation(required = true)
        public ListDataServicePublishedApisResponseDataApisScriptDetails scriptDetails;

        @NameInMap("WizardDetails")
        @Validation(required = true)
        public ListDataServicePublishedApisResponseDataApisWizardDetails wizardDetails;

        @NameInMap("Protocols")
        @Validation(required = true)
        public java.util.List<Integer> protocols;

        public static ListDataServicePublishedApisResponseDataApis build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseDataApis self = new ListDataServicePublishedApisResponseDataApis();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseDataApis setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListDataServicePublishedApisResponseDataApis setApiMode(Integer apiMode) {
            this.apiMode = apiMode;
            return this;
        }
        public Integer getApiMode() {
            return this.apiMode;
        }

        public ListDataServicePublishedApisResponseDataApis setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListDataServicePublishedApisResponseDataApis setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

        public ListDataServicePublishedApisResponseDataApis setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDataServicePublishedApisResponseDataApis setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDataServicePublishedApisResponseDataApis setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataServicePublishedApisResponseDataApis setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListDataServicePublishedApisResponseDataApis setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListDataServicePublishedApisResponseDataApis setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public ListDataServicePublishedApisResponseDataApis setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataServicePublishedApisResponseDataApis setRequestMethod(Integer requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }
        public Integer getRequestMethod() {
            return this.requestMethod;
        }

        public ListDataServicePublishedApisResponseDataApis setResponseContentType(Integer responseContentType) {
            this.responseContentType = responseContentType;
            return this;
        }
        public Integer getResponseContentType() {
            return this.responseContentType;
        }

        public ListDataServicePublishedApisResponseDataApis setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDataServicePublishedApisResponseDataApis setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListDataServicePublishedApisResponseDataApis setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListDataServicePublishedApisResponseDataApis setVisibleRange(Integer visibleRange) {
            this.visibleRange = visibleRange;
            return this;
        }
        public Integer getVisibleRange() {
            return this.visibleRange;
        }

        public ListDataServicePublishedApisResponseDataApis setRegistrationDetails(ListDataServicePublishedApisResponseDataApisRegistrationDetails registrationDetails) {
            this.registrationDetails = registrationDetails;
            return this;
        }
        public ListDataServicePublishedApisResponseDataApisRegistrationDetails getRegistrationDetails() {
            return this.registrationDetails;
        }

        public ListDataServicePublishedApisResponseDataApis setScriptDetails(ListDataServicePublishedApisResponseDataApisScriptDetails scriptDetails) {
            this.scriptDetails = scriptDetails;
            return this;
        }
        public ListDataServicePublishedApisResponseDataApisScriptDetails getScriptDetails() {
            return this.scriptDetails;
        }

        public ListDataServicePublishedApisResponseDataApis setWizardDetails(ListDataServicePublishedApisResponseDataApisWizardDetails wizardDetails) {
            this.wizardDetails = wizardDetails;
            return this;
        }
        public ListDataServicePublishedApisResponseDataApisWizardDetails getWizardDetails() {
            return this.wizardDetails;
        }

        public ListDataServicePublishedApisResponseDataApis setProtocols(java.util.List<Integer> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<Integer> getProtocols() {
            return this.protocols;
        }

    }

    public static class ListDataServicePublishedApisResponseData extends TeaModel {
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
        public java.util.List<ListDataServicePublishedApisResponseDataApis> apis;

        public static ListDataServicePublishedApisResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseData self = new ListDataServicePublishedApisResponseData();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataServicePublishedApisResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataServicePublishedApisResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListDataServicePublishedApisResponseData setApis(java.util.List<ListDataServicePublishedApisResponseDataApis> apis) {
            this.apis = apis;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseDataApis> getApis() {
            return this.apis;
        }

    }

}
