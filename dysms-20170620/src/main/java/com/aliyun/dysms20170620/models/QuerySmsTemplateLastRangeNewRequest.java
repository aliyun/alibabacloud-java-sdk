// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsTemplateLastRangeNewRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("FilterAnyParam")
    public Boolean filterAnyParam;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("NeedDefaultTemplate")
    public Boolean needDefaultTemplate;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

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

    public static QuerySmsTemplateLastRangeNewRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsTemplateLastRangeNewRequest self = new QuerySmsTemplateLastRangeNewRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmsTemplateLastRangeNewRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QuerySmsTemplateLastRangeNewRequest setFilterAnyParam(Boolean filterAnyParam) {
        this.filterAnyParam = filterAnyParam;
        return this;
    }
    public Boolean getFilterAnyParam() {
        return this.filterAnyParam;
    }

    public QuerySmsTemplateLastRangeNewRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public QuerySmsTemplateLastRangeNewRequest setNeedDefaultTemplate(Boolean needDefaultTemplate) {
        this.needDefaultTemplate = needDefaultTemplate;
        return this;
    }
    public Boolean getNeedDefaultTemplate() {
        return this.needDefaultTemplate;
    }

    public QuerySmsTemplateLastRangeNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySmsTemplateLastRangeNewRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QuerySmsTemplateLastRangeNewRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySmsTemplateLastRangeNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QuerySmsTemplateLastRangeNewRequest setProdId(String prodId) {
        this.prodId = prodId;
        return this;
    }
    public String getProdId() {
        return this.prodId;
    }

    public QuerySmsTemplateLastRangeNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySmsTemplateLastRangeNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySmsTemplateLastRangeNewRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
