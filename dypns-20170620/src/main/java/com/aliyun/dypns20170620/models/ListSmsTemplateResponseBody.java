// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class ListSmsTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListSmsTemplateResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSmsTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSmsTemplateResponseBody self = new ListSmsTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSmsTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSmsTemplateResponseBody setData(java.util.List<ListSmsTemplateResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSmsTemplateResponseBodyData> getData() {
        return this.data;
    }

    public ListSmsTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSmsTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSmsTemplateResponseBodyData extends TeaModel {
        @NameInMap("AuditResult")
        public String auditResult;

        @NameInMap("BizUrl")
        public String bizUrl;

        @NameInMap("BusinessType")
        public Integer businessType;

        @NameInMap("CreateDate")
        public Long createDate;

        @NameInMap("DefaultFlag")
        public Boolean defaultFlag;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("SmsTemplateCode")
        public String smsTemplateCode;

        @NameInMap("SmsTemplateContent")
        public String smsTemplateContent;

        @NameInMap("SmsTemplateName")
        public String smsTemplateName;

        @NameInMap("Status")
        public String status;

        public static ListSmsTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSmsTemplateResponseBodyData self = new ListSmsTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSmsTemplateResponseBodyData setAuditResult(String auditResult) {
            this.auditResult = auditResult;
            return this;
        }
        public String getAuditResult() {
            return this.auditResult;
        }

        public ListSmsTemplateResponseBodyData setBizUrl(String bizUrl) {
            this.bizUrl = bizUrl;
            return this;
        }
        public String getBizUrl() {
            return this.bizUrl;
        }

        public ListSmsTemplateResponseBodyData setBusinessType(Integer businessType) {
            this.businessType = businessType;
            return this;
        }
        public Integer getBusinessType() {
            return this.businessType;
        }

        public ListSmsTemplateResponseBodyData setCreateDate(Long createDate) {
            this.createDate = createDate;
            return this;
        }
        public Long getCreateDate() {
            return this.createDate;
        }

        public ListSmsTemplateResponseBodyData setDefaultFlag(Boolean defaultFlag) {
            this.defaultFlag = defaultFlag;
            return this;
        }
        public Boolean getDefaultFlag() {
            return this.defaultFlag;
        }

        public ListSmsTemplateResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListSmsTemplateResponseBodyData setSmsTemplateCode(String smsTemplateCode) {
            this.smsTemplateCode = smsTemplateCode;
            return this;
        }
        public String getSmsTemplateCode() {
            return this.smsTemplateCode;
        }

        public ListSmsTemplateResponseBodyData setSmsTemplateContent(String smsTemplateContent) {
            this.smsTemplateContent = smsTemplateContent;
            return this;
        }
        public String getSmsTemplateContent() {
            return this.smsTemplateContent;
        }

        public ListSmsTemplateResponseBodyData setSmsTemplateName(String smsTemplateName) {
            this.smsTemplateName = smsTemplateName;
            return this;
        }
        public String getSmsTemplateName() {
            return this.smsTemplateName;
        }

        public ListSmsTemplateResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
