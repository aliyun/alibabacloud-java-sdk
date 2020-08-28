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

    }

}
