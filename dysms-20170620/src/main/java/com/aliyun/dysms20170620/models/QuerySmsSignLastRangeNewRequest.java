// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSignLastRangeNewRequest extends TeaModel {
    @NameInMap("AuditState")
    public String auditState;

    @NameInMap("IsGlobeSign")
    public Integer isGlobeSign;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("NeedDefaultSign")
    public Boolean needDefaultSign;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

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

    @NameInMap("SceneType")
    public Integer sceneType;

    @NameInMap("SignName")
    public String signName;

    public static QuerySmsSignLastRangeNewRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSignLastRangeNewRequest self = new QuerySmsSignLastRangeNewRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmsSignLastRangeNewRequest setAuditState(String auditState) {
        this.auditState = auditState;
        return this;
    }
    public String getAuditState() {
        return this.auditState;
    }

    public QuerySmsSignLastRangeNewRequest setIsGlobeSign(Integer isGlobeSign) {
        this.isGlobeSign = isGlobeSign;
        return this;
    }
    public Integer getIsGlobeSign() {
        return this.isGlobeSign;
    }

    public QuerySmsSignLastRangeNewRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public QuerySmsSignLastRangeNewRequest setNeedDefaultSign(Boolean needDefaultSign) {
        this.needDefaultSign = needDefaultSign;
        return this;
    }
    public Boolean getNeedDefaultSign() {
        return this.needDefaultSign;
    }

    public QuerySmsSignLastRangeNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySmsSignLastRangeNewRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public QuerySmsSignLastRangeNewRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QuerySmsSignLastRangeNewRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySmsSignLastRangeNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QuerySmsSignLastRangeNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySmsSignLastRangeNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySmsSignLastRangeNewRequest setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public Integer getSceneType() {
        return this.sceneType;
    }

    public QuerySmsSignLastRangeNewRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

}
