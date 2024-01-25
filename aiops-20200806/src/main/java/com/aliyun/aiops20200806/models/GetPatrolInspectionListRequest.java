// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetPatrolInspectionListRequest extends TeaModel {
    @NameInMap("BusinessGroupId")
    public String businessGroupId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PatrolId")
    public Long patrolId;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("RiskLevel")
    public Integer riskLevel;

    @NameInMap("RiskName")
    public String riskName;

    @NameInMap("RiskPatrolItem")
    public String riskPatrolItem;

    @NameInMap("RiskType")
    public Integer riskType;

    @NameInMap("SeverityLevel")
    public Integer severityLevel;

    @NameInMap("Status")
    public Integer status;

    public static GetPatrolInspectionListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPatrolInspectionListRequest self = new GetPatrolInspectionListRequest();
        return TeaModel.build(map, self);
    }

    public GetPatrolInspectionListRequest setBusinessGroupId(String businessGroupId) {
        this.businessGroupId = businessGroupId;
        return this;
    }
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    public GetPatrolInspectionListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetPatrolInspectionListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetPatrolInspectionListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetPatrolInspectionListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetPatrolInspectionListRequest setPatrolId(Long patrolId) {
        this.patrolId = patrolId;
        return this;
    }
    public Long getPatrolId() {
        return this.patrolId;
    }

    public GetPatrolInspectionListRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetPatrolInspectionListRequest setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Integer getRiskLevel() {
        return this.riskLevel;
    }

    public GetPatrolInspectionListRequest setRiskName(String riskName) {
        this.riskName = riskName;
        return this;
    }
    public String getRiskName() {
        return this.riskName;
    }

    public GetPatrolInspectionListRequest setRiskPatrolItem(String riskPatrolItem) {
        this.riskPatrolItem = riskPatrolItem;
        return this;
    }
    public String getRiskPatrolItem() {
        return this.riskPatrolItem;
    }

    public GetPatrolInspectionListRequest setRiskType(Integer riskType) {
        this.riskType = riskType;
        return this;
    }
    public Integer getRiskType() {
        return this.riskType;
    }

    public GetPatrolInspectionListRequest setSeverityLevel(Integer severityLevel) {
        this.severityLevel = severityLevel;
        return this;
    }
    public Integer getSeverityLevel() {
        return this.severityLevel;
    }

    public GetPatrolInspectionListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
