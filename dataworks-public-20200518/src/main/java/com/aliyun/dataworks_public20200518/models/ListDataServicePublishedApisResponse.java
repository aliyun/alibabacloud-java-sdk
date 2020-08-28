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

    }

}
