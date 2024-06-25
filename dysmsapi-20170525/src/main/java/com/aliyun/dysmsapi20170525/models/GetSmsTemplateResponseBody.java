// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetSmsTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com/">http://www.aliyun.com/</a></p>
     */
    @NameInMap("ApplyScene")
    public String applyScene;

    @NameInMap("AuditInfo")
    public GetSmsTemplateResponseBodyAuditInfo auditInfo;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>2024-06-03 10:02:34</p>
     */
    @NameInMap("CreateDate")
    public String createDate;

    @NameInMap("FileUrlList")
    public GetSmsTemplateResponseBodyFileUrlList fileUrlList;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IntlType")
    public Integer intlType;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("MoreDataFileUrlList")
    public GetSmsTemplateResponseBodyMoreDataFileUrlList moreDataFileUrlList;

    /**
     * <strong>example:</strong>
     * <p>20030193785</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RelatedSignName")
    public String relatedSignName;

    @NameInMap("Remark")
    public String remark;

    /**
     * <strong>example:</strong>
     * <p>819BE656-D2E0-4858-8B21-B2E47708****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>SMS_2322****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateContent")
    public String templateContent;

    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateStatus")
    public String templateStatus;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TemplateTag")
    public Integer templateTag;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    /**
     * <strong>example:</strong>
     * <p>{&quot;code&quot;:&quot;characterWithNumber&quot;}</p>
     */
    @NameInMap("VariableAttribute")
    public String variableAttribute;

    public static GetSmsTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSmsTemplateResponseBody self = new GetSmsTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSmsTemplateResponseBody setApplyScene(String applyScene) {
        this.applyScene = applyScene;
        return this;
    }
    public String getApplyScene() {
        return this.applyScene;
    }

    public GetSmsTemplateResponseBody setAuditInfo(GetSmsTemplateResponseBodyAuditInfo auditInfo) {
        this.auditInfo = auditInfo;
        return this;
    }
    public GetSmsTemplateResponseBodyAuditInfo getAuditInfo() {
        return this.auditInfo;
    }

    public GetSmsTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSmsTemplateResponseBody setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }
    public String getCreateDate() {
        return this.createDate;
    }

    public GetSmsTemplateResponseBody setFileUrlList(GetSmsTemplateResponseBodyFileUrlList fileUrlList) {
        this.fileUrlList = fileUrlList;
        return this;
    }
    public GetSmsTemplateResponseBodyFileUrlList getFileUrlList() {
        return this.fileUrlList;
    }

    public GetSmsTemplateResponseBody setIntlType(Integer intlType) {
        this.intlType = intlType;
        return this;
    }
    public Integer getIntlType() {
        return this.intlType;
    }

    public GetSmsTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSmsTemplateResponseBody setMoreDataFileUrlList(GetSmsTemplateResponseBodyMoreDataFileUrlList moreDataFileUrlList) {
        this.moreDataFileUrlList = moreDataFileUrlList;
        return this;
    }
    public GetSmsTemplateResponseBodyMoreDataFileUrlList getMoreDataFileUrlList() {
        return this.moreDataFileUrlList;
    }

    public GetSmsTemplateResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetSmsTemplateResponseBody setRelatedSignName(String relatedSignName) {
        this.relatedSignName = relatedSignName;
        return this;
    }
    public String getRelatedSignName() {
        return this.relatedSignName;
    }

    public GetSmsTemplateResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public GetSmsTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSmsTemplateResponseBody setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public GetSmsTemplateResponseBody setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public GetSmsTemplateResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetSmsTemplateResponseBody setTemplateStatus(String templateStatus) {
        this.templateStatus = templateStatus;
        return this;
    }
    public String getTemplateStatus() {
        return this.templateStatus;
    }

    public GetSmsTemplateResponseBody setTemplateTag(Integer templateTag) {
        this.templateTag = templateTag;
        return this;
    }
    public Integer getTemplateTag() {
        return this.templateTag;
    }

    public GetSmsTemplateResponseBody setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public GetSmsTemplateResponseBody setVariableAttribute(String variableAttribute) {
        this.variableAttribute = variableAttribute;
        return this;
    }
    public String getVariableAttribute() {
        return this.variableAttribute;
    }

    public static class GetSmsTemplateResponseBodyAuditInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-06-03 11:20:34</p>
         */
        @NameInMap("AuditDate")
        public String auditDate;

        @NameInMap("RejectInfo")
        public String rejectInfo;

        public static GetSmsTemplateResponseBodyAuditInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSmsTemplateResponseBodyAuditInfo self = new GetSmsTemplateResponseBodyAuditInfo();
            return TeaModel.build(map, self);
        }

        public GetSmsTemplateResponseBodyAuditInfo setAuditDate(String auditDate) {
            this.auditDate = auditDate;
            return this;
        }
        public String getAuditDate() {
            return this.auditDate;
        }

        public GetSmsTemplateResponseBodyAuditInfo setRejectInfo(String rejectInfo) {
            this.rejectInfo = rejectInfo;
            return this;
        }
        public String getRejectInfo() {
            return this.rejectInfo;
        }

    }

    public static class GetSmsTemplateResponseBodyFileUrlList extends TeaModel {
        @NameInMap("FileUrl")
        public java.util.List<String> fileUrl;

        public static GetSmsTemplateResponseBodyFileUrlList build(java.util.Map<String, ?> map) throws Exception {
            GetSmsTemplateResponseBodyFileUrlList self = new GetSmsTemplateResponseBodyFileUrlList();
            return TeaModel.build(map, self);
        }

        public GetSmsTemplateResponseBodyFileUrlList setFileUrl(java.util.List<String> fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public java.util.List<String> getFileUrl() {
            return this.fileUrl;
        }

    }

    public static class GetSmsTemplateResponseBodyMoreDataFileUrlList extends TeaModel {
        @NameInMap("MoreDataFileUrl")
        public java.util.List<String> moreDataFileUrl;

        public static GetSmsTemplateResponseBodyMoreDataFileUrlList build(java.util.Map<String, ?> map) throws Exception {
            GetSmsTemplateResponseBodyMoreDataFileUrlList self = new GetSmsTemplateResponseBodyMoreDataFileUrlList();
            return TeaModel.build(map, self);
        }

        public GetSmsTemplateResponseBodyMoreDataFileUrlList setMoreDataFileUrl(java.util.List<String> moreDataFileUrl) {
            this.moreDataFileUrl = moreDataFileUrl;
            return this;
        }
        public java.util.List<String> getMoreDataFileUrl() {
            return this.moreDataFileUrl;
        }

    }

}
