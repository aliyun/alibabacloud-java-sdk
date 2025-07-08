// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsTemplateByCodeNewResponseBody extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("ApplicationScene")
    public QuerySmsTemplateByCodeNewResponseBodyApplicationScene applicationScene;

    @NameInMap("AuditInfo")
    public String auditInfo;

    @NameInMap("AuditRemarkInfo")
    public String auditRemarkInfo;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("FileIds")
    public QuerySmsTemplateByCodeNewResponseBodyFileIds fileIds;

    @NameInMap("FileUrlList")
    public QuerySmsTemplateByCodeNewResponseBodyFileUrlList fileUrlList;

    @NameInMap("From")
    public String from;

    @NameInMap("GmtCreateStr")
    public String gmtCreateStr;

    @NameInMap("IntlType")
    public Integer intlType;

    @NameInMap("MoreDataFileIds")
    public QuerySmsTemplateByCodeNewResponseBodyMoreDataFileIds moreDataFileIds;

    @NameInMap("MoreDataFileUrls")
    public QuerySmsTemplateByCodeNewResponseBodyMoreDataFileUrls moreDataFileUrls;

    @NameInMap("MoreDataOssKeys")
    public QuerySmsTemplateByCodeNewResponseBodyMoreDataOssKeys moreDataOssKeys;

    @NameInMap("NeedAuthorized")
    public Boolean needAuthorized;

    @NameInMap("OpenTag")
    public Boolean openTag;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OssKeys")
    public QuerySmsTemplateByCodeNewResponseBodyOssKeys ossKeys;

    @NameInMap("ProductUrl")
    public String productUrl;

    @NameInMap("RelatedSignName")
    public String relatedSignName;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RmdTemplateId")
    public Integer rmdTemplateId;

    @NameInMap("RmdTemplateVariableNum")
    public Integer rmdTemplateVariableNum;

    @NameInMap("SignName")
    public String signName;

    @NameInMap("SignType")
    public Integer signType;

    @NameInMap("SmsContent")
    public String smsContent;

    @NameInMap("Tags")
    public QuerySmsTemplateByCodeNewResponseBodyTags tags;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateRule")
    public String templateRule;

    public static QuerySmsTemplateByCodeNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTemplateByCodeNewResponseBody self = new QuerySmsTemplateByCodeNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsTemplateByCodeNewResponseBody setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public QuerySmsTemplateByCodeNewResponseBody setApplicationScene(QuerySmsTemplateByCodeNewResponseBodyApplicationScene applicationScene) {
        this.applicationScene = applicationScene;
        return this;
    }
    public QuerySmsTemplateByCodeNewResponseBodyApplicationScene getApplicationScene() {
        return this.applicationScene;
    }

    public QuerySmsTemplateByCodeNewResponseBody setAuditInfo(String auditInfo) {
        this.auditInfo = auditInfo;
        return this;
    }
    public String getAuditInfo() {
        return this.auditInfo;
    }

    public QuerySmsTemplateByCodeNewResponseBody setAuditRemarkInfo(String auditRemarkInfo) {
        this.auditRemarkInfo = auditRemarkInfo;
        return this;
    }
    public String getAuditRemarkInfo() {
        return this.auditRemarkInfo;
    }

    public QuerySmsTemplateByCodeNewResponseBody setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QuerySmsTemplateByCodeNewResponseBody setFileIds(QuerySmsTemplateByCodeNewResponseBodyFileIds fileIds) {
        this.fileIds = fileIds;
        return this;
    }
    public QuerySmsTemplateByCodeNewResponseBodyFileIds getFileIds() {
        return this.fileIds;
    }

    public QuerySmsTemplateByCodeNewResponseBody setFileUrlList(QuerySmsTemplateByCodeNewResponseBodyFileUrlList fileUrlList) {
        this.fileUrlList = fileUrlList;
        return this;
    }
    public QuerySmsTemplateByCodeNewResponseBodyFileUrlList getFileUrlList() {
        return this.fileUrlList;
    }

    public QuerySmsTemplateByCodeNewResponseBody setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public QuerySmsTemplateByCodeNewResponseBody setGmtCreateStr(String gmtCreateStr) {
        this.gmtCreateStr = gmtCreateStr;
        return this;
    }
    public String getGmtCreateStr() {
        return this.gmtCreateStr;
    }

    public QuerySmsTemplateByCodeNewResponseBody setIntlType(Integer intlType) {
        this.intlType = intlType;
        return this;
    }
    public Integer getIntlType() {
        return this.intlType;
    }

    public QuerySmsTemplateByCodeNewResponseBody setMoreDataFileIds(QuerySmsTemplateByCodeNewResponseBodyMoreDataFileIds moreDataFileIds) {
        this.moreDataFileIds = moreDataFileIds;
        return this;
    }
    public QuerySmsTemplateByCodeNewResponseBodyMoreDataFileIds getMoreDataFileIds() {
        return this.moreDataFileIds;
    }

    public QuerySmsTemplateByCodeNewResponseBody setMoreDataFileUrls(QuerySmsTemplateByCodeNewResponseBodyMoreDataFileUrls moreDataFileUrls) {
        this.moreDataFileUrls = moreDataFileUrls;
        return this;
    }
    public QuerySmsTemplateByCodeNewResponseBodyMoreDataFileUrls getMoreDataFileUrls() {
        return this.moreDataFileUrls;
    }

    public QuerySmsTemplateByCodeNewResponseBody setMoreDataOssKeys(QuerySmsTemplateByCodeNewResponseBodyMoreDataOssKeys moreDataOssKeys) {
        this.moreDataOssKeys = moreDataOssKeys;
        return this;
    }
    public QuerySmsTemplateByCodeNewResponseBodyMoreDataOssKeys getMoreDataOssKeys() {
        return this.moreDataOssKeys;
    }

    public QuerySmsTemplateByCodeNewResponseBody setNeedAuthorized(Boolean needAuthorized) {
        this.needAuthorized = needAuthorized;
        return this;
    }
    public Boolean getNeedAuthorized() {
        return this.needAuthorized;
    }

    public QuerySmsTemplateByCodeNewResponseBody setOpenTag(Boolean openTag) {
        this.openTag = openTag;
        return this;
    }
    public Boolean getOpenTag() {
        return this.openTag;
    }

    public QuerySmsTemplateByCodeNewResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QuerySmsTemplateByCodeNewResponseBody setOssKeys(QuerySmsTemplateByCodeNewResponseBodyOssKeys ossKeys) {
        this.ossKeys = ossKeys;
        return this;
    }
    public QuerySmsTemplateByCodeNewResponseBodyOssKeys getOssKeys() {
        return this.ossKeys;
    }

    public QuerySmsTemplateByCodeNewResponseBody setProductUrl(String productUrl) {
        this.productUrl = productUrl;
        return this;
    }
    public String getProductUrl() {
        return this.productUrl;
    }

    public QuerySmsTemplateByCodeNewResponseBody setRelatedSignName(String relatedSignName) {
        this.relatedSignName = relatedSignName;
        return this;
    }
    public String getRelatedSignName() {
        return this.relatedSignName;
    }

    public QuerySmsTemplateByCodeNewResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public QuerySmsTemplateByCodeNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsTemplateByCodeNewResponseBody setRmdTemplateId(Integer rmdTemplateId) {
        this.rmdTemplateId = rmdTemplateId;
        return this;
    }
    public Integer getRmdTemplateId() {
        return this.rmdTemplateId;
    }

    public QuerySmsTemplateByCodeNewResponseBody setRmdTemplateVariableNum(Integer rmdTemplateVariableNum) {
        this.rmdTemplateVariableNum = rmdTemplateVariableNum;
        return this;
    }
    public Integer getRmdTemplateVariableNum() {
        return this.rmdTemplateVariableNum;
    }

    public QuerySmsTemplateByCodeNewResponseBody setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public QuerySmsTemplateByCodeNewResponseBody setSignType(Integer signType) {
        this.signType = signType;
        return this;
    }
    public Integer getSignType() {
        return this.signType;
    }

    public QuerySmsTemplateByCodeNewResponseBody setSmsContent(String smsContent) {
        this.smsContent = smsContent;
        return this;
    }
    public String getSmsContent() {
        return this.smsContent;
    }

    public QuerySmsTemplateByCodeNewResponseBody setTags(QuerySmsTemplateByCodeNewResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public QuerySmsTemplateByCodeNewResponseBodyTags getTags() {
        return this.tags;
    }

    public QuerySmsTemplateByCodeNewResponseBody setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public QuerySmsTemplateByCodeNewResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public QuerySmsTemplateByCodeNewResponseBody setTemplateRule(String templateRule) {
        this.templateRule = templateRule;
        return this;
    }
    public String getTemplateRule() {
        return this.templateRule;
    }

    public static class QuerySmsTemplateByCodeNewResponseBodyApplicationScene extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static QuerySmsTemplateByCodeNewResponseBodyApplicationScene build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsTemplateByCodeNewResponseBodyApplicationScene self = new QuerySmsTemplateByCodeNewResponseBodyApplicationScene();
            return TeaModel.build(map, self);
        }

        public QuerySmsTemplateByCodeNewResponseBodyApplicationScene setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QuerySmsTemplateByCodeNewResponseBodyApplicationScene setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QuerySmsTemplateByCodeNewResponseBodyApplicationScene setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QuerySmsTemplateByCodeNewResponseBodyFileIds extends TeaModel {
        @NameInMap("FileId")
        public java.util.List<Long> fileId;

        public static QuerySmsTemplateByCodeNewResponseBodyFileIds build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsTemplateByCodeNewResponseBodyFileIds self = new QuerySmsTemplateByCodeNewResponseBodyFileIds();
            return TeaModel.build(map, self);
        }

        public QuerySmsTemplateByCodeNewResponseBodyFileIds setFileId(java.util.List<Long> fileId) {
            this.fileId = fileId;
            return this;
        }
        public java.util.List<Long> getFileId() {
            return this.fileId;
        }

    }

    public static class QuerySmsTemplateByCodeNewResponseBodyFileUrlList extends TeaModel {
        @NameInMap("FileUrl")
        public java.util.List<String> fileUrl;

        public static QuerySmsTemplateByCodeNewResponseBodyFileUrlList build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsTemplateByCodeNewResponseBodyFileUrlList self = new QuerySmsTemplateByCodeNewResponseBodyFileUrlList();
            return TeaModel.build(map, self);
        }

        public QuerySmsTemplateByCodeNewResponseBodyFileUrlList setFileUrl(java.util.List<String> fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public java.util.List<String> getFileUrl() {
            return this.fileUrl;
        }

    }

    public static class QuerySmsTemplateByCodeNewResponseBodyMoreDataFileIds extends TeaModel {
        @NameInMap("MoreDataFileId")
        public java.util.List<Long> moreDataFileId;

        public static QuerySmsTemplateByCodeNewResponseBodyMoreDataFileIds build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsTemplateByCodeNewResponseBodyMoreDataFileIds self = new QuerySmsTemplateByCodeNewResponseBodyMoreDataFileIds();
            return TeaModel.build(map, self);
        }

        public QuerySmsTemplateByCodeNewResponseBodyMoreDataFileIds setMoreDataFileId(java.util.List<Long> moreDataFileId) {
            this.moreDataFileId = moreDataFileId;
            return this;
        }
        public java.util.List<Long> getMoreDataFileId() {
            return this.moreDataFileId;
        }

    }

    public static class QuerySmsTemplateByCodeNewResponseBodyMoreDataFileUrls extends TeaModel {
        @NameInMap("MoreDataFileUrl")
        public java.util.List<String> moreDataFileUrl;

        public static QuerySmsTemplateByCodeNewResponseBodyMoreDataFileUrls build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsTemplateByCodeNewResponseBodyMoreDataFileUrls self = new QuerySmsTemplateByCodeNewResponseBodyMoreDataFileUrls();
            return TeaModel.build(map, self);
        }

        public QuerySmsTemplateByCodeNewResponseBodyMoreDataFileUrls setMoreDataFileUrl(java.util.List<String> moreDataFileUrl) {
            this.moreDataFileUrl = moreDataFileUrl;
            return this;
        }
        public java.util.List<String> getMoreDataFileUrl() {
            return this.moreDataFileUrl;
        }

    }

    public static class QuerySmsTemplateByCodeNewResponseBodyMoreDataOssKeys extends TeaModel {
        @NameInMap("MoreDataOssKey")
        public java.util.List<String> moreDataOssKey;

        public static QuerySmsTemplateByCodeNewResponseBodyMoreDataOssKeys build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsTemplateByCodeNewResponseBodyMoreDataOssKeys self = new QuerySmsTemplateByCodeNewResponseBodyMoreDataOssKeys();
            return TeaModel.build(map, self);
        }

        public QuerySmsTemplateByCodeNewResponseBodyMoreDataOssKeys setMoreDataOssKey(java.util.List<String> moreDataOssKey) {
            this.moreDataOssKey = moreDataOssKey;
            return this;
        }
        public java.util.List<String> getMoreDataOssKey() {
            return this.moreDataOssKey;
        }

    }

    public static class QuerySmsTemplateByCodeNewResponseBodyOssKeys extends TeaModel {
        @NameInMap("OssKey")
        public java.util.List<String> ossKey;

        public static QuerySmsTemplateByCodeNewResponseBodyOssKeys build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsTemplateByCodeNewResponseBodyOssKeys self = new QuerySmsTemplateByCodeNewResponseBodyOssKeys();
            return TeaModel.build(map, self);
        }

        public QuerySmsTemplateByCodeNewResponseBodyOssKeys setOssKey(java.util.List<String> ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public java.util.List<String> getOssKey() {
            return this.ossKey;
        }

    }

    public static class QuerySmsTemplateByCodeNewResponseBodyTagsTagInfo extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static QuerySmsTemplateByCodeNewResponseBodyTagsTagInfo build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsTemplateByCodeNewResponseBodyTagsTagInfo self = new QuerySmsTemplateByCodeNewResponseBodyTagsTagInfo();
            return TeaModel.build(map, self);
        }

        public QuerySmsTemplateByCodeNewResponseBodyTagsTagInfo setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public QuerySmsTemplateByCodeNewResponseBodyTagsTagInfo setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class QuerySmsTemplateByCodeNewResponseBodyTags extends TeaModel {
        @NameInMap("TagInfo")
        public java.util.List<QuerySmsTemplateByCodeNewResponseBodyTagsTagInfo> tagInfo;

        public static QuerySmsTemplateByCodeNewResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsTemplateByCodeNewResponseBodyTags self = new QuerySmsTemplateByCodeNewResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public QuerySmsTemplateByCodeNewResponseBodyTags setTagInfo(java.util.List<QuerySmsTemplateByCodeNewResponseBodyTagsTagInfo> tagInfo) {
            this.tagInfo = tagInfo;
            return this;
        }
        public java.util.List<QuerySmsTemplateByCodeNewResponseBodyTagsTagInfo> getTagInfo() {
            return this.tagInfo;
        }

    }

}
