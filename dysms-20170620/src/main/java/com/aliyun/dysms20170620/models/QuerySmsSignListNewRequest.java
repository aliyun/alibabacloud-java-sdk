// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSignListNewRequest extends TeaModel {
    @NameInMap("AggregatedRegisterStatus")
    public Integer aggregatedRegisterStatus;

    @NameInMap("AuditState")
    public String auditState;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("IsGlobeSign")
    public Integer isGlobeSign;

    @NameInMap("OperatorCodes")
    public java.util.List<String> operatorCodes;

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

    public static QuerySmsSignListNewRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSignListNewRequest self = new QuerySmsSignListNewRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmsSignListNewRequest setAggregatedRegisterStatus(Integer aggregatedRegisterStatus) {
        this.aggregatedRegisterStatus = aggregatedRegisterStatus;
        return this;
    }
    public Integer getAggregatedRegisterStatus() {
        return this.aggregatedRegisterStatus;
    }

    public QuerySmsSignListNewRequest setAuditState(String auditState) {
        this.auditState = auditState;
        return this;
    }
    public String getAuditState() {
        return this.auditState;
    }

    public QuerySmsSignListNewRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QuerySmsSignListNewRequest setIsGlobeSign(Integer isGlobeSign) {
        this.isGlobeSign = isGlobeSign;
        return this;
    }
    public Integer getIsGlobeSign() {
        return this.isGlobeSign;
    }

    public QuerySmsSignListNewRequest setOperatorCodes(java.util.List<String> operatorCodes) {
        this.operatorCodes = operatorCodes;
        return this;
    }
    public java.util.List<String> getOperatorCodes() {
        return this.operatorCodes;
    }

    public QuerySmsSignListNewRequest setOperatorRegisterStatus(Integer operatorRegisterStatus) {
        this.operatorRegisterStatus = operatorRegisterStatus;
        return this;
    }
    public Integer getOperatorRegisterStatus() {
        return this.operatorRegisterStatus;
    }

    public QuerySmsSignListNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySmsSignListNewRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QuerySmsSignListNewRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QuerySmsSignListNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QuerySmsSignListNewRequest setQualificationName(String qualificationName) {
        this.qualificationName = qualificationName;
        return this;
    }
    public String getQualificationName() {
        return this.qualificationName;
    }

    public QuerySmsSignListNewRequest setRegisterResult(Integer registerResult) {
        this.registerResult = registerResult;
        return this;
    }
    public Integer getRegisterResult() {
        return this.registerResult;
    }

    public QuerySmsSignListNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySmsSignListNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySmsSignListNewRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public QuerySmsSignListNewRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public QuerySmsSignListNewRequest setSignSource(String signSource) {
        this.signSource = signSource;
        return this;
    }
    public String getSignSource() {
        return this.signSource;
    }

}
