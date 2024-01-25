// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRiskPatrolListRequest extends TeaModel {
    @NameInMap("BusinessGroupId")
    public String businessGroupId;

    @NameInMap("BusinessGroupName")
    public String businessGroupName;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PatrolId")
    public Long patrolId;

    @NameInMap("RiskPatrolItem")
    public String riskPatrolItem;

    @NameInMap("SeverityLevel")
    public Integer severityLevel;

    @NameInMap("Status")
    public Integer status;

    public static GetRiskPatrolListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRiskPatrolListRequest self = new GetRiskPatrolListRequest();
        return TeaModel.build(map, self);
    }

    public GetRiskPatrolListRequest setBusinessGroupId(String businessGroupId) {
        this.businessGroupId = businessGroupId;
        return this;
    }
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    public GetRiskPatrolListRequest setBusinessGroupName(String businessGroupName) {
        this.businessGroupName = businessGroupName;
        return this;
    }
    public String getBusinessGroupName() {
        return this.businessGroupName;
    }

    public GetRiskPatrolListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetRiskPatrolListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetRiskPatrolListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetRiskPatrolListRequest setPatrolId(Long patrolId) {
        this.patrolId = patrolId;
        return this;
    }
    public Long getPatrolId() {
        return this.patrolId;
    }

    public GetRiskPatrolListRequest setRiskPatrolItem(String riskPatrolItem) {
        this.riskPatrolItem = riskPatrolItem;
        return this;
    }
    public String getRiskPatrolItem() {
        return this.riskPatrolItem;
    }

    public GetRiskPatrolListRequest setSeverityLevel(Integer severityLevel) {
        this.severityLevel = severityLevel;
        return this;
    }
    public Integer getSeverityLevel() {
        return this.severityLevel;
    }

    public GetRiskPatrolListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
