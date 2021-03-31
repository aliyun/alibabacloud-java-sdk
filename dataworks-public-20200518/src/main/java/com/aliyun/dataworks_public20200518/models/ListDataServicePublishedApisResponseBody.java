// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServicePublishedApisResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public ListDataServicePublishedApisResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ListDataServicePublishedApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataServicePublishedApisResponseBody self = new ListDataServicePublishedApisResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataServicePublishedApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServicePublishedApisResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataServicePublishedApisResponseBody setData(ListDataServicePublishedApisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataServicePublishedApisResponseBodyData getData() {
        return this.data;
    }

    public ListDataServicePublishedApisResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataServicePublishedApisResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataServicePublishedApisResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardErrorCodes extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorSolution")
        public String errorSolution;

        public static ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardErrorCodes self = new ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardErrorCodes();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardErrorCodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardErrorCodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardErrorCodes setErrorSolution(String errorSolution) {
            this.errorSolution = errorSolution;
            return this;
        }
        public String getErrorSolution() {
            return this.errorSolution;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardResponseParameters extends TeaModel {
        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterDescription")
        public String parameterDescription;

        @NameInMap("ExampleValue")
        public String exampleValue;

        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        public static ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardResponseParameters self = new ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardResponseParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardResponseParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardConnection extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("ConnectionId")
        public Long connectionId;

        public static ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardConnection build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardConnection self = new ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardConnection();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardConnection setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardConnection setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters extends TeaModel {
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

        public static ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters self = new ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisWizardDetails extends TeaModel {
        @NameInMap("WizardErrorCodes")
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardErrorCodes> wizardErrorCodes;

        @NameInMap("WizardResponseParameters")
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardResponseParameters> wizardResponseParameters;

        @NameInMap("IsPagedResponse")
        public Boolean isPagedResponse;

        @NameInMap("SuccessfulResultSample")
        public String successfulResultSample;

        @NameInMap("WizardConnection")
        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardConnection wizardConnection;

        @NameInMap("FailedResultSample")
        public String failedResultSample;

        @NameInMap("WizardRequestParameters")
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters> wizardRequestParameters;

        public static ListDataServicePublishedApisResponseBodyDataApisWizardDetails build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisWizardDetails self = new ListDataServicePublishedApisResponseBodyDataApisWizardDetails();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetails setWizardErrorCodes(java.util.List<ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardErrorCodes> wizardErrorCodes) {
            this.wizardErrorCodes = wizardErrorCodes;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardErrorCodes> getWizardErrorCodes() {
            return this.wizardErrorCodes;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetails setWizardResponseParameters(java.util.List<ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardResponseParameters> wizardResponseParameters) {
            this.wizardResponseParameters = wizardResponseParameters;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardResponseParameters> getWizardResponseParameters() {
            return this.wizardResponseParameters;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetails setIsPagedResponse(Boolean isPagedResponse) {
            this.isPagedResponse = isPagedResponse;
            return this;
        }
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetails setSuccessfulResultSample(String successfulResultSample) {
            this.successfulResultSample = successfulResultSample;
            return this;
        }
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetails setWizardConnection(ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardConnection wizardConnection) {
            this.wizardConnection = wizardConnection;
            return this;
        }
        public ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardConnection getWizardConnection() {
            return this.wizardConnection;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetails setFailedResultSample(String failedResultSample) {
            this.failedResultSample = failedResultSample;
            return this;
        }
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        public ListDataServicePublishedApisResponseBodyDataApisWizardDetails setWizardRequestParameters(java.util.List<ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters> wizardRequestParameters) {
            this.wizardRequestParameters = wizardRequestParameters;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisWizardDetailsWizardRequestParameters> getWizardRequestParameters() {
            return this.wizardRequestParameters;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters extends TeaModel {
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

        public static ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters self = new ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptErrorCodes extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorSolution")
        public String errorSolution;

        public static ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptErrorCodes self = new ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptErrorCodes();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptErrorCodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptErrorCodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptErrorCodes setErrorSolution(String errorSolution) {
            this.errorSolution = errorSolution;
            return this;
        }
        public String getErrorSolution() {
            return this.errorSolution;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptResponseParameters extends TeaModel {
        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterDescription")
        public String parameterDescription;

        @NameInMap("ExampleValue")
        public String exampleValue;

        @NameInMap("ParameterDataType")
        public Integer parameterDataType;

        public static ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptResponseParameters self = new ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptResponseParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptResponseParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptResponseParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptResponseParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptResponseParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptConnection extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("ConnectionId")
        public Long connectionId;

        public static ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptConnection build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptConnection self = new ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptConnection();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptConnection setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptConnection setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisScriptDetails extends TeaModel {
        @NameInMap("ScriptRequestParameters")
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters> scriptRequestParameters;

        @NameInMap("ScriptErrorCodes")
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptErrorCodes> scriptErrorCodes;

        @NameInMap("ScriptResponseParameters")
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptResponseParameters> scriptResponseParameters;

        @NameInMap("IsPagedResponse")
        public Boolean isPagedResponse;

        @NameInMap("SuccessfulResultSample")
        public String successfulResultSample;

        @NameInMap("FailedResultSample")
        public String failedResultSample;

        @NameInMap("Script")
        public String script;

        @NameInMap("ScriptConnection")
        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptConnection scriptConnection;

        public static ListDataServicePublishedApisResponseBodyDataApisScriptDetails build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisScriptDetails self = new ListDataServicePublishedApisResponseBodyDataApisScriptDetails();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetails setScriptRequestParameters(java.util.List<ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters> scriptRequestParameters) {
            this.scriptRequestParameters = scriptRequestParameters;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptRequestParameters> getScriptRequestParameters() {
            return this.scriptRequestParameters;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetails setScriptErrorCodes(java.util.List<ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptErrorCodes> scriptErrorCodes) {
            this.scriptErrorCodes = scriptErrorCodes;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptErrorCodes> getScriptErrorCodes() {
            return this.scriptErrorCodes;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetails setScriptResponseParameters(java.util.List<ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptResponseParameters> scriptResponseParameters) {
            this.scriptResponseParameters = scriptResponseParameters;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptResponseParameters> getScriptResponseParameters() {
            return this.scriptResponseParameters;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetails setIsPagedResponse(Boolean isPagedResponse) {
            this.isPagedResponse = isPagedResponse;
            return this;
        }
        public Boolean getIsPagedResponse() {
            return this.isPagedResponse;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetails setSuccessfulResultSample(String successfulResultSample) {
            this.successfulResultSample = successfulResultSample;
            return this;
        }
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetails setFailedResultSample(String failedResultSample) {
            this.failedResultSample = failedResultSample;
            return this;
        }
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetails setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public ListDataServicePublishedApisResponseBodyDataApisScriptDetails setScriptConnection(ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptConnection scriptConnection) {
            this.scriptConnection = scriptConnection;
            return this;
        }
        public ListDataServicePublishedApisResponseBodyDataApisScriptDetailsScriptConnection getScriptConnection() {
            return this.scriptConnection;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorSolution")
        public String errorSolution;

        public static ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes self = new ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes setErrorSolution(String errorSolution) {
            this.errorSolution = errorSolution;
            return this;
        }
        public String getErrorSolution() {
            return this.errorSolution;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters extends TeaModel {
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

        public static ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters self = new ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setParameterPosition(Integer parameterPosition) {
            this.parameterPosition = parameterPosition;
            return this;
        }
        public Integer getParameterPosition() {
            return this.parameterPosition;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setParameterOperator(Integer parameterOperator) {
            this.parameterOperator = parameterOperator;
            return this;
        }
        public Integer getParameterOperator() {
            return this.parameterOperator;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setExampleValue(String exampleValue) {
            this.exampleValue = exampleValue;
            return this;
        }
        public String getExampleValue() {
            return this.exampleValue;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setParameterDataType(Integer parameterDataType) {
            this.parameterDataType = parameterDataType;
            return this;
        }
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters setIsRequiredParameter(Boolean isRequiredParameter) {
            this.isRequiredParameter = isRequiredParameter;
            return this;
        }
        public Boolean getIsRequiredParameter() {
            return this.isRequiredParameter;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails extends TeaModel {
        @NameInMap("ServiceHost")
        public String serviceHost;

        @NameInMap("RegistrationErrorCodes")
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes> registrationErrorCodes;

        @NameInMap("ServiceContentType")
        public Integer serviceContentType;

        @NameInMap("ServicePath")
        public String servicePath;

        @NameInMap("RegistrationRequestParameters")
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters> registrationRequestParameters;

        @NameInMap("SuccessfulResultSample")
        public String successfulResultSample;

        @NameInMap("FailedResultSample")
        public String failedResultSample;

        @NameInMap("ServiceRequestBodyDescription")
        public String serviceRequestBodyDescription;

        public static ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails self = new ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails setServiceHost(String serviceHost) {
            this.serviceHost = serviceHost;
            return this;
        }
        public String getServiceHost() {
            return this.serviceHost;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails setRegistrationErrorCodes(java.util.List<ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes> registrationErrorCodes) {
            this.registrationErrorCodes = registrationErrorCodes;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationErrorCodes> getRegistrationErrorCodes() {
            return this.registrationErrorCodes;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails setServiceContentType(Integer serviceContentType) {
            this.serviceContentType = serviceContentType;
            return this;
        }
        public Integer getServiceContentType() {
            return this.serviceContentType;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails setServicePath(String servicePath) {
            this.servicePath = servicePath;
            return this;
        }
        public String getServicePath() {
            return this.servicePath;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails setRegistrationRequestParameters(java.util.List<ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters> registrationRequestParameters) {
            this.registrationRequestParameters = registrationRequestParameters;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApisRegistrationDetailsRegistrationRequestParameters> getRegistrationRequestParameters() {
            return this.registrationRequestParameters;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails setSuccessfulResultSample(String successfulResultSample) {
            this.successfulResultSample = successfulResultSample;
            return this;
        }
        public String getSuccessfulResultSample() {
            return this.successfulResultSample;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails setFailedResultSample(String failedResultSample) {
            this.failedResultSample = failedResultSample;
            return this;
        }
        public String getFailedResultSample() {
            return this.failedResultSample;
        }

        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails setServiceRequestBodyDescription(String serviceRequestBodyDescription) {
            this.serviceRequestBodyDescription = serviceRequestBodyDescription;
            return this;
        }
        public String getServiceRequestBodyDescription() {
            return this.serviceRequestBodyDescription;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyDataApis extends TeaModel {
        @NameInMap("ApiId")
        public Long apiId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Timeout")
        public Integer timeout;

        @NameInMap("ApiMode")
        public Integer apiMode;

        @NameInMap("WizardDetails")
        public ListDataServicePublishedApisResponseBodyDataApisWizardDetails wizardDetails;

        @NameInMap("ScriptDetails")
        public ListDataServicePublishedApisResponseBodyDataApisScriptDetails scriptDetails;

        @NameInMap("Protocols")
        public java.util.List<Integer> protocols;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("ResponseContentType")
        public Integer responseContentType;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("VisibleRange")
        public Integer visibleRange;

        @NameInMap("RegistrationDetails")
        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails registrationDetails;

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

        public static ListDataServicePublishedApisResponseBodyDataApis build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyDataApis self = new ListDataServicePublishedApisResponseBodyDataApis();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyDataApis setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setApiMode(Integer apiMode) {
            this.apiMode = apiMode;
            return this;
        }
        public Integer getApiMode() {
            return this.apiMode;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setWizardDetails(ListDataServicePublishedApisResponseBodyDataApisWizardDetails wizardDetails) {
            this.wizardDetails = wizardDetails;
            return this;
        }
        public ListDataServicePublishedApisResponseBodyDataApisWizardDetails getWizardDetails() {
            return this.wizardDetails;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setScriptDetails(ListDataServicePublishedApisResponseBodyDataApisScriptDetails scriptDetails) {
            this.scriptDetails = scriptDetails;
            return this;
        }
        public ListDataServicePublishedApisResponseBodyDataApisScriptDetails getScriptDetails() {
            return this.scriptDetails;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setProtocols(java.util.List<Integer> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<Integer> getProtocols() {
            return this.protocols;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setResponseContentType(Integer responseContentType) {
            this.responseContentType = responseContentType;
            return this;
        }
        public Integer getResponseContentType() {
            return this.responseContentType;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setVisibleRange(Integer visibleRange) {
            this.visibleRange = visibleRange;
            return this;
        }
        public Integer getVisibleRange() {
            return this.visibleRange;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setRegistrationDetails(ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails registrationDetails) {
            this.registrationDetails = registrationDetails;
            return this;
        }
        public ListDataServicePublishedApisResponseBodyDataApisRegistrationDetails getRegistrationDetails() {
            return this.registrationDetails;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setRequestMethod(Integer requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }
        public Integer getRequestMethod() {
            return this.requestMethod;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListDataServicePublishedApisResponseBodyDataApis setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

    }

    public static class ListDataServicePublishedApisResponseBodyData extends TeaModel {
        @NameInMap("Apis")
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApis> apis;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataServicePublishedApisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataServicePublishedApisResponseBodyData self = new ListDataServicePublishedApisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataServicePublishedApisResponseBodyData setApis(java.util.List<ListDataServicePublishedApisResponseBodyDataApis> apis) {
            this.apis = apis;
            return this;
        }
        public java.util.List<ListDataServicePublishedApisResponseBodyDataApis> getApis() {
            return this.apis;
        }

        public ListDataServicePublishedApisResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataServicePublishedApisResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataServicePublishedApisResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
