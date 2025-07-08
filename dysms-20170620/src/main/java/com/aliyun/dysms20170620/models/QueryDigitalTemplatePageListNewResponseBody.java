// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryDigitalTemplatePageListNewResponseBody extends TeaModel {
    @NameInMap("List")
    public QueryDigitalTemplatePageListNewResponseBodyList list;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static QueryDigitalTemplatePageListNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalTemplatePageListNewResponseBody self = new QueryDigitalTemplatePageListNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDigitalTemplatePageListNewResponseBody setList(QueryDigitalTemplatePageListNewResponseBodyList list) {
        this.list = list;
        return this;
    }
    public QueryDigitalTemplatePageListNewResponseBodyList getList() {
        return this.list;
    }

    public QueryDigitalTemplatePageListNewResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryDigitalTemplatePageListNewResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDigitalTemplatePageListNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDigitalTemplatePageListNewResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class QueryDigitalTemplatePageListNewResponseBodyListSmsTemplateTagsTag extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static QueryDigitalTemplatePageListNewResponseBodyListSmsTemplateTagsTag build(java.util.Map<String, ?> map) throws Exception {
            QueryDigitalTemplatePageListNewResponseBodyListSmsTemplateTagsTag self = new QueryDigitalTemplatePageListNewResponseBodyListSmsTemplateTagsTag();
            return TeaModel.build(map, self);
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplateTagsTag setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplateTagsTag setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplateTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplateTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class QueryDigitalTemplatePageListNewResponseBodyListSmsTemplateTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<QueryDigitalTemplatePageListNewResponseBodyListSmsTemplateTagsTag> tag;

        public static QueryDigitalTemplatePageListNewResponseBodyListSmsTemplateTags build(java.util.Map<String, ?> map) throws Exception {
            QueryDigitalTemplatePageListNewResponseBodyListSmsTemplateTags self = new QueryDigitalTemplatePageListNewResponseBodyListSmsTemplateTags();
            return TeaModel.build(map, self);
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplateTags setTag(java.util.List<QueryDigitalTemplatePageListNewResponseBodyListSmsTemplateTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<QueryDigitalTemplatePageListNewResponseBodyListSmsTemplateTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate extends TeaModel {
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
        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplateTags tags;

        @NameInMap("TemplateCode")
        public String templateCode;

        @NameInMap("TemplateContent")
        public String templateContent;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateRule")
        public String templateRule;

        public static QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate build(java.util.Map<String, ?> map) throws Exception {
            QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate self = new QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate();
            return TeaModel.build(map, self);
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate setAuditInfo(String auditInfo) {
            this.auditInfo = auditInfo;
            return this;
        }
        public String getAuditInfo() {
            return this.auditInfo;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate setAuditRemarkInfo(String auditRemarkInfo) {
            this.auditRemarkInfo = auditRemarkInfo;
            return this;
        }
        public String getAuditRemarkInfo() {
            return this.auditRemarkInfo;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate setAuditState(String auditState) {
            this.auditState = auditState;
            return this;
        }
        public String getAuditState() {
            return this.auditState;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate setExpireDateStr(String expireDateStr) {
            this.expireDateStr = expireDateStr;
            return this;
        }
        public String getExpireDateStr() {
            return this.expireDateStr;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate setGmtCreateStr(String gmtCreateStr) {
            this.gmtCreateStr = gmtCreateStr;
            return this;
        }
        public String getGmtCreateStr() {
            return this.gmtCreateStr;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate setIsAnyParam(Boolean isAnyParam) {
            this.isAnyParam = isAnyParam;
            return this;
        }
        public Boolean getIsAnyParam() {
            return this.isAnyParam;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate setIsDefaultTemplate(Boolean isDefaultTemplate) {
            this.isDefaultTemplate = isDefaultTemplate;
            return this;
        }
        public Boolean getIsDefaultTemplate() {
            return this.isDefaultTemplate;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate setIsRecently(Boolean isRecently) {
            this.isRecently = isRecently;
            return this;
        }
        public Boolean getIsRecently() {
            return this.isRecently;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate setPassErrType(String passErrType) {
            this.passErrType = passErrType;
            return this;
        }
        public String getPassErrType() {
            return this.passErrType;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate setSignType(Integer signType) {
            this.signType = signType;
            return this;
        }
        public Integer getSignType() {
            return this.signType;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate setSmsContent(String smsContent) {
            this.smsContent = smsContent;
            return this;
        }
        public String getSmsContent() {
            return this.smsContent;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate setSupportVendor(String supportVendor) {
            this.supportVendor = supportVendor;
            return this;
        }
        public String getSupportVendor() {
            return this.supportVendor;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate setTags(QueryDigitalTemplatePageListNewResponseBodyListSmsTemplateTags tags) {
            this.tags = tags;
            return this;
        }
        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplateTags getTags() {
            return this.tags;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate setTemplateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public String getTemplateContent() {
            return this.templateContent;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate setTemplateRule(String templateRule) {
            this.templateRule = templateRule;
            return this;
        }
        public String getTemplateRule() {
            return this.templateRule;
        }

    }

    public static class QueryDigitalTemplatePageListNewResponseBodyList extends TeaModel {
        @NameInMap("SmsTemplate")
        public java.util.List<QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate> smsTemplate;

        public static QueryDigitalTemplatePageListNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryDigitalTemplatePageListNewResponseBodyList self = new QueryDigitalTemplatePageListNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryDigitalTemplatePageListNewResponseBodyList setSmsTemplate(java.util.List<QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate> smsTemplate) {
            this.smsTemplate = smsTemplate;
            return this;
        }
        public java.util.List<QueryDigitalTemplatePageListNewResponseBodyListSmsTemplate> getSmsTemplate() {
            return this.smsTemplate;
        }

    }

}
