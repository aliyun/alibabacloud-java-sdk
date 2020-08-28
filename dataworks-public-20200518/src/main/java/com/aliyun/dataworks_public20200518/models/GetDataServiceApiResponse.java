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

    }

}
