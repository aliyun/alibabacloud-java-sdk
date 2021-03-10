// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDataAPIServiceDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public GetDataAPIServiceDetailResponseData data;

    public static GetDataAPIServiceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataAPIServiceDetailResponse self = new GetDataAPIServiceDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetDataAPIServiceDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataAPIServiceDetailResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDataAPIServiceDetailResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataAPIServiceDetailResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataAPIServiceDetailResponse setData(GetDataAPIServiceDetailResponseData data) {
        this.data = data;
        return this;
    }
    public GetDataAPIServiceDetailResponseData getData() {
        return this.data;
    }

    public static class GetDataAPIServiceDetailResponseDataSqlTemplateDTORequestParamsRequestParams extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Desc")
        @Validation(required = true)
        public String desc;

        @NameInMap("Example")
        @Validation(required = true)
        public String example;

        @NameInMap("Required")
        @Validation(required = true)
        public Boolean required;

        public static GetDataAPIServiceDetailResponseDataSqlTemplateDTORequestParamsRequestParams build(java.util.Map<String, ?> map) throws Exception {
            GetDataAPIServiceDetailResponseDataSqlTemplateDTORequestParamsRequestParams self = new GetDataAPIServiceDetailResponseDataSqlTemplateDTORequestParamsRequestParams();
            return TeaModel.build(map, self);
        }

        public GetDataAPIServiceDetailResponseDataSqlTemplateDTORequestParamsRequestParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataAPIServiceDetailResponseDataSqlTemplateDTORequestParamsRequestParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetDataAPIServiceDetailResponseDataSqlTemplateDTORequestParamsRequestParams setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetDataAPIServiceDetailResponseDataSqlTemplateDTORequestParamsRequestParams setExample(String example) {
            this.example = example;
            return this;
        }
        public String getExample() {
            return this.example;
        }

        public GetDataAPIServiceDetailResponseDataSqlTemplateDTORequestParamsRequestParams setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class GetDataAPIServiceDetailResponseDataSqlTemplateDTORequestParams extends TeaModel {
        @NameInMap("RequestParams")
        @Validation(required = true)
        public java.util.List<GetDataAPIServiceDetailResponseDataSqlTemplateDTORequestParamsRequestParams> requestParams;

        public static GetDataAPIServiceDetailResponseDataSqlTemplateDTORequestParams build(java.util.Map<String, ?> map) throws Exception {
            GetDataAPIServiceDetailResponseDataSqlTemplateDTORequestParams self = new GetDataAPIServiceDetailResponseDataSqlTemplateDTORequestParams();
            return TeaModel.build(map, self);
        }

        public GetDataAPIServiceDetailResponseDataSqlTemplateDTORequestParams setRequestParams(java.util.List<GetDataAPIServiceDetailResponseDataSqlTemplateDTORequestParamsRequestParams> requestParams) {
            this.requestParams = requestParams;
            return this;
        }
        public java.util.List<GetDataAPIServiceDetailResponseDataSqlTemplateDTORequestParamsRequestParams> getRequestParams() {
            return this.requestParams;
        }

    }

    public static class GetDataAPIServiceDetailResponseDataSqlTemplateDTOResponseParamsResponseParams extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Desc")
        @Validation(required = true)
        public String desc;

        @NameInMap("Example")
        @Validation(required = true)
        public String example;

        @NameInMap("Required")
        @Validation(required = true)
        public Boolean required;

        public static GetDataAPIServiceDetailResponseDataSqlTemplateDTOResponseParamsResponseParams build(java.util.Map<String, ?> map) throws Exception {
            GetDataAPIServiceDetailResponseDataSqlTemplateDTOResponseParamsResponseParams self = new GetDataAPIServiceDetailResponseDataSqlTemplateDTOResponseParamsResponseParams();
            return TeaModel.build(map, self);
        }

        public GetDataAPIServiceDetailResponseDataSqlTemplateDTOResponseParamsResponseParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataAPIServiceDetailResponseDataSqlTemplateDTOResponseParamsResponseParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetDataAPIServiceDetailResponseDataSqlTemplateDTOResponseParamsResponseParams setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetDataAPIServiceDetailResponseDataSqlTemplateDTOResponseParamsResponseParams setExample(String example) {
            this.example = example;
            return this;
        }
        public String getExample() {
            return this.example;
        }

        public GetDataAPIServiceDetailResponseDataSqlTemplateDTOResponseParamsResponseParams setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class GetDataAPIServiceDetailResponseDataSqlTemplateDTOResponseParams extends TeaModel {
        @NameInMap("ResponseParams")
        @Validation(required = true)
        public java.util.List<GetDataAPIServiceDetailResponseDataSqlTemplateDTOResponseParamsResponseParams> responseParams;

        public static GetDataAPIServiceDetailResponseDataSqlTemplateDTOResponseParams build(java.util.Map<String, ?> map) throws Exception {
            GetDataAPIServiceDetailResponseDataSqlTemplateDTOResponseParams self = new GetDataAPIServiceDetailResponseDataSqlTemplateDTOResponseParams();
            return TeaModel.build(map, self);
        }

        public GetDataAPIServiceDetailResponseDataSqlTemplateDTOResponseParams setResponseParams(java.util.List<GetDataAPIServiceDetailResponseDataSqlTemplateDTOResponseParamsResponseParams> responseParams) {
            this.responseParams = responseParams;
            return this;
        }
        public java.util.List<GetDataAPIServiceDetailResponseDataSqlTemplateDTOResponseParamsResponseParams> getResponseParams() {
            return this.responseParams;
        }

    }

    public static class GetDataAPIServiceDetailResponseDataSqlTemplateDTO extends TeaModel {
        @NameInMap("OriginSql")
        @Validation(required = true)
        public String originSql;

        @NameInMap("TemplateSql")
        @Validation(required = true)
        public String templateSql;

        @NameInMap("RequestParams")
        @Validation(required = true)
        public GetDataAPIServiceDetailResponseDataSqlTemplateDTORequestParams requestParams;

        @NameInMap("ResponseParams")
        @Validation(required = true)
        public GetDataAPIServiceDetailResponseDataSqlTemplateDTOResponseParams responseParams;

        public static GetDataAPIServiceDetailResponseDataSqlTemplateDTO build(java.util.Map<String, ?> map) throws Exception {
            GetDataAPIServiceDetailResponseDataSqlTemplateDTO self = new GetDataAPIServiceDetailResponseDataSqlTemplateDTO();
            return TeaModel.build(map, self);
        }

        public GetDataAPIServiceDetailResponseDataSqlTemplateDTO setOriginSql(String originSql) {
            this.originSql = originSql;
            return this;
        }
        public String getOriginSql() {
            return this.originSql;
        }

        public GetDataAPIServiceDetailResponseDataSqlTemplateDTO setTemplateSql(String templateSql) {
            this.templateSql = templateSql;
            return this;
        }
        public String getTemplateSql() {
            return this.templateSql;
        }

        public GetDataAPIServiceDetailResponseDataSqlTemplateDTO setRequestParams(GetDataAPIServiceDetailResponseDataSqlTemplateDTORequestParams requestParams) {
            this.requestParams = requestParams;
            return this;
        }
        public GetDataAPIServiceDetailResponseDataSqlTemplateDTORequestParams getRequestParams() {
            return this.requestParams;
        }

        public GetDataAPIServiceDetailResponseDataSqlTemplateDTO setResponseParams(GetDataAPIServiceDetailResponseDataSqlTemplateDTOResponseParams responseParams) {
            this.responseParams = responseParams;
            return this;
        }
        public GetDataAPIServiceDetailResponseDataSqlTemplateDTOResponseParams getResponseParams() {
            return this.responseParams;
        }

    }

    public static class GetDataAPIServiceDetailResponseData extends TeaModel {
        @NameInMap("ApiSrn")
        @Validation(required = true)
        public String apiSrn;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("ApiPath")
        @Validation(required = true)
        public String apiPath;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("LastUpdateTime")
        @Validation(required = true)
        public Long lastUpdateTime;

        @NameInMap("DateFormat")
        @Validation(required = true)
        public String dateFormat;

        @NameInMap("RequestMethod")
        @Validation(required = true)
        public String requestMethod;

        @NameInMap("RequestProtocol")
        @Validation(required = true)
        public String requestProtocol;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("SqlTemplateDTO")
        @Validation(required = true)
        public GetDataAPIServiceDetailResponseDataSqlTemplateDTO sqlTemplateDTO;

        public static GetDataAPIServiceDetailResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetDataAPIServiceDetailResponseData self = new GetDataAPIServiceDetailResponseData();
            return TeaModel.build(map, self);
        }

        public GetDataAPIServiceDetailResponseData setApiSrn(String apiSrn) {
            this.apiSrn = apiSrn;
            return this;
        }
        public String getApiSrn() {
            return this.apiSrn;
        }

        public GetDataAPIServiceDetailResponseData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetDataAPIServiceDetailResponseData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetDataAPIServiceDetailResponseData setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

        public GetDataAPIServiceDetailResponseData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDataAPIServiceDetailResponseData setLastUpdateTime(Long lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public GetDataAPIServiceDetailResponseData setDateFormat(String dateFormat) {
            this.dateFormat = dateFormat;
            return this;
        }
        public String getDateFormat() {
            return this.dateFormat;
        }

        public GetDataAPIServiceDetailResponseData setRequestMethod(String requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }
        public String getRequestMethod() {
            return this.requestMethod;
        }

        public GetDataAPIServiceDetailResponseData setRequestProtocol(String requestProtocol) {
            this.requestProtocol = requestProtocol;
            return this;
        }
        public String getRequestProtocol() {
            return this.requestProtocol;
        }

        public GetDataAPIServiceDetailResponseData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataAPIServiceDetailResponseData setSqlTemplateDTO(GetDataAPIServiceDetailResponseDataSqlTemplateDTO sqlTemplateDTO) {
            this.sqlTemplateDTO = sqlTemplateDTO;
            return this;
        }
        public GetDataAPIServiceDetailResponseDataSqlTemplateDTO getSqlTemplateDTO() {
            return this.sqlTemplateDTO;
        }

    }

}
