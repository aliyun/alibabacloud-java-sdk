// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class GetSchemeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSchemeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSchemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSchemeResponseBody self = new GetSchemeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSchemeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSchemeResponseBody setData(GetSchemeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSchemeResponseBodyData getData() {
        return this.data;
    }

    public GetSchemeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSchemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSchemeResponseBodyDataScenesList extends TeaModel {
        @NameInMap("ScenesId")
        public Long scenesId;

        @NameInMap("ScenesName")
        public String scenesName;

        public static GetSchemeResponseBodyDataScenesList build(java.util.Map<String, ?> map) throws Exception {
            GetSchemeResponseBodyDataScenesList self = new GetSchemeResponseBodyDataScenesList();
            return TeaModel.build(map, self);
        }

        public GetSchemeResponseBodyDataScenesList setScenesId(Long scenesId) {
            this.scenesId = scenesId;
            return this;
        }
        public Long getScenesId() {
            return this.scenesId;
        }

        public GetSchemeResponseBodyDataScenesList setScenesName(String scenesName) {
            this.scenesName = scenesName;
            return this;
        }
        public String getScenesName() {
            return this.scenesName;
        }

    }

    public static class GetSchemeResponseBodyData extends TeaModel {
        @NameInMap("AuditDesc")
        public String auditDesc;

        @NameInMap("AuditTime")
        public Long auditTime;

        @NameInMap("BusinessTypeList")
        public java.util.List<Integer> businessTypeList;

        @NameInMap("CompanyId")
        public Long companyId;

        @NameInMap("CycleList")
        public java.util.List<String> cycleList;

        @NameInMap("Description")
        public String description;

        @NameInMap("IndustryId")
        public String industryId;

        @NameInMap("ScenesList")
        public java.util.List<GetSchemeResponseBodyDataScenesList> scenesList;

        @NameInMap("SchemeId")
        public Long schemeId;

        @NameInMap("SchemeName")
        public String schemeName;

        @NameInMap("SchemeType")
        public Integer schemeType;

        @NameInMap("Statement")
        public String statement;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TemplateId")
        public Long templateId;

        public static GetSchemeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSchemeResponseBodyData self = new GetSchemeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSchemeResponseBodyData setAuditDesc(String auditDesc) {
            this.auditDesc = auditDesc;
            return this;
        }
        public String getAuditDesc() {
            return this.auditDesc;
        }

        public GetSchemeResponseBodyData setAuditTime(Long auditTime) {
            this.auditTime = auditTime;
            return this;
        }
        public Long getAuditTime() {
            return this.auditTime;
        }

        public GetSchemeResponseBodyData setBusinessTypeList(java.util.List<Integer> businessTypeList) {
            this.businessTypeList = businessTypeList;
            return this;
        }
        public java.util.List<Integer> getBusinessTypeList() {
            return this.businessTypeList;
        }

        public GetSchemeResponseBodyData setCompanyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }
        public Long getCompanyId() {
            return this.companyId;
        }

        public GetSchemeResponseBodyData setCycleList(java.util.List<String> cycleList) {
            this.cycleList = cycleList;
            return this;
        }
        public java.util.List<String> getCycleList() {
            return this.cycleList;
        }

        public GetSchemeResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSchemeResponseBodyData setIndustryId(String industryId) {
            this.industryId = industryId;
            return this;
        }
        public String getIndustryId() {
            return this.industryId;
        }

        public GetSchemeResponseBodyData setScenesList(java.util.List<GetSchemeResponseBodyDataScenesList> scenesList) {
            this.scenesList = scenesList;
            return this;
        }
        public java.util.List<GetSchemeResponseBodyDataScenesList> getScenesList() {
            return this.scenesList;
        }

        public GetSchemeResponseBodyData setSchemeId(Long schemeId) {
            this.schemeId = schemeId;
            return this;
        }
        public Long getSchemeId() {
            return this.schemeId;
        }

        public GetSchemeResponseBodyData setSchemeName(String schemeName) {
            this.schemeName = schemeName;
            return this;
        }
        public String getSchemeName() {
            return this.schemeName;
        }

        public GetSchemeResponseBodyData setSchemeType(Integer schemeType) {
            this.schemeType = schemeType;
            return this;
        }
        public Integer getSchemeType() {
            return this.schemeType;
        }

        public GetSchemeResponseBodyData setStatement(String statement) {
            this.statement = statement;
            return this;
        }
        public String getStatement() {
            return this.statement;
        }

        public GetSchemeResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetSchemeResponseBodyData setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

}
