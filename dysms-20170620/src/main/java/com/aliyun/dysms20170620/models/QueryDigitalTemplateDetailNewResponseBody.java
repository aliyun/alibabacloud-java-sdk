// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryDigitalTemplateDetailNewResponseBody extends TeaModel {
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

    @NameInMap("OssKeys")
    public QueryDigitalTemplateDetailNewResponseBodyOssKeys ossKeys;

    @NameInMap("PassErrType")
    public String passErrType;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SignType")
    public Integer signType;

    @NameInMap("SmsContent")
    public String smsContent;

    @NameInMap("SupportVendor")
    public String supportVendor;

    @NameInMap("Tags")
    public QueryDigitalTemplateDetailNewResponseBodyTags tags;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateContent")
    public String templateContent;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateRule")
    public String templateRule;

    public static QueryDigitalTemplateDetailNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalTemplateDetailNewResponseBody self = new QueryDigitalTemplateDetailNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDigitalTemplateDetailNewResponseBody setAuditInfo(String auditInfo) {
        this.auditInfo = auditInfo;
        return this;
    }
    public String getAuditInfo() {
        return this.auditInfo;
    }

    public QueryDigitalTemplateDetailNewResponseBody setAuditRemarkInfo(String auditRemarkInfo) {
        this.auditRemarkInfo = auditRemarkInfo;
        return this;
    }
    public String getAuditRemarkInfo() {
        return this.auditRemarkInfo;
    }

    public QueryDigitalTemplateDetailNewResponseBody setAuditState(String auditState) {
        this.auditState = auditState;
        return this;
    }
    public String getAuditState() {
        return this.auditState;
    }

    public QueryDigitalTemplateDetailNewResponseBody setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryDigitalTemplateDetailNewResponseBody setExpireDateStr(String expireDateStr) {
        this.expireDateStr = expireDateStr;
        return this;
    }
    public String getExpireDateStr() {
        return this.expireDateStr;
    }

    public QueryDigitalTemplateDetailNewResponseBody setGmtCreateStr(String gmtCreateStr) {
        this.gmtCreateStr = gmtCreateStr;
        return this;
    }
    public String getGmtCreateStr() {
        return this.gmtCreateStr;
    }

    public QueryDigitalTemplateDetailNewResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryDigitalTemplateDetailNewResponseBody setIsAnyParam(Boolean isAnyParam) {
        this.isAnyParam = isAnyParam;
        return this;
    }
    public Boolean getIsAnyParam() {
        return this.isAnyParam;
    }

    public QueryDigitalTemplateDetailNewResponseBody setIsDefaultTemplate(Boolean isDefaultTemplate) {
        this.isDefaultTemplate = isDefaultTemplate;
        return this;
    }
    public Boolean getIsDefaultTemplate() {
        return this.isDefaultTemplate;
    }

    public QueryDigitalTemplateDetailNewResponseBody setIsRecently(Boolean isRecently) {
        this.isRecently = isRecently;
        return this;
    }
    public Boolean getIsRecently() {
        return this.isRecently;
    }

    public QueryDigitalTemplateDetailNewResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryDigitalTemplateDetailNewResponseBody setOssKeys(QueryDigitalTemplateDetailNewResponseBodyOssKeys ossKeys) {
        this.ossKeys = ossKeys;
        return this;
    }
    public QueryDigitalTemplateDetailNewResponseBodyOssKeys getOssKeys() {
        return this.ossKeys;
    }

    public QueryDigitalTemplateDetailNewResponseBody setPassErrType(String passErrType) {
        this.passErrType = passErrType;
        return this;
    }
    public String getPassErrType() {
        return this.passErrType;
    }

    public QueryDigitalTemplateDetailNewResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public QueryDigitalTemplateDetailNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDigitalTemplateDetailNewResponseBody setSignType(Integer signType) {
        this.signType = signType;
        return this;
    }
    public Integer getSignType() {
        return this.signType;
    }

    public QueryDigitalTemplateDetailNewResponseBody setSmsContent(String smsContent) {
        this.smsContent = smsContent;
        return this;
    }
    public String getSmsContent() {
        return this.smsContent;
    }

    public QueryDigitalTemplateDetailNewResponseBody setSupportVendor(String supportVendor) {
        this.supportVendor = supportVendor;
        return this;
    }
    public String getSupportVendor() {
        return this.supportVendor;
    }

    public QueryDigitalTemplateDetailNewResponseBody setTags(QueryDigitalTemplateDetailNewResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public QueryDigitalTemplateDetailNewResponseBodyTags getTags() {
        return this.tags;
    }

    public QueryDigitalTemplateDetailNewResponseBody setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public QueryDigitalTemplateDetailNewResponseBody setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public QueryDigitalTemplateDetailNewResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public QueryDigitalTemplateDetailNewResponseBody setTemplateRule(String templateRule) {
        this.templateRule = templateRule;
        return this;
    }
    public String getTemplateRule() {
        return this.templateRule;
    }

    public static class QueryDigitalTemplateDetailNewResponseBodyOssKeys extends TeaModel {
        @NameInMap("OssKey")
        public java.util.List<String> ossKey;

        public static QueryDigitalTemplateDetailNewResponseBodyOssKeys build(java.util.Map<String, ?> map) throws Exception {
            QueryDigitalTemplateDetailNewResponseBodyOssKeys self = new QueryDigitalTemplateDetailNewResponseBodyOssKeys();
            return TeaModel.build(map, self);
        }

        public QueryDigitalTemplateDetailNewResponseBodyOssKeys setOssKey(java.util.List<String> ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public java.util.List<String> getOssKey() {
            return this.ossKey;
        }

    }

    public static class QueryDigitalTemplateDetailNewResponseBodyTagsTag extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static QueryDigitalTemplateDetailNewResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            QueryDigitalTemplateDetailNewResponseBodyTagsTag self = new QueryDigitalTemplateDetailNewResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public QueryDigitalTemplateDetailNewResponseBodyTagsTag setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryDigitalTemplateDetailNewResponseBodyTagsTag setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryDigitalTemplateDetailNewResponseBodyTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public QueryDigitalTemplateDetailNewResponseBodyTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class QueryDigitalTemplateDetailNewResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<QueryDigitalTemplateDetailNewResponseBodyTagsTag> tag;

        public static QueryDigitalTemplateDetailNewResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            QueryDigitalTemplateDetailNewResponseBodyTags self = new QueryDigitalTemplateDetailNewResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public QueryDigitalTemplateDetailNewResponseBodyTags setTag(java.util.List<QueryDigitalTemplateDetailNewResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<QueryDigitalTemplateDetailNewResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
