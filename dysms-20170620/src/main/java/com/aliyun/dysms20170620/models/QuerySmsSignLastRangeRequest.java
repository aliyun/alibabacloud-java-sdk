// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSignLastRangeRequest extends TeaModel {
    @NameInMap("AuditState")
    public String auditState;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("IsGlobeSign")
    public Integer isGlobeSign;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("NeedDefaultSign")
    public Boolean needDefaultSign;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SignName")
    public String signName;

    public static QuerySmsSignLastRangeRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSignLastRangeRequest self = new QuerySmsSignLastRangeRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmsSignLastRangeRequest setAuditState(String auditState) {
        this.auditState = auditState;
        return this;
    }
    public String getAuditState() {
        return this.auditState;
    }

    public QuerySmsSignLastRangeRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QuerySmsSignLastRangeRequest setIsGlobeSign(Integer isGlobeSign) {
        this.isGlobeSign = isGlobeSign;
        return this;
    }
    public Integer getIsGlobeSign() {
        return this.isGlobeSign;
    }

    public QuerySmsSignLastRangeRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public QuerySmsSignLastRangeRequest setNeedDefaultSign(Boolean needDefaultSign) {
        this.needDefaultSign = needDefaultSign;
        return this;
    }
    public Boolean getNeedDefaultSign() {
        return this.needDefaultSign;
    }

    public QuerySmsSignLastRangeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySmsSignLastRangeRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QuerySmsSignLastRangeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySmsSignLastRangeRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QuerySmsSignLastRangeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySmsSignLastRangeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySmsSignLastRangeRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

}
