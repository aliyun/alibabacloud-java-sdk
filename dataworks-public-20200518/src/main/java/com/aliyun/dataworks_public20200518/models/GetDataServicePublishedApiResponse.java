// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServicePublishedApiResponse extends TeaModel {
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
    public GetDataServicePublishedApiResponseData data;

    public static GetDataServicePublishedApiResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServicePublishedApiResponse self = new GetDataServicePublishedApiResponse();
        return TeaModel.build(map, self);
    }

    public static class GetDataServicePublishedApiResponseDataRegistrationDetailsRegistrationErrorCodes extends TeaModel {
        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("ErrorSolution")
        @Validation(required = true)
        public String errorSolution;

        public static GetDataServicePublishedApiResponseDataRegistrationDetailsRegistrationErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseDataRegistrationDetailsRegistrationErrorCodes self = new GetDataServicePublishedApiResponseDataRegistrationDetailsRegistrationErrorCodes();
            return TeaModel.build(map, self);
        }

    }

    public static class GetDataServicePublishedApiResponseDataRegistrationDetailsRegistrationRequestParameters extends TeaModel {
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

        public static GetDataServicePublishedApiResponseDataRegistrationDetailsRegistrationRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseDataRegistrationDetailsRegistrationRequestParameters self = new GetDataServicePublishedApiResponseDataRegistrationDetailsRegistrationRequestParameters();
            return TeaModel.build(map, self);
        }

    }

    public static class GetDataServicePublishedApiResponseDataRegistrationDetails extends TeaModel {
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
        public java.util.List<GetDataServicePublishedApiResponseDataRegistrationDetailsRegistrationErrorCodes> registrationErrorCodes;

        @NameInMap("RegistrationRequestParameters")
        @Validation(required = true)
        public java.util.List<GetDataServicePublishedApiResponseDataRegistrationDetailsRegistrationRequestParameters> registrationRequestParameters;

        public static GetDataServicePublishedApiResponseDataRegistrationDetails build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseDataRegistrationDetails self = new GetDataServicePublishedApiResponseDataRegistrationDetails();
            return TeaModel.build(map, self);
        }

    }

    public static class GetDataServicePublishedApiResponseDataScriptDetailsScriptErrorCodes extends TeaModel {
        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("ErrorSolution")
        @Validation(required = true)
        public String errorSolution;

        public static GetDataServicePublishedApiResponseDataScriptDetailsScriptErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseDataScriptDetailsScriptErrorCodes self = new GetDataServicePublishedApiResponseDataScriptDetailsScriptErrorCodes();
            return TeaModel.build(map, self);
        }

    }

    public static class GetDataServicePublishedApiResponseDataScriptDetailsScriptRequestParameters extends TeaModel {
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

        public static GetDataServicePublishedApiResponseDataScriptDetailsScriptRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseDataScriptDetailsScriptRequestParameters self = new GetDataServicePublishedApiResponseDataScriptDetailsScriptRequestParameters();
            return TeaModel.build(map, self);
        }

    }

    public static class GetDataServicePublishedApiResponseDataScriptDetailsScriptResponseParameters extends TeaModel {
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

        public static GetDataServicePublishedApiResponseDataScriptDetailsScriptResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseDataScriptDetailsScriptResponseParameters self = new GetDataServicePublishedApiResponseDataScriptDetailsScriptResponseParameters();
            return TeaModel.build(map, self);
        }

    }

    public static class GetDataServicePublishedApiResponseDataScriptDetailsScriptConnection extends TeaModel {
        @NameInMap("ConnectionId")
        @Validation(required = true)
        public Long connectionId;

        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        public static GetDataServicePublishedApiResponseDataScriptDetailsScriptConnection build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseDataScriptDetailsScriptConnection self = new GetDataServicePublishedApiResponseDataScriptDetailsScriptConnection();
            return TeaModel.build(map, self);
        }

    }

    public static class GetDataServicePublishedApiResponseDataScriptDetails extends TeaModel {
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
        public java.util.List<GetDataServicePublishedApiResponseDataScriptDetailsScriptErrorCodes> scriptErrorCodes;

        @NameInMap("ScriptRequestParameters")
        @Validation(required = true)
        public java.util.List<GetDataServicePublishedApiResponseDataScriptDetailsScriptRequestParameters> scriptRequestParameters;

        @NameInMap("ScriptResponseParameters")
        @Validation(required = true)
        public java.util.List<GetDataServicePublishedApiResponseDataScriptDetailsScriptResponseParameters> scriptResponseParameters;

        @NameInMap("ScriptConnection")
        @Validation(required = true)
        public GetDataServicePublishedApiResponseDataScriptDetailsScriptConnection scriptConnection;

        public static GetDataServicePublishedApiResponseDataScriptDetails build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseDataScriptDetails self = new GetDataServicePublishedApiResponseDataScriptDetails();
            return TeaModel.build(map, self);
        }

    }

    public static class GetDataServicePublishedApiResponseDataWizardDetailsWizardErrorCodes extends TeaModel {
        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("ErrorSolution")
        @Validation(required = true)
        public String errorSolution;

        public static GetDataServicePublishedApiResponseDataWizardDetailsWizardErrorCodes build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseDataWizardDetailsWizardErrorCodes self = new GetDataServicePublishedApiResponseDataWizardDetailsWizardErrorCodes();
            return TeaModel.build(map, self);
        }

    }

    public static class GetDataServicePublishedApiResponseDataWizardDetailsWizardRequestParameters extends TeaModel {
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

        public static GetDataServicePublishedApiResponseDataWizardDetailsWizardRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseDataWizardDetailsWizardRequestParameters self = new GetDataServicePublishedApiResponseDataWizardDetailsWizardRequestParameters();
            return TeaModel.build(map, self);
        }

    }

    public static class GetDataServicePublishedApiResponseDataWizardDetailsWizardResponseParameters extends TeaModel {
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

        public static GetDataServicePublishedApiResponseDataWizardDetailsWizardResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseDataWizardDetailsWizardResponseParameters self = new GetDataServicePublishedApiResponseDataWizardDetailsWizardResponseParameters();
            return TeaModel.build(map, self);
        }

    }

    public static class GetDataServicePublishedApiResponseDataWizardDetailsWizardConnection extends TeaModel {
        @NameInMap("ConnectionId")
        @Validation(required = true)
        public Long connectionId;

        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        public static GetDataServicePublishedApiResponseDataWizardDetailsWizardConnection build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseDataWizardDetailsWizardConnection self = new GetDataServicePublishedApiResponseDataWizardDetailsWizardConnection();
            return TeaModel.build(map, self);
        }

    }

    public static class GetDataServicePublishedApiResponseDataWizardDetails extends TeaModel {
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
        public java.util.List<GetDataServicePublishedApiResponseDataWizardDetailsWizardErrorCodes> wizardErrorCodes;

        @NameInMap("WizardRequestParameters")
        @Validation(required = true)
        public java.util.List<GetDataServicePublishedApiResponseDataWizardDetailsWizardRequestParameters> wizardRequestParameters;

        @NameInMap("WizardResponseParameters")
        @Validation(required = true)
        public java.util.List<GetDataServicePublishedApiResponseDataWizardDetailsWizardResponseParameters> wizardResponseParameters;

        @NameInMap("WizardConnection")
        @Validation(required = true)
        public GetDataServicePublishedApiResponseDataWizardDetailsWizardConnection wizardConnection;

        public static GetDataServicePublishedApiResponseDataWizardDetails build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseDataWizardDetails self = new GetDataServicePublishedApiResponseDataWizardDetails();
            return TeaModel.build(map, self);
        }

    }

    public static class GetDataServicePublishedApiResponseData extends TeaModel {
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
        public GetDataServicePublishedApiResponseDataRegistrationDetails registrationDetails;

        @NameInMap("ScriptDetails")
        @Validation(required = true)
        public GetDataServicePublishedApiResponseDataScriptDetails scriptDetails;

        @NameInMap("WizardDetails")
        @Validation(required = true)
        public GetDataServicePublishedApiResponseDataWizardDetails wizardDetails;

        @NameInMap("Protocols")
        @Validation(required = true)
        public java.util.List<Integer> protocols;

        public static GetDataServicePublishedApiResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetDataServicePublishedApiResponseData self = new GetDataServicePublishedApiResponseData();
            return TeaModel.build(map, self);
        }

    }

}
