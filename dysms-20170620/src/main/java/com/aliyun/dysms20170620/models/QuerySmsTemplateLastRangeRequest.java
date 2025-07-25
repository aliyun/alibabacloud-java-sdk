// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsTemplateLastRangeRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("NeedDefaultTemplate")
    public Boolean needDefaultTemplate;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ProdId")
    public String prodId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TemplateName")
    public String templateName;

    public static QuerySmsTemplateLastRangeRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTemplateLastRangeRequest self = new QuerySmsTemplateLastRangeRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmsTemplateLastRangeRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QuerySmsTemplateLastRangeRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public QuerySmsTemplateLastRangeRequest setNeedDefaultTemplate(Boolean needDefaultTemplate) {
        this.needDefaultTemplate = needDefaultTemplate;
        return this;
    }
    public Boolean getNeedDefaultTemplate() {
        return this.needDefaultTemplate;
    }

    public QuerySmsTemplateLastRangeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySmsTemplateLastRangeRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QuerySmsTemplateLastRangeRequest setProdId(String prodId) {
        this.prodId = prodId;
        return this;
    }
    public String getProdId() {
        return this.prodId;
    }

    public QuerySmsTemplateLastRangeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySmsTemplateLastRangeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySmsTemplateLastRangeRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
