// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetTicketResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetTicketResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTicketResponseBody self = new GetTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTicketResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTicketResponseBody setData(GetTicketResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTicketResponseBodyData getData() {
        return this.data;
    }

    public GetTicketResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTicketResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTicketResponseBodyData extends TeaModel {
        @NameInMap("FormId")
        public Long formId;

        @NameInMap("Responsible")
        public Long responsible;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("DataId")
        public Long dataId;

        @NameInMap("QuestionInfo")
        public String questionInfo;

        @NameInMap("BuId")
        public Long buId;

        @NameInMap("SrType")
        public String srType;

        @NameInMap("Feedback")
        public String feedback;

        @NameInMap("CreateMode")
        public String createMode;

        @NameInMap("TouchId")
        public Long touchId;

        @NameInMap("FormCode")
        public String formCode;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("RefCaseId")
        public Long refCaseId;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("FromInfo")
        public String fromInfo;

        @NameInMap("MemberType")
        public Integer memberType;

        @NameInMap("ContactId")
        public Long contactId;

        @NameInMap("DepartmentId")
        public Long departmentId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("SopCateId")
        public Long sopCateId;

        @NameInMap("TemplateId")
        public Long templateId;

        @NameInMap("ExtAttrs")
        public String extAttrs;

        @NameInMap("CaseStatus")
        public Integer caseStatus;

        @NameInMap("Id")
        public String id;

        public static GetTicketResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTicketResponseBodyData self = new GetTicketResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTicketResponseBodyData setFormId(Long formId) {
            this.formId = formId;
            return this;
        }
        public Long getFormId() {
            return this.formId;
        }

        public GetTicketResponseBodyData setResponsible(Long responsible) {
            this.responsible = responsible;
            return this;
        }
        public Long getResponsible() {
            return this.responsible;
        }

        public GetTicketResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetTicketResponseBodyData setDataId(Long dataId) {
            this.dataId = dataId;
            return this;
        }
        public Long getDataId() {
            return this.dataId;
        }

        public GetTicketResponseBodyData setQuestionInfo(String questionInfo) {
            this.questionInfo = questionInfo;
            return this;
        }
        public String getQuestionInfo() {
            return this.questionInfo;
        }

        public GetTicketResponseBodyData setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public GetTicketResponseBodyData setSrType(String srType) {
            this.srType = srType;
            return this;
        }
        public String getSrType() {
            return this.srType;
        }

        public GetTicketResponseBodyData setFeedback(String feedback) {
            this.feedback = feedback;
            return this;
        }
        public String getFeedback() {
            return this.feedback;
        }

        public GetTicketResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public GetTicketResponseBodyData setTouchId(Long touchId) {
            this.touchId = touchId;
            return this;
        }
        public Long getTouchId() {
            return this.touchId;
        }

        public GetTicketResponseBodyData setFormCode(String formCode) {
            this.formCode = formCode;
            return this;
        }
        public String getFormCode() {
            return this.formCode;
        }

        public GetTicketResponseBodyData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public GetTicketResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetTicketResponseBodyData setRefCaseId(Long refCaseId) {
            this.refCaseId = refCaseId;
            return this;
        }
        public Long getRefCaseId() {
            return this.refCaseId;
        }

        public GetTicketResponseBodyData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetTicketResponseBodyData setFromInfo(String fromInfo) {
            this.fromInfo = fromInfo;
            return this;
        }
        public String getFromInfo() {
            return this.fromInfo;
        }

        public GetTicketResponseBodyData setMemberType(Integer memberType) {
            this.memberType = memberType;
            return this;
        }
        public Integer getMemberType() {
            return this.memberType;
        }

        public GetTicketResponseBodyData setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public GetTicketResponseBodyData setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public GetTicketResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetTicketResponseBodyData setSopCateId(Long sopCateId) {
            this.sopCateId = sopCateId;
            return this;
        }
        public Long getSopCateId() {
            return this.sopCateId;
        }

        public GetTicketResponseBodyData setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public GetTicketResponseBodyData setExtAttrs(String extAttrs) {
            this.extAttrs = extAttrs;
            return this;
        }
        public String getExtAttrs() {
            return this.extAttrs;
        }

        public GetTicketResponseBodyData setCaseStatus(Integer caseStatus) {
            this.caseStatus = caseStatus;
            return this;
        }
        public Integer getCaseStatus() {
            return this.caseStatus;
        }

        public GetTicketResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
