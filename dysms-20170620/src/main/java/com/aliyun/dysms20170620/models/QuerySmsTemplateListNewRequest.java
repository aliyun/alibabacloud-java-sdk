// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsTemplateListNewRequest extends TeaModel {
    @NameInMap("AuditState")
    public String auditState;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("IntlType")
    public Integer intlType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ProdType")
    public String prodType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TagListString")
    public String tagListString;

    @NameInMap("Tags")
    public java.util.List<QuerySmsTemplateListNewRequestTags> tags;

    @NameInMap("TemplateName")
    public String templateName;

    public static QuerySmsTemplateListNewRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTemplateListNewRequest self = new QuerySmsTemplateListNewRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmsTemplateListNewRequest setAuditState(String auditState) {
        this.auditState = auditState;
        return this;
    }
    public String getAuditState() {
        return this.auditState;
    }

    public QuerySmsTemplateListNewRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QuerySmsTemplateListNewRequest setIntlType(Integer intlType) {
        this.intlType = intlType;
        return this;
    }
    public Integer getIntlType() {
        return this.intlType;
    }

    public QuerySmsTemplateListNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySmsTemplateListNewRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QuerySmsTemplateListNewRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySmsTemplateListNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QuerySmsTemplateListNewRequest setProdType(String prodType) {
        this.prodType = prodType;
        return this;
    }
    public String getProdType() {
        return this.prodType;
    }

    public QuerySmsTemplateListNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySmsTemplateListNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySmsTemplateListNewRequest setTagListString(String tagListString) {
        this.tagListString = tagListString;
        return this;
    }
    public String getTagListString() {
        return this.tagListString;
    }

    public QuerySmsTemplateListNewRequest setTags(java.util.List<QuerySmsTemplateListNewRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<QuerySmsTemplateListNewRequestTags> getTags() {
        return this.tags;
    }

    public QuerySmsTemplateListNewRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public static class QuerySmsTemplateListNewRequestTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static QuerySmsTemplateListNewRequestTags build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsTemplateListNewRequestTags self = new QuerySmsTemplateListNewRequestTags();
            return TeaModel.build(map, self);
        }

        public QuerySmsTemplateListNewRequestTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public QuerySmsTemplateListNewRequestTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
