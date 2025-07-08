// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsTemplateLastRangeNewResponseBody extends TeaModel {
    @NameInMap("List")
    public QuerySmsTemplateLastRangeNewResponseBodyList list;

    @NameInMap("RequestId")
    public String requestId;

    public static QuerySmsTemplateLastRangeNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTemplateLastRangeNewResponseBody self = new QuerySmsTemplateLastRangeNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsTemplateLastRangeNewResponseBody setList(QuerySmsTemplateLastRangeNewResponseBodyList list) {
        this.list = list;
        return this;
    }
    public QuerySmsTemplateLastRangeNewResponseBodyList getList() {
        return this.list;
    }

    public QuerySmsTemplateLastRangeNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplateTagsTag extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplateTagsTag build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplateTagsTag self = new QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplateTagsTag();
            return TeaModel.build(map, self);
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplateTagsTag setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplateTagsTag setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplateTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplateTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplateTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplateTagsTag> tag;

        public static QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplateTags build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplateTags self = new QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplateTags();
            return TeaModel.build(map, self);
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplateTags setTag(java.util.List<QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplateTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplateTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate extends TeaModel {
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

        @NameInMap("Tags")
        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplateTags tags;

        @NameInMap("TemplateCode")
        public String templateCode;

        @NameInMap("TemplateContent")
        public String templateContent;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateRule")
        public String templateRule;

        public static QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate self = new QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate();
            return TeaModel.build(map, self);
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate setAuditInfo(String auditInfo) {
            this.auditInfo = auditInfo;
            return this;
        }
        public String getAuditInfo() {
            return this.auditInfo;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate setAuditRemarkInfo(String auditRemarkInfo) {
            this.auditRemarkInfo = auditRemarkInfo;
            return this;
        }
        public String getAuditRemarkInfo() {
            return this.auditRemarkInfo;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate setAuditState(String auditState) {
            this.auditState = auditState;
            return this;
        }
        public String getAuditState() {
            return this.auditState;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate setExpireDateStr(String expireDateStr) {
            this.expireDateStr = expireDateStr;
            return this;
        }
        public String getExpireDateStr() {
            return this.expireDateStr;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate setGmtCreateStr(String gmtCreateStr) {
            this.gmtCreateStr = gmtCreateStr;
            return this;
        }
        public String getGmtCreateStr() {
            return this.gmtCreateStr;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate setIsAnyParam(Boolean isAnyParam) {
            this.isAnyParam = isAnyParam;
            return this;
        }
        public Boolean getIsAnyParam() {
            return this.isAnyParam;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate setIsDefaultTemplate(Boolean isDefaultTemplate) {
            this.isDefaultTemplate = isDefaultTemplate;
            return this;
        }
        public Boolean getIsDefaultTemplate() {
            return this.isDefaultTemplate;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate setIsRecently(Boolean isRecently) {
            this.isRecently = isRecently;
            return this;
        }
        public Boolean getIsRecently() {
            return this.isRecently;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate setPassErrType(String passErrType) {
            this.passErrType = passErrType;
            return this;
        }
        public String getPassErrType() {
            return this.passErrType;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate setSignType(Integer signType) {
            this.signType = signType;
            return this;
        }
        public Integer getSignType() {
            return this.signType;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate setSmsContent(String smsContent) {
            this.smsContent = smsContent;
            return this;
        }
        public String getSmsContent() {
            return this.smsContent;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate setSupportVendor(String supportVendor) {
            this.supportVendor = supportVendor;
            return this;
        }
        public String getSupportVendor() {
            return this.supportVendor;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate setTags(QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplateTags tags) {
            this.tags = tags;
            return this;
        }
        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplateTags getTags() {
            return this.tags;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate setTemplateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public String getTemplateContent() {
            return this.templateContent;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate setTemplateRule(String templateRule) {
            this.templateRule = templateRule;
            return this;
        }
        public String getTemplateRule() {
            return this.templateRule;
        }

    }

    public static class QuerySmsTemplateLastRangeNewResponseBodyList extends TeaModel {
        @NameInMap("SmsTemplate")
        public java.util.List<QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate> smsTemplate;

        public static QuerySmsTemplateLastRangeNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsTemplateLastRangeNewResponseBodyList self = new QuerySmsTemplateLastRangeNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QuerySmsTemplateLastRangeNewResponseBodyList setSmsTemplate(java.util.List<QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate> smsTemplate) {
            this.smsTemplate = smsTemplate;
            return this;
        }
        public java.util.List<QuerySmsTemplateLastRangeNewResponseBodyListSmsTemplate> getSmsTemplate() {
            return this.smsTemplate;
        }

    }

}
