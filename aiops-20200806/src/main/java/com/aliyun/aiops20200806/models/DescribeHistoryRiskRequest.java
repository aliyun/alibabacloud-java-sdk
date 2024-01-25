// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeHistoryRiskRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("LastFindTimeEnd")
    public String lastFindTimeEnd;

    @NameInMap("LastFindTimeStart")
    public String lastFindTimeStart;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("Severity")
    public Integer severity;

    public static DescribeHistoryRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryRiskRequest self = new DescribeHistoryRiskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryRiskRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeHistoryRiskRequest setLastFindTimeEnd(String lastFindTimeEnd) {
        this.lastFindTimeEnd = lastFindTimeEnd;
        return this;
    }
    public String getLastFindTimeEnd() {
        return this.lastFindTimeEnd;
    }

    public DescribeHistoryRiskRequest setLastFindTimeStart(String lastFindTimeStart) {
        this.lastFindTimeStart = lastFindTimeStart;
        return this;
    }
    public String getLastFindTimeStart() {
        return this.lastFindTimeStart;
    }

    public DescribeHistoryRiskRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public DescribeHistoryRiskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHistoryRiskRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeHistoryRiskRequest setSeverity(Integer severity) {
        this.severity = severity;
        return this;
    }
    public Integer getSeverity() {
        return this.severity;
    }

}
