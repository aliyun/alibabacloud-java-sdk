// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateCompliancePackReportRequest extends TeaModel {
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    @NameInMap("AggregatorId")
    public String aggregatorId;

    public static GetAggregateCompliancePackReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateCompliancePackReportRequest self = new GetAggregateCompliancePackReportRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateCompliancePackReportRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public GetAggregateCompliancePackReportRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

}
