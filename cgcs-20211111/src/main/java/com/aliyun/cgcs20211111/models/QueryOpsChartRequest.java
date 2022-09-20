// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class QueryOpsChartRequest extends TeaModel {
    @NameInMap("ChartType")
    public String chartType;

    @NameInMap("OperatorId")
    public String operatorId;

    @NameInMap("OperatorType")
    public String operatorType;

    @NameInMap("PlatformSessionId")
    public String platformSessionId;

    @NameInMap("QueryEndDate")
    public String queryEndDate;

    @NameInMap("QueryStartDate")
    public String queryStartDate;

    public static QueryOpsChartRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOpsChartRequest self = new QueryOpsChartRequest();
        return TeaModel.build(map, self);
    }

    public QueryOpsChartRequest setChartType(String chartType) {
        this.chartType = chartType;
        return this;
    }
    public String getChartType() {
        return this.chartType;
    }

    public QueryOpsChartRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public QueryOpsChartRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public QueryOpsChartRequest setPlatformSessionId(String platformSessionId) {
        this.platformSessionId = platformSessionId;
        return this;
    }
    public String getPlatformSessionId() {
        return this.platformSessionId;
    }

    public QueryOpsChartRequest setQueryEndDate(String queryEndDate) {
        this.queryEndDate = queryEndDate;
        return this;
    }
    public String getQueryEndDate() {
        return this.queryEndDate;
    }

    public QueryOpsChartRequest setQueryStartDate(String queryStartDate) {
        this.queryStartDate = queryStartDate;
        return this;
    }
    public String getQueryStartDate() {
        return this.queryStartDate;
    }

}
