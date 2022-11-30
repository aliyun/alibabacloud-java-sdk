// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class ListVoiceTtsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("List")
    public java.util.List<ListVoiceTtsResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static ListVoiceTtsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceTtsResponseBody self = new ListVoiceTtsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVoiceTtsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVoiceTtsResponseBody setList(java.util.List<ListVoiceTtsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListVoiceTtsResponseBodyList> getList() {
        return this.list;
    }

    public ListVoiceTtsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVoiceTtsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVoiceTtsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListVoiceTtsResponseBodyList extends TeaModel {
        @NameInMap("AuditBy")
        public String auditBy;

        @NameInMap("AuditRemark")
        public String auditRemark;

        @NameInMap("AuditTs")
        public String auditTs;

        @NameInMap("CommitTs")
        public String commitTs;

        @NameInMap("CountryId")
        public String countryId;

        @NameInMap("Language")
        public String language;

        @NameInMap("QualificationId")
        public String qualificationId;

        @NameInMap("Speed")
        public Integer speed;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateText")
        public String templateText;

        @NameInMap("UpdateTs")
        public String updateTs;

        @NameInMap("UserUuid")
        public String userUuid;

        public static ListVoiceTtsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListVoiceTtsResponseBodyList self = new ListVoiceTtsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListVoiceTtsResponseBodyList setAuditBy(String auditBy) {
            this.auditBy = auditBy;
            return this;
        }
        public String getAuditBy() {
            return this.auditBy;
        }

        public ListVoiceTtsResponseBodyList setAuditRemark(String auditRemark) {
            this.auditRemark = auditRemark;
            return this;
        }
        public String getAuditRemark() {
            return this.auditRemark;
        }

        public ListVoiceTtsResponseBodyList setAuditTs(String auditTs) {
            this.auditTs = auditTs;
            return this;
        }
        public String getAuditTs() {
            return this.auditTs;
        }

        public ListVoiceTtsResponseBodyList setCommitTs(String commitTs) {
            this.commitTs = commitTs;
            return this;
        }
        public String getCommitTs() {
            return this.commitTs;
        }

        public ListVoiceTtsResponseBodyList setCountryId(String countryId) {
            this.countryId = countryId;
            return this;
        }
        public String getCountryId() {
            return this.countryId;
        }

        public ListVoiceTtsResponseBodyList setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListVoiceTtsResponseBodyList setQualificationId(String qualificationId) {
            this.qualificationId = qualificationId;
            return this;
        }
        public String getQualificationId() {
            return this.qualificationId;
        }

        public ListVoiceTtsResponseBodyList setSpeed(Integer speed) {
            this.speed = speed;
            return this;
        }
        public Integer getSpeed() {
            return this.speed;
        }

        public ListVoiceTtsResponseBodyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListVoiceTtsResponseBodyList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListVoiceTtsResponseBodyList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListVoiceTtsResponseBodyList setTemplateText(String templateText) {
            this.templateText = templateText;
            return this;
        }
        public String getTemplateText() {
            return this.templateText;
        }

        public ListVoiceTtsResponseBodyList setUpdateTs(String updateTs) {
            this.updateTs = updateTs;
            return this;
        }
        public String getUpdateTs() {
            return this.updateTs;
        }

        public ListVoiceTtsResponseBodyList setUserUuid(String userUuid) {
            this.userUuid = userUuid;
            return this;
        }
        public String getUserUuid() {
            return this.userUuid;
        }

    }

}
