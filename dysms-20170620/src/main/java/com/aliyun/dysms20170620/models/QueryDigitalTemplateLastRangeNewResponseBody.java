// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryDigitalTemplateLastRangeNewResponseBody extends TeaModel {
    @NameInMap("List")
    public QueryDigitalTemplateLastRangeNewResponseBodyList list;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tags")
    public QueryDigitalTemplateLastRangeNewResponseBodyTags tags;

    public static QueryDigitalTemplateLastRangeNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalTemplateLastRangeNewResponseBody self = new QueryDigitalTemplateLastRangeNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDigitalTemplateLastRangeNewResponseBody setList(QueryDigitalTemplateLastRangeNewResponseBodyList list) {
        this.list = list;
        return this;
    }
    public QueryDigitalTemplateLastRangeNewResponseBodyList getList() {
        return this.list;
    }

    public QueryDigitalTemplateLastRangeNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDigitalTemplateLastRangeNewResponseBody setTags(QueryDigitalTemplateLastRangeNewResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public QueryDigitalTemplateLastRangeNewResponseBodyTags getTags() {
        return this.tags;
    }

    public static class QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate extends TeaModel {
        @NameInMap("AuditInfo")
        public String auditInfo;

        @NameInMap("AuditRemarkInfo")
        public String auditRemarkInfo;

        @NameInMap("AuditState")
        public String auditState;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("ExpireDateStr")
        public String expireDateStr;

        @NameInMap("GmtCreateStr")
        public String gmtCreateStr;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsAnyParam")
        public Boolean isAnyParam;

        @NameInMap("IsDefaultTemplate")
        public Boolean isDefaultTemplate;

        @NameInMap("IsRecently")
        public Boolean isRecently;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("PassErrType")
        public String passErrType;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("SignType")
        public Integer signType;

        @NameInMap("SmsContent")
        public String smsContent;

        @NameInMap("SupportVendor")
        public String supportVendor;

        @NameInMap("TemplateCode")
        public String templateCode;

        @NameInMap("TemplateContent")
        public String templateContent;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateRule")
        public String templateRule;

        public static QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate build(java.util.Map<String, ?> map) throws Exception {
            QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate self = new QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate();
            return TeaModel.build(map, self);
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate setAuditInfo(String auditInfo) {
            this.auditInfo = auditInfo;
            return this;
        }
        public String getAuditInfo() {
            return this.auditInfo;
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate setAuditRemarkInfo(String auditRemarkInfo) {
            this.auditRemarkInfo = auditRemarkInfo;
            return this;
        }
        public String getAuditRemarkInfo() {
            return this.auditRemarkInfo;
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate setAuditState(String auditState) {
            this.auditState = auditState;
            return this;
        }
        public String getAuditState() {
            return this.auditState;
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate setExpireDateStr(String expireDateStr) {
            this.expireDateStr = expireDateStr;
            return this;
        }
        public String getExpireDateStr() {
            return this.expireDateStr;
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate setGmtCreateStr(String gmtCreateStr) {
            this.gmtCreateStr = gmtCreateStr;
            return this;
        }
        public String getGmtCreateStr() {
            return this.gmtCreateStr;
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate setIsAnyParam(Boolean isAnyParam) {
            this.isAnyParam = isAnyParam;
            return this;
        }
        public Boolean getIsAnyParam() {
            return this.isAnyParam;
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate setIsDefaultTemplate(Boolean isDefaultTemplate) {
            this.isDefaultTemplate = isDefaultTemplate;
            return this;
        }
        public Boolean getIsDefaultTemplate() {
            return this.isDefaultTemplate;
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate setIsRecently(Boolean isRecently) {
            this.isRecently = isRecently;
            return this;
        }
        public Boolean getIsRecently() {
            return this.isRecently;
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate setPassErrType(String passErrType) {
            this.passErrType = passErrType;
            return this;
        }
        public String getPassErrType() {
            return this.passErrType;
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate setSignType(Integer signType) {
            this.signType = signType;
            return this;
        }
        public Integer getSignType() {
            return this.signType;
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate setSmsContent(String smsContent) {
            this.smsContent = smsContent;
            return this;
        }
        public String getSmsContent() {
            return this.smsContent;
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate setSupportVendor(String supportVendor) {
            this.supportVendor = supportVendor;
            return this;
        }
        public String getSupportVendor() {
            return this.supportVendor;
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate setTemplateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public String getTemplateContent() {
            return this.templateContent;
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate setTemplateRule(String templateRule) {
            this.templateRule = templateRule;
            return this;
        }
        public String getTemplateRule() {
            return this.templateRule;
        }

    }

    public static class QueryDigitalTemplateLastRangeNewResponseBodyList extends TeaModel {
        @NameInMap("SmsTemplate")
        public java.util.List<QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate> smsTemplate;

        public static QueryDigitalTemplateLastRangeNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryDigitalTemplateLastRangeNewResponseBodyList self = new QueryDigitalTemplateLastRangeNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyList setSmsTemplate(java.util.List<QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate> smsTemplate) {
            this.smsTemplate = smsTemplate;
            return this;
        }
        public java.util.List<QueryDigitalTemplateLastRangeNewResponseBodyListSmsTemplate> getSmsTemplate() {
            return this.smsTemplate;
        }

    }

    public static class QueryDigitalTemplateLastRangeNewResponseBodyTagsTag extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static QueryDigitalTemplateLastRangeNewResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            QueryDigitalTemplateLastRangeNewResponseBodyTagsTag self = new QueryDigitalTemplateLastRangeNewResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyTagsTag setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyTagsTag setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class QueryDigitalTemplateLastRangeNewResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<QueryDigitalTemplateLastRangeNewResponseBodyTagsTag> tag;

        public static QueryDigitalTemplateLastRangeNewResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            QueryDigitalTemplateLastRangeNewResponseBodyTags self = new QueryDigitalTemplateLastRangeNewResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public QueryDigitalTemplateLastRangeNewResponseBodyTags setTag(java.util.List<QueryDigitalTemplateLastRangeNewResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<QueryDigitalTemplateLastRangeNewResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
