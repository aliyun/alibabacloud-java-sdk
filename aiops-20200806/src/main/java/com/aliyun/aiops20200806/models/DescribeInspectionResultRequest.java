// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeInspectionResultRequest extends TeaModel {
    @NameInMap("ContinuousDays")
    public Integer continuousDays;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RiskCode")
    public String riskCode;

    @NameInMap("Severity")
    public Integer severity;

    public static DescribeInspectionResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionResultRequest self = new DescribeInspectionResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionResultRequest setContinuousDays(Integer continuousDays) {
        this.continuousDays = continuousDays;
        return this;
    }
    public Integer getContinuousDays() {
        return this.continuousDays;
    }

    public DescribeInspectionResultRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInspectionResultRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public DescribeInspectionResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInspectionResultRequest setRiskCode(String riskCode) {
        this.riskCode = riskCode;
        return this;
    }
    public String getRiskCode() {
        return this.riskCode;
    }

    public DescribeInspectionResultRequest setSeverity(Integer severity) {
        this.severity = severity;
        return this;
    }
    public Integer getSeverity() {
        return this.severity;
    }

}
