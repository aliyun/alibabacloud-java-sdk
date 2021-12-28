// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigRulesReportRequest extends TeaModel {
    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("ReportId")
    public String reportId;

    public static GetAggregateConfigRulesReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateConfigRulesReportRequest self = new GetAggregateConfigRulesReportRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateConfigRulesReportRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public GetAggregateConfigRulesReportRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

}
