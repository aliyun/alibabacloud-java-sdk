// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsTemplateListNewResponseBody extends TeaModel {
    @NameInMap("List")
    public QuerySmsTemplateListNewResponseBodyList list;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static QuerySmsTemplateListNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTemplateListNewResponseBody self = new QuerySmsTemplateListNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsTemplateListNewResponseBody setList(QuerySmsTemplateListNewResponseBodyList list) {
        this.list = list;
        return this;
    }
    public QuerySmsTemplateListNewResponseBodyList getList() {
        return this.list;
    }

    public QuerySmsTemplateListNewResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QuerySmsTemplateListNewResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySmsTemplateListNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsTemplateListNewResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class QuerySmsTemplateListNewResponseBodyListSmsTemplateTagsTag extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static QuerySmsTemplateListNewResponseBodyListSmsTemplateTagsTag build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsTemplateListNewResponseBodyListSmsTemplateTagsTag self = new QuerySmsTemplateListNewResponseBodyListSmsTemplateTagsTag();
            return TeaModel.build(map, self);
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplateTagsTag setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplateTagsTag setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplateTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplateTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class QuerySmsTemplateListNewResponseBodyListSmsTemplateTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<QuerySmsTemplateListNewResponseBodyListSmsTemplateTagsTag> tag;

        public static QuerySmsTemplateListNewResponseBodyListSmsTemplateTags build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsTemplateListNewResponseBodyListSmsTemplateTags self = new QuerySmsTemplateListNewResponseBodyListSmsTemplateTags();
            return TeaModel.build(map, self);
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplateTags setTag(java.util.List<QuerySmsTemplateListNewResponseBodyListSmsTemplateTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<QuerySmsTemplateListNewResponseBodyListSmsTemplateTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class QuerySmsTemplateListNewResponseBodyListSmsTemplate extends TeaModel {
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

        @NameInMap("IntelligentApproval")
        public Boolean intelligentApproval;

        @NameInMap("IntlType")
        public Integer intlType;

        @NameInMap("IsAnyParam")
        public Boolean isAnyParam;

        @NameInMap("IsDefaultTemplate")
        public Boolean isDefaultTemplate;

        @NameInMap("IsRecently")
        public Boolean isRecently;

        @NameInMap("OrderCount")
        public Long orderCount;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("PassErrType")
        public String passErrType;

        @NameInMap("ProductUrl")
        public String productUrl;

        @NameInMap("RelatedSignName")
        public String relatedSignName;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("SignType")
        public Integer signType;

        @NameInMap("SmsContent")
        public String smsContent;

        @NameInMap("SupportVendor")
        public String supportVendor;

        @NameInMap("Tags")
        public QuerySmsTemplateListNewResponseBodyListSmsTemplateTags tags;

        @NameInMap("TemplateCode")
        public String templateCode;

        @NameInMap("TemplateContent")
        public String templateContent;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateRule")
        public String templateRule;

        public static QuerySmsTemplateListNewResponseBodyListSmsTemplate build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsTemplateListNewResponseBodyListSmsTemplate self = new QuerySmsTemplateListNewResponseBodyListSmsTemplate();
            return TeaModel.build(map, self);
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setAuditInfo(String auditInfo) {
            this.auditInfo = auditInfo;
            return this;
        }
        public String getAuditInfo() {
            return this.auditInfo;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setAuditRemarkInfo(String auditRemarkInfo) {
            this.auditRemarkInfo = auditRemarkInfo;
            return this;
        }
        public String getAuditRemarkInfo() {
            return this.auditRemarkInfo;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setAuditState(String auditState) {
            this.auditState = auditState;
            return this;
        }
        public String getAuditState() {
            return this.auditState;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setExpireDateStr(String expireDateStr) {
            this.expireDateStr = expireDateStr;
            return this;
        }
        public String getExpireDateStr() {
            return this.expireDateStr;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setGmtCreateStr(String gmtCreateStr) {
            this.gmtCreateStr = gmtCreateStr;
            return this;
        }
        public String getGmtCreateStr() {
            return this.gmtCreateStr;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setIntelligentApproval(Boolean intelligentApproval) {
            this.intelligentApproval = intelligentApproval;
            return this;
        }
        public Boolean getIntelligentApproval() {
            return this.intelligentApproval;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setIntlType(Integer intlType) {
            this.intlType = intlType;
            return this;
        }
        public Integer getIntlType() {
            return this.intlType;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setIsAnyParam(Boolean isAnyParam) {
            this.isAnyParam = isAnyParam;
            return this;
        }
        public Boolean getIsAnyParam() {
            return this.isAnyParam;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setIsDefaultTemplate(Boolean isDefaultTemplate) {
            this.isDefaultTemplate = isDefaultTemplate;
            return this;
        }
        public Boolean getIsDefaultTemplate() {
            return this.isDefaultTemplate;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setIsRecently(Boolean isRecently) {
            this.isRecently = isRecently;
            return this;
        }
        public Boolean getIsRecently() {
            return this.isRecently;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setOrderCount(Long orderCount) {
            this.orderCount = orderCount;
            return this;
        }
        public Long getOrderCount() {
            return this.orderCount;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setPassErrType(String passErrType) {
            this.passErrType = passErrType;
            return this;
        }
        public String getPassErrType() {
            return this.passErrType;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setProductUrl(String productUrl) {
            this.productUrl = productUrl;
            return this;
        }
        public String getProductUrl() {
            return this.productUrl;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setRelatedSignName(String relatedSignName) {
            this.relatedSignName = relatedSignName;
            return this;
        }
        public String getRelatedSignName() {
            return this.relatedSignName;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setSignType(Integer signType) {
            this.signType = signType;
            return this;
        }
        public Integer getSignType() {
            return this.signType;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setSmsContent(String smsContent) {
            this.smsContent = smsContent;
            return this;
        }
        public String getSmsContent() {
            return this.smsContent;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setSupportVendor(String supportVendor) {
            this.supportVendor = supportVendor;
            return this;
        }
        public String getSupportVendor() {
            return this.supportVendor;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setTags(QuerySmsTemplateListNewResponseBodyListSmsTemplateTags tags) {
            this.tags = tags;
            return this;
        }
        public QuerySmsTemplateListNewResponseBodyListSmsTemplateTags getTags() {
            return this.tags;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setTemplateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public String getTemplateContent() {
            return this.templateContent;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public QuerySmsTemplateListNewResponseBodyListSmsTemplate setTemplateRule(String templateRule) {
            this.templateRule = templateRule;
            return this;
        }
        public String getTemplateRule() {
            return this.templateRule;
        }

    }

    public static class QuerySmsTemplateListNewResponseBodyList extends TeaModel {
        @NameInMap("SmsTemplate")
        public java.util.List<QuerySmsTemplateListNewResponseBodyListSmsTemplate> smsTemplate;

        public static QuerySmsTemplateListNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsTemplateListNewResponseBodyList self = new QuerySmsTemplateListNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QuerySmsTemplateListNewResponseBodyList setSmsTemplate(java.util.List<QuerySmsTemplateListNewResponseBodyListSmsTemplate> smsTemplate) {
            this.smsTemplate = smsTemplate;
            return this;
        }
        public java.util.List<QuerySmsTemplateListNewResponseBodyListSmsTemplate> getSmsTemplate() {
            return this.smsTemplate;
        }

    }

}
