// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSignListNewShrinkRequest extends TeaModel {
    @NameInMap("AggregatedRegisterStatus")
    public Integer aggregatedRegisterStatus;

    @NameInMap("AuditState")
    public String auditState;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("IsGlobeSign")
    public Integer isGlobeSign;

    @NameInMap("OperatorCodes")
    public String operatorCodesShrink;

    @NameInMap("OperatorRegisterStatus")
    public Integer operatorRegisterStatus;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("QualificationName")
    public String qualificationName;

    @NameInMap("RegisterResult")
    public Integer registerResult;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("SignName")
    public String signName;

    @NameInMap("SignSource")
    public String signSource;

    public static QuerySmsSignListNewShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSignListNewShrinkRequest self = new QuerySmsSignListNewShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmsSignListNewShrinkRequest setAggregatedRegisterStatus(Integer aggregatedRegisterStatus) {
        this.aggregatedRegisterStatus = aggregatedRegisterStatus;
        return this;
    }
    public Integer getAggregatedRegisterStatus() {
        return this.aggregatedRegisterStatus;
    }

    public QuerySmsSignListNewShrinkRequest setAuditState(String auditState) {
        this.auditState = auditState;
        return this;
    }
    public String getAuditState() {
        return this.auditState;
    }

    public QuerySmsSignListNewShrinkRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QuerySmsSignListNewShrinkRequest setIsGlobeSign(Integer isGlobeSign) {
        this.isGlobeSign = isGlobeSign;
        return this;
    }
    public Integer getIsGlobeSign() {
        return this.isGlobeSign;
    }

    public QuerySmsSignListNewShrinkRequest setOperatorCodesShrink(String operatorCodesShrink) {
        this.operatorCodesShrink = operatorCodesShrink;
        return this;
    }
    public String getOperatorCodesShrink() {
        return this.operatorCodesShrink;
    }

    public QuerySmsSignListNewShrinkRequest setOperatorRegisterStatus(Integer operatorRegisterStatus) {
        this.operatorRegisterStatus = operatorRegisterStatus;
        return this;
    }
    public Integer getOperatorRegisterStatus() {
        return this.operatorRegisterStatus;
    }

    public QuerySmsSignListNewShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySmsSignListNewShrinkRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QuerySmsSignListNewShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QuerySmsSignListNewShrinkRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QuerySmsSignListNewShrinkRequest setQualificationName(String qualificationName) {
        this.qualificationName = qualificationName;
        return this;
    }
    public String getQualificationName() {
        return this.qualificationName;
    }

    public QuerySmsSignListNewShrinkRequest setRegisterResult(Integer registerResult) {
        this.registerResult = registerResult;
        return this;
    }
    public Integer getRegisterResult() {
        return this.registerResult;
    }

    public QuerySmsSignListNewShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySmsSignListNewShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySmsSignListNewShrinkRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public QuerySmsSignListNewShrinkRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public QuerySmsSignListNewShrinkRequest setSignSource(String signSource) {
        this.signSource = signSource;
        return this;
    }
    public String getSignSource() {
        return this.signSource;
    }

}
