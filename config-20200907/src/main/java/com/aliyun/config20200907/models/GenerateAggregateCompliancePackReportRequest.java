// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GenerateAggregateCompliancePackReportRequest extends TeaModel {
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("AggregatorId")
    public String aggregatorId;

    public static GenerateAggregateCompliancePackReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAggregateCompliancePackReportRequest self = new GenerateAggregateCompliancePackReportRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAggregateCompliancePackReportRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public GenerateAggregateCompliancePackReportRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GenerateAggregateCompliancePackReportRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

}
